package v62;

/* JADX INFO: loaded from: classes9.dex */
public final class o7 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static u4.d f175984a;

    public static final u4.d a(t62.b bVar) {
        bVar.getClass();
        u4.d dVar = f175984a;
        if (dVar != null) {
            return dVar;
        }
        float f14 = (float) 24.0d;
        g6.f.a aVar = g6.f.f75994b;
        u4.d.a aVar2 = new u4.d.a("Search", f14, f14, 24.0f, 24.0f, 0L, 0, false, 96, null);
        o4.t1 t1Var = new o4.t1(o4.f0.d(4278190080L), null);
        o4.u1.f129010b.getClass();
        o4.v1.f129019b.getClass();
        o4.h1.f128863b.getClass();
        int i14 = o4.h1.f128864c;
        u4.e eVarL = com.nimbusds.jose.shaded.gson.internal.a.l(10.5f, 5.0f);
        eVarL.b(5.5f, 5.5f, 0.0f, true, false, 11.0f);
        eVarL.b(5.5f, 5.5f, 0.0f, false, false, -11.0f);
        eVarL.c();
        eVarL.k(3.0f, 10.5f);
        eVarL.b(7.5f, 7.5f, 15.0f, true, true, 0.0f);
        eVarL.b(7.5f, 7.5f, -15.0f, false, true, 0.0f);
        eVarL.c();
        u4.d.a.b(aVar2, eVarL.f168407a, i14, t1Var, 1.0f, null, 0.0f, 0, 4.0f);
        o4.t1 t1Var2 = new o4.t1(o4.f0.d(4278190080L), null);
        u4.e eVarJ = v.e0.j(20.793f, 21.707f, -6.5f, -6.5f);
        eVarJ.j(1.414f, -1.414f);
        com.nimbusds.jose.shaded.gson.internal.a.C(eVarJ, 6.5f, 6.5f, -1.414f, 1.414f);
        u4.d.a.b(aVar2, eVarJ.f168407a, i14, t1Var2, 1.0f, null, 0.0f, 0, 4.0f);
        u4.d dVarC = aVar2.c();
        f175984a = dVarC;
        return dVarC;
    }
}
