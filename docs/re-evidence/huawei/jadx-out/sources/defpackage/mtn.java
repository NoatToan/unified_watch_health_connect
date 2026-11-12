package defpackage;

import android.text.TextUtils;
import com.huawei.health.devicemgr.api.constant.HwGetDevicesMode;
import com.huawei.health.devicemgr.business.entity.DeviceInfo;
import com.huawei.hwlogsmodel.LogUtil;
import java.util.List;

/* JADX INFO: loaded from: classes11.dex */
public class mtn {
    public static String e() {
        DeviceInfo deviceInfo = null;
        List<DeviceInfo> deviceList = ecu.d().getDeviceList(HwGetDevicesMode.CONNECTED_MAIN_DEVICES, null, "DeviceUtils");
        if (deviceList.size() == 0) {
            LogUtil.j("DeviceUtils", "getContactedDeviceMac: the object of HwDeviceMgr is null. ");
            return "00:00:00:00:00:00";
        }
        if (deviceList.size() > 0) {
            for (DeviceInfo deviceInfo2 : deviceList) {
                if (!eel.d(deviceInfo2.getProductType())) {
                    deviceInfo = deviceInfo2;
                    break;
                }
            }
        }
        if (deviceInfo == null) {
            LogUtil.j("DeviceUtils", "getContactedDeviceMac: the object of DeviceInfo is null. ");
            return "00:00:00:00:00:00";
        }
        String deviceIdentify = deviceInfo.getDeviceIdentify();
        return "contact_sync_" + mtr.e(TextUtils.isEmpty(deviceIdentify) ? "00:00:00:00:00:00" : deviceIdentify);
    }
}
