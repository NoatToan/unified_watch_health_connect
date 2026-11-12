package defpackage;

import health.compact.a.LogUtil;

/* JADX INFO: loaded from: classes4.dex */
public class cns {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static long f1872a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final long f1873b;
    private static long d;

    static {
        long j = cop.b() ? 256000L : 64000L;
        f1873b = j;
        d = j;
        f1872a = 0L;
    }

    public static long e() {
        if (coy.c() && !cop.g()) {
            long j = d;
            if (j == 4000 || j == 1200000) {
                d = 1200000L;
            } else {
                d = 4000L;
            }
        } else {
            long j2 = d;
            if (j2 == 0) {
                d = 4000L;
            } else {
                long j3 = f1873b;
                if (j2 < j3) {
                    d = j2 * 2;
                } else {
                    d = j3;
                }
            }
        }
        return d;
    }

    public static void c() {
        if (!cop.e() || !cop.f() || !coy.c() || cop.g()) {
            d = 0L;
        } else if (System.currentTimeMillis() > f1872a) {
            f1872a = System.currentTimeMillis() + 1800000;
            d = 0L;
            LogUtil.b("ScanTimeUtil", "resetScanDelay freezing and iconnect");
        }
    }
}
