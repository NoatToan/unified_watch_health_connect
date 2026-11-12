package cw1;

import com.garmin.android.apps.connectmobile.R;
import f72.t9;
import l72.b2;
import p3.p2;
import p3.x1;

/* JADX INFO: loaded from: classes10.dex */
public final class q0 {
    /* JADX WARN: Code duplicated, block: B:20:0x0062  */
    public static final void a(e23.a aVar, p3.m mVar, int i14) {
        p3.o0 o0VarE = mVar.E(543636691);
        int i15 = (o0VarE.r(aVar) ? 4 : 2) | i14;
        if (o0VarE.n(i15 & 1, (i15 & 3) != 2)) {
            x1 x1Var = p3.n.f135158a;
            l72.f0 f0Var = l72.f0.f110999a;
            h4.r rVarA = l4.k.a(h4.r.S, 0.8f);
            s62.a.f157643a.getClass();
            t62.c.f162799a.getClass();
            u4.d dVarA = j72.b.a(t9.f69810a);
            b2 b2Var = b2.LARGE;
            String strQ = gl1.y.Q(o0VarE, R.string.button_play);
            boolean z14 = (i15 & 14) == 4;
            Object objQ = o0VarE.q();
            if (z14) {
                objQ = new p0(aVar, 0);
                o0VarE.K(objQ);
            } else {
                p3.m.f135153a.getClass();
                if (objQ == p3.m.a.f135155b) {
                    objQ = new p0(aVar, 0);
                    o0VarE.K(objQ);
                }
            }
            f0Var.c(rVarA, dVarA, null, b2Var, false, strQ, null, (e23.a) objQ, o0VarE, 3078, 84);
        } else {
            o0VarE.e();
        }
        p2 p2VarI0 = o0VarE.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new cq0.p(aVar, i14, 6);
        }
    }
}
