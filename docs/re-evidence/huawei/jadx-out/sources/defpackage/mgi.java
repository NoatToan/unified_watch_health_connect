package defpackage;

import com.huawei.health.devicemgr.api.constant.HwGetDevicesMode;
import com.huawei.health.devicemgr.business.entity.DeviceInfo;
import com.huawei.hwlogsmodel.LogUtil;
import java.util.List;

/* JADX INFO: loaded from: classes10.dex */
public class mgi extends mgf {
    public static DeviceInfo d(String str) {
        DeviceInfo deviceInfo = null;
        List<DeviceInfo> deviceList = ecu.d().getDeviceList(HwGetDevicesMode.CONNECTED_AW70_DEVICES, null, str);
        if (deviceList != null && !deviceList.isEmpty()) {
            deviceInfo = deviceList.get(0);
        }
        LogUtil.a("HwGetAw70DeviceInfoUtil", "getConnectDeviceInfo() deviceInfo ", deviceInfo, " , tag is ", str);
        return deviceInfo;
    }

    public static DeviceInfo c(String str) {
        DeviceInfo deviceInfo = null;
        List<DeviceInfo> deviceList = ecu.d().getDeviceList(HwGetDevicesMode.ACTIVE_DEVICES, null, str);
        if (deviceList == null) {
            LogUtil.j("HwGetAw70DeviceInfoUtil", "getActiveDeviceInfo deviceInfoList is null.", str);
            return null;
        }
        for (DeviceInfo deviceInfo2 : deviceList) {
            if (eel.d(deviceInfo2.getProductType())) {
                deviceInfo = deviceInfo2;
                break;
            }
        }
        LogUtil.a("HwGetAw70DeviceInfoUtil", "getActiveDeviceInfo deviceInfo ", deviceInfo, " , tag is ", str);
        return deviceInfo;
    }
}
