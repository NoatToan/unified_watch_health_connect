package r70;

import com.garmin.android.apps.connectmobile.dashboard.presentation.DashboardActivity;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes8.dex */
public final /* synthetic */ class f implements e23.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f151049a = 0;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ com.garmin.android.apps.connectmobile.dashboard.presentation.c f151050b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ DashboardActivity f151051c;

    public /* synthetic */ f(DashboardActivity dashboardActivity, com.garmin.android.apps.connectmobile.dashboard.presentation.c cVar) {
        this.f151051c = dashboardActivity;
        this.f151050b = cVar;
    }

    @Override // e23.a
    public final Object invoke() {
        int i14 = this.f151049a;
        DashboardActivity dashboardActivity = this.f151051c;
        com.garmin.android.apps.connectmobile.dashboard.presentation.c cVar = this.f151050b;
        switch (i14) {
            case 0:
                dashboardActivity.f33451k.b((o31.a) dashboardActivity.f33450j.getValue(), new f(cVar, dashboardActivity));
                break;
            default:
                int i15 = DashboardActivity.f33444q;
                if (((com.garmin.android.apps.connectmobile.dashboard.presentation.c.b) cVar).f33539b) {
                    dashboardActivity.f33451k.c(new e(dashboardActivity, 3));
                }
                break;
        }
        return Unit.INSTANCE;
    }

    public /* synthetic */ f(com.garmin.android.apps.connectmobile.dashboard.presentation.c cVar, DashboardActivity dashboardActivity) {
        this.f151050b = cVar;
        this.f151051c = dashboardActivity;
    }
}
