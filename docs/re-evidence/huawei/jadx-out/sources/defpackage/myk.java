package defpackage;

import android.text.TextUtils;
import com.huawei.health.devicemgr.api.constant.HwGetDevicesMode;
import com.huawei.health.devicemgr.business.entity.DeviceCapability;
import com.huawei.health.devicemgr.business.entity.DeviceInfo;
import com.huawei.hwcommonmodel.application.BaseApplication;
import com.huawei.hwcommonmodel.constants.AnalyticsValue;
import com.huawei.hwlogsmodel.LogUtil;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes11.dex */
public class myk {
    public static DeviceInfo b(String str) {
        DeviceInfo deviceInfo = null;
        List<DeviceInfo> deviceList = ecu.d().getDeviceList(HwGetDevicesMode.CONNECTED_MAIN_DEVICES, null, str);
        if (deviceList != null && !deviceList.isEmpty()) {
            for (DeviceInfo deviceInfo2 : deviceList) {
                if (!eel.d(deviceInfo2.getProductType())) {
                    deviceInfo = deviceInfo2;
                    break;
                }
            }
        }
        LogUtil.a("SyncDataDeviceUtil", "getConnectDeviceInfo() deviceInfo ", deviceInfo, " , tag is ", str);
        return deviceInfo;
    }

    public static DeviceInfo a(String str) {
        DeviceInfo deviceInfo = null;
        List<DeviceInfo> deviceList = ecu.d().getDeviceList(HwGetDevicesMode.ACTIVE_MAIN_DEVICES, null, str);
        if (deviceList == null) {
            LogUtil.j("SyncDataDeviceUtil", "getActiveDeviceInfo() deviceInfoList is null.", str);
            return null;
        }
        for (DeviceInfo deviceInfo2 : deviceList) {
            if (!eel.d(deviceInfo2.getProductType())) {
                deviceInfo = deviceInfo2;
                break;
            }
        }
        LogUtil.a("SyncDataDeviceUtil", "getActiveDeviceInfo deviceInfo ", deviceInfo, " , tag is ", str);
        return deviceInfo;
    }

    public static DeviceInfo d(String str) {
        DeviceInfo deviceInfo = null;
        List<DeviceInfo> deviceList = ecu.d().getDeviceList(HwGetDevicesMode.ACTIVE_DEVICES, null, str);
        if (deviceList == null) {
            LogUtil.j("SyncDataDeviceUtil", "getActiveDeviceInfo deviceInfoList is null.", str);
            return null;
        }
        for (DeviceInfo deviceInfo2 : deviceList) {
            if (eel.d(deviceInfo2.getProductType())) {
                deviceInfo = deviceInfo2;
                break;
            }
        }
        LogUtil.a("SyncDataDeviceUtil", "getActiveDeviceInfo deviceInfo ", deviceInfo, " , tag is ", str);
        return deviceInfo;
    }

    public static DeviceInfo b(String str, String str2) {
        DeviceInfo deviceInfo = null;
        if (TextUtils.isEmpty(str)) {
            LogUtil.j("SyncDataDeviceUtil", "getDefiniteActiveDeviceInfo id is empty");
            return null;
        }
        List<DeviceInfo> deviceList = ecu.d().getDeviceList(HwGetDevicesMode.ACTIVE_DEVICES, null, str2);
        if (deviceList == null || deviceList.isEmpty()) {
            LogUtil.j("SyncDataDeviceUtil", "getDefiniteActiveDeviceInfo deviceInfoList is null.", str2);
            return null;
        }
        for (DeviceInfo deviceInfo2 : deviceList) {
            if (deviceInfo2.getDeviceActiveState() == 1 && str.equals(deviceInfo2.getDeviceIdentify())) {
                deviceInfo = deviceInfo2;
                break;
            }
        }
        LogUtil.a("SyncDataDeviceUtil", "getCertainDeviceInfo deviceInfo ", deviceInfo, " , tag is ", str2);
        return deviceInfo;
    }

    public static DeviceCapability b() {
        Map<String, DeviceCapability> mapQueryDeviceCapability = mkf.e(BaseApplication.getContext()).queryDeviceCapability(4, "", "SyncDataDeviceUtil");
        DeviceCapability value = null;
        if (mapQueryDeviceCapability != null && !mapQueryDeviceCapability.isEmpty()) {
            Iterator<Map.Entry<String, DeviceCapability>> it = mapQueryDeviceCapability.entrySet().iterator();
            while (it.hasNext() && (value = it.next().getValue()) == null) {
            }
        }
        return value;
    }

    public static String d() {
        DeviceInfo deviceInfoA = a("SyncDataDeviceUtil");
        if (deviceInfoA != null) {
            return deviceInfoA.getSecurityUuid() + "#ANDROID21";
        }
        return "";
    }

    public static boolean e(DeviceInfo deviceInfo) {
        if (deviceInfo == null) {
            return true;
        }
        int productType = deviceInfo.getProductType();
        boolean z = mga.e(productType) != 0;
        if (!z) {
            b(productType);
        }
        return z;
    }

    private static void b(int i) {
        LogUtil.j("SyncDataDeviceUtil", "device list info is wrong, can not get right device info now, please check download device info from net");
        HashMap map = new HashMap(16);
        map.put("status", Integer.valueOf(i));
        lmf.d().c(BaseApplication.getContext(), AnalyticsValue.HEALTH_DEVICE_HI_TYPE_ERROR_1040065.value(), map, 0);
    }

    public static int e() {
        DeviceInfo deviceInfoB = b("SyncDataDeviceUtil");
        if (deviceInfoB == null) {
            LogUtil.j("SyncDataDeviceUtil", "getStressDevNo deviceInfo is null");
            return 0;
        }
        return deviceInfoB.getProductType();
    }
}
