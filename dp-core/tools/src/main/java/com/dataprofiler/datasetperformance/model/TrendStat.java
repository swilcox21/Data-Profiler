package com.dataprofiler.datasetperformance.model;

/*-
 * 
 * dataprofiler-tools
 *
 * Copyright 2021 Merck & Co., Inc. Kenilworth, NJ, USA.
 *
 * 	Licensed to the Apache Software Foundation (ASF) under one
 * 	or more contributor license agreements. See the NOTICE file
 * 	distributed with this work for additional information
 * 	regarding copyright ownership. The ASF licenses this file
 * 	to you under the Apache License, Version 2.0 (the
 * 	"License"); you may not use this file except in compliance
 * 	with the License. You may obtain a copy of the License at
 *
 * 	http://www.apache.org/licenses/LICENSE-2.0
 *
 *
 * 	Unless required by applicable law or agreed to in writing,
 * 	software distributed under the License is distributed on an
 * 	"AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY
 * 	KIND, either express or implied. See the License for the
 * 	specific language governing permissions and limitations
 * 	under the License.
 * 
 */

import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;
import org.apache.commons.lang3.builder.ReflectionToStringBuilder;

public class TrendStat {

  protected long allTime;
  protected long lastSevenFromToday;
  protected long lastSevenFromYesterday;

  public TrendStat() {
    super();
    this.allTime = 0;
    this.lastSevenFromToday = 0;
    this.lastSevenFromYesterday = 0;
  }

  @Override
  public String toString() {
    return ReflectionToStringBuilder.toString(this);
  }

  @Override
  public boolean equals(Object rhs) {
    return EqualsBuilder.reflectionEquals(this, rhs);
  }

  @Override
  public int hashCode() {
    return HashCodeBuilder.reflectionHashCode(this, false);
  }

  public long getAllTime() {
    return allTime;
  }

  public void setAllTime(long allTime) {
    this.allTime = allTime;
  }

  public long getLastSevenFromToday() {
    return lastSevenFromToday;
  }

  public void setLastSevenFromToday(long lastSevenFromToday) {
    this.lastSevenFromToday = lastSevenFromToday;
  }

  public long getLastSevenFromYesterday() {
    return lastSevenFromYesterday;
  }

  public void setLastSevenFromYesterday(long lastSevenFromYesterday) {
    this.lastSevenFromYesterday = lastSevenFromYesterday;
  }
}