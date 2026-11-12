package af1;

import com.garmin.android.apps.connectmobile.R;
import gl1.y;
import h4.r;
import p005kotlin.Unit;
import p3.o0;
import p3.p2;
import p3.x1;

/* JADX INFO: loaded from: classes9.dex */
public final class b {
    /* JADX WARN: Code duplicated, block: B:28:0x009b  */
    public static final void a(String str, String str2, e23.a<Unit> aVar, p3.m mVar, int i14) {
        o0 o0VarL = vb.h.l(-1950532020, aVar, str2, mVar);
        int i15 = i14 | (o0VarL.B(str) ? 4 : 2) | (o0VarL.B(str2) ? 32 : 16) | (o0VarL.r(aVar) ? 256 : 128);
        if (o0VarL.n(i15 & 1, (i15 & 147) != 146)) {
            x1 x1Var = p3.n.f135158a;
            r.a aVar2 = r.S;
            d92.b.f58623a.getClass();
            d92.b.f58625c.getClass();
            r rVarY = c2.l.y(aVar2, j92.b.f97899b.f97920e);
            String strQ = y.Q(o0VarL, R.string.lbl_close);
            String strQ2 = y.Q(o0VarL, R.string.lbl_recommended_for_you);
            String strQ3 = y.Q(o0VarL, R.string.cross_sell_hermes_description);
            String strQ4 = y.Q(o0VarL, R.string.lbl_shop_now);
            String strA = t60.b.a(t60.a.HERMES_BANNER);
            Integer numValueOf = Integer.valueOf(R.string.default_image_view_content_description);
            boolean z14 = (i15 & 896) == 256;
            Object objQ = o0VarL.q();
            if (z14) {
                objQ = new defpackage.c(aVar, 4);
                o0VarL.K(objQ);
            } else {
                p3.m.f135153a.getClass();
                if (objQ == p3.m.a.f135155b) {
                    objQ = new defpackage.c(aVar, 4);
                    o0VarL.K(objQ);
                }
            }
            t60.f.b("RunningEconomy", rVarY, strQ, strQ2, str2, strQ3, str, strQ4, strA, numValueOf, (e23.a) objQ, o0VarL, ((i15 << 18) & 3670016) | ((i15 << 9) & 57344) | 6);
        } else {
            o0VarL.e();
        }
        p2 p2VarI0 = o0VarL.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new a(str, str2, aVar, i14, 0);
        }
    }
}
