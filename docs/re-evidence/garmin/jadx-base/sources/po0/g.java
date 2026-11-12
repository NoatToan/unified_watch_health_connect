package po0;

import android.content.Context;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import c2.b0;
import c2.j;
import c2.x2;
import c2.z;
import com.garmin.android.apps.connectmobile.R;
import com.garmin.android.apps.connectmobile.charts.mpchart3.wrapper.CustomLineChart;
import e23.l;
import gl1.y;
import h4.k;
import h4.r;
import h5.e0;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import m92.o;
import o4.m1;
import org.joda.time.DateTime;
import org.joda.time.LocalDate;
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
public final class g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final float f139022a;

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
        f139022a = 330;
    }

    public static final void a(co0.c cVar, LocalDate localDate, LocalDate localDate2, l<? super DateTime, Unit> lVar, m mVar, int i14) {
        o0 o0Var;
        Context context;
        CustomLineChart customLineChart;
        co0.c cVar2 = cVar;
        lVar.getClass();
        o0 o0VarE = mVar.E(-1528040115);
        int i15 = i14 | (o0VarE.r(cVar2) ? 4 : 2) | (o0VarE.r(localDate) ? 32 : 16) | (o0VarE.r(localDate2) ? 256 : 128) | (o0VarE.r(lVar) ? 2048 : 1024);
        if (o0VarE.n(i15 & 1, (i15 & 1171) != 1170)) {
            x1 x1Var = n.f135158a;
            Context context2 = (Context) o0VarE.A(AndroidCompositionLocals_androidKt.f6042b);
            mo0.a aVar = new mo0.a(context2);
            String strP = y.P(R.string.common_no_certain_data, new Object[]{y.Q(o0VarE, R.string.device_screen_heart_rate)}, o0VarE);
            Object objQ = o0VarE.q();
            m.f135153a.getClass();
            m.a.C2565a c2565a = m.a.f135155b;
            if (objQ == c2565a) {
                objQ = new CustomLineChart(context2);
                o0VarE.K(objQ);
            }
            CustomLineChart customLineChart2 = (CustomLineChart) objQ;
            Object objQ2 = o0VarE.q();
            if (objQ2 == c2565a) {
                objQ2 = new lo0.a(customLineChart2, localDate, localDate2);
                o0VarE.K(objQ2);
            }
            lo0.a aVar2 = (lo0.a) objQ2;
            Object objQ3 = o0VarE.q();
            if (objQ3 == c2565a) {
                customLineChart = customLineChart2;
                ko0.b bVar = new ko0.b(context2, aVar, localDate, localDate2, aVar2);
                context = context2;
                objQ3 = new tz.a(customLineChart, bVar, aVar2.f113998e, new ko0.c(customLineChart), new ko0.d(customLineChart), null, 32, null);
                o0VarE.K(objQ3);
            } else {
                context = context2;
                customLineChart = customLineChart2;
            }
            tz.a aVar3 = (tz.a) objQ3;
            r.a aVar4 = r.S;
            long jF = vb.h.f(d92.b.f58623a, o0VarE);
            m1.a aVar5 = m1.f128891a;
            r rVarF = x2.f(u1.n.e(aVar4, jF, aVar5), 1.0f);
            j.f22691a.getClass();
            j.k kVar = j.f22694d;
            h4.d.f81522a.getClass();
            z zVarA = c2.y.a(kVar, h4.d.a.f81536n, o0VarE, 0);
            int iHashCode = Long.hashCode(o0VarE.U);
            i2 i2VarA0 = o0VarE.a0();
            r rVarC = k.c(rVarF, o0VarE);
            h5.g.V.getClass();
            e0.a aVar6 = h5.g.a.f81805b;
            CustomLineChart customLineChart3 = customLineChart;
            if (o0VarE.f135177b == null) {
                p0.l();
                throw null;
            }
            o0VarE.z();
            if (o0VarE.T) {
                o0VarE.M(aVar6);
            } else {
                o0VarE.c();
            }
            b4.c(h5.g.a.f81810g, zVarA, o0VarE);
            b4.c(h5.g.a.f81809f, i2VarA0, o0VarE);
            h5.g.a.b bVar2 = h5.g.a.f81813j;
            if (o0VarE.T || !s.g(o0VarE.q(), Integer.valueOf(iHashCode))) {
                v.h.A(iHashCode, o0VarE, iHashCode, bVar2);
            }
            b4.c(h5.g.a.f81807d, rVarC, o0VarE);
            b0 b0Var = b0.f22601a;
            r rVarE = u1.n.e(aVar4, d92.b.a(o0VarE).c().c(), aVar5);
            String strQ = y.Q(o0VarE, R.string.lbl_daily_readings);
            List<co0.d> list = cVar2 != null ? cVar2.f28124a : null;
            String str = (list == null || list.isEmpty()) ? strP : null;
            b bVar3 = new b(customLineChart3, aVar3, cVar2, strP, 0);
            cVar2 = cVar2;
            o.a(rVarE, strQ, null, str, z3.f.c(-339794237, bVar3, o0VarE), null, z3.f.c(-1361818555, new oo0.f(19, cVar2, context), o0VarE), o0VarE, 1597440, 36);
            o0Var = o0VarE;
            boolean z14 = (i15 & 7168) == 2048;
            Object objQ4 = o0Var.q();
            if (z14 || objQ4 == c2565a) {
                objQ4 = new na0.l(lVar, 25);
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
            p2VarI0.f135219d = new d(cVar2, localDate, localDate2, lVar, i14, 0);
        }
    }

    /* JADX WARN: Code duplicated, block: B:72:0x01b3  */
    public static final void b(co0.c cVar, l<? super DateTime, Unit> lVar, m mVar, int i14) {
        int i15;
        List listN0;
        i53.c cVarE;
        Integer abnormalHRAlertCount;
        o0 o0VarE = mVar.E(1539228448);
        int i16 = (o0VarE.r(cVar) ? 4 : 2) | i14 | (o0VarE.r(lVar) ? 32 : 16);
        if (o0VarE.n(i16 & 1, (i16 & 19) != 18)) {
            x1 x1Var = n.f135158a;
            if (cVar == null) {
                p2 p2VarI0 = o0VarE.i0();
                if (p2VarI0 != null) {
                    p2VarI0.f135219d = new c(cVar, lVar, i14, 1);
                    return;
                }
                return;
            }
            List<co0.d> list = cVar.f28124a;
            if (list == null || (listN0 = h0.N0(list, new a())) == null || (cVarE = i53.a.e(listN0)) == null) {
                p2 p2VarI1 = o0VarE.i0();
                if (p2VarI1 != null) {
                    p2VarI1.f135219d = new c(cVar, lVar, i14, 2);
                    return;
                }
                return;
            }
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
            z zVarA = c2.y.a(kVar, h4.d.a.f81536n, o0VarE, 0);
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
            o0VarE.C(962198316);
            Iterator it = cVarE.iterator();
            while (it.hasNext()) {
                co0.d dVar = (co0.d) it.next();
                LocalDate localDateB = dVar.b();
                if (localDateB == null) {
                    localDateB = LocalDate.now();
                }
                co0.d.b values = dVar.getValues();
                String strB = aVar.b(values != null ? values.getMaxHeartRate() : null);
                co0.d.b values2 = dVar.getValues();
                String strB2 = aVar.b(values2 != null ? values2.getRestingHeartRate() : null);
                localDateB.getClass();
                String strD = eVar.d(localDateB, qi0.a.WEEKDAY);
                String strD2 = eVar.d(localDateB, qi0.a.RELATIVE_YEAR_MONTH_DAY);
                co0.d.b values3 = dVar.getValues();
                int iIntValue = (values3 == null || (abnormalHRAlertCount = values3.getAbnormalHRAlertCount()) == null) ? 0 : abnormalHRAlertCount.intValue();
                Iterator it3 = it;
                String strA = new w00.b(aVar.f119871d).a(iIntValue);
                if (iIntValue != 0) {
                    strD2 = context.getString(R.string.string_space_bullet_string_pattern, strD2, strA);
                    strD2.getClass();
                }
                z3.e eVarC = z3.f.c(-562743054, new f(strB2, strB, iIntValue, 0), o0VarE);
                boolean zR = ((i16 & 112) == 32) | o0VarE.r(localDateB);
                Object objQ = o0VarE.q();
                if (zR) {
                    objQ = new di0.e(lVar, localDateB, 3);
                    o0VarE.K(objQ);
                } else {
                    m.f135153a.getClass();
                    if (objQ == m.a.f135155b) {
                        objQ = new di0.e(lVar, localDateB, 3);
                        o0VarE.K(objQ);
                    }
                }
                l72.l.d(strD, strD2, eVarC, rVarZ, null, false, (e23.a) objQ, o0VarE, 384, 48);
                aVar = aVar;
                context = context;
                eVar = eVar;
                it = it3;
            }
            o0VarE.g0(false);
            o0VarE.g0(true);
            x1 x1Var2 = n.f135158a;
            i15 = i14;
        } else {
            i15 = i14;
            o0VarE.e();
        }
        p2 p2VarI2 = o0VarE.i0();
        if (p2VarI2 != null) {
            p2VarI2.f135219d = new c(cVar, lVar, i15, 0);
        }
    }
}
