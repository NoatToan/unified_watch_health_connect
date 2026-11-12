package a3;

import c2.h2;
import c2.q2;
import c2.s2;
import c2.u2;
import c2.x2;
import p005kotlin.Unit;
import p3.b4;
import p3.i2;
import p3.x1;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class r implements e23.p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f813a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ h2 f814b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ z3.e f815c;

    public /* synthetic */ r(h2 h2Var, z3.e eVar, int i14) {
        this.f813a = i14;
        this.f814b = h2Var;
        this.f815c = eVar;
    }

    @Override // e23.p
    public final Object invoke(Object obj, Object obj2) {
        int i14 = this.f813a;
        z3.e eVar = this.f815c;
        h2 h2Var = this.f814b;
        int i15 = 1;
        p3.m mVar = (p3.m) obj;
        int iIntValue = ((Integer) obj2).intValue();
        switch (i14) {
            case 0:
                if (mVar.n(iIntValue & 1, (iIntValue & 3) != 2)) {
                    x1 x1Var = p3.n.f135158a;
                    o0.f762a.getClass();
                    s1.a(((t1) mVar.A(u1.f859b)).f846k, z3.f.c(165539859, new r(h2Var, eVar, i15), mVar), mVar, 48);
                } else {
                    mVar.e();
                }
                return Unit.INSTANCE;
            default:
                if (mVar.n(iIntValue & 1, (iIntValue & 3) != 2)) {
                    x1 x1Var2 = p3.n.f135158a;
                    h4.r.a aVar = h4.r.S;
                    o.f757a.getClass();
                    h4.r rVarX = c2.l.x(x2.a(aVar, o.f759c, o.f760d), h2Var);
                    c2.j.f22691a.getClass();
                    c2.j.c cVar = c2.j.f22696f;
                    h4.d.f81522a.getClass();
                    s2 s2VarA = q2.a(cVar, h4.d.a.f81534l, mVar, 54);
                    int iP = mVar.P();
                    i2 i2VarX = mVar.x();
                    h4.r rVarC = h4.k.c(rVarX, mVar);
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
                    b4.c(h5.g.a.f81810g, s2VarA, mVar);
                    b4.c(h5.g.a.f81809f, i2VarX, mVar);
                    h5.g.a.b bVar = h5.g.a.f81813j;
                    if (mVar.getT() || !p005kotlin.jvm.internal.s.g(mVar.q(), Integer.valueOf(iP))) {
                        v.h.z(iP, mVar, iP, bVar);
                    }
                    b4.c(h5.g.a.f81807d, rVarC, mVar);
                    eVar.invoke(u2.f22900a, mVar, 6);
                    mVar.y();
                } else {
                    mVar.e();
                }
                return Unit.INSTANCE;
        }
    }
}
