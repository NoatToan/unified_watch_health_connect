package ht1;

import o4.m1;
import p3.o0;
import p3.p2;
import p3.x1;

/* JADX INFO: loaded from: classes10.dex */
public final class k {
    /* JADX WARN: Code duplicated, block: B:43:0x0094  */
    public static final void a(pt1.g gVar, boolean z14, e23.a aVar, e23.l lVar, p3.m mVar, int i14) {
        o0 o0VarO = androidx.room.a0.o(aVar, lVar, mVar, 1608028375);
        int i15 = i14 | (o0VarO.B(gVar) ? 4 : 2) | (o0VarO.h(z14) ? 32 : 16) | (o0VarO.r(aVar) ? 256 : 128) | (o0VarO.r(lVar) ? 2048 : 1024);
        if (o0VarO.n(i15 & 1, (i15 & 1171) != 1170)) {
            x1 x1Var = p3.n.f135158a;
            h4.r rVarE = u1.n.e(h4.r.S, vb.h.f(d92.b.f58623a, o0VarO), m1.f128891a);
            boolean z15 = ((i15 & 14) == 4) | ((i15 & 896) == 256) | ((i15 & 112) == 32) | ((i15 & 7168) == 2048);
            Object objQ = o0VarO.q();
            if (z15) {
                dt1.d dVar = new dt1.d(gVar, aVar, z14, lVar, 2);
                o0VarO.K(dVar);
                objQ = dVar;
            } else {
                p3.m.f135153a.getClass();
                if (objQ == p3.m.a.f135155b) {
                    dt1.d dVar2 = new dt1.d(gVar, aVar, z14, lVar, 2);
                    o0VarO.K(dVar2);
                    objQ = dVar2;
                }
            }
            e2.c.b(rVarE, null, null, null, null, null, false, null, (e23.l) objQ, o0VarO, 0, 510);
        } else {
            o0VarO.e();
        }
        p2 p2VarI0 = o0VarO.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new e(gVar, z14, aVar, lVar, i14, 1);
        }
    }
}
