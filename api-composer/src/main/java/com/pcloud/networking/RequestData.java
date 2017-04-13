/*
 * Copyright (c) 2017 pCloud AG
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

package com.pcloud.networking;

import java.lang.annotation.Documented;
import java.lang.annotation.Retention;
import java.lang.annotation.Target;

import static java.lang.annotation.ElementType.PARAMETER;
import static java.lang.annotation.RetentionPolicy.RUNTIME;

/**
 * Mark a method parameter as a Request data source.
 * <p>
 * <b>NOTE:</b> The only allowed argument types are
 * {@linkplain com.pcloud.protocol.DataSource}, {@linkplain java.io.File},
 * {@linkplain okio.ByteString} and byte arrays (byte[]).
 * <p>
 * RequestData objects cannot be null.
 */
@Documented
@Target(PARAMETER)
@Retention(RUNTIME)
public @interface RequestData {
}
