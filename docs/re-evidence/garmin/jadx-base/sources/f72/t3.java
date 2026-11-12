package f72;

/* JADX INFO: loaded from: classes9.dex */
public final class t3 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static u4.d f69804a;

    public static final u4.d a(t62.c cVar) {
        cVar.getClass();
        u4.d dVar = f69804a;
        if (dVar != null) {
            return dVar;
        }
        float f14 = (float) 24.0d;
        g6.f.a aVar = g6.f.f75994b;
        u4.d.a aVar2 = new u4.d.a("MapPoiBar", f14, f14, 24.0f, 24.0f, 0L, 0, true, 96, null);
        o4.t1 t1Var = new o4.t1(o4.f0.d(4278190080L), null);
        o4.u1.f129010b.getClass();
        o4.v1.f129019b.getClass();
        u4.e eVarL = b71.i.l(o4.h1.f128863b, 2.0f, 4.25f, 10.875f, 14.25f);
        u62.z.y(eVarL, 19.75f, 5.375f, 22.0f, 18.625f);
        u62.z.o(eVarL, 19.75f, 13.125f, 14.25f);
        tn.k.r(eVarL, 22.0f, 4.25f, 2.0f, 2.0f);
        b71.i.z(eVarL, 4.25f, 19.0f, 4.25f);
        eVarL.i(17.125f, 6.5f);
        u62.z.k(eVarL, 6.875f, 5.0f, 4.25f, 19.0f);
        u4.d.a.b(aVar2, eVarL.f168407a, 0, t1Var, 1.0f, null, 0.0f, 0, 4.0f);
        u4.d dVarC = aVar2.c();
        f69804a = dVarC;
        return dVarC;
    }
}
