package com.huawei.hwarkuix.oHBrigdePlugin.load;

import android.content.Context;
import com.huawei.hwarkuix.oHBrigdePlugin.health.NativeInvokeArkuiBridge;
import ohos.ace.adapter.capability.bridge.BridgeManager;

/* JADX INFO: loaded from: classes10.dex */
public class BridgeModulesPluginLoad extends BaseModulesPluginLoad {
    private static final String TAG = "BridgeModulesPluginLoad";
    private NativeInvokeArkuiBridge mNativeInvokeArkuiBridge;

    @Override // com.huawei.hwarkuix.oHBrigdePlugin.load.IPluginLoad
    public void reStart() {
    }

    @Override // com.huawei.hwarkuix.oHBrigdePlugin.load.BaseModulesPluginLoad, com.huawei.hwarkuix.oHBrigdePlugin.load.IPluginLoad
    public void loadPlugin(Context context, BridgeManager bridgeManager, boolean z) {
        super.loadPlugin(context, bridgeManager, z);
        this.mNativeInvokeArkuiBridge = getNativeInvokeArkuiBridge();
    }

    @Override // com.huawei.hwarkuix.oHBrigdePlugin.load.BaseModulesPluginLoad, com.huawei.hwarkuix.oHBrigdePlugin.load.IPluginLoad
    public void onDestroy() {
        super.onDestroy();
        NativeInvokeArkuiBridge nativeInvokeArkuiBridge = this.mNativeInvokeArkuiBridge;
        if (nativeInvokeArkuiBridge != null) {
            nativeInvokeArkuiBridge.onDestroy();
        }
    }
}
