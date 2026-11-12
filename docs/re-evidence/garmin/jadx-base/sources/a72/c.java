package a72;

import b71.i;
import o4.f0;
import o4.h1;
import o4.t1;
import o4.u1;
import o4.v1;
import u62.z;
import v62.h6;

/* JADX INFO: loaded from: classes9.dex */
public final class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static u4.d f1810a;

    public static final u4.d a(h6 h6Var) {
        h6Var.getClass();
        u4.d dVar = f1810a;
        if (dVar != null) {
            return dVar;
        }
        float f14 = (float) 24.0d;
        g6.f.a aVar = g6.f.f75994b;
        u4.d.a aVar2 = new u4.d.a("MicOn", f14, f14, 24.0f, 24.0f, 0L, 0, true, 96, null);
        t1 t1Var = new t1(f0.d(4278190080L), null);
        u1.f129010b.getClass();
        v1.f129019b.getClass();
        u4.e eVarK = i.k(h1.f128863b, 9.2076f, 11.6459f);
        eVarK.d(9.2076f, 13.1666f, 10.4604f, 14.404f, 12.0f, 14.404f);
        eVarK.d(13.5396f, 14.404f, 14.7925f, 13.1666f, 14.7925f, 11.6459f);
        eVarK.o(4.7581f);
        eVarK.d(14.7925f, 3.2374f, 13.5396f, 2.0f, 12.0f, 2.0f);
        eVarK.d(10.4604f, 2.0f, 9.2076f, 3.2374f, 9.2076f, 4.7581f);
        eVarK.o(11.6459f);
        eVarK.c();
        u4.d.a.b(aVar2, eVarK.f168407a, 0, t1Var, 1.0f, null, 0.0f, 0, 4.0f);
        t1 t1Var2 = new t1(f0.d(4278190080L), null);
        u4.e eVarQ = z.q(16.3245f, 12.0634f, 9.9985f, 18.0f, 12.0634f);
        eVarQ.d(18.0f, 15.0451f, 15.7509f, 17.5199f, 12.8377f, 17.9225f);
        z.y(eVarQ, 20.0693f, 16.0453f, 22.0f, 7.9547f);
        z.o(eVarQ, 20.0693f, 11.1623f, 17.9225f);
        eVarQ.d(8.2491f, 17.5199f, 6.0f, 15.0526f, 6.0f, 12.0634f);
        z.o(eVarQ, 9.9985f, 7.6755f, 12.0634f);
        eVarQ.d(7.6755f, 14.4189f, 9.6151f, 16.3347f, 12.0f, 16.3347f);
        eVarQ.d(14.3849f, 16.3347f, 16.3245f, 14.4189f, 16.3245f, 12.0634f);
        eVarQ.c();
        u4.d.a.b(aVar2, eVarQ.f168407a, 0, t1Var2, 1.0f, null, 0.0f, 0, 4.0f);
        u4.d dVarC = aVar2.c();
        f1810a = dVarC;
        return dVarC;
    }
}
