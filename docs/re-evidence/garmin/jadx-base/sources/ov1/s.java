package ov1;

import p005kotlin.Unit;
import p3.p0;
import p3.x1;

/* JADX INFO: loaded from: classes10.dex */
public final /* synthetic */ class s implements e23.p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f134223a = 0;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ t f134224b;

    @Override // e23.p
    public final Object invoke(Object obj, Object obj2) {
        int i14 = this.f134223a;
        t tVar = this.f134224b;
        p3.m mVar = (p3.m) obj;
        Integer num = (Integer) obj2;
        switch (i14) {
            case 0:
                int iIntValue = num.intValue();
                t.a aVar = t.f134225b;
                if (mVar.n(iIntValue & 1, (iIntValue & 3) != 2)) {
                    x1 x1Var = p3.n.f135158a;
                    tVar.u6(mVar, 0);
                } else {
                    mVar.e();
                }
                break;
            default:
                num.getClass();
                t.a aVar2 = t.f134225b;
                tVar.u6(mVar, p0.t(1));
                break;
        }
        return Unit.INSTANCE;
    }
}
