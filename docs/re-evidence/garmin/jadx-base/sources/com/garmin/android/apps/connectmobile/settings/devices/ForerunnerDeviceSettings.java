package com.garmin.android.apps.connectmobile.settings.devices;

import android.content.Intent;
import android.os.Bundle;
import android.widget.CompoundButton;
import android.widget.TextView;
import com.garmin.android.apps.connectmobile.R;
import com.garmin.android.apps.connectmobile.devices.model.DeviceSettingsDTO;
import com.garmin.android.apps.connectmobile.view.view_3_0.GCMComplexOneLineButton;
import com.garmin.android.apps.connectmobile.view.view_3_0.GCMComplexTwoLineButton;
import com.garmin.android.gfdi.configuration.SupportedCapability;
import ng1.j;
import ng1.w0;
import ng1.x0;

/* JADX INFO: loaded from: classes10.dex */
public class ForerunnerDeviceSettings extends j {
    public static final /* synthetic */ int F = 0;
    public GCMComplexOneLineButton A;
    public TextView B;
    public final w0 C;
    public final a D = new a();
    public final x0 E;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public GCMComplexOneLineButton f42131t;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public GCMComplexOneLineButton f42132v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public GCMComplexOneLineButton f42133w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public GCMComplexOneLineButton f42134x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public GCMComplexTwoLineButton f42135y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public GCMComplexOneLineButton f42136z;

    public class a implements CompoundButton.OnCheckedChangeListener {
        public a() {
        }

        @Override // android.widget.CompoundButton.OnCheckedChangeListener
        public final void onCheckedChanged(CompoundButton compoundButton, boolean z14) {
            ForerunnerDeviceSettings forerunnerDeviceSettings = ForerunnerDeviceSettings.this;
            forerunnerDeviceSettings.f42134x.setVisibility(z14 ? 0 : 8);
            forerunnerDeviceSettings.f125985k.f33885m.u(Boolean.valueOf(z14));
        }
    }

    public ForerunnerDeviceSettings() {
        int i14 = 0;
        this.C = new w0(this, i14);
        this.E = new x0(this, i14);
    }

    @Override // ng1.j
    public int ea() {
        return R.layout.gcm3_device_settings_forerunner;
    }

    @Override // ng1.j
    public final GCMComplexTwoLineButton fa() {
        this.f42135y = (GCMComplexTwoLineButton) findViewById(R.id.device_settings_forerunner_audio_prompts_btn);
        boolean zD = km2.a.d(this.f125976b, km2.a.b());
        GCMComplexTwoLineButton gCMComplexTwoLineButton = this.f42135y;
        if (zD) {
            gCMComplexTwoLineButton.setVisibility(0);
        } else {
            gCMComplexTwoLineButton.setVisibility(8);
        }
        return this.f42135y;
    }

    @Override // ng1.j
    public final GCMComplexOneLineButton ga() {
        GCMComplexOneLineButton gCMComplexOneLineButton = (GCMComplexOneLineButton) findViewById(R.id.device_settings_forerunner_auto_upload_btn);
        this.f42132v = gCMComplexOneLineButton;
        return gCMComplexOneLineButton;
    }

    @Override // com.garmin.android.apps.connectmobile.z1, androidx.fragment.app.m, b.g, android.app.Activity
    public final void onActivityResult(int i14, int i15, Intent intent) {
        super.onActivityResult(i14, i15, intent);
        if ((i14 == 10 || i14 == 11) && i15 == -1) {
            DeviceSettingsDTO deviceSettingsDTO = (intent == null || intent.getExtras() == null) ? null : (DeviceSettingsDTO) intent.getExtras().get("GCM_deviceSettings");
            if (deviceSettingsDTO != null) {
                this.f125985k = deviceSettingsDTO;
            }
        }
    }

    @Override // ng1.j, ng1.p, com.garmin.android.apps.connectmobile.c, com.garmin.android.apps.connectmobile.z1, com.garmin.android.apps.connectmobile.v, androidx.fragment.app.m, b.g, z6.e, android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        GCMComplexOneLineButton gCMComplexOneLineButton = (GCMComplexOneLineButton) findViewById(R.id.device_settings_forerunner_time_date_btn);
        this.f42131t = gCMComplexOneLineButton;
        gCMComplexOneLineButton.setOnClickListener(this.C);
        GCMComplexOneLineButton gCMComplexOneLineButton2 = (GCMComplexOneLineButton) findViewById(R.id.device_settings_forerunner_activity_tracking_btn);
        this.f42133w = gCMComplexOneLineButton2;
        gCMComplexOneLineButton2.setOnCheckedChangeListener(this.D);
        GCMComplexOneLineButton gCMComplexOneLineButton3 = (GCMComplexOneLineButton) findViewById(R.id.device_settings_forerunner_move_alert_btn);
        this.f42134x = gCMComplexOneLineButton3;
        gCMComplexOneLineButton3.setOnCheckedChangeListener(this.E);
        this.B = (TextView) findViewById(R.id.device_settings_activity_tracker_section);
        this.f42136z = (GCMComplexOneLineButton) findViewById(R.id.device_settings_forerunner_physio_trueup);
        this.A = (GCMComplexOneLineButton) findViewById(R.id.device_settings_wifi_btn);
        DeviceSettingsDTO deviceSettingsDTO = this.f125985k;
        if (deviceSettingsDTO == null) {
            this.f42131t.setVisibility(8);
            this.f42133w.setVisibility(8);
            this.f42134x.setVisibility(8);
            this.B.setVisibility(8);
            this.A.setVisibility(8);
            return;
        }
        if (deviceSettingsDTO.L0()) {
            boolean zS = this.f125985k.f33885m.s();
            GCMComplexOneLineButton gCMComplexOneLineButton4 = this.f42133w;
            if (zS) {
                gCMComplexOneLineButton4.k();
            } else {
                gCMComplexOneLineButton4.j();
            }
            boolean zT = this.f125985k.f33885m.t();
            GCMComplexOneLineButton gCMComplexOneLineButton5 = this.f42134x;
            if (zT) {
                gCMComplexOneLineButton5.k();
            } else {
                gCMComplexOneLineButton5.j();
            }
        } else {
            this.f42133w.setVisibility(8);
            this.f42134x.setVisibility(8);
        }
        boolean z14 = this.f125985k.f33873g1 != null;
        GCMComplexOneLineButton gCMComplexOneLineButton6 = this.f42136z;
        if (z14) {
            gCMComplexOneLineButton6.setVisibility(0);
            this.f42136z.setRightElement(GCMComplexOneLineButton.a.SWITCH);
            GCMComplexOneLineButton gCMComplexOneLineButton7 = this.f42136z;
            Boolean bool = this.f125985k.f33873g1;
            gCMComplexOneLineButton7.i(bool != null ? bool.booleanValue() : false);
        } else {
            gCMComplexOneLineButton6.setVisibility(8);
        }
        this.f42136z.setOnCheckedChangeListener(new x0(this, 1));
        if (this.A != null) {
            this.A.setVisibility(km2.a.i(this.f125976b, null, SupportedCapability.WIFI_SETUP.ordinal()) ? 0 : 8);
            this.A.setOnClickListener(new w0(this, 1));
        }
    }
}
