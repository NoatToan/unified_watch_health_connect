package ch1;

import android.content.Context;
import android.view.View;
import com.garmin.android.apps.connectmobile.R;
import com.garmin.android.apps.connectmobile.devices.model.DeviceSettingsDTO;
import java.util.HashMap;

/* JADX INFO: loaded from: classes10.dex */
public class w extends fb2.a<DeviceSettingsDTO> {

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final HashMap f27488j;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final int f27489i;

    static {
        HashMap map = new HashMap();
        f27488j = map;
        map.put(DeviceSettingsDTO.g.ON, Boolean.TRUE);
        map.put(DeviceSettingsDTO.g.OFF, Boolean.FALSE);
    }

    public w(Context context) {
        super(context);
        this.f27489i = View.generateViewId();
    }

    @Override // fb2.e
    public final boolean h(Object obj) {
        DeviceSettingsDTO deviceSettingsDTO = (DeviceSettingsDTO) obj;
        if (deviceSettingsDTO != null) {
            return deviceSettingsDTO.F != null;
        }
        vb.h.s("Model is required");
        return false;
    }

    @Override // fb2.a
    public final boolean q(DeviceSettingsDTO deviceSettingsDTO) {
        DeviceSettingsDTO deviceSettingsDTO2 = deviceSettingsDTO;
        if (deviceSettingsDTO2 == null) {
            vb.h.s("Model is required");
            return false;
        }
        DeviceSettingsDTO.g gVarI = deviceSettingsDTO2.I();
        HashMap map = f27488j;
        if (map.containsKey(gVarI)) {
            return ((Boolean) map.get(gVarI)).booleanValue();
        }
        return false;
    }

    @Override // fb2.a
    /* JADX INFO: renamed from: s */
    public final int getF71586i() {
        return this.f27489i;
    }

    @Override // fb2.a
    public final String t() {
        String str = this.f70328f;
        return str != null ? str : this.f70343a.getString(R.string.device_settings_backlight_gesture);
    }

    @Override // fb2.a
    public final void y(Object obj, boolean z14) {
        DeviceSettingsDTO deviceSettingsDTO = (DeviceSettingsDTO) obj;
        if (deviceSettingsDTO == null) {
            vb.h.s("Model is required");
        } else if (z14) {
            deviceSettingsDTO.C1(DeviceSettingsDTO.g.ON);
        } else {
            deviceSettingsDTO.C1(DeviceSettingsDTO.g.OFF);
        }
    }

    public w(Context context, String str) {
        super(context, str);
        this.f27489i = View.generateViewId();
    }
}
