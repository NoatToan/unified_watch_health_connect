package ch1;

import android.content.Context;
import com.garmin.android.apps.connectmobile.R;
import com.garmin.android.apps.connectmobile.devices.model.DeviceSettingsDTO;

/* JADX INFO: loaded from: classes10.dex */
public class y0 extends fb2.a<DeviceSettingsDTO> {
    public y0(Context context) {
        super(context);
    }

    @Override // fb2.e
    public final boolean h(Object obj) {
        DeviceSettingsDTO deviceSettingsDTO = (DeviceSettingsDTO) obj;
        if (deviceSettingsDTO != null) {
            return deviceSettingsDTO.f33867d1 != null;
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
        Boolean bool = deviceSettingsDTO2.f33867d1;
        if (bool == null) {
            return false;
        }
        bool.getClass();
        return bool.booleanValue();
    }

    @Override // fb2.a
    /* JADX INFO: renamed from: s */
    public final int getF71595i() {
        return R.id.device_settings_do_not_disturb_btn;
    }

    @Override // fb2.a
    public final String t() {
        String str = this.f70328f;
        return str != null ? str : this.f70343a.getString(R.string.device_settings_do_not_disturb);
    }

    @Override // fb2.a
    public final void y(Object obj, boolean z14) {
        DeviceSettingsDTO deviceSettingsDTO = (DeviceSettingsDTO) obj;
        if (deviceSettingsDTO == null) {
            vb.h.s("Model is required");
        } else {
            deviceSettingsDTO.f33867d1 = Boolean.valueOf(z14);
            deviceSettingsDTO.S1("dndEnabled");
        }
    }

    public y0(Context context, int i14) {
        super(context, i14);
    }

    public y0(Context context, String str) {
        super(context, str);
    }
}
