package f72;

/* JADX INFO: loaded from: classes9.dex */
public final class o8 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static u4.d f69719a;

    public static final u4.d a(t62.c cVar) {
        cVar.getClass();
        u4.d dVar = f69719a;
        if (dVar != null) {
            return dVar;
        }
        float f14 = (float) 24.0d;
        g6.f.a aVar = g6.f.f75994b;
        u4.d.a aVar2 = new u4.d.a("MapPoiSummit", f14, f14, 24.0f, 24.0f, 0L, 0, true, 96, null);
        o4.t1 t1Var = new o4.t1(o4.f0.d(4278190080L), null);
        o4.u1.f129010b.getClass();
        o4.v1.f129019b.getClass();
        u4.e eVarM = u62.z.m(o4.h1.f128863b, 2.0f, 18.0f, 22.0f);
        eVarM.i(16.75f, 10.0f);
        eVarM.i(14.25f, 13.0f);
        com.nimbusds.jose.shaded.gson.internal.a.z(eVarM, 9.125f, 6.0f, 2.0f, 18.0f);
        u4.d.a.b(aVar2, eVarM.f168407a, 0, t1Var, 1.0f, null, 0.0f, 0, 4.0f);
        u4.d dVarC = aVar2.c();
        f69719a = dVarC;
        return dVarC;
    }
}
