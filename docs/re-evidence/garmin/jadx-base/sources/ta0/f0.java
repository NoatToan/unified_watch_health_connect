package ta0;

import com.garmin.android.apps.connectmobile.R;
import p005kotlin.Unit;
import p3.p2;
import p3.x1;

/* JADX INFO: loaded from: classes8.dex */
public final class f0 {
    public static final void a(e23.a<Unit> aVar, p3.m mVar, int i14) {
        int i15;
        p3.o0 o0Var;
        aVar.getClass();
        p3.o0 o0VarE = mVar.E(-587436375);
        if ((i14 & 6) == 0) {
            i15 = i14 | (o0VarE.r(aVar) ? 4 : 2);
        } else {
            i15 = i14;
        }
        if (o0VarE.n(i15 & 1, (i15 & 3) != 2)) {
            x1 x1Var = p3.n.f135158a;
            String strQ = gl1.y.Q(o0VarE, R.string.no_device_title);
            String strQ2 = gl1.y.Q(o0VarE, R.string.lbl_done);
            e.f163272a.getClass();
            o0Var = o0VarE;
            da0.p.b("device_discovery_device_not_found_screen", strQ, null, null, null, strQ2, aVar, false, null, null, false, null, null, false, false, aVar, null, null, null, null, null, e.f163273b, o0Var, ((i15 << 18) & 3670016) | 6, (i15 << 15) & 458752, 384, 4161436);
        } else {
            o0Var = o0VarE;
            o0Var.e();
        }
        p2 p2VarI0 = o0Var.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new at1.c(aVar, i14, 15);
        }
    }
}
