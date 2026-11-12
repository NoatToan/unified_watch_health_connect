package kd0;

import android.content.Context;
import android.content.Intent;
import com.garmin.android.apps.connectmobile.GarminConnectMobileApp;
import com.garmin.android.apps.connectmobile.dashboard.presentation.DashboardActivity;
import com.garmin.android.apps.connectmobile.settings.GCMSettingManager;
import com.garmin.device.datatypes.DeviceProfile;
import org.koin.java.KoinJavaComponent;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lkd0/v2;", "Lhn2/a;", "<init>", "()V", "app_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class v2 implements hn2.a {
    @Override // hn2.a
    public final boolean a(long j8) {
        return hk0.p.k(j8);
    }

    @Override // hn2.a
    public final DeviceProfile b(long j8) {
        return hk0.p.b(j8);
    }

    @Override // hn2.a
    public final Context c() {
        GarminConnectMobileApp.f28685g.getClass();
        return GarminConnectMobileApp.a.a();
    }

    @Override // hn2.a
    public final com.garmin.android.apps.connectmobile.l d() {
        com.garmin.android.apps.connectmobile.l lVarG = com.garmin.android.apps.connectmobile.l.g();
        lVarG.getClass();
        return lVarG;
    }

    @Override // hn2.a
    public final boolean f(String str) {
        return hk0.p.l(str);
    }

    @Override // hn2.a
    public final boolean g() {
        GarminConnectMobileApp.f28685g.getClass();
        return GarminConnectMobileApp.a.b().f28691c;
    }

    @Override // hn2.a
    public final gg1.v0 h() {
        gg1.v0 v0VarK = GCMSettingManager.k();
        v0VarK.getClass();
        return v0VarK;
    }

    @Override // hn2.a
    public final rl2.c i(String str) {
        return (rl2.c) hk0.p.f().getCapability(str, rl2.c.class);
    }

    @Override // hn2.a
    public final void j(hn2.c cVar) {
        com.garmin.android.apps.connectmobile.navigation.b.f39357a.getClass();
        Intent intent = new Intent(cVar, (Class<?>) DashboardActivity.class);
        intent.addFlags(268468224);
        cVar.startActivity(intent);
    }

    @Override // hn2.a
    public final void k(long j8) {
        ((y92.a) KoinJavaComponent.get$default(y92.a.class, null, null, 6, null)).c(j8, y92.e.GARMIN_PAY);
    }

    @Override // hn2.a
    public final String l() {
        return GCMSettingManager.k().k();
    }

    @Override // hn2.a
    public final void m(long j8) {
        ((b31.f) KoinJavaComponent.get$default(b31.f.class, null, null, 6, null)).a(j8, e31.a.CREATED_GARMIN_PAY_WALLET);
    }

    @Override // hn2.a
    public final boolean n() {
        GarminConnectMobileApp.f28685g.getClass();
        return !GarminConnectMobileApp.a.b().f28689a;
    }
}
