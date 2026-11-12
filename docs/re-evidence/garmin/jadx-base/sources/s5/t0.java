package s5;

import kotlin.t1;
import p3.x1;

/* JADX INFO: loaded from: classes.dex */
public final class t0 {
    /* JADX WARN: Code duplicated, block: B:6:0x0042  */
    public static final s0 a(p3.m mVar) {
        x1 x1Var = p3.n.f135158a;
        w5.q.b bVar = (w5.q.b) mVar.A(t1.f91493k);
        g6.c cVar = (g6.c) mVar.A(t1.f91490h);
        g6.o oVar = (g6.o) mVar.A(t1.f91496n);
        boolean zB = mVar.B(bVar) | mVar.B(cVar) | mVar.k(oVar.ordinal()) | mVar.k(8);
        Object objQ = mVar.q();
        if (zB) {
            objQ = new s0(bVar, cVar, oVar, 8);
            mVar.K(objQ);
        } else {
            p3.m.f135153a.getClass();
            if (objQ == p3.m.a.f135155b) {
                objQ = new s0(bVar, cVar, oVar, 8);
                mVar.K(objQ);
            }
        }
        return (s0) objQ;
    }
}
