package ng1;

import android.content.Intent;
import android.view.View;
import com.garmin.android.apps.connectmobile.audioprompts.ui.AudioPromptsSettingsActivity;
import com.garmin.android.apps.connectmobile.settings.devices.DeviceSettings;
import com.garmin.android.apps.connectmobile.settings.devices.wifi.GCMWiFiNetworksActivity;

/* JADX INFO: loaded from: classes10.dex */
public final /* synthetic */ class x implements View.OnClickListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f126021a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ DeviceSettings f126022b;

    public /* synthetic */ x(DeviceSettings deviceSettings, int i14) {
        this.f126021a = i14;
        this.f126022b = deviceSettings;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view2) {
        switch (this.f126021a) {
            case 0:
                DeviceSettings deviceSettings = this.f126022b;
                GCMWiFiNetworksActivity.f43245f.g(deviceSettings, deviceSettings.f41957m, deviceSettings.f41958n, deviceSettings.f125981g, deviceSettings.f125983i);
                break;
            default:
                int i14 = DeviceSettings.f41956z;
                DeviceSettings deviceSettings2 = this.f126022b;
                Intent intent = new Intent(deviceSettings2, (Class<?>) AudioPromptsSettingsActivity.class);
                intent.putExtra("GCM_deviceUnitID", deviceSettings2.f41957m);
                intent.putExtra("GCM_deviceProductNbr", deviceSettings2.f41958n);
                deviceSettings2.startActivity(intent);
                break;
        }
    }
}
