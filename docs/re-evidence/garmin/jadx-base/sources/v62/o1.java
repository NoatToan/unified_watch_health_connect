package v62;

/* JADX INFO: loaded from: classes9.dex */
public final class o1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static u4.d f175978a;

    public static final u4.d a(t62.b bVar) {
        bVar.getClass();
        u4.d dVar = f175978a;
        if (dVar != null) {
            return dVar;
        }
        float f14 = (float) 24.0d;
        g6.f.a aVar = g6.f.f75994b;
        u4.d.a aVar2 = new u4.d.a("CloseX", f14, f14, 24.0f, 24.0f, 0L, 0, true, 96, null);
        p005kotlin.jvm.internal.j jVar = null;
        o4.t1 t1Var = new o4.t1(o4.f0.d(4278190080L), jVar);
        o4.u1.f129010b.getClass();
        o4.v1.f129019b.getClass();
        o4.h1.f128863b.getClass();
        int i14 = o4.h1.f128864c;
        u4.e eVarJ = v.e0.j(19.293f, 20.707f, -16.0f, -16.0f);
        eVarJ.j(1.414f, -1.414f);
        com.nimbusds.jose.shaded.gson.internal.a.C(eVarJ, 16.0f, 16.0f, -1.414f, 1.414f);
        u4.d.a.b(aVar2, eVarJ.f168407a, i14, t1Var, 1.0f, null, 0.0f, 0, 4.0f);
        o4.t1 t1Var2 = new o4.t1(o4.f0.d(4278190080L), jVar);
        u4.e eVarJ2 = v.e0.j(4.707f, 20.707f, 16.0f, -16.0f);
        eVarJ2.j(-1.414f, -1.414f);
        com.nimbusds.jose.shaded.gson.internal.a.C(eVarJ2, -16.0f, 16.0f, 1.414f, 1.414f);
        u4.d.a.b(aVar2, eVarJ2.f168407a, i14, t1Var2, 1.0f, null, 0.0f, 0, 4.0f);
        u4.d dVarC = aVar2.c();
        f175978a = dVarC;
        return dVarC;
    }
}
