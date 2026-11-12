package rr;

import c2.k3;
import com.google.android.exoplayer2.source.ProgressiveMediaSource;
import e23.l;
import h4.r;
import p3.m;
import p3.n;
import p3.o0;
import p3.p2;
import p3.x1;

/* JADX INFO: loaded from: classes7.dex */
public final class j {
    public static final void a(i53.f fVar, k kVar, boolean z14, l lVar, z3.e eVar, r rVar, k3 k3Var, m mVar, int i14) {
        fVar.getClass();
        kVar.getClass();
        lVar.getClass();
        o0 o0VarE = mVar.E(-1503492414);
        int i15 = i14 | (o0VarE.B(fVar) ? 4 : 2) | (o0VarE.k(kVar.ordinal()) ? 32 : 16) | (o0VarE.h(z14) ? 256 : 128) | (o0VarE.r(lVar) ? 2048 : 1024) | (o0VarE.B(rVar) ? 131072 : 65536) | (o0VarE.B(k3Var) ? ProgressiveMediaSource.DEFAULT_LOADING_CHECK_INTERVAL_BYTES : 524288);
        if (o0VarE.n(i15 & 1, (599187 & i15) != 599186)) {
            o0VarE.G0();
            if ((i14 & 1) != 0 && !o0VarE.o0()) {
                o0VarE.e();
            }
            o0VarE.h0();
            x1 x1Var = n.f135158a;
            z02.b.a(false, null, null, null, true, z3.f.c(1299995000, new i(k3Var, rVar, z14, kVar, fVar, lVar, eVar), o0VarE), o0VarE, 221184, 15);
        } else {
            o0VarE.e();
        }
        p2 p2VarI0 = o0VarE.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new i(fVar, kVar, z14, lVar, eVar, rVar, k3Var, i14);
        }
    }
}
