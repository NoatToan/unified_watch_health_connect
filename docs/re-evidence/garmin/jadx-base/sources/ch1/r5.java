package ch1;

import android.content.Context;
import com.garmin.android.apps.connectmobile.R;
import com.garmin.android.apps.connectmobile.devices.model.DeviceSettingsDTO;

/* JADX INFO: loaded from: classes10.dex */
public class r5 extends fb2.a<DeviceSettingsDTO> {
    public r5(Context context) {
        super(context);
    }

    @Override // fb2.e
    public final boolean h(Object obj) {
        DeviceSettingsDTO deviceSettingsDTO = (DeviceSettingsDTO) obj;
        if (deviceSettingsDTO == null) {
            vb.h.s("Model is required");
            return false;
        }
        long j8 = deviceSettingsDTO.f33860a;
        rd2.f.a().f152045a.getClass();
        sd2.f fVarI = rd2.j.i(j8, null);
        return fVarI != null && fVarI.u2();
    }

    @Override // fb2.a
    public final boolean q(DeviceSettingsDTO deviceSettingsDTO) {
        DeviceSettingsDTO deviceSettingsDTO2 = deviceSettingsDTO;
        if (deviceSettingsDTO2 == null) {
            vb.h.s("Model is required");
            return false;
        }
        Boolean bool = deviceSettingsDTO2.J0;
        if (bool != null) {
            return bool.booleanValue();
        }
        return false;
    }

    @Override // fb2.a
    public final String r() {
        return this.f70343a.getString(R.string.vivohub_syncing_description);
    }

    @Override // fb2.a
    /* JADX INFO: renamed from: s */
    public final int getF71586i() {
        return R.id.device_settings_vivohub_syncing_btn;
    }

    @Override // fb2.a
    public final String t() {
        return this.f70343a.getString(R.string.device_setting_vivohub_syncing);
    }

    @Override // fb2.a
    public final void y(Object obj, boolean z14) {
        DeviceSettingsDTO deviceSettingsDTO = (DeviceSettingsDTO) obj;
        if (deviceSettingsDTO == null) {
            vb.h.s("Model is required");
        } else {
            deviceSettingsDTO.J0 = Boolean.valueOf(z14);
            deviceSettingsDTO.S1("vivohubEnabled");
        }
    }
}
