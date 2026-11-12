package com.huawei.hwarkuix.oHBrigdePlugin.load;

import android.content.Context;
import com.huawei.hwarkuix.oHBrigdePlugin.health.NativeInvokeEmotionBridge;
import ohos.ace.adapter.capability.bridge.BridgeManager;

/* JADX INFO: loaded from: classes10.dex */
public class EmotionModulesPluginLoad extends BaseModulesPluginLoad {
    private NativeInvokeEmotionBridge mNativeInvokeEmotionBridge;

    @Override // com.huawei.hwarkuix.oHBrigdePlugin.load.BaseModulesPluginLoad, com.huawei.hwarkuix.oHBrigdePlugin.load.IPluginLoad
    public void loadPlugin(Context context, BridgeManager bridgeManager, boolean z) {
        super.loadPlugin(context, bridgeManager, z);
        NativeInvokeEmotionBridge nativeInvokeEmotionBridge = new NativeInvokeEmotionBridge(getNativeInvokeArkuiBridge());
        this.mNativeInvokeEmotionBridge = nativeInvokeEmotionBridge;
        nativeInvokeEmotionBridge.subscribeData();
    }

    @Override // com.huawei.hwarkuix.oHBrigdePlugin.load.BaseModulesPluginLoad, com.huawei.hwarkuix.oHBrigdePlugin.load.IPluginLoad
    public void onDestroy() {
        super.onDestroy();
        this.mNativeInvokeEmotionBridge.unSubscribeData();
    }
}
