package g02;

import com.google.android.exoplayer2.source.ProgressiveMediaSource;
import p3.p2;

/* JADX INFO: loaded from: classes10.dex */
public final class r0 {
    public static final void a(String str, String str2, float f14, e23.p pVar, e23.p pVar2, e23.a aVar, p3.m mVar, int i14) {
        e23.p pVar3;
        e23.p pVar4;
        p3.o0 o0VarE = mVar.E(309588677);
        int i15 = i14 | (o0VarE.B(str) ? 4 : 2) | (o0VarE.B(str2) ? 32 : 16) | (o0VarE.i(f14) ? 256 : 128) | 224256;
        int i16 = 1;
        if (o0VarE.n(i15 & 1, (599187 & i15) != 599186)) {
            m mVar2 = m.f74478a;
            mVar2.getClass();
            z3.e eVar = m.f74481d;
            mVar2.getClass();
            z3.e eVar2 = m.f74482e;
            p3.x1 x1Var = p3.n.f135158a;
            b(str, str2, z3.f.c(2072147400, new fx0.g(f14, eVar, eVar2, i16), o0VarE), aVar, o0VarE, (i15 & 112) | (i15 & 14) | 384 | 27648);
            pVar3 = eVar;
            pVar4 = eVar2;
        } else {
            o0VarE.e();
            pVar3 = pVar;
            pVar4 = pVar2;
        }
        p2 p2VarI0 = o0VarE.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new o0(str, str2, f14, pVar3, pVar4, aVar, i14);
        }
    }

    public static final void b(String str, String str2, z3.e eVar, e23.a aVar, p3.m mVar, int i14) {
        int i15;
        p3.o0 o0Var;
        p3.o0 o0VarE = mVar.E(1361396660);
        if ((i14 & 6) == 0) {
            i15 = (o0VarE.B(str) ? 4 : 2) | i14;
        } else {
            i15 = i14;
        }
        if ((i14 & 48) == 0) {
            i15 |= o0VarE.B(str2) ? 32 : 16;
        }
        if ((i14 & 384) == 0) {
            i15 |= o0VarE.r(eVar) ? 256 : 128;
        }
        if ((i14 & 3072) == 0) {
            i15 |= o0VarE.h(false) ? 2048 : 1024;
        }
        if ((i14 & 24576) == 0) {
            i15 |= o0VarE.r(aVar) ? 16384 : 8192;
        }
        if (o0VarE.n(i15 & 1, (i15 & 9363) != 9362)) {
            p3.x1 x1Var = p3.n.f135158a;
            int i16 = i15 << 12;
            o0Var = o0VarE;
            g82.c.f76436a.b(null, null, z3.f.c(-1491118630, new p0(eVar, str, str2), o0VarE), null, null, null, null, false, aVar, o0Var, (29360128 & i16) | 384 | (i16 & 234881024), 123);
        } else {
            o0Var = o0VarE;
            o0Var.e();
        }
        p2 p2VarI0 = o0Var.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new q0(str, str2, eVar, aVar, i14, 0);
        }
    }

    public static final void c(String str, String str2, boolean z14, e23.p pVar, e23.p pVar2, e23.a aVar, p3.m mVar, int i14, int i15) {
        e23.p pVar3;
        e23.a aVar2;
        e23.p pVar4;
        p3.o0 o0VarK = com.nimbusds.jose.shaded.gson.internal.a.k(str, str2, mVar, -733794183);
        int i16 = (o0VarK.B(str) ? 4 : 2) | i14 | (o0VarK.B(str2) ? 32 : 16);
        if ((i14 & 384) == 0) {
            i16 |= o0VarK.h(z14) ? 256 : 128;
        }
        int i17 = 224256 | i16;
        int i18 = i15 & 64;
        if (i18 != 0) {
            i17 = 1797120 | i16;
        } else if ((1572864 & i14) == 0) {
            i17 |= o0VarK.r(aVar) ? ProgressiveMediaSource.DEFAULT_LOADING_CHECK_INTERVAL_BYTES : 524288;
        }
        if (o0VarK.n(i17 & 1, (599187 & i17) != 599186)) {
            m mVar2 = m.f74478a;
            mVar2.getClass();
            z3.e eVar = m.f74479b;
            mVar2.getClass();
            z3.e eVar2 = m.f74480c;
            e23.a aVar3 = i18 != 0 ? null : aVar;
            p3.x1 x1Var = p3.n.f135158a;
            b(str, str2, z3.f.c(868023996, new am.i1(z14, eVar, eVar2, 15), o0VarK), aVar3, o0VarK, (i17 & 14) | 384 | (i17 & 112) | 3072 | ((i17 >> 6) & 57344));
            aVar2 = aVar3;
            pVar3 = eVar;
            pVar4 = eVar2;
        } else {
            o0VarK.e();
            pVar3 = pVar;
            aVar2 = aVar;
            pVar4 = pVar2;
        }
        p2 p2VarI0 = o0VarK.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new d62.o(str, str2, z14, pVar3, pVar4, aVar2, i14, i15);
        }
    }
}
