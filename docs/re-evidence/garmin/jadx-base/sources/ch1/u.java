package ch1;

import android.content.Context;
import com.garmin.android.apps.connectmobile.R;
import com.garmin.android.apps.connectmobile.devices.model.DeviceSettingsDTO;

/* JADX INFO: loaded from: classes10.dex */
public class u extends fb2.a<DeviceSettingsDTO> {
    public u(Context context) {
        super(context);
    }

    @Override // fb2.e
    public final boolean h(Object obj) {
        DeviceSettingsDTO deviceSettingsDTO = (DeviceSettingsDTO) obj;
        if (deviceSettingsDTO != null) {
            try {
                return deviceSettingsDTO.I0.f34307a != null;
            } catch (NullPointerException unused) {
                return false;
            }
        }
        vb.h.s("Model is required");
        return false;
    }

    @Override // fb2.a
    public final boolean q(DeviceSettingsDTO deviceSettingsDTO) {
        DeviceSettingsDTO deviceSettingsDTO2 = deviceSettingsDTO;
        if (deviceSettingsDTO2 == null) {
            return false;
        }
        try {
            Boolean bool = deviceSettingsDTO2.I0.f34307a;
            bool.getClass();
            return bool.booleanValue();
        } catch (NullPointerException unused) {
            return false;
        }
    }

    @Override // fb2.a
    public final String r() {
        return b(R.string.device_settings_auto_update_apps_help);
    }

    @Override // fb2.a
    /* JADX INFO: renamed from: s */
    public final int getF71586i() {
        return R.id.device_settings_auto_update_apps_btn;
    }

    @Override // fb2.a
    public final String t() {
        return this.f70343a.getString(R.string.device_settings_auto_update_apps);
    }

    @Override // fb2.a
    public final void y(Object obj, boolean z14) {
        DeviceSettingsDTO deviceSettingsDTO = (DeviceSettingsDTO) obj;
        if (deviceSettingsDTO == null) {
            vb.h.s("Model is required");
            return;
        }
        try {
            com.garmin.android.apps.connectmobile.devices.model.q qVar = deviceSettingsDTO.I0;
            qVar.f34307a = Boolean.valueOf(z14);
            deviceSettingsDTO.I0 = qVar;
            deviceSettingsDTO.S1("connectIQ");
        } catch (NullPointerException unused) {
        }
    }
}
