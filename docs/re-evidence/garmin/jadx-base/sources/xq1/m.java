package xq1;

import android.content.Context;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import com.garmin.android.apps.connectmobile.R;
import com.garmin.android.apps.connectmobile.charts.mpchart3.wrapper.CustomBarChart;
import m92.o;
import org.joda.time.LocalDate;
import p3.n;
import p3.o0;
import p3.p0;
import p3.p1;
import p3.p2;
import p3.x1;
import ta0.g0;

/* JADX INFO: loaded from: classes10.dex */
public final class m {

    public static final /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f191938a;

        static {
            int[] iArr = new int[yd1.b.values().length];
            try {
                iArr[yd1.b.MONTHLY.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            f191938a = iArr;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final void a(jq1.i iVar, LocalDate localDate, LocalDate localDate2, yd1.b bVar, p3.m mVar, int i14) {
        int i15;
        o0 o0Var;
        rz.a aVar;
        LocalDate localDate3 = localDate;
        LocalDate localDate4 = localDate2;
        bVar.getClass();
        o0 o0VarE = mVar.E(1162999766);
        if ((i14 & 6) == 0) {
            i15 = ((i14 & 8) == 0 ? o0VarE.B(iVar) : o0VarE.r(iVar) ? 4 : 2) | i14;
        } else {
            i15 = i14;
        }
        if ((i14 & 48) == 0) {
            i15 |= o0VarE.r(localDate3) ? 32 : 16;
        }
        if ((i14 & 384) == 0) {
            i15 |= o0VarE.r(localDate4) ? 256 : 128;
        }
        if (o0VarE.n(i15 & 1, (i15 & 1171) != 1170)) {
            x1 x1Var = n.f135158a;
            Context context = (Context) o0VarE.A(AndroidCompositionLocals_androidKt.f6042b);
            Object objQ = o0VarE.q();
            p3.m.f135153a.getClass();
            p3.m.a.C2565a c2565a = p3.m.a.f135155b;
            if (objQ == c2565a) {
                objQ = p0.n(new pq1.d(context));
                o0VarE.K(objQ);
            }
            p1 p1Var = (p1) objQ;
            Object objQ2 = o0VarE.q();
            if (objQ2 == c2565a) {
                objQ2 = p0.n(new CustomBarChart(context));
                o0VarE.K(objQ2);
            }
            p1 p1Var2 = (p1) objQ2;
            Object objQ3 = o0VarE.q();
            if (objQ3 == c2565a) {
                CustomBarChart customBarChart = (CustomBarChart) p1Var2.getF182175a();
                if (a.f191938a[bVar.ordinal()] == 1) {
                    uq1.c cVar = new uq1.c(context, new pq1.d(context), new pi0.e(context), localDate3, localDate4);
                    localDate3 = localDate3;
                    localDate4 = localDate4;
                    aVar = new rz.a(customBarChart, cVar, new uq1.d(customBarChart, localDate3, localDate4), new uq1.e(customBarChart), null, null, 48, null);
                } else {
                    uq1.f fVar = new uq1.f(context, new pq1.d(context), new pi0.e(context), localDate3, localDate4);
                    localDate3 = localDate3;
                    localDate4 = localDate4;
                    aVar = new rz.a(customBarChart, fVar, new uq1.g(customBarChart, localDate3, localDate4), new uq1.e(customBarChart), null, null, 48, null);
                }
                objQ3 = p0.n(aVar);
                o0VarE.K(objQ3);
            }
            o0Var = o0VarE;
            o.a(null, bVar == yd1.b.MONTHLY ? com.airbnb.lottie.animation.keyframe.a.j(o0VarE, -574610012, R.string.lbl_monthly_totals, o0VarE, false) : com.airbnb.lottie.animation.keyframe.a.j(o0VarE, -574532667, R.string.lbl_weekly_totals, o0VarE, false), null, null, z3.f.c(-1236237482, new g0(iVar, localDate3, localDate4, p1Var2, (p1) objQ3, p1Var, 16), o0VarE), null, z3.f.c(1783806168, new w21.d(iVar, localDate, localDate2, bVar, 28), o0VarE), o0Var, 1597440, 45);
        } else {
            o0Var = o0VarE;
            o0Var.e();
        }
        p2 p2VarI0 = o0Var.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new k(iVar, localDate, localDate2, bVar, i14, 1);
        }
    }
}
