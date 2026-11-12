package if2;

import com.garmin.android.apps.connectmobile.dashboard.presentation.DashboardRoute;
import e23.l;
import o70.f;
import p005kotlin.Unit;
import r70.q;
import zd0.i0;

/* JADX INFO: loaded from: classes11.dex */
public final /* synthetic */ class b implements l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f93222a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ q f93223b;

    public /* synthetic */ b(q qVar, int i14) {
        this.f93222a = i14;
        this.f93223b = qVar;
    }

    @Override // e23.l
    public final Object invoke(Object obj) {
        switch (this.f93222a) {
            case 0:
                i0 i0Var = (i0) obj;
                i0Var.getClass();
                this.f93223b.c(i0Var, f.CAMPAIGN.a());
                break;
            default:
                DashboardRoute dashboardRoute = (DashboardRoute) obj;
                dashboardRoute.getClass();
                this.f93223b.a(dashboardRoute);
                break;
        }
        return Unit.INSTANCE;
    }
}
