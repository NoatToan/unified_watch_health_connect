package ch1;

import android.content.Context;
import com.garmin.android.apps.connectmobile.R;
import com.garmin.android.apps.connectmobile.devices.model.DeviceSettingsDTO;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes10.dex */
public class n6 extends fb2.t<DeviceSettingsDTO, DeviceSettingsDTO.v> {
    public n6(Context context) {
        super(context);
    }

    @Override // fb2.e
    public final boolean h(Object obj) {
        DeviceSettingsDTO deviceSettingsDTO = (DeviceSettingsDTO) obj;
        if (deviceSettingsDTO != null) {
            return deviceSettingsDTO.e0().f34072a != null;
        }
        vb.h.s("Model is required");
        return false;
    }

    @Override // fb2.t
    public final Map<DeviceSettingsDTO.v, CharSequence> q(DeviceSettingsDTO.v[] vVarArr) {
        DeviceSettingsDTO.v[] vVarArr2 = vVarArr;
        HashMap map = new HashMap();
        if (vVarArr2 != null) {
            for (DeviceSettingsDTO.v vVar : vVarArr2) {
                map.put(vVar, this.f70343a.getString(vVar.f34073b));
            }
        }
        return map;
    }

    @Override // fb2.t
    public final DeviceSettingsDTO.v r(DeviceSettingsDTO deviceSettingsDTO) {
        DeviceSettingsDTO deviceSettingsDTO2 = deviceSettingsDTO;
        if (deviceSettingsDTO2 != null) {
            return deviceSettingsDTO2.e0();
        }
        vb.h.s("Model is required");
        return null;
    }

    @Override // fb2.t
    public final int t() {
        return R.id.device_settings_wrist_btn;
    }

    @Override // fb2.t
    public final String u() {
        return this.f70343a.getString(R.string.device_setting_wrist_worn_on);
    }

    @Override // fb2.t
    public final DeviceSettingsDTO.v[] v(DeviceSettingsDTO deviceSettingsDTO) {
        DeviceSettingsDTO.v.f34067c.getClass();
        return new DeviceSettingsDTO.v[]{DeviceSettingsDTO.v.LEFT, DeviceSettingsDTO.v.RIGHT};
    }

    @Override // fb2.t
    public final void w(DeviceSettingsDTO.v vVar, DeviceSettingsDTO deviceSettingsDTO) {
        DeviceSettingsDTO.v vVar2 = vVar;
        DeviceSettingsDTO deviceSettingsDTO2 = deviceSettingsDTO;
        if (deviceSettingsDTO2 == null) {
            vb.h.s("Model is required");
            return;
        }
        vVar2.getClass();
        deviceSettingsDTO2.D = vVar2.f34072a;
        deviceSettingsDTO2.S1("mountingSide");
    }
}
