package bv1;

import c80.s0;
import org.koin.java.KoinJavaComponent;
import p005kotlin.Unit;
import p3.x1;
import zd0.g1;

/* JADX INFO: loaded from: classes10.dex */
public final /* synthetic */ class j implements e23.p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f21416a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ ww1.l f21417b;

    public /* synthetic */ j(ww1.l lVar, int i14) {
        this.f21416a = i14;
        this.f21417b = lVar;
    }

    @Override // e23.p
    public final Object invoke(Object obj, Object obj2) {
        int i14 = this.f21416a;
        ww1.l lVar = this.f21417b;
        int i15 = 1;
        switch (i14) {
            case 0:
                p3.m mVar = (p3.m) obj;
                int iIntValue = ((Integer) obj2).intValue();
                if (mVar.n(iIntValue & 1, (iIntValue & 3) != 2)) {
                    x1 x1Var = p3.n.f135158a;
                    z02.b.a(false, null, null, null, false, z3.f.c(1649562729, new j(lVar, i15), mVar), mVar, 196608, 31);
                } else {
                    mVar.e();
                }
                break;
            default:
                p3.m mVar2 = (p3.m) obj;
                int iIntValue2 = ((Integer) obj2).intValue();
                if (mVar2.n(iIntValue2 & 1, (iIntValue2 & 3) != 2)) {
                    x1 x1Var2 = p3.n.f135158a;
                    ub1.l lVarU = g1.u((g1) KoinJavaComponent.get$default(g1.class, null, null, 6, null), s0.GARMIN_COACH_PLAN, new k(lVar), 4);
                    if (lVarU == null) {
                        mVar2.C(-891737021);
                    } else {
                        mVar2.C(386876286);
                        h4.r.a aVar = h4.r.S;
                        d92.b.f58623a.getClass();
                        d92.b.f58625c.getClass();
                        lVarU.a(c2.l.y(aVar, j92.b.f97899b.f97920e), mVar2, 0);
                    }
                    mVar2.f();
                } else {
                    mVar2.e();
                }
                break;
        }
        return Unit.INSTANCE;
    }
}
