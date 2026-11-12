package f72;

/* JADX INFO: loaded from: classes9.dex */
public final class u4 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static u4.d f69823a;

    public static final u4.d a(t62.c cVar) {
        cVar.getClass();
        u4.d dVar = f69823a;
        if (dVar != null) {
            return dVar;
        }
        float f14 = (float) 24.0d;
        g6.f.a aVar = g6.f.f75994b;
        u4.d.a aVar2 = new u4.d.a("MapPoiCemetery", f14, f14, 24.0f, 24.0f, 0L, 0, true, 96, null);
        o4.t1 t1Var = new o4.t1(o4.f0.d(4278190080L), null);
        o4.u1.f129010b.getClass();
        o4.v1.f129019b.getClass();
        u4.e eVarK = b71.i.k(o4.h1.f128863b, 12.0f, 2.0f);
        eVarK.d(8.5f, 2.0f, 5.75f, 4.375f, 5.75f, 7.375f);
        u62.z.o(eVarK, 18.25f, 18.25f, 7.375f);
        eVarK.d(18.25f, 4.375f, 15.5f, 2.0f, 12.0f, 2.0f);
        u62.z.w(eVarK, 15.75f, 12.0f, 8.25f, 10.75f);
        u62.z.u(eVarK, 15.75f, 12.0f, 15.75f, 9.5f);
        v.e0.x(eVarK, 8.25f, 8.25f, 15.75f, 9.5f);
        u4.d.a.b(aVar2, eVarK.f168407a, 0, t1Var, 1.0f, null, 0.0f, 0, 4.0f);
        o4.t1 t1Var2 = new o4.t1(o4.f0.d(4278190080L), null);
        u4.e eVarQ = u62.z.q(2.875f, 19.5f, 22.0f, 21.125f, 19.5f);
        eVarQ.g(2.875f);
        eVarQ.c();
        u4.d.a.b(aVar2, eVarQ.f168407a, 0, t1Var2, 1.0f, null, 0.0f, 0, 4.0f);
        u4.d dVarC = aVar2.c();
        f69823a = dVarC;
        return dVarC;
    }
}
