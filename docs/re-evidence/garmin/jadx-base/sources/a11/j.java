package a11;

import android.content.Context;
import b82.a1;
import b82.g1;
import b82.k1;
import b82.l0;
import c2.c3;
import c2.k3;
import c2.l1;
import c2.n3;
import c2.p3;
import c2.q2;
import c2.q3;
import c2.s2;
import c2.u2;
import c2.x2;
import c22.o2;
import c80.s0;
import com.airbnb.lottie.RenderMode;
import com.garmin.android.apps.connectmobile.R;
import com.garmin.android.apps.connectmobile.g3;
import com.garmin.android.apps.connectmobile.gear.presentation.GearActivity;
import e2.k0;
import f5.z0;
import i3.fe;
import i3.mc;
import i3.mh;
import i3.o1;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.m3;
import l72.r1;
import l72.w1;
import l72.y2;
import o4.m1;
import org.koin.java.KoinJavaComponent;
import p005kotlin.Unit;
import p005kotlin.jvm.internal.n0;
import p005kotlin.jvm.internal.r0;
import p006l2.z1;
import p3.b4;
import p3.i2;
import p3.n1;
import p3.p0;
import p3.p1;
import p3.x1;
import p3.x3;
import s5.x0;
import sg0.w0;
import sk0.q0;
import u1.a2;
import xd2.m0;

