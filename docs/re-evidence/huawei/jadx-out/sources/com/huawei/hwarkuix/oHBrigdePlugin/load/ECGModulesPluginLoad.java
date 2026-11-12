package com.huawei.hwarkuix.oHBrigdePlugin.load;

import android.content.Context;
import com.huawei.hwarkuix.oHBrigdePlugin.health.NativeInvokeHeartRateBridge;
import ohos.ace.adapter.capability.bridge.BridgeManager;

/* JADX INFO: loaded from: classes10.dex */
public class ECGModulesPluginLoad extends BaseModulesPluginLoad {
    private NativeInvokeHeartRateBridge mNativeInvokeHeartRateBridge;

    @Override // com.huawei.hwarkuix.oHBrigdePlugin.load.BaseModulesPluginLoad, com.huawei.hwarkuix.oHBrigdePlugin.load.IPluginLoad
    public void loadPlugin(Context context, BridgeManager bridgeManager, boolean z) {
        super.loadPlugin(context, bridgeManager, z);
        NativeInvokeHeartRateBridge nativeInvokeHeartRateBridge = new NativeInvokeHeartRateBridge(getNativeInvokeArkuiBridge());
        this.mNativeInvokeHeartRateBridge = nativeInvokeHeartRateBridge;
        nativeInvokeHeartRateBridge.subscribleHeartData();
    }

    @Override // com.huawei.hwarkuix.oHBrigdePlugin.load.BaseModulesPluginLoad, com.huawei.hwarkuix.oHBrigdePlugin.load.IPluginLoad
    public void onDestroy() {
        super.onDestroy();
        this.mNativeInvokeHeartRateBridge.unSubscribeHeartData();
    }
}
