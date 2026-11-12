package v62;

/* JADX INFO: loaded from: classes9.dex */
public final class z {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static u4.d f176097a;

    public static final u4.d a(t62.b bVar) {
        bVar.getClass();
        u4.d dVar = f176097a;
        if (dVar != null) {
            return dVar;
        }
        float f14 = (float) 24.0d;
        g6.f.a aVar = g6.f.f75994b;
        u4.d.a aVar2 = new u4.d.a("Battery50", f14, f14, 24.0f, 24.0f, 0L, 0, false, 96, null);
        o4.t1 t1Var = new o4.t1(o4.f0.d(4278190080L), null);
        o4.u1.f129010b.getClass();
        o4.v1.f129019b.getClass();
        o4.h1.f128863b.getClass();
        int i14 = o4.h1.f128864c;
        u4.e eVar = new u4.e();
        eVar.k(3.0f, 6.0f);
        eVar.h(15.5f);
        eVar.b(1.0f, 1.0f, 1.0f, false, true, 1.0f);
        eVar.p(9.5f);
        eVar.b(1.0f, 1.0f, -1.0f, false, true, 1.0f);
        eVar.i(3.0f, 17.5f);
        eVar.b(1.0f, 1.0f, -1.0f, false, true, -1.0f);
        eVar.i(2.0f, 7.0f);
        eVar.b(1.0f, 1.0f, 1.0f, false, true, -1.0f);
        eVar.c();
        eVar.k(17.854f, 15.854f);
        eVar.a(0.5f, 0.5f, 18.0f, false, false, 15.5f);
        eVar.i(18.0f, 8.0f);
        eVar.b(0.5f, 0.5f, -0.5f, false, false, -0.5f);
        eVar.i(11.0f, 7.5f);
        eVar.i(11.0f, 16.0f);
        eVar.h(6.5f);
        eVar.b(0.5f, 0.5f, 0.354f, false, false, -0.146f);
        eVar.c();
        u4.d.a.b(aVar2, eVar.f168407a, i14, t1Var, 1.0f, null, 0.0f, 0, 4.0f);
        o4.t1 t1Var2 = new o4.t1(o4.f0.d(4278190080L), null);
        u4.e eVar2 = new u4.e();
        eVar2.k(20.5f, 9.0f);
        eVar2.g(22.0f);
        eVar2.p(5.5f);
        eVar2.h(-1.5f);
        eVar2.o(9.0f);
        eVar2.c();
        u4.d.a.b(aVar2, eVar2.f168407a, 0, t1Var2, 1.0f, null, 0.0f, 0, 4.0f);
        u4.d dVarC = aVar2.c();
        f176097a = dVarC;
        return dVarC;
    }
}
