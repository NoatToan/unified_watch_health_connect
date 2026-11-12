package defpackage;

import android.text.TextUtils;
import com.google.gson.Gson;
import com.google.gson.JsonSyntaxException;
import com.huawei.health.devicemgr.api.constant.HwGetDevicesMode;
import com.huawei.health.devicemgr.business.entity.DeviceCapability;
import com.huawei.health.devicemgr.business.entity.DeviceInfo;
import com.huawei.hwcommonmodel.application.BaseApplication;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.wearengine.capability.EnumWearEngineCapabilityItem;
import health.compact.a.CommonUtil;
import health.compact.a.SharedPreferenceManager;
import health.compact.a.StorageParams;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes20.dex */
public class yie {
    public static boolean c(String str, EnumWearEngineCapabilityItem enumWearEngineCapabilityItem) {
        if (TextUtils.isEmpty(str) || enumWearEngineCapabilityItem == null) {
            LogUtil.j("WearEngine_WearEngineCapabilityUtils", "isSupport deviceId or item is empty");
            return false;
        }
        DeviceInfo deviceInfo = null;
        List<DeviceInfo> deviceList = ecu.d().getDeviceList(HwGetDevicesMode.CONNECTED_DEVICES, null, "WearEngine_WearEngineCapabilityUtils");
        if (deviceList.size() > 0) {
            LogUtil.j("WearEngine_WearEngineCapabilityUtils", "deviceId is connected.");
            for (DeviceInfo deviceInfo2 : deviceList) {
                if (str.equals(deviceInfo2.getDeviceUdid()) || str.equals(deviceInfo2.getUuid())) {
                    deviceInfo = deviceInfo2;
                    break;
                }
            }
        }
        if (deviceInfo == null) {
            LogUtil.j("WearEngine_WearEngineCapabilityUtils", "getOtherConnectedDevice is invalid.");
            throw new IllegalStateException(String.valueOf(16));
        }
        if (str.equals(deviceInfo.getDeviceUdid()) || str.equals(deviceInfo.getUuid())) {
            return eey.d(deviceInfo, enumWearEngineCapabilityItem.getValue());
        }
        LogUtil.j("WearEngine_WearEngineCapabilityUtils", "deviceId not equal");
        throw new IllegalStateException(String.valueOf(16));
    }

    public static boolean b(String str, EnumWearEngineCapabilityItem enumWearEngineCapabilityItem) {
        if (TextUtils.isEmpty(str) || enumWearEngineCapabilityItem == null) {
            LogUtil.j("WearEngine_WearEngineCapabilityUtils", "isSupport deviceId or item is empty");
            return false;
        }
        if (c(str, EnumWearEngineCapabilityItem.SUPPORT_CHECK_DETAIL_CAPABILITY)) {
            return c(str, enumWearEngineCapabilityItem);
        }
        DeviceInfo deviceInfo = null;
        List<DeviceInfo> deviceList = ecu.d().getDeviceList(HwGetDevicesMode.CONNECTED_DEVICES, null, "WearEngine_WearEngineCapabilityUtils");
        if (deviceList.size() > 0) {
            LogUtil.j("WearEngine_WearEngineCapabilityUtils", "deviceId is connected.");
            for (DeviceInfo deviceInfo2 : deviceList) {
                if (str.equals(deviceInfo2.getDeviceUdid()) || str.equals(deviceInfo2.getUuid())) {
                    deviceInfo = deviceInfo2;
                    break;
                }
            }
        }
        if (deviceInfo == null) {
            LogUtil.j("WearEngine_WearEngineCapabilityUtils", "getOtherConnectedDevice is invalid.");
            throw new IllegalStateException(String.valueOf(16));
        }
        if (eey.d(deviceInfo, enumWearEngineCapabilityItem.getValue())) {
            return true;
        }
        return d(deviceInfo, enumWearEngineCapabilityItem);
    }

