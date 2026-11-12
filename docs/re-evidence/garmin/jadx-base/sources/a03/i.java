package a03;

import c2.k3;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import p3.b4;
import p3.g3;
import p3.i2;
import p3.x1;
import p3.x3;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
public final class i implements e23.p<p3.m, Integer, Unit> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ k3 f103a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ x3<e23.q<c2.t, p3.m, Integer, Unit>> f104b;

    /* JADX WARN: Multi-variable type inference failed */
    public i(k3 k3Var, x3<? extends e23.q<? super c2.t, ? super p3.m, ? super Integer, Unit>> x3Var) {
        this.f103a = k3Var;
        this.f104b = x3Var;
    }

    @Override // e23.p
    public final Unit invoke(p3.m mVar, Integer num) {
        p3.m mVar2 = mVar;
        if ((num.intValue() & 11) == 2 && mVar2.b()) {
            mVar2.e();
        } else {
            h4.r rVarP = c2.l.p(c2.l.G(p5.v.c(new h(0), h4.r.S, false), this.f103a));
            mVar2.L(733328855);
            h4.d.f81522a.getClass();
            c2.s sVarE = c2.q.e(h4.d.a.f81524b, mVar2, 0);
            mVar2.L(-1323940314);
            x1 x1Var = p3.n.f135158a;
            int iP = mVar2.P();
            i2 i2VarX = mVar2.x();
            h5.g.V.getClass();
            h5.e0.a aVar = h5.g.a.f81805b;
            z3.e eVarC = f5.k0.c(rVarP);
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
            b4.c(h5.g.a.f81810g, sVarE, mVar2);
            b4.c(h5.g.a.f81809f, i2VarX, mVar2);
            h5.g.a.b bVar = h5.g.a.f81813j;
            if (mVar2.getT() || !p005kotlin.jvm.internal.s.g(mVar2.q(), Integer.valueOf(iP))) {
                v.h.z(iP, mVar2, iP, bVar);
            }
            eVarC.invoke(g3.a(mVar2), mVar2, 0);
            mVar2.L(2058660585);
            this.f104b.getF182175a().invoke(c2.u.f22885a, mVar2, 6);
            mVar2.R();
            mVar2.y();
            mVar2.R();
            mVar2.R();
        }
        return Unit.INSTANCE;
    }
}
