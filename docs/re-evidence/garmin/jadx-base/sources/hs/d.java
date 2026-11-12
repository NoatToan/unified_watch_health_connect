package hs;

import e23.p;
import nr.n;
import p005kotlin.Unit;
import p3.m;
import p3.p0;
import p3.x1;

/* JADX INFO: loaded from: classes7.dex */
public final /* synthetic */ class d implements p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f85317a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ n f85318b;

    public /* synthetic */ d(n nVar, int i14) {
        this.f85317a = 2;
        this.f85318b = nVar;
    }

    @Override // e23.p
    public final Object invoke(Object obj, Object obj2) {
        int i14 = this.f85317a;
        n nVar = this.f85318b;
        m mVar = (m) obj;
        Integer num = (Integer) obj2;
        switch (i14) {
            case 0:
                int iIntValue = num.intValue();
                if (mVar.n(iIntValue & 1, (iIntValue & 3) != 2)) {
                    x1 x1Var = p3.n.f135158a;
                    e.c(nVar.f127264b, mVar, 0);
                } else {
                    mVar.e();
                }
                break;
            case 1:
                int iIntValue2 = num.intValue();
                if (mVar.n(iIntValue2 & 1, (iIntValue2 & 3) != 2)) {
                    x1 x1Var2 = p3.n.f135158a;
                    e.c(nVar.f127264b, mVar, 0);
                } else {
                    mVar.e();
                }
                break;
            default:
                num.getClass();
                e.b(nVar, mVar, p0.t(1));
                break;
        }
        return Unit.INSTANCE;
    }

    public /* synthetic */ d(n nVar, int i14, byte b14) {
        this.f85317a = i14;
        this.f85318b = nVar;
    }
}
