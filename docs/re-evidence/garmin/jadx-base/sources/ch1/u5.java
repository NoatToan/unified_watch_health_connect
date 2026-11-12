package ch1;

import android.content.Context;
import android.view.View;
import com.garmin.android.apps.connectmobile.R;
import com.garmin.android.apps.connectmobile.devices.model.DeviceSettingsDTO;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes10.dex */
public class u5 extends fb2.t<DeviceSettingsDTO, DeviceSettingsDTO.t> {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final int f27476h = View.generateViewId();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int[] f27477e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public DeviceSettingsDTO.t[] f27478f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final Boolean f27479g;

    public u5(Context context, boolean z14) {
        super(context);
        this.f27477e = new int[]{R.string.screen_timeout_short, R.string.screen_timeout_medium, R.string.screen_timeout_long};
        this.f27478f = new DeviceSettingsDTO.t[]{DeviceSettingsDTO.t.SHORT, DeviceSettingsDTO.t.MEDIUM, DeviceSettingsDTO.t.LONG};
        this.f27479g = Boolean.valueOf(z14);
    }

    @Override // fb2.e
    public final boolean h(Object obj) {
        DeviceSettingsDTO deviceSettingsDTO = (DeviceSettingsDTO) obj;
        if (deviceSettingsDTO == null) {
            vb.h.s("Model is required");
            return false;
        }
        if (this.f27479g != null) {
            this.f27478f = new DeviceSettingsDTO.t[]{DeviceSettingsDTO.t.SHORT, DeviceSettingsDTO.t.MEDIUM, DeviceSettingsDTO.t.LONG, DeviceSettingsDTO.t.VERY_LONG};
            this.f27477e = new int[]{R.string.screen_timeout_short, R.string.screen_timeout_medium, R.string.screen_timeout_long, R.string.timeout_verylong};
        }
        return deviceSettingsDTO.w0() != null;
    }

    @Override // fb2.t
    public final Map<DeviceSettingsDTO.t, CharSequence> q(DeviceSettingsDTO.t[] tVarArr) {
        DeviceSettingsDTO.t[] tVarArr2 = tVarArr;
        HashMap map = new HashMap();
        if (tVarArr2 != null) {
            for (int i14 = 0; i14 < tVarArr2.length; i14++) {
                map.put(tVarArr2[i14], this.f70343a.getString(this.f27477e[i14]));
            }
        }
        return map;
    }

    @Override // fb2.t
    public final DeviceSettingsDTO.t r(DeviceSettingsDTO deviceSettingsDTO) {
        DeviceSettingsDTO deviceSettingsDTO2 = deviceSettingsDTO;
        if (deviceSettingsDTO2 != null) {
            return deviceSettingsDTO2.w0();
        }
        vb.h.s("Model is required");
        return null;
    }

    @Override // fb2.t
    public final int t() {
        return f27476h;
    }

    @Override // fb2.t
    public final String u() {
        return this.f70343a.getString(R.string.device_setting_timeout);
    }

    @Override // fb2.t
    public final DeviceSettingsDTO.t[] v(DeviceSettingsDTO deviceSettingsDTO) {
        return this.f27478f;
    }

    @Override // fb2.t
    public final void w(DeviceSettingsDTO.t tVar, DeviceSettingsDTO deviceSettingsDTO) {
        DeviceSettingsDTO.t tVar2 = tVar;
        DeviceSettingsDTO deviceSettingsDTO2 = deviceSettingsDTO;
        if (deviceSettingsDTO2 == null) {
            vb.h.s("Model is required");
            return;
        }
        tVar2.getClass();
        deviceSettingsDTO2.f33861a1 = tVar2.f34060a;
        deviceSettingsDTO2.S1("screenTimeout");
    }

    public u5(Context context) {
        super(context);
        this.f27477e = new int[]{R.string.screen_timeout_short, R.string.screen_timeout_medium, R.string.screen_timeout_long};
        this.f27478f = new DeviceSettingsDTO.t[]{DeviceSettingsDTO.t.SHORT, DeviceSettingsDTO.t.MEDIUM, DeviceSettingsDTO.t.LONG};
    }
}
