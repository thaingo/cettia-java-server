/*
 * Copyright 2015 The Cettia Project
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package io.cettia.transport;

import io.cettia.platform.action.Action;
import io.cettia.platform.http.ServerHttpExchange;
import io.cettia.platform.websocket.ServerWebSocket;

/**
 * Interface used to interact with transports.
 * <p/>
 * {@code TransportServer} consumes resource like {@link ServerHttpExchange} or
 * {@link ServerWebSocket} and produces {@link ServerTransport} following the
 * corresponding Cettia transport protocol.
 * <p/>
 * Instances may be accessed by multiple threads.
 *
 * @author Donghwan Kim
 */
public interface TransportServer<T> extends Action<T> {

  /**
   * Registers an action to be called when the transport has been opened.
   */
  TransportServer<T> ontransport(Action<ServerTransport> action);

}
