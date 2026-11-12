package mw1;

import com.garmin.android.apps.connectmobile.R;
import gl1.y;
import h4.r;
import l72.p2;
import p3.m;
import p3.n;
import p3.o0;
import p3.x1;

/* JADX INFO: loaded from: classes10.dex */
public final class a {
    public static final void a(int i14, int i15, e23.a aVar, r rVar, m mVar) {
        int i16;
        o0 o0Var;
        aVar.getClass();
        o0 o0VarE = mVar.E(-1904273184);
        int i17 = (o0VarE.B(rVar) ? 4 : 2) | i15;
        if ((i15 & 48) == 0) {
            i16 = i14;
            i17 |= o0VarE.k(i16) ? 32 : 16;
        } else {
            i16 = i14;
        }
        if ((i15 & 384) == 0) {
            i17 |= o0VarE.r(aVar) ? 256 : 128;
        }
        if (o0VarE.n(i17 & 1, (i17 & 147) != 146)) {
            x1 x1Var = n.f135158a;
            o0Var = o0VarE;
            p2.f111205a.h(y.Q(o0VarE, R.string.lbl_completed_plans), String.valueOf(i16), null, rVar, null, false, false, null, null, null, aVar, o0Var, (i17 << 9) & 7168, (i17 >> 6) & 14, 1012);
        } else {
            o0Var = o0VarE;
            o0Var.e();
        }
        p3.p2 p2VarI0 = o0Var.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new dj0.b(rVar, i16, aVar, i15, 1);
        }
    }
}