    public static boolean e(DeviceInfo deviceInfo, EnumWearEngineCapabilityItem enumWearEngineCapabilityItem) {
        if (deviceInfo == null || enumWearEngineCapabilityItem == null) {
            LogUtil.e("WearEngine_WearEngineCapabilityUtils", "isSupportByDeviceInfo deviceInfo or capabilityItem is null ");
            return false;
        }
        byte[] bArrC = eeq.c(deviceInfo.getExpandCapability());
        LogUtil.d("WearEngine_WearEngineCapabilityUtils", "isSupportByDeviceInfo expandCapability is " + deviceInfo.getExpandCapability());
        boolean zA = CommonUtil.a(bArrC, enumWearEngineCapabilityItem.getValue());
        LogUtil.a("WearEngine_WearEngineCapabilityUtils", "modelName is " + deviceInfo.getDeviceModel() + ", isSupport  " + zA);
        return zA;
    }

    public static boolean d(DeviceInfo deviceInfo, EnumWearEngineCapabilityItem enumWearEngineCapabilityItem) {
        if (deviceInfo == null) {
            LogUtil.j("WearEngine_WearEngineCapabilityUtils", "isSupportOldCapability deviceInfo is null");
            return false;
        }
        String deviceIdentify = deviceInfo.getDeviceIdentify();
        if (TextUtils.isEmpty(deviceIdentify)) {
            LogUtil.j("WearEngine_WearEngineCapabilityUtils", "isSupportOldCapability deviceIdentify is empty");
            return false;
        }
        Map<String, DeviceCapability> mapQueryDeviceCapability = mkf.e(BaseApplication.getContext()).queryDeviceCapability(3, "", "WearEngine_WearEngineCapabilityUtils");
        if (mapQueryDeviceCapability != null && mapQueryDeviceCapability.size() > 0 && mapQueryDeviceCapability.containsKey(deviceIdentify)) {
            DeviceCapability deviceCapability = mapQueryDeviceCapability.get(deviceIdentify);
            if (deviceCapability == null) {
                LogUtil.j("WearEngine_WearEngineCapabilityUtils", "isSupportOldCapability deviceCapability is null");
                return false;
            }
            if (enumWearEngineCapabilityItem.getValue() == 2) {
                return deviceCapability.isSupportHiWear();
            }
            if (enumWearEngineCapabilityItem.getValue() >= 3 && enumWearEngineCapabilityItem.getValue() <= 12) {
                return deviceCapability.isSupportWearEngine();
            }
            if (enumWearEngineCapabilityItem.getValue() == 13) {
                return deviceCapability.isSupportCheckDeviceSpace();
            }
        }
        return false;
    }

    public static String a(Map<String, DeviceCapability> map) {
        if (map == null || map.isEmpty()) {
            LogUtil.j("WearEngine_WearEngineCapabilityUtils", "getCapabilityStringFromMap map is empty");
            return "";
        }
        StringBuilder sb = new StringBuilder();
        for (Map.Entry<String, DeviceCapability> entry : map.entrySet()) {
            sb.append(entry.getKey());
            sb.append("=");
            sb.append(new Gson().toJson(entry.getValue()));
            sb.append("&");
        }
        String string = sb.toString();
        LogUtil.d("WearEngine_WearEngineCapabilityUtils", "resultCapabilityString is ", string);
        if (TextUtils.isEmpty(string)) {
            LogUtil.j("WearEngine_WearEngineCapabilityUtils", "getCapabilityStringFromMap resultCapabilityString is emtpty");
            return "";
        }
        return string.substring(0, string.length() - 1);
    }

    public static Map<String, DeviceCapability> e(String str) {
        HashMap map = new HashMap(16);
        if (TextUtils.isEmpty(str)) {
            LogUtil.j("WearEngine_WearEngineCapabilityUtils", "getCapabilityMapFromString capabilityStringList is empty");
            return map;
        }
        LogUtil.d("WearEngine_WearEngineCapabilityUtils", "capabilityStringList: ", str);
        String[] strArrSplit = str.split("&");
        if (strArrSplit.length > 0) {
            for (String str2 : strArrSplit) {
                String[] strArrSplit2 = str2.split("=");
                if (strArrSplit2.length == 2) {
                    try {
                        map.put(strArrSplit2[0], (DeviceCapability) new Gson().fromJson(strArrSplit2[1], DeviceCapability.class));
                    } catch (JsonSyntaxException unused) {
                        LogUtil.e("WearEngine_WearEngineCapabilityUtils", "getCapabilityMapFromString JsonSyntaxException");
                    }
                } else {
                    LogUtil.j("WearEngine_WearEngineCapabilityUtils", "getCapabilityMapFromString parse exception");
                }
            }
        }
        return map;
    }

