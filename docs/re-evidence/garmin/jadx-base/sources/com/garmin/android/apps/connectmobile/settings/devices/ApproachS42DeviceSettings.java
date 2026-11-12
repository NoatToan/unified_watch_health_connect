package com.garmin.android.apps.connectmobile.settings.devices;

import android.os.Bundle;
import ch1.v;
import ch1.v2;
import ch1.y0;
import com.garmin.android.apps.connectmobile.R;
import java.util.ArrayList;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/garmin/android/apps/connectmobile/settings/devices/ApproachS42DeviceSettings;", "Lcom/garmin/android/apps/connectmobile/settings/devices/ApproachS40DeviceSettings;", "<init>", "()V", "gcm-device-settings_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class ApproachS42DeviceSettings extends ApproachS40DeviceSettings {
    @Override // com.garmin.android.apps.connectmobile.settings.devices.ApproachS40DeviceSettings, com.garmin.android.apps.connectmobile.settings.devices.Forerunner935DeviceSettings, ng1.j
    public final int ea() {
        return R.layout.gcm3_device_settings_approach_s40;
    }

    @Override // com.garmin.android.apps.connectmobile.settings.devices.ApproachS40DeviceSettings, com.garmin.android.apps.connectmobile.settings.devices.Forerunner935DeviceSettings, ng1.j, ng1.p, com.garmin.android.apps.connectmobile.c, com.garmin.android.apps.connectmobile.z1, com.garmin.android.apps.connectmobile.v, androidx.fragment.app.m, b.g, z6.e, android.app.Activity
    public final void onCreate(Bundle bundle) {
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
