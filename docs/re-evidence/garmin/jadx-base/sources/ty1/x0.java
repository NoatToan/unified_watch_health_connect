package ty1;

import com.garmin.android.apps.connectmobile.traininginitiative.viewmodels.AddTIEventViewModel;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes10.dex */
public final /* synthetic */ class x0 implements e23.p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f167263a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ com.garmin.android.apps.connectmobile.traininginitiative.ui.r f167264b;

    public /* synthetic */ x0(com.garmin.android.apps.connectmobile.traininginitiative.ui.r rVar, int i14) {
        this.f167263a = i14;
        this.f167264b = rVar;
    }

    @Override // e23.p
    public final Object invoke(Object obj, Object obj2) {
        int i14 = this.f167263a;
        com.garmin.android.apps.connectmobile.traininginitiative.ui.r rVar = this.f167264b;
        int i15 = 1;
        switch (i14) {
            case 0:
                p3.m mVar = (p3.m) obj;
                int iIntValue = ((Integer) obj2).intValue();
                com.garmin.android.apps.connectmobile.traininginitiative.ui.r.a aVar = com.garmin.android.apps.connectmobile.traininginitiative.ui.r.f46219c;
                if (mVar.n(iIntValue & 1, (iIntValue & 3) != 2)) {
                    p3.x1 x1Var = p3.n.f135158a;
                    z02.b.a(false, null, null, null, false, z3.f.c(2024473494, new x0(rVar, i15), mVar), mVar, 196608, 31);
                } else {
                    mVar.e();
                }
                break;
            default:
                p3.m mVar2 = (p3.m) obj;
                int iIntValue2 = ((Integer) obj2).intValue();
                com.garmin.android.apps.connectmobile.traininginitiative.ui.r.a aVar2 = com.garmin.android.apps.connectmobile.traininginitiative.ui.r.f46219c;
                if (mVar2.n(iIntValue2 & 1, (iIntValue2 & 3) != 2)) {
                    p3.x1 x1Var2 = p3.n.f135158a;
                    rVar.u6((AddTIEventViewModel) rVar.f46220a.getValue(), mVar2, 0);
                } else {
                    mVar2.e();
                }
                break;
        }
        return Unit.INSTANCE;
    }
}
