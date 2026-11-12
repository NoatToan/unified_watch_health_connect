package ch1;

import android.content.Context;
import com.garmin.android.apps.connectmobile.R;
import com.garmin.android.apps.connectmobile.devices.model.DeviceSettingsDTO;

/* JADX INFO: loaded from: classes10.dex */
public class v2 extends fb2.a<DeviceSettingsDTO> {
    public v2(Context context) {
        super(context);
    }

    @Override // fb2.e
    public final boolean h(Object obj) {
        DeviceSettingsDTO deviceSettingsDTO = (DeviceSettingsDTO) obj;
        if (deviceSettingsDTO == null) {
            vb.h.s("Model is required");
            return false;
        }
        boolean zL0 = deviceSettingsDTO.L0();
        com.garmin.android.apps.connectmobile.devices.model.h hVar = deviceSettingsDTO.f33885m;
        if (zL0) {
            return (hVar != null ? hVar.getMoveAlertEnabled() : null) != null && deviceSettingsDTO.e1();
        }
        return (hVar != null ? hVar.getMoveAlertEnabled() : null) != null;
    }

    @Override // fb2.a
    public final boolean q(DeviceSettingsDTO deviceSettingsDTO) {
        DeviceSettingsDTO deviceSettingsDTO2 = deviceSettingsDTO;
        if (deviceSettingsDTO2 != null) {
            return deviceSettingsDTO2.t1();
        }
        vb.h.s("Model is required");
        return false;
    }

    @Override // fb2.a
    /* JADX INFO: renamed from: s */
    public final int getF71595i() {
        return R.id.device_settings_move_alert_btn;
    }

    @Override // fb2.a
    public final String t() {
        return this.f70343a.getString(R.string.device_settings_move_alert);
    }

    @Override // fb2.a
    public final void y(Object obj, boolean z14) {
        DeviceSettingsDTO deviceSettingsDTO = (DeviceSettingsDTO) obj;
        if (deviceSettingsDTO != null) {
            deviceSettingsDTO.f33885m.F(Boolean.valueOf(z14));
        } else {
            vb.h.s("Model is required");
        }
    }
}
