package j72;

import f72.t9;
import o4.f0;
import o4.h1;
import o4.t1;
import o4.u1;
import o4.v1;
import u62.z;

/* JADX INFO: loaded from: classes9.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static u4.d f97684a;

    public static final u4.d a(t9 t9Var) {
        t9Var.getClass();
        u4.d dVar = f97684a;
        if (dVar != null) {
            return dVar;
        }
        float f14 = (float) 24.0d;
        g6.f.a aVar = g6.f.f75994b;
        u4.d.a aVar2 = new u4.d.a("Pause", f14, f14, 24.0f, 24.0f, 0L, 0, false, 96, null);
        t1 t1Var = new t1(f0.d(4278190080L), null);
        u1.f129010b.getClass();
        v1.f129019b.getClass();
        u4.e eVarN = z.n(h1.f128863b, 9.0588f, 2.0f, 3.7647f, 22.0f);
        sn.a.v(eVarN, 9.0588f, 2.0f);
        u4.d.a.b(aVar2, eVarN.f168407a, 0, t1Var, 1.0f, null, 0.0f, 0, 4.0f);
        t1 t1Var2 = new t1(f0.d(4278190080L), null);
        u4.e eVarL = z.l(20.2353f, 2.0f, 14.9412f, 22.0f, 20.2353f);
        eVarL.o(2.0f);
        eVarL.c();
        u4.d.a.b(aVar2, eVarL.f168407a, 0, t1Var2, 1.0f, null, 0.0f, 0, 4.0f);
        u4.d dVarC = aVar2.c();
        f97684a = dVarC;
        return dVarC;
    }
}
