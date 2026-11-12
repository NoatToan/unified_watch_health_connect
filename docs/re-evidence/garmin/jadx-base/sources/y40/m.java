package y40;

import p005kotlin.Unit;
import p3.o0;
import p3.p2;
import p3.x1;
import r53.d2;
import ta0.g0;

/* JADX INFO: loaded from: classes8.dex */
public final class m {
    /* JADX WARN: Code duplicated, block: B:36:0x0096  */
    /* JADX WARN: Code duplicated, block: B:44:0x00b2  */
    public static final void a(a50.d dVar, n50.g gVar, n50.d dVar2, d2<? extends a50.e> d2Var, e23.l<? super a50.c, Unit> lVar, e23.l<? super g6.m, Unit> lVar2, p3.m mVar, int i14) {
        e23.l<? super g6.m, Unit> lVar3;
        d2Var.getClass();
        lVar.getClass();
        lVar2.getClass();
        o0 o0VarE = mVar.E(1266494389);
        int i15 = i14 | (o0VarE.B(dVar) ? 4 : 2) | (o0VarE.B(gVar) ? 32 : 16) | (o0VarE.B(dVar2) ? 256 : 128) | (o0VarE.r(d2Var) ? 2048 : 1024) | (o0VarE.r(lVar) ? 16384 : 8192);
        if (o0VarE.n(i15 & 1, (74899 & i15) != 74898)) {
            x1 x1Var = p3.n.f135158a;
            lVar3 = lVar2;
            z3.e eVarC = z3.f.c(-1990836430, new j(dVar, d2Var, lVar, lVar3), o0VarE);
            int i16 = 57344 & i15;
            boolean z14 = i16 == 16384;
            Object objQ = o0VarE.q();
            p3.m.a aVar = p3.m.f135153a;
            if (z14) {
                objQ = new wr1.d(lVar, 11);
                o0VarE.K(objQ);
            } else {
                aVar.getClass();
                if (objQ == p3.m.a.f135155b) {
                    objQ = new wr1.d(lVar, 11);
                    o0VarE.K(objQ);
                }
            }
            e23.l lVar4 = (e23.l) objQ;
            boolean z15 = i16 == 16384;
            Object objQ2 = o0VarE.q();
            if (z15) {
                objQ2 = new wr1.d(lVar, 12);
                o0VarE.K(objQ2);
            } else {
                aVar.getClass();
                if (objQ2 == p3.m.a.f135155b) {
                    objQ2 = new wr1.d(lVar, 12);
                    o0VarE.K(objQ2);
                }
            }
            z30.a.a(eVarC, gVar, lVar4, dVar2, (e23.l) objQ2, o0VarE, (i15 & 112) | 6 | ((i15 << 3) & 7168));
        } else {
            lVar3 = lVar2;
            o0VarE.e();
        }
        p2 p2VarI0 = o0VarE.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new g0((Object) dVar, (Object) gVar, (Object) dVar2, (Object) d2Var, (e23.l) lVar, (e23.l) lVar3, i14, 19);
        }
    }
}
