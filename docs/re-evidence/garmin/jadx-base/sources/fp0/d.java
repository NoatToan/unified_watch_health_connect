package fp0;

import com.garmin.android.apps.connectmobile.dashboard.presentation.DashboardRoute;
import p005kotlin.Unit;
import r70.q;

/* JADX INFO: loaded from: classes8.dex */
public final /* synthetic */ class d implements e23.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f73152a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ q f73153b;

    public /* synthetic */ d(q qVar, int i14) {
        this.f73152a = i14;
        this.f73153b = qVar;
    }

    @Override // e23.a
    public final Object invoke() {
        switch (this.f73152a) {
            case 0:
                this.f73153b.a(new DashboardRoute.HomeSettings(false, 1, (p005kotlin.jvm.internal.j) null));
                break;
            case 1:
                this.f73153b.a(new DashboardRoute.HomeSettings(false, 1, (p005kotlin.jvm.internal.j) null));
                break;
            case 2:
                this.f73153b.a(new DashboardRoute.HomeSettings(false, 1, (p005kotlin.jvm.internal.j) null));
                break;
            default:
                this.f73153b.a(DashboardRoute.SecondaryStats.INSTANCE);
                break;
        }
        return Unit.INSTANCE;
    }
}
