package tg1;

import p004k6.d0;
import p004k6.e0;
import p005kotlin.Unit;
import p3.o0;
import p3.p2;
import p3.x1;
import t70.a1;

/* JADX INFO: loaded from: classes10.dex */
public final class q {
    /* JADX WARN: Code duplicated, block: B:23:0x005a  */
    public static final void a(sg1.b bVar, e23.a<Unit> aVar, p3.m mVar, int i14) {
        aVar.getClass();
        o0 o0VarE = mVar.E(111567253);
        int i15 = (o0VarE.B(bVar) ? 4 : 2) | i14 | (o0VarE.r(aVar) ? 32 : 16);
        if (o0VarE.n(i15 & 1, (i15 & 19) != 18)) {
            x1 x1Var = p3.n.f135158a;
            h4.d.f81522a.getClass();
            h4.g gVar = h4.d.a.f81528f;
            boolean z14 = (i15 & 112) == 32;
            Object objQ = o0VarE.q();
            if (z14) {
                objQ = new a1(aVar, 18);
                o0VarE.K(objQ);
            } else {
                p3.m.f135153a.getClass();
                if (objQ == p3.m.a.f135155b) {
                    objQ = new a1(aVar, 18);
                    o0VarE.K(objQ);
                }
            }
            p004k6.g.b(gVar, 0L, (e23.a) objQ, new d0(false, true, true, (e0) null, false, false, true, 57, (p005kotlin.jvm.internal.j) null), z3.f.c(-1593736328, new k(bVar, 2), o0VarE), o0VarE, 27654, 2);
        } else {
            o0VarE.e();
        }
        p2 p2VarI0 = o0VarE.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new p(bVar, aVar, i14);
        }
    }
}
