package rp;

import am.x0;
import b63.o;
import com.google.android.exoplayer2.source.ProgressiveMediaSource;
import e23.l;
import e23.p;
import gl1.y;
import lc.m0;
import lc.v0;
import o82.g;
import p005kotlin.Unit;
import p3.m;
import p3.n;
import p3.o0;
import p3.p2;
import p3.x1;

/* JADX INFO: loaded from: classes7.dex */
public final class d {
    /* JADX WARN: Code duplicated, block: B:52:0x00de  */
    public static final void a(e eVar, g gVar, o oVar, np.c cVar, e23.a<Unit> aVar, l<? super x0, Unit> lVar, p<? super Long, ? super x0, Unit> pVar, e23.a<Unit> aVar2, m mVar, int i14) {
        eVar.getClass();
        cVar.getClass();
        aVar.getClass();
        lVar.getClass();
        pVar.getClass();
        aVar2.getClass();
        o0 o0VarE = mVar.E(1521154801);
        int i15 = i14 | (o0VarE.k(gVar == null ? -1 : gVar.ordinal()) ? 32 : 16) | (o0VarE.r(oVar) ? 256 : 128) | (o0VarE.r(cVar) ? 2048 : 1024) | (o0VarE.r(aVar) ? 16384 : 8192) | (o0VarE.r(lVar) ? 131072 : 65536) | (o0VarE.r(pVar) ? ProgressiveMediaSource.DEFAULT_LOADING_CHECK_INTERVAL_BYTES : 524288) | (o0VarE.r(aVar2) ? 8388608 : 4194304);
        if (o0VarE.n(i15 & 1, (4793491 & i15) != 4793490)) {
            x1 x1Var = n.f135158a;
            m0 m0VarI = y.I(new v0[0], o0VarE);
            c cVar2 = new c(aVar, cVar, pVar, m0VarI, lVar);
            boolean zR = ((i15 & 112) == 32) | o0VarE.r(oVar) | o0VarE.r(cVar) | o0VarE.B(cVar2) | ((i15 & 29360128) == 8388608);
            Object objQ = o0VarE.q();
            if (zR) {
                jv0.c cVar3 = new jv0.c(gVar, oVar, cVar, cVar2, aVar2, 18);
                o0VarE.K(cVar3);
                objQ = cVar3;
            } else {
                m.f135153a.getClass();
                if (objQ == m.a.f135155b) {
                    jv0.c cVar4 = new jv0.c(gVar, oVar, cVar, cVar2, aVar2, 18);
                    o0VarE.K(cVar4);
                    objQ = cVar4;
                }
            }
            nc.y.a(m0VarI, eVar, null, null, null, null, null, null, null, (l) objQ, o0VarE, 48, 2044);
        } else {
            o0VarE.e();
        }
        p2 p2VarI0 = o0VarE.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new dd1.d(eVar, gVar, oVar, cVar, aVar, lVar, pVar, aVar2, i14, 20);
        }
    }
}
