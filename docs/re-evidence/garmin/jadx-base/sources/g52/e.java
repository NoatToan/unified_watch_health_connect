package g52;

import android.content.Context;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import com.garmin.android.apps.connectmobile.R;
import com.garmin.android.apps.connectmobile.charts.mpchart3.wrapper.CustomBarChart;
import gl1.y;
import org.joda.time.LocalDate;
import p3.o0;
import p3.p2;
import p3.x1;

/* JADX INFO: loaded from: classes10.dex */
public final class e {
    public static final void a(LocalDate localDate, LocalDate localDate2, z42.d dVar, o82.g gVar, p3.m mVar, int i14) {
        o82.g gVar2;
        LocalDate localDate3 = localDate;
        LocalDate localDate4 = localDate2;
        gVar.getClass();
        o0 o0VarE = mVar.E(1390197514);
        int i15 = i14 | (o0VarE.r(localDate3) ? 4 : 2) | (o0VarE.r(localDate4) ? 32 : 16) | (o0VarE.r(dVar) ? 256 : 128) | (o0VarE.k(gVar.ordinal()) ? 2048 : 1024);
        if (o0VarE.n(i15 & 1, (i15 & 1171) != 1170)) {
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
                h52.a aVar = new h52.a(context, new d52.e(context), new pi0.e(context), localDate3, localDate2);
                context = context;
                localDate3 = localDate3;
                localDate4 = localDate2;
                rz.a aVar2 = new rz.a(customBarChart, aVar, new h52.b(customBarChart, localDate3, localDate4), new h52.f(customBarChart), null, null, 48, null);
                o0VarE.K(aVar2);
                objQ2 = aVar2;
            }
            gVar2 = gVar;
            m92.o.a(null, y.Q(o0VarE, R.string.lbl_daily_totals), null, null, z3.f.c(1153171338, new a42.c(customBarChart, (rz.a) objQ2, localDate3, localDate4, dVar, context, 23), o0VarE), null, z3.f.c(183280840, new b(dVar, gVar2), o0VarE), o0VarE, 1597440, 45);
        } else {
            gVar2 = gVar;
            o0VarE.e();
        }
        p2 p2VarI0 = o0VarE.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new d(localDate, localDate2, dVar, gVar2, i14, 0);
        }
    }
}
