package qr;

import org.koin.java.KoinJavaComponent;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes7.dex */
public final /* synthetic */ class l implements e23.p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f146307a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ nr.t.f f146308b;

    public /* synthetic */ l(nr.t.f fVar, int i14) {
        this.f146307a = i14;
        this.f146308b = fVar;
    }

    @Override // e23.p
    public final Object invoke(Object obj, Object obj2) {
        int i14 = this.f146307a;
        nr.t.f fVar = this.f146308b;
        int i15 = 1;
        switch (i14) {
            case 0:
                p3.m mVar = (p3.m) obj;
                int iIntValue = ((Integer) obj2).intValue();
                if (mVar.n(iIntValue & 1, (iIntValue & 3) != 2)) {
                    p3.x1 x1Var = p3.n.f135158a;
                    z02.b.a(false, null, null, null, false, z3.f.c(1113368147, new l(fVar, i15), mVar), mVar, 196608, 31);
                } else {
                    mVar.e();
                }
                break;
            default:
                p3.m mVar2 = (p3.m) obj;
                int iIntValue2 = ((Integer) obj2).intValue();
                if (mVar2.n(iIntValue2 & 1, (iIntValue2 & 3) != 2)) {
                    p3.x1 x1Var2 = p3.n.f135158a;
                    ub1.l lVarU = zd0.g1.u((zd0.g1) KoinJavaComponent.get$default(zd0.g1.class, null, null, 6, null), c80.s0.ACTIVITY_DETAILS, new ks.a(fVar != null ? fVar.f127337b : null, fVar != null ? fVar.f127349n : null, fVar != null ? Boolean.valueOf(fVar.f127341f) : null), 4);
                    if (lVarU == null) {
                        mVar2.C(-1681308978);
                    } else {
                        mVar2.C(499953555);
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
