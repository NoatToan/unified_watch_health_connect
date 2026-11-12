package defpackage;

import com.huawei.hwlogsmodel.LogUtil;
import health.compact.a.Utils;

/* JADX INFO: loaded from: classes10.dex */
public class loj {
    public static boolean c(int i) {
        boolean z = true;
        if (Utils.o() ? lol.f40559b.get(Integer.valueOf(i)).intValue() != 1 : lom.e.get(Integer.valueOf(i)).intValue() != 1) {
            z = false;
        }
        LogUtil.a("VersionConfig", "isFeatureSupport(): featureId is ", Integer.valueOf(i), ",isSupport is ", Boolean.valueOf(z));
        return z;
    }
}
