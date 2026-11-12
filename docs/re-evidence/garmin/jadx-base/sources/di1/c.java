package di1;

import com.garmin.android.apps.connectmobile.a2;
import com.garmin.android.apps.connectmobile.i2;
import com.garmin.android.apps.connectmobile.settings.GCMSettingManager;
import com.garmin.android.apps.connectmobile.settings.devices.wifi.DisplayWiFiNetworksActivity;
import java.util.ArrayList;
import java.util.Iterator;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\n\u0018\u00002\u0018\u0012\u0014\u0012\u0012\u0012\u0004\u0012\u00020\u00030\u0002j\b\u0012\u0004\u0012\u00020\u0003`\u00040\u0001¨\u0006\u0005"}, d2 = {"Ldi1/c;", "Lcom/garmin/android/library/backgroundtaskmanagement/b$b;", "Ljava/util/ArrayList;", "Lcom/garmin/android/apps/connectmobile/settings/devices/wifi/e;", "Lkotlin/collections/ArrayList;", "app_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class c implements com.garmin.android.library.backgroundtaskmanagement.b.InterfaceC0995b<ArrayList<com.garmin.android.apps.connectmobile.settings.devices.wifi.e>> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ DisplayWiFiNetworksActivity f59739a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ r f59740b;

    public c(DisplayWiFiNetworksActivity displayWiFiNetworksActivity, r rVar) {
        this.f59739a = displayWiFiNetworksActivity;
        this.f59740b = rVar;
    }

    @Override // com.garmin.android.library.backgroundtaskmanagement.b.InterfaceC0995b
    public final void onComplete(long j8, com.garmin.android.library.backgroundtaskmanagement.b.c cVar) {
        cVar.getClass();
        if (cVar != com.garmin.android.library.backgroundtaskmanagement.b.c.SUCCESS) {
            DisplayWiFiNetworksActivity displayWiFiNetworksActivity = this.f59739a;
            GCMSettingManager.T(displayWiFiNetworksActivity.f43231a, false);
            if (displayWiFiNetworksActivity.isFinishing()) {
                return;
            }
            displayWiFiNetworksActivity.runOnUiThread(new df.d(2, displayWiFiNetworksActivity, this.f59740b));
        }
    }

    @Override // com.garmin.android.library.backgroundtaskmanagement.b.InterfaceC0995b
    public final void onResults(long j8, com.garmin.android.library.backgroundtaskmanagement.b.e eVar, ArrayList<com.garmin.android.apps.connectmobile.settings.devices.wifi.e> arrayList) {
        boolean z14;
        ArrayList<com.garmin.android.apps.connectmobile.settings.devices.wifi.e> arrayList2 = arrayList;
        eVar.getClass();
        arrayList2.getClass();
        i2.a aVar = i2.f36769a;
        aVar.getClass();
        i2.a.b(a2.SETTINGS, "DisplayWiFiNetworksActivity", "verifyWiFiNetwork.onResults: verifiedNetworks=" + arrayList2);
        Iterator<com.garmin.android.apps.connectmobile.settings.devices.wifi.e> it = arrayList2.iterator();
        it.getClass();
        loop0: while (true) {
            z14 = false;
            while (true) {
                if (!it.hasNext()) {
                    break loop0;
                }
                com.garmin.android.apps.connectmobile.settings.devices.wifi.e next = it.next();
                next.getClass();
                com.garmin.android.apps.connectmobile.settings.devices.wifi.e eVar2 = next;
                if (z14 || eVar2.b()) {
                    z14 = true;
                }
            }
        }
        DisplayWiFiNetworksActivity displayWiFiNetworksActivity = this.f59739a;
        GCMSettingManager.T(displayWiFiNetworksActivity.f43231a, z14);
        if (displayWiFiNetworksActivity.isFinishing()) {
            return;
        }
        displayWiFiNetworksActivity.runOnUiThread(new bd0.c(displayWiFiNetworksActivity, z14, this.f59740b, arrayList2));
    }
}
