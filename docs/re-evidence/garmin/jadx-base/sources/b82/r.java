package b82;

import c2.x2;
import i3.i7;
import p005kotlin.Unit;
import p3.b4;
import p3.i2;

/* JADX INFO: loaded from: classes9.dex */
public final /* synthetic */ class r implements e23.p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f16750a = 0;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ u4.d f16751b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ o4.d0 f16752c;

    public /* synthetic */ r(o4.d0 d0Var, u4.d dVar) {
        this.f16752c = d0Var;
        this.f16751b = dVar;
    }

    @Override // e23.p
    public final Object invoke(Object obj, Object obj2) {
        long jE;
        long j8;
        int i14 = this.f16750a;
        o4.d0 d0Var = this.f16752c;
        switch (i14) {
            case 0:
                p3.m mVar = (p3.m) obj;
                int iIntValue = ((Integer) obj2).intValue();
                s sVar = s.f16758a;
                if (mVar.n(iIntValue & 1, (iIntValue & 3) != 2)) {
                    p3.x1 x1Var = p3.n.f135158a;
                    if (d0Var == null) {
                        mVar.C(-2059215417);
                        d92.b.f58623a.getClass();
                        jE = d92.b.a(mVar).e().e();
                        mVar.f();
                    } else {
                        mVar.C(-2059216347);
                        mVar.f();
                        jE = d0Var.f128833a;
                    }
                    h4.r.a aVar = h4.r.S;
                    h4.r rVarE = u1.n.e(aVar, jE, k2.i.f102406a);
                    d92.b.f58623a.getClass();
                    d92.b.f58625c.getClass();
                    h4.r rVarQ = x2.q(rVarE, j92.b.f97901d.f97906e);
                    h4.d.f81522a.getClass();
                    f5.z0 z0VarD = c2.q.d(h4.d.a.f81524b, false);
                    int iHashCode = Long.hashCode(mVar.getU());
                    i2 i2VarX = mVar.x();
                    h4.r rVarC = h4.k.c(rVarQ, mVar);
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
                    b4.c(h5.g.a.f81810g, z0VarD, mVar);
                    b4.c(h5.g.a.f81809f, i2VarX, mVar);
                    h5.g.a.b bVar = h5.g.a.f81813j;
                    if (mVar.getT() || !p005kotlin.jvm.internal.s.g(mVar.q(), Integer.valueOf(iHashCode))) {
                        v.h.z(iHashCode, mVar, iHashCode, bVar);
                    }
                    b4.c(h5.g.a.f81807d, rVarC, mVar);
                    c2.u uVar = c2.u.f22885a;
                    long j14 = d92.b.a(mVar).f().f63508c;
                    float f14 = 24;
                    g6.f.a aVar3 = g6.f.f75994b;
                    i7.b(this.f16751b, null, uVar.c(x2.u(x2.h(aVar, f14), f14), h4.d.a.f81528f), j14, mVar, 48, 0);
                    mVar.y();
                } else {
                    mVar.e();
                }
                return Unit.INSTANCE;
            default:
                p3.m mVar2 = (p3.m) obj;
                int iIntValue2 = ((Integer) obj2).intValue();
                if (mVar2.n(iIntValue2 & 1, (iIntValue2 & 3) != 2)) {
                    p3.x1 x1Var2 = p3.n.f135158a;
                    if (d0Var != null) {
                        j8 = d0Var.f128833a;
                    } else {
                        o4.d0.f128823b.getClass();
                        j8 = o4.d0.f128832k;
                    }
                    long j15 = j8;
                    h4.r.a aVar4 = h4.r.S;
                    d92.b.f58623a.getClass();
                    d92.b.f58625c.getClass();
                    i7.b(this.f16751b, null, x2.q(aVar4, j92.b.f97901d.f97905d), j15, mVar2, 48, 0);
                } else {
                    mVar2.e();
                }
                return Unit.INSTANCE;
        }
    }

    public /* synthetic */ r(u4.d dVar, o4.d0 d0Var) {
        this.f16751b = dVar;
        this.f16752c = d0Var;
    }
}
