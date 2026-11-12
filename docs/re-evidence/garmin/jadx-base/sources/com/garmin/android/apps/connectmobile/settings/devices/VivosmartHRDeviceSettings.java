package com.garmin.android.apps.connectmobile.settings.devices;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.CompoundButton;
import com.garmin.android.apps.connectmobile.R;
import com.garmin.android.apps.connectmobile.devices.model.DeviceSettingsDTO;
import com.garmin.android.apps.connectmobile.settings.devices.AlarmDeviceSettings;
import com.garmin.android.apps.connectmobile.settings.devices.DeviceSettingsActivityTracking;
import com.garmin.android.apps.connectmobile.settings.devices.TimeDateSystemDeviceSettings;
import com.garmin.android.apps.connectmobile.settings.devices.VivosmartDeviceSettingsOrientation;
import com.garmin.android.apps.connectmobile.settings.devices.VivosmartHRDeviceSettings;
import com.garmin.android.apps.connectmobile.settings.devices.VivosmartHRDeviceSettingsDisplay;
import com.garmin.android.apps.connectmobile.view.view_3_0.GCMComplexOneLineButton;
import com.garmin.android.apps.connectmobile.view.view_3_0.GCMComplexTwoLineButton;
import ng1.j;
import ng1.j1;
import ng1.k1;

/* JADX INFO: loaded from: classes10.dex */
public class VivosmartHRDeviceSettings extends j {
    public static final /* synthetic */ int D = 0;
    public final k1 A;
    public GCMComplexTwoLineButton B;
    public GCMComplexOneLineButton C;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final j1 f42424t;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final j1 f42425v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final j1 f42426w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final j1 f42427x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final j1 f42428y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public final k1 f42429z;

