package defpackage;

import androidx.appcompat.app.AppCompatDelegate;
import com.huawei.health.devicemgr.api.constant.HwGetDevicesMode;
import com.huawei.health.devicemgr.business.entity.DeviceInfo;
import com.huawei.hwlogsmodel.LogUtil;
import java.util.List;

/* JADX INFO: loaded from: classes17.dex */
public class rty {
    public static boolean d() {
        if (cpx.e()) {
            LogUtil.j("DeviceAutoSwitchUtils", "checkAutoSwitch is not debug version.");
            return false;
        }
        List<DeviceInfo> deviceList = ecu.d().getDeviceList(HwGetDevicesMode.ALL_DEVICES, null, "DeviceAutoSwitchUtils");
        if (deviceList == null) {
            LogUtil.a("DeviceAutoSwitchUtils", "getDeviceList is null.");
            return false;
        }
        int i = 0;
        int i2 = 0;
        for (DeviceInfo deviceInfo : deviceList) {
            if (c(deviceInfo)) {
                i2++;
            }
            if (!"followed_relationship".equals(deviceInfo.getRelationship())) {
                i++;
            }
        }
        LogUtil.a("DeviceAutoSwitchUtils", "getDeviceList: ", Integer.valueOf(deviceList.size()), ",nonFollowDeviceCounter: ", Integer.valueOf(i), ",supportedAutoSwitchCounter: ", Integer.valueOf(i2));
        return i >= 2 && i2 >= 1;
    }

    private static boolean c(DeviceInfo deviceInfo) {
        boolean zD = eey.d(deviceInfo, AppCompatDelegate.FEATURE_SUPPORT_ACTION_BAR_OVERLAY);
        LogUtil.a("DeviceAutoSwitchUtils", "isSupportDeviceAutoSwitch is:", Boolean.valueOf(zD));
        return zD;
    }
}
