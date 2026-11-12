package f72;

/* JADX INFO: loaded from: classes9.dex */
public final class d5 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static u4.d f69513a;

    public static final u4.d a(t62.c cVar) {
        cVar.getClass();
        u4.d dVar = f69513a;
        if (dVar != null) {
            return dVar;
        }
        float f14 = (float) 24.0d;
        g6.f.a aVar = g6.f.f75994b;
        u4.d.a aVar2 = new u4.d.a("MapPoiControlledArea", f14, f14, 24.0f, 24.0f, 0L, 0, true, 96, null);
        o4.t1 t1Var = new o4.t1(o4.f0.d(4278190080L), null);
        o4.u1.f129010b.getClass();
        o4.v1.f129019b.getClass();
        o4.h1.f128863b.getClass();
        int i14 = o4.h1.f128864c;
        u4.e eVarL = com.nimbusds.jose.shaded.gson.internal.a.l(17.625f, 12.0f);
        eVarL.d(17.625f, 15.1066f, 15.1066f, 17.625f, 12.0f, 17.625f);
        eVarL.d(8.8934f, 17.625f, 6.375f, 15.1066f, 6.375f, 12.0f);
        eVarL.d(6.375f, 8.8934f, 8.8934f, 6.375f, 12.0f, 6.375f);
        eVarL.d(15.1066f, 6.375f, 17.625f, 8.8934f, 17.625f, 12.0f);
        eVarL.c();
        eVarL.k(12.0f, 15.75f);
        eVarL.d(14.0711f, 15.75f, 15.75f, 14.0711f, 15.75f, 12.0f);
        eVarL.d(15.75f, 9.9289f, 14.0711f, 8.25f, 12.0f, 8.25f);
        eVarL.d(9.9289f, 8.25f, 8.25f, 9.9289f, 8.25f, 12.0f);
        eVarL.d(8.25f, 14.0711f, 9.9289f, 15.75f, 12.0f, 15.75f);
        eVarL.c();
        u4.d.a.b(aVar2, eVarL.f168407a, i14, t1Var, 1.0f, null, 0.0f, 0, 4.0f);
        o4.t1 t1Var2 = new o4.t1(o4.f0.d(4278190080L), null);
        u4.e eVarQ = u62.z.q(2.0f, 2.0f, 22.0f, 22.0f, 2.0f);
        v.e0.A(eVarQ, 2.0f, 4.5f, 4.5f, 19.5f);
        u62.z.v(eVarQ, 19.5f, 4.5f, 4.5f);
        u4.d.a.b(aVar2, eVarQ.f168407a, i14, t1Var2, 1.0f, null, 0.0f, 0, 4.0f);
        u4.d dVarC = aVar2.c();
        f69513a = dVarC;
        return dVarC;
    }
}
