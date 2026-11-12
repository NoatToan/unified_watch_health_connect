package nx0;

import com.garmin.android.apps.connectmobile.menstrualcycle.presentation.v2.MenstrualCycleTrackingActivity;
import e23.p;
import p005kotlin.Unit;
import p3.m;
import p3.n;
import p3.x1;
import z02.b;
import z3.f;

/* JADX INFO: loaded from: classes9.dex */
public final /* synthetic */ class a implements p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f128189a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ MenstrualCycleTrackingActivity f128190b;

    public /* synthetic */ a(MenstrualCycleTrackingActivity menstrualCycleTrackingActivity, int i14) {
        this.f128189a = i14;
        this.f128190b = menstrualCycleTrackingActivity;
    }

    @Override // e23.p
    public final Object invoke(Object obj, Object obj2) {
        int i14 = this.f128189a;
        MenstrualCycleTrackingActivity menstrualCycleTrackingActivity = this.f128190b;
        int i15 = 1;
        switch (i14) {
            case 0:
                m mVar = (m) obj;
                int iIntValue = ((Integer) obj2).intValue();
                MenstrualCycleTrackingActivity.a aVar = MenstrualCycleTrackingActivity.f39197e;
                if (mVar.n(iIntValue & 1, (iIntValue & 3) != 2)) {
                    x1 x1Var = n.f135158a;
                    b.a(false, null, null, null, false, f.c(1626446640, new a(menstrualCycleTrackingActivity, i15), mVar), mVar, 196608, 31);
                } else {
                    mVar.e();
                }
                break;
            default:
                m mVar2 = (m) obj;
                int iIntValue2 = ((Integer) obj2).intValue();
                MenstrualCycleTrackingActivity.a aVar2 = MenstrualCycleTrackingActivity.f39197e;
                if (mVar2.n(iIntValue2 & 1, (iIntValue2 & 3) != 2)) {
                    x1 x1Var2 = n.f135158a;
                    px0.b.a(!menstrualCycleTrackingActivity.ha(), mVar2, 0);
                } else {
                    mVar2.e();
                }
                break;
        }
        return Unit.INSTANCE;
    }
}
