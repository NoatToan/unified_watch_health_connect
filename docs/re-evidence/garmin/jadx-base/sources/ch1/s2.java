package ch1;

import android.content.Context;
import android.view.View;
import com.garmin.android.apps.connectmobile.R;
import com.garmin.android.apps.connectmobile.devices.model.DeviceSettingsDTO;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes10.dex */
public class s2 extends fb2.r<DeviceSettingsDTO, DeviceSettingsDTO.l> {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final HashMap f27451f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final HashMap f27452g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final int f27453h;

    static {
        HashMap map = new HashMap();
        f27451f = map;
        f27452g = new HashMap();
        f27453h = View.generateViewId();
        map.put(DeviceSettingsDTO.l.STATUTE, Integer.valueOf(View.generateViewId()));
        map.put(DeviceSettingsDTO.l.METRIC, Integer.valueOf(View.generateViewId()));
    }

    public s2(Context context) {
        super(context);
    }

    @Override // fb2.e
    public final boolean h(Object obj) {
        return ((DeviceSettingsDTO) obj).f33866d != null;
    }

    @Override // fb2.r
    public final Map<DeviceSettingsDTO.l, CharSequence> r(DeviceSettingsDTO.l[] lVarArr) {
        HashMap map = f27452g;
        if (map.isEmpty()) {
            DeviceSettingsDTO.l lVar = DeviceSettingsDTO.l.STATUTE;
            map.put(lVar, this.f70343a.getString(lVar.f33990b));
            DeviceSettingsDTO.l lVar2 = DeviceSettingsDTO.l.METRIC;
            map.put(lVar2, this.f70343a.getString(lVar2.f33990b));
        }
        return map;
    }

    @Override // fb2.r
    public final DeviceSettingsDTO.l s(DeviceSettingsDTO deviceSettingsDTO) {
        return deviceSettingsDTO.c0();
    }

    @Override // fb2.r
    public final int t() {
        return f27453h;
    }

    @Override // fb2.r
    public final DeviceSettingsDTO.l[] v(DeviceSettingsDTO deviceSettingsDTO) {
        return new DeviceSettingsDTO.l[]{DeviceSettingsDTO.l.STATUTE, DeviceSettingsDTO.l.METRIC};
    }

    @Override // fb2.r
    public final int w() {
        return R.string.pref_measurement_units;
    }

    @Override // fb2.r
    public final Map<DeviceSettingsDTO.l, Integer> x() {
        return f27451f;
    }

    @Override // fb2.r
    public final void z(DeviceSettingsDTO.l lVar, DeviceSettingsDTO deviceSettingsDTO) {
        DeviceSettingsDTO.l lVar2 = lVar;
        DeviceSettingsDTO deviceSettingsDTO2 = deviceSettingsDTO;
        if (lVar2 != null) {
            deviceSettingsDTO2.F1(lVar2);
        }
    }
}
