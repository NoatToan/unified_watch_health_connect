package com.garmin.android.apps.connectmobile.settings.devices;

import ch1.a6;
import ch1.b6;
import ch1.g3;
import ch1.k2;
import ch1.s2;
import ch1.s4;
import ch1.v;
import com.garmin.android.apps.connectmobile.settings.devices.common.DeviceGeneralSettingActivityDefault;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes10.dex */
public class EdgeGeneralSettingActivity extends DeviceGeneralSettingActivityDefault {
    @Override // com.garmin.android.apps.connectmobile.settings.devices.common.DeviceGeneralSettingActivityDefault, ng1.k0
    public final void fa() {
        ArrayList arrayList = this.f125956m;
        arrayList.clear();
        v vVar = new v(this, this.f125976b);
        vVar.f27482k = false;
        boolean booleanExtra = getIntent().getExtras() != null ? getIntent().getBooleanExtra("MilitaryTimeFormatSupported", false) : false;
        arrayList.add(vVar);
        arrayList.add(new g3(this));
        arrayList.add(new s4(this, booleanExtra));
        arrayList.add(new k2(this));
        if (this.f125977c.X0()) {
            arrayList.add(new s2(this));
        }
        arrayList.add(new b6(this, this.f125976b));
        arrayList.add(new a6(this, this.f125976b));
    }

    @Override // com.garmin.android.apps.connectmobile.settings.devices.common.DeviceGeneralSettingActivityDefault, ng1.k0
    public final void ha() {
        super.ha();
        for (fb2.e eVar : this.f125956m) {
            if (eVar instanceof v) {
                eVar.l(true);
            }
        }
    }
}
