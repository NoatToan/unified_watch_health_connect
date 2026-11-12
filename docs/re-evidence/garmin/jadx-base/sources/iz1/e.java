package iz1;

import e23.p;
import p005kotlin.Unit;
import p3.m;
import p3.n;
import p3.p0;
import p3.x1;

/* JADX INFO: loaded from: classes10.dex */
public final /* synthetic */ class e implements p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f95868a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ com.garmin.android.apps.connectmobile.traininginitiative.ui.priority.b f95869b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ jz1.b f95870c;

    public /* synthetic */ e(com.garmin.android.apps.connectmobile.traininginitiative.ui.priority.b bVar, jz1.b bVar2, int i14) {
        this.f95868a = 0;
        this.f95869b = bVar;
        this.f95870c = bVar2;
    }

    @Override // e23.p
    public final Object invoke(Object obj, Object obj2) {
        int i14 = this.f95868a;
        int i15 = 2;
        byte b14 = 0;
        jz1.b bVar = this.f95870c;
        com.garmin.android.apps.connectmobile.traininginitiative.ui.priority.b bVar2 = this.f95869b;
        switch (i14) {
            case 0:
                ((Integer) obj2).getClass();
                com.garmin.android.apps.connectmobile.traininginitiative.ui.priority.b.a aVar = com.garmin.android.apps.connectmobile.traininginitiative.ui.priority.b.f46192e;
                bVar2.u6(bVar, (m) obj, p0.t(1));
                break;
            case 1:
                m mVar = (m) obj;
                int iIntValue = ((Integer) obj2).intValue();
                com.garmin.android.apps.connectmobile.traininginitiative.ui.priority.b.a aVar2 = com.garmin.android.apps.connectmobile.traininginitiative.ui.priority.b.f46192e;
                if (mVar.n(iIntValue & 1, (iIntValue & 3) != 2)) {
                    x1 x1Var = n.f135158a;
                    z02.b.a(false, null, null, null, false, z3.f.c(279777626, new e(bVar2, bVar, i15, b14), mVar), mVar, 196608, 31);
                } else {
                    mVar.e();
                }
                break;
            default:
                m mVar2 = (m) obj;
                int iIntValue2 = ((Integer) obj2).intValue();
                com.garmin.android.apps.connectmobile.traininginitiative.ui.priority.b.a aVar3 = com.garmin.android.apps.connectmobile.traininginitiative.ui.priority.b.f46192e;
                if (mVar2.n(iIntValue2 & 1, (iIntValue2 & 3) != 2)) {
                    x1 x1Var2 = n.f135158a;
                    bVar2.u6(bVar, mVar2, 0);
                } else {
                    mVar2.e();
                }
                break;
        }
        return Unit.INSTANCE;
    }

    public /* synthetic */ e(com.garmin.android.apps.connectmobile.traininginitiative.ui.priority.b bVar, jz1.b bVar2, int i14, byte b14) {
        this.f95868a = i14;
        this.f95869b = bVar;
        this.f95870c = bVar2;
    }
}
