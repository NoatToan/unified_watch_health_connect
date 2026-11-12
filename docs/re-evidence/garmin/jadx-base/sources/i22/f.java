package i22;

import com.garmin.android.apps.connectmobile.a2;
import com.garmin.android.apps.connectmobile.i2;
import com.garmin.android.apps.connectmobile.settings.GCMSettingManager;
import com.garmin.device.datatypes.DeviceProfile;
import hk0.p;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Set;

/* JADX INFO: loaded from: classes10.dex */
public final class f {
    public static final ArrayList a() {
        ArrayList arrayList = new ArrayList();
        Set<Long> setKeySet = GCMSettingManager.p().keySet();
        ArrayList arrayListD = p.d();
        ArrayList arrayList2 = new ArrayList();
        Iterator it = arrayListD.iterator();
        while (it.hasNext()) {
            arrayList2.add(Long.valueOf(((DeviceProfile) it.next()).getF92746j()));
        }
        i2.a aVar = i2.f36769a;
        aVar.getClass();
        i2.a.b(a2.GENERAL, "SignifLocUpdJobService", "DEVICES STATUS: subscribedDevices = " + setKeySet + " || connectedDevices=" + arrayList2);
        for (Long l14 : setKeySet) {
            if (arrayList2.contains(l14)) {
                l14.getClass();
                arrayList.add(l14);
            }
        }
        return arrayList;
    }
}
