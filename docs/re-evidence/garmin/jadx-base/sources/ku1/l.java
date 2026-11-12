package ku1;

import am.j1;
import am.x0;
import android.content.Context;
import android.os.Bundle;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import b21.v4;
import c2.a0;
import c2.c1;
import c2.h2;
import c2.q1;
import c2.q2;
import c2.s2;
import c2.t0;
import c2.t2;
import c2.u;
import c2.u2;
import c2.x2;
import c2.z;
import c22.c3;
import c22.r0;
import com.garmin.android.apps.connectmobile.R;
import com.garmin.android.apps.connectmobile.charts.mpchart3.wrapper.CustomLineChart;
import com.garmin.android.apps.connectmobile.connections.groups.services.model.GroupDTO;
import com.garmin.android.apps.connectmobile.courses.model.ClimbDTO;
import com.garmin.android.apps.connectmobile.map.GCMMapView;
import com.garmin.android.apps.ui.catalog.library.help.HelpActivity;
import com.google.android.exoplayer2.metadata.icy.IcyHeaders;
import com.google.firebase.messaging.Constants;
import e23.q;
import ew1.v1;
import f5.z0;
import g02.b2;
import gl1.y;
import gs1.t;
import h2.o0;
import h4.r;
import h5.e0;
import i3.b6;
import i3.e5;
import i3.i7;
import i3.mh;
import i3.v5;
import i3.ve;
import i3.y5;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import l30.i0;
import l72.n2;
import l72.p2;
import l72.v2;
import lc.m0;
import lc.u0;
import m4.b0;
import o13.p;
import o4.d0;
import o4.m1;
import o4.s0;
import org.apache.commons.lang3.StringUtils;
import org.joda.time.DateTime;
import org.joda.time.Interval;
import org.joda.time.LocalDate;
import p005kotlin.Unit;
import p005kotlin.jvm.internal.s;
import p13.h0;
import p13.x;
import p3.b4;
import p3.i2;
import p3.p0;
import p3.p1;
import p3.x1;
import p3.x3;
import rx1.v;
import u1.a2;
import u1.w;
import u1.y0;
import v62.e1;
import v62.z2;
import w5.f0;
import x5.l0;
import yg2.o;

