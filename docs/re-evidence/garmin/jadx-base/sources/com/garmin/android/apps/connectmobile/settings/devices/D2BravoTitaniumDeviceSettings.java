package com.garmin.android.apps.connectmobile.settings.devices;

import com.garmin.android.apps.connectmobile.R;
import com.garmin.android.apps.connectmobile.view.view_3_0.GCMComplexOneLineButton;

/* JADX INFO: loaded from: classes10.dex */
public class D2BravoTitaniumDeviceSettings extends Fenix3HRDeviceSettings {
    @Override // ng1.j
    public final GCMComplexOneLineButton ha() {
        GCMComplexOneLineButton gCMComplexOneLineButton = (GCMComplexOneLineButton) findViewById(R.id.device_settings_weather_btn);
        gCMComplexOneLineButton.setVisibility(0);
        return gCMComplexOneLineButton;
    }
}
