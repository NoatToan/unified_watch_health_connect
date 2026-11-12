package i3;

import p005kotlin.Metadata;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes.dex */
@Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
public final class a7 implements e23.p<p3.m, Integer, Unit> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ e23.q<c2.t2, p3.m, Integer, Unit> f87438a;

    /* JADX WARN: Multi-variable type inference failed */
    public a7(e23.q<? super c2.t2, ? super p3.m, ? super Integer, Unit> qVar) {
        this.f87438a = qVar;
    }

    @Override // e23.p
    public final Unit invoke(p3.m mVar, Integer num) {
        p3.m mVar2 = mVar;
        int iIntValue = num.intValue();
        if (mVar2.n(iIntValue & 1, (iIntValue & 3) != 2)) {
            p3.x1 x1Var = p3.n.f135158a;
            h4.r rVarA = c2.l.A(c2.x2.t(h4.r.S, d7.f87831b, 0.0f, 0.0f, 14), d7.f87830a, 0.0f, 2);
            c2.j.f22691a.getClass();
            c2.j.c cVar = c2.j.f22696f;
            h4.d.f81522a.getClass();
            c2.s2 s2VarA = c2.q2.a(cVar, h4.d.a.f81534l, mVar2, 54);
            int iP = mVar2.P();
            p3.i2 i2VarX = mVar2.x();
            h4.r rVarC = h4.k.c(rVarA, mVar2);
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
            p3.b4.c(h5.g.a.f81810g, s2VarA, mVar2);
            p3.b4.c(h5.g.a.f81809f, i2VarX, mVar2);
            h5.g.a.b bVar = h5.g.a.f81813j;
            if (mVar2.getT() || !p005kotlin.jvm.internal.s.g(mVar2.q(), Integer.valueOf(iP))) {
                v.h.z(iP, mVar2, iP, bVar);
            }
            p3.b4.c(h5.g.a.f81807d, rVarC, mVar2);
            this.f87438a.invoke(c2.u2.f22900a, mVar2, 6);
            mVar2.y();
        } else {
            mVar2.e();
        }
        return Unit.INSTANCE;
    }
}
