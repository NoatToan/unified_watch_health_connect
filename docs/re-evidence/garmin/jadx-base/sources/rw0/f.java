package rw0;

import h4.r;
import p3.o0;
import p3.p2;
import p3.x1;

/* JADX INFO: loaded from: classes9.dex */
public final class f {
    /* JADX WARN: Code duplicated, block: B:22:0x0058  */
    public static final void a(r rVar, e23.l lVar, e23.l lVar2, p3.m mVar, int i14) {
        e23.l lVar3;
        lVar.getClass();
        o0 o0VarE = mVar.E(-1823946486);
        int i15 = i14 | (o0VarE.r(lVar) ? 32 : 16) | 3456;
        if (o0VarE.n(i15 & 1, (i15 & 1171) != 1170)) {
            Object objQ = o0VarE.q();
            p3.m.a aVar = p3.m.f135153a;
            aVar.getClass();
            p3.m.a.C2565a c2565a = p3.m.a.f135155b;
            if (objQ == c2565a) {
                objQ = new b(0);
                o0VarE.K(objQ);
            }
            e23.l lVar4 = (e23.l) objQ;
            x1 x1Var = p3.n.f135158a;
            boolean z14 = (i15 & 112) == 32;
            Object objQ2 = o0VarE.q();
            if (z14) {
                objQ2 = new f4.k(lVar, lVar4, 2);
                o0VarE.K(objQ2);
            } else {
                aVar.getClass();
                if (objQ2 == c2565a) {
                    objQ2 = new f4.k(lVar, lVar4, 2);
                    o0VarE.K(objQ2);
                }
            }
            e23.l lVar5 = (e23.l) objQ2;
            Object objQ3 = o0VarE.q();
            aVar.getClass();
            if (objQ3 == c2565a) {
                objQ3 = new b(1);
                o0VarE.K(objQ3);
            }
            e23.l lVar6 = (e23.l) objQ3;
            Object objQ4 = o0VarE.q();
            if (objQ4 == c2565a) {
                objQ4 = new b(2);
                o0VarE.K(objQ4);
            }
            p002j6.c.a(lVar5, rVar, null, lVar6, (e23.l) objQ4, o0VarE, 3120, 4);
            lVar3 = lVar4;
        } else {
            o0VarE.e();
            lVar3 = lVar2;
        }
        p2 p2VarI0 = o0VarE.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new pp.g(rVar, lVar, lVar3, i14, 27);
        }
    }
}
