// Licensed to Cloudera, Inc. under one
// or more contributor license agreements.  See the NOTICE file
// distributed with this work for additional information
// regarding copyright ownership.  Cloudera, Inc. licenses this file
// to you under the Apache License, Version 2.0 (the
// "License"); you may not use this file except in compliance
// with the License.  You may obtain a copy of the License at
//
//     http://www.apache.org/licenses/LICENSE-2.0
//
// Unless required by applicable law or agreed to in writing, software
// distributed under the License is distributed on an "AS IS" BASIS,
// WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
// See the License for the specific language governing permissions and
// limitations under the License.
package com.cloudera.csd.validation.components;

import com.cloudera.csd.descriptors.ServiceDescriptor;
import com.cloudera.validation.DescriptorValidator;
import com.cloudera.validation.DescriptorValidatorImpl;
import javax.validation.Validator;

import org.springframework.beans.factory.annotation.Autowired;

/**
 * A class that implements the DescriptorValidator interface
 * for ServiceDescriptor objects.
 */
public class ServiceDescriptorValidatorImpl extends DescriptorValidatorImpl<ServiceDescriptor>
                                            implements DescriptorValidator<ServiceDescriptor> {

  @Autowired
  public ServiceDescriptorValidatorImpl(Validator validator) {
    super(validator, "service");
  }
}
