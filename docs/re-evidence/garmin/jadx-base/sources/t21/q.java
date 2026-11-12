package t21;

import c2.n3;
import com.google.android.exoplayer2.source.ProgressiveMediaSource;
import i3.fe;
import kotlin.m3;
import kotlin.t1;
import p3.p2;
import p3.x1;

/* JADX INFO: loaded from: classes9.dex */
public final class q {
    public static final void a(u21.g gVar, v21.e eVar, e23.l lVar, e23.l lVar2, e23.l lVar3, e23.a aVar, e23.a aVar2, e23.a aVar3, e23.a aVar4, fe feVar, p3.m mVar, int i14) {
        p3.o0 o0Var;
        gVar.getClass();
        eVar.getClass();
        feVar.getClass();
        p3.o0 o0VarE = mVar.E(-1416231238);
        int i15 = i14 | (o0VarE.r(gVar) ? 4 : 2) | (o0VarE.r(eVar) ? 32 : 16) | (o0VarE.r(lVar) ? 256 : 128) | (o0VarE.r(lVar2) ? 2048 : 1024) | (o0VarE.r(lVar3) ? 16384 : 8192) | (o0VarE.r(aVar) ? 131072 : 65536) | (o0VarE.r(aVar2) ? ProgressiveMediaSource.DEFAULT_LOADING_CHECK_INTERVAL_BYTES : 524288) | (o0VarE.r(aVar3) ? 8388608 : 4194304) | (o0VarE.r(aVar4) ? 67108864 : 33554432);
        if (o0VarE.n(i15 & 1, (306783379 & i15) != 306783378)) {
            x1 x1Var = p3.n.f135158a;
            m4.q qVar = (m4.q) o0VarE.A(t1.f91491i);
            m3 m3Var = (m3) o0VarE.A(t1.f91499q);
            z3.e eVarC = z3.f.c(1380712661, new n(aVar3, qVar, m3Var, aVar4), o0VarE);
            z3.e eVarC2 = z3.f.c(-575434252, new p21.b(feVar, 12), o0VarE);
            c2.n0 n0Var = n3.f22788a;
            o0Var = o0VarE;
            z02.d.a(false, eVarC, eVarC2, null, new c2.n0(0, 0, 0, 0), z3.f.c(2146059601, new c42.d(gVar, lVar3, aVar, eVar, lVar, qVar, m3Var, lVar2, aVar2), o0VarE), o0Var, 197046, 8);
        } else {
            o0Var = o0VarE;
            o0Var.e();
        }
        p2 p2VarI0 = o0Var.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new a11.j(gVar, eVar, lVar, lVar2, lVar3, aVar, aVar2, aVar3, aVar4, feVar, i14);
        }
    }
}
