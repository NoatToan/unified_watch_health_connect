package ch1;

import android.content.Context;
import android.view.View;
import com.garmin.android.apps.connectmobile.R;
import com.garmin.android.apps.connectmobile.devices.model.DeviceSettingsDTO;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes10.dex */
public class t5 extends fb2.t<DeviceSettingsDTO, DeviceSettingsDTO.g> {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final int f27467f = View.generateViewId();

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final DeviceSettingsDTO.g[] f27468g = {DeviceSettingsDTO.g.ON, DeviceSettingsDTO.g.DURING_ACTIVITY, DeviceSettingsDTO.g.OFF};

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final HashMap f27469h = new HashMap();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final boolean f27470e;

    public t5(Context context, boolean z14) {
        super(context);
        this.f27470e = z14;
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

    @Override // fb2.t
    public final Map<DeviceSettingsDTO.g, CharSequence> q(DeviceSettingsDTO.g[] gVarArr) {
        DeviceSettingsDTO.g[] gVarArr2 = gVarArr;
        HashMap map = new HashMap();
        if (gVarArr2 != null) {
            for (int i14 = 0; i14 < gVarArr2.length; i14++) {
                DeviceSettingsDTO.g gVar = gVarArr2[i14];
                HashMap map2 = f27469h;
                if (map2.containsKey(gVar)) {
                    map.put(gVarArr2[i14], this.f70343a.getString(((Integer) map2.get(gVarArr2[i14])).intValue()));
                }
            }
        }
        return map;
    }

    @Override // fb2.t
    public final DeviceSettingsDTO.g r(DeviceSettingsDTO deviceSettingsDTO) {
        DeviceSettingsDTO deviceSettingsDTO2 = deviceSettingsDTO;
        if (deviceSettingsDTO2 != null) {
            DeviceSettingsDTO.g gVarI = deviceSettingsDTO2.I();
            return (gVarI == null || !f27469h.containsKey(gVarI)) ? DeviceSettingsDTO.g.ON : gVarI;
        }
        vb.h.s("Model is required");
        return null;
    }

    @Override // fb2.t
    public final int t() {
        return f27467f;
    }

    @Override // fb2.t
    public String u() {
        return this.f70343a.getString(R.string.device_setting_gesture);
    }

    @Override // fb2.t
    public final DeviceSettingsDTO.g[] v(DeviceSettingsDTO deviceSettingsDTO) {
        DeviceSettingsDTO deviceSettingsDTO2 = deviceSettingsDTO;
        Integer numValueOf = Integer.valueOf(R.string.device_setting_auto_backlight_off);
        Integer numValueOf2 = Integer.valueOf(R.string.device_autodisplay_during_activity);
        if (deviceSettingsDTO2 == null) {
            return new DeviceSettingsDTO.g[0];
        }
        boolean z14 = this.f27470e;
        HashMap map = f27469h;
        if (z14) {
            ArrayList arrayList = new ArrayList();
            arrayList.add("ON");
            arrayList.add("DURING_ACTIVITY");
            arrayList.add("OFF");
            deviceSettingsDTO2.I = arrayList;
            map.clear();
            map.put(DeviceSettingsDTO.g.ON, Integer.valueOf(R.string.device_autodisplay_always_on));
            map.put(DeviceSettingsDTO.g.DURING_ACTIVITY, numValueOf2);
            map.put(DeviceSettingsDTO.g.OFF, numValueOf);
        } else {
            map.clear();
            map.put(DeviceSettingsDTO.g.ON, Integer.valueOf(R.string.lbl_on));
            map.put(DeviceSettingsDTO.g.DURING_ACTIVITY, numValueOf2);
            map.put(DeviceSettingsDTO.g.OFF, numValueOf);
        }
        ArrayList arrayListC0 = deviceSettingsDTO2.C0();
        ArrayList arrayList2 = new ArrayList();
        int i14 = 0;
        while (true) {
            DeviceSettingsDTO.g[] gVarArr = f27468g;
            if (i14 >= gVarArr.length) {
                return (DeviceSettingsDTO.g[]) arrayList2.toArray(new DeviceSettingsDTO.g[0]);
            }
            if (arrayListC0.contains(gVarArr[i14])) {
                arrayList2.add(gVarArr[i14]);
            }
            i14++;
        }
    }

    @Override // fb2.t
    public final void w(DeviceSettingsDTO.g gVar, DeviceSettingsDTO deviceSettingsDTO) {
        DeviceSettingsDTO.g gVar2 = gVar;
        DeviceSettingsDTO deviceSettingsDTO2 = deviceSettingsDTO;
        if (deviceSettingsDTO2 != null) {
            deviceSettingsDTO2.C1(gVar2);
        } else {
            vb.h.s("Model is required");
        }
    }
}
