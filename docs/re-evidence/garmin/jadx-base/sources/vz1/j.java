package vz1;

import android.content.Context;
import c2.u;
import c2.x2;
import c2.y;
import c2.z;
import com.garmin.android.apps.connectmobile.R;
import com.garmin.android.apps.connectmobile.charts.mpchart3.wrapper.CustomCombinedChart;
import e2.i0;
import f5.z0;
import g21.f0;
import h5.e0;
import i3.a1;
import i3.fe;
import i3.mc;
import java.util.List;
import l72.c1;
import o4.m1;
import o53.b0;
import org.joda.time.DateTime;
import p005kotlin.Unit;
import p13.j0;
import p3.b4;
import p3.i2;
import p3.p0;
import p3.p1;
import p3.x1;
import p3.x3;
import r53.p2;
import sz1.t;
import ty1.g2;
import vn2.b1;
import w51.o0;
import w51.q0;
import ya0.c0;

/* JADX INFO: loaded from: classes10.dex */
public final /* synthetic */ class j implements e23.p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f180907a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f180908b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f180909c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Object f180910d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ Object f180911e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ Object f180912f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final /* synthetic */ Object f180913g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final /* synthetic */ Object f180914h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final /* synthetic */ Object f180915i;

    public /* synthetic */ j(mc mcVar, b0 b0Var, String str, String str2, u4.d dVar, e23.a aVar, z3.e eVar, z3.e eVar2, int i14) {
        this.f180907a = 3;
        this.f180908b = mcVar;
        this.f180909c = b0Var;
        this.f180913g = str;
        this.f180910d = str2;
        this.f180911e = dVar;
        this.f180912f = aVar;
        this.f180914h = eVar;
        this.f180915i = eVar2;
    }

    /* JADX WARN: Code duplicated, block: B:128:0x0494  */
    /* JADX WARN: Code duplicated, block: B:130:0x049d  */
    /* JADX WARN: Code duplicated, block: B:131:0x04a1  */
    /* JADX WARN: Code duplicated, block: B:136:0x04be  */
    /* JADX WARN: Code duplicated, block: B:139:0x04d7  */
    /* JADX WARN: Code duplicated, block: B:143:0x04f6  */
    /* JADX WARN: Code duplicated, block: B:146:0x0518  */
    /* JADX WARN: Code duplicated, block: B:149:0x0528  */
    /* JADX WARN: Code duplicated, block: B:150:0x052a A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:151:0x052c  */
    /* JADX WARN: Code duplicated, block: B:152:0x0534  */
    /* JADX WARN: Code duplicated, block: B:154:0x0538  */
    /* JADX WARN: Code duplicated, block: B:155:0x055f  */
    /* JADX WARN: Code duplicated, block: B:157:0x0568  */
    /* JADX WARN: Code duplicated, block: B:159:0x05b1  */
    /* JADX WARN: Code duplicated, block: B:52:0x0293  */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // e23.p
    public final Object invoke(Object obj, Object obj2) {
        u82.f fVar;
        u82.f fVar2;
        List<i41.f> listB;
        z31.b bVarA;
        p3.m.a aVar;
        h5.g.a.f fVar3;
        z0 z0VarD;
        int iHashCode;
        i2 i2VarX;
        h4.r rVarC;
        Object objQ;
        p3.m.a.C2565a c2565a;
        boolean zR;
        Object objQ2;
        Object objQ3;
        CustomCombinedChart customCombinedChart;
        Object objQ4;
        CustomCombinedChart customCombinedChart2;
        b41.b bVar;
        d41.b bVar2;
        i41.e eVar;
        p1 p1VarC;
        i41.b bVar3;
        p1 p1VarC2;
        int i14 = this.f180907a;
        p3.m.a aVar2 = p3.m.f135153a;
        Object obj3 = this.f180915i;
        Object obj4 = this.f180914h;
        Object obj5 = this.f180913g;
        Object obj6 = this.f180912f;
        Object obj7 = this.f180911e;
        Object obj8 = this.f180910d;
        Object obj9 = this.f180909c;
        Object obj10 = this.f180908b;
        switch (i14) {
            case 0:
                DateTime dateTime = (DateTime) obj10;
                DateTime dateTime2 = (DateTime) obj9;
                t tVar = (t) obj8;
                Context context = (Context) obj7;
                x3 x3Var = (x3) obj6;
                String str = (String) obj5;
                p2 p2Var = (p2) obj4;
                g41.a aVar3 = (g41.a) obj3;
                p3.m mVar = (p3.m) obj;
                int iIntValue = ((Integer) obj2).intValue();
                if (mVar.n(iIntValue & 1, (iIntValue & 3) != 2)) {
                    x1 x1Var = p3.n.f135158a;
                    if (dateTime == null || dateTime2 == null) {
                        mVar.C(-132272510);
                        mVar.f();
                        fVar = null;
                    } else {
                        mVar.C(-132302487);
                        u82.a aVar4 = tVar != null ? tVar.f161578e : null;
                        if (aVar4 == null) {
                            mVar.C(-132554487);
                            mVar.f();
                            p1VarC2 = null;
                        } else {
                            mVar.C(-835559944);
                            p1VarC2 = aVar4.c(new o82.a(g22.k.z(dateTime2).b(), g22.k.z(dateTime2).b()), mVar);
                            mVar.f();
                        }
                        fVar = p1VarC2 != null ? (u82.f) p1VarC2.getF182175a() : null;
                        mVar.f();
                    }
                    i41.f hrvSummary = (fVar == null || (bVar3 = (i41.b) fVar.a()) == null) ? null : bVar3.getHrvSummary();
                    if (dateTime == null || dateTime2 == null) {
                        mVar.C(-131650526);
                        mVar.f();
                        fVar2 = null;
                    } else {
                        mVar.C(-131680503);
                        u82.a aVar5 = tVar != null ? tVar.f161577d : null;
                        if (aVar5 == null) {
                            mVar.C(-131934425);
                            mVar.f();
                            p1VarC = null;
                        } else {
                            mVar.C(-835539942);
                            p1VarC = aVar5.c(new o82.a(g22.k.z(dateTime).b(), g22.k.z(dateTime2).b()), mVar);
                            mVar.f();
                        }
                        fVar2 = p1VarC != null ? (u82.f) p1VarC.getF182175a() : null;
                        mVar.f();
                    }
                    if (fVar2 == null || (eVar = (i41.e) fVar2.a()) == null || (listB = eVar.b()) == null) {
                        listB = j0.f134944a;
                    }
                    if (dateTime != null) {
                        bVarA = dateTime2 != null ? n41.c.a.a(n41.c.f123606a, listB, dateTime, dateTime2) : null;
                    } else {
                        bVarA = null;
                    }
                    h4.r.a aVar6 = h4.r.S;
                    c2.j.f22691a.getClass();
                    c2.j.k kVar = c2.j.f22694d;
                    h4.d.f81522a.getClass();
                    z zVarA = y.a(kVar, h4.d.a.f81536n, mVar, 0);
                    int iHashCode2 = Long.hashCode(mVar.getU());
                    i2 i2VarX2 = mVar.x();
                    h4.r rVarC2 = h4.k.c(aVar6, mVar);
                    h5.g.V.getClass();
                    e0.a aVar7 = h5.g.a.f81805b;
                    if (mVar.F() == null) {
                        p0.l();
                        throw null;
                    }
                    mVar.z();
                    if (mVar.getT()) {
                        mVar.M(aVar7);
                    } else {
                        mVar.c();
                    }
                    h5.g.a.e eVar2 = h5.g.a.f81810g;
                    b4.c(eVar2, zVarA, mVar);
                    h5.g.a.C1623g c1623g = h5.g.a.f81809f;
                    b4.c(c1623g, i2VarX2, mVar);
                    h5.g.a.b bVar4 = h5.g.a.f81813j;
                    if (mVar.getT()) {
                        aVar = aVar2;
                    } else {
                        aVar = aVar2;
                        if (!p005kotlin.jvm.internal.s.g(mVar.q(), Integer.valueOf(iHashCode2))) {
                        }
                        fVar3 = h5.g.a.f81807d;
                        b4.c(fVar3, rVarC2, mVar);
                        c2.b0 b0Var = c2.b0.f22601a;
                        z0VarD = c2.q.d(h4.d.a.f81524b, false);
                        iHashCode = Long.hashCode(mVar.getU());
                        i2VarX = mVar.x();
                        rVarC = h4.k.c(aVar6, mVar);
                        if (mVar.F() != null) {
                            p0.l();
                            throw null;
                        }
                        mVar.z();
                        if (mVar.getT()) {
                            mVar.M(aVar7);
                        } else {
                            mVar.c();
                        }
                        b4.c(eVar2, z0VarD, mVar);
                        b4.c(c1623g, i2VarX, mVar);
                        if (mVar.getT() || !p005kotlin.jvm.internal.s.g(mVar.q(), Integer.valueOf(iHashCode))) {
                            v.h.z(iHashCode, mVar, iHashCode, bVar4);
                        }
                        b4.c(fVar3, rVarC, mVar);
                        u uVar = u.f22885a;
                        h4.r rVarF = x2.f(aVar6, 1.0f);
                        objQ = mVar.q();
                        aVar.getClass();
                        c2565a = p3.m.a.f135155b;
                        if (objQ == c2565a) {
                            objQ = new b1(21);
                            mVar.K(objQ);
                        }
                        e23.l lVar = (e23.l) objQ;
                        zR = mVar.r(context) | mVar.r(hrvSummary);
                        objQ2 = mVar.q();
                        if (zR || objQ2 == c2565a) {
                            objQ2 = new g2(27, context, hrvSummary);
                            mVar.K(objQ2);
                        }
                        p002j6.c.b(lVar, rVarF, (e23.l) objQ2, mVar, 54, 0);
                        mVar.y();
                        objQ3 = mVar.q();
                        if (objQ3 == c2565a) {
                            objQ3 = new CustomCombinedChart(context);
                            mVar.K(objQ3);
                        }
                        customCombinedChart = (CustomCombinedChart) objQ3;
                        objQ4 = mVar.q();
                        if (objQ4 == c2565a) {
                            if (dateTime2 == null) {
                                customCombinedChart2 = customCombinedChart;
                                bVar = null;
                            } else {
                                if (dateTime != null) {
                                    bVar2 = new d41.b(customCombinedChart, dateTime, dateTime2);
                                } else {
                                    bVar2 = null;
                                }
                                if (bVar2 != null) {
                                    customCombinedChart2 = customCombinedChart;
                                    bVar = new b41.b(customCombinedChart, new a41.a(context), bVar2, new c41.a(customCombinedChart), new k00.g(customCombinedChart), null, 32, null);
                                } else {
                                    customCombinedChart2 = customCombinedChart;
                                    bVar = null;
                                }
                            }
                            mVar.K(bVar);
                            objQ4 = bVar;
                        } else {
                            customCombinedChart2 = customCombinedChart;
                        }
                        String strQ = gl1.y.Q(mVar, R.string.title_7d_4w_charts);
                        z3.e eVarC = z3.f.c(-2004249686, new sg2.g(customCombinedChart2, bVarA, x3Var, (b41.b) objQ4, str, 21), mVar);
                        z3.e eVarC2 = z3.f.c(-1476009237, new vx1.b(p2Var, 3, aVar3, x3Var), mVar);
                        d.f180898a.getClass();
                        m92.o.a(aVar6, strQ, null, null, eVarC, eVarC2, d.f180899b, mVar, 1794054, 12);
                        mVar.y();
                    }
                    v.h.z(iHashCode2, mVar, iHashCode2, bVar4);
                    fVar3 = h5.g.a.f81807d;
                    b4.c(fVar3, rVarC2, mVar);
                    c2.b0 b0Var2 = c2.b0.f22601a;
                    z0VarD = c2.q.d(h4.d.a.f81524b, false);
                    iHashCode = Long.hashCode(mVar.getU());
                    i2VarX = mVar.x();
                    rVarC = h4.k.c(aVar6, mVar);
                    if (mVar.F() != null) {
                        p0.l();
                        throw null;
                    }
                    mVar.z();
                    if (mVar.getT()) {
                        mVar.M(aVar7);
                    } else {
                        mVar.c();
                    }
                    b4.c(eVar2, z0VarD, mVar);
                    b4.c(c1623g, i2VarX, mVar);
                    if (mVar.getT()) {
                        v.h.z(iHashCode, mVar, iHashCode, bVar4);
                    } else {
                        v.h.z(iHashCode, mVar, iHashCode, bVar4);
                    }
                    b4.c(fVar3, rVarC, mVar);
                    u uVar2 = u.f22885a;
                    h4.r rVarF2 = x2.f(aVar6, 1.0f);
                    objQ = mVar.q();
                    aVar.getClass();
                    c2565a = p3.m.a.f135155b;
                    if (objQ == c2565a) {
                        objQ = new b1(21);
                        mVar.K(objQ);
                    }
                    e23.l lVar2 = (e23.l) objQ;
                    zR = mVar.r(context) | mVar.r(hrvSummary);
                    objQ2 = mVar.q();
                    if (zR) {
                        objQ2 = new g2(27, context, hrvSummary);
                        mVar.K(objQ2);
                    } else {
                        objQ2 = new g2(27, context, hrvSummary);
                        mVar.K(objQ2);
                    }
                    p002j6.c.b(lVar2, rVarF2, (e23.l) objQ2, mVar, 54, 0);
                    mVar.y();
                    objQ3 = mVar.q();
                    if (objQ3 == c2565a) {
                        objQ3 = new CustomCombinedChart(context);
                        mVar.K(objQ3);
                    }
                    customCombinedChart = (CustomCombinedChart) objQ3;
                    objQ4 = mVar.q();
                    if (objQ4 == c2565a) {
                        if (dateTime2 == null) {
                            customCombinedChart2 = customCombinedChart;
                            bVar = null;
                        } else {
                            if (dateTime != null) {
                                bVar2 = new d41.b(customCombinedChart, dateTime, dateTime2);
                            } else {
                                bVar2 = null;
                            }
                            if (bVar2 != null) {
                                customCombinedChart2 = customCombinedChart;
                                bVar = new b41.b(customCombinedChart, new a41.a(context), bVar2, new c41.a(customCombinedChart), new k00.g(customCombinedChart), null, 32, null);
                            } else {
                                customCombinedChart2 = customCombinedChart;
                                bVar = null;
                            }
                        }
                        mVar.K(bVar);
                        objQ4 = bVar;
                    } else {
                        customCombinedChart2 = customCombinedChart;
                    }
                    String strQ2 = gl1.y.Q(mVar, R.string.title_7d_4w_charts);
                    z3.e eVarC3 = z3.f.c(-2004249686, new sg2.g(customCombinedChart2, bVarA, x3Var, (b41.b) objQ4, str, 21), mVar);
                    z3.e eVarC4 = z3.f.c(-1476009237, new vx1.b(p2Var, 3, aVar3, x3Var), mVar);
                    d.f180898a.getClass();
                    m92.o.a(aVar6, strQ2, null, null, eVarC3, eVarC4, d.f180899b, mVar, 1794054, 12);
                    mVar.y();
                } else {
                    mVar.e();
                }
                return Unit.INSTANCE;
            case 1:
                e23.a aVar8 = (e23.a) obj10;
                x11.k kVar2 = (x11.k) obj9;
                e23.a aVar9 = (e23.a) obj8;
                e23.a aVar10 = (e23.a) obj7;
                v21.e eVar3 = (v21.e) obj6;
                e23.l lVar3 = (e23.l) obj5;
                e23.p pVar = (e23.p) obj4;
                p1 p1Var = (p1) obj3;
                p3.m mVar2 = (p3.m) obj;
                int iIntValue2 = ((Integer) obj2).intValue();
                if (mVar2.n(iIntValue2 & 1, (iIntValue2 & 3) != 2)) {
                    x1 x1Var2 = p3.n.f135158a;
                    b82.c.c(z3.f.c(878670555, new w11.j(kVar2, aVar9), mVar2), z3.f.c(1124936021, new ku1.l(kVar2, aVar10, eVar3, lVar3, pVar, 26), mVar2), mVar2, 54);
                    if (((Boolean) p1Var.getF182175a()).booleanValue()) {
                        mVar2.C(140909015);
                        c1 c1Var = c1.f110940a;
                        String strQ3 = gl1.y.Q(mVar2, R.string.message_common_confirm_leaving_screen);
                        String strQ4 = gl1.y.Q(mVar2, R.string.lbl_yes);
                        String strQ5 = gl1.y.Q(mVar2, R.string.common_cancel);
                        boolean zB = mVar2.B(aVar8);
                        Object objQ5 = mVar2.q();
                        if (zB) {
                            objQ5 = new p40.j0(aVar8, p1Var, 26);
                            mVar2.K(objQ5);
                        } else {
                            aVar2.getClass();
                            if (objQ5 == p3.m.a.f135155b) {
                                objQ5 = new p40.j0(aVar8, p1Var, 26);
                                mVar2.K(objQ5);
                            }
                        }
                        e23.a<Unit> aVar11 = (e23.a) objQ5;
                        Object objQ6 = mVar2.q();
                        aVar2.getClass();
                        if (objQ6 == p3.m.a.f135155b) {
                            objQ6 = new vd0.c(p1Var, 25);
                            mVar2.K(objQ6);
                        }
                        c1Var.a(false, strQ3, null, null, null, strQ4, false, false, aVar11, strQ5, (e23.a) objQ6, mVar2, 0, 6, 221);
                        mVar2.f();
                    } else {
                        mVar2.C(141355229);
                        mVar2.f();
                    }
                } else {
                    mVar2.e();
                }
                return Unit.INSTANCE;
            case 2:
                p1 p1Var2 = (p1) obj10;
                e23.p pVar2 = (e23.p) obj9;
                e23.a aVar12 = (e23.a) obj8;
                q0 q0Var = (q0) obj6;
                Context context2 = (Context) obj7;
                e23.q qVar = (e23.q) obj5;
                e23.a aVar13 = (e23.a) obj4;
                fe feVar = (fe) obj3;
                p3.m mVar3 = (p3.m) obj;
                int iIntValue3 = ((Integer) obj2).intValue();
                if (mVar3.n(iIntValue3 & 1, (iIntValue3 & 3) != 2)) {
                    x1 x1Var3 = p3.n.f135158a;
                    z51.h hVar = ((w51.p0) p1Var2.getF182175a()).f182344a;
                    if (hVar == null) {
                        return Unit.INSTANCE;
                    }
                    h4.r rVarD = x2.d(u1.n.e(h4.r.S, vb.h.e(d92.b.f58623a, mVar3), m1.f128891a), 1.0f);
                    h4.d.f81522a.getClass();
                    z0 z0VarD2 = c2.q.d(h4.d.a.f81524b, false);
                    int iHashCode3 = Long.hashCode(mVar3.getU());
                    i2 i2VarX3 = mVar3.x();
                    h4.r rVarC3 = h4.k.c(rVarD, mVar3);
                    h5.g.V.getClass();
                    e0.a aVar14 = h5.g.a.f81805b;
                    if (mVar3.F() == null) {
                        p0.l();
                        throw null;
                    }
                    mVar3.z();
                    if (mVar3.getT()) {
                        mVar3.M(aVar14);
                    } else {
                        mVar3.c();
                    }
                    b4.c(h5.g.a.f81810g, z0VarD2, mVar3);
                    b4.c(h5.g.a.f81809f, i2VarX3, mVar3);
                    h5.g.a.b bVar5 = h5.g.a.f81813j;
                    if (mVar3.getT() || !p005kotlin.jvm.internal.s.g(mVar3.q(), Integer.valueOf(iHashCode3))) {
                        v.h.z(iHashCode3, mVar3, iHashCode3, bVar5);
                    }
                    b4.c(h5.g.a.f81807d, rVarC3, mVar3);
                    u uVar3 = u.f22885a;
                    b82.c.c(z3.f.c(1475181364, new o0.b(hVar, pVar2, aVar12, q0Var, context2, p1Var2), mVar3), z3.f.c(517791738, new ak0.g(q0Var, context2, hVar, qVar, aVar12, aVar13, p1Var2, feVar), mVar3), mVar3, 54);
                    mVar3.y();
                } else {
                    mVar3.e();
                }
                return Unit.INSTANCE;
            case 3:
                ((Integer) obj2).getClass();
                wg2.j.b((mc) obj10, (b0) obj9, (String) obj5, (String) obj8, (u4.d) obj7, (e23.a) obj6, (z3.e) obj4, (z3.e) obj3, (p3.m) obj, p0.t(14155777));
                return Unit.INSTANCE;
            case 4:
                ((Integer) obj2).getClass();
                wn0.k.a((wn0.l) obj10, (e23.l) obj9, (nk0.l) obj8, (nk0.l) obj7, (nk0.l) obj6, (e23.a) obj5, (nk0.l) obj4, (nk0.l) obj3, (p3.m) obj, p0.t(1));
                return Unit.INSTANCE;
            case 5:
                ((Integer) obj2).getClass();
                c0.a((ya0.c) obj10, (e23.p) obj9, (e23.l) obj8, (e23.l) obj7, (e23.p) obj6, (e23.l) obj5, (ca0.o0) obj4, (e23.l) obj3, (p3.m) obj, p0.t(1));
                return Unit.INSTANCE;
            case 6:
                ((Integer) obj2).getClass();
                z01.f.a((v21.e) obj10, (g21.u) obj9, (f0) obj8, (String) obj5, (f0) obj7, (g21.u) obj6, (f0) obj4, (i53.c) obj3, (p3.m) obj, p0.t(1));
                return Unit.INSTANCE;
            default:
                ((Integer) obj2).getClass();
                zs1.s.a((h4.r) obj10, (pt1.a) obj9, (a1) obj8, (i0) obj7, (e23.l) obj6, (e23.l) obj5, (e23.l) obj4, (e23.a) obj3, (p3.m) obj, p0.t(1));
                return Unit.INSTANCE;
        }
    }

    public /* synthetic */ j(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6, Object obj7, Object obj8, int i14) {
        this.f180907a = i14;
        this.f180908b = obj;
        this.f180909c = obj2;
        this.f180910d = obj3;
        this.f180911e = obj4;
        this.f180912f = obj5;
        this.f180913g = obj6;
        this.f180914h = obj7;
        this.f180915i = obj8;
    }

    public /* synthetic */ j(Object obj, Object obj2, Object obj3, Object obj4, o13.h hVar, o13.h hVar2, o13.h hVar3, o13.h hVar4, int i14, int i15) {
        this.f180907a = i15;
        this.f180908b = obj;
        this.f180909c = obj2;
        this.f180910d = obj3;
        this.f180911e = obj4;
        this.f180912f = hVar;
        this.f180913g = hVar2;
        this.f180914h = hVar3;
        this.f180915i = hVar4;
    }

    public /* synthetic */ j(p1 p1Var, e23.p pVar, e23.a aVar, q0 q0Var, Context context, e23.q qVar, e23.a aVar2, fe feVar) {
        this.f180907a = 2;
        this.f180908b = p1Var;
        this.f180909c = pVar;
        this.f180910d = aVar;
        this.f180912f = q0Var;
        this.f180911e = context;
        this.f180913g = qVar;
        this.f180914h = aVar2;
        this.f180915i = feVar;
    }

    public /* synthetic */ j(v21.e eVar, g21.u uVar, f0 f0Var, String str, f0 f0Var2, g21.u uVar2, f0 f0Var3, i53.c cVar, int i14) {
        this.f180907a = 6;
        this.f180908b = eVar;
        this.f180909c = uVar;
        this.f180910d = f0Var;
        this.f180913g = str;
        this.f180911e = f0Var2;
        this.f180912f = uVar2;
        this.f180914h = f0Var3;
        this.f180915i = cVar;
    }
}
