package vd0;

import android.content.Context;
import android.content.Intent;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import c2.q2;
import c2.s2;
import c2.t2;
import c2.u2;
import c2.x2;
import c22.c3;
import c22.l3;
import com.garmin.android.apps.connectmobile.R;
import com.garmin.android.apps.connectmobile.performance.model.TrainingStatusReportDTO;
import i3.e5;
import i3.mh;
import i3.o6;
import i3.xb;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import l72.p2;
import org.apache.commons.lang3.StringUtils;
import org.joda.time.DateTime;
import org.joda.time.LocalDate;
import org.koin.java.KoinJavaComponent;
import p005kotlin.Unit;
import p3.b4;
import p3.i2;

/* JADX INFO: loaded from: classes8.dex */
public final /* synthetic */ class s0 implements e23.q {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f177373a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f177374b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f177375c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Object f177376d;

    public /* synthetic */ s0(vf2.e eVar, e23.l lVar, lc.y yVar) {
        this.f177373a = 15;
        this.f177374b = eVar;
        this.f177376d = lVar;
        this.f177375c = yVar;
    }

    /* JADX WARN: Code duplicated, block: B:12:0x0072  */
    /* JADX WARN: Code duplicated, block: B:17:0x00e0  */
    private final Object a(Object obj, Object obj2, Object obj3) {
        dy1.v vVar = (dy1.v) this.f177374b;
        e23.a aVar = (e23.a) this.f177375c;
        p3.p1 p1Var = (p3.p1) this.f177376d;
        p3.m mVar = (p3.m) obj2;
        int iIntValue = ((Integer) obj3).intValue();
        ((c2.c1) obj).getClass();
        if (mVar.n(iIntValue & 1, (iIntValue & 17) != 16)) {
            p3.x1 x1Var = p3.n.f135158a;
            String strP = gl1.y.P(R.string.lbl_estimated_workout_time, new Object[]{vVar.b(mVar)}, mVar);
            h4.r.a aVar2 = h4.r.S;
            d92.b.f58623a.getClass();
            d92.b.f58625c.getClass();
            h4.r rVarC = c2.l.C(aVar2, 0.0f, 0.0f, j92.b.f97899b.f97917b, 0.0f, 11);
            boolean zB = mVar.B(strP);
            Object objQ = mVar.q();
            p3.m.a aVar3 = p3.m.f135153a;
            if (zB) {
                objQ = new u91.c(strP, 21);
                mVar.K(objQ);
            } else {
                aVar3.getClass();
                if (objQ == p3.m.a.f135155b) {
                    objQ = new u91.c(strP, 21);
                    mVar.K(objQ);
                }
            }
            h4.r rVarC2 = p5.v.c((e23.l) objQ, rVarC, false);
            String strP2 = gl1.y.P(R.string.lbl_est_workout_time_lowercase, new Object[]{vVar.b(mVar)}, mVar);
            d92.b.f58624b.getClass();
            s5.x0 x0Var = j92.f.f97932i;
            s5.x0 x0VarF = d92.c.f(x0Var, mVar);
            d6.h.f57752b.getClass();
            mh.c(strP2, rVarC2, 0L, null, 0L, null, 0L, d6.h.a(d6.h.f57755e), 0L, 0, false, 0, 0, null, x0VarF, mVar, 0, 0, 130044);
            boolean zB2 = mVar.B(aVar) | mVar.B(p1Var);
            Object objQ2 = mVar.q();
            if (zB2) {
                objQ2 = new w52.p1(aVar, p1Var, 5);
                mVar.K(objQ2);
            } else {
                aVar3.getClass();
                if (objQ2 == p3.m.a.f135155b) {
                    objQ2 = new w52.p1(aVar, p1Var, 5);
                    mVar.K(objQ2);
                }
            }
            mh.c(gl1.y.Q(mVar, R.string.lbl_stp_edit_workout_steps), u1.w.d(aVar2, false, null, null, (e23.a) objQ2, 15), ds.e0.e(mVar), null, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, x0Var, mVar, 0, 0, 131064);
        } else {
            mVar.e();
        }
        return Unit.INSTANCE;
    }

    private final Object b(Object obj, Object obj2, Object obj3) {
        Integer numValueOf;
        Integer numValueOf2;
        sy.a aVar = (sy.a) this.f177374b;
        List list = (List) this.f177375c;
        pi0.e eVar = (pi0.e) this.f177376d;
        Float f14 = (Float) obj;
        p3.m mVar = (p3.m) obj2;
        int iIntValue = ((Integer) obj3).intValue();
        if ((iIntValue & 6) == 0) {
            iIntValue |= mVar.B(f14) ? 4 : 2;
        }
        if (mVar.n(iIntValue & 1, (iIntValue & 19) != 18)) {
            p3.x1 x1Var = p3.n.f135158a;
            if (f14 == null) {
                mVar.C(563585186);
                mVar.f();
            } else {
                mVar.C(563585187);
                ny.e eVar2 = (ny.e) list.get((int) f14.floatValue());
                ny.e.b values = eVar2.getValues();
                String strL = null;
                if ((values != null ? values.getDataDaysCount() : null) == null || values.getDataDaysCount().intValue() <= 0) {
                    numValueOf = null;
                    numValueOf2 = null;
                } else {
                    Integer activeCalories = values.getActiveCalories();
                    numValueOf2 = activeCalories != null ? Integer.valueOf(activeCalories.intValue() / values.getDataDaysCount().intValue()) : null;
                    Integer restingCalories = values.getRestingCalories();
                    numValueOf = restingCalories != null ? Integer.valueOf(restingCalories.intValue() / values.getDataDaysCount().intValue()) : null;
                }
                LocalDate localDateB = eVar2.b();
                if (localDateB != null) {
                    DateTime dateTimeAtStartOfDay = localDateB.toDateTimeAtStartOfDay();
                    dateTimeAtStartOfDay.getClass();
                    DateTime dateTimeAtStartOfDay2 = localDateB.plusDays(6).toDateTimeAtStartOfDay();
                    dateTimeAtStartOfDay2.getClass();
                    strL = eVar.l(dateTimeAtStartOfDay, dateTimeAtStartOfDay2, pi0.f.SHORT_MONTH_NO_WEEKDAY);
                }
                if (strL == null) {
                    strL = "";
                }
                w5.r.a(strL, aVar.a(numValueOf2), aVar.a(numValueOf), gl1.y.Q(mVar, R.string.calories_average_active), gl1.y.Q(mVar, R.string.activities_average_resting_lbl), mVar, 0);
                mVar.f();
            }
        } else {
            mVar.e();
        }
        return Unit.INSTANCE;
    }

    private final Object c(Object obj, Object obj2, Object obj3) {
        e23.l lVar = (e23.l) this.f177376d;
        b11.i iVar = (b11.i) this.f177374b;
        p3.p1 p1Var = (p3.p1) this.f177375c;
        h4.r rVar = (h4.r) obj;
        p3.m mVar = (p3.m) obj2;
        v.h.y(1257026709, rVar, (Integer) obj3, mVar);
        p3.x1 x1Var = p3.n.f135158a;
        Object objQ = mVar.q();
        p3.m.f135153a.getClass();
        p3.m.a.C2565a c2565a = p3.m.a.f135155b;
        if (objQ == c2565a) {
            objQ = new x91.d(p1Var, 9);
            mVar.K(objQ);
        }
        e23.a aVar = (e23.a) objQ;
        boolean zB = mVar.B(lVar) | mVar.B(iVar);
        Object objQ2 = mVar.q();
        if (zB || objQ2 == c2565a) {
            objQ2 = new xr.a(7, lVar, iVar);
            mVar.K(objQ2);
        }
        h4.r rVarF = u1.w.f(238, aVar, (e23.a) objQ2, rVar, null, true);
        mVar.f();
        return rVarF;
    }

    /* JADX WARN: Code duplicated, block: B:15:0x0067  */
    private final Object d(Object obj, Object obj2, Object obj3) {
        vf2.e eVar = (vf2.e) this.f177374b;
        e23.l lVar = (e23.l) this.f177376d;
        lc.y yVar = (lc.y) this.f177375c;
        p3.m mVar = (p3.m) obj2;
        int iIntValue = ((Integer) obj3).intValue();
        ((e2.d) obj).getClass();
        if (mVar.n(iIntValue & 1, (iIntValue & 17) != 16)) {
            p3.x1 x1Var = p3.n.f135158a;
            String str = eVar.f177933e;
            if (str == null) {
                mVar.C(-1096614963);
                mVar.f();
            } else {
                mVar.C(-1096614962);
                p2 p2Var = p2.f111205a;
                boolean zB = mVar.B(lVar) | mVar.B(eVar) | mVar.r(yVar);
                Object objQ = mVar.q();
                if (zB) {
                    objQ = new yg2.l(lVar, eVar, yVar, 2);
                    mVar.K(objQ);
                } else {
                    p3.m.f135153a.getClass();
                    if (objQ == p3.m.a.f135155b) {
                        objQ = new yg2.l(lVar, eVar, yVar, 2);
                        mVar.K(objQ);
                    }
                }
                p2Var.g(str, null, null, null, null, false, false, (e23.a) objQ, mVar, 0, 254);
                mVar.f();
            }
        } else {
            mVar.e();
        }
        return Unit.INSTANCE;
    }

    private final Object e(Object obj, Object obj2, Object obj3) {
        Integer balancedUpper;
        Integer balancedLow;
        in0.j jVar = (in0.j) this.f177374b;
        un0.a aVar = (un0.a) this.f177375c;
        i41.a aVar2 = (i41.a) this.f177376d;
        t2 t2Var = (t2) obj;
        p3.m mVar = (p3.m) obj2;
        int iIntValue = ((Integer) obj3).intValue();
        t2Var.getClass();
        if ((iIntValue & 6) == 0) {
            iIntValue |= mVar.B(t2Var) ? 4 : 2;
        }
        if (mVar.n(iIntValue & 1, (iIntValue & 19) != 18)) {
            p3.x1 x1Var = p3.n.f135158a;
            j23.g<Double> gVar = jVar.f94473c.f94451b.f94453a;
            String strB = aVar.b(gVar);
            int i14 = iIntValue;
            l72.x0 x0Var = l72.x0.f111346a;
            String strA = aVar.a(gVar, false);
            String strQ = gl1.y.Q(mVar, R.string.lbl_typical_overnigh_range);
            String strQ2 = aVar.q();
            b92.a.C0235a c0235a = new b92.a.C0235a(null, 1, null);
            c0235a.f16962a.put("merge", strB);
            b92.a aVarB = c0235a.b();
            int i15 = b92.a.f16960b;
            int i16 = (i14 & 14) | (l72.x0.f111348c << 24);
            x0Var.a(i16, 52, aVarB, t2Var, null, null, strA, strQ, strQ2, null, mVar);
            double dIntValue = 0.0d;
            double dIntValue2 = (aVar2 == null || (balancedLow = aVar2.getBalancedLow()) == null) ? 0.0d : balancedLow.intValue();
            if (aVar2 != null && (balancedUpper = aVar2.getBalancedUpper()) != null) {
                dIntValue = balancedUpper.intValue();
            }
            j23.d dVar = new j23.d(dIntValue2, dIntValue);
            String strB2 = aVar.b(dVar);
            String strA2 = aVar.a(dVar, false);
            String strQ3 = gl1.y.Q(mVar, R.string.lbl_hrv_status_range);
            String strQ4 = aVar.q();
            b92.a.C0235a c0235a2 = new b92.a.C0235a(null, 1, null);
            c0235a2.f16962a.put("merge", strB2);
            x0Var.a(i16, 52, c0235a2.b(), t2Var, null, null, strA2, strQ3, strQ4, null, mVar);
        } else {
            mVar.e();
        }
        return Unit.INSTANCE;
    }

    private final Object f(Object obj, Object obj2, Object obj3) {
        String strD;
        Double d14 = (Double) this.f177374b;
        yp0.f fVar = (yp0.f) this.f177375c;
        jp0.a aVar = (jp0.a) this.f177376d;
        p3.m mVar = (p3.m) obj2;
        int iIntValue = ((Integer) obj3).intValue();
        ((c2.t) obj).getClass();
        if (mVar.n(iIntValue & 1, (iIntValue & 17) != 16)) {
            p3.x1 x1Var = p3.n.f135158a;
            h4.d.f81522a.getClass();
            h4.g.b bVar = h4.d.a.f81534l;
            c2.j.f22691a.getClass();
            c2.j.d dVar = c2.j.f22693c;
            h4.r.a aVar2 = h4.r.S;
            g6.f.a aVar3 = g6.f.f75994b;
            h4.r rVarC = c2.l.C(x2.f(aVar2, 1.0f), 0.0f, 0.0f, 8, 0.0f, 11);
            s2 s2VarA = q2.a(dVar, bVar, mVar, 54);
            int iHashCode = Long.hashCode(mVar.getU());
            i2 i2VarX = mVar.x();
            h4.r rVarC2 = h4.k.c(rVarC, mVar);
            h5.g.V.getClass();
            h5.e0.a aVar4 = h5.g.a.f81805b;
            if (mVar.F() == null) {
                p3.p0.l();
                throw null;
            }
            mVar.z();
            if (mVar.getT()) {
                mVar.M(aVar4);
            } else {
                mVar.c();
            }
            b4.c(h5.g.a.f81810g, s2VarA, mVar);
            b4.c(h5.g.a.f81809f, i2VarX, mVar);
            h5.g.a.b bVar2 = h5.g.a.f81813j;
            if (mVar.getT() || !p005kotlin.jvm.internal.s.g(mVar.q(), Integer.valueOf(iHashCode))) {
                v.h.z(iHashCode, mVar, iHashCode, bVar2);
            }
            b4.c(h5.g.a.f81807d, rVarC2, mVar);
            c2.l.f(u2.f22900a.a(aVar2, 1.0f, true), mVar);
            if (d14 != null) {
                strD = fVar.f198644e.d(d14.doubleValue(), true);
            } else {
                strD = fVar.f198646g;
            }
            d92.b.f58623a.getClass();
            d92.b.f58624b.getClass();
            mh.c(strD, c2.l.C(aVar2, 0.0f, 0.0f, 16, 0.0f, 11), 0L, null, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, d92.c.b(j92.f.f97931h, mVar), mVar, 48, 0, 131068);
            float f14 = 36;
            c02.h.e(x2.r(aVar2, f14, f14), aVar.getValueInML(), aVar.f(), mVar, 3078);
            mVar.y();
        } else {
            mVar.e();
        }
        return Unit.INSTANCE;
    }

    private final Object g(Object obj, Object obj2, Object obj3) {
        String str = (String) this.f177375c;
        String str2 = ((yp0.f) this.f177374b).f198646g;
        String str3 = (String) this.f177376d;
        t2 t2Var = (t2) obj;
        p3.m mVar = (p3.m) obj2;
        int iIntValue = ((Integer) obj3).intValue();
        t2Var.getClass();
        if ((iIntValue & 6) == 0) {
            iIntValue |= mVar.B(t2Var) ? 4 : 2;
        }
        if (mVar.n(iIntValue & 1, (iIntValue & 19) != 18)) {
            p3.x1 x1Var = p3.n.f135158a;
            int i14 = iIntValue;
            l72.x0 x0Var = l72.x0.f111346a;
            String str4 = str == null ? str2 : str;
            String strQ = gl1.y.Q(mVar, R.string.stress_level_low);
            int i15 = (l72.x0.f111348c << 24) | (i14 & 14);
            x0Var.a(i15, 124, null, t2Var, null, null, str4, strQ, null, null, mVar);
            x0Var.a(i15, 124, null, t2Var, null, null, str3 == null ? str2 : str3, gl1.y.Q(mVar, R.string.stress_level_high), null, null, mVar);
        } else {
            mVar.e();
        }
        return Unit.INSTANCE;
    }

    private final Object h(Object obj, Object obj2, Object obj3) {
        String str = (String) this.f177375c;
        String str2 = ((yp0.o) this.f177374b).f198686g;
        String str3 = (String) this.f177376d;
        t2 t2Var = (t2) obj;
        p3.m mVar = (p3.m) obj2;
        int iIntValue = ((Integer) obj3).intValue();
        t2Var.getClass();
        if ((iIntValue & 6) == 0) {
            iIntValue |= mVar.B(t2Var) ? 4 : 2;
        }
        if (mVar.n(iIntValue & 1, (iIntValue & 19) != 18)) {
            p3.x1 x1Var = p3.n.f135158a;
            int i14 = iIntValue;
            l72.x0 x0Var = l72.x0.f111346a;
            String str4 = str == null ? str2 : str;
            String strQ = gl1.y.Q(mVar, R.string.hydration_lowest_daily_avg);
            int i15 = (l72.x0.f111348c << 24) | (i14 & 14);
            x0Var.a(i15, 124, null, t2Var, null, null, str4, strQ, null, null, mVar);
            x0Var.a(i15, 124, null, t2Var, null, null, str3 == null ? str2 : str3, gl1.y.Q(mVar, R.string.hydration_highest_daily_avg), null, null, mVar);
        } else {
            mVar.e();
        }
        return Unit.INSTANCE;
    }

    /* JADX WARN: Code duplicated, block: B:12:0x0045  */
    private final Object i(Object obj, Object obj2, Object obj3) {
        yq0.e eVar = (yq0.e) this.f177374b;
        yq0.b bVar = (yq0.b) this.f177375c;
        e23.l lVar = (e23.l) this.f177376d;
        p3.m mVar = (p3.m) obj2;
        int iIntValue = ((Integer) obj3).intValue();
        ((e2.d) obj).getClass();
        if (mVar.n(iIntValue & 1, (iIntValue & 17) != 16)) {
            p3.x1 x1Var = p3.n.f135158a;
            List<tq0.k> list = bVar.f198733a.f166049c;
            boolean zB = mVar.B(lVar);
            Object objQ = mVar.q();
            if (zB) {
                objQ = new wr1.d(lVar, 19);
                mVar.K(objQ);
            } else {
                p3.m.f135153a.getClass();
                if (objQ == p3.m.a.f135155b) {
                    objQ = new wr1.d(lVar, 19);
                    mVar.K(objQ);
                }
            }
            yq0.a.c(null, eVar, list, (e23.l) objQ, mVar, 0);
        } else {
            mVar.e();
        }
        return Unit.INSTANCE;
    }

    /* JADX WARN: Code duplicated, block: B:28:0x0113  */
    private final Object j(Object obj, Object obj2, Object obj3) {
        String lowerCase;
        String lowerCase2;
        p3.m mVar;
        String str;
        List<tq0.e> list = (List) this.f177374b;
        tq0.e eVar = (tq0.e) this.f177375c;
        e23.l lVar = (e23.l) this.f177376d;
        p3.m mVar2 = (p3.m) obj2;
        int iIntValue = ((Integer) obj3).intValue();
        ((c2.c1) obj).getClass();
        if (mVar2.n(iIntValue & 1, (iIntValue & 17) != 16)) {
            p3.x1 x1Var = p3.n.f135158a;
            for (tq0.e eVar2 : list) {
                if (eVar == null || (str = eVar.f166052a) == null) {
                    lowerCase = null;
                } else {
                    lowerCase = str.toLowerCase(Locale.ROOT);
                    lowerCase.getClass();
                }
                String str2 = eVar2.f166052a;
                if (str2 != null) {
                    lowerCase2 = str2.toLowerCase(Locale.ROOT);
                    lowerCase2.getClass();
                } else {
                    lowerCase2 = null;
                }
                boolean zG = p005kotlin.jvm.internal.s.g(lowerCase, lowerCase2);
                String str3 = eVar2.f166053b;
                if (str3 == null) {
                    mVar2.C(1991561686);
                    mVar2.f();
                    mVar = mVar2;
                } else {
                    mVar2.C(1991561687);
                    h4.r rVarZ = x2.z(h4.r.S, null, 3);
                    o4.m1.a aVar = o4.m1.f128891a;
                    o6 o6Var = o6.f89151a;
                    d92.b.f58623a.getClass();
                    long jA = d92.b.a(mVar2).d().a().a();
                    long jA2 = d92.b.a(mVar2).h().a();
                    long jA3 = d92.b.a(mVar2).k().a();
                    o6Var.getClass();
                    p3.m mVar3 = mVar2;
                    xb xbVarB = o6.b(0L, jA3, 0L, 0L, 0L, 0L, jA, 0L, jA2, 0L, mVar3, 3453);
                    g6.f.a aVar2 = g6.f.f75994b;
                    u1.u uVarA = u1.n.a(2, d92.b.a(mVar3).d().a().a());
                    boolean zB = mVar3.B(lVar) | mVar3.B(eVar2);
                    Object objQ = mVar3.q();
                    if (zB) {
                        objQ = new xr.a(24, lVar, eVar2);
                        mVar3.K(objQ);
                    } else {
                        p3.m.f135153a.getClass();
                        if (objQ == p3.m.a.f135155b) {
                            objQ = new xr.a(24, lVar, eVar2);
                            mVar3.K(objQ);
                        }
                    }
                    e23.a aVar3 = (e23.a) objQ;
                    z3.e eVarC = z3.f.c(945603016, new b(str3, 19), mVar3);
                    mVar = mVar3;
                    i3.y1.b(zG, aVar3, eVarC, rVarZ, false, null, null, aVar, xbVarB, null, uVarA, mVar, 12586368, 2672);
                    mVar.f();
                }
                mVar2 = mVar;
            }
            p3.x1 x1Var2 = p3.n.f135158a;
        } else {
            mVar2.e();
        }
        return Unit.INSTANCE;
    }

    /* JADX WARN: Code duplicated, block: B:35:0x0083  */
    private final Object k(Object obj, Object obj2, Object obj3) {
        q71.b bVar;
        i53.c<q71.b> cVar;
        q71.b next;
        q71.c cVar2 = (q71.c) this.f177374b;
        q71.e eVar = (q71.e) this.f177375c;
        Context context = (Context) this.f177376d;
        Float f14 = (Float) obj;
        p3.m mVar = (p3.m) obj2;
        int iIntValue = ((Integer) obj3).intValue();
        if ((iIntValue & 6) == 0) {
            iIntValue |= mVar.B(f14) ? 4 : 2;
        }
        if (mVar.n(iIntValue & 1, (iIntValue & 19) != 18)) {
            p3.x1 x1Var = p3.n.f135158a;
            if (cVar2 == null || (cVar = cVar2.f143234b) == null) {
                bVar = null;
            } else {
                Iterator<q71.b> it = cVar.iterator();
                do {
                    if (!it.hasNext()) {
                        next = null;
                        break;
                    }
                    next = it.next();
                } while (!p005kotlin.jvm.internal.s.b(next.f143230a, f14));
                bVar = next;
            }
            if (bVar != null) {
                String str = bVar.f143231b;
                String str2 = bVar.f143232c;
                if (eVar != null) {
                    c3 c3Var = eVar.f143245b;
                    boolean zB = mVar.B(c3Var);
                    Object objQ = mVar.q();
                    if (zB) {
                        objQ = oi0.c.A(context, new yq.d(23), dh.b.A(context, c3Var));
                        mVar.K(objQ);
                    } else {
                        p3.m.f135153a.getClass();
                        if (objQ == p3.m.a.f135155b) {
                            objQ = oi0.c.A(context, new yq.d(23), dh.b.A(context, c3Var));
                            mVar.K(objQ);
                        }
                    }
                    i53.f fVarA = i53.a.a(new d82.a(gl1.d.T(c3Var, mVar, 0), str, null, null, 12, null));
                    b92.a.C0235a c0235a = new b92.a.C0235a(null, 1, null);
                    c0235a.f16962a.put("merge", j20.x.d(str2, StringUtils.SPACE, str, StringUtils.SPACE, (String) objQ));
                    b92.a aVarB = c0235a.b();
                    int i14 = b92.a.f16960b;
                    d82.d.a(str2, fVarA, aVarB, mVar, 0, 0);
                }
            }
            p3.x1 x1Var2 = p3.n.f135158a;
        } else {
            mVar.e();
        }
        return Unit.INSTANCE;
    }

    private final Object l(Object obj, Object obj2, Object obj3) {
        String str = (String) this.f177375c;
        String str2 = ((zs0.d) this.f177374b).f206839j;
        String str3 = (String) this.f177376d;
        t2 t2Var = (t2) obj;
        p3.m mVar = (p3.m) obj2;
        int iIntValue = ((Integer) obj3).intValue();
        t2Var.getClass();
        if ((iIntValue & 6) == 0) {
            iIntValue |= mVar.B(t2Var) ? 4 : 2;
        }
        if (mVar.n(iIntValue & 1, (iIntValue & 19) != 18)) {
            p3.x1 x1Var = p3.n.f135158a;
            int i14 = iIntValue;
            l72.x0 x0Var = l72.x0.f111346a;
            String str4 = str == null ? str2 : str;
            String strQ = gl1.y.Q(mVar, R.string.activity_details_power);
            String strQ2 = gl1.y.Q(mVar, R.string.lbl_watts);
            zs0.d.b bVar = new zs0.d.b();
            if (str == null) {
                str = str2;
            }
            b92.a aVarA = wz1.a.a(gl1.y.P(R.string.lbl_power_value_watts, new Object[]{str}, mVar));
            int i15 = i14 & 14;
            int i16 = b92.a.f16960b;
            int i17 = (l72.x0.f111348c << 24) | i15;
            x0Var.a(i17, 48, aVarA, t2Var, null, null, str4, strQ, strQ2, bVar, mVar);
            String str5 = str3 == null ? str2 : str3;
            String strQ3 = gl1.y.Q(mVar, R.string.lbl_power_watts_per_kilogram_abbreviation);
            String strQ4 = gl1.y.Q(mVar, R.string.lbl_watt_kg);
            zs0.d.c cVar = new zs0.d.c();
            if (str3 != null) {
                str2 = str3;
            }
            x0Var.a(i17, 48, wz1.a.a(gl1.y.P(R.string.lbl_power_value_watts_per_kilogram, new Object[]{str2}, mVar)), t2Var, null, null, str5, strQ3, strQ4, cVar, mVar);
        } else {
            mVar.e();
        }
        return Unit.INSTANCE;
    }

    /* JADX WARN: Code duplicated, block: B:238:0x04de  */
    /* JADX WARN: Code duplicated, block: B:430:0x088e  */
    /* JADX WARN: Code duplicated, block: B:486:0x0ab9  */
    /* JADX WARN: Code duplicated, block: B:48:0x00f8  */
    /* JADX WARN: Code duplicated, block: B:526:0x0bc1  */
    /* JADX WARN: Code duplicated, block: B:549:0x0c81  */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // e23.q
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        String strA;
        int i14;
        a71.e eVar;
        List<com.garmin.android.apps.connectmobile.performance.model.c> list;
        int i15;
        DateTime dateTime;
        String str;
        e71.m nVar;
        e71.i iVar;
        String strA2;
        String str2;
        String strA3;
        boolean z14;
        boolean z15;
        boolean z16;
        String str3;
        String str4;
        boolean z17;
        a71.p pVar;
        boolean z18;
        com.garmin.android.apps.connectmobile.performance.model.c cVar;
        a71.c cVar2;
        a71.c cVar3;
        Object next;
        aa1.j value;
        String string;
        LocalDate localDateNow;
        DateTime dateTimeAtStartOfDay;
        Object bVar;
        int i16 = this.f177373a;
        String str5 = "";
        int i17 = 3;
        p3.m.a aVar = p3.m.f135153a;
        Intent intentC = null;
        Object obj4 = this.f177376d;
        Object obj5 = this.f177375c;
        int i18 = 9;
        Object obj6 = this.f177374b;
        int i19 = 1;
        switch (i16) {
            case 0:
                i53.c cVar4 = (i53.c) obj6;
                String str6 = (String) obj5;
                e23.l lVar = (e23.l) obj4;
                p3.m mVar = (p3.m) obj2;
                int iIntValue = ((Integer) obj3).intValue();
                ((e2.d) obj).getClass();
                if (mVar.n(iIntValue & 1, (iIntValue & 17) != 16)) {
                    p3.x1 x1Var = p3.n.f135158a;
                    t0.d(0, lVar, cVar4, str6, mVar);
                } else {
                    mVar.e();
                }
                return Unit.INSTANCE;
            case 1:
                Object obj7 = (com.garmin.android.apps.connectmobile.stress.presentation.view.a) obj6;
                Object obj8 = (o53.b0) obj5;
                Object obj9 = (i3.a1) obj4;
                h82.r rVar = (h82.r) obj;
                p3.m mVar2 = (p3.m) obj2;
                int iIntValue2 = ((Integer) obj3).intValue();
                com.garmin.android.apps.connectmobile.stress.presentation.view.a.C0859a c0859a = com.garmin.android.apps.connectmobile.stress.presentation.view.a.f45025j;
                rVar.getClass();
                if ((iIntValue2 & 6) == 0) {
                    iIntValue2 |= mVar2.B(rVar) ? 4 : 2;
                }
                int i24 = iIntValue2;
                if (mVar2.n(i24 & 1, (i24 & 19) != 18)) {
                    p3.x1 x1Var2 = p3.n.f135158a;
                    Object obj10 = (Context) mVar2.A(AndroidCompositionLocals_androidKt.f6042b);
                    rVar.D(R.string.lbl_time_to_relax, mVar2, (i24 << 3) & 112);
                    String strP = gl1.y.P(R.string.msg_relax_reminders_description, new Object[]{gl1.y.Q(mVar2, R.string.device_settings_relax_reminders)}, mVar2);
                    boolean zR = mVar2.r(obj7) | mVar2.r(obj10) | mVar2.r(obj8) | mVar2.B(obj9);
                    Object objQ = mVar2.q();
                    if (zR) {
                        Object kVar = new ug2.k(obj7, obj10, obj8, obj9, 7);
                        mVar2.K(kVar);
                        objQ = kVar;
                    } else {
                        aVar.getClass();
                        if (objQ == p3.m.a.f135155b) {
                            Object kVar2 = new ug2.k(obj7, obj10, obj8, obj9, 7);
                            mVar2.K(kVar2);
                            objQ = kVar2;
                        }
                    }
                    rVar.w(strP, null, (e23.a) objQ, mVar2, (i24 << 9) & 7168, 2);
                } else {
                    mVar2.e();
                }
                return Unit.INSTANCE;
            case 2:
                e23.l lVar2 = (e23.l) obj4;
                p3.p1 p1Var = (p3.p1) obj6;
                vt0.a aVar2 = (vt0.a) obj5;
                p3.m mVar3 = (p3.m) obj2;
                int iIntValue3 = ((Integer) obj3).intValue();
                ((c2.a0) obj).getClass();
                if (mVar3.n(iIntValue3 & 1, (iIntValue3 & 17) != 16)) {
                    p3.x1 x1Var3 = p3.n.f135158a;
                    for (vt0.a aVar3 : vt0.a.f180047e) {
                        z3.e eVarC = z3.f.c(142974776, new tr2.o(aVar3, 27), mVar3);
                        boolean zB = mVar3.B(lVar2) | mVar3.k(aVar3.ordinal());
                        Object objQ2 = mVar3.q();
                        if (zB) {
                            objQ2 = new ug2.b0(lVar2, aVar3, p1Var, i18);
                            mVar3.K(objQ2);
                        } else {
                            aVar.getClass();
                            if (objQ2 == p3.m.a.f135155b) {
                                objQ2 = new ug2.b0(lVar2, aVar3, p1Var, i18);
                                mVar3.K(objQ2);
                            }
                        }
                        i3.u.b(eVarC, (e23.a) objQ2, null, null, z3.f.c(1583358900, new vq0.a(7, aVar2, aVar3), mVar3), false, null, null, mVar3, 24582, 492);
                        i18 = 9;
                    }
                    p3.x1 x1Var4 = p3.n.f135158a;
                } else {
                    mVar3.e();
                }
                return Unit.INSTANCE;
            case 3:
                vx1.e eVar2 = (vx1.e) obj6;
                List list2 = (List) obj5;
                Context context = (Context) obj4;
                h82.r rVar2 = (h82.r) obj;
                p3.m mVar4 = (p3.m) obj2;
                int iIntValue4 = ((Integer) obj3).intValue();
                int i25 = vx1.e.f180659j;
                rVar2.getClass();
                if ((iIntValue4 & 6) == 0) {
                    iIntValue4 |= mVar4.B(rVar2) ? 4 : 2;
                }
                int i26 = iIntValue4;
                if (mVar4.n(i26 & 1, (i26 & 19) != 18)) {
                    p3.x1 x1Var5 = p3.n.f135158a;
                    String str7 = eVar2.f180660f;
                    if (str7 == null) {
                        p005kotlin.jvm.internal.s.m("title");
                        throw null;
                    }
                    int i27 = (i26 << 6) & 896;
                    rVar2.E(str7, mVar4, i27);
                    rVar2.l(R.string.lbl_strength_training_help_description, i27, 2, null, mVar4);
                    rVar2.a(z3.f.c(-1991770839, new sk0.k1(list2, rVar2, eVar2, context, 26), mVar4), mVar4, ((i26 << 3) & 112) | 6);
                } else {
                    mVar4.e();
                }
                return Unit.INSTANCE;
            case 4:
                m4.b0 b0Var = (m4.b0) obj6;
                String str8 = (String) obj5;
                e23.l lVar3 = (e23.l) obj4;
                t2 t2Var = (t2) obj;
                p3.m mVar5 = (p3.m) obj2;
                int iIntValue5 = ((Integer) obj3).intValue();
                t2Var.getClass();
                if ((iIntValue5 & 6) == 0) {
                    iIntValue5 |= mVar5.B(t2Var) ? 4 : 2;
                }
                if (mVar5.n(iIntValue5 & 1, (iIntValue5 & 19) != 18)) {
                    p3.x1 x1Var6 = p3.n.f135158a;
                    h4.r rVarE = u1.n.e(t2Var.a(h4.r.S, 1.0f, true), vb.h.e(d92.b.f58623a, mVar5), o4.m1.f128891a);
                    d92.b.f58625c.getClass();
                    h4.r rVarA = m4.e.a(c2.l.C(rVarE, 0.0f, 0.0f, j92.b.f97899b.f97920e, 0.0f, 11), b0Var);
                    long jC = d92.b.a(mVar5).c().c();
                    String strQ = gl1.y.Q(mVar5, R.string.lbl_search);
                    boolean zB2 = mVar5.B(lVar3);
                    Object objQ3 = mVar5.q();
                    if (zB2) {
                        objQ3 = new b71.n(lVar3, 26, (byte) 0);
                        mVar5.K(objQ3);
                    } else {
                        aVar.getClass();
                        if (objQ3 == p3.m.a.f135155b) {
                            objQ3 = new b71.n(lVar3, 26, (byte) 0);
                            mVar5.K(objQ3);
                        }
                    }
                    vy0.v.b(rVarA, str8, strQ, null, null, jC, (e23.p) objQ3, mVar5, 0);
                } else {
                    mVar5.e();
                }
                return Unit.INSTANCE;
            case 5:
                String str9 = (String) obj5;
                String str10 = (String) obj6;
                z3.e eVar3 = (z3.e) obj4;
                p3.m mVar6 = (p3.m) obj2;
                int iIntValue6 = ((Integer) obj3).intValue();
                ((c2.a0) obj).getClass();
                if (mVar6.n(iIntValue6 & 1, (iIntValue6 & 17) != 16)) {
                    p3.x1 x1Var7 = p3.n.f135158a;
                    h4.r.a aVar4 = h4.r.S;
                    h4.r rVarB = u1.a2.b(x2.d(aVar4, 1.0f), u1.a2.a(mVar6), true);
                    c2.j.f22691a.getClass();
                    c2.j.k kVar3 = c2.j.f22694d;
                    h4.d.f81522a.getClass();
                    c2.z zVarA = c2.y.a(kVar3, h4.d.a.f81536n, mVar6, 0);
                    int iHashCode = Long.hashCode(mVar6.getU());
                    i2 i2VarX = mVar6.x();
                    h4.r rVarC = h4.k.c(rVarB, mVar6);
                    h5.g.V.getClass();
                    h5.e0.a aVar5 = h5.g.a.f81805b;
                    if (mVar6.F() == null) {
                        p3.p0.l();
                        throw null;
                    }
                    mVar6.z();
                    if (mVar6.getT()) {
                        mVar6.M(aVar5);
                    } else {
                        mVar6.c();
                    }
                    b4.c(h5.g.a.f81810g, zVarA, mVar6);
                    b4.c(h5.g.a.f81809f, i2VarX, mVar6);
                    h5.g.a.b bVar2 = h5.g.a.f81813j;
                    if (mVar6.getT() || !p005kotlin.jvm.internal.s.g(mVar6.q(), Integer.valueOf(iHashCode))) {
                        v.h.z(iHashCode, mVar6, iHashCode, bVar2);
                    }
                    b4.c(h5.g.a.f81807d, rVarC, mVar6);
                    c2.b0 b0Var2 = c2.b0.f22601a;
                    if (str9 != null) {
                        mVar6.C(1441295215);
                        d92.b.f58623a.getClass();
                        d92.b.f58625c.getClass();
                        j92.e eVar4 = j92.b.f97899b;
                        float f14 = eVar4.f97920e;
                        float f15 = eVar4.f97918c;
                        h4.r rVarB2 = c2.l.B(aVar4, f14, f14, f14, f15);
                        d92.b.f58624b.getClass();
                        mh.c(str9, rVarB2, 0L, null, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, d92.c.b(d92.c.e(j92.f.f97931h), mVar6), mVar6, 0, 0, 131068);
                        if (str10 != null) {
                            mVar6.C(1441677662);
                            mh.c(str10, c2.l.B(aVar4, f14, f14, f14, f15), 0L, null, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, d92.c.b(j92.f.f97932i, mVar6), mVar6, 0, 0, 131068);
                            mVar6.f();
                        } else {
                            mVar6.C(1442003038);
                            mVar6.f();
                        }
                        mVar6.f();
                    } else {
                        mVar6.C(1442016926);
                        mVar6.f();
                    }
                    eVar3.invoke(mVar6, 0);
                    mVar6.y();
                } else {
                    mVar6.e();
                }
                return Unit.INSTANCE;
            case 6:
                x11.f fVar = (x11.f) obj6;
                v21.e eVar5 = (v21.e) obj5;
                e23.l lVar4 = (e23.l) obj4;
                p3.m mVar7 = (p3.m) obj2;
                int iIntValue7 = ((Integer) obj3).intValue();
                ((e2.d) obj).getClass();
                if (mVar7.n(iIntValue7 & 1, (iIntValue7 & 17) != 16)) {
                    p3.x1 x1Var8 = p3.n.f135158a;
                    b11.l lVar5 = fVar.f188406b;
                    if (lVar5 == null) {
                        mVar7.C(-1285223128);
                        mVar7.f();
                        strA = null;
                    } else {
                        mVar7.C(-457100807);
                        strA = lVar5.a(w2.a0.s(mVar7));
                        mVar7.f();
                    }
                    if (strA == null) {
                        mVar7.C(-457099394);
                        strA = gl1.y.Q(mVar7, b11.c.SNACKS.f14251b);
                    } else {
                        mVar7.C(-457101595);
                    }
                    mVar7.f();
                    String str11 = strA;
                    b63.v vVar = fVar.f188405a;
                    Boolean bool = fVar.f188412h;
                    boolean zB3 = mVar7.B(lVar4);
                    Object objQ4 = mVar7.q();
                    if (zB3) {
                        objQ4 = new ta0.j(lVar4, 26);
                        mVar7.K(objQ4);
                    } else {
                        aVar.getClass();
                        if (objQ4 == p3.m.a.f135155b) {
                            objQ4 = new ta0.j(lVar4, 26);
                            mVar7.K(objQ4);
                        }
                    }
                    y01.n.a(eVar5, vVar, str11, bool, (e23.l) objQ4, mVar7, 0);
                    h4.r.a aVar6 = h4.r.S;
                    d92.b.f58623a.getClass();
                    d92.b.f58625c.getClass();
                    c2.l.f(x2.h(aVar6, j92.b.f97899b.f97921f), mVar7);
                } else {
                    mVar7.e();
                }
                return Unit.INSTANCE;
            case 7:
                w61.x xVar = (w61.x) obj6;
                DateTime dateTime2 = (DateTime) obj5;
                DateTime dateTime3 = (DateTime) obj4;
                fw.m mVar8 = (fw.m) obj;
                fw.m mVar9 = (fw.m) obj2;
                int i28 = w61.x.O0;
                mVar9.getClass();
                mVar8.getClass();
                int i29 = w61.x.b.f183290a[o53.f0.p(mVar8, mVar9).ordinal()];
                if (i29 == 1) {
                    return new fw.m(null, fw.p.LOADING, null, null, 9, null);
                }
                if (i29 == 2) {
                    fw.p pVar2 = fw.p.ERROR;
                    fw.c rVar3 = mVar8.f73771d;
                    if (rVar3 == null && (rVar3 = mVar9.f73771d) == null) {
                        rVar3 = new fw.r();
                    }
                    return new fw.m(null, pVar2, null, rVar3, 1, null);
                }
                if (i29 != 3) {
                    lc.u0.r();
                    return null;
                }
                fw.m.a aVar7 = fw.m.f73767e;
                xVar.L4(dateTime2, dateTime3);
                if (dateTime2 == null || dateTime3 == null) {
                    i14 = 1;
                    eVar = null;
                } else {
                    boolean zE = g22.k.e(DateTime.now(), dateTime2, dateTime3);
                    x61.k kVar4 = xVar.f183267c;
                    com.garmin.android.apps.connectmobile.performance.model.a aVar8 = (com.garmin.android.apps.connectmobile.performance.model.a) mVar8.f73770c;
                    String str12 = aVar8 != null ? aVar8.f39917a : null;
                    if (str12 == null) {
                        str12 = "";
                    }
                    TrainingStatusReportDTO trainingStatusReportDTO = (TrainingStatusReportDTO) mVar9.f73770c;
                    boolean z19 = xVar.M0;
                    Boolean boolD = xVar.f183276k0.d();
                    boolean zBooleanValue = boolD != null ? boolD.booleanValue() : false;
                    boolean z24 = xVar.N0;
                    w61.v vVar2 = new w61.v(xVar, false ? 1 : 0);
                    Integer numValueOf = Integer.valueOf(R.string.msg_no_data_available);
                    l22.b bVar3 = kVar4.f189261b;
                    f12.l.f68084a.getClass();
                    DateTime dateTimeK = c22.j0.K(f12.l.a.a().V0(), "yyyy-MM-dd");
                    boolean z25 = dateTimeK != null;
                    ArrayList arrayList = new ArrayList();
                    List<com.garmin.android.apps.connectmobile.performance.model.c> listC = (trainingStatusReportDTO == null || trainingStatusReportDTO.f39910a) ? trainingStatusReportDTO != null ? trainingStatusReportDTO.f39912c.get(str12) : null : trainingStatusReportDTO.C();
                    if (listC != null) {
                        for (com.garmin.android.apps.connectmobile.performance.model.c cVar5 : p13.h0.Z(listC)) {
                            int i30 = i19;
                            double dI = cVar5.I();
                            Double D = cVar5.D();
                            double dDoubleValue = D != null ? D.doubleValue() : Double.NaN;
                            List<com.garmin.android.apps.connectmobile.performance.model.c> list3 = listC;
                            double d14 = cVar5.B;
                            boolean z26 = cVar5.f39959r;
                            double d15 = !z26 ? cVar5.f39965z : cVar5.f39946e;
                            double d16 = !z26 ? cVar5.f39964y : cVar5.f39945d;
                            DateTime dateTimeC = cVar5.C();
                            DateTime dateTime4 = dateTimeK;
                            String strA4 = ((pi0.e) kVar4.f189263d.getValue()).a(cVar5.C(), qi0.a.NUMERIC_YEAR_MONTH_DAY);
                            a61.e eVar6 = a61.e.f1563a;
                            double dI2 = cVar5.I();
                            eVar6.getClass();
                            String strC = a61.e.c(bVar3, dI2);
                            Double D2 = cVar5.D();
                            String strC2 = a61.e.c(bVar3, D2 != null ? D2.doubleValue() : Double.NaN);
                            boolean z27 = cVar5.f39957p;
                            String str13 = cVar5.f39961v;
                            String str14 = str13 == null ? str5 : str13;
                            String str15 = cVar5.f39962w;
                            arrayList.add(new a71.d(dI, dDoubleValue, d14, d15, d16, dateTimeC, strA4, strC, strC2, z27, str14, str15 == null ? str5 : str15, !cVar5.f39959r, a61.e.d(kVar4.f189261b, cVar5.I(), cVar5.G(), cVar5.f39957p)));
                            listC = list3;
                            dateTimeK = dateTime4;
                            str5 = str5;
                            i19 = i30;
                        }
                        list = listC;
                        i15 = i19;
                        dateTime = dateTimeK;
                        str = str5;
                        Unit unit = Unit.INSTANCE;
                    } else {
                        list = listC;
                        i15 = 1;
                        dateTime = dateTimeK;
                        str = "";
                    }
                    int i34 = i15;
                    if (arrayList.size() > i34) {
                        p13.c0.u(arrayList, new x61.o());
                    }
                    a71.d dVar = (a71.d) p13.h0.n0(arrayList);
                    if (dVar != null && dVar.f1749m == i34) {
                        e71.m.a aVar9 = e71.m.f63320c;
                        String str16 = dVar.f1747k;
                        String str17 = dVar.f1748l;
                        aVar9.getClass();
                        nVar = e71.m.a.b(str16, str17);
                    } else if (dVar != null) {
                        e71.m.a aVar10 = e71.m.f63320c;
                        double d17 = dVar.f1737a;
                        double d18 = dVar.f1740d;
                        double d19 = dVar.f1741e;
                        aVar10.getClass();
                        nVar = e71.m.a.c(d17, d18, d19);
                    } else {
                        nVar = new e71.n();
                    }
                    if (dVar != null) {
                        e71.m.a aVar11 = e71.m.f63320c;
                        double d24 = dVar.f1739c;
                        aVar11.getClass();
                        if (d24 < 0.8d) {
                            iVar = e71.i.LOW;
                        } else if (0.8d <= d24 && d24 <= 1.2d) {
                            iVar = e71.i.OPTIMAL;
                        } else if (1.3d <= d24 && d24 <= 1.4d) {
                            iVar = e71.i.HIGH_OPTIMAL;
                        } else if (1.5d > d24 || d24 > 1.9d) {
                            iVar = d24 >= 2.0d ? e71.i.VERY_HIGH : e71.i.NONE;
                        } else {
                            iVar = e71.i.HIGH;
                        }
                        if (iVar == null) {
                            iVar = e71.i.NONE;
                        }
                    } else {
                        iVar = e71.i.NONE;
                    }
                    if (dVar != null) {
                        double d25 = dVar.f1737a;
                        a61.e.f1563a.getClass();
                        bVar3.getClass();
                        int i35 = z25 ? R.string.lbl_string_ts_pause : R.string.string_line_string_pattern;
                        if (Double.isNaN(d25)) {
                            strA2 = str;
                        } else {
                            Integer num = nVar.f63321a;
                            l3.f23124b.getClass();
                            String str18 = l3.f23131i.format(d25);
                            str18.getClass();
                            strA2 = bVar3.a(i35, str18, num != null ? bVar3.getString(num.intValue()) : str);
                        }
                    } else {
                        strA2 = null;
                    }
                    if (dVar != null) {
                        String str19 = strA2;
                        double d26 = dVar.f1739c;
                        a61.e eVar7 = a61.e.f1563a;
                        int i36 = iVar.f63314a;
                        eVar7.getClass();
                        bVar3.getClass();
                        if (Double.isNaN(d26) && i36 == -1) {
                            str2 = str19;
                            strA3 = str;
                        } else {
                            int i37 = z25 ? R.string.lbl_string_ts_pause : R.string.string_line_string_pattern;
                            str2 = str19;
                            String str20 = l3.f23126d.format(d26);
                            str20.getClass();
                            strA3 = bVar3.a(i37, str20, bVar3.getString(i36));
                        }
                    } else {
                        str2 = strA2;
                        strA3 = null;
                    }
                    if (arrayList.isEmpty()) {
                        z14 = zE;
                        z15 = false;
                    } else {
                        Iterator it = arrayList.iterator();
                        while (true) {
                            if (it.hasNext()) {
                                z14 = zE;
                                if (Double.isNaN(((a71.d) it.next()).f1737a)) {
                                    zE = z14;
                                } else {
                                    z15 = true;
                                }
                            } else {
                                z14 = zE;
                                z15 = false;
                            }
                        }
                    }
                    if (arrayList.isEmpty()) {
                        z16 = false;
                    } else {
                        Iterator it3 = arrayList.iterator();
                        while (true) {
                            if (!it3.hasNext()) {
                                z16 = false;
                            } else if (!Double.isNaN(((a71.d) it3.next()).f1739c)) {
                                z16 = true;
                            }
                        }
                    }
                    String string2 = (z25 || !z15) ? str : bVar3.getString(nVar.f63322b);
                    String strG = z25 ? e5.g(bVar3.getString(R.string.gcm_training_status_paused_label), StringUtils.SPACE, bVar3.getString(R.string.lbl_resume_training_status)) : (iVar == e71.i.NONE || !z16) ? str : bVar3.getString(iVar.f63315b);
                    double d27 = dVar != null ? dVar.f1737a : Double.NaN;
                    double d28 = dVar != null ? dVar.f1738b : Double.NaN;
                    double d29 = d27;
                    double d34 = dVar != null ? dVar.f1739c : Double.NaN;
                    a61.e.f1563a.getClass();
                    String strC3 = a61.e.c(bVar3, d29);
                    String strC4 = a61.e.c(bVar3, d28);
                    boolean zIsNaN = Double.isNaN(d29);
                    boolean zIsNaN2 = Double.isNaN(d34);
                    if (arrayList.isEmpty()) {
                        str3 = strC3;
                        str4 = string2;
                        z17 = false;
                    } else {
                        Iterator it4 = arrayList.iterator();
                        while (true) {
                            if (it4.hasNext()) {
                                str3 = strC3;
                                str4 = string2;
                                if (Double.isNaN(((a71.d) it4.next()).f1739c)) {
                                    string2 = str4;
                                    strC3 = str3;
                                } else {
                                    z17 = true;
                                }
                            } else {
                                str3 = strC3;
                                str4 = string2;
                                z17 = false;
                            }
                        }
                    }
                    o13.p pVar3 = (strA3 == null || dateTime == null) ? new o13.p(strA3, strG) : new o13.p(String.format(bVar3.getString(R.string.string_short_dash_line_string_pattern), Arrays.copyOf(new Object[]{strA3, bVar3.getString(R.string.load_ratio_title)}, 2)), e5.g(bVar3.getString(R.string.gcm_training_status_paused_label), ". ", bVar3.getString(R.string.lbl_resume_training_status)));
                    String str21 = (String) pVar3.f128594a;
                    String str22 = (String) pVar3.f128595b;
                    if (zIsNaN) {
                        pVar = a71.p.NO_DATA;
                    } else if (z17) {
                        pVar = a71.p.AVAILABLE;
                    } else {
                        pVar = !zIsNaN2 ? a71.p.NO_DATA_WITH_LATEST_WORKLOAD_RATIO : a71.p.NO_DATA_WITH_LATEST_ACUTE_LOAD;
                    }
                    if (arrayList.isEmpty()) {
                        z18 = false;
                    } else {
                        Iterator it5 = arrayList.iterator();
                        while (true) {
                            if (!it5.hasNext()) {
                                z18 = false;
                            } else if (!Double.isNaN(((a71.d) it5.next()).f1738b)) {
                                z18 = true;
                            }
                        }
                    }
                    boolean z28 = z19 && !zBooleanValue && z18;
                    if (trainingStatusReportDTO == null || trainingStatusReportDTO.f39910a) {
                        z18 = z28;
                    }
                    if (list != null) {
                        Iterator<T> it6 = list.iterator();
                        while (true) {
                            if (it6.hasNext()) {
                                next = it6.next();
                                com.garmin.android.apps.connectmobile.performance.model.c cVar6 = (com.garmin.android.apps.connectmobile.performance.model.c) next;
                                if (cVar6 == null || !cVar6.C) {
                                }
                            } else {
                                next = null;
                            }
                        }
                        cVar = (com.garmin.android.apps.connectmobile.performance.model.c) next;
                    } else {
                        cVar = null;
                    }
                    boolean z29 = cVar != null || z19;
                    if (zBooleanValue) {
                        int i38 = x61.k.b.f189264a[pVar.ordinal()];
                        int i39 = R.string.lbl_past_load_ratio_description_short;
                        if (i38 == 1) {
                            if (z14) {
                                i39 = R.string.lbl_load_ratio_description_short;
                            }
                            cVar3 = new a71.c(false, false, false, false, null, true, numValueOf, Integer.valueOf(i39), 17, null);
                        } else if (i38 == 2) {
                            if (z14) {
                                i39 = R.string.lbl_load_ratio_description_short;
                            }
                            cVar3 = new a71.c(true, false, false, true, null, true, numValueOf, Integer.valueOf(i39), 16, null);
                        } else if (i38 == 3) {
                            cVar2 = new a71.c(true, true, true, true, Boolean.TRUE, false, null, null, 192, null);
                        } else {
                            if (i38 != 4) {
                                lc.u0.r();
                                return null;
                            }
                            cVar3 = new a71.c(true, true, true, true, Boolean.FALSE, false, null, null, 192, null);
                        }
                        cVar2 = cVar3;
                    } else {
                        cVar2 = null;
                    }
                    i14 = 1;
                    eVar = new a71.e(arrayList, str2, strA3, str21, str22, str4, str3, strC4, z29, zBooleanValue, z18, z18 && z24, cVar2, vVar2, !z15, dateTime, trainingStatusReportDTO != null ? trainingStatusReportDTO.f39910a : true);
                }
                return fw.m.a.g(aVar7, eVar, i14);
            case 8:
                ba1.d dVar2 = (ba1.d) obj6;
                Context context2 = (Context) obj5;
                lc.m0 m0Var = (lc.m0) obj4;
                q91.d dVar3 = (q91.d) obj;
                String str23 = (String) obj2;
                boolean zBooleanValue2 = ((Boolean) obj3).booleanValue();
                dVar3.getClass();
                q91.g gVar = dVar3.f143580b;
                if (zBooleanValue2) {
                    dVar2.getClass();
                    context2.getClass();
                    int i44 = ba1.d.a.f17000b[dVar3.ordinal()];
                    if (i44 == 1 || i44 == 2) {
                        localDateNow = LocalDate.now();
                    } else if (str23 != null) {
                        try {
                            int i45 = o13.q.f128596b;
                            bVar = LocalDate.parse(str23);
                        } catch (Throwable th3) {
                            int i46 = o13.q.f128596b;
                            bVar = new o13.q.b(th3);
                        }
                        boolean z34 = bVar instanceof o13.q.b;
                        Object obj11 = bVar;
                        if (z34) {
                            obj11 = null;
                        }
                        localDateNow = (LocalDate) obj11;
                    } else {
                        localDateNow = null;
                    }
                    if (localDateNow == null) {
                        dateTimeAtStartOfDay = null;
                    } else {
                        int i47 = ba1.d.a.f17000b[dVar3.ordinal()];
                        if (i47 == 3 || i47 == 4) {
                            localDateNow = localDateNow.dayOfWeek().withMaximumValue();
                        } else if (i47 == 5 || i47 == 6) {
                            localDateNow = localDateNow.dayOfMonth().withMaximumValue();
                        }
                        dateTimeAtStartOfDay = localDateNow.toDateTimeAtStartOfDay();
                    }
                    if (dateTimeAtStartOfDay != null) {
                        p91.a aVar12 = (p91.a) KoinJavaComponent.get$default(p91.a.class, null, null, 6, null);
                        int i48 = ba1.d.a.f16999a[gVar.ordinal()];
                        if (i48 == 1) {
                            intentC = aVar12.c(context2, dateTimeAtStartOfDay);
                        } else if (i48 == 2) {
                            intentC = aVar12.f(context2, dateTimeAtStartOfDay);
                        }
                    }
                    if (intentC != null) {
                        context2.startActivity(intentC);
                    }
                    break;
                } else {
                    dVar2.getClass();
                    z91.a aVar13 = z91.a.f203130a;
                    Context context3 = dVar2.f16975a;
                    long j8 = dVar3.f143579a;
                    com.garmin.android.apps.connectmobile.repcounting.model.f fVar2 = dVar2.f16987m;
                    aVar13.getClass();
                    String strC5 = z91.a.c(context3, j8, fVar2);
                    if (strC5 == null) {
                        strC5 = "";
                    }
                    boolean z35 = gVar == q91.g.PUSHES;
                    r53.z1<aa1.j> z1Var = dVar2.f16992r;
                    do {
                        value = z1Var.getValue();
                        string = context3.getString(z35 ? R.string.personal_records_pushes_streak_empty_description : R.string.personal_records_steps_streak_empty_description);
                        string.getClass();
                    } while (!z1Var.b(value, new aa1.j(strC5, string, Integer.valueOf(z35 ? R.drawable.push_walk : R.drawable.steps))));
                    lc.y.l(m0Var, w91.y.h.INSTANCE);
                }
                return Unit.INSTANCE;
            case 9:
                String str24 = (String) obj5;
                String str25 = (String) obj6;
                u4.d dVar4 = (u4.d) obj4;
                p3.m mVar10 = (p3.m) obj2;
                int iIntValue8 = ((Integer) obj3).intValue();
                ((t2) obj).getClass();
                if (mVar10.n(1 & iIntValue8, (iIntValue8 & 17) != 16)) {
                    p3.x1 x1Var9 = p3.n.f135158a;
                    wg2.j.a(0, str24, str25, mVar10, dVar4);
                } else {
                    mVar10.e();
                }
                return Unit.INSTANCE;
            case 10:
                in0.m mVar11 = (in0.m) obj6;
                in0.h.a aVar14 = (in0.h.a) obj5;
                un0.a aVar15 = (un0.a) obj4;
                c2.t tVar = (c2.t) obj;
                p3.m mVar12 = (p3.m) obj2;
                int iIntValue9 = ((Integer) obj3).intValue();
                tVar.getClass();
                if ((iIntValue9 & 6) == 0) {
                    iIntValue9 |= mVar12.B(tVar) ? 4 : 2;
                }
                if (mVar12.n(1 & iIntValue9, (iIntValue9 & 19) != 18)) {
                    p3.x1 x1Var10 = p3.n.f135158a;
                    h4.r.a aVar16 = h4.r.S;
                    h4.d.f81522a.getClass();
                    wn0.g.j(tVar.c(aVar16, h4.d.a.f81529g), mVar11, aVar14, aVar15, mVar12, un0.a.f172042b << 9);
                } else {
                    mVar12.e();
                }
                return Unit.INSTANCE;
            case 11:
                return a(obj, obj2, obj3);
            case 12:
                xm0.z zVar = (xm0.z) obj6;
                p3.p1 p1Var2 = (p3.p1) obj5;
                p3.p1 p1Var3 = (p3.p1) obj4;
                p3.m mVar13 = (p3.m) obj2;
                int iIntValue10 = ((Integer) obj3).intValue();
                ((c2.a0) obj).getClass();
                if (mVar13.n(iIntValue10 & 1, (iIntValue10 & 17) != 16)) {
                    p3.x1 x1Var11 = p3.n.f135158a;
                    for (xm0.v vVar3 : xm0.v.f191469e) {
                        z3.e eVarC2 = z3.f.c(-959872466, new vy0.e(vVar3, 21), mVar13);
                        boolean zR2 = mVar13.r(zVar) | mVar13.k(vVar3.ordinal());
                        Object objQ5 = mVar13.q();
                        if (zR2) {
                            objQ5 = new x72.k(zVar, i17, vVar3, p1Var2);
                            mVar13.K(objQ5);
                        } else {
                            aVar.getClass();
                            if (objQ5 == p3.m.a.f135155b) {
                                objQ5 = new x72.k(zVar, i17, vVar3, p1Var2);
                                mVar13.K(objQ5);
                            }
                        }
                        i3.u.b(eVarC2, (e23.a) objQ5, null, null, z3.f.c(2026496170, new xm0.h(i19, vVar3, p1Var3), mVar13), false, null, null, mVar13, 24582, 492);
                    }
                    p3.x1 x1Var12 = p3.n.f135158a;
                } else {
                    mVar13.e();
                }
                return Unit.INSTANCE;
            case 13:
                return b(obj, obj2, obj3);
            case 14:
                return c(obj, obj2, obj3);
            case 15:
                return d(obj, obj2, obj3);
            case 16:
                return e(obj, obj2, obj3);
            case 17:
                return f(obj, obj2, obj3);
            case 18:
                return g(obj, obj2, obj3);
            case 19:
                return h(obj, obj2, obj3);
            case 20:
                return i(obj, obj2, obj3);
            case 21:
                return j(obj, obj2, obj3);
            case 22:
                return k(obj, obj2, obj3);
            case 23:
                return l(obj, obj2, obj3);
            default:
                zu1.k kVar5 = (zu1.k) obj6;
                Map.Entry entry = (Map.Entry) obj5;
                List<av1.g> list4 = (List) obj4;
                p3.m mVar14 = (p3.m) obj2;
                int iIntValue11 = ((Integer) obj3).intValue();
                zu1.k.a aVar17 = zu1.k.f207122d;
                ((e2.d) obj).getClass();
                if (mVar14.n(1 & iIntValue11, (iIntValue11 & 17) != 16)) {
                    p3.x1 x1Var13 = p3.n.f135158a;
                    kVar5.u6(gl1.y.Q(mVar14, ((hv1.b) entry.getKey()).f85832a), list4, mVar14, 0);
                } else {
                    mVar14.e();
                }
                return Unit.INSTANCE;
        }
    }

    public /* synthetic */ s0(Object obj, int i14, Object obj2, Object obj3) {
        this.f177373a = i14;
        this.f177374b = obj;
        this.f177375c = obj2;
        this.f177376d = obj3;
    }

    public /* synthetic */ s0(Object obj, String str, int i14, Object obj2) {
        this.f177373a = i14;
        this.f177375c = str;
        this.f177374b = obj;
        this.f177376d = obj2;
    }

    public /* synthetic */ s0(int i14, e23.l lVar, Object obj, Object obj2) {
        this.f177373a = i14;
        this.f177376d = lVar;
        this.f177374b = obj;
        this.f177375c = obj2;
    }
}
