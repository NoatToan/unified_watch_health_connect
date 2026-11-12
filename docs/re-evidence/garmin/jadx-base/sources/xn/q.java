package xn;

import p005kotlin.Unit;
import p3.x1;
import w02.b0;

/* JADX INFO: loaded from: classes7.dex */
public final /* synthetic */ class q implements e23.q {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f191621a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ s f191622b;

    public /* synthetic */ q(s sVar, int i14) {
        this.f191621a = i14;
        this.f191622b = sVar;
    }

    @Override // e23.q
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        int i14 = this.f191621a;
        s sVar = this.f191622b;
        switch (i14) {
            case 0:
                p3.m mVar = (p3.m) obj2;
                int iIntValue = ((Integer) obj3).intValue();
                int i15 = s.f191625f;
                if (mVar.n(iIntValue & 1, (iIntValue & 17) != 16)) {
                    x1 x1Var = p3.n.f135158a;
                    sVar.g(mVar, h82.c.f82429e);
                } else {
                    mVar.e();
                }
                break;
            default:
                h82.r rVar = (h82.r) obj;
                p3.m mVar2 = (p3.m) obj2;
                int iIntValue2 = ((Integer) obj3).intValue();
                int i16 = s.f191625f;
                rVar.getClass();
                if ((iIntValue2 & 6) == 0) {
                    iIntValue2 |= mVar2.B(rVar) ? 4 : 2;
                }
                if (mVar2.n(iIntValue2 & 1, (iIntValue2 & 19) != 18)) {
                    x1 x1Var2 = p3.n.f135158a;
                    b0.a(mVar2, 0);
                    rVar.a(z3.f.c(-930841689, new xm0.h(3, rVar, sVar), mVar2), mVar2, ((iIntValue2 << 3) & 112) | 6);
                } else {
                    mVar2.e();
                }
                break;
        }
        return Unit.INSTANCE;
    }
}
