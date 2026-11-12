package f72;

/* JADX INFO: loaded from: classes9.dex */
public final class q4 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static u4.d f69751a;

    public static final u4.d a(t62.c cVar) {
        cVar.getClass();
        u4.d dVar = f69751a;
        if (dVar != null) {
            return dVar;
        }
        float f14 = (float) 24.0d;
        g6.f.a aVar = g6.f.f75994b;
        u4.d.a aVar2 = new u4.d.a("MapPoiCapitalCity", f14, f14, 24.0f, 24.0f, 0L, 0, true, 96, null);
        o4.t1 t1Var = new o4.t1(o4.f0.d(4278190080L), null);
        o4.u1.f129010b.getClass();
        o4.v1.f129019b.getClass();
        o4.h1.f128863b.getClass();
        u4.e eVar = new u4.e();
        eVar.k(12.0f, 12.0f);
        eVar.l(-10.0f, 0.0f);
        eVar.b(10.0f, 10.0f, 20.0f, true, true, 0.0f);
        eVar.b(10.0f, 10.0f, -20.0f, true, true, 0.0f);
        u4.d.a.b(aVar2, eVar.f168407a, 0, t1Var, 1.0f, null, 0.0f, 0, 4.0f);
        u4.d dVarC = aVar2.c();
        f69751a = dVarC;
        return dVarC;
    }
}
