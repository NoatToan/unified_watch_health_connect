package ch1;

import android.content.Context;
import android.view.View;
import com.garmin.android.apps.connectmobile.R;
import com.garmin.android.apps.connectmobile.devices.model.DeviceSettingsDTO;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes10.dex */
public class j extends fb2.t<DeviceSettingsDTO, a> {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final int f27380e = View.generateViewId();

    public enum a {
        ON(R.string.lbl_on),
        DURING_ACTIVITY(R.string.device_settings_during_activity),
        OFF(R.string.lbl_off);


        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final int f27385a;

        a(int i14) {
            this.f27385a = i14;
        }
    }

    public j(Context context) {
        super(context);
    }

    @Override // fb2.e
    public final boolean h(Object obj) {
        DeviceSettingsDTO deviceSettingsDTO = (DeviceSettingsDTO) obj;
        fb2.f.a(deviceSettingsDTO, "Model is required");
        return deviceSettingsDTO.f33891p != null;
    }

    @Override // fb2.t
    public final Map<a, CharSequence> q(a[] aVarArr) {
        HashMap map = new HashMap();
        for (a aVar : aVarArr) {
            map.put(aVar, b(aVar.f27385a));
        }
        return map;
    }

    @Override // fb2.t
    public final a r(DeviceSettingsDTO deviceSettingsDTO) {
        DeviceSettingsDTO deviceSettingsDTO2 = deviceSettingsDTO;
        fb2.f.a(deviceSettingsDTO2, "Model is required");
        boolean zX1 = deviceSettingsDTO2.x1();
        boolean zH1 = deviceSettingsDTO2.h1();
        if (zX1) {
            return a.DURING_ACTIVITY;
        }
        return zH1 ? a.ON : a.OFF;
    }

    @Override // fb2.t
    public final int t() {
        return f27380e;
    }

    @Override // fb2.t
    public final String u() {
        return b(R.string.device_setting_alert_tones);
    }

    @Override // fb2.t
    public final a[] v(DeviceSettingsDTO deviceSettingsDTO) {
        return a.values();
    }

    @Override // fb2.t
    public final void w(a aVar, DeviceSettingsDTO deviceSettingsDTO) {
        a aVar2 = aVar;
        DeviceSettingsDTO deviceSettingsDTO2 = deviceSettingsDTO;
        fb2.f.a(deviceSettingsDTO2, "Model is required");
        if (aVar2 != null) {
            int iOrdinal = aVar2.ordinal();
            if (iOrdinal == 0) {
                deviceSettingsDTO2.y1(Boolean.TRUE);
                deviceSettingsDTO2.U1(Boolean.FALSE);
            } else if (iOrdinal != 2) {
                deviceSettingsDTO2.y1(Boolean.FALSE);
                deviceSettingsDTO2.U1(Boolean.TRUE);
            } else {
                Boolean bool = Boolean.FALSE;
                deviceSettingsDTO2.y1(bool);
                deviceSettingsDTO2.U1(bool);
            }
        }
    }
}
