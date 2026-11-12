package com.garmin.android.apps.connectmobile.settings.devices;

import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import ch1.b5;
import ch1.g2;
import ch1.i;
import com.garmin.android.apps.connectmobile.R;
import com.garmin.android.apps.connectmobile.a2;
import com.garmin.android.apps.connectmobile.devices.model.DeviceSettingsDTO;
import com.garmin.android.apps.connectmobile.i2;
import ng1.j;

/* JADX INFO: loaded from: classes10.dex */
public class Forerunner35TonesDeviceSettings extends com.garmin.android.apps.connectmobile.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public DeviceSettingsDTO f42109a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public g2 f42110b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public i f42111c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public b5 f42112d;

    public static void ca(j jVar, DeviceSettingsDTO deviceSettingsDTO, String str) {
        Intent intent = new Intent(jVar, (Class<?>) Forerunner35TonesDeviceSettings.class);
        intent.putExtra("GCM_deviceSettings", deviceSettingsDTO);
        intent.putExtra("GCM_deviceSettingsTitle", str);
        jVar.startActivityForResult(intent, 10);
    }

    @Override // android.app.Activity
    public final void finish() {
        getIntent().putExtra("GCM_deviceSettings", this.f42109a);
        setResult(-1, getIntent());
        super.finish();
    }

    @Override // com.garmin.android.apps.connectmobile.c, com.garmin.android.apps.connectmobile.z1, com.garmin.android.apps.connectmobile.v, androidx.fragment.app.m, b.g, z6.e, android.app.Activity
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(R.layout.gcm3_device_settings_tones);
        if (getIntent().getExtras() != null) {
            this.f42109a = (DeviceSettingsDTO) getIntent().getExtras().getParcelable("GCM_deviceSettings");
            String stringExtra = getIntent().getStringExtra("GCM_deviceSettingsTitle");
            if (TextUtils.isEmpty(stringExtra)) {
                stringExtra = getString(R.string.device_setting_alert_tones);
            }
            initActionBar(true, stringExtra);
        }
        if (this.f42109a == null) {
            i2.f(a2.SETTINGS, "Forerunner35TonesDeviceSettings", "Invalid device settings object while entering device settings Phone Alert Tones Device Settings screen!");
            finish();
            return;
        }
        this.f42110b = new g2(this);
        this.f42111c = new i(this);
        this.f42112d = new b5(this);
        this.f42110b.g(this, this.f42109a);
        this.f42111c.g(this, this.f42109a);
        this.f42112d.g(this, this.f42109a);
    }
}
