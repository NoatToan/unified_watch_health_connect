package d3;

import o4.d0;
import o4.t1;
import o4.u1;
import o4.v1;
import p13.j0;

/* JADX INFO: loaded from: classes.dex */
public final class i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static u4.d f57312a;

    public static final u4.d a() {
        u4.d dVar = f57312a;
        if (dVar != null) {
            return dVar;
        }
        g6.f.a aVar = g6.f.f75994b;
        u4.d.a aVar2 = new u4.d.a("Filled.Edit", 24.0f, 24.0f, 24.0f, 24.0f, 0L, 0, false, 96, null);
        j0 j0Var = u4.m.f168519a;
        d0.f128823b.getClass();
        t1 t1Var = new t1(d0.f128824c, null);
        u1.f129010b.getClass();
        v1.f129019b.getClass();
        int i14 = v1.f129021d;
        u4.e eVar = new u4.e();
        eVar.k(3.0f, 17.25f);
        eVar.o(21.0f);
        eVar.h(3.75f);
        eVar.i(17.81f, 9.94f);
        com.nimbusds.jose.shaded.gson.internal.a.B(eVar, -3.75f, -3.75f, 3.0f, 17.25f);
        eVar.k(20.71f, 7.04f);
        eVar.e(0.39f, -0.39f, 0.39f, -1.02f, 0.0f, -1.41f);
        eVar.j(-2.34f, -2.34f);
        eVar.e(-0.39f, -0.39f, -1.02f, -0.39f, -1.41f, 0.0f);
        eVar.j(-1.83f, 1.83f);
        com.nimbusds.jose.shaded.gson.internal.a.C(eVar, 3.75f, 3.75f, 1.83f, -1.83f);
        u4.d.a.b(aVar2, eVar.f168407a, 0, t1Var, 1.0f, null, 1.0f, i14, 1.0f);
        u4.d dVarC = aVar2.c();
        f57312a = dVarC;
        return dVarC;
    }
}
