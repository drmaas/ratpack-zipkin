/*
 * Copyright 2016 the original author or authors.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *    http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package ratpack.zipkin.internal

import ratpack.http.Response
import ratpack.registry.Registry
import ratpack.zipkin.ResponseAnnotationExtractor
import spock.lang.Specification

/**
 * Test suite for {@link ServerResponseAdapterFactory}.
 */
class ServerResponseAdapterFactorySpec extends Specification {
    def Response response = Mock(Response)
    def ResponseAnnotationExtractor extractor = Stub(ResponseAnnotationExtractor)
    def ServerResponseAdapterFactory factory;
    def setup() {
        factory = new ServerResponseAdapterFactory(extractor)
    }
    def 'Should build response adapter'() {
        when:
            def adapter = factory.createAdapter(response)
        then:
            adapter != null
    }
}
