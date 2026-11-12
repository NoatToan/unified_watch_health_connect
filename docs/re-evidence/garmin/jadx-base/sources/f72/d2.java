package f72;

/* JADX INFO: loaded from: classes9.dex */
public final class d2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static u4.d f69510a;

    public static final u4.d a(t62.c cVar) {
        cVar.getClass();
        u4.d dVar = f69510a;
        if (dVar != null) {
            return dVar;
        }
        float f14 = (float) 24.0d;
        g6.f.a aVar = g6.f.f75994b;
        u4.d.a aVar2 = new u4.d.a("HeartRate", f14, f14, 24.0f, 24.0f, 0L, 0, false, 96, null);
        o4.t1 t1Var = new o4.t1(o4.f0.d(4278190080L), null);
        o4.u1.f129010b.getClass();
        o4.v1.f129019b.getClass();
        o4.h1.f128863b.getClass();
        int i14 = o4.h1.f128864c;
        u4.e eVarL = com.nimbusds.jose.shaded.gson.internal.a.l(19.7f, 5.9f);
        eVarL.b(4.101f, 4.101f, -6.15f, false, false, 0.0f);
        eVarL.i(12.0f, 7.5f);
        eVarL.j(-1.5f, -1.6f);
        eVarL.b(4.1f, 4.1f, -6.2f, false, false, 0.0f);
        eVarL.b(4.75f, 4.75f, 0.0f, false, false, 6.5f);
        eVarL.j(7.7f, 7.1f);
        eVarL.j(7.7f, -7.1f);
        eVarL.b(4.75f, 4.75f, 0.0f, false, false, -6.5f);
        u4.d.a.b(aVar2, eVarL.f168407a, i14, t1Var, 1.0f, null, 0.0f, 0, 4.0f);
        u4.d dVarC = aVar2.c();
        f69510a = dVarC;
        return dVarC;
    }
}
