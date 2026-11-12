package i3;

import p005kotlin.Metadata;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes.dex */
@Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
public final class n1 implements e23.p<p3.m, Integer, Unit> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ e23.q<c2.a0, p3.m, Integer, Unit> f89050a;

    /* JADX WARN: Multi-variable type inference failed */
    public n1(e23.q<? super c2.a0, ? super p3.m, ? super Integer, Unit> qVar) {
        this.f89050a = qVar;
    }

    @Override // e23.p
    public final Unit invoke(p3.m mVar, Integer num) {
        p3.m mVar2 = mVar;
        int iIntValue = num.intValue();
        if (mVar2.n(iIntValue & 1, (iIntValue & 3) != 2)) {
            p3.x1 x1Var = p3.n.f135158a;
            h4.r.a aVar = h4.r.S;
            c2.j.f22691a.getClass();
            c2.j.k kVar = c2.j.f22694d;
            h4.d.f81522a.getClass();
            c2.z zVarA = c2.y.a(kVar, h4.d.a.f81536n, mVar2, 0);
            int iP = mVar2.P();
            p3.i2 i2VarX = mVar2.x();
            h4.r rVarC = h4.k.c(aVar, mVar2);
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
            p3.b4.c(h5.g.a.f81810g, zVarA, mVar2);
            p3.b4.c(h5.g.a.f81809f, i2VarX, mVar2);
            h5.g.a.b bVar = h5.g.a.f81813j;
            if (mVar2.getT() || !p005kotlin.jvm.internal.s.g(mVar2.q(), Integer.valueOf(iP))) {
                v.h.z(iP, mVar2, iP, bVar);
            }
            p3.b4.c(h5.g.a.f81807d, rVarC, mVar2);
            this.f89050a.invoke(c2.b0.f22601a, mVar2, 6);
            mVar2.y();
        } else {
            mVar2.e();
        }
        return Unit.INSTANCE;
    }
}
