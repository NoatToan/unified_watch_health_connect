package com.huawei.hwarkuix.oHBrigdePlugin.health;

import android.content.Context;
import com.huawei.health.devicemgr.api.constant.HwGetDevicesMode;
import com.huawei.health.devicemgr.business.entity.DeviceInfo;
import com.huawei.health.h5pro.core.H5ProLaunchOption;
import com.huawei.hiai.awareness.client.AwarenessRequest;
import com.huawei.hihealth.util.ReleaseLogUtil;
import com.huawei.hwarkuix.oHBrigdePlugin.health.utils.DeviceUtil;
import com.huawei.hwarkuix.oHProEngine.OHProBridgePlugin;
import com.huawei.hwbasemgr.IBaseResponseCallback;
import com.huawei.hwcommonmodel.application.BaseApplication;
import com.huawei.operation.ble.BleConstants;
import com.huawei.operation.h5pro.jsmodules.device.MatterDataContans;
import defpackage.ddv;
import defpackage.dmx;
import defpackage.ecu;
import defpackage.ftp;
import defpackage.lwx;
import defpackage.njy;
import health.compact.a.util.LogUtil;
import java.util.List;
import ohos.ace.adapter.capability.bridge.BridgeManager;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes10.dex */
public class Device extends OHProBridgePlugin {
    private static final String R_TAG = "R_ArkUIX_Device";
    private static final String TAG = "ArkUIX_Device";

    public Device(Context context, String str, int i) {
        super(context, str, i);
    }

    public Device(Context context, String str, BridgeManager bridgeManager) {
        super(context, str, bridgeManager);
    }

    public void getSugarDeviceInfo(int i) {
        ReleaseLogUtil.c(R_TAG, "getSugarDeviceInfo enter");
        DeviceInfo macaDeviceInfo = getMacaDeviceInfo();
        if (macaDeviceInfo == null) {
            LogUtil.a(TAG, "getSugarDeviceInfo macaDeviceInfo is null");
            ohProOnSuccess(i, new JSONObject());
            return;
        }
        JSONObject jSONObject = new JSONObject();
        JSONObject jSONObject2 = new JSONObject();
        try {
            jSONObject.put("deviceStatus", getDeviceState(macaDeviceInfo.getDeviceConnectState()));
            jSONObject2.put("uuid", macaDeviceInfo.getDeviceIdentify());
            jSONObject2.put("deviceBluetoothName", macaDeviceInfo.getDeviceName());
            jSONObject2.put("connectCode", "");
            Long lC = 0L;
            if (macaDeviceInfo.getDeviceConnectState() == 2) {
                dmx<Long> matterTimeInfo = ecu.d().getMatterTimeInfo(macaDeviceInfo, 1);
                if (matterTimeInfo.a().intValue() == 0) {
                    lC = matterTimeInfo.c();
                }
            }
            jSONObject2.put("remainingServiceTime", lC);
            jSONObject2.put("bloodSugarTrend", 6);
            jSONObject.put("deviceInfo", jSONObject2);
            ReleaseLogUtil.c(R_TAG, "getSugarDeviceInfo resp: ", jSONObject.toString());
            ohProOnSuccess(i, jSONObject);
        } catch (JSONException unused) {
            LogUtil.c(TAG, "getSugarDeviceInfo occur error.");
            ohProOnSuccess(i, new JSONObject());
        }
    }

    private DeviceInfo getMacaDeviceInfo() {
        List<DeviceInfo> deviceList = ecu.d().getDeviceList(HwGetDevicesMode.ALL_DEVICES, null, TAG);
        if (njy.e(deviceList)) {
            return null;
        }
        for (DeviceInfo deviceInfo : deviceList) {
            if (deviceInfo != null && deviceInfo.getProductType() == 275 && deviceInfo.getDeviceConnectState() != -1) {
                return deviceInfo;
            }
        }
        return null;
    }

    private String getDeviceState(int i) {
        if (i == -1) {
            return "invalid";
        }
        if (i == 2) {
            return "connect";
        }
        if (i == 3) {
            return AwarenessRequest.MessageType.DISCONNECT;
        }
        return "default";
    }

    public void jumpToBloodSugarDevice(int i) {
        boolean z;
        ReleaseLogUtil.c(R_TAG, "jumpToBloodSugarDevice enter");
        DeviceInfo macaDeviceInfo = getMacaDeviceInfo();
        if (macaDeviceInfo == null) {
            LogUtil.a(TAG, "jumpToBloodSugarDevice macaDeviceInfo is null");
            z = false;
        } else {
            H5ProLaunchOption.Builder builder = new H5ProLaunchOption.Builder();
            builder.addCustomizeArg(MatterDataContans.KEY_MAC_ADDRESS, macaDeviceInfo.getDeviceIdentify());
            builder.addCustomizeArg(BleConstants.BLUETOOTH_NAME, macaDeviceInfo.getDeviceName());
            builder.addCustomizeArg("pin", "");
            builder.addCustomizeArg("jumpPage", "home");
            ddv.b().loadH5ProApp(BaseApplication.getContext(), "com.huawei.health.h5.matter", builder);
            z = true;
        }
        JSONObject jSONObject = new JSONObject();
        try {
            if (z) {
                jSONObject.put("resultCode", 0);
                jSONObject.put("message", "jump to blood sugar device page success");
            } else {
                jSONObject.put("resultCode", -1);
                jSONObject.put("message", "jump to blood sugar device page failed");
            }
            ohProOnSuccess(i, jSONObject);
        } catch (JSONException unused) {
            LogUtil.c(TAG, "jumpToBloodSugarDevice occur error.");
        }
    }

