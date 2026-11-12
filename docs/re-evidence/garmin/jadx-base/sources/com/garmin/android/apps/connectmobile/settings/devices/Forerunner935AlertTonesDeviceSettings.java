package com.garmin.android.apps.connectmobile.settings.devices;

import android.content.Intent;
import android.os.Bundle;
import com.garmin.android.apps.connectmobile.R;
import com.garmin.android.apps.connectmobile.a2;
import com.garmin.android.apps.connectmobile.devices.model.DeviceSettingsDTO;
import com.garmin.android.apps.connectmobile.i2;
import com.garmin.android.apps.connectmobile.view.view_3_0.GCMCheckableRow;
import ng1.s0;
import ng1.t0;
import ng1.u0;

/* JADX INFO: loaded from: classes10.dex */
public class Forerunner935AlertTonesDeviceSettings extends com.garmin.android.apps.connectmobile.c {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final /* synthetic */ int f42113e = 0;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public GCMCheckableRow f42114a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public GCMCheckableRow f42115b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public GCMCheckableRow f42116c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public DeviceSettingsDTO f42117d;

    public final void ca() {
        boolean z14 = false;
        this.f42114a.c(!this.f42117d.x1() && this.f42117d.h1());
        this.f42115b.c(this.f42117d.x1());
        GCMCheckableRow gCMCheckableRow = this.f42116c;
        if (!this.f42117d.x1() && !this.f42117d.h1()) {
            z14 = true;
        }
        gCMCheckableRow.c(z14);
    }

    @Override // android.app.Activity
    public final void finish() {
        Intent intent = new Intent();
        intent.putExtra("GCM_deviceSettings", this.f42117d);
        setResult(-1, intent);
        super.finish();
    }

    @Override // com.garmin.android.apps.connectmobile.c, com.garmin.android.apps.connectmobile.z1, com.garmin.android.apps.connectmobile.v, androidx.fragment.app.m, b.g, z6.e, android.app.Activity
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(R.layout.gcm3_935_device_settings_alert_tones);
        initActionBar(true, getString(R.string.device_setting_alert_tones));
        Bundle extras = getIntent().getExtras();
        if (extras != null) {
            this.f42117d = (DeviceSettingsDTO) extras.getParcelable("GCM_deviceSettings");
        }
        if (this.f42117d == null) {
            i2.f(a2.SETTINGS, "Forerunner935AlertTonesDeviceSettings", "Invalid device settings object while entering device settings Phone Alert Tones Device Settings screen!");
            finish();
            return;
        }
        this.f42114a = (GCMCheckableRow) findViewById(R.id.device_settings_alert_tones_on);
        this.f42115b = (GCMCheckableRow) findViewById(R.id.device_settings_alert_tones_in_app);
        this.f42116c = (GCMCheckableRow) findViewById(R.id.device_settings_alert_tones_off);
        this.f42114a.setOnCheckChangeListener(new s0(this));
        this.f42115b.setOnCheckChangeListener(new t0(this));
        this.f42116c.setOnCheckChangeListener(new u0(this));
        ca();
    }
}
