package oo0;

import android.content.Context;
import android.text.format.DateFormat;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import com.garmin.android.apps.connectmobile.R;
import com.garmin.android.apps.connectmobile.charts.mpchart3.wrapper.CustomLineChart;
import gl1.y;
import gs1.t;
import h4.r;
import ho0.l;
import m92.o;
import o4.m1;
import org.joda.time.DateTime;
import p3.m;
import p3.n;
import p3.o0;
import p3.p0;
import p3.p1;
import p3.p2;
import p3.x1;
import yz.k;

/* JADX INFO: loaded from: classes8.dex */
public final class g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final float f133125a;

    static {
        g6.f.a aVar = g6.f.f75994b;
        f133125a = 330;
    }

    /* JADX WARN: Code duplicated, block: B:46:0x0093  */
    /* JADX WARN: Multi-variable type inference failed */
    public static final void a(DateTime dateTime, t tVar, qo0.a aVar, m mVar, int i14) {
        int i15;
        o0 o0Var;
        String strJ;
        t tVar2 = tVar;
        aVar.getClass();
        o0 o0VarE = mVar.E(-1276693414);
        if ((i14 & 6) == 0) {
            i15 = (o0VarE.r(dateTime) ? 4 : 2) | i14;
        } else {
            i15 = i14;
        }
        if ((i14 & 48) == 0) {
            i15 |= (i14 & 64) == 0 ? o0VarE.B(tVar2) : o0VarE.r(tVar2) ? 32 : 16;
        }
        if ((i14 & 384) == 0) {
            i15 |= o0VarE.r(aVar) ? 256 : 128;
        }
        if (o0VarE.n(i15 & 1, (i15 & 147) != 146)) {
            x1 x1Var = n.f135158a;
            Context context = (Context) o0VarE.A(AndroidCompositionLocals_androidKt.f6042b);
            p1 p1VarC = s9.c.c(aVar.f145921f, o0VarE);
            boolean z14 = (i15 & 112) == 32 || ((i15 & 64) != 0 && o0VarE.B(tVar2));
            Object objQ = o0VarE.q();
            m.a aVar2 = m.f135153a;
            if (z14) {
                objQ = p0.n(Boolean.valueOf(df0.a.a(tVar2)));
                o0VarE.K(objQ);
            } else {
                aVar2.getClass();
                if (objQ == m.a.f135155b) {
                    objQ = p0.n(Boolean.valueOf(df0.a.a(tVar2)));
                    o0VarE.K(objQ);
                }
            }
            p1 p1Var = (p1) objQ;
            Object objQ2 = o0VarE.q();
            aVar2.getClass();
            m.a.C2565a c2565a = m.a.f135155b;
            if (objQ2 == c2565a) {
                objQ2 = new CustomLineChart(context);
                o0VarE.K(objQ2);
            }
            CustomLineChart customLineChart = (CustomLineChart) objQ2;
            Object objQ3 = o0VarE.q();
            if (objQ3 == c2565a) {
                objQ3 = !((qo0.d) p1VarC.getF182175a()).f145950d ? new bf0.d(context, new k(DateFormat.is24HourFormat(context))) : new bf0.a(context, new k(DateFormat.is24HourFormat(context)));
                o0VarE.K(objQ3);
            }
            bf0.a aVar3 = (bf0.a) objQ3;
            Object objQ4 = o0VarE.q();
            if (objQ4 == c2565a) {
                objQ4 = !((qo0.d) p1VarC.getF182175a()).f145950d ? new bf0.e(customLineChart, new l(aVar, 2)) : new bf0.g(customLineChart, new l(aVar, 3));
                o0VarE.K(objQ4);
            }
            qz.e eVar = (qz.e) objQ4;
            Object objQ5 = o0VarE.q();
            if (objQ5 == c2565a) {
                objQ5 = !((qo0.d) p1VarC.getF182175a()).f145950d ? new bf0.f(customLineChart) : new bf0.h(customLineChart);
                o0VarE.K(objQ5);
            }
            qz.f fVar = (qz.f) objQ5;
            Object objQ6 = o0VarE.q();
            if (objQ6 == c2565a) {
                tz.a aVar4 = new tz.a(customLineChart, aVar3, new bf0.c(customLineChart), eVar, fVar, null, 32, null);
                aVar4.c();
                o0VarE.K(aVar4);
                objQ6 = aVar4;
            }
            tz.a aVar5 = (tz.a) objQ6;
            String strP = y.P(R.string.common_no_certain_data, new Object[]{y.Q(o0VarE, R.string.device_screen_heart_rate)}, o0VarE);
            if (((qo0.d) p1VarC.getF182175a()).f145950d) {
                strJ = com.airbnb.lottie.animation.keyframe.a.j(o0VarE, -2035949408, R.string.lbl_daily_timeline, o0VarE, false);
            } else {
                o0VarE.C(-2036079639);
                o0VarE.g0(false);
                strJ = new pi0.e(context).j(dateTime, pi0.d.DATE_SHORT_MONTH_FOR_PAST_YEAR_SHOW_TODAY);
            }
            String str = strJ;
            String str2 = (tVar2 == null || tVar2.y()) ? false : true ? strP : "";
            r rVarE = u1.n.e(r.S, tn.k.b(d92.b.f58623a, o0VarE), m1.f128891a);
            dd1.d dVar = new dd1.d(dateTime, aVar, p1Var, tVar2, p1VarC, customLineChart, aVar5, strP, 15);
            tVar2 = tVar2;
            o0Var = o0VarE;
            o.a(rVarE, str, null, str2, z3.f.c(-1501955878, dVar, o0VarE), null, z3.f.c(1086881816, new f(0, tVar2, p1VarC), o0VarE), o0Var, 1597440, 36);
        } else {
            o0Var = o0VarE;
            o0Var.e();
        }
        p2 p2VarI0 = o0Var.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new mx.h(dateTime, tVar2, aVar, i14, 5);
        }
    }
}
