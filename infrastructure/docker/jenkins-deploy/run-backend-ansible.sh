#
# Copyright 2021 Merck & Co., Inc. Kenilworth, NJ, USA.
#
#	Licensed to the Apache Software Foundation (ASF) under one
#	or more contributor license agreements. See the NOTICE file
#	distributed with this work for additional information
#	regarding copyright ownership. The ASF licenses this file
#	to you under the Apache License, Version 2.0 (the
#	"License"); you may not use this file except in compliance
#	with the License. You may obtain a copy of the License at
#
#	http://www.apache.org/licenses/LICENSE-2.0
#
#
#	Unless required by applicable law or agreed to in writing,
#	software distributed under the License is distributed on an
#	"AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY
#	KIND, either express or implied. See the License for the
#	specific language governing permissions and limitations
#	under the License.
#
#!/bin/bash

set -euxo pipefail

NAMESPACE=$1
INVENTORY=$(echo "cluster/ansible/inventories/$NAMESPACE-aws_ec2.yml")

export ANSIBLE_HOST_KEY_CHECKING=False
echo "secret" > /tmp/ansible-secret
eval `ssh-agent -s`
ssh-add $identity
ansible --version
ansible-playbook --vault-id @/tmp/ansible-secret -i $INVENTORY cluster/ansible/deploy_accumulo.yml
rm /tmp/ansible-secret