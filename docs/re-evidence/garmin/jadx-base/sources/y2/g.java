package y2;

import o53.f0;

/* JADX INFO: loaded from: classes.dex */
public final class g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final long f194080a = f0.B(14);

    public static final long a(long j8, long j14) {
        if (!g6.q.e(j14)) {
            throw new IllegalArgumentException("The multiplier must be in em, but was " + ((Object) g6.q.f(j14)) + '.');
        }
        if (g6.q.e(j8)) {
            wr.g.x("Cannot convert Em to Px when style.fontSize is Em (", g6.q.f(j14), "). Please declare the style.fontSize with Sp units instead.");
            return 0L;
        }
        long j15 = j8 & 1095216660480L;
        if (j15 != 0) {
            float fD = g6.q.d(j14);
            f0.n(j8);
            return f0.H(g6.q.d(j8) * fD, j15);
        }
        float fD2 = g6.q.d(j14);
        long j16 = f194080a;
        f0.n(j16);
        return f0.H(g6.q.d(j16) * fD2, 1095216660480L & j16);
    }
}
