package fz1;

import p005kotlin.Unit;
import p3.p0;
import p3.x1;

/* JADX INFO: loaded from: classes10.dex */
public final /* synthetic */ class g implements e23.p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f73991a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ com.garmin.android.apps.connectmobile.traininginitiative.ui.goal.c f73992b;

    public /* synthetic */ g(com.garmin.android.apps.connectmobile.traininginitiative.ui.goal.c cVar, int i14) {
        this.f73991a = 2;
        this.f73992b = cVar;
    }

    @Override // e23.p
    public final Object invoke(Object obj, Object obj2) {
        int i14 = this.f73991a;
        byte b14 = 0;
        com.garmin.android.apps.connectmobile.traininginitiative.ui.goal.c cVar = this.f73992b;
        int i15 = 1;
        switch (i14) {
            case 0:
                p3.m mVar = (p3.m) obj;
                int iIntValue = ((Integer) obj2).intValue();
                com.garmin.android.apps.connectmobile.traininginitiative.ui.goal.c.a aVar = com.garmin.android.apps.connectmobile.traininginitiative.ui.goal.c.f46005c;
                if (mVar.n(iIntValue & 1, (iIntValue & 3) != 2)) {
                    x1 x1Var = p3.n.f135158a;
                    z02.b.a(false, null, null, null, false, z3.f.c(-1911618844, new g(cVar, i15, b14), mVar), mVar, 196608, 31);
                } else {
                    mVar.e();
                }
                break;
            case 1:
                p3.m mVar2 = (p3.m) obj;
                int iIntValue2 = ((Integer) obj2).intValue();
                com.garmin.android.apps.connectmobile.traininginitiative.ui.goal.c.a aVar2 = com.garmin.android.apps.connectmobile.traininginitiative.ui.goal.c.f46005c;
                if (mVar2.n(iIntValue2 & 1, (iIntValue2 & 3) != 2)) {
                    x1 x1Var2 = p3.n.f135158a;
                    cVar.u6(mVar2, 0);
                } else {
                    mVar2.e();
                }
                break;
            default:
                ((Integer) obj2).getClass();
                com.garmin.android.apps.connectmobile.traininginitiative.ui.goal.c.a aVar3 = com.garmin.android.apps.connectmobile.traininginitiative.ui.goal.c.f46005c;
                cVar.u6((p3.m) obj, p0.t(1));
                break;
        }
        return Unit.INSTANCE;
    }

    public /* synthetic */ g(com.garmin.android.apps.connectmobile.traininginitiative.ui.goal.c cVar, int i14, byte b14) {
        this.f73991a = i14;
        this.f73992b = cVar;
    }
}
