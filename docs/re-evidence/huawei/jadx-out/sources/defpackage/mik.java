package defpackage;

import health.compact.a.hwlogsmodel.ReleaseLogUtil;

/* JADX INFO: loaded from: classes10.dex */
public class mik {
    public static void b(String str, int i, int i2) {
        ReleaseLogUtil.d("R_" + str, "ServiceId = ", Integer.valueOf(i), ", CommandId = ", Integer.valueOf(i2));
    }

    public static void a(String str, Object... objArr) {
        ReleaseLogUtil.d("R_" + str, objArr);
    }
}
