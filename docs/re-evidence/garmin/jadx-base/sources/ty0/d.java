package ty0;

import android.os.Bundle;
import com.garmin.android.apps.connectmobile.dashboard.presentation.DashboardRoute;
import lc.q0;
import p005kotlin.Metadata;
import r1.q2;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\n\u0018\u00002\n\u0012\u0006\u0012\u0004\u0018\u00018\u00000\u0001¨\u0006\u0002"}, d2 = {"Lty0/d;", "Llc/q0;", "gcm-common-ui_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class d extends q0<DashboardRoute> {

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final /* synthetic */ n63.b f166947s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(n63.b bVar) {
        super(true);
        this.f166947s = bVar;
    }

    /* JADX WARN: Type inference failed for: r2v3, types: [com.garmin.android.apps.connectmobile.dashboard.presentation.DashboardRoute, java.lang.Object] */
    @Override // lc.q0
    public final DashboardRoute a(Bundle bundle, String str) {
        String strI = q2.i(str, str, bundle);
        if (strI == null) {
            return null;
        }
        n63.b bVar = this.f166947s;
        bVar.getClass();
        return bVar.c(DashboardRoute.INSTANCE.serializer(), strI);
    }

    /* JADX WARN: Type inference failed for: r3v1, types: [com.garmin.android.apps.connectmobile.dashboard.presentation.DashboardRoute, java.lang.Object] */
    @Override // lc.q0
    /* JADX INFO: renamed from: d */
    public final DashboardRoute h(String str) {
        str.getClass();
        n63.b bVar = this.f166947s;
        bVar.getClass();
        return bVar.c(DashboardRoute.INSTANCE.serializer(), str);
    }

    @Override // lc.q0
    public final void e(Bundle bundle, String str, DashboardRoute dashboardRoute) {
        str.getClass();
        n63.b bVar = this.f166947s;
        bVar.getClass();
        bundle.putString(str, bVar.b(j63.a.d(DashboardRoute.INSTANCE.serializer()), dashboardRoute));
    }

    @Override // lc.q0
    public final String f(DashboardRoute dashboardRoute) {
        n63.b bVar = this.f166947s;
        bVar.getClass();
        return q2.j(bVar, j63.a.d(DashboardRoute.INSTANCE.serializer()), dashboardRoute);
    }
}
