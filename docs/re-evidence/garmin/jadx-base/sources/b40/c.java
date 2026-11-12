package b40;

import a3.e;
import android.content.Context;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import androidx.room.a0;
import ao1.i;
import aq.q1;
import c2.q;
import c2.u;
import com.garmin.android.apps.connectmobile.R;
import com.garmin.android.apps.connectmobile.charts.mpchart3.wrapper.CustomLineChart;
import e23.l;
import e50.f;
import f5.z0;
import gl1.y;
import h4.d;
import h4.r;
import h5.e0;
import o4.m1;
import p005kotlin.Unit;
import p005kotlin.jvm.internal.s;
import p3.b4;
import p3.i2;
import p3.m;
import p3.n;
import p3.o0;
import p3.p0;
import p3.p2;
import p3.x1;
import q30.g;
import q30.h;
import tn.k;

/* JADX INFO: loaded from: classes8.dex */
public final class c {
    public static final void a(f fVar, e23.a<Unit> aVar, l<? super r30.a, Unit> lVar, m mVar, int i14) {
        o0 o0Var;
        Object obj;
        o0 o0VarO = a0.o(aVar, lVar, mVar, -688894218);
        int i15 = i14 | (o0VarO.B(fVar) ? 4 : 2) | (o0VarO.r(aVar) ? 32 : 16) | (o0VarO.r(lVar) ? 256 : 128);
        if (o0VarO.n(i15 & 1, (i15 & 147) != 146)) {
            x1 x1Var = n.f135158a;
            Context context = (Context) o0VarO.A(AndroidCompositionLocals_androidKt.f6042b);
            Object objQ = o0VarO.q();
            m.f135153a.getClass();
            m.a.C2565a c2565a = m.a.f135155b;
            if (objQ == c2565a) {
                obj = objQ;
                CustomLineChart customLineChart = new CustomLineChart(context);
                customLineChart.setOnClickListener(new q1(aVar, 2));
                o0VarO.K(customLineChart);
                obj = customLineChart;
            }
            obj = objQ;
            CustomLineChart customLineChart2 = (CustomLineChart) obj;
            Object objQ2 = o0VarO.q();
            if (objQ2 == c2565a) {
                tz.a aVar2 = new tz.a(customLineChart2, new q30.b(context), new h(customLineChart2, false, 2, null), new q30.f(customLineChart2), new g(customLineChart2), null, 32, null);
                o0VarO.K(aVar2);
                objQ2 = aVar2;
            }
            tz.a aVar3 = (tz.a) objQ2;
            if (fVar.f63003a != null) {
                o0VarO.C(-1493132559);
                r.a aVar4 = r.S;
                d92.b.f58623a.getClass();
                d92.b.f58625c.getClass();
                r rVarA = c2.l.A(aVar4, j92.b.f97899b.f97920e, 0.0f, 2);
                i53.f<r30.b> fVar2 = fVar.f63004b;
                r30.a aVar5 = fVar.f63005c;
                boolean zR = ((i15 & 896) == 256) | o0VarO.r(aVar3);
                int i16 = i15 & 14;
                boolean z14 = zR | (i16 == 4);
                Object objQ3 = o0VarO.q();
                if (z14 || objQ3 == c2565a) {
                    objQ3 = new a4.a(lVar, 18, aVar3, fVar);
                    o0VarO.K(objQ3);
                }
                l lVar2 = (l) objQ3;
                boolean zR2 = o0VarO.r(aVar3) | (i16 == 4);
                Object objQ4 = o0VarO.q();
                if (zR2 || objQ4 == c2565a) {
                    objQ4 = new i(26, aVar3, fVar);
                    o0VarO.K(objQ4);
                }
                b.a(rVarA, customLineChart2, fVar2, aVar5, lVar2, (e23.a) objQ4, o0VarO, CustomLineChart.f31344h << 3);
                o0 o0Var2 = o0VarO;
                o0Var2.g0(false);
                o0Var = o0Var2;
            } else {
                o0VarO.C(-1492445630);
                r rVarE = u1.n.e(r.S, k.b(d92.b.f58623a, o0VarO), m1.f128891a);
                d.f81522a.getClass();
                z0 z0VarD = q.d(d.a.f81524b, false);
                int iHashCode = Long.hashCode(o0VarO.U);
                i2 i2VarA0 = o0VarO.a0();
                r rVarC = h4.k.c(rVarE, o0VarO);
                h5.g.V.getClass();
                e0.a aVar6 = h5.g.a.f81805b;
                if (o0VarO.f135177b == null) {
                    p0.l();
                    throw 0;
                }
                o0VarO.z();
                if (o0VarO.T) {
                    o0VarO.M(aVar6);
                } else {
                    o0VarO.c();
                }
                b4.c(h5.g.a.f81810g, z0VarD, o0VarO);
                b4.c(h5.g.a.f81809f, i2VarA0, o0VarO);
                h5.g.a.b bVar = h5.g.a.f81813j;
                if (o0VarO.T || !s.g(o0VarO.q(), Integer.valueOf(iHashCode))) {
                    v.h.A(iHashCode, o0VarO, iHashCode, bVar);
                }
                b4.c(h5.g.a.f81807d, rVarC, o0VarO);
                u uVar = u.f22885a;
                b82.n.c(null, y.Q(o0VarO, R.string.lbl_course_no_elevation_data), y.Q(o0VarO, R.string.course_no_elevation_data_description), null, null, o0VarO, 0, 25);
                o0VarO.g0(true);
                o0VarO.g0(false);
                o0Var = o0VarO;
            }
        } else {
            o0VarO.e();
            o0Var = o0VarO;
        }
        p2 p2VarI0 = o0Var.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new e(fVar, aVar, lVar, i14, 19);
        }
    }
}
