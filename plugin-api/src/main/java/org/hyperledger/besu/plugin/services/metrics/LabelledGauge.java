/*
 * Copyright ConsenSys AG.
 *
 * Licensed under the Apache License, Version 2.0 (the "License"); you may not use this file except in compliance with
 * the License. You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software distributed under the License is distributed on
 * an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the License for the
 * specific language governing permissions and limitations under the License.
 *
 * SPDX-License-Identifier: Apache-2.0
 */
package org.hyperledger.besu.plugin.services.metrics;

import java.util.function.DoubleSupplier;

/** The interface Labelled gauge. */
public interface LabelledGauge {
  /**
   * Labels.
   *
   * @param valueSupplier the value supplier
   * @param labelValues the label values
   */
  void labels(final DoubleSupplier valueSupplier, final String... labelValues);

  /**
   * Checks whether the supplied labelValues are already observed by this LabelledGauge
   *
   * @param labelValues The labelValues to check
   * @return true if the supplied labelValues are already observed by this LabelledGauge, false
   *     otherwise
   */
  default boolean isLabelsObserved(final String... labelValues) {
    return false;
  }
}
