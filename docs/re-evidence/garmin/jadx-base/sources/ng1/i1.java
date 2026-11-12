package ng1;

import android.widget.Toast;
import com.garmin.android.apps.connectmobile.R;
import com.garmin.android.apps.connectmobile.a2;
import com.garmin.android.apps.connectmobile.settings.devices.VivosmartDeviceSettingsOrientation;

/* JADX INFO: loaded from: classes10.dex */
public class i1 implements d80.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ VivosmartDeviceSettingsOrientation f125944a;

    public i1(VivosmartDeviceSettingsOrientation vivosmartDeviceSettingsOrientation) {
        this.f125944a = vivosmartDeviceSettingsOrientation;
    }

    @Override // d80.b
    public final void a(lj0.b bVar) {
        a2 a2Var = a2.SETTINGS;
        hb.a.q(bVar.f112957a, new StringBuilder("Error saving device settings to GC ["), "].", a2Var, "VVSSettingsOrientation");
        lj0.b bVar2 = lj0.b.f112951e;
        VivosmartDeviceSettingsOrientation vivosmartDeviceSettingsOrientation = this.f125944a;
        if (bVar != bVar2) {
            Toast.makeText(vivosmartDeviceSettingsOrientation, R.string.txt_error_occurred, 0).show();
        }
        vivosmartDeviceSettingsOrientation.hideProgressOverlay();
        vivosmartDeviceSettingsOrientation.f42388p = false;
        vivosmartDeviceSettingsOrientation.finish();
    }

    @Override // d80.b
    public final void b(Object obj, d80.b.a aVar) {
        VivosmartDeviceSettingsOrientation vivosmartDeviceSettingsOrientation = this.f125944a;
        Toast.makeText(vivosmartDeviceSettingsOrientation, vivosmartDeviceSettingsOrientation.getText(R.string.msg_settings_saved_successfully), 0).show();
        vivosmartDeviceSettingsOrientation.hideProgressOverlay();
        vivosmartDeviceSettingsOrientation.f42388p = false;
        vivosmartDeviceSettingsOrientation.finish();
    }
}
