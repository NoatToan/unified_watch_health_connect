package com.huawei.hwarkuix.oHBrigdePlugin.device;

import android.content.Context;
import com.google.gson.JsonArray;
import com.huawei.health.devicemgr.api.constant.GetDeviceInfoMode;
import com.huawei.health.devicemgr.business.entity.DeviceInfo;
import com.huawei.hwarkuix.oHBrigdePlugin.device.capability.CapabilityFactory;
import com.huawei.hwarkuix.oHProEngine.OHProBridgePlugin;
import com.huawei.hwdevice.mainprocess.framework.ArkuiProcessManager;
import com.huawei.hwlogsmodel.LogUtil;
import defpackage.ecu;
import defpackage.qqt;
import health.compact.a.CommonUtil;
import java.util.Arrays;
import ohos.ace.adapter.capability.bridge.BridgeManager;
import ohos.ace.adapter.capability.bridge.BridgePlugin;
import ohos.ace.adapter.capability.bridge.TaskOption;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes10.dex */
public class WearableAbilityBridge extends OHProBridgePlugin {
    private static final String TAG = "WearableAbilityBridge";
    private static final int WEAR_CAPABILITY_EX = 1;

    public WearableAbilityBridge(Context context, String str, BridgeManager bridgeManager) {
        super(context, str, bridgeManager, BridgePlugin.BridgeType.JSON_TYPE, new TaskOption(true));
    }

    public void isSupportExtCapability(int i, Object obj) {
        LogUtil.a(TAG, "isSupportExtCapability  capabilityIds:", obj);
        boolean[] zArrDoCheckSupportExtCapability = doCheckSupportExtCapability(1, obj);
        if (zArrDoCheckSupportExtCapability == null) {
            LogUtil.j(TAG, "isSupportExtCapability getCapability fail capabilityType:", 1);
            JsonArray jsonArray = new JsonArray();
            jsonArray.add((Boolean) false);
            ohProOnSuccess(i, jsonArray);
            return;
        }
        JsonArray jsonArray2 = new JsonArray();
        for (boolean z : zArrDoCheckSupportExtCapability) {
            jsonArray2.add(Boolean.valueOf(z));
        }
        LogUtil.a(TAG, "isSupportExtCapability success callbackId:", Integer.valueOf(i), " capabilityResult:", Arrays.asList(zArrDoCheckSupportExtCapability));
        ohProOnSuccess(i, jsonArray2);
    }

    private boolean[] doCheckSupportExtCapability(int i, Object obj) {
        LogUtil.a(TAG, "doCheckSupportExtCapability capabilityType:", Integer.valueOf(i));
        DeviceInfo deviceInfo = ecu.d().getDeviceInfo(GetDeviceInfoMode.ACTIVE_MAIN_DEVICES_WITHOUT_AW70, null, TAG);
        if (deviceInfo == null) {
            LogUtil.j(TAG, "doCheckSupportExtCapability deviceInfo == null");
            return null;
        }
        LogUtil.a(TAG, "doCheckSupportExtCapability:", deviceInfo.getDeviceName(), " , ", CommonUtil.n(deviceInfo.getDeviceIdentify()));
        CapabilityFactory.ICapabilitySource capabilitySource = CapabilityFactory.getCapabilitySource(i);
        if (capabilitySource == null) {
            LogUtil.j(TAG, "doCheckSupportExtCapability iCapability == null capabilityType: ", Integer.valueOf(i));
            return null;
        }
        return capabilitySource.isSupportCapability(deviceInfo, obj);
    }

    public void isSupportCapability(int i, int i2, Object obj) {
        LogUtil.a(TAG, "isSupportCapability capabilityType:", Integer.valueOf(i2), " capabilityIds:", obj);
        boolean[] zArrDoCheckSupportCapability = doCheckSupportCapability(i2, obj);
        if (zArrDoCheckSupportCapability == null) {
            LogUtil.j(TAG, "isSupportCapability getCapability fail capabilityType:", Integer.valueOf(i2));
            ohProOnFailure(i, "getCapability fail");
            return;
        }
        JsonArray jsonArray = new JsonArray();
        for (boolean z : zArrDoCheckSupportCapability) {
            jsonArray.add(Boolean.valueOf(z));
        }
        LogUtil.a(TAG, "isSupportCapability success callbackId:", Integer.valueOf(i), " capabilityResult:", Arrays.asList(zArrDoCheckSupportCapability));
        ohProOnSuccess(i, jsonArray);
    }

    private boolean[] doCheckSupportCapability(int i, Object obj) {
        LogUtil.a(TAG, "doCheckSupportCapability capabilityType:", Integer.valueOf(i));
        DeviceInfo deviceInfo = ecu.d().getDeviceInfo(GetDeviceInfoMode.CONNECTED_MAIN_DEVICES_WITHOUT_AW70, null, TAG);
        if (deviceInfo == null) {
            LogUtil.j(TAG, "doCheckSupportCapability deviceInfo == null");
            return null;
        }
        LogUtil.a(TAG, "doCheckSupportCapability:", deviceInfo.getDeviceName(), " , ", CommonUtil.n(deviceInfo.getDeviceIdentify()));
        CapabilityFactory.ICapabilitySource capabilitySource = CapabilityFactory.getCapabilitySource(i);
        if (capabilitySource == null) {
            LogUtil.j(TAG, "doCheckSupportCapability iCapability == null capabilityType: ", Integer.valueOf(i));
            return null;
        }
        return capabilitySource.isSupportCapability(deviceInfo, obj);
    }

    public void sendData(int i, Object obj, Object obj2, boolean z) {
        LogUtil.a(TAG, "sendData callbackId: ", Integer.valueOf(i), " routeInfo:", obj);
        if (!(obj instanceof JSONObject)) {
            LogUtil.j(TAG, "sendData routeInfo not instanceof JSONObject");
            ohProOnFailure(i, 0);
            return;
        }
        JSONObject jSONObject = (JSONObject) obj;
        if (jSONObject.has("serviceId") && jSONObject.has("commandId")) {
            handSendTlvRoute(jSONObject.optInt("serviceId"), jSONObject.optInt("commandId"), obj2, z);
            ohProOnSuccess(i, 0);
        } else {
            ohProOnFailure(i, 0);
            LogUtil.j(TAG, "sendData routeInfo invalid");
        }
    }

    private void handSendTlvRoute(int i, int i2, Object obj, boolean z) {
        if (!(obj instanceof JSONObject)) {
            LogUtil.j(TAG, "handSendTlvRoute data not instanceof JSONObject");
            return;
        }
        DeviceInfo deviceInfo = ecu.d().getDeviceInfo(GetDeviceInfoMode.CONNECTED_MAIN_DEVICES_WITHOUT_AW70, null, TAG);
        if (deviceInfo == null) {
            LogUtil.j(TAG, "handSendTlvRoute deviceInfo == null");
            return;
        }
        JSONObject jSONObject = (JSONObject) obj;
        LogUtil.a(TAG, "handSendTlvRoute dataJson :", qqt.b(jSONObject));
        int length = jSONObject.length();
        LogUtil.a(TAG, "handSendTlvRoute length :", Integer.valueOf(length));
        if (length > 2) {
            byte[] bArr = new byte[length - 2];
            int i3 = 0;
            for (int i4 = 2; i4 < jSONObject.length(); i4++) {
                bArr[i3] = (byte) jSONObject.optInt(String.valueOf(i4));
                i3++;
            }
            ArkuiProcessManager.c().d(deviceInfo.getDeviceIdentify(), i, i2, bArr, z);
        }
    }
}
