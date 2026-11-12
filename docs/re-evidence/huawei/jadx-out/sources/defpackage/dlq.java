package defpackage;

import android.os.Build;
import com.huawei.health.connectivity.thirdband.StepCounterStrategy;
import health.compact.a.hwlogsmodel.ReleaseLogUtil;

/* JADX INFO: loaded from: classes2.dex */
public class dlq {
    public static StepCounterStrategy a() {
        String lowerCase = Build.MANUFACTURER.toLowerCase();
        lowerCase.hashCode();
        if (!lowerCase.equals("xiaomi")) {
            return null;
        }
        ReleaseLogUtil.d("Step_StepCounterFactory", "createStrategy xiaomi");
        return new dls();
    }
}
