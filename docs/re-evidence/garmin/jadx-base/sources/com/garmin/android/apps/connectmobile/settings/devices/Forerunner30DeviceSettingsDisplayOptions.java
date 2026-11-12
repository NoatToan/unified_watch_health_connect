package com.garmin.android.apps.connectmobile.settings.devices;

import com.garmin.android.apps.connectmobile.settings.devices.common.DeviceSettingsDisplayOptionsDefault;
import fh1.p0;
import fh1.t0;
import fh1.w0;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes10.dex */
public class Forerunner30DeviceSettingsDisplayOptions extends DeviceSettingsDisplayOptionsDefault {
    @Override // com.garmin.android.apps.connectmobile.settings.devices.common.DeviceSettingsDisplayOptionsDefault
    public final void ca() {
        super.ca();
        ArrayList arrayList = this.f42746b;
        int size = arrayList.size();
        for (int i14 = 0; i14 < size; i14++) {
            fb2.e eVar = (fb2.e) arrayList.get(i14);
            if (eVar instanceof fb2.a) {
                fb2.a aVar = (fb2.a) eVar;
                if ((aVar instanceof w0) || (aVar instanceof t0) || (aVar instanceof p0)) {
                    aVar.l(false);
                }
            }
        }
    }
}
