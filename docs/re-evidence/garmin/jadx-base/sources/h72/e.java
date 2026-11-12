package h72;

import f72.v1;
import o4.f0;
import o4.h1;
import o4.t1;
import o4.u1;

/* JADX INFO: loaded from: classes9.dex */
public final class e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static u4.d f82340a;

    public static final u4.d a(v1 v1Var) {
        v1Var.getClass();
        u4.d dVar = f82340a;
        if (dVar != null) {
            return dVar;
        }
        float f14 = (float) 24.0d;
        g6.f.a aVar = g6.f.f75994b;
        u4.d.a aVar2 = new u4.d.a("GolfPin", f14, f14, 24.0f, 24.0f, 0L, 0, true, 96, null);
        t1 t1Var = new t1(f0.d(4278190080L), null);
        u1.f129010b.getClass();
        o4.v1.f129019b.getClass();
        u4.e eVarK = b71.i.k(h1.f128863b, 6.9996f, 2.4804f);
        eVarK.d(6.9893f, 2.2144f, 6.7684f, 2.0f, 6.5f, 2.0f);
        eVarK.d(6.225f, 2.0f, 6.0f, 2.225f, 6.0f, 2.5f);
        eVarK.o(20.0315f);
        eVarK.d(5.1374f, 20.1425f, 4.5f, 20.534f, 4.5f, 21.0f);
        eVarK.d(4.5f, 21.5523f, 5.3954f, 22.0f, 6.5f, 22.0f);
        eVarK.d(7.6046f, 22.0f, 8.5f, 21.5523f, 8.5f, 21.0f);
        eVarK.d(8.5f, 20.534f, 7.8626f, 20.1425f, 7.0f, 20.0315f);
        eVarK.o(12.4006f);
        eVarK.d(7.3986f, 12.3662f, 7.9672f, 12.3468f, 8.4448f, 12.4438f);
        eVarK.d(8.5065f, 12.9477f, 8.7048f, 14.4118f, 8.9333f, 14.4885f);
        eVarK.d(8.9531f, 14.6333f, 9.0561f, 14.7896f, 9.305f, 14.975f);
        eVarK.d(10.305f, 15.725f, 15.675f, 18.24f, 15.675f, 18.24f);
        eVarK.d(15.675f, 18.24f, 16.35f, 14.575f, 19.5f, 8.355f);
        eVarK.d(19.5f, 8.355f, 15.8805f, 7.5309f, 6.9996f, 2.4804f);
        eVarK.c();
        u4.d.a.b(aVar2, eVarK.f168407a, 0, t1Var, 1.0f, null, 0.0f, 0, 4.0f);
        u4.d dVarC = aVar2.c();
        f82340a = dVarC;
        return dVarC;
    }
}
