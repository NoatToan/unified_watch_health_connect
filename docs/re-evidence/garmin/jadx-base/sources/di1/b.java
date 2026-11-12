package di1;

import com.garmin.android.apps.connectmobile.settings.devices.wifi.DisplayWiFiNetworksActivity;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\n\u0018\u00002\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u0001¨\u0006\u0003"}, d2 = {"Ldi1/b;", "Lcom/garmin/android/library/backgroundtaskmanagement/b$b;", "", "app_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class b implements com.garmin.android.library.backgroundtaskmanagement.b.InterfaceC0995b<Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ DisplayWiFiNetworksActivity f59736a;

    public b(DisplayWiFiNetworksActivity displayWiFiNetworksActivity) {
        this.f59736a = displayWiFiNetworksActivity;
    }

    @Override // com.garmin.android.library.backgroundtaskmanagement.b.InterfaceC0995b
    public final void onComplete(long j8, com.garmin.android.library.backgroundtaskmanagement.b.c cVar) {
        cVar.getClass();
    }

    @Override // com.garmin.android.library.backgroundtaskmanagement.b.InterfaceC0995b
    public final void onResults(long j8, com.garmin.android.library.backgroundtaskmanagement.b.e eVar, Object obj) {
        eVar.getClass();
        obj.getClass();
        DisplayWiFiNetworksActivity.a aVar = DisplayWiFiNetworksActivity.f43230m;
        DisplayWiFiNetworksActivity displayWiFiNetworksActivity = this.f59736a;
        displayWiFiNetworksActivity.ga();
        if (displayWiFiNetworksActivity.isFinishing()) {
            return;
        }
        displayWiFiNetworksActivity.runOnUiThread(new df.d(1, obj, displayWiFiNetworksActivity));
    }
}
