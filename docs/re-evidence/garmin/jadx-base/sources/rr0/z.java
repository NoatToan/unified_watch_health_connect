package rr0;

import android.content.Context;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import b82.l0;
import c2.x2;
import com.garmin.android.apps.connectmobile.charts.mpchart.wrapper.BaseLineChart;
import java.util.ArrayList;
import java.util.List;
import p3.o0;
import p3.p2;
import p3.x1;

/* JADX INFO: loaded from: classes8.dex */
public final class z {
    public static final void a(pr0.d dVar, hz.b bVar, hz.f fVar, ArrayList arrayList, List list, p3.m mVar, int i14) {
        o0 o0Var;
        list.getClass();
        o0 o0VarE = mVar.E(-1012290181);
        int i15 = i14 | (o0VarE.r(dVar) ? 4 : 2) | (o0VarE.r(bVar) ? 32 : 16) | (o0VarE.r(fVar) ? 256 : 128) | (o0VarE.r(arrayList) ? 2048 : 1024) | (o0VarE.r(list) ? 16384 : 8192);
        boolean z14 = true;
        if (o0VarE.n(i15 & 1, (i15 & 9363) != 9362)) {
            x1 x1Var = p3.n.f135158a;
            Context context = (Context) o0VarE.A(AndroidCompositionLocals_androidKt.f6042b);
            Object objQ = o0VarE.q();
            p3.m.f135153a.getClass();
            p3.m.a.C2565a c2565a = p3.m.a.f135155b;
            if (objQ == c2565a) {
                objQ = new BaseLineChart(context);
                o0VarE.K(objQ);
            }
            BaseLineChart baseLineChart = (BaseLineChart) objQ;
            Object objQ2 = o0VarE.q();
            if (objQ2 == c2565a) {
                objQ2 = new pr0.e(context, 15);
                o0VarE.K(objQ2);
            }
            pr0.e eVar = (pr0.e) objQ2;
            g6.f.a aVar = g6.f.f75994b;
            h4.r rVarH = x2.h(c2.l.A(x2.f(h4.r.S, 1.0f), 16, 0.0f, 2), 290);
            boolean zR = o0VarE.r(baseLineChart);
            Object objQ3 = o0VarE.q();
            if (zR || objQ3 == c2565a) {
                objQ3 = new o(baseLineChart, 1);
                o0VarE.K(objQ3);
            }
            e23.l lVar = (e23.l) objQ3;
            boolean zR2 = o0VarE.r(eVar) | o0VarE.r(context) | o0VarE.r(dVar) | ((i15 & 112) == 32 || o0VarE.r(bVar));
            if ((i15 & 896) != 256 && !o0VarE.r(fVar)) {
                z14 = false;
            }
            boolean zR3 = zR2 | z14 | o0VarE.r(arrayList) | o0VarE.r(list);
            Object objQ4 = o0VarE.q();
            if (zR3 || objQ4 == c2565a) {
                l0 l0Var = new l0(eVar, context, dVar, bVar, fVar, arrayList, list, 17);
                o0VarE.K(l0Var);
                objQ4 = l0Var;
            }
            o0Var = o0VarE;
            p002j6.c.b(lVar, rVarH, (e23.l) objQ4, o0Var, 48, 0);
        } else {
            o0Var = o0VarE;
            o0Var.e();
        }
        p2 p2VarI0 = o0Var.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new ob0.e(dVar, bVar, fVar, arrayList, list, i14, 21);
        }
    }
}
