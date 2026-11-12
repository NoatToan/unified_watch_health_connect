package com.huawei.hwarkuix.oHBrigdePlugin.health.utils;

import com.huawei.health.devicemgr.api.constant.GetDeviceInfoMode;
import com.huawei.health.devicemgr.business.entity.DeviceCapability;
import com.huawei.health.devicemgr.business.entity.DeviceInfo;
import com.huawei.health.marketing.utils.EcgFilterManager;
import com.huawei.hwcommonmodel.application.BaseApplication;
import com.huawei.hwlogsmodel.LogUtil;
import defpackage.ecu;
import defpackage.eej;
import defpackage.eey;
import defpackage.fxn;
import defpackage.grt;
import health.compact.a.Utils;

/* JADX INFO: loaded from: classes37.dex */
public class DeviceUtil {
    private static final String TAG = "ArkUIX_DeviceUtil";

    public static boolean isSupportEcg() {
        return isSupportEcgCollection();
    }

    public static boolean isSupportEcgAnalysis() {
        if (isDeviceDisconnected()) {
            LogUtil.j(TAG, "isSupportEcgAnalysis device disconnected.");
            return false;
        }
        DeviceInfo deviceInfo = ecu.d().getDeviceInfo(GetDeviceInfoMode.CONNECTED_MAIN_DEVICES_WITHOUT_AW70, null, TAG);
        if (deviceInfo == null) {
            LogUtil.j(TAG, "isSupportEcgAnalysis deviceInfo is null.");
            return false;
        }
        return eey.d(deviceInfo, Utils.c(BaseApplication.getContext()) ? 226 : 106);
    }

    public static boolean isSupportContinuousHeartRate() {
        if (isDeviceDisconnected()) {
            LogUtil.j(TAG, "isSupportContinuousHeartRate device disconnected.");
            return false;
        }
        DeviceCapability deviceCapabilityC = eej.c();
        if (deviceCapabilityC != null) {
            return deviceCapabilityC.isSupportContinueHeartRate() || deviceCapabilityC.isSupportHeartRateEnable();
        }
        LogUtil.j(TAG, "isSupportContinuousHeartRate deviceCapability is null.");
        return false;
    }

    public static boolean isSupportPressAutoMonitor() {
        if (isDeviceDisconnected()) {
            LogUtil.j(TAG, "isSupportPressAutoMonitor device disconnected.");
            return false;
        }
        DeviceCapability deviceCapabilityC = eej.c();
        if (deviceCapabilityC == null) {
            LogUtil.j(TAG, "isSupportPressAutoMonitor deviceCapability is null.");
            return false;
        }
        return deviceCapabilityC.isSupportPressAutoMonitor();
    }

    public static boolean isSupportEmotionAutoMonitor() {
        if (isDeviceDisconnected()) {
            LogUtil.j(TAG, "isSupportEmotionAutoMonitor device disconnected.");
            return false;
        }
        DeviceInfo deviceInfo = ecu.d().getDeviceInfo(GetDeviceInfoMode.CONNECTED_MAIN_DEVICES_WITHOUT_AW70, null, TAG);
        if (deviceInfo == null) {
            LogUtil.j(TAG, "isSupportEmotionAutoMonitor deviceInfo is null.");
            return false;
        }
        return eey.d(deviceInfo, 206);
    }

    public static boolean isSupportEcgCollection() {
        if (Utils.o()) {
            LogUtil.j(TAG, "isSupportEcgCollection oversea.");
            return false;
        }
        if (!isDeviceDisconnected()) {
            DeviceCapability deviceCapabilityC = eej.c();
            if (deviceCapabilityC != null && deviceCapabilityC.isSupportEcgAuth()) {
                return true;
            }
            LogUtil.j(TAG, "capability is null or not support ecg");
        }
        return false;
    }

    public static boolean isSupportEcgDiagram() {
        EcgFilterManager ecgFilterManagerB = EcgFilterManager.b();
        if (fxn.g("com.huawei.health.h5.ecgce") && ecgFilterManagerB.o()) {
            return ecgFilterManagerB.j();
        }
        return false;
    }

    public static boolean isDeviceDisconnected() {
        DeviceInfo deviceInfo = ecu.d().getDeviceInfo(GetDeviceInfoMode.CONNECTED_MAIN_DEVICES_WITHOUT_AW70, null, TAG);
        return deviceInfo == null || deviceInfo.getDeviceConnectState() != 2;
    }

    public static boolean isSupportPpg() {
        if (isDeviceDisconnected()) {
            LogUtil.j(TAG, "isSupportPpg device disconnected.");
            return false;
        }
        DeviceInfo deviceInfo = ecu.d().getDeviceInfo(GetDeviceInfoMode.CONNECTED_MAIN_DEVICES_WITHOUT_AW70, null, TAG);
        if (deviceInfo == null) {
            LogUtil.j(TAG, "isSupportPpg deviceInfo is null.");
            return false;
        }
        return grt.e(deviceInfo);
    }

    public static boolean isSupportPpgCE() {
        if (isDeviceDisconnected()) {
            LogUtil.j(TAG, "isSupportPpgCE device disconnected.");
            return false;
        }
        DeviceInfo deviceInfo = ecu.d().getDeviceInfo(GetDeviceInfoMode.CONNECTED_MAIN_DEVICES_WITHOUT_AW70, null, TAG);
        if (deviceInfo == null) {
            LogUtil.j(TAG, "isSupportPpgCE deviceInfo is null.");
            return false;
        }
        return grt.c(deviceInfo);
    }

    public static boolean isSupportVesselDevice() {
        if (isDeviceDisconnected()) {
            LogUtil.j(TAG, "isSupportVesselDevice device disconnected.");
            return false;
        }
        DeviceInfo deviceInfo = ecu.d().getDeviceInfo(GetDeviceInfoMode.CONNECTED_MAIN_DEVICES_WITHOUT_AW70, null, TAG);
        if (deviceInfo == null) {
            LogUtil.j(TAG, "isSupportVesselDevice deviceInfo is null.");
            return false;
        }
        return eey.d(deviceInfo, 75);
    }

    public static boolean isDeviceSupportDynamicBp() {
        if (isDeviceDisconnected()) {
            LogUtil.j(TAG, "isDeviceSupportDynamicBp device disconnected.");
            return false;
        }
        DeviceInfo deviceInfo = ecu.d().getDeviceInfo(GetDeviceInfoMode.CONNECTED_MAIN_DEVICES_WITHOUT_AW70, null, TAG);
        if (deviceInfo == null) {
            LogUtil.j(TAG, "isDeviceSupportDynamicBp deviceInfo is null");
            return false;
        }
        boolean zD = eey.d(deviceInfo, 205);
        LogUtil.a(TAG, "isDeviceSupportDynamicBp isSupport : ", Boolean.valueOf(zD));
        return zD;
    }
}
