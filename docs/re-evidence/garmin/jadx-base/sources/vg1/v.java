package vg1;

import android.widget.Toast;
import com.garmin.android.apps.connectmobile.R;
import com.garmin.android.apps.connectmobile.a2;
import com.garmin.android.apps.connectmobile.devices.model.DeviceSettingsDTO;
import com.garmin.android.apps.connectmobile.settings.devices.common.DeviceSettingsActivityTrackerSetupDefault;
import org.koin.java.KoinJavaComponent;

/* JADX INFO: loaded from: classes10.dex */
public class v implements d80.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ DeviceSettingsDTO f178190a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ DeviceSettingsActivityTrackerSetupDefault f178191b;

    public v(DeviceSettingsActivityTrackerSetupDefault deviceSettingsActivityTrackerSetupDefault, DeviceSettingsDTO deviceSettingsDTO) {
        this.f178191b = deviceSettingsActivityTrackerSetupDefault;
        this.f178190a = deviceSettingsDTO;
    }

    @Override // d80.b
    public final void a(lj0.b bVar) {
        a2 a2Var = a2.SETTINGS;
        hb.a.q(bVar.f112957a, new StringBuilder("Error saving device settings to GC ["), "].", a2Var, "DeviceSettingsActivityTrackerSetupDefault");
        boolean zA = bVar.a();
        int i14 = DeviceSettingsActivityTrackerSetupDefault.f42727r;
        DeviceSettingsActivityTrackerSetupDefault deviceSettingsActivityTrackerSetupDefault = this.f178191b;
        deviceSettingsActivityTrackerSetupDefault.displayFailedMessage(zA);
        deviceSettingsActivityTrackerSetupDefault.hideProgressOverlay();
        deviceSettingsActivityTrackerSetupDefault.finish();
    }

    @Override // d80.b
    public final void b(Object obj, d80.b.a aVar) {
        l80.b bVar = (l80.b) KoinJavaComponent.get(l80.b.class);
        int i14 = DeviceSettingsActivityTrackerSetupDefault.f42727r;
        DeviceSettingsActivityTrackerSetupDefault deviceSettingsActivityTrackerSetupDefault = this.f178191b;
        long j8 = deviceSettingsActivityTrackerSetupDefault.f41773a;
        if (j8 >= 0 && bVar.a(j8)) {
            bVar.n(deviceSettingsActivityTrackerSetupDefault, deviceSettingsActivityTrackerSetupDefault.f41773a, "DeviceSettingsActivityTrackerSetupDefault");
        }
        Toast.makeText(deviceSettingsActivityTrackerSetupDefault, deviceSettingsActivityTrackerSetupDefault.getText(R.string.msg_settings_saved_successfully), 0).show();
        deviceSettingsActivityTrackerSetupDefault.hideProgressOverlay();
        deviceSettingsActivityTrackerSetupDefault.getIntent().putExtra("GCM_deviceSettings", this.f178190a);
        deviceSettingsActivityTrackerSetupDefault.setResult(-1, deviceSettingsActivityTrackerSetupDefault.getIntent());
        deviceSettingsActivityTrackerSetupDefault.finish();
    }
}
