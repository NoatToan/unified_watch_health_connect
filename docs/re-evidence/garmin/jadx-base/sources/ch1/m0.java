package ch1;

import android.content.Context;
import android.view.View;
import com.garmin.android.apps.connectmobile.R;
import com.garmin.android.apps.connectmobile.devices.model.DeviceSettingsDTO;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes10.dex */
public class m0 extends fb2.r<DeviceSettingsDTO, DeviceSettingsDTO.j> {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final HashMap f27409f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final HashMap f27410g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final int f27411h;

    static {
        HashMap map = new HashMap();
        f27409f = map;
        map.put(DeviceSettingsDTO.j.DATE_MONTH_DAY, Integer.valueOf(View.generateViewId()));
        map.put(DeviceSettingsDTO.j.DATE_DAY_MONTH, Integer.valueOf(View.generateViewId()));
        f27410g = new HashMap();
        f27411h = View.generateViewId();
    }

    public m0(Context context) {
        super(context);
    }

    @Override // fb2.e
    public final boolean h(Object obj) {
        DeviceSettingsDTO deviceSettingsDTO = (DeviceSettingsDTO) obj;
        if (deviceSettingsDTO != null) {
            return deviceSettingsDTO.f33864c != null;
        }
        vb.h.s("Model is required");
        return false;
    }

    @Override // fb2.r
    public final Map<DeviceSettingsDTO.j, CharSequence> r(DeviceSettingsDTO.j[] jVarArr) {
        HashMap map = f27410g;
        if (map.isEmpty()) {
            DeviceSettingsDTO.j jVar = DeviceSettingsDTO.j.DATE_MONTH_DAY;
            map.put(jVar, this.f70343a.getString(jVar.f33976b));
            DeviceSettingsDTO.j jVar2 = DeviceSettingsDTO.j.DATE_DAY_MONTH;
            map.put(jVar2, this.f70343a.getString(jVar2.f33976b));
        }
        return map;
    }

    @Override // fb2.r
    public final DeviceSettingsDTO.j s(DeviceSettingsDTO deviceSettingsDTO) {
        DeviceSettingsDTO deviceSettingsDTO2 = deviceSettingsDTO;
        if (deviceSettingsDTO2 != null) {
            return deviceSettingsDTO2.a0();
        }
        vb.h.s("Model is required");
        return null;
    }

    @Override // fb2.r
    public final int t() {
        return f27411h;
    }

    @Override // fb2.r
    public final DeviceSettingsDTO.j[] v(DeviceSettingsDTO deviceSettingsDTO) {
        return new DeviceSettingsDTO.j[]{DeviceSettingsDTO.j.DATE_MONTH_DAY, DeviceSettingsDTO.j.DATE_DAY_MONTH};
    }

    @Override // fb2.r
    public final int w() {
        return R.string.lbl_date_format;
    }

    @Override // fb2.r
    public final Map<DeviceSettingsDTO.j, Integer> x() {
        return f27409f;
    }

    @Override // fb2.r
    public final void z(DeviceSettingsDTO.j jVar, DeviceSettingsDTO deviceSettingsDTO) {
        DeviceSettingsDTO.j jVar2 = jVar;
        DeviceSettingsDTO deviceSettingsDTO2 = deviceSettingsDTO;
        if (deviceSettingsDTO2 != null) {
            deviceSettingsDTO2.D1(jVar2);
        } else {
            vb.h.s("Model is required");
        }
    }
}
