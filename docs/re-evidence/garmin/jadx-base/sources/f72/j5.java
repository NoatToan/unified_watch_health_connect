package f72;

/* JADX INFO: loaded from: classes9.dex */
public final class j5 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static u4.d f69626a;

    public static final u4.d a(t62.c cVar) {
        cVar.getClass();
        u4.d dVar = f69626a;
        if (dVar != null) {
            return dVar;
        }
        float f14 = (float) 24.0d;
        g6.f.a aVar = g6.f.f75994b;
        u4.d.a aVar2 = new u4.d.a("MapPoiDive1", f14, f14, 24.0f, 24.0f, 0L, 0, false, 96, null);
        o4.t1 t1Var = new o4.t1(o4.f0.d(4294901760L), null);
        o4.u1.f129010b.getClass();
        o4.v1.f129019b.getClass();
        u4.e eVarN = u62.z.n(o4.h1.f128863b, 22.0f, 2.0f, 2.0f, 22.0f);
        sn.a.v(eVarN, 22.0f, 2.0f);
        u4.d.a.b(aVar2, eVarN.f168407a, 0, t1Var, 1.0f, null, 0.0f, 0, 4.0f);
        o4.t1 t1Var2 = new o4.t1(o4.f0.d(4294967295L), null);
        u4.e eVarS = v.e0.s(7.625f, 3.25f, 3.25f, 7.625f);
        sn.a.A(eVarS, 16.375f, 20.75f, 20.75f, 16.375f);
        eVarS.i(7.625f, 3.25f);
        eVarS.c();
        u4.d.a.b(aVar2, eVarS.f168407a, 0, t1Var2, 1.0f, null, 0.0f, 0, 4.0f);
        u4.d dVarC = aVar2.c();
        f69626a = dVarC;
        return dVarC;
    }
}
