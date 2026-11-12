package defpackage;

import com.huawei.health.devicemgr.api.constant.GetDeviceInfoMode;
import com.huawei.health.devicemgr.business.entity.DeviceInfo;
import com.huawei.hwcommonmodel.application.BaseApplication;
import com.huawei.hwlogsmodel.LogUtil;
import health.compact.a.CommonUtil;

/* JADX INFO: loaded from: classes12.dex */
public class nyl {
    public static boolean c(int i) {
        return i == 264;
    }

    public static boolean d(int i) {
        return i == 274 || i == 273 || i == 265;
    }

    public static boolean e(int i) {
        return i == 283;
    }

    public static boolean a(int i) {
        if (!d(i)) {
            return (i == 283 || eej.c() == null || !eej.c().isSupportWorkoutCapabilicy()) ? false : true;
        }
        DeviceInfo deviceInfo = ecu.d().getDeviceInfo(GetDeviceInfoMode.CONNECTED_MAIN_DEVICES_WITHOUT_AW70, null, "Track_ConvertUtil");
        if (deviceInfo == null) {
            LogUtil.j("Track_ConvertUtil", "isSportTypeForLinkage getConnectDeviceInfo is null");
            return false;
        }
        return eey.d(deviceInfo, 0);
    }

    public static boolean h(int i) {
        LogUtil.a("Track_ConvertUtil", "isSportTypeForLinkage(sportType)", Boolean.valueOf(a(i)), "CapabilityUtils.getDeviceCapability() != null", Boolean.valueOf(eej.c() != null));
        if (eej.c() == null) {
            return false;
        }
        LogUtil.a("Track_ConvertUtil", "CapabilityUtils.getDeviceCapability().isSupportInformCloseOrOpen()", Boolean.valueOf(eej.c().isSupportInformCloseOrOpen()), "CapabilityUtils.getDeviceCapability().isSupportWorkout()", Boolean.valueOf(eej.c().isSupportWorkout()));
        return a(i) && eej.c() != null && eej.c().isSupportInformCloseOrOpen() && eej.c().isSupportWorkout();
    }

    public static boolean b(int i) {
        boolean zF = jaa.f(BaseApplication.getContext());
        boolean zBh = CommonUtil.bh();
        boolean zBd = CommonUtil.bd();
        boolean z = i == 264 || i == 283;
        LogUtil.a("Track_ConvertUtil", "isSupportMusic? ", Boolean.valueOf(zF), " and ", Boolean.valueOf(zBh), " isHonor ", Boolean.valueOf(zBd));
        LogUtil.a("Track_ConvertUtil", "isShowSportType ", Boolean.valueOf(z));
        return (zF && zBh && (!zBd || z)) ? false : true;
    }
}
