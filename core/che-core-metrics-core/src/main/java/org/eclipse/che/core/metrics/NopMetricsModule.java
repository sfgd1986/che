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

import com.google.inject.AbstractModule;
import okhttp3.EventListener;

public class NopMetricsModule extends AbstractModule {
  @Override
  protected void configure() {
    bind(EventListener.class).toInstance(EventListener.NONE);
  }
}
