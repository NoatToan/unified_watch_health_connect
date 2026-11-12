package k72;

import f72.fe;
import o4.h1;
import o4.t1;
import o4.u1;
import o4.v1;

/* JADX INFO: loaded from: classes9.dex */
public final class k {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static u4.d f103305a;

    public static final u4.d a(fe feVar) {
        feVar.getClass();
        u4.d dVar = f103305a;
        if (dVar != null) {
            return dVar;
        }
        float f14 = (float) 24.0d;
        g6.f.a aVar = g6.f.f75994b;
        u4.d.a aVar2 = new u4.d.a("GradeAscent", f14, f14, 24.0f, 24.0f, 0L, 0, true, 96, null);
        t1 t1Var = new t1(o4.f0.d(4278190080L), null);
        u1.f129010b.getClass();
        v1.f129019b.getClass();
        u4.e eVarL = b71.i.l(h1.f128863b, 21.9999f, 5.0052f, 3.82f, 22.0f);
        sn.a.v(eVarL, 21.9999f, 5.0052f);
        u4.d.a.b(aVar2, eVarL.f168407a, 0, t1Var, 1.0f, null, 0.0f, 0, 4.0f);
        t1 t1Var2 = new t1(o4.f0.d(4278190080L), null);
        u4.e eVarM = com.nimbusds.jose.shaded.gson.internal.a.m(13.145f, 9.8956f, 15.5391f, 2.0f);
        eVarM.i(7.3739f, 3.6247f);
        eVarM.i(9.6182f, 6.0634f);
        eVarM.i(1.9999f, 13.2681f);
        eVarM.i(3.2823f, 14.6616f);
        com.nimbusds.jose.shaded.gson.internal.a.z(eVarM, 10.9007f, 7.457f, 13.145f, 9.8956f);
        u4.d.a.b(aVar2, eVarM.f168407a, 0, t1Var2, 1.0f, null, 0.0f, 0, 4.0f);
        u4.d dVarC = aVar2.c();
        f103305a = dVarC;
        return dVarC;
    }
}
