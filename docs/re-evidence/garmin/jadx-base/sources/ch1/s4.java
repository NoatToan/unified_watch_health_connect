package ch1;

import android.content.Context;
import android.view.View;
import com.garmin.android.apps.connectmobile.R;
import com.garmin.android.apps.connectmobile.devices.model.DeviceSettingsDTO;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes10.dex */
public class s4 extends fb2.r<DeviceSettingsDTO, DeviceSettingsDTO.p> {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final HashMap f27455g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final HashMap f27456h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final int f27457i;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final boolean f27458f;

    static {
        HashMap map = new HashMap();
        f27455g = map;
        map.put(DeviceSettingsDTO.p.TWELVE_HOUR, Integer.valueOf(View.generateViewId()));
        map.put(DeviceSettingsDTO.p.TWENTY_FOUR_HOUR, Integer.valueOf(View.generateViewId()));
        map.put(DeviceSettingsDTO.p.MILITARY, Integer.valueOf(View.generateViewId()));
        f27456h = new HashMap();
        f27457i = View.generateViewId();
    }

    public s4(Context context) {
        super(context);
        this.f27458f = false;
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

    @Override // fb2.r
    public final Map<DeviceSettingsDTO.p, CharSequence> r(DeviceSettingsDTO.p[] pVarArr) {
        HashMap map = f27456h;
        if (map.isEmpty()) {
            DeviceSettingsDTO.p pVar = DeviceSettingsDTO.p.TWELVE_HOUR;
            map.put(pVar, this.f70343a.getString(pVar.f34017b));
            DeviceSettingsDTO.p pVar2 = DeviceSettingsDTO.p.TWENTY_FOUR_HOUR;
            map.put(pVar2, this.f70343a.getString(pVar2.f34017b));
            DeviceSettingsDTO.p pVar3 = DeviceSettingsDTO.p.MILITARY;
            map.put(pVar3, this.f70343a.getString(pVar3.f34017b));
        }
        return map;
    }

    @Override // fb2.r
    public final DeviceSettingsDTO.p s(DeviceSettingsDTO deviceSettingsDTO) {
        DeviceSettingsDTO deviceSettingsDTO2 = deviceSettingsDTO;
        if (deviceSettingsDTO2 != null) {
            return deviceSettingsDTO2.h0();
        }
        vb.h.s("Model is required");
        return null;
    }

    @Override // fb2.r
    public final int t() {
        return f27457i;
    }

    @Override // fb2.r
    public final DeviceSettingsDTO.p[] v(DeviceSettingsDTO deviceSettingsDTO) {
        return this.f27458f ? new DeviceSettingsDTO.p[]{DeviceSettingsDTO.p.TWELVE_HOUR, DeviceSettingsDTO.p.TWENTY_FOUR_HOUR, DeviceSettingsDTO.p.MILITARY} : new DeviceSettingsDTO.p[]{DeviceSettingsDTO.p.TWELVE_HOUR, DeviceSettingsDTO.p.TWENTY_FOUR_HOUR};
    }

    @Override // fb2.r
    public final int w() {
        return R.string.lbl_time_format;
    }

    @Override // fb2.r
    public final Map<DeviceSettingsDTO.p, Integer> x() {
        return f27455g;
    }

    @Override // fb2.r
    public final void z(DeviceSettingsDTO.p pVar, DeviceSettingsDTO deviceSettingsDTO) {
        DeviceSettingsDTO.p pVar2 = pVar;
        DeviceSettingsDTO deviceSettingsDTO2 = deviceSettingsDTO;
        if (deviceSettingsDTO2 != null) {
            deviceSettingsDTO2.I1(pVar2);
        } else {
            vb.h.s("Model is required");
        }
    }

    public s4(Context context, boolean z14) {
        this(context);
        this.f27458f = z14;
    }
}
