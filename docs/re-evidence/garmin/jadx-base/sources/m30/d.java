package m30;

import p005kotlin.Unit;
import p3.o0;
import p3.p2;
import p3.x1;

/* JADX INFO: loaded from: classes8.dex */
public final class d {
    /* JADX WARN: Code duplicated, block: B:32:0x007c  */
    /* JADX WARN: Code duplicated, block: B:40:0x0098  */
    public static final void a(n30.b bVar, n50.g gVar, n50.d dVar, e23.l<? super n30.a, Unit> lVar, e23.l<? super g6.m, Unit> lVar2, p3.m mVar, int i14) {
        e23.l<? super g6.m, Unit> lVar3;
        lVar.getClass();
        lVar2.getClass();
        o0 o0VarE = mVar.E(-593317306);
        int i15 = i14 | (o0VarE.B(bVar) ? 4 : 2) | (o0VarE.B(gVar) ? 32 : 16) | (o0VarE.B(dVar) ? 256 : 128) | (o0VarE.r(lVar) ? 2048 : 1024);
        if (o0VarE.n(i15 & 1, (i15 & 9363) != 9362)) {
            x1 x1Var = p3.n.f135158a;
            lVar3 = lVar2;
            z3.e eVarC = z3.f.c(1508642409, new a(bVar, lVar, lVar3), o0VarE);
            int i16 = i15 & 7168;
            boolean z14 = i16 == 2048;
            Object objQ = o0VarE.q();
            p3.m.a aVar = p3.m.f135153a;
            if (z14) {
                objQ = new k11.n(lVar, 21);
                o0VarE.K(objQ);
            } else {
                aVar.getClass();
                if (objQ == p3.m.a.f135155b) {
                    objQ = new k11.n(lVar, 21);
                    o0VarE.K(objQ);
                }
            }
            e23.l lVar4 = (e23.l) objQ;
            boolean z15 = i16 == 2048;
            Object objQ2 = o0VarE.q();
            if (z15) {
                objQ2 = new k11.n(lVar, 22);
                o0VarE.K(objQ2);
            } else {
                aVar.getClass();
                if (objQ2 == p3.m.a.f135155b) {
                    objQ2 = new k11.n(lVar, 22);
                    o0VarE.K(objQ2);
                }
            }
            z30.a.a(eVarC, gVar, lVar4, dVar, (e23.l) objQ2, o0VarE, ((i15 << 3) & 7168) | (i15 & 112) | 6);
        } else {
            lVar3 = lVar2;
            o0VarE.e();
        }
        p2 p2VarI0 = o0VarE.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new ix.h(bVar, gVar, dVar, lVar, lVar3, i14, 22);
        }
    }
}
