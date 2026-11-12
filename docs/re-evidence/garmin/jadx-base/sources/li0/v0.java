package li0;

import c2.l2;
import o4.m1;
import p3.p2;
import p3.x1;

/* JADX INFO: loaded from: classes8.dex */
public final class v0 {
    /* JADX WARN: Code duplicated, block: B:44:0x00bd  */
    public static final void a(f4.s sVar, float f14, f fVar, h4.r rVar, p3.m mVar, int i14) {
        int i15;
        fVar.getClass();
        p3.o0 o0VarE = mVar.E(-674398326);
        if ((i14 & 6) == 0) {
            i15 = (o0VarE.r(sVar) ? 4 : 2) | i14;
        } else {
            i15 = i14;
        }
        if ((i14 & 48) == 0) {
            i15 |= o0VarE.i(f14) ? 32 : 16;
        }
        if ((i14 & 384) == 0) {
            i15 |= o0VarE.r(fVar) ? 256 : 128;
        }
        if ((i14 & 3072) == 0) {
            i15 |= o0VarE.B(rVar) ? 2048 : 1024;
        }
        if (o0VarE.n(i15 & 1, (i15 & 1171) != 1170)) {
            x1 x1Var = p3.n.f135158a;
            d92.b.f58623a.getClass();
            j92.b bVar = d92.b.f58625c;
            bVar.getClass();
            j92.e eVar = j92.b.f97899b;
            l2 l2VarC = c2.l.c(eVar.f97920e, 0.0f, 2);
            c2.j jVar = c2.j.f22691a;
            bVar.getClass();
            float f15 = eVar.f97918c;
            jVar.getClass();
            c2.j.i iVarI = c2.j.i(f15);
            h4.r rVarThen = u1.n.e(h4.r.S, p6.b.b(o0VarE), m1.f128891a).then(rVar);
            boolean zR = o0VarE.r(sVar) | o0VarE.r(fVar) | ((i15 & 112) == 32);
            Object objQ = o0VarE.q();
            if (zR) {
                objQ = new cq.p(sVar, fVar, f14, 5);
                o0VarE.K(objQ);
            } else {
                p3.m.f135153a.getClass();
                if (objQ == p3.m.a.f135155b) {
                    objQ = new cq.p(sVar, fVar, f14, 5);
                    o0VarE.K(objQ);
                }
            }
            e2.c.c(rVarThen, null, l2VarC, iVarI, null, null, false, null, (e23.l) objQ, o0VarE, 0, 490);
        } else {
            o0VarE.e();
        }
        p2 p2VarI0 = o0VarE.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new bn1.f(sVar, f14, fVar, rVar, i14, 2);
        }
    }
}
