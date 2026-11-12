package s1;

/* JADX INFO: loaded from: classes.dex */
public final class u2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final n4.d f155812a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final Object f155813b;

    static {
        Float fValueOf = Float.valueOf(1.0f);
        f155812a = new n4.d(1.0f, 1.0f, 1.0f, 1.0f);
        p005kotlin.jvm.internal.r rVar = p005kotlin.jvm.internal.r.f105809a;
        o13.p pVar = new o13.p(e2.f155569b, fValueOf);
        g6.m.a aVar = g6.m.f76012b;
        o13.p pVar2 = new o13.p(e2.f155575h, fValueOf);
        g6.k.a aVar2 = g6.k.f76003b;
        o13.p pVar3 = new o13.p(e2.f155574g, fValueOf);
        p005kotlin.jvm.internal.m mVar = p005kotlin.jvm.internal.m.f105803a;
        o13.p pVar4 = new o13.p(e2.f155568a, Float.valueOf(0.01f));
        o13.p pVar5 = new o13.p(e2.f155576i, fValueOf);
        n4.g.a aVar3 = n4.g.f123559b;
        o13.p pVar6 = new o13.p(e2.f155572e, fValueOf);
        n4.c.a aVar4 = n4.c.f123541b;
        o13.p pVar7 = new o13.p(e2.f155573f, fValueOf);
        g6.f.a aVar5 = g6.f.f75994b;
        d2 d2Var = e2.f155570c;
        Float fValueOf2 = Float.valueOf(0.4f);
        o13.p pVar8 = new o13.p(d2Var, fValueOf2);
        int i14 = g6.g.f75998b;
        f155813b = p13.u0.e(pVar, pVar2, pVar3, pVar4, pVar5, pVar6, pVar7, pVar8, new o13.p(e2.f155571d, fValueOf2));
    }

    public static final long a() {
        long j8 = 1;
        long j14 = (j8 & 4294967295L) | (j8 << 32);
        g6.k.a aVar = g6.k.f76003b;
        return j14;
    }

    public static final long b() {
        long jFloatToRawIntBits = (((long) Float.floatToRawIntBits(1.0f)) << 32) | (((long) Float.floatToRawIntBits(1.0f)) & 4294967295L);
        n4.c.a aVar = n4.c.f123541b;
        return jFloatToRawIntBits;
    }

    public static final long c() {
        long j8 = 1;
        long j14 = (j8 & 4294967295L) | (j8 << 32);
        g6.m.a aVar = g6.m.f76012b;
        return j14;
    }
}
