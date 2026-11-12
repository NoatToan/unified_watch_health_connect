package v50;

import c2.x2;
import e23.l;
import h4.r;
import p3.m;
import p3.n;
import p3.o0;
import p3.p2;
import p3.x1;
import ty1.g2;

/* JADX INFO: loaded from: classes8.dex */
public final class j {
    /* JADX WARN: Code duplicated, block: B:31:0x0083  */
    public static final void a(x50.e eVar, l lVar, r rVar, m mVar, int i14) {
        r rVar2;
        x50.d dVar = eVar.f189002b;
        lVar.getClass();
        o0 o0VarE = mVar.E(-1199210222);
        int i15 = (o0VarE.B(eVar) ? 4 : 2) | i14 | (o0VarE.r(lVar) ? 32 : 16) | 384;
        if (o0VarE.n(i15 & 1, (i15 & 147) != 146)) {
            r.a aVar = r.S;
            x1 x1Var = n.f135158a;
            if (dVar != null) {
                o0VarE.C(-133567209);
                a.a(dVar, x2.d(aVar, 1.0f), o0VarE, 0);
                o0VarE.g0(false);
                rVar2 = aVar;
            } else {
                o0VarE.C(-133441721);
                r rVarD = x2.d(aVar, 1.0f);
                boolean z14 = ((i15 & 14) == 4) | ((i15 & 112) == 32);
                Object objQ = o0VarE.q();
                if (z14) {
                    objQ = new g2(9, eVar, lVar);
                    o0VarE.K(objQ);
                } else {
                    m.f135153a.getClass();
                    if (objQ == m.a.f135155b) {
                        objQ = new g2(9, eVar, lVar);
                        o0VarE.K(objQ);
                    }
                }
                rVar2 = aVar;
                e2.c.b(rVarD, null, null, null, null, null, false, null, (l) objQ, o0VarE, 0, 510);
                o0VarE.g0(false);
            }
        } else {
            o0VarE.e();
            rVar2 = rVar;
        }
        p2 p2VarI0 = o0VarE.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new tb0.h(eVar, lVar, rVar2, i14);
        }
    }
}
