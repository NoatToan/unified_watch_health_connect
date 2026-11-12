package r1;

/* JADX INFO: loaded from: classes.dex */
public final class p2 {
    public static final s1.n0.a a(s1.n0 n0Var, long j8, long j14, s1.m0 m0Var, p3.m mVar, int i14, int i15) {
        p3.m mVar2;
        String str = (i15 & 8) != 0 ? "ColorAnimation" : "";
        p3.x1 x1Var = p3.n.f135158a;
        Object objQ = mVar.q();
        p3.m.f135153a.getClass();
        if (objQ == p3.m.a.f135155b) {
            o4.d0.a aVar = o4.d0.f128823b;
            objQ = (s1.c2) k0.f149133a.invoke(o4.d0.g(j14));
            mVar2 = mVar;
            mVar2.K(objQ);
        } else {
            mVar2 = mVar;
        }
        return s1.p0.b(n0Var, o4.d0.a(j8), o4.d0.a(j14), (s1.c2) objQ, m0Var, str, mVar2, (i14 & 112) | 32776 | ((i14 << 3) & 458752), 0);
    }
}
