package defpackage;

import com.huawei.hwbasemgr.IBaseResponseCallback;
import com.huawei.hwlogsmodel.LogUtil;

/* JADX INFO: loaded from: classes20.dex */
public class wzw {
    private ioi e = ioi.d();

    public boolean e(int i) {
        boolean zEquals = "true".equals(this.e.c(i));
        LogUtil.a("HealthKitManager", "isLinked:", Boolean.valueOf(zEquals));
        return zEquals;
    }

    public void b(int i, IBaseResponseCallback iBaseResponseCallback, boolean z) {
        LogUtil.a("HealthKitManager", "setLinked privacyId = ", Integer.valueOf(i), ", isLinked = ", Boolean.valueOf(z));
        this.e.e(i, z, String.valueOf(i), iBaseResponseCallback);
    }
}
