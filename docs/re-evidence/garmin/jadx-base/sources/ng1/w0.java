package ng1;

import android.content.Intent;
import android.view.View;
import com.garmin.android.apps.connectmobile.devices.model.DeviceSettingsDTO;
import com.garmin.android.apps.connectmobile.settings.devices.ForerunnerDeviceSettings;
import com.garmin.android.apps.connectmobile.settings.devices.TimeDateSystemDeviceSettings;
import com.garmin.android.apps.connectmobile.settings.devices.wifi.GCMWiFiNetworksActivity;

/* JADX INFO: loaded from: classes10.dex */
public final /* synthetic */ class w0 implements View.OnClickListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f126019a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ ForerunnerDeviceSettings f126020b;

    public /* synthetic */ w0(ForerunnerDeviceSettings forerunnerDeviceSettings, int i14) {
        this.f126019a = i14;
        this.f126020b = forerunnerDeviceSettings;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view2) {
        switch (this.f126019a) {
            case 0:
                int i14 = ForerunnerDeviceSettings.F;
                ForerunnerDeviceSettings forerunnerDeviceSettings = this.f126020b;
                String str = forerunnerDeviceSettings.f125978d;
                DeviceSettingsDTO deviceSettingsDTO = forerunnerDeviceSettings.f125985k;
                Intent intent = new Intent(forerunnerDeviceSettings, (Class<?>) TimeDateSystemDeviceSettings.class);
                intent.putExtra("GCM_deviceSettings", deviceSettingsDTO);
                intent.putExtra("GCM_deviceProductNbr", str);
                forerunnerDeviceSettings.startActivityForResult(intent, 11);
                break;
            default:
                int i15 = ForerunnerDeviceSettings.F;
                ForerunnerDeviceSettings forerunnerDeviceSettings2 = this.f126020b;
                GCMWiFiNetworksActivity.f43245f.g(forerunnerDeviceSettings2, forerunnerDeviceSettings2.f125976b, forerunnerDeviceSettings2.f125978d, forerunnerDeviceSettings2.f125949q, forerunnerDeviceSettings2.f125983i);
                break;
        }
    }
}
