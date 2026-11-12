package ov1;

import p005kotlin.Unit;
import p3.p0;
import p3.x1;

/* JADX INFO: loaded from: classes10.dex */
public final /* synthetic */ class x implements e23.p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f134242a = 0;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ y f134243b;

    @Override // e23.p
    public final Object invoke(Object obj, Object obj2) {
        int i14 = this.f134242a;
        y yVar = this.f134243b;
        p3.m mVar = (p3.m) obj;
        Integer num = (Integer) obj2;
        switch (i14) {
            case 0:
                int iIntValue = num.intValue();
                y.a aVar = y.f134244b;
                if (mVar.n(iIntValue & 1, (iIntValue & 3) != 2)) {
                    x1 x1Var = p3.n.f135158a;
                    yVar.u6(mVar, 0);
                } else {
                    mVar.e();
                }
                break;
            default:
                num.getClass();
                y.a aVar2 = y.f134244b;
                yVar.u6(mVar, p0.t(1));
                break;
        }
        return Unit.INSTANCE;
    }
}
