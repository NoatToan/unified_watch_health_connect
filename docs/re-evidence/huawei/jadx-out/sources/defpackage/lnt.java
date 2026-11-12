package defpackage;

import android.text.TextUtils;
import com.huawei.health.devicemgr.business.entity.DeviceInfo;
import com.huawei.hms.support.hianalytics.HiAnalyticsConstant;
import health.compact.a.LogUtil;
import java.util.ArrayList;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: loaded from: classes10.dex */
public class lnt {
    private static ConcurrentHashMap d = new ConcurrentHashMap(16);

    public static void c() {
        d.put("currentConnectedDevices", new ArrayList(10));
        d.put("reconnectDevices", new ArrayList(10));
    }

    public static void c(String str) {
        LogUtil.b(HiAnalyticsConstant.KeyAndValue.NUMBER_01, 1, "ConnectedAndReconnectDeviceMgr", "setReconnectDeviceDisable enter ", Boolean.valueOf(TextUtils.isEmpty(str)));
        if (TextUtils.isEmpty(str)) {
            return;
        }
        ArrayList<DeviceInfo> arrayList = (ArrayList) d.get("reconnectDevices");
        if (arrayList == null || arrayList.isEmpty()) {
            LogUtil.e(HiAnalyticsConstant.KeyAndValue.NUMBER_01, 1, "ConnectedAndReconnectDeviceMgr", "putDeviceInfoIntoMap deviceInfos is null");
            return;
        }
        for (DeviceInfo deviceInfo : arrayList) {
            if (str.equals(deviceInfo.getDeviceIdentify())) {
                LogUtil.b(HiAnalyticsConstant.KeyAndValue.NUMBER_01, 1, "ConnectedAndReconnectDeviceMgr", "device exist, set device active disable");
                deviceInfo.setDeviceActiveState(0);
            }
        }
    }

    public static void d(String str) {
        LogUtil.b("ConnectedAndReconnectDeviceMgr", "setReconnectDeviceEnable enter ,", Boolean.valueOf(TextUtils.isEmpty(str)));
        if (TextUtils.isEmpty(str)) {
            return;
        }
        ArrayList<DeviceInfo> arrayList = d.get("reconnectDevices") instanceof ArrayList ? (ArrayList) d.get("reconnectDevices") : null;
        if (arrayList == null || arrayList.isEmpty()) {
            LogUtil.e("ConnectedAndReconnectDeviceMgr", "setReconnectDeviceEnable deviceList is empty.");
            return;
        }
        for (DeviceInfo deviceInfo : arrayList) {
            if (str.equals(deviceInfo.getDeviceIdentify())) {
                LogUtil.b("ConnectedAndReconnectDeviceMgr", "setReconnectDeviceEnable device exist, set device active enable.");
                deviceInfo.setDeviceActiveState(1);
            }
        }
    }

    public static void b(String str, DeviceInfo deviceInfo) {
        LogUtil.b(HiAnalyticsConstant.KeyAndValue.NUMBER_01, 1, "ConnectedAndReconnectDeviceMgr", "putDeviceInfoIntoMap enter");
        ArrayList arrayList = (ArrayList) d.get(str);
        if (arrayList == null) {
            LogUtil.e(HiAnalyticsConstant.KeyAndValue.NUMBER_01, 1, "ConnectedAndReconnectDeviceMgr", "putDeviceInfoIntoMap deviceInfos == null");
            return;
        }
        if (arrayList.isEmpty()) {
            LogUtil.b(HiAnalyticsConstant.KeyAndValue.NUMBER_01, 1, "ConnectedAndReconnectDeviceMgr", "putDeviceInfoIntoMap infos is empty");
            arrayList.add(deviceInfo);
            d.put(str, arrayList);
            clw.c(str, arrayList);
            return;
        }
        boolean z = false;
        for (int i = 0; i < arrayList.size(); i++) {
            if (((DeviceInfo) arrayList.get(i)).getDeviceIdentify().equals(deviceInfo.getDeviceIdentify())) {
                LogUtil.b(HiAnalyticsConstant.KeyAndValue.NUMBER_01, 1, "ConnectedAndReconnectDeviceMgr", "device exist, update device info");
                arrayList.remove(i);
                arrayList.add(deviceInfo);
                clw.c(str, arrayList);
                z = true;
            }
        }
        if (z) {
            return;
        }
        arrayList.add(deviceInfo);
        d.put(str, arrayList);
        clw.c(str, arrayList);
    }

    public static DeviceInfo d(String str, String str2) {
        LogUtil.b(HiAnalyticsConstant.KeyAndValue.NUMBER_01, 1, "ConnectedAndReconnectDeviceMgr", "Enter getCorrespondingInfo");
        ArrayList<DeviceInfo> arrayList = (ArrayList) d.get(str);
        if (arrayList == null) {
            LogUtil.e(HiAnalyticsConstant.KeyAndValue.NUMBER_01, 1, "ConnectedAndReconnectDeviceMgr", "deviceInfos is null");
            return null;
        }
        for (DeviceInfo deviceInfo : arrayList) {
            if (deviceInfo.getDeviceIdentify().equals(str2)) {
                LogUtil.b(HiAnalyticsConstant.KeyAndValue.NUMBER_01, 1, "ConnectedAndReconnectDeviceMgr", "getCorrespondingInfo success");
                return deviceInfo;
            }
        }
        return null;
    }

    public static void c(String str, DeviceInfo deviceInfo) {
        LogUtil.b(HiAnalyticsConstant.KeyAndValue.NUMBER_01, 1, "ConnectedAndReconnectDeviceMgr", "Enter removeCorrespondingDevice");
        ArrayList arrayList = (ArrayList) d.get(str);
        if (arrayList == null) {
            LogUtil.e(HiAnalyticsConstant.KeyAndValue.NUMBER_01, 1, "ConnectedAndReconnectDeviceMgr", "putDeviceInfoIntoMap deviceInfos == null");
            return;
        }
        for (int i = 0; i < arrayList.size(); i++) {
            if (((DeviceInfo) arrayList.get(i)).getDeviceIdentify().equals(deviceInfo.getDeviceIdentify())) {
                arrayList.remove(i);
                LogUtil.b(HiAnalyticsConstant.KeyAndValue.NUMBER_01, 1, "ConnectedAndReconnectDeviceMgr", "removeCorrespondingDevice success");
                d.put(str, arrayList);
                clw.c(str, arrayList);
                return;
            }
        }
    }

    public static ArrayList<DeviceInfo> a(String str) {
        if (d.get(str) instanceof ArrayList) {
            return (ArrayList) d.get(str);
        }
        return new ArrayList<>();
    }
}
