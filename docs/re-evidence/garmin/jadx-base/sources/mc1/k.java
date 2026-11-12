package mc1;

import android.content.Context;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import c2.x2;
import com.github.mikephil.chartingv2.components.XAxis;
import com.github.mikephil.chartingv2.components.YAxis;
import com.github.mikephil.chartingv2.renderer.CombinedChartRenderer;
import com.github.mikephil.chartingv2.utils.Transformer;
import com.github.mikephil.chartingv2.utils.ViewPortHandler;
import e23.l;
import h4.r;
import o53.f0;
import p13.j0;
import p3.m;
import p3.n;
import p3.o0;
import p3.p2;
import p3.x1;

/* JADX INFO: loaded from: classes9.dex */
public final class k {
    public static final void a(dc1.a aVar, m mVar, int i14) {
        Object objV;
        Object objZ;
        o0 o0VarE = mVar.E(-81166524);
        int i15 = (o0VarE.r(aVar) ? 4 : 2) | i14;
        if (o0VarE.n(i15 & 1, (i15 & 3) != 2)) {
            x1 x1Var = n.f135158a;
            Context context = (Context) o0VarE.A(AndroidCompositionLocals_androidKt.f6042b);
            Object objQ = o0VarE.q();
            m.f135153a.getClass();
            Object obj = m.a.f135155b;
            if (objQ == obj) {
                objQ = new oz.a(context);
                o0VarE.K(objQ);
            }
            oz.a aVar2 = (oz.a) objQ;
            Object objQ2 = o0VarE.q();
            Object obj2 = objQ2;
            if (objQ2 == obj) {
                jc1.b bVar = new jc1.b(context);
                aVar2.getClass();
                bVar.f98163b = aVar2;
                aVar2.setRenderer(new CombinedChartRenderer(aVar2, aVar2.getAnimator(), aVar2.getViewPortHandler()));
                aVar2.setExtraBottomOffset(25.0f);
                aVar2.setExtraLeftOffset(35.0f);
                aVar2.setDescription(null);
                YAxis axisLeft = aVar2.getAxisLeft();
                axisLeft.setDrawAxisLine(false);
                axisLeft.setDrawGridLines(true);
                axisLeft.setPosition(YAxis.YAxisLabelPosition.INSIDE_CHART);
                axisLeft.setXOffset(-25.0f);
                int i16 = bVar.f98165d;
                axisLeft.setTextColor(i16);
                axisLeft.setLabelCount(5, false);
                axisLeft.setAxisMinValue(60.0f);
                axisLeft.setAxisMaxValue(102.0f);
                axisLeft.setValueFormatter(new jc1.e());
                axisLeft.setDrawLimitLinesBehindData(true);
                axisLeft.setTypeface(h22.a.a("font/roboto_light.ttf", bVar.f98162a));
                aVar2.getAxisRight().setEnabled(false);
                XAxis xAxis = aVar2.getXAxis();
                xAxis.setLabelsToSkip(0);
                xAxis.setYOffset(10.0f);
                xAxis.setTextColor(i16);
                xAxis.setPosition(XAxis.XAxisPosition.BOTTOM);
                xAxis.setDrawGridLines(false);
                xAxis.setDrawAxisLine(false);
                xAxis.setAxisLineColor(0);
                xAxis.setAxisLineWidth(0.0f);
                ViewPortHandler viewPortHandler = aVar2.getViewPortHandler();
                viewPortHandler.getClass();
                XAxis xAxis2 = aVar2.getXAxis();
                xAxis2.getClass();
                Transformer transformer = aVar2.getTransformer(YAxis.AxisDependency.LEFT);
                transformer.getClass();
                gm1.b bVar2 = new gm1.b(viewPortHandler, xAxis2, transformer, 3, 0);
                bVar2.f121634i = bVar.f98166e;
                bVar2.f78012t = 100.0f;
                aVar2.setXAxisRenderer(bVar2);
                aVar2.setTouchEnabled(false);
                aVar2.setScaleEnabled(false);
                aVar2.setPinchZoom(false);
                o0VarE.K(bVar);
                obj2 = bVar;
            }
            Object obj3 = (jc1.b) obj2;
            hz.b bVarA = new hz.c(aVar != null ? aVar.g() : null, aVar != null ? aVar.s() : null, aVar != null ? aVar.h() : null, aVar != null ? aVar.i() : null, 0, 16, null).a();
            Object fVar = new hz.f(aVar != null ? aVar.o() : null, aVar != null ? aVar.m() : null, aVar != null ? aVar.u() : null, aVar != null ? aVar.t() : null, bVarA.f86381d);
            if (aVar == null || (objV = f0.v(aVar)) == null) {
                objV = j0.f134944a;
            }
            Object obj4 = objV;
            if (aVar == null || (objZ = f0.z(aVar)) == null) {
                objZ = j0.f134944a;
            }
            Object obj5 = objZ;
            boolean zR = o0VarE.r(aVar2);
            Object objQ3 = o0VarE.q();
            if (zR || objQ3 == obj) {
                objQ3 = new j(aVar2, 0);
                o0VarE.K(objQ3);
            }
            l lVar = (l) objQ3;
            g6.f.a aVar3 = g6.f.f75994b;
            r rVarH = x2.h(x2.f(r.S, 1.0f), 290);
            boolean zR2 = o0VarE.r(obj3) | o0VarE.r(obj4) | o0VarE.r(obj5) | o0VarE.r(bVarA) | o0VarE.r(fVar);
            Object objQ4 = o0VarE.q();
            if (zR2 || objQ4 == obj) {
                Object cVar = new jv0.c(obj3, obj4, obj5, bVarA, fVar, 6);
                o0VarE.K(cVar);
                objQ4 = cVar;
            }
            p002j6.c.b(lVar, rVarH, (l) objQ4, o0VarE, 48, 0);
        } else {
            o0VarE.e();
        }
        p2 p2VarI0 = o0VarE.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new c(aVar, i14);
        }
    }
}
