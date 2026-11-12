package u91;

import h4.r;
import p3.m;
import p3.n;
import p3.o0;
import p3.p2;
import p3.x1;
import sk0.k1;

/* JADX INFO: loaded from: classes9.dex */
public final class l {
    /* JADX WARN: Code duplicated, block: B:31:0x0075  */
    public static final void a(aa1.g gVar, e23.a aVar, e23.a aVar2, e23.a aVar3, m mVar, int i14) {
        gVar.getClass();
        o0 o0VarE = mVar.E(-1086348863);
        int i15 = (o0VarE.B(gVar) ? 4 : 2) | i14 | (o0VarE.r(aVar) ? 32 : 16) | (o0VarE.r(aVar2) ? 256 : 128) | (o0VarE.r(aVar3) ? 2048 : 1024);
        if (o0VarE.n(i15 & 1, (i15 & 1171) != 1170)) {
            x1 x1Var = n.f135158a;
            z3.e eVarC = z3.f.c(640775516, new tb0.h(gVar, 11, aVar, aVar2), o0VarE);
            r.a aVar4 = r.S;
            boolean z14 = !gVar.f2276b;
            boolean z15 = (i15 & 7168) == 2048;
            Object objQ = o0VarE.q();
            if (z15) {
                objQ = new rx1.m(aVar3, 13);
                o0VarE.K(objQ);
            } else {
                m.f135153a.getClass();
                if (objQ == m.a.f135155b) {
                    objQ = new rx1.m(aVar3, 13);
                    o0VarE.K(objQ);
                }
            }
            l72.l.f(eVarC, wz1.i.a((e23.l) objQ, aVar4, z14), false, null, o0VarE, 6, 28);
        } else {
            o0VarE.e();
        }
        p2 p2VarI0 = o0VarE.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new k1(gVar, aVar, aVar2, aVar3, i14);
        }
    }
}
