package defpackage;

import com.huawei.health.devicemgr.business.entity.DeviceInfo;
import com.huawei.hwcommonmodel.application.BaseApplication;
import com.huawei.hwlogsmodel.LogUtil;

/* JADX INFO: loaded from: classes11.dex */
public class mys {
    public static void b(long j, long j2, boolean z) {
        LogUtil.a("BasicDataSendCommandUtil", "getHeartRateRaise enter.supportDownRate: ", Boolean.valueOf(z));
        mkf.e(BaseApplication.getContext()).sendDeviceData(myn.c(j, j2, z));
    }

    public static void e(long j, long j2) {
        LogUtil.a("BasicDataSendCommandUtil", "sendBloodOxygenDownRemindCount enter");
        mkf.e(BaseApplication.getContext()).sendDeviceData(myn.c(j, j2));
    }

    public static void c(int i, DeviceInfo deviceInfo) {
        LogUtil.a("BasicDataSendCommandUtil", "sendBloodOxygenDownRemindDetail enter");
        mkf.e(BaseApplication.getContext()).sendDeviceData(myn.c(i, deviceInfo));
    }
}
