package f72;

/* JADX INFO: loaded from: classes9.dex */
public final class h5 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static u4.d f69589a;

    public static final u4.d a(t62.c cVar) {
        cVar.getClass();
        u4.d dVar = f69589a;
        if (dVar != null) {
            return dVar;
        }
        float f14 = (float) 24.0d;
        g6.f.a aVar = g6.f.f75994b;
        u4.d.a aVar2 = new u4.d.a("MapPoiDangerArea", f14, f14, 24.0f, 24.0f, 0L, 0, true, 96, null);
        o4.t1 t1Var = new o4.t1(o4.f0.d(4278190080L), null);
        o4.u1.f129010b.getClass();
        o4.v1.f129019b.getClass();
        u4.e eVarN = u62.z.n(o4.h1.f128863b, 22.0f, 22.0f, 2.0f, 2.0f);
        u62.z.u(eVarN, 22.0f, 22.0f, 19.5f, 4.5f);
        v.e0.x(eVarN, 4.5f, 19.5f, 19.5f, 4.5f);
        u4.d.a.b(aVar2, eVarN.f168407a, 0, t1Var, 1.0f, null, 0.0f, 0, 4.0f);
        o4.t1 t1Var2 = new o4.t1(o4.f0.d(4278190080L), null);
        int i14 = o4.h1.f128864c;
        u4.e eVarM = com.nimbusds.jose.shaded.gson.internal.a.m(5.0704f, 12.0f, 12.1415f, 4.9289f);
        eVarM.i(19.1949f, 11.9823f);
        com.nimbusds.jose.shaded.gson.internal.a.z(eVarM, 12.1238f, 19.0534f, 5.0704f, 12.0f);
        eVarM.k(7.7221f, 12.0f);
        eVarM.i(12.1238f, 16.4017f);
        eVarM.i(16.5432f, 11.9823f);
        com.nimbusds.jose.shaded.gson.internal.a.z(eVarM, 12.1415f, 7.5806f, 7.7221f, 12.0f);
        u4.d.a.b(aVar2, eVarM.f168407a, i14, t1Var2, 1.0f, null, 0.0f, 0, 4.0f);
        u4.d dVarC = aVar2.c();
        f69589a = dVarC;
        return dVarC;
    }
}
