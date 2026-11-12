package di0;

import android.content.Context;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import com.garmin.android.apps.connectmobile.R;
import com.garmin.android.apps.connectmobile.charts.mpchart3.wrapper.CustomBarChart;
import com.google.maps.android.compose.u;
import gl1.y;
import m92.o;
import org.joda.time.LocalDate;
import p3.m;
import p3.n;
import p3.o0;
import p3.p2;
import p3.x1;

/* JADX INFO: loaded from: classes8.dex */
public final class d {
    public static final void a(LocalDate localDate, LocalDate localDate2, sh0.a aVar, xh0.c cVar, m mVar, int i14) {
        int i15;
        sh0.a aVar2;
        xh0.c cVar2;
        CustomBarChart customBarChart;
        Context context;
        cVar.getClass();
        o0 o0VarE = mVar.E(-769746712);
        if ((i14 & 6) == 0) {
            i15 = (o0VarE.r(localDate) ? 4 : 2) | i14;
        } else {
            i15 = i14;
        }
        if ((i14 & 48) == 0) {
            i15 |= o0VarE.r(localDate2) ? 32 : 16;
        }
        if ((i14 & 384) == 0) {
            i15 |= (i14 & 512) == 0 ? o0VarE.B(aVar) : o0VarE.r(aVar) ? 256 : 128;
        }
        if ((i14 & 3072) == 0) {
            i15 |= o0VarE.r(cVar) ? 2048 : 1024;
        }
        if (o0VarE.n(i15 & 1, (i15 & 1171) != 1170)) {
            x1 x1Var = n.f135158a;
            Context context2 = (Context) o0VarE.A(AndroidCompositionLocals_androidKt.f6042b);
            Object objQ = o0VarE.q();
            m.f135153a.getClass();
            m.a.C2565a c2565a = m.a.f135155b;
            if (objQ == c2565a) {
                objQ = new CustomBarChart(context2);
                o0VarE.K(objQ);
            }
            CustomBarChart customBarChart2 = (CustomBarChart) objQ;
            Object objQ2 = o0VarE.q();
            if (objQ2 == c2565a) {
                context = context2;
                cVar2 = cVar;
                customBarChart = customBarChart2;
                objQ2 = new rz.a(customBarChart, new yh0.a(context, localDate, localDate2, new pi0.e(context2), cVar), new yh0.b(customBarChart2, localDate, localDate2), new yh0.c(customBarChart2), new yh0.d(customBarChart2), null, 32, null);
                o0VarE.K(objQ2);
            } else {
                cVar2 = cVar;
                customBarChart = customBarChart2;
                context = context2;
            }
            aVar2 = aVar;
            o.a(null, y.Q(o0VarE, R.string.lbl_daily_totals), null, null, z3.f.c(1023722600, new d50.i(customBarChart, (rz.a) objQ2, aVar2, context, 4), o0VarE), null, z3.f.c(1269530474, new d81.h(6, aVar2, cVar2), o0VarE), o0VarE, 1597440, 45);
        } else {
            aVar2 = aVar;
            o0VarE.e();
        }
        p2 p2VarI0 = o0VarE.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new u(localDate, localDate2, aVar2, cVar, i14, 9);
        }
    }
}
