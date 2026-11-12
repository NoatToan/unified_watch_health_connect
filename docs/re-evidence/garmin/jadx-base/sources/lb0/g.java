package lb0;

import com.garmin.android.apps.connectmobile.R;
import gl1.y;
import h4.r;
import i3.mh;
import p3.m;
import p3.n;
import p3.o0;
import p3.p2;
import p3.x1;

/* JADX INFO: loaded from: classes8.dex */
public final class g {
    public static final void a(int i14, r rVar, String str, m mVar) {
        o0 o0Var;
        str.getClass();
        o0 o0VarE = mVar.E(1585148021);
        int i15 = (o0VarE.B(str) ? 4 : 2) | i14 | (o0VarE.B(rVar) ? 32 : 16);
        if (o0VarE.n(i15 & 1, (i15 & 19) != 18)) {
            x1 x1Var = n.f135158a;
            o0VarE.C(-1386136761);
            String strQ = str.length() == 0 ? y.Q(o0VarE, R.string.sleep_window_caption_do_not_disturb_and_settings_location) : str;
            o0VarE.g0(false);
            d92.b.f58623a.getClass();
            d92.b.f58624b.getClass();
            o0Var = o0VarE;
            mh.c(strQ, rVar, 0L, null, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, d92.c.b(j92.f.f97933j, o0VarE), o0Var, i15 & 112, 0, 131068);
        } else {
            o0Var = o0VarE;
            o0Var.e();
        }
        p2 p2VarI0 = o0Var.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new cq.g(str, rVar, i14, 3);
        }
    }
}
