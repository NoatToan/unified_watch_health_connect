package kh0;

import com.garmin.android.apps.connectmobile.R;
import gl1.y;
import p3.o0;
import p3.p2;
import p3.x1;

/* JADX INFO: loaded from: classes8.dex */
public final class l {
    /* JADX WARN: Code duplicated, block: B:24:0x0098  */
    public static final void a(int i14, e23.a aVar, String str, p3.m mVar) {
        aVar.getClass();
        o0 o0VarE = mVar.E(-1959040179);
        int i15 = (o0VarE.B(str) ? 4 : 2) | i14 | (o0VarE.r(aVar) ? 32 : 16);
        if (o0VarE.n(i15 & 1, (i15 & 19) != 18)) {
            x1 x1Var = p3.n.f135158a;
            h4.r.a aVar2 = h4.r.S;
            d92.b.f58623a.getClass();
            d92.b.f58625c.getClass();
            h4.r rVarY = c2.l.y(aVar2, j92.b.f97899b.f97920e);
            String strQ = y.Q(o0VarE, R.string.lbl_close);
            String strQ2 = y.Q(o0VarE, R.string.lbl_recommended_for_you);
            String strQ3 = y.Q(o0VarE, R.string.index_s2_tm_smart_scale);
            String strQ4 = y.Q(o0VarE, R.string.msg_index_scale_cross_sell_desc);
            String strQ5 = y.Q(o0VarE, R.string.lbl_shop_now);
            String strA = t60.b.a(t60.a.INDEX_BANNER);
            Integer numValueOf = Integer.valueOf(R.string.default_image_view_content_description);
            boolean z14 = (i15 & 112) == 32;
            Object objQ = o0VarE.q();
            if (z14) {
                objQ = new kb0.p(aVar, 2);
                o0VarE.K(objQ);
            } else {
                p3.m.f135153a.getClass();
                if (objQ == p3.m.a.f135155b) {
                    objQ = new kb0.p(aVar, 2);
                    o0VarE.K(objQ);
                }
            }
            t60.f.b("FitnessAge", rVarY, strQ, strQ2, strQ3, strQ4, str, strQ5, strA, numValueOf, (e23.a) objQ, o0VarE, ((i15 << 18) & 3670016) | 6);
        } else {
            o0VarE.e();
        }
        p2 p2VarI0 = o0VarE.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new ao1.g(str, aVar, i14, 18);
        }
    }
}
