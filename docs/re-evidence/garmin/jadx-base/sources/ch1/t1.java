package ch1;

import android.content.Context;
import com.garmin.android.apps.connectmobile.devices.model.DeviceSettingsDTO;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes10.dex */
public class t1 extends u1 {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final com.garmin.android.apps.connectmobile.devices.model.o.c f27463g = com.garmin.android.apps.connectmobile.devices.model.o.c.f34281d;

    public t1(Context context, com.garmin.android.apps.connectmobile.devices.model.o.c[] cVarArr) {
        super(context);
        this.f27472f = cVarArr == null ? new com.garmin.android.apps.connectmobile.devices.model.o.c[0] : cVarArr;
    }

    @Override // fb2.e
    public final boolean h(Object obj) {
        DeviceSettingsDTO deviceSettingsDTO = (DeviceSettingsDTO) obj;
        if (deviceSettingsDTO != null) {
            return deviceSettingsDTO.f33863b1.f185491i != null;
        }
        vb.h.s("Model is required");
        return false;
    }

    @Override // fb2.t
    public final com.garmin.android.apps.connectmobile.devices.model.o.c r(DeviceSettingsDTO deviceSettingsDTO) {
        com.garmin.android.apps.connectmobile.devices.model.o oVar;
        DeviceSettingsDTO deviceSettingsDTO2 = deviceSettingsDTO;
        if (deviceSettingsDTO2 == null) {
            vb.h.s("Model is required");
            return null;
        }
        String str = deviceSettingsDTO2.f33863b1.f185492j;
        if (str == null) {
            str = null;
        }
        com.garmin.android.apps.connectmobile.devices.model.o.f34279b.getClass();
        com.garmin.android.apps.connectmobile.devices.model.o.c cVarB = com.garmin.android.apps.connectmobile.devices.model.o.b.b(str, com.garmin.android.apps.connectmobile.devices.model.o.c.f34281d);
        boolean zI = false;
        if (deviceSettingsDTO2.Q0() && (oVar = deviceSettingsDTO2.f33863b1.f185491i) != null && cVarB != null) {
            zI = oVar.I(cVarB.f34302a);
        }
        if (zI) {
            return cVarB;
        }
        wi1.c cVar = deviceSettingsDTO2.f33863b1;
        com.garmin.android.apps.connectmobile.devices.model.o oVar2 = cVar.f185491i;
        com.garmin.android.apps.connectmobile.devices.model.o.c cVar2 = f27463g;
        if (oVar2 != null) {
            cVar.f185492j = cVar2.f34302a;
        }
        return cVar2;
    }

    @Override // fb2.t
    public final com.garmin.android.apps.connectmobile.devices.model.o.c[] v(DeviceSettingsDTO deviceSettingsDTO) {
        com.garmin.android.apps.connectmobile.devices.model.o oVar;
        DeviceSettingsDTO deviceSettingsDTO2 = deviceSettingsDTO;
        if (deviceSettingsDTO2 == null) {
            vb.h.s("Model is required");
            return null;
        }
        ArrayList arrayListE0 = deviceSettingsDTO2.E0();
        if (arrayListE0 == null) {
            return new com.garmin.android.apps.connectmobile.devices.model.o.c[0];
        }
        ArrayList arrayList = new ArrayList();
        arrayList.add(f27463g);
        com.garmin.android.apps.connectmobile.devices.model.o.c[] cVarArr = this.f27472f;
        for (int i14 = 0; i14 < cVarArr.length; i14++) {
            if (arrayListE0.contains(cVarArr[i14])) {
                com.garmin.android.apps.connectmobile.devices.model.o.c cVar = cVarArr[i14];
                if ((!deviceSettingsDTO2.Q0() || (oVar = deviceSettingsDTO2.f33863b1.f185491i) == null || cVar == null) ? false : oVar.I(cVar.f34302a)) {
                    arrayList.add(cVarArr[i14]);
                }
            }
        }
        return (com.garmin.android.apps.connectmobile.devices.model.o.c[]) arrayList.toArray(new com.garmin.android.apps.connectmobile.devices.model.o.c[0]);
    }

    @Override // fb2.t
    public final void w(com.garmin.android.apps.connectmobile.devices.model.o.c cVar, DeviceSettingsDTO deviceSettingsDTO) {
        com.garmin.android.apps.connectmobile.devices.model.o.c cVar2 = cVar;
        DeviceSettingsDTO deviceSettingsDTO2 = deviceSettingsDTO;
        if (deviceSettingsDTO2 == null) {
            vb.h.s("Model is required");
            return;
        }
        wi1.c cVar3 = deviceSettingsDTO2.f33863b1;
        if (cVar3.f185491i != null) {
            cVar3.f185492j = cVar2.f34302a;
        }
    }
}
