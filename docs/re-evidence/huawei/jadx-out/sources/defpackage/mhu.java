package defpackage;

import com.huawei.haf.common.exception.ExceptionUtils;
import com.huawei.health.devicemgr.business.entity.DeviceInfo;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.syncmgr.SyncOption;
import health.compact.a.EnvironmentUtils;
import health.compact.a.hwlogsmodel.ReleaseLogUtil;

/* JADX INFO: loaded from: classes10.dex */
public class mhu {
    public static SyncOption e(byte[] bArr) {
        DeviceInfo deviceInfoD;
        long jC;
        if (EnvironmentUtils.e()) {
            deviceInfoD = myl.b().getDeviceInfo();
        } else {
            deviceInfoD = mgg.d("CoreSleepOptionUtil");
        }
        LogUtil.a("CoreSleepOptionUtil", "createSyncOption dataInfos: ", eeq.e(bArr));
        ReleaseLogUtil.d("BTSYNC_CoreSleep_CoreSleepOptionUtil", " support CORE_SLEEP_ALGORITHM:", Boolean.valueOf(eey.d(deviceInfoD, 143)));
        if (eey.d(deviceInfoD, 143)) {
            if (bArr.length < 11) {
                return null;
            }
            try {
                jC = mjb.c(bArr) * 1000;
            } catch (eeu e) {
                ReleaseLogUtil.a("BTSYNC_CoreSleep_CoreSleepOptionUtil", "createSyncOption getCoreSleepTimeStamps TlvException: ", ExceptionUtils.c(e));
                jC = 0;
            }
            ReleaseLogUtil.d("BTSYNC_CoreSleep_CoreSleepOptionUtil", "createSyncOption endTime:", Long.valueOf(jC));
            return SyncOption.builder().c(true).c("hasUpgradeTime", String.valueOf(jC)).c();
        }
        return SyncOption.builder().c(true).c();
    }
}
