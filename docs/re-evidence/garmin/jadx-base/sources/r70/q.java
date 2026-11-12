package r70;

import com.garmin.android.apps.connectmobile.dashboard.presentation.DashboardRoute;
import i3.yd;

/* JADX INFO: loaded from: classes8.dex */
public interface q {
    static /* synthetic */ void d(q qVar, String str, yd ydVar, int i14) {
        if ((i14 & 8) != 0) {
            ydVar = yd.Short;
        }
        qVar.b(str, ydVar, new qv1.l(27));
    }

    default void a(DashboardRoute dashboardRoute) {
        dashboardRoute.getClass();
    }

    default void b(String str, yd ydVar, qv1.l lVar) {
        str.getClass();
        ydVar.getClass();
    }

    default void c(Object obj, String str) {
    }
}
