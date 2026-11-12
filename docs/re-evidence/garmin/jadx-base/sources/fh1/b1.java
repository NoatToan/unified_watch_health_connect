package fh1;

import com.garmin.android.apps.connectmobile.devices.model.DeviceSettingsDTO;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes10.dex */
public class b1 {
    public static com.garmin.android.apps.connectmobile.devices.model.o.c[] a(DeviceSettingsDTO deviceSettingsDTO, com.garmin.android.apps.connectmobile.devices.model.o.c[] cVarArr) {
        com.garmin.android.apps.connectmobile.devices.model.o oVar;
        ArrayList arrayListC = null;
        if (deviceSettingsDTO.f33870f != null && (oVar = deviceSettingsDTO.f33872g) != null) {
            arrayListC = oVar.C(true);
        }
        return b(deviceSettingsDTO, cVarArr, arrayListC);
    }

    public static com.garmin.android.apps.connectmobile.devices.model.o.c[] b(DeviceSettingsDTO deviceSettingsDTO, com.garmin.android.apps.connectmobile.devices.model.o.c[] cVarArr, ArrayList arrayList) {
        if (deviceSettingsDTO == null || arrayList == null) {
            return new com.garmin.android.apps.connectmobile.devices.model.o.c[0];
        }
        if (cVarArr == null) {
            return (com.garmin.android.apps.connectmobile.devices.model.o.c[]) arrayList.toArray(new com.garmin.android.apps.connectmobile.devices.model.o.c[0]);
        }
        ArrayList arrayList2 = new ArrayList();
        for (int i14 = 0; i14 < cVarArr.length; i14++) {
            if (arrayList.contains(cVarArr[i14])) {
                arrayList2.add(cVarArr[i14]);
            }
        }
        return (com.garmin.android.apps.connectmobile.devices.model.o.c[]) arrayList2.toArray(new com.garmin.android.apps.connectmobile.devices.model.o.c[0]);
    }
}
