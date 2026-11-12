package yr;

import android.content.Context;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import c2.x2;
import o4.m1;
import p3.p2;
import p3.x1;

/* JADX INFO: loaded from: classes7.dex */
public final class p {
    /* JADX WARN: Code duplicated, block: B:16:0x005e  */
    /* JADX WARN: Code duplicated, block: B:24:0x007c  */
    public static final void a(nr.g.C2446g c2446g, p3.m mVar, int i14) {
        p3.o0 o0VarE = mVar.E(-269319023);
        int i15 = (o0VarE.B(c2446g) ? 4 : 2) | i14;
        if (o0VarE.n(i15 & 1, (i15 & 3) != 2)) {
            x1 x1Var = p3.n.f135158a;
            Context context = (Context) o0VarE.A(AndroidCompositionLocals_androidKt.f6042b);
            g6.f.a aVar = g6.f.f75994b;
            h4.r rVarH = x2.h(x2.f(u1.n.e(h4.r.S, tn.k.b(d92.b.f58623a, o0VarE), m1.f128891a), 1.0f), 220);
            boolean zR = o0VarE.r(context);
            Object objQ = o0VarE.q();
            p3.m.a aVar2 = p3.m.f135153a;
            if (zR) {
                objQ = new ot.c(context, 24);
                o0VarE.K(objQ);
            } else {
                aVar2.getClass();
                if (objQ == p3.m.a.f135155b) {
                    objQ = new ot.c(context, 24);
                    o0VarE.K(objQ);
                }
            }
            e23.l lVar = (e23.l) objQ;
            boolean z14 = (i15 & 14) == 4;
            Object objQ2 = o0VarE.q();
            if (z14) {
                objQ2 = new xa2.g(c2446g, 27);
                o0VarE.K(objQ2);
            } else {
                aVar2.getClass();
                if (objQ2 == p3.m.a.f135155b) {
                    objQ2 = new xa2.g(c2446g, 27);
                    o0VarE.K(objQ2);
                }
            }
            p002j6.c.b(lVar, rVarH, (e23.l) objQ2, o0VarE, 0, 0);
        } else {
            o0VarE.e();
        }
        p2 p2VarI0 = o0VarE.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new d(c2446g, i14, 4);
        }
    }
}
