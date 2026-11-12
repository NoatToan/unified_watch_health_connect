package f72;

/* JADX INFO: loaded from: classes9.dex */
public final class j1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static u4.d f69622a;

    public static final u4.d a(t62.c cVar) {
        cVar.getClass();
        u4.d dVar = f69622a;
        if (dVar != null) {
            return dVar;
        }
        float f14 = (float) 24.0d;
        g6.f.a aVar = g6.f.f75994b;
        u4.d.a aVar2 = new u4.d.a("GearBoat", f14, f14, 24.0f, 24.0f, 0L, 0, false, 96, null);
        o4.t1 t1Var = new o4.t1(o4.f0.d(4278190080L), null);
        o4.u1.f129010b.getClass();
        o4.v1.f129019b.getClass();
        o4.h1.f128863b.getClass();
        int i14 = o4.h1.f128864c;
        u4.e eVarK = tn.k.k(13.7647f, 7.2778f, 16.5294f, 10.7735f, 10.8348f);
        eVarK.d(18.5389f, 10.5741f, 19.9794f, 10.5125f, 22.0f, 10.6508f);
        eVarK.d(21.2056f, 12.585f, 20.1989f, 15.0298f, 19.0f, 16.7223f);
        eVarK.g(2.0f);
        eVarK.i(4.2353f, 12.6747f);
        eVarK.i(9.5294f, 11.8161f);
        eVarK.i(8.4706f, 8.4431f);
        u62.z.k(eVarK, 7.2941f, 6.7059f, 7.2778f, 13.7647f);
        eVarK.k(13.1765f, 8.4431f);
        eVarK.g(9.6471f);
        eVarK.i(10.5294f, 11.5708f);
        com.nimbusds.jose.shaded.gson.internal.a.z(eVarK, 15.0f, 11.0188f, 13.1765f, 8.4431f);
        u4.d.a.b(aVar2, eVarK.f168407a, i14, t1Var, 1.0f, null, 0.0f, 0, 4.0f);
        u4.d dVarC = aVar2.c();
        f69622a = dVarC;
        return dVarC;
    }
}
