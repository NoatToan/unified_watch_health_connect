package ch1;

import android.content.Context;
import android.view.View;
import com.garmin.android.apps.connectmobile.R;
import com.garmin.android.apps.connectmobile.devices.model.DeviceSettingsDTO;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes10.dex */
public class g1 extends fb2.t<DeviceSettingsDTO, DeviceSettingsDTO.b> {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final int f27351e = View.generateViewId();

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final int[] f27352f = {R.string.device_settings_backlight_auto, R.string.device_settings_backlight_stays_on};

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final DeviceSettingsDTO.b[] f27353g = {DeviceSettingsDTO.b.AUTO, DeviceSettingsDTO.b.STAYS_ON};

    public g1(Context context) {
        super(context);
    }

    @Override // fb2.e
    public final boolean h(Object obj) {
        DeviceSettingsDTO deviceSettingsDTO = (DeviceSettingsDTO) obj;
        if (deviceSettingsDTO != null) {
            return deviceSettingsDTO.E != null;
        }
        vb.h.s("Model is required");
        return false;
    }

    @Override // fb2.t
    public final Map<DeviceSettingsDTO.b, CharSequence> q(DeviceSettingsDTO.b[] bVarArr) {
        DeviceSettingsDTO.b[] bVarArr2 = bVarArr;
        HashMap map = new HashMap();
        if (bVarArr2 != null) {
            for (int i14 = 0; i14 < bVarArr2.length; i14++) {
                map.put(bVarArr2[i14], this.f70343a.getString(f27352f[i14]));
            }
        }
        return map;
    }

    @Override // fb2.t
    public final DeviceSettingsDTO.b r(DeviceSettingsDTO deviceSettingsDTO) {
        DeviceSettingsDTO deviceSettingsDTO2 = deviceSettingsDTO;
        if (deviceSettingsDTO2 != null) {
            return deviceSettingsDTO2.Z();
        }
        vb.h.s("Model is required");
        return null;
    }

    @Override // fb2.t
    public final int t() {
        return f27351e;
    }

    @Override // fb2.t
    public final String u() {
        return this.f70343a.getString(R.string.device_settings_backlight_during_activity);
    }

    @Override // fb2.t
    public final DeviceSettingsDTO.b[] v(DeviceSettingsDTO deviceSettingsDTO) {
        return f27353g;
    }

    @Override // fb2.t
    public final void w(DeviceSettingsDTO.b bVar, DeviceSettingsDTO deviceSettingsDTO) {
        DeviceSettingsDTO.b bVar2 = bVar;
        DeviceSettingsDTO deviceSettingsDTO2 = deviceSettingsDTO;
        if (deviceSettingsDTO2 == null) {
            vb.h.s("Model is required");
            return;
        }
        bVar2.getClass();
        deviceSettingsDTO2.E = bVar2.f33926a;
        deviceSettingsDTO2.S1("backlightMode");
    }
}
