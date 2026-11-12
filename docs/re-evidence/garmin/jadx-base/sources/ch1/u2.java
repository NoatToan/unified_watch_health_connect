package ch1;

import android.content.Context;
import com.garmin.android.apps.connectmobile.R;
import com.garmin.android.apps.connectmobile.devices.model.DeviceSettingsDTO;
import com.garmin.android.apps.connectmobile.view.view_3_0.GCMComplexOneLineButton;

/* JADX INFO: loaded from: classes10.dex */
public class u2 extends fb2.a<DeviceSettingsDTO> {
    public u2(Context context) {
        super(context);
    }

    @Override // fb2.e
    public final boolean h(Object obj) {
        DeviceSettingsDTO deviceSettingsDTO = (DeviceSettingsDTO) obj;
        fb2.f.a(deviceSettingsDTO, "Model is required");
        return deviceSettingsDTO.L0();
    }

    @Override // fb2.a
    public final boolean q(DeviceSettingsDTO deviceSettingsDTO) {
        DeviceSettingsDTO deviceSettingsDTO2 = deviceSettingsDTO;
        fb2.f.a(deviceSettingsDTO2, "Model is required");
        return deviceSettingsDTO2.e1() && deviceSettingsDTO2.t1();
    }

    @Override // fb2.a
    public final String r() {
        return this.f70343a.getString(R.string.device_settings_move_alert_help);
    }

    @Override // fb2.a
    /* JADX INFO: renamed from: s */
    public final int getF71586i() {
        return R.id.device_settings_move_alert_btn;
    }

    @Override // fb2.a
    public final String t() {
        return b(R.string.device_settings_move_alert);
    }

    @Override // fb2.a
    public final void y(Object obj, boolean z14) {
        DeviceSettingsDTO deviceSettingsDTO = (DeviceSettingsDTO) obj;
        fb2.f.a(deviceSettingsDTO, "Model is required");
        deviceSettingsDTO.f33885m.F(Boolean.valueOf(z14));
    }

    public final void z(DeviceSettingsDTO deviceSettingsDTO) {
        fb2.f.a(deviceSettingsDTO, "Model is required");
        fb2.f.a(this.f70345c, "View decorator is not found.");
        try {
            fb2.b bVar = (fb2.b) this.f70345c;
            boolean z14 = deviceSettingsDTO.e1() && deviceSettingsDTO.t1();
            GCMComplexOneLineButton gCMComplexOneLineButton = bVar.f70333b;
            if (gCMComplexOneLineButton != null) {
                gCMComplexOneLineButton.setOnCheckedChangeListener(null);
                gCMComplexOneLineButton.i(z14);
                gCMComplexOneLineButton.setOnCheckedChangeListener(bVar);
            }
            l(deviceSettingsDTO.e1());
        } catch (ClassCastException e4) {
            com.garmin.android.apps.connectmobile.i2.e(com.garmin.android.apps.connectmobile.a2.SETTINGS, "MoveAlertField2", e4);
        }
    }
}
