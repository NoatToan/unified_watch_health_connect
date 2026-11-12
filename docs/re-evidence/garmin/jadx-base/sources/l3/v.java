package l3;

import p005kotlin.Metadata;
import p005kotlin.Unit;
import p3.b4;

/* JADX INFO: loaded from: classes.dex */
@Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
public final class v implements e23.p<p3.m, Integer, Unit> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ String f109442a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ e23.p<p3.m, Integer, Unit> f109443b;

    /* JADX WARN: Multi-variable type inference failed */
    public v(String str, e23.p<? super p3.m, ? super Integer, Unit> pVar) {
        this.f109442a = str;
        this.f109443b = pVar;
    }

    /* JADX WARN: Code duplicated, block: B:12:0x0032  */
    @Override // e23.p
    public final Unit invoke(p3.m mVar, Integer num) {
        p3.m mVar2 = mVar;
        int iIntValue = num.intValue();
        if (mVar2.n(iIntValue & 1, (iIntValue & 3) != 2)) {
            p3.x1 x1Var = p3.n.f135158a;
            h4.r.a aVar = h4.r.S;
            String str = this.f109442a;
            boolean zB = mVar2.B(str);
            Object objQ = mVar2.q();
            if (zB) {
                objQ = new jl0.e(str, 16);
                mVar2.K(objQ);
            } else {
                p3.m.f135153a.getClass();
                if (objQ == p3.m.a.f135155b) {
                    objQ = new jl0.e(str, 16);
                    mVar2.K(objQ);
                }
            }
            h4.r rVarC = p5.v.c((e23.l) objQ, aVar, false);
            h4.d.f81522a.getClass();
            f5.z0 z0VarD = c2.q.d(h4.d.a.f81524b, false);
            int iP = mVar2.P();
            p3.i2 i2VarX = mVar2.x();
            h4.r rVarC2 = h4.k.c(rVarC, mVar2);
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
            b4.c(h5.g.a.f81810g, z0VarD, mVar2);
            b4.c(h5.g.a.f81809f, i2VarX, mVar2);
            h5.g.a.b bVar = h5.g.a.f81813j;
            if (mVar2.getT() || !p005kotlin.jvm.internal.s.g(mVar2.q(), Integer.valueOf(iP))) {
                v.h.z(iP, mVar2, iP, bVar);
            }
            b4.c(h5.g.a.f81807d, rVarC2, mVar2);
            c2.u uVar = c2.u.f22885a;
            v.h.B(this.f109443b, mVar2, 0);
        } else {
            mVar2.e();
        }
        return Unit.INSTANCE;
    }
}
