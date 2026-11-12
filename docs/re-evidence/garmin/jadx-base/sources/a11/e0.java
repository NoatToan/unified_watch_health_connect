package a11;

import c2.x2;
import o72.a3;
import p005kotlin.Unit;
import p3.b4;
import p3.i2;
import p3.n1;
import p3.p0;
import p3.x1;

/* JADX INFO: loaded from: classes9.dex */
public final /* synthetic */ class e0 implements e23.p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f285a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ i53.c f286b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ n1 f287c;

    public /* synthetic */ e0(i53.c cVar, n1 n1Var, int i14) {
        this.f285a = i14;
        this.f286b = cVar;
        this.f287c = n1Var;
    }

    @Override // e23.p
    public final Object invoke(Object obj, Object obj2) {
        int i14 = this.f285a;
        p3.m.a aVar = p3.m.f135153a;
        n1 n1Var = this.f287c;
        switch (i14) {
            case 0:
                p3.m mVar = (p3.m) obj;
                int iIntValue = ((Integer) obj2).intValue();
                if (mVar.n(iIntValue & 1, (iIntValue & 3) != 2)) {
                    x1 x1Var = p3.n.f135158a;
                    h4.r.a aVar2 = h4.r.S;
                    h4.r rVarF = x2.f(aVar2, 1.0f);
                    h4.d.f81522a.getClass();
                    h4.g.a aVar3 = h4.d.a.f81537o;
                    c2.j.f22691a.getClass();
                    c2.z zVarA = c2.y.a(c2.j.f22694d, aVar3, mVar, 48);
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
                    h4.r rVarX = x2.x(x2.z(aVar2, null, 3), null, 3);
                    int intValue = n1Var.getIntValue();
                    Object objQ = mVar.q();
                    aVar.getClass();
                    if (objQ == p3.m.a.f135155b) {
                        objQ = new h0(n1Var, 0);
                        mVar.K(objQ);
                    }
                    r82.k.a(rVarX, this.f286b, intValue, null, 0.0f, false, false, 0L, null, (e23.l) objQ, mVar, 805306374, 504);
                    mVar.y();
                } else {
                    mVar.e();
                }
                return Unit.INSTANCE;
            default:
                p3.m mVar2 = (p3.m) obj;
                int iIntValue2 = ((Integer) obj2).intValue();
                if (mVar2.n(1 & iIntValue2, (iIntValue2 & 3) != 2)) {
                    x1 x1Var2 = p3.n.f135158a;
                    h4.r.a aVar5 = h4.r.S;
                    h4.r rVarF2 = x2.f(aVar5, 1.0f);
                    h4.d.f81522a.getClass();
                    h4.g.a aVar6 = h4.d.a.f81537o;
                    c2.j.f22691a.getClass();
                    c2.z zVarA2 = c2.y.a(c2.j.f22694d, aVar6, mVar2, 48);
                    int iHashCode2 = Long.hashCode(mVar2.getU());
                    i2 i2VarX2 = mVar2.x();
                    h4.r rVarC2 = h4.k.c(rVarF2, mVar2);
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
                    b4.c(h5.g.a.f81810g, zVarA2, mVar2);
                    b4.c(h5.g.a.f81809f, i2VarX2, mVar2);
                    h5.g.a.b bVar2 = h5.g.a.f81813j;
                    if (mVar2.getT() || !p005kotlin.jvm.internal.s.g(mVar2.q(), Integer.valueOf(iHashCode2))) {
                        v.h.z(iHashCode2, mVar2, iHashCode2, bVar2);
                    }
                    b4.c(h5.g.a.f81807d, rVarC2, mVar2);
                    c2.b0 b0Var2 = c2.b0.f22601a;
                    h4.r rVarX2 = x2.x(x2.z(aVar5, null, 3), null, 3);
                    int intValue2 = n1Var.getIntValue();
                    p50.b.f136104a.getClass();
                    z3.e eVar = p50.b.f136107d;
                    Object objQ2 = mVar2.q();
                    aVar.getClass();
                    if (objQ2 == p3.m.a.f135155b) {
                        objQ2 = new a3(n1Var, 2);
                        mVar2.K(objQ2);
                    }
                    r82.k.c(rVarX2, i53.a.a(new r82.p(this.f286b, intValue2, null, null, eVar, 0.0f, false, false, null, null, (e23.l) objQ2, 1004, null)), mVar2, 6, 0);
                    mVar2.y();
                } else {
                    mVar2.e();
                }
                return Unit.INSTANCE;
        }
    }
}
