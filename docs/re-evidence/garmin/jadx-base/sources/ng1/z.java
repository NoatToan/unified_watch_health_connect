package ng1;

import android.widget.Toast;
import com.garmin.android.apps.connectmobile.R;
import com.garmin.android.apps.connectmobile.a2;
import com.garmin.android.apps.connectmobile.settings.devices.DeviceSettingsActivityTracking;

/* JADX INFO: loaded from: classes10.dex */
public class z implements d80.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ DeviceSettingsActivityTracking f126029a;

    public z(DeviceSettingsActivityTracking deviceSettingsActivityTracking) {
        this.f126029a = deviceSettingsActivityTracking;
    }

    @Override // d80.b
    public final void a(lj0.b bVar) {
        a2 a2Var = a2.SETTINGS;
        hb.a.q(bVar.f112957a, new StringBuilder("Error fetching device settings from GC ["), "].", a2Var, "DeviceSettingsActivityTracking");
        lj0.b bVar2 = lj0.b.f112951e;
        DeviceSettingsActivityTracking deviceSettingsActivityTracking = this.f126029a;
        if (bVar != bVar2) {
            Toast.makeText(deviceSettingsActivityTracking, R.string.txt_error_occurred, 0).show();
        }
        deviceSettingsActivityTracking.finish();
    }

    @Override // d80.b
    public final void b(Object obj, d80.b.a aVar) {
        DeviceSettingsActivityTracking deviceSettingsActivityTracking = this.f126029a;
        deviceSettingsActivityTracking.f41974d = (com.garmin.android.apps.connectmobile.devices.model.f) obj;
        if (obj == null) {
            a(lj0.b.f112956j);
            return;
        }
        if (hb2.i.a(deviceSettingsActivityTracking)) {
            deviceSettingsActivityTracking.showProgressOverlay();
            com.garmin.android.apps.connectmobile.settings.devices.e eVarN = com.garmin.android.apps.connectmobile.settings.devices.e.N();
            long j8 = deviceSettingsActivityTracking.f41980j;
            com.garmin.android.apps.connectmobile.settings.devices.e.a aVar2 = com.garmin.android.apps.connectmobile.settings.devices.e.a.WALKING;
            com.garmin.android.apps.connectmobile.settings.devices.e.b bVar = com.garmin.android.apps.connectmobile.settings.devices.e.b.GENERIC;
            a0 a0Var = new a0(deviceSettingsActivityTracking);
            eVarN.getClass();
            deviceSettingsActivityTracking.f41977g = com.garmin.android.apps.connectmobile.settings.devices.e.M(j8, aVar2, bVar, a0Var);
        }
    }
}
