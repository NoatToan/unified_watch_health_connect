package e2;

import p005kotlin.Unit;
import p3.x1;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class l implements e23.r {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f62481a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ e23.q f62482b;

    public /* synthetic */ l(e23.q qVar, int i14) {
        this.f62481a = i14;
        this.f62482b = qVar;
    }

    @Override // e23.r
    public final Object invoke(Object obj, Object obj2, Object obj3, Object obj4) {
        int i14 = this.f62481a;
        e23.q qVar = this.f62482b;
        switch (i14) {
            case 0:
                d dVar = (d) obj;
                ((Integer) obj2).intValue();
                p3.m mVar = (p3.m) obj3;
                int iIntValue = ((Integer) obj4).intValue();
                if ((iIntValue & 6) == 0) {
                    iIntValue |= mVar.B(dVar) ? 4 : 2;
                }
                if (mVar.n(iIntValue & 1, (iIntValue & 131) != 130)) {
                    x1 x1Var = p3.n.f135158a;
                    qVar.invoke(dVar, mVar, Integer.valueOf(iIntValue & 14));
                } else {
                    mVar.e();
                }
                break;
            case 1:
                f2.r rVar = (f2.r) obj;
                ((Integer) obj2).intValue();
                p3.m mVar2 = (p3.m) obj3;
                int iIntValue2 = ((Integer) obj4).intValue();
                ex.b bVar = f2.l.f68229d;
                if ((iIntValue2 & 6) == 0) {
                    iIntValue2 |= mVar2.B(rVar) ? 4 : 2;
                }
                if (mVar2.n(iIntValue2 & 1, (iIntValue2 & 131) != 130)) {
                    x1 x1Var2 = p3.n.f135158a;
                    qVar.invoke(rVar, mVar2, Integer.valueOf(iIntValue2 & 14));
                } else {
                    mVar2.e();
                }
                break;
            default:
                Integer num = (Integer) obj2;
                num.intValue();
                int iIntValue3 = ((Integer) obj4).intValue();
                ((h2.c0) obj).getClass();
                x1 x1Var3 = p3.n.f135158a;
                qVar.invoke(num, (p3.m) obj3, Integer.valueOf((iIntValue3 >> 3) & 14));
                break;
        }
        return Unit.INSTANCE;
    }
}
