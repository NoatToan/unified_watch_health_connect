package vg1;

import android.os.Bundle;
import com.garmin.android.apps.connectmobile.devices.model.DeviceSettingsDTO;
import com.garmin.android.apps.connectmobile.settings.model.UserSettingsDTO;

/* JADX INFO: loaded from: classes10.dex */
public interface h0 {
    void a();

    void b(Bundle bundle);

    Bundle c();

    boolean d();

    DeviceSettingsDTO e();

    boolean f();

    UserSettingsDTO g();

    String getDeviceName();

    long getDeviceUnitId();

    String getMacAddress();

    uv.i getSensorSettings();

    int h();

    boolean hasModel();

    String i();

    void j(DeviceSettingsDTO deviceSettingsDTO);

    void k(tr2.b bVar);

    void l();

    boolean m();

    com.garmin.android.apps.connectmobile.devices.model.f n();

    zb0.u0 o();

    void onStop();
}
