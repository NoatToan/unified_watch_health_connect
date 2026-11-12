package com.garmin.android.apps.connectmobile.settings.devices;

import android.os.Bundle;
import android.view.View;
import com.garmin.android.apps.connectmobile.R;
import com.garmin.android.apps.connectmobile.devices.model.DeviceSettingsDTO;
import com.garmin.android.apps.connectmobile.view.view_3_0.GCMComplexOneLineButton;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0017\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/garmin/android/apps/connectmobile/settings/devices/Fenix3HRDeviceSettings;", "Lcom/garmin/android/apps/connectmobile/settings/devices/ForerunnerDeviceSettings;", "<init>", "()V", "gcm-device-settings_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public class Fenix3HRDeviceSettings extends ForerunnerDeviceSettings {
    public static final /* synthetic */ int P = 0;
    public final com.google.android.material.chip.a I = new com.google.android.material.chip.a(this, 8);

    @Override // com.garmin.android.apps.connectmobile.settings.devices.ForerunnerDeviceSettings, ng1.j
    public final int ea() {
        return R.layout.gcm3_device_settings_forerunner;
    }

    @Override // ng1.j
    public final GCMComplexOneLineButton ia() {
        View viewFindViewById = findViewById(R.id.device_settings_weather);
        viewFindViewById.getClass();
        return (GCMComplexOneLineButton) viewFindViewById;
    }

    @Override // com.garmin.android.apps.connectmobile.settings.devices.ForerunnerDeviceSettings, ng1.j, ng1.p, com.garmin.android.apps.connectmobile.c, com.garmin.android.apps.connectmobile.z1, com.garmin.android.apps.connectmobile.v, androidx.fragment.app.m, b.g, z6.e, android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        DeviceSettingsDTO deviceSettingsDTO = this.f125985k;
        if (deviceSettingsDTO == null || deviceSettingsDTO.s1("opticalHeartRateEnabled")) {
            return;
        }
        View viewFindViewById = findViewById(R.id.device_settings_heart_rate_monitor_btn);
        viewFindViewById.getClass();
        GCMComplexOneLineButton gCMComplexOneLineButton = (GCMComplexOneLineButton) viewFindViewById;
        gCMComplexOneLineButton.setVisibility(0);
        gCMComplexOneLineButton.setOnCheckedChangeListener(this.I);
        DeviceSettingsDTO deviceSettingsDTO2 = this.f125985k;
        deviceSettingsDTO2.getClass();
        if (deviceSettingsDTO2.v1()) {
            gCMComplexOneLineButton.k();
        } else {
            gCMComplexOneLineButton.j();
        }
    }
}
