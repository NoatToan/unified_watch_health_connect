package i3;

import p005kotlin.Metadata;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes.dex */
@Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
public final class a8 implements e23.p<p3.m, Integer, Unit> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ c2.t2 f87439a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ e23.p<p3.m, Integer, Unit> f87440b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ e23.p<p3.m, Integer, Unit> f87441c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ e23.p<p3.m, Integer, Unit> f87442d;

    /* JADX WARN: Multi-variable type inference failed */
    public a8(c2.t2 t2Var, e23.p<? super p3.m, ? super Integer, Unit> pVar, e23.p<? super p3.m, ? super Integer, Unit> pVar2, e23.p<? super p3.m, ? super Integer, Unit> pVar3) {
        this.f87439a = t2Var;
        this.f87440b = pVar;
        this.f87441c = pVar2;
        this.f87442d = pVar3;
    }

    @Override // e23.p
    public final Unit invoke(p3.m mVar, Integer num) {
        float f14;
        float f15;
        p3.m mVar2 = mVar;
        int iIntValue = num.intValue();
        if (mVar2.n(iIntValue & 1, (iIntValue & 3) != 2)) {
            p3.x1 x1Var = p3.n.f135158a;
            h4.r rVarA = this.f87439a.a(h4.r.S, 1.0f, true);
            if (this.f87440b != null) {
                f14 = y7.f90419c;
            } else {
                f14 = 0;
                g6.f.a aVar = g6.f.f75994b;
            }
            float f16 = f14;
            if (this.f87441c != null) {
                f15 = y7.f90419c;
            } else {
                f15 = 0;
                g6.f.a aVar2 = g6.f.f75994b;
            }
            h4.r rVarC = c2.l.C(rVarA, f16, 0.0f, f15, 0.0f, 10);
            h4.d.f81522a.getClass();
            f5.z0 z0VarD = c2.q.d(h4.d.a.f81524b, false);
            int iP = mVar2.P();
            p3.i2 i2VarX = mVar2.x();
            h4.r rVarC2 = h4.k.c(rVarC, mVar2);
            h5.g.V.getClass();
            h5.e0.a aVar3 = h5.g.a.f81805b;
            if (mVar2.F() == null) {
                p3.p0.l();
                throw null;
            }
            mVar2.z();
            if (mVar2.getT()) {
                mVar2.M(aVar3);
            } else {
                mVar2.c();
            }
            p3.b4.c(h5.g.a.f81810g, z0VarD, mVar2);
            p3.b4.c(h5.g.a.f81809f, i2VarX, mVar2);
            h5.g.a.b bVar = h5.g.a.f81813j;
            if (mVar2.getT() || !p005kotlin.jvm.internal.s.g(mVar2.q(), Integer.valueOf(iP))) {
                v.h.z(iP, mVar2, iP, bVar);
            }
            p3.b4.c(h5.g.a.f81807d, rVarC2, mVar2);
            c2.u uVar = c2.u.f22885a;
            v.h.B(this.f87442d, mVar2, 0);
        } else {
            mVar2.e();
        }
        return Unit.INSTANCE;
    }
}
