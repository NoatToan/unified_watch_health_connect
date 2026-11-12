package hz0;

import android.view.View;
import c2.x2;
import p005kotlin.Unit;
import p3.b4;
import p3.i2;
import p3.p0;
import p3.x1;

/* JADX INFO: loaded from: classes9.dex */
public final /* synthetic */ class c implements e23.p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f86410a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ d f86411b;

    public /* synthetic */ c(d dVar, int i14) {
        this.f86410a = i14;
        this.f86411b = dVar;
    }

    @Override // e23.p
    public final Object invoke(Object obj, Object obj2) {
        int i14 = this.f86410a;
        d dVar = this.f86411b;
        int i15 = 1;
        switch (i14) {
            case 0:
                p3.m mVar = (p3.m) obj;
                int iIntValue = ((Integer) obj2).intValue();
                int i16 = d.f86416d;
                if (mVar.n(iIntValue & 1, (iIntValue & 3) != 2)) {
                    x1 x1Var = p3.n.f135158a;
                    z02.b.a(false, null, null, null, false, z3.f.c(-1402099412, new c(dVar, i15), mVar), mVar, 196608, 31);
                } else {
                    mVar.e();
                }
                return Unit.INSTANCE;
            default:
                p3.m mVar2 = (p3.m) obj;
                int iIntValue2 = ((Integer) obj2).intValue();
                int i17 = d.f86416d;
                if (mVar2.n(iIntValue2 & 1, (iIntValue2 & 3) != 2)) {
                    x1 x1Var2 = p3.n.f135158a;
                    ub1.l lVar = (ub1.l) dVar.f86419c.getF182175a();
                    if (lVar == null) {
                        mVar2.C(-1386585364);
                        mVar2.f();
                    } else {
                        mVar2.C(-1386585363);
                        View view2 = dVar.f86417a;
                        if (view2 != null) {
                            view2.setVisibility(8);
                        }
                        h4.r.a aVar = h4.r.S;
                        h4.r rVarF = x2.f(aVar, 1.0f);
                        c2.j.f22691a.getClass();
                        c2.j.k kVar = c2.j.f22694d;
                        h4.d.f81522a.getClass();
                        c2.z zVarA = c2.y.a(kVar, h4.d.a.f81536n, mVar2, 0);
                        int iHashCode = Long.hashCode(mVar2.getU());
                        i2 i2VarX = mVar2.x();
                        h4.r rVarC = h4.k.c(rVarF, mVar2);
                        h5.g.V.getClass();
                        h5.e0.a aVar2 = h5.g.a.f81805b;
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
                        b4.c(h5.g.a.f81810g, zVarA, mVar2);
                        b4.c(h5.g.a.f81809f, i2VarX, mVar2);
                        h5.g.a.b bVar = h5.g.a.f81813j;
                        if (mVar2.getT() || !p005kotlin.jvm.internal.s.g(mVar2.q(), Integer.valueOf(iHashCode))) {
                            v.h.z(iHashCode, mVar2, iHashCode, bVar);
                        }
                        b4.c(h5.g.a.f81807d, rVarC, mVar2);
                        c2.b0 b0Var = c2.b0.f22601a;
                        d92.b.f58623a.getClass();
                        d92.b.f58625c.getClass();
                        lVar.a(c2.l.y(aVar, j92.b.f97899b.f97920e), mVar2, 0);
                        mVar2.y();
                        mVar2.f();
                    }
                } else {
                    mVar2.e();
                }
                return Unit.INSTANCE;
        }
    }
}
