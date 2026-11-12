package ng1;

import android.content.Intent;
import android.view.View;
import com.garmin.android.apps.connectmobile.devices.model.DeviceSettingsDTO;
import com.garmin.android.apps.connectmobile.settings.devices.Forerunner935AlertTonesDeviceSettings;
import com.garmin.android.apps.connectmobile.settings.devices.Forerunner935TonesDeviceSettings;

/* JADX INFO: loaded from: classes10.dex */
public class v0 implements View.OnClickListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Forerunner935TonesDeviceSettings f126016a;

    public v0(Forerunner935TonesDeviceSettings forerunner935TonesDeviceSettings) {
        this.f126016a = forerunner935TonesDeviceSettings;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view2) {
        Forerunner935TonesDeviceSettings forerunner935TonesDeviceSettings = this.f126016a;
        DeviceSettingsDTO deviceSettingsDTO = forerunner935TonesDeviceSettings.f42126a;
        int i14 = Forerunner935AlertTonesDeviceSettings.f42113e;
        Intent intent = new Intent(forerunner935TonesDeviceSettings, (Class<?>) Forerunner935AlertTonesDeviceSettings.class);
        intent.putExtra("GCM_deviceSettings", deviceSettingsDTO);
        forerunner935TonesDeviceSettings.startActivityForResult(intent, 11);
    }
}
