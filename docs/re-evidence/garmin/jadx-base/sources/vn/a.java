package vn;

import android.content.Context;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import c2.x2;
import com.garmin.android.apps.connectmobile.R;
import com.garmin.android.apps.connectmobile.activities.charts3.components.OverlayCombinedChart;
import e23.l;
import g6.f;
import gl1.y;
import h4.r;
import i3.mh;
import p005kotlin.Unit;
import p3.m;
import p3.n;
import p3.o0;
import p3.p2;
import p3.x1;
import p5.v;
import s5.x0;
import u1.w;
import u91.i;
import ux1.g;
import vb.h;
import vb1.d;
import zm.f0;

/* JADX INFO: loaded from: classes7.dex */
public final class a {
    public static final void a(im.b bVar, e23.a<Unit> aVar, m mVar, int i14) {
        im.b bVar2;
        o0 o0Var;
        m.a.C2565a c2565a;
        OverlayCombinedChart overlayCombinedChart;
        Object obj;
        zm.c cVar;
        zm.c f0Var;
        bVar.getClass();
        aVar.getClass();
        o0 o0VarE = mVar.E(-163352564);
        int i15 = (o0VarE.r(bVar) ? 4 : 2) | i14 | (o0VarE.r(aVar) ? 32 : 16);
        if (o0VarE.n(i15 & 1, (i15 & 19) != 18)) {
            x1 x1Var = n.f135158a;
            fz.c cVar2 = fz.c.TIME;
            Context context = (Context) o0VarE.A(AndroidCompositionLocals_androidKt.f6042b);
            Object objQ = o0VarE.q();
            m.f135153a.getClass();
            m.a.C2565a c2565a2 = m.a.f135155b;
            if (objQ == c2565a2) {
                objQ = new OverlayCombinedChart(context, null, 0, 6, null);
                o0VarE.K(objQ);
            }
            OverlayCombinedChart overlayCombinedChart2 = (OverlayCombinedChart) objQ;
            Object objQ2 = o0VarE.q();
            if (objQ2 == c2565a2) {
                int b14 = bVar.getB1();
                if (b14 == 3 || b14 == 41) {
                    c2565a = c2565a2;
                    overlayCombinedChart = overlayCombinedChart2;
                    bVar2 = bVar;
                    cVar = new zm.c(context, bVar, null, null, false, cVar2, 12, null);
                } else {
                    if (b14 == 43) {
                        c2565a = c2565a2;
                        overlayCombinedChart = overlayCombinedChart2;
                        f0Var = new f0(context, bVar, null, false, cVar2, 4, null);
                    } else if (b14 != 55) {
                        c2565a = c2565a2;
                        overlayCombinedChart = overlayCombinedChart2;
                        f0Var = new zm.c(context, bVar, null, null, false, cVar2);
                    } else {
                        c2565a = c2565a2;
                        overlayCombinedChart = overlayCombinedChart2;
                        f0Var = new zm.c(context, bVar, null, null, false, cVar2, 12, null);
                    }
                    bVar2 = bVar;
                    cVar = f0Var;
                }
                cVar.M(overlayCombinedChart);
                o0VarE.K(cVar);
                obj = cVar;
            } else {
                c2565a = c2565a2;
                overlayCombinedChart = overlayCombinedChart2;
                bVar2 = bVar;
                obj = objQ2;
            }
            zm.c cVar3 = (zm.c) obj;
            r.a aVar2 = r.S;
            f.a aVar3 = f.f75994b;
            r rVarH = x2.h(x2.f(aVar2, 1.0f), 200);
            boolean z14 = (i15 & 112) == 32;
            Object objQ3 = o0VarE.q();
            if (z14 || objQ3 == c2565a) {
                objQ3 = new g(aVar, 19);
                o0VarE.K(objQ3);
            }
            r rVarD = w.d(rVarH, false, null, null, (e23.a) objQ3, 15);
            boolean zR = o0VarE.r(overlayCombinedChart);
            Object objQ4 = o0VarE.q();
            if (zR || objQ4 == c2565a) {
                objQ4 = new uo1.a(overlayCombinedChart, 20);
                o0VarE.K(objQ4);
            }
            l lVar = (l) objQ4;
            boolean zR2 = o0VarE.r(cVar3);
            Object objQ5 = o0VarE.q();
            if (zR2 || objQ5 == c2565a) {
                objQ5 = new uo1.a(cVar3, 21);
                o0VarE.K(objQ5);
            }
            o0 o0Var2 = o0VarE;
            p002j6.c.b(lVar, rVarD, (l) objQ5, o0Var2, 0, 0);
            String strQ = y.Q(o0Var2, R.string.lbl_time_h_m_s);
            d92.b.f58623a.getClass();
            d92.b.f58624b.getClass();
            x0 x0Var = j92.f.f97935l;
            long jG = h.g(o0Var2);
            d6.h.f57752b.getClass();
            int i16 = d6.h.f57755e;
            r rVarF = x2.f(aVar2, 1.0f);
            Object objQ6 = o0Var2.q();
            if (objQ6 == c2565a) {
                objQ6 = new d(21);
                o0Var2.K(objQ6);
            }
            mh.c(strQ, v.c((l) objQ6, rVarF, false), jG, null, 0L, null, 0L, d6.h.a(i16), 0L, 0, false, 0, 0, null, x0Var, o0Var2, 0, 0, 130040);
            o0Var = o0Var2;
        } else {
            bVar2 = bVar;
            o0 o0Var3 = o0VarE;
            o0Var3.e();
            o0Var = o0Var3;
        }
        p2 p2VarI0 = o0Var.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new i(bVar2, aVar, i14, 28);
        }
    }
}
