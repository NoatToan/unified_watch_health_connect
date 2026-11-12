package ds;

import c2.h2;
import com.google.android.exoplayer2.source.ProgressiveMediaSource;
import p3.l0;
import p3.o0;
import p3.p2;
import p3.x1;

/* JADX INFO: loaded from: classes7.dex */
public final class j0 {
    /* JADX WARN: Code duplicated, block: B:53:0x00c3  */
    public static final void a(h4.r rVar, i53.c cVar, e23.p pVar, float f14, e23.l lVar, h2.j0 j0Var, int i14, p3.m mVar, int i15) {
        o0 o0Var;
        rVar.getClass();
        cVar.getClass();
        o0 o0VarE = mVar.E(-1306542259);
        int i16 = i15 | (o0VarE.B(rVar) ? 4 : 2) | (o0VarE.r(cVar) ? 32 : 16) | (o0VarE.i(f14) ? 2048 : 1024) | (o0VarE.r(lVar) ? 16384 : 8192) | (o0VarE.B(j0Var) ? 131072 : 65536) | (o0VarE.k(i14) ? ProgressiveMediaSource.DEFAULT_LOADING_CHECK_INTERVAL_BYTES : 524288);
        if (o0VarE.n(i16 & 1, (599187 & i16) != 599186)) {
            o0VarE.G0();
            if ((i15 & 1) != 0 && !o0VarE.o0()) {
                o0VarE.e();
            }
            o0VarE.h0();
            x1 x1Var = p3.n.f135158a;
            int size = cVar.size();
            boolean z14 = ((((i16 & 458752) ^ 196608) > 131072 && o0VarE.B(j0Var)) || (i16 & 196608) == 131072) | ((i16 & 57344) == 16384);
            Object objQ = o0VarE.q();
            if (z14) {
                objQ = new h0(j0Var, lVar, null);
                o0VarE.K(objQ);
            } else {
                p3.m.f135153a.getClass();
                if (objQ == p3.m.a.f135155b) {
                    objQ = new h0(j0Var, lVar, null);
                    o0VarE.K(objQ);
                }
            }
            l0.e((e23.p) objQ, j0Var, o0VarE);
            o0Var = o0VarE;
            h2.u.a(j0Var, rVar, (h2) pVar.invoke(Integer.valueOf(size), Integer.valueOf(j0Var.l())), null, i14, f14, null, null, false, null, null, null, null, z3.f.c(-1790400242, new ao1.f(8, j0Var, cVar), o0VarE), o0Var, ((i16 << 3) & 112) | ((i16 >> 15) & 14) | ((i16 >> 6) & 57344) | ((i16 << 6) & 458752), 24576, 16328);
        } else {
            o0Var = o0VarE;
            o0Var.e();
        }
        p2 p2VarI0 = o0Var.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new c02.g(rVar, cVar, pVar, f14, lVar, j0Var, i14, i15);
        }
    }
}
