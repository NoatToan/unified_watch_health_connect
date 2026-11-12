package ch1;

import android.content.Context;
import com.garmin.android.apps.connectmobile.R;
import com.garmin.android.apps.connectmobile.devices.model.DeviceSettingsDTO;

/* JADX INFO: loaded from: classes10.dex */
public class g3 extends fb2.a<DeviceSettingsDTO> {
    public g3(Context context) {
        super(context);
    }

    @Override // fb2.e
    public final boolean h(Object obj) {
        DeviceSettingsDTO deviceSettingsDTO = (DeviceSettingsDTO) obj;
        if (deviceSettingsDTO != null) {
            return deviceSettingsDTO.f33873g1 != null;
        }
        vb.h.s("Model is required");
        return false;
    }

    @Override // fb2.a
    public final boolean q(DeviceSettingsDTO deviceSettingsDTO) {
        DeviceSettingsDTO deviceSettingsDTO2 = deviceSettingsDTO;
        if (deviceSettingsDTO2 == null) {
            vb.h.s("Model is required");
            return false;
        }
        Boolean bool = deviceSettingsDTO2.f33873g1;
        if (bool != null) {
            return bool.booleanValue();
        }
        return false;
    }

    @Override // fb2.a
    public final String r() {
        return this.f70343a.getString(R.string.device_settings_activity_trueup_footer);
    }

    @Override // fb2.a
    /* JADX INFO: renamed from: s */
    public final int getF71586i() {
        return R.id.device_vo2_max_trueup;
    }

    @Override // fb2.a
    public final String t() {
        return this.f70343a.getString(R.string.device_settings_physio_trueup_title);
    }

    @Override // fb2.a
    public final void y(Object obj, boolean z14) {
        DeviceSettingsDTO deviceSettingsDTO = (DeviceSettingsDTO) obj;
        if (deviceSettingsDTO == null) {
            vb.h.s("Model is required");
        } else {
            deviceSettingsDTO.f33873g1 = Boolean.valueOf(z14);
            deviceSettingsDTO.S1("metricsFileTrueupEnabled");
        }
    }
}
