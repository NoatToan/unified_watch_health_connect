package r1;

/* JADX INFO: loaded from: classes.dex */
public final class g0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final long f149086a;

    static {
        long j8 = Integer.MIN_VALUE;
        g6.m.a aVar = g6.m.f76012b;
        f149086a = (j8 & 4294967295L) | (j8 << 32);
    }

    public static h4.r a(h4.r rVar, s1.f0 f0Var, int i14) {
        if ((i14 & 1) != 0) {
            g6.m.a aVar = g6.m.f76012b;
            f0Var = s1.l.c(1, 0.0f, 400.0f, g6.m.a(s1.u2.c()));
        }
        h4.r rVarC = l4.k.c(rVar);
        h4.d.f81522a.getClass();
        return rVarC.then(new g2(f0Var, h4.d.a.f81524b, null));
    }
}
