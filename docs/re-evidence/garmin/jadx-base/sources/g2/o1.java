package g2;

import p3.p2;
import p3.y3;

/* JADX INFO: loaded from: classes.dex */
public final class o1 {
    /* JADX WARN: Code duplicated, block: B:12:0x0059  */
    public static final void a(z3.e eVar, p3.m mVar, int i14) {
        p3.o0 o0VarE = mVar.E(-709502251);
        int i15 = 6;
        if (o0VarE.n(i14 & 1, (i14 & 3) != 2)) {
            p3.x1 x1Var = p3.n.f135158a;
            y3 y3Var = d4.i.f57449a;
            d4.f fVar = (d4.f) o0VarE.A(y3Var);
            d4.d dVarA = d4.e.a(o0VarE);
            Object[] objArr = {fVar};
            n1.f75184d.getClass();
            g02.c1 c1Var = new g02.c1(6);
            m1 m1Var = new m1(0, fVar, dVarA);
            d4.l lVar = d4.m.f57455a;
            d4.l lVar2 = new d4.l(c1Var, m1Var);
            boolean zR = o0VarE.r(fVar) | o0VarE.r(dVarA);
            Object objQ = o0VarE.q();
            if (zR) {
                objQ = new ew1.c2(23, fVar, dVarA);
                o0VarE.K(objQ);
            } else {
                p3.m.f135153a.getClass();
                if (objQ == p3.m.a.f135155b) {
                    objQ = new ew1.c2(23, fVar, dVarA);
                    o0VarE.K(objQ);
                }
            }
            n1 n1Var = (n1) d4.a.c(objArr, lVar2, (e23.a) objQ, o0VarE, 0);
            p3.v.a(y3Var.c(n1Var), z3.f.c(-412824043, new ew1.r1(28, eVar, n1Var), o0VarE), o0VarE, 56);
        } else {
            o0VarE.e();
        }
        p2 p2VarI0 = o0VarE.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new aa2.o(eVar, i14, i15);
        }
    }
}
