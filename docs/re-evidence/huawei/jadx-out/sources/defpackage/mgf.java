package defpackage;

import android.text.TextUtils;
import com.huawei.health.devicemgr.api.constant.HwGetDevicesMode;
import com.huawei.health.devicemgr.business.entity.DeviceInfo;
import com.huawei.health.devicemgr.business.entity.HwGetDevicesParameter;
import com.huawei.hwlogsmodel.LogUtil;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes10.dex */
public class mgf {
    protected mgf() {
    }

    public static List<DeviceInfo> e(String str) {
        List<DeviceInfo> deviceList = ecu.d().getDeviceList(HwGetDevicesMode.CONNECTED_DEVICES, null, str);
        if (deviceList == null) {
            LogUtil.j("HwGetDeviceInfoBase", "getAllConnectDeviceList() deviceInfoList is null.", str);
            return deviceList;
        }
        LogUtil.a("HwGetDeviceInfoBase", "getAllConnectDeviceList deviceInfoList size ", Integer.valueOf(deviceList.size()));
        ArrayList arrayList = new ArrayList(10);
        for (DeviceInfo deviceInfo : deviceList) {
            if ("main_relationship".equals(deviceInfo.getRelationship()) || eel.d(deviceInfo.getProductType())) {
                arrayList.add(deviceInfo);
            }
        }
        LogUtil.a("HwGetDeviceInfoBase", "getAllConnectDeviceList connectDeviceList size ", Integer.valueOf(arrayList.size()), " , tag is ", str);
        return arrayList;
    }

    public static DeviceInfo b(String str, String str2) {
        DeviceInfo deviceInfo = null;
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        List<DeviceInfo> deviceList = ecu.d().getDeviceList(HwGetDevicesMode.ACTIVE_DEVICES, null, str2);
        if (deviceList == null || deviceList.isEmpty()) {
            LogUtil.j("HwGetDeviceInfoBase", "getDefiniteActiveDeviceInfo deviceInfoList is null.", str2);
            return null;
        }
        for (DeviceInfo deviceInfo2 : deviceList) {
            if (deviceInfo2.getDeviceActiveState() == 1 && str.equals(deviceInfo2.getDeviceIdentify())) {
                deviceInfo = deviceInfo2;
                break;
            }
        }
        LogUtil.a("HwGetDeviceInfoBase", "getCertainDeviceInfo deviceInfo ", deviceInfo, " , tag is ", str2);
        return deviceInfo;
    }

    public static DeviceInfo c(String str, String str2) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        HwGetDevicesParameter hwGetDevicesParameter = new HwGetDevicesParameter();
        hwGetDevicesParameter.setDeviceIdentify(str);
        List<DeviceInfo> deviceList = ecu.d().getDeviceList(HwGetDevicesMode.IDENTIFY_DEVICES, hwGetDevicesParameter, str2);
        if (deviceList == null || deviceList.isEmpty()) {
            LogUtil.j("HwGetDeviceInfoBase", "getDefiniteDeviceInfo deviceInfoList is null", str2);
            return null;
        }
        return deviceList.get(0);
    }
}
