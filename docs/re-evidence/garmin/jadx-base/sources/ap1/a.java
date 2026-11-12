package ap1;

import ao1.g;
import c2.l;
import com.garmin.android.apps.connectmobile.R;
import d92.b;
import defpackage.c;
import gl1.y;
import h4.r;
import p3.m;
import p3.n;
import p3.o0;
import p3.p2;
import p3.x1;
import t60.f;

/* JADX INFO: loaded from: classes10.dex */
public final class a {
    /* JADX WARN: Code duplicated, block: B:23:0x0096  */
    public static final void a(int i14, e23.a aVar, String str, m mVar) {
        aVar.getClass();
        o0 o0VarE = mVar.E(1508730637);
        int i15 = (o0VarE.B(str) ? 4 : 2) | i14 | (o0VarE.r(aVar) ? 32 : 16);
        if (o0VarE.n(i15 & 1, (i15 & 19) != 18)) {
            x1 x1Var = n.f135158a;
            r.a aVar2 = r.S;
            b.f58623a.getClass();
            b.f58625c.getClass();
            r rVarY = l.y(aVar2, j92.b.f97899b.f97920e);
            String strQ = y.Q(o0VarE, R.string.lbl_close);
            String strQ2 = y.Q(o0VarE, R.string.lbl_recommended_for_you);
            boolean z14 = false;
            String strQ3 = y.Q(o0VarE, R.string.lbl_edge_1050);
            String strQ4 = y.Q(o0VarE, R.string.lbl_group_ride_connect_description);
            String strQ5 = y.Q(o0VarE, R.string.lbl_shop_now);
            String strA = t60.b.a(t60.a.EDGE_1050_BANNER);
            Integer numValueOf = Integer.valueOf(R.string.lbl_edge_1050);
            if ((i15 & 112) == 32) {
                z14 = true;
            }
            Object objQ = o0VarE.q();
            if (z14) {
                objQ = new c(aVar, 19);
                o0VarE.K(objQ);
            } else {
                m.f135153a.getClass();
                if (objQ == m.a.f135155b) {
                    objQ = new c(aVar, 19);
                    o0VarE.K(objQ);
                }
            }
            f.b("GroupRide", rVarY, strQ, strQ2, strQ3, strQ4, str, strQ5, strA, numValueOf, (e23.a) objQ, o0VarE, ((i15 << 18) & 3670016) | 6);
        } else {
            o0VarE.e();
        }
        p2 p2VarI0 = o0VarE.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new g(str, aVar, i14, 1);
        }
    }
}
