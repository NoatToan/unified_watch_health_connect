package f72;

/* JADX INFO: loaded from: classes9.dex */
public final class i6 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static u4.d f69609a;

    public static final u4.d a(t62.c cVar) {
        cVar.getClass();
        u4.d dVar = f69609a;
        if (dVar != null) {
            return dVar;
        }
        float f14 = (float) 24.0d;
        g6.f.a aVar = g6.f.f75994b;
        u4.d.a aVar2 = new u4.d.a("MapPoiGliderArea", f14, f14, 24.0f, 24.0f, 0L, 0, true, 96, null);
        o4.t1 t1Var = new o4.t1(o4.f0.d(4278190080L), null);
        o4.u1.f129010b.getClass();
        o4.v1.f129019b.getClass();
        u4.e eVarL = b71.i.l(o4.h1.f128863b, 16.625f, 8.5625f, 13.25f, 11.9375f);
        eVarL.i(18.25f, 11.0625f);
        eVarL.i(22.0f, 14.8125f);
        eVarL.i(2.0f, 16.5625f);
        com.nimbusds.jose.shaded.gson.internal.a.z(eVarL, 15.75f, 4.8125f, 16.625f, 8.5625f);
        u4.d.a.b(aVar2, eVarL.f168407a, 0, t1Var, 1.0f, null, 0.0f, 0, 4.0f);
        o4.t1 t1Var2 = new o4.t1(o4.f0.d(4278190080L), null);
        u4.e eVarM = com.nimbusds.jose.shaded.gson.internal.a.m(14.0f, 17.9375f, 14.375f, 16.4375f);
        eVarM.i(15.625f, 16.8125f);
        eVarM.i(15.0f, 19.1875f);
        eVarM.g(9.0f);
        eVarM.i(8.5f, 16.6875f);
        eVarM.i(9.75f, 16.4375f);
        tn.k.s(eVarM, 10.0f, 17.9375f, 14.0f);
        u4.d.a.b(aVar2, eVarM.f168407a, 0, t1Var2, 1.0f, null, 0.0f, 0, 4.0f);
        u4.d dVarC = aVar2.c();
        f69609a = dVarC;
        return dVarC;
    }
}
