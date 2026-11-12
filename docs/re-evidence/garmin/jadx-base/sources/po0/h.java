package po0;

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
import h4.k;
import h4.r;
import h5.e0;
import java.util.Comparator;
import java.util.List;
import m92.o;
import o4.m1;
import org.joda.time.DateTime;
import org.joda.time.LocalDate;
import ov1.q;
import p005kotlin.Metadata;
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

/* JADX INFO: loaded from: classes8.dex */
public final class h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final float f139023a;

    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final class a<T> implements Comparator {
        /* JADX WARN: Multi-variable type inference failed */
        @Override // java.util.Comparator
        public final int compare(T t7, T t14) {
            return r13.a.b(((co0.d) t14).b(), ((co0.d) t7).b());
        }
    }

    static {
        g6.f.a aVar = g6.f.f75994b;
        f139023a = 330;
    }

    public static final void a(co0.c cVar, LocalDate localDate, LocalDate localDate2, l<? super DateTime, Unit> lVar, m mVar, int i14) {
        o0 o0Var;
        CustomLineChart customLineChart;
        co0.c cVar2 = cVar;
        lVar.getClass();
        o0 o0VarE = mVar.E(-183968614);
        int i15 = i14 | (o0VarE.r(cVar2) ? 4 : 2) | (o0VarE.r(localDate) ? 32 : 16) | (o0VarE.r(localDate2) ? 256 : 128) | (o0VarE.r(lVar) ? 2048 : 1024);
        if (o0VarE.n(i15 & 1, (i15 & 1171) != 1170)) {
            x1 x1Var = n.f135158a;
            Context context = (Context) o0VarE.A(AndroidCompositionLocals_androidKt.f6042b);
            mo0.a aVar = new mo0.a(context);
            r.a aVar2 = r.S;
            long jF = vb.h.f(d92.b.f58623a, o0VarE);
            m1.a aVar3 = m1.f128891a;
            r rVarF = x2.f(u1.n.e(aVar2, jF, aVar3), 1.0f);
            j.f22691a.getClass();
            j.k kVar = j.f22694d;
            h4.d.f81522a.getClass();
            z zVarA = y.a(kVar, h4.d.a.f81536n, o0VarE, 0);
            int iHashCode = Long.hashCode(o0VarE.U);
            i2 i2VarA0 = o0VarE.a0();
            r rVarC = k.c(rVarF, o0VarE);
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
            b4.c(h5.g.a.f81810g, zVarA, o0VarE);
            b4.c(h5.g.a.f81809f, i2VarA0, o0VarE);
            h5.g.a.b bVar = h5.g.a.f81813j;
            if (o0VarE.T || !s.g(o0VarE.q(), Integer.valueOf(iHashCode))) {
                v.h.A(iHashCode, o0VarE, iHashCode, bVar);
            }
            b4.c(h5.g.a.f81807d, rVarC, o0VarE);
            b0 b0Var = b0.f22601a;
            String strP = gl1.y.P(R.string.common_no_certain_data, new Object[]{gl1.y.Q(o0VarE, R.string.device_screen_heart_rate)}, o0VarE);
            Object objQ = o0VarE.q();
            m.f135153a.getClass();
            m.a.C2565a c2565a = m.a.f135155b;
            if (objQ == c2565a) {
                objQ = new CustomLineChart(context);
                o0VarE.K(objQ);
            }
            CustomLineChart customLineChart2 = (CustomLineChart) objQ;
            Object objQ2 = o0VarE.q();
            if (objQ2 == c2565a) {
                objQ2 = new lo0.c(customLineChart2, localDate, localDate2);
                o0VarE.K(objQ2);
            }
            lo0.c cVar3 = (lo0.c) objQ2;
            Object objQ3 = o0VarE.q();
            if (objQ3 == c2565a) {
                customLineChart = customLineChart2;
                objQ3 = new tz.a(customLineChart, new ko0.b(context, aVar, localDate, localDate2, cVar3), cVar3.f114005d, new ko0.c(customLineChart2), new ko0.d(customLineChart2), null, 32, null);
                o0VarE.K(objQ3);
            } else {
                customLineChart = customLineChart2;
            }
            tz.a aVar5 = (tz.a) objQ3;
            r rVarE = u1.n.e(aVar2, d92.b.a(o0VarE).c().c(), aVar3);
            String strQ = gl1.y.Q(o0VarE, R.string.lbl_weekly_averages);
            List<co0.d> list = cVar2 != null ? cVar2.f28124a : null;
            String str = (list == null || list.isEmpty()) ? strP : null;
            b bVar2 = new b(customLineChart, aVar5, cVar2, strP, 1);
            cVar2 = cVar2;
            o.a(rVarE, strQ, null, str, z3.f.c(1004277264, bVar2, o0VarE), null, z3.f.c(-17747054, new q(cVar2, 11), o0VarE), o0VarE, 1597440, 36);
            o0Var = o0VarE;
            boolean z14 = (i15 & 7168) == 2048;
            Object objQ4 = o0Var.q();
            if (z14 || objQ4 == c2565a) {
                objQ4 = new na0.l(lVar, 26);
                o0Var.K(objQ4);
            }
            b(cVar2, (l) objQ4, o0Var, i15 & 14);
            o0Var.g0(true);
        } else {
            o0Var = o0VarE;
            o0Var.e();
        }
        p2 p2VarI0 = o0Var.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new d(cVar2, localDate, localDate2, lVar, i14, 1);
        }
    }

    /* JADX WARN: Code duplicated, block: B:85:0x01dc  */
    public static final void b(co0.c cVar, l<? super DateTime, Unit> lVar, m mVar, int i14) {
        p2 p2VarI0;
        c cVar2;
        List listN0;
        i53.c<co0.d> cVarE;
        String strM;
        String strP;
        char c14;
        Integer abnormalHRAlertCount;
        o0 o0VarE = mVar.E(562207944);
        int i15 = (o0VarE.r(cVar) ? 4 : 2) | i14 | (o0VarE.r(lVar) ? 32 : 16);
        if (o0VarE.n(i15 & 1, (i15 & 19) != 18)) {
            x1 x1Var = n.f135158a;
            if (cVar == null) {
                p2VarI0 = o0VarE.i0();
                if (p2VarI0 == null) {
                    return;
                } else {
                    cVar2 = new c(cVar, lVar, i14, 4);
                }
            } else {
                List<co0.d> list = cVar.f28124a;
                if (list == null || (listN0 = h0.N0(list, new a())) == null || (cVarE = i53.a.e(listN0)) == null) {
                    p2VarI0 = o0VarE.i0();
                    if (p2VarI0 == null) {
                        return;
                    } else {
                        cVar2 = new c(cVar, lVar, i14, 5);
                    }
                } else {
                    Context context = (Context) o0VarE.A(AndroidCompositionLocals_androidKt.f6042b);
                    mo0.a aVar = new mo0.a(context);
                    pi0.e eVar = new pi0.e(context);
                    r.a aVar2 = r.S;
                    d92.b.f58623a.getClass();
                    j92.b bVar = d92.b.f58625c;
                    bVar.getClass();
                    j92.e eVar2 = j92.b.f97899b;
                    r rVarC = c2.l.C(aVar2, 0.0f, eVar2.f97918c, 0.0f, 0.0f, 13);
                    j.f22691a.getClass();
                    j.k kVar = j.f22694d;
                    h4.d.f81522a.getClass();
                    z zVarA = y.a(kVar, h4.d.a.f81536n, o0VarE, 0);
                    int iHashCode = Long.hashCode(o0VarE.U);
                    i2 i2VarA0 = o0VarE.a0();
                    r rVarC2 = k.c(rVarC, o0VarE);
                    h5.g.V.getClass();
                    e0.a aVar3 = h5.g.a.f81805b;
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
                    b4.c(h5.g.a.f81810g, zVarA, o0VarE);
                    b4.c(h5.g.a.f81809f, i2VarA0, o0VarE);
                    h5.g.a.b bVar2 = h5.g.a.f81813j;
                    if (o0VarE.T || !s.g(o0VarE.q(), Integer.valueOf(iHashCode))) {
                        v.h.A(iHashCode, o0VarE, iHashCode, bVar2);
                    }
                    b4.c(h5.g.a.f81807d, rVarC2, o0VarE);
                    b0 b0Var = b0.f22601a;
                    bVar.getClass();
                    float f14 = eVar2.f97918c;
                    bVar.getClass();
                    r rVarZ = c2.l.z(aVar2, eVar2.f97920e, f14);
                    o0VarE.C(190293582);
                    for (co0.d dVar : cVarE) {
                        LocalDate localDateB = dVar.b();
                        if (localDateB == null) {
                            localDateB = LocalDate.now();
                        }
                        LocalDate localDateB2 = dVar.b();
                        if (localDateB2 != null) {
                            LocalDate localDatePlusDays = localDateB2.plusDays(6);
                            localDatePlusDays.getClass();
                            strM = eVar.m(localDateB2, localDatePlusDays, pi0.f.SHORT_MONTH_NO_WEEKDAY);
                        } else {
                            strM = null;
                        }
                        co0.d.b values = dVar.getValues();
                        String strB = aVar.b(values != null ? values.getMaxHeartRate() : null);
                        co0.d.b values2 = dVar.getValues();
                        String strB2 = aVar.b(values2 != null ? values2.getRestingHeartRate() : null);
                        co0.d.b values3 = dVar.getValues();
                        int iIntValue = (values3 == null || (abnormalHRAlertCount = values3.getAbnormalHRAlertCount()) == null) ? 0 : abnormalHRAlertCount.intValue();
                        String strQ = gl1.y.Q(o0VarE, iIntValue == 1 ? R.string.lbl_course_point_alert : R.string.device_alerts);
                        if (iIntValue > 0) {
                            o0VarE.C(411214361);
                            strP = gl1.y.P(R.string.string_space_string_pattern, new Object[]{Integer.valueOf(iIntValue), strQ}, o0VarE);
                            o0VarE.g0(false);
                        } else {
                            o0VarE.C(-137170857);
                            o0VarE.g0(false);
                            strP = null;
                        }
                        if (strM == null) {
                            strM = "";
                        }
                        z3.e eVarC = z3.f.c(-797776358, new f(strB2, strB, iIntValue, 1), o0VarE);
                        boolean zR = ((i15 & 112) == 32) | o0VarE.r(localDateB);
                        Object objQ = o0VarE.q();
                        if (zR) {
                            c14 = 4;
                            objQ = new di0.e(lVar, localDateB, 4);
                            o0VarE.K(objQ);
                        } else {
                            m.f135153a.getClass();
                            if (objQ == m.a.f135155b) {
                                c14 = 4;
                                objQ = new di0.e(lVar, localDateB, 4);
                                o0VarE.K(objQ);
                            } else {
                                c14 = 4;
                            }
                        }
                        l72.l.d(strM, strP, eVarC, rVarZ, null, false, (e23.a) objQ, o0VarE, 384, 48);
                        aVar = aVar;
                        eVar = eVar;
                    }
                    o0VarE.g0(false);
                    o0VarE.g0(true);
                    x1 x1Var2 = n.f135158a;
                }
            }
            p2VarI0.f135219d = cVar2;
        }
        o0VarE.e();
        p2VarI0 = o0VarE.i0();
        if (p2VarI0 != null) {
            cVar2 = new c(cVar, lVar, i14, 3);
            p2VarI0.f135219d = cVar2;
        }
    }
}
