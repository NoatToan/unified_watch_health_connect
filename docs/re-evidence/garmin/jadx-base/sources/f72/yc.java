package f72;

/* JADX INFO: loaded from: classes9.dex */
public final class yc {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static u4.d f69903a;

    public static final u4.d a(t62.c cVar) {
        cVar.getClass();
        u4.d dVar = f69903a;
        if (dVar != null) {
            return dVar;
        }
        float f14 = (float) 24.0d;
        g6.f.a aVar = g6.f.f75994b;
        u4.d.a aVar2 = new u4.d.a("Stress", f14, f14, 24.0f, 24.0f, 0L, 0, false, 96, null);
        o4.t1 t1Var = new o4.t1(o4.f0.d(4278190080L), null);
        o4.u1.f129010b.getClass();
        o4.v1.f129019b.getClass();
        o4.h1.f128863b.getClass();
        int i14 = o4.h1.f128864c;
        u4.e eVarL = com.nimbusds.jose.shaded.gson.internal.a.l(9.778f, 4.674f);
        eVarL.b(4.0f, 4.0f, 4.444f, true, true, 6.652f);
        eVarL.b(4.0f, 4.0f, -4.444f, false, true, -6.652f);
        eVarL.c();
        eVarL.k(12.0f, 8.5f);
        eVarL.p(3.0f);
        sn.a.A(eVarL, 14.5f, 7.0f, 12.0f, 4.5f);
        eVarL.j(-2.5f, 4.0f);
        eVarL.g(12.0f);
        eVarL.c();
        u4.d.a.b(aVar2, eVarL.f168407a, i14, t1Var, 1.0f, null, 0.0f, 0, 4.0f);
        o4.t1 t1Var2 = new o4.t1(o4.f0.d(4278190080L), null);
        u4.e eVarL2 = com.nimbusds.jose.shaded.gson.internal.a.l(16.905f, 14.345f);
        eVarL2.e(0.202f, 0.15f, 0.372f, 0.338f, 0.5f, 0.555f);
        eVarL2.e(0.095f, 0.22f, 1.635f, 4.6f, 1.635f, 4.6f);
        eVarL2.g(5.0f);
        eVarL2.n(1.455f, -4.38f, 1.54f, -4.605f);
        eVarL2.e(0.128f, -0.216f, 0.298f, -0.405f, 0.5f, -0.555f);
        eVarL2.e(0.23f, -0.18f, 1.295f, -0.955f, 1.46f, -1.06f);
        eVarL2.e(0.27f, -0.157f, 0.57f, -0.252f, 0.88f, -0.28f);
        eVarL2.h(5.2f);
        eVarL2.e(0.306f, 0.031f, 0.6f, 0.129f, 0.865f, 0.285f);
        eVarL2.e(0.165f, 0.105f, 1.23f, 0.88f, 1.46f, 1.06f);
        eVarL2.c();
        u4.d.a.b(aVar2, eVarL2.f168407a, 0, t1Var2, 1.0f, null, 0.0f, 0, 4.0f);
        u4.d dVarC = aVar2.c();
        f69903a = dVarC;
        return dVarC;
    }
}
