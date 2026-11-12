package v62;

/* JADX INFO: loaded from: classes9.dex */
public final class w8 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static u4.d f176073a;

    public static final u4.d a(t62.b bVar) {
        bVar.getClass();
        u4.d dVar = f176073a;
        if (dVar != null) {
            return dVar;
        }
        float f14 = (float) 24.0d;
        g6.f.a aVar = g6.f.f75994b;
        u4.d.a aVar2 = new u4.d.a("TimerSolid", f14, f14, 24.0f, 24.0f, 0L, 0, false, 96, null);
        o4.t1 t1Var = new o4.t1(o4.f0.d(4278190080L), null);
        o4.u1.f129010b.getClass();
        o4.v1.f129019b.getClass();
        o4.h1.f128863b.getClass();
        int i14 = o4.h1.f128864c;
        u4.e eVar = new u4.e();
        eVar.k(14.701f, 2.0f);
        eVar.i(9.3f, 2.0f);
        eVar.p(1.62f);
        eVar.h(5.4f);
        eVar.i(14.7f, 2.0f);
        eVar.c();
        eVar.k(20.427f, 11.346f);
        eVar.e(-1.08f, -4.646f, -5.726f, -7.51f, -10.426f, -6.429f);
        eVar.e(-4.646f, 1.135f, -7.509f, 5.78f, -6.428f, 10.427f);
        eVar.e(1.08f, 4.645f, 5.726f, 7.508f, 10.426f, 6.428f);
        eVar.e(4.646f, -1.08f, 7.509f, -5.726f, 6.428f, -10.426f);
        hb.a.r(eVar, 12.0f, 13.345f, 6.166f, 8.699f);
        eVar.d(8.489f, 5.673f, 11.676f, 5.782f, 12.0f, 5.782f);
        eVar.p(7.563f);
        eVar.c();
        u4.d.a.b(aVar2, eVar.f168407a, i14, t1Var, 1.0f, null, 0.0f, 0, 4.0f);
        u4.d dVarC = aVar2.c();
        f176073a = dVarC;
        return dVarC;
    }
}
