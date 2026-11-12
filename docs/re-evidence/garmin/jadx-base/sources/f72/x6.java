package f72;

/* JADX INFO: loaded from: classes9.dex */
public final class x6 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static u4.d f69879a;

    public static final u4.d a(t62.c cVar) {
        cVar.getClass();
        u4.d dVar = f69879a;
        if (dVar != null) {
            return dVar;
        }
        float f14 = (float) 24.0d;
        g6.f.a aVar = g6.f.f75994b;
        u4.d.a aVar2 = new u4.d.a("MapPoiManOverboard", f14, f14, 24.0f, 24.0f, 0L, 0, true, 96, null);
        o4.t1 t1Var = new o4.t1(o4.f0.d(4294901760L), null);
        o4.u1.f129010b.getClass();
        o4.v1.f129019b.getClass();
        u4.e eVarN = u62.z.n(o4.h1.f128863b, 2.0f, 2.0f, 22.0f, 22.0f);
        sn.a.v(eVarN, 2.0f, 2.0f);
        u4.d.a.b(aVar2, eVarN.f168407a, 0, t1Var, 1.0f, null, 0.0f, 0, 4.0f);
        o4.t1 t1Var2 = new o4.t1(o4.f0.d(4294967040L), null);
        u4.e eVarJ = sn.a.j(2.0f, 2.0f, 22.0f, 22.0f, 2.0f);
        eVarJ.o(2.0f);
        eVarJ.c();
        u4.d.a.b(aVar2, eVarJ.f168407a, 0, t1Var2, 1.0f, null, 0.0f, 0, 4.0f);
        o4.t1 t1Var3 = new o4.t1(o4.f0.d(4278190080L), null);
        int i14 = o4.h1.f128864c;
        u4.e eVarL = u62.z.l(20.75f, 3.25f, 3.25f, 20.75f, 20.75f);
        eVarL.o(3.25f);
        eVarL.c();
        eVarL.k(2.0f, 2.0f);
        eVarL.o(22.0f);
        u62.z.r(eVarL, 22.0f, 2.0f, 2.0f);
        u4.d.a.b(aVar2, eVarL.f168407a, i14, t1Var3, 0.35f, null, 0.0f, 0, 4.0f);
        u4.d dVarC = aVar2.c();
        f69879a = dVarC;
        return dVarC;
    }
}
