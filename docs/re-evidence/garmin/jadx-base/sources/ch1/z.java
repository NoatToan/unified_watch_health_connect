package ch1;

import android.content.Context;
import android.view.View;
import com.garmin.android.apps.connectmobile.R;
import com.garmin.android.apps.connectmobile.devices.model.DeviceSettingsDTO;

/* JADX INFO: loaded from: classes10.dex */
public class z extends fb2.a<DeviceSettingsDTO> {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final int f27506i;

    public z(Context context) {
        super(context);
        this.f27506i = View.generateViewId();
    }

    @Override // fb2.e
    public final boolean h(Object obj) {
        DeviceSettingsDTO deviceSettingsDTO = (DeviceSettingsDTO) obj;
        if (deviceSettingsDTO != null) {
            return deviceSettingsDTO.E != null;
        }
        vb.h.s("Model is required");
        return false;
    }

    @Override // fb2.a
    public final boolean q(DeviceSettingsDTO deviceSettingsDTO) {
        DeviceSettingsDTO deviceSettingsDTO2 = deviceSettingsDTO;
        if (deviceSettingsDTO2 != null) {
            return !deviceSettingsDTO2.E.equals(DeviceSettingsDTO.b.OFF.f33926a);
        }
        vb.h.s("Model is required");
        return false;
    }

    @Override // fb2.a
    /* JADX INFO: renamed from: s */
    public final int getF71586i() {
        return this.f27506i;
    }

    @Override // fb2.a
    public final String t() {
        return this.f70343a.getString(R.string.device_settings_backlight);
    }

    @Override // fb2.a
    public final void y(Object obj, boolean z14) {
        DeviceSettingsDTO deviceSettingsDTO = (DeviceSettingsDTO) obj;
        if (deviceSettingsDTO == null) {
            vb.h.s("Model is required");
        } else if (z14) {
            deviceSettingsDTO.E = DeviceSettingsDTO.b.AUTO_BRIGHTNESS.f33926a;
            deviceSettingsDTO.S1("backlightMode");
        } else {
            deviceSettingsDTO.E = DeviceSettingsDTO.b.OFF.f33926a;
            deviceSettingsDTO.S1("backlightMode");
        }
    }
}
