package l3;

import i3.fh;
import i3.na;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import p3.b4;

/* JADX INFO: loaded from: classes.dex */
@Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
public final class u1 implements e23.p<p3.m, Integer, Unit> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ p3.p1<n4.g> f109438a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ fh f109439b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ c2.h2 f109440c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ e23.p<p3.m, Integer, Unit> f109441d;

    /* JADX WARN: Multi-variable type inference failed */
    public u1(p3.p1<n4.g> p1Var, fh fhVar, c2.h2 h2Var, e23.p<? super p3.m, ? super Integer, Unit> pVar) {
        this.f109438a = p1Var;
        this.f109439b = fhVar;
        this.f109440c = h2Var;
        this.f109441d = pVar;
    }

    @Override // e23.p
    public final Unit invoke(p3.m mVar, Integer num) {
        p3.m mVar2 = mVar;
        int iIntValue = num.intValue();
        if (mVar2.n(iIntValue & 1, (iIntValue & 3) != 2)) {
            p3.x1 x1Var = p3.n.f135158a;
            h4.r rVarE = f5.g0.e(h4.r.S, "Container");
            final p3.p1<n4.g> p1Var = this.f109438a;
            p005kotlin.jvm.internal.z zVar = new p005kotlin.jvm.internal.z(p1Var) { // from class: l3.t1
                @Override // p005kotlin.jvm.internal.z, k23.m
                public final Object get() {
                    return ((p3.p1) this.receiver).getF182175a();
                }

                @Override // p005kotlin.jvm.internal.z, k23.i
                public final void set(Object obj) {
                    ((p3.p1) this.receiver).setValue(obj);
                }
            };
            h4.d.b bVarF = k2.f(this.f109439b);
            float f14 = na.f89071a;
            h4.r rVarF = l4.k.f(rVarE, new gw1.d(zVar, 13, this.f109440c, bVarF));
            h4.d.f81522a.getClass();
            f5.z0 z0VarD = c2.q.d(h4.d.a.f81524b, true);
            int iP = mVar2.P();
            p3.i2 i2VarX = mVar2.x();
            h4.r rVarC = h4.k.c(rVarF, mVar2);
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
            b4.c(h5.g.a.f81810g, z0VarD, mVar2);
            b4.c(h5.g.a.f81809f, i2VarX, mVar2);
            h5.g.a.b bVar = h5.g.a.f81813j;
            if (mVar2.getT() || !p005kotlin.jvm.internal.s.g(mVar2.q(), Integer.valueOf(iP))) {
                v.h.z(iP, mVar2, iP, bVar);
            }
            b4.c(h5.g.a.f81807d, rVarC, mVar2);
            c2.u uVar = c2.u.f22885a;
            v.h.B(this.f109441d, mVar2, 0);
        } else {
            mVar2.e();
        }
        return Unit.INSTANCE;
    }
}
