/**
 * Copyright 2018 The original authors.
 * 
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 * 
 *     http://www.apache.org/licenses/LICENSE-2.0
 * 
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 * 
**/

package io.dekorate.example;

import java.util.Optional;
import org.junit.jupiter.api.Test;

import io.fabric8.kubernetes.api.model.KubernetesList;
import io.fabric8.kubernetes.api.model.HasMetadata;
import io.fabric8.kubernetes.api.model.Service;

import static org.junit.jupiter.api.Assertions.assertTrue;
import static io.dekorate.testing.KubernetesResources.*;

class VertxTest {

  @Test
  public void shouldContainService() throws Exception {
    KubernetesList list = loadGenerated("kubernetes");
    Optional<Service> service = findFirst(list, Service.class);
    assertTrue(service.isPresent());
  }
}

