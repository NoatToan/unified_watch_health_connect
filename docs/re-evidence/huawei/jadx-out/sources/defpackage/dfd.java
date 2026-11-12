package defpackage;

import com.huawei.health.devicemgr.api.constant.GetDeviceInfoMode;
import com.huawei.health.devicemgr.business.entity.DeviceInfo;
import com.huawei.hwlogsmodel.LogUtil;
import health.compact.a.Utils;

/* JADX INFO: loaded from: classes7.dex */
public class dfd {
    public static boolean b() {
        return c(ecu.d().getDeviceInfo(GetDeviceInfoMode.CONNECTED_MAIN_DEVICES_WITHOUT_AW70, null, "BloodOxygenUtils"));
    }

    public static boolean c(DeviceInfo deviceInfo) {
        boolean zD;
        if (deviceInfo == null) {
            LogUtil.a("BloodOxygenUtils", "isBloodOxygenHignLandAllowed device is null");
            return false;
        }
        if (Utils.o()) {
            zD = eey.d(deviceInfo, 290);
        } else {
            zD = eey.d(deviceInfo, 72);
        }
        LogUtil.a("BloodOxygenUtils", "isBloodOxygenHignLandAllowed, isSupportCapability: ", Boolean.valueOf(zD));
        return zD;
    }
}
