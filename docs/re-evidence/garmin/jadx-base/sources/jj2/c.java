package jj2;

import android.content.Context;
import b21.j0;
import c2.b0;
import c2.j;
import c2.q2;
import c2.s2;
import c2.u;
import c2.u2;
import c2.x2;
import c2.z;
import com.garmin.android.apps.connectmobile.R;
import com.garmin.android.apps.connectmobile.map.GCMMapView;
import com.garmin.android.apps.connectmobile.multidayactivities.presentation.details.MultiDayActivitiesDetailActivity;
import com.garmin.android.apps.ui.catalog.PreviewCatalogActivity;
import com.garmin.customermanagementlib.ui.CustomerManagementLibMainActivity;
import com.garmin.proto.generated.GDIInReachMessaging;
import e23.l;
import e23.p;
import f5.z0;
import g6.f;
import gl1.y;
import h4.k;
import h4.r;
import h5.e0;
import h5.g;
import hk1.a0;
import i3.d6;
import i3.fe;
import i3.mh;
import i53.e;
import i71.w;
import j20.x;
import java.util.List;
import jy0.d0;
import k11.o;
import k2.i;
import ky0.s0;
import ky0.w0;
import l72.h3;
import l72.i3;
import l72.u0;
import lc.m0;
import lc.v0;
import m4.q;
import o4.m1;
import o4.t1;
import p005kotlin.Unit;
import p005kotlin.jvm.internal.s;
import p006l2.a2;
import p006l2.z1;
import p3.b4;
import p3.i2;
import p3.m;
import p3.n;
import p3.p0;
import p3.p1;
import p3.x1;
import p3.x3;
import s5.x0;
import v.h;
import v62.n3;
import x5.f0;
import x5.l0;
import x5.v;

