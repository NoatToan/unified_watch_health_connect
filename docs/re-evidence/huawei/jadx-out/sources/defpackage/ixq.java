package defpackage;

import com.huawei.haf.application.BaseApplication;
import com.huawei.hwlogsmodel.LogUtil;

/* JADX INFO: loaded from: classes10.dex */
public class ixq {
    private static boolean d = false;

    public static void d(boolean z) {
        LogUtil.a("Track_SportWakeLockUtil", "set is sporting: ", Boolean.valueOf(z));
        if (z && b()) {
            if (d) {
                ixw.c(BaseApplication.b());
                return;
            }
            return;
        }
        ixw.b();
    }

    public static void a(boolean z) {
        LogUtil.a("Track_SportWakeLockUtil", "set is screenOff: ", Boolean.valueOf(z));
        d = z;
        if (z && b()) {
            if (iwy.a(BaseApplication.b()).bc()) {
                ixw.c(BaseApplication.b());
                return;
            }
            return;
        }
        ixw.b();
    }

    public static boolean b() {
        return iwy.a(BaseApplication.b()).k() == 264;
    }
}
