package g82;

import c2.b0;
import c2.j;
import c2.l;
import c2.q;
import c2.u;
import c2.x2;
import c2.y;
import c2.z;
import e23.p;
import f5.z0;
import g02.h0;
import g6.f;
import h4.k;
import h4.r;
import h5.e0;
import h5.g;
import i3.mh;
import i3.ve;
import k2.i;
import l72.f0;
import p005kotlin.Unit;
import p005kotlin.jvm.internal.s;
import p3.b4;
import p3.i2;
import p3.m;
import p3.n;
import p3.p0;
import p3.x1;
import s5.x0;
import u1.a2;
import v.h;

/* JADX INFO: loaded from: classes9.dex */
public final /* synthetic */ class b implements p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f76428a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ c.a f76429b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ String f76430c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ String f76431d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ e23.a f76432e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ String f76433f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final /* synthetic */ e23.a f76434g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final /* synthetic */ p f76435h;

    public /* synthetic */ b(c.a aVar, String str, String str2, e23.a aVar2, String str3, e23.a aVar3, p pVar, int i14) {
        this.f76428a = i14;
        this.f76429b = aVar;
        this.f76430c = str;
        this.f76431d = str2;
        this.f76432e = aVar2;
        this.f76433f = str3;
        this.f76434g = aVar3;
        this.f76435h = pVar;
    }

    /* JADX WARN: Code duplicated, block: B:64:0x0256  */
    /* JADX WARN: Code duplicated, block: B:81:0x02fa  */
    @Override // e23.p
    public final Object invoke(Object obj, Object obj2) {
        float f14;
        float f15;
        e0.a aVar;
        g.a.e eVar;
        float f16;
        r rVar;
        switch (this.f76428a) {
            case 0:
                m mVar = (m) obj;
                int iIntValue = ((Integer) obj2).intValue();
                c cVar = c.f76436a;
                if (mVar.n(iIntValue & 1, (iIntValue & 3) != 2)) {
                    x1 x1Var = n.f135158a;
                    f.a aVar2 = f.f75994b;
                    ve.a(x2.b(r.S, 343, 0.0f, 2), i.a(8), fb1.c.z(d92.b.f58623a, mVar), 0L, 0.0f, 0.0f, null, z3.f.c(886838675, new b(this.f76429b, this.f76430c, this.f76431d, this.f76432e, this.f76433f, this.f76434g, this.f76435h, 1), mVar), mVar, 12582918, 120);
                } else {
                    mVar.e();
                }
                return Unit.INSTANCE;
            default:
                m mVar2 = (m) obj;
                int iIntValue2 = ((Integer) obj2).intValue();
                c cVar2 = c.f76436a;
                if (mVar2.n(iIntValue2 & 1, (iIntValue2 & 3) != 2)) {
                    x1 x1Var2 = n.f135158a;
                    h4.d.f81522a.getClass();
                    h4.g gVar = h4.d.a.f81528f;
                    r.a aVar3 = r.S;
                    z0 z0VarD = q.d(gVar, false);
                    int iHashCode = Long.hashCode(mVar2.getU());
                    i2 i2VarX = mVar2.x();
                    r rVarC = k.c(aVar3, mVar2);
                    g.V.getClass();
                    e0.a aVar4 = g.a.f81805b;
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
                    g.a.e eVar2 = g.a.f81810g;
                    b4.c(eVar2, z0VarD, mVar2);
                    g.a.C1623g c1623g = g.a.f81809f;
                    b4.c(c1623g, i2VarX, mVar2);
                    g.a.b bVar = g.a.f81813j;
                    if (mVar2.getT() || !s.g(mVar2.q(), Integer.valueOf(iHashCode))) {
                        h.z(iHashCode, mVar2, iHashCode, bVar);
                    }
                    g.a.f fVar = g.a.f81807d;
                    b4.c(fVar, rVarC, mVar2);
                    u uVar = u.f22885a;
                    c.a aVar5 = this.f76429b;
                    float f17 = aVar5 instanceof c.b ? 0 : 24;
                    f.a aVar6 = f.f75994b;
                    float f18 = 16;
                    r rVarB = a2.b(l.C(aVar3, 0.0f, f17, 0.0f, f18, 5), a2.a(mVar2), true);
                    j.f22691a.getClass();
                    z zVarA = y.a(j.f22694d, h4.d.a.f81536n, mVar2, 0);
                    int iHashCode2 = Long.hashCode(mVar2.getU());
                    i2 i2VarX2 = mVar2.x();
                    r rVarC2 = k.c(rVarB, mVar2);
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
                    b4.c(eVar2, zVarA, mVar2);
                    b4.c(c1623g, i2VarX2, mVar2);
                    if (mVar2.getT() || !s.g(mVar2.q(), Integer.valueOf(iHashCode2))) {
                        h.z(iHashCode2, mVar2, iHashCode2, bVar);
                    }
                    b4.c(fVar, rVarC2, mVar2);
                    b0 b0Var = b0.f22601a;
                    if (aVar5 != null) {
                        mVar2.C(555410196);
                        aVar5.a(mVar2);
                        r rVarC3 = l.C(aVar3, 0.0f, 0.0f, 0.0f, f18, 7);
                        f14 = f18;
                        l.f(rVarC3, mVar2);
                        mVar2.f();
                    } else {
                        f14 = f18;
                        mVar2.C(555555307);
                        mVar2.f();
                    }
                    String str = this.f76430c;
                    if (str != null) {
                        mVar2.C(555648803);
                        d92.b.f58623a.getClass();
                        d92.b.f58624b.getClass();
                        x0 x0VarB = d92.c.b(j92.f.f97930g, mVar2);
                        r rVarA = l.A(x2.f(aVar3, 1.0f), f14, 0.0f, 2);
                        d6.h.f57752b.getClass();
                        f15 = f14;
                        aVar = aVar4;
                        eVar = eVar2;
                        mh.c(str, rVarA, 0L, null, 0L, null, 0L, d6.h.a(d6.h.f57755e), 0L, 0, false, 0, 0, null, x0VarB, mVar2, 48, 0, 130044);
                        mVar2 = mVar2;
                        mVar2.f();
                    } else {
                        f15 = f14;
                        aVar = aVar4;
                        eVar = eVar2;
                        mVar2.C(556051307);
                        mVar2.f();
                    }
                    r rVarA2 = l.A(aVar3, f15, 0.0f, 2);
                    z0 z0VarD2 = q.d(h4.d.a.f81524b, false);
                    int iHashCode3 = Long.hashCode(mVar2.getU());
                    i2 i2VarX3 = mVar2.x();
                    r rVarC4 = k.c(rVarA2, mVar2);
                    if (mVar2.F() == null) {
                        p0.l();
                        throw null;
                    }
                    mVar2.z();
                    if (mVar2.getT()) {
                        mVar2.M(aVar);
                    } else {
                        mVar2.c();
                    }
                    b4.c(eVar, z0VarD2, mVar2);
                    b4.c(c1623g, i2VarX3, mVar2);
                    if (mVar2.getT() || !s.g(mVar2.q(), Integer.valueOf(iHashCode3))) {
                        h.z(iHashCode3, mVar2, iHashCode3, bVar);
                    }
                    b4.c(fVar, rVarC4, mVar2);
                    h.B(this.f76435h, mVar2, 0);
                    String str2 = this.f76431d;
                    m.a aVar7 = m.f135153a;
                    if (str2 != null) {
                        mVar2.C(556318899);
                        f0 f0Var = f0.f110999a;
                        f16 = f15;
                        r rVarC5 = l.C(x2.f(aVar3, 1.0f), f16, 32, f15, 0.0f, 8);
                        e23.a aVar8 = this.f76432e;
                        boolean zB = mVar2.B(aVar8);
                        Object objQ = mVar2.q();
                        if (zB) {
                            objQ = new h0(aVar8, 14);
                            mVar2.K(objQ);
                        } else {
                            aVar7.getClass();
                            if (objQ == m.a.f135155b) {
                                objQ = new h0(aVar8, 14);
                                mVar2.K(objQ);
                            }
                        }
                        m mVar3 = mVar2;
                        f0Var.i(str2, rVarC5, false, (e23.a) objQ, mVar3, 0, 4);
                        mVar2 = mVar3;
                        mVar2.f();
                    } else {
                        f16 = f15;
                        mVar2.C(556741739);
                        mVar2.f();
                    }
                    String str3 = this.f76433f;
                    if (str3 == null || str2 == null) {
                        rVar = aVar3;
                        mVar2.C(556931211);
                        mVar2.f();
                    } else {
                        mVar2.C(556832228);
                        l.f(l.C(rVar, 0.0f, 8, 0.0f, 0.0f, 13), mVar2);
                        mVar2.f();
                    }
                    if (str3 != null) {
                        mVar2.C(557005208);
                        if (str2 == 0) {
                            rVar = aVar3;
                            mVar2.C(557052731);
                            l.f(l.C(rVar, 0.0f, 32, 0.0f, 0.0f, 13), mVar2);
                            mVar2.f();
                        } else {
                            rVar = aVar3;
                            mVar2.C(557160363);
                            mVar2.f();
                        }
                        f0 f0Var2 = f0.f110999a;
                        r rVarC6 = l.C(x2.f(rVar, 1.0f), f16, 0.0f, f16, 0.0f, 10);
                        e23.a aVar9 = this.f76434g;
                        boolean zB2 = mVar2.B(aVar9);
                        Object objQ2 = mVar2.q();
                        if (zB2) {
                            objQ2 = new h0(aVar9, 11);
                            mVar2.K(objQ2);
                        } else {
                            aVar7.getClass();
                            if (objQ2 == m.a.f135155b) {
                                objQ2 = new h0(aVar9, 11);
                                mVar2.K(objQ2);
                            }
                        }
                        f0Var2.d(0, 9, (e23.a) objQ2, rVarC6, str3, mVar2, null, false);
                        mVar2.f();
                    } else {
                        rVar = aVar3;
                        mVar2.C(557577003);
                        mVar2.f();
                    }
                    mVar2.y();
                    mVar2.y();
                } else {
                    mVar2.e();
                }
                return Unit.INSTANCE;
        }
    }
}
