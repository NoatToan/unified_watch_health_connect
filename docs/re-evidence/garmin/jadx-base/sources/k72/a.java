package k72;

import f72.fe;
import o4.h1;
import o4.t1;
import o4.u1;
import o4.v1;

/* JADX INFO: loaded from: classes9.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static u4.d f103289a;

    public static final u4.d a(fe feVar) {
        feVar.getClass();
        u4.d dVar = f103289a;
        if (dVar != null) {
            return dVar;
        }
        float f14 = (float) 24.0d;
        g6.f.a aVar = g6.f.f75994b;
        u4.d.a aVar2 = new u4.d.a("Altimeter", f14, f14, 24.0f, 24.0f, 0L, 0, true, 96, null);
        t1 t1Var = new t1(o4.f0.d(4278190080L), null);
        u1.f129010b.getClass();
        v1.f129019b.getClass();
        h1.f128863b.getClass();
        int i14 = h1.f128864c;
        u4.e eVarM = com.nimbusds.jose.shaded.gson.internal.a.m(16.7222f, 9.8611f, 14.2222f, 12.6389f);
        eVarM.i(9.1667f, 5.8611f);
        eVarM.i(2.0f, 18.1389f);
        tn.k.q(eVarM, 22.0f, 16.7222f, 9.8611f);
        u4.d.a.b(aVar2, eVarM.f168407a, i14, t1Var, 1.0f, null, 0.0f, 0, 4.0f);
        u4.d dVarC = aVar2.c();
        f103289a = dVarC;
        return dVarC;
    }
}
