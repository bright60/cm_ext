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
package com.cloudera.csd.descriptors;

import javax.validation.constraints.Min;

/**
 * Describes the compatibility requirements for the CSD.
 */
public interface CompatibilityDescriptor {

  /**
   * A range of versions for the dependent software.
   * Both the min and max are inclusive and optional.
   *
   * TODO: Add range checks.
   */
  public interface VersionRange {
    String getMin();

    String getMax();
  }

  /**
   * Describes compatibility with other revisions of this CSD.
   * When authoring a new revision, advertise a higher generation
   * if the new revision introduces changes that are
   * incompatible with older revisions. If a generation
   * is not specified, it defaults to 1.
   */
  @Min(1)
  Long getGeneration();

  /**
   * Describes the compatible versions of the CDH cluster.
   * This is optional and if not specified, the CSD will
   * be available for all versions of CDH.
   */
  VersionRange getCdhVersion();
}
