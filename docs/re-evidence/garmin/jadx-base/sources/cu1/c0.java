package cu1;

import com.garmin.android.apps.connectmobile.q1;
import com.garmin.android.apps.connectmobile.training.atp.dashboard.TrainingPlanDashboardActivity;

/* JADX INFO: loaded from: classes10.dex */
public final /* synthetic */ class c0 implements q1.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f55658a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ TrainingPlanDashboardActivity f55659b;

    public /* synthetic */ c0(TrainingPlanDashboardActivity trainingPlanDashboardActivity, int i14) {
        this.f55658a = i14;
        this.f55659b = trainingPlanDashboardActivity;
    }

    @Override // com.garmin.android.apps.connectmobile.q1.a
    public final void g(boolean z14) {
        switch (this.f55658a) {
            case 0:
                zt1.h hVar = this.f55659b.f45386g;
                if (hVar != null) {
                    hVar.t(z14);
                    return;
                } else {
                    p005kotlin.jvm.internal.s.m("presenter");
                    throw null;
                }
            case 1:
                zt1.h hVar2 = this.f55659b.f45386g;
                if (hVar2 == null) {
                    p005kotlin.jvm.internal.s.m("presenter");
                    throw null;
                }
                if (z14) {
                    Integer num = hVar2.f207000t;
                    if (num != null) {
                        hVar2.a(num.intValue());
                        fy1.i.a.t(fy1.i.f73924a);
                        return;
                    } else {
                        hVar2.f206997q.B8(com.garmin.android.library.backgroundtaskmanagement.b.c.NO_DATA);
                        hVar2.p();
                        return;
                    }
                }
                return;
            default:
                zt1.h hVar3 = this.f55659b.f45386g;
                if (hVar3 == null) {
                    p005kotlin.jvm.internal.s.m("presenter");
                    throw null;
                }
                if (z14) {
                    xw1.m mVar = hVar3.f206999s;
                    if (mVar != null) {
                        hVar3.c(mVar);
                        fy1.i.a.t(fy1.i.f73924a);
                        return;
                    } else {
                        hVar3.f206997q.B8(com.garmin.android.library.backgroundtaskmanagement.b.c.NO_DATA);
                        hVar3.p();
                        return;
                    }
                }
                return;
        }
    }
}
