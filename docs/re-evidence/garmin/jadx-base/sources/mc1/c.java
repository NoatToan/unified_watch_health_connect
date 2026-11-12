package mc1;

import e23.p;
import p005kotlin.Unit;
import p3.m;
import p3.n;
import p3.p0;
import p3.x1;

/* JADX INFO: loaded from: classes9.dex */
public final /* synthetic */ class c implements p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f117773a = 0;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ dc1.a f117774b;

    @Override // e23.p
    public final Object invoke(Object obj, Object obj2) {
        int i14 = this.f117773a;
        dc1.a aVar = this.f117774b;
        m mVar = (m) obj;
        Integer num = (Integer) obj2;
        switch (i14) {
            case 0:
                int iIntValue = num.intValue();
                if (mVar.n(iIntValue & 1, (iIntValue & 3) != 2)) {
                    x1 x1Var = n.f135158a;
                    k.a(aVar, mVar, 0);
                } else {
                    mVar.e();
                }
                break;
            default:
                num.getClass();
                k.a(aVar, mVar, p0.t(1));
                break;
        }
        return Unit.INSTANCE;
    }
}
