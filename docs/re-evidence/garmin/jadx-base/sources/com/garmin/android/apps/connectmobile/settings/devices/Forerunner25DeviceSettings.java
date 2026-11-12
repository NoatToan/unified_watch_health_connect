package com.garmin.android.apps.connectmobile.settings.devices;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.CompoundButton;
import com.garmin.android.apps.connectmobile.R;
import com.garmin.android.apps.connectmobile.devices.model.DeviceSettingsDTO;
import com.garmin.android.apps.connectmobile.devices.model.i;
import com.garmin.android.apps.connectmobile.view.view_3_0.GCMComplexOneLineButton;
import com.garmin.android.apps.connectmobile.view.view_3_0.GCMComplexTwoLineButton;
import java.util.List;
import ng1.j;

/* JADX INFO: loaded from: classes10.dex */
public class Forerunner25DeviceSettings extends j {

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public GCMComplexOneLineButton f42071t;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public GCMComplexOneLineButton f42072v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public GCMComplexTwoLineButton f42073w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public GCMComplexTwoLineButton f42074x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final a f42075y = new a();

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public final b f42076z = new b();
    public final c A = new c();
    public final d B = new d();

    public class a implements View.OnClickListener {
        public a() {
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(View view2) {
            Forerunner25DeviceSettings forerunner25DeviceSettings = Forerunner25DeviceSettings.this;
            TimeDateSystemDeviceSettings.ca(forerunner25DeviceSettings, forerunner25DeviceSettings.f125985k);
        }
    }

    public class b implements CompoundButton.OnCheckedChangeListener {
        public b() {
        }

        @Override // android.widget.CompoundButton.OnCheckedChangeListener
        public final void onCheckedChanged(CompoundButton compoundButton, boolean z14) {
            Forerunner25DeviceSettings forerunner25DeviceSettings = Forerunner25DeviceSettings.this;
            forerunner25DeviceSettings.f42072v.setVisibility(z14 ? 0 : 8);
            DeviceSettingsDTO deviceSettingsDTO = forerunner25DeviceSettings.f125985k;
            if (deviceSettingsDTO != null) {
                deviceSettingsDTO.f33885m.u(Boolean.valueOf(z14));
            }
        }
    }

    public class c implements CompoundButton.OnCheckedChangeListener {
        public c() {
        }

        @Override // android.widget.CompoundButton.OnCheckedChangeListener
        public final void onCheckedChanged(CompoundButton compoundButton, boolean z14) {
            DeviceSettingsDTO deviceSettingsDTO = Forerunner25DeviceSettings.this.f125985k;
            if (deviceSettingsDTO != null) {
                deviceSettingsDTO.f33885m.F(Boolean.valueOf(z14));
            }
        }
    }

    public class d implements View.OnClickListener {
        public d() {
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(View view2) {
            Forerunner25DeviceSettings forerunner25DeviceSettings = Forerunner25DeviceSettings.this;
            AlarmDeviceSettings.ca(forerunner25DeviceSettings, forerunner25DeviceSettings.f125985k, 10);
        }
    }

    @Override // ng1.j
    public final int ea() {
        return R.layout.gcm3_device_settings_forerunner_25;
    }

    @Override // ng1.j
    public final GCMComplexTwoLineButton fa() {
        this.f42074x = (GCMComplexTwoLineButton) findViewById(R.id.device_settings_forerunner_25_audio_prompts_btn);
        boolean zD = km2.a.d(this.f125976b, km2.a.b());
        GCMComplexTwoLineButton gCMComplexTwoLineButton = this.f42074x;
        if (zD) {
            gCMComplexTwoLineButton.setVisibility(0);
        } else {
            gCMComplexTwoLineButton.setVisibility(8);
        }
        return this.f42074x;
    }

    @Override // ng1.j
    public final GCMComplexOneLineButton ga() {
        return (GCMComplexOneLineButton) findViewById(R.id.device_settings_forerunner_25_auto_upload_btn);
    }

