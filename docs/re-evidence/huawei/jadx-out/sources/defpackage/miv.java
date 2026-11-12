package defpackage;

import com.huawei.haf.threadpool.ThreadPoolManager;
import com.huawei.health.manager.powerkit.PowerKitManager;
import com.huawei.hwlogsmodel.LogUtil;
import health.compact.a.EnvironmentInfo;

/* JADX INFO: loaded from: classes10.dex */
public class miv {
    public static void c(final long j, final String str) {
        LogUtil.a("PowerKitUtil", "applyPowerKit applyPowerKitTime ", Long.valueOf(j), " applyPowerOtaReason", str);
        ThreadPoolManager.c().execute(new Runnable() { // from class: miv.3
            @Override // java.lang.Runnable
            public void run() {
                PowerKitManager.a().d("ota_upgrade_file", 65535, j, str);
                if (EnvironmentInfo.l()) {
                    return;
                }
                PowerKitManager.a().d("ota_upgrade_file", 512, j, str);
            }
        });
    }

    public static void c(String str) {
        LogUtil.a("PowerKitUtil", "unApplyPowerKit applyPowerOtaReason", str);
        PowerKitManager.a().a("ota_upgrade_file", 65535, str);
        if (EnvironmentInfo.l()) {
            return;
        }
        PowerKitManager.a().a("ota_upgrade_file", 512, str);
    }
}
