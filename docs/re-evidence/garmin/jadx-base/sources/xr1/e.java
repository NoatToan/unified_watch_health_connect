package xr1;

import android.content.Context;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import c2.b0;
import c2.j;
import c2.x2;
import c2.y;
import c2.z;
import com.garmin.android.apps.connectmobile.R;
import com.garmin.android.apps.connectmobile.charts.mpchart3.wrapper.CustomLineChart;
import e23.l;
import g8.i;
import h4.k;
import h4.r;
import h5.e0;
import h5.g;
import java.util.List;
import m92.o;
import o4.m1;
import org.joda.time.LocalDate;
import p005kotlin.Unit;
import p005kotlin.jvm.internal.s;
import p13.h0;
import p3.b4;
import p3.i2;
import p3.m;
import p3.n;
import p3.o0;
import p3.p0;
import p3.p2;
import p3.x1;
import p3.y3;
import pi0.f;
import uj1.x;
import v.h;

/* JADX INFO: loaded from: classes10.dex */
public final class e {
    /* JADX WARN: Code duplicated, block: B:64:0x0196  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r11v17 */
    /* JADX WARN: Type inference failed for: r11v18 */
    /* JADX WARN: Type inference failed for: r11v19 */
    /* JADX WARN: Type inference failed for: r11v7 */
    /* JADX WARN: Type inference failed for: r11v8 */
    /* JADX WARN: Type inference failed for: r11v9 */
    /* JADX WARN: Type inference failed for: r4v17, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r8v1 */
    /* JADX WARN: Type inference failed for: r8v2, types: [b92.a, kotlin.jvm.internal.j] */
    /* JADX WARN: Type inference failed for: r8v6 */
    public static final void a(List<kr1.c> list, l<? super LocalDate, Unit> lVar, m mVar, int i14) {
        ?? M;
        String string;
        o0 o0VarE = mVar.E(-763420667);
        int i15 = (i14 & 6) == 0 ? (o0VarE.r(list) ? 4 : 2) | i14 : i14;
        int i16 = 32;
        if ((i14 & 48) == 0) {
            i15 |= o0VarE.r(lVar) ? 32 : 16;
        }
        int i17 = 1;
        if (o0VarE.n(i15 & 1, (i15 & 19) != 18)) {
            x1 x1Var = n.f135158a;
            if (list == null || list.isEmpty()) {
                p2 p2VarI0 = o0VarE.i0();
                if (p2VarI0 != null) {
                    p2VarI0.f135219d = new x(lVar, i14, 1, list);
                    return;
                }
                return;
            }
            y3 y3Var = AndroidCompositionLocals_androidKt.f6042b;
            pi0.e eVar = new pi0.e((Context) o0VarE.A(y3Var));
            qr1.a aVar = new qr1.a((Context) o0VarE.A(y3Var));
            r.a aVar2 = r.S;
            d92.b.f58623a.getClass();
            j92.b bVar = d92.b.f58625c;
            bVar.getClass();
            j92.e eVar2 = j92.b.f97899b;
            float f14 = eVar2.f97918c;
            float f15 = eVar2.f97920e;
            org.apache.commons.lang3.e.j(bVar);
            r rVarB = c2.l.B(aVar2, f15, f14, f15, eVar2.f97918c);
            j.f22691a.getClass();
            j.k kVar = j.f22694d;
            h4.d.f81522a.getClass();
            z zVarA = y.a(kVar, h4.d.a.f81536n, o0VarE, 0);
            int iHashCode = Long.hashCode(o0VarE.U);
            i2 i2VarA0 = o0VarE.a0();
            r rVarC = k.c(rVarB, o0VarE);
            g.V.getClass();
            e0.a aVar3 = g.a.f81805b;
            ?? r14 = 0;
            if (o0VarE.f135177b == null) {
                p0.l();
                throw null;
            }
            o0VarE.z();
            if (o0VarE.T) {
                o0VarE.M(aVar3);
            } else {
                o0VarE.c();
            }
            b4.c(g.a.f81810g, zVarA, o0VarE);
            b4.c(g.a.f81809f, i2VarA0, o0VarE);
            g.a.b bVar2 = g.a.f81813j;
            if (o0VarE.T || !s.g(o0VarE.q(), Integer.valueOf(iHashCode))) {
                h.A(iHashCode, o0VarE, iHashCode, bVar2);
            }
            b4.c(g.a.f81807d, rVarC, o0VarE);
            b0 b0Var = b0.f22601a;
            o0VarE.C(-361474117);
            for (kr1.c cVar : list) {
                LocalDate localDateB = cVar.b();
                if (localDateB != null) {
                    LocalDate localDatePlusDays = localDateB.plusDays(6);
                    localDatePlusDays.getClass();
                    M = eVar.m(localDateB, localDatePlusDays, f.SHORT_MONTH_NO_WEEKDAY);
                } else {
                    M = r14;
                }
                Integer value = cVar.getValue();
                if (value == null || value.intValue() < 0) {
                    string = aVar.f146893b;
                } else {
                    string = aVar.f146892a.getString(R.string.lbl_value_avg, String.valueOf(value.intValue()));
                    string.getClass();
                }
                Context context = (Context) o0VarE.A(AndroidCompositionLocals_androidKt.f6042b);
                string.getClass();
                context.getClass();
                String strA = oi0.c.A(context, new qc.c(27), string);
                b92.a.C0235a c0235a = new b92.a.C0235a(r14, i17, r14);
                c0235a.f16962a.put("value", strA);
                b92.a aVarB = c0235a.b();
                ?? r15 = M;
                if (M == 0) {
                    r15 = "";
                }
                r.a aVar4 = r.S;
                d92.b.f58623a.getClass();
                d92.b.f58625c.getClass();
                r rVarA = c2.l.A(aVar4, 0.0f, j92.b.f97899b.f97918c, i17);
                int i18 = (o0VarE.r(localDateB) ? 1 : 0) | ((i15 & 112) == i16 ? i17 : 0);
                Object objQ = o0VarE.q();
                if (i18 == 0) {
                    m.f135153a.getClass();
                    if (objQ == m.a.f135155b) {
                        objQ = new di0.e(localDateB, lVar, 13);
                        o0VarE.K(objQ);
                    }
                } else {
                    objQ = new di0.e(localDateB, lVar, 13);
                    o0VarE.K(objQ);
                }
                int i19 = b92.a.f16960b;
                l72.l.e(r15, null, string, null, null, null, rVarA, aVarB, false, (e23.a) objQ, o0VarE, 0, 314);
                i15 = i15;
                eVar = eVar;
                r14 = 0;
                i16 = i16;
                aVar = aVar;
                i17 = 1;
            }
            o0VarE.g0(false);
            o0VarE.g0(true);
            x1 x1Var2 = n.f135158a;
        } else {
            o0VarE.e();
        }
        p2 p2VarI1 = o0VarE.i0();
        if (p2VarI1 != null) {
            p2VarI1.f135219d = new x(lVar, i14, 2, list);
        }
    }

