package f72;

/* JADX INFO: loaded from: classes9.dex */
public final class ta {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static u4.d f69811a;

    public static final u4.d a(t62.c cVar) {
        cVar.getClass();
        u4.d dVar = f69811a;
        if (dVar != null) {
            return dVar;
        }
        float f14 = (float) 24.0d;
        g6.f.a aVar = g6.f.f75994b;
        u4.d.a aVar2 = new u4.d.a("RunningDynamicsBalanceLeft", f14, f14, 24.0f, 24.0f, 0L, 0, false, 96, null);
        o4.t1 t1Var = new o4.t1(o4.f0.d(4278190080L), null);
        o4.u1.f129010b.getClass();
        o4.v1.f129019b.getClass();
        u4.e eVarL = b71.i.l(o4.h1.f128863b, 12.0f, 3.8001f, 3.0f, 11.8f);
        eVarL.i(12.0f, 19.8f);
        eVarL.i(12.0f, 13.5778f);
        eVarL.i(21.0f, 13.5778f);
        eVarL.i(21.0f, 10.0223f);
        com.nimbusds.jose.shaded.gson.internal.a.z(eVarL, 12.0f, 10.0223f, 12.0f, 3.8001f);
        u4.d.a.b(aVar2, eVarL.f168407a, 0, t1Var, 1.0f, null, 0.0f, 0, 4.0f);
        u4.d dVarC = aVar2.c();
        f69811a = dVarC;
        return dVarC;
    }
}
