package an1;

import c2.l;
import com.garmin.android.apps.connectmobile.R;
import gl1.y;
import h4.r;
import p3.m;
import p3.n;
import p3.o0;
import p3.p2;
import p3.x1;

/* JADX INFO: loaded from: classes10.dex */
public final class h {
    /* JADX WARN: Code duplicated, block: B:28:0x00a3  */
    public static final void a(r rVar, String str, e23.a aVar, m mVar, int i14) {
        aVar.getClass();
        o0 o0VarE = mVar.E(518283509);
        int i15 = i14 | (o0VarE.B(rVar) ? 4 : 2) | (o0VarE.B(str) ? 32 : 16) | (o0VarE.r(aVar) ? 256 : 128);
        if (o0VarE.n(i15 & 1, (i15 & 147) != 146)) {
            x1 x1Var = n.f135158a;
            d92.b.f58623a.getClass();
            d92.b.f58625c.getClass();
            r rVarY = l.y(rVar, j92.b.f97899b.f97920e);
            String strQ = y.Q(o0VarE, R.string.lbl_close);
            String strQ2 = y.Q(o0VarE, R.string.lbl_recommended_for_you);
            String strQ3 = y.Q(o0VarE, R.string.index_sleep_monitor_title);
            String strQ4 = y.Q(o0VarE, R.string.cross_sell_chamomile_description);
            String strQ5 = y.Q(o0VarE, R.string.lbl_shop_now);
            String strA = t60.b.a(t60.a.SLEEP_BAND_BANNER);
            Integer numValueOf = Integer.valueOf(R.string.default_image_view_content_description);
            boolean z14 = (i15 & 896) == 256;
            Object objQ = o0VarE.q();
            if (z14) {
                objQ = new defpackage.c(aVar, 16);
                o0VarE.K(objQ);
            } else {
                m.f135153a.getClass();
                if (objQ == m.a.f135155b) {
                    objQ = new defpackage.c(aVar, 16);
                    o0VarE.K(objQ);
                }
            }
            t60.f.b("Sleep", rVarY, strQ, strQ2, strQ3, strQ4, str, strQ5, strA, numValueOf, (e23.a) objQ, o0VarE, ((i15 << 15) & 3670016) | 6);
        } else {
            o0VarE.e();
        }
        p2 p2VarI0 = o0VarE.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new g(rVar, str, aVar, i14, 0);
        }
    }
}
