package ch1;

import android.content.Context;
import com.garmin.android.apps.connectmobile.R;
import com.garmin.android.apps.connectmobile.devices.model.DeviceSettingsDTO;

/* JADX INFO: loaded from: classes10.dex */
public class x0 extends fb2.a<DeviceSettingsDTO> {
    public x0(Context context) {
        super(context);
    }

    @Override // fb2.e
    public final boolean h(Object obj) {
        DeviceSettingsDTO deviceSettingsDTO = (DeviceSettingsDTO) obj;
        if (deviceSettingsDTO != null) {
            return deviceSettingsDTO.Q0();
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
        return R.id.device_settings_during_activity_btn;
    }

    @Override // fb2.a
    public final String t() {
        String str = this.f70328f;
        return str != null ? str : this.f70343a.getString(R.string.device_settings_during_activity);
    }

    @Override // fb2.a
    public final void y(Object obj, boolean z14) {
        DeviceSettingsDTO deviceSettingsDTO = (DeviceSettingsDTO) obj;
        if (deviceSettingsDTO == null) {
            vb.h.s("Model is required");
            return;
        }
        wi1.c cVar = deviceSettingsDTO.f33863b1;
        if (!z14) {
            cVar.i0("OFF");
        } else {
            if (cVar.g0()) {
                return;
            }
            deviceSettingsDTO.f33863b1.i0("SHOW_ALL");
        }
    }

    public final boolean z(DeviceSettingsDTO deviceSettingsDTO) {
        wi1.c cVar;
        if (deviceSettingsDTO != null && (cVar = deviceSettingsDTO.f33863b1) != null) {
            return cVar.g0() && !"OFF".equalsIgnoreCase(deviceSettingsDTO.f33863b1.f185502a);
        }
        vb.h.s("Model is required");
        return false;
    }

    public x0(Context context, String str) {
        super(context, str);
    }
}
