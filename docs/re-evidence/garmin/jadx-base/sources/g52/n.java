package g52;

import android.content.Context;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import com.garmin.android.apps.connectmobile.R;
import com.garmin.android.apps.connectmobile.charts.mpchart3.wrapper.CustomBarChart;
import org.joda.time.LocalDate;
import p3.o0;
import p3.p2;
import p3.x1;

/* JADX INFO: loaded from: classes10.dex */
public final class n {
    public static final void a(z42.i iVar, LocalDate localDate, LocalDate localDate2, int i14, p3.m mVar, int i15) {
        o0 o0Var;
        z42.i iVar2 = iVar;
        LocalDate localDate3 = localDate2;
        o0 o0VarE = mVar.E(1912873755);
        int i16 = i15 | (o0VarE.r(iVar2) ? 4 : 2) | (o0VarE.r(localDate) ? 32 : 16) | (o0VarE.r(localDate3) ? 256 : 128);
        if (o0VarE.n(i16 & 1, (i16 & 1171) != 1170)) {
            x1 x1Var = p3.n.f135158a;
            Context context = (Context) o0VarE.A(AndroidCompositionLocals_androidKt.f6042b);
            Object objQ = o0VarE.q();
            p3.m.f135153a.getClass();
            p3.m.a.C2565a c2565a = p3.m.a.f135155b;
            if (objQ == c2565a) {
                objQ = new CustomBarChart(context);
                o0VarE.K(objQ);
            }
            CustomBarChart customBarChart = (CustomBarChart) objQ;
            Object objQ2 = o0VarE.q();
            if (objQ2 == c2565a) {
                rz.a aVar = i14 == 13 ? new rz.a(customBarChart, new h52.g(context, new d52.e(context), new pi0.e(context), localDate, localDate3), new h52.h(customBarChart, localDate, localDate3), new h52.f(customBarChart), null, null, 48, null) : new rz.a(customBarChart, new h52.c(context, new d52.e(context), new pi0.e(context), localDate, localDate3), new h52.d(customBarChart, localDate, localDate3), new h52.f(customBarChart), null, null, 48, null);
                o0VarE.K(aVar);
                objQ2 = aVar;
            }
            rz.a aVar2 = (rz.a) objQ2;
            String strJ = i14 == 13 ? com.airbnb.lottie.animation.keyframe.a.j(o0VarE, 796387584, R.string.lbl_weekly_totals, o0VarE, false) : com.airbnb.lottie.animation.keyframe.a.j(o0VarE, 796463999, R.string.lbl_monthly_totals, o0VarE, false);
            a42.c cVar = new a42.c(customBarChart, aVar2, localDate, localDate2, iVar2, context, 25);
            localDate3 = localDate2;
            iVar2 = iVar2;
            o0Var = o0VarE;
            m92.o.a(null, strJ, null, null, z3.f.c(-537106533, cVar, o0VarE), null, z3.f.c(1827358937, new l(iVar2, localDate, localDate3, i14), o0VarE), o0Var, 1597440, 45);
        } else {
            o0Var = o0VarE;
            o0Var.e();
        }
        p2 p2VarI0 = o0Var.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new l(iVar2, localDate, localDate3, i14, i15, 2);
        }
    }
}
