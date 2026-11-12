package rr0;

import android.content.Context;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import c2.x2;
import com.garmin.android.apps.connectmobile.charts.mpchart.wrapper.BaseLineChart;
import p3.o0;
import p3.p2;
import p3.x1;
import rk0.a1;

/* JADX INFO: loaded from: classes8.dex */
public final class a0 {
    public static final void a(pr0.d dVar, hz.b bVar, p3.m mVar, int i14) {
        o0 o0Var;
        pr0.d dVar2 = dVar;
        hz.b bVar2 = bVar;
        o0 o0VarE = mVar.E(1264447116);
        int i15 = 4;
        int i16 = (o0VarE.r(dVar2) ? 4 : 2) | i14 | (o0VarE.r(bVar2) ? 32 : 16);
        boolean z14 = true;
        if (o0VarE.n(i16 & 1, (i16 & 19) != 18)) {
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
                objQ2 = new pr0.j(context, 60);
                o0VarE.K(objQ2);
            }
            pr0.j jVar = (pr0.j) objQ2;
            g6.f.a aVar = g6.f.f75994b;
            h4.r rVarH = x2.h(c2.l.C(x2.f(h4.r.S, 1.0f), 16, 0.0f, 8, 0.0f, 10), 290);
            boolean zR = o0VarE.r(baseLineChart);
            Object objQ3 = o0VarE.q();
            if (zR || objQ3 == c2565a) {
                objQ3 = new o(baseLineChart, 2);
                o0VarE.K(objQ3);
            }
            e23.l lVar = (e23.l) objQ3;
            boolean zR2 = o0VarE.r(jVar) | o0VarE.r(baseLineChart) | o0VarE.r(context) | o0VarE.r(dVar2);
            if ((i16 & 112) != 32 && !o0VarE.r(bVar2)) {
                z14 = false;
            }
            boolean z15 = zR2 | z14;
            Object objQ4 = o0VarE.q();
            if (z15 || objQ4 == c2565a) {
                jv0.c cVar = new jv0.c(jVar, baseLineChart, context, dVar2, bVar2, 19);
                o0VarE.K(cVar);
                objQ4 = cVar;
            }
            o0Var = o0VarE;
            p002j6.c.b(lVar, rVarH, (e23.l) objQ4, o0Var, 48, 0);
        } else {
            dVar2 = dVar2;
            bVar2 = bVar2;
            o0Var = o0VarE;
            o0Var.e();
        }
        p2 p2VarI0 = o0Var.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new a1(dVar2, bVar2, i14, i15);
        }
    }
}
