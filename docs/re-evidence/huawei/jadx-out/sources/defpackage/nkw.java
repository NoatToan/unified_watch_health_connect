package defpackage;

import health.compact.a.UnitUtil;

/* JADX INFO: loaded from: classes11.dex */
public class nkw {
    public static double e(int i, boolean z, int i2, double d) {
        if (i == 274) {
            return UnitUtil.f() ? UnitUtil.c(d, 2) / 5.0d : d;
        }
        return d(z, i2, d);
    }

    public static double d(boolean z, int i, double d) {
        if (!UnitUtil.f()) {
            return d;
        }
        if (z && i == 3) {
            return UnitUtil.c(d, 3);
        }
        if (i == 3) {
            return UnitUtil.e(d, 3);
        }
        return -1.0d;
    }
}
