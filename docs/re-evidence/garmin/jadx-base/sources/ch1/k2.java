package ch1;

import android.content.Context;
import com.garmin.android.apps.connectmobile.R;
import com.garmin.android.apps.connectmobile.devices.model.DeviceSettingsDTO;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes10.dex */
public class k2 extends fb2.t<DeviceSettingsDTO, zb0.s0> {
    public k2(Context context) {
        super(context);
    }

    @Override // fb2.e
    public final boolean h(Object obj) {
        DeviceSettingsDTO deviceSettingsDTO = (DeviceSettingsDTO) obj;
        if (deviceSettingsDTO != null) {
            ArrayList arrayList = deviceSettingsDTO.f33903w;
            return (arrayList == null || arrayList.isEmpty()) ? false : true;
        }
        vb.h.s("Model is required");
        return false;
    }

    @Override // fb2.t
    public final Map<zb0.s0, CharSequence> q(zb0.s0[] s0VarArr) {
        zb0.s0[] s0VarArr2 = s0VarArr;
        HashMap map = new HashMap();
        if (s0VarArr2 != null) {
            for (zb0.s0 s0Var : s0VarArr2) {
                map.put(s0Var, this.f70343a.getString(s0Var.f203657b));
            }
        }
        return map;
    }

    @Override // fb2.t
    public final zb0.s0 r(DeviceSettingsDTO deviceSettingsDTO) {
        DeviceSettingsDTO deviceSettingsDTO2 = deviceSettingsDTO;
        if (deviceSettingsDTO2 == null) {
            vb.h.s("Model is required");
            return null;
        }
        zb0.s0.a aVar = zb0.s0.f203651c;
        Integer num = deviceSettingsDTO2.f33907y;
        zb0.s0 s0Var = zb0.s0.GCMDeviceLanguageEnglish;
        aVar.getClass();
        return zb0.s0.a.a(num, s0Var);
    }

    @Override // fb2.t
    public final int t() {
        return R.id.device_settings_language_btn;
    }

    @Override // fb2.t
    public final String u() {
        return this.f70343a.getString(R.string.device_setting_language);
    }

    @Override // fb2.t
    public final zb0.s0[] v(DeviceSettingsDTO deviceSettingsDTO) {
        ArrayList arrayListG0;
        DeviceSettingsDTO deviceSettingsDTO2 = deviceSettingsDTO;
        return (deviceSettingsDTO2 == null || (arrayListG0 = deviceSettingsDTO2.g0()) == null) ? new zb0.s0[0] : (zb0.s0[]) arrayListG0.toArray(new zb0.s0[0]);
    }

    @Override // fb2.t
    public final void w(zb0.s0 s0Var, DeviceSettingsDTO deviceSettingsDTO) {
        zb0.s0 s0Var2 = s0Var;
        DeviceSettingsDTO deviceSettingsDTO2 = deviceSettingsDTO;
        if (deviceSettingsDTO2 == null) {
            vb.h.s("Model is required");
        } else if (s0Var2 != null) {
            deviceSettingsDTO2.f33907y = Integer.valueOf(s0Var2.f203656a.f20535a);
            deviceSettingsDTO2.S1("language");
        }
    }
}
