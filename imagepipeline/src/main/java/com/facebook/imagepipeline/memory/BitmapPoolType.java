/*
 * Copyright (c) Facebook, Inc. and its affiliates.
 * All rights reserved.
 *
 * This source code is licensed under the BSD-style license found in the
 * LICENSE file in the root directory of this source tree. An additional grant
 * of patent rights can be found in the PATENTS file in the same directory.
 */
package com.facebook.imagepipeline.memory;

public @interface BitmapPoolType {
  String LEGACY = "legacy";
  String DUMMY = "dummy";
  String EXPERIMENTAL = "experimental";

  String DEFAULT = LEGACY;
}
