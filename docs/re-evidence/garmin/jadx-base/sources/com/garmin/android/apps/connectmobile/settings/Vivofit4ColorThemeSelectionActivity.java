package com.garmin.android.apps.connectmobile.settings;

import android.content.Intent;
import android.os.Bundle;
import ch1.p5;
import com.garmin.android.apps.connectmobile.R;
import com.garmin.android.apps.connectmobile.a2;
import com.garmin.android.apps.connectmobile.devices.model.DeviceSettingsDTO;
import com.garmin.android.apps.connectmobile.i2;
import java.util.Observable;
import java.util.Observer;

/* JADX INFO: loaded from: classes10.dex */
public class Vivofit4ColorThemeSelectionActivity extends com.garmin.android.apps.connectmobile.c implements Observer {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public DeviceSettingsDTO f41572a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public p5 f41573b;

    @Override // android.app.Activity
    public final void finish() {
        p5 p5Var = this.f41573b;
        if (p5Var != null) {
            p5Var.n();
        }
        Intent intent = new Intent();
        intent.putExtra("GCM_deviceSettings", this.f41572a);
        setResult(-1, intent);
        super.finish();
    }

    /* JADX WARN: Code duplicated, block: B:10:0x002c  */
    @Override // com.garmin.android.apps.connectmobile.c, com.garmin.android.apps.connectmobile.z1, com.garmin.android.apps.connectmobile.v, androidx.fragment.app.m, b.g, z6.e, android.app.Activity
    public final void onCreate(Bundle bundle) {
        String stringExtra;
        super.onCreate(bundle);
        setContentView(R.layout.gcm3_color_theme_selection_vivofit4);
        Intent intent = getIntent();
        if (intent == null) {
            stringExtra = "";
        } else {
            if (intent.hasExtra("GCM_deviceSettings")) {
                this.f41572a = (DeviceSettingsDTO) intent.getParcelableExtra("GCM_deviceSettings");
            }
            if (intent.hasExtra("GCM_deviceSettingsTitle")) {
                stringExtra = intent.getStringExtra("GCM_deviceSettingsTitle");
            } else {
                stringExtra = "";
            }
        }
        if (this.f41572a == null) {
            i2.f(a2.SETTINGS, "Vivofit4ColorThemeSel", "onCreate: mDeviceSettingsDTO is null. Finishing activity.");
            finish();
            return;
        }
        initActionBar(true, stringExtra);
        p5 p5Var = new p5(this);
        this.f41573b = p5Var;
        DeviceSettingsDTO deviceSettingsDTO = this.f41572a;
        if (deviceSettingsDTO != null) {
            boolean zV = p5Var.v(findViewById(R.id.device_settings_color_theme_section), this, deviceSettingsDTO);
            this.f41573b.addObserver(this);
            this.f41573b.m(zV);
        }
    }

    @Override // java.util.Observer
    public final void update(Observable observable, Object obj) {
    }
}
