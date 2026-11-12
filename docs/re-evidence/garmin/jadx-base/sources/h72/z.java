package h72;

import f72.v1;
import o4.f0;
import o4.h1;
import o4.t1;
import o4.u1;

/* JADX INFO: loaded from: classes9.dex */
public final class z {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static u4.d f82361a;

    public static final u4.d a(v1 v1Var) {
        v1Var.getClass();
        u4.d dVar = f82361a;
        if (dVar != null) {
            return dVar;
        }
        float f14 = (float) 24.0d;
        g6.f.a aVar = g6.f.f75994b;
        u4.d.a aVar2 = new u4.d.a("Trajectory", f14, f14, 24.0f, 24.0f, 0L, 0, true, 96, null);
        t1 t1Var = new t1(f0.d(4278190080L), null);
        u1.f129010b.getClass();
        o4.v1.f129019b.getClass();
        u4.e eVarK = b71.i.k(h1.f128863b, 9.5039f, 15.0702f);
        eVarK.d(9.8967f, 13.8609f, 10.4259f, 12.494f, 11.0446f, 11.2102f);
        eVarK.d(11.7974f, 9.6485f, 12.6519f, 8.2749f, 13.5117f, 7.4413f);
        eVarK.d(13.94f, 7.0261f, 14.3256f, 6.7883f, 14.656f, 6.6956f);
        eVarK.d(14.9581f, 6.6107f, 15.2448f, 6.6362f, 15.5565f, 6.8206f);
        eVarK.d(15.8941f, 7.0203f, 16.2989f, 7.4312f, 16.7321f, 8.1951f);
        eVarK.d(16.9958f, 8.66f, 17.2603f, 9.2387f, 17.5214f, 9.9473f);
        eVarK.d(17.9412f, 9.6859f, 18.4295f, 9.524f, 18.9531f, 9.4946f);
        eVarK.d(18.6619f, 8.6955f, 18.3564f, 8.0186f, 18.0369f, 7.4551f);
        eVarK.d(17.5324f, 6.5656f, 16.9664f, 5.9118f, 16.3202f, 5.5295f);
        eVarK.d(15.648f, 5.132f, 14.9379f, 5.0584f, 14.2505f, 5.2514f);
        eVarK.d(13.5912f, 5.4365f, 12.9944f, 5.8537f, 12.4676f, 6.3644f);
        eVarK.d(11.4171f, 7.3829f, 10.4708f, 8.946f, 9.6934f, 10.559f);
        eVarK.d(8.9624f, 12.0756f, 8.3535f, 13.694f, 7.9308f, 15.0702f);
        eVarK.g(9.5039f);
        eVarK.c();
        u4.d.a.b(aVar2, eVarK.f168407a, 0, t1Var, 1.0f, null, 0.0f, 0, 4.0f);
        t1 t1Var2 = new t1(f0.d(4278190080L), null);
        u4.e eVarM = com.nimbusds.jose.shaded.gson.internal.a.m(19.9578f, 17.318f, 19.3196f, 15.5657f);
        eVarM.d(19.8425f, 15.5329f, 20.3295f, 15.368f, 20.7478f, 15.1039f);
        eVarM.i(22.1006f, 18.818f);
        tn.k.u(eVarM, 2.1006f, 6.5785f, 8.197f, 9.4194f);
        eVarM.d(9.2318f, 8.527f, 9.0541f, 8.861f, 8.8867f, 9.1931f);
        eVarM.d(8.8027f, 9.3596f, 8.7203f, 9.5278f, 8.6396f, 9.697f);
        u62.z.k(eVarM, 7.5739f, 4.3609f, 17.318f, 19.9578f);
        u4.d.a.b(aVar2, eVarM.f168407a, 0, t1Var2, 1.0f, null, 0.0f, 0, 4.0f);
        t1 t1Var3 = new t1(f0.d(4278190080L), null);
        u4.e eVarL = com.nimbusds.jose.shaded.gson.internal.a.l(19.1263f, 14.3717f);
        eVarL.d(18.1095f, 14.3717f, 17.2853f, 13.5475f, 17.2853f, 12.5307f);
        eVarL.d(17.2853f, 11.5139f, 18.1095f, 10.6897f, 19.1263f, 10.6897f);
        eVarL.d(20.143f, 10.6897f, 20.9673f, 11.5139f, 20.9673f, 12.5307f);
        eVarL.d(20.9673f, 13.5475f, 20.143f, 14.3717f, 19.1263f, 14.3717f);
        eVarL.c();
        u4.d.a.b(aVar2, eVarL.f168407a, 0, t1Var3, 1.0f, null, 0.0f, 0, 4.0f);
        u4.d dVarC = aVar2.c();
        f82361a = dVarC;
        return dVarC;
    }
}