    public static void b() {
        String strD;
        Map<String, DeviceCapability> mapQueryDeviceCapability = mkf.e(BaseApplication.getContext()).queryDeviceCapability(3, "", "WearEngine_WearEngineCapabilityUtils");
        if (mapQueryDeviceCapability == null || mapQueryDeviceCapability.isEmpty()) {
            LogUtil.j("WearEngine_WearEngineCapabilityUtils", "saveCapability map is empty");
            return;
        }
        boolean zEquals = "true".equals(b("key_safe_update_save_capability"));
        if (!zEquals) {
            strD = b("key_save_capality");
        } else {
            strD = eeq.d(b("key_save_capality"));
        }
        if (strD == null) {
            LogUtil.j("WearEngine_WearEngineCapabilityUtils", "getSharedPreference found exception");
            return;
        }
        LogUtil.d("WearEngine_WearEngineCapabilityUtils", "saveCapability: ", strD);
        Map<String, DeviceCapability> mapE = e(strD);
        for (Map.Entry<String, DeviceCapability> entry : mapQueryDeviceCapability.entrySet()) {
            mapE.put(entry.getKey(), entry.getValue());
        }
        List<DeviceInfo> deviceList = ecu.d().getDeviceList(HwGetDevicesMode.ALL_DEVICES, null, "WearEngine_WearEngineCapabilityUtils");
        if (deviceList != null && deviceList.size() > 0) {
            HashMap map = new HashMap(16);
            for (DeviceInfo deviceInfo : deviceList) {
                map.put(deviceInfo.getDeviceIdentify(), deviceInfo);
            }
            Iterator<Map.Entry<String, DeviceCapability>> it = mapE.entrySet().iterator();
            while (it.hasNext()) {
                if (!map.containsKey(it.next().getKey())) {
                    it.remove();
                }
            }
        }
        String strA = a(mapE);
        e("key_save_capality", eeq.a(strA), new StorageParams());
        if (!zEquals) {
            e("key_safe_update_save_capability", "true", new StorageParams());
        }
        LogUtil.d("WearEngine_WearEngineCapabilityUtils", "toBeSavedCapabityStr : ", strA);
    }

    public static void e(DeviceInfo deviceInfo) {
        String strD;
        if (deviceInfo == null) {
            LogUtil.j("WearEngine_WearEngineCapabilityUtils", "deleteDeviceFromStorage deviceInfo is null");
            return;
        }
        String deviceIdentify = deviceInfo.getDeviceIdentify();
        boolean zEquals = "true".equals(b("key_safe_update_save_capability"));
        if (!zEquals) {
            strD = b("key_save_capality");
        } else {
            strD = eeq.d(b("key_save_capality"));
        }
        if (TextUtils.isEmpty(strD)) {
            LogUtil.j("WearEngine_WearEngineCapabilityUtils", "deleteDeviceFromStorage savedCapabilityStr is empty");
            return;
        }
        Map<String, DeviceCapability> mapE = e(strD);
        if (mapE.isEmpty()) {
            LogUtil.j("WearEngine_WearEngineCapabilityUtils", "deleteDeviceFromStorage saveCapabilityMap is empty");
            return;
        }
        if (mapE.containsKey(deviceIdentify)) {
            mapE.remove(deviceIdentify);
        }
        String strA = a(mapE);
        LogUtil.d("WearEngine_WearEngineCapabilityUtils", "deleteDeviceFrdomStorage toBeSavedCapabityStr : ", strA);
        e("key_save_capality", eeq.a(strA), new StorageParams());
        if (zEquals) {
            return;
        }
        e("key_safe_update_save_capability", "true", new StorageParams());
    }

    public static boolean a(DeviceInfo deviceInfo) {
        DeviceCapability deviceCapability;
        if (deviceInfo == null) {
            LogUtil.j("WearEngine_WearEngineCapabilityUtils", "checkHiWearCapabilityFromStorage device is null");
            return false;
        }
        String strD = eeq.d(b("key_save_capality"));
        if (TextUtils.isEmpty(strD)) {
            LogUtil.j("WearEngine_WearEngineCapabilityUtils", "checkHiWearCapabilityFromStorage saveCapability is empty");
            return false;
        }
        Map<String, DeviceCapability> mapE = e(strD);
        if (mapE.isEmpty()) {
            LogUtil.j("WearEngine_WearEngineCapabilityUtils", "checkHiWearCapabilityFromStorage savedCapabilityMap is empty");
            return false;
        }
        if (!mapE.containsKey(deviceInfo.getDeviceIdentify()) || (deviceCapability = mapE.get(deviceInfo.getDeviceIdentify())) == null) {
            return false;
        }
        return deviceCapability.isSupportHiWear();
    }

