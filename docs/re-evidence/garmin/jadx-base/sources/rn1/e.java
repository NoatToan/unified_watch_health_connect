package rn1;

import android.content.Context;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import c2.x2;
import com.garmin.android.apps.connectmobile.R;
import gl1.y;
import h4.r;
import m92.o;
import org.joda.time.LocalDate;
import p3.o0;
import p3.p2;
import p3.x1;
import rk0.a1;

/* JADX INFO: loaded from: classes10.dex */
public final class e {
    public static final void a(mm1.f fVar, LocalDate localDate, LocalDate localDate2, p3.m mVar, int i14) {
        o0 o0VarE = mVar.E(-1659250236);
        int i15 = (o0VarE.r(fVar) ? 4 : 2) | i14 | (o0VarE.r(localDate) ? 32 : 16) | (o0VarE.r(localDate2) ? 256 : 128);
        if (o0VarE.n(i15 & 1, (i15 & 147) != 146)) {
            x1 x1Var = p3.n.f135158a;
            b10.d dVar = new b10.d((Context) o0VarE.A(AndroidCompositionLocals_androidKt.f6042b));
            String strQ = y.Q(o0VarE, R.string.msg_no_sleep_consistency_data);
            mm1.e overallStats = fVar != null ? fVar.getOverallStats() : null;
            r.a aVar = r.S;
            d92.b.f58623a.getClass();
            d92.b.f58625c.getClass();
            c2.l.f(x2.h(aVar, j92.b.f97899b.f97920e), o0VarE);
            o.a(null, y.Q(o0VarE, R.string.lbl_sleep_consistency), null, null, z3.f.c(-1834533308, new ob0.e(localDate, localDate2, fVar, overallStats, strQ, 19), o0VarE), null, z3.f.c(-210313470, new a1(1, overallStats, dVar), o0VarE), o0VarE, 1597440, 45);
        } else {
            o0VarE.e();
        }
        p2 p2VarI0 = o0VarE.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new d(fVar, localDate, localDate2, i14, 0);
        }
    }
}
