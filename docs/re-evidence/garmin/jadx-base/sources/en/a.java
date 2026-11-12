package en;

import c2.b0;
import c2.k3;
import c2.q;
import c2.q3;
import c2.u;
import c2.x2;
import c2.y;
import c2.z;
import com.garmin.android.apps.connectmobile.R;
import com.garmin.android.apps.connectmobile.activities.deeplink.AppPromoPopupActivity;
import cw1.g0;
import e23.p;
import f5.z0;
import h4.r;
import h5.e0;
import i3.i7;
import i3.mh;
import java.util.Arrays;
import l72.f0;
import l72.u0;
import o4.d0;
import o4.m1;
import o4.w;
import p005kotlin.Unit;
import p005kotlin.jvm.internal.s;
import p3.b4;
import p3.i2;
import p3.p0;
import p3.x1;
import s5.x0;
import u1.a2;
import u1.y0;

/* JADX INFO: loaded from: classes7.dex */
public final /* synthetic */ class a implements p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f64639a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ boolean f64640b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ AppPromoPopupActivity f64641c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ n f64642d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ String f64643e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ o13.p[] f64644f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final /* synthetic */ int f64645g;

    public /* synthetic */ a(boolean z14, AppPromoPopupActivity appPromoPopupActivity, n nVar, String str, o13.p[] pVarArr, int i14, int i15) {
        this.f64639a = i15;
        this.f64640b = z14;
        this.f64641c = appPromoPopupActivity;
        this.f64642d = nVar;
        this.f64643e = str;
        this.f64644f = pVarArr;
        this.f64645g = i14;
    }

    /* JADX WARN: Code duplicated, block: B:53:0x0322  */
    /* JADX WARN: Code duplicated, block: B:62:0x03ba  */
    /* JADX WARN: Code duplicated, block: B:69:0x040d  */
    @Override // e23.p
    public final Object invoke(Object obj, Object obj2) {
        long jC;
        r.a aVar;
        switch (this.f64639a) {
            case 0:
                p3.m mVar = (p3.m) obj;
                int iIntValue = ((Integer) obj2).intValue();
                AppPromoPopupActivity.a aVar2 = AppPromoPopupActivity.f29002e;
                if (mVar.n(iIntValue & 1, (iIntValue & 3) != 2)) {
                    x1 x1Var = p3.n.f135158a;
                    z02.b.a(false, null, null, null, true, z3.f.c(1410342279, new a(this.f64640b, this.f64641c, this.f64642d, this.f64643e, this.f64644f, this.f64645g, 1), mVar), mVar, 221184, 15);
                } else {
                    mVar.e();
                }
                return Unit.INSTANCE;
            default:
                p3.m mVar2 = (p3.m) obj;
                int iIntValue2 = ((Integer) obj2).intValue();
                AppPromoPopupActivity.a aVar3 = AppPromoPopupActivity.f29002e;
                if (mVar2.n(iIntValue2 & 1, (iIntValue2 & 3) != 2)) {
                    x1 x1Var2 = p3.n.f135158a;
                    r.a aVar4 = r.S;
                    r rVarD = x2.d(aVar4, 1.0f);
                    boolean z14 = this.f64640b;
                    if (z14) {
                        mVar2.C(2136937628);
                        d92.b.f58623a.getClass();
                        jC = d92.b.a(mVar2).c().f();
                        mVar2.f();
                    } else {
                        mVar2.C(2137037696);
                        d92.b.f58623a.getClass();
                        jC = d92.b.a(mVar2).c().c();
                        mVar2.f();
                    }
                    m1.a aVar5 = m1.f128891a;
                    r rVarE = u1.n.e(rVarD, jC, aVar5);
                    int i14 = k3.f22728a;
                    r rVarG = c2.l.G(rVarE, q3.a(mVar2));
                    h4.d.f81522a.getClass();
                    z0 z0VarD = q.d(h4.d.a.f81524b, false);
                    int iHashCode = Long.hashCode(mVar2.getU());
                    i2 i2VarX = mVar2.x();
                    r rVarC = h4.k.c(rVarG, mVar2);
                    h5.g.V.getClass();
                    e0.a aVar6 = h5.g.a.f81805b;
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
                    h5.g.a.e eVar = h5.g.a.f81810g;
                    b4.c(eVar, z0VarD, mVar2);
                    h5.g.a.C1623g c1623g = h5.g.a.f81809f;
                    b4.c(c1623g, i2VarX, mVar2);
                    h5.g.a.b bVar = h5.g.a.f81813j;
                    if (mVar2.getT() || !s.g(mVar2.q(), Integer.valueOf(iHashCode))) {
                        v.h.z(iHashCode, mVar2, iHashCode, bVar);
                    }
                    h5.g.a.f fVar = h5.g.a.f81807d;
                    b4.c(fVar, rVarC, mVar2);
                    u uVar = u.f22885a;
                    r rVarD2 = x2.d(aVar4, 1.0f);
                    c2.j.f22691a.getClass();
                    c2.j.k kVar = c2.j.f22694d;
                    z zVarA = y.a(kVar, h4.d.a.f81536n, mVar2, 0);
                    int iHashCode2 = Long.hashCode(mVar2.getU());
                    i2 i2VarX2 = mVar2.x();
                    r rVarC2 = h4.k.c(rVarD2, mVar2);
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
                    b4.c(eVar, zVarA, mVar2);
                    b4.c(c1623g, i2VarX2, mVar2);
                    if (mVar2.getT() || !s.g(mVar2.q(), Integer.valueOf(iHashCode2))) {
                        v.h.z(iHashCode2, mVar2, iHashCode2, bVar);
                    }
                    b4.c(fVar, rVarC2, mVar2);
                    b0 b0Var = b0.f22601a;
                    r rVarB = a2.b(b0Var.a(x2.f(aVar4, 1.0f), 1.0f, true), a2.a(mVar2), true);
                    d92.b.f58623a.getClass();
                    r rVarE2 = u1.n.e(rVarB, d92.b.a(mVar2).c().c(), aVar5);
                    h4.g.a aVar7 = h4.d.a.f81537o;
                    z zVarA2 = y.a(kVar, aVar7, mVar2, 48);
                    int iHashCode3 = Long.hashCode(mVar2.getU());
                    i2 i2VarX3 = mVar2.x();
                    r rVarC3 = h4.k.c(rVarE2, mVar2);
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
                    b4.c(eVar, zVarA2, mVar2);
                    b4.c(c1623g, i2VarX3, mVar2);
                    if (mVar2.getT() || !s.g(mVar2.q(), Integer.valueOf(iHashCode3))) {
                        v.h.z(iHashCode3, mVar2, iHashCode3, bVar);
                    }
                    b4.c(fVar, rVarC3, mVar2);
                    r rVarF = x2.f(aVar4, 1.0f);
                    w.a aVar8 = w.f129023a;
                    o13.p[] pVarArr = this.f64644f;
                    r rVarF2 = wz1.i.f(rVarF, w.a.j(aVar8, (o13.p[]) Arrays.copyOf(pVarArr, pVarArr.length)));
                    n nVar = this.f64642d;
                    int i15 = nVar.f64677a;
                    int i16 = nVar.f64679c;
                    t4.d dVarA = n5.c.a(i15, mVar2, 0);
                    f5.k.f68985a.getClass();
                    y0.a(dVarA, gl1.y.Q(mVar2, i16), rVarF2, null, f5.k.a.f68990e, 0.0f, null, mVar2, 24576, 104);
                    t4.d dVarA2 = n5.c.a(nVar.f64678b, mVar2, 0);
                    String strQ = gl1.y.Q(mVar2, i16);
                    d0.f128823b.getClass();
                    long j8 = d0.f128832k;
                    d92.b.f58625c.getClass();
                    j92.e eVar2 = j92.b.f97899b;
                    float f14 = eVar2.f97921f;
                    i7.a(dVarA2, strQ, x2.q(b0Var.b(l4.k.b(c2.l.A(aVar4, 0.0f, f14, 1), k2.i.a(eVar2.f97919d)), aVar7), j92.b.f97901d.f97907f), j8, mVar2, 3072, 0);
                    r rVarA = c2.l.A(aVar4, f14, 0.0f, 2);
                    String strQ2 = gl1.y.Q(mVar2, i16);
                    d92.b.f58624b.getClass();
                    x0 x0VarE = d92.c.e(d92.c.b(j92.f.f97930g, mVar2));
                    d6.h.f57752b.getClass();
                    int i17 = d6.h.f57755e;
                    mh.c(strQ2, rVarA, 0L, null, 0L, null, 0L, d6.h.a(i17), 0L, 0, false, 0, 0, null, x0VarE, mVar2, 0, 0, 130044);
                    mh.c(gl1.y.Q(mVar2, nVar.f64680d), c2.l.A(aVar4, f14, 0.0f, 2), 0L, null, 0L, null, 0L, d6.h.a(i17), 0L, 0, false, 0, 0, null, d92.c.e(d92.c.b(j92.f.f97931h, mVar2)), mVar2, 0, 0, 130044);
                    mh.c(gl1.y.Q(mVar2, nVar.f64681e), c2.l.A(c2.l.C(aVar4, 0.0f, eVar2.f97921f, 0.0f, 0.0f, 13), f14, 0.0f, 2), 0L, null, 0L, null, 0L, d6.h.a(i17), 0L, 0, false, 0, 0, null, d92.c.b(j92.f.f97932i, mVar2), mVar2, 0, 0, 130044);
                    p3.m mVar3 = mVar2;
                    AppPromoPopupActivity appPromoPopupActivity = this.f64641c;
                    p3.m.a aVar9 = p3.m.f135153a;
                    if (z14) {
                        aVar = aVar4;
                        mVar3.C(-1967253490);
                        c2.l.f(x2.h(aVar, f14), mVar3);
                        mVar3.f();
                    } else {
                        mVar3.C(-1967754295);
                        r rVarC4 = c2.l.C(aVar4, 0.0f, eVar2.f97923h, 0.0f, eVar2.f97920e, 5);
                        aVar = aVar4;
                        boolean zR = mVar3.r(appPromoPopupActivity) | mVar3.k(nVar.ordinal());
                        Object objQ = mVar3.q();
                        if (zR) {
                            objQ = new dl0.g(12, appPromoPopupActivity, nVar);
                            mVar3.K(objQ);
                        } else {
                            aVar9.getClass();
                            if (objQ == p3.m.a.f135155b) {
                                objQ = new dl0.g(12, appPromoPopupActivity, nVar);
                                mVar3.K(objQ);
                            }
                        }
                        y0.a(n5.c.a(this.f64645g, mVar3, 0), gl1.y.Q(mVar3, R.string.lbl_install), u1.w.d(rVarC4, false, null, null, (e23.a) objQ, 15), null, null, 0.0f, null, mVar3, 0, 120);
                        mVar3 = mVar3;
                        mVar3.f();
                    }
                    mVar3.y();
                    if (z14) {
                        mVar3.C(726332550);
                        f0 f0Var = f0.f110999a;
                        r rVarY = c2.l.y(x2.f(aVar, 1.0f), eVar2.f97920e);
                        String strP = gl1.y.P(R.string.lbl_open_app_name, new Object[]{gl1.y.Q(mVar3, i16)}, mVar3);
                        boolean zR2 = mVar3.r(appPromoPopupActivity) | mVar3.k(nVar.ordinal());
                        String str = this.f64643e;
                        boolean zB = zR2 | mVar3.B(str);
                        Object objQ2 = mVar3.q();
                        if (zB) {
                            objQ2 = new g0(appPromoPopupActivity, 9, nVar, str);
                            mVar3.K(objQ2);
                        } else {
                            aVar9.getClass();
                            if (objQ2 == p3.m.a.f135155b) {
                                objQ2 = new g0(appPromoPopupActivity, 9, nVar, str);
                                mVar3.K(objQ2);
                            }
                        }
                        p3.m mVar4 = mVar3;
                        f0Var.d(0, 9, (e23.a) objQ2, rVarY, strP, mVar4, null, false);
                        mVar3 = mVar4;
                        mVar3.f();
                    } else {
                        mVar3.C(726782143);
                        mVar3.f();
                    }
                    mVar3.y();
                    r rVarG2 = c2.l.G(uVar.c(aVar, h4.d.a.f81526d), q3.c(mVar3));
                    float f15 = eVar2.f97918c;
                    r rVarC5 = c2.l.C(rVarG2, 0.0f, f15, f15, 0.0f, 9);
                    boolean zR3 = mVar3.r(appPromoPopupActivity);
                    Object objQ3 = mVar3.q();
                    if (zR3) {
                        objQ3 = new e40.d(appPromoPopupActivity, 3);
                        mVar3.K(objQ3);
                    } else {
                        aVar9.getClass();
                        if (objQ3 == p3.m.a.f135155b) {
                            objQ3 = new e40.d(appPromoPopupActivity, 3);
                            mVar3.K(objQ3);
                        }
                    }
                    u0.a(rVarC5, null, null, null, (e23.a) objQ3, mVar3, 0, 14);
                    mVar3.y();
                } else {
                    mVar2.e();
                }
                return Unit.INSTANCE;
        }
    }
}
