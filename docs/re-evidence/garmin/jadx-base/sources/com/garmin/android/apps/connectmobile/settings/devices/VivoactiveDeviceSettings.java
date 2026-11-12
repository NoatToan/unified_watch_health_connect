package com.garmin.android.apps.connectmobile.settings.devices;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import com.garmin.android.apps.connectmobile.R;
import com.garmin.android.apps.connectmobile.devices.model.DeviceSettingsDTO;
import com.garmin.android.apps.connectmobile.view.view_3_0.GCMComplexOneLineButton;
import com.garmin.android.apps.connectmobile.view.view_3_0.GCMComplexTwoLineButton;
import mt0.h0;
import ng1.j;

/* JADX INFO: loaded from: classes10.dex */
public class VivoactiveDeviceSettings extends j {

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public static final /* synthetic */ int f42206x = 0;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public GCMComplexTwoLineButton f42207t;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final h0 f42208v = new h0(this, 18);

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final a f42209w = new a();

    public class a implements View.OnClickListener {
        public a() {
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(View view2) {
            VivoactiveDeviceSettings vivoactiveDeviceSettings = VivoactiveDeviceSettings.this;
            int iOrdinal = vivoactiveDeviceSettings.f125985k.e0().ordinal();
            androidx.appcompat.app.e.a aVar = new androidx.appcompat.app.e.a(vivoactiveDeviceSettings);
            aVar.setTitle(R.string.device_setting_wrist_worn_on).setSingleChoiceItems(DeviceSettingsDTO.v.a(vivoactiveDeviceSettings), iOrdinal, new kx0.f(this, 22));
            aVar.create().show();
        }
    }

    @Override // ng1.j
    public final int ea() {
        return R.layout.gcm3_device_settings_vivoactive;
    }

    @Override // ng1.j
    public final GCMComplexOneLineButton ga() {
        return (GCMComplexOneLineButton) findViewById(R.id.device_settings_vivoactive_auto_upload_btn);
    }

    @Override // ng1.j
    public final GCMComplexOneLineButton ia() {
        return (GCMComplexOneLineButton) findViewById(R.id.device_settings_weather);
    }

    @Override // com.garmin.android.apps.connectmobile.z1, androidx.fragment.app.m, b.g, android.app.Activity
    public final void onActivityResult(int i14, int i15, Intent intent) {
        super.onActivityResult(i14, i15, intent);
        if (i14 == 10 && i15 == -1) {
            DeviceSettingsDTO deviceSettingsDTO = (intent == null || intent.getExtras() == null) ? null : (DeviceSettingsDTO) intent.getExtras().get("GCM_deviceSettings");
            if (deviceSettingsDTO != null) {
                this.f125985k = deviceSettingsDTO;
            }
        }
    }

    @Override // ng1.j, ng1.p, com.garmin.android.apps.connectmobile.c, com.garmin.android.apps.connectmobile.z1, com.garmin.android.apps.connectmobile.v, androidx.fragment.app.m, b.g, z6.e, android.app.Activity
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        ((GCMComplexOneLineButton) findViewById(R.id.device_settings_vivoactive_time_date_btn)).setOnClickListener(this.f42208v);
        GCMComplexTwoLineButton gCMComplexTwoLineButton = (GCMComplexTwoLineButton) findViewById(R.id.device_settings_vivoactive_wrist_btn);
        this.f42207t = gCMComplexTwoLineButton;
        gCMComplexTwoLineButton.setOnClickListener(this.f42209w);
        this.f42207t.setButtonBottomLeftLabel(getString(this.f125985k.e0().f34073b));
    }
}
