package tw;

import android.content.Context;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import c2.b0;
import c2.j;
import c2.q;
import c2.t0;
import c2.u;
import c2.x2;
import c2.z;
import com.garmin.android.apps.connectmobile.R;
import com.github.mikephil.chartingv2.charts.CombinedChart;
import com.github.mikephil.chartingv2.components.Legend;
import com.github.mikephil.chartingv2.components.XAxis;
import com.github.mikephil.chartingv2.components.YAxis;
import f2.q0;
import f5.z0;
import gl1.y;
import h4.k;
import h4.r;
import h5.e0;
import i3.mh;
import java.util.List;
import kw.i;
import kw.l;
import org.joda.time.DateTime;
import org.joda.time.Days;
import p005kotlin.jvm.internal.s;
import p3.b4;
import p3.i2;
import p3.m;
import p3.n;
import p3.o0;
import p3.p0;
import p3.p1;
import p3.p2;
import p3.x1;
import s5.x0;
import t21.v0;

/* JADX INFO: loaded from: classes7.dex */
public final class h {
    /* JADX WARN: Code duplicated, block: B:102:0x039d  */
    /* JADX WARN: Code duplicated, block: B:105:0x03c7  */
    /* JADX WARN: Code duplicated, block: B:107:0x0413  */
    /* JADX WARN: Code duplicated, block: B:114:0x0433  */
    /* JADX WARN: Code duplicated, block: B:115:0x0465  */
    /* JADX WARN: Code duplicated, block: B:117:0x0472  */
    /* JADX WARN: Code duplicated, block: B:84:0x02ad  */
    /* JADX WARN: Code duplicated, block: B:86:0x02b4  */
    /* JADX WARN: Code duplicated, block: B:87:0x02b8  */
    /* JADX WARN: Code duplicated, block: B:92:0x02d3  */
    /* JADX WARN: Code duplicated, block: B:96:0x036e  */
    /* JADX WARN: Multi-variable type inference failed */
    public static final void a(i iVar, DateTime dateTime, DateTime dateTime2, boolean z14, m mVar, int i14) {
        int i15;
        boolean z15;
        String strP;
        String str;
        h5.g.a.f fVar;
        h4.g gVar;
        z0 z0VarD;
        int iHashCode;
        i2 i2VarA0;
        int i16;
        r rVarC;
        u uVar;
        j92.f fVar2;
        float f14;
        float f15;
        boolean zR;
        Object objQ;
        boolean zR2;
        Object objQ2;
        boolean z16;
        float f16;
        kw.h hVar;
        iVar = iVar;
        o0 o0VarE = mVar.E(-729862820);
        p3.c<?> cVar = o0VarE.f135177b;
        if ((i14 & 6) == 0) {
            i15 = (o0VarE.r(iVar) ? 4 : 2) | i14;
        } else {
            i15 = i14;
        }
        if ((i14 & 48) == 0) {
            i15 |= o0VarE.r(dateTime) ? 32 : 16;
        }
        if ((i14 & 384) == 0) {
            i15 |= o0VarE.r(dateTime2) ? 256 : 128;
        }
        if ((i14 & 3072) == 0) {
            i15 |= o0VarE.h(z14) ? 2048 : 1024;
        }
        if (o0VarE.n(i15 & 1, (i15 & 1171) != 1170)) {
            x1 x1Var = n.f135158a;
            Context context = (Context) o0VarE.A(AndroidCompositionLocals_androidKt.f6042b);
            Object objQ3 = o0VarE.q();
            m.f135153a.getClass();
            m.a.C2565a c2565a = m.a.f135155b;
            if (objQ3 == c2565a) {
                objQ3 = new oz.a(context);
                o0VarE.K(objQ3);
            }
            oz.a aVar = (oz.a) objQ3;
            Object objQ4 = o0VarE.q();
            if (objQ4 == c2565a) {
                objQ4 = new sw.g(aVar);
                o0VarE.K(objQ4);
            }
            sw.g gVar2 = (sw.g) objQ4;
            oz.a aVar2 = gVar2.f161055d;
            aVar2.getClass();
            gVar2.f80358c = aVar2;
            gVar2.a().setExtraTopOffset(53.600002f);
            gVar2.a().setExtraBottomOffset(26.400002f);
            gVar2.a().setDescription("");
            Context context2 = gVar2.f80356a;
            YAxis axisLeft = gVar2.a().getAxisLeft();
            if (axisLeft != null) {
                axisLeft.setPosition(YAxis.YAxisLabelPosition.OUTSIDE_CHART);
                axisLeft.setTextSize(10.0f);
                axisLeft.setDrawGridLines(true);
                axisLeft.setDrawAxisLine(false);
                axisLeft.setTextColor(a7.b.getColor(context2, R.color.secondary_text));
                axisLeft.setTypeface(h22.a.a("font/roboto_regular.ttf", context2));
                axisLeft.setDrawLimitLinesBehindData(false);
                axisLeft.setLabelCount(gVar2.f80357b, true);
            }
            XAxis xAxis = gVar2.a().getXAxis();
            if (xAxis != null) {
                xAxis.setPosition(XAxis.XAxisPosition.BOTTOM);
                xAxis.setTextSize(10.0f);
                xAxis.setYOffset(10.0f);
                xAxis.setTextColor(a7.b.getColor(context2, R.color.secondary_text));
                xAxis.setTypeface(h22.a.a("font/roboto_regular.ttf", context2));
                z15 = false;
                xAxis.setDrawGridLines(false);
            } else {
                z15 = false;
            }
            gVar2.a().setExtraTopOffset(90.0f);
            YAxis axisRight = gVar2.a().getAxisRight();
            if (axisRight != null) {
                axisRight.setEnabled(z15);
            }
            gVar2.a().setDrawOrder(new CombinedChart.DrawOrder[]{CombinedChart.DrawOrder.CANDLE});
            Legend legend = gVar2.a().getLegend();
            if (legend != null) {
                legend.setEnabled(z15);
            }
            oz.a aVarA = gVar2.a();
            String string = aVar2.getContext().getString(R.string.lbl_empty_string);
            string.getClass();
            aVarA.setNoDataText(string);
            oz.a aVarA2 = gVar2.a();
            aVarA2.setScaleEnabled(z15);
            aVarA2.setPinchZoom(z15);
            aVarA2.setTouchEnabled(z15);
            aVarA2.setDoubleTapToZoomEnabled(z15);
            aVarA2.setScaleYEnabled(z15);
            aVarA2.setScaleXEnabled(z15);
            aVarA2.setHighlightPerDragEnabled(z15);
            aVarA2.setHighlightPerTapEnabled(z15);
            oz.a aVarA3 = gVar2.a();
            aVarA3.setTouchEnabled(true);
            aVarA3.setPinchZoom(z15);
            aVarA3.setScaleEnabled(z15);
            aVarA3.setDoubleTapToZoomEnabled(z15);
            aVarA3.setScaleYEnabled(z15);
            aVarA3.setScaleXEnabled(z15);
            aVarA3.setHighlightPerDragEnabled(z15);
            aVarA3.setHighlightPerTapEnabled(z15);
            aVarA3.setHighlighter(new kz.a(aVarA3));
            aVarA3.setOnChartGestureListener(new sw.h(aVarA3));
            Object objQ5 = o0VarE.q();
            if (objQ5 == c2565a) {
                objQ5 = p0.n(Boolean.FALSE);
                o0VarE.K(objQ5);
            }
            p1 p1Var = (p1) objQ5;
            if (z14) {
                strP = com.airbnb.lottie.animation.keyframe.a.j(o0VarE, 2076633188, R.string.lbl_weekly_ranges, o0VarE, false);
            } else if (Days.daysBetween(dateTime, dateTime2).getDays() > 6) {
                o0VarE.C(2076751546);
                strP = y.P(R.string.lbl_named_readings, new Object[]{y.Q(o0VarE, R.string.common_monthly)}, o0VarE);
                o0VarE.g0(false);
            } else {
                o0VarE.C(2076864603);
                strP = y.P(R.string.lbl_named_readings, new Object[]{y.Q(o0VarE, R.string.common_weekly)}, o0VarE);
                o0VarE.g0(false);
            }
            int i17 = z14 ? 5 : 0;
            r.a aVar3 = r.S;
            r rVarF = x2.f(aVar3, 1.0f);
            h4.d.f81522a.getClass();
            h4.g.a aVar4 = h4.d.a.f81537o;
            j.f22691a.getClass();
            z zVarA = c2.y.a(j.f22694d, aVar4, o0VarE, 48);
            int iHashCode2 = Long.hashCode(o0VarE.U);
            i2 i2VarA1 = o0VarE.a0();
            r rVarC2 = k.c(rVarF, o0VarE);
            h5.g.V.getClass();
            e0.a aVar5 = h5.g.a.f81805b;
            List<l> listD = null;
            if (cVar == null) {
                p0.l();
                throw null;
            }
            o0VarE.z();
            if (o0VarE.T) {
                o0VarE.M(aVar5);
            } else {
                o0VarE.c();
            }
            h5.g.a.e eVar = h5.g.a.f81810g;
            b4.c(eVar, zVarA, o0VarE);
            h5.g.a.C1623g c1623g = h5.g.a.f81809f;
            b4.c(c1623g, i2VarA1, o0VarE);
            h5.g.a.b bVar = h5.g.a.f81813j;
            if (o0VarE.T) {
                str = strP;
            } else {
                str = strP;
                if (!s.g(o0VarE.q(), Integer.valueOf(iHashCode2))) {
                }
                fVar = h5.g.a.f81807d;
                b4.c(fVar, rVarC2, o0VarE);
                b0 b0Var = b0.f22601a;
                gVar = h4.d.a.f81524b;
                z0VarD = q.d(gVar, false);
                iHashCode = Long.hashCode(o0VarE.U);
                i2VarA0 = o0VarE.a0();
                i16 = i17;
                rVarC = k.c(aVar3, o0VarE);
                if (cVar != null) {
                    p0.l();
                    throw null;
                }
                o0VarE.z();
                if (o0VarE.T) {
                    o0VarE.M(aVar5);
                } else {
                    o0VarE.c();
                }
                b4.c(eVar, z0VarD, o0VarE);
                b4.c(c1623g, i2VarA0, o0VarE);
                if (o0VarE.T || !s.g(o0VarE.q(), Integer.valueOf(iHashCode))) {
                    v.h.A(iHashCode, o0VarE, iHashCode, bVar);
                }
                b4.c(fVar, rVarC, o0VarE);
                uVar = u.f22885a;
                d92.b.f58623a.getClass();
                fVar2 = d92.b.f58624b;
                fVar2.getClass();
                x0 x0VarB = d92.c.b(d92.c.e(j92.f.f97931h), o0VarE);
                r rVarC3 = uVar.c(aVar3, gVar);
                f14 = 16;
                g6.f.a aVar6 = g6.f.f75994b;
                mh.c(str, c2.l.C(rVarC3, f14, f14, 0.0f, 32, 4), 0L, null, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, x0VarB, o0VarE, 0, 0, 131068);
                r rVarH = x2.h(x2.f(aVar3, 1.0f), 300);
                f15 = 24;
                r rVarA = c2.l.A(rVarH, f15, 0.0f, 2);
                zR = o0VarE.r(aVar);
                objQ = o0VarE.q();
                if (zR || objQ == c2565a) {
                    objQ = new mc1.j(aVar, 2);
                    o0VarE.K(objQ);
                }
                e23.l lVar = (e23.l) objQ;
                zR2 = o0VarE.r(gVar2) | o0VarE.r(iVar) | o0VarE.r(dateTime) | o0VarE.r(dateTime2) | o0VarE.k(i16);
                objQ2 = o0VarE.q();
                if (zR2 || objQ2 == c2565a) {
                    q0 q0Var = new q0(gVar2, iVar, dateTime, dateTime2, i16, p1Var);
                    o0VarE.K(q0Var);
                    objQ2 = q0Var;
                }
                o0VarE = o0VarE;
                p002j6.c.b(lVar, rVarA, (e23.l) objQ2, o0VarE, 48, 0);
                if (((Boolean) p1Var.getF182175a()).booleanValue()) {
                    o0VarE.C(-1083058790);
                    String strQ = y.Q(o0VarE, R.string.txt_empty_page_no_data);
                    fVar2.getClass();
                    f16 = f15;
                    mh.c(strQ, uVar.c(r6, h4.d.a.f81528f), 0L, null, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, d92.c.f(j92.f.f97933j, o0VarE), o0VarE, 0, 0, 131068);
                    z16 = false;
                    o0VarE.g0(false);
                } else {
                    z16 = false;
                    f16 = f15;
                    o0VarE.C(-1082821950);
                    o0VarE.g0(false);
                }
                o0VarE.g0(true);
                if (iVar != 0 && (hVar = iVar.f106859a) != null) {
                    listD = hVar.d();
                }
                if (listD != null) {
                    o0VarE.C(-267795314);
                    t0.a(c2.l.B(x2.f(aVar3, 1.0f), f16, 8, f16, f14), j.f22696f, null, null, 0, 0, z3.f.c(96063782, new v0(iVar, 7), o0VarE), o0VarE, 1572912, 60);
                    o0VarE.g0(z16);
                } else {
                    o0VarE.C(-267013060);
                    o0VarE.g0(z16);
                }
                o0VarE.g0(true);
            }
            v.h.A(iHashCode2, o0VarE, iHashCode2, bVar);
            fVar = h5.g.a.f81807d;
            b4.c(fVar, rVarC2, o0VarE);
            b0 b0Var2 = b0.f22601a;
            gVar = h4.d.a.f81524b;
            z0VarD = q.d(gVar, false);
            iHashCode = Long.hashCode(o0VarE.U);
            i2VarA0 = o0VarE.a0();
            i16 = i17;
            rVarC = k.c(aVar3, o0VarE);
            if (cVar != null) {
                p0.l();
                throw null;
            }
            o0VarE.z();
            if (o0VarE.T) {
                o0VarE.M(aVar5);
            } else {
                o0VarE.c();
            }
            b4.c(eVar, z0VarD, o0VarE);
            b4.c(c1623g, i2VarA0, o0VarE);
            if (o0VarE.T) {
                v.h.A(iHashCode, o0VarE, iHashCode, bVar);
            } else {
                v.h.A(iHashCode, o0VarE, iHashCode, bVar);
            }
            b4.c(fVar, rVarC, o0VarE);
            uVar = u.f22885a;
            d92.b.f58623a.getClass();
            fVar2 = d92.b.f58624b;
            fVar2.getClass();
            x0 x0VarB2 = d92.c.b(d92.c.e(j92.f.f97931h), o0VarE);
            r rVarC4 = uVar.c(aVar3, gVar);
            f14 = 16;
            g6.f.a aVar7 = g6.f.f75994b;
            mh.c(str, c2.l.C(rVarC4, f14, f14, 0.0f, 32, 4), 0L, null, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, x0VarB2, o0VarE, 0, 0, 131068);
            r rVarH2 = x2.h(x2.f(aVar3, 1.0f), 300);
            f15 = 24;
            r rVarA2 = c2.l.A(rVarH2, f15, 0.0f, 2);
            zR = o0VarE.r(aVar);
            objQ = o0VarE.q();
            if (zR) {
                objQ = new mc1.j(aVar, 2);
                o0VarE.K(objQ);
            } else {
                objQ = new mc1.j(aVar, 2);
                o0VarE.K(objQ);
            }
            e23.l lVar2 = (e23.l) objQ;
            zR2 = o0VarE.r(gVar2) | o0VarE.r(iVar) | o0VarE.r(dateTime) | o0VarE.r(dateTime2) | o0VarE.k(i16);
            objQ2 = o0VarE.q();
            if (zR2) {
                q0 q0Var2 = new q0(gVar2, iVar, dateTime, dateTime2, i16, p1Var);
                o0VarE.K(q0Var2);
                objQ2 = q0Var2;
            } else {
                q0 q0Var3 = new q0(gVar2, iVar, dateTime, dateTime2, i16, p1Var);
                o0VarE.K(q0Var3);
                objQ2 = q0Var3;
            }
            o0VarE = o0VarE;
            p002j6.c.b(lVar2, rVarA2, (e23.l) objQ2, o0VarE, 48, 0);
            if (((Boolean) p1Var.getF182175a()).booleanValue()) {
                o0VarE.C(-1083058790);
                String strQ2 = y.Q(o0VarE, R.string.txt_empty_page_no_data);
                fVar2.getClass();
                f16 = f15;
                mh.c(strQ2, uVar.c(r6, h4.d.a.f81528f), 0L, null, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, d92.c.f(j92.f.f97933j, o0VarE), o0VarE, 0, 0, 131068);
                z16 = false;
                o0VarE.g0(false);
            } else {
                z16 = false;
                f16 = f15;
                o0VarE.C(-1082821950);
                o0VarE.g0(false);
            }
            o0VarE.g0(true);
            if (iVar != 0) {
                listD = hVar.d();
            }
            if (listD != null) {
                o0VarE.C(-267795314);
                t0.a(c2.l.B(x2.f(aVar3, 1.0f), f16, 8, f16, f14), j.f22696f, null, null, 0, 0, z3.f.c(96063782, new v0(iVar, 7), o0VarE), o0VarE, 1572912, 60);
                o0VarE.g0(z16);
            } else {
                o0VarE.C(-267013060);
                o0VarE.g0(z16);
            }
            o0VarE.g0(true);
        } else {
            o0VarE.e();
        }
        p2 p2VarI0 = o0VarE.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new cq0.i(iVar, dateTime, dateTime2, z14, i14, 17);
        }
    }
}
