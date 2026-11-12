package h72;

import f72.v1;
import o4.f0;
import o4.h1;
import o4.t1;
import o4.u1;
import v.e0;

/* JADX INFO: loaded from: classes9.dex */
public final class t {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static u4.d f82355a;

    public static final u4.d a(v1 v1Var) {
        v1Var.getClass();
        u4.d dVar = f82355a;
        if (dVar != null) {
            return dVar;
        }
        float f14 = (float) 24.0d;
        g6.f.a aVar = g6.f.f75994b;
        u4.d.a aVar2 = new u4.d.a("SingleView", f14, f14, 24.0f, 24.0f, 0L, 0, false, 96, null);
        t1 t1Var = new t1(f0.d(4278190080L), null);
        u1.f129010b.getClass();
        o4.v1.f129019b.getClass();
        h1.f128863b.getClass();
        int i14 = h1.f128864c;
        u4.e eVarL = u62.z.l(19.5f, 7.5f, 4.5f, 16.5f, 19.5f);
        eVarL.o(7.5f);
        eVarL.c();
        eVarL.k(3.0f, 6.0f);
        eVarL.o(18.0f);
        u62.z.r(eVarL, 21.0f, 6.0f, 3.0f);
        u4.d.a.b(aVar2, eVarL.f168407a, i14, t1Var, 1.0f, null, 0.0f, 0, 4.0f);
        t1 t1Var2 = new t1(f0.d(4278190080L), null);
        u4.e eVarS = e0.s(12.3853f, 14.1491f, 11.4962f, 10.7223f);
        eVarS.i(10.435f, 11.0514f);
        u62.z.p(eVarS, 10.3285f, 12.2899f, 9.6641f, 12.3853f);
        eVarS.o(14.1491f);
        eVarS.c();
        u4.d.a.b(aVar2, eVarS.f168407a, 0, t1Var2, 1.0f, null, 0.0f, 0, 4.0f);
        u4.d dVarC = aVar2.c();
        f82355a = dVarC;
        return dVarC;
    }
}
