package kj2;

import h4.r;
import i3.h7;
import kb0.p;
import p3.m;
import p3.n;
import p3.o0;
import p3.p2;
import p3.x1;

/* JADX INFO: loaded from: classes11.dex */
public final class k {
    /* JADX WARN: Code duplicated, block: B:23:0x004f  */
    public static final void a(r rVar, u4.d dVar, e23.a aVar, m mVar, int i14) {
        aVar.getClass();
        o0 o0VarE = mVar.E(1790887314);
        int i15 = i14 | (o0VarE.B(dVar) ? 32 : 16) | (o0VarE.r(aVar) ? 2048 : 1024);
        if (o0VarE.n(i15 & 1, (i15 & 1171) != 1170)) {
            x1 x1Var = n.f135158a;
            boolean z14 = (i15 & 7168) == 2048;
            Object objQ = o0VarE.q();
            if (z14) {
                objQ = new p(aVar, 7);
                o0VarE.K(objQ);
            } else {
                m.f135153a.getClass();
                if (objQ == m.a.f135155b) {
                    objQ = new p(aVar, 7);
                    o0VarE.K(objQ);
                }
            }
            h7.a((e23.a) objQ, rVar, false, null, null, z3.f.c(1893968052, new b82.k(dVar, 6), o0VarE), o0VarE, 1572912, 60);
        } else {
            o0VarE.e();
        }
        p2 p2VarI0 = o0VarE.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new jt1.m(rVar, dVar, aVar, i14, 13);
        }
    }
}
