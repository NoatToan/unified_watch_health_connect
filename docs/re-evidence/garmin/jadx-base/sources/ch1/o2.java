package ch1;

import android.content.Context;
import android.view.View;
import com.garmin.android.apps.connectmobile.R;
import com.garmin.android.apps.connectmobile.devices.model.DeviceSettingsDTO;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes10.dex */
public class o2 extends fb2.t<DeviceSettingsDTO, DeviceSettingsDTO.c> {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final int f27425h = View.generateViewId();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int[] f27426e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public DeviceSettingsDTO.c[] f27427f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final Boolean f27428g;

    public o2(Context context, boolean z14) {
        super(context);
        this.f27426e = new int[]{R.string.screen_timeout_short, R.string.screen_timeout_medium, R.string.screen_timeout_long};
        this.f27427f = new DeviceSettingsDTO.c[]{DeviceSettingsDTO.c.SHORT, DeviceSettingsDTO.c.MEDIUM, DeviceSettingsDTO.c.LONG};
        this.f27428g = Boolean.valueOf(z14);
    }

    @Override // fb2.e
    public final boolean h(Object obj) {
        DeviceSettingsDTO deviceSettingsDTO = (DeviceSettingsDTO) obj;
        if (deviceSettingsDTO == null) {
            vb.h.s("Model is required");
            return false;
        }
        if (this.f27428g != null) {
            this.f27427f = new DeviceSettingsDTO.c[]{DeviceSettingsDTO.c.SHORT, DeviceSettingsDTO.c.MEDIUM, DeviceSettingsDTO.c.LONG, DeviceSettingsDTO.c.VERY_LONG};
            this.f27426e = new int[]{R.string.screen_timeout_short, R.string.screen_timeout_medium, R.string.screen_timeout_long, R.string.timeout_verylong};
        }
        return deviceSettingsDTO.w0() != null;
    }

    @Override // fb2.t
    public final Map<DeviceSettingsDTO.c, CharSequence> q(DeviceSettingsDTO.c[] cVarArr) {
        DeviceSettingsDTO.c[] cVarArr2 = cVarArr;
        HashMap map = new HashMap();
        if (cVarArr2 != null) {
            for (int i14 = 0; i14 < cVarArr2.length; i14++) {
                map.put(cVarArr2[i14], this.f70343a.getString(this.f27426e[i14]));
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
        return f27425h;
    }

    @Override // fb2.t
    public final String u() {
        return this.f70343a.getString(R.string.device_setting_timeout);
    }

    @Override // fb2.t
    public final DeviceSettingsDTO.c[] v(DeviceSettingsDTO deviceSettingsDTO) {
        return this.f27427f;
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

    public o2(Context context) {
        super(context);
        this.f27426e = new int[]{R.string.screen_timeout_short, R.string.screen_timeout_medium, R.string.screen_timeout_long};
        this.f27427f = new DeviceSettingsDTO.c[]{DeviceSettingsDTO.c.SHORT, DeviceSettingsDTO.c.MEDIUM, DeviceSettingsDTO.c.LONG};
    }
}
