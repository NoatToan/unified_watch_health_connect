package i3;

import p005kotlin.Metadata;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes.dex */
@Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
public final class yi implements e23.p<p3.m, Integer, Unit> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ float f90503a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ long f90504b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ e23.p<p3.m, Integer, Unit> f90505c;

    /* JADX WARN: Multi-variable type inference failed */
    public yi(float f14, long j8, e23.p<? super p3.m, ? super Integer, Unit> pVar) {
        this.f90503a = f14;
        this.f90504b = j8;
        this.f90505c = pVar;
    }

    @Override // e23.p
    public final Unit invoke(p3.m mVar, Integer num) {
        p3.m mVar2 = mVar;
        int iIntValue = num.intValue();
        if (mVar2.n(iIntValue & 1, (iIntValue & 3) != 2)) {
            p3.x1 x1Var = p3.n.f135158a;
            h4.r rVarX = c2.l.x(c2.x2.t(h4.r.S, ej.f88037c, ej.f88036b, this.f90503a, 8), ej.f88038d);
            h4.d.f81522a.getClass();
            f5.z0 z0VarD = c2.q.d(h4.d.a.f81524b, false);
            int iP = mVar2.P();
            p3.i2 i2VarX = mVar2.x();
            h4.r rVarC = h4.k.c(rVarX, mVar2);
            h5.g.V.getClass();
            h5.e0.a aVar = h5.g.a.f81805b;
            if (mVar2.F() == null) {
                p3.p0.l();
                throw null;
            }
            mVar2.z();
            if (mVar2.getT()) {
                mVar2.M(aVar);
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
            n3.p0.f123217a.getClass();
            p3.v.b(new p3.n2[]{s2.f89590a.c(o4.d0.a(this.f90504b)), mh.f89022a.c(sj.a(n3.p0.f123221e, mVar2))}, this.f90505c, mVar2, 8);
            mVar2.y();
        } else {
            mVar2.e();
        }
        return Unit.INSTANCE;
    }
}
