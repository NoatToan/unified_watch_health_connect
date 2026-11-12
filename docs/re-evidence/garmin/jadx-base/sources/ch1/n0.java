package ch1;

import android.content.Context;
import com.garmin.android.apps.connectmobile.R;
import com.garmin.android.apps.connectmobile.devices.model.DeviceSettingsDTO;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes10.dex */
public class n0 extends fb2.t<DeviceSettingsDTO, DeviceSettingsDTO.j> {
    public n0(Context context) {
        super(context);
    }

    @Override // fb2.e
    public final boolean h(Object obj) {
        DeviceSettingsDTO deviceSettingsDTO = (DeviceSettingsDTO) obj;
        if (deviceSettingsDTO != null) {
            return deviceSettingsDTO.f33864c != null;
        }
        vb.h.s("Model is required");
        return false;
    }

    @Override // fb2.t
    public final Map<DeviceSettingsDTO.j, CharSequence> q(DeviceSettingsDTO.j[] jVarArr) {
        DeviceSettingsDTO.j[] jVarArr2 = jVarArr;
        HashMap map = new HashMap();
        if (jVarArr2 != null) {
            for (DeviceSettingsDTO.j jVar : jVarArr2) {
                map.put(jVar, this.f70343a.getString(jVar.f33976b));
            }
        }
        return map;
    }

    @Override // fb2.t
    public final DeviceSettingsDTO.j r(DeviceSettingsDTO deviceSettingsDTO) {
        DeviceSettingsDTO deviceSettingsDTO2 = deviceSettingsDTO;
        if (deviceSettingsDTO2 != null) {
            return deviceSettingsDTO2.a0();
        }
        vb.h.s("Model is required");
        return null;
    }

    @Override // fb2.t
    public final int t() {
        return R.id.device_settings_date_format_btn;
    }

    @Override // fb2.t
    public final String u() {
        return this.f70343a.getString(R.string.lbl_date_format);
    }

    @Override // fb2.t
    public final DeviceSettingsDTO.j[] v(DeviceSettingsDTO deviceSettingsDTO) {
        return DeviceSettingsDTO.j.values();
    }

    @Override // fb2.t
    public final void w(DeviceSettingsDTO.j jVar, DeviceSettingsDTO deviceSettingsDTO) {
        DeviceSettingsDTO.j jVar2 = jVar;
        DeviceSettingsDTO deviceSettingsDTO2 = deviceSettingsDTO;
        if (deviceSettingsDTO2 != null) {
            deviceSettingsDTO2.D1(jVar2);
        } else {
            vb.h.s("Model is required");
        }
    }
}
