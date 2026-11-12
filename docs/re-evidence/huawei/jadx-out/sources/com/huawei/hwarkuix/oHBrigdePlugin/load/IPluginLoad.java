package com.huawei.hwarkuix.oHBrigdePlugin.load;

import android.content.Context;
import ohos.ace.adapter.capability.bridge.BridgeManager;

/* JADX INFO: loaded from: classes10.dex */
public interface IPluginLoad {
    void loadPlugin(Context context, BridgeManager bridgeManager, boolean z);

    default void onDestroy() {
    }

    default void reStart() {
    }
}
