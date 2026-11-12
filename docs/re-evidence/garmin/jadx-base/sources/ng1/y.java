package ng1;

import com.garmin.android.apps.connectmobile.a2;
import com.garmin.android.apps.connectmobile.devices.model.DeviceSettingsDTO;
import com.garmin.android.apps.connectmobile.settings.devices.DeviceSettingsActivityTrackerSetup;

/* JADX INFO: loaded from: classes10.dex */
public class y implements d80.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ DeviceSettingsActivityTrackerSetup f126025a;

    public y(DeviceSettingsActivityTrackerSetup deviceSettingsActivityTrackerSetup) {
        this.f126025a = deviceSettingsActivityTrackerSetup;
    }

    @Override // d80.b
    public final void a(lj0.b bVar) {
        a2 a2Var = a2.SETTINGS;
        hb.a.q(bVar.f112957a, new StringBuilder("Error fetching device settings from GC ["), "].", a2Var, "DeviceSettingsActivityTrackerSetup");
        boolean zA = bVar.a();
        int i14 = DeviceSettingsActivityTrackerSetup.f41968q;
        DeviceSettingsActivityTrackerSetup deviceSettingsActivityTrackerSetup = this.f126025a;
        deviceSettingsActivityTrackerSetup.displayFailedMessage(zA);
        deviceSettingsActivityTrackerSetup.finish();
    }

    @Override // d80.b
    public final void b(Object obj, d80.b.a aVar) {
        DeviceSettingsActivityTrackerSetup deviceSettingsActivityTrackerSetup = this.f126025a;
        deviceSettingsActivityTrackerSetup.f41970p = (DeviceSettingsDTO) obj;
        if (obj == null) {
            a(lj0.b.f112956j);
        }
        deviceSettingsActivityTrackerSetup.f41778f.incrementAndGet();
        deviceSettingsActivityTrackerSetup.ea();
    }
}
