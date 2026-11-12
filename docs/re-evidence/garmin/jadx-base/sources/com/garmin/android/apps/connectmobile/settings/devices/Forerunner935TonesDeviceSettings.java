package com.garmin.android.apps.connectmobile.settings.devices;

import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import ch1.b5;
import ch1.g2;
import ch1.h2;
import com.garmin.android.apps.connectmobile.R;
import com.garmin.android.apps.connectmobile.a2;
import com.garmin.android.apps.connectmobile.devices.model.DeviceSettingsDTO;
import com.garmin.android.apps.connectmobile.i2;
import com.garmin.android.apps.connectmobile.view.view_3_0.GCMComplexTwoLineButton;
import ng1.v0;

/* JADX INFO: loaded from: classes10.dex */
public class Forerunner935TonesDeviceSettings extends com.garmin.android.apps.connectmobile.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public DeviceSettingsDTO f42126a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public g2 f42127b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public b5 f42128c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public h2 f42129d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public GCMComplexTwoLineButton f42130e;

    public final void ca() {
        boolean zX1 = this.f42126a.x1();
        boolean zH1 = this.f42126a.h1();
        if (!zX1 && zH1) {
            this.f42130e.setButtonBottomLeftLabel(getString(R.string.lbl_on));
            return;
        }
        if (zX1) {
            this.f42130e.setButtonBottomLeftLabel(getString(R.string.device_settings_during_activity));
        } else {
            if (zX1 || zH1) {
                return;
            }
            this.f42130e.setButtonBottomLeftLabel(getString(R.string.lbl_off));
        }
    }

    @Override // android.app.Activity
    public final void finish() {
        Intent intent = new Intent();
        intent.putExtra("GCM_deviceSettings", this.f42126a);
        setResult(-1, intent);
        super.finish();
    }

    @Override // com.garmin.android.apps.connectmobile.z1, androidx.fragment.app.m, b.g, android.app.Activity
    public final void onActivityResult(int i14, int i15, Intent intent) {
        Bundle extras;
        super.onActivityResult(i14, i15, intent);
        if (i15 != -1 || i14 != 11 || intent == null || (extras = intent.getExtras()) == null) {
            return;
        }
        this.f42126a = (DeviceSettingsDTO) extras.get("GCM_deviceSettings");
        ca();
        this.f42127b.k(this.f42126a);
        this.f42128c.k(this.f42126a);
        this.f42129d.k(this.f42126a);
    }

    @Override // com.garmin.android.apps.connectmobile.c, com.garmin.android.apps.connectmobile.z1, com.garmin.android.apps.connectmobile.v, androidx.fragment.app.m, b.g, z6.e, android.app.Activity
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(R.layout.gcm3_935_device_settings_tones);
        Bundle extras = getIntent().getExtras();
        if (extras != null) {
            this.f42126a = (DeviceSettingsDTO) extras.getParcelable("GCM_deviceSettings");
            String string = extras.getString("GCM_deviceSettingsTitle");
            if (TextUtils.isEmpty(string)) {
                string = getString(R.string.device_setting_alert_tones);
            }
            initActionBar(true, string);
        }
        if (this.f42126a == null) {
            i2.f(a2.SETTINGS, "Forerunner935TonesDeviceSettings", "Invalid device settings object while entering device settings Phone Alert Tones Device Settings screen!");
            finish();
            return;
        }
        this.f42127b = new g2(this);
        this.f42128c = new b5(this, getString(R.string.device_settings_key_vibration));
        this.f42129d = new h2(this);
        this.f42127b.g(this, this.f42126a);
        this.f42128c.g(this, this.f42126a);
        this.f42129d.g(this, this.f42126a);
        this.f42130e = (GCMComplexTwoLineButton) findViewById(R.id.device_settings_alert_tones_btn);
        ca();
        this.f42130e.setOnClickListener(new v0(this));
    }
}
