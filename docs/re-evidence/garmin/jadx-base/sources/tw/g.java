package tw;

import c2.l;
import com.garmin.android.apps.connectmobile.R;
import gl1.y;
import h4.r;
import p3.m;
import p3.n;
import p3.o0;
import p3.p2;
import p3.x1;
import t70.a1;

/* JADX INFO: loaded from: classes7.dex */
public final class g {
    /* JADX WARN: Code duplicated, block: B:24:0x0099  */
    public static final void a(int i14, e23.a aVar, String str, m mVar) {
        aVar.getClass();
        o0 o0VarE = mVar.E(1744681949);
        int i15 = (o0VarE.B(str) ? 4 : 2) | i14 | (o0VarE.r(aVar) ? 32 : 16);
        if (o0VarE.n(i15 & 1, (i15 & 19) != 18)) {
            x1 x1Var = n.f135158a;
            r.a aVar2 = r.S;
            d92.b.f58623a.getClass();
            d92.b.f58625c.getClass();
            r rVarY = l.y(aVar2, j92.b.f97899b.f97920e);
            String strQ = y.Q(o0VarE, R.string.lbl_close);
            String strQ2 = y.Q(o0VarE, R.string.lbl_recommended_for_you);
            String strQ3 = y.Q(o0VarE, R.string.index_bpm);
            String strQ4 = y.Q(o0VarE, R.string.msg_index_bpm_cross_sell_desc);
            String strQ5 = y.Q(o0VarE, R.string.lbl_shop_now);
            String strA = t60.b.a(t60.a.BPM_BANNER);
            Integer numValueOf = Integer.valueOf(R.string.default_image_view_content_description);
            boolean z14 = (i15 & 112) == 32;
            Object objQ = o0VarE.q();
            if (z14) {
                objQ = new a1(aVar, 24);
                o0VarE.K(objQ);
            } else {
                m.f135153a.getClass();
                if (objQ == m.a.f135155b) {
                    objQ = new a1(aVar, 24);
                    o0VarE.K(objQ);
                }
            }
            t60.f.b("BloodPressure", rVarY, strQ, strQ2, strQ3, strQ4, str, strQ5, strA, numValueOf, (e23.a) objQ, o0VarE, ((i15 << 18) & 3670016) | 6);
        } else {
            o0VarE.e();
        }
        p2 p2VarI0 = o0VarE.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new ao1.g(str, aVar, i14, 29);
        }
    }
}
