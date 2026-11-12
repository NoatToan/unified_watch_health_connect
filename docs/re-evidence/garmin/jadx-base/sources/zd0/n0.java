package zd0;

import com.garmin.android.apps.connectmobile.domain.watchers.DashboardEssentialsConfigWatcher;
import com.garmin.android.apps.connectmobile.domain.watchers.PrimaryDevicePromoWatcher;
import com.garmin.android.apps.connectmobile.domain.watchers.UserFocusPromoWatcher;
import org.koin.java.KoinJavaComponent;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lzd0/n0;", "", "<init>", "()V", "gcm-promotions_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class n0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final n0 f204083a = new n0();

    private n0() {
    }

    public static void a(q0 q0Var) {
        q0Var.getClass();
        q0Var.t(new ie0.d());
        q0Var.t(new PrimaryDevicePromoWatcher());
        q0Var.t(new UserFocusPromoWatcher());
        q0Var.t(new ie0.b((j1) KoinJavaComponent.get$default(j1.class, null, null, 6, null)));
        q0Var.t(new ie0.a((uy0.j) KoinJavaComponent.get$default(uy0.j.class, null, null, 6, null)));
        q0Var.t((z70.w) KoinJavaComponent.get$default(fe0.b.class, null, null, 6, null));
        q0Var.t(new ie0.c());
        q0Var.t((z70.w) KoinJavaComponent.get$default(DashboardEssentialsConfigWatcher.class, null, null, 6, null));
    }
}
