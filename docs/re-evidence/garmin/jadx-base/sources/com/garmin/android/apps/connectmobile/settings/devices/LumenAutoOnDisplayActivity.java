package com.garmin.android.apps.connectmobile.settings.devices;

import ch1.o2;
import ch1.t5;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes10.dex */
public class LumenAutoOnDisplayActivity extends AutoOnDisplayActivity {
    @Override // com.garmin.android.apps.connectmobile.settings.devices.AutoOnDisplayActivity
    public final void ca() {
        ArrayList arrayList = this.f41890b;
        arrayList.clear();
        arrayList.add(new o2(this));
        arrayList.add(new t5(this, false));
    }
}
