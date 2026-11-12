package zs1;

import o4.m1;
import p3.o0;
import p3.p2;
import p3.x1;
import vd0.d0;

/* JADX INFO: loaded from: classes10.dex */
public final class j {
    /* JADX WARN: Code duplicated, block: B:39:0x00a4  */
    public static final void a(h4.r rVar, i53.c cVar, e23.l lVar, e23.a aVar, p3.m mVar, int i14) {
        cVar.getClass();
        lVar.getClass();
        aVar.getClass();
        o0 o0VarE = mVar.E(-731058851);
        int i15 = i14 | (o0VarE.B(rVar) ? 4 : 2) | (o0VarE.B(cVar) ? 32 : 16) | (o0VarE.r(lVar) ? 256 : 128) | (o0VarE.r(aVar) ? 2048 : 1024);
        if (o0VarE.n(i15 & 1, (i15 & 1171) != 1170)) {
            x1 x1Var = p3.n.f135158a;
            h4.r rVarE = u1.n.e(rVar, vb.h.f(d92.b.f58623a, o0VarE), m1.f128891a);
            c2.j jVar = c2.j.f22691a;
            d92.b.f58625c.getClass();
            float f14 = j92.b.f97899b.f97917b;
            jVar.getClass();
            c2.j.i iVarI = c2.j.i(f14);
            boolean z14 = ((i15 & 112) == 32) | ((i15 & 7168) == 2048) | ((i15 & 896) == 256);
            Object objQ = o0VarE.q();
            if (z14) {
                objQ = new d0(cVar, aVar, lVar, 3);
                o0VarE.K(objQ);
            } else {
                p3.m.f135153a.getClass();
                if (objQ == p3.m.a.f135155b) {
                    objQ = new d0(cVar, aVar, lVar, 3);
                    o0VarE.K(objQ);
                }
            }
            e2.c.b(rVarE, null, null, iVarI, null, null, false, null, (e23.l) objQ, o0VarE, 0, 494);
        } else {
            o0VarE.e();
        }
        p2 p2VarI0 = o0VarE.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new xr.n(rVar, cVar, lVar, aVar, i14, 21);
        }
    }
}
