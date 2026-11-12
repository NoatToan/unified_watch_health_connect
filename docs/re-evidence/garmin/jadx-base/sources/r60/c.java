package r60;

import android.content.Context;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import com.garmin.android.apps.connectmobile.R;
import com.garmin.android.apps.connectmobile.charts.mpchart3.wrapper.CustomLineChart;
import gl1.y;
import m92.o;
import o82.g;
import org.joda.time.LocalDate;
import p3.m;
import p3.n;
import p3.o0;
import p3.p2;
import p3.x1;
import pi0.e;
import z3.f;

/* JADX INFO: loaded from: classes8.dex */
public final class c {

    public static final /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f151009a;

        static {
            int[] iArr = new int[g.values().length];
            try {
                iArr[g.f130851d.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[g.f130854g.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            f151009a = iArr;
        }
    }

    public static final void a(LocalDate localDate, LocalDate localDate2, g gVar, n60.b bVar, m mVar, int i14) {
        tz.a aVar;
        gVar.getClass();
        o0 o0VarE = mVar.E(-1243435);
        int i15 = i14 | (o0VarE.r(localDate) ? 4 : 2) | (o0VarE.r(localDate2) ? 32 : 16) | (o0VarE.k(gVar.ordinal()) ? 256 : 128) | (o0VarE.r(bVar) ? 2048 : 1024);
        if (o0VarE.n(i15 & 1, (i15 & 1171) != 1170)) {
            x1 x1Var = n.f135158a;
            Context context = (Context) o0VarE.A(AndroidCompositionLocals_androidKt.f6042b);
            Object objQ = o0VarE.q();
            m.f135153a.getClass();
            if (objQ == m.a.f135155b) {
                objQ = new CustomLineChart(context);
                o0VarE.K(objQ);
            }
            CustomLineChart customLineChart = (CustomLineChart) objQ;
            Context context2 = customLineChart.getContext();
            int[] iArr = a.f151009a;
            int i16 = iArr[gVar.ordinal()];
            if (i16 == 1) {
                context2.getClass();
                aVar = new tz.a(customLineChart, new i60.c(context2, new j60.a(localDate, localDate2, new e(context2)), gVar), new j60.b(customLineChart, localDate, localDate2), new i60.e(customLineChart), new k00.g(customLineChart), null, 32, null);
            } else if (i16 != 2) {
                context2.getClass();
                aVar = new tz.a(customLineChart, new i60.c(context2, new k60.c(localDate, localDate2, new e(context2)), gVar), new k60.a(customLineChart, localDate, localDate2), new i60.e(customLineChart), new k00.g(customLineChart), null, 32, null);
            } else {
                context2.getClass();
                aVar = new tz.a(customLineChart, new i60.c(context2, new k60.c(localDate, localDate2, new e(context2)), gVar), new k60.b(customLineChart, localDate, localDate2), new i60.e(customLineChart), new k00.g(customLineChart), null, 32, null);
            }
            aVar.f167284a.getAxisLeft().setInverted(true);
            String strP = y.P(R.string.common_no_certain_data, new Object[]{y.Q(o0VarE, R.string.lbl_css)}, o0VarE);
            o.a(null, iArr[gVar.ordinal()] == 1 ? com.airbnb.lottie.animation.keyframe.a.j(o0VarE, -1194921857, R.string.lbl_daily_results, o0VarE, false) : com.airbnb.lottie.animation.keyframe.a.j(o0VarE, -1194919680, R.string.lbl_weekly_results, o0VarE, false), null, null, f.c(972884821, new qy0.d(customLineChart, aVar, bVar, strP, 4), o0VarE), null, null, o0VarE, 24576, 109);
        } else {
            o0VarE.e();
        }
        p2 p2VarI0 = o0VarE.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new qy0.d(localDate, localDate2, gVar, bVar, i14, 5);
        }
    }
}
