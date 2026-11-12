package vd0;

import android.net.Uri;
import p3.p2;

/* JADX INFO: loaded from: classes8.dex */
public final class a1 {
    /* JADX WARN: Code duplicated, block: B:26:0x0065  */
    /* JADX WARN: Code duplicated, block: B:31:0x0085  */
    public static final void a(Uri uri, float f14, h4.r rVar, x0 x0Var, p3.m mVar, int i14) {
        p3.o0 o0VarE = mVar.E(157489745);
        int i15 = i14 | (o0VarE.r(uri) ? 4 : 2) | (o0VarE.r(x0Var) ? 2048 : 1024);
        if (o0VarE.n(i15 & 1, (i15 & 1171) != 1170)) {
            o0VarE.G0();
            if ((i14 & 1) != 0 && !o0VarE.o0()) {
                o0VarE.e();
            }
            o0VarE.h0();
            p3.x1 x1Var = p3.n.f135158a;
            g6.c cVar = (g6.c) o0VarE.A(kotlin.t1.f91490h);
            boolean zB = o0VarE.B(cVar) | o0VarE.r(x0Var);
            Object objQ = o0VarE.q();
            p3.m.a aVar = p3.m.f135153a;
            if (zB) {
                objQ = new cq.p(x0Var, cVar, f14);
                o0VarE.K(objQ);
            } else {
                aVar.getClass();
                if (objQ == p3.m.a.f135155b) {
                    objQ = new cq.p(x0Var, cVar, f14);
                    o0VarE.K(objQ);
                }
            }
            e23.l lVar = (e23.l) objQ;
            boolean zR = o0VarE.r(x0Var) | o0VarE.r(uri);
            Object objQ2 = o0VarE.q();
            if (zR) {
                objQ2 = new ty1.g2(14, x0Var, uri);
                o0VarE.K(objQ2);
            } else {
                aVar.getClass();
                if (objQ2 == p3.m.a.f135155b) {
                    objQ2 = new ty1.g2(14, x0Var, uri);
                    o0VarE.K(objQ2);
                }
            }
            p002j6.c.b(lVar, rVar, (e23.l) objQ2, o0VarE, 48, 0);
        } else {
            o0VarE.e();
        }
        p2 p2VarI0 = o0VarE.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new hz0.w(uri, f14, rVar, x0Var, i14, 6);
        }
    }
}
