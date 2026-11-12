package p004k6;

import e23.p;
import f5.g0;
import f5.z0;
import h4.r;
import h5.e0;
import h5.g;
import l4.k;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import p005kotlin.jvm.internal.w;
import p3.b4;
import p3.i2;
import p3.j0;
import p3.m;
import p3.n;
import p3.p0;
import p3.x1;
import p3.x3;
import p5.v;
import v.h;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\b\n\u0002\u0010\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"", "invoke", "(Lp3/m;I)V", "<anonymous>"}, k = 3, mv = {2, 1, 0})
public final class l extends w implements p<m, Integer, Unit> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ x f103082a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ x3<p<m, Integer, Unit>> f103083b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public l(x xVar, x3<? extends p<? super m, ? super Integer, Unit>> x3Var) {
        super(2);
        this.f103082a = xVar;
        this.f103083b = x3Var;
    }

    @Override // e23.p
    public final Unit invoke(m mVar, Integer num) {
        m mVar2 = mVar;
        int iIntValue = num.intValue();
        if (mVar2.n(iIntValue & 1, (iIntValue & 3) != 2)) {
            x1 x1Var = n.f135158a;
            r.a aVar = r.S;
            Object objQ = mVar2.q();
            m.f135153a.getClass();
            m.a.C2565a c2565a = m.a.f135155b;
            if (objQ == c2565a) {
                objQ = j.f103080a;
                mVar2.K(objQ);
            }
            r rVarC = v.c((e23.l) objQ, aVar, false);
            x xVar = this.f103082a;
            boolean zR = mVar2.r(xVar);
            Object objQ2 = mVar2.q();
            if (zR || objQ2 == c2565a) {
                objQ2 = new k(xVar);
                mVar2.K(objQ2);
            }
            r rVarA = k.a(g0.g(rVarC, (e23.l) objQ2), xVar.getCanCalculatePosition() ? 1.0f : 0.0f);
            j0 j0Var = g.f103039a;
            p<m, Integer, Unit> f182175a = this.f103083b.getF182175a();
            Object objQ3 = mVar2.q();
            if (objQ3 == c2565a) {
                objQ3 = m.f103084a;
                mVar2.K(objQ3);
            }
            z0 z0Var = (z0) objQ3;
            int iHashCode = Long.hashCode(mVar2.getU());
            i2 i2VarX = mVar2.x();
            r rVarC2 = h4.k.c(rVarA, mVar2);
            g.V.getClass();
            e0.a aVar2 = g.a.f81805b;
            if (mVar2.F() == null) {
                p0.l();
                throw null;
            }
            mVar2.z();
            if (mVar2.getT()) {
                mVar2.M(aVar2);
            } else {
                mVar2.c();
            }
            b4.c(g.a.f81810g, z0Var, mVar2);
            b4.c(g.a.f81809f, i2VarX, mVar2);
            b4.c(g.a.f81813j, Integer.valueOf(iHashCode), mVar2);
            b4.b(g.a.f81814k, mVar2);
            b4.c(g.a.f81807d, rVarC2, mVar2);
            h.B(f182175a, mVar2, 0);
        } else {
            mVar2.e();
        }
        return Unit.INSTANCE;
    }
}
