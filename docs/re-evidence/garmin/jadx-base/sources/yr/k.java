package yr;

import c2.x2;
import i3.ve;
import p3.p1;
import p3.p2;
import p3.x1;

/* JADX INFO: loaded from: classes7.dex */
public final class k {
    /* JADX WARN: Multi-variable type inference failed */
    public static final void a(nr.g.d dVar, p3.m mVar, int i14) {
        p3.o0 o0VarE = mVar.E(-1952495233);
        int i15 = (o0VarE.B(dVar) ? 4 : 2) | i14;
        if (o0VarE.n(i15 & 1, (i15 & 3) != 2)) {
            x1 x1Var = p3.n.f135158a;
            Object[] objArr = new Object[0];
            Object objQ = o0VarE.q();
            p3.m.f135153a.getClass();
            if (objQ == p3.m.a.f135155b) {
                objQ = new ya0.j(19);
                o0VarE.K(objQ);
            }
            p1 p1Var = (p1) d4.a.e(objArr, (e23.a) objQ, o0VarE, 48);
            if (((Boolean) p1Var.getF182175a()).booleanValue()) {
                o0VarE.C(-43179294);
                h4.r rVarF = x2.f(h4.r.S, 1.0f);
                d92.b.f58623a.getClass();
                j92.b bVar = d92.b.f58625c;
                bVar.getClass();
                j92.e eVar = j92.b.f97899b;
                h4.r rVarY = c2.l.y(rVarF, eVar.f97920e);
                long jA = d92.b.a(o0VarE).c().a();
                bVar.getClass();
                ve.a(rVarY, k2.i.a(eVar.f97918c), jA, 0L, 0.0f, 0.0f, null, z3.f.c(1414843317, new xm0.h(17, dVar, p1Var), o0VarE), o0VarE, 12582912, 120);
                o0VarE.g0(false);
            } else {
                o0VarE.C(-42096061);
                o0VarE.g0(false);
            }
        } else {
            o0VarE.e();
        }
        p2 p2VarI0 = o0VarE.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new d(dVar, i14, 1);
        }
    }
}
