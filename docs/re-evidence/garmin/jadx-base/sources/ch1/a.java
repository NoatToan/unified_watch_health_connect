package ch1;

import android.content.Context;
import com.garmin.android.apps.connectmobile.R;
import com.garmin.android.apps.connectmobile.devices.model.DeviceSettingsDTO;

/* JADX INFO: loaded from: classes10.dex */
public class a extends fb2.a<DeviceSettingsDTO> {
    public a(Context context) {
        super(context);
    }

    @Override // fb2.e
    public final boolean h(Object obj) {
        DeviceSettingsDTO deviceSettingsDTO = (DeviceSettingsDTO) obj;
        if (deviceSettingsDTO != null) {
            return deviceSettingsDTO.L0();
        }
        vb.h.s("Model is required");
        return false;
    }

    @Override // fb2.a
    public final boolean q(DeviceSettingsDTO deviceSettingsDTO) {
        DeviceSettingsDTO deviceSettingsDTO2 = deviceSettingsDTO;
        if (deviceSettingsDTO2 != null) {
            return deviceSettingsDTO2.e1();
        }
        vb.h.s("Model is required");
        return false;
    }

    @Override // fb2.a
    public final String r() {
        return this.f70343a.getString(R.string.activity_tracking_description);
    }

    @Override // fb2.a
    /* JADX INFO: renamed from: s */
    public final int getF71586i() {
        return R.id.device_settings_activity_tracking_btn;
    }

    @Override // fb2.a
    public final String t() {
        return this.f70343a.getString(R.string.activity_tracking_title);
    }

    @Override // fb2.a
    public final void y(Object obj, boolean z14) {
        DeviceSettingsDTO deviceSettingsDTO = (DeviceSettingsDTO) obj;
        if (deviceSettingsDTO != null) {
            deviceSettingsDTO.f33885m.u(Boolean.valueOf(z14));
        } else {
            vb.h.s("Model is required");
        }
    }
}
