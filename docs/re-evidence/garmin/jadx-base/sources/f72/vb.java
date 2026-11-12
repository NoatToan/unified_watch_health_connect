package f72;

/* JADX INFO: loaded from: classes9.dex */
public final class vb {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static u4.d f69848a;

    public static final u4.d a(t62.c cVar) {
        cVar.getClass();
        u4.d dVar = f69848a;
        if (dVar != null) {
            return dVar;
        }
        float f14 = (float) 24.0d;
        g6.f.a aVar = g6.f.f75994b;
        u4.d.a aVar2 = new u4.d.a("StrengthBarbell", f14, f14, 24.0f, 24.0f, 0L, 0, true, 96, null);
        o4.t1 t1Var = new o4.t1(o4.f0.d(4278190080L), null);
        o4.u1.f129010b.getClass();
        o4.v1.f129019b.getClass();
        u4.e eVarN = u62.z.n(o4.h1.f128863b, 20.9474f, 8.0f, 18.3158f, 11.2109f);
        r1.q2.x(eVarN, 5.6842f, 8.0f, 3.0526f, 9.5789f);
        r1.q2.x(eVarN, 2.0f, 14.8421f, 3.0526f, 16.4211f);
        r1.q2.x(eVarN, 5.6842f, 13.2109f, 18.3158f, 16.4211f);
        r1.q2.x(eVarN, 20.9474f, 14.8421f, 22.0f, 9.5789f);
        sn.a.v(eVarN, 20.9474f, 8.0f);
        u4.d.a.b(aVar2, eVarN.f168407a, 0, t1Var, 1.0f, null, 0.0f, 0, 4.0f);
        u4.d dVarC = aVar2.c();
        f69848a = dVarC;
        return dVarC;
    }
}
