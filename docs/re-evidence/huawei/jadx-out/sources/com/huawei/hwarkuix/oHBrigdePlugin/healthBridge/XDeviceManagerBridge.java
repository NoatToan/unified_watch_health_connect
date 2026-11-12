package com.huawei.hwarkuix.oHBrigdePlugin.healthBridge;

import android.content.Context;
import android.text.TextUtils;
import com.huawei.hwarkuix.oHProEngine.OHProBridgePlugin;
import com.huawei.hwcommonmodel.utils.SimpleChain;
import com.huawei.hwdevice.mainprocess.framework.ArkuiProcessManager;
import com.huawei.hwlogsmodel.LogUtil;
import health.compact.a.hwlogsmodel.ReleaseLogUtil;
import ohos.ace.adapter.capability.bridge.BridgeManager;
import ohos.ace.adapter.capability.bridge.BridgePlugin;
import org.json.JSONArray;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes10.dex */
public class XDeviceManagerBridge extends OHProBridgePlugin {
    private static final String TAG = "XDeviceManagerBridge";
    private static final String TAG_RELEASE = "R_XDeviceManagerBridge";
    private static boolean isOnceDealDeviceConnect = false;

    public XDeviceManagerBridge(Context context, String str, int i) {
        super(context, str, i);
    }

    public XDeviceManagerBridge(Context context, String str, int i, BridgePlugin.BridgeType bridgeType) {
        super(context, str, i, bridgeType);
    }

    public XDeviceManagerBridge(Context context, String str, BridgeManager bridgeManager) {
        super(context, str, bridgeManager);
    }

    public void getBoundDevices(int i) {
        ReleaseLogUtil.d(TAG_RELEASE, "getBoundDevices enter");
        ohProOnSuccess(i, new JSONArray());
    }

    public void startDiscovering(int i, String str, Object obj) {
        LogUtil.a(TAG, "startDiscovering");
        ohProOnSuccess(i, 0);
    }

    public void bindTarget(final int i, Object obj, int i2, Object obj2) {
        LogUtil.a(TAG, "bindTarget callbackId:", Integer.valueOf(i), "  device:", obj, " btType:", Integer.valueOf(i2), " uuid:", obj2);
        if (obj == null) {
            ohProOnFailure(i, "device == null");
            return;
        }
        if (!(obj instanceof JSONObject)) {
            LogUtil.j(TAG, "device instanceof JSONObject error");
            ohProOnFailure(i, "device not JSONObject");
            return;
        }
        JSONObject jSONObject = (JSONObject) obj;
        String strOptString = jSONObject.optString("deviceId");
        LogUtil.a(TAG, "bindTarget deviceId:", strOptString);
        if (TextUtils.isEmpty(strOptString)) {
            LogUtil.j(TAG, "deviceId empty");
            ohProOnFailure(i, "params 3 error");
        } else {
            ArkuiProcessManager.c().b(strOptString, jSONObject.optInt("linkLayerProtocol"), new SimpleChain.Emitter() { // from class: com.huawei.hwarkuix.oHBrigdePlugin.healthBridge.XDeviceManagerBridge.1
                @Override // com.huawei.hwcommonmodel.utils.SimpleChain.Emitter
                public void onSuccess(Object... objArr) {
                    XDeviceManagerBridge.this.ohProOnSuccess(i, 0);
                }

                @Override // com.huawei.hwcommonmodel.utils.SimpleChain.Emitter
                public void onError(String str) {
                    LogUtil.j(XDeviceManagerBridge.TAG, "bindTarget clickConnectDevice onError:", str);
                    XDeviceManagerBridge.this.ohProOnFailure(i, str);
                }
            });
        }
    }

    public void removeDevice(int i, Object obj) {
        LogUtil.a(TAG, "removeDevice callbackId:", Integer.valueOf(i), " info:", obj);
    }

    public void sendWspData(int i, String str, String str2, String str3, Object obj, boolean z) {
        LogUtil.a(TAG, "sendWspData deviceId:", str, " serviceId:", str2, " uuId:", str3);
        if (TextUtils.isEmpty(str2) || TextUtils.isEmpty(str3)) {
            LogUtil.j(TAG, "sendWspData deviceId or serviceId isEmpty");
            ohProOnFailure(i, "sendWspData deviceId or serviceId isEmpty");
        } else {
            ArkuiProcessManager.c().d(str, str2, str3);
        }
    }
}
