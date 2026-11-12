package l72;

import p005kotlin.Unit;

/* JADX INFO: loaded from: classes9.dex */
public final class f3 {
    public static final void a(String str, u4.d dVar, String str2, b92.a aVar, e23.a<Unit> aVar2, p3.m mVar, int i14, int i15) {
        int i16;
        u4.d dVar2;
        int i17;
        b92.a aVar3;
        int i18;
        e23.a<Unit> aVar4;
        int i19;
        u4.d dVar3;
        b92.a aVar5;
        e23.a<Unit> aVar6;
        p3.o0 o0VarK = com.nimbusds.jose.shaded.gson.internal.a.k(str, str2, mVar, -853121308);
        if ((i14 & 6) == 0) {
            i16 = (o0VarK.B(str) ? 4 : 2) | i14;
        } else {
            i16 = i14;
        }
        int i24 = i15 & 2;
        if (i24 != 0) {
            i17 = i16 | 48;
            dVar2 = dVar;
        } else {
            dVar2 = dVar;
            i17 = i16 | (o0VarK.B(dVar2) ? 32 : 16);
        }
        if ((i14 & 384) == 0) {
            i17 |= o0VarK.B(str2) ? 256 : 128;
        }
        int i25 = i15 & 8;
        if (i25 != 0) {
            i18 = i17 | 3072;
            aVar3 = aVar;
        } else {
            aVar3 = aVar;
            i18 = i17 | (o0VarK.B(aVar3) ? 2048 : 1024);
        }
        int i26 = i15 & 16;
        if (i26 != 0) {
            i19 = i18 | 24576;
            aVar4 = aVar2;
        } else {
            aVar4 = aVar2;
            i19 = i18 | (o0VarK.r(aVar4) ? 16384 : 8192);
        }
        if (o0VarK.n(i19 & 1, (i19 & 9363) != 9362)) {
            if (i24 != 0) {
                dVar2 = null;
            }
            b92.a aVar7 = i25 != 0 ? null : aVar3;
            aVar6 = i26 != 0 ? null : aVar4;
            p3.x1 x1Var = p3.n.f135158a;
            h4.r rVarE = u1.n.e(c2.x2.f(h4.r.S, 1.0f), am.j.c(d92.b.f58623a, o0VarK), o4.m1.f128891a);
            c2.j.f22691a.getClass();
            c2.t0.a(rVarE, c2.j.f22698h, null, null, 0, 0, z3.f.c(226819849, new ku1.l(aVar7, str, str2, dVar2, aVar6), o0VarK), o0VarK, 1572912, 60);
            dVar3 = dVar2;
            aVar5 = aVar7;
        } else {
            o0VarK.e();
            dVar3 = dVar2;
            aVar5 = aVar3;
            aVar6 = aVar4;
        }
        p3.p2 p2VarI0 = o0VarK.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new a42.a0(str, dVar3, str2, aVar5, aVar6, i14, i15, 21);
        }
    }
}
