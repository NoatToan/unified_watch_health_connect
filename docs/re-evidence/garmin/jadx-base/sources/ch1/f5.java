package ch1;

import android.content.Context;
import android.view.View;
import com.garmin.android.apps.connectmobile.R;
import com.garmin.android.apps.connectmobile.devices.model.DeviceSettingsDTO;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes10.dex */
public class f5 extends fb2.t<DeviceSettingsDTO, DeviceSettingsDTO.c> {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final int f27344e = View.generateViewId();

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final DeviceSettingsDTO.c[] f27345f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final HashMap f27346g;

    static {
        DeviceSettingsDTO.c cVar = DeviceSettingsDTO.c.SHORT;
        DeviceSettingsDTO.c cVar2 = DeviceSettingsDTO.c.MEDIUM;
        DeviceSettingsDTO.c cVar3 = DeviceSettingsDTO.c.LONG;
        DeviceSettingsDTO.c cVar4 = DeviceSettingsDTO.c.VERY_LONG;
        f27345f = new DeviceSettingsDTO.c[]{cVar, cVar2, cVar3, cVar4};
        HashMap map = new HashMap();
        f27346g = map;
        map.put(cVar, Integer.valueOf(R.string.screen_timeout_short));
        map.put(cVar2, Integer.valueOf(R.string.screen_timeout_medium));
        map.put(cVar3, Integer.valueOf(R.string.screen_timeout_long));
        map.put(cVar4, Integer.valueOf(R.string.timeout_verylong));
    }

    public f5(Context context) {
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
            for (int i14 = 0; i14 < cVarArr2.length; i14++) {
                DeviceSettingsDTO.c cVar = cVarArr2[i14];
                HashMap map2 = f27346g;
                if (map2.containsKey(cVar)) {
                    map.put(cVarArr2[i14], this.f70343a.getString(((Integer) map2.get(cVarArr2[i14])).intValue()));
                }
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
        return f27344e;
    }

    @Override // fb2.t
    public String u() {
        return this.f70343a.getString(R.string.device_setting_timeout);
    }

    @Override // fb2.t
    public final DeviceSettingsDTO.c[] v(DeviceSettingsDTO deviceSettingsDTO) {
        return f27345f;
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
