/*
 * Licensed to the Apache Software Foundation (ASF) under one or more
 * contributor license agreements.  See the NOTICE file distributed with
 * this work for additional information regarding copyright ownership.
 * The ASF licenses this file to You under the Apache License, Version 2.0
 * (the "License"); you may not use this file except in compliance with
 * the License.  You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.apache.solr.client.solrj.impl;

import java.io.Closeable;

/**
 * Factory interface for configuring {@linkplain SolrHttpClientBuilder}. This relies on the internal
 * HttpClient implementation and is subject to change.
 *
 * @lucene.experimental
 */
public interface HttpClientBuilderFactory extends Closeable {

  /**
   * This method configures the {@linkplain SolrHttpClientBuilder} by overriding the configuration
   * of passed SolrHttpClientBuilder or as a new instance.
   *
   * @param builder The instance of the {@linkplain SolrHttpClientBuilder} which should be
   *     configured (optional).
   * @return the {@linkplain SolrHttpClientBuilder}
   */
  public SolrHttpClientBuilder getHttpClientBuilder(SolrHttpClientBuilder builder);

  public default void setup(Http2SolrClient client) {}
}
