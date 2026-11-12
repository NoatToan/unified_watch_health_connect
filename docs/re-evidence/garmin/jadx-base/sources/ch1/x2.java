package ch1;

import android.content.Context;
import android.view.View;
import com.garmin.android.apps.connectmobile.R;
import com.garmin.android.apps.connectmobile.devices.model.DeviceSettingsDTO;
import com.garmin.android.apps.connectmobile.view.view_3_0.GCMComplexOneLineButton;

/* JADX INFO: loaded from: classes10.dex */
public class x2 extends fb2.a<DeviceSettingsDTO> {
    public x2(Context context) {
        super(context);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static void z(x2 x2Var, Boolean bool) {
        if (bool != null) {
            DeviceSettingsDTO deviceSettingsDTO = (DeviceSettingsDTO) x2Var.f70344b;
            if (deviceSettingsDTO == null) {
                vb.h.s("Model is required");
                return;
            }
            deviceSettingsDTO.T0.f34190a = bool;
            x2Var.setChanged();
            x2Var.notifyObservers(bool);
        }
    }

    @Override // fb2.e
    public final boolean h(Object obj) {
        DeviceSettingsDTO deviceSettingsDTO = (DeviceSettingsDTO) obj;
        if (deviceSettingsDTO == null) {
            vb.h.s("Model is required");
            return false;
        }
        if (deviceSettingsDTO.L0()) {
            return deviceSettingsDTO.P0() && deviceSettingsDTO.e1();
        }
        return deviceSettingsDTO.P0();
    }

    @Override // fb2.a
    public final boolean q(DeviceSettingsDTO deviceSettingsDTO) {
        DeviceSettingsDTO deviceSettingsDTO2 = deviceSettingsDTO;
        if (deviceSettingsDTO2 != null) {
            return deviceSettingsDTO2.j1();
        }
        vb.h.s("Model is required");
        return false;
    }

    @Override // fb2.a
    /* JADX INFO: renamed from: s */
    public final int getF27433i() {
        return R.id.device_settings_move_iq_btn;
    }

    @Override // fb2.a
    public final String t() {
        return this.f70343a.getString(R.string.device_setting_move_iq);
    }

    @Override // fb2.a
    public final boolean w(View view2, DeviceSettingsDTO deviceSettingsDTO) {
        DeviceSettingsDTO deviceSettingsDTO2 = deviceSettingsDTO;
        fb2.b bVar = new fb2.b(view2, new bd0.e(this, 8));
        this.f70345c = bVar;
        String string = this.f70343a.getString(R.string.device_setting_move_iq_description);
        GCMComplexOneLineButton gCMComplexOneLineButton = bVar.f70333b;
        if (gCMComplexOneLineButton != null && string != null) {
            gCMComplexOneLineButton.setButtonBottomHint(string);
        }
        return k(deviceSettingsDTO2);
    }

    @Override // fb2.a
    public final void y(Object obj, boolean z14) {
        DeviceSettingsDTO deviceSettingsDTO = (DeviceSettingsDTO) obj;
        if (deviceSettingsDTO == null) {
            vb.h.s("Model is required");
        } else {
            deviceSettingsDTO.T0.f34190a = Boolean.valueOf(z14);
        }
    }
}
