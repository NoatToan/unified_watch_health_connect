package ch1;

import android.content.Context;
import com.garmin.android.apps.connectmobile.R;
import com.garmin.android.apps.connectmobile.devices.model.DeviceSettingsDTO;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes10.dex */
public class i1 extends fb2.t<DeviceSettingsDTO, DeviceSettingsDTO.a> {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final DeviceSettingsDTO.a[] f27373e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final HashMap f27374f;

    static {
        DeviceSettingsDTO.a aVar = DeviceSettingsDTO.a.ALWAYS;
        DeviceSettingsDTO.a aVar2 = DeviceSettingsDTO.a.DURING_ACTIVITY;
        DeviceSettingsDTO.a aVar3 = DeviceSettingsDTO.a.NEVER;
        f27373e = new DeviceSettingsDTO.a[]{aVar, aVar2, aVar3};
        HashMap map = new HashMap();
        f27374f = map;
        map.put(aVar, Integer.valueOf(R.string.lbl_on));
        map.put(aVar2, Integer.valueOf(R.string.device_autodisplay_during_activity));
        map.put(aVar3, Integer.valueOf(R.string.device_setting_auto_backlight_off));
    }

    public i1(Context context) {
        super(context);
    }

    @Override // fb2.e
    public final boolean h(Object obj) {
        return ((DeviceSettingsDTO) obj).T != null;
    }

    @Override // fb2.t
    public final Map<DeviceSettingsDTO.a, CharSequence> q(DeviceSettingsDTO.a[] aVarArr) {
        HashMap map = new HashMap();
        for (DeviceSettingsDTO.a aVar : aVarArr) {
            HashMap map2 = f27374f;
            if (map2.containsKey(aVar)) {
                map.put(aVar, this.f70343a.getString(((Integer) map2.get(aVar)).intValue()));
            }
        }
        return map;
    }

    @Override // fb2.t
    public final DeviceSettingsDTO.a r(DeviceSettingsDTO deviceSettingsDTO) {
        return deviceSettingsDTO.M();
    }

    @Override // fb2.t
    public final int t() {
        return R.id.gesture_btn;
    }

    @Override // fb2.t
    public final String u() {
        return this.f70343a.getString(R.string.device_setting_gesture);
    }

    @Override // fb2.t
    public final DeviceSettingsDTO.a[] v(DeviceSettingsDTO deviceSettingsDTO) {
        DeviceSettingsDTO deviceSettingsDTO2 = deviceSettingsDTO;
        deviceSettingsDTO2.getClass();
        ArrayList arrayList = new ArrayList();
        if (deviceSettingsDTO2.T != null) {
            arrayList.add(DeviceSettingsDTO.a.ALWAYS);
            arrayList.add(DeviceSettingsDTO.a.DURING_ACTIVITY);
            arrayList.add(DeviceSettingsDTO.a.NEVER);
        }
        ArrayList arrayList2 = new ArrayList();
        for (DeviceSettingsDTO.a aVar : f27373e) {
            if (arrayList.contains(aVar)) {
                arrayList2.add(aVar);
            }
        }
        return (DeviceSettingsDTO.a[]) arrayList2.toArray(new DeviceSettingsDTO.a[0]);
    }

    @Override // fb2.t
    public final void w(DeviceSettingsDTO.a aVar, DeviceSettingsDTO deviceSettingsDTO) {
        DeviceSettingsDTO.a aVar2 = aVar;
        DeviceSettingsDTO deviceSettingsDTO2 = deviceSettingsDTO;
        if (aVar2 != null) {
            deviceSettingsDTO2.getClass();
            deviceSettingsDTO2.T = aVar2.f33917a;
            deviceSettingsDTO2.S1("gestureMode");
        }
    }
}
