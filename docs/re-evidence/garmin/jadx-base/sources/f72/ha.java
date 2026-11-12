package f72;

/* JADX INFO: loaded from: classes9.dex */
public final class ha {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static u4.d f69594a;

    public static final u4.d a(t62.c cVar) {
        cVar.getClass();
        u4.d dVar = f69594a;
        if (dVar != null) {
            return dVar;
        }
        float f14 = (float) 24.0d;
        g6.f.a aVar = g6.f.f75994b;
        u4.d.a aVar2 = new u4.d.a("Pacepro", f14, f14, 24.0f, 24.0f, 0L, 0, false, 96, null);
        o4.t1 t1Var = new o4.t1(o4.f0.d(4278190080L), null);
        o4.u1.f129010b.getClass();
        o4.v1.f129019b.getClass();
        u4.e eVarE = u62.z.e(o4.h1.f128863b, 9.1783f, 2.0f, 7.1547f);
        eVarE.i(14.3225f, 12.0003f);
        eVarE.i(9.1783f, 16.8459f);
        eVarE.o(22.0f);
        com.nimbusds.jose.shaded.gson.internal.a.z(eVarE, 19.7942f, 12.0003f, 9.1783f, 2.0f);
        u4.d.a.b(aVar2, eVarE.f168407a, 0, t1Var, 1.0f, null, 0.0f, 0, 4.0f);
        o4.t1 t1Var2 = new o4.t1(o4.f0.d(4278190080L), null);
        u4.e eVarK = r1.q2.k(4.5f, 6.409f, 17.5903f, 10.4351f, 11.9997f);
        eVarK.i(4.5f, 6.409f);
        eVarK.c();
        u4.d.a.b(aVar2, eVarK.f168407a, 0, t1Var2, 1.0f, null, 0.0f, 0, 4.0f);
        u4.d dVarC = aVar2.c();
        f69594a = dVarC;
        return dVarC;
    }
}
