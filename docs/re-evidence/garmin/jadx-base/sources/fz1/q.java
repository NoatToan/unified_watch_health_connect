package fz1;

import android.content.Context;
import c2.b0;
import c2.l2;
import c2.q2;
import c2.s2;
import c2.u2;
import c2.x2;
import c2.y;
import c2.z;
import c22.l3;
import com.garmin.android.apps.connectmobile.R;
import et1.v;
import g02.b2;
import h5.e0;
import i3.mh;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import l72.f0;
import o4.m1;
import p005kotlin.Unit;
import p005kotlin.jvm.internal.s;
import p3.b4;
import p3.i2;
import p3.p0;
import p3.x1;
import s5.x0;
import u1.a2;

/* JADX INFO: loaded from: classes10.dex */
public final /* synthetic */ class q implements e23.p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f74056a = 0;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ com.garmin.android.apps.connectmobile.traininginitiative.ui.goal.f f74057b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ boolean f74058c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ boolean f74059d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f74060e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f74061f;

    public /* synthetic */ q(com.garmin.android.apps.connectmobile.traininginitiative.ui.goal.f fVar, boolean z14, boolean z15, int i14, int i15) {
        this.f74057b = fVar;
        this.f74058c = z14;
        this.f74059d = z15;
        this.f74060e = i14;
        this.f74061f = i15;
    }

    /* JADX WARN: Code duplicated, block: B:114:0x0482  */
    /* JADX WARN: Code duplicated, block: B:86:0x0385  */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // e23.p
    public final Object invoke(Object obj, Object obj2) throws Throwable {
        o13.p pVar;
        com.garmin.android.apps.connectmobile.traininginitiative.ui.goal.f fVar;
        h4.r.a aVar;
        boolean z14;
        int i14;
        b0 b0Var;
        p3.m mVar;
        o13.p pVar2;
        gg0.i unit;
        o13.p pVar3;
        Double value;
        gg0.i unit2;
        l2 l2VarA;
        h4.r rVarE;
        Double value2;
        String strC;
        gg0.i unit3;
        Double value3;
        switch (this.f74056a) {
            case 0:
                p3.m mVar2 = (p3.m) obj;
                int iIntValue = ((Integer) obj2).intValue();
                com.garmin.android.apps.connectmobile.traininginitiative.ui.goal.f.a aVar2 = com.garmin.android.apps.connectmobile.traininginitiative.ui.goal.f.f46045f;
                if (mVar2.n(iIntValue & 1, (iIntValue & 3) != 2)) {
                    x1 x1Var = p3.n.f135158a;
                    h4.r.a aVar3 = h4.r.S;
                    h4.r rVarB = a2.b(x2.d(aVar3, 1.0f), a2.a(mVar2), true);
                    c2.j.f22691a.getClass();
                    c2.j.g gVar = c2.j.f22698h;
                    h4.d.f81522a.getClass();
                    h4.g.a aVar4 = h4.d.a.f81536n;
                    z zVarA = y.a(gVar, aVar4, mVar2, 6);
                    int iHashCode = Long.hashCode(mVar2.getU());
                    i2 i2VarX = mVar2.x();
                    h4.r rVarC = h4.k.c(rVarB, mVar2);
                    h5.g.V.getClass();
                    e0.a aVar5 = h5.g.a.f81805b;
                    if (mVar2.F() == null) {
                        p0.l();
                        throw null;
                    }
                    mVar2.z();
                    if (mVar2.getT()) {
                        mVar2.M(aVar5);
                    } else {
                        mVar2.c();
                    }
                    h5.g.a.e eVar = h5.g.a.f81810g;
                    b4.c(eVar, zVarA, mVar2);
                    h5.g.a.C1623g c1623g = h5.g.a.f81809f;
                    b4.c(c1623g, i2VarX, mVar2);
                    h5.g.a.b bVar = h5.g.a.f81813j;
                    if (mVar2.getT() || !s.g(mVar2.q(), Integer.valueOf(iHashCode))) {
                        v.h.z(iHashCode, mVar2, iHashCode, bVar);
                    }
                    h5.g.a.f fVar2 = h5.g.a.f81807d;
                    b4.c(fVar2, rVarC, mVar2);
                    b0 b0Var2 = b0.f22601a;
                    com.garmin.android.apps.connectmobile.traininginitiative.ui.goal.f fVar3 = this.f74057b;
                    o13.p pVar4 = (o13.p) p0.c(fVar3.f46047b, mVar2, 0).getF182175a();
                    z zVarA2 = y.a(c2.j.f22694d, aVar4, mVar2, 0);
                    int iHashCode2 = Long.hashCode(mVar2.getU());
                    i2 i2VarX2 = mVar2.x();
                    h4.r rVarC2 = h4.k.c(aVar3, mVar2);
                    if (mVar2.F() == null) {
                        p0.l();
                        throw null;
                    }
                    mVar2.z();
                    if (mVar2.getT()) {
                        mVar2.M(aVar5);
                    } else {
                        mVar2.c();
                    }
                    b4.c(eVar, zVarA2, mVar2);
                    b4.c(c1623g, i2VarX2, mVar2);
                    if (mVar2.getT() || !s.g(mVar2.q(), Integer.valueOf(iHashCode2))) {
                        v.h.z(iHashCode2, mVar2, iHashCode2, bVar);
                    }
                    b4.c(fVar2, rVarC2, mVar2);
                    String string = fVar3.getString(R.string.msg_review_leg_goals_title);
                    string.getClass();
                    boolean z15 = this.f74058c;
                    if (z15) {
                        mVar2.C(-2128301491);
                        d92.b.f58623a.getClass();
                        d92.b.f58625c.getClass();
                        aVar = aVar3;
                        pVar = pVar4;
                        fVar = fVar3;
                        b2.a(c2.l.C(aVar3, 0.0f, 0.0f, 0.0f, j92.b.f97899b.f97921f, 7), !this.f74059d, this.f74060e, this.f74061f, string, null, null, null, null, mVar2, 0, 480);
                        mVar = mVar2;
                        mVar.f();
                        b0Var = b0Var2;
                        z14 = z15;
                        i14 = 0;
                    } else {
                        pVar = pVar4;
                        fVar = fVar3;
                        aVar = aVar3;
                        mVar2.C(-2127857292);
                        d92.b.f58623a.getClass();
                        d92.b.f58624b.getClass();
                        x0 x0VarB = d92.c.b(j92.f.f97931h, mVar2);
                        d92.b.f58625c.getClass();
                        h4.r rVarB2 = b0Var2.b(x2.f(c2.l.y(aVar, j92.b.f97899b.f97921f), 1.0f), h4.d.a.f81537o);
                        d6.h.f57752b.getClass();
                        z14 = z15;
                        i14 = 0;
                        b0Var = b0Var2;
                        mh.c(string, rVarB2, 0L, null, 0L, null, 0L, d6.h.a(d6.h.f57755e), 0L, 0, false, 0, 0, null, x0VarB, mVar2, 0, 0, 130044);
                        mVar = mVar2;
                        mVar.f();
                    }
                    double dDoubleValue = 0.0d;
                    if (fVar.v6().x4().n0()) {
                        pVar2 = pVar;
                        fg0.d dVar = (fg0.d) pVar2.f128594a;
                        String str = (dVar == null || (value3 = dVar.getValue()) == null) ? null : String.format("%.2f", Arrays.copyOf(new Object[]{Double.valueOf(value3.doubleValue())}, 1));
                        fg0.d dVar2 = (fg0.d) pVar2.f128594a;
                        if (dVar2 == null || (unit3 = dVar2.getUnit()) == null) {
                            strC = null;
                        } else {
                            Context contextRequireContext = fVar.requireContext();
                            contextRequireContext.getClass();
                            strC = unit3.c(contextRequireContext);
                        }
                        pVar3 = new o13.p(str, strC);
                    } else {
                        pVar2 = pVar;
                        og0.a aVar6 = og0.a.f131967a;
                        fg0.d dVar3 = (fg0.d) pVar2.f128594a;
                        double dDoubleValue2 = (dVar3 == null || (value = dVar3.getValue()) == null) ? 0.0d : value.doubleValue();
                        fg0.d dVar4 = (fg0.d) pVar2.f128594a;
                        if (dVar4 == null || (unit = dVar4.getUnit()) == null) {
                            unit = gg0.i.METER;
                        }
                        aVar6.getClass();
                        String strI = og0.a.i(aVar6, og0.a.g(dDoubleValue2, unit));
                        Context contextRequireContext2 = fVar.requireContext();
                        contextRequireContext2.getClass();
                        pVar3 = new o13.p(strI, og0.a.q(contextRequireContext2));
                    }
                    og0.a aVar7 = og0.a.f131967a;
                    fg0.d dVar5 = (fg0.d) pVar2.f128595b;
                    if (dVar5 != null && (value2 = dVar5.getValue()) != null) {
                        dDoubleValue = value2.doubleValue();
                    }
                    fg0.d dVar6 = (fg0.d) pVar2.f128595b;
                    if (dVar6 == null || (unit2 = dVar6.getUnit()) == null) {
                        unit2 = gg0.i.SECOND;
                    }
                    aVar7.getClass();
                    double dJ = og0.a.j(dDoubleValue, unit2);
                    l3.f23124b.getClass();
                    String strO1 = l3.a.o1((long) dJ);
                    Context contextRequireContext3 = fVar.requireContext();
                    contextRequireContext3.getClass();
                    String strK1 = l3.a.k1(new l22.a(contextRequireContext3), true, (int) dJ);
                    if (z14) {
                        d92.b.f58623a.getClass();
                        d92.b.f58625c.getClass();
                        float f14 = j92.b.f97899b.f97920e;
                        l2VarA = c2.l.e(f14, 0.0f, f14, f14, 2);
                    } else {
                        d92.b.f58623a.getClass();
                        d92.b.f58625c.getClass();
                        l2VarA = c2.l.a(j92.b.f97899b.f97920e);
                    }
                    com.garmin.android.apps.connectmobile.traininginitiative.ui.goal.f fVar4 = fVar;
                    l72.x0.f111346a.e(c2.l.x(aVar, l2VarA), z3.f.c(-2070906801, new fb0.b(pVar3, strK1, fVar4, strO1, 3), mVar), mVar, (l72.x0.f111348c << 6) | 48, 0);
                    List list = (List) p0.c(fVar4.f46049d, mVar, i14).getF182175a();
                    List list2 = (List) p0.c(fVar4.f46048c, mVar, i14).getF182175a();
                    mVar.C(-207089343);
                    Context contextRequireContext4 = fVar4.requireContext();
                    contextRequireContext4.getClass();
                    Iterator it = mg0.b.b(contextRequireContext4, list, list2, fVar4.v6().x4().n0()).iterator();
                    while (true) {
                        boolean zHasNext = it.hasNext();
                        p3.m.a aVar8 = p3.m.f135153a;
                        if (zHasNext) {
                            mg0.a aVar9 = (mg0.a) it.next();
                            ng0.b bVar2 = ng0.b.f125905a;
                            boolean zR = mVar.r(fVar4);
                            Object objQ = mVar.q();
                            if (zR) {
                                objQ = new v(fVar4, 12);
                                mVar.K(objQ);
                            } else {
                                aVar8.getClass();
                                if (objQ == p3.m.a.f135155b) {
                                    objQ = new v(fVar4, 12);
                                    mVar.K(objQ);
                                }
                            }
                            int i15 = mg0.a.f118363g;
                            bVar2.a(aVar9, (e23.q) objQ, mVar, i14);
                        } else {
                            mVar.f();
                            mVar.y();
                            h4.r.a aVar10 = h4.r.S;
                            c2.l.f(b0Var.a(aVar10, 1.0f, true), mVar);
                            if (z14) {
                                mVar.C(-1508190743);
                                rVarE = u1.n.e(aVar10, fb1.c.z(d92.b.f58623a, mVar), m1.f128891a);
                                mVar.f();
                            } else {
                                mVar.C(-1507982206);
                                mVar.f();
                                rVarE = aVar10;
                            }
                            c2.j.f22691a.getClass();
                            c2.j.C0343j c0343j = c2.j.f22692b;
                            h4.d.f81522a.getClass();
                            s2 s2VarA = q2.a(c0343j, h4.d.a.f81533k, mVar, i14);
                            x1 x1Var2 = p3.n.f135158a;
                            int iHashCode3 = Long.hashCode(mVar.getU());
                            i2 i2VarX3 = mVar.x();
                            h4.r rVarC3 = h4.k.c(rVarE, mVar);
                            h5.g.V.getClass();
                            e0.a aVar11 = h5.g.a.f81805b;
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
                            b4.c(h5.g.a.f81810g, s2VarA, mVar);
                            b4.c(h5.g.a.f81809f, i2VarX3, mVar);
                            h5.g.a.b bVar3 = h5.g.a.f81813j;
                            if (mVar.getT() || !s.g(mVar.q(), Integer.valueOf(iHashCode3))) {
                                v.h.z(iHashCode3, mVar, iHashCode3, bVar3);
                            }
                            b4.c(h5.g.a.f81807d, rVarC3, mVar);
                            u2 u2Var = u2.f22900a;
                            f0 f0Var = f0.f110999a;
                            String string2 = fVar4.getString((fVar4.v6().f74009h || fVar4.v6().D4()) ? R.string.lbl_next : R.string.lbl_finish);
                            string2.getClass();
                            d92.b.f58623a.getClass();
                            d92.b.f58625c.getClass();
                            h4.r rVarF = x2.f(c2.l.y(aVar10, j92.b.f97899b.f97920e), 1.0f);
                            boolean zR2 = mVar.r(fVar4);
                            Object objQ2 = mVar.q();
                            if (zR2) {
                                objQ2 = new fe2.z(fVar4, 6);
                                mVar.K(objQ2);
                            } else {
                                aVar8.getClass();
                                if (objQ2 == p3.m.a.f135155b) {
                                    objQ2 = new fe2.z(fVar4, 6);
                                    mVar.K(objQ2);
                                }
                            }
                            p3.m mVar3 = mVar;
                            f0Var.d(0, 9, (e23.a) objQ2, rVarF, string2, mVar3, null, false);
                            mVar3.y();
                            mVar3.y();
                        }
                    }
                } else {
                    mVar2.e();
                }
                return Unit.INSTANCE;
            default:
                ((Integer) obj2).getClass();
                com.garmin.android.apps.connectmobile.traininginitiative.ui.goal.f.a aVar12 = com.garmin.android.apps.connectmobile.traininginitiative.ui.goal.f.f46045f;
                this.f74057b.u6(this.f74058c, this.f74059d, this.f74060e, this.f74061f, (p3.m) obj, p0.t(1));
                return Unit.INSTANCE;
        }
    }

    public /* synthetic */ q(com.garmin.android.apps.connectmobile.traininginitiative.ui.goal.f fVar, boolean z14, boolean z15, int i14, int i15, int i16) {
        this.f74057b = fVar;
        this.f74058c = z14;
        this.f74059d = z15;
        this.f74060e = i14;
        this.f74061f = i15;
    }
}
