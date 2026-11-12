package kh0;

import android.content.Context;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import c2.x2;
import com.garmin.android.apps.connectmobile.R;
import com.garmin.android.apps.connectmobile.charts.mpchart3.wrapper.CustomLineChart;
import com.github.mikephil.charting.components.YAxis;
import com.google.android.exoplayer2.extractor.ts.PsExtractor;
import f5.z0;
import gl1.y;
import h5.e0;
import i3.mh;
import java.util.List;
import o4.m1;
import org.joda.time.DateTime;
import p3.b4;
import p3.i2;
import p3.o0;
import p3.p0;
import p3.p2;
import p3.x1;
import s5.x0;

/* JADX INFO: loaded from: classes8.dex */
public final class a {
    public static final void a(List<dh0.i> list, DateTime dateTime, DateTime dateTime2, boolean z14, int i14, p3.m mVar, int i15) {
        int i16;
        int i17;
        List<dh0.i> list2;
        o0 o0Var;
        CustomLineChart customLineChart;
        o0 o0VarE = mVar.E(-1196907323);
        if ((i15 & 6) == 0) {
            i16 = (o0VarE.r(list) ? 4 : 2) | i15;
        } else {
            i16 = i15;
        }
        if ((i15 & 48) == 0) {
            i16 |= o0VarE.r(dateTime) ? 32 : 16;
        }
        if ((i15 & 384) == 0) {
            i16 |= o0VarE.r(dateTime2) ? 256 : 128;
        }
        if ((i15 & 3072) == 0) {
            i16 |= o0VarE.h(z14) ? 2048 : 1024;
        }
        if ((i15 & 24576) == 0) {
            i17 = i14;
            i16 |= o0VarE.k(i17) ? 16384 : 8192;
        } else {
            i17 = i14;
        }
        if (o0VarE.n(i16 & 1, (i16 & 9363) != 9362)) {
            x1 x1Var = p3.n.f135158a;
            Context context = (Context) o0VarE.A(AndroidCompositionLocals_androidKt.f6042b);
            Object objQ = o0VarE.q();
            p3.m.f135153a.getClass();
            p3.m.a.C2565a c2565a = p3.m.a.f135155b;
            if (objQ == c2565a) {
                objQ = new CustomLineChart(context);
                o0VarE.K(objQ);
            }
            CustomLineChart customLineChart2 = (CustomLineChart) objQ;
            Object objQ2 = o0VarE.q();
            if (objQ2 == c2565a) {
                Context context2 = customLineChart2.getContext();
                context2.getClass();
                jh0.a aVar = new jh0.a(context2, dateTime, dateTime2, z14, i17);
                YAxis axisLeft = customLineChart2.getAxisLeft();
                axisLeft.getClass();
                customLineChart = customLineChart2;
                objQ2 = new tz.a(customLineChart2, aVar, new k00.i(customLineChart, customLineChart2, axisLeft, new yz.e(), dateTime, dateTime2, z14), new k00.j(customLineChart), new k00.g(customLineChart), null, 32, null);
                o0VarE.K(objQ2);
            } else {
                customLineChart = customLineChart2;
            }
            tz.a aVar2 = (tz.a) objQ2;
            h4.r.a aVar3 = h4.r.S;
            h4.r rVarE = u1.n.e(x2.f(aVar3, 1.0f), tn.k.b(d92.b.f58623a, o0VarE), m1.f128891a);
            h4.d.f81522a.getClass();
            h4.g gVar = h4.d.a.f81524b;
            z0 z0VarD = c2.q.d(gVar, false);
            int iHashCode = Long.hashCode(o0VarE.U);
            i2 i2VarA0 = o0VarE.a0();
            h4.r rVarC = h4.k.c(rVarE, o0VarE);
            h5.g.V.getClass();
            e0.a aVar4 = h5.g.a.f81805b;
            if (o0VarE.f135177b == null) {
                p0.l();
                throw null;
            }
            o0VarE.z();
            if (o0VarE.T) {
                o0VarE.M(aVar4);
            } else {
                o0VarE.c();
            }
            b4.c(h5.g.a.f81810g, z0VarD, o0VarE);
            b4.c(h5.g.a.f81809f, i2VarA0, o0VarE);
            h5.g.a.b bVar = h5.g.a.f81813j;
            if (o0VarE.T || !p005kotlin.jvm.internal.s.g(o0VarE.q(), Integer.valueOf(iHashCode))) {
                v.h.A(iHashCode, o0VarE, iHashCode, bVar);
            }
            b4.c(h5.g.a.f81807d, rVarC, o0VarE);
            c2.u uVar = c2.u.f22885a;
            String strQ = y.Q(o0VarE, z14 ? R.string.common_lbl_daily_totals : R.string.common_lbl_weekly_totals);
            d92.b.f58624b.getClass();
            x0 x0VarB = d92.c.b(d92.c.e(j92.f.f97931h), o0VarE);
            g6.f.a aVar5 = g6.f.f75994b;
            float f14 = 16;
            CustomLineChart customLineChart3 = customLineChart;
            mh.c(strQ, uVar.c(c2.l.C(aVar3, 24, 20, 0.0f, f14, 4), gVar), 0L, null, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, x0VarB, o0VarE, 0, 0, 131068);
            h4.r rVarF = x2.f(x2.h(c2.l.C(aVar3, f14, 0.0f, f14, f14, 2), PsExtractor.VIDEO_STREAM_MASK), 1.0f);
            boolean zR = o0VarE.r(customLineChart3);
            Object objQ3 = o0VarE.q();
            if (zR || objQ3 == c2565a) {
                objQ3 = new b40.a(customLineChart3, 4);
                o0VarE.K(objQ3);
            }
            e23.l lVar = (e23.l) objQ3;
            list2 = list;
            boolean zR2 = o0VarE.r(aVar2) | o0VarE.r(list2) | o0VarE.r(customLineChart3);
            Object objQ4 = o0VarE.q();
            if (zR2 || objQ4 == c2565a) {
                objQ4 = new k62.k(aVar2, 4, list2, customLineChart3);
                o0VarE.K(objQ4);
            }
            p002j6.c.b(lVar, rVarF, (e23.l) objQ4, o0VarE, 48, 0);
            o0Var = o0VarE;
            o0Var.g0(true);
        } else {
            list2 = list;
            o0Var = o0VarE;
            o0Var.e();
        }
        p2 p2VarI0 = o0Var.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new aa2.g(list2, dateTime, dateTime2, z14, i14, i15, 12);
        }
    }
}