    /* JADX WARN: Type inference failed for: r0v0, types: [ng1.j1] */
    /* JADX WARN: Type inference failed for: r0v1, types: [ng1.j1] */
    /* JADX WARN: Type inference failed for: r0v2, types: [ng1.j1] */
    /* JADX WARN: Type inference failed for: r0v3, types: [ng1.j1] */
    /* JADX WARN: Type inference failed for: r0v4, types: [ng1.j1] */
    /* JADX WARN: Type inference failed for: r0v5, types: [ng1.k1] */
    /* JADX WARN: Type inference failed for: r0v6, types: [ng1.k1] */
    public VivosmartHRDeviceSettings() {
        final int i14 = 0;
        this.f42424t = new View.OnClickListener(this) { // from class: ng1.j1

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ VivosmartHRDeviceSettings f125953b;

            {
                this.f125953b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                int i15 = i14;
                VivosmartHRDeviceSettings vivosmartHRDeviceSettings = this.f125953b;
                switch (i15) {
                    case 0:
                        int i16 = VivosmartHRDeviceSettings.D;
                        DeviceSettingsDTO deviceSettingsDTO = vivosmartHRDeviceSettings.f125985k;
                        Intent intent = new Intent(vivosmartHRDeviceSettings, (Class<?>) VivosmartHRDeviceSettingsDisplay.class);
                        intent.putExtra("GCM_deviceSettings", deviceSettingsDTO);
                        vivosmartHRDeviceSettings.startActivityForResult(intent, 10);
                        break;
                    case 1:
                        int i17 = VivosmartHRDeviceSettings.D;
                        TimeDateSystemDeviceSettings.da(vivosmartHRDeviceSettings, vivosmartHRDeviceSettings.f125985k, vivosmartHRDeviceSettings.getString(R.string.device_setting_system));
                        break;
                    case 2:
                        int i18 = VivosmartHRDeviceSettings.D;
                        AlarmDeviceSettings.ca(vivosmartHRDeviceSettings, vivosmartHRDeviceSettings.f125985k, 10);
                        break;
                    case 3:
                        int i19 = VivosmartHRDeviceSettings.D;
                        DeviceSettingsDTO deviceSettingsDTO2 = vivosmartHRDeviceSettings.f125985k;
                        int i24 = VivosmartDeviceSettingsOrientation.f42372y;
                        Intent intent2 = new Intent(vivosmartHRDeviceSettings, (Class<?>) VivosmartDeviceSettingsOrientation.class);
                        intent2.putExtra("GCM_deviceSettings", deviceSettingsDTO2);
                        vivosmartHRDeviceSettings.startActivityForResult(intent2, 10);
                        break;
                    default:
                        int i25 = VivosmartHRDeviceSettings.D;
                        DeviceSettingsActivityTracking.ca(vivosmartHRDeviceSettings, vivosmartHRDeviceSettings.f125985k, vivosmartHRDeviceSettings.getString(R.string.activity_tracking_title), vivosmartHRDeviceSettings.f125976b);
                        break;
                }
            }
        };
        final int i15 = 1;
        this.f42425v = new View.OnClickListener(this) { // from class: ng1.j1

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ VivosmartHRDeviceSettings f125953b;

            {
                this.f125953b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                int i16 = i15;
                VivosmartHRDeviceSettings vivosmartHRDeviceSettings = this.f125953b;
                switch (i16) {
                    case 0:
                        int i17 = VivosmartHRDeviceSettings.D;
                        DeviceSettingsDTO deviceSettingsDTO = vivosmartHRDeviceSettings.f125985k;
                        Intent intent = new Intent(vivosmartHRDeviceSettings, (Class<?>) VivosmartHRDeviceSettingsDisplay.class);
                        intent.putExtra("GCM_deviceSettings", deviceSettingsDTO);
                        vivosmartHRDeviceSettings.startActivityForResult(intent, 10);
                        break;
                    case 1:
                        int i18 = VivosmartHRDeviceSettings.D;
                        TimeDateSystemDeviceSettings.da(vivosmartHRDeviceSettings, vivosmartHRDeviceSettings.f125985k, vivosmartHRDeviceSettings.getString(R.string.device_setting_system));
                        break;
                    case 2:
                        int i19 = VivosmartHRDeviceSettings.D;
                        AlarmDeviceSettings.ca(vivosmartHRDeviceSettings, vivosmartHRDeviceSettings.f125985k, 10);
                        break;
                    case 3:
                        int i110 = VivosmartHRDeviceSettings.D;
                        DeviceSettingsDTO deviceSettingsDTO2 = vivosmartHRDeviceSettings.f125985k;
                        int i24 = VivosmartDeviceSettingsOrientation.f42372y;
                        Intent intent2 = new Intent(vivosmartHRDeviceSettings, (Class<?>) VivosmartDeviceSettingsOrientation.class);
                        intent2.putExtra("GCM_deviceSettings", deviceSettingsDTO2);
                        vivosmartHRDeviceSettings.startActivityForResult(intent2, 10);
                        break;
                    default:
                        int i25 = VivosmartHRDeviceSettings.D;
                        DeviceSettingsActivityTracking.ca(vivosmartHRDeviceSettings, vivosmartHRDeviceSettings.f125985k, vivosmartHRDeviceSettings.getString(R.string.activity_tracking_title), vivosmartHRDeviceSettings.f125976b);
                        break;
                }
            }
        };
        final int i16 = 2;
        this.f42426w = new View.OnClickListener(this) { // from class: ng1.j1

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ VivosmartHRDeviceSettings f125953b;

            {
                this.f125953b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                int i17 = i16;
                VivosmartHRDeviceSettings vivosmartHRDeviceSettings = this.f125953b;
                switch (i17) {
                    case 0:
                        int i18 = VivosmartHRDeviceSettings.D;
                        DeviceSettingsDTO deviceSettingsDTO = vivosmartHRDeviceSettings.f125985k;
                        Intent intent = new Intent(vivosmartHRDeviceSettings, (Class<?>) VivosmartHRDeviceSettingsDisplay.class);
                        intent.putExtra("GCM_deviceSettings", deviceSettingsDTO);
                        vivosmartHRDeviceSettings.startActivityForResult(intent, 10);
                        break;
                    case 1:
                        int i19 = VivosmartHRDeviceSettings.D;
                        TimeDateSystemDeviceSettings.da(vivosmartHRDeviceSettings, vivosmartHRDeviceSettings.f125985k, vivosmartHRDeviceSettings.getString(R.string.device_setting_system));
                        break;
                    case 2:
                        int i110 = VivosmartHRDeviceSettings.D;
                        AlarmDeviceSettings.ca(vivosmartHRDeviceSettings, vivosmartHRDeviceSettings.f125985k, 10);
                        break;
                    case 3:
                        int i111 = VivosmartHRDeviceSettings.D;
                        DeviceSettingsDTO deviceSettingsDTO2 = vivosmartHRDeviceSettings.f125985k;
                        int i24 = VivosmartDeviceSettingsOrientation.f42372y;
                        Intent intent2 = new Intent(vivosmartHRDeviceSettings, (Class<?>) VivosmartDeviceSettingsOrientation.class);
                        intent2.putExtra("GCM_deviceSettings", deviceSettingsDTO2);
                        vivosmartHRDeviceSettings.startActivityForResult(intent2, 10);
                        break;
                    default:
                        int i25 = VivosmartHRDeviceSettings.D;
                        DeviceSettingsActivityTracking.ca(vivosmartHRDeviceSettings, vivosmartHRDeviceSettings.f125985k, vivosmartHRDeviceSettings.getString(R.string.activity_tracking_title), vivosmartHRDeviceSettings.f125976b);
                        break;
                }
            }
        };
        final int i17 = 3;
        this.f42427x = new View.OnClickListener(this) { // from class: ng1.j1

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ VivosmartHRDeviceSettings f125953b;

            {
                this.f125953b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                int i18 = i17;
                VivosmartHRDeviceSettings vivosmartHRDeviceSettings = this.f125953b;
                switch (i18) {
                    case 0:
                        int i19 = VivosmartHRDeviceSettings.D;
                        DeviceSettingsDTO deviceSettingsDTO = vivosmartHRDeviceSettings.f125985k;
                        Intent intent = new Intent(vivosmartHRDeviceSettings, (Class<?>) VivosmartHRDeviceSettingsDisplay.class);
                        intent.putExtra("GCM_deviceSettings", deviceSettingsDTO);
                        vivosmartHRDeviceSettings.startActivityForResult(intent, 10);
                        break;
                    case 1:
                        int i110 = VivosmartHRDeviceSettings.D;
                        TimeDateSystemDeviceSettings.da(vivosmartHRDeviceSettings, vivosmartHRDeviceSettings.f125985k, vivosmartHRDeviceSettings.getString(R.string.device_setting_system));
                        break;
                    case 2:
                        int i111 = VivosmartHRDeviceSettings.D;
                        AlarmDeviceSettings.ca(vivosmartHRDeviceSettings, vivosmartHRDeviceSettings.f125985k, 10);
                        break;
                    case 3:
                        int i112 = VivosmartHRDeviceSettings.D;
                        DeviceSettingsDTO deviceSettingsDTO2 = vivosmartHRDeviceSettings.f125985k;
                        int i24 = VivosmartDeviceSettingsOrientation.f42372y;
                        Intent intent2 = new Intent(vivosmartHRDeviceSettings, (Class<?>) VivosmartDeviceSettingsOrientation.class);
                        intent2.putExtra("GCM_deviceSettings", deviceSettingsDTO2);
                        vivosmartHRDeviceSettings.startActivityForResult(intent2, 10);
                        break;
                    default:
                        int i25 = VivosmartHRDeviceSettings.D;
                        DeviceSettingsActivityTracking.ca(vivosmartHRDeviceSettings, vivosmartHRDeviceSettings.f125985k, vivosmartHRDeviceSettings.getString(R.string.activity_tracking_title), vivosmartHRDeviceSettings.f125976b);
                        break;
                }
            }
        };
        final int i18 = 4;
        this.f42428y = new View.OnClickListener(this) { // from class: ng1.j1

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ VivosmartHRDeviceSettings f125953b;

            {
                this.f125953b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                int i19 = i18;
                VivosmartHRDeviceSettings vivosmartHRDeviceSettings = this.f125953b;
                switch (i19) {
                    case 0:
                        int i110 = VivosmartHRDeviceSettings.D;
                        DeviceSettingsDTO deviceSettingsDTO = vivosmartHRDeviceSettings.f125985k;
                        Intent intent = new Intent(vivosmartHRDeviceSettings, (Class<?>) VivosmartHRDeviceSettingsDisplay.class);
                        intent.putExtra("GCM_deviceSettings", deviceSettingsDTO);
                        vivosmartHRDeviceSettings.startActivityForResult(intent, 10);
                        break;
                    case 1:
                        int i111 = VivosmartHRDeviceSettings.D;
                        TimeDateSystemDeviceSettings.da(vivosmartHRDeviceSettings, vivosmartHRDeviceSettings.f125985k, vivosmartHRDeviceSettings.getString(R.string.device_setting_system));
                        break;
                    case 2:
                        int i112 = VivosmartHRDeviceSettings.D;
                        AlarmDeviceSettings.ca(vivosmartHRDeviceSettings, vivosmartHRDeviceSettings.f125985k, 10);
                        break;
                    case 3:
                        int i113 = VivosmartHRDeviceSettings.D;
                        DeviceSettingsDTO deviceSettingsDTO2 = vivosmartHRDeviceSettings.f125985k;
                        int i24 = VivosmartDeviceSettingsOrientation.f42372y;
                        Intent intent2 = new Intent(vivosmartHRDeviceSettings, (Class<?>) VivosmartDeviceSettingsOrientation.class);
                        intent2.putExtra("GCM_deviceSettings", deviceSettingsDTO2);
                        vivosmartHRDeviceSettings.startActivityForResult(intent2, 10);
                        break;
                    default:
                        int i25 = VivosmartHRDeviceSettings.D;
                        DeviceSettingsActivityTracking.ca(vivosmartHRDeviceSettings, vivosmartHRDeviceSettings.f125985k, vivosmartHRDeviceSettings.getString(R.string.activity_tracking_title), vivosmartHRDeviceSettings.f125976b);
                        break;
                }
            }
        };
        final int i19 = 0;
        this.f42429z = new CompoundButton.OnCheckedChangeListener(this) { // from class: ng1.k1

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ VivosmartHRDeviceSettings f125959b;

            {
                this.f125959b = this;
            }

            @Override // android.widget.CompoundButton.OnCheckedChangeListener
            public final void onCheckedChanged(CompoundButton compoundButton, boolean z14) {
                int i24 = i19;
                VivosmartHRDeviceSettings vivosmartHRDeviceSettings = this.f125959b;
                switch (i24) {
                    case 0:
                        int i25 = VivosmartHRDeviceSettings.D;
                        vivosmartHRDeviceSettings.f125985k.f33885m.F(Boolean.valueOf(z14));
                        break;
                    default:
                        int i26 = VivosmartHRDeviceSettings.D;
                        DeviceSettingsDTO deviceSettingsDTO = vivosmartHRDeviceSettings.f125985k;
                        deviceSettingsDTO.K0 = Boolean.valueOf(z14);
                        deviceSettingsDTO.S1("opticalHeartRateEnabled");
                        break;
                }
            }
        };
        final int i24 = 1;
        this.A = new CompoundButton.OnCheckedChangeListener(this) { // from class: ng1.k1

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ VivosmartHRDeviceSettings f125959b;

            {
                this.f125959b = this;
            }

            @Override // android.widget.CompoundButton.OnCheckedChangeListener
            public final void onCheckedChanged(CompoundButton compoundButton, boolean z14) {
                int i25 = i24;
                VivosmartHRDeviceSettings vivosmartHRDeviceSettings = this.f125959b;
                switch (i25) {
                    case 0:
                        int i26 = VivosmartHRDeviceSettings.D;
                        vivosmartHRDeviceSettings.f125985k.f33885m.F(Boolean.valueOf(z14));
                        break;
                    default:
                        int i27 = VivosmartHRDeviceSettings.D;
                        DeviceSettingsDTO deviceSettingsDTO = vivosmartHRDeviceSettings.f125985k;
                        deviceSettingsDTO.K0 = Boolean.valueOf(z14);
                        deviceSettingsDTO.S1("opticalHeartRateEnabled");
                        break;
                }
            }
        };
    }

