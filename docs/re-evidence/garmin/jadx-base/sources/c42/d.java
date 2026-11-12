package c42;

import a03.t0;
import a3.o0;
import am.c1;
import android.content.Context;
import android.os.Parcelable;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import androidx.lifecycle.u1;
import androidx.lifecycle.v1;
import b82.g1;
import b82.k1;
import b82.y0;
import c2.q2;
import c2.s2;
import c2.u2;
import c2.x2;
import c22.c3;
import c22.o;
import c22.x0;
import ca0.o1;
import ca0.u0;
import com.garmin.android.apps.connectmobile.R;
import com.garmin.android.apps.connectmobile.dashboard.presentation.DashboardRoute;
import com.garmin.android.apps.connectmobile.g3;
import com.garmin.android.apps.connectmobile.gear.presentation.GearActivity;
import com.garmin.proto.generated.GDIInReachMessaging;
import com.garmin.proto.generated.WifiSetup;
import com.google.android.exoplayer2.C;
import h2.j0;
import i3.b3;
import i3.bc;
import i3.bi;
import i3.c5;
import i3.d5;
import i3.fe;
import i3.l3;
import i3.mc;
import i3.mh;
import i3.o4;
import i3.si;
import i3.ve;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.m3;
import l72.i3;
import l72.p2;
import l72.r1;
import lc.m0;
import o4.m1;
import o72.a3;
import org.joda.time.LocalDate;
import org.joda.time.LocalTime;
import org.koin.java.KoinJavaComponent;
import org.slf4j.Marker;
import p005kotlin.Unit;
import p3.b4;
import p3.i2;
import p3.l0;
import p3.n1;
import p3.p0;
import p3.p1;
import p3.x1;
import p3.x3;
import t21.z0;
import tn2.q0;
import u1.a2;
import u21.i1;
import v62.n3;
import v62.o3;
import v62.o7;
import zd0.j1;

