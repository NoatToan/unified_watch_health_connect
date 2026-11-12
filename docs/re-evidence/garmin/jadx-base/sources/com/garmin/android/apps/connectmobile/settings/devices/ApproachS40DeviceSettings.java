package com.garmin.android.apps.connectmobile.settings.devices;

import android.os.Bundle;
import ch1.v;
import ch1.v2;
import ch1.y0;
import com.garmin.android.apps.connectmobile.R;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes10.dex */
public class ApproachS40DeviceSettings extends Fenix5DeviceSettings {
    @Override // com.garmin.android.apps.connectmobile.settings.devices.Forerunner935DeviceSettings, ng1.j
    public int ea() {
        return R.layout.gcm3_device_settings_approach_s40;
    }

    @Override // com.garmin.android.apps.connectmobile.settings.devices.Forerunner935DeviceSettings, ng1.j, ng1.p, com.garmin.android.apps.connectmobile.c, com.garmin.android.apps.connectmobile.z1, com.garmin.android.apps.connectmobile.v, androidx.fragment.app.m, b.g, z6.e, android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        ArrayList arrayList = this.f42119t;
        arrayList.clear();
        arrayList.add(new v(this, this.f125976b));
        arrayList.add(new ch1.b(this));
        arrayList.add(new y0(this));
        arrayList.add(new v2(this));
        la();
    }
}
