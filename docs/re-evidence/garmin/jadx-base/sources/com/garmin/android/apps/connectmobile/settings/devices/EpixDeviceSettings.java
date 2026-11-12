package com.garmin.android.apps.connectmobile.settings.devices;

import android.os.Bundle;
import android.widget.LinearLayout;
import com.garmin.android.apps.connectmobile.R;

/* JADX INFO: loaded from: classes10.dex */
public class EpixDeviceSettings extends ForerunnerDeviceSettings {
    @Override // com.garmin.android.apps.connectmobile.settings.devices.ForerunnerDeviceSettings, ng1.j, ng1.p, com.garmin.android.apps.connectmobile.c, com.garmin.android.apps.connectmobile.z1, com.garmin.android.apps.connectmobile.v, androidx.fragment.app.m, b.g, z6.e, android.app.Activity
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-1, -2);
        layoutParams.setMargins(0, (int) getResources().getDimension(R.dimen.gcm3_device_settings_margin_top), 0, 0);
        this.f42132v.setLayoutParams(layoutParams);
    }
}
