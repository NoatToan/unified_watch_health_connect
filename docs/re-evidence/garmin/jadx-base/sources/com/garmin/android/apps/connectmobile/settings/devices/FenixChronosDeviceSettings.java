package com.garmin.android.apps.connectmobile.settings.devices;

import android.os.Bundle;
import com.garmin.android.apps.connectmobile.R;
import com.garmin.android.apps.connectmobile.view.view_3_0.GCMComplexOneLineButton;
import mt0.h0;

/* JADX INFO: loaded from: classes10.dex */
public class FenixChronosDeviceSettings extends Fenix3HRDeviceSettings {
    public static final /* synthetic */ int T = 0;

    @Override // com.garmin.android.apps.connectmobile.settings.devices.Fenix3HRDeviceSettings, com.garmin.android.apps.connectmobile.settings.devices.ForerunnerDeviceSettings, ng1.j, ng1.p, com.garmin.android.apps.connectmobile.c, com.garmin.android.apps.connectmobile.z1, com.garmin.android.apps.connectmobile.v, androidx.fragment.app.m, b.g, z6.e, android.app.Activity
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        GCMComplexOneLineButton gCMComplexOneLineButton = (GCMComplexOneLineButton) findViewById(R.id.device_settings_notifications_btn);
        gCMComplexOneLineButton.setVisible(true);
        gCMComplexOneLineButton.setOnClickListener(new h0(this, 15));
    }
}
