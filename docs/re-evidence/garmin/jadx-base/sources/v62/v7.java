package v62;

/* JADX INFO: loaded from: classes9.dex */
public final class v7 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static u4.d f176061a;

    public static final u4.d a(t62.b bVar) {
        bVar.getClass();
        u4.d dVar = f176061a;
        if (dVar != null) {
            return dVar;
        }
        float f14 = (float) 24.0d;
        g6.f.a aVar = g6.f.f75994b;
        u4.d.a aVar2 = new u4.d.a("SensorPower", f14, f14, 24.0f, 24.0f, 0L, 0, true, 96, null);
        o4.t1 t1Var = new o4.t1(o4.f0.d(4278190080L), null);
        o4.u1.f129010b.getClass();
        o4.v1.f129019b.getClass();
        u4.e eVarL = b71.i.l(o4.h1.f128863b, 14.05f, 2.0f, 6.3f, 14.0f);
        eVarL.g(11.2f);
        eVarL.i(9.9501f, 22.0f);
        eVarL.i(17.7f, 10.5f);
        tn.k.q(eVarL, 12.8f, 14.05f, 2.0f);
        u4.d.a.b(aVar2, eVarL.f168407a, 0, t1Var, 1.0f, null, 0.0f, 0, 4.0f);
        u4.d dVarC = aVar2.c();
        f176061a = dVarC;
        return dVarC;
    }
}
