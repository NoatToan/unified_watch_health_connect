package ch1;

import android.content.Context;
import com.garmin.android.apps.connectmobile.R;
import com.garmin.android.apps.connectmobile.devices.model.DeviceSettingsDTO;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes10.dex */
public class t4 extends fb2.t<DeviceSettingsDTO, DeviceSettingsDTO.p> {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final boolean f27466e;

    public t4(Context context, boolean z14) {
        super(context);
        this.f27466e = z14;
    }

    @Override // fb2.e
    public final boolean h(Object obj) {
        DeviceSettingsDTO deviceSettingsDTO = (DeviceSettingsDTO) obj;
        if (deviceSettingsDTO != null) {
            return deviceSettingsDTO.f33862b != null;
        }
        vb.h.s("Model is required");
        return false;
    }

    @Override // fb2.t
    public final Map<DeviceSettingsDTO.p, CharSequence> q(DeviceSettingsDTO.p[] pVarArr) {
        DeviceSettingsDTO.p[] pVarArr2 = pVarArr;
        HashMap map = new HashMap();
        if (pVarArr2 != null) {
            for (DeviceSettingsDTO.p pVar : pVarArr2) {
                map.put(pVar, this.f70343a.getString(pVar.f34017b));
            }
        }
        return map;
    }

    @Override // fb2.t
    public final DeviceSettingsDTO.p r(DeviceSettingsDTO deviceSettingsDTO) {
        DeviceSettingsDTO deviceSettingsDTO2 = deviceSettingsDTO;
        if (deviceSettingsDTO2 != null) {
            return deviceSettingsDTO2.h0();
        }
        vb.h.s("Model is required");
        return null;
    }

    @Override // fb2.t
    public final int t() {
        return R.id.device_settings_time_format_btn;
    }

    @Override // fb2.t
    public final String u() {
        return this.f70343a.getString(R.string.lbl_time_format);
    }

    @Override // fb2.t
    public final DeviceSettingsDTO.p[] v(DeviceSettingsDTO deviceSettingsDTO) {
        return this.f27466e ? new DeviceSettingsDTO.p[]{DeviceSettingsDTO.p.TWELVE_HOUR, DeviceSettingsDTO.p.TWENTY_FOUR_HOUR, DeviceSettingsDTO.p.MILITARY} : new DeviceSettingsDTO.p[]{DeviceSettingsDTO.p.TWELVE_HOUR, DeviceSettingsDTO.p.TWENTY_FOUR_HOUR};
    }

    @Override // fb2.t
    public final void w(DeviceSettingsDTO.p pVar, DeviceSettingsDTO deviceSettingsDTO) {
        DeviceSettingsDTO.p pVar2 = pVar;
        DeviceSettingsDTO deviceSettingsDTO2 = deviceSettingsDTO;
        if (deviceSettingsDTO2 != null) {
            deviceSettingsDTO2.I1(pVar2);
        } else {
            vb.h.s("Model is required");
        }
    }
}
