package ng1;

import android.widget.Toast;
import com.garmin.android.apps.connectmobile.R;
import com.garmin.android.apps.connectmobile.a2;
import com.garmin.android.apps.connectmobile.settings.devices.DeviceSettingsOrientationWatchFaces;

/* JADX INFO: loaded from: classes10.dex */
public class d0 implements d80.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ DeviceSettingsOrientationWatchFaces f125921a;

    public d0(DeviceSettingsOrientationWatchFaces deviceSettingsOrientationWatchFaces) {
        this.f125921a = deviceSettingsOrientationWatchFaces;
    }

    @Override // d80.b
    public final void a(lj0.b bVar) {
        a2 a2Var = a2.SETTINGS;
        hb.a.q(bVar.f112957a, new StringBuilder("Error saving device settings to GC ["), "].", a2Var, "DeviceSettingsOrientationWatchFaces");
        lj0.b bVar2 = lj0.b.f112951e;
        DeviceSettingsOrientationWatchFaces deviceSettingsOrientationWatchFaces = this.f125921a;
        if (bVar != bVar2) {
            Toast.makeText(deviceSettingsOrientationWatchFaces, R.string.txt_error_occurred, 0).show();
        }
        deviceSettingsOrientationWatchFaces.hideProgressOverlay();
        deviceSettingsOrientationWatchFaces.f41998k = false;
        deviceSettingsOrientationWatchFaces.finish();
    }

    @Override // d80.b
    public final void b(Object obj, d80.b.a aVar) {
        DeviceSettingsOrientationWatchFaces deviceSettingsOrientationWatchFaces = this.f125921a;
        Toast.makeText(deviceSettingsOrientationWatchFaces, deviceSettingsOrientationWatchFaces.getText(R.string.msg_settings_saved_successfully), 0).show();
        deviceSettingsOrientationWatchFaces.hideProgressOverlay();
        deviceSettingsOrientationWatchFaces.f41998k = false;
        deviceSettingsOrientationWatchFaces.finish();
    }
}
