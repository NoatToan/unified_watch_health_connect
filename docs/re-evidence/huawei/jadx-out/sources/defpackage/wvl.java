package defpackage;

import com.huawei.health.devicemgr.business.entity.DeviceInfo;
import com.huawei.hwlogsmodel.LogUtil;

/* JADX INFO: loaded from: classes19.dex */
public class wvl {
    public static boolean a() {
        DeviceInfo deviceInfoD = mgg.d("ThreeCircleSwitchUtil");
        if (deviceInfoD == null) {
            LogUtil.j("ThreeCircleSwitchUtil", "isSupportNotifyReminderSwitch deviceInfo is null");
            return false;
        }
        return eey.d(deviceInfoD, 154);
    }
}
