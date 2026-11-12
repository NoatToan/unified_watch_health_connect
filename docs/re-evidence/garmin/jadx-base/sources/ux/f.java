package ux;

import android.content.Context;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import com.garmin.android.apps.connectmobile.R;
import com.garmin.android.apps.connectmobile.charts.mpchart3.wrapper.CustomLineChart;
import com.github.mikephil.charting.components.YAxis;
import gl1.y;
import java.util.List;
import k00.g;
import m92.o;
import org.joda.time.LocalDate;
import p3.m;
import p3.n;
import p3.o0;
import p3.p2;
import p3.x1;
import tb0.h;

/* JADX INFO: loaded from: classes7.dex */
public final class f {
    public static final void a(int i14, List list, LocalDate localDate, LocalDate localDate2, m mVar) {
        o0 o0Var;
        o0 o0VarE = mVar.E(351738579);
        int i15 = i14 | (o0VarE.r(list) ? 4 : 2) | (o0VarE.r(localDate) ? 32 : 16) | (o0VarE.r(localDate2) ? 256 : 128);
        if (o0VarE.n(i15 & 1, (i15 & 147) != 146)) {
            x1 x1Var = n.f135158a;
            Context context = (Context) o0VarE.A(AndroidCompositionLocals_androidKt.f6042b);
            Object objQ = o0VarE.q();
            m.f135153a.getClass();
            m.a.C2565a c2565a = m.a.f135155b;
            if (objQ == c2565a) {
                objQ = new CustomLineChart(context);
                o0VarE.K(objQ);
            }
            CustomLineChart customLineChart = (CustomLineChart) objQ;
            Object objQ2 = o0VarE.q();
            if (objQ2 == c2565a) {
                Context context2 = customLineChart.getContext();
                context2.getClass();
                lx.a aVar = new lx.a(context2, localDate, localDate2);
                YAxis axisLeft = customLineChart.getAxisLeft();
                axisLeft.getClass();
                tz.a aVar2 = new tz.a(customLineChart, aVar, new lx.b(customLineChart, customLineChart, axisLeft, new yz.e(), localDate, localDate2), new k00.m(customLineChart), new g(customLineChart), null, 32, null);
                o0VarE.K(aVar2);
                objQ2 = aVar2;
            }
            tz.a aVar3 = (tz.a) objQ2;
            String strQ = y.Q(o0VarE, R.string.lbl_no_data_available_for_this_range);
            o0Var = o0VarE;
            o.a(null, y.Q(o0VarE, R.string.lbl_daily_values), null, (list == null || !list.isEmpty()) ? null : strQ, z3.f.c(292233043, new e(customLineChart, aVar3, list, strQ, 0), o0VarE), null, null, o0Var, 24576, 101);
        } else {
            o0Var = o0VarE;
            o0Var.e();
        }
        p2 p2VarI0 = o0Var.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new h(list, localDate, localDate2, i14, 18);
        }
    }
}
