package ch1;

import android.content.Context;
import com.garmin.android.apps.connectmobile.R;
import com.garmin.android.apps.connectmobile.devices.model.DeviceSettingsDTO;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes10.dex */
public class r2 extends fb2.t<DeviceSettingsDTO, DeviceSettingsDTO.l> {
    public r2(Context context) {
        super(context);
    }

    @Override // fb2.e
    public final boolean h(Object obj) {
        DeviceSettingsDTO deviceSettingsDTO = (DeviceSettingsDTO) obj;
        if (deviceSettingsDTO != null) {
            return deviceSettingsDTO.f33866d != null;
        }
        vb.h.s("Model is required");
        return false;
    }

    @Override // fb2.t
    public final Map<DeviceSettingsDTO.l, CharSequence> q(DeviceSettingsDTO.l[] lVarArr) {
        DeviceSettingsDTO.l[] lVarArr2 = lVarArr;
        HashMap map = new HashMap();
        if (lVarArr2 != null) {
            for (DeviceSettingsDTO.l lVar : lVarArr2) {
                map.put(lVar, this.f70343a.getString(lVar.f33990b));
            }
        }
        return map;
    }

    @Override // fb2.t
    public final DeviceSettingsDTO.l r(DeviceSettingsDTO deviceSettingsDTO) {
        DeviceSettingsDTO deviceSettingsDTO2 = deviceSettingsDTO;
        if (deviceSettingsDTO2 != null) {
            return deviceSettingsDTO2.c0();
        }
        vb.h.s("Model is required");
        return null;
    }

    @Override // fb2.t
    public final int t() {
        return R.id.device_settings_distance_btn;
    }

    @Override // fb2.t
    public final String u() {
        return this.f70343a.getString(R.string.lbl_distance);
    }

    @Override // fb2.t
    public final DeviceSettingsDTO.l[] v(DeviceSettingsDTO deviceSettingsDTO) {
        return DeviceSettingsDTO.l.values();
    }

    @Override // fb2.t
    public final void w(DeviceSettingsDTO.l lVar, DeviceSettingsDTO deviceSettingsDTO) {
        DeviceSettingsDTO.l lVar2 = lVar;
        DeviceSettingsDTO deviceSettingsDTO2 = deviceSettingsDTO;
        if (deviceSettingsDTO2 != null) {
            deviceSettingsDTO2.F1(lVar2);
        } else {
            vb.h.s("Model is required");
        }
    }
}
