package bd0;

import android.os.Bundle;
import android.text.TextUtils;
import android.widget.Button;
import androidx.camera.core.impl.x2;
import b0.g1;
import com.garmin.android.apps.connectmobile.R;
import com.garmin.android.apps.connectmobile.a2;
import com.garmin.android.apps.connectmobile.devices.setup.BLEDeviceSetupActivity;
import com.garmin.android.apps.connectmobile.devices.setup.DeviceSetupProgressListViewFragment;
import com.garmin.android.apps.connectmobile.i2;
import com.garmin.android.apps.connectmobile.settings.devices.wifi.DisplayWiFiNetworksActivity;
import com.google.firebase.crashlytics.internal.common.SessionReportingCoordinator;
import com.google.firebase.crashlytics.internal.metadata.EventMetadata;
import com.google.firebase.crashlytics.internal.model.CrashlyticsReport;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes8.dex */
public final /* synthetic */ class c implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f17542a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ boolean f17543b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f17544c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Object f17545d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ Object f17546e;

    public /* synthetic */ c(BLEDeviceSetupActivity bLEDeviceSetupActivity, y yVar, boolean z14, String str) {
        this.f17542a = 0;
        this.f17544c = bLEDeviceSetupActivity;
        this.f17545d = yVar;
        this.f17543b = z14;
        this.f17546e = str;
    }

    @Override // java.lang.Runnable
    public final void run() {
        a0 a0Var;
        int i14 = this.f17542a;
        boolean z14 = this.f17543b;
        Object obj = this.f17546e;
        Object obj2 = this.f17545d;
        Object obj3 = this.f17544c;
        switch (i14) {
            case 0:
                y yVar = (y) obj2;
                String str = (String) obj;
                int i15 = BLEDeviceSetupActivity.f34387q;
                DeviceSetupProgressListViewFragment deviceSetupProgressListViewFragmentJa = ((BLEDeviceSetupActivity) obj3).ja();
                if (deviceSetupProgressListViewFragmentJa != null && (a0Var = deviceSetupProgressListViewFragmentJa.f34439j) != null) {
                    for (int i16 = 0; i16 < a0Var.getCount(); i16++) {
                        z zVar = (z) a0Var.getItem(i16);
                        if (yVar == zVar.f17662b) {
                            zVar.f17663c = str;
                            zVar.a(z14);
                            a0Var.notifyDataSetChanged();
                        }
                        break;
                    }
                    break;
                }
                break;
            case 1:
                ((SessionReportingCoordinator) obj3).lambda$persistEvent$0((CrashlyticsReport.Session.Event) obj2, (EventMetadata) obj, z14);
                break;
            case 2:
                DisplayWiFiNetworksActivity displayWiFiNetworksActivity = (DisplayWiFiNetworksActivity) obj3;
                di1.r rVar = (di1.r) obj2;
                ArrayList arrayList = (ArrayList) obj;
                if (!displayWiFiNetworksActivity.f43233c) {
                    DisplayWiFiNetworksActivity.ca(displayWiFiNetworksActivity, rVar.f59773a, arrayList);
                } else if (z14) {
                    displayWiFiNetworksActivity.f43234d = true;
                    ArrayList<com.garmin.android.apps.connectmobile.settings.devices.wifi.k> arrayList2 = rVar.f59774b;
                    i2.a aVar = i2.f36769a;
                    a2 a2Var = a2.SETTINGS;
                    aVar.getClass();
                    i2.a.b(a2Var, "DisplayWiFiNetworksActivity", "placeSkipWiFiNetworksFragment");
                    displayWiFiNetworksActivity.hideProgressOverlay();
                    com.garmin.android.apps.connectmobile.devices.model.l lVar = displayWiFiNetworksActivity.f43232b;
                    String f143520j = lVar != null ? lVar.getF143520j() : null;
                    com.garmin.android.apps.connectmobile.devices.model.l lVar2 = displayWiFiNetworksActivity.f43232b;
                    String deviceImageURL = lVar2 != null ? lVar2.getDeviceImageURL() : null;
                    com.garmin.android.apps.connectmobile.settings.devices.wifi.i.f43306f.getClass();
                    arrayList2.getClass();
                    Bundle bundle = new Bundle();
                    if (!TextUtils.isEmpty(f143520j)) {
                        bundle.putString("GCM_extra_device_image_url", f143520j);
                    }
                    if (!TextUtils.isEmpty(deviceImageURL)) {
                        bundle.putString("GCM_extra_fallback_image_url", deviceImageURL);
                    }
                    if (arrayList2.size() > 0) {
                        bundle.putParcelableArrayList("KEY_CURRENT_STORED_NETWORKS", arrayList2);
                    }
                    com.garmin.android.apps.connectmobile.settings.devices.wifi.i iVar = new com.garmin.android.apps.connectmobile.settings.devices.wifi.i();
                    iVar.setArguments(bundle);
                    androidx.fragment.app.v supportFragmentManager = displayWiFiNetworksActivity.getSupportFragmentManager();
                    supportFragmentManager.getClass();
                    androidx.fragment.app.a aVar2 = new androidx.fragment.app.a(supportFragmentManager);
                    aVar2.l(R.id.wifi_component_container, iVar, "SkipWiFiNetworksFragment");
                    aVar2.d("SkipWiFiNetworksFragment");
                    aVar2.s(true, true);
                    Button button = displayWiFiNetworksActivity.f43235e;
                    button.getClass();
                    button.setEnabled(true);
                    Button button2 = displayWiFiNetworksActivity.f43235e;
                    button2.getClass();
                    button2.setVisibility(displayWiFiNetworksActivity.f43233c ? 0 : 8);
                } else {
                    displayWiFiNetworksActivity.f43234d = false;
                    DisplayWiFiNetworksActivity.ca(displayWiFiNetworksActivity, rVar.f59773a, arrayList);
                }
                break;
            default:
                z0.a0 a0Var2 = (z0.a0) obj3;
                g1 g1Var = (g1) obj2;
                x2 x2Var = (x2) obj;
                g1 g1Var2 = a0Var2.f200540w;
                if (g1Var2 != null && !g1Var2.a()) {
                    a0Var2.f200540w.d();
                }
                a0Var2.f200524g0 = z14;
                a0Var2.f200540w = g1Var;
                a0Var2.f200541x = x2Var;
                a0Var2.h(g1Var, x2Var, true);
                break;
        }
    }

    public /* synthetic */ c(DisplayWiFiNetworksActivity displayWiFiNetworksActivity, boolean z14, di1.r rVar, ArrayList arrayList) {
        this.f17542a = 2;
        this.f17544c = displayWiFiNetworksActivity;
        this.f17543b = z14;
        this.f17545d = rVar;
        this.f17546e = arrayList;
    }

    public /* synthetic */ c(Object obj, Object obj2, Object obj3, boolean z14, int i14) {
        this.f17542a = i14;
        this.f17544c = obj;
        this.f17545d = obj2;
        this.f17546e = obj3;
        this.f17543b = z14;
    }
}
