package dv;

import e23.p;
import p005kotlin.Unit;
import p3.x1;

/* JADX INFO: loaded from: classes7.dex */
public final /* synthetic */ class h implements p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f61327a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ com.garmin.android.apps.connectmobile.bic.a f61328b;

    public /* synthetic */ h(com.garmin.android.apps.connectmobile.bic.a aVar, int i14) {
        this.f61327a = i14;
        this.f61328b = aVar;
    }

    @Override // e23.p
    public final Object invoke(Object obj, Object obj2) {
        int i14 = this.f61327a;
        com.garmin.android.apps.connectmobile.bic.a aVar = this.f61328b;
        p3.m mVar = (p3.m) obj;
        int iIntValue = ((Integer) obj2).intValue();
        switch (i14) {
            case 0:
                int i15 = com.garmin.android.apps.connectmobile.bic.a.f30723c;
                if (mVar.n(iIntValue & 1, (iIntValue & 3) != 2)) {
                    x1 x1Var = p3.n.f135158a;
                    aVar.ca(aVar.f30725b.getFloatValue(), mVar, 0);
                } else {
                    mVar.e();
                }
                break;
            default:
                int i16 = com.garmin.android.apps.connectmobile.bic.a.f30723c;
                if (mVar.n(iIntValue & 1, (iIntValue & 3) != 2)) {
                    x1 x1Var2 = p3.n.f135158a;
                    aVar.ca(aVar.f30725b.getFloatValue(), mVar, 0);
                } else {
                    mVar.e();
                }
                break;
        }
        return Unit.INSTANCE;
    }
}