/* JADX INFO: loaded from: classes10.dex */
public final /* synthetic */ class d implements e23.p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f24364a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f24365b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f24366c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Object f24367d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ Object f24368e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ Object f24369f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final /* synthetic */ Object f24370g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final /* synthetic */ Object f24371h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final /* synthetic */ Object f24372i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final /* synthetic */ Object f24373j;

    public /* synthetic */ d(aa1.c cVar, p1 p1Var, e23.l lVar, p1 p1Var2, e23.l lVar2, p1 p1Var3, mc mcVar, e23.a aVar, e23.l lVar3) {
        this.f24364a = 22;
        this.f24367d = cVar;
        this.f24369f = p1Var;
        this.f24368e = lVar;
        this.f24370g = p1Var2;
        this.f24366c = lVar2;
        this.f24371h = p1Var3;
        this.f24372i = mcVar;
        this.f24365b = aVar;
        this.f24373j = lVar3;
    }

    private final Object a(Object obj, Object obj2) {
        g3 g3Var = (g3) this.f24367d;
        e23.l lVar = (e23.l) this.f24368e;
        e23.a aVar = (e23.a) this.f24365b;
        e23.a aVar2 = (e23.a) this.f24366c;
        e23.a aVar3 = (e23.a) this.f24369f;
        fe feVar = (fe) this.f24370g;
        d91.t tVar = (d91.t) this.f24371h;
        e23.q qVar = (e23.q) this.f24372i;
        j1 j1Var = (j1) this.f24373j;
        p3.m mVar = (p3.m) obj;
        int iIntValue = ((Integer) obj2).intValue();
        if (mVar.n(iIntValue & 1, (iIntValue & 3) != 2)) {
            x1 x1Var = p3.n.f135158a;
            h4.r rVarF = x2.f(a2.b(h4.r.S, a2.a(mVar), true), 1.0f);
            c2.j.f22691a.getClass();
            c2.j.k kVar = c2.j.f22694d;
            h4.d.f81522a.getClass();
            c2.z zVarA = c2.y.a(kVar, h4.d.a.f81536n, mVar, 0);
            int iHashCode = Long.hashCode(mVar.getU());
            i2 i2VarX = mVar.x();
            h4.r rVarC = h4.k.c(rVarF, mVar);
            h5.g.V.getClass();
            h5.e0.a aVar4 = h5.g.a.f81805b;
            if (mVar.F() == null) {
                p0.l();
                throw null;
            }
            mVar.z();
            if (mVar.getT()) {
                mVar.M(aVar4);
            } else {
                mVar.c();
            }
            b4.c(h5.g.a.f81810g, zVarA, mVar);
            b4.c(h5.g.a.f81809f, i2VarX, mVar);
            h5.g.a.b bVar = h5.g.a.f81813j;
            if (mVar.getT() || !p005kotlin.jvm.internal.s.g(mVar.q(), Integer.valueOf(iHashCode))) {
                v.h.z(iHashCode, mVar, iHashCode, bVar);
            }
            b4.c(h5.g.a.f81807d, rVarC, mVar);
            c2.b0 b0Var = c2.b0.f22601a;
            r1.b(gl1.y.Q(mVar, R.string.lbl_development_settings), z3.f.c(-1863540284, new hl1.j(g3Var, lVar, aVar, aVar2, aVar3, feVar), mVar), mVar, 48, 0);
            r1.b(gl1.y.Q(mVar, R.string.lbl_current_status), z3.f.c(1847665965, new hl1.j(tVar, b0Var, qVar, j1Var, g3Var, feVar, 10), mVar), mVar, 48, 0);
            mVar.y();
        } else {
            mVar.e();
        }
        return Unit.INSTANCE;
    }

    /* JADX WARN: Code duplicated, block: B:23:0x0101  */
    /* JADX WARN: Code duplicated, block: B:25:0x0108  */
    /* JADX WARN: Code duplicated, block: B:28:0x012c  */
    /* JADX WARN: Code duplicated, block: B:30:0x0133  */
    private final Object b(Object obj, Object obj2) {
        String strR;
        fe feVar;
        x3 x3Var;
        m0 m0Var;
        Context context;
        ub1.g gVar;
        c.q qVar;
        lw1.f fVar;
        Object pVar;
        int i14;
        boolean zR;
        Object objQ;
        boolean zR2;
        Object objQ2;
        fe feVar2 = (fe) this.f24367d;
        lw1.f fVar2 = (lw1.f) this.f24368e;
        x3 x3Var2 = (x3) this.f24366c;
        c.q qVar2 = (c.q) this.f24372i;
        ub1.g gVar2 = (ub1.g) this.f24369f;
        Context context2 = (Context) this.f24371h;
        m0 m0Var2 = (m0) this.f24370g;
        c.q qVar3 = (c.q) this.f24373j;
        e23.a aVar = (e23.a) this.f24365b;
        p3.m mVar = (p3.m) obj;
        int iIntValue = ((Integer) obj2).intValue();
        if (mVar.n(iIntValue & 1, (iIntValue & 3) != 2)) {
            x1 x1Var = p3.n.f135158a;
            boolean z14 = true ^ ((lw1.a) x3Var2.getF182175a()).f115075a;
            fg0.k kVar = ((lw1.a) x3Var2.getF182175a()).f115082h;
            if (kVar != null) {
                Parcelable.Creator<fg0.k> creator = fg0.k.CREATOR;
                strR = kVar.r(false);
            } else {
                strR = null;
            }
            String str = strR;
            int i15 = ((lw1.a) x3Var2.getF182175a()).f115079e;
            List<lw1.g> list = ((lw1.a) x3Var2.getF182175a()).f115080f;
            boolean z15 = ((lw1.a) x3Var2.getF182175a()).f115086l;
            boolean zR3 = mVar.r(fVar2) | mVar.B(x3Var2) | mVar.r(qVar2) | mVar.r(gVar2) | mVar.r(context2) | mVar.r(m0Var2);
            Object objQ3 = mVar.q();
            p3.m.a aVar2 = p3.m.f135153a;
            if (zR3) {
                feVar = feVar2;
            } else {
                aVar2.getClass();
                feVar = feVar2;
                if (objQ3 != p3.m.a.f135155b) {
                    pVar = objQ3;
                    i14 = i15;
                    x3Var = x3Var2;
                    m0Var = m0Var2;
                    context = context2;
                    gVar = gVar2;
                    qVar = qVar2;
                    fVar = fVar2;
                }
                e23.l lVar = (e23.l) pVar;
                zR = mVar.r(fVar) | mVar.B(x3Var) | mVar.r(qVar) | mVar.r(gVar) | mVar.r(context) | mVar.r(m0Var);
                objQ = mVar.q();
                if (zR) {
                    lw1.f fVar3 = fVar;
                    c.q qVar4 = qVar;
                    ub1.g gVar3 = gVar;
                    Context context3 = context;
                    ck0.j jVar = new ck0.j(fVar3, qVar4, gVar3, context3, m0Var, x3Var, 8);
                    context = context3;
                    mVar.K(jVar);
                    objQ = jVar;
                } else {
                    aVar2.getClass();
                    if (objQ == p3.m.a.f135155b) {
                        lw1.f fVar4 = fVar;
                        c.q qVar5 = qVar;
                        ub1.g gVar4 = gVar;
                        Context context4 = context;
                        ck0.j jVar2 = new ck0.j(fVar4, qVar5, gVar4, context4, m0Var, x3Var, 8);
                        context = context4;
                        mVar.K(jVar2);
                        objQ = jVar2;
                    }
                }
                e23.a aVar3 = (e23.a) objQ;
                zR2 = mVar.r(context) | mVar.r(qVar3);
                objQ2 = mVar.q();
                if (zR2) {
                    objQ2 = new fv0.d(context, qVar3, 6);
                    mVar.K(objQ2);
                } else {
                    aVar2.getClass();
                    if (objQ2 == p3.m.a.f135155b) {
                        objQ2 = new fv0.d(context, qVar3, 6);
                        mVar.K(objQ2);
                    }
                }
                lw1.j.c(feVar, z14, str, i14, list, z15, lVar, aVar3, (e23.a) objQ2, aVar, mVar, 6);
            }
            i14 = i15;
            x3Var = x3Var2;
            m0Var = m0Var2;
            context = context2;
            gVar = gVar2;
            qVar = qVar2;
            fVar = fVar2;
            pVar = new aa2.p(19, fVar, qVar, gVar, context, m0Var, x3Var, false);
            mVar.K(pVar);
            e23.l lVar2 = (e23.l) pVar;
            zR = mVar.r(fVar) | mVar.B(x3Var) | mVar.r(qVar) | mVar.r(gVar) | mVar.r(context) | mVar.r(m0Var);
            objQ = mVar.q();
            if (zR) {
                aVar2.getClass();
                if (objQ == p3.m.a.f135155b) {
                    lw1.f fVar5 = fVar;
                    c.q qVar6 = qVar;
                    ub1.g gVar5 = gVar;
                    Context context5 = context;
                    ck0.j jVar3 = new ck0.j(fVar5, qVar6, gVar5, context5, m0Var, x3Var, 8);
                    context = context5;
                    mVar.K(jVar3);
                    objQ = jVar3;
                }
            } else {
                lw1.f fVar6 = fVar;
                c.q qVar7 = qVar;
                ub1.g gVar6 = gVar;
                Context context6 = context;
                ck0.j jVar4 = new ck0.j(fVar6, qVar7, gVar6, context6, m0Var, x3Var, 8);
                context = context6;
                mVar.K(jVar4);
                objQ = jVar4;
            }
            e23.a aVar4 = (e23.a) objQ;
            zR2 = mVar.r(context) | mVar.r(qVar3);
            objQ2 = mVar.q();
            if (zR2) {
                aVar2.getClass();
                if (objQ2 == p3.m.a.f135155b) {
                    objQ2 = new fv0.d(context, qVar3, 6);
                    mVar.K(objQ2);
                }
            } else {
                objQ2 = new fv0.d(context, qVar3, 6);
                mVar.K(objQ2);
            }
            lw1.j.c(feVar, z14, str, i14, list, z15, lVar2, aVar4, (e23.a) objQ2, aVar, mVar, 6);
        } else {
            mVar.e();
        }
        return Unit.INSTANCE;
    }

    /* JADX WARN: Code duplicated, block: B:23:0x00d2  */
    /* JADX WARN: Code duplicated, block: B:25:0x00e2  */
    /* JADX WARN: Code duplicated, block: B:27:0x00eb  */
    /* JADX WARN: Code duplicated, block: B:29:0x0102  */
    /* JADX WARN: Code duplicated, block: B:31:0x0145  */
    /* JADX WARN: Code duplicated, block: B:33:0x014e  */
    /* JADX WARN: Code duplicated, block: B:34:0x0152  */
    /* JADX WARN: Code duplicated, block: B:39:0x016f  */
    /* JADX WARN: Code duplicated, block: B:42:0x0196  */
    /* JADX WARN: Code duplicated, block: B:43:0x01c2  */
    /* JADX WARN: Code duplicated, block: B:46:0x01cf  */
    /* JADX WARN: Code duplicated, block: B:48:0x01e6  */
    /* JADX WARN: Code duplicated, block: B:51:0x022a  */
    /* JADX WARN: Code duplicated, block: B:52:0x025d  */
    /* JADX WARN: Code duplicated, block: B:55:0x02db  */
    private final Object c(Object obj, Object obj2) {
        e23.a aVar;
        h5.g.a.f fVar;
        boolean z14;
        boolean z15;
        j92.e eVar;
        c2.z zVarA;
        int iHashCode;
        i2 i2VarX;
        h4.r rVarC;
        p2 p2Var;
        int i14;
        int i15;
        String strH;
        boolean zB;
        Object objQ;
        q21.q qVar = (q21.q) this.f24367d;
        e23.a aVar2 = (e23.a) this.f24365b;
        e23.a aVar3 = (e23.a) this.f24366c;
        e23.a aVar4 = (e23.a) this.f24368e;
        e23.a aVar5 = (e23.a) this.f24369f;
        e23.a aVar6 = (e23.a) this.f24370g;
        e23.a aVar7 = (e23.a) this.f24371h;
        e23.a aVar8 = (e23.a) this.f24372i;
        e23.l lVar = (e23.l) this.f24373j;
        p3.m mVar = (p3.m) obj;
        int iIntValue = ((Integer) obj2).intValue();
        if (mVar.n(iIntValue & 1, (iIntValue & 3) != 2)) {
            x1 x1Var = p3.n.f135158a;
            h4.r.a aVar9 = h4.r.S;
            h4.r rVarB = a2.b(x2.d(aVar9, 1.0f), a2.a(mVar), true);
            c2.j.f22691a.getClass();
            c2.j.k kVar = c2.j.f22694d;
            h4.d.f81522a.getClass();
            h4.g.a aVar10 = h4.d.a.f81536n;
            c2.z zVarA2 = c2.y.a(kVar, aVar10, mVar, 6);
            int iHashCode2 = Long.hashCode(mVar.getU());
            i2 i2VarX2 = mVar.x();
            h4.r rVarC2 = h4.k.c(rVarB, mVar);
            h5.g.V.getClass();
            h5.e0.a aVar11 = h5.g.a.f81805b;
            if (mVar.F() == null) {
                p0.l();
                throw null;
            }
            mVar.z();
            if (mVar.getT()) {
                mVar.M(aVar11);
            } else {
                mVar.c();
            }
            h5.g.a.e eVar2 = h5.g.a.f81810g;
            b4.c(eVar2, zVarA2, mVar);
            h5.g.a.C1623g c1623g = h5.g.a.f81809f;
            b4.c(c1623g, i2VarX2, mVar);
            h5.g.a.b bVar = h5.g.a.f81813j;
            if (mVar.getT()) {
                aVar = aVar7;
            } else {
                aVar = aVar7;
                if (!p005kotlin.jvm.internal.s.g(mVar.q(), Integer.valueOf(iHashCode2))) {
                }
                fVar = h5.g.a.f81807d;
                b4.c(fVar, rVarC2, mVar);
                c2.b0 b0Var = c2.b0.f22601a;
                z14 = qVar.f142284g;
                z15 = qVar.f142278a;
                if (z14) {
                    mVar.C(-30687011);
                    zB = mVar.B(aVar2);
                    objQ = mVar.q();
                    if (zB) {
                        objQ = new ov1.o(aVar2, 11);
                        mVar.K(objQ);
                    } else {
                        p3.m.f135153a.getClass();
                        if (objQ == p3.m.a.f135155b) {
                            objQ = new ov1.o(aVar2, 11);
                            mVar.K(objQ);
                        }
                    }
                    y01.s.a(null, (e23.a) objQ, mVar, 0, 1);
                    mVar.f();
                } else {
                    mVar.C(-30476180);
                    h4.r rVarF = x2.f(aVar9, 1.0f);
                    d92.b.f58623a.getClass();
                    d92.b.f58625c.getClass();
                    eVar = j92.b.f97899b;
                    h4.r rVarC3 = c2.l.C(rVarF, 0.0f, eVar.f97921f, 0.0f, 0.0f, 13);
                    zVarA = c2.y.a(kVar, aVar10, mVar, 0);
                    iHashCode = Long.hashCode(mVar.getU());
                    i2VarX = mVar.x();
                    rVarC = h4.k.c(rVarC3, mVar);
                    if (mVar.F() != null) {
                        p0.l();
                        throw null;
                    }
                    mVar.z();
                    if (mVar.getT()) {
                        mVar.M(aVar11);
                    } else {
                        mVar.c();
                    }
                    b4.c(eVar2, zVarA, mVar);
                    b4.c(c1623g, i2VarX, mVar);
                    if (mVar.getT() || !p005kotlin.jvm.internal.s.g(mVar.q(), Integer.valueOf(iHashCode))) {
                        v.h.z(iHashCode, mVar, iHashCode, bVar);
                    }
                    b4.c(fVar, rVarC, mVar);
                    p2Var = p2.f111205a;
                    i14 = 0;
                    i15 = 0;
                    p2Var.g(gl1.y.Q(mVar, R.string.nutrition_plan), null, null, null, null, false, false, aVar3, mVar, 0, 254);
                    if (z15) {
                        mVar.C(836533472);
                        p2Var.g(gl1.y.Q(mVar, R.string.meal_calorie_goals), null, null, null, null, false, false, aVar4, mVar, 0, 254);
                        mVar = mVar;
                        i14 = 0;
                        mVar.f();
                    } else {
                        mVar.C(836761229);
                        mVar.f();
                    }
                    if (qVar.f142285h) {
                        mVar.C(836875371);
                        x0.f23314a.getClass();
                        strH = gl1.d.W(x0.f23479je);
                        mVar.f();
                    } else {
                        strH = sn.a.h(mVar, 836978539, R.string.meal_windows, mVar);
                    }
                    p2Var.g(strH, null, null, null, null, false, false, aVar5, mVar, i14, 254);
                    int i16 = i14;
                    p2Var.g(gl1.y.Q(mVar, R.string.mct_reminders), null, null, null, null, false, false, aVar6, mVar, i16, 254);
                    if (z15) {
                        mVar.C(837444965);
                        r1.c(gl1.y.Q(mVar, R.string.lbl_calorie_adjustment), gl1.y.Q(mVar, R.string.lbl_help), aVar, false, null, z3.f.c(-900374426, new p21.j(qVar, lVar, i15), mVar), mVar, 196608, 24);
                        mVar.f();
                    } else {
                        mVar.C(838805741);
                        mVar.f();
                    }
                    p2Var.g(gl1.y.Q(mVar, R.string.lbl_region_and_language), c2.l.C(aVar9, 0.0f, eVar.f97920e, 0.0f, 0.0f, 13), null, null, null, false, false, aVar8, mVar, i16, 252);
                    mVar.y();
                    h4.r rVarY = c2.l.y(aVar9, eVar.f97920e);
                    String strQ = gl1.y.Q(mVar, R.string.nutrition_plan_disclaimer);
                    d92.b.f58624b.getClass();
                    mh.c(strQ, rVarY, 0L, null, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, d92.c.f(j92.f.f97933j, mVar), mVar, 0, 0, 131068);
                    mVar.f();
                }
                mVar.y();
            }
            v.h.z(iHashCode2, mVar, iHashCode2, bVar);
            fVar = h5.g.a.f81807d;
            b4.c(fVar, rVarC2, mVar);
            c2.b0 b0Var2 = c2.b0.f22601a;
            z14 = qVar.f142284g;
            z15 = qVar.f142278a;
            if (z14) {
                mVar.C(-30687011);
                zB = mVar.B(aVar2);
                objQ = mVar.q();
                if (zB) {
                    p3.m.f135153a.getClass();
                    if (objQ == p3.m.a.f135155b) {
                        objQ = new ov1.o(aVar2, 11);
                        mVar.K(objQ);
                    }
                } else {
                    objQ = new ov1.o(aVar2, 11);
                    mVar.K(objQ);
                }
                y01.s.a(null, (e23.a) objQ, mVar, 0, 1);
                mVar.f();
            } else {
                mVar.C(-30476180);
                h4.r rVarF2 = x2.f(aVar9, 1.0f);
                d92.b.f58623a.getClass();
                d92.b.f58625c.getClass();
                eVar = j92.b.f97899b;
                h4.r rVarC4 = c2.l.C(rVarF2, 0.0f, eVar.f97921f, 0.0f, 0.0f, 13);
                zVarA = c2.y.a(kVar, aVar10, mVar, 0);
                iHashCode = Long.hashCode(mVar.getU());
                i2VarX = mVar.x();
                rVarC = h4.k.c(rVarC4, mVar);
                if (mVar.F() != null) {
                    p0.l();
                    throw null;
                }
                mVar.z();
                if (mVar.getT()) {
                    mVar.M(aVar11);
                } else {
                    mVar.c();
                }
                b4.c(eVar2, zVarA, mVar);
                b4.c(c1623g, i2VarX, mVar);
                if (mVar.getT()) {
                    v.h.z(iHashCode, mVar, iHashCode, bVar);
                } else {
                    v.h.z(iHashCode, mVar, iHashCode, bVar);
                }
                b4.c(fVar, rVarC, mVar);
                p2Var = p2.f111205a;
                i14 = 0;
                i15 = 0;
                p2Var.g(gl1.y.Q(mVar, R.string.nutrition_plan), null, null, null, null, false, false, aVar3, mVar, 0, 254);
                if (z15) {
                    mVar.C(836533472);
                    p2Var.g(gl1.y.Q(mVar, R.string.meal_calorie_goals), null, null, null, null, false, false, aVar4, mVar, 0, 254);
                    mVar = mVar;
                    i14 = 0;
                    mVar.f();
                } else {
                    mVar.C(836761229);
                    mVar.f();
                }
                if (qVar.f142285h) {
                    mVar.C(836875371);
                    x0.f23314a.getClass();
                    strH = gl1.d.W(x0.f23479je);
                    mVar.f();
                } else {
                    strH = sn.a.h(mVar, 836978539, R.string.meal_windows, mVar);
                }
                p2Var.g(strH, null, null, null, null, false, false, aVar5, mVar, i14, 254);
                int i17 = i14;
                p2Var.g(gl1.y.Q(mVar, R.string.mct_reminders), null, null, null, null, false, false, aVar6, mVar, i17, 254);
                if (z15) {
                    mVar.C(837444965);
                    r1.c(gl1.y.Q(mVar, R.string.lbl_calorie_adjustment), gl1.y.Q(mVar, R.string.lbl_help), aVar, false, null, z3.f.c(-900374426, new p21.j(qVar, lVar, i15), mVar), mVar, 196608, 24);
                    mVar.f();
                } else {
                    mVar.C(838805741);
                    mVar.f();
                }
                p2Var.g(gl1.y.Q(mVar, R.string.lbl_region_and_language), c2.l.C(aVar9, 0.0f, eVar.f97920e, 0.0f, 0.0f, 13), null, null, null, false, false, aVar8, mVar, i17, 252);
                mVar.y();
                h4.r rVarY2 = c2.l.y(aVar9, eVar.f97920e);
                String strQ2 = gl1.y.Q(mVar, R.string.nutrition_plan_disclaimer);
                d92.b.f58624b.getClass();
                mh.c(strQ2, rVarY2, 0L, null, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, d92.c.f(j92.f.f97933j, mVar), mVar, 0, 0, 131068);
                mVar.f();
            }
            mVar.y();
        } else {
            mVar.e();
        }
        return Unit.INSTANCE;
    }

    /* JADX WARN: Code duplicated, block: B:14:0x006d  */
    /* JADX WARN: Code duplicated, block: B:20:0x00c0  */
    /* JADX WARN: Code duplicated, block: B:30:0x0143  */
    /* JADX WARN: Multi-variable type inference failed */
    private final Object d(Object obj, Object obj2) {
        p1 p1Var = (p1) this.f24369f;
        e23.l lVar = (e23.l) this.f24367d;
        p1 p1Var2 = (p1) this.f24370g;
        p1 p1Var3 = (p1) this.f24368e;
        p1 p1Var4 = (p1) this.f24365b;
        m4.b0 b0Var = (m4.b0) this.f24366c;
        p1 p1Var5 = (p1) this.f24371h;
        qk0.c cVar = (qk0.c) this.f24372i;
        p1 p1Var6 = (p1) this.f24373j;
        p3.m mVar = (p3.m) obj;
        int iIntValue = ((Integer) obj2).intValue();
        int i14 = 0;
        if (mVar.n(iIntValue & 1, (iIntValue & 3) != 2)) {
            x1 x1Var = p3.n.f135158a;
            boolean zBooleanValue = ((Boolean) p1Var.getF182175a()).booleanValue();
            p3.m.a aVar = p3.m.f135153a;
            if (zBooleanValue) {
                mVar.C(-2078099327);
                boolean zB = mVar.B(p1Var);
                Object objQ = mVar.q();
                if (zB) {
                    objQ = new qk0.m(p1Var, 0);
                    mVar.K(objQ);
                } else {
                    aVar.getClass();
                    if (objQ == p3.m.a.f135155b) {
                        objQ = new qk0.m(p1Var, 0);
                        mVar.K(objQ);
                    }
                }
                z02.f.f(null, (e23.a) objQ, null, z3.f.c(-1749421342, new qk0.n(b0Var, p1Var5, i14), mVar), mVar, 24576, 13);
                mVar.f();
            } else {
                mVar.C(-2077333317);
                String strP = gl1.y.P(R.string.select_data_title, new Object[]{gl1.y.Q(mVar, R.string.default_activities)}, mVar);
                boolean zB2 = mVar.B(lVar) | mVar.B(p1Var2);
                Object objQ2 = mVar.q();
                if (zB2) {
                    ok0.d dVar = new ok0.d(lVar, p1Var2, cVar, p1Var6, 8);
                    mVar.K(dVar);
                    objQ2 = dVar;
                } else {
                    aVar.getClass();
                    if (objQ2 == p3.m.a.f135155b) {
                        ok0.d dVar2 = new ok0.d(lVar, p1Var2, cVar, p1Var6, 8);
                        mVar.K(dVar2);
                        objQ2 = dVar2;
                    }
                }
                e23.a aVar2 = (e23.a) objQ2;
                s62.a.f157643a.getClass();
                t62.b bVar = t62.b.f162798a;
                i53.f fVarA = i53.a.a(new i3("SEARCH", gl1.y.Q(mVar, R.string.lbl_search), false, o7.a(bVar), gl1.y.Q(mVar, R.string.lbl_search), 4, (p005kotlin.jvm.internal.j) null), new i3("FILTER", gl1.y.Q(mVar, R.string.lbl_filter), false, ((i53.e) p1Var3.getF182175a()).isEmpty() ? n3.a(bVar) : o3.a(bVar), gl1.y.Q(mVar, R.string.lbl_filter), 4, (p005kotlin.jvm.internal.j) null));
                boolean zB3 = mVar.B(p1Var) | mVar.B(p1Var4);
                Object objQ3 = mVar.q();
                if (zB3) {
                    objQ3 = new c1(p1Var, p1Var4, 23);
                    mVar.K(objQ3);
                } else {
                    aVar.getClass();
                    if (objQ3 == p3.m.a.f135155b) {
                        objQ3 = new c1(p1Var, p1Var4, 23);
                        mVar.K(objQ3);
                    }
                }
                z02.f.d(strP, null, null, aVar2, fVarA, null, (e23.l) objQ3, mVar, GDIInReachMessaging.Capabilities.MessagingCapability.PLAN_CHANGE_VALUE, 86);
                mVar.f();
            }
        } else {
            mVar.e();
        }
        return Unit.INSTANCE;
    }

    /* JADX WARN: Code duplicated, block: B:23:0x00fe  */
    /* JADX WARN: Code duplicated, block: B:26:0x013e  */
    /* JADX WARN: Code duplicated, block: B:28:0x0147  */
    /* JADX WARN: Code duplicated, block: B:29:0x014b  */
    /* JADX WARN: Code duplicated, block: B:34:0x0168  */
    /* JADX WARN: Code duplicated, block: B:37:0x01b5  */
    /* JADX WARN: Code duplicated, block: B:38:0x01c0  */
    /* JADX WARN: Code duplicated, block: B:40:0x01c3  */
    /* JADX WARN: Code duplicated, block: B:41:0x01cd  */
    /* JADX WARN: Code duplicated, block: B:45:0x0230  */
    /* JADX WARN: Code duplicated, block: B:48:0x0242  */
    /* JADX WARN: Code duplicated, block: B:51:0x028a  */
    /* JADX WARN: Code duplicated, block: B:53:0x02ab  */
    /* JADX WARN: Code duplicated, block: B:56:0x0324  */
    /* JADX WARN: Code duplicated, block: B:59:0x0369  */
    /* JADX WARN: Code duplicated, block: B:63:0x0387  */
    /* JADX WARN: Code duplicated, block: B:65:0x03a3  */
    /* JADX WARN: Code duplicated, block: B:66:0x03ad  */
    /* JADX WARN: Multi-variable type inference failed */
    private final Object e(Object obj, Object obj2) {
        e23.l lVar;
        h5.g.a.f fVar;
        Object objQ;
        p3.m.a.C2565a c2565a;
        n1 n1Var;
        c2.z zVarA;
        int iHashCode;
        i2 i2VarX;
        h4.r rVarC;
        b63.v vVar;
        p3.m mVar;
        List<b11.i> list;
        b11.i iVarH;
        boolean zB;
        Object objQ2;
        p3.m mVar2;
        boolean zB2;
        Object objQ3;
        boolean zB3;
        Object objQ4;
        boolean zB4;
        Object objQ5;
        s11.d dVar = (s11.d) this.f24367d;
        p1 p1Var = (p1) this.f24369f;
        e23.l lVar2 = (e23.l) this.f24368e;
        e23.l lVar3 = (e23.l) this.f24365b;
        v21.e eVar = (v21.e) this.f24366c;
        e23.l lVar4 = (e23.l) this.f24370g;
        c5 c5Var = (c5) this.f24371h;
        e23.l lVar5 = (e23.l) this.f24372i;
        e23.l lVar6 = (e23.l) this.f24373j;
        p3.m mVar3 = (p3.m) obj;
        int iIntValue = ((Integer) obj2).intValue();
        if (mVar3.n(iIntValue & 1, (iIntValue & 3) != 2)) {
            x1 x1Var = p3.n.f135158a;
            h4.r.a aVar = h4.r.S;
            h4.r rVarE = u1.n.e(x2.d(aVar, 1.0f), tn.k.a(d92.b.f58623a, mVar3), m1.f128891a);
            d92.b.f58625c.getClass();
            float f14 = j92.b.f97899b.f97920e;
            h4.r rVarD = c2.l.D(c2.l.z(rVarE, f14, f14));
            c2.j.f22691a.getClass();
            c2.j.k kVar = c2.j.f22694d;
            h4.d.f81522a.getClass();
            h4.g.a aVar2 = h4.d.a.f81536n;
            c2.z zVarA2 = c2.y.a(kVar, aVar2, mVar3, 0);
            int iHashCode2 = Long.hashCode(mVar3.getU());
            i2 i2VarX2 = mVar3.x();
            h4.r rVarC2 = h4.k.c(rVarD, mVar3);
            h5.g.V.getClass();
            h5.e0.a aVar3 = h5.g.a.f81805b;
            if (mVar3.F() == null) {
                p0.l();
                throw null;
            }
            mVar3.z();
            if (mVar3.getT()) {
                mVar3.M(aVar3);
            } else {
                mVar3.c();
            }
            h5.g.a.e eVar2 = h5.g.a.f81810g;
            b4.c(eVar2, zVarA2, mVar3);
            h5.g.a.C1623g c1623g = h5.g.a.f81809f;
            b4.c(c1623g, i2VarX2, mVar3);
            h5.g.a.b bVar = h5.g.a.f81813j;
            if (mVar3.getT()) {
                lVar = lVar5;
            } else {
                lVar = lVar5;
                if (!p005kotlin.jvm.internal.s.g(mVar3.q(), Integer.valueOf(iHashCode2))) {
                }
                fVar = h5.g.a.f81807d;
                b4.c(fVar, rVarC2, mVar3);
                c2.b0 b0Var = c2.b0.f22601a;
                Object[] objArr = new Object[0];
                objQ = mVar3.q();
                p3.m.f135153a.getClass();
                c2565a = p3.m.a.f135155b;
                if (objQ == c2565a) {
                    objQ = new qy0.a(13);
                    mVar3.K(objQ);
                }
                n1Var = (n1) d4.a.e(objArr, (e23.a) objQ, mVar3, 48);
                h4.r rVarB = a2.b(b0Var.a(aVar, 1.0f, true), a2.a(mVar3), true);
                zVarA = c2.y.a(c2.j.i(f14), aVar2, mVar3, 0);
                iHashCode = Long.hashCode(mVar3.getU());
                i2VarX = mVar3.x();
                rVarC = h4.k.c(rVarB, mVar3);
                if (mVar3.F() != null) {
                    p0.l();
                    throw null;
                }
                mVar3.z();
                if (mVar3.getT()) {
                    mVar3.M(aVar3);
                } else {
                    mVar3.c();
                }
                b4.c(eVar2, zVarA, mVar3);
                b4.c(c1623g, i2VarX, mVar3);
                if (mVar3.getT() || !p005kotlin.jvm.internal.s.g(mVar3.q(), Integer.valueOf(iHashCode))) {
                    v.h.z(iHashCode, mVar3, iHashCode, bVar);
                }
                b4.c(fVar, rVarC, mVar3);
                c3 c3Var = dVar.f155897s;
                vVar = dVar.f155886h;
                String strT = gl1.d.T(c3Var, mVar3, 0);
                d92.b.f58624b.getClass();
                mh.c(strT, null, 0L, null, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, d92.c.b(j92.f.f97931h, mVar3), mVar3, 0, 0, 131070);
                mVar = mVar3;
                list = dVar.f155883e;
                if (list.size() == 1) {
                    iVarH = ((b11.i) p13.h0.b0(list)).h(vVar);
                } else {
                    iVarH = null;
                }
                if (iVarH == null) {
                    mVar.C(1788860000);
                    mVar.f();
                } else {
                    mVar.C(1788860001);
                    ve.a(x2.f(aVar, 1.0f), k2.i.a(j92.b.f97900c.f97911c), d92.b.a(mVar).c().a(), 0L, 0.0f, 0.0f, null, z3.f.c(-40939034, new r11.c(eVar, iVarH, 1), mVar), mVar, 12582918, 120);
                    mVar = mVar;
                    Unit unit = Unit.INSTANCE;
                    mVar.f();
                }
                Integer numValueOf = Integer.valueOf(n1Var.getIntValue());
                zB = mVar.B(n1Var) | mVar.r(dVar) | mVar.B(lVar3);
                objQ2 = mVar.q();
                if (zB || objQ2 == c2565a) {
                    objQ2 = new r11.i(dVar, lVar3, n1Var, null);
                    mVar.K(objQ2);
                }
                l0.e((e23.p) objQ2, numValueOf, mVar);
                if (dVar.f155892n) {
                    mVar.C(1789871190);
                    i53.f fVarA = i53.a.a(new g1(gl1.y.Q(mVar, R.string.single_date), null, null, null, 14, null), new g1(gl1.y.Q(mVar, R.string.multiple_dates), null, null, null, 14, null));
                    int intValue = n1Var.getIntValue();
                    zB4 = mVar.B(n1Var);
                    objQ5 = mVar.q();
                    if (zB4 || objQ5 == c2565a) {
                        objQ5 = new a3(n1Var, 5);
                        mVar.K(objQ5);
                    }
                    p3.m mVar4 = mVar;
                    k1.a(fVarA, intValue, null, null, 0.0f, (e23.l) objQ5, mVar4, 3072, 20);
                    mVar = mVar4;
                    mVar.f();
                } else {
                    mVar.C(1790625575);
                    mVar.f();
                }
                mVar2 = mVar;
                r1.b.a(Integer.valueOf(n1Var.getIntValue()), null, null, h4.d.a.f81525c, "DateRangePickerContent", null, z3.f.c(-1627797883, new a42.g0(dVar, eVar, lVar4, p1Var, c5Var, lVar, lVar6, lVar3), mVar), mVar2, 1600512, 38);
                mVar2.y();
                r1.b.a(Integer.valueOf(n1Var.getIntValue()), null, null, null, "TimeMealWarningContent", null, z3.f.c(157261967, new qw.b(dVar, eVar, lVar4, p1Var, 1), mVar2), mVar2, 1597440, 46);
                mVar2.y();
                if (((Boolean) p1Var.getF182175a()).booleanValue()) {
                    mVar2.C(-1386395969);
                    si siVarZ = bi.z(vVar.f16219a.getHour(), vVar.f16219a.getMinute(), false, mVar2, 0, 4);
                    String strQ = gl1.y.Q(mVar2, R.string.lbl_select_time);
                    String strQ2 = gl1.y.Q(mVar2, R.string.lbl_ok);
                    boolean zBooleanValue = ((Boolean) p1Var.getF182175a()).booleanValue();
                    String strQ3 = gl1.y.Q(mVar2, R.string.lbl_cancel);
                    zB2 = mVar2.B(p1Var);
                    objQ3 = mVar2.q();
                    if (zB2 || objQ3 == c2565a) {
                        objQ3 = new qk0.m(p1Var, 13);
                        mVar2.K(objQ3);
                    }
                    e23.a aVar4 = (e23.a) objQ3;
                    zB3 = mVar2.B(p1Var) | mVar2.B(lVar2);
                    objQ4 = mVar2.q();
                    if (zB3 || objQ4 == c2565a) {
                        objQ4 = new bt1.k(lVar2, p1Var, 10);
                        mVar2.K(objQ4);
                    }
                    g82.e.a(strQ, siVarZ, zBooleanValue, strQ3, aVar4, strQ2, (e23.p) objQ4, mVar2, 0);
                    mVar2.f();
                } else {
                    mVar2.C(-1385454189);
                    mVar2.f();
                }
            }
            v.h.z(iHashCode2, mVar3, iHashCode2, bVar);
            fVar = h5.g.a.f81807d;
            b4.c(fVar, rVarC2, mVar3);
            c2.b0 b0Var2 = c2.b0.f22601a;
            Object[] objArr2 = new Object[0];
            objQ = mVar3.q();
            p3.m.f135153a.getClass();
            c2565a = p3.m.a.f135155b;
            if (objQ == c2565a) {
                objQ = new qy0.a(13);
                mVar3.K(objQ);
            }
            n1Var = (n1) d4.a.e(objArr2, (e23.a) objQ, mVar3, 48);
            h4.r rVarB2 = a2.b(b0Var2.a(aVar, 1.0f, true), a2.a(mVar3), true);
            zVarA = c2.y.a(c2.j.i(f14), aVar2, mVar3, 0);
            iHashCode = Long.hashCode(mVar3.getU());
            i2VarX = mVar3.x();
            rVarC = h4.k.c(rVarB2, mVar3);
            if (mVar3.F() != null) {
                p0.l();
                throw null;
            }
            mVar3.z();
            if (mVar3.getT()) {
                mVar3.M(aVar3);
            } else {
                mVar3.c();
            }
            b4.c(eVar2, zVarA, mVar3);
            b4.c(c1623g, i2VarX, mVar3);
            if (mVar3.getT()) {
                v.h.z(iHashCode, mVar3, iHashCode, bVar);
            } else {
                v.h.z(iHashCode, mVar3, iHashCode, bVar);
            }
            b4.c(fVar, rVarC, mVar3);
            c3 c3Var2 = dVar.f155897s;
            vVar = dVar.f155886h;
            String strT2 = gl1.d.T(c3Var2, mVar3, 0);
            d92.b.f58624b.getClass();
            mh.c(strT2, null, 0L, null, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, d92.c.b(j92.f.f97931h, mVar3), mVar3, 0, 0, 131070);
            mVar = mVar3;
            list = dVar.f155883e;
            if (list.size() == 1) {
                iVarH = ((b11.i) p13.h0.b0(list)).h(vVar);
            } else {
                iVarH = null;
            }
            if (iVarH == null) {
                mVar.C(1788860000);
                mVar.f();
            } else {
                mVar.C(1788860001);
                ve.a(x2.f(aVar, 1.0f), k2.i.a(j92.b.f97900c.f97911c), d92.b.a(mVar).c().a(), 0L, 0.0f, 0.0f, null, z3.f.c(-40939034, new r11.c(eVar, iVarH, 1), mVar), mVar, 12582918, 120);
                mVar = mVar;
                Unit unit2 = Unit.INSTANCE;
                mVar.f();
            }
            Integer numValueOf2 = Integer.valueOf(n1Var.getIntValue());
            zB = mVar.B(n1Var) | mVar.r(dVar) | mVar.B(lVar3);
            objQ2 = mVar.q();
            if (zB) {
                objQ2 = new r11.i(dVar, lVar3, n1Var, null);
                mVar.K(objQ2);
            } else {
                objQ2 = new r11.i(dVar, lVar3, n1Var, null);
                mVar.K(objQ2);
            }
            l0.e((e23.p) objQ2, numValueOf2, mVar);
            if (dVar.f155892n) {
                mVar.C(1789871190);
                i53.f fVarA2 = i53.a.a(new g1(gl1.y.Q(mVar, R.string.single_date), null, null, null, 14, null), new g1(gl1.y.Q(mVar, R.string.multiple_dates), null, null, null, 14, null));
                int intValue2 = n1Var.getIntValue();
                zB4 = mVar.B(n1Var);
                objQ5 = mVar.q();
                if (zB4) {
                    objQ5 = new a3(n1Var, 5);
                    mVar.K(objQ5);
                } else {
                    objQ5 = new a3(n1Var, 5);
                    mVar.K(objQ5);
                }
                p3.m mVar5 = mVar;
                k1.a(fVarA2, intValue2, null, null, 0.0f, (e23.l) objQ5, mVar5, 3072, 20);
                mVar = mVar5;
                mVar.f();
            } else {
                mVar.C(1790625575);
                mVar.f();
            }
            mVar2 = mVar;
            r1.b.a(Integer.valueOf(n1Var.getIntValue()), null, null, h4.d.a.f81525c, "DateRangePickerContent", null, z3.f.c(-1627797883, new a42.g0(dVar, eVar, lVar4, p1Var, c5Var, lVar, lVar6, lVar3), mVar), mVar2, 1600512, 38);
            mVar2.y();
            r1.b.a(Integer.valueOf(n1Var.getIntValue()), null, null, null, "TimeMealWarningContent", null, z3.f.c(157261967, new qw.b(dVar, eVar, lVar4, p1Var, 1), mVar2), mVar2, 1597440, 46);
            mVar2.y();
            if (((Boolean) p1Var.getF182175a()).booleanValue()) {
                mVar2.C(-1386395969);
                si siVarZ2 = bi.z(vVar.f16219a.getHour(), vVar.f16219a.getMinute(), false, mVar2, 0, 4);
                String strQ4 = gl1.y.Q(mVar2, R.string.lbl_select_time);
                String strQ5 = gl1.y.Q(mVar2, R.string.lbl_ok);
                boolean zBooleanValue2 = ((Boolean) p1Var.getF182175a()).booleanValue();
                String strQ6 = gl1.y.Q(mVar2, R.string.lbl_cancel);
                zB2 = mVar2.B(p1Var);
                objQ3 = mVar2.q();
                if (zB2) {
                    objQ3 = new qk0.m(p1Var, 13);
                    mVar2.K(objQ3);
                } else {
                    objQ3 = new qk0.m(p1Var, 13);
                    mVar2.K(objQ3);
                }
                e23.a aVar5 = (e23.a) objQ3;
                zB3 = mVar2.B(p1Var) | mVar2.B(lVar2);
                objQ4 = mVar2.q();
                if (zB3) {
                    objQ4 = new bt1.k(lVar2, p1Var, 10);
                    mVar2.K(objQ4);
                } else {
                    objQ4 = new bt1.k(lVar2, p1Var, 10);
                    mVar2.K(objQ4);
                }
                g82.e.a(strQ4, siVarZ2, zBooleanValue2, strQ6, aVar5, strQ5, (e23.p) objQ4, mVar2, 0);
                mVar2.f();
            } else {
                mVar2.C(-1385454189);
                mVar2.f();
            }
        } else {
            mVar3.e();
        }
        return Unit.INSTANCE;
    }

    /* JADX WARN: Code duplicated, block: B:25:0x00fb  */
    /* JADX WARN: Code duplicated, block: B:30:0x0148  */
    /* JADX WARN: Code duplicated, block: B:35:0x018c  */
    /* JADX WARN: Code duplicated, block: B:42:0x01dc  */
    /* JADX WARN: Code duplicated, block: B:47:0x01f9  */
    /* JADX WARN: Code duplicated, block: B:56:0x0246  */
    /* JADX WARN: Code duplicated, block: B:61:0x0263  */
    /* JADX WARN: Code duplicated, block: B:70:0x02dc  */
    /* JADX WARN: Code duplicated, block: B:75:0x02fd  */
    /* JADX WARN: Multi-variable type inference failed */
    private final Object f(Object obj, Object obj2) {
        char c14;
        final r42.d dVar = (r42.d) this.f24367d;
        p1 p1Var = (p1) this.f24369f;
        p1 p1Var2 = (p1) this.f24370g;
        p1 p1Var3 = (p1) this.f24368e;
        Context context = (Context) this.f24371h;
        x3 x3Var = (x3) this.f24365b;
        x3 x3Var2 = (x3) this.f24366c;
        q42.h hVar = (q42.h) this.f24372i;
        x3 x3Var3 = (x3) this.f24373j;
        p3.m mVar = (p3.m) obj;
        int iIntValue = ((Integer) obj2).intValue();
        if (mVar.n(iIntValue & 1, (iIntValue & 3) != 2)) {
            x1 x1Var = p3.n.f135158a;
            h4.r.a aVar = h4.r.S;
            d92.b.f58623a.getClass();
            d92.b.f58625c.getClass();
            h4.r rVarC = c2.l.C(aVar, 0.0f, j92.b.f97899b.f97922g, 0.0f, 0.0f, 13);
            c2.j.f22691a.getClass();
            c2.j.k kVar = c2.j.f22694d;
            h4.d.f81522a.getClass();
            c2.z zVarA = c2.y.a(kVar, h4.d.a.f81536n, mVar, 0);
            int iHashCode = Long.hashCode(mVar.getU());
            i2 i2VarX = mVar.x();
            h4.r rVarC2 = h4.k.c(rVarC, mVar);
            h5.g.V.getClass();
            h5.e0.a aVar2 = h5.g.a.f81805b;
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
            b4.c(h5.g.a.f81810g, zVarA, mVar);
            b4.c(h5.g.a.f81809f, i2VarX, mVar);
            h5.g.a.b bVar = h5.g.a.f81813j;
            if (mVar.getT() || !p005kotlin.jvm.internal.s.g(mVar.q(), Integer.valueOf(iHashCode))) {
                v.h.z(iHashCode, mVar, iHashCode, bVar);
            }
            b4.c(h5.g.a.f81807d, rVarC2, mVar);
            c2.b0 b0Var = c2.b0.f22601a;
            p2 p2Var = p2.f111205a;
            String strQ = gl1.y.Q(mVar, R.string.lbl_weight);
            z3.e eVarC = z3.f.c(935457971, new q42.c(context, x3Var, 1), mVar);
            boolean zB = mVar.B(p1Var);
            Object objQ = mVar.q();
            p3.m.a aVar3 = p3.m.f135153a;
            if (zB) {
                c14 = 23;
                objQ = new qk0.m(p1Var, 23);
                mVar.K(objQ);
            } else {
                aVar3.getClass();
                if (objQ == p3.m.a.f135155b) {
                    c14 = 23;
                    objQ = new qk0.m(p1Var, 23);
                    mVar.K(objQ);
                } else {
                    c14 = 23;
                }
            }
            p2Var.g(strQ, null, null, null, eVarC, false, false, (e23.a) objQ, mVar, 24576, 238);
            String strQ2 = gl1.y.Q(mVar, R.string.txt_date);
            z3.e eVarC2 = z3.f.c(-947444516, new q42.c(context, x3Var2, 2), mVar);
            boolean zB2 = mVar.B(p1Var2);
            Object objQ2 = mVar.q();
            if (zB2) {
                objQ2 = new qk0.m(p1Var2, 18);
                mVar.K(objQ2);
            } else {
                aVar3.getClass();
                if (objQ2 == p3.m.a.f135155b) {
                    objQ2 = new qk0.m(p1Var2, 18);
                    mVar.K(objQ2);
                }
            }
            p2Var.g(strQ2, null, null, null, eVarC2, false, false, (e23.a) objQ2, mVar, 24576, 238);
            String strQ3 = gl1.y.Q(mVar, R.string.lbl_time);
            z3.e eVarC3 = z3.f.c(-697343237, new q72.f(22, hVar, x3Var3), mVar);
            boolean zB3 = mVar.B(p1Var3);
            Object objQ3 = mVar.q();
            if (zB3) {
                objQ3 = new qk0.m(p1Var3, 19);
                mVar.K(objQ3);
            } else {
                aVar3.getClass();
                if (objQ3 == p3.m.a.f135155b) {
                    objQ3 = new qk0.m(p1Var3, 19);
                    mVar.K(objQ3);
                }
            }
            p2Var.g(strQ3, null, null, null, eVarC3, false, false, (e23.a) objQ3, mVar, 24576, 238);
            p3.m mVar2 = mVar;
            mVar2.y();
            if (((Boolean) p1Var.getF182175a()).booleanValue()) {
                mVar2.C(-46521871);
                double dDoubleValue = ((Number) x3Var.getF182175a()).doubleValue();
                int i14 = dVar.f150328f;
                boolean zB4 = mVar2.B(p1Var);
                Object objQ4 = mVar2.q();
                if (zB4) {
                    objQ4 = new qk0.m(p1Var, 20);
                    mVar2.K(objQ4);
                } else {
                    aVar3.getClass();
                    if (objQ4 == p3.m.a.f135155b) {
                        objQ4 = new qk0.m(p1Var, 20);
                        mVar2.K(objQ4);
                    }
                }
                e23.a aVar4 = (e23.a) objQ4;
                boolean zR = mVar2.r(dVar);
                Object objQ5 = mVar2.q();
                if (zR) {
                    final int i15 = 0;
                    objQ5 = new e23.l() { // from class: r42.a
                        @Override // e23.l
                        public final Object invoke(Object obj3) {
                            Object value;
                            switch (i15) {
                                case 0:
                                    Double d14 = (Double) obj3;
                                    d14.getClass();
                                    dVar.f150329g.k(null, d14);
                                    break;
                                default:
                                    Long l14 = (Long) obj3;
                                    if (l14 != null) {
                                        long jLongValue = l14.longValue();
                                        d dVar2 = dVar;
                                        dVar2.getClass();
                                        LocalDate localDate = new LocalDate(jLongValue);
                                        r53.p2 p2Var2 = dVar2.f150324b;
                                        do {
                                            value = p2Var2.getValue();
                                        } while (!p2Var2.b(value, localDate));
                                        dVar2.x4();
                                    }
                                    break;
                            }
                            return Unit.INSTANCE;
                        }
                    };
                    mVar2.K(objQ5);
                } else {
                    aVar3.getClass();
                    if (objQ5 == p3.m.a.f135155b) {
                        final int i16 = 0;
                        objQ5 = new e23.l() { // from class: r42.a
                            @Override // e23.l
                            public final Object invoke(Object obj3) {
                                Object value;
                                switch (i16) {
                                    case 0:
                                        Double d14 = (Double) obj3;
                                        d14.getClass();
                                        dVar.f150329g.k(null, d14);
                                        break;
                                    default:
                                        Long l14 = (Long) obj3;
                                        if (l14 != null) {
                                            long jLongValue = l14.longValue();
                                            d dVar2 = dVar;
                                            dVar2.getClass();
                                            LocalDate localDate = new LocalDate(jLongValue);
                                            r53.p2 p2Var2 = dVar2.f150324b;
                                            do {
                                                value = p2Var2.getValue();
                                            } while (!p2Var2.b(value, localDate));
                                            dVar2.x4();
                                        }
                                        break;
                                }
                                return Unit.INSTANCE;
                            }
                        };
                        mVar2.K(objQ5);
                    }
                }
                u42.b.a(dDoubleValue, i14, aVar4, (e23.l) objQ5, mVar2, 0);
                mVar2 = mVar2;
                mVar2.f();
            } else {
                mVar2.C(-46247986);
                mVar2.f();
            }
            if (((Boolean) p1Var2.getF182175a()).booleanValue()) {
                mVar2.C(-46208275);
                LocalDate localDate = (LocalDate) x3Var2.getF182175a();
                localDate.getClass();
                boolean zB5 = mVar2.B(p1Var2);
                Object objQ6 = mVar2.q();
                if (zB5) {
                    objQ6 = new qk0.m(p1Var2, 21);
                    mVar2.K(objQ6);
                } else {
                    aVar3.getClass();
                    if (objQ6 == p3.m.a.f135155b) {
                        objQ6 = new qk0.m(p1Var2, 21);
                        mVar2.K(objQ6);
                    }
                }
                e23.a aVar5 = (e23.a) objQ6;
                boolean zR2 = mVar2.r(dVar);
                Object objQ7 = mVar2.q();
                if (zR2) {
                    final int i17 = 1;
                    objQ7 = new e23.l() { // from class: r42.a
                        @Override // e23.l
                        public final Object invoke(Object obj3) {
                            Object value;
                            switch (i17) {
                                case 0:
                                    Double d14 = (Double) obj3;
                                    d14.getClass();
                                    dVar.f150329g.k(null, d14);
                                    break;
                                default:
                                    Long l14 = (Long) obj3;
                                    if (l14 != null) {
                                        long jLongValue = l14.longValue();
                                        d dVar2 = dVar;
                                        dVar2.getClass();
                                        LocalDate localDate2 = new LocalDate(jLongValue);
                                        r53.p2 p2Var2 = dVar2.f150324b;
                                        do {
                                            value = p2Var2.getValue();
                                        } while (!p2Var2.b(value, localDate2));
                                        dVar2.x4();
                                    }
                                    break;
                            }
                            return Unit.INSTANCE;
                        }
                    };
                    mVar2.K(objQ7);
                } else {
                    aVar3.getClass();
                    if (objQ7 == p3.m.a.f135155b) {
                        final int i18 = 1;
                        objQ7 = new e23.l() { // from class: r42.a
                            @Override // e23.l
                            public final Object invoke(Object obj3) {
                                Object value;
                                switch (i18) {
                                    case 0:
                                        Double d14 = (Double) obj3;
                                        d14.getClass();
                                        dVar.f150329g.k(null, d14);
                                        break;
                                    default:
                                        Long l14 = (Long) obj3;
                                        if (l14 != null) {
                                            long jLongValue = l14.longValue();
                                            d dVar2 = dVar;
                                            dVar2.getClass();
                                            LocalDate localDate2 = new LocalDate(jLongValue);
                                            r53.p2 p2Var2 = dVar2.f150324b;
                                            do {
                                                value = p2Var2.getValue();
                                            } while (!p2Var2.b(value, localDate2));
                                            dVar2.x4();
                                        }
                                        break;
                                }
                                return Unit.INSTANCE;
                            }
                        };
                        mVar2.K(objQ7);
                    }
                }
                t42.b.a(localDate, aVar5, (e23.l) objQ7, mVar2, 0);
                mVar2.f();
            } else {
                mVar2.C(-45899794);
                mVar2.f();
            }
            if (((Boolean) p1Var3.getF182175a()).booleanValue()) {
                mVar2.C(-45845761);
                si siVarZ = bi.z(((LocalTime) x3Var3.getF182175a()).getHourOfDay(), ((LocalTime) x3Var3.getF182175a()).getMinuteOfHour(), false, mVar2, 0, 4);
                String strQ4 = gl1.y.Q(mVar2, R.string.lbl_empty_string);
                String strQ5 = gl1.y.Q(mVar2, R.string.lbl_ok);
                boolean zBooleanValue = ((Boolean) p1Var3.getF182175a()).booleanValue();
                String strQ6 = gl1.y.Q(mVar2, R.string.lbl_cancel);
                boolean zB6 = mVar2.B(p1Var3);
                Object objQ8 = mVar2.q();
                if (zB6) {
                    objQ8 = new qk0.m(p1Var3, 22);
                    mVar2.K(objQ8);
                } else {
                    aVar3.getClass();
                    if (objQ8 == p3.m.a.f135155b) {
                        objQ8 = new qk0.m(p1Var3, 22);
                        mVar2.K(objQ8);
                    }
                }
                e23.a aVar6 = (e23.a) objQ8;
                boolean zB7 = mVar2.B(p1Var3) | mVar2.r(dVar);
                Object objQ9 = mVar2.q();
                if (zB7) {
                    objQ9 = new q72.f(23, dVar, p1Var3);
                    mVar2.K(objQ9);
                } else {
                    aVar3.getClass();
                    if (objQ9 == p3.m.a.f135155b) {
                        objQ9 = new q72.f(23, dVar, p1Var3);
                        mVar2.K(objQ9);
                    }
                }
                p3.m mVar3 = mVar2;
                g82.e.a(strQ4, siVarZ, zBooleanValue, strQ6, aVar6, strQ5, (e23.p) objQ9, mVar3, 0);
                mVar3.f();
            } else {
                mVar2.C(-45093298);
                mVar2.f();
            }
        } else {
            mVar.e();
        }
        return Unit.INSTANCE;
    }

    private final Object g(Object obj, Object obj2) {
        e23.a aVar = (e23.a) this.f24365b;
        e23.l lVar = (e23.l) this.f24367d;
        sy.k kVar = (sy.k) this.f24368e;
        i53.f fVar = (i53.f) this.f24366c;
        n82.f fVar2 = (n82.f) this.f24369f;
        b63.o oVar = (b63.o) this.f24370g;
        b63.o oVar2 = (b63.o) this.f24371h;
        yd1.a aVar2 = (yd1.a) this.f24372i;
        sy.a aVar3 = (sy.a) this.f24373j;
        p3.m mVar = (p3.m) obj;
        int iIntValue = ((Integer) obj2).intValue();
        if (mVar.n(iIntValue & 1, (iIntValue & 3) != 2)) {
            x1 x1Var = p3.n.f135158a;
            z02.d.a(false, z3.f.c(-922578325, new sy.g(aVar, lVar, kVar), mVar), null, null, null, z3.f.c(-1613273881, new r11.k(fVar, fVar2, oVar, oVar2, aVar2, kVar, aVar3), mVar), mVar, 196656, 29);
        } else {
            mVar.e();
        }
        return Unit.INSTANCE;
    }

    private final Object h(Object obj, Object obj2) {
        p3.m mVar;
        Integer num;
        Integer num2;
        h4.r.a aVar;
        Integer num3;
        h4.r.a aVar2;
        String strW;
        String strW2;
        u21.g gVar = (u21.g) this.f24367d;
        e23.l lVar = (e23.l) this.f24368e;
        e23.a aVar3 = (e23.a) this.f24365b;
        v21.e eVar = (v21.e) this.f24369f;
        e23.l lVar2 = (e23.l) this.f24370g;
        final m4.q qVar = (m4.q) this.f24371h;
        final m3 m3Var = (m3) this.f24372i;
        e23.l lVar3 = (e23.l) this.f24373j;
        e23.a<Unit> aVar4 = (e23.a) this.f24366c;
        p3.m mVar2 = (p3.m) obj;
        int iIntValue = ((Integer) obj2).intValue();
        if (mVar2.n(iIntValue & 1, (iIntValue & 3) != 2)) {
            x1 x1Var = p3.n.f135158a;
            h4.r.a aVar5 = h4.r.S;
            h4.r rVarC = wz1.i.c(c2.l.D(x2.f(aVar5, 1.0f)), mVar2);
            c2.j.f22691a.getClass();
            c2.j.k kVar = c2.j.f22694d;
            h4.d.f81522a.getClass();
            c2.z zVarA = c2.y.a(kVar, h4.d.a.f81536n, mVar2, 0);
            int iHashCode = Long.hashCode(mVar2.getU());
            i2 i2VarX = mVar2.x();
            h4.r rVarC2 = h4.k.c(rVarC, mVar2);
            h5.g.V.getClass();
            h5.e0.a aVar6 = h5.g.a.f81805b;
            if (mVar2.F() == null) {
                p0.l();
                throw null;
            }
            mVar2.z();
            if (mVar2.getT()) {
                mVar2.M(aVar6);
            } else {
                mVar2.c();
            }
            b4.c(h5.g.a.f81810g, zVarA, mVar2);
            b4.c(h5.g.a.f81809f, i2VarX, mVar2);
            h5.g.a.b bVar = h5.g.a.f81813j;
            if (mVar2.getT() || !p005kotlin.jvm.internal.s.g(mVar2.q(), Integer.valueOf(iHashCode))) {
                v.h.z(iHashCode, mVar2, iHashCode, bVar);
            }
            b4.c(h5.g.a.f81807d, rVarC2, mVar2);
            c2.b0 b0Var = c2.b0.f22601a;
            boolean z14 = gVar.f167965e;
            boolean z15 = gVar.f167963c;
            String str = gVar.f167962b;
            Integer num4 = gVar.f167968h;
            Integer num5 = gVar.f167967g;
            i1 i1Var = gVar.f167969i;
            if (z14) {
                mVar2.C(-1345320054);
                h4.r rVarF = x2.f(aVar5, 1.0f);
                d92.b.f58623a.getClass();
                d92.b.f58625c.getClass();
                j92.e eVar2 = j92.b.f97899b;
                h4.r rVarY = c2.l.y(rVarF, eVar2.f97920e);
                String strQ = gl1.y.Q(mVar2, R.string.required_field_star);
                d6.h.f57752b.getClass();
                int i14 = d6.h.f57757g;
                d92.b.f58624b.getClass();
                mh.c(strQ, rVarY, 0L, null, 0L, null, 0L, d6.h.a(i14), 0L, 0, false, 0, 0, null, d92.c.b(j92.f.f97932i, mVar2), mVar2, 0, 0, 130044);
                mVar = mVar2;
                Object objQ = mVar.q();
                p3.m.f135153a.getClass();
                p3.m.a.C2565a c2565a = p3.m.a.f135155b;
                if (objQ == c2565a) {
                    objQ = p0.n(Boolean.FALSE);
                    mVar.K(objQ);
                }
                p1 p1Var = (p1) objQ;
                String strG = tn.k.g(gl1.y.Q(mVar, R.string.meal_name), Marker.ANY_MARKER);
                l22.a aVarS = w2.a0.s(mVar);
                b11.c.f14245d.getClass();
                String strB = b11.c.a.b(str, aVarS, z15);
                boolean z16 = gVar.f167966f != null;
                x5.v.f188954b.getClass();
                int i15 = x5.v.f188955c;
                Object objQ2 = mVar.q();
                if (objQ2 == c2565a) {
                    objQ2 = new sk0.r1(27);
                    mVar.K(objQ2);
                }
                e23.l lVar4 = (e23.l) objQ2;
                boolean zB = mVar.B(lVar);
                Object objQ3 = mVar.q();
                if (zB || objQ3 == c2565a) {
                    objQ3 = new qe2.c(lVar, 28);
                    mVar.K(objQ3);
                }
                e23.l lVar5 = (e23.l) objQ3;
                boolean zB2 = mVar.B(aVar3);
                Object objQ4 = mVar.q();
                if (zB2 || objQ4 == c2565a) {
                    objQ4 = new t21.o(aVar3, p1Var, 0);
                    mVar.K(objQ4);
                }
                y01.y.a(null, strG, strB, 75, z16, lVar4, lVar5, (e23.l) objQ4, i15, 0, z3.f.c(-1409380583, new t21.l(1, gVar, p1Var), mVar), mVar, 12779520, 3078, 6169);
                if (i1Var != null) {
                    mVar.C(-1342960272);
                    c2.l.f(x2.h(aVar5, eVar2.f97920e), mVar);
                    boolean z17 = i1Var.f168007b;
                    b63.v vVar = i1Var.f168009d;
                    b63.v vVar2 = i1Var.f168006a;
                    boolean z18 = gVar.f167961a;
                    String strG2 = tn.k.g(gl1.y.Q(mVar, R.string.lbl_start_time), Marker.ANY_MARKER);
                    if (vVar2 != null) {
                        mVar.C(-1342535696);
                        mVar.f();
                        pi0.e eVar3 = eVar.f175326c;
                        qi0.f fVar = qi0.f.RELATIVE_24H_AM_PM_TIME;
                        eVar3.getClass();
                        fVar.getClass();
                        java.time.LocalTime localTime = vVar2.f16219a;
                        strW = eVar3.e(new LocalTime(localTime.getHour(), localTime.getMinute(), localTime.getSecond()), fVar);
                    } else {
                        mVar.C(-1342412254);
                        x0.f23314a.getClass();
                        strW = gl1.d.W(x0.Yd);
                        mVar.f();
                    }
                    String str2 = strW;
                    String strQ2 = gl1.y.Q(mVar, R.string.lbl_start_time);
                    b63.v vVarF = vVar2 == 0 ? g22.l.f(b63.v.INSTANCE) : vVar2;
                    b63.v vVar3 = i1Var.f168008c;
                    boolean zR = mVar.r(qVar) | mVar.B(m3Var);
                    Object objQ5 = mVar.q();
                    if (zR || objQ5 == c2565a) {
                        final int i16 = 0;
                        objQ5 = new e23.a() { // from class: t21.p
                            @Override // e23.a
                            public final Object invoke() {
                                switch (i16) {
                                    case 0:
                                        qVar.y(false);
                                        m3 m3Var2 = m3Var;
                                        if (m3Var2 != null) {
                                            m3Var2.hide();
                                        }
                                        break;
                                    default:
                                        qVar.y(false);
                                        m3 m3Var3 = m3Var;
                                        if (m3Var3 != null) {
                                            m3Var3.hide();
                                        }
                                        break;
                                }
                                return Unit.INSTANCE;
                            }
                        };
                        mVar.K(objQ5);
                    }
                    aVar2 = aVar5;
                    num2 = num5;
                    num = num4;
                    b63.v vVarF2 = vVar;
                    a11.d0.a(z18, strG2, str2, z17, null, vVarF, strQ2, null, vVar3, null, null, lVar2, null, (e23.a) objQ5, mVar, 0, 0, 5776);
                    boolean z19 = i1Var.f168010e;
                    boolean z24 = gVar.f167961a;
                    String strG3 = tn.k.g(gl1.y.Q(mVar, R.string.pregnancy_end_time), Marker.ANY_MARKER);
                    if (vVarF2 != null) {
                        mVar.C(-1341548718);
                        mVar.f();
                        pi0.e eVar4 = eVar.f175326c;
                        qi0.f fVar2 = qi0.f.RELATIVE_24H_AM_PM_TIME;
                        eVar4.getClass();
                        fVar2.getClass();
                        java.time.LocalTime localTime2 = vVarF2.f16219a;
                        strW2 = eVar4.e(new LocalTime(localTime2.getHour(), localTime2.getMinute(), localTime2.getSecond()), fVar2);
                    } else {
                        mVar.C(-1341427260);
                        x0.f23314a.getClass();
                        strW2 = gl1.d.W(x0.Xd);
                        mVar.f();
                    }
                    String str3 = strW2;
                    String strQ3 = gl1.y.Q(mVar, R.string.pregnancy_end_time);
                    if (vVarF2 == null) {
                        vVarF2 = g22.l.f(b63.v.INSTANCE);
                    }
                    b63.v vVar4 = vVarF2;
                    b63.v vVar5 = i1Var.f168011f;
                    b63.v vVar6 = i1Var.f168012g;
                    boolean zR2 = mVar.r(qVar) | mVar.B(m3Var);
                    Object objQ6 = mVar.q();
                    if (zR2 || objQ6 == c2565a) {
                        final int i17 = 1;
                        objQ6 = new e23.a() { // from class: t21.p
                            @Override // e23.a
                            public final Object invoke() {
                                switch (i17) {
                                    case 0:
                                        qVar.y(false);
                                        m3 m3Var2 = m3Var;
                                        if (m3Var2 != null) {
                                            m3Var2.hide();
                                        }
                                        break;
                                    default:
                                        qVar.y(false);
                                        m3 m3Var3 = m3Var;
                                        if (m3Var3 != null) {
                                            m3Var3.hide();
                                        }
                                        break;
                                }
                                return Unit.INSTANCE;
                            }
                        };
                        mVar.K(objQ6);
                    }
                    a11.d0.a(z24, strG3, str3, z19, null, vVar4, strQ3, vVar5, vVar6, null, null, lVar3, null, (e23.a) objQ6, mVar, 0, 0, 5648);
                    mVar = mVar;
                    mVar.f();
                } else {
                    aVar2 = aVar5;
                    num = num4;
                    num2 = num5;
                    mVar.C(-1340816281);
                    mVar.f();
                }
                mVar.f();
                aVar = aVar2;
            } else {
                mVar = mVar2;
                num = num4;
                num2 = num5;
                mVar.C(-1340767518);
                aVar = aVar5;
                h4.r rVarF2 = x2.f(aVar, 1.0f);
                d92.b.f58623a.getClass();
                d92.b.f58625c.getClass();
                j92.e eVar5 = j92.b.f97899b;
                h4.r rVarC3 = c2.l.C(c2.l.A(rVarF2, eVar5.f97920e, 0.0f, 2), 0.0f, eVar5.f97920e, 0.0f, 0.0f, 13);
                l22.a aVarS2 = w2.a0.s(mVar);
                b11.c.f14245d.getClass();
                String strB2 = b11.c.a.b(str, aVarS2, z15);
                d92.b.f58624b.getClass();
                mh.c(strB2, rVarC3, 0L, null, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, d92.c.b(j92.f.f97931h, mVar), mVar, 0, 0, 131068);
                if (gVar.f167964d) {
                    mVar.C(-1340304347);
                    h4.r rVarC4 = c2.l.C(c2.l.A(x2.f(aVar, 1.0f), eVar5.f97920e, 0.0f, 2), 0.0f, eVar5.f97918c, 0.0f, 0.0f, 13);
                    x0.f23314a.getClass();
                    mh.c(gl1.d.W(x0.f23630se), rVarC4, 0L, null, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, d92.c.f(j92.f.f97933j, mVar), mVar, 0, 0, 131068);
                    mVar.f();
                } else {
                    mVar.C(-1339884793);
                    mVar.f();
                }
                mVar.f();
            }
            if (num2 == null || (num3 = num) == null) {
                mVar.C(-1339198329);
                mVar.f();
            } else {
                mVar.C(-1339760514);
                d92.b.f58623a.getClass();
                d92.b.f58625c.getClass();
                c2.l.f(x2.h(aVar, j92.b.f97899b.f97920e), mVar);
                p2.f111205a.h(gl1.y.Q(mVar, R.string.meal_calorie_goals), eVar.p(Double.valueOf(num2.intValue()), num3, gl1.y.Q(mVar, R.string.lbl_calories)), null, null, null, false, false, null, null, null, aVar4, mVar, 0, 0, 1020);
                mVar.f();
            }
            mVar.y();
        } else {
            mVar2.e();
        }
        return Unit.INSTANCE;
    }

    private final Object i(Object obj, Object obj2) {
        ((Integer) obj2).getClass();
        t21.p0.d((u21.a0) this.f24367d, (v21.e) this.f24368e, (e23.p) this.f24369f, (e23.l) this.f24370g, (e23.a) this.f24365b, (e23.a) this.f24366c, (e23.a) this.f24371h, (e23.a) this.f24372i, (e23.a) this.f24373j, (p3.m) obj, p0.t(1));
        return Unit.INSTANCE;
    }

    private final Object j(Object obj, Object obj2) {
        ((Integer) obj2).getClass();
        t21.p0.a((e23.a) this.f24365b, (e23.a) this.f24366c, (u21.a0) this.f24367d, (l22.a) this.f24368e, (v21.e) this.f24369f, (e23.p) this.f24370g, (e23.l) this.f24371h, (m4.q) this.f24372i, (m3) this.f24373j, (p3.m) obj, p0.t(1));
        return Unit.INSTANCE;
    }

    private final Object k(Object obj, Object obj2) {
        ((Integer) obj2).getClass();
        z0.b((s21.s) this.f24367d, (s21.x) this.f24368e, (v21.e) this.f24369f, (e23.l) this.f24370g, (e23.a) this.f24365b, (e23.a) this.f24366c, (e23.a) this.f24371h, (e23.a) this.f24372i, (e23.a) this.f24373j, (p3.m) obj, p0.t(1));
        return Unit.INSTANCE;
    }

    private final Object l(Object obj, Object obj2) {
        ((Integer) obj2).getClass();
        ta0.w.a((ta0.x) this.f24367d, (l90.d) this.f24368e, (o1) this.f24369f, (e23.l) this.f24370g, (e23.a) this.f24365b, (e23.a) this.f24366c, (e23.a) this.f24371h, (u0) this.f24372i, (e23.l) this.f24373j, (p3.m) obj, p0.t(1));
        return Unit.INSTANCE;
    }

    private final Object n(Object obj, Object obj2) {
        ((Integer) obj2).getClass();
        uj1.z.d((yj1.o) this.f24367d, (e23.a) this.f24365b, (e23.a) this.f24366c, (e23.a) this.f24368e, (e23.a) this.f24369f, (e23.a) this.f24370g, (e23.l) this.f24371h, (e23.l) this.f24372i, (e23.l) this.f24373j, (p3.m) obj, p0.t(1));
        return Unit.INSTANCE;
    }

    private final Object o(Object obj, Object obj2) {
        ((Integer) obj2).getClass();
        v70.c.a((DashboardRoute) this.f24367d, (com.garmin.android.apps.connectmobile.dashboard.presentation.d) this.f24368e, (r70.z) this.f24366c, (t70.q) this.f24369f, (u70.i) this.f24370g, (n70.g) this.f24371h, (e23.l) this.f24372i, (e23.a) this.f24365b, (e23.l) this.f24373j, (p3.m) obj, p0.t(100663297));
        return Unit.INSTANCE;
    }

    /* JADX WARN: Code duplicated, block: B:12:0x008c  */
    /* JADX WARN: Code duplicated, block: B:19:0x00dd  */
    /* JADX WARN: Multi-variable type inference failed */
    private final Object q(Object obj, Object obj2) {
        aa1.c cVar = (aa1.c) this.f24367d;
        p1 p1Var = (p1) this.f24369f;
        e23.l lVar = (e23.l) this.f24368e;
        p1 p1Var2 = (p1) this.f24370g;
        e23.l lVar2 = (e23.l) this.f24366c;
        p1 p1Var3 = (p1) this.f24371h;
        mc mcVar = (mc) this.f24372i;
        e23.a aVar = (e23.a) this.f24365b;
        e23.l lVar3 = (e23.l) this.f24373j;
        p3.m mVar = (p3.m) obj;
        int iIntValue = ((Integer) obj2).intValue();
        if (mVar.n(iIntValue & 1, (iIntValue & 3) != 2)) {
            x1 x1Var = p3.n.f135158a;
            h4.r rVarE = u1.n.e(x2.d(h4.r.S, 1.0f), tn.k.a(d92.b.f58623a, mVar), m1.f128891a);
            boolean zR = mVar.r(cVar) | mVar.B(p1Var) | mVar.B(lVar) | mVar.B(p1Var2) | mVar.B(lVar2) | mVar.B(p1Var3);
            Object objQ = mVar.q();
            p3.m.a aVar2 = p3.m.f135153a;
            if (zR) {
                q0 q0Var = new q0(cVar, p1Var, lVar, lVar2, p1Var2, p1Var3);
                mVar.K(q0Var);
                objQ = q0Var;
            } else {
                aVar2.getClass();
                if (objQ == p3.m.a.f135155b) {
                    q0 q0Var2 = new q0(cVar, p1Var, lVar, lVar2, p1Var2, p1Var3);
                    mVar.K(q0Var2);
                    objQ = q0Var2;
                }
            }
            e2.c.b(rVarE, null, null, null, null, null, false, null, (e23.l) objQ, mVar, 0, 510);
            if (((Boolean) p1Var3.getF182175a()).booleanValue()) {
                mVar.C(-1149039722);
                i53.c<q91.b> cVar2 = cVar.f2245m;
                q91.b bVar = cVar.f2244l;
                boolean zB = mVar.B(lVar3) | mVar.B(aVar);
                Object objQ2 = mVar.q();
                if (zB) {
                    objQ2 = new et1.g1(10, aVar, lVar3);
                    mVar.K(objQ2);
                } else {
                    aVar2.getClass();
                    if (objQ2 == p3.m.a.f135155b) {
                        objQ2 = new et1.g1(10, aVar, lVar3);
                        mVar.K(objQ2);
                    }
                }
                t91.c.b(mcVar, cVar2, null, bVar, aVar, (e23.l) objQ2, mVar, 0);
                mVar.f();
            } else {
                mVar.C(-1148565949);
                mVar.f();
            }
        } else {
            mVar.e();
        }
        return Unit.INSTANCE;
    }

    private final Object r(Object obj, Object obj2) {
        p3.m mVar;
        aa1.h hVar = (aa1.h) this.f24367d;
        e23.l lVar = (e23.l) this.f24368e;
        e23.a aVar = (e23.a) this.f24365b;
        j0 j0Var = (j0) this.f24369f;
        e23.a aVar2 = (e23.a) this.f24366c;
        e23.l lVar2 = (e23.l) this.f24370g;
        e23.l lVar3 = (e23.l) this.f24371h;
        e23.p pVar = (e23.p) this.f24372i;
        e23.q qVar = (e23.q) this.f24373j;
        p3.m mVar2 = (p3.m) obj;
        int iIntValue = ((Integer) obj2).intValue();
        if (mVar2.n(iIntValue & 1, (iIntValue & 3) != 2)) {
            x1 x1Var = p3.n.f135158a;
            h4.r.a aVar3 = h4.r.S;
            h4.r rVarE = u1.n.e(x2.d(aVar3, 1.0f), tn.k.a(d92.b.f58623a, mVar2), m1.f128891a);
            c2.j.f22691a.getClass();
            c2.j.k kVar = c2.j.f22694d;
            h4.d.f81522a.getClass();
            c2.z zVarA = c2.y.a(kVar, h4.d.a.f81536n, mVar2, 0);
            int iHashCode = Long.hashCode(mVar2.getU());
            i2 i2VarX = mVar2.x();
            h4.r rVarC = h4.k.c(rVarE, mVar2);
            h5.g.V.getClass();
            h5.e0.a aVar4 = h5.g.a.f81805b;
            if (mVar2.F() == null) {
                p0.l();
                throw null;
            }
            mVar2.z();
            if (mVar2.getT()) {
                mVar2.M(aVar4);
            } else {
                mVar2.c();
            }
            b4.c(h5.g.a.f81810g, zVarA, mVar2);
            b4.c(h5.g.a.f81809f, i2VarX, mVar2);
            h5.g.a.b bVar = h5.g.a.f81813j;
            if (mVar2.getT() || !p005kotlin.jvm.internal.s.g(mVar2.q(), Integer.valueOf(iHashCode))) {
                v.h.z(iHashCode, mVar2, iHashCode, bVar);
            }
            b4.c(h5.g.a.f81807d, rVarC, mVar2);
            c2.b0 b0Var = c2.b0.f22601a;
            if (hVar.f2294f.isEmpty()) {
                mVar = mVar2;
                mVar.C(1432595551);
                mVar.f();
            } else {
                mVar2.C(1430529401);
                x91.s.d(j0Var, hVar, mVar2, 0);
                h2.u.a(j0Var, x2.d(aVar3, 1.0f), null, null, 2, 0.0f, null, null, false, null, null, null, null, z3.f.c(-463200953, new aa2.q(hVar, aVar2, lVar2, lVar3, pVar, qVar), mVar2), mVar2, 100687920, 24576, 16108);
                mVar = mVar2;
                mVar.f();
            }
            mVar.y();
            if (hVar.f2292d) {
                mVar.C(115501673);
                oi0.c.e(hVar.f2293e, lVar, aVar, mVar, 0);
                mVar.f();
            } else {
                mVar.C(115778441);
                mVar.f();
            }
        } else {
            mVar2.e();
        }
        return Unit.INSTANCE;
    }

    /* JADX WARN: Code duplicated, block: B:127:0x0428  */
    /* JADX WARN: Code duplicated, block: B:14:0x0083  */
    /* JADX WARN: Code duplicated, block: B:19:0x00cd  */
    /* JADX WARN: Code duplicated, block: B:289:0x0b36  */
    /* JADX WARN: Code duplicated, block: B:315:0x0b99  */
    /* JADX WARN: Code duplicated, block: B:322:0x0bc9  */
    /* JADX WARN: Code duplicated, block: B:347:0x0cc3  */
    /* JADX WARN: Code duplicated, block: B:34:0x013f  */
    /* JADX WARN: Code duplicated, block: B:352:0x0ce4  */
    /* JADX WARN: Code duplicated, block: B:361:0x0d28  */
    /* JADX WARN: Code duplicated, block: B:366:0x0d49  */
    /* JADX WARN: Code duplicated, block: B:51:0x01b2  */
    /* JADX WARN: Code duplicated, block: B:58:0x01fa  */
    /* JADX WARN: Code duplicated, block: B:65:0x0265  */
    /* JADX WARN: Code duplicated, block: B:72:0x02dd  */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // e23.p
    public final Object invoke(Object obj, Object obj2) {
        final int i14;
        i53.c cVarB;
        int i15 = this.f24364a;
        p3.m.a aVar = p3.m.f135153a;
        Object obj3 = this.f24368e;
        final int i16 = 0;
        Object obj4 = this.f24373j;
        Object obj5 = this.f24369f;
        Object obj6 = this.f24372i;
        Object obj7 = this.f24370g;
        Object obj8 = this.f24371h;
        Object obj9 = this.f24366c;
        Object obj10 = this.f24365b;
        Object obj11 = this.f24367d;
        final int i17 = 1;
        switch (i15) {
            case 0:
                String str = (String) obj11;
                e23.a aVar2 = (e23.a) obj10;
                p1 p1Var = (p1) obj5;
                Context context = (Context) obj8;
                c.q qVar = (c.q) obj6;
                e23.a aVar3 = (e23.a) obj9;
                p1 p1Var2 = (p1) obj7;
                String str2 = (String) obj3;
                ug2.x xVar = (ug2.x) obj4;
                p3.m mVar = (p3.m) obj;
                int iIntValue = ((Integer) obj2).intValue();
                if (mVar.n(iIntValue & 1, (iIntValue & 3) != 2)) {
                    x1 x1Var = p3.n.f135158a;
                    String strG = tn.k.g(str, "/images/feature/live-activity/test_onboarding.png");
                    x0.f23314a.getClass();
                    y0.c(strG, null, gl1.d.W(x0.f23594qb), null, gl1.y.Q(mVar, R.string.lbl_start), aVar2, z3.f.c(11569833, new t0(29, str2, xVar), mVar), mVar, 1572864, 10);
                    if (((Boolean) p1Var.getF182175a()).booleanValue()) {
                        mVar.C(827876612);
                        boolean zB = mVar.B(p1Var) | mVar.r(context) | mVar.r(qVar);
                        Object objQ = mVar.q();
                        if (zB) {
                            objQ = new f(qVar, p1Var, context, 0);
                            mVar.K(objQ);
                        } else {
                            aVar.getClass();
                            if (objQ == p3.m.a.f135155b) {
                                objQ = new f(qVar, p1Var, context, 0);
                                mVar.K(objQ);
                            }
                        }
                        e23.a aVar4 = (e23.a) objQ;
                        boolean zB2 = mVar.B(p1Var) | mVar.B(aVar3);
                        Object objQ2 = mVar.q();
                        if (zB2) {
                            objQ2 = new a11.a0(aVar3, p1Var, 2);
                            mVar.K(objQ2);
                        } else {
                            aVar.getClass();
                            if (objQ2 == p3.m.a.f135155b) {
                                objQ2 = new a11.a0(aVar3, p1Var, 2);
                                mVar.K(objQ2);
                            }
                        }
                        h.c(aVar4, (e23.a) objQ2, mVar, 0);
                        mVar.f();
                    } else {
                        mVar.C(828483964);
                        mVar.f();
                    }
                    if (((Boolean) p1Var2.getF182175a()).booleanValue()) {
                        mVar.C(828541934);
                        boolean zB3 = mVar.B(p1Var2) | mVar.r(qVar);
                        Object objQ3 = mVar.q();
                        if (zB3) {
                            objQ3 = new g(qVar, p1Var2, 0);
                            mVar.K(objQ3);
                        } else {
                            aVar.getClass();
                            if (objQ3 == p3.m.a.f135155b) {
                                objQ3 = new g(qVar, p1Var2, 0);
                                mVar.K(objQ3);
                            }
                        }
                        e23.a aVar5 = (e23.a) objQ3;
                        boolean zB4 = mVar.B(p1Var2) | mVar.B(aVar3);
                        Object objQ4 = mVar.q();
                        if (zB4) {
                            objQ4 = new a11.a0(aVar3, p1Var2, 3);
                            mVar.K(objQ4);
                        } else {
                            aVar.getClass();
                            if (objQ4 == p3.m.a.f135155b) {
                                objQ4 = new a11.a0(aVar3, p1Var2, 3);
                                mVar.K(objQ4);
                            }
                        }
                        h.d(aVar5, (e23.a) objQ4, mVar, 0);
                        mVar.f();
                    } else {
                        mVar.C(828985916);
                        mVar.f();
                    }
                } else {
                    mVar.e();
                }
                return Unit.INSTANCE;
            case 1:
                ((Integer) obj2).getClass();
                ca0.x1.a((o1) obj11, (l90.d) obj3, (q90.d.a) obj5, (e23.a) obj10, (e23.a) obj9, (e23.a) obj7, (e23.p) obj8, (e23.l) obj6, (e23.p) obj4, (p3.m) obj, p0.t(1));
                return Unit.INSTANCE;
            case 2:
                Double d14 = (Double) obj3;
                ab1.g gVar = (ab1.g) obj10;
                e23.l lVar = (e23.l) obj9;
                e23.l lVar2 = (e23.l) obj5;
                e23.p pVar = (e23.p) obj7;
                String str3 = (String) obj11;
                e23.l lVar3 = (e23.l) obj8;
                final w01.c cVar = (w01.c) obj6;
                final e23.l lVar4 = (e23.l) obj4;
                p3.m mVar2 = (p3.m) obj;
                int iIntValue2 = ((Integer) obj2).intValue();
                if (mVar2.n(iIntValue2 & 1, (iIntValue2 & 3) != 2)) {
                    x1 x1Var2 = p3.n.f135158a;
                    h4.r.a aVar6 = h4.r.S;
                    c2.j.f22691a.getClass();
                    c2.j.k kVar = c2.j.f22694d;
                    h4.d.f81522a.getClass();
                    c2.z zVarA = c2.y.a(kVar, h4.d.a.f81536n, mVar2, 0);
                    int iHashCode = Long.hashCode(mVar2.getU());
                    i2 i2VarX = mVar2.x();
                    h4.r rVarC = h4.k.c(aVar6, mVar2);
                    h5.g.V.getClass();
                    h5.e0.a aVar7 = h5.g.a.f81805b;
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
                    b4.c(h5.g.a.f81810g, zVarA, mVar2);
                    b4.c(h5.g.a.f81809f, i2VarX, mVar2);
                    h5.g.a.b bVar = h5.g.a.f81813j;
                    if (mVar2.getT() || !p005kotlin.jvm.internal.s.g(mVar2.q(), Integer.valueOf(iHashCode))) {
                        v.h.z(iHashCode, mVar2, iHashCode, bVar);
                    }
                    b4.c(h5.g.a.f81807d, rVarC, mVar2);
                    c2.b0 b0Var = c2.b0.f22601a;
                    if (sa1.h.e(d14.doubleValue())) {
                        mVar2.C(787351183);
                        bb1.f.a(48, 5, null, null, mVar2, false);
                        mVar2.f();
                    } else {
                        mVar2.C(787518304);
                        if (gVar != null) {
                            mVar2.C(787524907);
                            Context context2 = (Context) mVar2.A(AndroidCompositionLocals_androidKt.f6042b);
                            context2.getClass();
                            Float f14 = gVar.f2579l;
                            float fFloatValue = f14 != null ? f14.floatValue() : 0.0f;
                            Float f15 = gVar.f2580m;
                            j23.e eVar = new j23.e(fFloatValue, f15 != null ? f15.floatValue() : 0.0f);
                            String string = context2.getString(R.string.power_guide_estimated_time_lbl, sa1.h.b(context2, eVar));
                            string.getClass();
                            Long l14 = gVar.f2568a;
                            long jLongValue = l14 != null ? l14.longValue() : 0L;
                            Long l15 = gVar.f2570c;
                            long jLongValue2 = l15 != null ? l15.longValue() : 0L;
                            String str4 = gVar.f2569b;
                            if (str4 == null) {
                                str4 = "";
                            }
                            bb1.f.b(new bb1.g(jLongValue, jLongValue2, str4, sa1.h.a(context2, eVar), string), lVar, lVar2, pVar, mVar2, 0);
                            mVar2.f();
                        } else {
                            mVar2.C(787978282);
                            boolean zB5 = mVar2.B(lVar3);
                            Object objQ5 = mVar2.q();
                            if (zB5) {
                                objQ5 = new ci0.f(lVar3, 7);
                                mVar2.K(objQ5);
                            } else {
                                aVar.getClass();
                                if (objQ5 == p3.m.a.f135155b) {
                                    objQ5 = new ci0.f(lVar3, 7);
                                    mVar2.K(objQ5);
                                }
                            }
                            bb1.f.a(0, 2, (e23.l) objQ5, str3, mVar2, false);
                            mVar2.f();
                        }
                        boolean z14 = cVar != null && cVar.f181037j;
                        if ((cVar != null ? cVar.f181036i : null) == null && cVar != null) {
                            cVar.f181036i = z14 ? a01.a.CUSTOM : a01.a.TODAY;
                        }
                        w01.d dVarR = cVar != null ? dh.b.R(cVar) : null;
                        if (dVarR != null) {
                            mVar2.C(788717725);
                            boolean zB6 = mVar2.B(lVar4) | mVar2.r(cVar);
                            Object objQ6 = mVar2.q();
                            if (zB6) {
                                i14 = 0;
                                objQ6 = new e23.a() { // from class: d50.l
                                    @Override // e23.a
                                    public final Object invoke() {
                                        switch (i14) {
                                            case 0:
                                                lVar4.invoke(cVar);
                                                break;
                                            default:
                                                lVar4.invoke(cVar);
                                                break;
                                        }
                                        return Unit.INSTANCE;
                                    }
                                };
                                mVar2.K(objQ6);
                            } else {
                                aVar.getClass();
                                if (objQ6 == p3.m.a.f135155b) {
                                    i14 = 0;
                                    objQ6 = new e23.a() { // from class: d50.l
                                        @Override // e23.a
                                        public final Object invoke() {
                                            switch (i14) {
                                                case 0:
                                                    lVar4.invoke(cVar);
                                                    break;
                                                default:
                                                    lVar4.invoke(cVar);
                                                    break;
                                            }
                                            return Unit.INSTANCE;
                                        }
                                    };
                                    mVar2.K(objQ6);
                                } else {
                                    i14 = 0;
                                }
                            }
                            z21.f.c(dVarR, (e23.a) objQ6, mVar2, i14);
                            mVar2.f();
                        } else if (z14) {
                            mVar2.C(789083897);
                            boolean zB7 = mVar2.B(lVar4) | mVar2.r(cVar);
                            Object objQ7 = mVar2.q();
                            if (zB7) {
                                final int i18 = 1;
                                objQ7 = new e23.a() { // from class: d50.l
                                    @Override // e23.a
                                    public final Object invoke() {
                                        switch (i18) {
                                            case 0:
                                                lVar4.invoke(cVar);
                                                break;
                                            default:
                                                lVar4.invoke(cVar);
                                                break;
                                        }
                                        return Unit.INSTANCE;
                                    }
                                };
                                mVar2.K(objQ7);
                            } else {
                                aVar.getClass();
                                if (objQ7 == p3.m.a.f135155b) {
                                    final int i19 = 1;
                                    objQ7 = new e23.a() { // from class: d50.l
                                        @Override // e23.a
                                        public final Object invoke() {
                                            switch (i19) {
                                                case 0:
                                                    lVar4.invoke(cVar);
                                                    break;
                                                default:
                                                    lVar4.invoke(cVar);
                                                    break;
                                            }
                                            return Unit.INSTANCE;
                                        }
                                    };
                                    mVar2.K(objQ7);
                                }
                            }
                            z21.f.d((e23.a) objQ7, mVar2, 0);
                            mVar2.f();
                        } else {
                            mVar2.C(789306167);
                            z21.f.b(false, mVar2, 6);
                            mVar2.f();
                        }
                        mVar2.f();
                    }
                    mVar2.y();
                } else {
                    mVar2.e();
                }
                return Unit.INSTANCE;
            case 3:
                ((Integer) obj2).getClass();
                dj0.m.a((u82.d) obj11, (u82.d) obj3, (yi0.c) obj5, (yi0.b) obj7, (e23.l) obj8, (e23.l) obj6, (e23.a) obj10, (e23.l) obj4, (e23.a) obj9, (p3.m) obj, p0.t(1));
                return Unit.INSTANCE;
            case 4:
                o70.n nVar = (o70.n) obj9;
                String str5 = (String) obj11;
                String str6 = (String) obj3;
                i53.c cVar2 = (i53.c) obj5;
                i53.c cVar3 = (i53.c) obj7;
                String str7 = (String) obj8;
                String str8 = (String) obj6;
                String str9 = (String) obj4;
                e23.a aVar8 = (e23.a) obj10;
                p3.m mVar3 = (p3.m) obj;
                int iIntValue3 = ((Integer) obj2).intValue();
                if (mVar3.n(iIntValue3 & 1, (iIntValue3 & 3) != 2)) {
                    x1 x1Var3 = p3.n.f135158a;
                    if (nVar == o70.n.VALID_DATA) {
                        mVar3.C(1402544110);
                        h4.r.a aVar9 = h4.r.S;
                        boolean zB8 = mVar3.B(str5);
                        Object objQ8 = mVar3.q();
                        if (zB8) {
                            objQ8 = new gp.j(str5, 1);
                            mVar3.K(objQ8);
                        } else {
                            aVar.getClass();
                            if (objQ8 == p3.m.a.f135155b) {
                                objQ8 = new gp.j(str5, 1);
                                mVar3.K(objQ8);
                            }
                        }
                        h4.r rVarC2 = p5.v.c((e23.l) objQ8, aVar9, false);
                        c2.j.f22691a.getClass();
                        c2.j.k kVar2 = c2.j.f22694d;
                        h4.d.f81522a.getClass();
                        h4.g.a aVar10 = h4.d.a.f81536n;
                        c2.z zVarA2 = c2.y.a(kVar2, aVar10, mVar3, 0);
                        int iHashCode2 = Long.hashCode(mVar3.getU());
                        i2 i2VarX2 = mVar3.x();
                        h4.r rVarC3 = h4.k.c(rVarC2, mVar3);
                        h5.g.V.getClass();
                        h5.e0.a aVar11 = h5.g.a.f81805b;
                        if (mVar3.F() == null) {
                            p0.l();
                            throw null;
                        }
                        mVar3.z();
                        if (mVar3.getT()) {
                            mVar3.M(aVar11);
                        } else {
                            mVar3.c();
                        }
                        h5.g.a.e eVar2 = h5.g.a.f81810g;
                        b4.c(eVar2, zVarA2, mVar3);
                        h5.g.a.C1623g c1623g = h5.g.a.f81809f;
                        b4.c(c1623g, i2VarX2, mVar3);
                        h5.g.a.b bVar2 = h5.g.a.f81813j;
                        if (mVar3.getT() || !p005kotlin.jvm.internal.s.g(mVar3.q(), Integer.valueOf(iHashCode2))) {
                            v.h.z(iHashCode2, mVar3, iHashCode2, bVar2);
                        }
                        h5.g.a.f fVar = h5.g.a.f81807d;
                        b4.c(fVar, rVarC3, mVar3);
                        c2.b0 b0Var2 = c2.b0.f22601a;
                        d92.b.f58623a.getClass();
                        d92.b.f58625c.getClass();
                        j92.e eVar3 = j92.b.f97899b;
                        float f16 = eVar3.f97920e;
                        float f17 = eVar3.f97918c;
                        c2.l.f(x2.h(aVar9, f16), mVar3);
                        s2 s2VarA = q2.a(c2.j.i(f16), h4.d.a.f81533k, mVar3, 48);
                        int iHashCode3 = Long.hashCode(mVar3.getU());
                        i2 i2VarX3 = mVar3.x();
                        h4.r rVarC4 = h4.k.c(aVar9, mVar3);
                        if (mVar3.F() == null) {
                            p0.l();
                            throw null;
                        }
                        mVar3.z();
                        if (mVar3.getT()) {
                            mVar3.M(aVar11);
                        } else {
                            mVar3.c();
                        }
                        b4.c(eVar2, s2VarA, mVar3);
                        b4.c(c1623g, i2VarX3, mVar3);
                        if (mVar3.getT() || !p005kotlin.jvm.internal.s.g(mVar3.q(), Integer.valueOf(iHashCode3))) {
                            v.h.z(iHashCode3, mVar3, iHashCode3, bVar2);
                        }
                        b4.c(fVar, rVarC4, mVar3);
                        u2 u2Var = u2.f22900a;
                        d92.b.f58624b.getClass();
                        g02.c.a(str6, u2Var.a(aVar9, 0.44f, true), 0L, null, 0, false, 1, d92.c.b(j92.f.f97929f, mVar3), 0.0d, mVar3, 1572864, 316);
                        mVar3.C(2118917038);
                        o13.p pVar2 = cVar2 != null ? (o13.p) p13.h0.e0(0, cVar2) : null;
                        h4.r rVarA = u2Var.a(aVar9, 0.28f, true);
                        c2.z zVarA3 = c2.y.a(kVar2, aVar10, mVar3, 0);
                        int iHashCode4 = Long.hashCode(mVar3.getU());
                        i2 i2VarX4 = mVar3.x();
                        h4.r rVarC5 = h4.k.c(rVarA, mVar3);
                        if (mVar3.F() == null) {
                            p0.l();
                            throw null;
                        }
                        mVar3.z();
                        if (mVar3.getT()) {
                            mVar3.M(aVar11);
                        } else {
                            mVar3.c();
                        }
                        b4.c(eVar2, zVarA3, mVar3);
                        b4.c(c1623g, i2VarX4, mVar3);
                        if (mVar3.getT() || !p005kotlin.jvm.internal.s.g(mVar3.q(), Integer.valueOf(iHashCode4))) {
                            v.h.z(iHashCode4, mVar3, iHashCode4, bVar2);
                        }
                        b4.c(fVar, rVarC5, mVar3);
                        if (pVar2 == null) {
                            mVar3.C(-870446993);
                            mVar3.f();
                        } else {
                            mVar3.C(-870446992);
                            g02.c.a((String) pVar2.f128594a, null, 0L, null, 0, false, 1, d92.c.b(j92.f.f97931h, mVar3), 0.0d, mVar3, 1572864, 318);
                            g02.c.a((String) pVar2.f128595b, null, 0L, null, 0, false, 1, d92.c.f(j92.f.f97933j, mVar3), 0.0d, mVar3, 1572864, 318);
                            Unit unit = Unit.INSTANCE;
                            mVar3.f();
                        }
                        mVar3.y();
                        Unit unit2 = Unit.INSTANCE;
                        mVar3.f();
                        mVar3.C(2118945123);
                        o13.p pVar3 = cVar2 != null ? (o13.p) p13.h0.e0(1, cVar2) : null;
                        h4.r rVarC6 = c2.l.C(u2Var.a(aVar9, 0.28f, true), 0.0f, 0.0f, eVar3.f97918c, 0.0f, 11);
                        c2.z zVarA4 = c2.y.a(kVar2, aVar10, mVar3, 0);
                        int iHashCode5 = Long.hashCode(mVar3.getU());
                        i2 i2VarX5 = mVar3.x();
                        h4.r rVarC7 = h4.k.c(rVarC6, mVar3);
                        if (mVar3.F() == null) {
                            p0.l();
                            throw null;
                        }
                        mVar3.z();
                        if (mVar3.getT()) {
                            mVar3.M(aVar11);
                        } else {
                            mVar3.c();
                        }
                        b4.c(eVar2, zVarA4, mVar3);
                        b4.c(c1623g, i2VarX5, mVar3);
                        if (mVar3.getT() || !p005kotlin.jvm.internal.s.g(mVar3.q(), Integer.valueOf(iHashCode5))) {
                            v.h.z(iHashCode5, mVar3, iHashCode5, bVar2);
                        }
                        b4.c(fVar, rVarC7, mVar3);
                        if (pVar3 == null) {
                            mVar3.C(-1697267998);
                            mVar3.f();
                        } else {
                            mVar3.C(-1697267997);
                            mh.c((String) pVar3.f128594a, null, 0L, null, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, d92.c.b(j92.f.f97931h, mVar3), mVar3, 0, 0, 131070);
                            mh.c((String) pVar3.f128595b, null, 0L, null, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, d92.c.f(j92.f.f97933j, mVar3), mVar3, 0, 0, 131070);
                            mVar3.f();
                        }
                        mVar3.y();
                        mVar3.f();
                        mVar3.y();
                        c2.l.f(x2.h(aVar9, f16), mVar3);
                        h4.r rVarA2 = b0Var2.a(x2.f(aVar9, 1.0f), 1.0f, true);
                        f5.z0 z0VarD = c2.q.d(h4.d.a.f81524b, false);
                        int iHashCode6 = Long.hashCode(mVar3.getU());
                        i2 i2VarX6 = mVar3.x();
                        h4.r rVarC8 = h4.k.c(rVarA2, mVar3);
                        if (mVar3.F() == null) {
                            p0.l();
                            throw null;
                        }
                        mVar3.z();
                        if (mVar3.getT()) {
                            mVar3.M(aVar11);
                        } else {
                            mVar3.c();
                        }
                        b4.c(eVar2, z0VarD, mVar3);
                        b4.c(c1623g, i2VarX6, mVar3);
                        if (mVar3.getT() || !p005kotlin.jvm.internal.s.g(mVar3.q(), Integer.valueOf(iHashCode6))) {
                            v.h.z(iHashCode6, mVar3, iHashCode6, bVar2);
                        }
                        b4.c(fVar, rVarC8, mVar3);
                        c2.u uVar = c2.u.f22885a;
                        h4.r rVarC9 = c2.l.C(x2.d(aVar9, 1.0f), 0.0f, 0.0f, 0.0f, eVar3.f97917b, 7);
                        float f18 = 64;
                        g6.f.a aVar12 = g6.f.f75994b;
                        long jI = fb1.c.i(gl.c.f77766a, mVar3);
                        if (cVar3 == null || (cVarB = c02.a.g(cVar3)) == null) {
                            cVarB = j53.l.b();
                        }
                        m92.d.b(rVarC9, f18, jI, cVarB, Float.valueOf(e32.o.f62807j.f62819a), gl1.y.Q(mVar3, R.string.common_no_data), mVar3, 0);
                        mVar3.y();
                        c2.l.f(x2.h(aVar9, f17), mVar3);
                        h4.r rVarA3 = c2.l.A(x2.f(aVar9, 1.0f), f17, 0.0f, 2);
                        j53.j jVarB = j53.l.b();
                        LocalDate localDateNow = LocalDate.now();
                        localDateNow.getClass();
                        c02.c cVarC = c02.n.c(localDateNow);
                        LocalDate localDateNow2 = LocalDate.now();
                        localDateNow2.getClass();
                        c02.n.a(rVarA3, jVarB, cVarC, null, c02.n.b(c02.n.c(localDateNow2)), 0, null, false, mVar3, 12586032, 96);
                        c2.l.f(x2.h(aVar9, f16), mVar3);
                        mVar3.y();
                        mVar3.f();
                    } else {
                        mVar3.C(1406587471);
                        h4.r.a aVar13 = h4.r.S;
                        h4.r rVarD = x2.d(aVar13, 1.0f);
                        d92.b.f58623a.getClass();
                        d92.b.f58625c.getClass();
                        j92.e eVar4 = j92.b.f97899b;
                        h4.r rVarA4 = c2.l.A(rVarD, eVar4.f97920e, 0.0f, 2);
                        h4.d.f81522a.getClass();
                        h4.g.a aVar14 = h4.d.a.f81537o;
                        c2.j.f22691a.getClass();
                        c2.z zVarA5 = c2.y.a(c2.j.f22696f, aVar14, mVar3, 54);
                        int iHashCode7 = Long.hashCode(mVar3.getU());
                        i2 i2VarX7 = mVar3.x();
                        h4.r rVarC10 = h4.k.c(rVarA4, mVar3);
                        h5.g.V.getClass();
                        h5.e0.a aVar15 = h5.g.a.f81805b;
                        if (mVar3.F() == null) {
                            p0.l();
                            throw null;
                        }
                        mVar3.z();
                        if (mVar3.getT()) {
                            mVar3.M(aVar15);
                        } else {
                            mVar3.c();
                        }
                        b4.c(h5.g.a.f81810g, zVarA5, mVar3);
                        b4.c(h5.g.a.f81809f, i2VarX7, mVar3);
                        h5.g.a.b bVar3 = h5.g.a.f81813j;
                        if (mVar3.getT() || !p005kotlin.jvm.internal.s.g(mVar3.q(), Integer.valueOf(iHashCode7))) {
                            v.h.z(iHashCode7, mVar3, iHashCode7, bVar3);
                        }
                        b4.c(h5.g.a.f81807d, rVarC10, mVar3);
                        c2.b0 b0Var3 = c2.b0.f22601a;
                        d92.b.f58624b.getClass();
                        s5.x0 x0VarB = d92.c.b(d92.c.e(j92.f.f97930g), mVar3);
                        d6.h.f57752b.getClass();
                        int i24 = d6.h.f57755e;
                        mh.c(str7, null, 0L, null, 0L, null, 0L, d6.h.a(i24), 0L, 0, false, 0, 0, null, x0VarB, mVar3, 0, 0, 130046);
                        mh.c(str8, c2.l.C(aVar13, 0.0f, eVar4.f97918c, 0.0f, eVar4.f97920e, 5), 0L, null, 0L, null, 0L, d6.h.a(i24), 0L, 0, false, 0, 0, null, d92.c.b(j92.f.f97932i, mVar3), mVar3, 0, 0, 130044);
                        if (str9 == null) {
                            mVar3.C(-86819166);
                            mVar3.f();
                        } else {
                            mVar3.C(-86819165);
                            a3.o oVar = a3.o.f757a;
                            long jA = d92.b.a(mVar3).d().a().a();
                            oVar.getClass();
                            if ((14 & 1) != 0) {
                                o0.f762a.getClass();
                                jA = o0.a(mVar3).a();
                            }
                            long jA2 = a3.u.a(jA, mVar3);
                            o0 o0Var = o0.f762a;
                            o0Var.getClass();
                            long jG = o4.f0.g(o4.d0.c(0.12f, ((o4.d0) o0.a(mVar3).f830k.getF182175a()).f128833a, 14), o0.a(mVar3).b());
                            o0Var.getClass();
                            long j8 = ((o4.d0) o0.a(mVar3).f830k.getF182175a()).f128833a;
                            a3.v.f860a.getClass();
                            long jC = o4.d0.c(a3.v.b(mVar3, 6), j8, 14);
                            x1 x1Var4 = p3.n.f135158a;
                            a3.s.a(aVar8, null, false, null, null, new a3.y(jA, jA2, jG, jC, null), null, z3.f.c(1350334849, new as.s(str9, 21), mVar3), mVar3, C.ENCODING_PCM_32BIT, 382);
                            Unit unit3 = Unit.INSTANCE;
                            mVar3.f();
                        }
                        mVar3.y();
                        mVar3.f();
                    }
                } else {
                    mVar3.e();
                }
                return Unit.INSTANCE;
            case 5:
                ((Integer) obj2).getClass();
                o4.a((Long) obj11, (Long) obj3, (e23.p) obj10, (l3.e0) obj9, (j23.l) obj5, (l3) obj7, (bc) obj8, (b3) obj6, (m4.b0) obj4, (p3.m) obj, p0.t(1));
                return Unit.INSTANCE;
            case 6:
                return a(obj, obj2);
            case 7:
                return b(obj, obj2);
            case 8:
                return c(obj, obj2);
            case 9:
                return d(obj, obj2);
            case 10:
                return e(obj, obj2);
            case 11:
                return f(obj, obj2);
            case 12:
                ((Integer) obj2).getClass();
                sa0.m.c((String) obj11, (WifiSetup.SecurityType) obj5, (String) obj3, (sa0.n.b) obj7, (sa0.n) obj8, (e23.a) obj10, (e23.a) obj9, (e23.a) obj6, (e23.a) obj4, (p3.m) obj, p0.t(1));
                return Unit.INSTANCE;
            case 13:
                ((Integer) obj2).getClass();
                sk0.g.c((sk0.l0) obj11, (ArrayList) obj3, (sk0.p0) obj9, (e23.l) obj5, (e23.l) obj7, (e23.p) obj8, (e23.l) obj6, (e23.a) obj10, (GearActivity.w) obj4, (p3.m) obj, p0.t(1));
                return Unit.INSTANCE;
            case 14:
                return g(obj, obj2);
            case 15:
                return h(obj, obj2);
            case 16:
                return i(obj, obj2);
            case 17:
                return j(obj, obj2);
            case 18:
                return k(obj, obj2);
            case 19:
                return l(obj, obj2);
            case 20:
                return n(obj, obj2);
            case 21:
                return o(obj, obj2);
            case 22:
                return q(obj, obj2);
            case 23:
                return r(obj, obj2);
            default:
                final yj0.f fVar2 = (yj0.f) obj11;
                final x3 x3Var = (x3) obj10;
                final x3 x3Var2 = (x3) obj9;
                Context context3 = (Context) obj8;
                c80.s sVar = (c80.s) obj7;
                e23.p pVar4 = (e23.p) obj6;
                p1 p1Var3 = (p1) obj5;
                x3 x3Var3 = (x3) obj4;
                p3.m mVar4 = (p3.m) obj;
                int iIntValue4 = ((Integer) obj2).intValue();
                if (mVar4.n(iIntValue4 & 1, (iIntValue4 & 3) != 2)) {
                    x1 x1Var5 = p3.n.f135158a;
                    mVar4.C(-1945108272);
                    mVar4.f();
                    p2 p2Var = p2.f111205a;
                    String strQ = gl1.y.Q(mVar4, R.string.show_unpublished_contentful_content);
                    int i25 = 9;
                    z3.e eVarC = z3.f.c(1386789991, new dv0.l(x3Var, i25), mVar4);
                    boolean zR = mVar4.r(fVar2) | mVar4.B(x3Var);
                    Object objQ9 = mVar4.q();
                    if (zR) {
                        objQ9 = new e23.a() { // from class: yj0.c
                            @Override // e23.a
                            public final Object invoke() {
                                switch (i17) {
                                    case 0:
                                        boolean z15 = !((Boolean) x3Var.getF182175a()).booleanValue();
                                        f fVar3 = fVar2;
                                        fVar3.f197485a.c(z15);
                                        ge1.b.T(v1.a(fVar3), null, null, new h(fVar3, null), 3);
                                        break;
                                    default:
                                        boolean z16 = !((Boolean) x3Var.getF182175a()).booleanValue();
                                        f fVar4 = fVar2;
                                        fVar4.f197485a.e(z16);
                                        ge1.b.T(v1.a(fVar4), null, null, new g(fVar4, null), 3);
                                        break;
                                }
                                return Unit.INSTANCE;
                            }
                        };
                        mVar4.K(objQ9);
                    } else {
                        aVar.getClass();
                        if (objQ9 == p3.m.a.f135155b) {
                            objQ9 = new e23.a() { // from class: yj0.c
                                @Override // e23.a
                                public final Object invoke() {
                                    switch (i17) {
                                        case 0:
                                            boolean z15 = !((Boolean) x3Var.getF182175a()).booleanValue();
                                            f fVar3 = fVar2;
                                            fVar3.f197485a.c(z15);
                                            ge1.b.T(v1.a(fVar3), null, null, new h(fVar3, null), 3);
                                            break;
                                        default:
                                            boolean z16 = !((Boolean) x3Var.getF182175a()).booleanValue();
                                            f fVar4 = fVar2;
                                            fVar4.f197485a.e(z16);
                                            ge1.b.T(v1.a(fVar4), null, null, new g(fVar4, null), 3);
                                            break;
                                    }
                                    return Unit.INSTANCE;
                                }
                            };
                            mVar4.K(objQ9);
                        }
                    }
                    p2Var.g(strQ, null, null, null, eVarC, false, false, (e23.a) objQ9, mVar4, 24576, 238);
                    String strQ2 = gl1.y.Q(mVar4, R.string.use_contentful_test_environment);
                    z3.e eVarC2 = z3.f.c(-1918490416, new dv0.l(x3Var2, 10), mVar4);
                    boolean zR2 = mVar4.r(fVar2) | mVar4.B(x3Var2);
                    Object objQ10 = mVar4.q();
                    if (zR2) {
                        objQ10 = new e23.a() { // from class: yj0.c
                            @Override // e23.a
                            public final Object invoke() {
                                switch (i16) {
                                    case 0:
                                        boolean z15 = !((Boolean) x3Var2.getF182175a()).booleanValue();
                                        f fVar3 = fVar2;
                                        fVar3.f197485a.c(z15);
                                        ge1.b.T(v1.a(fVar3), null, null, new h(fVar3, null), 3);
                                        break;
                                    default:
                                        boolean z16 = !((Boolean) x3Var2.getF182175a()).booleanValue();
                                        f fVar4 = fVar2;
                                        fVar4.f197485a.e(z16);
                                        ge1.b.T(v1.a(fVar4), null, null, new g(fVar4, null), 3);
                                        break;
                                }
                                return Unit.INSTANCE;
                            }
                        };
                        mVar4.K(objQ10);
                    } else {
                        aVar.getClass();
                        if (objQ10 == p3.m.a.f135155b) {
                            objQ10 = new e23.a() { // from class: yj0.c
                                @Override // e23.a
                                public final Object invoke() {
                                    switch (i16) {
                                        case 0:
                                            boolean z15 = !((Boolean) x3Var2.getF182175a()).booleanValue();
                                            f fVar3 = fVar2;
                                            fVar3.f197485a.c(z15);
                                            ge1.b.T(v1.a(fVar3), null, null, new h(fVar3, null), 3);
                                            break;
                                        default:
                                            boolean z16 = !((Boolean) x3Var2.getF182175a()).booleanValue();
                                            f fVar4 = fVar2;
                                            fVar4.f197485a.e(z16);
                                            ge1.b.T(v1.a(fVar4), null, null, new g(fVar4, null), 3);
                                            break;
                                    }
                                    return Unit.INSTANCE;
                                }
                            };
                            mVar4.K(objQ10);
                        }
                    }
                    p2Var.g(strQ2, null, null, null, eVarC2, false, false, (e23.a) objQ10, mVar4, 24576, 238);
                    List list = (List) ((g3) p1Var3.getF182175a()).f35301b;
                    if (list == null || list.isEmpty()) {
                        mVar4.C(-1943501232);
                        mVar4.f();
                    } else {
                        Iterator it = list.iterator();
                        while (true) {
                            if (!it.hasNext()) {
                                mVar4.C(-1943501232);
                                mVar4.f();
                            } else if (((o13.p) it.next()).f128594a == c80.q.EXCLUSIVE_OFFERS) {
                                mVar4.C(-1943822206);
                                p2 p2Var2 = p2.f111205a;
                                String strQ3 = gl1.y.Q(mVar4, R.string.reset_entered_exclusive_offers);
                                boolean zBooleanValue = ((Boolean) x3Var3.getF182175a()).booleanValue();
                                boolean zR3 = mVar4.r(fVar2);
                                Object objQ11 = mVar4.q();
                                if (zR3) {
                                    objQ11 = new e23.a() { // from class: yj0.d
                                        @Override // e23.a
                                        public final Object invoke() {
                                            switch (i16) {
                                                case 0:
                                                    fVar2.f197485a.g(false);
                                                    break;
                                                default:
                                                    fVar2.getClass();
                                                    oj0.e eVar5 = oj0.e.f132277a;
                                                    Context f104108a = ((o) KoinJavaComponent.get$default(o.class, null, null, 6, null)).getF104108a();
                                                    eVar5.getClass();
                                                    f104108a.getClass();
                                                    zp0.e.f206587a.getClass();
                                                    zp0.e.a(f104108a, "subscription_images");
                                                    break;
                                            }
                                            return Unit.INSTANCE;
                                        }
                                    };
                                    mVar4.K(objQ11);
                                } else {
                                    aVar.getClass();
                                    if (objQ11 == p3.m.a.f135155b) {
                                        objQ11 = new e23.a() { // from class: yj0.d
                                            @Override // e23.a
                                            public final Object invoke() {
                                                switch (i16) {
                                                    case 0:
                                                        fVar2.f197485a.g(false);
                                                        break;
                                                    default:
                                                        fVar2.getClass();
                                                        oj0.e eVar5 = oj0.e.f132277a;
                                                        Context f104108a = ((o) KoinJavaComponent.get$default(o.class, null, null, 6, null)).getF104108a();
                                                        eVar5.getClass();
                                                        f104108a.getClass();
                                                        zp0.e.f206587a.getClass();
                                                        zp0.e.a(f104108a, "subscription_images");
                                                        break;
                                                }
                                                return Unit.INSTANCE;
                                            }
                                        };
                                        mVar4.K(objQ11);
                                    }
                                }
                                p2Var2.g(strQ3, null, null, null, null, zBooleanValue, false, (e23.a) objQ11, mVar4, 0, 222);
                                mVar4.f();
                            }
                        }
                    }
                    List list2 = (List) ((g3) p1Var3.getF182175a()).f35301b;
                    if (list2 == null || list2.isEmpty()) {
                        mVar4.C(-1943132208);
                        mVar4.f();
                    } else {
                        Iterator it3 = list2.iterator();
                        while (true) {
                            if (!it3.hasNext()) {
                                mVar4.C(-1943132208);
                                mVar4.f();
                            } else if (((o13.p) it3.next()).f128594a == c80.q.MESSAGING_PLUS) {
                                mVar4.C(-1943387834);
                                p2 p2Var3 = p2.f111205a;
                                String strQ4 = gl1.y.Q(mVar4, R.string.active_intelligence_developer_menu);
                                boolean zR4 = mVar4.r(context3);
                                Object objQ12 = mVar4.q();
                                if (zR4) {
                                    objQ12 = new tz1.h(context3, 24);
                                    mVar4.K(objQ12);
                                } else {
                                    aVar.getClass();
                                    if (objQ12 == p3.m.a.f135155b) {
                                        objQ12 = new tz1.h(context3, 24);
                                        mVar4.K(objQ12);
                                    }
                                }
                                p2Var3.g(strQ4, null, null, null, null, false, false, (e23.a) objQ12, mVar4, 0, 254);
                                mVar4.f();
                            }
                        }
                    }
                    p2 p2Var4 = p2.f111205a;
                    String strQ5 = gl1.y.Q(mVar4, R.string.nutrition_developer_menu);
                    boolean zR5 = mVar4.r(context3);
                    Object objQ13 = mVar4.q();
                    if (zR5) {
                        objQ13 = new tz1.h(context3, 25);
                        mVar4.K(objQ13);
                    } else {
                        aVar.getClass();
                        if (objQ13 == p3.m.a.f135155b) {
                            objQ13 = new tz1.h(context3, 25);
                            mVar4.K(objQ13);
                        }
                    }
                    p2Var4.g(strQ5, null, null, null, null, false, false, (e23.a) objQ13, mVar4, 0, 254);
                    if (sVar instanceof c80.s.b) {
                        mVar4.C(-1942796695);
                        l72.f0 f0Var = l72.f0.f110999a;
                        String strQ6 = gl1.y.Q(mVar4, R.string.lbl_add_subscription);
                        h4.r rVarF = x2.f(h4.r.S, 1.0f);
                        d92.b.f58623a.getClass();
                        d92.b.f58625c.getClass();
                        j92.e eVar5 = j92.b.f97899b;
                        float f19 = eVar5.f97920e;
                        h4.r rVarB = c2.l.B(rVarF, f19, f19, f19, eVar5.f97918c);
                        boolean zR6 = mVar4.r(sVar) | mVar4.B(pVar4) | mVar4.r(context3);
                        Object objQ14 = mVar4.q();
                        if (zR6) {
                            objQ14 = new x72.k(sVar, i25, context3, pVar4);
                            mVar4.K(objQ14);
                        } else {
                            aVar.getClass();
                            if (objQ14 == p3.m.a.f135155b) {
                                objQ14 = new x72.k(sVar, i25, context3, pVar4);
                                mVar4.K(objQ14);
                            }
                        }
                        f0Var.d(0, 9, (e23.a) objQ14, rVarB, strQ6, mVar4, null, false);
                        mVar4.f();
                    } else {
                        mVar4.C(-1941888271);
                        p2Var4.g(gl1.y.Q(mVar4, R.string.lbl_no_purchasable_subscriptions), null, null, null, null, false, false, null, mVar4, 0, 510);
                        mVar4.f();
                    }
                    l72.f0 f0Var2 = l72.f0.f110999a;
                    String strQ7 = gl1.y.Q(mVar4, R.string.lbl_delete_images);
                    h4.r rVarF2 = x2.f(h4.r.S, 1.0f);
                    d92.b.f58623a.getClass();
                    d92.b.f58625c.getClass();
                    j92.e eVar6 = j92.b.f97899b;
                    float f22 = eVar6.f97920e;
                    h4.r rVarB2 = c2.l.B(rVarF2, f22, f22, f22, eVar6.f97918c);
                    boolean zR7 = mVar4.r(fVar2);
                    Object objQ15 = mVar4.q();
                    if (zR7) {
                        objQ15 = new e23.a() { // from class: yj0.d
                            @Override // e23.a
                            public final Object invoke() {
                                switch (i17) {
                                    case 0:
                                        fVar2.f197485a.g(false);
                                        break;
                                    default:
                                        fVar2.getClass();
                                        oj0.e eVar7 = oj0.e.f132277a;
                                        Context f104108a = ((o) KoinJavaComponent.get$default(o.class, null, null, 6, null)).getF104108a();
                                        eVar7.getClass();
                                        f104108a.getClass();
                                        zp0.e.f206587a.getClass();
                                        zp0.e.a(f104108a, "subscription_images");
                                        break;
                                }
                                return Unit.INSTANCE;
                            }
                        };
                        mVar4.K(objQ15);
                    } else {
                        aVar.getClass();
                        if (objQ15 == p3.m.a.f135155b) {
                            objQ15 = new e23.a() { // from class: yj0.d
                                @Override // e23.a
                                public final Object invoke() {
                                    switch (i17) {
                                        case 0:
                                            fVar2.f197485a.g(false);
                                            break;
                                        default:
                                            fVar2.getClass();
                                            oj0.e eVar7 = oj0.e.f132277a;
                                            Context f104108a = ((o) KoinJavaComponent.get$default(o.class, null, null, 6, null)).getF104108a();
                                            eVar7.getClass();
                                            f104108a.getClass();
                                            zp0.e.f206587a.getClass();
                                            zp0.e.a(f104108a, "subscription_images");
                                            break;
                                    }
                                    return Unit.INSTANCE;
                                }
                            };
                            mVar4.K(objQ15);
                        }
                    }
                    f0Var2.d(0, 9, (e23.a) objQ15, rVarB2, strQ7, mVar4, null, false);
                    x1 x1Var6 = p3.n.f135158a;
                } else {
                    mVar4.e();
                }
                return Unit.INSTANCE;
        }
    }

    public /* synthetic */ d(aa1.h hVar, e23.l lVar, e23.a aVar, h2.b bVar, e23.a aVar2, e23.l lVar2, e23.l lVar3, e23.p pVar, e23.q qVar) {
        this.f24364a = 23;
        this.f24367d = hVar;
        this.f24368e = lVar;
        this.f24365b = aVar;
        this.f24369f = bVar;
        this.f24366c = aVar2;
        this.f24370g = lVar2;
        this.f24371h = lVar3;
        this.f24372i = pVar;
        this.f24373j = qVar;
    }

    public /* synthetic */ d(o1 o1Var, l90.d dVar, q90.d.a aVar, e23.a aVar2, e23.a aVar3, e23.a aVar4, e23.p pVar, e23.l lVar, e23.p pVar2, int i14) {
        this.f24364a = 1;
        this.f24367d = o1Var;
        this.f24368e = dVar;
        this.f24369f = aVar;
        this.f24365b = aVar2;
        this.f24366c = aVar3;
        this.f24370g = aVar4;
        this.f24371h = pVar;
        this.f24372i = lVar;
        this.f24373j = pVar2;
    }

    public /* synthetic */ d(g3 g3Var, e23.l lVar, e23.a aVar, e23.a aVar2, e23.a aVar3, fe feVar, d91.t tVar, e23.q qVar, j1 j1Var) {
        this.f24364a = 6;
        this.f24367d = g3Var;
        this.f24368e = lVar;
        this.f24365b = aVar;
        this.f24366c = aVar2;
        this.f24369f = aVar3;
        this.f24370g = feVar;
        this.f24371h = tVar;
        this.f24372i = qVar;
        this.f24373j = j1Var;
    }

    public /* synthetic */ d(e23.a aVar, e23.a aVar2, u21.a0 a0Var, l22.a aVar3, v21.e eVar, e23.p pVar, e23.l lVar, m4.q qVar, m3 m3Var, int i14) {
        this.f24364a = 17;
        this.f24365b = aVar;
        this.f24366c = aVar2;
        this.f24367d = a0Var;
        this.f24368e = aVar3;
        this.f24369f = eVar;
        this.f24370g = pVar;
        this.f24371h = lVar;
        this.f24372i = qVar;
        this.f24373j = m3Var;
    }

    public /* synthetic */ d(e23.a aVar, e23.l lVar, sy.k kVar, i53.f fVar, n82.f fVar2, b63.o oVar, b63.o oVar2, yd1.a aVar2, sy.a aVar3) {
        this.f24364a = 14;
        this.f24365b = aVar;
        this.f24367d = lVar;
        this.f24368e = kVar;
        this.f24366c = fVar;
        this.f24369f = fVar2;
        this.f24370g = oVar;
        this.f24371h = oVar2;
        this.f24372i = aVar2;
        this.f24373j = aVar3;
    }

    public /* synthetic */ d(fe feVar, lw1.f fVar, x3 x3Var, c.q qVar, ub1.g gVar, Context context, m0 m0Var, c.q qVar2, e23.a aVar) {
        this.f24364a = 7;
        this.f24367d = feVar;
        this.f24368e = fVar;
        this.f24366c = x3Var;
        this.f24372i = qVar;
        this.f24369f = gVar;
        this.f24371h = context;
        this.f24370g = m0Var;
        this.f24373j = qVar2;
        this.f24365b = aVar;
    }

    public /* synthetic */ d(Double d14, ab1.g gVar, e23.l lVar, e23.l lVar2, e23.p pVar, String str, e23.l lVar3, w01.c cVar, e23.l lVar4) {
        this.f24364a = 2;
        this.f24368e = d14;
        this.f24365b = gVar;
        this.f24366c = lVar;
        this.f24369f = lVar2;
        this.f24370g = pVar;
        this.f24367d = str;
        this.f24371h = lVar3;
        this.f24372i = cVar;
        this.f24373j = lVar4;
    }

    public /* synthetic */ d(Long l14, Long l15, e23.p pVar, l3.e0 e0Var, j23.l lVar, l3 l3Var, bc bcVar, b3 b3Var, m4.b0 b0Var, int i14) {
        this.f24364a = 5;
        this.f24367d = l14;
        this.f24368e = l15;
        this.f24365b = pVar;
        this.f24366c = e0Var;
        this.f24369f = lVar;
        this.f24370g = l3Var;
        this.f24371h = bcVar;
        this.f24372i = b3Var;
        this.f24373j = b0Var;
    }

    public /* synthetic */ d(Object obj, Object obj2, u1 u1Var, Object obj3, Object obj4, Object obj5, e23.l lVar, e23.a aVar, o13.h hVar, int i14, int i15) {
        this.f24364a = i15;
        this.f24367d = obj;
        this.f24368e = obj2;
        this.f24366c = u1Var;
        this.f24369f = obj3;
        this.f24370g = obj4;
        this.f24371h = obj5;
        this.f24372i = lVar;
        this.f24365b = aVar;
        this.f24373j = hVar;
    }

    public /* synthetic */ d(Object obj, Object obj2, Object obj3, e23.l lVar, e23.a aVar, e23.a aVar2, e23.a aVar3, e23.a aVar4, o13.h hVar, int i14, int i15) {
        this.f24364a = i15;
        this.f24367d = obj;
        this.f24368e = obj2;
        this.f24369f = obj3;
        this.f24370g = lVar;
        this.f24365b = aVar;
        this.f24366c = aVar2;
        this.f24371h = aVar3;
        this.f24372i = aVar4;
        this.f24373j = hVar;
    }

    public /* synthetic */ d(String str, WifiSetup.SecurityType securityType, String str2, sa0.n.b bVar, sa0.n nVar, e23.a aVar, e23.a aVar2, e23.a aVar3, e23.a aVar4, int i14) {
        this.f24364a = 12;
        this.f24367d = str;
        this.f24369f = securityType;
        this.f24368e = str2;
        this.f24370g = bVar;
        this.f24371h = nVar;
        this.f24365b = aVar;
        this.f24366c = aVar2;
        this.f24372i = aVar3;
        this.f24373j = aVar4;
    }

    public /* synthetic */ d(String str, e23.a aVar, p1 p1Var, Context context, c.q qVar, e23.a aVar2, p1 p1Var2, String str2, ug2.x xVar) {
        this.f24364a = 0;
        this.f24367d = str;
        this.f24365b = aVar;
        this.f24369f = p1Var;
        this.f24371h = context;
        this.f24372i = qVar;
        this.f24366c = aVar2;
        this.f24370g = p1Var2;
        this.f24368e = str2;
        this.f24373j = xVar;
    }

    public /* synthetic */ d(o70.n nVar, String str, String str2, i53.c cVar, i53.c cVar2, String str3, String str4, String str5, e23.a aVar) {
        this.f24364a = 4;
        this.f24366c = nVar;
        this.f24367d = str;
        this.f24368e = str2;
        this.f24369f = cVar;
        this.f24370g = cVar2;
        this.f24371h = str3;
        this.f24372i = str4;
        this.f24373j = str5;
        this.f24365b = aVar;
    }

    public /* synthetic */ d(p1 p1Var, e23.l lVar, p1 p1Var2, p1 p1Var3, p1 p1Var4, m4.b0 b0Var, p1 p1Var5, qk0.c cVar, p1 p1Var6) {
        this.f24364a = 9;
        this.f24369f = p1Var;
        this.f24367d = lVar;
        this.f24370g = p1Var2;
        this.f24368e = p1Var3;
        this.f24365b = p1Var4;
        this.f24366c = b0Var;
        this.f24371h = p1Var5;
        this.f24372i = cVar;
        this.f24373j = p1Var6;
    }

    public /* synthetic */ d(q21.q qVar, e23.a aVar, e23.a aVar2, e23.a aVar3, e23.a aVar4, e23.a aVar5, e23.a aVar6, e23.a aVar7, e23.l lVar) {
        this.f24364a = 8;
        this.f24367d = qVar;
        this.f24365b = aVar;
        this.f24366c = aVar2;
        this.f24368e = aVar3;
        this.f24369f = aVar4;
        this.f24370g = aVar5;
        this.f24371h = aVar6;
        this.f24372i = aVar7;
        this.f24373j = lVar;
    }

    public /* synthetic */ d(r42.d dVar, p1 p1Var, p1 p1Var2, p1 p1Var3, Context context, p1 p1Var4, p1 p1Var5, q42.h hVar, p1 p1Var6) {
        this.f24364a = 11;
        this.f24367d = dVar;
        this.f24369f = p1Var;
        this.f24370g = p1Var2;
        this.f24368e = p1Var3;
        this.f24371h = context;
        this.f24365b = p1Var4;
        this.f24366c = p1Var5;
        this.f24372i = hVar;
        this.f24373j = p1Var6;
    }

    public /* synthetic */ d(s11.d dVar, p1 p1Var, e23.l lVar, e23.l lVar2, v21.e eVar, e23.l lVar3, d5 d5Var, e23.l lVar4, e23.l lVar5) {
        this.f24364a = 10;
        this.f24367d = dVar;
        this.f24369f = p1Var;
        this.f24368e = lVar;
        this.f24365b = lVar2;
        this.f24366c = eVar;
        this.f24370g = lVar3;
        this.f24371h = d5Var;
        this.f24372i = lVar4;
        this.f24373j = lVar5;
    }

    public /* synthetic */ d(u21.g gVar, e23.l lVar, e23.a aVar, v21.e eVar, e23.l lVar2, m4.q qVar, m3 m3Var, e23.l lVar3, e23.a aVar2) {
        this.f24364a = 15;
        this.f24367d = gVar;
        this.f24368e = lVar;
        this.f24365b = aVar;
        this.f24369f = eVar;
        this.f24370g = lVar2;
        this.f24371h = qVar;
        this.f24372i = m3Var;
        this.f24373j = lVar3;
        this.f24366c = aVar2;
    }

    public /* synthetic */ d(u82.d dVar, u82.d dVar2, yi0.c cVar, yi0.b bVar, e23.l lVar, e23.l lVar2, e23.a aVar, e23.l lVar3, e23.a aVar2, int i14) {
        this.f24364a = 3;
        this.f24367d = dVar;
        this.f24368e = dVar2;
        this.f24369f = cVar;
        this.f24370g = bVar;
        this.f24371h = lVar;
        this.f24372i = lVar2;
        this.f24365b = aVar;
        this.f24373j = lVar3;
        this.f24366c = aVar2;
    }

    public /* synthetic */ d(yj0.f fVar, x3 x3Var, x3 x3Var2, x3 x3Var3, Context context, c80.s sVar, e23.p pVar, p1 p1Var, x3 x3Var4) {
        this.f24364a = 24;
        this.f24367d = fVar;
        this.f24368e = x3Var;
        this.f24365b = x3Var2;
        this.f24366c = x3Var3;
        this.f24371h = context;
        this.f24370g = sVar;
        this.f24372i = pVar;
        this.f24369f = p1Var;
        this.f24373j = x3Var4;
    }

    public /* synthetic */ d(yj1.o oVar, e23.a aVar, e23.a aVar2, e23.a aVar3, e23.a aVar4, e23.a aVar5, e23.l lVar, e23.l lVar2, e23.l lVar3, int i14) {
        this.f24364a = 20;
        this.f24367d = oVar;
        this.f24365b = aVar;
        this.f24366c = aVar2;
        this.f24368e = aVar3;
        this.f24369f = aVar4;
        this.f24370g = aVar5;
        this.f24371h = lVar;
        this.f24372i = lVar2;
        this.f24373j = lVar3;
    }
}