    public void isConnectedDevice(int i) {
        ReleaseLogUtil.c(R_TAG, "isConnectedDevice enter");
        boolean zIsDeviceDisconnected = DeviceUtil.isDeviceDisconnected();
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("isConnectedDevice", !zIsDeviceDisconnected);
        } catch (JSONException unused) {
            LogUtil.c(TAG, "isConnectedDevice occur error.");
        }
        ReleaseLogUtil.c(R_TAG, "isConnectedDevice resp: ", jSONObject.toString());
        ohProOnSuccess(i, jSONObject);
    }

    public void isCalibrated(final int i) {
        ftp.e(new IBaseResponseCallback() { // from class: com.huawei.hwarkuix.oHBrigdePlugin.health.Device$$ExternalSyntheticLambda0
            @Override // com.huawei.hwbasemgr.IBaseResponseCallback
            /* JADX INFO: renamed from: onResponse */
            public final void a(int i2, Object obj) {
                this.f$0.m1404x3afc9e43(i, i2, obj);
            }
        });
    }

    /* JADX INFO: renamed from: lambda$isCalibrated$0$com-huawei-hwarkuix-oHBrigdePlugin-health-Device, reason: not valid java name */
    /* synthetic */ void m1404x3afc9e43(int i, int i2, Object obj) {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("isCalibrated", obj);
        } catch (JSONException unused) {
            LogUtil.c(TAG, "isConnectedDevice occur error.");
        }
        LogUtil.a(TAG, "isConnectedDevice resp: ", jSONObject);
        ohProOnSuccess(i, jSONObject);
    }

    public void getAllDeviceCapabilitys(int i) {
        ReleaseLogUtil.c(R_TAG, "getAllDeviceCapabilitys enter");
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("isSupportEcgDevice", DeviceUtil.isSupportEcg());
            jSONObject.put("isSupportEcgAnalysisDevice", DeviceUtil.isSupportEcgAnalysis());
            jSONObject.put("isSupportContinuousHeartRateMeasurement", DeviceUtil.isSupportContinuousHeartRate());
            jSONObject.put("isSupportPressAutoMonitor", DeviceUtil.isSupportPressAutoMonitor());
            jSONObject.put("isSupportEmotion", DeviceUtil.isSupportEmotionAutoMonitor());
            jSONObject.put("isSupportPpg", DeviceUtil.isSupportPpg());
            jSONObject.put("isSupportPpgCE", DeviceUtil.isSupportPpgCE());
            jSONObject.put("isSupportVesselDevice", DeviceUtil.isSupportVesselDevice());
        } catch (JSONException unused) {
            LogUtil.c(TAG, "getAllDeviceCapabilitys occur error.");
        }
        ReleaseLogUtil.c(R_TAG, "getAllDeviceCapabilitys resp: ", jSONObject.toString());
        ohProOnSuccess(i, jSONObject);
    }

    public void registerDeviceDynamicBp(final int i) {
        ReleaseLogUtil.c(R_TAG, "registerDeviceDynamicBp enter：callbackId:", Integer.valueOf(i));
        boolean zIsDeviceSupportDynamicBp = DeviceUtil.isDeviceSupportDynamicBp();
        ReleaseLogUtil.c(R_TAG, "registerDeviceDynamicBp isSupport: ", Boolean.valueOf(zIsDeviceSupportDynamicBp));
        if (zIsDeviceSupportDynamicBp) {
            lwx.d().d(new IBaseResponseCallback() { // from class: com.huawei.hwarkuix.oHBrigdePlugin.health.Device.1
                @Override // com.huawei.hwbasemgr.IBaseResponseCallback
                /* JADX INFO: renamed from: onResponse */
                public void a(int i2, Object obj) {
                    LogUtil.a(Device.TAG, "registerDeviceDynamicBp errorCode: ", Integer.valueOf(i2), " objData: ", obj);
                    if (i2 != 100000) {
                        LogUtil.d(Device.TAG, "registerDeviceDynamicBp error");
                        Device.this.ohProOnFailure(i, Integer.valueOf(i2));
                    } else {
                        Device.this.ohProOnSuccess(i, Integer.valueOf(i2));
                    }
                }
            });
        } else {
            ohProOnSuccess(i, "device not support");
        }
    }
}
