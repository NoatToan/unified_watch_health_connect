package hx0;

import p005kotlin.Unit;
import p3.x1;

/* JADX INFO: loaded from: classes9.dex */
public final /* synthetic */ class n implements e23.p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f86102a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ dx0.e f86103b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ ww0.l f86104c;

    public /* synthetic */ n(dx0.e eVar, ww0.l lVar, int i14) {
        this.f86102a = i14;
        this.f86103b = eVar;
        this.f86104c = lVar;
    }

    @Override // e23.p
    public final Object invoke(Object obj, Object obj2) {
        int i14 = this.f86102a;
        ww0.l lVar = this.f86104c;
        dx0.e eVar = this.f86103b;
        int i15 = 1;
        switch (i14) {
            case 0:
                p3.m mVar = (p3.m) obj;
                int iIntValue = ((Integer) obj2).intValue();
                com.garmin.android.apps.connectmobile.menstrualcycle.presentation.details.d.a aVar = com.garmin.android.apps.connectmobile.menstrualcycle.presentation.details.d.Q0;
                if (mVar.n(iIntValue & 1, (iIntValue & 3) != 2)) {
                    x1 x1Var = p3.n.f135158a;
                    z02.b.a(false, null, null, null, false, z3.f.c(1737825144, new n(eVar, lVar, i15), mVar), mVar, 196608, 31);
                } else {
                    mVar.e();
                }
                break;
            default:
                p3.m mVar2 = (p3.m) obj;
                int iIntValue2 = ((Integer) obj2).intValue();
                com.garmin.android.apps.connectmobile.menstrualcycle.presentation.details.d.a aVar2 = com.garmin.android.apps.connectmobile.menstrualcycle.presentation.details.d.Q0;
                if (mVar2.n(iIntValue2 & 1, (iIntValue2 & 3) != 2)) {
                    x1 x1Var2 = p3.n.f135158a;
                    dx0.d.b(eVar, lVar, mVar2, ww0.l.f187596y << 3);
                } else {
                    mVar2.e();
                }
                break;
        }
        return Unit.INSTANCE;
    }
}
