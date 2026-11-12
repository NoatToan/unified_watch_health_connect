package xr1;

import android.content.Context;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import c2.b0;
import c2.j;
import c2.x2;
import c2.z;
import com.garmin.android.apps.connectmobile.R;
import com.garmin.android.apps.connectmobile.charts.mpchart3.wrapper.CustomLineChart;
import e23.l;
import e23.p;
import gl1.y;
import h4.r;
import h5.e0;
import h5.g;
import java.util.Iterator;
import java.util.List;
import m92.o;
import o4.m1;
import org.joda.time.Days;
import org.joda.time.LocalDate;
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
import tn.k;
import vb.h;
import z3.f;

/* JADX INFO: loaded from: classes10.dex */
public final class d {
    public static final void a(int i14, List list, LocalDate localDate, LocalDate localDate2, m mVar) {
        int i15;
        List list2;
        o0 o0VarE = mVar.E(907594377);
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
                tz.a aVar = new tz.a(customLineChart, new rr1.a(context, new pi0.e(context), localDate, localDate2), new rr1.b(customLineChart, localDate, localDate2), new rr1.c(customLineChart), null, null, 48, null);
                o0VarE.K(aVar);
                objQ2 = aVar;
            }
            o.a(u1.n.e(r.S, k.b(d92.b.f58623a, o0VarE), m1.f128891a), y.Q(o0VarE, R.string.pregnancy_daily_averages), null, null, f.c(1401632265, new ux.e(customLineChart, (tz.a) objQ2, list2, y.P(R.string.common_no_certain_data, new Object[]{y.Q(o0VarE, R.string.title_stress)}, o0VarE), 1), o0VarE), null, null, o0VarE, 24576, 108);
        } else {
            o0VarE.e();
        }
        p2 p2VarI0 = o0VarE.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new c(localDate, localDate2, list, i14, 0);
        }
    }

    /* JADX WARN: Code duplicated, block: B:49:0x00de  */
    public static final void b(kr1.a aVar, int i14, LocalDate localDate, l<? super LocalDate, Unit> lVar, m mVar, int i15) {
        Integer overallStressLevel;
        o0 o0VarE = mVar.E(-215827541);
        int i16 = (o0VarE.r(aVar) ? 4 : 2) | i15 | (o0VarE.k(i14) ? 32 : 16);
        if ((i15 & 384) == 0) {
            i16 |= o0VarE.r(localDate) ? 256 : 128;
        }
        if ((i15 & 3072) == 0) {
            i16 |= o0VarE.r(lVar) ? 2048 : 1024;
        }
        if (o0VarE.n(i16 & 1, (i16 & 1171) != 1170)) {
            x1 x1Var = n.f135158a;
            pi0.e eVar = new pi0.e((Context) o0VarE.A(AndroidCompositionLocals_androidKt.f6042b));
            LocalDate localDateMinusDays = localDate.minusDays(i14);
            localDateMinusDays.getClass();
            String strD = eVar.d(localDateMinusDays, qi0.a.WEEKDAY);
            String strD2 = eVar.d(localDateMinusDays, qi0.a.RELATIVE_YEAR_MONTH_DAY);
            String strQ = y.Q(o0VarE, R.string.no_value);
            kr1.a.b values = aVar.getValues();
            if (values != null && (overallStressLevel = values.getOverallStressLevel()) != null) {
                int iIntValue = overallStressLevel.intValue();
                String strValueOf = iIntValue >= 0 ? String.valueOf(iIntValue) : strQ;
                if (strValueOf != null) {
                    strQ = strValueOf;
                }
            }
            r.a aVar2 = r.S;
            d92.b.f58623a.getClass();
            d92.b.f58625c.getClass();
            r rVarA = c2.l.A(aVar2, 0.0f, j92.b.f97899b.f97918c, 1);
            z3.e eVarC = f.c(-295764321, new vv0.e(25, strQ, aVar), o0VarE);
            boolean zR = o0VarE.r(localDateMinusDays) | ((i16 & 7168) == 2048);
            Object objQ = o0VarE.q();
            if (zR) {
                objQ = new di0.e(lVar, localDateMinusDays, 12);
                o0VarE.K(objQ);
            } else {
                m.f135153a.getClass();
                if (objQ == m.a.f135155b) {
                    objQ = new di0.e(lVar, localDateMinusDays, 12);
                    o0VarE.K(objQ);
                }
            }
            l72.l.d(strD, strD2, eVarC, rVarA, null, false, (e23.a) objQ, o0VarE, 384, 48);
        } else {
            o0VarE.e();
        }
        p2 p2VarI0 = o0VarE.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new an1.d(aVar, i14, localDate, lVar, i15, 27);
        }
    }

    public static final void c(int i14, l lVar, List list, LocalDate localDate, LocalDate localDate2, m mVar) {
        lVar.getClass();
        o0 o0VarE = mVar.E(1969841880);
        int i15 = (o0VarE.r(localDate) ? 4 : 2) | i14 | (o0VarE.r(localDate2) ? 32 : 16) | (o0VarE.r(list) ? 256 : 128) | (o0VarE.r(lVar) ? 2048 : 1024);
        if (o0VarE.n(i15 & 1, (i15 & 1171) != 1170)) {
            x1 x1Var = n.f135158a;
            r rVarE = u1.n.e(x2.f(r.S, 1.0f), h.f(d92.b.f58623a, o0VarE), m1.f128891a);
            j.f22691a.getClass();
            j.k kVar = j.f22694d;
            h4.d.f81522a.getClass();
            z zVarA = c2.y.a(kVar, h4.d.a.f81536n, o0VarE, 0);
            int iHashCode = Long.hashCode(o0VarE.U);
            i2 i2VarA0 = o0VarE.a0();
            r rVarC = h4.k.c(rVarE, o0VarE);
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
                v.h.A(iHashCode, o0VarE, iHashCode, bVar);
            }
            b4.c(g.a.f81807d, rVarC, o0VarE);
            b0 b0Var = b0.f22601a;
            a(i15 & 1022, list, localDate, localDate2, o0VarE);
            a.a(kr1.b.a(list), o0VarE, 0);
            d(i15 & 8190, lVar, list, localDate, localDate2, o0VarE);
            o0VarE.g0(true);
        } else {
            o0VarE.e();
        }
        p2 p2VarI0 = o0VarE.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new ux.a(localDate, localDate2, list, lVar, i14, 1);
        }
    }

    public static final void d(final int i14, final l lVar, final List list, final LocalDate localDate, final LocalDate localDate2, m mVar) {
        int i15;
        l lVar2;
        p2 p2VarI0;
        p<? super m, ? super Integer, Unit> pVar;
        Object next;
        LocalDate localDate3 = localDate2;
        o0 o0VarE = mVar.E(1239107501);
        if ((i14 & 6) == 0) {
            i15 = (o0VarE.r(localDate) ? 4 : 2) | i14;
        } else {
            i15 = i14;
        }
        if ((i14 & 48) == 0) {
            i15 |= o0VarE.r(localDate3) ? 32 : 16;
        }
        if ((i14 & 384) == 0) {
            i15 |= o0VarE.r(list) ? 256 : 128;
        }
        if ((i14 & 3072) == 0) {
            lVar2 = lVar;
            i15 |= o0VarE.r(lVar2) ? 2048 : 1024;
        } else {
            lVar2 = lVar;
        }
        if (o0VarE.n(i15 & 1, (i15 & 1171) != 1170)) {
            x1 x1Var = n.f135158a;
            if (list == null || list.isEmpty()) {
                p2VarI0 = o0VarE.i0();
                if (p2VarI0 == null) {
                    return;
                }
                final int i16 = 0;
                pVar = new p() { // from class: xr1.b
                    @Override // e23.p
                    public final Object invoke(Object obj, Object obj2) {
                        switch (i16) {
                            case 0:
                                ((Integer) obj2).getClass();
                                d.d(p0.t(i14 | 1), lVar, list, localDate, localDate2, (m) obj);
                                break;
                            default:
                                ((Integer) obj2).getClass();
                                d.d(p0.t(i14 | 1), lVar, list, localDate, localDate2, (m) obj);
                                break;
                        }
                        return Unit.INSTANCE;
                    }
                };
            } else {
                r.a aVar = r.S;
                d92.b.f58623a.getClass();
                j92.b bVar = d92.b.f58625c;
                bVar.getClass();
                j92.e eVar = j92.b.f97899b;
                float f14 = eVar.f97920e;
                float f15 = eVar.f97918c;
                bVar.getClass();
                float f16 = eVar.f97920e;
                bVar.getClass();
                bVar.getClass();
                r rVarB = c2.l.B(aVar, f14, f15, f16, f15);
                j.f22691a.getClass();
                j.k kVar = j.f22694d;
                h4.d.f81522a.getClass();
                z zVarA = c2.y.a(kVar, h4.d.a.f81536n, o0VarE, 0);
                int iHashCode = Long.hashCode(o0VarE.U);
                i2 i2VarA0 = o0VarE.a0();
                r rVarC = h4.k.c(rVarB, o0VarE);
                g.V.getClass();
                e0.a aVar2 = g.a.f81805b;
                if (o0VarE.f135177b == null) {
                    p0.l();
                    throw null;
                }
                o0VarE.z();
                if (o0VarE.T) {
                    o0VarE.M(aVar2);
                } else {
                    o0VarE.c();
                }
                b4.c(g.a.f81810g, zVarA, o0VarE);
                b4.c(g.a.f81809f, i2VarA0, o0VarE);
                g.a.b bVar2 = g.a.f81813j;
                if (o0VarE.T || !s.g(o0VarE.q(), Integer.valueOf(iHashCode))) {
                    v.h.A(iHashCode, o0VarE, iHashCode, bVar2);
                }
                b4.c(g.a.f81807d, rVarC, o0VarE);
                b0 b0Var = b0.f22601a;
                o0VarE.C(1886163951);
                int days = Days.daysBetween(localDate, localDate2).getDays();
                if (days >= 0) {
                    int i17 = 0;
                    while (true) {
                        Iterator it = list.iterator();
                        do {
                            if (!it.hasNext()) {
                                next = null;
                                break;
                            }
                            next = it.next();
                        } while (!s.g(((kr1.a) next).b(), localDate3.minusDays(i17)));
                        kr1.a aVar3 = (kr1.a) next;
                        if (aVar3 == null) {
                            o0VarE.C(-1658332159);
                            o0VarE.g0(false);
                        } else {
                            o0VarE.C(-1658332158);
                            b(aVar3, i17, localDate3, lVar2, o0VarE, ((i15 << 3) & 896) | (i15 & 7168));
                            o0VarE.g0(false);
                        }
                        if (i17 == days) {
                            break;
                        }
                        i17++;
                        lVar2 = lVar;
                        localDate3 = localDate2;
                    }
                }
                o0VarE.g0(false);
                o0VarE.g0(true);
                x1 x1Var2 = n.f135158a;
            }
            p2VarI0.f135219d = pVar;
        }
        o0VarE.e();
        p2VarI0 = o0VarE.i0();
        if (p2VarI0 != null) {
            final int i18 = 1;
            pVar = new p() { // from class: xr1.b
                @Override // e23.p
                public final Object invoke(Object obj, Object obj2) {
                    switch (i18) {
                        case 0:
                            ((Integer) obj2).getClass();
                            d.d(p0.t(i14 | 1), lVar, list, localDate, localDate2, (m) obj);
                            break;
                        default:
                            ((Integer) obj2).getClass();
                            d.d(p0.t(i14 | 1), lVar, list, localDate, localDate2, (m) obj);
                            break;
                    }
                    return Unit.INSTANCE;
                }
            };
            p2VarI0.f135219d = pVar;
        }
    }
}