    @Override // ng1.j
    public final int ea() {
        return R.layout.gcm3_device_settings_vivosmart_hr;
    }

    @Override // ng1.j
    public final GCMComplexOneLineButton ga() {
        return (GCMComplexOneLineButton) findViewById(R.id.device_settings_vivosmarthr_auto_upload_btn);
    }

    @Override // ng1.j
    public final GCMComplexOneLineButton ia() {
        return (GCMComplexOneLineButton) findViewById(R.id.device_settings_weather);
    }

    public final void ka() {
        if (this.f125985k.D() == null || this.f125985k.D().size() <= 0) {
            return;
        }
        String str = this.f125985k.D().get(0).f34181a;
        com.garmin.android.apps.connectmobile.devices.model.c.f34112c.getClass();
        com.garmin.android.apps.connectmobile.devices.model.c cVarA = com.garmin.android.apps.connectmobile.devices.model.c.a.a(str);
        com.garmin.android.apps.connectmobile.devices.model.c cVar = com.garmin.android.apps.connectmobile.devices.model.c.OFF;
        GCMComplexTwoLineButton gCMComplexTwoLineButton = this.B;
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
                boolean zS = this.f125985k.f33885m.s();
                GCMComplexOneLineButton gCMComplexOneLineButton = this.C;
                if (zS) {
                    gCMComplexOneLineButton.setVisibility(0);
                } else {
                    gCMComplexOneLineButton.setVisibility(8);
                }
            }
        }
    }

    @Override // ng1.j, ng1.p, com.garmin.android.apps.connectmobile.c, com.garmin.android.apps.connectmobile.z1, com.garmin.android.apps.connectmobile.v, androidx.fragment.app.m, b.g, z6.e, android.app.Activity
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        GCMComplexTwoLineButton gCMComplexTwoLineButton = (GCMComplexTwoLineButton) findViewById(R.id.device_settings_vivosmarthr_alarm_btn);
        this.B = gCMComplexTwoLineButton;
        gCMComplexTwoLineButton.setOnClickListener(this.f42426w);
        GCMComplexOneLineButton gCMComplexOneLineButton = (GCMComplexOneLineButton) findViewById(R.id.device_settings_vivosmarthr_display_btn);
        gCMComplexOneLineButton.setOnClickListener(this.f42424t);
        GCMComplexOneLineButton gCMComplexOneLineButton2 = (GCMComplexOneLineButton) findViewById(R.id.device_settings_vivosmarthr_orientation_btn);
        gCMComplexOneLineButton2.setOnClickListener(this.f42427x);
        ((GCMComplexOneLineButton) findViewById(R.id.device_settings_vivosmarthr_time_date_system_btn)).setOnClickListener(this.f42425v);
        GCMComplexOneLineButton gCMComplexOneLineButton3 = (GCMComplexOneLineButton) findViewById(R.id.device_settings_activity_tracking_btn);
        gCMComplexOneLineButton3.setOnClickListener(this.f42428y);
        GCMComplexOneLineButton gCMComplexOneLineButton4 = (GCMComplexOneLineButton) findViewById(R.id.device_settings_vivosmarthr_move_alert_btn);
        this.C = gCMComplexOneLineButton4;
        gCMComplexOneLineButton4.setOnCheckedChangeListener(this.f42429z);
        GCMComplexOneLineButton gCMComplexOneLineButton5 = (GCMComplexOneLineButton) findViewById(R.id.device_settings_vivosmarthr_heart_rate_monitor);
        gCMComplexOneLineButton5.setOnCheckedChangeListener(this.A);
        DeviceSettingsDTO deviceSettingsDTO = this.f125985k;
        String[] strArr = {"enabledScreens", "visibleScreens"};
        deviceSettingsDTO.getClass();
        for (int i14 = 0; i14 < 2; i14++) {
            if (deviceSettingsDTO.s1(strArr[i14])) {
                gCMComplexOneLineButton.setVisibility(8);
                break;
            }
        }
        DeviceSettingsDTO deviceSettingsDTO2 = this.f125985k;
        String[] strArr2 = {"screenOrientation", "mountingSide"};
        deviceSettingsDTO2.getClass();
        for (int i15 = 0; i15 < 2; i15++) {
            if (deviceSettingsDTO2.s1(strArr2[i15])) {
                gCMComplexOneLineButton2.setVisibility(8);
                break;
            }
        }
        if (this.f125985k.D() == null || this.f125985k.D().size() <= 0) {
            this.B.setVisibility(8);
        } else {
            ka();
        }
        if (this.f125985k.s1("activityTracking")) {
            gCMComplexOneLineButton3.setVisibility(8);
            this.C.setVisibility(8);
        } else {
            gCMComplexOneLineButton3.setVisibility(0);
            boolean zS = this.f125985k.f33885m.s();
            GCMComplexOneLineButton gCMComplexOneLineButton6 = this.C;
            if (zS) {
                gCMComplexOneLineButton6.setVisibility(0);
                gCMComplexOneLineButton3.k();
            } else {
                gCMComplexOneLineButton6.setVisibility(8);
                gCMComplexOneLineButton3.j();
            }
            boolean zT = this.f125985k.f33885m.t();
            GCMComplexOneLineButton gCMComplexOneLineButton7 = this.C;
            if (zT) {
                gCMComplexOneLineButton7.k();
            } else {
                gCMComplexOneLineButton7.j();
            }
        }
        if (this.f125985k.s1("opticalHeartRateEnabled")) {
            gCMComplexOneLineButton5.setVisibility(8);
        } else if (this.f125985k.v1()) {
            gCMComplexOneLineButton5.k();
        } else {
            gCMComplexOneLineButton5.j();
        }
    }
}
