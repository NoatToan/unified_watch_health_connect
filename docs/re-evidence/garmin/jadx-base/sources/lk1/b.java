package lk1;

import e23.l;
import gl1.y;
import ix.h;
import lc.m0;
import lc.v0;
import p005kotlin.Unit;
import p3.m;
import p3.n;
import p3.o0;
import p3.p2;
import p3.x1;

/* JADX INFO: loaded from: classes10.dex */
public final class b {
    /* JADX WARN: Code duplicated, block: B:50:0x00ac  */
    public static final void a(String str, d dVar, dk1.a aVar, e23.a<Unit> aVar2, e23.a<Unit> aVar3, m mVar, int i14) {
        m0 m0Var;
        dVar.getClass();
        aVar.getClass();
        aVar2.getClass();
        aVar3.getClass();
        o0 o0VarE = mVar.E(1896728965);
        int i15 = i14 | (o0VarE.B(str) ? 4 : 2) | (o0VarE.B(dVar) ? 32 : 16) | (o0VarE.B(aVar) ? 256 : 128) | (o0VarE.r(aVar2) ? 2048 : 1024) | (o0VarE.r(aVar3) ? 16384 : 8192);
        if (o0VarE.n(i15 & 1, (i15 & 9363) != 9362)) {
            x1 x1Var = n.f135158a;
            m0 m0VarI = y.I(new v0[0], o0VarE);
            boolean zR = ((i15 & 14) == 4) | ((57344 & i15) == 16384) | ((i15 & 896) == 256) | o0VarE.r(m0VarI) | ((i15 & 7168) == 2048);
            Object objQ = o0VarE.q();
            if (zR) {
                jv0.c cVar = new jv0.c(aVar3, str, aVar, m0VarI, aVar2, 4);
                m0Var = m0VarI;
                o0VarE.K(cVar);
                objQ = cVar;
            } else {
                m.f135153a.getClass();
                if (objQ == m.a.f135155b) {
                    jv0.c cVar2 = new jv0.c(aVar3, str, aVar, m0VarI, aVar2, 4);
                    m0Var = m0VarI;
                    o0VarE.K(cVar2);
                    objQ = cVar2;
                } else {
                    m0Var = m0VarI;
                }
            }
            nc.y.a(m0Var, dVar, null, null, null, null, null, null, null, (l) objQ, o0VarE, i15 & 112, 2044);
        } else {
            o0VarE.e();
        }
        p2 p2VarI0 = o0VarE.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new h(str, dVar, aVar, aVar2, aVar3, i14, 16);
        }
    }
}
