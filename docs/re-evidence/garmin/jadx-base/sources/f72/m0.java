package f72;

/* JADX INFO: loaded from: classes9.dex */
public final class m0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static u4.d f69675a;

    public static final u4.d a(t62.c cVar) {
        cVar.getClass();
        u4.d dVar = f69675a;
        if (dVar != null) {
            return dVar;
        }
        float f14 = (float) 24.0d;
        g6.f.a aVar = g6.f.f75994b;
        u4.d.a aVar2 = new u4.d.a("Elevation", f14, f14, 24.0f, 24.0f, 0L, 0, true, 96, null);
        o4.t1 t1Var = new o4.t1(o4.f0.d(4278190080L), null);
        o4.u1.f129010b.getClass();
        o4.v1.f129019b.getClass();
        u4.e eVarN = u62.z.n(o4.h1.f128863b, 3.8508f, 16.9204f, 21.5f, 18.2721f);
        eVarN.g(3.1754f);
        eVarN.d(2.8024f, 18.2721f, 2.5002f, 17.9697f, 2.5f, 17.5967f);
        u62.z.v(eVarN, 6.0838f, 3.8508f, 16.9204f);
        u4.d.a.b(aVar2, eVarN.f168407a, 0, t1Var, 1.0f, null, 0.0f, 0, 4.0f);
        o4.t1 t1Var2 = new o4.t1(o4.f0.d(4278190080L), null);
        u4.e eVarM = com.nimbusds.jose.shaded.gson.internal.a.m(10.6763f, 5.728f, 13.6941f, 10.6445f);
        eVarM.i(15.7772f, 8.0549f);
        eVarM.i(20.735f, 15.1182f);
        tn.k.q(eVarM, 5.0741f, 10.6763f, 5.728f);
        u4.d.a.b(aVar2, eVarM.f168407a, 0, t1Var2, 1.0f, null, 0.0f, 0, 4.0f);
        u4.d dVarC = aVar2.c();
        f69675a = dVarC;
        return dVarC;
    }
}
