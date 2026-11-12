package f72;

/* JADX INFO: loaded from: classes9.dex */
public final class a3 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static u4.d f69454a;

    public static final u4.d a(t62.c cVar) {
        cVar.getClass();
        u4.d dVar = f69454a;
        if (dVar != null) {
            return dVar;
        }
        float f14 = (float) 24.0d;
        g6.f.a aVar = g6.f.f75994b;
        u4.d.a aVar2 = new u4.d.a("LiveTrack", f14, f14, 24.0f, 24.0f, 0L, 0, true, 96, null);
        o4.t1 t1Var = new o4.t1(o4.f0.d(4278190080L), null);
        o4.u1.f129010b.getClass();
        o4.v1.f129019b.getClass();
        o4.h1.f128863b.getClass();
        u4.e eVar = new u4.e();
        eVar.k(12.0f, 12.0f);
        eVar.p(-2.0f);
        eVar.b(2.0f, 2.0f, -1.715f, true, true, 0.97f);
        eVar.i(12.0f, 12.0f);
        eVar.c();
        u4.d.a.b(aVar2, eVar.f168407a, 0, t1Var, 1.0f, null, 0.0f, 0, 4.0f);
        o4.t1 t1Var2 = new o4.t1(o4.f0.d(4278190080L), null);
        int i14 = o4.h1.f128864c;
        u4.e eVarL = com.nimbusds.jose.shaded.gson.internal.a.l(22.0f, 12.075f);
        eVarL.m(17.5f, 6.04f, 12.0f, 6.0f);
        eVarL.e(-5.5f, 0.04f, -10.0f, 6.075f, -10.0f, 6.075f);
        eVarL.d(4.729f, 15.35f, 8.132f, 18.0f, 12.537f, 18.0f);
        eVarL.e(3.859f, -0.15f, 7.124f, -3.118f, 9.463f, -5.925f);
        eVarL.c();
        eVarL.k(12.0f, 16.0f);
        eVarL.b(4.0f, 4.0f, 0.0f, false, true, -8.0f);
        eVarL.b(4.0f, 4.0f, 0.0f, false, true, 8.0f);
        eVarL.c();
        u4.d.a.b(aVar2, eVarL.f168407a, i14, t1Var2, 1.0f, null, 0.0f, 0, 4.0f);
        u4.d dVarC = aVar2.c();
        f69454a = dVarC;
        return dVarC;
    }
}
