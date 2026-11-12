package defpackage;

import com.huawei.haf.application.BaseApplication;
import com.huawei.health.icommon.ISimpleResultCallback;
import health.compact.a.LogUtil;
import health.compact.a.LogicalStepCounter;
import health.compact.a.SharedPreferenceManager;

/* JADX INFO: loaded from: classes9.dex */
public class ipj {
    public static void e() {
        if (System.currentTimeMillis() - SharedPreferenceManager.d("fitness_step_module_id", "lastSyncStepTime", 0L) < 60000) {
            return;
        }
        LogUtil.b("StepSyncUtils", "syncStepToDB");
        SharedPreferenceManager.c("fitness_step_module_id", "lastSyncStepTime", System.currentTimeMillis());
        LogicalStepCounter.d(BaseApplication.b()).b((ISimpleResultCallback) null);
    }
}
