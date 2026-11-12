package ch1;

import android.content.Context;
import com.garmin.android.apps.connectmobile.devices.model.DeviceSettingsDTO;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes10.dex */
public class s1 extends u1 {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final com.garmin.android.apps.connectmobile.devices.model.o.c f27449h = com.garmin.android.apps.connectmobile.devices.model.o.c.f34281d;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final boolean f27450g;

    public s1(Context context, com.garmin.android.apps.connectmobile.devices.model.o.c[] cVarArr, boolean z14) {
        super(context);
        this.f27450g = z14;
        this.f27472f = cVarArr == null ? new com.garmin.android.apps.connectmobile.devices.model.o.c[0] : cVarArr;
    }

    @Override // fb2.e
    public final boolean h(Object obj) {
        DeviceSettingsDTO deviceSettingsDTO = (DeviceSettingsDTO) obj;
        if (deviceSettingsDTO != null) {
            return (deviceSettingsDTO.A == null && deviceSettingsDTO.f33870f == null && deviceSettingsDTO.f33872g == null) ? false : true;
        }
        vb.h.s("Model is required");
        return false;
    }

    @Override // fb2.t
    public final com.garmin.android.apps.connectmobile.devices.model.o.c r(DeviceSettingsDTO deviceSettingsDTO) {
        DeviceSettingsDTO deviceSettingsDTO2 = deviceSettingsDTO;
        if (deviceSettingsDTO2 == null) {
            vb.h.s("Model is required");
            return null;
        }
        com.garmin.android.apps.connectmobile.devices.model.o.b bVar = com.garmin.android.apps.connectmobile.devices.model.o.f34279b;
        String str = deviceSettingsDTO2.A;
        bVar.getClass();
        com.garmin.android.apps.connectmobile.devices.model.o.c cVarA = com.garmin.android.apps.connectmobile.devices.model.o.b.a(str, com.garmin.android.apps.connectmobile.devices.model.o.c.f34281d);
        if (this.f27450g && cVarA == com.garmin.android.apps.connectmobile.devices.model.o.c.f34289l) {
            cVarA = com.garmin.android.apps.connectmobile.devices.model.o.c.f34290m;
        }
        com.garmin.android.apps.connectmobile.devices.model.o oVar = deviceSettingsDTO2.f33872g;
        boolean zI = false;
        if (oVar != null && cVarA != null) {
            zI = oVar.I(cVarA.f34302a);
        }
        if (zI) {
            return cVarA;
        }
        com.garmin.android.apps.connectmobile.devices.model.o.c cVar = f27449h;
        if (cVar != null) {
            deviceSettingsDTO2.A1(cVar.f34302a);
        }
        return cVar;
    }

    @Override // fb2.t
    public final com.garmin.android.apps.connectmobile.devices.model.o.c[] v(DeviceSettingsDTO deviceSettingsDTO) {
        com.garmin.android.apps.connectmobile.devices.model.o oVar;
        DeviceSettingsDTO deviceSettingsDTO2 = deviceSettingsDTO;
        if (deviceSettingsDTO2 == null) {
            vb.h.s("Model is required");
            return null;
        }
        ArrayList arrayListC = null;
        if (deviceSettingsDTO2.f33870f != null && (oVar = deviceSettingsDTO2.f33872g) != null) {
            arrayListC = oVar.C(true);
        }
        if (arrayListC == null) {
            return new com.garmin.android.apps.connectmobile.devices.model.o.c[0];
        }
        ArrayList arrayList = new ArrayList();
        arrayList.add(f27449h);
        com.garmin.android.apps.connectmobile.devices.model.o.c[] cVarArr = this.f27472f;
        for (int i14 = 0; i14 < cVarArr.length; i14++) {
            if (arrayListC.contains(cVarArr[i14])) {
                com.garmin.android.apps.connectmobile.devices.model.o.c cVar = cVarArr[i14];
                com.garmin.android.apps.connectmobile.devices.model.o oVar2 = deviceSettingsDTO2.f33872g;
                if ((oVar2 == null || cVar == null) ? false : oVar2.I(cVar.f34302a)) {
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
        } else if (cVar2 != null) {
            deviceSettingsDTO2.A1(cVar2.f34302a);
        }
    }
}
