/**
 * Copyright (c) 2015-present, Facebook, Inc.
 *
 * This source code is licensed under the MIT license found in the
 * LICENSE file in the root directory of this source tree.
 */

package com.facebook.react.fabric;

import android.util.SparseArray;
import com.facebook.react.uimanager.ReactShadowNode;

/**
 * Simple container class to keep track of {@link ReactShadowNode}s that represents the Root
 * Shadow Nodes of a {@link FabricUIManager}
 */
public class RootShadowNodeRegistry {

  private final SparseArray<ReactShadowNode> mTagsToRootNodes;

  public RootShadowNodeRegistry() {
    mTagsToRootNodes = new SparseArray<>();
  }

  public void addNode(ReactShadowNode node) {
    mTagsToRootNodes.put(node.getReactTag(), node);
  }

  public void removeNode(int tag) {
    mTagsToRootNodes.remove(tag);
  }

  public ReactShadowNode getNode(int tag) {
    return mTagsToRootNodes.get(tag);
  }
}
