package ch1;

import android.content.Context;
import com.garmin.android.apps.connectmobile.R;
import com.garmin.android.apps.connectmobile.devices.model.DeviceSettingsDTO;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes10.dex */
public class l5 extends q {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final DeviceSettingsDTO.g[] f27405f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final HashMap f27406g;

    static {
        DeviceSettingsDTO.g gVar = DeviceSettingsDTO.g.OFF;
        DeviceSettingsDTO.g gVar2 = DeviceSettingsDTO.g.AUTO_INTERACTION_ONLY;
        DeviceSettingsDTO.g gVar3 = DeviceSettingsDTO.g.AUTO_INTERACTION_GESTURE;
        f27405f = new DeviceSettingsDTO.g[]{gVar, gVar2, gVar3};
        HashMap map = new HashMap();
        f27406g = map;
        map.put(gVar, Integer.valueOf(R.string.device_setting_auto_backlight_off));
        map.put(gVar2, Integer.valueOf(R.string.device_setting_auto_backlight_interaction));
        map.put(gVar3, Integer.valueOf(R.string.device_setting_auto_backlight_interaction_and_gesture));
    }

    public l5(Context context) {
        super(context);
    }

    @Override // fb2.t
    public final Map<DeviceSettingsDTO.g, CharSequence> q(DeviceSettingsDTO.g[] gVarArr) {
        DeviceSettingsDTO.g[] gVarArr2 = gVarArr;
        HashMap map = new HashMap();
        if (gVarArr2 != null) {
            for (int i14 = 0; i14 < gVarArr2.length; i14++) {
                DeviceSettingsDTO.g gVar = gVarArr2[i14];
                HashMap map2 = f27406g;
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
            return (gVarI == null || !f27406g.containsKey(gVarI)) ? DeviceSettingsDTO.g.AUTO_INTERACTION_ONLY : gVarI;
        }
        vb.h.s("Model is required");
        return null;
    }

    @Override // fb2.t
    public final DeviceSettingsDTO.g[] v(DeviceSettingsDTO deviceSettingsDTO) {
        DeviceSettingsDTO deviceSettingsDTO2 = deviceSettingsDTO;
        if (deviceSettingsDTO2 == null) {
            return new DeviceSettingsDTO.g[0];
        }
        ArrayList arrayListC0 = deviceSettingsDTO2.C0();
        ArrayList arrayList = new ArrayList();
        int i14 = 0;
        while (true) {
            DeviceSettingsDTO.g[] gVarArr = f27405f;
            if (i14 >= gVarArr.length) {
                return (DeviceSettingsDTO.g[]) arrayList.toArray(new DeviceSettingsDTO.g[0]);
            }
            if (arrayListC0.contains(gVarArr[i14])) {
                arrayList.add(gVarArr[i14]);
            }
            i14++;
        }
    }
}
