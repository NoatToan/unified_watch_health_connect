package ch1;

import android.content.Context;
import com.garmin.android.apps.connectmobile.R;
import com.garmin.android.apps.connectmobile.devices.model.DeviceSettingsDTO;

/* JADX INFO: loaded from: classes10.dex */
public class z0 extends fb2.a<DeviceSettingsDTO> {
    public z0(Context context) {
        super(context);
    }

    @Override // fb2.e
    public final boolean h(Object obj) {
        DeviceSettingsDTO deviceSettingsDTO = (DeviceSettingsDTO) obj;
        if (deviceSettingsDTO != null) {
            return deviceSettingsDTO.S0();
        }
        vb.h.s("Model is required");
        return false;
    }

    @Override // fb2.a
    public final boolean q(DeviceSettingsDTO deviceSettingsDTO) {
        DeviceSettingsDTO deviceSettingsDTO2 = deviceSettingsDTO;
        if (deviceSettingsDTO2 != null) {
            return z(deviceSettingsDTO2);
        }
        vb.h.s("Model is required");
        return false;
    }

    @Override // fb2.a
    /* JADX INFO: renamed from: s */
    public final int getF71586i() {
        return R.id.device_settings_not_during_activity_btn;
    }

    @Override // fb2.a
    public final String t() {
        return "Not During Activity";
    }

    @Override // fb2.a
    public final void y(Object obj, boolean z14) {
        DeviceSettingsDTO deviceSettingsDTO = (DeviceSettingsDTO) obj;
        if (deviceSettingsDTO == null) {
            vb.h.s("Model is required");
            return;
        }
        wi1.f fVar = deviceSettingsDTO.f33865c1;
        if (!z14) {
            fVar.i0("OFF");
        } else {
            if (fVar.g0()) {
                return;
            }
            deviceSettingsDTO.f33865c1.i0("SHOW_ALL");
        }
    }

    public final boolean z(DeviceSettingsDTO deviceSettingsDTO) {
        wi1.f fVar;
        if (deviceSettingsDTO != null && (fVar = deviceSettingsDTO.f33865c1) != null) {
            return fVar.g0() && !"OFF".equalsIgnoreCase(deviceSettingsDTO.f33865c1.f185502a);
        }
        vb.h.s("Model is required");
        return false;
    }
}
