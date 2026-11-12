package com.garmin.android.apps.connectmobile.settings.devices;

import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import com.garmin.android.apps.connectmobile.R;
import com.garmin.android.apps.connectmobile.devices.model.DeviceSettingsDTO;
import com.garmin.android.apps.connectmobile.settings.devices.AlarmDeviceSettings;
import com.garmin.android.apps.connectmobile.settings.devices.TimeDateSystemDeviceSettings;
import com.garmin.android.apps.connectmobile.settings.devices.VivosmartDeviceSettings;
import com.garmin.android.apps.connectmobile.settings.devices.VivosmartDeviceSettingsDisplay;
import com.garmin.android.apps.connectmobile.view.view_3_0.GCMComplexOneLineButton;
import com.garmin.android.apps.connectmobile.view.view_3_0.GCMComplexTwoLineButton;
import ng1.g1;
import ng1.j;

/* JADX INFO: loaded from: classes10.dex */
public class VivosmartDeviceSettings extends j {
    public static final /* synthetic */ int A = 0;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public GCMComplexTwoLineButton f42335t;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public GCMComplexTwoLineButton f42336v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final g1 f42337w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final g1 f42338x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final g1 f42339y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public final a f42340z = new a();

    public class a implements View.OnClickListener {
        public a() {
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(View view2) {
            VivosmartDeviceSettings vivosmartDeviceSettings = VivosmartDeviceSettings.this;
            View viewInflate = vivosmartDeviceSettings.getLayoutInflater().inflate(R.layout.gcm_dialog_text_editor, (ViewGroup) null);
            EditText editText = (EditText) viewInflate.findViewById(R.id.dialog_edit_text);
            editText.setInputType(2);
            editText.setHint(R.string.device_setting_wheel_size);
            String string = vivosmartDeviceSettings.getString(R.string.format_decimal_value);
            DeviceSettingsDTO deviceSettingsDTO = vivosmartDeviceSettings.f125985k;
            editText.setText(String.format(string, Long.valueOf(deviceSettingsDTO != null ? deviceSettingsDTO.P.longValue() : 0L)));
            if (!TextUtils.isEmpty(Long.toString(vivosmartDeviceSettings.f125985k.P.longValue()))) {
                editText.setSelection(Long.toString(vivosmartDeviceSettings.f125985k.P.longValue()).length());
            }
            androidx.appcompat.app.e eVarCreate = new androidx.appcompat.app.e.a(vivosmartDeviceSettings).setTitle(R.string.device_setting_wheel_size).setCancelable(true).setView(viewInflate).setPositiveButton(R.string.lbl_done, new hg1.g(24, this, viewInflate)).create();
            eVarCreate.getWindow().setSoftInputMode(4);
            eVarCreate.show();
        }
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [ng1.g1] */
    /* JADX WARN: Type inference failed for: r0v1, types: [ng1.g1] */
    /* JADX WARN: Type inference failed for: r0v2, types: [ng1.g1] */
    public VivosmartDeviceSettings() {
        final int i14 = 0;
        this.f42337w = new View.OnClickListener(this) { // from class: ng1.g1

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ VivosmartDeviceSettings f125937b;

            {
                this.f125937b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                int i15 = i14;
                VivosmartDeviceSettings vivosmartDeviceSettings = this.f125937b;
                switch (i15) {
                    case 0:
                        int i16 = VivosmartDeviceSettings.A;
                        DeviceSettingsDTO deviceSettingsDTO = vivosmartDeviceSettings.f125985k;
                        Intent intent = new Intent(vivosmartDeviceSettings, (Class<?>) VivosmartDeviceSettingsDisplay.class);
                        intent.putExtra("GCM_deviceSettings", deviceSettingsDTO);
                        vivosmartDeviceSettings.startActivityForResult(intent, 10);
                        break;
                    case 1:
                        int i17 = VivosmartDeviceSettings.A;
                        TimeDateSystemDeviceSettings.ca(vivosmartDeviceSettings, vivosmartDeviceSettings.f125985k);
                        break;
                    default:
                        int i18 = VivosmartDeviceSettings.A;
                        AlarmDeviceSettings.ca(vivosmartDeviceSettings, vivosmartDeviceSettings.f125985k, 10);
                        break;
                }
            }
        };
        final int i15 = 1;
        this.f42338x = new View.OnClickListener(this) { // from class: ng1.g1

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ VivosmartDeviceSettings f125937b;

            {
                this.f125937b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                int i16 = i15;
                VivosmartDeviceSettings vivosmartDeviceSettings = this.f125937b;
                switch (i16) {
                    case 0:
                        int i17 = VivosmartDeviceSettings.A;
                        DeviceSettingsDTO deviceSettingsDTO = vivosmartDeviceSettings.f125985k;
                        Intent intent = new Intent(vivosmartDeviceSettings, (Class<?>) VivosmartDeviceSettingsDisplay.class);
                        intent.putExtra("GCM_deviceSettings", deviceSettingsDTO);
                        vivosmartDeviceSettings.startActivityForResult(intent, 10);
                        break;
                    case 1:
                        int i18 = VivosmartDeviceSettings.A;
                        TimeDateSystemDeviceSettings.ca(vivosmartDeviceSettings, vivosmartDeviceSettings.f125985k);
                        break;
                    default:
                        int i19 = VivosmartDeviceSettings.A;
                        AlarmDeviceSettings.ca(vivosmartDeviceSettings, vivosmartDeviceSettings.f125985k, 10);
                        break;
                }
            }
        };
        final int i16 = 2;
        this.f42339y = new View.OnClickListener(this) { // from class: ng1.g1

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ VivosmartDeviceSettings f125937b;

            {
                this.f125937b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                int i17 = i16;
                VivosmartDeviceSettings vivosmartDeviceSettings = this.f125937b;
                switch (i17) {
                    case 0:
                        int i18 = VivosmartDeviceSettings.A;
                        DeviceSettingsDTO deviceSettingsDTO = vivosmartDeviceSettings.f125985k;
                        Intent intent = new Intent(vivosmartDeviceSettings, (Class<?>) VivosmartDeviceSettingsDisplay.class);
                        intent.putExtra("GCM_deviceSettings", deviceSettingsDTO);
                        vivosmartDeviceSettings.startActivityForResult(intent, 10);
                        break;
                    case 1:
                        int i19 = VivosmartDeviceSettings.A;
                        TimeDateSystemDeviceSettings.ca(vivosmartDeviceSettings, vivosmartDeviceSettings.f125985k);
                        break;
                    default:
                        int i110 = VivosmartDeviceSettings.A;
                        AlarmDeviceSettings.ca(vivosmartDeviceSettings, vivosmartDeviceSettings.f125985k, 10);
                        break;
                }
            }
        };
    }

    @Override // ng1.j
    public final int ea() {
        return R.layout.gcm3_device_settings_vivosmart;
    }

    public final void ka() {
        if (this.f125985k.D() == null || this.f125985k.D().size() <= 0) {
            return;
        }
        String str = this.f125985k.D().get(0).f34181a;
        com.garmin.android.apps.connectmobile.devices.model.c.f34112c.getClass();
        com.garmin.android.apps.connectmobile.devices.model.c cVarA = com.garmin.android.apps.connectmobile.devices.model.c.a.a(str);
        com.garmin.android.apps.connectmobile.devices.model.c cVar = com.garmin.android.apps.connectmobile.devices.model.c.OFF;
        GCMComplexTwoLineButton gCMComplexTwoLineButton = this.f42335t;
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
        ((GCMComplexOneLineButton) findViewById(R.id.device_settings_vivosmart_display_btn)).setOnClickListener(this.f42337w);
        ((GCMComplexOneLineButton) findViewById(R.id.device_settings_vivosmart_time_date_system_btn)).setOnClickListener(this.f42338x);
        GCMComplexTwoLineButton gCMComplexTwoLineButton = (GCMComplexTwoLineButton) findViewById(R.id.device_settings_vivosmart_alarm_btn);
        this.f42335t = gCMComplexTwoLineButton;
        gCMComplexTwoLineButton.setOnClickListener(this.f42339y);
        GCMComplexTwoLineButton gCMComplexTwoLineButton2 = (GCMComplexTwoLineButton) findViewById(R.id.device_settings_vivosmart_wheel_size_btn);
        this.f42336v = gCMComplexTwoLineButton2;
        gCMComplexTwoLineButton2.setOnClickListener(this.f42340z);
        if (this.f125985k.D() == null || this.f125985k.D().size() <= 0) {
            this.f42335t.setVisibility(8);
        } else {
            ka();
        }
        this.f42336v.setButtonBottomLeftLabel(Long.toString(this.f125985k.P.longValue()));
    }
}
