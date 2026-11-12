package ij1;

import com.garmin.android.apps.connectmobile.R;
import p005kotlin.Unit;
import p3.x1;

/* JADX INFO: loaded from: classes10.dex */
public final /* synthetic */ class q implements e23.p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f93889a = 0;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ r f93890b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ h82.r f93891c;

    public /* synthetic */ q(h82.r rVar, r rVar2) {
        this.f93891c = rVar;
        this.f93890b = rVar2;
    }

    @Override // e23.p
    public final Object invoke(Object obj, Object obj2) {
        int i14 = this.f93889a;
        r rVar = this.f93890b;
        switch (i14) {
            case 0:
                p3.m mVar = (p3.m) obj;
                int iIntValue = ((Integer) obj2).intValue();
                int i15 = r.f93892k;
                if (mVar.n(iIntValue & 1, (iIntValue & 3) != 2)) {
                    x1 x1Var = p3.n.f135158a;
                    h82.r rVar2 = this.f93891c;
                    rVar2.t(R.string.setting_a_device_priority, mVar, 0);
                    rVar2.o(rVar.f93894g == ej1.b.WEARABLE_DEVICE ? R.string.primary_wearable_multiple_devices : R.string.primary_training_device_help_description, 0, 2, null, mVar);
                    if (rVar.f93895h) {
                        mVar.C(1594650737);
                        rVar2.o(R.string.primary_wearable_help_recommendation, 0, 2, null, mVar);
                        mVar.f();
                    } else {
                        mVar.C(1594742993);
                        mVar.f();
                    }
                } else {
                    mVar.e();
                }
                break;
            default:
                p3.m mVar2 = (p3.m) obj;
                int iIntValue2 = ((Integer) obj2).intValue();
                int i16 = r.f93892k;
                if (mVar2.n(iIntValue2 & 1, (iIntValue2 & 3) != 2)) {
                    x1 x1Var2 = p3.n.f135158a;
                    ej1.b bVar = rVar.f93894g;
                    ej1.b bVar2 = ej1.b.WEARABLE_DEVICE;
                    h82.r rVar3 = this.f93891c;
                    if (bVar == bVar2 && rVar.f93896i) {
                        mVar2.C(-1962665191);
                        rVar3.t(R.string.partially_compatible_devices, mVar2, 0);
                        rVar3.o(R.string.partially_compatible_device_description, 0, 2, null, mVar2);
                        mVar2.f();
                    } else if (bVar == ej1.b.TRAINING_DEVICE && rVar.f93897j) {
                        mVar2.C(-1962409658);
                        rVar3.t(R.string.incompatible_devices, mVar2, 0);
                        rVar3.o(R.string.primary_training_device_disclaimer, 0, 2, null, mVar2);
                        mVar2.f();
                    } else {
                        mVar2.C(-1962253976);
                        mVar2.f();
                    }
                } else {
                    mVar2.e();
                }
                break;
        }
        return Unit.INSTANCE;
    }

    public /* synthetic */ q(r rVar, h82.r rVar2) {
        this.f93890b = rVar;
        this.f93891c = rVar2;
    }
}
