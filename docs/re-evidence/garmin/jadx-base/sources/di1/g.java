package di1;

import com.garmin.android.apps.connectmobile.settings.devices.wifi.GCMWiFiNetworksActivity;

/* JADX INFO: loaded from: classes10.dex */
public final /* synthetic */ class g implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f59753a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ GCMWiFiNetworksActivity f59754b;

    public /* synthetic */ g(GCMWiFiNetworksActivity gCMWiFiNetworksActivity, int i14) {
        this.f59753a = i14;
        this.f59754b = gCMWiFiNetworksActivity;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i14 = this.f59753a;
        GCMWiFiNetworksActivity gCMWiFiNetworksActivity = this.f59754b;
        switch (i14) {
            case 0:
                GCMWiFiNetworksActivity.a aVar = GCMWiFiNetworksActivity.f43245f;
                gCMWiFiNetworksActivity.ga();
                break;
            default:
                gCMWiFiNetworksActivity.ea();
                break;
        }
    }
}
