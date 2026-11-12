package com.huawei.hwarkuix.oHBrigdePlugin.load;

import android.content.Context;
import androidx.lifecycle.LifecycleKt$$ExternalSyntheticBackportWithForwarding0;
import com.huawei.hwarkuix.oHBrigdePlugin.device.WearableAbilityBridge;
import com.huawei.hwarkuix.oHBrigdePlugin.health.BIEvent;
import com.huawei.hwarkuix.oHBrigdePlugin.health.Config;
import com.huawei.hwarkuix.oHBrigdePlugin.health.DeepLink;
import com.huawei.hwarkuix.oHBrigdePlugin.health.Device;
import com.huawei.hwarkuix.oHBrigdePlugin.health.EmotionStressBridge;
import com.huawei.hwarkuix.oHBrigdePlugin.health.Logger;
import com.huawei.hwarkuix.oHBrigdePlugin.health.NativeInvokeArkuiBridge;
import com.huawei.hwarkuix.oHBrigdePlugin.health.NetworkBinaryClient;
import com.huawei.hwarkuix.oHBrigdePlugin.health.NetworkClient;
import com.huawei.hwarkuix.oHBrigdePlugin.health.OneSdk;
import com.huawei.hwarkuix.oHBrigdePlugin.health.StorePreferences;
import com.huawei.hwarkuix.oHBrigdePlugin.health.UICustomizeBridge;
import com.huawei.hwarkuix.oHBrigdePlugin.health.UserInterface;
import com.huawei.hwarkuix.oHBrigdePlugin.healthBridge.XAccountBridge;
import com.huawei.hwarkuix.oHBrigdePlugin.healthBridge.XBiAnalyticBridge;
import com.huawei.hwarkuix.oHBrigdePlugin.healthBridge.XDeviceManagerBridge;
import com.huawei.hwarkuix.oHBrigdePlugin.healthBridge.XGeneralBridge;
import com.huawei.hwarkuix.oHBrigdePlugin.healthBridge.XGrsBridge;
import com.huawei.hwarkuix.oHBrigdePlugin.healthBridge.XNetworkBinaryBridge;
import com.huawei.hwarkuix.oHBrigdePlugin.healthBridge.XNetworkBridge;
import com.huawei.hwarkuix.oHBrigdePlugin.healthBridge.XStorageBridge;
import com.huawei.hwlogsmodel.LogUtil;
import java.util.concurrent.atomic.AtomicReference;
import ohos.ace.adapter.capability.bridge.BridgeManager;
import ohos.ace.adapter.capability.bridge.BridgePlugin;

/* JADX INFO: loaded from: classes10.dex */
public class BaseModulesPluginLoad implements IPluginLoad {
    private static final String TAG = "BaseModulesPluginLoad";
    private static final AtomicReference<NativeInvokeArkuiBridge> sNativeInvokeArkuiBridge = new AtomicReference<>();
    private NativeInvokeArkuiBridge mNativeInvokeArkui;

    @Override // com.huawei.hwarkuix.oHBrigdePlugin.load.IPluginLoad
    public void loadPlugin(Context context, BridgeManager bridgeManager, boolean z) {
        if (z) {
            loadBasePlugin(context, bridgeManager);
            loadEmotionStressBridge(context, bridgeManager);
        }
    }

    @Override // com.huawei.hwarkuix.oHBrigdePlugin.load.IPluginLoad
    public void onDestroy() {
        LifecycleKt$$ExternalSyntheticBackportWithForwarding0.m(sNativeInvokeArkuiBridge, this.mNativeInvokeArkui, null);
    }

    public NativeInvokeArkuiBridge getNativeInvokeArkuiBridge() {
        return sNativeInvokeArkuiBridge.get();
    }

    public void loadBasePlugin(Context context, BridgeManager bridgeManager) {
        LogUtil.a(TAG, "loadBasePlugin");
        NativeInvokeArkuiBridge nativeInvokeArkuiBridge = new NativeInvokeArkuiBridge(context, "NativeInvokeArkui", bridgeManager);
        this.mNativeInvokeArkui = nativeInvokeArkuiBridge;
        sNativeInvokeArkuiBridge.set(nativeInvokeArkuiBridge);
        new OneSdk(context, "OneSdk", bridgeManager);
        new Logger(context, "Logger", bridgeManager);
        new DeepLink(context, "DeepLink", bridgeManager);
        new UserInterface(context, "UserInterface", bridgeManager);
        new BIEvent(context, "BiEvent", bridgeManager);
        new Device(context, "Device", bridgeManager);
        new NetworkClient(context, "NetworkClient", bridgeManager);
        new NetworkBinaryClient(context, "NetworkBinaryClient", bridgeManager, BridgePlugin.BridgeType.BINARY_TYPE);
        new Config(context, "Config", bridgeManager);
        new StorePreferences(context, "StorePreferences", bridgeManager);
        new WearableAbilityBridge(context, "WearableAbility", bridgeManager);
        new UICustomizeBridge(context, "UiCustomizeBridge", bridgeManager);
        loadNewBasePlugin(context, bridgeManager);
    }

    public void loadEmotionStressBridge(Context context, BridgeManager bridgeManager) {
        new EmotionStressBridge(context, "EmotionBridge", bridgeManager);
        new EmotionStressBridge(context, "EmotionBridgeBinary", bridgeManager, BridgePlugin.BridgeType.BINARY_TYPE);
    }

    public void loadNewBasePlugin(Context context, BridgeManager bridgeManager) {
        new XGeneralBridge(context, "XGeneralBridge", bridgeManager);
        new XDeviceManagerBridge(context, "XDeviceManagerBridge", bridgeManager);
        new XGrsBridge(context, "XGrsBridge", bridgeManager);
        new XBiAnalyticBridge(context, "XBiAnalyticBridge", bridgeManager);
        new XAccountBridge(context, "XAccountBridge", bridgeManager);
        new XStorageBridge(context, "XStorageBridge", bridgeManager);
        new XNetworkBridge(context, "XNetworkBridge", bridgeManager);
        new XNetworkBinaryBridge(context, "XNetworkBinaryBridge", bridgeManager, BridgePlugin.BridgeType.BINARY_TYPE);
    }
}
