package ch1;

import android.content.Context;
import com.garmin.android.apps.connectmobile.R;
import com.garmin.android.apps.connectmobile.devices.model.DeviceSettingsDTO;
import com.garmin.android.apps.connectmobile.view.view_3_0.GCMComplexOneLineButton;

/* JADX INFO: loaded from: classes10.dex */
public class w2 extends fb2.a<DeviceSettingsDTO> {
    public w2(Context context) {
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
        return deviceSettingsDTO2.e1() && deviceSettingsDTO2.j1();
    }

    @Override // fb2.a
    /* JADX INFO: renamed from: s */
    public final int getF71586i() {
        return R.id.device_settings_move_iq_btn;
    }

    @Override // fb2.a
    public final String t() {
        return this.f70343a.getString(R.string.device_setting_move_iq);
    }

    @Override // fb2.a
    public final void y(Object obj, boolean z14) {
        DeviceSettingsDTO deviceSettingsDTO = (DeviceSettingsDTO) obj;
        fb2.f.a(deviceSettingsDTO, "Model is required");
        com.garmin.android.apps.connectmobile.devices.model.k kVar = deviceSettingsDTO.T0;
        if (kVar == null) {
            kVar = new com.garmin.android.apps.connectmobile.devices.model.k();
        }
        kVar.f34190a = Boolean.valueOf(z14);
        deviceSettingsDTO.T0 = kVar;
        deviceSettingsDTO.S1("autoActivityDetect");
    }

    public final void z(DeviceSettingsDTO deviceSettingsDTO) {
        fb2.f.a(deviceSettingsDTO, "Model is required");
        fb2.f.a(this.f70345c, "View decorator is not found.");
        try {
            fb2.b bVar = (fb2.b) this.f70345c;
            boolean z14 = deviceSettingsDTO.e1() && deviceSettingsDTO.j1();
            GCMComplexOneLineButton gCMComplexOneLineButton = bVar.f70333b;
            if (gCMComplexOneLineButton != null) {
                gCMComplexOneLineButton.setOnCheckedChangeListener(null);
                gCMComplexOneLineButton.i(z14);
                gCMComplexOneLineButton.setOnCheckedChangeListener(bVar);
            }
            l(deviceSettingsDTO.e1());
        } catch (ClassCastException e4) {
            com.garmin.android.apps.connectmobile.i2.e(com.garmin.android.apps.connectmobile.a2.SETTINGS, "MoveIQField2", e4);
        }
    }
}
