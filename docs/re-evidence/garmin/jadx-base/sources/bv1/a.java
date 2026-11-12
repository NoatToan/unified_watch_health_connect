package bv1;

import c2.x2;
import p005kotlin.Unit;
import p3.x1;

/* JADX INFO: loaded from: classes10.dex */
public final /* synthetic */ class a implements e23.p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f21376a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ tw1.n f21377b;

    public /* synthetic */ a(tw1.n nVar, int i14) {
        this.f21376a = i14;
        this.f21377b = nVar;
    }

    @Override // e23.p
    public final Object invoke(Object obj, Object obj2) {
        u4.d dVarA;
        int i14 = this.f21376a;
        tw1.n nVar = this.f21377b;
        int i15 = 1;
        switch (i14) {
            case 0:
                p3.m mVar = (p3.m) obj;
                int iIntValue = ((Integer) obj2).intValue();
                if (mVar.n(iIntValue & 1, (iIntValue & 3) != 2)) {
                    x1 x1Var = p3.n.f135158a;
                    z02.b.a(false, null, null, null, false, z3.f.c(-2128638398, new a(nVar, i15), mVar), mVar, 196608, 31);
                } else {
                    mVar.e();
                }
                break;
            default:
                p3.m mVar2 = (p3.m) obj;
                int iIntValue2 = ((Integer) obj2).intValue();
                if (mVar2.n(iIntValue2 & 1, (iIntValue2 & 3) != 2)) {
                    x1 x1Var2 = p3.n.f135158a;
                    h4.r rVarF = x2.f(h4.r.S, 1.0f);
                    vt1.o oVarB = nVar.b();
                    if (oVarB != null) {
                        dVarA = oVarB.a();
                    } else {
                        s62.a.f157643a.getClass();
                        dVarA = u62.a.a(t62.a.f162797a);
                    }
                    u4.d dVar = dVarA;
                    d92.b.f58623a.getClass();
                    d92.b.f58625c.getClass();
                    cv1.b.a(rVarF, dVar, j92.b.f97901d.f97907f, j92.b.f97899b.f97920e, 0, 0, mVar2, 6, 48);
                } else {
                    mVar2.e();
                }
                break;
        }
        return Unit.INSTANCE;
    }
}
