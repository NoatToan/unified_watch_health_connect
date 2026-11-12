package ch1;

import android.content.Context;
import com.garmin.android.apps.connectmobile.R;
import com.garmin.android.apps.connectmobile.devices.model.DeviceSettingsDTO;

/* JADX INFO: loaded from: classes10.dex */
public abstract class q extends fb2.t<DeviceSettingsDTO, DeviceSettingsDTO.g> {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public String f27437e;

    public q(Context context) {
        super(context);
        this.f27437e = null;
    }

    @Override // fb2.e
    public final boolean h(Object obj) {
        DeviceSettingsDTO deviceSettingsDTO = (DeviceSettingsDTO) obj;
        if (deviceSettingsDTO != null) {
            return deviceSettingsDTO.F != null;
        }
        vb.h.s("Model is required");
        return false;
    }

    @Override // fb2.t
    public final int t() {
        return R.id.device_settings_auto_on_backlight_btn;
    }

    @Override // fb2.t
    public final String u() {
        String str = this.f27437e;
        return str != null ? str : this.f70343a.getString(R.string.device_setting_auto_backlight);
    }

    @Override // fb2.t
    public final void w(DeviceSettingsDTO.g gVar, DeviceSettingsDTO deviceSettingsDTO) {
        DeviceSettingsDTO.g gVar2 = gVar;
        DeviceSettingsDTO deviceSettingsDTO2 = deviceSettingsDTO;
        if (deviceSettingsDTO2 != null) {
            deviceSettingsDTO2.C1(gVar2);
        } else {
            vb.h.s("Model is required");
        }
    }
}