/* JADX INFO: loaded from: classes11.dex */
public final /* synthetic */ class c implements p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f98969a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f98970b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f98971c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Object f98972d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ Object f98973e;

    public /* synthetic */ c(i53.c cVar, i53.c cVar2, String str, l lVar) {
        this.f98969a = 19;
        this.f98971c = cVar;
        this.f98972d = cVar2;
        this.f98970b = str;
        this.f98973e = lVar;
    }

    /* JADX WARN: Code duplicated, block: B:45:0x01f0  */
    private final Object a(Object obj, Object obj2) {
        r rVar = (r) this.f98970b;
        q qVar = (q) this.f98971c;
        l lVar = (l) this.f98972d;
        l0 l0Var = (l0) this.f98973e;
        m mVar = (m) obj;
        int iIntValue = ((Integer) obj2).intValue();
        if (mVar.n(iIntValue & 1, (iIntValue & 3) != 2)) {
            x1 x1Var = n.f135158a;
            f.a aVar = f.f75994b;
            r rVarH = x2.h(rVar, 48);
            float f14 = 1;
            d92.b.f58623a.getClass();
            long jD = d92.b.a(mVar).j().d();
            d92.b.f58625c.getClass();
            r rVarB = u1.q.b(f14, jD, rVarH, i.a(j92.b.f97900c.f97910b));
            long jB = x.b(mVar);
            m1.a aVar2 = m1.f128891a;
            r rVarE = u1.n.e(rVarB, jB, aVar2);
            h4.d.f81522a.getClass();
            z0 z0VarD = c2.q.d(h4.d.a.f81524b, false);
            int iHashCode = Long.hashCode(mVar.getU());
            i2 i2VarX = mVar.x();
            r rVarC = k.c(rVarE, mVar);
            g.V.getClass();
            e0.a aVar3 = g.a.f81805b;
            if (mVar.F() == null) {
                p0.l();
                throw null;
            }
            mVar.z();
            if (mVar.getT()) {
                mVar.M(aVar3);
            } else {
                mVar.c();
            }
            g.a.e eVar = g.a.f81810g;
            b4.c(eVar, z0VarD, mVar);
            g.a.C1623g c1623g = g.a.f81809f;
            b4.c(c1623g, i2VarX, mVar);
            g.a.b bVar = g.a.f81813j;
            if (mVar.getT() || !s.g(mVar.q(), Integer.valueOf(iHashCode))) {
                h.z(iHashCode, mVar, iHashCode, bVar);
            }
            g.a.f fVar = g.a.f81807d;
            b4.c(fVar, rVarC, mVar);
            u uVar = u.f22885a;
            r.a aVar4 = r.S;
            r rVarD = x2.d(aVar4, 1.0f);
            h4.g.b bVar2 = h4.d.a.f81534l;
            j.f22691a.getClass();
            s2 s2VarA = q2.a(j.f22698h, bVar2, mVar, 54);
            int iHashCode2 = Long.hashCode(mVar.getU());
            i2 i2VarX2 = mVar.x();
            r rVarC2 = k.c(rVarD, mVar);
            if (mVar.F() == null) {
                p0.l();
                throw null;
            }
            mVar.z();
            if (mVar.getT()) {
                mVar.M(aVar3);
            } else {
                mVar.c();
            }
            b4.c(eVar, s2VarA, mVar);
            b4.c(c1623g, i2VarX2, mVar);
            if (mVar.getT() || !s.g(mVar.q(), Integer.valueOf(iHashCode2))) {
                h.z(iHashCode2, mVar, iHashCode2, bVar);
            }
            b4.c(fVar, rVarC2, mVar);
            r rVarC3 = x2.c(u2.f22900a.a(aVar4, 1.0f, true), 1.0f);
            z0 z0VarD2 = c2.q.d(h4.d.a.f81528f, false);
            int iHashCode3 = Long.hashCode(mVar.getU());
            i2 i2VarX3 = mVar.x();
            r rVarC4 = k.c(rVarC3, mVar);
            if (mVar.F() == null) {
                p0.l();
                throw null;
            }
            mVar.z();
            if (mVar.getT()) {
                mVar.M(aVar3);
            } else {
                mVar.c();
            }
            b4.c(eVar, z0VarD2, mVar);
            b4.c(c1623g, i2VarX3, mVar);
            if (mVar.getT() || !s.g(mVar.q(), Integer.valueOf(iHashCode3))) {
                h.z(iHashCode3, mVar, iHashCode3, bVar);
            }
            b4.c(fVar, rVarC4, mVar);
            d92.b.f58624b.getClass();
            x0 x0VarB = d92.c.b(j92.f.f97931h, mVar);
            long jA = zl.a.a(mVar);
            d6.h.f57752b.getClass();
            x0 x0VarA = x0.a(x0VarB, jA, 0L, null, null, 0L, null, null, d6.h.f57755e, 0L, null, null, 16744446);
            t1 t1Var = new t1(ds.e0.e(mVar), null);
            v.f188954b.getClass();
            a2 a2Var = new a2(0, (Boolean) null, v.f188962j, 0, (f0) null, (Boolean) null, (z5.c) null, 123, (p005kotlin.jvm.internal.j) null);
            boolean zR = mVar.r(qVar) | mVar.B(lVar) | mVar.B(l0Var);
            Object objQ = mVar.q();
            if (zR) {
                objQ = new ls0.h(qVar, 10, lVar, l0Var);
                mVar.K(objQ);
            } else {
                m.f135153a.getClass();
                if (objQ == m.a.f135155b) {
                    objQ = new ls0.h(qVar, 10, lVar, l0Var);
                    mVar.K(objQ);
                }
            }
            z1 z1Var = new z1((l) objQ, null, null, null, null, null, 62, null);
            r rVarC5 = x2.c(x2.f(aVar4, 1.0f), 1.0f);
            n21.a.f122359a.getClass();
            p006l2.r.c(l0Var, lVar, rVarC5, false, false, x0VarA, a2Var, z1Var, true, 0, 0, null, null, null, t1Var, n21.a.f122360b, mVar, 102236544, 196608, 15896);
            mVar.y();
            c2.q.a(u1.n.e(x2.u(x2.c(aVar4, 1.0f), f14), d92.b.a(mVar).j().c(), aVar2), mVar, 0);
            mh.c(y.Q(mVar, R.string.percent_sign), x2.x(x2.c(c2.l.A(aVar4, j92.b.f97899b.f97918c, 0.0f, 2), 1.0f), bVar2, 2), com.nimbusds.jose.shaded.gson.internal.a.x(mVar), null, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, null, mVar, 0, 0, 262136);
            mVar.y();
            mVar.y();
        } else {
            mVar.e();
        }
        return Unit.INSTANCE;
    }

    /* JADX WARN: Code duplicated, block: B:112:0x03d4  */
    /* JADX WARN: Code duplicated, block: B:117:0x041c  */
    /* JADX WARN: Code duplicated, block: B:133:0x049f  */
    /* JADX WARN: Code duplicated, block: B:153:0x054c  */
    /* JADX WARN: Code duplicated, block: B:175:0x062e  */
    /* JADX WARN: Code duplicated, block: B:20:0x00a2  */
    /* JADX WARN: Code duplicated, block: B:229:0x0893  */
    /* JADX WARN: Code duplicated, block: B:253:0x0983  */
    /* JADX WARN: Code duplicated, block: B:258:0x09a1  */
    /* JADX WARN: Code duplicated, block: B:25:0x00be  */
    /* JADX WARN: Code duplicated, block: B:278:0x0a32  */
    /* JADX WARN: Code duplicated, block: B:30:0x00e0  */
    /* JADX WARN: Code duplicated, block: B:46:0x0162  */
    /* JADX WARN: Code duplicated, block: B:91:0x02f9  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r6v52, types: [java.lang.Object, o13.l] */
    @Override // e23.p
    public final Object invoke(Object obj, Object obj2) {
        m0 m0Var;
        m mVar;
        Object obj3;
        int i14 = this.f98969a;
        int i15 = 7;
        m.a aVar = m.f135153a;
        int i16 = 2;
        boolean z14 = false;
        int i17 = 1;
        Object obj4 = this.f98971c;
        Object obj5 = this.f98973e;
        Object obj6 = this.f98972d;
        Object obj7 = this.f98970b;
        switch (i14) {
            case 0:
                String str = (String) obj7;
                String str2 = (String) obj4;
                String str3 = (String) obj6;
                CustomerManagementLibMainActivity customerManagementLibMainActivity = (CustomerManagementLibMainActivity) obj5;
                m mVar2 = (m) obj;
                int iIntValue = ((Integer) obj2).intValue();
                CustomerManagementLibMainActivity.a aVar2 = CustomerManagementLibMainActivity.f50711h;
                if (mVar2.n(iIntValue & 1, (iIntValue & 3) != 2)) {
                    x1 x1Var = n.f135158a;
                    m0 m0VarI = y.I(new v0[0], mVar2);
                    boolean zR = mVar2.r(m0VarI) | mVar2.B(str2) | mVar2.B(str3) | mVar2.r(customerManagementLibMainActivity);
                    Object objQ = mVar2.q();
                    if (zR) {
                        m0Var = m0VarI;
                        objQ = new ev2.f(m0Var, str2, str3, customerManagementLibMainActivity, 18);
                        mVar2.K(objQ);
                    } else {
                        aVar.getClass();
                        if (objQ == m.a.f135155b) {
                            m0Var = m0VarI;
                            objQ = new ev2.f(m0Var, str2, str3, customerManagementLibMainActivity, 18);
                            mVar2.K(objQ);
                        } else {
                            m0Var = m0VarI;
                        }
                    }
                    nc.y.b(m0Var, str, null, null, null, null, null, null, (l) objQ, mVar2, 0, 1020);
                } else {
                    mVar2.e();
                }
                return Unit.INSTANCE;
            case 1:
                ((Integer) obj2).getClass();
                jk1.b.a((hk1.r) obj7, (hk1.c) obj4, (e23.a) obj6, (e23.a) obj5, (m) obj, p0.t(1));
                return Unit.INSTANCE;
            case 2:
                hk1.r rVar = (hk1.r) obj4;
                hk1.c cVar = (hk1.c) obj6;
                jk1.f fVar = (jk1.f) obj5;
                String str4 = (String) obj7;
                m mVar3 = (m) obj;
                int iIntValue2 = ((Integer) obj2).intValue();
                if (mVar3.n(iIntValue2 & 1, (iIntValue2 & 3) != 2)) {
                    x1 x1Var2 = n.f135158a;
                    boolean zR2 = mVar3.r(rVar) | mVar3.r(fVar) | mVar3.B(str4);
                    Object objQ2 = mVar3.q();
                    if (zR2) {
                        objQ2 = new d6(rVar, str4, 21, fVar);
                        mVar3.K(objQ2);
                    } else {
                        aVar.getClass();
                        if (objQ2 == m.a.f135155b) {
                            objQ2 = new d6(rVar, str4, 21, fVar);
                            mVar3.K(objQ2);
                        }
                    }
                    e23.a aVar3 = (e23.a) objQ2;
                    boolean zR3 = mVar3.r(fVar);
                    Object objQ3 = mVar3.q();
                    if (zR3) {
                        objQ3 = new jk1.a(fVar, 0);
                        mVar3.K(objQ3);
                    } else {
                        aVar.getClass();
                        if (objQ3 == m.a.f135155b) {
                            objQ3 = new jk1.a(fVar, 0);
                            mVar3.K(objQ3);
                        }
                    }
                    jk1.b.a(rVar, cVar, aVar3, (e23.a) objQ3, mVar3, 0);
                } else {
                    mVar3.e();
                }
                return Unit.INSTANCE;
            case 3:
                ((Integer) obj2).getClass();
                jv0.j.a((gv0.d) obj7, (l) obj4, (e23.a) obj6, (e23.a) obj5, (m) obj, p0.t(1));
                return Unit.INSTANCE;
            case 4:
                ((Integer) obj2).getClass();
                d0.b((i53.c) obj7, (e) obj4, (e23.a) obj6, (l) obj5, (m) obj, p0.t(1));
                return Unit.INSTANCE;
            case 5:
                ((Integer) obj2).getClass();
                k11.m.g((b11.i.a) obj7, (v21.e) obj4, (l11.a.b) obj6, (l) obj5, (m) obj, p0.t(1));
                return Unit.INSTANCE;
            case 6:
                ((Integer) obj2).getClass();
                k11.s.c((r) obj4, (List) obj6, (String) obj7, (l) obj5, (m) obj, p0.t(1));
                return Unit.INSTANCE;
            case 7:
                p1 p1Var = (p1) obj7;
                l11.k kVar = (l11.k) obj4;
                e23.a aVar4 = (e23.a) obj6;
                p1 p1Var2 = (p1) obj5;
                m mVar4 = (m) obj;
                int iIntValue3 = ((Integer) obj2).intValue();
                if (mVar4.n(iIntValue3 & 1, (iIntValue3 & 3) != 2)) {
                    x1 x1Var3 = n.f135158a;
                    boolean zB = mVar4.B(p1Var) | mVar4.r(kVar) | mVar4.B(aVar4);
                    Object objQ4 = mVar4.q();
                    if (zB) {
                        o oVar = new o(p1Var, p1Var2, kVar, aVar4, 2);
                        mVar4.K(oVar);
                        objQ4 = oVar;
                    } else {
                        aVar.getClass();
                        if (objQ4 == m.a.f135155b) {
                            o oVar2 = new o(p1Var, p1Var2, kVar, aVar4, 2);
                            mVar4.K(oVar2);
                            objQ4 = oVar2;
                        }
                    }
                    u0.a(null, null, null, null, (e23.a) objQ4, mVar4, 0, 15);
                } else {
                    mVar4.e();
                }
                return Unit.INSTANCE;
            case 8:
                ((Integer) obj2).getClass();
                k3.e.b((z3.e) obj4, (String) obj7, (k3.f) obj6, (p) obj5, (m) obj, p0.t(3079));
                return Unit.INSTANCE;
            case 9:
                String str5 = (String) obj7;
                w wVar = (w) obj6;
                String str6 = (String) obj4;
                com.garmin.android.apps.connectmobile.performance.model.b bVar = (com.garmin.android.apps.connectmobile.performance.model.b) obj5;
                m mVar5 = (m) obj;
                int iIntValue4 = ((Integer) obj2).intValue();
                if (mVar5.n(iIntValue4 & 1, (iIntValue4 & 3) != 2)) {
                    x1 x1Var4 = n.f135158a;
                    r.a aVar5 = r.S;
                    r rVarD = x2.d(aVar5, 1.0f);
                    boolean zB2 = mVar5.B(str5);
                    Object objQ5 = mVar5.q();
                    if (zB2) {
                        objQ5 = new jl0.e(str5, i15);
                        mVar5.K(objQ5);
                    } else {
                        aVar.getClass();
                        if (objQ5 == m.a.f135155b) {
                            objQ5 = new jl0.e(str5, i15);
                            mVar5.K(objQ5);
                        }
                    }
                    r rVarC = p5.v.c((l) objQ5, rVarD, false);
                    j.f22691a.getClass();
                    j.k kVar2 = j.f22694d;
                    h4.d.f81522a.getClass();
                    h4.g.a aVar6 = h4.d.a.f81536n;
                    z zVarA = c2.y.a(kVar2, aVar6, mVar5, 0);
                    int iHashCode = Long.hashCode(mVar5.getU());
                    i2 i2VarX = mVar5.x();
                    r rVarC2 = k.c(rVarC, mVar5);
                    g.V.getClass();
                    e0.a aVar7 = g.a.f81805b;
                    if (mVar5.F() == null) {
                        p0.l();
                        throw null;
                    }
                    mVar5.z();
                    if (mVar5.getT()) {
                        mVar5.M(aVar7);
                    } else {
                        mVar5.c();
                    }
                    g.a.e eVar = g.a.f81810g;
                    b4.c(eVar, zVarA, mVar5);
                    g.a.C1623g c1623g = g.a.f81809f;
                    b4.c(c1623g, i2VarX, mVar5);
                    g.a.b bVar2 = g.a.f81813j;
                    if (mVar5.getT() || !s.g(mVar5.q(), Integer.valueOf(iHashCode))) {
                        h.z(iHashCode, mVar5, iHashCode, bVar2);
                    }
                    g.a.f fVar2 = g.a.f81807d;
                    b4.c(fVar2, rVarC2, mVar5);
                    b0 b0Var = b0.f22601a;
                    if (wVar == null || wVar.f92011f) {
                        mVar = mVar5;
                        mVar.C(456662003);
                        r rVarA = b0Var.a(x2.f(aVar5, 1.0f), 1.0f, true);
                        z zVarA2 = c2.y.a(kVar2, aVar6, mVar, 0);
                        int iHashCode2 = Long.hashCode(mVar.getU());
                        i2 i2VarX2 = mVar.x();
                        r rVarC3 = k.c(rVarA, mVar);
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
                        b4.c(eVar, zVarA2, mVar);
                        b4.c(c1623g, i2VarX2, mVar);
                        if (mVar.getT() || !s.g(mVar.q(), Integer.valueOf(iHashCode2))) {
                            h.z(iHashCode2, mVar, iHashCode2, bVar2);
                        }
                        b4.c(fVar2, rVarC3, mVar);
                        k71.e.a(null, n5.a.a(mVar, bVar.f39937d), n5.a.a(mVar, bVar.f39936c), bVar.f39940g, yz1.y.f(mVar), mVar, 0);
                        String strQ = y.Q(mVar, bVar.f39938e);
                        d92.b.f58623a.getClass();
                        d92.b.f58625c.getClass();
                        r rVarC4 = c2.l.C(aVar5, 0.0f, j92.b.f97899b.f97917b, 0.0f, 0.0f, 13);
                        d92.b.f58624b.getClass();
                        mh.c(strQ, rVarC4, 0L, null, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, d92.c.b(j92.f.f97930g, mVar), mVar, 0, 0, 131068);
                        mVar.y();
                        if (str6 == null) {
                            mVar.C(457583043);
                            mVar.f();
                        } else {
                            mVar.C(457583044);
                            mh.c(y.P(R.string.lbl_common_since_date, new Object[]{str6}, mVar), null, 0L, null, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, d92.c.f(j92.f.f97933j, mVar), mVar, 0, 0, 131070);
                            mVar.f();
                            Unit unit = Unit.INSTANCE;
                        }
                        mVar.f();
                    } else {
                        mVar5.C(456228127);
                        String strQ2 = y.Q(mVar5, R.string.training_status_card_no_data_state_message);
                        r rVarX = x2.x(aVar5, null, 3);
                        d6.h.f57752b.getClass();
                        d6.h hVarA = d6.h.a(d6.h.f57755e);
                        d92.b.f58623a.getClass();
                        d92.b.f58624b.getClass();
                        g02.c.a(strQ2, rVarX, 0L, hVarA, 0, false, 0, d92.c.f(j92.f.f97933j, mVar5), 0.0d, mVar5, 48, 372);
                        mVar = mVar5;
                        mVar.f();
                    }
                    mVar.y();
                } else {
                    mVar5.e();
                }
                return Unit.INSTANCE;
            case 10:
                ((Integer) obj2).getClass();
                ka0.f.c((r) obj7, (p) obj4, (List) obj6, (p) obj5, (m) obj, p0.t(55));
                return Unit.INSTANCE;
            case 11:
                ((Integer) obj2).getClass();
                kc1.b.c((Integer) obj6, (Float) obj5, (String) obj7, (String) obj4, (m) obj, p0.t(1));
                return Unit.INSTANCE;
            case 12:
                ((Integer) obj2).getClass();
                ki1.k.b((ki1.b) obj7, (e23.a) obj4, (e23.a) obj6, (e23.a) obj5, (m) obj, p0.t(1));
                return Unit.INSTANCE;
            case 13:
                a0 a0Var = (a0) obj7;
                kk1.g gVar = (kk1.g) obj4;
                p1 p1Var3 = (p1) obj6;
                p1 p1Var4 = (p1) obj5;
                boolean z15 = false;
                m mVar6 = (m) obj;
                int iIntValue5 = ((Integer) obj2).intValue();
                if ((iIntValue5 & 3) != 2) {
                    z15 = true;
                }
                if (mVar6.n(iIntValue5 & 1, z15)) {
                    x1 x1Var5 = n.f135158a;
                    if (((kk1.j) p1Var3.getF182175a()).f105167c || ((kk1.j) p1Var3.getF182175a()).f105169e == null || ((kk1.j) p1Var3.getF182175a()).f105168d.isEmpty()) {
                        mVar6.C(716502610);
                        mVar6.f();
                    } else {
                        mVar6.C(715458003);
                        i53.d<hk1.d, Boolean> dVar = ((kk1.j) p1Var3.getF182175a()).f105168d;
                        hk1.c cVar2 = ((kk1.j) p1Var3.getF182175a()).f105169e;
                        boolean zC = gVar.f105150d.c("third_party_apps_logo_in_details_page_enabled");
                        boolean zR4 = mVar6.r(gVar) | mVar6.r(a0Var);
                        Object objQ6 = mVar6.q();
                        if (zR4) {
                            objQ6 = new hv0.d(15, gVar, a0Var);
                            mVar6.K(objQ6);
                        } else {
                            aVar.getClass();
                            if (objQ6 == m.a.f135155b) {
                                objQ6 = new hv0.d(15, gVar, a0Var);
                                mVar6.K(objQ6);
                            }
                        }
                        ik1.b.a(a0Var, dVar, cVar2, zC, (e23.q) objQ6, z3.f.c(1747976478, new jt1.m((Object) a0Var, (Object) p1Var3, (Object) p1Var4, false, 14), mVar6), mVar6, 196608 | a0.f84097n);
                        mVar6.f();
                    }
                } else {
                    mVar6.e();
                }
                return Unit.INSTANCE;
            case 14:
                km0.d dVar2 = (km0.d) obj7;
                m0 m0Var2 = (m0) obj4;
                e23.a aVar8 = (e23.a) obj6;
                e23.a aVar9 = (e23.a) obj5;
                m mVar7 = (m) obj;
                int iIntValue6 = ((Integer) obj2).intValue();
                if (mVar7.n(iIntValue6 & 1, (iIntValue6 & 3) != 2)) {
                    x1 x1Var6 = n.f135158a;
                    String strQ3 = y.Q(mVar7, dVar2.f105313a);
                    boolean zR5 = mVar7.r(m0Var2) | mVar7.B(aVar8);
                    Object objQ7 = mVar7.q();
                    if (zR5) {
                        objQ7 = new dt.b(m0Var2, aVar8, i16);
                        mVar7.K(objQ7);
                    } else {
                        aVar.getClass();
                        if (objQ7 == m.a.f135155b) {
                            objQ7 = new dt.b(m0Var2, aVar8, i16);
                            mVar7.K(objQ7);
                        }
                    }
                    z02.f.c(196608, 22, null, (e23.a) objQ7, z3.f.c(-1283321316, new k41.e(14, dVar2, aVar9), mVar7), strQ3, mVar7, null);
                } else {
                    mVar7.e();
                }
                return Unit.INSTANCE;
            case 15:
                ((Integer) obj2).getClass();
                km0.h.a((km0.i) obj7, (e23.a) obj4, (e23.r) obj6, (e23.a) obj5, (m) obj, p0.t(1));
                return Unit.INSTANCE;
            case 16:
                MultiDayActivitiesDetailActivity multiDayActivitiesDetailActivity = (MultiDayActivitiesDetailActivity) obj7;
                m0 m0Var3 = (m0) obj6;
                p1 p1Var5 = (p1) obj5;
                m mVar8 = (m) obj;
                int iIntValue7 = ((Integer) obj2).intValue();
                MultiDayActivitiesDetailActivity.a aVar10 = MultiDayActivitiesDetailActivity.f39233a;
                if (mVar8.n(iIntValue7 & 1, (iIntValue7 & 3) != 2)) {
                    x1 x1Var7 = n.f135158a;
                    String strQ4 = y.Q(mVar8, R.string.title_course);
                    boolean zR6 = mVar8.r(multiDayActivitiesDetailActivity);
                    ?? r14 = this.f98971c;
                    boolean zR7 = zR6 | mVar8.r(r14) | mVar8.r(m0Var3);
                    Object objQ8 = mVar8.q();
                    if (zR7) {
                        ky0.v vVar = new ky0.v(p1Var5, m0Var3, multiDayActivitiesDetailActivity, r14, 0);
                        mVar8.K(vVar);
                        objQ8 = vVar;
                    } else {
                        aVar.getClass();
                        if (objQ8 == m.a.f135155b) {
                            ky0.v vVar2 = new ky0.v(p1Var5, m0Var3, multiDayActivitiesDetailActivity, r14, 0);
                            mVar8.K(vVar2);
                            objQ8 = vVar2;
                        }
                    }
                    e23.a aVar11 = (e23.a) objQ8;
                    String strQ5 = y.Q(mVar8, R.string.lbl_filter);
                    s62.a.f157643a.getClass();
                    i53.f fVarA = i53.a.a(new i3("MENU_ITEM_FILTER", strQ5, false, n3.a(t62.b.f162798a), (String) null, 20, (p005kotlin.jvm.internal.j) null));
                    boolean zR8 = mVar8.r(m0Var3);
                    Object objQ9 = mVar8.q();
                    if (zR8) {
                        obj3 = objQ9;
                        ky0.w wVar2 = new ky0.w(m0Var3, z14 ? 1 : 0);
                        mVar8.K(wVar2);
                        obj3 = wVar2;
                    } else {
                        aVar.getClass();
                        if (objQ9 == m.a.f135155b) {
                            obj3 = objQ9;
                            ky0.w wVar3 = new ky0.w(m0Var3, z14 ? 1 : 0);
                            mVar8.K(wVar3);
                            obj3 = wVar3;
                        }
                    }
                    obj3 = objQ9;
                    z02.f.d(strQ4, null, null, aVar11, fVarA, null, (l) obj3, mVar8, GDIInReachMessaging.Capabilities.MessagingCapability.PLAN_CHANGE_VALUE, 86);
                } else {
                    mVar8.e();
                }
                return Unit.INSTANCE;
            case 17:
                GCMMapView gCMMapView = (GCMMapView) obj7;
                Context context = (Context) obj4;
                sy0.k kVar3 = (sy0.k) obj6;
                p1 p1Var6 = (p1) obj5;
                m mVar9 = (m) obj;
                int iIntValue8 = ((Integer) obj2).intValue();
                if (mVar9.n(1 & iIntValue8, (iIntValue8 & 3) != 2)) {
                    x1 x1Var8 = n.f135158a;
                    r.a aVar12 = r.S;
                    r rVarF = x2.f(aVar12, 1.0f);
                    h4.d.f81522a.getClass();
                    z0 z0VarD = c2.q.d(h4.d.a.f81524b, false);
                    int iHashCode3 = Long.hashCode(mVar9.getU());
                    i2 i2VarX3 = mVar9.x();
                    r rVarC5 = k.c(rVarF, mVar9);
                    g.V.getClass();
                    e0.a aVar13 = g.a.f81805b;
                    if (mVar9.F() == null) {
                        p0.l();
                        throw null;
                    }
                    mVar9.z();
                    if (mVar9.getT()) {
                        mVar9.M(aVar13);
                    } else {
                        mVar9.c();
                    }
                    b4.c(g.a.f81810g, z0VarD, mVar9);
                    b4.c(g.a.f81809f, i2VarX3, mVar9);
                    g.a.b bVar3 = g.a.f81813j;
                    if (mVar9.getT() || !s.g(mVar9.q(), Integer.valueOf(iHashCode3))) {
                        h.z(iHashCode3, mVar9, iHashCode3, bVar3);
                    }
                    b4.c(g.a.f81807d, rVarC5, mVar9);
                    u uVar = u.f22885a;
                    boolean zR9 = mVar9.r(context) | mVar9.B(kVar3);
                    Object objQ10 = mVar9.q();
                    if (zR9) {
                        objQ10 = new k11.h(17, context, kVar3);
                        mVar9.K(objQ10);
                    } else {
                        aVar.getClass();
                        if (objQ10 == m.a.f135155b) {
                            objQ10 = new k11.h(17, context, kVar3);
                            mVar9.K(objQ10);
                        }
                    }
                    ly0.q.a(gCMMapView, (e23.a) objQ10, null, null, mVar9, GCMMapView.f38734k, 12);
                    if (((Boolean) p1Var6.getF182175a()).booleanValue()) {
                        mVar9.C(-1922641118);
                        d92.b.f58623a.getClass();
                        d92.b.f58625c.getClass();
                        r rVarC6 = uVar.c(c2.l.C(aVar12, 0.0f, 0.0f, 0.0f, j92.b.f97899b.f97917b, 7), h4.d.a.f81531i);
                        j82.f fVar3 = new j82.f(y.Q(mVar9, R.string.title_course), null, null, 6, null);
                        gl.c.f77766a.getClass();
                        j82.e.k(0, rVarC6, i53.a.j(p13.w.c(j82.e.y(fVar3, gl.c.a(mVar9).q()))), mVar9);
                        mVar9.f();
                    } else {
                        mVar9.C(-1922132532);
                        mVar9.f();
                    }
                    mVar9.y();
                } else {
                    mVar9.e();
                }
                return Unit.INSTANCE;
            case 18:
                ((Integer) obj2).getClass();
                s0.a((w0) obj7, (e23.a) obj4, (e23.a) obj6, (e23.a) obj5, (m) obj, p0.t(1));
                return Unit.INSTANCE;
            case 19:
                i53.c cVar3 = (i53.c) obj4;
                i53.c cVar4 = (i53.c) obj6;
                String str7 = (String) obj7;
                l lVar = (l) obj5;
                m mVar10 = (m) obj;
                int iIntValue9 = ((Integer) obj2).intValue();
                if (mVar10.n(iIntValue9 & 1, (iIntValue9 & 3) != 2)) {
                    x1 x1Var9 = n.f135158a;
                    h3.a(null, cVar3, cVar4, str7, lVar, mVar10, 0);
                } else {
                    mVar10.e();
                }
                return Unit.INSTANCE;
            case 20:
                ((Integer) obj2).getClass();
                ll0.c.b((ll0.f) obj7, (e23.a) obj4, (l) obj6, (e23.a) obj5, (m) obj, p0.t(1));
                return Unit.INSTANCE;
            case 21:
                ((Integer) obj2).getClass();
                ll1.i.c((ll1.m) obj7, (e23.a) obj4, (gl1.a) obj6, (j0) obj5, (m) obj, p0.t(1));
                return Unit.INSTANCE;
            case 22:
                ((Integer) obj2).getClass();
                lw1.l.a((fe) obj7, (e23.a) obj4, (e23.a) obj6, (e23.a) obj5, (m) obj, p0.t(7));
                return Unit.INSTANCE;
            case 23:
                ((Integer) obj2).getClass();
                ly0.q.b((ly0.s) obj4, (String) obj7, (ly0.r) obj6, (e23.a) obj5, (m) obj, p0.t(1));
                return Unit.INSTANCE;
            case 24:
                PreviewCatalogActivity previewCatalogActivity = (PreviewCatalogActivity) obj7;
                m72.i iVar = (m72.i) obj4;
                p1 p1Var7 = (p1) obj6;
                x72.o oVar3 = (x72.o) obj5;
                m mVar11 = (m) obj;
                int iIntValue10 = ((Integer) obj2).intValue();
                int i18 = PreviewCatalogActivity.f49781a;
                if (mVar11.n(iIntValue10 & 1, (iIntValue10 & 3) != 2)) {
                    x1 x1Var10 = n.f135158a;
                    x72.e eVar2 = (x72.e) p1Var7.getF182175a();
                    boolean zB3 = mVar11.B(p1Var7) | mVar11.r(oVar3);
                    Object objQ11 = mVar11.q();
                    if (zB3) {
                        objQ11 = new l3.p1(26, oVar3, p1Var7);
                        mVar11.K(objQ11);
                    } else {
                        aVar.getClass();
                        if (objQ11 == m.a.f135155b) {
                            objQ11 = new l3.p1(26, oVar3, p1Var7);
                            mVar11.K(objQ11);
                        }
                    }
                    previewCatalogActivity.K9(eVar2, iVar, (l) objQ11, mVar11, 0);
                } else {
                    mVar11.e();
                }
                return Unit.INSTANCE;
            case 25:
                ((Integer) obj2).getClass();
                int i19 = PreviewCatalogActivity.f49781a;
                ((PreviewCatalogActivity) obj7).K9((x72.e) obj4, (m72.i) obj6, (l) obj5, (m) obj, p0.t(1));
                return Unit.INSTANCE;
            case 26:
                ml0.p pVar = (ml0.p) obj7;
                l lVar2 = (l) obj4;
                p1 p1Var8 = (p1) obj6;
                x3 x3Var = (x3) obj5;
                m mVar12 = (m) obj;
                int iIntValue11 = ((Integer) obj2).intValue();
                if (mVar12.n(iIntValue11 & 1, (iIntValue11 & 3) != 2)) {
                    x1 x1Var11 = n.f135158a;
                    ml0.l lVar3 = (ml0.l) x3Var.getF182175a();
                    boolean zR10 = mVar12.r(pVar);
                    Object objQ12 = mVar12.q();
                    if (zR10) {
                        objQ12 = new ml0.c(pVar, i17);
                        mVar12.K(objQ12);
                    } else {
                        aVar.getClass();
                        if (objQ12 == m.a.f135155b) {
                            objQ12 = new ml0.c(pVar, i17);
                            mVar12.K(objQ12);
                        }
                    }
                    l lVar4 = (l) objQ12;
                    boolean zR11 = mVar12.r(pVar);
                    Object objQ13 = mVar12.q();
                    if (zR11) {
                        objQ13 = new ml0.d(pVar, z14 ? 1 : 0);
                        mVar12.K(objQ13);
                    } else {
                        aVar.getClass();
                        if (objQ13 == m.a.f135155b) {
                            objQ13 = new ml0.d(pVar, z14 ? 1 : 0);
                            mVar12.K(objQ13);
                        }
                    }
                    e23.a aVar14 = (e23.a) objQ13;
                    boolean zB4 = mVar12.B(p1Var8) | mVar12.r(pVar);
                    Object objQ14 = mVar12.q();
                    if (zB4) {
                        objQ14 = new ml0.e(z14 ? 1 : 0, pVar, p1Var8);
                        mVar12.K(objQ14);
                    } else {
                        aVar.getClass();
                        if (objQ14 == m.a.f135155b) {
                            objQ14 = new ml0.e(z14 ? 1 : 0, pVar, p1Var8);
                            mVar12.K(objQ14);
                        }
                    }
                    ml0.h.h(lVar3, lVar4, aVar14, lVar2, (l) objQ14, mVar12, 0);
                } else {
                    mVar12.e();
                }
                return Unit.INSTANCE;
            case 27:
                return a(obj, obj2);
            case 28:
                ((Integer) obj2).getClass();
                n40.k.a((m40.h) obj7, (l) obj4, (l) obj6, (l) obj5, (m) obj, p0.t(1));
                return Unit.INSTANCE;
            default:
                ((Integer) obj2).getClass();
                n62.b.d((n62.c) obj7, (m52.k) obj4, (e23.a) obj6, (l) obj5, (m) obj, p0.t(1));
                return Unit.INSTANCE;
        }
    }

    public /* synthetic */ c(hk1.r rVar, hk1.c cVar, jk1.f fVar, String str) {
        this.f98969a = 2;
        this.f98971c = rVar;
        this.f98972d = cVar;
        this.f98973e = fVar;
        this.f98970b = str;
    }

    public /* synthetic */ c(r rVar, List list, String str, l lVar, int i14) {
        this.f98969a = 6;
        this.f98971c = rVar;
        this.f98972d = list;
        this.f98970b = str;
        this.f98973e = lVar;
    }

    public /* synthetic */ c(Integer num, Float f14, String str, String str2, int i14) {
        this.f98969a = 11;
        this.f98972d = num;
        this.f98973e = f14;
        this.f98970b = str;
        this.f98971c = str2;
    }

    public /* synthetic */ c(Object obj, Object obj2, Object obj3, Object obj4, int i14) {
        this.f98969a = i14;
        this.f98970b = obj;
        this.f98971c = obj2;
        this.f98972d = obj3;
        this.f98973e = obj4;
    }

    public /* synthetic */ c(Object obj, Object obj2, Object obj3, o13.h hVar, int i14, int i15) {
        this.f98969a = i15;
        this.f98970b = obj;
        this.f98971c = obj2;
        this.f98972d = obj3;
        this.f98973e = hVar;
    }

    public /* synthetic */ c(Object obj, String str, Object obj2, o13.h hVar, int i14, int i15) {
        this.f98969a = i15;
        this.f98971c = obj;
        this.f98970b = str;
        this.f98972d = obj2;
        this.f98973e = hVar;
    }

    public /* synthetic */ c(String str, w wVar, String str2, com.garmin.android.apps.connectmobile.performance.model.b bVar) {
        this.f98969a = 9;
        this.f98970b = str;
        this.f98972d = wVar;
        this.f98971c = str2;
        this.f98973e = bVar;
    }
}
