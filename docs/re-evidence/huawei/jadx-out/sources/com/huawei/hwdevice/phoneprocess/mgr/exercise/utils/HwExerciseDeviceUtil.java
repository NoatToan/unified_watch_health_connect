package com.huawei.hwdevice.phoneprocess.mgr.exercise.utils;

import com.huawei.health.devicemgr.api.constant.HwGetDevicesMode;
import com.huawei.health.devicemgr.business.entity.DeviceCapability;
import com.huawei.health.devicemgr.business.entity.DeviceInfo;
import com.huawei.hwcommonmodel.application.BaseApplication;
import com.huawei.hwlogsmodel.LogUtil;
import defpackage.ecu;
import defpackage.eel;
import defpackage.mkf;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes11.dex */
public class HwExerciseDeviceUtil {
    private static final String TAG = "HwExerciseDeviceUtil";

    private HwExerciseDeviceUtil() {
    }

    public static int getConnectedDeviceType() {
        DeviceInfo deviceInfo = null;
        List<DeviceInfo> deviceList = ecu.d().getDeviceList(HwGetDevicesMode.ALL_DEVICES, null, TAG);
        for (DeviceInfo deviceInfo2 : deviceList) {
            if (deviceInfo2.getDeviceActiveState() == 1) {
                deviceInfo = deviceInfo2;
                break;
            }
        }
        int productType = deviceInfo != null ? deviceInfo.getProductType() : -1;
        LogUtil.a(TAG, "getConnectedDeviceType() deviceType: ", Integer.valueOf(productType), " deviceList.size(): ", Integer.valueOf(deviceList.size()));
        return productType;
    }

    public static DeviceCapability getCapability() {
        Map<String, DeviceCapability> mapQueryDeviceCapability = mkf.e(BaseApplication.getContext()).queryDeviceCapability(4, "", TAG);
        DeviceCapability value = null;
        if (mapQueryDeviceCapability == null || mapQueryDeviceCapability.isEmpty()) {
            LogUtil.j(TAG, "getCapability deviceCapabilityHashMaps is null or empty");
            return null;
        }
        Iterator<Map.Entry<String, DeviceCapability>> it = mapQueryDeviceCapability.entrySet().iterator();
        while (it.hasNext() && (value = it.next().getValue()) == null) {
        }
        return value;
    }

    public static DeviceCapability getSingleDeviceCapability(DeviceInfo deviceInfo) {
        if (deviceInfo == null) {
            LogUtil.j(TAG, "getCapability deviceInfo is null");
            return null;
        }
        Map<String, DeviceCapability> mapQueryDeviceCapability = mkf.e(BaseApplication.getContext()).queryDeviceCapability(1, deviceInfo.getDeviceIdentify(), TAG);
        if (mapQueryDeviceCapability == null || mapQueryDeviceCapability.isEmpty()) {
            return null;
        }
        return mapQueryDeviceCapability.get(deviceInfo.getDeviceIdentify());
    }

    public static DeviceInfo getCurrentDeviceInfo() {
        List<DeviceInfo> deviceList = ecu.d().getDeviceList(HwGetDevicesMode.CONNECTED_MAIN_DEVICES, null, TAG);
        if (deviceList.isEmpty()) {
            LogUtil.j(TAG, "getCurrentDeviceInfo deviceInfoList is empty");
            return null;
        }
        LogUtil.a(TAG, "getCurrentDeviceInfo() deviceInfoList.size(): ", Integer.valueOf(deviceList.size()));
        for (DeviceInfo deviceInfo : deviceList) {
            if (deviceInfo.getDeviceActiveState() == 1 && !eel.d(deviceInfo.getProductType())) {
                LogUtil.j(TAG, "getCurrentDeviceInfo() deviceInfo = ", deviceInfo);
                return deviceInfo;
            }
        }
        return null;
    }

    public static String getCurrentDeviceId() {
        DeviceInfo currentDeviceInfo = getCurrentDeviceInfo();
        if (currentDeviceInfo != null) {
            return currentDeviceInfo.getSecurityDeviceId();
        }
        return "";
    }

    public static String getCurrentDeviceMac() {
        DeviceInfo currentDeviceInfo = getCurrentDeviceInfo();
        if (currentDeviceInfo != null) {
            return currentDeviceInfo.getDeviceIdentify();
        }
        return "";
    }
}
