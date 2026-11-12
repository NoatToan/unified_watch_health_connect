package ch1;

import android.content.Context;
import com.garmin.android.apps.connectmobile.R;
import com.garmin.android.apps.connectmobile.devices.model.DeviceSettingsDTO;

/* JADX INFO: loaded from: classes10.dex */
public class c0 extends fb2.a<DeviceSettingsDTO> {
    public c0(Context context) {
        super(context);
    }

    @Override // fb2.e
    public final boolean h(Object obj) {
        DeviceSettingsDTO deviceSettingsDTO = (DeviceSettingsDTO) obj;
        if (deviceSettingsDTO != null) {
            Boolean bool = deviceSettingsDTO.f33871f1;
            return (bool == null || bool == null) ? false : true;
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
        Boolean bool = deviceSettingsDTO2.f33871f1;
        if (bool == null) {
            return false;
        }
        bool.getClass();
        return bool.booleanValue();
    }

    @Override // fb2.a
    /* JADX INFO: renamed from: s */
    public final int getF71586i() {
        return R.id.device_settings_ble_alert_btn;
    }

    @Override // fb2.a
    public final String t() {
        return b(R.string.device_settings_bluetooth_connection_alert);
    }

    @Override // fb2.a
    public final void y(Object obj, boolean z14) {
        DeviceSettingsDTO deviceSettingsDTO = (DeviceSettingsDTO) obj;
        if (deviceSettingsDTO == null) {
            vb.h.s("Model is required");
        } else {
            deviceSettingsDTO.f33871f1 = Boolean.valueOf(z14);
            deviceSettingsDTO.S1("bleConnectionAlertEnabled");
        }
    }
}