/* JADX INFO: loaded from: classes10.dex */
public final /* synthetic */ class l implements q {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f106589a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f106590b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f106591c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Object f106592d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ Object f106593e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ Object f106594f;

    public /* synthetic */ l(String str, e23.a aVar, e23.l lVar, p1 p1Var, b0 b0Var) {
        this.f106589a = 16;
        this.f106593e = str;
        this.f106590b = aVar;
        this.f106591c = lVar;
        this.f106592d = p1Var;
        this.f106594f = b0Var;
    }

    /* JADX WARN: Code duplicated, block: B:19:0x007b  */
    /* JADX WARN: Code duplicated, block: B:24:0x009c  */
    /* JADX WARN: Code duplicated, block: B:29:0x00c2  */
    private final Object a(Object obj, Object obj2, Object obj3) {
        qo0.a aVar = (qo0.a) this.f106590b;
        CustomLineChart customLineChart = (CustomLineChart) this.f106591c;
        tz.a aVar2 = (tz.a) this.f106592d;
        t tVar = (t) this.f106594f;
        String str = (String) this.f106593e;
        r rVar = (r) obj;
        p3.m mVar = (p3.m) obj2;
        int iIntValue = ((Integer) obj3).intValue();
        rVar.getClass();
        if ((iIntValue & 6) == 0) {
            iIntValue |= mVar.B(rVar) ? 4 : 2;
        }
        if (mVar.n(iIntValue & 1, (iIntValue & 19) != 18)) {
            x1 x1Var = p3.n.f135158a;
            r rVarF = x2.f(rVar, 1.0f);
            d92.b.f58623a.getClass();
            d92.b.f58625c.getClass();
            r rVarH = x2.h(c2.l.A(rVarF, j92.b.f97899b.f97920e, 0.0f, 2), oo0.g.f133125a);
            boolean zR = mVar.r(aVar) | mVar.r(customLineChart);
            Object objQ = mVar.q();
            p3.m.a aVar3 = p3.m.f135153a;
            if (zR) {
                objQ = new oe.j(9, aVar, customLineChart);
                mVar.K(objQ);
            } else {
                aVar3.getClass();
                if (objQ == p3.m.a.f135155b) {
                    objQ = new oe.j(9, aVar, customLineChart);
                    mVar.K(objQ);
                }
            }
            r rVarB = wz1.i.b(rVarH, (e23.a) objQ, mVar);
            boolean zR2 = mVar.r(customLineChart);
            Object objQ2 = mVar.q();
            if (zR2) {
                objQ2 = new b40.a(customLineChart, 7);
                mVar.K(objQ2);
            } else {
                aVar3.getClass();
                if (objQ2 == p3.m.a.f135155b) {
                    objQ2 = new b40.a(customLineChart, 7);
                    mVar.K(objQ2);
                }
            }
            e23.l lVar = (e23.l) objQ2;
            boolean zR3 = mVar.r(aVar2) | mVar.r(tVar) | mVar.B(str);
            Object objQ3 = mVar.q();
            if (zR3) {
                objQ3 = new ls0.h(aVar2, 23, tVar, str);
                mVar.K(objQ3);
            } else {
                aVar3.getClass();
                if (objQ3 == p3.m.a.f135155b) {
                    objQ3 = new ls0.h(aVar2, 23, tVar, str);
                    mVar.K(objQ3);
                }
            }
            p002j6.c.b(lVar, rVarB, (e23.l) objQ3, mVar, 0, 0);
        } else {
            mVar.e();
        }
        return Unit.INSTANCE;
    }

    /* JADX WARN: Code duplicated, block: B:21:0x00df  */
    /* JADX WARN: Code duplicated, block: B:27:0x0130  */
    private final Object b(Object obj, Object obj2, Object obj3) throws Throwable {
        e23.l lVar;
        String str = (String) this.f106593e;
        List<jv1.c> list = (List) this.f106590b;
        jv1.c cVar = (jv1.c) this.f106591c;
        String str2 = (String) this.f106594f;
        e23.l lVar2 = (e23.l) this.f106592d;
        p3.m mVar = (p3.m) obj2;
        int iIntValue = ((Integer) obj3).intValue();
        ov1.m.a aVar = ov1.m.f134192b;
        ((a0) obj).getClass();
        if (mVar.n(iIntValue & 1, (iIntValue & 17) != 16)) {
            x1 x1Var = p3.n.f135158a;
            r.a aVar2 = r.S;
            r rVarE = u1.n.e(x2.f(aVar2, 1.0f), vb.h.e(d92.b.f58623a, mVar), m1.f128891a);
            d92.b.f58625c.getClass();
            j92.e eVar = j92.b.f97899b;
            c2.l.f(x2.h(rVarE, eVar.f97920e), mVar);
            b2.a(c2.l.C(aVar2, 0.0f, 0.0f, 0.0f, eVar.f97921f, 7), false, 0, 0, str, null, null, null, null, mVar, 0, 494);
            for (jv1.c cVar2 : list) {
                boolean z14 = cVar2 == cVar;
                jv1.c cVar3 = jv1.c.AUTO;
                p3.m.a aVar3 = p3.m.f135153a;
                if (cVar2 == cVar3) {
                    mVar.C(853008768);
                    r rVarF = x2.f(r.S, 1.0f);
                    String strQ = y.Q(mVar, cVar2.f101019a);
                    boolean zB = mVar.B(lVar2) | mVar.k(cVar2.ordinal());
                    Object objQ = mVar.q();
                    if (zB) {
                        objQ = new o50.a(11, lVar2, cVar2);
                        mVar.K(objQ);
                    } else {
                        aVar3.getClass();
                        if (objQ == p3.m.a.f135155b) {
                            objQ = new o50.a(11, lVar2, cVar2);
                            mVar.K(objQ);
                        }
                    }
                    lVar = lVar2;
                    cw1.r.b(rVarF, strQ, str2, null, z14, false, (e23.l) objQ, mVar, 6, 40);
                    mVar.f();
                } else {
                    lVar = lVar2;
                    mVar.C(853403615);
                    r rVarF2 = x2.f(r.S, 1.0f);
                    String strQ2 = y.Q(mVar, cVar2.f101019a);
                    boolean zB2 = mVar.B(lVar) | mVar.k(cVar2.ordinal());
                    Object objQ2 = mVar.q();
                    if (zB2) {
                        objQ2 = new oe.j(19, lVar, cVar2);
                        mVar.K(objQ2);
                    } else {
                        aVar3.getClass();
                        if (objQ2 == p3.m.a.f135155b) {
                            objQ2 = new oe.j(19, lVar, cVar2);
                            mVar.K(objQ2);
                        }
                    }
                    cw1.r.a(rVarF2, strQ2, null, z14, false, (e23.a) objQ2, mVar, 6, 20);
                    mVar.f();
                }
                lVar2 = lVar;
            }
            x1 x1Var2 = p3.n.f135158a;
        } else {
            mVar.e();
        }
        return Unit.INSTANCE;
    }

    /* JADX WARN: Code duplicated, block: B:6:0x0051  */
    private final Object c(Object obj, Object obj2, Object obj3) {
        o53.b0 b0Var = (o53.b0) this.f106590b;
        q qVar = (q) this.f106591c;
        Map map = (Map) this.f106592d;
        Set set = (Set) this.f106593e;
        Set set2 = (Set) this.f106594f;
        r rVar = (r) obj;
        p3.m mVar = (p3.m) obj2;
        v.h.y(-1084031842, rVar, (Integer) obj3, mVar);
        x1 x1Var = p3.n.f135158a;
        boolean zR = mVar.r(b0Var) | mVar.B(qVar) | mVar.r(map) | mVar.r(set) | mVar.r(set2);
        Object objQ = mVar.q();
        if (zR) {
            v4 v4Var = new v4(b0Var, qVar, map, set, set2, 28);
            mVar.K(v4Var);
            objQ = v4Var;
        } else {
            p3.m.f135153a.getClass();
            if (objQ == p3.m.a.f135155b) {
                v4 v4Var2 = new v4(b0Var, qVar, map, set, set2, 28);
                mVar.K(v4Var2);
                objQ = v4Var2;
            }
        }
        r rVarD = w.d(rVar, false, null, null, (e23.a) objQ, 15);
        mVar.f();
        return rVarD;
    }

    private final Object d(Object obj, Object obj2, Object obj3) {
        float f14;
        e0.a aVar;
        h5.g.a.e eVar;
        r.a aVar2;
        p3.m mVar;
        Integer num;
        c2.j.k kVar;
        h5.g.a.b bVar;
        h4.g.a aVar3;
        h5.g.a.C1623g c1623g;
        z3.e eVar2;
        int i14;
        e0.a aVar4;
        h5.g.a.b bVar2;
        String str = (String) this.f106593e;
        String str2 = (String) this.f106594f;
        z3.e eVar3 = (z3.e) this.f106590b;
        z3.e eVar4 = (z3.e) this.f106591c;
        z3.e eVar5 = (z3.e) this.f106592d;
        p3.m mVar2 = (p3.m) obj2;
        int iIntValue = ((Integer) obj3).intValue();
        ((a0) obj).getClass();
        if (mVar2.n(iIntValue & 1, (iIntValue & 17) != 16)) {
            x1 x1Var = p3.n.f135158a;
            r.a aVar5 = r.S;
            r rVarB = a2.b(x2.d(aVar5, 1.0f), a2.a(mVar2), true);
            c2.j.f22691a.getClass();
            c2.j.k kVar2 = c2.j.f22694d;
            h4.d.f81522a.getClass();
            h4.g.a aVar6 = h4.d.a.f81536n;
            z zVarA = c2.y.a(kVar2, aVar6, mVar2, 0);
            int iHashCode = Long.hashCode(mVar2.getU());
            i2 i2VarX = mVar2.x();
            r rVarC = h4.k.c(rVarB, mVar2);
            h5.g.V.getClass();
            e0.a aVar7 = h5.g.a.f81805b;
            if (mVar2.F() == null) {
                p0.l();
                throw null;
            }
            mVar2.z();
            if (mVar2.getT()) {
                mVar2.M(aVar7);
            } else {
                mVar2.c();
            }
            h5.g.a.e eVar6 = h5.g.a.f81810g;
            b4.c(eVar6, zVarA, mVar2);
            h5.g.a.C1623g c1623g2 = h5.g.a.f81809f;
            b4.c(c1623g2, i2VarX, mVar2);
            h5.g.a.b bVar3 = h5.g.a.f81813j;
            if (mVar2.getT() || !s.g(mVar2.q(), Integer.valueOf(iHashCode))) {
                v.h.z(iHashCode, mVar2, iHashCode, bVar3);
            }
            h5.g.a.f fVar = h5.g.a.f81807d;
            b4.c(fVar, rVarC, mVar2);
            c2.b0 b0Var = c2.b0.f22601a;
            long jE = vb.h.e(d92.b.f58623a, mVar2);
            m1.a aVar8 = m1.f128891a;
            r rVarE = u1.n.e(aVar5, jE, aVar8);
            float f15 = 8;
            g6.f.a aVar9 = g6.f.f75994b;
            r rVarC2 = c2.l.C(rVarE, 0.0f, f15, 0.0f, 0.0f, 13);
            z zVarA2 = c2.y.a(kVar2, aVar6, mVar2, 0);
            int iHashCode2 = Long.hashCode(mVar2.getU());
            i2 i2VarX2 = mVar2.x();
            r rVarC3 = h4.k.c(rVarC2, mVar2);
            if (mVar2.F() == null) {
                p0.l();
                throw null;
            }
            mVar2.z();
            if (mVar2.getT()) {
                mVar2.M(aVar7);
            } else {
                mVar2.c();
            }
            b4.c(eVar6, zVarA2, mVar2);
            b4.c(c1623g2, i2VarX2, mVar2);
            if (mVar2.getT() || !s.g(mVar2.q(), Integer.valueOf(iHashCode2))) {
                v.h.z(iHashCode2, mVar2, iHashCode2, bVar3);
            }
            b4.c(fVar, rVarC3, mVar2);
            if (str != null) {
                mVar2.C(1545350240);
                r rVarZ = c2.l.z(aVar5, 16, f15);
                d92.b.f58624b.getClass();
                i14 = 16;
                eVar = eVar6;
                num = 0;
                kVar = kVar2;
                bVar = bVar3;
                aVar3 = aVar6;
                c1623g = c1623g2;
                f14 = f15;
                eVar2 = eVar5;
                aVar2 = aVar5;
                aVar = aVar7;
                mh.c(str, rVarZ, 0L, null, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, d92.c.b(d92.c.e(j92.f.f97931h), mVar2), mVar2, 48, 0, 131068);
                mVar = mVar2;
                mVar.f();
            } else {
                f14 = f15;
                aVar = aVar7;
                eVar = eVar6;
                aVar2 = aVar5;
                mVar = mVar2;
                num = 0;
                kVar = kVar2;
                bVar = bVar3;
                aVar3 = aVar6;
                c1623g = c1623g2;
                eVar2 = eVar5;
                i14 = 16;
                mVar.C(1545593931);
                mVar.f();
            }
            if (str2 != null) {
                mVar.C(1545661976);
                r rVarA = c2.l.A(aVar2, i14, 0.0f, 2);
                d92.b.f58624b.getClass();
                mh.c(str2, rVarA, 0L, null, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, d92.c.b(j92.f.f97933j, mVar), mVar, 48, 0, 131068);
                mVar.f();
            } else {
                mVar.C(1545790347);
                mVar.f();
            }
            z0 z0VarD = c2.q.d(h4.d.a.f81524b, false);
            int iHashCode3 = Long.hashCode(mVar.getU());
            i2 i2VarX3 = mVar.x();
            r rVarC4 = h4.k.c(aVar2, mVar);
            if (mVar.F() == null) {
                p0.l();
                throw null;
            }
            mVar.z();
            if (mVar.getT()) {
                aVar4 = aVar;
                mVar.M(aVar4);
            } else {
                aVar4 = aVar;
                mVar.c();
            }
            h5.g.a.e eVar7 = eVar;
            b4.c(eVar7, z0VarD, mVar);
            h5.g.a.C1623g c1623g3 = c1623g;
            b4.c(c1623g3, i2VarX3, mVar);
            if (mVar.getT() || !s.g(mVar.q(), Integer.valueOf(iHashCode3))) {
                bVar2 = bVar;
                v.h.z(iHashCode3, mVar, iHashCode3, bVar2);
            } else {
                bVar2 = bVar;
            }
            b4.c(fVar, rVarC4, mVar);
            u uVar = u.f22885a;
            float f16 = i14;
            float f17 = f14;
            r rVarB2 = c2.l.B(aVar2, f16, f16, f16, f17);
            String strQ = y.Q(mVar, R.string.body_battery_impact);
            d92.b.f58624b.getClass();
            e0.a aVar10 = aVar4;
            p3.m mVar3 = mVar;
            mh.c(strQ, rVarB2, 0L, null, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, d92.c.b(d92.c.e(j92.f.f97931h), mVar), mVar3, 48, 0, 131068);
            Integer num2 = num;
            eVar4.invoke(mVar3, num2);
            mVar3.y();
            c2.l.f(x2.h(aVar2, f17), mVar3);
            eVar3.invoke(mVar3, num2);
            c2.l.f(x2.h(aVar2, f17), mVar3);
            mVar3.y();
            r rVarE2 = u1.n.e(aVar2, d92.b.a(mVar3).c().b(), aVar8);
            z zVarA3 = c2.y.a(kVar, aVar3, mVar3, 0);
            int iHashCode4 = Long.hashCode(mVar3.getU());
            i2 i2VarX4 = mVar3.x();
            r rVarC5 = h4.k.c(rVarE2, mVar3);
            if (mVar3.F() == null) {
                p0.l();
                throw null;
            }
            mVar3.z();
            if (mVar3.getT()) {
                mVar3.M(aVar10);
            } else {
                mVar3.c();
            }
            b4.c(eVar7, zVarA3, mVar3);
            b4.c(c1623g3, i2VarX4, mVar3);
            if (mVar3.getT() || !s.g(mVar3.q(), Integer.valueOf(iHashCode4))) {
                v.h.z(iHashCode4, mVar3, iHashCode4, bVar2);
            }
            b4.c(fVar, rVarC5, mVar3);
            c2.l.f(x2.h(aVar2, f16), mVar3);
            eVar2.invoke(b0Var, mVar3, 6);
            c2.l.f(x2.h(aVar2, f16), mVar3);
            mVar3.y();
            mVar3.y();
        } else {
            mVar2.e();
        }
        return Unit.INSTANCE;
    }

    /* JADX WARN: Code duplicated, block: B:52:0x01c2  */
    /* JADX WARN: Multi-variable type inference failed */
    private final Object e(Object obj, Object obj2, Object obj3) {
        String string;
        bx.b bVar = (bx.b) this.f106590b;
        Interval interval = (Interval) this.f106591c;
        hx.c cVar = (hx.c) this.f106592d;
        Context context = (Context) this.f106593e;
        t tVar = (t) this.f106594f;
        p3.m mVar = (p3.m) obj2;
        int iIntValue = ((Integer) obj3).intValue();
        ((a0) obj).getClass();
        if (mVar.n(iIntValue & 1, (iIntValue & 17) != 16)) {
            x1 x1Var = p3.n.f135158a;
            Context context2 = (Context) mVar.A(AndroidCompositionLocals_androidKt.f6042b);
            rx.a aVar = new rx.a(context2);
            p pVar = new p(interval.getStart(), interval.getEnd());
            hx.b event = bVar.getEvent();
            qx.a aVar2 = null;
            hx.c cVarB = event != null ? event.b() : null;
            int i14 = cVarB == null ? -1 : qx.f.a.f148396a[cVarB.ordinal()];
            B b14 = pVar.f128595b;
            A a14 = pVar.f128594a;
            if (i14 != 1) {
                Context context3 = aVar.f154899a;
                if (i14 == 2) {
                    mVar.C(551215403);
                    mVar.f();
                    String string2 = context3.getString(R.string.sleep_lbl_sleep);
                    string2.getClass();
                    aVar2 = new qx.a(string2, aVar.e((DateTime) a14, (DateTime) b14), qx.f.b(context2));
                } else if (i14 == 3) {
                    mVar.C(551530797);
                    mVar.f();
                    String string3 = context3.getString(R.string.sleep_lbl_nap);
                    string3.getClass();
                    aVar2 = new qx.a(string3, aVar.e((DateTime) a14, (DateTime) b14), qx.f.b(context2));
                } else if (i14 == 4 || i14 == 5) {
                    mVar.C(550379984);
                    mVar.f();
                    if (cVarB == hx.c.STRESS) {
                        string = context3.getString(R.string.alldaystress_high_stress);
                        string.getClass();
                    } else {
                        string = context3.getString(R.string.allday_stress_low_stress);
                        string.getClass();
                    }
                    aVar2 = new qx.a(string, aVar.e((DateTime) a14, (DateTime) b14), r0.b(context2, R.drawable.stress, R.color.gcm_stress_color, R.color.gcm_icon_on_color, r0.a.LARGE, 48));
                } else {
                    mVar.C(551815934);
                    mVar.f();
                }
            } else {
                mVar.C(549827130);
                x0 x0VarF = bVar.f();
                String activityName = bVar.getActivityName();
                if (activityName == null) {
                    mVar.C(1126119595);
                    activityName = gl1.d.T(x0VarF.f4360c, mVar, 0);
                } else {
                    mVar.C(1126118603);
                }
                mVar.f();
                qx.a aVar3 = new qx.a(activityName, aVar.e((DateTime) a14, (DateTime) b14), zx0.m.d(context2, x0VarF, null, 0));
                mVar.f();
                aVar2 = aVar3;
            }
            if (aVar2 != null) {
                mVar.C(164977341);
                p2 p2Var = p2.f111205a;
                String str = aVar2.f148387a;
                String str2 = aVar2.f148388b;
                if (str2 == null) {
                    str2 = "";
                }
                String str3 = str2;
                boolean zR = h0.R(x.k(hx.c.ACTIVITY, hx.c.SLEEP, hx.c.NAP), cVar);
                z3.e eVarC = z3.f.c(-803990729, new ov1.q(aVar2, 27), mVar);
                boolean zK = mVar.k(cVar != null ? cVar.ordinal() : -1) | mVar.r(bVar) | mVar.r(context) | mVar.r(tVar);
                Object objQ = mVar.q();
                if (zK) {
                    ok0.d dVar = new ok0.d(10, context, cVar, bVar, tVar);
                    mVar.K(dVar);
                    objQ = dVar;
                } else {
                    p3.m.f135153a.getClass();
                    if (objQ == p3.m.a.f135155b) {
                        ok0.d dVar2 = new ok0.d(10, context, cVar, bVar, tVar);
                        mVar.K(dVar2);
                        objQ = dVar2;
                    }
                }
                p2Var.h(str, str3, null, null, null, zR, false, eVarC, null, null, (e23.a) objQ, mVar, 12582912, 0, 860);
                mVar.f();
            } else {
                mVar.C(166691362);
                mVar.f();
            }
        } else {
            mVar.e();
        }
        return Unit.INSTANCE;
    }

    private final Object f(Object obj, Object obj2, Object obj3) {
        String str = (String) this.f106593e;
        String str2 = (String) this.f106594f;
        String str3 = (String) this.f106590b;
        String str4 = (String) this.f106591c;
        yw1.d dVar = (yw1.d) this.f106592d;
        t2 t2Var = (t2) obj;
        p3.m mVar = (p3.m) obj2;
        int iIntValue = ((Integer) obj3).intValue();
        t2Var.getClass();
        if ((iIntValue & 6) == 0) {
            iIntValue |= mVar.B(t2Var) ? 4 : 2;
        }
        if (mVar.n(iIntValue & 1, (iIntValue & 19) != 18)) {
            x1 x1Var = p3.n.f135158a;
            int i14 = iIntValue;
            l72.x0 x0Var = l72.x0.f111346a;
            str.getClass();
            b92.a.C0235a c0235a = new b92.a.C0235a(null, 1, null);
            c0235a.f16962a.put("merge", j20.x.d(str2, " , ", str, " , ", str3));
            b92.a aVarB = c0235a.b();
            int i15 = b92.a.f16960b;
            int i16 = (i14 & 14) | (l72.x0.f111348c << 24);
            x0Var.a(i16, 52, aVarB, t2Var, null, null, str, str2, str4, null, mVar);
            String strValueOf = dVar.f199902b;
            if (strValueOf == null) {
                strValueOf = String.valueOf(fy1.b.c(0.0d));
            }
            String strQ = y.Q(mVar, R.string.activity_stats_details_total_time_label);
            b92.a.C0235a c0235a2 = new b92.a.C0235a(null, 1, null);
            c0235a2.f16962a.put("merge", e5.g(strQ, " , ", strValueOf));
            x0Var.a(i16, 60, c0235a2.b(), t2Var, null, null, strValueOf, strQ, null, null, mVar);
        } else {
            mVar.e();
        }
        return Unit.INSTANCE;
    }

    /* JADX WARN: Code duplicated, block: B:19:0x006c  */
    /* JADX WARN: Code duplicated, block: B:24:0x00a1  */
    /* JADX WARN: Multi-variable type inference failed */
    private final Object g(Object obj, Object obj2, Object obj3) {
        String str = (String) this.f106593e;
        e23.a aVar = (e23.a) this.f106590b;
        e23.l lVar = (e23.l) this.f106591c;
        p1 p1Var = (p1) this.f106592d;
        b0 b0Var = (b0) this.f106594f;
        a0 a0Var = (a0) obj;
        p3.m mVar = (p3.m) obj2;
        int iIntValue = ((Integer) obj3).intValue();
        a0Var.getClass();
        if ((iIntValue & 6) == 0) {
            iIntValue |= mVar.B(a0Var) ? 4 : 2;
        }
        if (mVar.n(iIntValue & 1, (iIntValue & 19) != 18)) {
            x1 x1Var = p3.n.f135158a;
            boolean zB = mVar.B(lVar) | mVar.B(p1Var) | mVar.B(aVar);
            Object objQ = mVar.q();
            p3.m.a aVar2 = p3.m.f135153a;
            if (zB) {
                objQ = new cv0.a(lVar, aVar, p1Var, 7);
                mVar.K(objQ);
            } else {
                aVar2.getClass();
                if (objQ == p3.m.a.f135155b) {
                    objQ = new cv0.a(lVar, aVar, p1Var, 7);
                    mVar.K(objQ);
                }
            }
            rx1.l.a(0, aVar, (e23.a) objQ, null, str, null, mVar, false);
            r.a aVar3 = r.S;
            r rVarA = m4.e.a(aVar3, b0Var);
            l0 l0Var = (l0) p1Var.getF182175a();
            boolean zB2 = mVar.B(p1Var);
            Object objQ2 = mVar.q();
            if (zB2) {
                objQ2 = new pp.b(p1Var, 19);
                mVar.K(objQ2);
            } else {
                aVar2.getClass();
                if (objQ2 == p3.m.a.f135155b) {
                    objQ2 = new pp.b(p1Var, 19);
                    mVar.K(objQ2);
                }
            }
            v.b(l0Var, rVarA, 50, (e23.l) objQ2, mVar, 384);
            c2.q.a(a0Var.a(x2.f(u1.n.e(aVar3, vb.h.e(d92.b.f58623a, mVar), m1.f128891a), 1.0f), 1.0f, true), mVar, 0);
        } else {
            mVar.e();
        }
        return Unit.INSTANCE;
    }

    /* JADX WARN: Code duplicated, block: B:23:0x007a  */
    /* JADX WARN: Code duplicated, block: B:39:0x00c9  */
    private final Object h(Object obj, Object obj2, Object obj3) {
        final com.garmin.android.apps.connectmobile.userprofile.model.q qVar = (com.garmin.android.apps.connectmobile.userprofile.model.q) this.f106590b;
        r rVar = (r) this.f106591c;
        boolean z14 = ((com.garmin.android.apps.connectmobile.userprofile.i.d) this.f106592d).f46788a;
        com.garmin.android.apps.connectmobile.userprofile.i iVar = (com.garmin.android.apps.connectmobile.userprofile.i) this.f106593e;
        final e23.l lVar = (e23.l) this.f106594f;
        p3.m mVar = (p3.m) obj2;
        int iIntValue = ((Integer) obj3).intValue();
        ((r) obj).getClass();
        final int i14 = 1;
        final int i15 = 0;
        if (mVar.n(iIntValue & 1, (iIntValue & 17) != 16)) {
            x1 x1Var = p3.n.f135158a;
            Integer followerCount = qVar.getFollowerCount();
            int iIntValue2 = followerCount != null ? followerCount.intValue() : 0;
            String strQ = y.Q(mVar, R.string.concept_followers);
            boolean z15 = z14 || iVar.z4();
            boolean zR = mVar.r(qVar) | mVar.B(lVar);
            Object objQ = mVar.q();
            p3.m.a aVar = p3.m.f135153a;
            if (zR) {
                objQ = new e23.a() { // from class: s12.k
                    @Override // e23.a
                    public final Object invoke() {
                        switch (i15) {
                            case 0:
                                Integer followerCount2 = qVar.getFollowerCount();
                                if ((followerCount2 != null ? followerCount2.intValue() : 0) > 0) {
                                    lVar.invoke(com.garmin.android.apps.connectmobile.userprofile.i.c.NAVIGATE_FOLLOWER);
                                }
                                break;
                            default:
                                Integer followingCount = qVar.getFollowingCount();
                                if ((followingCount != null ? followingCount.intValue() : 0) > 0) {
                                    lVar.invoke(com.garmin.android.apps.connectmobile.userprofile.i.c.NAVIGATE_FOLLOWING);
                                }
                                break;
                        }
                        return Unit.INSTANCE;
                    }
                };
                mVar.K(objQ);
            } else {
                aVar.getClass();
                if (objQ == p3.m.a.f135155b) {
                    objQ = new e23.a() { // from class: s12.k
                        @Override // e23.a
                        public final Object invoke() {
                            switch (i15) {
                                case 0:
                                    Integer followerCount2 = qVar.getFollowerCount();
                                    if ((followerCount2 != null ? followerCount2.intValue() : 0) > 0) {
                                        lVar.invoke(com.garmin.android.apps.connectmobile.userprofile.i.c.NAVIGATE_FOLLOWER);
                                    }
                                    break;
                                default:
                                    Integer followingCount = qVar.getFollowingCount();
                                    if ((followingCount != null ? followingCount.intValue() : 0) > 0) {
                                        lVar.invoke(com.garmin.android.apps.connectmobile.userprofile.i.c.NAVIGATE_FOLLOWING);
                                    }
                                    break;
                            }
                            return Unit.INSTANCE;
                        }
                    };
                    mVar.K(objQ);
                }
            }
            s12.m.c(iIntValue2, 0, w.d(rVar, z15, null, null, (e23.a) objQ, 14), strQ, mVar);
            Integer followingCount = qVar.getFollowingCount();
            int iIntValue3 = followingCount != null ? followingCount.intValue() : 0;
            String strQ2 = y.Q(mVar, R.string.lbl_following);
            r.a aVar2 = r.S;
            boolean z16 = z14 || iVar.z4();
            boolean zR2 = mVar.r(qVar) | mVar.B(lVar);
            Object objQ2 = mVar.q();
            if (zR2) {
                objQ2 = new e23.a() { // from class: s12.k
                    @Override // e23.a
                    public final Object invoke() {
                        switch (i14) {
                            case 0:
                                Integer followerCount2 = qVar.getFollowerCount();
                                if ((followerCount2 != null ? followerCount2.intValue() : 0) > 0) {
                                    lVar.invoke(com.garmin.android.apps.connectmobile.userprofile.i.c.NAVIGATE_FOLLOWER);
                                }
                                break;
                            default:
                                Integer followingCount2 = qVar.getFollowingCount();
                                if ((followingCount2 != null ? followingCount2.intValue() : 0) > 0) {
                                    lVar.invoke(com.garmin.android.apps.connectmobile.userprofile.i.c.NAVIGATE_FOLLOWING);
                                }
                                break;
                        }
                        return Unit.INSTANCE;
                    }
                };
                mVar.K(objQ2);
            } else {
                aVar.getClass();
                if (objQ2 == p3.m.a.f135155b) {
                    objQ2 = new e23.a() { // from class: s12.k
                        @Override // e23.a
                        public final Object invoke() {
                            switch (i14) {
                                case 0:
                                    Integer followerCount2 = qVar.getFollowerCount();
                                    if ((followerCount2 != null ? followerCount2.intValue() : 0) > 0) {
                                        lVar.invoke(com.garmin.android.apps.connectmobile.userprofile.i.c.NAVIGATE_FOLLOWER);
                                    }
                                    break;
                                default:
                                    Integer followingCount2 = qVar.getFollowingCount();
                                    if ((followingCount2 != null ? followingCount2.intValue() : 0) > 0) {
                                        lVar.invoke(com.garmin.android.apps.connectmobile.userprofile.i.c.NAVIGATE_FOLLOWING);
                                    }
                                    break;
                            }
                            return Unit.INSTANCE;
                        }
                    };
                    mVar.K(objQ2);
                }
            }
            s12.m.c(iIntValue3, 0, w.d(aVar2, z16, null, null, (e23.a) objQ2, 14), strQ2, mVar);
        } else {
            mVar.e();
        }
        return Unit.INSTANCE;
    }

    private final Object i(Object obj, Object obj2, Object obj3) {
        t72.f fVar = (t72.f) this.f106590b;
        Bundle bundle = (Bundle) this.f106591c;
        i82.a aVar = (i82.a) this.f106592d;
        p1 p1Var = (p1) this.f106593e;
        p1 p1Var2 = (p1) this.f106594f;
        h2 h2Var = (h2) obj;
        p3.m mVar = (p3.m) obj2;
        int iIntValue = ((Integer) obj3).intValue();
        HelpActivity.a aVar2 = HelpActivity.f49800a;
        h2Var.getClass();
        if ((iIntValue & 6) == 0) {
            iIntValue |= mVar.B(h2Var) ? 4 : 2;
        }
        if (mVar.n(iIntValue & 1, (iIntValue & 19) != 18)) {
            x1 x1Var = p3.n.f135158a;
            ve.a(c2.l.x(r.S, h2Var), null, tn.k.a(d92.b.f58623a, mVar), 0L, 0.0f, 0.0f, null, z3.f.c(1047613300, new ob0.e(fVar, bundle, aVar, p1Var, p1Var2, 25), mVar), mVar, 12582912, 122);
        } else {
            mVar.e();
        }
        return Unit.INSTANCE;
    }

    /* JADX WARN: Code duplicated, block: B:19:0x005a  */
    /* JADX WARN: Code duplicated, block: B:35:0x00f8  */
    private final Object j(Object obj, Object obj2, Object obj3) {
        m0 m0Var = (m0) this.f106590b;
        p1 p1Var = (p1) this.f106591c;
        bg2.h hVar = (bg2.h) this.f106592d;
        ug2.r0 r0Var = (ug2.r0) this.f106593e;
        x3 x3Var = (x3) this.f106594f;
        h2 h2Var = (h2) obj;
        p3.m mVar = (p3.m) obj2;
        int iIntValue = ((Integer) obj3).intValue();
        h2Var.getClass();
        int i14 = 4;
        if ((iIntValue & 6) == 0) {
            iIntValue |= mVar.B(h2Var) ? 4 : 2;
        }
        if (mVar.n(iIntValue & 1, (iIntValue & 19) != 18)) {
            x1 x1Var = p3.n.f135158a;
            p1Var.setValue(h2Var);
            boolean zR = mVar.r(m0Var);
            Object objQ = mVar.q();
            p3.m.a aVar = p3.m.f135153a;
            if (zR) {
                objQ = new nk0.l(m0Var, 27);
                mVar.K(objQ);
            } else {
                aVar.getClass();
                if (objQ == p3.m.a.f135155b) {
                    objQ = new nk0.l(m0Var, 27);
                    mVar.K(objQ);
                }
            }
            c.w.a(0, 1, (e23.a) objQ, mVar, false);
            r rVarX = c2.l.x(u1.n.e(r.S, tn.k.a(d92.b.f58623a, mVar), m1.f128891a), h2Var);
            h4.d.f81522a.getClass();
            z0 z0VarD = c2.q.d(h4.d.a.f81524b, false);
            int iHashCode = Long.hashCode(mVar.getU());
            i2 i2VarX = mVar.x();
            r rVarC = h4.k.c(rVarX, mVar);
            h5.g.V.getClass();
            e0.a aVar2 = h5.g.a.f81805b;
            if (mVar.F() == null) {
                p0.l();
                throw null;
            }
            mVar.z();
            if (mVar.getT()) {
                mVar.M(aVar2);
            } else {
                mVar.c();
            }
            b4.c(h5.g.a.f81810g, z0VarD, mVar);
            b4.c(h5.g.a.f81809f, i2VarX, mVar);
            h5.g.a.b bVar = h5.g.a.f81813j;
            if (mVar.getT() || !s.g(mVar.q(), Integer.valueOf(iHashCode))) {
                v.h.z(iHashCode, mVar, iHashCode, bVar);
            }
            b4.c(h5.g.a.f81807d, rVarC, mVar);
            u uVar = u.f22885a;
            boolean zBooleanValue = ((Boolean) x3Var.getF182175a()).booleanValue();
            boolean zR2 = mVar.r(r0Var);
            Object objQ2 = mVar.q();
            if (zR2) {
                objQ2 = new ug2.i(r0Var, i14);
                mVar.K(objQ2);
            } else {
                aVar.getClass();
                if (objQ2 == p3.m.a.f135155b) {
                    objQ2 = new ug2.i(r0Var, i14);
                    mVar.K(objQ2);
                }
            }
            bg2.c.b(hVar, zBooleanValue, (e23.a) objQ2, mVar, 0);
            mVar.y();
        } else {
            mVar.e();
        }
        return Unit.INSTANCE;
    }

    /* JADX WARN: Code duplicated, block: B:30:0x00db  */
    /* JADX WARN: Code duplicated, block: B:35:0x00f8  */
    /* JADX WARN: Multi-variable type inference failed */
    private final Object k(Object obj, Object obj2, Object obj3) {
        p1 p1Var = (p1) this.f106590b;
        ug2.r0 r0Var = (ug2.r0) this.f106591c;
        m0 m0Var = (m0) this.f106592d;
        p1 p1Var2 = (p1) this.f106593e;
        x3 x3Var = (x3) this.f106594f;
        h2 h2Var = (h2) obj;
        p3.m mVar = (p3.m) obj2;
        int iIntValue = ((Integer) obj3).intValue();
        h2Var.getClass();
        if ((iIntValue & 6) == 0) {
            iIntValue |= mVar.B(h2Var) ? 4 : 2;
        }
        int i14 = 0;
        if (mVar.n(iIntValue & 1, (iIntValue & 19) != 18)) {
            x1 x1Var = p3.n.f135158a;
            p1Var.setValue(h2Var);
            r rVarX = c2.l.x(u1.n.e(r.S, tn.k.a(d92.b.f58623a, mVar), m1.f128891a), h2Var);
            h4.d.f81522a.getClass();
            z0 z0VarD = c2.q.d(h4.d.a.f81524b, false);
            int iHashCode = Long.hashCode(mVar.getU());
            i2 i2VarX = mVar.x();
            r rVarC = h4.k.c(rVarX, mVar);
            h5.g.V.getClass();
            e0.a aVar = h5.g.a.f81805b;
            if (mVar.F() == null) {
                p0.l();
                throw null;
            }
            mVar.z();
            if (mVar.getT()) {
                mVar.M(aVar);
            } else {
                mVar.c();
            }
            b4.c(h5.g.a.f81810g, z0VarD, mVar);
            b4.c(h5.g.a.f81809f, i2VarX, mVar);
            h5.g.a.b bVar = h5.g.a.f81813j;
            if (mVar.getT() || !s.g(mVar.q(), Integer.valueOf(iHashCode))) {
                v.h.z(iHashCode, mVar, iHashCode, bVar);
            }
            b4.c(h5.g.a.f81807d, rVarC, mVar);
            u uVar = u.f22885a;
            o oVar = (o) p1Var2.getF182175a();
            yg2.h0 h0Var = (yg2.h0) x3Var.getF182175a();
            boolean zR = mVar.r(r0Var);
            Object objQ = mVar.q();
            p3.m.a aVar2 = p3.m.f135153a;
            if (zR) {
                objQ = new ug2.i(r0Var, 6);
                mVar.K(objQ);
            } else {
                aVar2.getClass();
                if (objQ == p3.m.a.f135155b) {
                    objQ = new ug2.i(r0Var, 6);
                    mVar.K(objQ);
                }
            }
            e23.a aVar3 = (e23.a) objQ;
            boolean zR2 = mVar.r(m0Var);
            Object objQ2 = mVar.q();
            if (zR2) {
                objQ2 = new ug2.x(m0Var, i14);
                mVar.K(objQ2);
            } else {
                aVar2.getClass();
                if (objQ2 == p3.m.a.f135155b) {
                    objQ2 = new ug2.x(m0Var, i14);
                    mVar.K(objQ2);
                }
            }
            sg2.j.a(null, oVar, h0Var, aVar3, (e23.a) objQ2, mVar, 0);
            mVar.y();
        } else {
            mVar.e();
        }
        return Unit.INSTANCE;
    }

    private final Object l(Object obj, Object obj2, Object obj3) {
        m82.f fVar = (m82.f) this.f106590b;
        x30.b bVar = (x30.b) this.f106591c;
        x30.a aVar = (x30.a) this.f106592d;
        x30.c cVar = (x30.c) this.f106593e;
        e23.l lVar = (e23.l) this.f106594f;
        ((Integer) obj).getClass();
        p3.m mVar = (p3.m) obj2;
        int iIntValue = ((Integer) obj3).intValue();
        if (mVar.n(iIntValue & 1, (iIntValue & 17) != 16)) {
            x1 x1Var = p3.n.f135158a;
            int iL = fVar.f117196a.l() % bVar.f188569c;
            ClimbDTO climbDTO = (ClimbDTO) h0.e0(iL, bVar.f188567a);
            if (climbDTO != null) {
                mVar.C(-1872653879);
                t30.i.c(climbDTO, aVar, cVar, mVar, ClimbDTO.f32776p);
                lVar.invoke(Integer.valueOf(iL));
                mVar.f();
            } else {
                mVar.C(-1872376150);
                mVar.f();
            }
        } else {
            mVar.e();
        }
        return Unit.INSTANCE;
    }

    /* JADX WARN: Code duplicated, block: B:6:0x0054  */
    private final Object n(Object obj, Object obj2, Object obj3) {
        c80.l0.b bVar = (c80.l0.b) this.f106590b;
        r rVar = (r) this.f106591c;
        e23.l lVar = (e23.l) this.f106592d;
        Context context = (Context) this.f106593e;
        e23.a aVar = (e23.a) this.f106594f;
        p3.m mVar = (p3.m) obj2;
        ((Integer) obj3).getClass();
        ((r1.e0) obj).getClass();
        x1 x1Var = p3.n.f135158a;
        String strName = bVar.f25409a.name();
        String str = bVar.f25413e;
        String str2 = bVar.f25414f;
        String str3 = bVar.f25415g;
        String str4 = bVar.f25416h;
        String str5 = bVar.f25412d;
        boolean zB = mVar.B(lVar) | mVar.r(context);
        Object objQ = mVar.q();
        if (zB) {
            objQ = new kv0.e(1, context, lVar);
            mVar.K(objQ);
        } else {
            p3.m.f135153a.getClass();
            if (objQ == p3.m.a.f135155b) {
                objQ = new kv0.e(1, context, lVar);
                mVar.K(objQ);
            }
        }
        t60.f.a(strName, rVar, null, str, str2, str3, str4, str5, null, (e23.a) objQ, aVar, mVar, 0, 260);
        return Unit.INSTANCE;
    }

    /* JADX WARN: Code duplicated, block: B:49:0x01cb  */
    /* JADX WARN: Multi-variable type inference failed */
    private final Object o(Object obj, Object obj2, Object obj3) {
        r rVar = (r) this.f106590b;
        je0.j jVar = (je0.j) this.f106591c;
        p1 p1Var = (p1) this.f106592d;
        i53.c cVar = (i53.c) this.f106593e;
        e23.l lVar = (e23.l) this.f106594f;
        b6 b6Var = (b6) obj;
        p3.m mVar = (p3.m) obj2;
        int iIntValue = ((Integer) obj3).intValue();
        b6Var.getClass();
        if ((iIntValue & 6) == 0) {
            iIntValue |= (iIntValue & 8) == 0 ? mVar.B(b6Var) : mVar.r(b6Var) ? 4 : 2;
        }
        int i14 = iIntValue;
        if (mVar.n(i14 & 1, (i14 & 19) != 18)) {
            x1 x1Var = p3.n.f135158a;
            y5.f90403b.getClass();
            r rVarE = b6Var.e(rVar, y5.f90404c);
            h4.d.f81522a.getClass();
            h4.g.b bVar = h4.d.a.f81534l;
            c2.j.f22691a.getClass();
            s2 s2VarA = q2.a(c2.j.f22692b, bVar, mVar, 54);
            int iHashCode = Long.hashCode(mVar.getU());
            i2 i2VarX = mVar.x();
            r rVarC = h4.k.c(rVarE, mVar);
            h5.g.V.getClass();
            e0.a aVar = h5.g.a.f81805b;
            String strQ = null;
            if (mVar.F() == null) {
                p0.l();
                throw null;
            }
            mVar.z();
            if (mVar.getT()) {
                mVar.M(aVar);
            } else {
                mVar.c();
            }
            b4.c(h5.g.a.f81810g, s2VarA, mVar);
            b4.c(h5.g.a.f81809f, i2VarX, mVar);
            h5.g.a.b bVar2 = h5.g.a.f81813j;
            if (mVar.getT() || !s.g(mVar.q(), Integer.valueOf(iHashCode))) {
                v.h.z(iHashCode, mVar, iHashCode, bVar2);
            }
            b4.c(h5.g.a.f81807d, rVarC, mVar);
            u2 u2Var = u2.f22900a;
            r.a aVar2 = r.S;
            d92.b.f58623a.getClass();
            d92.b.f58625c.getClass();
            r rVarA = u2Var.a(c2.l.C(aVar2, 0.0f, 0.0f, j92.b.f97899b.f97918c, 0.0f, 11), 1.0f, false);
            Integer numValueOf = jVar != null ? Integer.valueOf(jVar.f98545b) : null;
            if (numValueOf == null) {
                mVar.C(1963058582);
            } else {
                mVar.C(1963058583);
                strQ = y.Q(mVar, numValueOf.intValue());
            }
            mVar.f();
            if (strQ == null) {
                strQ = sn.a.h(mVar, 756062100, R.string.common_all, mVar);
            } else {
                mVar.C(756060488);
                mVar.f();
            }
            String str = strQ;
            d92.b.f58624b.getClass();
            s5.x0 x0VarB = d92.c.b(j92.f.f97930g, mVar);
            d6.h.f57752b.getClass();
            mh.c(str, rVarA, 0L, null, 0L, null, 0L, d6.h.a(d6.h.f57755e), 0L, 0, false, 0, 0, null, x0VarB, mVar, 0, 0, 130044);
            r rVarG = l4.k.g(aVar2, ((Boolean) p1Var.getF182175a()).booleanValue() ? 180.0f : 0.0f);
            s62.a.f157643a.getClass();
            i7.b(z2.a(t62.b.f162798a), null, rVarG, u0.f(mVar), mVar, 48, 0);
            r rVarE2 = c2.l.E(u1.n.e(aVar2, d92.b.a(mVar).c().g(), m1.f128891a), q1.Max);
            boolean zBooleanValue = ((Boolean) p1Var.getF182175a()).booleanValue();
            boolean zB = mVar.B(p1Var);
            Object objQ = mVar.q();
            if (zB) {
                objQ = new vd0.c(p1Var, 3);
                mVar.K(objQ);
            } else {
                p3.m.f135153a.getClass();
                if (objQ == p3.m.a.f135155b) {
                    objQ = new vd0.c(p1Var, 3);
                    mVar.K(objQ);
                }
            }
            b6Var.a(zBooleanValue, (e23.a) objQ, rVarE2, null, false, null, 0L, 0.0f, 0.0f, z3.f.c(2028007471, new da0.l0(cVar, p1Var, lVar), mVar), mVar, 0, 6 | ((i14 << 3) & 112));
            mVar.y();
        } else {
            mVar.e();
        }
        return Unit.INSTANCE;
    }

    /* JADX WARN: Code duplicated, block: B:16:0x0069  */
    /* JADX WARN: Code duplicated, block: B:37:0x00ec  */
    private final Object q(Object obj, Object obj2, Object obj3) {
        z3.e eVar;
        String strT;
        z3.e eVar2;
        String str = (String) this.f106593e;
        e23.l lVar = (e23.l) this.f106590b;
        i53.c<String> cVar = (i53.c) this.f106591c;
        String str2 = (String) this.f106594f;
        p1 p1Var = (p1) this.f106592d;
        p3.m mVar = (p3.m) obj2;
        int iIntValue = ((Integer) obj3).intValue();
        ((a0) obj).getClass();
        int i14 = 1;
        if (mVar.n(iIntValue & 1, (iIntValue & 17) != 16)) {
            x1 x1Var = p3.n.f135158a;
            if (str == null) {
                vd0.p0.f177348a.getClass();
                eVar = vd0.p0.f177352e;
            } else {
                eVar = null;
            }
            z3.e eVarC = z3.f.c(-1946637831, new vd0.b(str2, i14), mVar);
            boolean zB = mVar.B(lVar);
            Object objQ = mVar.q();
            p3.m.a aVar = p3.m.f135153a;
            if (zB) {
                objQ = new v1(lVar, p1Var, 23);
                mVar.K(objQ);
            } else {
                aVar.getClass();
                if (objQ == p3.m.a.f135155b) {
                    objQ = new v1(lVar, p1Var, 23);
                    mVar.K(objQ);
                }
            }
            i3.u.b(eVarC, (e23.a) objQ, null, null, eVar, false, null, null, mVar, 6, 492);
            for (String str3 : cVar) {
                x0 x0VarM = am.z0.m(str3);
                c3 c3Var = x0VarM != null ? x0VarM.f4360c : null;
                if (c3Var == null) {
                    mVar.C(-975563186);
                    mVar.f();
                    strT = null;
                } else {
                    mVar.C(-975563185);
                    strT = gl1.d.T(c3Var, mVar, 0);
                    mVar.f();
                }
                if (strT == null) {
                    strT = str3;
                }
                if (s.g(str, str3)) {
                    vd0.p0.f177348a.getClass();
                    eVar2 = vd0.p0.f177353f;
                } else {
                    eVar2 = null;
                }
                z3.e eVarC2 = z3.f.c(-992735927, new vd0.b(strT, 2), mVar);
                boolean zB2 = mVar.B(lVar) | mVar.B(str3);
                Object objQ2 = mVar.q();
                if (zB2) {
                    objQ2 = new cr.e(3, lVar, str3, p1Var);
                    mVar.K(objQ2);
                } else {
                    aVar.getClass();
                    if (objQ2 == p3.m.a.f135155b) {
                        objQ2 = new cr.e(3, lVar, str3, p1Var);
                        mVar.K(objQ2);
                    }
                }
                i3.u.b(eVarC2, (e23.a) objQ2, null, null, eVar2, false, null, null, mVar, 6, 492);
            }
            x1 x1Var2 = p3.n.f135158a;
        } else {
            mVar.e();
        }
        return Unit.INSTANCE;
    }

    /* JADX WARN: Code duplicated, block: B:19:0x007e  */
    private final Object r(Object obj, Object obj2, Object obj3) {
        x11.f fVar = (x11.f) this.f106590b;
        e23.l lVar = (e23.l) this.f106591c;
        v21.e eVar = (v21.e) this.f106592d;
        e23.l lVar2 = (e23.l) this.f106593e;
        i53.c cVar = (i53.c) this.f106594f;
        a0 a0Var = (a0) obj;
        p3.m mVar = (p3.m) obj2;
        int iIntValue = ((Integer) obj3).intValue();
        a0Var.getClass();
        if ((iIntValue & 6) == 0) {
            iIntValue |= mVar.B(a0Var) ? 4 : 2;
        }
        if (mVar.n(iIntValue & 1, (iIntValue & 19) != 18)) {
            x1 x1Var = p3.n.f135158a;
            r rVarA = a0Var.a(r.S, 1.0f, true);
            boolean zR = mVar.r(fVar) | mVar.B(lVar) | mVar.r(eVar) | mVar.B(lVar2) | mVar.r(cVar);
            Object objQ = mVar.q();
            if (zR) {
                ug2.q qVar = new ug2.q(fVar, cVar, lVar, eVar, lVar2, 5);
                mVar.K(qVar);
                objQ = qVar;
            } else {
                p3.m.f135153a.getClass();
                if (objQ == p3.m.a.f135155b) {
                    ug2.q qVar2 = new ug2.q(fVar, cVar, lVar, eVar, lVar2, 5);
                    mVar.K(qVar2);
                    objQ = qVar2;
                }
            }
            e2.c.b(rVarA, null, null, null, null, null, false, null, (e23.l) objQ, mVar, 0, 510);
        } else {
            mVar.e();
        }
        return Unit.INSTANCE;
    }

    /* JADX WARN: Code duplicated, block: B:19:0x008e  */
    private final Object s(Object obj, Object obj2, Object obj3) {
        x11.k kVar = (x11.k) this.f106590b;
        e23.a aVar = (e23.a) this.f106591c;
        v21.e eVar = (v21.e) this.f106592d;
        e23.l lVar = (e23.l) this.f106593e;
        e23.p pVar = (e23.p) this.f106594f;
        a0 a0Var = (a0) obj;
        p3.m mVar = (p3.m) obj2;
        int iIntValue = ((Integer) obj3).intValue();
        a0Var.getClass();
        if ((iIntValue & 6) == 0) {
            iIntValue |= mVar.B(a0Var) ? 4 : 2;
        }
        if (mVar.n(iIntValue & 1, (iIntValue & 19) != 18)) {
            x1 x1Var = p3.n.f135158a;
            r rVarE = u1.n.e(x2.f(a0Var.a(r.S, 1.0f, true), 1.0f), tn.k.a(d92.b.f58623a, mVar), m1.f128891a);
            boolean zR = mVar.r(kVar) | mVar.B(aVar) | mVar.r(eVar) | mVar.B(lVar) | mVar.B(pVar);
            Object objQ = mVar.q();
            if (zR) {
                ug2.q qVar = new ug2.q(kVar, aVar, eVar, lVar, pVar, 6);
                mVar.K(qVar);
                objQ = qVar;
            } else {
                p3.m.f135153a.getClass();
                if (objQ == p3.m.a.f135155b) {
                    ug2.q qVar2 = new ug2.q(kVar, aVar, eVar, lVar, pVar, 6);
                    mVar.K(qVar2);
                    objQ = qVar2;
                }
            }
            e2.c.b(rVarE, null, null, null, null, null, false, null, (e23.l) objQ, mVar, 0, 510);
        } else {
            mVar.e();
        }
        return Unit.INSTANCE;
    }

    private final Object u(Object obj, Object obj2, Object obj3) {
        String str = (String) this.f106593e;
        String str2 = (String) this.f106594f;
        n41.a aVar = ((w31.h) this.f106590b).f181870c;
        String str3 = (String) this.f106591c;
        String str4 = (String) this.f106592d;
        t2 t2Var = (t2) obj;
        p3.m mVar = (p3.m) obj2;
        int iIntValue = ((Integer) obj3).intValue();
        t2Var.getClass();
        if ((iIntValue & 6) == 0) {
            iIntValue |= mVar.B(t2Var) ? 4 : 2;
        }
        if (mVar.n(iIntValue & 1, (iIntValue & 19) != 18)) {
            x1 x1Var = p3.n.f135158a;
            l72.x0 x0Var = l72.x0.f111346a;
            String str5 = str == null ? str2 : str;
            String string = aVar.f123602b.getString(R.string.lbl_sleep_avg);
            String str6 = str != null ? str3 : null;
            int i14 = (l72.x0.f111348c << 24) | (iIntValue & 14);
            x0Var.a(i14, 116, null, t2Var, null, null, str5, string, str6, null, mVar);
            x0Var.a(i14, 116, null, t2Var, null, null, str4 == null ? str2 : str4, aVar.f123602b.getString(R.string.lbl_awake_avg), str4 != null ? str3 : null, null, mVar);
        } else {
            mVar.e();
        }
        return Unit.INSTANCE;
    }

    private final Object v(Object obj, Object obj2, Object obj3) {
        int i14;
        sc1.a aVar = (sc1.a) this.f106590b;
        Double d14 = (Double) this.f106591c;
        LocalDate localDate = (LocalDate) this.f106592d;
        Double d15 = (Double) this.f106593e;
        ArrayList arrayList = (ArrayList) this.f106594f;
        Float f14 = (Float) obj;
        p3.m mVar = (p3.m) obj2;
        int iIntValue = ((Integer) obj3).intValue();
        if ((iIntValue & 6) == 0) {
            iIntValue |= mVar.B(f14) ? 4 : 2;
        }
        if (mVar.n(iIntValue & 1, (iIntValue & 19) != 18)) {
            x1 x1Var = p3.n.f135158a;
            tc1.a aVar2 = f14 != null ? (tc1.a) arrayList.get((int) f14.floatValue()) : null;
            if (aVar2 != null) {
                mVar.C(-2126236033);
                if (aVar == sc1.a.Time) {
                    mVar.C(-2008248995);
                    i14 = 0;
                } else {
                    mVar.C(-2008246308);
                    i14 = 0;
                    d14 = d15;
                }
                vc1.i.a(aVar2, d14, localDate, aVar, mVar, i14);
                mVar.f();
                mVar.f();
            } else {
                mVar.C(-2126001549);
                mVar.f();
            }
        } else {
            mVar.e();
        }
        return Unit.INSTANCE;
    }

    /* JADX WARN: Code duplicated, block: B:200:0x06bd  */
    /* JADX WARN: Code duplicated, block: B:308:0x0a79  */
    /* JADX WARN: Code duplicated, block: B:317:0x0b35  */
    /* JADX WARN: Code duplicated, block: B:334:0x0bc3  */
    /* JADX WARN: Code duplicated, block: B:64:0x012e  */
    /* JADX WARN: Code duplicated, block: B:82:0x01a3  */
    /* JADX WARN: Code duplicated, block: B:89:0x01ed  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$PrimitiveArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    @Override // e23.q
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        String str;
        String str2;
        Object obj4;
        boolean z14;
        String str3;
        String strH;
        final p1 p1Var;
        final p1 p1Var2;
        Object obj5;
        final p1 p1Var3;
        int i14 = this.f106589a;
        p3.m.a aVar = p3.m.f135153a;
        int i15 = 19;
        Object obj6 = this.f106594f;
        Object obj7 = this.f106593e;
        Object obj8 = this.f106592d;
        Object obj9 = this.f106591c;
        Object obj10 = this.f106590b;
        final int i16 = 0;
        switch (i14) {
            case 0:
                fy1.f fVar = (fy1.f) obj10;
                p005kotlin.jvm.internal.r0 r0Var = (p005kotlin.jvm.internal.r0) obj9;
                String str4 = (String) obj7;
                p005kotlin.jvm.internal.r0 r0Var2 = (p005kotlin.jvm.internal.r0) obj8;
                String str5 = (String) obj6;
                t2 t2Var = (t2) obj;
                p3.m mVar = (p3.m) obj2;
                int iIntValue = ((Integer) obj3).intValue();
                t2Var.getClass();
                if ((iIntValue & 6) == 0) {
                    iIntValue |= mVar.B(t2Var) ? 4 : 2;
                }
                if (mVar.n(iIntValue & 1, (iIntValue & 19) != 18)) {
                    x1 x1Var = p3.n.f135158a;
                    l72.x0 x0Var = l72.x0.f111346a;
                    String str6 = fVar.f73916a;
                    String str7 = (String) r0Var.f105810a;
                    b92.a aVarA = wz1.a.a(str4);
                    int i17 = b92.a.f16960b;
                    int i18 = (iIntValue & 14) | (l72.x0.f111348c << 24);
                    x0Var.a(i18, 60, aVarA, t2Var, null, null, str6, str7, null, null, mVar);
                    x0Var.a(i18, 60, wz1.a.a(str5), t2Var, null, null, fVar.f73919d, (String) r0Var2.f105810a, null, null, mVar);
                } else {
                    mVar.e();
                }
                return Unit.INSTANCE;
            case 1:
                GCMMapView gCMMapView = (GCMMapView) obj10;
                List list = (List) obj9;
                sy0.k kVar = (sy0.k) obj8;
                p1 p1Var4 = (p1) obj7;
                e23.l lVar = (e23.l) obj6;
                p3.m mVar2 = (p3.m) obj2;
                int iIntValue2 = ((Integer) obj3).intValue();
                ((e2.d) obj).getClass();
                if (mVar2.n(iIntValue2 & 1, (iIntValue2 & 17) != 16)) {
                    x1 x1Var2 = p3.n.f135158a;
                    boolean zR = mVar2.r(gCMMapView) | mVar2.r(list);
                    Object objQ = mVar2.q();
                    if (zR) {
                        objQ = new k11.h(i15, gCMMapView, list);
                        mVar2.K(objQ);
                    } else {
                        aVar.getClass();
                        if (objQ == p3.m.a.f135155b) {
                            objQ = new k11.h(i15, gCMMapView, list);
                            mVar2.K(objQ);
                        }
                    }
                    h2.b bVarB = o0.b(0, (e23.a) objQ, mVar2, 0, 3);
                    ArrayList arrayList = new ArrayList();
                    if (gCMMapView != null) {
                        mVar2.C(1975661742);
                        arrayList.add(z3.f.c(-747202096, new jj2.c(gCMMapView, (Context) mVar2.A(AndroidCompositionLocals_androidKt.f6042b), kVar, p1Var4, 17), mVar2));
                        mVar2.f();
                    } else {
                        mVar2.C(1976879329);
                        mVar2.f();
                    }
                    mVar2.C(202319858);
                    ArrayList arrayList2 = new ArrayList(p13.y.r(list, 10));
                    Iterator it = list.iterator();
                    while (it.hasNext()) {
                        List list2 = list;
                        arrayList2.add(z3.f.c(-24602555, new jt1.m(it.next(), (Object) lVar, (Object) list2, false, 19), mVar2));
                        list = list2;
                    }
                    mVar2.f();
                    arrayList.addAll(arrayList2);
                    r.a aVar2 = r.S;
                    d92.b.f58623a.getClass();
                    d92.b.f58625c.getClass();
                    m82.d.b(c2.l.C(aVar2, 0.0f, 0.0f, 0.0f, j92.b.f97899b.f97918c, 7), i53.a.j(arrayList), 0.0f, null, 0.0f, null, null, null, bVarB, 0, false, z1.u.b.f200876a, mVar2, 0, 48, 1788);
                    x1 x1Var3 = p3.n.f135158a;
                } else {
                    mVar2.e();
                }
                return Unit.INSTANCE;
            case 2:
                b92.a aVar3 = (b92.a) obj10;
                String str8 = (String) obj7;
                String str9 = (String) obj6;
                u4.d dVar = (u4.d) obj9;
                e23.a aVar4 = (e23.a) obj8;
                p3.m mVar3 = (p3.m) obj2;
                int iIntValue3 = ((Integer) obj3).intValue();
                ((c1) obj).getClass();
                if (mVar3.n(iIntValue3 & 1, (iIntValue3 & 17) != 16)) {
                    x1 x1Var4 = p3.n.f135158a;
                    if (aVar3 == null || (str = aVar3.f16961a.get(Constants.ScionAnalytics.PARAM_LABEL)) == null) {
                        str = str8;
                    }
                    if (aVar3 == null || (str2 = aVar3.f16961a.get("value")) == null) {
                        str2 = str9;
                    }
                    r.a aVar5 = r.S;
                    h4.d.f81522a.getClass();
                    h4.g.b bVar = h4.d.a.f81534l;
                    c2.j.f22691a.getClass();
                    s2 s2VarA = q2.a(c2.j.f22692b, bVar, mVar3, 48);
                    int iHashCode = Long.hashCode(mVar3.getU());
                    i2 i2VarX = mVar3.x();
                    r rVarC = h4.k.c(aVar5, mVar3);
                    h5.g.V.getClass();
                    e0.a aVar6 = h5.g.a.f81805b;
                    if (mVar3.F() == null) {
                        p0.l();
                        throw null;
                    }
                    mVar3.z();
                    if (mVar3.getT()) {
                        mVar3.M(aVar6);
                    } else {
                        mVar3.c();
                    }
                    b4.c(h5.g.a.f81810g, s2VarA, mVar3);
                    b4.c(h5.g.a.f81809f, i2VarX, mVar3);
                    h5.g.a.b bVar2 = h5.g.a.f81813j;
                    if (mVar3.getT() || !s.g(mVar3.q(), Integer.valueOf(iHashCode))) {
                        v.h.z(iHashCode, mVar3, iHashCode, bVar2);
                    }
                    b4.c(h5.g.a.f81807d, rVarC, mVar3);
                    u2 u2Var = u2.f22900a;
                    d92.b.f58623a.getClass();
                    d92.b.f58624b.getClass();
                    s5.x0 x0Var2 = j92.f.f97931h;
                    s5.x0 x0VarF = d92.c.f(x0Var2, mVar3);
                    float f14 = 12;
                    g6.f.a aVar7 = g6.f.f75994b;
                    float f15 = 16;
                    r rVarA = u2Var.a(c2.l.z(aVar5, f15, f14), 1.0f, false);
                    boolean zB = mVar3.B(str);
                    Object objQ2 = mVar3.q();
                    if (zB) {
                        objQ2 = new n2(str, 5);
                        mVar3.K(objQ2);
                    } else {
                        aVar.getClass();
                        if (objQ2 == p3.m.a.f135155b) {
                            objQ2 = new n2(str, 5);
                            mVar3.K(objQ2);
                        }
                    }
                    mh.c(str8, p5.v.c((e23.l) objQ2, rVarA, false), 0L, null, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, x0VarF, mVar3, 0, 0, 131068);
                    int i19 = 6;
                    if (dVar != null) {
                        mVar3.C(127529059);
                        i7.b(dVar, str8, v2.b(x2.q(aVar5, 20), aVar4, new b82.i(17), mVar3, 6), d92.b.a(mVar3).f().a(), mVar3, 0, 0);
                        mVar3.f();
                    } else {
                        mVar3.C(128144533);
                        mVar3.f();
                    }
                    mVar3.y();
                    s5.x0 x0VarB = d92.c.b(x0Var2, mVar3);
                    f0.f182097b.getClass();
                    s5.x0 x0VarA = s5.x0.a(x0VarB, 0L, 0L, f0.f182103h, null, 0L, null, null, 0, 0L, null, null, 16777211);
                    d6.h.f57752b.getClass();
                    int i24 = d6.h.f57758h;
                    r rVarZ = c2.l.z(aVar5, f15, f14);
                    boolean zB2 = mVar3.B(str2);
                    Object objQ3 = mVar3.q();
                    if (zB2) {
                        objQ3 = new n2(str2, i19);
                        mVar3.K(objQ3);
                    } else {
                        aVar.getClass();
                        if (objQ3 == p3.m.a.f135155b) {
                            objQ3 = new n2(str2, i19);
                            mVar3.K(objQ3);
                        }
                    }
                    mh.c(str9, p5.v.c((e23.l) objQ3, rVarZ, false), 0L, null, 0L, null, 0L, d6.h.a(i24), 0L, 0, false, 0, 0, null, x0VarA, mVar3, 0, 0, 130044);
                } else {
                    mVar3.e();
                }
                return Unit.INSTANCE;
            case 3:
                List list3 = (List) obj10;
                km0.e eVar = (km0.e) obj9;
                e23.l lVar2 = (e23.l) obj8;
                p1 p1Var5 = (p1) obj7;
                p1 p1Var6 = (p1) obj6;
                c2.w wVar = (c2.w) obj;
                p3.m mVar4 = (p3.m) obj2;
                int iIntValue4 = ((Integer) obj3).intValue();
                wVar.getClass();
                if ((iIntValue4 & 6) == 0) {
                    iIntValue4 |= mVar4.B(wVar) ? 4 : 2;
                }
                if (mVar4.n(iIntValue4 & 1, (iIntValue4 & 19) != 18)) {
                    x1 x1Var5 = p3.n.f135158a;
                    d92.b.f58623a.getClass();
                    d92.b.f58625c.getClass();
                    float f16 = j92.b.f97899b.f97920e;
                    float fJ = wVar.j() - f16;
                    c2.j.f22691a.getClass();
                    t0.a(c2.l.y(r.S, f16), c2.j.i(f16), c2.j.i(f16), null, 0, 0, z3.f.c(-1274324727, new bv0.i(list3, (int) ((fJ / ((int) (fJ / (100 + f16)))) - f16), eVar, lVar2, p1Var5, p1Var6), mVar4), mVar4, 1572864, 56);
                } else {
                    mVar4.e();
                }
                return Unit.INSTANCE;
            case 4:
                b10.d dVar2 = (b10.d) obj10;
                km1.c cVar = (km1.c) obj9;
                b10.c cVar2 = (b10.c) obj8;
                int i25 = ((rl1.h) obj7).f153419e;
                oi0.h hVar = (oi0.h) obj6;
                t2 t2Var2 = (t2) obj;
                p3.m mVar5 = (p3.m) obj2;
                int iIntValue5 = ((Integer) obj3).intValue();
                t2Var2.getClass();
                if ((iIntValue5 & 6) == 0) {
                    iIntValue5 |= mVar5.B(t2Var2) ? 4 : 2;
                }
                if (mVar5.n(iIntValue5 & 1, (iIntValue5 & 19) != 18)) {
                    x1 x1Var6 = p3.n.f135158a;
                    l72.x0 x0Var3 = l72.x0.f111346a;
                    String strC = dVar2.c(cVar.I());
                    String strQ = y.Q(mVar5, R.string.txt_duration);
                    int i26 = (iIntValue5 & 14) | (l72.x0.f111348c << 24);
                    x0Var3.a(i26, 124, null, t2Var2, null, null, strC, strQ, null, null, mVar5);
                    String strC2 = cVar2.c(i25, (Context) mVar5.A(AndroidCompositionLocals_androidKt.f6042b));
                    String strQ2 = y.Q(mVar5, R.string.activity_stats_details_total_time_label);
                    b92.a.C0235a c0235a = new b92.a.C0235a(null, 1, null);
                    c0235a.f16962a.put("merge", e5.g(y.Q(mVar5, R.string.activity_stats_details_total_time_label), StringUtils.SPACE, hVar.c(i25 * 60, false)));
                    b92.a aVarB = c0235a.b();
                    int i27 = b92.a.f16960b;
                    x0Var3.a(i26, 60, aVarB, t2Var2, null, null, strC2, strQ2, null, null, mVar5);
                } else {
                    mVar5.e();
                }
                return Unit.INSTANCE;
            case 5:
                mg2.f fVar2 = (mg2.f) obj10;
                mg2.f fVar3 = (mg2.f) obj9;
                ArrayList arrayList3 = (ArrayList) obj8;
                mg2.v vVar = (mg2.v) obj6;
                String str10 = (String) obj7;
                e23.p pVar = (e23.p) obj;
                p3.m mVar6 = (p3.m) obj2;
                int iIntValue6 = ((Integer) obj3).intValue();
                pVar.getClass();
                if ((iIntValue6 & 6) == 0) {
                    iIntValue6 |= mVar6.r(pVar) ? 4 : 2;
                }
                if (mVar6.n(iIntValue6 & 1, (iIntValue6 & 19) != 18)) {
                    x1 x1Var7 = p3.n.f135158a;
                    boolean zG = s.g(fVar2, fVar3);
                    int i28 = zG ? 150 : 75;
                    int i29 = (!zG || i6.b.a(arrayList3).size() == 1) ? 0 : 75;
                    s1.b2 b2Var = new s1.b2(i28, i29, s1.e0.f155563d);
                    boolean zB3 = mVar6.B(fVar2) | mVar6.r(vVar);
                    Object objQ4 = mVar6.q();
                    if (zB3) {
                        obj4 = objQ4;
                        i0 i0Var = new i0(27, fVar2, vVar);
                        mVar6.K(i0Var);
                        obj4 = i0Var;
                    } else {
                        aVar.getClass();
                        if (objQ4 == p3.m.a.f135155b) {
                            obj4 = objQ4;
                            i0 i0Var2 = new i0(27, fVar2, vVar);
                            mVar6.K(i0Var2);
                            obj4 = i0Var2;
                        }
                    }
                    obj4 = objQ4;
                    e23.a aVar8 = (e23.a) obj4;
                    Object objQ5 = mVar6.q();
                    aVar.getClass();
                    p3.m.a.C2565a c2565a = p3.m.a.f135155b;
                    Object obj11 = objQ5;
                    if (objQ5 == c2565a) {
                        s1.b<Float, s1.n> bVarA = s1.d.a(!zG ? 1.0f : 0.0f, 0.01f);
                        mVar6.K(bVarA);
                        obj11 = bVarA;
                    }
                    s1.b bVar3 = (s1.b) obj11;
                    Boolean boolValueOf = Boolean.valueOf(zG);
                    boolean zR2 = mVar6.r(bVar3) | mVar6.h(zG) | mVar6.r(b2Var) | mVar6.B(aVar8);
                    Object objQ6 = mVar6.q();
                    if (zR2 || objQ6 == c2565a) {
                        objQ6 = new mg2.l(bVar3, zG, b2Var, aVar8, null);
                        z14 = zG;
                        mVar6.K(objQ6);
                    } else {
                        z14 = zG;
                    }
                    p3.l0.e((e23.p) objQ6, boolValueOf, mVar6);
                    s1.m<T, V> mVar7 = bVar3.f155489c;
                    s1.b2 b2Var2 = new s1.b2(i28, i29, s1.e0.f155560a);
                    Object objQ7 = mVar6.q();
                    Object obj12 = objQ7;
                    if (objQ7 == c2565a) {
                        s1.b<Float, s1.n> bVarA2 = s1.d.a(!z14 ? 1.0f : 0.8f, 0.01f);
                        mVar6.K(bVarA2);
                        obj12 = bVarA2;
                    }
                    s1.b bVar4 = (s1.b) obj12;
                    Boolean boolValueOf2 = Boolean.valueOf(z14);
                    boolean zR3 = mVar6.r(bVar4) | mVar6.h(z14) | mVar6.r(b2Var2);
                    Object objQ8 = mVar6.q();
                    Object obj13 = objQ8;
                    if (zR3 || objQ8 == c2565a) {
                        mg2.m mVar8 = new mg2.m(bVar4, z14, b2Var2, null);
                        mVar6.K(mVar8);
                        obj13 = mVar8;
                    }
                    p3.l0.e((e23.p) obj13, boolValueOf2, mVar6);
                    s1.m<T, V> mVar9 = bVar4.f155489c;
                    r rVarC2 = s0.c(r.S, ((Number) mVar9.f155628b.getF182175a()).floatValue(), ((Number) mVar9.f155628b.getF182175a()).floatValue(), ((Number) mVar7.f155628b.getF182175a()).floatValue(), 0.0f, null, 0, 524280);
                    boolean zH = mVar6.h(z14) | mVar6.B(fVar2) | mVar6.B(str10);
                    Object objQ9 = mVar6.q();
                    Object obj14 = objQ9;
                    if (zH || objQ9 == c2565a) {
                        ad0.f fVar4 = new ad0.f(z14, str10, fVar2, 13);
                        mVar6.K(fVar4);
                        obj14 = fVar4;
                    }
                    r rVarC3 = p5.v.c((e23.l) obj14, rVarC2, false);
                    h4.d.f81522a.getClass();
                    z0 z0VarD = c2.q.d(h4.d.a.f81524b, false);
                    int iHashCode2 = Long.hashCode(mVar6.getU());
                    i2 i2VarX2 = mVar6.x();
                    r rVarC4 = h4.k.c(rVarC3, mVar6);
                    h5.g.V.getClass();
                    e0.a aVar9 = h5.g.a.f81805b;
                    if (mVar6.F() == null) {
                        p0.l();
                        throw null;
                    }
                    mVar6.z();
                    if (mVar6.getT()) {
                        mVar6.M(aVar9);
                    } else {
                        mVar6.c();
                    }
                    b4.c(h5.g.a.f81810g, z0VarD, mVar6);
                    b4.c(h5.g.a.f81809f, i2VarX2, mVar6);
                    h5.g.a.b bVar5 = h5.g.a.f81813j;
                    if (mVar6.getT() || !s.g(mVar6.q(), Integer.valueOf(iHashCode2))) {
                        v.h.z(iHashCode2, mVar6, iHashCode2, bVar5);
                    }
                    b4.c(h5.g.a.f81807d, rVarC4, mVar6);
                    u uVar = u.f22885a;
                    v.h.B(pVar, mVar6, iIntValue6 & 14);
                } else {
                    mVar6.e();
                }
                return Unit.INSTANCE;
            case 6:
                gg1.o0 o0Var = (gg1.o0) obj10;
                e23.l lVar3 = (e23.l) obj9;
                p1 p1Var7 = (p1) obj8;
                String str11 = (String) obj7;
                String str12 = (String) obj6;
                p3.m mVar10 = (p3.m) obj2;
                int iIntValue7 = ((Integer) obj3).intValue();
                ((a0) obj).getClass();
                if (mVar10.n(iIntValue7 & 1, (iIntValue7 & 17) != 16)) {
                    x1 x1Var8 = p3.n.f135158a;
                    r.a aVar10 = r.S;
                    d92.b.f58623a.getClass();
                    d92.b.f58625c.getClass();
                    j92.e eVar2 = j92.b.f97899b;
                    r rVarF = x2.f(c2.l.y(aVar10, eVar2.f97921f), 1.0f);
                    Object objQ10 = mVar10.q();
                    aVar.getClass();
                    if (objQ10 == p3.m.a.f135155b) {
                        objQ10 = new n02.c(p1Var7, 5);
                        mVar10.K(objQ10);
                    }
                    r rVarY = c2.l.y(u1.n.e(w.d(rVarF, false, null, null, (e23.a) objQ10, 15), com.nimbusds.jose.shaded.gson.internal.a.c(mVar10), k2.i.a(j92.b.f97900c.f97912d)), eVar2.f97920e);
                    h4.d.f81522a.getClass();
                    h4.g.b bVar6 = h4.d.a.f81534l;
                    c2.j.f22691a.getClass();
                    s2 s2VarA2 = q2.a(c2.j.f22696f, bVar6, mVar10, 54);
                    int iHashCode3 = Long.hashCode(mVar10.getU());
                    i2 i2VarX3 = mVar10.x();
                    r rVarC5 = h4.k.c(rVarY, mVar10);
                    h5.g.V.getClass();
                    e0.a aVar11 = h5.g.a.f81805b;
                    if (mVar10.F() == null) {
                        p0.l();
                        throw null;
                    }
                    mVar10.z();
                    if (mVar10.getT()) {
                        mVar10.M(aVar11);
                    } else {
                        mVar10.c();
                    }
                    b4.c(h5.g.a.f81810g, s2VarA2, mVar10);
                    b4.c(h5.g.a.f81809f, i2VarX3, mVar10);
                    h5.g.a.b bVar7 = h5.g.a.f81813j;
                    if (mVar10.getT() || !s.g(mVar10.q(), Integer.valueOf(iHashCode3))) {
                        v.h.z(iHashCode3, mVar10, iHashCode3, bVar7);
                    }
                    b4.c(h5.g.a.f81807d, rVarC5, mVar10);
                    u2 u2Var2 = u2.f22900a;
                    u2Var2.getClass();
                    f5.p pVar2 = f5.b.f68892a;
                    r rVarC6 = c2.l.C(u2Var2.d(aVar10, pVar2), 0.0f, 0.0f, eVar2.f97917b, 0.0f, 11);
                    d92.b.f58624b.getClass();
                    mh.c(str11, rVarC6, 0L, null, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, d92.c.b(j92.f.f97925b, mVar10), mVar10, 0, 0, 131068);
                    mh.c(str12, u2Var2.d(aVar10, pVar2), 0L, null, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, d92.c.b(j92.f.f97931h, mVar10), mVar10, 0, 0, 131068);
                    mVar10.y();
                    r rVarY2 = c2.l.y(aVar10, eVar2.f97918c);
                    w13.c cVar3 = gg1.o0.f77290i;
                    ArrayList arrayList4 = new ArrayList();
                    for (Object obj15 : cVar3) {
                        if (((gg1.o0) obj15) != gg1.o0.STATUTE_UK) {
                            arrayList4.add(obj15);
                        }
                    }
                    c2.j.f22691a.getClass();
                    c2.j.c cVar4 = c2.j.f22696f;
                    d92.b.f58623a.getClass();
                    d92.b.f58624b.getClass();
                    s5.x0 x0VarB2 = d92.c.b(j92.f.f97933j, mVar10);
                    ma0.b bVar8 = new ma0.b(10);
                    boolean zB4 = mVar10.B(lVar3);
                    Object objQ11 = mVar10.q();
                    if (zB4 || objQ11 == p3.m.a.f135155b) {
                        objQ11 = new na0.l(lVar3, i16);
                        mVar10.K(objQ11);
                    }
                    da0.t.a(rVarY2, cVar4, 0, o0Var, arrayList4, x0VarB2, bVar8, (e23.l) objQ11, mVar10, 48);
                    t4.d dVarA = n5.c.a(R.drawable.art_tire_circumference, mVar10, 0);
                    r rVarQ = x2.q(x2.f(r.S, 1.0f), na0.m.f125147a);
                    d92.b.f58625c.getClass();
                    y0.a(dVarA, null, c2.l.A(rVarQ, 0.0f, j92.b.f97899b.f97923h, 1), null, null, 0.0f, null, mVar10, 48, 120);
                    x1 x1Var9 = p3.n.f135158a;
                } else {
                    mVar10.e();
                }
                return Unit.INSTANCE;
            case 7:
                ah2.e eVar3 = (ah2.e) obj10;
                qg2.c cVar5 = (qg2.c) obj9;
                String str13 = (String) obj7;
                og2.l lVar4 = (og2.l) obj8;
                pg2.a aVar12 = (pg2.a) obj6;
                p3.m mVar11 = (p3.m) obj2;
                int iIntValue8 = ((Integer) obj3).intValue();
                ((a0) obj).getClass();
                if (mVar11.n(iIntValue8 & 1, (iIntValue8 & 17) != 16)) {
                    x1 x1Var10 = p3.n.f135158a;
                    if (eVar3 == null || (str3 = eVar3.f3289a) == null) {
                        str3 = "--";
                    }
                    r.a aVar13 = r.S;
                    c2.j.f22691a.getClass();
                    c2.j.k kVar2 = c2.j.f22694d;
                    h4.d.f81522a.getClass();
                    z zVarA = c2.y.a(kVar2, h4.d.a.f81536n, mVar11, 0);
                    int iHashCode4 = Long.hashCode(mVar11.getU());
                    i2 i2VarX4 = mVar11.x();
                    r rVarC7 = h4.k.c(aVar13, mVar11);
                    h5.g.V.getClass();
                    e0.a aVar14 = h5.g.a.f81805b;
                    if (mVar11.F() == null) {
                        p0.l();
                        throw null;
                    }
                    mVar11.z();
                    if (mVar11.getT()) {
                        mVar11.M(aVar14);
                    } else {
                        mVar11.c();
                    }
                    b4.c(h5.g.a.f81810g, zVarA, mVar11);
                    b4.c(h5.g.a.f81809f, i2VarX4, mVar11);
                    h5.g.a.b bVar9 = h5.g.a.f81813j;
                    if (mVar11.getT() || !s.g(mVar11.q(), Integer.valueOf(iHashCode4))) {
                        v.h.z(iHashCode4, mVar11, iHashCode4, bVar9);
                    }
                    b4.c(h5.g.a.f81807d, rVarC7, mVar11);
                    c2.b0 b0Var = c2.b0.f22601a;
                    og2.c.b(cVar5, mVar11, 0);
                    og2.c.c(str3, str13, mVar11, 0);
                    d92.b.f58623a.getClass();
                    d92.b.f58625c.getClass();
                    j92.e eVar4 = j92.b.f97899b;
                    float f17 = eVar4.f97920e;
                    og2.a.a(b0Var.a(c2.l.C(aVar13, 0.0f, 0.0f, f17, 0.0f, 11), 1.0f, true), new og2.f(i53.a.e(lVar4.f132053a), lVar4.f132054b, lVar4.f132058f, d0.a(cVar5.a(mVar11)), lVar4.f132055c, lVar4.f132056d, null, null, lVar4.f132060h, 192, null), mVar11, 0);
                    v5.a(0.0f, 0, 2, r1.q2.f(mVar11), c2.l.A(aVar13, f17, 0.0f, 2), mVar11);
                    c2.l.f(x2.h(aVar13, eVar4.f97918c), mVar11);
                    r rVarC8 = c2.l.C(c2.l.A(aVar13, f17, 0.0f, 2), 0.0f, 0.0f, 0.0f, eVar4.f97918c, 7);
                    if (s.g(aVar12, pg2.a.C2605a.f137614e)) {
                        strH = sn.a.h(mVar11, -586040872, R.string.common_all, mVar11);
                    } else if (s.g(aVar12, pg2.a.c.f137615e)) {
                        mVar11.C(-586037881);
                        p005kotlin.jvm.internal.x0 x0Var4 = p005kotlin.jvm.internal.x0.f105818a;
                        strH = String.format(y.Q(mVar11, R.string.lbl_last_x_m), Arrays.copyOf(new Object[]{"5"}, 1));
                        mVar11.f();
                    } else {
                        if (!s.g(aVar12, pg2.a.d.f137616e)) {
                            throw n23.j.m(mVar11, -586042779);
                        }
                        mVar11.C(-586034489);
                        p005kotlin.jvm.internal.x0 x0Var5 = p005kotlin.jvm.internal.x0.f105818a;
                        strH = String.format(y.Q(mVar11, R.string.lbl_last_x_m), Arrays.copyOf(new Object[]{IcyHeaders.REQUEST_HEADER_ENABLE_METADATA_VALUE}, 1));
                        mVar11.f();
                    }
                    String str14 = strH;
                    d92.b.f58624b.getClass();
                    mh.c(str14, rVarC8, 0L, null, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, d92.c.f(j92.f.f97933j, mVar11), mVar11, 0, 0, 131068);
                    mVar11.y();
                } else {
                    mVar11.e();
                }
                return Unit.INSTANCE;
            case 8:
                final com.garmin.android.apps.connectmobile.connections.groups.services.model.b bVar10 = (com.garmin.android.apps.connectmobile.connections.groups.services.model.b) obj10;
                p1 p1Var8 = (p1) obj9;
                p1 p1Var9 = (p1) obj8;
                p1 p1Var10 = (p1) obj7;
                p1 p1Var11 = (p1) obj6;
                p3.m mVar12 = (p3.m) obj2;
                int iIntValue9 = ((Integer) obj3).intValue();
                ((a0) obj).getClass();
                if (mVar12.n(iIntValue9 & 1, (iIntValue9 & 17) != 16)) {
                    x1 x1Var11 = p3.n.f135158a;
                    om0.a.f132894a.getClass();
                    z3.e eVar5 = om0.a.f132895b;
                    boolean zR4 = mVar12.r(bVar10);
                    Object objQ12 = mVar12.q();
                    if (zR4) {
                        p1Var = p1Var10;
                        p1Var2 = p1Var8;
                        p1Var3 = p1Var9;
                        final int i30 = 0;
                        obj5 = new e23.a() { // from class: om0.g
                            @Override // e23.a
                            public final Object invoke() {
                                switch (i30) {
                                    case 0:
                                        p1Var2.setValue(Boolean.FALSE);
                                        GroupDTO.c groupRole = bVar10.getGroupRole();
                                        GroupDTO.c cVar6 = GroupDTO.c.ADMIN;
                                        if (groupRole != cVar6) {
                                            p1Var3.setValue(cVar6);
                                            p1Var.setValue(Boolean.TRUE);
                                        }
                                        break;
                                    default:
                                        p1Var2.setValue(Boolean.FALSE);
                                        GroupDTO.c groupRole2 = bVar10.getGroupRole();
                                        GroupDTO.c cVar7 = GroupDTO.c.MEMBER;
                                        if (groupRole2 != cVar7) {
                                            p1Var3.setValue(cVar7);
                                            p1Var.setValue(Boolean.TRUE);
                                        }
                                        break;
                                }
                                return Unit.INSTANCE;
                            }
                        };
                        mVar12.K(obj5);
                    } else {
                        aVar.getClass();
                        if (objQ12 == p3.m.a.f135155b) {
                            p1Var = p1Var10;
                            p1Var2 = p1Var8;
                            p1Var3 = p1Var9;
                            final int i34 = 0;
                            obj5 = new e23.a() { // from class: om0.g
                                @Override // e23.a
                                public final Object invoke() {
                                    switch (i34) {
                                        case 0:
                                            p1Var2.setValue(Boolean.FALSE);
                                            GroupDTO.c groupRole = bVar10.getGroupRole();
                                            GroupDTO.c cVar6 = GroupDTO.c.ADMIN;
                                            if (groupRole != cVar6) {
                                                p1Var3.setValue(cVar6);
                                                p1Var.setValue(Boolean.TRUE);
                                            }
                                            break;
                                        default:
                                            p1Var2.setValue(Boolean.FALSE);
                                            GroupDTO.c groupRole2 = bVar10.getGroupRole();
                                            GroupDTO.c cVar7 = GroupDTO.c.MEMBER;
                                            if (groupRole2 != cVar7) {
                                                p1Var3.setValue(cVar7);
                                                p1Var.setValue(Boolean.TRUE);
                                            }
                                            break;
                                    }
                                    return Unit.INSTANCE;
                                }
                            };
                            mVar12.K(obj5);
                        } else {
                            p1Var = p1Var10;
                            p1Var2 = p1Var8;
                            obj5 = objQ12;
                            p1Var3 = p1Var9;
                        }
                    }
                    i3.u.b(eVar5, (e23.a) obj5, null, z3.f.c(-992940283, new e23.p() { // from class: om0.j
                        @Override // e23.p
                        public final Object invoke(Object obj16, Object obj17) {
                            int i35 = i16;
                            com.garmin.android.apps.connectmobile.connections.groups.services.model.b bVar11 = bVar10;
                            switch (i35) {
                                case 0:
                                    p3.m mVar13 = (p3.m) obj16;
                                    int iIntValue10 = ((Integer) obj17).intValue();
                                    if (mVar13.n(iIntValue10 & 1, (iIntValue10 & 3) != 2)) {
                                        x1 x1Var12 = p3.n.f135158a;
                                        if (bVar11.getGroupRole() == GroupDTO.c.ADMIN) {
                                            mVar13.C(-1244116933);
                                            s62.a.f157643a.getClass();
                                            i7.b(e1.a(t62.b.f162798a), "", null, 0L, mVar13, 48, 12);
                                            mVar13.f();
                                        } else {
                                            mVar13.C(-1243930499);
                                            mVar13.f();
                                        }
                                    } else {
                                        mVar13.e();
                                    }
                                    break;
                                default:
                                    p3.m mVar14 = (p3.m) obj16;
                                    int iIntValue11 = ((Integer) obj17).intValue();
                                    if (mVar14.n(iIntValue11 & 1, (iIntValue11 & 3) != 2)) {
                                        x1 x1Var13 = p3.n.f135158a;
                                        if (bVar11.getGroupRole() == GroupDTO.c.MEMBER) {
                                            mVar14.C(-387642350);
                                            s62.a.f157643a.getClass();
                                            i7.b(e1.a(t62.b.f162798a), "", null, 0L, mVar14, 48, 12);
                                            mVar14.f();
                                        } else {
                                            mVar14.C(-387455916);
                                            mVar14.f();
                                        }
                                    } else {
                                        mVar14.e();
                                    }
                                    break;
                            }
                            return Unit.INSTANCE;
                        }
                    }, mVar12), null, false, null, null, mVar12, 3078, 500);
                    z3.e eVar6 = om0.a.f132896c;
                    boolean zR5 = mVar12.r(bVar10);
                    Object objQ13 = mVar12.q();
                    if (zR5) {
                        final p1 p1Var12 = p1Var3;
                        final int i35 = 1;
                        final p1 p1Var13 = p1Var2;
                        final p1 p1Var14 = p1Var;
                        e23.a aVar15 = new e23.a() { // from class: om0.g
                            @Override // e23.a
                            public final Object invoke() {
                                switch (i35) {
                                    case 0:
                                        p1Var13.setValue(Boolean.FALSE);
                                        GroupDTO.c groupRole = bVar10.getGroupRole();
                                        GroupDTO.c cVar6 = GroupDTO.c.ADMIN;
                                        if (groupRole != cVar6) {
                                            p1Var12.setValue(cVar6);
                                            p1Var14.setValue(Boolean.TRUE);
                                        }
                                        break;
                                    default:
                                        p1Var13.setValue(Boolean.FALSE);
                                        GroupDTO.c groupRole2 = bVar10.getGroupRole();
                                        GroupDTO.c cVar7 = GroupDTO.c.MEMBER;
                                        if (groupRole2 != cVar7) {
                                            p1Var12.setValue(cVar7);
                                            p1Var14.setValue(Boolean.TRUE);
                                        }
                                        break;
                                }
                                return Unit.INSTANCE;
                            }
                        };
                        bVar10 = bVar10;
                        p1Var2 = p1Var13;
                        mVar12.K(aVar15);
                        objQ13 = aVar15;
                    } else {
                        aVar.getClass();
                        if (objQ13 == p3.m.a.f135155b) {
                            final p1 p1Var15 = p1Var3;
                            final int i36 = 1;
                            final p1 p1Var16 = p1Var2;
                            final p1 p1Var17 = p1Var;
                            e23.a aVar16 = new e23.a() { // from class: om0.g
                                @Override // e23.a
                                public final Object invoke() {
                                    switch (i36) {
                                        case 0:
                                            p1Var16.setValue(Boolean.FALSE);
                                            GroupDTO.c groupRole = bVar10.getGroupRole();
                                            GroupDTO.c cVar6 = GroupDTO.c.ADMIN;
                                            if (groupRole != cVar6) {
                                                p1Var15.setValue(cVar6);
                                                p1Var17.setValue(Boolean.TRUE);
                                            }
                                            break;
                                        default:
                                            p1Var16.setValue(Boolean.FALSE);
                                            GroupDTO.c groupRole2 = bVar10.getGroupRole();
                                            GroupDTO.c cVar7 = GroupDTO.c.MEMBER;
                                            if (groupRole2 != cVar7) {
                                                p1Var15.setValue(cVar7);
                                                p1Var17.setValue(Boolean.TRUE);
                                            }
                                            break;
                                    }
                                    return Unit.INSTANCE;
                                }
                            };
                            bVar10 = bVar10;
                            p1Var2 = p1Var16;
                            mVar12.K(aVar16);
                            objQ13 = aVar16;
                        }
                    }
                    final int i37 = true ? 1 : 0;
                    i3.u.b(eVar6, (e23.a) objQ13, null, z3.f.c(-40236434, new e23.p() { // from class: om0.j
                        @Override // e23.p
                        public final Object invoke(Object obj16, Object obj17) {
                            int i38 = i37;
                            com.garmin.android.apps.connectmobile.connections.groups.services.model.b bVar11 = bVar10;
                            switch (i38) {
                                case 0:
                                    p3.m mVar13 = (p3.m) obj16;
                                    int iIntValue10 = ((Integer) obj17).intValue();
                                    if (mVar13.n(iIntValue10 & 1, (iIntValue10 & 3) != 2)) {
                                        x1 x1Var12 = p3.n.f135158a;
                                        if (bVar11.getGroupRole() == GroupDTO.c.ADMIN) {
                                            mVar13.C(-1244116933);
                                            s62.a.f157643a.getClass();
                                            i7.b(e1.a(t62.b.f162798a), "", null, 0L, mVar13, 48, 12);
                                            mVar13.f();
                                        } else {
                                            mVar13.C(-1243930499);
                                            mVar13.f();
                                        }
                                    } else {
                                        mVar13.e();
                                    }
                                    break;
                                default:
                                    p3.m mVar14 = (p3.m) obj16;
                                    int iIntValue11 = ((Integer) obj17).intValue();
                                    if (mVar14.n(iIntValue11 & 1, (iIntValue11 & 3) != 2)) {
                                        x1 x1Var13 = p3.n.f135158a;
                                        if (bVar11.getGroupRole() == GroupDTO.c.MEMBER) {
                                            mVar14.C(-387642350);
                                            s62.a.f157643a.getClass();
                                            i7.b(e1.a(t62.b.f162798a), "", null, 0L, mVar14, 48, 12);
                                            mVar14.f();
                                        } else {
                                            mVar14.C(-387455916);
                                            mVar14.f();
                                        }
                                    } else {
                                        mVar14.e();
                                    }
                                    break;
                            }
                            return Unit.INSTANCE;
                        }
                    }, mVar12), null, false, null, null, mVar12, 3078, 500);
                    z3.e eVar7 = om0.a.f132897d;
                    Object objQ14 = mVar12.q();
                    aVar.getClass();
                    if (objQ14 == p3.m.a.f135155b) {
                        objQ14 = new j1(p1Var2, p1Var11, i15);
                        mVar12.K(objQ14);
                    }
                    i3.u.b(eVar7, (e23.a) objQ14, null, om0.a.f132898e, null, false, null, null, mVar12, 3126, 500);
                } else {
                    mVar12.e();
                }
                return Unit.INSTANCE;
            case 9:
                return a(obj, obj2, obj3);
            case 10:
                or0.m mVar13 = (or0.m) obj10;
                Context context = (Context) obj9;
                String str15 = (String) obj7;
                p1 p1Var18 = (p1) obj6;
                p3.m mVar14 = (p3.m) obj2;
                ((Integer) obj3).getClass();
                ((r1.e0) obj).getClass();
                x1 x1Var12 = p3.n.f135158a;
                int i38 = ((or0.q) ((p1) obj8).getF182175a()).f133401e;
                boolean zR6 = mVar14.r(mVar13) | mVar14.r(context) | mVar14.B(str15);
                Object objQ15 = mVar14.q();
                if (zR6) {
                    objQ15 = new mt0.e0(mVar13, context, str15, p1Var18);
                    mVar14.K(objQ15);
                } else {
                    aVar.getClass();
                    if (objQ15 == p3.m.a.f135155b) {
                        objQ15 = new mt0.e0(mVar13, context, str15, p1Var18);
                        mVar14.K(objQ15);
                    }
                }
                e23.l lVar5 = (e23.l) objQ15;
                Object objQ16 = mVar14.q();
                aVar.getClass();
                if (objQ16 == p3.m.a.f135155b) {
                    objQ16 = new om0.h(p1Var18, 5);
                    mVar14.K(objQ16);
                }
                rr0.m.b(i38, lVar5, (e23.a) objQ16, mVar14, 384);
                return Unit.INSTANCE;
            case 11:
                return b(obj, obj2, obj3);
            case 12:
                return c(obj, obj2, obj3);
            case 13:
                return d(obj, obj2, obj3);
            case 14:
                return e(obj, obj2, obj3);
            case 15:
                return f(obj, obj2, obj3);
            case 16:
                return g(obj, obj2, obj3);
            case 17:
                return h(obj, obj2, obj3);
            case 18:
                return i(obj, obj2, obj3);
            case 19:
                return j(obj, obj2, obj3);
            case 20:
                return k(obj, obj2, obj3);
            case 21:
                return l(obj, obj2, obj3);
            case 22:
                return n(obj, obj2, obj3);
            case 23:
                return o(obj, obj2, obj3);
            case 24:
                return q(obj, obj2, obj3);
            case 25:
                return r(obj, obj2, obj3);
            case 26:
                return s(obj, obj2, obj3);
            case 27:
                return u(obj, obj2, obj3);
            case 28:
                return v(obj, obj2, obj3);
            default:
                e23.p pVar3 = (e23.p) obj10;
                x1.i iVar = (x1.i) obj9;
                r rVar = (r) obj8;
                q qVar = (q) obj7;
                e23.a aVar17 = (e23.a) obj6;
                x1.e eVar8 = (x1.e) obj;
                p3.m mVar15 = (p3.m) obj2;
                int iIntValue10 = ((Integer) obj3).intValue();
                if ((iIntValue10 & 6) == 0) {
                    iIntValue10 |= mVar15.B(eVar8) ? 4 : 2;
                }
                if (mVar15.n(iIntValue10 & 1, (iIntValue10 & 19) != 18)) {
                    x1 x1Var13 = p3.n.f135158a;
                    String str16 = (String) pVar3.invoke(mVar15, 0);
                    if (d53.w.J(str16)) {
                        b2.e.c("Label must not be blank");
                    }
                    iVar.f188346a.t(rVar, str16, Boolean.TRUE, eVar8, qVar, aVar17, mVar15, Integer.valueOf((iIntValue10 << 9) & 7168));
                } else {
                    mVar15.e();
                }
                return Unit.INSTANCE;
        }
    }

    public /* synthetic */ l(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, int i14) {
        this.f106589a = i14;
        this.f106590b = obj;
        this.f106591c = obj2;
        this.f106592d = obj3;
        this.f106593e = obj4;
        this.f106594f = obj5;
    }

    public /* synthetic */ l(Object obj, Object obj2, Object obj3, Object obj4, String str, int i14) {
        this.f106589a = i14;
        this.f106590b = obj;
        this.f106591c = obj2;
        this.f106592d = obj3;
        this.f106594f = obj4;
        this.f106593e = str;
    }

    public /* synthetic */ l(Object obj, Object obj2, String str, Object obj3, Object obj4, int i14) {
        this.f106589a = i14;
        this.f106590b = obj;
        this.f106591c = obj2;
        this.f106593e = str;
        this.f106592d = obj3;
        this.f106594f = obj4;
    }

    public /* synthetic */ l(b92.a aVar, String str, String str2, u4.d dVar, e23.a aVar2) {
        this.f106589a = 2;
        this.f106590b = aVar;
        this.f106593e = str;
        this.f106594f = str2;
        this.f106591c = dVar;
        this.f106592d = aVar2;
    }

    public /* synthetic */ l(String str, Object obj, Object obj2, String str2, Object obj3, int i14) {
        this.f106589a = i14;
        this.f106593e = str;
        this.f106590b = obj;
        this.f106591c = obj2;
        this.f106594f = str2;
        this.f106592d = obj3;
    }

    public /* synthetic */ l(String str, String str2, Object obj, Object obj2, Object obj3, int i14) {
        this.f106589a = i14;
        this.f106593e = str;
        this.f106594f = str2;
        this.f106590b = obj;
        this.f106591c = obj2;
        this.f106592d = obj3;
    }
}
