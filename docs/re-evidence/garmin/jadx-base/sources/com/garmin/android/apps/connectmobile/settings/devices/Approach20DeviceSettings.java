package com.garmin.android.apps.connectmobile.settings.devices;

import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.CompoundButton;
import com.garmin.android.apps.connectmobile.R;
import com.garmin.android.apps.connectmobile.devices.model.DeviceSettingsDTO;
import com.garmin.android.apps.connectmobile.view.view_3_0.GCMComplexOneLineButton;
import com.garmin.android.apps.connectmobile.view.view_3_0.GCMComplexTwoLineButton;
import ng1.j;

/* JADX INFO: loaded from: classes10.dex */
public class Approach20DeviceSettings extends j {

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public GCMComplexOneLineButton f41869t;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public GCMComplexOneLineButton f41870v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public GCMComplexTwoLineButton f41871w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final a f41872x = new a();

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final b f41873y = new b();

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public final c f41874z = new c();
    public final d A = new d();

    public class a implements View.OnClickListener {
        public a() {
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(View view2) {
            Approach20DeviceSettings approach20DeviceSettings = Approach20DeviceSettings.this;
            DeviceSettingsDTO deviceSettingsDTO = approach20DeviceSettings.f125985k;
            ApproachS20DeviceSystemSettings.f41879c.getClass();
            approach20DeviceSettings.getClass();
            Intent intent = new Intent(approach20DeviceSettings, (Class<?>) ApproachS20DeviceSystemSettings.class);
            intent.putExtra("GCM_deviceSettings", deviceSettingsDTO);
            if (!TextUtils.isEmpty(null)) {
                intent.putExtra("GCM_deviceSettingsTitle", (String) null);
            }
            intent.putExtra("MilitaryTimeFormatSupported", false);
            approach20DeviceSettings.startActivityForResult(intent, 10);
        }
    }

    public class b implements CompoundButton.OnCheckedChangeListener {
        public b() {
        }

        @Override // android.widget.CompoundButton.OnCheckedChangeListener
        public final void onCheckedChanged(CompoundButton compoundButton, boolean z14) {
            Approach20DeviceSettings approach20DeviceSettings = Approach20DeviceSettings.this;
            approach20DeviceSettings.f41870v.setVisibility(z14 ? 0 : 8);
            approach20DeviceSettings.f125985k.f33885m.u(Boolean.valueOf(z14));
        }
    }

    public class c implements CompoundButton.OnCheckedChangeListener {
        public c() {
        }

        @Override // android.widget.CompoundButton.OnCheckedChangeListener
        public final void onCheckedChanged(CompoundButton compoundButton, boolean z14) {
            Approach20DeviceSettings.this.f125985k.f33885m.F(Boolean.valueOf(z14));
        }
    }

    public class d implements View.OnClickListener {
        public d() {
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(View view2) {
            Approach20DeviceSettings approach20DeviceSettings = Approach20DeviceSettings.this;
            AlarmDeviceSettings.ca(approach20DeviceSettings, approach20DeviceSettings.f125985k, 10);
        }
    }

    @Override // ng1.j
    public final int ea() {
        return R.layout.gcm3_device_settings_approach20;
    }

    @Override // ng1.j
    public final GCMComplexOneLineButton ga() {
        return (GCMComplexOneLineButton) findViewById(R.id.device_settings_auto_upload_btn);
    }

    public final void ka() {
        if (this.f125985k.D().isEmpty()) {
            return;
        }
        String str = this.f125985k.D().get(0).f34181a;
        com.garmin.android.apps.connectmobile.devices.model.c.f34112c.getClass();
        com.garmin.android.apps.connectmobile.devices.model.c cVarA = com.garmin.android.apps.connectmobile.devices.model.c.a.a(str);
        com.garmin.android.apps.connectmobile.devices.model.c cVar = com.garmin.android.apps.connectmobile.devices.model.c.OFF;
        GCMComplexTwoLineButton gCMComplexTwoLineButton = this.f41871w;
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
        ((GCMComplexOneLineButton) findViewById(R.id.device_settings_system_btn)).setOnClickListener(this.f41872x);
        GCMComplexOneLineButton gCMComplexOneLineButton = (GCMComplexOneLineButton) findViewById(R.id.device_settings_activity_tracking_btn);
        this.f41869t = gCMComplexOneLineButton;
        gCMComplexOneLineButton.setOnCheckedChangeListener(this.f41873y);
        GCMComplexOneLineButton gCMComplexOneLineButton2 = (GCMComplexOneLineButton) findViewById(R.id.device_settings_move_alert_btn);
        this.f41870v = gCMComplexOneLineButton2;
        gCMComplexOneLineButton2.setOnCheckedChangeListener(this.f41874z);
        GCMComplexTwoLineButton gCMComplexTwoLineButton = (GCMComplexTwoLineButton) findViewById(R.id.device_settings_alarm_btn);
        this.f41871w = gCMComplexTwoLineButton;
        gCMComplexTwoLineButton.setOnClickListener(this.A);
        if (this.f125985k.s1("activityTracking")) {
            this.f41869t.setVisibility(8);
            this.f41870v.setVisibility(8);
        } else {
            boolean zS = this.f125985k.f33885m.s();
            GCMComplexOneLineButton gCMComplexOneLineButton3 = this.f41869t;
            if (zS) {
                gCMComplexOneLineButton3.k();
            } else {
                gCMComplexOneLineButton3.j();
            }
            boolean zT = this.f125985k.f33885m.t();
            GCMComplexOneLineButton gCMComplexOneLineButton4 = this.f41870v;
            if (zT) {
                gCMComplexOneLineButton4.k();
            } else {
                gCMComplexOneLineButton4.j();
            }
        }
        if (this.f125985k.D() == null || this.f125985k.D().size() <= 0) {
            this.f41871w.setVisibility(8);
        } else {
            ka();
        }
    }
}
