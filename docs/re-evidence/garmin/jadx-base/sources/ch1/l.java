package ch1;

import android.content.Context;
import android.view.View;
import com.garmin.android.apps.connectmobile.R;
import com.garmin.android.apps.connectmobile.devices.model.DeviceSettingsDTO;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes10.dex */
public class l extends fb2.t<DeviceSettingsDTO, DeviceSettingsDTO.c> {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final int f27400e = View.generateViewId();

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final DeviceSettingsDTO.c[] f27401f = {DeviceSettingsDTO.c.SECONDS_5, DeviceSettingsDTO.c.SECONDS_10, DeviceSettingsDTO.c.SECONDS_15, DeviceSettingsDTO.c.SECONDS_30};

    public l(Context context) {
        super(context);
    }

    @Override // fb2.e
    public final boolean h(Object obj) {
        DeviceSettingsDTO deviceSettingsDTO = (DeviceSettingsDTO) obj;
        if (deviceSettingsDTO != null) {
            return deviceSettingsDTO.G() != null;
        }
        vb.h.s("Model is required");
        return false;
    }

    @Override // fb2.t
    public final Map<DeviceSettingsDTO.c, CharSequence> q(DeviceSettingsDTO.c[] cVarArr) {
        DeviceSettingsDTO.c[] cVarArr2 = cVarArr;
        HashMap map = new HashMap();
        if (cVarArr2 != null) {
            for (DeviceSettingsDTO.c cVar : cVarArr2) {
                map.put(cVar, this.f70343a.getString(cVar.f33940b));
            }
        }
        return map;
    }

    @Override // fb2.t
    public final DeviceSettingsDTO.c r(DeviceSettingsDTO deviceSettingsDTO) {
        DeviceSettingsDTO deviceSettingsDTO2 = deviceSettingsDTO;
        if (deviceSettingsDTO2 != null) {
            return deviceSettingsDTO2.G();
        }
        vb.h.s("Model is required");
        return null;
    }

    @Override // fb2.t
    public final int t() {
        return f27400e;
    }

    @Override // fb2.t
    public final String u() {
        return this.f70343a.getString(R.string.device_setting_timeout);
    }

    @Override // fb2.t
    public final DeviceSettingsDTO.c[] v(DeviceSettingsDTO deviceSettingsDTO) {
        return f27401f;
    }

    @Override // fb2.t
    public final void w(DeviceSettingsDTO.c cVar, DeviceSettingsDTO deviceSettingsDTO) {
        DeviceSettingsDTO.c cVar2 = cVar;
        DeviceSettingsDTO deviceSettingsDTO2 = deviceSettingsDTO;
        if (deviceSettingsDTO2 == null) {
            vb.h.s("Model is required");
            return;
        }
        cVar2.getClass();
        deviceSettingsDTO2.Z0 = cVar2.f33939a;
        deviceSettingsDTO2.S1("backlightTimeout");
    }
}
