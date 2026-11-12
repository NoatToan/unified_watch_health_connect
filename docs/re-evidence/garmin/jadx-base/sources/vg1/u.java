package vg1;

import com.garmin.android.apps.connectmobile.a2;
import com.garmin.android.apps.connectmobile.devices.model.DeviceSettingsDTO;
import com.garmin.android.apps.connectmobile.settings.devices.common.DeviceSettingsActivityTrackerSetupDefault;

/* JADX INFO: loaded from: classes10.dex */
public class u implements d80.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ DeviceSettingsActivityTrackerSetupDefault f178189a;

    public u(DeviceSettingsActivityTrackerSetupDefault deviceSettingsActivityTrackerSetupDefault) {
        this.f178189a = deviceSettingsActivityTrackerSetupDefault;
    }

    @Override // d80.b
    public final void a(lj0.b bVar) {
        a2 a2Var = a2.SETTINGS;
        hb.a.q(bVar.f112957a, new StringBuilder("Error fetching device settings from GC ["), "].", a2Var, "DeviceSettingsActivityTrackerSetupDefault");
        boolean zA = bVar.a();
        int i14 = DeviceSettingsActivityTrackerSetupDefault.f42727r;
        DeviceSettingsActivityTrackerSetupDefault deviceSettingsActivityTrackerSetupDefault = this.f178189a;
        deviceSettingsActivityTrackerSetupDefault.displayFailedMessage(zA);
        deviceSettingsActivityTrackerSetupDefault.finish();
    }

    @Override // d80.b
    public final void b(Object obj, d80.b.a aVar) {
        DeviceSettingsActivityTrackerSetupDefault deviceSettingsActivityTrackerSetupDefault = this.f178189a;
        deviceSettingsActivityTrackerSetupDefault.f42728o = (DeviceSettingsDTO) obj;
        if (obj == null) {
            a(lj0.b.f112956j);
        }
        deviceSettingsActivityTrackerSetupDefault.f41778f.incrementAndGet();
        deviceSettingsActivityTrackerSetupDefault.ea();
    }
}