    private static String b(String str) {
        return SharedPreferenceManager.e(BaseApplication.getContext(), String.valueOf(53), str);
    }

    private static void e(String str, String str2, StorageParams storageParams) {
        SharedPreferenceManager.e(BaseApplication.getContext(), String.valueOf(53), str, str2, storageParams);
    }

    public static int d(DeviceInfo deviceInfo, boolean z) {
        if (deviceInfo == null) {
            LogUtil.j("WearEngine_WearEngineCapabilityUtils", "getP2pCapability deviceInfo is null");
            return 2;
        }
        if (!d(deviceInfo, EnumWearEngineCapabilityItem.POINT_TO_POINT_PING_AND_SEND_BYTES_ENUM)) {
            return 1;
        }
        if (z) {
            return 0;
        }
        if (ykx.d(deviceInfo.getDeviceModel())) {
            return !d(deviceInfo, EnumWearEngineCapabilityItem.QUERY_DEVICE_APP_INSTALL_INFO_ENUM) ? 1 : 0;
        }
        return c(deviceInfo);
    }

    public static int c(DeviceInfo deviceInfo) {
        if (deviceInfo == null) {
            LogUtil.j("WearEngine_WearEngineCapabilityUtils", "getP2pCapabilityNew deviceInfo is null");
            return 2;
        }
        if (e(deviceInfo, EnumWearEngineCapabilityItem.QUERY_DEVICE_APP_INSTALL_INFO_ENUM)) {
            return 0;
        }
        return i(deviceInfo);
    }

    private static int i(DeviceInfo deviceInfo) {
        String deviceModel = deviceInfo.getDeviceModel();
        return (TextUtils.isEmpty(deviceModel) || !ykx.a(deviceModel)) ? 1 : 0;
    }

    public static int b(DeviceInfo deviceInfo) {
        if (deviceInfo == null) {
            LogUtil.j("WearEngine_WearEngineCapabilityUtils", "getMonitorCapability device is null");
            return 2;
        }
        yig yigVar = new yig(deviceInfo, EnumWearEngineCapabilityItem.SPORT_STATUS_QUERY_AND_REPORT_ENUM);
        yigVar.d(EnumWearEngineCapabilityItem.LOW_POWER_REPORT_ENUM).d(EnumWearEngineCapabilityItem.POWER_STATUS_QUERY_ENUM).d(EnumWearEngineCapabilityItem.WEAR_STATUS_QUERY_AND_REPORT_ENUM).d(EnumWearEngineCapabilityItem.SLEEP_STATUS_QUERY_AND_REPORT_ENUM).d(EnumWearEngineCapabilityItem.CHARGING_STATUS_QUERY_AND_REPORT_ENUM).d(EnumWearEngineCapabilityItem.HEART_RATE_ALARM_REPORT_ENUM).d(EnumWearEngineCapabilityItem.QUERY_DEVICE_AVAILABLE_SPACE_ENUM);
        if (yigVar.e() == 0) {
            return 0;
        }
        return i(deviceInfo);
    }

    public static int d(DeviceInfo deviceInfo) {
        if (deviceInfo == null) {
            LogUtil.j("WearEngine_WearEngineCapabilityUtils", "getNotifyCapability device is null");
            return 2;
        }
        if (e(deviceInfo, EnumWearEngineCapabilityItem.SEND_NOTIFY_TO_WATCH_ENUM)) {
            return 0;
        }
        return i(deviceInfo);
    }

    public static int f(DeviceInfo deviceInfo) {
        if (deviceInfo != null) {
            return !e(deviceInfo, EnumWearEngineCapabilityItem.SUPPORT_SENSOR_ENUM) ? 0 : 1;
        }
        LogUtil.j("WearEngine_WearEngineCapabilityUtils", "getSensorCapability device is null");
        return 2;
    }
}
