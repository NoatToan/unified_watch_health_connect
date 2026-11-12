package com.garmin.android.apps.connectmobile.settings.devices;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.CompoundButton;
import com.garmin.android.apps.connectmobile.R;
import com.garmin.android.apps.connectmobile.devices.model.DeviceSettingsDTO;
import com.garmin.android.apps.connectmobile.view.view_3_0.GCMComplexOneLineButton;
import com.garmin.android.apps.connectmobile.view.view_3_0.GCMComplexTwoLineButton;
import hb2.i;
import ng1.j;

/* JADX INFO: loaded from: classes10.dex */
public class Forerunner230DeviceSettings extends j {

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public GCMComplexOneLineButton f42061t;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public GCMComplexOneLineButton f42062v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public GCMComplexOneLineButton f42063w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public GCMComplexOneLineButton f42064x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public GCMComplexOneLineButton f42065y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public final a f42066z = new a();
    public final b A = new b();
    public final c B = new c();
    public final d C = new d();

    public class a implements View.OnClickListener {
        public a() {
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(View view2) {
            Forerunner230DeviceSettings forerunner230DeviceSettings = Forerunner230DeviceSettings.this;
            TimeDateSystemDeviceSettings.ca(forerunner230DeviceSettings, forerunner230DeviceSettings.f125985k);
        }
    }

    public class b implements CompoundButton.OnCheckedChangeListener {
        public b() {
        }

        @Override // android.widget.CompoundButton.OnCheckedChangeListener
        public final void onCheckedChanged(CompoundButton compoundButton, boolean z14) {
            Forerunner230DeviceSettings forerunner230DeviceSettings = Forerunner230DeviceSettings.this;
            forerunner230DeviceSettings.f42064x.setVisibility(z14 ? 0 : 8);
            forerunner230DeviceSettings.f125985k.f33885m.u(Boolean.valueOf(z14));
        }
    }

    public class c implements CompoundButton.OnCheckedChangeListener {
        public c() {
        }

        @Override // android.widget.CompoundButton.OnCheckedChangeListener
        public final void onCheckedChanged(CompoundButton compoundButton, boolean z14) {
            Forerunner230DeviceSettings.this.f125985k.f33885m.F(Boolean.valueOf(z14));
        }
    }

    public class d implements CompoundButton.OnCheckedChangeListener {
        public d() {
        }

        @Override // android.widget.CompoundButton.OnCheckedChangeListener
        public final void onCheckedChanged(CompoundButton compoundButton, boolean z14) {
            DeviceSettingsDTO deviceSettingsDTO = Forerunner230DeviceSettings.this.f125985k;
            deviceSettingsDTO.K0 = Boolean.valueOf(z14);
            deviceSettingsDTO.S1("opticalHeartRateEnabled");
        }
    }

    @Override // ng1.j
    public final int ea() {
        return R.layout.gcm3_device_settings_forerunner_230;
    }

    @Override // ng1.j
    public final GCMComplexTwoLineButton fa() {
        return (GCMComplexTwoLineButton) findViewById(R.id.device_settings_forerunner_230_audio_prompts_btn);
    }

    @Override // ng1.j
    public final GCMComplexOneLineButton ga() {
        GCMComplexOneLineButton gCMComplexOneLineButton = (GCMComplexOneLineButton) findViewById(R.id.device_settings_forerunner_230_auto_upload_btn);
        this.f42062v = gCMComplexOneLineButton;
        return gCMComplexOneLineButton;
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
        setVolumeControlStream(3);
        GCMComplexOneLineButton gCMComplexOneLineButton = (GCMComplexOneLineButton) findViewById(R.id.device_settings_forerunner_230_time_date_btn);
        this.f42061t = gCMComplexOneLineButton;
        gCMComplexOneLineButton.setOnClickListener(this.f42066z);
        GCMComplexOneLineButton gCMComplexOneLineButton2 = (GCMComplexOneLineButton) findViewById(R.id.device_settings_forerunner_230_activity_tracking_btn);
        this.f42063w = gCMComplexOneLineButton2;
        gCMComplexOneLineButton2.setOnCheckedChangeListener(this.A);
        GCMComplexOneLineButton gCMComplexOneLineButton3 = (GCMComplexOneLineButton) findViewById(R.id.device_settings_forerunner_230_move_alert_btn);
        this.f42064x = gCMComplexOneLineButton3;
        gCMComplexOneLineButton3.setOnCheckedChangeListener(this.B);
        GCMComplexOneLineButton gCMComplexOneLineButton4 = (GCMComplexOneLineButton) findViewById(R.id.device_settings_forerunner_230_wrist_heart_rate_btn);
        this.f42065y = gCMComplexOneLineButton4;
        gCMComplexOneLineButton4.setOnCheckedChangeListener(this.C);
        if (!i.a(this)) {
            this.f42061t.setVisibility(8);
            this.f42063w.setVisibility(8);
            this.f42064x.setVisibility(8);
            this.f42062v.setVisibility(8);
            this.f42065y.setVisibility(8);
            return;
        }
        if (this.f125985k.s1("activityTracking")) {
            this.f42063w.setVisibility(8);
            this.f42064x.setVisibility(8);
        } else {
            boolean zS = this.f125985k.f33885m.s();
            GCMComplexOneLineButton gCMComplexOneLineButton5 = this.f42063w;
            if (zS) {
                gCMComplexOneLineButton5.k();
            } else {
                gCMComplexOneLineButton5.j();
            }
            boolean zT = this.f125985k.f33885m.t();
            GCMComplexOneLineButton gCMComplexOneLineButton6 = this.f42064x;
            if (zT) {
                gCMComplexOneLineButton6.k();
            } else {
                gCMComplexOneLineButton6.j();
            }
        }
        if (this.f125985k.K0 != null) {
            this.f42065y.setVisibility(0);
            boolean zV1 = this.f125985k.v1();
            GCMComplexOneLineButton gCMComplexOneLineButton7 = this.f42065y;
            if (zV1) {
                gCMComplexOneLineButton7.k();
            } else {
                gCMComplexOneLineButton7.j();
            }
        }
    }
}