    public final void ka() {
        List<i> listD;
        DeviceSettingsDTO deviceSettingsDTO = this.f125985k;
        if (deviceSettingsDTO == null || (listD = deviceSettingsDTO.D()) == null || listD.isEmpty() || listD.size() - 1 <= 0) {
            return;
        }
        String str = listD.get(0).f34181a;
        com.garmin.android.apps.connectmobile.devices.model.c.f34112c.getClass();
        com.garmin.android.apps.connectmobile.devices.model.c cVarA = com.garmin.android.apps.connectmobile.devices.model.c.a.a(str);
        com.garmin.android.apps.connectmobile.devices.model.c cVar = com.garmin.android.apps.connectmobile.devices.model.c.OFF;
        GCMComplexTwoLineButton gCMComplexTwoLineButton = this.f42073w;
        if (cVarA == cVar) {
            gCMComplexTwoLineButton.setButtonBottomLeftLabel(getString(cVarA.f34119b));
        } else {
            gCMComplexTwoLineButton.setButtonBottomLeftLabel(getString(R.string.lbl_on));
        }
    }

    @Override // com.garmin.android.apps.connectmobile.z1, androidx.fragment.app.m, b.g, android.app.Activity
    public final void onActivityResult(int i14, int i15, Intent intent) {
        super.onActivityResult(i14, i15, intent);
        if (i14 == 10 && i15 == -1) {
            DeviceSettingsDTO deviceSettingsDTO = (intent == null || intent.getExtras() == null) ? null : (DeviceSettingsDTO) intent.getExtras().get("GCM_deviceSettings");
            if (deviceSettingsDTO != null) {
                this.f125985k = deviceSettingsDTO;
                ka();
            }
        }
    }

    @Override // ng1.j, ng1.p, com.garmin.android.apps.connectmobile.c, com.garmin.android.apps.connectmobile.z1, com.garmin.android.apps.connectmobile.v, androidx.fragment.app.m, b.g, z6.e, android.app.Activity
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        ((GCMComplexOneLineButton) findViewById(R.id.device_settings_forerunner_25_time_date_btn)).setOnClickListener(this.f42075y);
        GCMComplexOneLineButton gCMComplexOneLineButton = (GCMComplexOneLineButton) findViewById(R.id.device_settings_forerunner_25_activity_tracking_btn);
        this.f42071t = gCMComplexOneLineButton;
        gCMComplexOneLineButton.setOnCheckedChangeListener(this.f42076z);
        GCMComplexOneLineButton gCMComplexOneLineButton2 = (GCMComplexOneLineButton) findViewById(R.id.device_settings_forerunner_25_move_alert_btn);
        this.f42072v = gCMComplexOneLineButton2;
        gCMComplexOneLineButton2.setOnCheckedChangeListener(this.A);
        GCMComplexTwoLineButton gCMComplexTwoLineButton = (GCMComplexTwoLineButton) findViewById(R.id.device_settings_forerunner_25_alarm_btn);
        this.f42073w = gCMComplexTwoLineButton;
        gCMComplexTwoLineButton.setOnClickListener(this.B);
        DeviceSettingsDTO deviceSettingsDTO = this.f125985k;
        if (deviceSettingsDTO != null) {
            if (deviceSettingsDTO.L0()) {
                boolean zS = this.f125985k.f33885m.s();
                GCMComplexOneLineButton gCMComplexOneLineButton3 = this.f42071t;
                if (zS) {
                    gCMComplexOneLineButton3.k();
                } else {
                    gCMComplexOneLineButton3.j();
                }
                boolean zT = this.f125985k.f33885m.t();
                GCMComplexOneLineButton gCMComplexOneLineButton4 = this.f42072v;
                if (zT) {
                    gCMComplexOneLineButton4.k();
                } else {
                    gCMComplexOneLineButton4.j();
                }
            } else {
                this.f42071t.setVisibility(8);
                this.f42072v.setVisibility(8);
            }
            if (this.f125985k.D() == null || this.f125985k.D().size() <= 0) {
                this.f42073w.setVisibility(8);
            } else {
                ka();
            }
        }
    }
}
