package e3;

import g6.f;
import o4.d0;
import o4.t1;
import o4.u1;
import o4.v1;
import p13.j0;
import u4.d;
import u4.e;
import u4.m;

/* JADX INFO: loaded from: classes.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static d f62643a;

    public static final d a() {
        d dVar = f62643a;
        if (dVar != null) {
            return dVar;
        }
        f.a aVar = f.f75994b;
        d.a aVar2 = new d.a("Rounded.Check", 24.0f, 24.0f, 24.0f, 24.0f, 0L, 0, false, 96, null);
        j0 j0Var = m.f168519a;
        d0.f128823b.getClass();
        t1 t1Var = new t1(d0.f128824c, null);
        u1.f129010b.getClass();
        v1.f129019b.getClass();
        int i14 = v1.f129021d;
        e eVarM = com.nimbusds.jose.shaded.gson.internal.a.m(9.0f, 16.17f, 5.53f, 12.7f);
        eVarM.e(-0.39f, -0.39f, -1.02f, -0.39f, -1.41f, 0.0f);
        eVarM.e(-0.39f, 0.39f, -0.39f, 1.02f, 0.0f, 1.41f);
        eVarM.j(4.18f, 4.18f);
        eVarM.e(0.39f, 0.39f, 1.02f, 0.39f, 1.41f, 0.0f);
        eVarM.i(20.29f, 7.71f);
        eVarM.e(0.39f, -0.39f, 0.39f, -1.02f, 0.0f, -1.41f);
        eVarM.e(-0.39f, -0.39f, -1.02f, -0.39f, -1.41f, 0.0f);
        eVarM.i(9.0f, 16.17f);
        eVarM.c();
        d.a.b(aVar2, eVarM.f168407a, 0, t1Var, 1.0f, null, 1.0f, i14, 1.0f);
        d dVarC = aVar2.c();
        f62643a = dVarC;
        return dVarC;
    }
}
