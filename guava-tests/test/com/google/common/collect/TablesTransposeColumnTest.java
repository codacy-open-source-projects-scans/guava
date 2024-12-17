/*
 * Copyright (C) 2008 The Guava Authors
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.google.common.collect;

import static com.google.common.collect.Tables.transpose;

import com.google.common.annotations.GwtCompatible;
import com.google.common.collect.TableCollectionTest.ColumnTests;

@GwtCompatible
@ElementTypesAreNonnullByDefault
public class TablesTransposeColumnTest extends ColumnTests {
  public TablesTransposeColumnTest() {
    super(false, true, true, true, true);
  }

  @Override
  Table<String, Character, Integer> makeTable() {
    Table<Character, String, Integer> original = TreeBasedTable.create();
    return transpose(original);
  }
}
