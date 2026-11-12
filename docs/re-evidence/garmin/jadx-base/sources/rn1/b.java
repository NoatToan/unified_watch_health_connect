package rn1;

import android.content.Context;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import com.garmin.android.apps.connectmobile.R;
import com.garmin.android.apps.connectmobile.charts.mpchart3.wrapper.CustomLineChart;
import com.github.mikephil.charting.components.YAxis;
import gl1.y;
import h4.r;
import jd0.z;
import m92.o;
import o4.m1;
import org.joda.time.LocalDate;
import p3.o0;
import p3.p2;
import p3.x1;

/* JADX INFO: loaded from: classes10.dex */
public final class b {
    public static final void a(mm1.b bVar, LocalDate localDate, LocalDate localDate2, p3.m mVar, int i14) {
        LocalDate localDate3;
        o0 o0Var;
        LocalDate localDate4 = localDate2;
        o0 o0VarE = mVar.E(1130170866);
        int i15 = (o0VarE.r(bVar) ? 4 : 2) | i14 | (o0VarE.r(localDate) ? 32 : 16) | (o0VarE.r(localDate4) ? 256 : 128);
        if (o0VarE.n(i15 & 1, (i15 & 147) != 146)) {
            x1 x1Var = p3.n.f135158a;
            String strQ = y.Q(o0VarE, R.string.msg_no_sleep_alignment_data);
            Context context = (Context) o0VarE.A(AndroidCompositionLocals_androidKt.f6042b);
            Object objQ = o0VarE.q();
            p3.m.f135153a.getClass();
            p3.m.a.C2565a c2565a = p3.m.a.f135155b;
            if (objQ == c2565a) {
                objQ = new CustomLineChart(context);
                o0VarE.K(objQ);
            }
            CustomLineChart customLineChart = (CustomLineChart) objQ;
            Object objQ2 = o0VarE.q();
            if (objQ2 == c2565a) {
                xm1.d dVar = new xm1.d(context, localDate, localDate4, true, true);
                YAxis axisLeft = customLineChart.getAxisLeft();
                axisLeft.getClass();
                localDate3 = localDate;
                xm1.b bVar2 = new xm1.b(customLineChart, customLineChart, axisLeft, new yz.k(true), localDate3, localDate2);
                localDate4 = localDate2;
                tz.a aVar = new tz.a(customLineChart, dVar, bVar2, new k00.k(customLineChart, false), new k00.g(customLineChart), null, 32, null);
                o0VarE.K(aVar);
                objQ2 = aVar;
            } else {
                localDate3 = localDate;
            }
            o0Var = o0VarE;
            o.a(u1.n.e(r.S, tn.k.b(d92.b.f58623a, o0VarE), m1.f128891a), null, null, null, z3.f.c(153073010, new qy0.d(customLineChart, bVar, (tz.a) objQ2, strQ, 8), o0VarE), null, z3.f.c(929320564, new a(bVar, 0), o0VarE), o0Var, 1597440, 46);
        } else {
            localDate3 = localDate;
            o0Var = o0VarE;
            o0Var.e();
        }
        p2 p2VarI0 = o0Var.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new z(bVar, localDate3, localDate4, i14);
        }
    }
}
