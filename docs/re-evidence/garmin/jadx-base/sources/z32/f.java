package z32;

import com.garmin.android.apps.connectmobile.R;
import gl1.y;
import h4.r;
import m92.o;
import org.joda.time.DateTime;
import p3.m;
import p3.n;
import p3.o0;
import p3.p2;
import p3.x1;

/* JADX INFO: loaded from: classes10.dex */
public final class f {
    public static final void a(i53.d dVar, r rVar, DateTime dateTime, DateTime dateTime2, m mVar, int i14) {
        o0 o0VarE = mVar.E(-706619302);
        int i15 = i14 | (o0VarE.B(dVar) ? 4 : 2) | (o0VarE.B(rVar) ? 32 : 16) | (o0VarE.r(dateTime) ? 256 : 128) | (o0VarE.r(dateTime2) ? 2048 : 1024);
        if (o0VarE.n(i15 & 1, (i15 & 1171) != 1170)) {
            x1 x1Var = n.f135158a;
            o.a(null, y.Q(o0VarE, R.string.lbl_vo2_max), null, null, z3.f.c(-1683717158, new jd0.y(rVar, dVar, dateTime, dateTime2), o0VarE), null, null, o0VarE, 24576, 109);
        } else {
            o0VarE.e();
        }
        p2 p2VarI0 = o0VarE.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new jd0.y(dVar, rVar, dateTime, dateTime2, i14);
        }
    }
}