    public static final void b(int i14, List list, LocalDate localDate, LocalDate localDate2, m mVar) {
        int i15;
        List list2;
        o0 o0VarE = mVar.E(1183009695);
        if ((i14 & 6) == 0) {
            i15 = (o0VarE.r(localDate) ? 4 : 2) | i14;
        } else {
            i15 = i14;
        }
        if ((i14 & 48) == 0) {
            i15 |= o0VarE.r(localDate2) ? 32 : 16;
        }
        if ((i14 & 384) == 0) {
            list2 = list;
            i15 |= o0VarE.r(list2) ? 256 : 128;
        } else {
            list2 = list;
        }
        if (o0VarE.n(i15 & 1, (i15 & 147) != 146)) {
            x1 x1Var = n.f135158a;
            Context context = (Context) o0VarE.A(AndroidCompositionLocals_androidKt.f6042b);
            Object objQ = o0VarE.q();
            m.f135153a.getClass();
            m.a.C2565a c2565a = m.a.f135155b;
            if (objQ == c2565a) {
                objQ = new CustomLineChart(context);
                o0VarE.K(objQ);
            }
            CustomLineChart customLineChart = (CustomLineChart) objQ;
            Object objQ2 = o0VarE.q();
            if (objQ2 == c2565a) {
                tz.a aVar = new tz.a(customLineChart, new rr1.d(context, new pi0.e(context), localDate, localDate2), new rr1.e(customLineChart, localDate, localDate2), new rr1.c(customLineChart), null, null, 48, null);
                o0VarE.K(aVar);
                objQ2 = aVar;
            }
            o.a(u1.n.e(r.S, tn.k.b(d92.b.f58623a, o0VarE), m1.f128891a), gl1.y.Q(o0VarE, R.string.lbl_weekly_averages), null, null, z3.f.c(-787949793, new ux.e(customLineChart, (tz.a) objQ2, list2, gl1.y.P(R.string.common_no_certain_data, new Object[]{gl1.y.Q(o0VarE, R.string.title_stress)}, o0VarE), 2), o0VarE), null, null, o0VarE, 24576, 108);
        } else {
            o0VarE.e();
        }
        p2 p2VarI0 = o0VarE.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new c(localDate, localDate2, list, i14, 1);
        }
    }

    public static final void c(int i14, l lVar, List list, LocalDate localDate, LocalDate localDate2, m mVar) {
        lVar.getClass();
        o0 o0VarE = mVar.E(1451087800);
        int i15 = (o0VarE.r(localDate) ? 4 : 2) | i14 | (o0VarE.r(localDate2) ? 32 : 16) | (o0VarE.r(list) ? 256 : 128) | (o0VarE.r(lVar) ? 2048 : 1024);
        if (o0VarE.n(i15 & 1, (i15 & 1171) != 1170)) {
            x1 x1Var = n.f135158a;
            r rVarE = u1.n.e(x2.f(r.S, 1.0f), vb.h.f(d92.b.f58623a, o0VarE), m1.f128891a);
            j.f22691a.getClass();
            j.k kVar = j.f22694d;
            h4.d.f81522a.getClass();
            z zVarA = y.a(kVar, h4.d.a.f81536n, o0VarE, 0);
            int iHashCode = Long.hashCode(o0VarE.U);
            i2 i2VarA0 = o0VarE.a0();
            r rVarC = k.c(rVarE, o0VarE);
            g.V.getClass();
            e0.a aVar = g.a.f81805b;
            if (o0VarE.f135177b == null) {
                p0.l();
                throw null;
            }
            o0VarE.z();
            if (o0VarE.T) {
                o0VarE.M(aVar);
            } else {
                o0VarE.c();
            }
            b4.c(g.a.f81810g, zVarA, o0VarE);
            b4.c(g.a.f81809f, i2VarA0, o0VarE);
            g.a.b bVar = g.a.f81813j;
            if (o0VarE.T || !s.g(o0VarE.q(), Integer.valueOf(iHashCode))) {
                h.A(iHashCode, o0VarE, iHashCode, bVar);
            }
            b4.c(g.a.f81807d, rVarC, o0VarE);
            b0 b0Var = b0.f22601a;
            b(i15 & 1022, list, localDate, localDate2, o0VarE);
            a.a(i.A(list), o0VarE, 0);
            a(list != null ? h0.G0(list) : null, lVar, o0VarE, (i15 >> 6) & 112);
            o0VarE.g0(true);
        } else {
            o0VarE.e();
        }
        p2 p2VarI0 = o0VarE.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new ux.a(localDate, localDate2, list, lVar, i14, 2);
        }
    }
}
