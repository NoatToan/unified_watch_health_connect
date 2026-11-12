package fz1;

import p005kotlin.Unit;
import p3.p0;
import p3.x1;

/* JADX INFO: loaded from: classes10.dex */
public final /* synthetic */ class c implements e23.p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f73978a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ com.garmin.android.apps.connectmobile.traininginitiative.ui.goal.a f73979b;

    public /* synthetic */ c(com.garmin.android.apps.connectmobile.traininginitiative.ui.goal.a aVar, int i14) {
        this.f73978a = 2;
        this.f73979b = aVar;
    }

    @Override // e23.p
    public final Object invoke(Object obj, Object obj2) {
        int i14 = this.f73978a;
        byte b14 = 0;
        com.garmin.android.apps.connectmobile.traininginitiative.ui.goal.a aVar = this.f73979b;
        int i15 = 1;
        switch (i14) {
            case 0:
                p3.m mVar = (p3.m) obj;
                int iIntValue = ((Integer) obj2).intValue();
                com.garmin.android.apps.connectmobile.traininginitiative.ui.goal.a.C0889a c0889a = com.garmin.android.apps.connectmobile.traininginitiative.ui.goal.a.f45987c;
                if (mVar.n(iIntValue & 1, (iIntValue & 3) != 2)) {
                    x1 x1Var = p3.n.f135158a;
                    z02.b.a(false, null, null, null, false, z3.f.c(728762499, new c(aVar, i15, b14), mVar), mVar, 196608, 31);
                } else {
                    mVar.e();
                }
                break;
            case 1:
                p3.m mVar2 = (p3.m) obj;
                int iIntValue2 = ((Integer) obj2).intValue();
                com.garmin.android.apps.connectmobile.traininginitiative.ui.goal.a.C0889a c0889a2 = com.garmin.android.apps.connectmobile.traininginitiative.ui.goal.a.f45987c;
                if (mVar2.n(iIntValue2 & 1, (iIntValue2 & 3) != 2)) {
                    x1 x1Var2 = p3.n.f135158a;
                    aVar.u6(mVar2, 0);
                } else {
                    mVar2.e();
                }
                break;
            default:
                ((Integer) obj2).getClass();
                com.garmin.android.apps.connectmobile.traininginitiative.ui.goal.a.C0889a c0889a3 = com.garmin.android.apps.connectmobile.traininginitiative.ui.goal.a.f45987c;
                aVar.u6((p3.m) obj, p0.t(1));
                break;
        }
        return Unit.INSTANCE;
    }

    public /* synthetic */ c(com.garmin.android.apps.connectmobile.traininginitiative.ui.goal.a aVar, int i14, byte b14) {
        this.f73978a = i14;
        this.f73979b = aVar;
    }
}
