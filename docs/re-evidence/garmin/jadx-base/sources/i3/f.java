package i3;

import p005kotlin.Metadata;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes.dex */
@Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
public final class f implements e23.p<p3.m, Integer, Unit> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ c2.a0 f88039a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ e23.p<p3.m, Integer, Unit> f88040b;

    /* JADX WARN: Multi-variable type inference failed */
    public f(c2.a0 a0Var, e23.p<? super p3.m, ? super Integer, Unit> pVar) {
        this.f88039a = a0Var;
        this.f88040b = pVar;
    }

    @Override // e23.p
    public final Unit invoke(p3.m mVar, Integer num) {
        p3.m mVar2 = mVar;
        int iIntValue = num.intValue();
        if (mVar2.n(iIntValue & 1, (iIntValue & 3) != 2)) {
            p3.x1 x1Var = p3.n.f135158a;
            h4.r.a aVar = h4.r.S;
            c2.a0 a0Var = this.f88039a;
            h4.r rVarX = c2.l.x(a0Var.a(aVar, 1.0f, false), l.f88780h);
            h4.d.f81522a.getClass();
            h4.r rVarB = a0Var.b(rVarX, h4.d.a.f81536n);
            f5.z0 z0VarD = c2.q.d(h4.d.a.f81524b, false);
            int iP = mVar2.P();
            p3.i2 i2VarX = mVar2.x();
            h4.r rVarC = h4.k.c(rVarB, mVar2);
            h5.g.V.getClass();
            h5.e0.a aVar2 = h5.g.a.f81805b;
            if (mVar2.F() == null) {
                p3.p0.l();
                throw null;
            }
            mVar2.z();
            if (mVar2.getT()) {
                mVar2.M(aVar2);
            } else {
                mVar2.c();
            }
            p3.b4.c(h5.g.a.f81810g, z0VarD, mVar2);
            p3.b4.c(h5.g.a.f81809f, i2VarX, mVar2);
            h5.g.a.b bVar = h5.g.a.f81813j;
            if (mVar2.getT() || !p005kotlin.jvm.internal.s.g(mVar2.q(), Integer.valueOf(iP))) {
                v.h.z(iP, mVar2, iP, bVar);
            }
            p3.b4.c(h5.g.a.f81807d, rVarC, mVar2);
            c2.u uVar = c2.u.f22885a;
            v.h.B(this.f88040b, mVar2, 0);
        } else {
            mVar2.e();
        }
        return Unit.INSTANCE;
    }
}
