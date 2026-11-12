package ch1;

import android.content.Context;
import com.garmin.android.apps.connectmobile.R;
import com.garmin.android.apps.connectmobile.devices.model.DeviceSettingsDTO;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes10.dex */
public class k1 extends fb2.t<DeviceSettingsDTO, DeviceSettingsDTO.k> {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final DeviceSettingsDTO.k[] f27396e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final HashMap f27397f;

    static {
        DeviceSettingsDTO.k kVar = DeviceSettingsDTO.k.ON;
        DeviceSettingsDTO.k kVar2 = DeviceSettingsDTO.k.NOT_IN_ACTIVITY;
        DeviceSettingsDTO.k kVar3 = DeviceSettingsDTO.k.OFF;
        f27396e = new DeviceSettingsDTO.k[]{kVar, kVar2, kVar3};
        HashMap map = new HashMap();
        f27397f = map;
        map.put(kVar, Integer.valueOf(R.string.lbl_on));
        map.put(kVar2, Integer.valueOf(R.string.device_settings_not_during_activity));
        map.put(kVar3, Integer.valueOf(R.string.lbl_off));
    }

    public k1(Context context) {
        super(context);
    }

    @Override // fb2.e
    public final boolean h(Object obj) {
        DeviceSettingsDTO deviceSettingsDTO = (DeviceSettingsDTO) obj;
        if (deviceSettingsDTO != null) {
            return deviceSettingsDTO.f33875h1 != null;
        }
        vb.h.s("Model is required");
        return false;
    }

    @Override // fb2.t
    public final Map<DeviceSettingsDTO.k, CharSequence> q(DeviceSettingsDTO.k[] kVarArr) {
        DeviceSettingsDTO.k[] kVarArr2 = kVarArr;
        HashMap map = new HashMap();
        if (kVarArr2 != null && kVarArr2.length > 0) {
            for (int i14 = 0; i14 < kVarArr2.length; i14++) {
                DeviceSettingsDTO.k kVar = kVarArr2[i14];
                HashMap map2 = f27397f;
                if (map2.containsKey(kVar)) {
                    map.put(kVarArr2[i14], this.f70343a.getString(((Integer) map2.get(kVarArr2[i14])).intValue()));
                }
            }
        }
        return map;
    }

    @Override // fb2.t
    public final DeviceSettingsDTO.k r(DeviceSettingsDTO deviceSettingsDTO) {
        DeviceSettingsDTO.k kVar;
        DeviceSettingsDTO deviceSettingsDTO2 = deviceSettingsDTO;
        if (deviceSettingsDTO2 == null) {
            vb.h.s("Model is required");
            return null;
        }
        DeviceSettingsDTO.k.a aVar = DeviceSettingsDTO.k.f33977b;
        String str = deviceSettingsDTO2.f33875h1;
        aVar.getClass();
        if (str == null) {
            kVar = DeviceSettingsDTO.k.ON;
            break;
        }
        w13.c cVar = DeviceSettingsDTO.k.f33982g;
        p13.c.b bVarN = com.airbnb.lottie.animation.keyframe.a.n(cVar, cVar);
        do {
            if (!bVarN.hasNext()) {
                kVar = DeviceSettingsDTO.k.ON;
                break;
            }
            kVar = (DeviceSettingsDTO.k) bVarN.next();
        } while (!p005kotlin.jvm.internal.s.g(kVar.f33983a, str));
        return (kVar == null || !f27397f.containsKey(kVar)) ? DeviceSettingsDTO.k.ON : kVar;
    }

    @Override // fb2.t
    public final int t() {
        return R.id.device_settings_goal_alerts_button;
    }

    @Override // fb2.t
    public final String u() {
        return this.f70343a.getString(R.string.device_settings_goal_alerts);
    }

    @Override // fb2.t
    public final DeviceSettingsDTO.k[] v(DeviceSettingsDTO deviceSettingsDTO) {
        DeviceSettingsDTO deviceSettingsDTO2 = deviceSettingsDTO;
        if (deviceSettingsDTO2 == null) {
            return new DeviceSettingsDTO.k[0];
        }
        ArrayList arrayList = new ArrayList();
        if (deviceSettingsDTO2.f33875h1 != null) {
            arrayList.add(DeviceSettingsDTO.k.ON);
            arrayList.add(DeviceSettingsDTO.k.NOT_IN_ACTIVITY);
            arrayList.add(DeviceSettingsDTO.k.OFF);
        }
        ArrayList arrayList2 = new ArrayList();
        int i14 = 0;
        while (true) {
            DeviceSettingsDTO.k[] kVarArr = f27396e;
            if (i14 >= kVarArr.length) {
                return (DeviceSettingsDTO.k[]) arrayList2.toArray(new DeviceSettingsDTO.k[0]);
            }
            if (arrayList.contains(kVarArr[i14])) {
                arrayList2.add(kVarArr[i14]);
            }
            i14++;
        }
    }

    @Override // fb2.t
    public final void w(DeviceSettingsDTO.k kVar, DeviceSettingsDTO deviceSettingsDTO) {
        DeviceSettingsDTO.k kVar2 = kVar;
        DeviceSettingsDTO deviceSettingsDTO2 = deviceSettingsDTO;
        if (deviceSettingsDTO2 == null) {
            vb.h.s("Model is required");
            return;
        }
        kVar2.getClass();
        String str = kVar2.f33983a;
        deviceSettingsDTO2.f33875h1 = str;
        deviceSettingsDTO2.S1(str);
    }
}
