/*
 * Copyright (c) 2012-2018 Red Hat, Inc.
 * This program and the accompanying materials are made
 * available under the terms of the Eclipse Public License 2.0
 * which is available at https://www.eclipse.org/legal/epl-2.0/
 *
 * SPDX-License-Identifier: EPL-2.0
 *
 * Contributors:
 *   Red Hat, Inc. - initial API and implementation
 */
package org.eclipse.che.core.metrics;

import io.micrometer.core.instrument.MeterRegistry;
import io.micrometer.core.instrument.binder.okhttp3.OkHttpMetricsEventListener;
import javax.inject.Inject;
import javax.inject.Provider;
import javax.inject.Singleton;

@Singleton
public class OkHttpMetricsEventListenerProvider implements Provider<OkHttpMetricsEventListener> {

  private final OkHttpMetricsEventListener listener;

  @Inject
  public OkHttpMetricsEventListenerProvider(MeterRegistry registry) {
    this.listener = OkHttpMetricsEventListener.builder(registry, "okhttp.requests").build();
  }

  @Override
  public OkHttpMetricsEventListener get() {
    return listener;
  }
}
