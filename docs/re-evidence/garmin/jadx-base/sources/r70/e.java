package r70;

import com.garmin.android.apps.connectmobile.dashboard.presentation.DashboardActivity;
import o53.c2;
import o53.f0;
import org.koin.core.parameter.ParametersHolderKt;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes8.dex */
public final /* synthetic */ class e implements e23.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f151047a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ DashboardActivity f151048b;

    public /* synthetic */ e(DashboardActivity dashboardActivity, int i14) {
        this.f151047a = i14;
        this.f151048b = dashboardActivity;
    }

    @Override // e23.a
    public final Object invoke() {
        int i14 = this.f151047a;
        int i15 = 8;
        DashboardActivity dashboardActivity = this.f151048b;
        switch (i14) {
            case 0:
                int i16 = DashboardActivity.f33444q;
                dashboardActivity.onBackPressed();
                return Unit.INSTANCE;
            case 1:
                dashboardActivity.f33451k.b((o31.a) dashboardActivity.f33450j.getValue(), new e(dashboardActivity, 2));
                return Unit.INSTANCE;
            case 2:
                dashboardActivity.f33451k.c(new e(dashboardActivity, 4));
                return Unit.INSTANCE;
            case 3:
                int i17 = DashboardActivity.f33444q;
                dashboardActivity.f33451k.a(new e(dashboardActivity, i15));
                return Unit.INSTANCE;
            case 4:
                int i18 = DashboardActivity.f33444q;
                dashboardActivity.f33451k.a(new e(dashboardActivity, i15));
                return Unit.INSTANCE;
            case 5:
                dashboardActivity.f33451k.c(new e(dashboardActivity, 7));
                return Unit.INSTANCE;
            case 6:
                int i19 = DashboardActivity.f33444q;
                return ParametersHolderKt.parametersOf(dashboardActivity, dashboardActivity);
            case 7:
                int i24 = DashboardActivity.f33444q;
                dashboardActivity.f33451k.a(new e(dashboardActivity, i15));
                return Unit.INSTANCE;
            default:
                c2 c2Var = dashboardActivity.f33455o;
                if (c2Var != null) {
                    c2Var.c(null);
                }
                dashboardActivity.f33455o = ge1.b.T(f0.w(dashboardActivity), null, null, new h(dashboardActivity, null), 3);
                ge1.b.T(f0.w(dashboardActivity), null, null, new k(dashboardActivity, new qy0.a(28), null), 3);
                return Unit.INSTANCE;
        }
    }
}
