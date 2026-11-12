package com.garmin.android.apps.connectmobile.connectiq;

import android.os.Handler;
import android.os.Looper;
import com.garmin.proto.generated.GDIConnectIQInstalledApps;
import com.garmin.proto.generated.GDISmartProto;
import java.util.UUID;

/* JADX INFO: loaded from: classes7.dex */
public class h0 implements wm2.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ b0.h f31878a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ UUID f31879b;

    public h0(b0 b0Var, b0.h hVar, UUID uuid) {
        this.f31878a = hVar;
        this.f31879b = uuid;
    }

    @Override // wm2.b
    public final void onResponseFailed(int i14) {
        b0.h hVar = this.f31878a;
        if (hVar != null) {
            new Handler(Looper.getMainLooper()).post(new g0(hVar, this.f31879b, 1));
        }
    }

    @Override // wm2.b
    public final void onResponseReceived(int i14, GDISmartProto.Smart smart) {
        GDIConnectIQInstalledApps.ConnectIQInstalledAppsService connectIQInstalledAppsServiceC;
        b0.h hVar = this.f31878a;
        if (hVar == null || (connectIQInstalledAppsServiceC = b0.c(smart)) == null || !connectIQInstalledAppsServiceC.hasLaunchAppResponse()) {
            return;
        }
        GDIConnectIQInstalledApps.LaunchAppResponse launchAppResponse = connectIQInstalledAppsServiceC.getLaunchAppResponse();
        GDIConnectIQInstalledApps.LaunchAppResponse.Status status = launchAppResponse.getStatus();
        GDIConnectIQInstalledApps.LaunchAppResponse.Status status2 = GDIConnectIQInstalledApps.LaunchAppResponse.Status.LAUNCH_STATUS_SUCCESS;
        UUID uuid = this.f31879b;
        if (status == status2) {
            new Handler(Looper.getMainLooper()).post(new g0(hVar, uuid, 0));
        } else {
            new Handler(Looper.getMainLooper()).post(new cd0.f(hVar, uuid, launchAppResponse.getStatus().name()));
        }
    }
}
