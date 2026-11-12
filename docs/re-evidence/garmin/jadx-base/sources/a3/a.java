package a3;

import c2.x2;
import i3.ve;
import p005kotlin.Unit;
import p3.b4;
import p3.i2;
import p3.x1;
import u1.a2;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class a implements e23.p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f597a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ e23.p f598b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ e23.p f599c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ e23.p f600d;

    public /* synthetic */ a(e23.p pVar, e23.p pVar2, e23.p pVar3, int i14) {
        this.f597a = i14;
        this.f598b = pVar;
        this.f599c = pVar2;
        this.f600d = pVar3;
    }

    @Override // e23.p
    public final Object invoke(Object obj, Object obj2) {
        z3.e eVarC;
        z3.e eVarC2;
        float f14;
        float f15;
        int i14 = this.f597a;
        e23.p pVar = this.f600d;
        e23.p pVar2 = this.f599c;
        e23.p pVar3 = this.f598b;
        int i15 = 1;
        switch (i14) {
            case 0:
                p3.m mVar = (p3.m) obj;
                int iIntValue = ((Integer) obj2).intValue();
                if (mVar.n(iIntValue & 1, (iIntValue & 3) != 2)) {
                    x1 x1Var = p3.n.f135158a;
                    h4.r.a aVar = h4.r.S;
                    c2.j.f22691a.getClass();
                    c2.j.k kVar = c2.j.f22694d;
                    h4.d.f81522a.getClass();
                    c2.z zVarA = c2.y.a(kVar, h4.d.a.f81536n, mVar, 0);
                    int iP = mVar.P();
                    i2 i2VarX = mVar.x();
                    h4.r rVarC = h4.k.c(aVar, mVar);
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
                    h5.g.a.b bVar = h5.g.a.f81813j;
                    if (mVar.getT() || !p005kotlin.jvm.internal.s.g(mVar.q(), Integer.valueOf(iP))) {
                        v.h.z(iP, mVar, iP, bVar);
                    }
                    b4.c(h5.g.a.f81807d, rVarC, mVar);
                    c2.b0 b0Var = c2.b0.f22601a;
                    if (pVar3 == null) {
                        mVar.C(-97968969);
                        mVar.f();
                        eVarC = null;
                    } else {
                        mVar.C(-97968968);
                        eVarC = z3.f.c(1737550099, new d(pVar3, 0), mVar);
                        mVar.f();
                    }
                    if (pVar2 == null) {
                        mVar.C(-97547524);
                        mVar.f();
                        eVarC2 = null;
                    } else {
                        mVar.C(-97547523);
                        eVarC2 = z3.f.c(1265552690, new d(pVar2, 1), mVar);
                        mVar.f();
                    }
                    f.a(b0Var, eVarC, eVarC2, mVar, 6);
                    v.h.B(pVar, mVar, 0);
                } else {
                    mVar.e();
                }
                return Unit.INSTANCE;
            case 1:
                p3.m mVar2 = (p3.m) obj;
                int iIntValue2 = ((Integer) obj2).intValue();
                g82.c cVar = g82.c.f76436a;
                if (mVar2.n(iIntValue2 & 1, (iIntValue2 & 3) != 2)) {
                    x1 x1Var2 = p3.n.f135158a;
                    h4.d.f81522a.getClass();
                    h4.g.a aVar3 = h4.d.a.f81537o;
                    h4.r.a aVar4 = h4.r.S;
                    g6.f.a aVar5 = g6.f.f75994b;
                    h4.r rVarB = a2.b(x2.f(c2.l.C(aVar4, 0.0f, 0.0f, 0.0f, 16, 7), 1.0f), a2.a(mVar2), true);
                    c2.j.f22691a.getClass();
                    c2.j.k kVar2 = c2.j.f22694d;
                    c2.z zVarA2 = c2.y.a(kVar2, aVar3, mVar2, 48);
                    int iHashCode = Long.hashCode(mVar2.getU());
                    i2 i2VarX2 = mVar2.x();
                    h4.r rVarC2 = h4.k.c(rVarB, mVar2);
                    h5.g.V.getClass();
                    h5.e0.a aVar6 = h5.g.a.f81805b;
                    if (mVar2.F() == null) {
                        p3.p0.l();
                        throw null;
                    }
                    mVar2.z();
                    if (mVar2.getT()) {
                        mVar2.M(aVar6);
                    } else {
                        mVar2.c();
                    }
                    h5.g.a.e eVar = h5.g.a.f81810g;
                    b4.c(eVar, zVarA2, mVar2);
                    h5.g.a.C1623g c1623g = h5.g.a.f81809f;
                    b4.c(c1623g, i2VarX2, mVar2);
                    h5.g.a.b bVar2 = h5.g.a.f81813j;
                    if (mVar2.getT() || !p005kotlin.jvm.internal.s.g(mVar2.q(), Integer.valueOf(iHashCode))) {
                        v.h.z(iHashCode, mVar2, iHashCode, bVar2);
                    }
                    h5.g.a.f fVar = h5.g.a.f81807d;
                    b4.c(fVar, rVarC2, mVar2);
                    c2.b0 b0Var2 = c2.b0.f22601a;
                    if (pVar3 == null) {
                        mVar2.C(-1751216326);
                        mVar2.f();
                    } else {
                        v.h.D(mVar2, 220603815, pVar3, mVar2, 0);
                    }
                    if (pVar2 != null) {
                        mVar2.C(-1751141491);
                        if (pVar3 != null) {
                            d92.b.f58623a.getClass();
                            d92.b.f58625c.getClass();
                            f15 = j92.b.f97899b.f97920e;
                        } else {
                            f15 = 0;
                        }
                        h4.r rVarF = x2.f(aVar4, 1.0f);
                        d92.b.f58623a.getClass();
                        d92.b.f58625c.getClass();
                        float f16 = j92.b.f97899b.f97920e;
                        h4.r rVarC3 = c2.l.C(rVarF, f16, f15, f16, 0.0f, 8);
                        c2.z zVarA3 = c2.y.a(kVar2, aVar3, mVar2, 48);
                        int iHashCode2 = Long.hashCode(mVar2.getU());
                        i2 i2VarX3 = mVar2.x();
                        h4.r rVarC4 = h4.k.c(rVarC3, mVar2);
                        if (mVar2.F() == null) {
                            p3.p0.l();
                            throw null;
                        }
                        mVar2.z();
                        if (mVar2.getT()) {
                            mVar2.M(aVar6);
                        } else {
                            mVar2.c();
                        }
                        b4.c(eVar, zVarA3, mVar2);
                        b4.c(c1623g, i2VarX3, mVar2);
                        if (mVar2.getT() || !p005kotlin.jvm.internal.s.g(mVar2.q(), Integer.valueOf(iHashCode2))) {
                            v.h.z(iHashCode2, mVar2, iHashCode2, bVar2);
                        }
                        b4.c(fVar, rVarC4, mVar2);
                        pVar2.invoke(mVar2, 0);
                        mVar2.y();
                        mVar2.f();
                    } else {
                        mVar2.C(-1750597565);
                        mVar2.f();
                    }
                    if (pVar != null) {
                        mVar2.C(-1750532403);
                        if (pVar2 != null) {
                            d92.b.f58623a.getClass();
                            d92.b.f58625c.getClass();
                            f14 = j92.b.f97899b.f97920e;
                        } else {
                            f14 = 0;
                        }
                        float f17 = f14;
                        h4.r rVarF2 = x2.f(aVar4, 1.0f);
                        d92.b.f58623a.getClass();
                        d92.b.f58625c.getClass();
                        float f18 = j92.b.f97899b.f97920e;
                        h4.r rVarC5 = c2.l.C(rVarF2, f18, f17, f18, 0.0f, 8);
                        c2.z zVarA4 = c2.y.a(kVar2, aVar3, mVar2, 48);
                        int iHashCode3 = Long.hashCode(mVar2.getU());
                        i2 i2VarX4 = mVar2.x();
                        h4.r rVarC6 = h4.k.c(rVarC5, mVar2);
                        if (mVar2.F() == null) {
                            p3.p0.l();
                            throw null;
                        }
                        mVar2.z();
                        if (mVar2.getT()) {
                            mVar2.M(aVar6);
                        } else {
                            mVar2.c();
                        }
                        b4.c(eVar, zVarA4, mVar2);
                        b4.c(c1623g, i2VarX4, mVar2);
                        if (mVar2.getT() || !p005kotlin.jvm.internal.s.g(mVar2.q(), Integer.valueOf(iHashCode3))) {
                            v.h.z(iHashCode3, mVar2, iHashCode3, bVar2);
                        }
                        b4.c(fVar, rVarC6, mVar2);
                        pVar.invoke(mVar2, 0);
                        mVar2.y();
                        mVar2.f();
                    } else {
                        mVar2.C(-1749988477);
                        mVar2.f();
                    }
                    mVar2.y();
                } else {
                    mVar2.e();
                }
                return Unit.INSTANCE;
            default:
                p3.m mVar3 = (p3.m) obj;
                int iIntValue3 = ((Integer) obj2).intValue();
                g82.c cVar2 = g82.c.f76436a;
                if (mVar3.n(iIntValue3 & 1, (iIntValue3 & 3) != 2)) {
                    x1 x1Var3 = p3.n.f135158a;
                    g6.f.a aVar7 = g6.f.f75994b;
                    ve.a(x2.b(h4.r.S, 343, 0.0f, 2), k2.i.a(8), fb1.c.z(d92.b.f58623a, mVar3), 0L, 0.0f, 0.0f, null, z3.f.c(203235829, new a(pVar3, pVar2, pVar, i15), mVar3), mVar3, 12582918, 120);
                } else {
                    mVar3.e();
                }
                return Unit.INSTANCE;
        }
    }
}
