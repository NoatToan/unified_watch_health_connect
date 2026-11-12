package vv0;

import android.content.Context;
import c2.h2;
import c2.q2;
import c2.s2;
import c2.t2;
import c2.u2;
import c2.x2;
import c22.x0;
import ch.qos.logback.core.net.SyslogConstants;
import com.garmin.android.apps.connectmobile.R;
import com.garmin.android.apps.connectmobile.courses.model.ClimbDTO;
import com.garmin.android.apps.connectmobile.courses.presentation.custom.CreateCustomCourseActivity;
import com.garmin.android.apps.connectmobile.nutrition.presentation.NutritionActivity;
import com.google.android.exoplayer2.extractor.ts.TsExtractor;
import f5.z0;
import i3.b3;
import i3.i7;
import i3.k4;
import i3.mh;
import i3.w9;
import i3.x3;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.t1;
import l72.c1;
import l72.p2;
import o4.m1;
import org.apache.commons.lang3.StringUtils;
import org.joda.time.LocalDate;
import p005kotlin.Unit;
import p3.b2;
import p3.b4;
import p3.c2;
import p3.i2;
import p3.m;
import p3.n;
import p3.o1;
import p3.p1;
import p3.x1;
import u1.a2;
import v62.j1;

/* JADX INFO: loaded from: classes9.dex */
public final /* synthetic */ class e implements e23.q {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f180438a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f180439b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f180440c;

    public /* synthetic */ e(int i14, Object obj, Object obj2) {
        this.f180438a = i14;
        this.f180439b = obj;
        this.f180440c = obj2;
    }

    /* JADX WARN: Code duplicated, block: B:26:0x0186  */
    private final Object a(Object obj, Object obj2, Object obj3) {
        zv0.b bVar = (zv0.b) this.f180439b;
        e23.l lVar = (e23.l) this.f180440c;
        p3.m mVar = (p3.m) obj2;
        int iIntValue = ((Integer) obj3).intValue();
        ((c2.a0) obj).getClass();
        if (mVar.n(iIntValue & 1, (iIntValue & 17) != 16)) {
            x1 x1Var = p3.n.f135158a;
            h4.r.a aVar = h4.r.S;
            h4.r rVarE = u1.n.e(x2.f(aVar, 1.0f), vb.h.e(d92.b.f58623a, mVar), m1.f128891a);
            d92.b.f58625c.getClass();
            j92.e eVar = j92.b.f97899b;
            h4.r rVarB = a2.b(c2.l.y(rVarE, eVar.f97920e), a2.a(mVar), true);
            c2.j.f22691a.getClass();
            c2.j.k kVar = c2.j.f22694d;
            h4.d.f81522a.getClass();
            c2.z zVarA = c2.y.a(kVar, h4.d.a.f81536n, mVar, 0);
            int iHashCode = Long.hashCode(mVar.getU());
            i2 i2VarX = mVar.x();
            h4.r rVarC = h4.k.c(rVarB, mVar);
            h5.g.V.getClass();
            h5.e0.a aVar2 = h5.g.a.f81805b;
            if (mVar.F() == null) {
                p3.p0.l();
                throw null;
            }
            mVar.z();
            if (mVar.getT()) {
                mVar.M(aVar2);
            } else {
                mVar.c();
            }
            b4.c(h5.g.a.f81810g, zVarA, mVar);
            b4.c(h5.g.a.f81809f, i2VarX, mVar);
            h5.g.a.b bVar2 = h5.g.a.f81813j;
            if (mVar.getT() || !p005kotlin.jvm.internal.s.g(mVar.q(), Integer.valueOf(iHashCode))) {
                v.h.z(iHashCode, mVar, iHashCode, bVar2);
            }
            b4.c(h5.g.a.f81807d, rVarC, mVar);
            c2.b0 b0Var = c2.b0.f22601a;
            h4.r rVarC2 = c2.l.C(aVar, 0.0f, eVar.f97920e, 0.0f, 0.0f, 13);
            String str = bVar.f207163a;
            d92.b.f58624b.getClass();
            mh.c(str, rVarC2, 0L, null, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, d92.c.b(d92.c.e(j92.f.f97930g), mVar), mVar, 0, 0, 131068);
            mh.c(bVar.f207164b, c2.l.C(aVar, 0.0f, eVar.f97920e, 0.0f, 0.0f, 13), 0L, null, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, d92.c.b(j92.f.f97931h, mVar), mVar, 0, 0, 131068);
            String str2 = bVar.f207166d;
            if (str2 == null || lVar == null) {
                mVar.C(646196189);
                mVar.f();
            } else {
                mVar.C(645839224);
                l72.f0 f0Var = l72.f0.f110999a;
                h4.r rVarC3 = c2.l.C(x2.f(aVar, 1.0f), 0.0f, eVar.f97920e, 0.0f, 0.0f, 13);
                String strP = gl1.y.P(R.string.mct_learn_more_from, new Object[]{bVar.f207165c}, mVar);
                boolean zB = mVar.B(lVar) | mVar.B(str2);
                Object objQ = mVar.q();
                if (zB) {
                    objQ = new bb1.d(lVar, str2, 7);
                    mVar.K(objQ);
                } else {
                    p3.m.f135153a.getClass();
                    if (objQ == p3.m.a.f135155b) {
                        objQ = new bb1.d(lVar, str2, 7);
                        mVar.K(objQ);
                    }
                }
                f0Var.k(strP, rVarC3, true, (e23.a) objQ, mVar, 384, 0);
                mVar.f();
            }
            mVar.y();
        } else {
            mVar.e();
        }
        return Unit.INSTANCE;
    }

    private final Object b(Object obj, Object obj2, Object obj3) {
        p5.l lVar = (p5.l) this.f180439b;
        e23.a aVar = (e23.a) this.f180440c;
        h4.r rVar = (h4.r) obj;
        p3.m mVar = (p3.m) obj2;
        v.h.y(760855804, rVar, (Integer) obj3, mVar);
        x1 x1Var = p3.n.f135158a;
        Object objQ = mVar.q();
        p3.m.f135153a.getClass();
        p3.m.a.C2565a c2565a = p3.m.a.f135155b;
        if (objQ == c2565a) {
            objQ = new b2(0L);
            mVar.K(objQ);
        }
        o1 o1Var = (o1) objQ;
        boolean zL = mVar.l(1000L) | mVar.B(aVar);
        Object objQ2 = mVar.q();
        if (zL || objQ2 == c2565a) {
            objQ2 = new wz1.c(0, aVar, o1Var);
            mVar.K(objQ2);
        }
        h4.r rVarD = u1.w.d(rVar, false, null, lVar, (e23.a) objQ2, 11);
        mVar.f();
        return rVarD;
    }

    private final Object c(Object obj, Object obj2, Object obj3) {
        NutritionActivity nutritionActivity = (NutritionActivity) this.f180439b;
        x01.k kVar = (x01.k) this.f180440c;
        p3.m mVar = (p3.m) obj2;
        ((Integer) obj3).getClass();
        NutritionActivity.a aVar = NutritionActivity.f39581f;
        ((r1.e0) obj).getClass();
        x1 x1Var = p3.n.f135158a;
        String strQ = gl1.y.Q(mVar, R.string.myfitnesspal_now_source_of_nutrition_data);
        c1 c1Var = c1.f110940a;
        String strQ2 = gl1.y.Q(mVar, R.string.data_source_updated);
        int i14 = 1;
        b92.a.C0235a c0235a = new b92.a.C0235a(null, 1, null);
        Object objQ = mVar.q();
        p3.m.f135153a.getClass();
        p3.m.a.C2565a c2565a = p3.m.a.f135155b;
        if (objQ == c2565a) {
            objQ = new wy2.c(21);
            mVar.K(objQ);
        }
        c0235a.f16962a.put("text", oi0.c.B(strQ, (e23.l) objQ, mVar));
        b92.a aVarB = c0235a.b();
        String string = nutritionActivity.getString(R.string.lbl_ok);
        string.getClass();
        boolean zR = mVar.r(kVar);
        Object objQ2 = mVar.q();
        if (zR || objQ2 == c2565a) {
            objQ2 = new x01.a(kVar, i14);
            mVar.K(objQ2);
        }
        int i15 = b92.a.f16960b;
        c1Var.a(false, strQ2, strQ, null, aVarB, string, false, false, (e23.a) objQ2, null, null, mVar, 6, 0, 1736);
        return Unit.INSTANCE;
    }

    private final Object d(Object obj, Object obj2, Object obj3) {
        e23.l lVar = (e23.l) this.f180439b;
        x1.e eVar = (x1.e) this.f180440c;
        p3.m mVar = (p3.m) obj2;
        int iIntValue = ((Integer) obj3).intValue();
        if (mVar.n(iIntValue & 1, (iIntValue & 17) != 16)) {
            x1 x1Var = p3.n.f135158a;
            Object objQ = mVar.q();
            p3.m.f135153a.getClass();
            if (objQ == p3.m.a.f135155b) {
                x1.a.f188327a.getClass();
                objQ = new x1.i(x1.a.f188328b);
                mVar.K(objQ);
            }
            x1.i iVar = (x1.i) objQ;
            iVar.f188347b.clear();
            lVar.invoke(iVar);
            iVar.a(eVar, mVar, 0);
        } else {
            mVar.e();
        }
        return Unit.INSTANCE;
    }

    private final Object e(Object obj, Object obj2, Object obj3) {
        CreateCustomCourseActivity createCustomCourseActivity = (CreateCustomCourseActivity) this.f180439b;
        List list = (List) this.f180440c;
        int iIntValue = ((Integer) obj2).intValue();
        int iIntValue2 = ((Integer) obj3).intValue();
        CreateCustomCourseActivity.a aVar = CreateCustomCourseActivity.f33013f;
        ((ClimbDTO) obj).getClass();
        androidx.fragment.app.v supportFragmentManager = createCustomCourseActivity.getSupportFragmentManager();
        supportFragmentManager.getClass();
        int i14 = 3;
        c60.e.g(list, iIntValue, iIntValue2, supportFragmentManager, new x40.a(createCustomCourseActivity, i14), new x40.d(createCustomCourseActivity, i14), new x40.d(createCustomCourseActivity, 5));
        createCustomCourseActivity.fa().H4(createCustomCourseActivity.getResources().getDisplayMetrics().heightPixels / 2);
        x40.l0 l0VarFa = createCustomCourseActivity.fa();
        l0VarFa.getClass();
        l0VarFa.D4(new a50.e.q(iIntValue));
        return Unit.INSTANCE;
    }

    /* JADX WARN: Code duplicated, block: B:12:0x004e  */
    private final Object f(Object obj, Object obj2, Object obj3) {
        aa1.c cVar = (aa1.c) this.f180439b;
        p1 p1Var = (p1) this.f180440c;
        p3.m mVar = (p3.m) obj2;
        int iIntValue = ((Integer) obj3).intValue();
        ((e2.d) obj).getClass();
        if (mVar.n(iIntValue & 1, (iIntValue & 17) != 16)) {
            x1 x1Var = p3.n.f135158a;
            p2 p2Var = p2.f111205a;
            String strQ = gl1.y.Q(mVar, R.string.txt_date);
            String str = cVar.f2239g;
            boolean zB = mVar.B(p1Var);
            Object objQ = mVar.q();
            if (zB) {
                objQ = new w51.j0(p1Var, 29);
                mVar.K(objQ);
            } else {
                p3.m.f135153a.getClass();
                if (objQ == p3.m.a.f135155b) {
                    objQ = new w51.j0(p1Var, 29);
                    mVar.K(objQ);
                }
            }
            p2Var.h(strQ, str, null, null, null, false, false, null, null, null, (e23.a) objQ, mVar, 0, 0, 1020);
        } else {
            mVar.e();
        }
        return Unit.INSTANCE;
    }

    private final Object g(Object obj, Object obj2, Object obj3) {
        List list = (List) this.f180439b;
        o82.g gVar = (o82.g) this.f180440c;
        p3.m mVar = (p3.m) obj2;
        int iIntValue = ((Integer) obj3).intValue();
        ((c2.c1) obj).getClass();
        if (mVar.n(iIntValue & 1, (iIntValue & 17) != 16)) {
            x1 x1Var = p3.n.f135158a;
            Iterator it = list.iterator();
            while (it.hasNext()) {
                xe1.g.a((af1.e) it.next(), gVar, mVar, 0);
            }
            x1 x1Var2 = p3.n.f135158a;
        } else {
            mVar.e();
        }
        return Unit.INSTANCE;
    }

    private final Object h(Object obj, Object obj2, Object obj3) {
        xk1.f fVar = (xk1.f) this.f180439b;
        Context context = (Context) this.f180440c;
        h82.r rVar = (h82.r) obj;
        p3.m mVar = (p3.m) obj2;
        int iIntValue = ((Integer) obj3).intValue();
        int i14 = xk1.f.f191223j;
        rVar.getClass();
        if ((iIntValue & 6) == 0) {
            iIntValue |= mVar.B(rVar) ? 4 : 2;
        }
        int i15 = 0;
        if (mVar.n(iIntValue & 1, (iIntValue & 19) != 18)) {
            x1 x1Var = p3.n.f135158a;
            int i16 = (iIntValue << 3) & 112;
            rVar.D(R.string.hr_zones_help_cuztomization_options, mVar, i16);
            rVar.l(R.string.hr_zones_help_cust_options_desc, (iIntValue << 6) & 896, 2, null, mVar);
            rVar.j(z3.f.c(2942905, new xk1.e(rVar, i15, fVar, context), mVar), mVar, i16 | 6);
        } else {
            mVar.e();
        }
        return Unit.INSTANCE;
    }

    /* JADX WARN: Code duplicated, block: B:19:0x006a  */
    private final Object i(Object obj, Object obj2, Object obj3) {
        Object obj4 = (xn.l) this.f180439b;
        Object obj5 = (Context) this.f180440c;
        h82.r rVar = (h82.r) obj;
        p3.m mVar = (p3.m) obj2;
        int iIntValue = ((Integer) obj3).intValue();
        int i14 = xn.l.f191612f;
        rVar.getClass();
        if ((iIntValue & 6) == 0) {
            iIntValue |= mVar.B(rVar) ? 4 : 2;
        }
        if (mVar.n(iIntValue & 1, (iIntValue & 19) != 18)) {
            x1 x1Var = p3.n.f135158a;
            x0.f23314a.getClass();
            rVar.E(gl1.d.W(x0.X8), mVar, (iIntValue << 6) & 896);
            String strW = gl1.d.W(x0.Y8);
            boolean zR = mVar.r(obj4) | mVar.r(obj5);
            Object objQ = mVar.q();
            if (zR) {
                objQ = new wz1.c(28, obj4, obj5);
                mVar.K(objQ);
            } else {
                p3.m.f135153a.getClass();
                if (objQ == p3.m.a.f135155b) {
                    objQ = new wz1.c(28, obj4, obj5);
                    mVar.K(objQ);
                }
            }
            rVar.w(strW, null, (e23.a) objQ, mVar, (iIntValue << 9) & 7168, 2);
        } else {
            mVar.e();
        }
        return Unit.INSTANCE;
    }

    private final Object j(Object obj, Object obj2, Object obj3) {
        Integer mediumStressDuration;
        Integer highStressDuration;
        Integer restStressDuration;
        Integer lowStressDuration;
        String str = (String) this.f180439b;
        kr1.a aVar = (kr1.a) this.f180440c;
        p3.m mVar = (p3.m) obj2;
        int iIntValue = ((Integer) obj3).intValue();
        ((c2.t) obj).getClass();
        int iIntValue2 = 0;
        if (mVar.n(iIntValue & 1, (iIntValue & 17) != 16)) {
            x1 x1Var = p3.n.f135158a;
            h4.r.a aVar2 = h4.r.S;
            h4.r rVarF = x2.f(aVar2, 1.0f);
            c2.j.f22691a.getClass();
            c2.j.d dVar = c2.j.f22693c;
            h4.d.f81522a.getClass();
            s2 s2VarA = q2.a(dVar, h4.d.a.f81534l, mVar, 54);
            int iHashCode = Long.hashCode(mVar.getU());
            i2 i2VarX = mVar.x();
            h4.r rVarC = h4.k.c(rVarF, mVar);
            h5.g.V.getClass();
            h5.e0.a aVar3 = h5.g.a.f81805b;
            if (mVar.F() == null) {
                p3.p0.l();
                throw null;
            }
            mVar.z();
            if (mVar.getT()) {
                mVar.M(aVar3);
            } else {
                mVar.c();
            }
            b4.c(h5.g.a.f81810g, s2VarA, mVar);
            b4.c(h5.g.a.f81809f, i2VarX, mVar);
            h5.g.a.b bVar = h5.g.a.f81813j;
            if (mVar.getT() || !p005kotlin.jvm.internal.s.g(mVar.q(), Integer.valueOf(iHashCode))) {
                v.h.z(iHashCode, mVar, iHashCode, bVar);
            }
            b4.c(h5.g.a.f81807d, rVarC, mVar);
            u2 u2Var = u2.f22900a;
            d92.b.f58623a.getClass();
            d92.b.f58624b.getClass();
            s5.x0 x0VarB = d92.c.b(j92.f.f97931h, mVar);
            d92.b.f58625c.getClass();
            j92.e eVar = j92.b.f97899b;
            mh.c(str, c2.l.C(aVar2, 0.0f, 0.0f, eVar.f97920e, 0.0f, 11), 0L, null, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, x0VarB, mVar, 0, 0, 131068);
            h4.r rVarQ = x2.q(c2.l.C(aVar2, 0.0f, 0.0f, eVar.f97920e, 0.0f, 11), gl.b.q(mVar, R.dimen.chart_hover_marker_view_height));
            kr1.a.b values = aVar.getValues();
            int iIntValue3 = (values == null || (lowStressDuration = values.getLowStressDuration()) == null) ? 0 : lowStressDuration.intValue();
            kr1.a.b values2 = aVar.getValues();
            int iIntValue4 = (values2 == null || (restStressDuration = values2.getRestStressDuration()) == null) ? 0 : restStressDuration.intValue();
            kr1.a.b values3 = aVar.getValues();
            int iIntValue5 = (values3 == null || (highStressDuration = values3.getHighStressDuration()) == null) ? 0 : highStressDuration.intValue();
            kr1.a.b values4 = aVar.getValues();
            if (values4 != null && (mediumStressDuration = values4.getMediumStressDuration()) != null) {
                iIntValue2 = mediumStressDuration.intValue();
            }
            g6.f.a aVar4 = g6.f.f75994b;
            vr1.g.a(rVarQ, iIntValue4, iIntValue3, iIntValue2, iIntValue5, null, 4, mVar, 1572864, 32);
            mVar.y();
        } else {
            mVar.e();
        }
        return Unit.INSTANCE;
    }

    private final Object k(Object obj, Object obj2, Object obj3) {
        dy1.v vVar = (dy1.v) this.f180439b;
        Context context = (Context) this.f180440c;
        p3.m mVar = (p3.m) obj2;
        int iIntValue = ((Integer) obj3).intValue();
        ((e2.d) obj).getClass();
        if (mVar.n(iIntValue & 1, (iIntValue & 17) != 16)) {
            x1 x1Var = p3.n.f135158a;
            h4.r.a aVar = h4.r.S;
            d92.b.f58623a.getClass();
            d92.b.f58625c.getClass();
            j92.e eVar = j92.b.f97899b;
            h4.r rVarC = c2.l.C(c2.l.A(aVar, eVar.f97921f, 0.0f, 2), 0.0f, 0.0f, 0.0f, eVar.f97920e, 7);
            String strD = vVar.d(context);
            d92.b.f58624b.getClass();
            s5.x0 x0VarF = d92.c.f(j92.f.f97933j, mVar);
            d6.h.f57752b.getClass();
            mh.c(strD, rVarC, 0L, null, 0L, null, 0L, d6.h.a(d6.h.f57755e), 0L, 0, false, 0, 0, null, x0VarF, mVar, 0, 0, 130044);
        } else {
            mVar.e();
        }
        return Unit.INSTANCE;
    }

    private final Object l(Object obj, Object obj2, Object obj3) {
        sy.a aVar = (sy.a) this.f180439b;
        List list = (List) this.f180440c;
        Float f14 = (Float) obj;
        p3.m mVar = (p3.m) obj2;
        int iIntValue = ((Integer) obj3).intValue();
        if ((iIntValue & 6) == 0) {
            iIntValue |= mVar.B(f14) ? 4 : 2;
        }
        if (mVar.n(iIntValue & 1, (iIntValue & 19) != 18)) {
            x1 x1Var = p3.n.f135158a;
            if (f14 == null) {
                mVar.C(-755265565);
                mVar.f();
            } else {
                mVar.C(-755265564);
                ny.c cVar = (ny.c) list.get((int) f14.floatValue());
                LocalDate localDateB = cVar.b();
                String strN = localDateB != null ? c22.j0.n(localDateB.toDateTimeAtStartOfDay(), 'M') : null;
                if (strN == null) {
                    strN = "";
                }
                String str = strN;
                ny.c.b values = cVar.getValues();
                String strA = aVar.a(values != null ? values.getActiveCalories() : null);
                ny.c.b values2 = cVar.getValues();
                w5.r.a(str, strA, aVar.a(values2 != null ? values2.getRestingCalories() : null), gl1.y.Q(mVar, R.string.calories_active), gl1.y.Q(mVar, R.string.lbl_resting_calorie), mVar, 0);
                mVar.f();
            }
        } else {
            mVar.e();
        }
        return Unit.INSTANCE;
    }

    private final Object n(Object obj, Object obj2, Object obj3) {
        p008y1.p0 p0Var = (p008y1.p0) this.f180439b;
        c5.e eVar = (c5.e) this.f180440c;
        b5.a0 a0Var = (b5.a0) obj;
        b5.a0 a0Var2 = (b5.a0) obj2;
        n4.c cVar = (n4.c) obj3;
        n4.c.a aVar = n4.c.f123541b;
        aVar.getClass();
        p0Var.f193533v = 0L;
        if (p0Var.f193517d.invoke(b5.m0.a(a0Var.f15756i)).booleanValue()) {
            if (!p0Var.f193522i) {
                p0Var.n2();
            }
            aVar.getClass();
            c5.f.a(eVar, a0Var, 0L);
            long jI = n4.c.i(a0Var2.f15750c, cVar.f123544a);
            q53.b bVar = p0Var.f193520g;
            if (bVar != null) {
                q53.m.a(bVar.i(new y1.e0.c(jI, null)));
            }
        }
        return Unit.INSTANCE;
    }

    /* JADX WARN: Code duplicated, block: B:158:0x056f  */
    /* JADX WARN: Code duplicated, block: B:227:0x073a  */
    /* JADX WARN: Code duplicated, block: B:254:0x07f5  */
    /* JADX WARN: Code duplicated, block: B:263:0x0813  */
    /* JADX WARN: Code duplicated, block: B:309:0x0979  */
    /* JADX WARN: Code duplicated, block: B:387:0x0b71  */
    /* JADX WARN: Code duplicated, block: B:426:0x0c99  */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // e23.q
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        km1.v dailySleep;
        String strValueOf;
        final boolean zC;
        e23.a aVar;
        float f14;
        int i14 = this.f180438a;
        int i15 = 16;
        int i16 = 14;
        p3.m.a aVar2 = p3.m.f135153a;
        Object obj4 = this.f180440c;
        Object obj5 = this.f180439b;
        switch (i14) {
            case 0:
                Object obj6 = (f) obj5;
                Object obj7 = (Context) obj4;
                h82.r rVar = (h82.r) obj;
                p3.m mVar = (p3.m) obj2;
                int iIntValue = ((Integer) obj3).intValue();
                int i17 = f.f180442f;
                rVar.getClass();
                if ((iIntValue & 6) == 0) {
                    iIntValue |= mVar.B(rVar) ? 4 : 2;
                }
                if (mVar.n(iIntValue & 1, (iIntValue & 19) != 18)) {
                    x1 x1Var = p3.n.f135158a;
                    rVar.E(gl1.y.Q(mVar, R.string.lbl_more_logging_insights), mVar, (iIntValue << 6) & 896);
                    zv0.e.f207174a.getClass();
                    Object objA = zv0.e.a();
                    mVar.C(-531828351);
                    StringBuilder sb3 = new StringBuilder();
                    sb3.append(gl1.y.Q(mVar, R.string.msg_get_full_lifestyle_logging_experience));
                    if (objA != null) {
                        mVar.C(-654971554);
                        sb3.append(" <link>");
                        sb3.append(gl1.y.Q(mVar, R.string.common_shop_now));
                        sb3.append("</link>");
                        mVar.f();
                    } else {
                        mVar.C(-654813950);
                        mVar.f();
                    }
                    String string = sb3.toString();
                    mVar.f();
                    boolean zR = mVar.r(obj6) | mVar.r(obj7) | mVar.B(objA);
                    Object objQ = mVar.q();
                    if (zR) {
                        objQ = new ug2.b0(obj6, 10, obj7, objA);
                        mVar.K(objQ);
                    } else {
                        aVar2.getClass();
                        if (objQ == p3.m.a.f135155b) {
                            objQ = new ug2.b0(obj6, 10, obj7, objA);
                            mVar.K(objQ);
                        }
                    }
                    rVar.w(string, null, (e23.a) objQ, mVar, (iIntValue << 9) & 7168, 2);
                } else {
                    mVar.e();
                }
                return Unit.INSTANCE;
            case 1:
                ((Integer) obj3).getClass();
                ((lc.v) obj).getClass();
                x1 x1Var2 = p3.n.f135158a;
                lg.d.f((e23.a) obj5, (ux1.g) obj4, (p3.m) obj2, 0);
                return Unit.INSTANCE;
            case 2:
                k4 k4Var = (k4) obj5;
                b3 b3Var = (b3) obj4;
                p3.m mVar2 = (p3.m) obj2;
                int iIntValue2 = ((Integer) obj3).intValue();
                ((c2.a0) obj).getClass();
                if (mVar2.n(iIntValue2 & 1, (iIntValue2 & 17) != 16)) {
                    x1 x1Var3 = p3.n.f135158a;
                    x3.b(k4Var, null, null, b3Var, null, null, false, null, mVar2, 1794048, TsExtractor.TS_STREAM_TYPE_SPLICE_INFO);
                } else {
                    mVar2.e();
                }
                return Unit.INSTANCE;
            case 3:
                vx1.d dVar = (vx1.d) obj5;
                Context context = (Context) obj4;
                h82.r rVar2 = (h82.r) obj;
                p3.m mVar3 = (p3.m) obj2;
                int iIntValue3 = ((Integer) obj3).intValue();
                int i18 = vx1.d.f180657g;
                rVar2.getClass();
                if ((iIntValue3 & 6) == 0) {
                    iIntValue3 |= mVar3.B(rVar2) ? 4 : 2;
                }
                if (mVar3.n(iIntValue3 & 1, (iIntValue3 & 19) != 18)) {
                    x1 x1Var4 = p3.n.f135158a;
                    int i19 = (iIntValue3 << 3) & 112;
                    rVar2.D(R.string.lbl_stp_set_benchmarks_help_title, mVar3, i19);
                    int i24 = (iIntValue3 << 6) & 896;
                    rVar2.l(R.string.lbl_stp_set_benchmarks_help_intro, i24, 2, null, mVar3);
                    int i25 = i19 | 6;
                    rVar2.a(z3.f.c(1894240855, new vx1.b(rVar2, 0, context, dVar), mVar3), mVar3, i25);
                    rVar2.j(z3.f.c(1131818860, new vu0.h(rVar2, i16), mVar3), mVar3, i25);
                    String strQ = gl1.y.Q(mVar3, R.string.citation_american_academy_of_family_physicians);
                    boolean zR2 = mVar3.r(dVar) | mVar3.r(context);
                    Object objQ2 = mVar3.q();
                    if (zR2) {
                        objQ2 = new vx1.c(dVar, context);
                        mVar3.K(objQ2);
                    } else {
                        aVar2.getClass();
                        if (objQ2 == p3.m.a.f135155b) {
                            objQ2 = new vx1.c(dVar, context);
                            mVar3.K(objQ2);
                        }
                    }
                    rVar2.h(i24, (e23.a) objQ2, strQ, mVar3);
                } else {
                    mVar3.e();
                }
                return Unit.INSTANCE;
            case 4:
                vx1.e eVar = (vx1.e) obj5;
                List<? extends ix1.g> list = (List) obj4;
                p3.m mVar4 = (p3.m) obj2;
                int iIntValue4 = ((Integer) obj3).intValue();
                int i26 = vx1.e.f180659j;
                if (mVar4.n(iIntValue4 & 1, (iIntValue4 & 17) != 16)) {
                    x1 x1Var5 = p3.n.f135158a;
                    mx1.f fVar = eVar.f180661g;
                    if (fVar == null) {
                        p005kotlin.jvm.internal.s.m("planType");
                        throw null;
                    }
                    if (fVar.d()) {
                        mVar4.C(-871791705);
                        eVar.h(mVar4, 0);
                        mVar4.f();
                    } else {
                        mVar4.C(-871722699);
                        eVar.i(list, mVar4, 0);
                        mVar4.f();
                    }
                } else {
                    mVar4.e();
                }
                return Unit.INSTANCE;
            case 5:
                vx1.e eVar2 = (vx1.e) obj5;
                ix1.g gVar = (ix1.g) obj4;
                p3.m mVar5 = (p3.m) obj2;
                int iIntValue5 = ((Integer) obj3).intValue();
                int i27 = vx1.e.f180659j;
                if (mVar5.n(iIntValue5 & 1, (iIntValue5 & 17) != 16)) {
                    x1 x1Var6 = p3.n.f135158a;
                    eVar2.g(gVar, mVar5, 0);
                } else {
                    mVar5.e();
                }
                return Unit.INSTANCE;
            case 6:
                b10.d dVar2 = (b10.d) obj5;
                l22.a aVar3 = dVar2.f14215a;
                u82.f fVar2 = (u82.f) obj4;
                t2 t2Var = (t2) obj;
                p3.m mVar6 = (p3.m) obj2;
                int iIntValue6 = ((Integer) obj3).intValue();
                t2Var.getClass();
                if ((iIntValue6 & 6) == 0) {
                    iIntValue6 |= mVar6.B(t2Var) ? 4 : 2;
                }
                if (mVar6.n(iIntValue6 & 1, (iIntValue6 & 19) != 18)) {
                    x1 x1Var7 = p3.n.f135158a;
                    l72.x0 x0Var = l72.x0.f111346a;
                    km1.c cVar = (km1.c) fVar2.a();
                    String strC = dVar2.c(cVar != null ? cVar.Z() : null);
                    String string2 = aVar3.getString(R.string.lbl_quality);
                    int i28 = (iIntValue6 & 14) | (l72.x0.f111348c << 24);
                    x0Var.a(i28, 124, null, t2Var, null, null, strC, string2, null, null, mVar6);
                    km1.c cVar2 = (km1.c) fVar2.a();
                    x0Var.a(i28, 124, null, t2Var, null, null, dVar2.d((cVar2 == null || (dailySleep = cVar2.getDailySleep()) == null) ? null : Integer.valueOf(dailySleep.getSleepTimeSeconds())), aVar3.getString(R.string.txt_duration), null, null, mVar6);
                } else {
                    mVar6.e();
                }
                return Unit.INSTANCE;
            case 7:
                x11.f fVar3 = (x11.f) obj5;
                e23.l lVar = (e23.l) obj4;
                p3.m mVar7 = (p3.m) obj2;
                int iIntValue7 = ((Integer) obj3).intValue();
                ((e2.d) obj).getClass();
                if (mVar7.n(iIntValue7 & 1, (iIntValue7 & 17) != 16)) {
                    x1 x1Var8 = p3.n.f135158a;
                    List<b11.l> list2 = fVar3.f188407c;
                    b11.l lVar2 = fVar3.f188406b;
                    Long lValueOf = lVar2 != null ? Long.valueOf(lVar2.f14331a) : null;
                    boolean zB = mVar7.B(lVar);
                    Object objQ3 = mVar7.q();
                    if (zB) {
                        objQ3 = new ta0.j(lVar, 27);
                        mVar7.K(objQ3);
                    } else {
                        aVar2.getClass();
                        if (objQ3 == p3.m.a.f135155b) {
                            objQ3 = new ta0.j(lVar, 27);
                            mVar7.K(objQ3);
                        }
                    }
                    y01.p.a(null, list2, lValueOf, (e23.l) objQ3, false, mVar7, 0, 17);
                } else {
                    mVar7.e();
                }
                return Unit.INSTANCE;
            case 8:
                Integer num = (Integer) obj5;
                i41.f fVar4 = (i41.f) obj4;
                t2 t2Var2 = (t2) obj;
                p3.m mVar8 = (p3.m) obj2;
                int iIntValue8 = ((Integer) obj3).intValue();
                w31.c.a aVar4 = w31.c.f181844f;
                t2Var2.getClass();
                if ((iIntValue8 & 6) == 0) {
                    iIntValue8 |= mVar8.B(t2Var2) ? 4 : 2;
                }
                if (mVar8.n(iIntValue8 & 1, (iIntValue8 & 19) != 18)) {
                    x1 x1Var9 = p3.n.f135158a;
                    String strQ2 = gl1.y.Q(mVar8, R.string.lbl_ms);
                    l72.x0 x0Var2 = l72.x0.f111346a;
                    String strValueOf2 = String.valueOf(num.intValue());
                    String strQ3 = gl1.y.Q(mVar8, R.string.overnight_avg);
                    b92.a.C0235a c0235a = new b92.a.C0235a(null, 1, null);
                    c0235a.f16962a.put("merge", num + StringUtils.SPACE + gl1.y.Q(mVar8, R.string.lbl_overnight_average));
                    b92.a aVarB = c0235a.b();
                    int i29 = b92.a.f16960b;
                    int i30 = (iIntValue8 & 14) | (l72.x0.f111348c << 24);
                    x0Var2.a(i30, 52, aVarB, t2Var2, null, null, strValueOf2, strQ3, strQ2, null, mVar8);
                    Integer lastNight5MinHigh = fVar4.getLastNight5MinHigh();
                    if (lastNight5MinHigh == null || (strValueOf = String.valueOf(lastNight5MinHigh.intValue())) == null) {
                        strValueOf = "--";
                    }
                    String strQ4 = gl1.y.Q(mVar8, R.string.highest_5min_avg);
                    if (lastNight5MinHigh == null) {
                        strQ2 = null;
                    }
                    b92.a.C0235a c0235a2 = new b92.a.C0235a(null, 1, null);
                    c0235a2.f16962a.put("merge", com.nimbusds.jose.shaded.gson.internal.a.h(strValueOf, StringUtils.SPACE, gl1.y.Q(mVar8, R.string.lbl_highest_5_min_average), StringUtils.SPACE));
                    x0Var2.a(i30, 52, c0235a2.b(), t2Var2, null, null, strValueOf, strQ4, strQ2, null, mVar8);
                } else {
                    mVar8.e();
                }
                return Unit.INSTANCE;
            case 9:
                e23.l lVar3 = (e23.l) obj5;
                z51.h hVar = (z51.h) obj4;
                e23.a aVar5 = (e23.a) obj;
                p3.m mVar9 = (p3.m) obj2;
                int iIntValue9 = ((Integer) obj3).intValue();
                aVar5.getClass();
                if ((iIntValue9 & 6) == 0) {
                    iIntValue9 |= mVar9.r(aVar5) ? 4 : 2;
                }
                if (mVar9.n(iIntValue9 & 1, (iIntValue9 & 19) != 18)) {
                    x1 x1Var10 = p3.n.f135158a;
                    c1 c1Var = c1.f110940a;
                    String strQ5 = gl1.y.Q(mVar9, R.string.lbl_discard_activity);
                    String strQ6 = gl1.y.Q(mVar9, R.string.msg_delete_activity);
                    String strQ7 = gl1.y.Q(mVar9, R.string.lbl_discard);
                    String strQ8 = gl1.y.Q(mVar9, R.string.common_cancel);
                    int i34 = iIntValue9 & 14;
                    boolean zB2 = (i34 == 4) | mVar9.B(lVar3) | mVar9.r(hVar);
                    Object objQ4 = mVar9.q();
                    if (zB2) {
                        objQ4 = new ug2.b0(aVar5, i15, lVar3, hVar);
                        mVar9.K(objQ4);
                    } else {
                        aVar2.getClass();
                        if (objQ4 == p3.m.a.f135155b) {
                            objQ4 = new ug2.b0(aVar5, i15, lVar3, hVar);
                            mVar9.K(objQ4);
                        }
                    }
                    e23.a<Unit> aVar6 = (e23.a) objQ4;
                    boolean z14 = i34 == 4;
                    Object objQ5 = mVar9.q();
                    if (z14) {
                        objQ5 = new w51.j(aVar5, 2);
                        mVar9.K(objQ5);
                    } else {
                        aVar2.getClass();
                        if (objQ5 == p3.m.a.f135155b) {
                            objQ5 = new w51.j(aVar5, 2);
                            mVar9.K(objQ5);
                        }
                    }
                    c1Var.a(false, strQ5, strQ6, null, null, strQ7, true, false, aVar6, strQ8, (e23.a) objQ5, mVar9, 1572870, 0, SyslogConstants.LOG_LOCAL3);
                } else {
                    mVar9.e();
                }
                return Unit.INSTANCE;
            case 10:
                lc.h0 h0Var = (lc.h0) obj5;
                e23.l lVar4 = (e23.l) obj4;
                t2 t2Var3 = (t2) obj;
                p3.m mVar10 = (p3.m) obj2;
                int iIntValue10 = ((Integer) obj3).intValue();
                t2Var3.getClass();
                if ((iIntValue10 & 6) == 0) {
                    iIntValue10 |= mVar10.B(t2Var3) ? 4 : 2;
                }
                if (mVar10.n(iIntValue10 & 1, (iIntValue10 & 19) != 18)) {
                    x1 x1Var11 = p3.n.f135158a;
                    for (final w72.e eVar3 : w72.b.f183515a) {
                        eVar3.getClass();
                        if (h0Var != null) {
                            lc.h0.a aVar7 = lc.h0.f111771f;
                            k23.d dVarB = p005kotlin.jvm.internal.s0.f105811a.b(eVar3.f183519a.getClass());
                            aVar7.getClass();
                            zC = lc.h0.a.c(h0Var, dVarB);
                        } else {
                            zC = false;
                        }
                        boolean zB3 = mVar10.B(lVar4) | mVar10.r(eVar3);
                        Object objQ6 = mVar10.q();
                        if (zB3) {
                            objQ6 = new n(17, lVar4, eVar3);
                            mVar10.K(objQ6);
                        } else {
                            aVar2.getClass();
                            if (objQ6 == p3.m.a.f135155b) {
                                objQ6 = new n(17, lVar4, eVar3);
                                mVar10.K(objQ6);
                            }
                        }
                        e23.a aVar8 = (e23.a) objQ6;
                        final int i35 = 0;
                        z3.e eVarC = z3.f.c(-877588409, new e23.p() { // from class: w72.c
                            @Override // e23.p
                            public final Object invoke(Object obj8, Object obj9) {
                                long jD;
                                long jD2;
                                int i36 = i35;
                                boolean z15 = zC;
                                e eVar4 = eVar3;
                                switch (i36) {
                                    case 0:
                                        m mVar11 = (m) obj8;
                                        int iIntValue11 = ((Integer) obj9).intValue();
                                        if (mVar11.n(iIntValue11 & 1, (iIntValue11 & 3) != 2)) {
                                            x1 x1Var12 = n.f135158a;
                                            u4.d dVar3 = eVar4.f183520b;
                                            String str = eVar4.f183522d;
                                            if (z15) {
                                                mVar11.C(-1548862771);
                                                d92.b.f58623a.getClass();
                                                jD = d92.b.a(mVar11).f().a();
                                            } else {
                                                mVar11.C(-1548861872);
                                                d92.b.f58623a.getClass();
                                                jD = d92.b.a(mVar11).f().d();
                                            }
                                            mVar11.f();
                                            i7.b(dVar3, str, null, jD, mVar11, 0, 4);
                                        } else {
                                            mVar11.e();
                                        }
                                        break;
                                    default:
                                        m mVar12 = (m) obj8;
                                        int iIntValue12 = ((Integer) obj9).intValue();
                                        if (mVar12.n(iIntValue12 & 1, (iIntValue12 & 3) != 2)) {
                                            x1 x1Var13 = n.f135158a;
                                            String str2 = eVar4.f183522d;
                                            d92.b.f58623a.getClass();
                                            d92.b.f58624b.getClass();
                                            s5.x0 x0Var3 = j92.f.f97932i;
                                            if (z15) {
                                                mVar12.C(1814399050);
                                                jD2 = d92.b.a(mVar12).k().a();
                                            } else {
                                                mVar12.C(1814399949);
                                                jD2 = d92.b.a(mVar12).k().d();
                                            }
                                            mVar12.f();
                                            mh.c(str2, null, jD2, null, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, x0Var3, mVar12, 0, 0, 131066);
                                        } else {
                                            mVar12.e();
                                        }
                                        break;
                                }
                                return Unit.INSTANCE;
                            }
                        }, mVar10);
                        final int i36 = 1;
                        w9.b(t2Var3, aVar8, eVarC, null, false, z3.f.c(-945596956, new e23.p() { // from class: w72.c
                            @Override // e23.p
                            public final Object invoke(Object obj8, Object obj9) {
                                long jD;
                                long jD2;
                                int i37 = i36;
                                boolean z15 = zC;
                                e eVar4 = eVar3;
                                switch (i37) {
                                    case 0:
                                        m mVar11 = (m) obj8;
                                        int iIntValue11 = ((Integer) obj9).intValue();
                                        if (mVar11.n(iIntValue11 & 1, (iIntValue11 & 3) != 2)) {
                                            x1 x1Var12 = n.f135158a;
                                            u4.d dVar3 = eVar4.f183520b;
                                            String str = eVar4.f183522d;
                                            if (z15) {
                                                mVar11.C(-1548862771);
                                                d92.b.f58623a.getClass();
                                                jD = d92.b.a(mVar11).f().a();
                                            } else {
                                                mVar11.C(-1548861872);
                                                d92.b.f58623a.getClass();
                                                jD = d92.b.a(mVar11).f().d();
                                            }
                                            mVar11.f();
                                            i7.b(dVar3, str, null, jD, mVar11, 0, 4);
                                        } else {
                                            mVar11.e();
                                        }
                                        break;
                                    default:
                                        m mVar12 = (m) obj8;
                                        int iIntValue12 = ((Integer) obj9).intValue();
                                        if (mVar12.n(iIntValue12 & 1, (iIntValue12 & 3) != 2)) {
                                            x1 x1Var13 = n.f135158a;
                                            String str2 = eVar4.f183522d;
                                            d92.b.f58623a.getClass();
                                            d92.b.f58624b.getClass();
                                            s5.x0 x0Var3 = j92.f.f97932i;
                                            if (z15) {
                                                mVar12.C(1814399050);
                                                jD2 = d92.b.a(mVar12).k().a();
                                            } else {
                                                mVar12.C(1814399949);
                                                jD2 = d92.b.a(mVar12).k().d();
                                            }
                                            mVar12.f();
                                            mh.c(str2, null, jD2, null, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, x0Var3, mVar12, 0, 0, 131066);
                                        } else {
                                            mVar12.e();
                                        }
                                        break;
                                }
                                return Unit.INSTANCE;
                            }
                        }, mVar10), false, null, mVar10, (iIntValue10 & 14) | 1575984);
                    }
                    x1 x1Var12 = p3.n.f135158a;
                } else {
                    mVar10.e();
                }
                return Unit.INSTANCE;
            case 11:
                z3.e eVar4 = (z3.e) obj5;
                z3.e eVar5 = (z3.e) obj4;
                p3.m mVar11 = (p3.m) obj2;
                int iIntValue11 = ((Integer) obj3).intValue();
                ((c2.a0) obj).getClass();
                if (mVar11.n(iIntValue11 & 1, (iIntValue11 & 17) != 16)) {
                    x1 x1Var13 = p3.n.f135158a;
                    h4.r rVarS = c2.l.s(u1.n.e(h4.r.S, vb.h.e(d92.b.f58623a, mVar11), m1.f128891a));
                    d92.b.f58625c.getClass();
                    h4.r rVarB = a2.b(c2.l.C(rVarS, 0.0f, 0.0f, 0.0f, j92.b.f97899b.f97920e, 7), a2.a(mVar11), true);
                    c2.j.f22691a.getClass();
                    c2.j.k kVar = c2.j.f22694d;
                    h4.d.f81522a.getClass();
                    c2.z zVarA = c2.y.a(kVar, h4.d.a.f81536n, mVar11, 0);
                    int iHashCode = Long.hashCode(mVar11.getU());
                    i2 i2VarX = mVar11.x();
                    h4.r rVarC = h4.k.c(rVarB, mVar11);
                    h5.g.V.getClass();
                    h5.e0.a aVar9 = h5.g.a.f81805b;
                    if (mVar11.F() == null) {
                        p3.p0.l();
                        throw null;
                    }
                    mVar11.z();
                    if (mVar11.getT()) {
                        mVar11.M(aVar9);
                    } else {
                        mVar11.c();
                    }
                    b4.c(h5.g.a.f81810g, zVarA, mVar11);
                    b4.c(h5.g.a.f81809f, i2VarX, mVar11);
                    h5.g.a.b bVar = h5.g.a.f81813j;
                    if (mVar11.getT() || !p005kotlin.jvm.internal.s.g(mVar11.q(), Integer.valueOf(iHashCode))) {
                        v.h.z(iHashCode, mVar11, iHashCode, bVar);
                    }
                    b4.c(h5.g.a.f81807d, rVarC, mVar11);
                    c2.b0 b0Var = c2.b0.f22601a;
                    eVar4.invoke(b0Var, mVar11, 6);
                    eVar5.invoke(b0Var, mVar11, 6);
                    mVar11.y();
                } else {
                    mVar11.e();
                }
                return Unit.INSTANCE;
            case 12:
                h4.r rVar3 = (h4.r) obj5;
                e23.a aVar10 = (e23.a) obj4;
                h2 h2Var = (h2) obj;
                p3.m mVar12 = (p3.m) obj2;
                int iIntValue12 = ((Integer) obj3).intValue();
                h2Var.getClass();
                if ((iIntValue12 & 6) == 0) {
                    iIntValue12 |= mVar12.B(h2Var) ? 4 : 2;
                }
                if (mVar12.n(iIntValue12 & 1, (iIntValue12 & 19) != 18)) {
                    x1 x1Var14 = p3.n.f135158a;
                    h4.r.a aVar11 = h4.r.S;
                    h4.r rVarX = c2.l.x(aVar11, h2Var);
                    h4.d.f81522a.getClass();
                    z0 z0VarD = c2.q.d(h4.d.a.f81524b, false);
                    int iHashCode2 = Long.hashCode(mVar12.getU());
                    i2 i2VarX2 = mVar12.x();
                    h4.r rVarC2 = h4.k.c(rVarX, mVar12);
                    h5.g.V.getClass();
                    h5.e0.a aVar12 = h5.g.a.f81805b;
                    if (mVar12.F() == null) {
                        p3.p0.l();
                        throw null;
                    }
                    mVar12.z();
                    if (mVar12.getT()) {
                        mVar12.M(aVar12);
                    } else {
                        mVar12.c();
                    }
                    h5.g.a.e eVar6 = h5.g.a.f81810g;
                    b4.c(eVar6, z0VarD, mVar12);
                    h5.g.a.C1623g c1623g = h5.g.a.f81809f;
                    b4.c(c1623g, i2VarX2, mVar12);
                    h5.g.a.b bVar2 = h5.g.a.f81813j;
                    if (mVar12.getT() || !p005kotlin.jvm.internal.s.g(mVar12.q(), Integer.valueOf(iHashCode2))) {
                        v.h.z(iHashCode2, mVar12, iHashCode2, bVar2);
                    }
                    h5.g.a.f fVar5 = h5.g.a.f81807d;
                    b4.c(fVar5, rVarC2, mVar12);
                    c2.u uVar = c2.u.f22885a;
                    h4.r rVarF = x2.f(x2.x(rVar3, null, 3), 1.0f);
                    c2.j.f22691a.getClass();
                    c2.j.k kVar2 = c2.j.f22694d;
                    c2.z zVarA2 = c2.y.a(kVar2, h4.d.a.f81536n, mVar12, 0);
                    int iHashCode3 = Long.hashCode(mVar12.getU());
                    i2 i2VarX3 = mVar12.x();
                    h4.r rVarC3 = h4.k.c(rVarF, mVar12);
                    if (mVar12.F() == null) {
                        p3.p0.l();
                        throw null;
                    }
                    mVar12.z();
                    if (mVar12.getT()) {
                        mVar12.M(aVar12);
                    } else {
                        mVar12.c();
                    }
                    b4.c(eVar6, zVarA2, mVar12);
                    b4.c(c1623g, i2VarX3, mVar12);
                    if (mVar12.getT() || !p005kotlin.jvm.internal.s.g(mVar12.q(), Integer.valueOf(iHashCode3))) {
                        v.h.z(iHashCode3, mVar12, iHashCode3, bVar2);
                    }
                    b4.c(fVar5, rVarC3, mVar12);
                    c2.l.f(c2.b0.f22601a.a(aVar11, 1.0f, true), mVar12);
                    h4.r rVarE = u1.n.e(x2.f(aVar11, 1.0f), tn.k.a(d92.b.f58623a, mVar12), m1.f128891a);
                    i3.d0.f87812a.getClass();
                    h4.r rVarG = c2.l.G(rVarE, i3.d0.a(mVar12));
                    d92.b.f58625c.getClass();
                    j92.e eVar7 = j92.b.f97899b;
                    float f15 = eVar7.f97920e;
                    h4.r rVarC4 = c2.l.C(c2.l.A(rVarG, f15, 0.0f, 2), 0.0f, eVar7.f97920e, 0.0f, eVar7.f97921f, 5);
                    c2.z zVarA3 = c2.y.a(kVar2, h4.d.a.f81537o, mVar12, 48);
                    int iHashCode4 = Long.hashCode(mVar12.getU());
                    i2 i2VarX4 = mVar12.x();
                    h4.r rVarC5 = h4.k.c(rVarC4, mVar12);
                    if (mVar12.F() == null) {
                        p3.p0.l();
                        throw null;
                    }
                    mVar12.z();
                    if (mVar12.getT()) {
                        mVar12.M(aVar12);
                    } else {
                        mVar12.c();
                    }
                    b4.c(eVar6, zVarA3, mVar12);
                    b4.c(c1623g, i2VarX4, mVar12);
                    if (mVar12.getT() || !p005kotlin.jvm.internal.s.g(mVar12.q(), Integer.valueOf(iHashCode4))) {
                        v.h.z(iHashCode4, mVar12, iHashCode4, bVar2);
                    }
                    b4.c(fVar5, rVarC5, mVar12);
                    String strQ9 = gl1.y.Q(mVar12, R.string.lbl_activity_stopped);
                    d92.b.f58624b.getClass();
                    s5.x0 x0VarB = d92.c.b(j92.f.f97930g, mVar12);
                    d6.h.f57752b.getClass();
                    int i37 = d6.h.f57755e;
                    mh.c(strQ9, null, 0L, null, 0L, null, 0L, d6.h.a(i37), 0L, 0, false, 0, 0, null, x0VarB, mVar12, 0, 0, 130046);
                    mh.c(gl1.y.Q(mVar12, R.string.lbl_save_resume_later), c2.l.C(aVar11, 0.0f, eVar7.f97918c, 0.0f, 0.0f, 13), 0L, null, 0L, null, 0L, d6.h.a(i37), 0L, 0, false, 0, 0, null, d92.c.b(j92.f.f97932i, mVar12), mVar12, 0, 0, 130044);
                    c2.l.f(x2.k(aVar11, f15), mVar12);
                    l72.f0 f0Var = l72.f0.f110999a;
                    u4.d dVarA = j1.a(t62.b.f162798a);
                    String strQ10 = gl1.y.Q(mVar12, R.string.lbl_resume);
                    g6.f.f75994b.getClass();
                    float f16 = g6.f.f75996d;
                    mg2.w.f118432a.getClass();
                    h4.r rVarA = l4.k.a(c2.l.A(x2.f(x2.v(aVar11, f16, mg2.w.f118437f), 1.0f), f15, 0.0f, 2), aVar10 != null ? 1.0f : 0.0f);
                    boolean zB4 = mVar12.B(aVar10);
                    Object objQ7 = mVar12.q();
                    if (zB4) {
                        objQ7 = new rx1.m(aVar10, 20);
                        mVar12.K(objQ7);
                    } else {
                        aVar2.getClass();
                        if (objQ7 == p3.m.a.f135155b) {
                            objQ7 = new rx1.m(aVar10, 20);
                            mVar12.K(objQ7);
                        }
                    }
                    h4.r rVarC6 = p5.v.c((e23.l) objQ7, rVarA, false);
                    if (aVar10 == null) {
                        mVar12.C(-855415311);
                        Object objQ8 = mVar12.q();
                        aVar2.getClass();
                        if (objQ8 == p3.m.a.f135155b) {
                            objQ8 = new w72.f(24);
                            mVar12.K(objQ8);
                        }
                        mVar12.f();
                        aVar = (e23.a) objQ8;
                    } else {
                        mVar12.C(-720331447);
                        mVar12.f();
                        aVar = aVar10;
                    }
                    f0Var.d(0, 0, aVar, rVarC6, strQ10, mVar12, dVarA, aVar10 != null);
                    mVar12.y();
                    mVar12.y();
                    mVar12.y();
                } else {
                    mVar12.e();
                }
                return Unit.INSTANCE;
            case 13:
                un0.a aVar13 = (un0.a) obj5;
                e23.a<Unit> aVar14 = (e23.a) obj4;
                c2.t tVar = (c2.t) obj;
                p3.m mVar13 = (p3.m) obj2;
                int iIntValue13 = ((Integer) obj3).intValue();
                tVar.getClass();
                if ((iIntValue13 & 6) == 0) {
                    iIntValue13 |= mVar13.B(tVar) ? 4 : 2;
                }
                if (mVar13.n(iIntValue13 & 1, (iIntValue13 & 19) != 18)) {
                    x1 x1Var15 = p3.n.f135158a;
                    l72.f0.a aVar15 = l72.f0.a.f111000a;
                    String string3 = aVar13.f172043a.getString(R.string.gdpr_livetrack_strava_beacon_enable);
                    h4.r.a aVar16 = h4.r.S;
                    h4.d.f81522a.getClass();
                    aVar15.m(string3, tVar.c(aVar16, h4.d.a.f81529g), false, aVar14, mVar13, 0, 4);
                } else {
                    mVar13.e();
                }
                return Unit.INSTANCE;
            case 14:
                ((Integer) obj3).getClass();
                ((r1.e0) obj).getClass();
                x1 x1Var16 = p3.n.f135158a;
                wn0.g.b((nk0.l) obj5, (e23.a) obj4, (p3.m) obj2, 0);
                return Unit.INSTANCE;
            case 15:
                return a(obj, obj2, obj3);
            case 16:
                ww.f fVar6 = (ww.f) obj5;
                Map.Entry entry = (Map.Entry) obj4;
                t2 t2Var4 = (t2) obj;
                p3.m mVar14 = (p3.m) obj2;
                int iIntValue14 = ((Integer) obj3).intValue();
                ww.f.a aVar17 = ww.f.f187506i;
                t2Var4.getClass();
                if ((iIntValue14 & 6) == 0) {
                    iIntValue14 |= mVar14.B(t2Var4) ? 4 : 2;
                }
                if (mVar14.n(iIntValue14 & 1, (iIntValue14 & 19) != 18)) {
                    x1 x1Var17 = p3.n.f135158a;
                    int i38 = iIntValue14 & 14;
                    fVar6.l(t2Var4, ((kw.f) entry.getValue()).f106837b, ((kw.f) entry.getValue()).f106844i, null, 0.35f, null, mVar14, i38 | 24576);
                    int i39 = i38 | 3072;
                    fVar6.m(t2Var4, ((kw.f) entry.getValue()).f106845j, null, 0.25f, null, false, mVar14, i39, 26);
                    fVar6.m(t2Var4, ((kw.f) entry.getValue()).f106846k, null, 0.15f, null, false, mVar14, i38 | 199680, 10);
                    fVar6.m(t2Var4, ((kw.f) entry.getValue()).f106847l, null, 0.25f, null, false, mVar14, i39, 26);
                } else {
                    mVar14.e();
                }
                return Unit.INSTANCE;
            case 17:
                return b(obj, obj2, obj3);
            case 18:
                return c(obj, obj2, obj3);
            case 19:
                return d(obj, obj2, obj3);
            case 20:
                return e(obj, obj2, obj3);
            case 21:
                return f(obj, obj2, obj3);
            case 22:
                return g(obj, obj2, obj3);
            case 23:
                return h(obj, obj2, obj3);
            case 24:
                return i(obj, obj2, obj3);
            case 25:
                return j(obj, obj2, obj3);
            case 26:
                return k(obj, obj2, obj3);
            case 27:
                return l(obj, obj2, obj3);
            case 28:
                return n(obj, obj2, obj3);
            default:
                yt.n nVar = (yt.n) obj5;
                e23.p pVar = (e23.p) obj4;
                c2.w wVar = (c2.w) obj;
                p3.m mVar15 = (p3.m) obj2;
                int iIntValue15 = ((Integer) obj3).intValue();
                wVar.getClass();
                if ((iIntValue15 & 6) == 0) {
                    iIntValue15 |= mVar15.B(wVar) ? 4 : 2;
                }
                if (mVar15.n(iIntValue15 & 1, (iIntValue15 & 19) != 18)) {
                    x1 x1Var18 = p3.n.f135158a;
                    T f182175a = o53.f0.F(nVar.f199354o, 0, mVar15, 48).getF182175a();
                    f182175a.getClass();
                    float fX = w02.b0.x(mVar15, ((Number) f182175a).intValue());
                    float fG = wVar.g();
                    float fJ = wVar.j();
                    d92.b.f58623a.getClass();
                    d92.b.f58625c.getClass();
                    j92.e eVar8 = j92.b.f97899b;
                    float f17 = eVar8.f97921f;
                    float f18 = eVar8.f97916a;
                    float f19 = eVar8.f97918c;
                    float f22 = fJ / 1.1755486f;
                    float f24 = 54;
                    float f25 = fG - fX;
                    float f26 = 2.0f * f24;
                    float f27 = (((f25 - f22) - f26) - f18) - f17;
                    if (g6.f.b(f27, f19) > 0) {
                        f14 = f17;
                    } else {
                        g6.f.b(f27 + f17, f19);
                        f14 = 0;
                    }
                    float f28 = ((f25 - f26) - f18) - f14;
                    g6.f fVarA = g6.f.b(f28, f22) >= 0 ? null : g6.f.a(f28);
                    h4.r rVarC7 = c2.l.C(x2.d(h4.r.S, 1.0f), 0.0f, fX, 0.0f, 0.0f, 13);
                    mVar15.L(-2033384074);
                    s1.l.d(0, 0, null, 7);
                    mVar15.L(-270254335);
                    mVar15.R();
                    g6.c cVar3 = (g6.c) mVar15.A(t1.f91490h);
                    mVar15.L(-492369756);
                    Object objQ9 = mVar15.q();
                    aVar2.getClass();
                    p3.m.a.C2565a c2565a = p3.m.a.f135155b;
                    if (objQ9 == c2565a) {
                        objQ9 = new p007l6.y(cVar3);
                        mVar15.K(objQ9);
                    }
                    mVar15.R();
                    p007l6.y yVar = (p007l6.y) objQ9;
                    mVar15.L(-492369756);
                    Object objQ10 = mVar15.q();
                    if (objQ10 == c2565a) {
                        objQ10 = new p007l6.m();
                        mVar15.K(objQ10);
                    }
                    mVar15.R();
                    p007l6.m mVar16 = (p007l6.m) objQ10;
                    mVar15.L(-492369756);
                    Object objQ11 = mVar15.q();
                    if (objQ11 == c2565a) {
                        objQ11 = p3.p0.n(Boolean.FALSE);
                        mVar15.K(objQ11);
                    }
                    mVar15.R();
                    p1 p1Var = (p1) objQ11;
                    mVar15.L(-492369756);
                    Object objQ12 = mVar15.q();
                    if (objQ12 == c2565a) {
                        objQ12 = new p007l6.p(mVar16);
                        mVar15.K(objQ12);
                    }
                    mVar15.R();
                    p007l6.p pVar2 = (p007l6.p) objQ12;
                    mVar15.L(-492369756);
                    Object objQ13 = mVar15.q();
                    if (objQ13 == c2565a) {
                        Unit unit = Unit.INSTANCE;
                        p3.t1 t1Var = p3.t1.f135313a;
                        t1Var.getClass();
                        c2 c2Var = new c2(unit, t1Var);
                        mVar15.K(c2Var);
                        objQ13 = c2Var;
                    }
                    mVar15.R();
                    p1 p1Var2 = (p1) objQ13;
                    f5.k0.a(p5.v.c(new yt.d0(yVar), rVarC7, false), z3.f.b(-1908965773, new yt.e0(p1Var2, mVar16, 0, new yt.c0(p1Var, pVar2), nVar, f24, f17, f18, f14, fVarA, fJ, pVar), mVar15), new yt.b0(p1Var2, yVar, pVar2, TsExtractor.TS_STREAM_TYPE_AIT, p1Var), mVar15, 48, 0);
                    mVar15.R();
                } else {
                    mVar15.e();
                }
                return Unit.INSTANCE;
        }
    }
}
