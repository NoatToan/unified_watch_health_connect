package i72;

/* JADX INFO: loaded from: classes9.dex */
public final class j1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static u4.d f92093a;

    public static final u4.d a(f72.c3 c3Var) {
        c3Var.getClass();
        u4.d dVar = f92093a;
        if (dVar != null) {
            return dVar;
        }
        float f14 = (float) 24.0d;
        g6.f.a aVar = g6.f.f75994b;
        u4.d.a aVar2 = new u4.d.a("PoiDive2", f14, f14, 24.0f, 24.0f, 0L, 0, true, 96, null);
        o4.t1 t1Var = new o4.t1(o4.f0.d(4284886417L), null);
        o4.u1.f129010b.getClass();
        o4.v1.f129019b.getClass();
        u4.e eVarM = u62.z.m(o4.h1.f128863b, 2.0f, 2.0f, 22.0f);
        eVarM.i(14.5f, 12.0f);
        c22.t.k(eVarM, 22.0f, 22.0f, 2.0f, 2.0f);
        u4.d.a.b(aVar2, eVarM.f168407a, 0, t1Var, 1.0f, null, 0.0f, 0, 4.0f);
        o4.t1 t1Var2 = new o4.t1(o4.f0.d(4294967295L), null);
        u4.e eVarL = u62.z.l(12.0f, 3.25f, 3.25f, 20.75f, 12.0f);
        eVarL.o(3.25f);
        eVarL.c();
        u4.d.a.b(aVar2, eVarL.f168407a, 0, t1Var2, 1.0f, null, 0.0f, 0, 4.0f);
        u4.d dVarC = aVar2.c();
        f92093a = dVarC;
        return dVarC;
    }
}