/* JADX INFO: loaded from: classes9.dex */
public final /* synthetic */ class j implements e23.p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f314a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f315b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f316c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Object f317d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ Object f318e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ Object f319f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final /* synthetic */ Object f320g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final /* synthetic */ Object f321h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final /* synthetic */ Object f322i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final /* synthetic */ Object f323j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final /* synthetic */ Object f324k;

    public /* synthetic */ j(jk0.x xVar, q0 q0Var, bv.d dVar, e23.p pVar, e23.l lVar, e23.q qVar, e23.q qVar2, e23.l lVar2, e23.l lVar3, GearActivity.w wVar, int i14) {
        this.f314a = 13;
        this.f316c = xVar;
        this.f317d = q0Var;
        this.f318e = dVar;
        this.f320g = pVar;
        this.f319f = lVar;
        this.f321h = qVar;
        this.f322i = qVar2;
        this.f323j = lVar2;
        this.f324k = lVar3;
        this.f315b = wVar;
    }

    private final Object a(Object obj, Object obj2) {
        ((Integer) obj2).getClass();
        l21.b.a((m21.e) this.f316c, (v21.e) this.f317d, (h4.r) this.f318e, (e23.a) this.f315b, (e23.l) this.f319f, (e23.l) this.f320g, (e23.l) this.f321h, (e23.a) this.f322i, (e23.a) this.f323j, (e23.l) this.f324k, (p3.m) obj, p0.t(385));
        return Unit.INSTANCE;
    }

    /* JADX WARN: Code duplicated, block: B:105:0x0477  */
    /* JADX WARN: Code duplicated, block: B:115:0x0350 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:118:0x0340 A[ADDED_TO_REGION, REMOVE, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:46:0x01fb  */
    /* JADX WARN: Code duplicated, block: B:51:0x0251  */
    /* JADX WARN: Code duplicated, block: B:76:0x0326  */
    /* JADX WARN: Code duplicated, block: B:81:0x033b  */
    /* JADX WARN: Code duplicated, block: B:84:0x0346  */
    private final Object b(Object obj, Object obj2) {
        p3.m mVar;
        int i14;
        int i15;
        int i16;
        float f14;
        i53.d dVar;
        x3 x3Var;
        Iterable iterable;
        Iterator it;
        int i17;
        String strH;
        p1 p1Var = (p1) this.f321h;
        p1 p1Var2 = (p1) this.f316c;
        p1 p1Var3 = (p1) this.f317d;
        x3 x3Var2 = (x3) this.f318e;
        i53.d dVar2 = (i53.d) this.f319f;
        p1 p1Var4 = (p1) this.f320g;
        Context context = (Context) this.f322i;
        x3 x3Var3 = (x3) this.f323j;
        p1 p1Var5 = (p1) this.f324k;
        p1 p1Var6 = (p1) this.f315b;
        p3.m mVar2 = (p3.m) obj;
        int iIntValue = ((Integer) obj2).intValue();
        if (mVar2.n(iIntValue & 1, (iIntValue & 3) != 2)) {
            x1 x1Var = p3.n.f135158a;
            h4.r.a aVar = h4.r.S;
            c2.j.f22691a.getClass();
            c2.j.k kVar = c2.j.f22694d;
            h4.d.f81522a.getClass();
            c2.z zVarA = c2.y.a(kVar, h4.d.a.f81536n, mVar2, 0);
            int iHashCode = Long.hashCode(mVar2.getU());
            i2 i2VarX = mVar2.x();
            h4.r rVarC = h4.k.c(aVar, mVar2);
            h5.g.V.getClass();
            h5.e0.a aVar2 = h5.g.a.f81805b;
            if (mVar2.F() == null) {
                p0.l();
                throw null;
            }
            mVar2.z();
            if (mVar2.getT()) {
                mVar2.M(aVar2);
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
            i53.c cVarE = i53.a.e((Iterable) p1Var.getF182175a());
            boolean zL = p13.h0.L(cVarE);
            p3.m.a aVar3 = p3.m.f135153a;
            if (zL) {
                mVar2.C(478137629);
                d92.b.f58623a.getClass();
                d92.b.f58625c.getClass();
                j92.e eVar = j92.b.f97899b;
                h4.r rVarC2 = c2.l.C(aVar, 0.0f, eVar.f97920e, 0.0f, 0.0f, 13);
                e2.i0 i0VarA = k0.a(0, 0, 3, mVar2);
                int i18 = k3.f22728a;
                c3 c3VarB = q3.b(mVar2);
                p3.f22815b.getClass();
                c2.x1 x1VarD = n3.d(c3VarB, p3.f22826m);
                float f15 = eVar.f97920e;
                l1 l1VarC = n3.c(new c2.a(x1VarD, n3.b(f15, 0.0f, f15, 0.0f, 10)), mVar2);
                qk0.a aVar4 = new qk0.a(2);
                Object objQ = mVar2.q();
                aVar3.getClass();
                p3.m.a.C2565a c2565a = p3.m.a.f135155b;
                if (objQ == c2565a) {
                    objQ = new qc.c(10);
                    mVar2.K(objQ);
                }
                e23.l lVar = (e23.l) objQ;
                boolean zB = mVar2.B(p1Var);
                Object objQ2 = mVar2.q();
                if (zB || objQ2 == c2565a) {
                    objQ2 = new pp.b(p1Var, 5);
                    mVar2.K(objQ2);
                }
                i16 = 2;
                i14 = 0;
                i15 = 1;
                e82.a.c(cVarE, aVar4, i0VarA, rVarC2, lVar, l1VarC, (e23.l) objQ2, mVar2, 24576, 0);
                mVar = mVar2;
                mVar.f();
            } else {
                mVar = mVar2;
                i14 = 0;
                i15 = 1;
                i16 = 2;
                mVar.C(479082726);
                mVar.f();
            }
            mVar.C(-1508564553);
            w13.c<qk0.s> cVar = qk0.s.f145153d;
            ArrayList arrayList = new ArrayList(p13.y.r(cVar, 10));
            for (qk0.s sVar : cVar) {
                sVar.getClass();
                x1 x1Var2 = p3.n.f135158a;
                int i19 = qk0.s.a.f145154a[sVar.ordinal()];
                if (i19 == i15) {
                    strH = sn.a.h(mVar, 2081971022, R.string.lbl_all_activities, mVar);
                } else {
                    if (i19 != i16) {
                        throw n23.j.m(mVar, 2081970071);
                    }
                    strH = sn.a.h(mVar, 2081973192, R.string.lbl_selected, mVar);
                }
                arrayList.add(new g1(strH, null, null, null, 14, null));
                i15 = 1;
            }
            mVar.f();
            i53.c cVarE2 = i53.a.e(arrayList);
            Object[] objArr = new Object[i14];
            boolean zR = mVar.r(cVarE2);
            Object objQ3 = mVar.q();
            if (zR) {
                objQ3 = new m82.a(cVarE2, i16);
                mVar.K(objQ3);
            } else {
                aVar3.getClass();
                if (objQ3 == p3.m.a.f135155b) {
                    objQ3 = new m82.a(cVarE2, i16);
                    mVar.K(objQ3);
                }
            }
            n1 n1Var = (n1) d4.a.e(objArr, (e23.a) objQ3, mVar, i14);
            h4.r.a aVar5 = h4.r.S;
            d92.b.f58623a.getClass();
            d92.b.f58625c.getClass();
            j92.e eVar2 = j92.b.f97899b;
            h4.r rVarC3 = c2.l.C(c2.l.A(aVar5, eVar2.f97920e, 0.0f, i16), 0.0f, eVar2.f97920e, 0.0f, 0.0f, 13);
            int intValue = n1Var.getIntValue();
            boolean zB2 = mVar.B(p1Var2) | mVar.B(p1Var3) | mVar.B(n1Var);
            Object objQ4 = mVar.q();
            if (zB2) {
                objQ4 = new qk0.l(p1Var2, p1Var3, n1Var);
                mVar.K(objQ4);
            } else {
                aVar3.getClass();
                if (objQ4 == p3.m.a.f135155b) {
                    objQ4 = new qk0.l(p1Var2, p1Var3, n1Var);
                    mVar.K(objQ4);
                }
            }
            p3.m mVar3 = mVar;
            k1.a(cVarE2, intValue, rVarC3, null, 0.0f, (e23.l) objQ4, mVar3, 3072, 16);
            int i24 = qk0.r.i.f145146a[((qk0.s) qk0.s.f145153d.get(n1Var.getIntValue())).ordinal()];
            if (i24 == 1) {
                mVar3.C(481154890);
                Object objQ5 = mVar3.q();
                aVar3.getClass();
                if (objQ5 == p3.m.a.f135155b) {
                    f14 = 0.0f;
                    p pVar = new p((Object) dVar2, (Object) x3Var3, (Object) context, (Object) x3Var2, p1Var5, p1Var3, (Object) p1Var2, 6);
                    dVar = dVar2;
                    p1Var3 = p1Var3;
                    objQ5 = p0.f(pVar);
                    mVar3.K(objQ5);
                } else {
                    f14 = 0.0f;
                    dVar = dVar2;
                }
                x3Var = (x3) objQ5;
                mVar3.f();
            } else {
                if (i24 != i16) {
                    throw n23.j.m(mVar3, -1508515541);
                }
                mVar3.C(480666671);
                Object objQ6 = mVar3.q();
                aVar3.getClass();
                if (objQ6 == p3.m.a.f135155b) {
                    objQ6 = p0.f(new ok0.d(context, x3Var3, x3Var2, p1Var5));
                    mVar3.K(objQ6);
                }
                x3Var = (x3) objQ6;
                mVar3.f();
                f14 = 0.0f;
                dVar = dVar2;
            }
            if (((Boolean) x3Var2.getF182175a()).booleanValue() || p13.h0.L((Iterable) p1Var.getF182175a())) {
                mVar3.C(482802261);
                boolean zB3 = mVar3.B((i53.c) x3Var.getF182175a());
                Object objQ7 = mVar3.q();
                if (zB3) {
                    iterable = (Iterable) x3Var.getF182175a();
                    if (iterable instanceof Collection) {
                        it = iterable.iterator();
                        i17 = 0;
                        while (it.hasNext()) {
                            if (!(((qk0.v) it.next()) instanceof qk0.v.b)) {
                            }
                        }
                    } else {
                        it = iterable.iterator();
                        i17 = 0;
                        while (it.hasNext()) {
                            if (!(((qk0.v) it.next()) instanceof qk0.v.b)) {
                            }
                        }
                    }
                    objQ7 = Integer.valueOf(i17);
                    mVar3.K(objQ7);
                } else {
                    aVar3.getClass();
                    if (objQ7 == p3.m.a.f135155b) {
                        iterable = (Iterable) x3Var.getF182175a();
                        if ((iterable instanceof Collection) || !((Collection) iterable).isEmpty()) {
                            it = iterable.iterator();
                            i17 = 0;
                            while (it.hasNext()) {
                                if (!(((qk0.v) it.next()) instanceof qk0.v.b) && (i17 = i17 + 1) < 0) {
                                    p13.x.p();
                                    throw null;
                                }
                            }
                        } else {
                            i17 = 0;
                        }
                        objQ7 = Integer.valueOf(i17);
                        mVar3.K(objQ7);
                    }
                }
                int iIntValue2 = ((Number) objQ7).intValue();
                if (iIntValue2 > 0) {
                    mVar3.C(482996910);
                    if (p13.h0.L(cVarE)) {
                        mVar3.C(483021307);
                        h4.r.a aVar6 = h4.r.S;
                        d92.b.f58623a.getClass();
                        d92.b.f58625c.getClass();
                        c2.l.f(x2.h(aVar6, j92.b.f97899b.f97918c), mVar3);
                        mVar3.f();
                    } else {
                        mVar3.C(483133434);
                        h4.r.a aVar7 = h4.r.S;
                        d92.b.f58623a.getClass();
                        d92.b.f58625c.getClass();
                        c2.l.f(x2.h(aVar7, j92.b.f97899b.f97920e), mVar3);
                        mVar3.f();
                    }
                    h4.r rVarF = x2.f(h4.r.S, 1.0f);
                    d92.b.f58623a.getClass();
                    d92.b.f58625c.getClass();
                    j92.e eVar3 = j92.b.f97899b;
                    h4.r rVarZ = c2.l.z(rVarF, eVar3.f97920e, eVar3.f97917b);
                    uk0.i.f171830a.getClass();
                    String strF = uk0.i.f(mVar3, iIntValue2);
                    d92.b.f58624b.getClass();
                    x0 x0VarB = d92.c.b(j92.f.f97933j, mVar3);
                    d6.h.f57752b.getClass();
                    mh.c(strF, rVarZ, 0L, null, 0L, null, 0L, d6.h.a(d6.h.f57755e), 0L, 0, false, 0, 0, null, x0VarB, mVar3, 0, 0, 130044);
                    mVar3.f();
                } else {
                    mVar3.C(483696518);
                    mVar3.f();
                }
                mVar3.f();
            } else {
                mVar3.C(483710406);
                mVar3.f();
            }
            int i25 = k3.f22728a;
            c3 c3VarB2 = q3.b(mVar3);
            p3.f22815b.getClass();
            c2.x1 x1VarD2 = n3.d(c3VarB2, p3.f22826m | p3.f22823j);
            d92.b.f58623a.getClass();
            d92.b.f58625c.getClass();
            l1 l1VarC2 = n3.c(new c2.a(x1VarD2, n3.b(f14, f14, f14, j92.b.f97899b.f97920e, 7)), mVar3);
            boolean zB4 = mVar3.B(x3Var) | mVar3.B(p1Var) | mVar3.r(dVar) | mVar3.B(p1Var3) | mVar3.B(p1Var4);
            Object objQ8 = mVar3.q();
            if (zB4) {
                l0 l0Var = new l0((Object) x3Var, (Object) x3Var2, p1Var, (Object) dVar, (Object) p1Var3, (Object) p1Var4, (Object) p1Var6, 16);
                mVar3.K(l0Var);
                objQ8 = l0Var;
            } else {
                aVar3.getClass();
                if (objQ8 == p3.m.a.f135155b) {
                    l0 l0Var2 = new l0((Object) x3Var, (Object) x3Var2, p1Var, (Object) dVar, (Object) p1Var3, (Object) p1Var4, (Object) p1Var6, 16);
                    mVar3.K(l0Var2);
                    objQ8 = l0Var2;
                }
            }
            e2.c.b(null, null, l1VarC2, null, null, null, false, null, (e23.l) objQ8, mVar3, 0, 507);
            mVar3.y();
            x1 x1Var3 = p3.n.f135158a;
        } else {
            mVar2.e();
        }
        return Unit.INSTANCE;
    }

    private final Object c(Object obj, Object obj2) {
        ((Integer) obj2).getClass();
        rk0.h.b((rk0.k) this.f316c, (bv.d) this.f317d, (GearActivity.w) this.f318e, (e23.l) this.f319f, (e23.a) this.f315b, (e23.a) this.f321h, (e23.l) this.f322i, (e23.l) this.f323j, (e23.p) this.f320g, (e23.l) this.f324k, (p3.m) obj, p0.t(1));
        return Unit.INSTANCE;
    }

    private final Object d(Object obj, Object obj2) {
        ((Integer) obj2).getClass();
        sk0.p.d((jk0.x) this.f316c, (q0) this.f317d, (bv.d) this.f318e, (e23.p) this.f320g, (e23.l) this.f319f, (e23.q) this.f321h, (e23.q) this.f322i, (e23.l) this.f323j, (e23.l) this.f324k, (GearActivity.w) this.f315b, (p3.m) obj, p0.t(1));
        return Unit.INSTANCE;
    }

    private final Object e(Object obj, Object obj2) {
        ((Integer) obj2).getClass();
        sk0.p.c((jk0.x) this.f316c, (sk0.r) this.f317d, (bv.d) this.f318e, (e23.l) this.f319f, (e23.p) this.f320g, (e23.l) this.f321h, (e23.q) this.f322i, (e23.q) this.f323j, (e23.l) this.f324k, (GearActivity.w) this.f315b, (p3.m) obj, p0.t(1));
        return Unit.INSTANCE;
    }

    private final Object f(Object obj, Object obj2) {
        ((Integer) obj2).getClass();
        sk0.p.a((c80.u) this.f316c, (sk0.r) this.f317d, (bv.d) this.f318e, (e23.l) this.f319f, (e23.p) this.f320g, (e23.l) this.f321h, (e23.q) this.f322i, (e23.q) this.f323j, (e23.l) this.f324k, (GearActivity.w) this.f315b, (p3.m) obj, p0.t(1));
        return Unit.INSTANCE;
    }

    /* JADX WARN: Code duplicated, block: B:23:0x00f4  */
    /* JADX WARN: Code duplicated, block: B:24:0x0100  */
    /* JADX WARN: Code duplicated, block: B:26:0x012b  */
    /* JADX WARN: Code duplicated, block: B:28:0x0134  */
    /* JADX WARN: Code duplicated, block: B:29:0x0138  */
    /* JADX WARN: Code duplicated, block: B:34:0x0155  */
    /* JADX WARN: Code duplicated, block: B:38:0x0181  */
    /* JADX WARN: Code duplicated, block: B:41:0x019c  */
    /* JADX WARN: Code duplicated, block: B:44:0x01ea  */
    /* JADX WARN: Code duplicated, block: B:46:0x01f3  */
    /* JADX WARN: Code duplicated, block: B:47:0x01f7  */
    /* JADX WARN: Code duplicated, block: B:52:0x0214  */
    /* JADX WARN: Code duplicated, block: B:56:0x023f  */
    /* JADX WARN: Code duplicated, block: B:58:0x029c  */
    /* JADX WARN: Code duplicated, block: B:60:0x02a2  */
    private final Object g(Object obj, Object obj2) {
        p1 p1Var;
        h5.g.a.f fVar;
        ub1.l lVarU;
        c2.z zVarA;
        int iHashCode;
        i2 i2VarX;
        h4.r rVarC;
        Object objQ;
        p3.m.a.C2565a c2565a;
        i53.f fVar2;
        Object objQ2;
        yd1.a aVar;
        c2.z zVarA2;
        int iHashCode2;
        i2 i2VarX2;
        h4.r rVarC2;
        boolean zB;
        Object objQ3;
        n82.f fVar3 = (n82.f) this.f316c;
        Context context = (Context) this.f317d;
        sm1.s sVar = (sm1.s) this.f318e;
        n82.f.a aVar2 = (n82.f.a) this.f319f;
        e23.a aVar3 = (e23.a) this.f315b;
        e23.a aVar4 = (e23.a) this.f320g;
        e23.a aVar5 = (e23.a) this.f322i;
        x3 x3Var = (x3) this.f323j;
        p1 p1Var2 = (p1) this.f321h;
        p1 p1Var3 = (p1) this.f324k;
        p3.m mVar = (p3.m) obj;
        int iIntValue = ((Integer) obj2).intValue();
        if (mVar.n(iIntValue & 1, (iIntValue & 3) != 2)) {
            x1 x1Var = p3.n.f135158a;
            h4.r.a aVar6 = h4.r.S;
            h4.r rVarD = x2.d(aVar6, 1.0f);
            long jA = tn.k.a(d92.b.f58623a, mVar);
            m1.a aVar7 = m1.f128891a;
            h4.r rVarE = u1.n.e(rVarD, jA, aVar7);
            h4.d.f81522a.getClass();
            h4.g.a aVar8 = h4.d.a.f81537o;
            c2.j.f22691a.getClass();
            c2.j.k kVar = c2.j.f22694d;
            c2.z zVarA3 = c2.y.a(kVar, aVar8, mVar, 48);
            int iHashCode3 = Long.hashCode(mVar.getU());
            i2 i2VarX3 = mVar.x();
            h4.r rVarC3 = h4.k.c(rVarE, mVar);
            h5.g.V.getClass();
            h5.e0.a aVar9 = h5.g.a.f81805b;
            if (mVar.F() == null) {
                p0.l();
                throw null;
            }
            mVar.z();
            if (mVar.getT()) {
                mVar.M(aVar9);
            } else {
                mVar.c();
            }
            h5.g.a.e eVar = h5.g.a.f81810g;
            b4.c(eVar, zVarA3, mVar);
            h5.g.a.C1623g c1623g = h5.g.a.f81809f;
            b4.c(c1623g, i2VarX3, mVar);
            h5.g.a.b bVar = h5.g.a.f81813j;
            if (mVar.getT()) {
                p1Var = p1Var2;
            } else {
                p1Var = p1Var2;
                if (!p005kotlin.jvm.internal.s.g(mVar.q(), Integer.valueOf(iHashCode3))) {
                }
                fVar = h5.g.a.f81807d;
                b4.c(fVar, rVarC3, mVar);
                c2.b0 b0Var = c2.b0.f22601a;
                lVarU = zd0.g1.u((zd0.g1) KoinJavaComponent.get$default(zd0.g1.class, null, null, 6, null), s0.SLEEP, null, 6);
                if (lVarU == null) {
                    mVar.C(-1221720608);
                    mVar.f();
                } else {
                    mVar.C(-1221720607);
                    h4.r rVarF = x2.f(aVar6, 1.0f);
                    zVarA = c2.y.a(kVar, h4.d.a.f81536n, mVar, 0);
                    iHashCode = Long.hashCode(mVar.getU());
                    i2VarX = mVar.x();
                    rVarC = h4.k.c(rVarF, mVar);
                    if (mVar.F() != null) {
                        p0.l();
                        throw null;
                    }
                    mVar.z();
                    if (mVar.getT()) {
                        mVar.M(aVar9);
                    } else {
                        mVar.c();
                    }
                    b4.c(eVar, zVarA, mVar);
                    b4.c(c1623g, i2VarX, mVar);
                    if (mVar.getT() || !p005kotlin.jvm.internal.s.g(mVar.q(), Integer.valueOf(iHashCode))) {
                        v.h.z(iHashCode, mVar, iHashCode, bVar);
                    }
                    b4.c(fVar, rVarC, mVar);
                    d92.b.f58625c.getClass();
                    lVarU.a(c2.l.y(aVar6, j92.b.f97899b.f97920e), mVar, 0);
                    mVar.y();
                    Unit unit = Unit.INSTANCE;
                    mVar.f();
                }
                objQ = mVar.q();
                p3.m.f135153a.getClass();
                c2565a = p3.m.a.f135155b;
                if (objQ == c2565a) {
                    objQ = i53.a.a(o82.g.f130850c, o82.g.f130851d, o82.g.f130853f, o82.g.f130856i);
                    mVar.K(objQ);
                }
                fVar2 = (i53.f) objQ;
                objQ2 = mVar.q();
                if (objQ2 == c2565a) {
                    objQ2 = new yd1.a(context);
                    mVar.K(objQ2);
                }
                aVar = (yd1.a) objQ2;
                h4.r rVarE2 = u1.n.e(aVar6, d92.b.a(mVar).c().c(), aVar7);
                d92.b.f58625c.getClass();
                h4.r rVarC4 = c2.l.C(rVarE2, 0.0f, j92.b.f97899b.f97920e, 0.0f, 0.0f, 13);
                zVarA2 = c2.y.a(kVar, h4.d.a.f81536n, mVar, 0);
                iHashCode2 = Long.hashCode(mVar.getU());
                i2VarX2 = mVar.x();
                rVarC2 = h4.k.c(rVarC4, mVar);
                if (mVar.F() != null) {
                    p0.l();
                    throw null;
                }
                mVar.z();
                if (mVar.getT()) {
                    mVar.M(aVar9);
                } else {
                    mVar.c();
                }
                b4.c(eVar, zVarA2, mVar);
                b4.c(c1623g, i2VarX2, mVar);
                if (mVar.getT() || !p005kotlin.jvm.internal.s.g(mVar.q(), Integer.valueOf(iHashCode2))) {
                    v.h.z(iHashCode2, mVar, iHashCode2, bVar);
                }
                b4.c(fVar, rVarC2, mVar);
                i53.c cVarE = i53.a.e(o2.b(fVar2, mVar));
                int iIndexOf = fVar2.indexOf(fVar3.f124961b.a());
                zB = mVar.B(fVar3) | mVar.r(sVar);
                objQ3 = mVar.q();
                if (zB || objQ3 == c2565a) {
                    objQ3 = new rp.b(fVar3, 17, fVar2, sVar);
                    mVar.K(objQ3);
                }
                t82.c.a(cVarE, null, iIndexOf, 0.0f, (e23.l) objQ3, mVar, 0, 26);
                q82.a.a(x2.f(aVar6, 1.0f), new n82.n(fVar3, aVar), null, mVar, 6, 4);
                mVar.y();
                n82.c.a(null, fVar3, 3, false, z3.f.c(-724229524, new dj0.l(sVar, aVar2, fVar3, aVar3, aVar4, aVar5, x3Var, p1Var, p1Var3), mVar), mVar, 24960, 9);
                mVar.y();
            }
            v.h.z(iHashCode3, mVar, iHashCode3, bVar);
            fVar = h5.g.a.f81807d;
            b4.c(fVar, rVarC3, mVar);
            c2.b0 b0Var2 = c2.b0.f22601a;
            lVarU = zd0.g1.u((zd0.g1) KoinJavaComponent.get$default(zd0.g1.class, null, null, 6, null), s0.SLEEP, null, 6);
            if (lVarU == null) {
                mVar.C(-1221720608);
                mVar.f();
            } else {
                mVar.C(-1221720607);
                h4.r rVarF2 = x2.f(aVar6, 1.0f);
                zVarA = c2.y.a(kVar, h4.d.a.f81536n, mVar, 0);
                iHashCode = Long.hashCode(mVar.getU());
                i2VarX = mVar.x();
                rVarC = h4.k.c(rVarF2, mVar);
                if (mVar.F() != null) {
                    p0.l();
                    throw null;
                }
                mVar.z();
                if (mVar.getT()) {
                    mVar.M(aVar9);
                } else {
                    mVar.c();
                }
                b4.c(eVar, zVarA, mVar);
                b4.c(c1623g, i2VarX, mVar);
                if (mVar.getT()) {
                    v.h.z(iHashCode, mVar, iHashCode, bVar);
                } else {
                    v.h.z(iHashCode, mVar, iHashCode, bVar);
                }
                b4.c(fVar, rVarC, mVar);
                d92.b.f58625c.getClass();
                lVarU.a(c2.l.y(aVar6, j92.b.f97899b.f97920e), mVar, 0);
                mVar.y();
                Unit unit2 = Unit.INSTANCE;
                mVar.f();
            }
            objQ = mVar.q();
            p3.m.f135153a.getClass();
            c2565a = p3.m.a.f135155b;
            if (objQ == c2565a) {
                objQ = i53.a.a(o82.g.f130850c, o82.g.f130851d, o82.g.f130853f, o82.g.f130856i);
                mVar.K(objQ);
            }
            fVar2 = (i53.f) objQ;
            objQ2 = mVar.q();
            if (objQ2 == c2565a) {
                objQ2 = new yd1.a(context);
                mVar.K(objQ2);
            }
            aVar = (yd1.a) objQ2;
            h4.r rVarE3 = u1.n.e(aVar6, d92.b.a(mVar).c().c(), aVar7);
            d92.b.f58625c.getClass();
            h4.r rVarC5 = c2.l.C(rVarE3, 0.0f, j92.b.f97899b.f97920e, 0.0f, 0.0f, 13);
            zVarA2 = c2.y.a(kVar, h4.d.a.f81536n, mVar, 0);
            iHashCode2 = Long.hashCode(mVar.getU());
            i2VarX2 = mVar.x();
            rVarC2 = h4.k.c(rVarC5, mVar);
            if (mVar.F() != null) {
                p0.l();
                throw null;
            }
            mVar.z();
            if (mVar.getT()) {
                mVar.M(aVar9);
            } else {
                mVar.c();
            }
            b4.c(eVar, zVarA2, mVar);
            b4.c(c1623g, i2VarX2, mVar);
            if (mVar.getT()) {
                v.h.z(iHashCode2, mVar, iHashCode2, bVar);
            } else {
                v.h.z(iHashCode2, mVar, iHashCode2, bVar);
            }
            b4.c(fVar, rVarC2, mVar);
            i53.c cVarE2 = i53.a.e(o2.b(fVar2, mVar));
            int iIndexOf2 = fVar2.indexOf(fVar3.f124961b.a());
            zB = mVar.B(fVar3) | mVar.r(sVar);
            objQ3 = mVar.q();
            if (zB) {
                objQ3 = new rp.b(fVar3, 17, fVar2, sVar);
                mVar.K(objQ3);
            } else {
                objQ3 = new rp.b(fVar3, 17, fVar2, sVar);
                mVar.K(objQ3);
            }
            t82.c.a(cVarE2, null, iIndexOf2, 0.0f, (e23.l) objQ3, mVar, 0, 26);
            q82.a.a(x2.f(aVar6, 1.0f), new n82.n(fVar3, aVar), null, mVar, 6, 4);
            mVar.y();
            n82.c.a(null, fVar3, 3, false, z3.f.c(-724229524, new dj0.l(sVar, aVar2, fVar3, aVar3, aVar4, aVar5, x3Var, p1Var, p1Var3), mVar), mVar, 24960, 9);
            mVar.y();
        } else {
            mVar.e();
        }
        return Unit.INSTANCE;
    }

    private final Object h(Object obj, Object obj2) {
        ((Integer) obj2).getClass();
        t21.q.a((u21.g) this.f316c, (v21.e) this.f317d, (e23.l) this.f318e, (e23.l) this.f319f, (e23.l) this.f320g, (e23.a) this.f315b, (e23.a) this.f321h, (e23.a) this.f322i, (e23.a) this.f323j, (fe) this.f324k, (p3.m) obj, p0.t(805306369));
        return Unit.INSTANCE;
    }

    private final Object i(Object obj, Object obj2) {
        u21.a0 a0Var = (u21.a0) this.f316c;
        e23.a aVar = (e23.a) this.f315b;
        e23.a aVar2 = (e23.a) this.f317d;
        l22.a aVar3 = (l22.a) this.f318e;
        v21.e eVar = (v21.e) this.f319f;
        e23.p pVar = (e23.p) this.f320g;
        e23.l lVar = (e23.l) this.f321h;
        m4.q qVar = (m4.q) this.f322i;
        m3 m3Var = (m3) this.f323j;
        e23.a aVar4 = (e23.a) this.f324k;
        p3.m mVar = (p3.m) obj;
        int iIntValue = ((Integer) obj2).intValue();
        if (mVar.n(iIntValue & 1, (iIntValue & 3) != 2)) {
            x1 x1Var = p3.n.f135158a;
            h4.r rVarC = wz1.i.c(x2.d(h4.r.S, 1.0f), mVar);
            h4.d.f81522a.getClass();
            z0 z0VarD = c2.q.d(h4.d.a.f81524b, false);
            int iHashCode = Long.hashCode(mVar.getU());
            i2 i2VarX = mVar.x();
            h4.r rVarC2 = h4.k.c(rVarC, mVar);
            h5.g.V.getClass();
            h5.e0.a aVar5 = h5.g.a.f81805b;
            if (mVar.F() == null) {
                p0.l();
                throw null;
            }
            mVar.z();
            if (mVar.getT()) {
                mVar.M(aVar5);
            } else {
                mVar.c();
            }
            b4.c(h5.g.a.f81810g, z0VarD, mVar);
            b4.c(h5.g.a.f81809f, i2VarX, mVar);
            h5.g.a.b bVar = h5.g.a.f81813j;
            if (mVar.getT() || !p005kotlin.jvm.internal.s.g(mVar.q(), Integer.valueOf(iHashCode))) {
                v.h.z(iHashCode, mVar, iHashCode, bVar);
            }
            b4.c(h5.g.a.f81807d, rVarC2, mVar);
            c2.u uVar = c2.u.f22885a;
            Boolean boolValueOf = Boolean.valueOf(a0Var.f167892b.f156159a);
            xz1.a.f192853a.getClass();
            r1.b.a(boolValueOf, null, new m0(14), null, null, null, z3.f.c(1835784693, new nw1.b(aVar, aVar2, a0Var, aVar3, eVar, pVar, lVar, qVar, m3Var, aVar4), mVar), mVar, 1572864, 58);
            mVar.y();
        } else {
            mVar.e();
        }
        return Unit.INSTANCE;
    }

    /* JADX WARN: Code duplicated, block: B:24:0x0110  */
    /* JADX WARN: Code duplicated, block: B:27:0x011a  */
    /* JADX WARN: Code duplicated, block: B:28:0x011c  */
    /* JADX WARN: Code duplicated, block: B:32:0x015b  */
    /* JADX WARN: Code duplicated, block: B:34:0x0164  */
    /* JADX WARN: Code duplicated, block: B:35:0x0168  */
    /* JADX WARN: Code duplicated, block: B:38:0x0177  */
    /* JADX WARN: Code duplicated, block: B:40:0x0185  */
    /* JADX WARN: Code duplicated, block: B:43:0x02ac  */
    /* JADX WARN: Code duplicated, block: B:45:0x02b5  */
    /* JADX WARN: Code duplicated, block: B:46:0x02b9  */
    /* JADX WARN: Code duplicated, block: B:49:0x02ca  */
    /* JADX WARN: Code duplicated, block: B:51:0x02d8  */
    /* JADX WARN: Code duplicated, block: B:57:0x02fe  */
    /* JADX WARN: Code duplicated, block: B:59:0x0306  */
    /* JADX WARN: Code duplicated, block: B:61:0x031d  */
    /* JADX WARN: Code duplicated, block: B:63:0x0326  */
    /* JADX WARN: Code duplicated, block: B:66:0x0344  */
    /* JADX WARN: Code duplicated, block: B:69:0x034c  */
    /* JADX WARN: Code duplicated, block: B:70:0x0350  */
    /* JADX WARN: Code duplicated, block: B:73:0x036f  */
    /* JADX WARN: Code duplicated, block: B:75:0x0376  */
    /* JADX WARN: Code duplicated, block: B:81:0x03b8  */
    /* JADX WARN: Code duplicated, block: B:83:0x03bf  */
    /* JADX WARN: Code duplicated, block: B:85:0x03e9  */
    /* JADX WARN: Code duplicated, block: B:87:0x03ed  */
    /* JADX WARN: Code duplicated, block: B:95:0x0396 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:97:0x0380 A[SYNTHETIC] */
    private final Object j(Object obj, Object obj2) {
        String str;
        p1 p1Var;
        h5.g.a.f fVar;
        boolean zB;
        Object objQ;
        p3.m.a aVar;
        e23.l lVar;
        int i14;
        c2.z zVarA;
        int iHashCode;
        i2 i2VarX;
        h4.r rVarC;
        p1 p1Var2;
        List list;
        m3 m3Var;
        s2 s2VarA;
        int iHashCode2;
        i2 i2VarX2;
        h4.r rVarC2;
        u2 u2Var;
        int i15;
        p1 p1Var3;
        e23.l lVar2;
        boolean zB2;
        Object objQ2;
        int i16;
        List list2;
        int i17;
        m3 m3Var2;
        boolean zK;
        Object objQ3;
        Object k0Var;
        p1 p1Var4;
        boolean zK2;
        Object objQ4;
        o90.a aVar2 = (o90.a) this.f317d;
        e23.l lVar3 = (e23.l) this.f318e;
        e23.l lVar4 = (e23.l) this.f319f;
        String str2 = (String) this.f316c;
        String str3 = (String) this.f320g;
        String str4 = (String) this.f322i;
        p1 p1Var5 = (p1) this.f321h;
        List list3 = (List) this.f323j;
        m3 m3Var3 = (m3) this.f324k;
        p1 p1Var6 = (p1) this.f315b;
        p3.m mVar = (p3.m) obj;
        int iIntValue = ((Integer) obj2).intValue();
        if (mVar.n(iIntValue & 1, (iIntValue & 3) != 2)) {
            x1 x1Var = p3.n.f135158a;
            h4.r.a aVar3 = h4.r.S;
            h4.r rVarD = x2.d(aVar3, 1.0f);
            d92.b.f58623a.getClass();
            d92.b.f58625c.getClass();
            j92.e eVar = j92.b.f97899b;
            h4.r rVarP = c2.l.p(c2.l.C(c2.l.A(rVarD, eVar.f97920e, 0.0f, 2), 0.0f, 0.0f, 0.0f, eVar.f97920e, 7));
            h4.d.f81522a.getClass();
            h4.g.a aVar4 = h4.d.a.f81537o;
            c2.j.f22691a.getClass();
            c2.j.k kVar = c2.j.f22694d;
            c2.z zVarA2 = c2.y.a(kVar, aVar4, mVar, 48);
            int iHashCode3 = Long.hashCode(mVar.getU());
            i2 i2VarX3 = mVar.x();
            h4.r rVarC3 = h4.k.c(rVarP, mVar);
            h5.g.V.getClass();
            h5.e0.a aVar5 = h5.g.a.f81805b;
            if (mVar.F() == null) {
                p0.l();
                throw null;
            }
            mVar.z();
            if (mVar.getT()) {
                mVar.M(aVar5);
            } else {
                mVar.c();
            }
            h5.g.a.e eVar2 = h5.g.a.f81810g;
            b4.c(eVar2, zVarA2, mVar);
            h5.g.a.C1623g c1623g = h5.g.a.f81809f;
            b4.c(c1623g, i2VarX3, mVar);
            h5.g.a.b bVar = h5.g.a.f81813j;
            if (mVar.getT()) {
                str = str2;
                p1Var = p1Var6;
            } else {
                str = str2;
                p1Var = p1Var6;
                if (!p005kotlin.jvm.internal.s.g(mVar.q(), Integer.valueOf(iHashCode3))) {
                }
                fVar = h5.g.a.f81807d;
                b4.c(fVar, rVarC3, mVar);
                c2.b0 b0Var = c2.b0.f22601a;
                h4.r rVarC4 = x2.c(aVar3, 0.33f);
                zB = mVar.B(lVar3);
                objQ = mVar.q();
                aVar = p3.m.f135153a;
                if (zB) {
                    lVar = lVar4;
                } else {
                    aVar.getClass();
                    lVar = lVar4;
                    if (objQ == p3.m.a.f135155b) {
                        i14 = 0;
                    }
                    da0.f.b(aVar2, x80.c.a(rVarC4, (e23.l) objQ), mVar, i14);
                    h4.r rVarB = a2.b(b0Var.a(aVar3, 1.0f, true), a2.a(mVar), true);
                    zVarA = c2.y.a(kVar, aVar4, mVar, 48);
                    iHashCode = Long.hashCode(mVar.getU());
                    i2VarX = mVar.x();
                    rVarC = h4.k.c(rVarB, mVar);
                    if (mVar.F() != null) {
                        p0.l();
                        throw null;
                    }
                    mVar.z();
                    if (mVar.getT()) {
                        mVar.M(aVar5);
                    } else {
                        mVar.c();
                    }
                    b4.c(eVar2, zVarA, mVar);
                    b4.c(c1623g, i2VarX, mVar);
                    if (mVar.getT() || !p005kotlin.jvm.internal.s.g(mVar.q(), Integer.valueOf(iHashCode))) {
                        v.h.z(iHashCode, mVar, iHashCode, bVar);
                    }
                    b4.c(fVar, rVarC, mVar);
                    h4.r rVarC5 = c2.l.C(x2.f(aVar3, 1.0f), 0.0f, eVar.f97921f, 0.0f, 0.0f, 13);
                    d92.b.f58624b.getClass();
                    x0 x0VarB = d92.c.b(j92.f.f97931h, mVar);
                    d6.h.f57752b.getClass();
                    int i18 = d6.h.f57755e;
                    p1Var2 = p1Var;
                    list = list3;
                    m3Var = m3Var3;
                    mh.c(str, rVarC5, 0L, null, 0L, null, 0L, d6.h.a(i18), 0L, 0, false, 0, 0, null, x0VarB, mVar, 0, 0, 130044);
                    mh.c(g22.n.g(str3), c2.l.C(x2.f(aVar3, 1.0f), 0.0f, eVar.f97920e, 0.0f, 0.0f, 13), 0L, null, 0L, null, 0L, d6.h.a(i18), 0L, 0, false, 0, 0, null, d92.c.b(j92.f.f97927d, mVar), mVar, 0, 0, 130044);
                    mh.c(str4, c2.l.C(x2.f(aVar3, 1.0f), 0.0f, eVar.f97921f, 0.0f, 0.0f, 13), 0L, null, 0L, null, 0L, d6.h.a(i18), 0L, 0, false, 0, 0, null, d92.c.b(j92.f.f97932i, mVar), mVar, 0, 0, 130044);
                    h4.r rVarC6 = c2.l.C(x2.f(aVar3, 1.0f), 0.0f, eVar.f97921f, 0.0f, 0.0f, 13);
                    s2VarA = q2.a(c2.j.f22696f, h4.d.a.f81533k, mVar, 6);
                    iHashCode2 = Long.hashCode(mVar.getU());
                    i2VarX2 = mVar.x();
                    rVarC2 = h4.k.c(rVarC6, mVar);
                    if (mVar.F() != null) {
                        p0.l();
                        throw null;
                    }
                    mVar.z();
                    if (mVar.getT()) {
                        mVar.M(aVar5);
                    } else {
                        mVar.c();
                    }
                    b4.c(eVar2, s2VarA, mVar);
                    b4.c(c1623g, i2VarX2, mVar);
                    if (mVar.getT() || !p005kotlin.jvm.internal.s.g(mVar.q(), Integer.valueOf(iHashCode2))) {
                        v.h.z(iHashCode2, mVar, iHashCode2, bVar);
                    }
                    b4.c(fVar, rVarC2, mVar);
                    u2Var = u2.f22900a;
                    mVar.C(-341416985);
                    i15 = 0;
                    for (Object obj3 : (List) p1Var5.getF182175a()) {
                        i16 = i15 + 1;
                        if (i15 >= 0) {
                            p13.x.q();
                            throw null;
                        }
                        String str5 = (String) obj3;
                        list2 = list;
                        m4.b0 b0Var2 = (m4.b0) list2.get(i15);
                        if (i15 == p13.x.j((List) p1Var5.getF182175a())) {
                            x5.p.f188918b.getClass();
                            i17 = x5.p.f188926j;
                        } else {
                            x5.p.f188918b.getClass();
                            i17 = x5.p.f188925i;
                        }
                        int i19 = i17;
                        m3Var2 = m3Var;
                        zK = mVar.k(i15) | mVar.r(list2) | mVar.B(m3Var2);
                        objQ3 = mVar.q();
                        if (zK) {
                            p1 p1Var7 = p1Var5;
                            k0Var = new cw1.k0(i15, list2, m3Var2, p1Var7, 12);
                            p1Var4 = p1Var7;
                            mVar.K(k0Var);
                        } else {
                            aVar.getClass();
                            if (objQ3 == p3.m.a.f135155b) {
                                p1 p1Var8 = p1Var5;
                                k0Var = new cw1.k0(i15, list2, m3Var2, p1Var8, 12);
                                p1Var4 = p1Var8;
                                mVar.K(k0Var);
                            } else {
                                k0Var = objQ3;
                                p1Var4 = p1Var5;
                            }
                        }
                        e23.l lVar5 = (e23.l) k0Var;
                        zK2 = mVar.k(i15) | mVar.r(list2);
                        objQ4 = mVar.q();
                        if (zK2) {
                            objQ4 = new a83.a(i15, list2, p1Var4, 14);
                            mVar.K(objQ4);
                        } else {
                            aVar.getClass();
                            if (objQ4 == p3.m.a.f135155b) {
                                objQ4 = new a83.a(i15, list2, p1Var4, 14);
                                mVar.K(objQ4);
                            }
                        }
                        ta0.m.c(u2Var, str5, b0Var2, i19, lVar5, (e23.a) objQ4, mVar, 6);
                        i15 = i16;
                        p1Var5 = p1Var4;
                        list = list2;
                        m3Var = m3Var2;
                    }
                    p1Var3 = p1Var5;
                    mVar.f();
                    mVar.y();
                    mVar.y();
                    String strQ = gl1.y.Q(mVar, R.string.lbl_start);
                    lVar2 = lVar;
                    zB2 = mVar.B(lVar2);
                    objQ2 = mVar.q();
                    if (zB2) {
                        objQ2 = new lm0.o(lVar2, p1Var3, p1Var2, 7);
                        mVar.K(objQ2);
                    } else {
                        aVar.getClass();
                        if (objQ2 == p3.m.a.f135155b) {
                            objQ2 = new lm0.o(lVar2, p1Var3, p1Var2, 7);
                            mVar.K(objQ2);
                        }
                    }
                    da0.b.a(null, strQ, (e23.a) objQ2, false, null, null, false, null, null, false, mVar, 0, 1017);
                    mVar.y();
                    x1 x1Var2 = p3.n.f135158a;
                }
                i14 = 0;
                objQ = new ta0.j(lVar3, 0);
                mVar.K(objQ);
                da0.f.b(aVar2, x80.c.a(rVarC4, (e23.l) objQ), mVar, i14);
                h4.r rVarB2 = a2.b(b0Var.a(aVar3, 1.0f, true), a2.a(mVar), true);
                zVarA = c2.y.a(kVar, aVar4, mVar, 48);
                iHashCode = Long.hashCode(mVar.getU());
                i2VarX = mVar.x();
                rVarC = h4.k.c(rVarB2, mVar);
                if (mVar.F() != null) {
                    p0.l();
                    throw null;
                }
                mVar.z();
                if (mVar.getT()) {
                    mVar.M(aVar5);
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
                h4.r rVarC7 = c2.l.C(x2.f(aVar3, 1.0f), 0.0f, eVar.f97921f, 0.0f, 0.0f, 13);
                d92.b.f58624b.getClass();
                x0 x0VarB2 = d92.c.b(j92.f.f97931h, mVar);
                d6.h.f57752b.getClass();
                int i110 = d6.h.f57755e;
                p1Var2 = p1Var;
                list = list3;
                m3Var = m3Var3;
                mh.c(str, rVarC7, 0L, null, 0L, null, 0L, d6.h.a(i110), 0L, 0, false, 0, 0, null, x0VarB2, mVar, 0, 0, 130044);
                mh.c(g22.n.g(str3), c2.l.C(x2.f(aVar3, 1.0f), 0.0f, eVar.f97920e, 0.0f, 0.0f, 13), 0L, null, 0L, null, 0L, d6.h.a(i110), 0L, 0, false, 0, 0, null, d92.c.b(j92.f.f97927d, mVar), mVar, 0, 0, 130044);
                mh.c(str4, c2.l.C(x2.f(aVar3, 1.0f), 0.0f, eVar.f97921f, 0.0f, 0.0f, 13), 0L, null, 0L, null, 0L, d6.h.a(i110), 0L, 0, false, 0, 0, null, d92.c.b(j92.f.f97932i, mVar), mVar, 0, 0, 130044);
                h4.r rVarC8 = c2.l.C(x2.f(aVar3, 1.0f), 0.0f, eVar.f97921f, 0.0f, 0.0f, 13);
                s2VarA = q2.a(c2.j.f22696f, h4.d.a.f81533k, mVar, 6);
                iHashCode2 = Long.hashCode(mVar.getU());
                i2VarX2 = mVar.x();
                rVarC2 = h4.k.c(rVarC8, mVar);
                if (mVar.F() != null) {
                    p0.l();
                    throw null;
                }
                mVar.z();
                if (mVar.getT()) {
                    mVar.M(aVar5);
                } else {
                    mVar.c();
                }
                b4.c(eVar2, s2VarA, mVar);
                b4.c(c1623g, i2VarX2, mVar);
                if (mVar.getT()) {
                    v.h.z(iHashCode2, mVar, iHashCode2, bVar);
                } else {
                    v.h.z(iHashCode2, mVar, iHashCode2, bVar);
                }
                b4.c(fVar, rVarC2, mVar);
                u2Var = u2.f22900a;
                mVar.C(-341416985);
                i15 = 0;
                while (r1.hasNext()) {
                    i16 = i15 + 1;
                    if (i15 >= 0) {
                        p13.x.q();
                        throw null;
                    }
                    String str6 = (String) obj3;
                    list2 = list;
                    m4.b0 b0Var3 = (m4.b0) list2.get(i15);
                    if (i15 == p13.x.j((List) p1Var5.getF182175a())) {
                        x5.p.f188918b.getClass();
                        i17 = x5.p.f188926j;
                    } else {
                        x5.p.f188918b.getClass();
                        i17 = x5.p.f188925i;
                    }
                    int i111 = i17;
                    m3Var2 = m3Var;
                    zK = mVar.k(i15) | mVar.r(list2) | mVar.B(m3Var2);
                    objQ3 = mVar.q();
                    if (zK) {
                        aVar.getClass();
                        if (objQ3 == p3.m.a.f135155b) {
                            p1 p1Var9 = p1Var5;
                            k0Var = new cw1.k0(i15, list2, m3Var2, p1Var9, 12);
                            p1Var4 = p1Var9;
                            mVar.K(k0Var);
                        } else {
                            k0Var = objQ3;
                            p1Var4 = p1Var5;
                        }
                    } else {
                        p1 p1Var10 = p1Var5;
                        k0Var = new cw1.k0(i15, list2, m3Var2, p1Var10, 12);
                        p1Var4 = p1Var10;
                        mVar.K(k0Var);
                    }
                    e23.l lVar6 = (e23.l) k0Var;
                    zK2 = mVar.k(i15) | mVar.r(list2);
                    objQ4 = mVar.q();
                    if (zK2) {
                        aVar.getClass();
                        if (objQ4 == p3.m.a.f135155b) {
                            objQ4 = new a83.a(i15, list2, p1Var4, 14);
                            mVar.K(objQ4);
                        }
                    } else {
                        objQ4 = new a83.a(i15, list2, p1Var4, 14);
                        mVar.K(objQ4);
                    }
                    ta0.m.c(u2Var, str6, b0Var3, i111, lVar6, (e23.a) objQ4, mVar, 6);
                    i15 = i16;
                    p1Var5 = p1Var4;
                    list = list2;
                    m3Var = m3Var2;
                }
                p1Var3 = p1Var5;
                mVar.f();
                mVar.y();
                mVar.y();
                String strQ2 = gl1.y.Q(mVar, R.string.lbl_start);
                lVar2 = lVar;
                zB2 = mVar.B(lVar2);
                objQ2 = mVar.q();
                if (zB2) {
                    aVar.getClass();
                    if (objQ2 == p3.m.a.f135155b) {
                        objQ2 = new lm0.o(lVar2, p1Var3, p1Var2, 7);
                        mVar.K(objQ2);
                    }
                } else {
                    objQ2 = new lm0.o(lVar2, p1Var3, p1Var2, 7);
                    mVar.K(objQ2);
                }
                da0.b.a(null, strQ2, (e23.a) objQ2, false, null, null, false, null, null, false, mVar, 0, 1017);
                mVar.y();
                x1 x1Var3 = p3.n.f135158a;
            }
            v.h.z(iHashCode3, mVar, iHashCode3, bVar);
            fVar = h5.g.a.f81807d;
            b4.c(fVar, rVarC3, mVar);
            c2.b0 b0Var4 = c2.b0.f22601a;
            h4.r rVarC9 = x2.c(aVar3, 0.33f);
            zB = mVar.B(lVar3);
            objQ = mVar.q();
            aVar = p3.m.f135153a;
            if (zB) {
                aVar.getClass();
                lVar = lVar4;
                if (objQ == p3.m.a.f135155b) {
                    i14 = 0;
                }
                da0.f.b(aVar2, x80.c.a(rVarC9, (e23.l) objQ), mVar, i14);
                h4.r rVarB3 = a2.b(b0Var4.a(aVar3, 1.0f, true), a2.a(mVar), true);
                zVarA = c2.y.a(kVar, aVar4, mVar, 48);
                iHashCode = Long.hashCode(mVar.getU());
                i2VarX = mVar.x();
                rVarC = h4.k.c(rVarB3, mVar);
                if (mVar.F() != null) {
                    p0.l();
                    throw null;
                }
                mVar.z();
                if (mVar.getT()) {
                    mVar.M(aVar5);
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
                h4.r rVarC10 = c2.l.C(x2.f(aVar3, 1.0f), 0.0f, eVar.f97921f, 0.0f, 0.0f, 13);
                d92.b.f58624b.getClass();
                x0 x0VarB3 = d92.c.b(j92.f.f97931h, mVar);
                d6.h.f57752b.getClass();
                int i112 = d6.h.f57755e;
                p1Var2 = p1Var;
                list = list3;
                m3Var = m3Var3;
                mh.c(str, rVarC10, 0L, null, 0L, null, 0L, d6.h.a(i112), 0L, 0, false, 0, 0, null, x0VarB3, mVar, 0, 0, 130044);
                mh.c(g22.n.g(str3), c2.l.C(x2.f(aVar3, 1.0f), 0.0f, eVar.f97920e, 0.0f, 0.0f, 13), 0L, null, 0L, null, 0L, d6.h.a(i112), 0L, 0, false, 0, 0, null, d92.c.b(j92.f.f97927d, mVar), mVar, 0, 0, 130044);
                mh.c(str4, c2.l.C(x2.f(aVar3, 1.0f), 0.0f, eVar.f97921f, 0.0f, 0.0f, 13), 0L, null, 0L, null, 0L, d6.h.a(i112), 0L, 0, false, 0, 0, null, d92.c.b(j92.f.f97932i, mVar), mVar, 0, 0, 130044);
                h4.r rVarC11 = c2.l.C(x2.f(aVar3, 1.0f), 0.0f, eVar.f97921f, 0.0f, 0.0f, 13);
                s2VarA = q2.a(c2.j.f22696f, h4.d.a.f81533k, mVar, 6);
                iHashCode2 = Long.hashCode(mVar.getU());
                i2VarX2 = mVar.x();
                rVarC2 = h4.k.c(rVarC11, mVar);
                if (mVar.F() != null) {
                    p0.l();
                    throw null;
                }
                mVar.z();
                if (mVar.getT()) {
                    mVar.M(aVar5);
                } else {
                    mVar.c();
                }
                b4.c(eVar2, s2VarA, mVar);
                b4.c(c1623g, i2VarX2, mVar);
                if (mVar.getT()) {
                    v.h.z(iHashCode2, mVar, iHashCode2, bVar);
                } else {
                    v.h.z(iHashCode2, mVar, iHashCode2, bVar);
                }
                b4.c(fVar, rVarC2, mVar);
                u2Var = u2.f22900a;
                mVar.C(-341416985);
                i15 = 0;
                while (r1.hasNext()) {
                    i16 = i15 + 1;
                    if (i15 >= 0) {
                        p13.x.q();
                        throw null;
                    }
                    String str7 = (String) obj3;
                    list2 = list;
                    m4.b0 b0Var5 = (m4.b0) list2.get(i15);
                    if (i15 == p13.x.j((List) p1Var5.getF182175a())) {
                        x5.p.f188918b.getClass();
                        i17 = x5.p.f188926j;
                    } else {
                        x5.p.f188918b.getClass();
                        i17 = x5.p.f188925i;
                    }
                    int i113 = i17;
                    m3Var2 = m3Var;
                    zK = mVar.k(i15) | mVar.r(list2) | mVar.B(m3Var2);
                    objQ3 = mVar.q();
                    if (zK) {
                        aVar.getClass();
                        if (objQ3 == p3.m.a.f135155b) {
                            p1 p1Var11 = p1Var5;
                            k0Var = new cw1.k0(i15, list2, m3Var2, p1Var11, 12);
                            p1Var4 = p1Var11;
                            mVar.K(k0Var);
                        } else {
                            k0Var = objQ3;
                            p1Var4 = p1Var5;
                        }
                    } else {
                        p1 p1Var12 = p1Var5;
                        k0Var = new cw1.k0(i15, list2, m3Var2, p1Var12, 12);
                        p1Var4 = p1Var12;
                        mVar.K(k0Var);
                    }
                    e23.l lVar7 = (e23.l) k0Var;
                    zK2 = mVar.k(i15) | mVar.r(list2);
                    objQ4 = mVar.q();
                    if (zK2) {
                        aVar.getClass();
                        if (objQ4 == p3.m.a.f135155b) {
                            objQ4 = new a83.a(i15, list2, p1Var4, 14);
                            mVar.K(objQ4);
                        }
                    } else {
                        objQ4 = new a83.a(i15, list2, p1Var4, 14);
                        mVar.K(objQ4);
                    }
                    ta0.m.c(u2Var, str7, b0Var5, i113, lVar7, (e23.a) objQ4, mVar, 6);
                    i15 = i16;
                    p1Var5 = p1Var4;
                    list = list2;
                    m3Var = m3Var2;
                }
                p1Var3 = p1Var5;
                mVar.f();
                mVar.y();
                mVar.y();
                String strQ3 = gl1.y.Q(mVar, R.string.lbl_start);
                lVar2 = lVar;
                zB2 = mVar.B(lVar2);
                objQ2 = mVar.q();
                if (zB2) {
                    aVar.getClass();
                    if (objQ2 == p3.m.a.f135155b) {
                        objQ2 = new lm0.o(lVar2, p1Var3, p1Var2, 7);
                        mVar.K(objQ2);
                    }
                } else {
                    objQ2 = new lm0.o(lVar2, p1Var3, p1Var2, 7);
                    mVar.K(objQ2);
                }
                da0.b.a(null, strQ3, (e23.a) objQ2, false, null, null, false, null, null, false, mVar, 0, 1017);
                mVar.y();
                x1 x1Var4 = p3.n.f135158a;
            } else {
                lVar = lVar4;
            }
            i14 = 0;
            objQ = new ta0.j(lVar3, 0);
            mVar.K(objQ);
            da0.f.b(aVar2, x80.c.a(rVarC9, (e23.l) objQ), mVar, i14);
            h4.r rVarB4 = a2.b(b0Var4.a(aVar3, 1.0f, true), a2.a(mVar), true);
            zVarA = c2.y.a(kVar, aVar4, mVar, 48);
            iHashCode = Long.hashCode(mVar.getU());
            i2VarX = mVar.x();
            rVarC = h4.k.c(rVarB4, mVar);
            if (mVar.F() != null) {
                p0.l();
                throw null;
            }
            mVar.z();
            if (mVar.getT()) {
                mVar.M(aVar5);
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
            h4.r rVarC12 = c2.l.C(x2.f(aVar3, 1.0f), 0.0f, eVar.f97921f, 0.0f, 0.0f, 13);
            d92.b.f58624b.getClass();
            x0 x0VarB4 = d92.c.b(j92.f.f97931h, mVar);
            d6.h.f57752b.getClass();
            int i114 = d6.h.f57755e;
            p1Var2 = p1Var;
            list = list3;
            m3Var = m3Var3;
            mh.c(str, rVarC12, 0L, null, 0L, null, 0L, d6.h.a(i114), 0L, 0, false, 0, 0, null, x0VarB4, mVar, 0, 0, 130044);
            mh.c(g22.n.g(str3), c2.l.C(x2.f(aVar3, 1.0f), 0.0f, eVar.f97920e, 0.0f, 0.0f, 13), 0L, null, 0L, null, 0L, d6.h.a(i114), 0L, 0, false, 0, 0, null, d92.c.b(j92.f.f97927d, mVar), mVar, 0, 0, 130044);
            mh.c(str4, c2.l.C(x2.f(aVar3, 1.0f), 0.0f, eVar.f97921f, 0.0f, 0.0f, 13), 0L, null, 0L, null, 0L, d6.h.a(i114), 0L, 0, false, 0, 0, null, d92.c.b(j92.f.f97932i, mVar), mVar, 0, 0, 130044);
            h4.r rVarC13 = c2.l.C(x2.f(aVar3, 1.0f), 0.0f, eVar.f97921f, 0.0f, 0.0f, 13);
            s2VarA = q2.a(c2.j.f22696f, h4.d.a.f81533k, mVar, 6);
            iHashCode2 = Long.hashCode(mVar.getU());
            i2VarX2 = mVar.x();
            rVarC2 = h4.k.c(rVarC13, mVar);
            if (mVar.F() != null) {
                p0.l();
                throw null;
            }
            mVar.z();
            if (mVar.getT()) {
                mVar.M(aVar5);
            } else {
                mVar.c();
            }
            b4.c(eVar2, s2VarA, mVar);
            b4.c(c1623g, i2VarX2, mVar);
            if (mVar.getT()) {
                v.h.z(iHashCode2, mVar, iHashCode2, bVar);
            } else {
                v.h.z(iHashCode2, mVar, iHashCode2, bVar);
            }
            b4.c(fVar, rVarC2, mVar);
            u2Var = u2.f22900a;
            mVar.C(-341416985);
            i15 = 0;
            while (r1.hasNext()) {
                i16 = i15 + 1;
                if (i15 >= 0) {
                    p13.x.q();
                    throw null;
                }
                String str8 = (String) obj3;
                list2 = list;
                m4.b0 b0Var6 = (m4.b0) list2.get(i15);
                if (i15 == p13.x.j((List) p1Var5.getF182175a())) {
                    x5.p.f188918b.getClass();
                    i17 = x5.p.f188926j;
                } else {
                    x5.p.f188918b.getClass();
                    i17 = x5.p.f188925i;
                }
                int i115 = i17;
                m3Var2 = m3Var;
                zK = mVar.k(i15) | mVar.r(list2) | mVar.B(m3Var2);
                objQ3 = mVar.q();
                if (zK) {
                    aVar.getClass();
                    if (objQ3 == p3.m.a.f135155b) {
                        p1 p1Var13 = p1Var5;
                        k0Var = new cw1.k0(i15, list2, m3Var2, p1Var13, 12);
                        p1Var4 = p1Var13;
                        mVar.K(k0Var);
                    } else {
                        k0Var = objQ3;
                        p1Var4 = p1Var5;
                    }
                } else {
                    p1 p1Var14 = p1Var5;
                    k0Var = new cw1.k0(i15, list2, m3Var2, p1Var14, 12);
                    p1Var4 = p1Var14;
                    mVar.K(k0Var);
                }
                e23.l lVar8 = (e23.l) k0Var;
                zK2 = mVar.k(i15) | mVar.r(list2);
                objQ4 = mVar.q();
                if (zK2) {
                    aVar.getClass();
                    if (objQ4 == p3.m.a.f135155b) {
                        objQ4 = new a83.a(i15, list2, p1Var4, 14);
                        mVar.K(objQ4);
                    }
                } else {
                    objQ4 = new a83.a(i15, list2, p1Var4, 14);
                    mVar.K(objQ4);
                }
                ta0.m.c(u2Var, str8, b0Var6, i115, lVar8, (e23.a) objQ4, mVar, 6);
                i15 = i16;
                p1Var5 = p1Var4;
                list = list2;
                m3Var = m3Var2;
            }
            p1Var3 = p1Var5;
            mVar.f();
            mVar.y();
            mVar.y();
            String strQ4 = gl1.y.Q(mVar, R.string.lbl_start);
            lVar2 = lVar;
            zB2 = mVar.B(lVar2);
            objQ2 = mVar.q();
            if (zB2) {
                aVar.getClass();
                if (objQ2 == p3.m.a.f135155b) {
                    objQ2 = new lm0.o(lVar2, p1Var3, p1Var2, 7);
                    mVar.K(objQ2);
                }
            } else {
                objQ2 = new lm0.o(lVar2, p1Var3, p1Var2, 7);
                mVar.K(objQ2);
            }
            da0.b.a(null, strQ4, (e23.a) objQ2, false, null, null, false, null, null, false, mVar, 0, 1017);
            mVar.y();
            x1 x1Var5 = p3.n.f135158a;
        } else {
            mVar.e();
        }
        return Unit.INSTANCE;
    }

    /* JADX WARN: Code duplicated, block: B:19:0x00aa  */
    /* JADX WARN: Code duplicated, block: B:24:0x00ca  */
    /* JADX WARN: Code duplicated, block: B:29:0x00e7  */
    /* JADX WARN: Code duplicated, block: B:34:0x0104  */
    /* JADX WARN: Multi-variable type inference failed */
    private final Object k(Object obj, Object obj2) {
        tb0.p pVar = (tb0.p) this.f317d;
        String str = (String) this.f316c;
        o90.a aVar = (o90.a) this.f318e;
        e23.l lVar = (e23.l) this.f319f;
        e23.a aVar2 = (e23.a) this.f315b;
        tb0.q qVar = (tb0.q) this.f320g;
        e23.a aVar3 = (e23.a) this.f322i;
        p1 p1Var = (p1) this.f321h;
        x3 x3Var = (x3) this.f323j;
        x3 x3Var2 = (x3) this.f324k;
        p3.m mVar = (p3.m) obj;
        int iIntValue = ((Integer) obj2).intValue();
        int i14 = 0;
        if (mVar.n(iIntValue & 1, (iIntValue & 3) != 2)) {
            x1 x1Var = p3.n.f135158a;
            if (((tb0.s) p1Var.getF182175a()).f163700a) {
                mVar.C(-1978876415);
                mVar.f();
            } else if (((tb0.s) p1Var.getF182175a()).f163701b || pVar == null) {
                mVar.C(-1978744634);
                ub0.d.a(str, aVar, lVar, aVar2, mVar, 0);
                mVar.f();
            } else {
                mVar.C(-1978438013);
                ub0.l lVar2 = (ub0.l) x3Var.getF182175a();
                ub0.m mVar2 = (ub0.m) x3Var2.getF182175a();
                RenderMode renderMode = ((tb0.s) p1Var.getF182175a()).f163702c;
                boolean z14 = ((tb0.s) p1Var.getF182175a()).f163703d;
                boolean zR = mVar.r(qVar);
                Object objQ = mVar.q();
                p3.m.a aVar4 = p3.m.f135153a;
                if (zR) {
                    objQ = new tb0.e.a(qVar);
                    mVar.K(objQ);
                } else {
                    aVar4.getClass();
                    if (objQ == p3.m.a.f135155b) {
                        objQ = new tb0.e.a(qVar);
                        mVar.K(objQ);
                    }
                }
                k23.g gVar = (k23.g) objQ;
                boolean zB = mVar.B(aVar3) | mVar.r(qVar);
                Object objQ2 = mVar.q();
                if (zB) {
                    objQ2 = new tb0.d(i14, aVar3, qVar);
                    mVar.K(objQ2);
                } else {
                    aVar4.getClass();
                    if (objQ2 == p3.m.a.f135155b) {
                        objQ2 = new tb0.d(i14, aVar3, qVar);
                        mVar.K(objQ2);
                    }
                }
                e23.a aVar5 = (e23.a) objQ2;
                e23.a aVar6 = (e23.a) gVar;
                boolean zR2 = mVar.r(qVar);
                Object objQ3 = mVar.q();
                if (zR2) {
                    objQ3 = new w0(qVar, 18);
                    mVar.K(objQ3);
                } else {
                    aVar4.getClass();
                    if (objQ3 == p3.m.a.f135155b) {
                        objQ3 = new w0(qVar, 18);
                        mVar.K(objQ3);
                    }
                }
                e23.a aVar7 = (e23.a) objQ3;
                boolean zR3 = mVar.r(qVar);
                Object objQ4 = mVar.q();
                if (zR3) {
                    objQ4 = new s70.b0(qVar, 23);
                    mVar.K(objQ4);
                } else {
                    aVar4.getClass();
                    if (objQ4 == p3.m.a.f135155b) {
                        objQ4 = new s70.b0(qVar, 23);
                        mVar.K(objQ4);
                    }
                }
                tb0.e.c(lVar2, mVar2, pVar, str, renderMode, z14, aVar5, aVar6, aVar7, (e23.l) objQ4, lVar, mVar, 0);
                mVar.f();
            }
        } else {
            mVar.e();
        }
        return Unit.INSTANCE;
    }

    /* JADX WARN: Code duplicated, block: B:155:0x065b  */
    /* JADX WARN: Code duplicated, block: B:226:0x07b3  */
    /* JADX WARN: Code duplicated, block: B:282:0x08d0  */
    /* JADX WARN: Code duplicated, block: B:283:0x08dc  */
    /* JADX WARN: Code duplicated, block: B:285:0x0911  */
    /* JADX WARN: Code duplicated, block: B:289:0x0976  */
    /* JADX WARN: Code duplicated, block: B:291:0x097f  */
    /* JADX WARN: Code duplicated, block: B:292:0x0983  */
    /* JADX WARN: Code duplicated, block: B:297:0x09a0  */
    /* JADX WARN: Code duplicated, block: B:300:0x09ca  */
    /* JADX WARN: Code duplicated, block: B:302:0x09d1  */
    /* JADX WARN: Code duplicated, block: B:305:0x09e9  */
    /* JADX WARN: Code duplicated, block: B:308:0x09f1  */
    /* JADX WARN: Code duplicated, block: B:309:0x09f4  */
    /* JADX WARN: Code duplicated, block: B:312:0x0a12  */
    /* JADX WARN: Code duplicated, block: B:314:0x0a19  */
    /* JADX WARN: Code duplicated, block: B:317:0x0a50  */
    /* JADX WARN: Code duplicated, block: B:319:0x0a57  */
    /* JADX WARN: Code duplicated, block: B:321:0x0a69  */
    /* JADX WARN: Code duplicated, block: B:353:0x0bb8  */
    /* JADX WARN: Code duplicated, block: B:361:0x0c1e  */
    /* JADX WARN: Code duplicated, block: B:366:0x0c3c  */
    /* JADX WARN: Code duplicated, block: B:372:0x0c92  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v30, types: [T, m52.b] */
    /* JADX WARN: Type inference failed for: r14v4, types: [T, m52.j] */
    /* JADX WARN: Type inference failed for: r6v21, types: [T, java.lang.Enum, m52.a] */
    @Override // e23.p
    public final Object invoke(Object obj, Object obj2) {
        mc mcVar;
        p1 p1Var;
        h5.g.a.f fVar;
        Object objQ;
        c2.z zVarA;
        int iHashCode;
        i2 i2VarX;
        h4.r rVarC;
        boolean zR;
        Object objQ2;
        boolean zR2;
        Object objQ3;
        p1 p1Var2;
        boolean zR3;
        Object objQ4;
        mc mcVar2;
        boolean zR4;
        Object objQ5;
        double d14;
        boolean z14;
        com.garmin.android.apps.connectmobile.workouts.data.model.j0 j0Var;
        m52.k kVar;
        Object cVar;
        lc.m0 m0Var;
        int i14 = this.f314a;
        p3.m.a aVar = p3.m.f135153a;
        Object obj3 = this.f315b;
        Object obj4 = this.f321h;
        Object obj5 = this.f320g;
        Object obj6 = this.f324k;
        Object obj7 = this.f323j;
        Object obj8 = this.f322i;
        Object obj9 = this.f319f;
        Object obj10 = this.f318e;
        Object obj11 = this.f317d;
        Object obj12 = this.f316c;
        switch (i14) {
            case 0:
                String str = (String) obj12;
                i53.f fVar2 = (i53.f) obj11;
                j0 j0Var2 = (j0) obj10;
                i iVar = (i) obj9;
                e23.p pVar = (e23.p) obj5;
                p1 p1Var3 = (p1) obj4;
                p3.l1 l1Var = (p3.l1) obj8;
                n1 n1Var = (n1) obj7;
                n1 n1Var2 = (n1) obj6;
                e23.a aVar2 = (e23.a) obj3;
                p3.m mVar = (p3.m) obj;
                int iIntValue = ((Integer) obj2).intValue();
                if (mVar.n(iIntValue & 1, (iIntValue & 3) != 2)) {
                    x1 x1Var = p3.n.f135158a;
                    d92.b.f58623a.getClass();
                    d92.b.f58625c.getClass();
                    k2.h hVarA = k2.i.a(j92.b.f97900c.f97910b);
                    i3.l1 l1Var2 = i3.l1.f88793a;
                    long jC = com.nimbusds.jose.shaded.gson.internal.a.c(mVar);
                    long jB = d92.b.a(mVar).k().b();
                    l1Var2.getClass();
                    o1.a(null, hVarA, i3.l1.a(0, 12, jC, jB, mVar), null, z3.f.c(894323791, new l(str, fVar2, j0Var2, iVar, pVar, p1Var3, l1Var, n1Var, n1Var2, aVar2), mVar), mVar, 196608, 25);
                } else {
                    mVar.e();
                }
                return Unit.INSTANCE;
            case 1:
                final af0.h hVar = (af0.h) obj12;
                e23.a aVar3 = (e23.a) obj3;
                Context context = (Context) obj11;
                we0.d dVar = (we0.d) obj10;
                x3 x3Var = (x3) obj9;
                x3 x3Var2 = (x3) obj5;
                x3 x3Var3 = (x3) obj4;
                x3 x3Var4 = (x3) obj8;
                x3 x3Var5 = (x3) obj7;
                x3 x3Var6 = (x3) obj6;
                p3.m mVar2 = (p3.m) obj;
                int iIntValue2 = ((Integer) obj2).intValue();
                if (mVar2.n(iIntValue2 & 1, (iIntValue2 & 3) != 2)) {
                    x1 x1Var2 = p3.n.f135158a;
                    h4.r.a aVar4 = h4.r.S;
                    h4.r rVarB = a2.b(c2.l.p(aVar4), a2.a(mVar2), true);
                    c2.j.f22691a.getClass();
                    c2.j.k kVar2 = c2.j.f22694d;
                    h4.d.f81522a.getClass();
                    c2.z zVarA2 = c2.y.a(kVar2, h4.d.a.f81536n, mVar2, 0);
                    int iHashCode2 = Long.hashCode(mVar2.getU());
                    i2 i2VarX2 = mVar2.x();
                    h4.r rVarC2 = h4.k.c(rVarB, mVar2);
                    h5.g.V.getClass();
                    h5.e0.a aVar5 = h5.g.a.f81805b;
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
                    b4.c(h5.g.a.f81810g, zVarA2, mVar2);
                    b4.c(h5.g.a.f81809f, i2VarX2, mVar2);
                    h5.g.a.b bVar = h5.g.a.f81813j;
                    if (mVar2.getT() || !p005kotlin.jvm.internal.s.g(mVar2.q(), Integer.valueOf(iHashCode2))) {
                        v.h.z(iHashCode2, mVar2, iHashCode2, bVar);
                    }
                    b4.c(h5.g.a.f81807d, rVarC2, mVar2);
                    c2.b0 b0Var = c2.b0.f22601a;
                    d92.b.f58623a.getClass();
                    d92.b.f58625c.getClass();
                    j92.e eVar = j92.b.f97899b;
                    c2.l.f(c2.l.C(aVar4, 0.0f, eVar.f97920e, 0.0f, 0.0f, 13), mVar2);
                    af0.f.b(hVar, mVar2, 0);
                    c2.l.f(c2.l.C(aVar4, 0.0f, eVar.f97921f, 0.0f, 0.0f, 13), mVar2);
                    we0.f fVar3 = (we0.f) x3Var.getF182175a();
                    String str2 = (String) x3Var2.getF182175a();
                    boolean zR5 = mVar2.r(hVar);
                    Object objQ6 = mVar2.q();
                    if (zR5) {
                        final int i15 = 0;
                        objQ6 = new e23.l() { // from class: af0.d
                            @Override // e23.l
                            public final Object invoke(Object obj13) {
                                switch (i15) {
                                    case 0:
                                        String str3 = (String) obj13;
                                        str3.getClass();
                                        hVar.f3056j.k(null, str3);
                                        break;
                                    case 1:
                                        List list = (List) obj13;
                                        list.getClass();
                                        hVar.f3058l.setValue(i53.a.j(list));
                                        break;
                                    default:
                                        String str4 = (String) obj13;
                                        str4.getClass();
                                        hVar.f3061o.k(null, str4);
                                        break;
                                }
                                return Unit.INSTANCE;
                            }
                        };
                        mVar2.K(objQ6);
                    } else {
                        aVar.getClass();
                        if (objQ6 == p3.m.a.f135155b) {
                            final int i16 = 0;
                            objQ6 = new e23.l() { // from class: af0.d
                                @Override // e23.l
                                public final Object invoke(Object obj13) {
                                    switch (i16) {
                                        case 0:
                                            String str3 = (String) obj13;
                                            str3.getClass();
                                            hVar.f3056j.k(null, str3);
                                            break;
                                        case 1:
                                            List list = (List) obj13;
                                            list.getClass();
                                            hVar.f3058l.setValue(i53.a.j(list));
                                            break;
                                        default:
                                            String str4 = (String) obj13;
                                            str4.getClass();
                                            hVar.f3061o.k(null, str4);
                                            break;
                                    }
                                    return Unit.INSTANCE;
                                }
                            };
                            mVar2.K(objQ6);
                        }
                    }
                    af0.b.a(null, fVar3, str2, (e23.l) objQ6, mVar2, 0);
                    c2.l.f(c2.l.C(aVar4, 0.0f, eVar.f97921f, 0.0f, 0.0f, 13), mVar2);
                    we0.b bVar2 = (we0.b) x3Var3.getF182175a();
                    if (bVar2 == null) {
                        mVar2.C(841763728);
                        mVar2.f();
                    } else {
                        mVar2.C(841763729);
                        i53.c cVar2 = (i53.c) x3Var4.getF182175a();
                        String str3 = (String) x3Var5.getF182175a();
                        boolean zR6 = mVar2.r(hVar);
                        Object objQ7 = mVar2.q();
                        if (zR6) {
                            final int i17 = 1;
                            objQ7 = new e23.l() { // from class: af0.d
                                @Override // e23.l
                                public final Object invoke(Object obj13) {
                                    switch (i17) {
                                        case 0:
                                            String str4 = (String) obj13;
                                            str4.getClass();
                                            hVar.f3056j.k(null, str4);
                                            break;
                                        case 1:
                                            List list = (List) obj13;
                                            list.getClass();
                                            hVar.f3058l.setValue(i53.a.j(list));
                                            break;
                                        default:
                                            String str5 = (String) obj13;
                                            str5.getClass();
                                            hVar.f3061o.k(null, str5);
                                            break;
                                    }
                                    return Unit.INSTANCE;
                                }
                            };
                            mVar2.K(objQ7);
                        } else {
                            aVar.getClass();
                            if (objQ7 == p3.m.a.f135155b) {
                                final int i18 = 1;
                                objQ7 = new e23.l() { // from class: af0.d
                                    @Override // e23.l
                                    public final Object invoke(Object obj13) {
                                        switch (i18) {
                                            case 0:
                                                String str4 = (String) obj13;
                                                str4.getClass();
                                                hVar.f3056j.k(null, str4);
                                                break;
                                            case 1:
                                                List list = (List) obj13;
                                                list.getClass();
                                                hVar.f3058l.setValue(i53.a.j(list));
                                                break;
                                            default:
                                                String str5 = (String) obj13;
                                                str5.getClass();
                                                hVar.f3061o.k(null, str5);
                                                break;
                                        }
                                        return Unit.INSTANCE;
                                    }
                                };
                                mVar2.K(objQ7);
                            }
                        }
                        e23.l lVar = (e23.l) objQ7;
                        boolean zR7 = mVar2.r(hVar);
                        Object objQ8 = mVar2.q();
                        if (zR7) {
                            final int i19 = 2;
                            objQ8 = new e23.l() { // from class: af0.d
                                @Override // e23.l
                                public final Object invoke(Object obj13) {
                                    switch (i19) {
                                        case 0:
                                            String str4 = (String) obj13;
                                            str4.getClass();
                                            hVar.f3056j.k(null, str4);
                                            break;
                                        case 1:
                                            List list = (List) obj13;
                                            list.getClass();
                                            hVar.f3058l.setValue(i53.a.j(list));
                                            break;
                                        default:
                                            String str5 = (String) obj13;
                                            str5.getClass();
                                            hVar.f3061o.k(null, str5);
                                            break;
                                    }
                                    return Unit.INSTANCE;
                                }
                            };
                            mVar2.K(objQ8);
                        } else {
                            aVar.getClass();
                            if (objQ8 == p3.m.a.f135155b) {
                                final int i110 = 2;
                                objQ8 = new e23.l() { // from class: af0.d
                                    @Override // e23.l
                                    public final Object invoke(Object obj13) {
                                        switch (i110) {
                                            case 0:
                                                String str4 = (String) obj13;
                                                str4.getClass();
                                                hVar.f3056j.k(null, str4);
                                                break;
                                            case 1:
                                                List list = (List) obj13;
                                                list.getClass();
                                                hVar.f3058l.setValue(i53.a.j(list));
                                                break;
                                            default:
                                                String str5 = (String) obj13;
                                                str5.getClass();
                                                hVar.f3061o.k(null, str5);
                                                break;
                                        }
                                        return Unit.INSTANCE;
                                    }
                                };
                                mVar2.K(objQ8);
                            }
                        }
                        af0.a.a(bVar2, cVar2, str3, lVar, (e23.l) objQ8, mVar2, 0);
                        mVar2.f();
                    }
                    l72.f0 f0Var = l72.f0.f110999a;
                    h4.r rVarY = c2.l.y(x2.f(aVar4, 1.0f), eVar.f97920e);
                    String strQ = gl1.y.Q(mVar2, R.string.common_send);
                    boolean zBooleanValue = ((Boolean) x3Var6.getF182175a()).booleanValue();
                    boolean zR8 = mVar2.r(hVar) | mVar2.B(aVar3) | mVar2.r(context) | mVar2.r(dVar);
                    Object objQ9 = mVar2.q();
                    if (zR8) {
                        af0.e eVar2 = new af0.e(hVar, aVar3, context, dVar, 0);
                        mVar2.K(eVar2);
                        objQ9 = eVar2;
                    } else {
                        aVar.getClass();
                        if (objQ9 == p3.m.a.f135155b) {
                            af0.e eVar3 = new af0.e(hVar, aVar3, context, dVar, 0);
                            mVar2.K(eVar3);
                            objQ9 = eVar3;
                        }
                    }
                    f0Var.d(0, 1, (e23.a) objQ9, rVarY, strQ, mVar2, null, zBooleanValue);
                    mVar2.y();
                } else {
                    mVar2.e();
                }
                return Unit.INSTANCE;
            case 2:
                ((Integer) obj2).getClass();
                bt1.l.b((h4.r) obj11, (String) obj12, (String) obj10, (p1) obj4, (i53.c) obj9, (i53.c) obj5, (i53.c) obj8, (e23.a) obj3, (e23.l) obj7, (e23.l) obj6, (p3.m) obj, p0.t(3073));
                return Unit.INSTANCE;
            case 3:
                pt1.s sVar = (pt1.s) obj12;
                o53.b0 b0Var2 = (o53.b0) obj11;
                mc mcVar3 = (mc) obj10;
                je2.b bVar3 = (je2.b) obj9;
                n1 n1Var3 = (n1) obj7;
                p1 p1Var4 = (p1) obj4;
                p1 p1Var5 = (p1) obj5;
                qw0.s sVar2 = (qw0.s) obj8;
                p1 p1Var6 = (p1) obj6;
                p1 p1Var7 = (p1) obj3;
                p3.m mVar3 = (p3.m) obj;
                int iIntValue3 = ((Integer) obj2).intValue();
                if (mVar3.n(iIntValue3 & 1, (iIntValue3 & 3) != 2)) {
                    x1 x1Var3 = p3.n.f135158a;
                    if (sVar != null) {
                        mVar3.C(-704855089);
                        h4.r.a aVar6 = h4.r.S;
                        h4.d.f81522a.getClass();
                        z0 z0VarD = c2.q.d(h4.d.a.f81524b, false);
                        int iHashCode3 = Long.hashCode(mVar3.getU());
                        i2 i2VarX3 = mVar3.x();
                        h4.r rVarC3 = h4.k.c(aVar6, mVar3);
                        h5.g.V.getClass();
                        h5.e0.a aVar7 = h5.g.a.f81805b;
                        if (mVar3.F() == null) {
                            p0.l();
                            throw null;
                        }
                        mVar3.z();
                        if (mVar3.getT()) {
                            mVar3.M(aVar7);
                        } else {
                            mVar3.c();
                        }
                        h5.g.a.e eVar4 = h5.g.a.f81810g;
                        b4.c(eVar4, z0VarD, mVar3);
                        h5.g.a.C1623g c1623g = h5.g.a.f81809f;
                        b4.c(c1623g, i2VarX3, mVar3);
                        h5.g.a.b bVar4 = h5.g.a.f81813j;
                        if (mVar3.getT()) {
                            mcVar = mcVar3;
                            p1Var = p1Var7;
                        } else {
                            mcVar = mcVar3;
                            p1Var = p1Var7;
                            if (!p005kotlin.jvm.internal.s.g(mVar3.q(), Integer.valueOf(iHashCode3))) {
                            }
                            fVar = h5.g.a.f81807d;
                            b4.c(fVar, rVarC3, mVar3);
                            c2.u uVar = c2.u.f22885a;
                            if (bVar3 == null) {
                                mVar3.C(-1948509513);
                                mVar3.f();
                            } else {
                                mVar3.C(-478497142);
                                h4.r rVarD = x2.d(aVar6, 1.0f);
                                i53.c<le2.d> cVarA = i53.a.a(sVar.f140964a);
                                i53.c<le2.c> cVar3 = sVar.f140965b;
                                List<ke2.b> list = sVar.f140966c;
                                int intValue = n1Var3.getIntValue();
                                boolean zBooleanValue2 = ((Boolean) p1Var4.getF182175a()).booleanValue();
                                objQ = mVar3.q();
                                aVar.getClass();
                                if (objQ == p3.m.a.f135155b) {
                                    objQ = new m(p1Var5, 27);
                                    mVar3.K(objQ);
                                }
                                bVar3.b(rVarD, cVarA, cVar3, list, intValue, true, null, zBooleanValue2, (e23.l) objQ, mVar3, 1174601734, 64);
                                mVar3.f();
                                Unit unit = Unit.INSTANCE;
                            }
                            h4.r rVarC4 = uVar.c(aVar6, h4.d.a.f81526d);
                            d92.b.f58623a.getClass();
                            d92.b.f58625c.getClass();
                            j92.e eVar5 = j92.b.f97899b;
                            h4.r rVarZ = c2.l.z(rVarC4, eVar5.f97918c, eVar5.f97920e);
                            c2.j.f22691a.getClass();
                            zVarA = c2.y.a(c2.j.f22694d, h4.d.a.f81536n, mVar3, 0);
                            iHashCode = Long.hashCode(mVar3.getU());
                            i2VarX = mVar3.x();
                            rVarC = h4.k.c(rVarZ, mVar3);
                            if (mVar3.F() != null) {
                                p0.l();
                                throw null;
                            }
                            mVar3.z();
                            if (mVar3.getT()) {
                                mVar3.M(aVar7);
                            } else {
                                mVar3.c();
                            }
                            b4.c(eVar4, zVarA, mVar3);
                            b4.c(c1623g, i2VarX, mVar3);
                            if (mVar3.getT() || !p005kotlin.jvm.internal.s.g(mVar3.q(), Integer.valueOf(iHashCode))) {
                                v.h.z(iHashCode, mVar3, iHashCode, bVar4);
                            }
                            b4.c(fVar, rVarC, mVar3);
                            c2.b0 b0Var3 = c2.b0.f22601a;
                            boolean zBooleanValue3 = ((Boolean) p1Var4.getF182175a()).booleanValue();
                            boolean zC = sVar2.c();
                            float fFloatValue = ((Number) p1Var5.getF182175a()).floatValue();
                            zR = mVar3.r(sVar2);
                            objQ2 = mVar3.q();
                            if (zR) {
                                objQ2 = new ci0.b(sVar2, 17, p1Var4, p1Var6);
                                mVar3.K(objQ2);
                            } else {
                                aVar.getClass();
                                if (objQ2 == p3.m.a.f135155b) {
                                    objQ2 = new ci0.b(sVar2, 17, p1Var4, p1Var6);
                                    mVar3.K(objQ2);
                                }
                            }
                            e23.l lVar2 = (e23.l) objQ2;
                            zR2 = mVar3.r(b0Var2);
                            objQ3 = mVar3.q();
                            if (zR2) {
                                p1Var2 = p1Var;
                                objQ3 = new et1.p(b0Var2, p1Var2, 0);
                                mVar3.K(objQ3);
                            } else {
                                aVar.getClass();
                                if (objQ3 == p3.m.a.f135155b) {
                                    p1Var2 = p1Var;
                                    objQ3 = new et1.p(b0Var2, p1Var2, 0);
                                    mVar3.K(objQ3);
                                } else {
                                    p1Var2 = p1Var;
                                }
                            }
                            e23.a aVar8 = (e23.a) objQ3;
                            zR3 = mVar3.r(b0Var2) | mVar3.r(bVar3);
                            objQ4 = mVar3.q();
                            if (zR3) {
                                objQ4 = new cw1.g0(b0Var2, bVar3, p1Var5, 10);
                                mVar3.K(objQ4);
                            } else {
                                aVar.getClass();
                                if (objQ4 == p3.m.a.f135155b) {
                                    objQ4 = new cw1.g0(b0Var2, bVar3, p1Var5, 10);
                                    mVar3.K(objQ4);
                                }
                            }
                            rw0.i.a(zBooleanValue3, zC, lVar2, aVar8, aVar6, fFloatValue, (e23.a) objQ4, mVar3, 24576, 0);
                            mVar3.y();
                            mVar3.y();
                            Boolean bool = (Boolean) p1Var2.getF182175a();
                            bool.booleanValue();
                            mcVar2 = mcVar;
                            zR4 = mVar3.r(b0Var2) | mVar3.B(mcVar2);
                            objQ5 = mVar3.q();
                            if (zR4) {
                                objQ5 = new et1.r.c(b0Var2, mcVar2, p1Var2, null);
                                mVar3.K(objQ5);
                            } else {
                                aVar.getClass();
                                if (objQ5 == p3.m.a.f135155b) {
                                    objQ5 = new et1.r.c(b0Var2, mcVar2, p1Var2, null);
                                    mVar3.K(objQ5);
                                }
                            }
                            p3.l0.e((e23.p) objQ5, bool, mVar3);
                            mVar3.f();
                        }
                        v.h.z(iHashCode3, mVar3, iHashCode3, bVar4);
                        fVar = h5.g.a.f81807d;
                        b4.c(fVar, rVarC3, mVar3);
                        c2.u uVar2 = c2.u.f22885a;
                        if (bVar3 == null) {
                            mVar3.C(-1948509513);
                            mVar3.f();
                        } else {
                            mVar3.C(-478497142);
                            h4.r rVarD2 = x2.d(aVar6, 1.0f);
                            i53.c<le2.d> cVarA2 = i53.a.a(sVar.f140964a);
                            i53.c<le2.c> cVar4 = sVar.f140965b;
                            List<ke2.b> list2 = sVar.f140966c;
                            int intValue2 = n1Var3.getIntValue();
                            boolean zBooleanValue4 = ((Boolean) p1Var4.getF182175a()).booleanValue();
                            objQ = mVar3.q();
                            aVar.getClass();
                            if (objQ == p3.m.a.f135155b) {
                                objQ = new m(p1Var5, 27);
                                mVar3.K(objQ);
                            }
                            bVar3.b(rVarD2, cVarA2, cVar4, list2, intValue2, true, null, zBooleanValue4, (e23.l) objQ, mVar3, 1174601734, 64);
                            mVar3.f();
                            Unit unit2 = Unit.INSTANCE;
                        }
                        h4.r rVarC5 = uVar2.c(aVar6, h4.d.a.f81526d);
                        d92.b.f58623a.getClass();
                        d92.b.f58625c.getClass();
                        j92.e eVar6 = j92.b.f97899b;
                        h4.r rVarZ2 = c2.l.z(rVarC5, eVar6.f97918c, eVar6.f97920e);
                        c2.j.f22691a.getClass();
                        zVarA = c2.y.a(c2.j.f22694d, h4.d.a.f81536n, mVar3, 0);
                        iHashCode = Long.hashCode(mVar3.getU());
                        i2VarX = mVar3.x();
                        rVarC = h4.k.c(rVarZ2, mVar3);
                        if (mVar3.F() != null) {
                            p0.l();
                            throw null;
                        }
                        mVar3.z();
                        if (mVar3.getT()) {
                            mVar3.M(aVar7);
                        } else {
                            mVar3.c();
                        }
                        b4.c(eVar4, zVarA, mVar3);
                        b4.c(c1623g, i2VarX, mVar3);
                        if (mVar3.getT()) {
                            v.h.z(iHashCode, mVar3, iHashCode, bVar4);
                        } else {
                            v.h.z(iHashCode, mVar3, iHashCode, bVar4);
                        }
                        b4.c(fVar, rVarC, mVar3);
                        c2.b0 b0Var4 = c2.b0.f22601a;
                        boolean zBooleanValue5 = ((Boolean) p1Var4.getF182175a()).booleanValue();
                        boolean zC2 = sVar2.c();
                        float fFloatValue2 = ((Number) p1Var5.getF182175a()).floatValue();
                        zR = mVar3.r(sVar2);
                        objQ2 = mVar3.q();
                        if (zR) {
                            aVar.getClass();
                            if (objQ2 == p3.m.a.f135155b) {
                                objQ2 = new ci0.b(sVar2, 17, p1Var4, p1Var6);
                                mVar3.K(objQ2);
                            }
                        } else {
                            objQ2 = new ci0.b(sVar2, 17, p1Var4, p1Var6);
                            mVar3.K(objQ2);
                        }
                        e23.l lVar3 = (e23.l) objQ2;
                        zR2 = mVar3.r(b0Var2);
                        objQ3 = mVar3.q();
                        if (zR2) {
                            aVar.getClass();
                            if (objQ3 == p3.m.a.f135155b) {
                                p1Var2 = p1Var;
                                objQ3 = new et1.p(b0Var2, p1Var2, 0);
                                mVar3.K(objQ3);
                            } else {
                                p1Var2 = p1Var;
                            }
                        } else {
                            p1Var2 = p1Var;
                            objQ3 = new et1.p(b0Var2, p1Var2, 0);
                            mVar3.K(objQ3);
                        }
                        e23.a aVar9 = (e23.a) objQ3;
                        zR3 = mVar3.r(b0Var2) | mVar3.r(bVar3);
                        objQ4 = mVar3.q();
                        if (zR3) {
                            aVar.getClass();
                            if (objQ4 == p3.m.a.f135155b) {
                                objQ4 = new cw1.g0(b0Var2, bVar3, p1Var5, 10);
                                mVar3.K(objQ4);
                            }
                        } else {
                            objQ4 = new cw1.g0(b0Var2, bVar3, p1Var5, 10);
                            mVar3.K(objQ4);
                        }
                        rw0.i.a(zBooleanValue5, zC2, lVar3, aVar9, aVar6, fFloatValue2, (e23.a) objQ4, mVar3, 24576, 0);
                        mVar3.y();
                        mVar3.y();
                        Boolean bool2 = (Boolean) p1Var2.getF182175a();
                        bool2.booleanValue();
                        mcVar2 = mcVar;
                        zR4 = mVar3.r(b0Var2) | mVar3.B(mcVar2);
                        objQ5 = mVar3.q();
                        if (zR4) {
                            aVar.getClass();
                            if (objQ5 == p3.m.a.f135155b) {
                                objQ5 = new et1.r.c(b0Var2, mcVar2, p1Var2, null);
                                mVar3.K(objQ5);
                            }
                        } else {
                            objQ5 = new et1.r.c(b0Var2, mcVar2, p1Var2, null);
                            mVar3.K(objQ5);
                        }
                        p3.l0.e((e23.p) objQ5, bool2, mVar3);
                        mVar3.f();
                    } else {
                        mVar3.C(-702564065);
                        mVar3.f();
                    }
                } else {
                    mVar3.e();
                }
                return Unit.INSTANCE;
            case 4:
                p13.k kVar3 = (p13.k) obj12;
                p005kotlin.jvm.internal.p0 p0Var = (p005kotlin.jvm.internal.p0) obj11;
                com.garmin.android.apps.connectmobile.workouts.presentation.edit.q qVar = (com.garmin.android.apps.connectmobile.workouts.presentation.edit.q) obj10;
                n0 n0Var = (n0) obj9;
                n0 n0Var2 = (n0) obj5;
                r0 r0Var = (r0) obj4;
                r0 r0Var2 = (r0) obj8;
                p005kotlin.jvm.internal.m0 m0Var2 = (p005kotlin.jvm.internal.m0) obj7;
                r0 r0Var3 = (r0) obj6;
                p005kotlin.jvm.internal.m0 m0Var3 = (p005kotlin.jvm.internal.m0) obj3;
                l52.r rVar = (l52.r) obj;
                l52.i.a aVar10 = (l52.i.a) obj2;
                m52.j jVar = com.garmin.android.apps.connectmobile.workouts.presentation.edit.r.f49273q;
                rVar.getClass();
                aVar10.getClass();
                com.garmin.android.apps.connectmobile.workouts.data.model.j0 j0Var3 = (com.garmin.android.apps.connectmobile.workouts.data.model.j0) aVar10.getData();
                while (true) {
                    l52.i.a aVar11 = (l52.i.a) kVar3.h();
                    if (aVar11 != null && !aVar11.d(aVar10)) {
                        p0Var.f105807a /= ((com.garmin.android.apps.connectmobile.workouts.data.model.j0) ((l52.i.a) kVar3.removeLast()).getData()).f48219e;
                    }
                }
                if (aVar10.f()) {
                    kVar3.addLast(aVar10);
                    p0Var.f105807a *= j0Var3.f48219e;
                    return Unit.INSTANCE;
                }
                m52.d dVar2 = j0Var3.f48217c;
                ?? r14 = j0Var3.f48227l;
                double d15 = j0Var3.f48229n;
                m52.k kVar4 = qVar.f49245a;
                com.garmin.android.apps.connectmobile.workouts.presentation.edit.d dVar3 = qVar.f49260p;
                m52.k kVar5 = m52.k.f116758r;
                double dF = kVar4 == kVar5 ? v52.e.f(j0Var3, Double.valueOf(dVar3.getF48947b())) : v52.e.g(j0Var3, Double.valueOf(qVar.f49254j));
                if (dF <= 0.0d && !v52.e.i(j0Var3, kVar4)) {
                    n0Var.f105805a = 0.0d;
                    n0Var2.f105805a = 0.0d;
                    Unit unit3 = Unit.INSTANCE;
                    int i24 = o13.q.f128596b;
                    rVar.a(unit3);
                    return unit3;
                }
                T t7 = r0Var.f105810a;
                if (t7 == 0) {
                    r0Var.f105810a = r14;
                } else if (dVar2 != m52.d.REST && t7 != r14 && dF >= 0.0d) {
                    r0Var2.f105810a = m52.b.TIME_AND_DISTANCE_ESTIMATED;
                }
                if (m0Var2.f105804a) {
                    d14 = 0.0d;
                } else {
                    if (r14 != m52.a.f116650f) {
                        kVar = kVar5;
                        if (kVar4 != kVar) {
                            r0Var3.f105810a = null;
                            m0Var2.f105804a = true;
                            m0Var3.f105804a = false;
                        }
                        d14 = 0.0d;
                    } else {
                        kVar = kVar5;
                    }
                    T t14 = r0Var3.f105810a;
                    ?? r15 = j0Var3.f48231p;
                    if (t14 == 0) {
                        r0Var3.f105810a = r15;
                    } else if (t14 != r15 && kVar4 != kVar) {
                        m52.j jVar2 = (m52.j) t14;
                        m52.j jVar3 = m52.j.f116746f;
                        d14 = 0.0d;
                        if ((jVar2 == jVar3 && r15 == m52.j.f116747g) || (jVar2 == m52.j.f116747g && r15 == jVar3)) {
                            m0Var3.f105804a = true;
                        } else {
                            r0Var3.f105810a = null;
                            m0Var2.f105804a = true;
                            m0Var3.f105804a = false;
                        }
                    }
                    d14 = 0.0d;
                }
                m52.d dVar4 = m52.d.REST;
                if (dVar2 == dVar4 || dVar2 == m52.d.RECOVERY) {
                    l52.i.a aVar12 = (l52.i.a) kVar3.h();
                    if ((aVar12 == null || (j0Var = (com.garmin.android.apps.connectmobile.workouts.data.model.j0) aVar12.getData()) == null) ? false : p005kotlin.jvm.internal.s.g(j0Var.f48221g, Boolean.TRUE)) {
                        z14 = true;
                    } else {
                        z14 = false;
                    }
                } else {
                    z14 = false;
                }
                int i25 = p0Var.f105807a;
                if (z14) {
                    i25--;
                }
                if (dF > d14 || v52.e.i(j0Var3, kVar4)) {
                    if (r14 != 0 && r14.f116662b) {
                        double d16 = i25;
                        n0Var.f105805a = (d15 * d16) + n0Var.f105805a;
                        if (dVar2 != dVar4) {
                            n0Var2.f105805a = (dF * d16) + n0Var2.f105805a;
                        }
                    } else {
                        if (dVar2 != dVar4) {
                            n0Var2.f105805a = (((double) i25) * d15) + n0Var2.f105805a;
                        }
                        n0Var.f105805a = (dF * ((double) i25)) + n0Var.f105805a;
                    }
                } else {
                    com.garmin.android.apps.connectmobile.a2 a2Var = com.garmin.android.apps.connectmobile.a2.WORKOUTS;
                    String strJ = androidx.room.a0.j("Skipping ", dVar2 != null ? dVar2.name() : null, " step from adding distance and time, end Condition typr: ", r14 != 0 ? r14.name() : null);
                    com.garmin.android.apps.connectmobile.i2.f36769a.getClass();
                    com.garmin.android.apps.connectmobile.i2.a.a(a2Var, strJ);
                }
                return Unit.INSTANCE;
            case 5:
                lc.m0 m0Var4 = (lc.m0) obj11;
                Long l14 = (Long) obj10;
                String str4 = (String) obj12;
                c.q qVar2 = (c.q) obj9;
                Context context2 = (Context) obj5;
                e23.a aVar13 = (e23.a) obj3;
                kl1.a aVar14 = (kl1.a) obj4;
                b.u uVar3 = (b.u) obj8;
                l80.b bVar5 = (l80.b) obj7;
                ws.a aVar15 = (ws.a) obj6;
                p3.m mVar4 = (p3.m) obj;
                int iIntValue4 = ((Integer) obj2).intValue();
                if (mVar4.n(1 & iIntValue4, (iIntValue4 & 3) != 2)) {
                    x1 x1Var4 = p3.n.f135158a;
                    gl1.h hVar2 = gl1.h.INSTANCE;
                    boolean zB = mVar4.B(l14) | mVar4.r(m0Var4) | mVar4.B(str4) | mVar4.r(qVar2) | mVar4.r(context2) | mVar4.B(aVar13) | mVar4.r(aVar14) | mVar4.r(uVar3) | mVar4.r(bVar5) | mVar4.r(aVar15);
                    Object objQ10 = mVar4.q();
                    if (zB) {
                        m0Var = m0Var4;
                        cVar = new av0.c(context2, uVar3, qVar2, aVar13, l14, str4, aVar14, bVar5, m0Var, aVar15);
                        mVar4.K(cVar);
                    } else {
                        aVar.getClass();
                        if (objQ10 == p3.m.a.f135155b) {
                            m0Var = m0Var4;
                            cVar = new av0.c(context2, uVar3, qVar2, aVar13, l14, str4, aVar14, bVar5, m0Var, aVar15);
                            mVar4.K(cVar);
                        } else {
                            cVar = objQ10;
                            m0Var = m0Var4;
                        }
                    }
                    nc.y.a(m0Var, hVar2, null, null, null, null, null, null, null, (e23.l) cVar, mVar4, 48, 2044);
                } else {
                    mVar4.e();
                }
                return Unit.INSTANCE;
            case 6:
                n82.f fVar4 = (n82.f) obj12;
                ug2.x xVar = (ug2.x) obj10;
                e23.a aVar16 = (e23.a) obj3;
                e23.a aVar17 = (e23.a) obj9;
                p1 p1Var8 = (p1) obj4;
                e23.a aVar18 = (e23.a) obj5;
                i53.f fVar5 = (i53.f) obj11;
                yd1.a aVar19 = (yd1.a) obj8;
                gw0.u uVar4 = (gw0.u) obj7;
                ug2.x xVar2 = (ug2.x) obj6;
                p3.m mVar5 = (p3.m) obj;
                int iIntValue5 = ((Integer) obj2).intValue();
                if (mVar5.n(1 & iIntValue5, (iIntValue5 & 3) != 2)) {
                    x1 x1Var5 = p3.n.f135158a;
                    h4.r.a aVar20 = h4.r.S;
                    h4.r rVarE = u1.n.e(x2.d(aVar20, 1.0f), tn.k.a(d92.b.f58623a, mVar5), m1.f128891a);
                    c2.j.f22691a.getClass();
                    c2.j.k kVar6 = c2.j.f22694d;
                    h4.d.f81522a.getClass();
                    c2.z zVarA3 = c2.y.a(kVar6, h4.d.a.f81536n, mVar5, 0);
                    int iHashCode4 = Long.hashCode(mVar5.getU());
                    i2 i2VarX4 = mVar5.x();
                    h4.r rVarC6 = h4.k.c(rVarE, mVar5);
                    h5.g.V.getClass();
                    h5.e0.a aVar21 = h5.g.a.f81805b;
                    if (mVar5.F() == null) {
                        p0.l();
                        throw null;
                    }
                    mVar5.z();
                    if (mVar5.getT()) {
                        mVar5.M(aVar21);
                    } else {
                        mVar5.c();
                    }
                    h5.g.a.e eVar7 = h5.g.a.f81810g;
                    b4.c(eVar7, zVarA3, mVar5);
                    h5.g.a.C1623g c1623g2 = h5.g.a.f81809f;
                    b4.c(c1623g2, i2VarX4, mVar5);
                    h5.g.a.b bVar6 = h5.g.a.f81813j;
                    if (mVar5.getT() || !p005kotlin.jvm.internal.s.g(mVar5.q(), Integer.valueOf(iHashCode4))) {
                        v.h.z(iHashCode4, mVar5, iHashCode4, bVar6);
                    }
                    h5.g.a.f fVar6 = h5.g.a.f81807d;
                    b4.c(fVar6, rVarC6, mVar5);
                    c2.b0 b0Var5 = c2.b0.f22601a;
                    ArrayList arrayListC = p13.u.C(new gw0.a[]{(((gw0.h0) p1Var8.getF182175a()).f79616h && fVar4.f124961b.a() == o82.g.f130850c) ? gw0.a.AUTO_LOGGING_BEHAVIORS : null, ((gw0.h0) p1Var8.getF182175a()).f79615g ? gw0.a.PREGNANCY_AND_LOGGING : null});
                    if (arrayListC.isEmpty()) {
                        mVar5.C(-1190559445);
                        mVar5.f();
                    } else {
                        mVar5.C(-1190927508);
                        gw0.t.b(b0Var5, arrayListC, xVar, aVar16, aVar17, mVar5, 6);
                        mVar5.f();
                    }
                    z0 z0VarD2 = c2.q.d(h4.d.a.f81524b, false);
                    int iHashCode5 = Long.hashCode(mVar5.getU());
                    i2 i2VarX5 = mVar5.x();
                    h4.r rVarC7 = h4.k.c(aVar20, mVar5);
                    if (mVar5.F() == null) {
                        p0.l();
                        throw null;
                    }
                    mVar5.z();
                    if (mVar5.getT()) {
                        mVar5.M(aVar21);
                    } else {
                        mVar5.c();
                    }
                    b4.c(eVar7, z0VarD2, mVar5);
                    b4.c(c1623g2, i2VarX5, mVar5);
                    if (mVar5.getT() || !p005kotlin.jvm.internal.s.g(mVar5.q(), Integer.valueOf(iHashCode5))) {
                        v.h.z(iHashCode5, mVar5, iHashCode5, bVar6);
                    }
                    b4.c(fVar6, rVarC7, mVar5);
                    c2.u uVar5 = c2.u.f22885a;
                    g6.k.a aVar22 = g6.k.f76003b;
                    a1.a(gl1.y.Q(mVar5, R.string.msg_lifestyle_logging_reports_hint), w1.BottomCenter, l72.x1.Center, null, (((long) (-64)) << 32) | (((long) 16) & 4294967295L), ((gw0.h0) p1Var8.getF182175a()).f79613e, aVar18, z3.f.c(-1122868884, new bv0.e(fVar4, fVar5, p1Var8, aVar18, aVar19, uVar4, xVar2, 1), mVar5), mVar5, 100863360, 18);
                    mVar5.y();
                    mVar5.y();
                } else {
                    mVar5.e();
                }
                return Unit.INSTANCE;
            case 7:
                ((Integer) obj2).getClass();
                kj2.d.a((h4.r) obj11, (String) obj12, (z1) obj10, (p006l2.a2) obj9, (List) obj4, (e23.l) obj8, (e23.l) obj7, (e23.p) obj5, (o13.p) obj6, (nj2.a.b) obj3, (p3.m) obj, p0.t(805309447));
                return Unit.INSTANCE;
            case 8:
                km0.d dVar5 = (km0.d) obj12;
                x3 x3Var7 = (x3) obj11;
                x3 x3Var8 = (x3) obj10;
                lc.m0 m0Var5 = (lc.m0) obj9;
                km0.i iVar2 = (km0.i) obj5;
                Context context3 = (Context) obj8;
                e23.r rVar2 = (e23.r) obj7;
                x3 x3Var9 = (x3) obj6;
                e23.a aVar23 = (e23.a) obj3;
                p1 p1Var9 = (p1) obj4;
                p3.m mVar6 = (p3.m) obj;
                int iIntValue6 = ((Integer) obj2).intValue();
                if (mVar6.n(1 & iIntValue6, (iIntValue6 & 3) != 2)) {
                    x1 x1Var6 = p3.n.f135158a;
                    h4.r.a aVar24 = h4.r.S;
                    h4.r rVarC8 = wz1.i.c(aVar24, mVar6);
                    c2.j.f22691a.getClass();
                    c2.j.k kVar7 = c2.j.f22694d;
                    h4.d.f81522a.getClass();
                    c2.z zVarA4 = c2.y.a(kVar7, h4.d.a.f81536n, mVar6, 0);
                    int iHashCode6 = Long.hashCode(mVar6.getU());
                    i2 i2VarX6 = mVar6.x();
                    h4.r rVarC9 = h4.k.c(rVarC8, mVar6);
                    h5.g.V.getClass();
                    h5.e0.a aVar25 = h5.g.a.f81805b;
                    if (mVar6.F() == null) {
                        p0.l();
                        throw null;
                    }
                    mVar6.z();
                    if (mVar6.getT()) {
                        mVar6.M(aVar25);
                    } else {
                        mVar6.c();
                    }
                    h5.g.a.e eVar8 = h5.g.a.f81810g;
                    b4.c(eVar8, zVarA4, mVar6);
                    h5.g.a.C1623g c1623g3 = h5.g.a.f81809f;
                    b4.c(c1623g3, i2VarX6, mVar6);
                    h5.g.a.b bVar7 = h5.g.a.f81813j;
                    if (mVar6.getT() || !p005kotlin.jvm.internal.s.g(mVar6.q(), Integer.valueOf(iHashCode6))) {
                        v.h.z(iHashCode6, mVar6, iHashCode6, bVar7);
                    }
                    h5.g.a.f fVar7 = h5.g.a.f81807d;
                    b4.c(fVar7, rVarC9, mVar6);
                    c2.b0 b0Var6 = c2.b0.f22601a;
                    long jE = vb.h.e(d92.b.f58623a, mVar6);
                    m1.a aVar26 = m1.f128891a;
                    h4.r rVarE2 = u1.n.e(aVar24, jE, aVar26);
                    d92.b.f58625c.getClass();
                    j92.e eVar9 = j92.b.f97899b;
                    float f14 = eVar9.f97918c;
                    float f15 = eVar9.f97920e;
                    h4.r rVarA = c2.l.A(c2.l.C(rVarE2, 0.0f, f14, 0.0f, eVar9.f97921f, 5), f15, 0.0f, 2);
                    c2.z zVarA5 = c2.y.a(kVar7, h4.d.a.f81537o, mVar6, 48);
                    int iHashCode7 = Long.hashCode(mVar6.getU());
                    i2 i2VarX7 = mVar6.x();
                    h4.r rVarC10 = h4.k.c(rVarA, mVar6);
                    if (mVar6.F() == null) {
                        p0.l();
                        throw null;
                    }
                    mVar6.z();
                    if (mVar6.getT()) {
                        mVar6.M(aVar25);
                    } else {
                        mVar6.c();
                    }
                    b4.c(eVar8, zVarA5, mVar6);
                    b4.c(c1623g3, i2VarX7, mVar6);
                    if (mVar6.getT() || !p005kotlin.jvm.internal.s.g(mVar6.q(), Integer.valueOf(iHashCode7))) {
                        v.h.z(iHashCode7, mVar6, iHashCode7, bVar7);
                    }
                    b4.c(fVar7, rVarC10, mVar6);
                    y2.f111386a.a(((Number) x3Var7.getF182175a()).floatValue(), 0.0f, 0, 0, 124, 0L, 0L, c2.l.A(x2.f(u1.n.e(aVar24, d92.b.a(mVar6).c().c(), aVar26), 1.0f), f15, 0.0f, 2), mVar6);
                    String strQ2 = gl1.y.Q(mVar6, dVar5.f105314b);
                    d6.h.f57752b.getClass();
                    int i26 = d6.h.f57755e;
                    d92.b.f58624b.getClass();
                    mh.c(strQ2, c2.l.C(aVar24, 0.0f, eVar9.f97920e, 0.0f, 0.0f, 13), 0L, null, 0L, null, 0L, d6.h.a(i26), 0L, 0, false, 0, 0, null, d92.c.b(j92.f.f97931h, mVar6), mVar6, 0, 0, 130044);
                    Integer num = dVar5.f105315c;
                    if (num == null) {
                        mVar6.C(-1684034388);
                        mVar6.f();
                    } else {
                        mVar6.C(-1684034387);
                        mh.c(gl1.y.Q(mVar6, num.intValue()), c2.l.C(aVar24, 0.0f, eVar9.f97918c, 0.0f, 0.0f, 13), com.nimbusds.jose.shaded.gson.internal.a.x(mVar6), null, 0L, null, 0L, d6.h.a(i26), 0L, 0, false, 0, 0, null, j92.f.f97933j, mVar6, 0, 0, 130040);
                        mVar6.f();
                    }
                    mVar6.y();
                    b82.c.c(z3.f.c(-1488287080, new km0.h.a(dVar5, x3Var8, m0Var5, iVar2, context3, rVar2), mVar6), z3.f.c(255806558, new bv0.e(m0Var5, x3Var8, iVar2, context3, x3Var9, aVar23, p1Var9), mVar6), mVar6, 54);
                    mVar6.y();
                } else {
                    mVar6.e();
                }
                return Unit.INSTANCE;
            case 9:
                ((Integer) obj2).getClass();
                kv0.h.a((yu0.f) obj12, (gv0.d) obj11, (kv0.j) obj10, (e23.a) obj3, (e23.a) obj9, (e23.l) obj5, (e23.a) obj4, (e23.a) obj8, (e23.a) obj7, (e23.a) obj6, (p3.m) obj, p0.t(1));
                return Unit.INSTANCE;
            case 10:
                return a(obj, obj2);
            case 11:
                return b(obj, obj2);
            case 12:
                return c(obj, obj2);
            case 13:
                return d(obj, obj2);
            case 14:
                return e(obj, obj2);
            case 15:
                return f(obj, obj2);
            case 16:
                return g(obj, obj2);
            case 17:
                return h(obj, obj2);
            case 18:
                return i(obj, obj2);
            case 19:
                return j(obj, obj2);
            case 20:
                return k(obj, obj2);
            default:
                x3 x3Var10 = (x3) obj12;
                x3 x3Var11 = (x3) obj11;
                yj0.f fVar8 = (yj0.f) obj10;
                x3 x3Var12 = (x3) obj9;
                x3 x3Var13 = (x3) obj8;
                x3 x3Var14 = (x3) obj7;
                Context context4 = (Context) obj6;
                e23.p pVar2 = (e23.p) obj5;
                p1 p1Var10 = (p1) obj4;
                x3 x3Var15 = (x3) obj3;
                p3.m mVar7 = (p3.m) obj;
                int iIntValue7 = ((Integer) obj2).intValue();
                if (mVar7.n(iIntValue7 & 1, (iIntValue7 & 3) != 2)) {
                    x1 x1Var7 = p3.n.f135158a;
                    h4.r rVarF = x2.f(a2.b(h4.r.S, a2.a(mVar7), true), 1.0f);
                    c2.j.f22691a.getClass();
                    c2.j.k kVar8 = c2.j.f22694d;
                    h4.d.f81522a.getClass();
                    c2.z zVarA6 = c2.y.a(kVar8, h4.d.a.f81536n, mVar7, 0);
                    int iHashCode8 = Long.hashCode(mVar7.getU());
                    i2 i2VarX8 = mVar7.x();
                    h4.r rVarC11 = h4.k.c(rVarF, mVar7);
                    h5.g.V.getClass();
                    h5.e0.a aVar27 = h5.g.a.f81805b;
                    if (mVar7.F() == null) {
                        p0.l();
                        throw null;
                    }
                    mVar7.z();
                    if (mVar7.getT()) {
                        mVar7.M(aVar27);
                    } else {
                        mVar7.c();
                    }
                    b4.c(h5.g.a.f81810g, zVarA6, mVar7);
                    b4.c(h5.g.a.f81809f, i2VarX8, mVar7);
                    h5.g.a.b bVar8 = h5.g.a.f81813j;
                    if (mVar7.getT() || !p005kotlin.jvm.internal.s.g(mVar7.q(), Integer.valueOf(iHashCode8))) {
                        v.h.z(iHashCode8, mVar7, iHashCode8, bVar8);
                    }
                    b4.c(h5.g.a.f81807d, rVarC11, mVar7);
                    c2.b0 b0Var7 = c2.b0.f22601a;
                    c80.s sVar3 = (c80.s) ((g3) x3Var10.getF182175a()).f35301b;
                    r1.b(gl1.y.Q(mVar7, R.string.lbl_subscription_status), z3.f.c(-885147415, new xm0.h(x3Var11, sVar3), mVar7), mVar7, 48, 0);
                    r1.b(gl1.y.Q(mVar7, R.string.lbl_development_settings), z3.f.c(-1874707310, new c42.d(fVar8, x3Var12, x3Var13, x3Var14, context4, sVar3, pVar2, p1Var10, x3Var15), mVar7), mVar7, 48, 0);
                    r1.b(gl1.y.Q(mVar7, R.string.lbl_active_premium_features), z3.f.c(1370887985, new o72.e(context4, p1Var10, 6), mVar7), mVar7, 48, 0);
                    mVar7.y();
                } else {
                    mVar7.e();
                }
                return Unit.INSTANCE;
        }
    }

    public /* synthetic */ j(h4.r rVar, String str, String str2, p1 p1Var, i53.c cVar, i53.c cVar2, i53.c cVar3, e23.a aVar, e23.l lVar, e23.l lVar2, int i14) {
        this.f314a = 2;
        this.f317d = rVar;
        this.f316c = str;
        this.f318e = str2;
        this.f321h = p1Var;
        this.f319f = cVar;
        this.f320g = cVar2;
        this.f322i = cVar3;
        this.f315b = aVar;
        this.f323j = lVar;
        this.f324k = lVar2;
    }

    public /* synthetic */ j(h4.r rVar, String str, z1 z1Var, p006l2.a2 a2Var, List list, e23.l lVar, e23.l lVar2, e23.p pVar, o13.p pVar2, nj2.a.b bVar, int i14) {
        this.f314a = 7;
        this.f317d = rVar;
        this.f316c = str;
        this.f318e = z1Var;
        this.f319f = a2Var;
        this.f321h = list;
        this.f322i = lVar;
        this.f323j = lVar2;
        this.f320g = pVar;
        this.f324k = pVar2;
        this.f315b = bVar;
    }

    public /* synthetic */ j(Object obj, e23.a aVar, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6, Object obj7, Object obj8, Object obj9, int i14) {
        this.f314a = i14;
        this.f316c = obj;
        this.f315b = aVar;
        this.f317d = obj2;
        this.f318e = obj3;
        this.f319f = obj4;
        this.f320g = obj5;
        this.f321h = obj6;
        this.f322i = obj7;
        this.f323j = obj8;
        this.f324k = obj9;
    }

    public /* synthetic */ j(Object obj, Object obj2, Object obj3, e23.a aVar, o13.h hVar, e23.l lVar, o13.h hVar2, e23.a aVar2, e23.a aVar3, o13.h hVar3, int i14, int i15) {
        this.f314a = i15;
        this.f316c = obj;
        this.f317d = obj2;
        this.f318e = obj3;
        this.f315b = aVar;
        this.f319f = hVar;
        this.f320g = lVar;
        this.f321h = hVar2;
        this.f322i = aVar2;
        this.f323j = aVar3;
        this.f324k = hVar3;
    }

    public /* synthetic */ j(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6, Object obj7, Object obj8, Object obj9, Object obj10, int i14) {
        this.f314a = i14;
        this.f316c = obj;
        this.f317d = obj2;
        this.f318e = obj3;
        this.f319f = obj4;
        this.f320g = obj5;
        this.f321h = obj6;
        this.f322i = obj7;
        this.f323j = obj8;
        this.f324k = obj9;
        this.f315b = obj10;
    }

    public /* synthetic */ j(Object obj, sk0.r rVar, bv.d dVar, e23.l lVar, e23.p pVar, e23.l lVar2, e23.q qVar, e23.q qVar2, e23.l lVar3, GearActivity.w wVar, int i14, int i15) {
        this.f314a = i15;
        this.f316c = obj;
        this.f317d = rVar;
        this.f318e = dVar;
        this.f319f = lVar;
        this.f320g = pVar;
        this.f321h = lVar2;
        this.f322i = qVar;
        this.f323j = qVar2;
        this.f324k = lVar3;
        this.f315b = wVar;
    }

    public /* synthetic */ j(Context context, b.u uVar, c.q qVar, e23.a aVar, Long l14, String str, kl1.a aVar2, l80.b bVar, lc.m0 m0Var, ws.a aVar3) {
        this.f314a = 5;
        this.f317d = m0Var;
        this.f318e = l14;
        this.f316c = str;
        this.f319f = qVar;
        this.f320g = context;
        this.f315b = aVar;
        this.f321h = aVar2;
        this.f322i = uVar;
        this.f323j = bVar;
        this.f324k = aVar3;
    }

    public /* synthetic */ j(km0.d dVar, x3 x3Var, p1 p1Var, lc.m0 m0Var, km0.i iVar, Context context, e23.r rVar, p1 p1Var2, e23.a aVar, p1 p1Var3) {
        this.f314a = 8;
        this.f316c = dVar;
        this.f317d = x3Var;
        this.f318e = p1Var;
        this.f319f = m0Var;
        this.f320g = iVar;
        this.f322i = context;
        this.f323j = rVar;
        this.f324k = p1Var2;
        this.f315b = aVar;
        this.f321h = p1Var3;
    }

    public /* synthetic */ j(n82.f fVar, Context context, sm1.s sVar, n82.f.a aVar, e23.a aVar2, e23.a aVar3, e23.a aVar4, p1 p1Var, p1 p1Var2, p1 p1Var3) {
        this.f314a = 16;
        this.f316c = fVar;
        this.f317d = context;
        this.f318e = sVar;
        this.f319f = aVar;
        this.f315b = aVar2;
        this.f320g = aVar3;
        this.f322i = aVar4;
        this.f323j = p1Var;
        this.f321h = p1Var2;
        this.f324k = p1Var3;
    }

    public /* synthetic */ j(n82.f fVar, ug2.x xVar, e23.a aVar, e23.a aVar2, p1 p1Var, e23.a aVar3, i53.f fVar2, yd1.a aVar4, gw0.u uVar, ug2.x xVar2) {
        this.f314a = 6;
        this.f316c = fVar;
        this.f318e = xVar;
        this.f315b = aVar;
        this.f319f = aVar2;
        this.f321h = p1Var;
        this.f320g = aVar3;
        this.f317d = fVar2;
        this.f322i = aVar4;
        this.f323j = uVar;
        this.f324k = xVar2;
    }

    public /* synthetic */ j(o90.a aVar, e23.l lVar, e23.l lVar2, String str, String str2, String str3, p1 p1Var, List list, m3 m3Var, p1 p1Var2) {
        this.f314a = 19;
        this.f317d = aVar;
        this.f318e = lVar;
        this.f319f = lVar2;
        this.f316c = str;
        this.f320g = str2;
        this.f322i = str3;
        this.f321h = p1Var;
        this.f323j = list;
        this.f324k = m3Var;
        this.f315b = p1Var2;
    }

    public /* synthetic */ j(p1 p1Var, p1 p1Var2, p1 p1Var3, x3 x3Var, i53.d dVar, p1 p1Var4, Context context, x3 x3Var2, p1 p1Var5, p1 p1Var6) {
        this.f314a = 11;
        this.f321h = p1Var;
        this.f316c = p1Var2;
        this.f317d = p1Var3;
        this.f318e = x3Var;
        this.f319f = dVar;
        this.f320g = p1Var4;
        this.f322i = context;
        this.f323j = x3Var2;
        this.f324k = p1Var5;
        this.f315b = p1Var6;
    }

    public /* synthetic */ j(p1 p1Var, p1 p1Var2, yj0.f fVar, p1 p1Var3, p1 p1Var4, p1 p1Var5, Context context, e23.p pVar, p1 p1Var6, p1 p1Var7) {
        this.f314a = 21;
        this.f316c = p1Var;
        this.f317d = p1Var2;
        this.f318e = fVar;
        this.f319f = p1Var3;
        this.f322i = p1Var4;
        this.f323j = p1Var5;
        this.f324k = context;
        this.f320g = pVar;
        this.f321h = p1Var6;
        this.f315b = p1Var7;
    }

    public /* synthetic */ j(pt1.s sVar, o53.b0 b0Var, mc mcVar, je2.b bVar, n1 n1Var, p1 p1Var, p1 p1Var2, qw0.s sVar2, p1 p1Var3, p1 p1Var4) {
        this.f314a = 3;
        this.f316c = sVar;
        this.f317d = b0Var;
        this.f318e = mcVar;
        this.f319f = bVar;
        this.f323j = n1Var;
        this.f321h = p1Var;
        this.f320g = p1Var2;
        this.f322i = sVar2;
        this.f324k = p1Var3;
        this.f315b = p1Var4;
    }

    public /* synthetic */ j(rk0.k kVar, bv.d dVar, GearActivity.w wVar, e23.l lVar, e23.a aVar, e23.a aVar2, e23.l lVar2, e23.l lVar3, e23.p pVar, e23.l lVar4, int i14) {
        this.f314a = 12;
        this.f316c = kVar;
        this.f317d = dVar;
        this.f318e = wVar;
        this.f319f = lVar;
        this.f315b = aVar;
        this.f321h = aVar2;
        this.f322i = lVar2;
        this.f323j = lVar3;
        this.f320g = pVar;
        this.f324k = lVar4;
    }

    public /* synthetic */ j(tb0.p pVar, String str, o90.a aVar, e23.l lVar, e23.a aVar2, tb0.q qVar, e23.a aVar3, p1 p1Var, p1 p1Var2, p1 p1Var3) {
        this.f314a = 20;
        this.f317d = pVar;
        this.f316c = str;
        this.f318e = aVar;
        this.f319f = lVar;
        this.f315b = aVar2;
        this.f320g = qVar;
        this.f322i = aVar3;
        this.f321h = p1Var;
        this.f323j = p1Var2;
        this.f324k = p1Var3;
    }

    public /* synthetic */ j(u21.g gVar, v21.e eVar, e23.l lVar, e23.l lVar2, e23.l lVar3, e23.a aVar, e23.a aVar2, e23.a aVar3, e23.a aVar4, fe feVar, int i14) {
        this.f314a = 17;
        this.f316c = gVar;
        this.f317d = eVar;
        this.f318e = lVar;
        this.f319f = lVar2;
        this.f320g = lVar3;
        this.f315b = aVar;
        this.f321h = aVar2;
        this.f322i = aVar3;
        this.f323j = aVar4;
        this.f324k = feVar;
    }
}
