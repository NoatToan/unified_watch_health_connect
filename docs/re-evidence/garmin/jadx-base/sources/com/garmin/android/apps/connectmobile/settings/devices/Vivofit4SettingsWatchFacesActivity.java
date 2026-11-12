package com.garmin.android.apps.connectmobile.settings.devices;

import android.content.Intent;
import android.os.Bundle;
import android.widget.ImageView;
import ch1.q5;
import com.garmin.android.apps.connectmobile.R;
import com.garmin.android.apps.connectmobile.a2;
import com.garmin.android.apps.connectmobile.devices.model.DeviceSettingsDTO;
import com.garmin.android.apps.connectmobile.i2;
import java.util.Observable;
import java.util.Observer;
import zb0.u0;

/* JADX INFO: loaded from: classes10.dex */
public class Vivofit4SettingsWatchFacesActivity extends com.garmin.android.apps.connectmobile.c implements Observer {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public DeviceSettingsDTO f42289a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public q5 f42290b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public ImageView f42291c;

    @Override // android.app.Activity
    public final void finish() {
        q5 q5Var = this.f42290b;
        if (q5Var != null) {
            q5Var.n();
        }
        Intent intent = new Intent();
        intent.putExtra("GCM_deviceSettings", this.f42289a);
        setResult(-1, intent);
        super.finish();
    }

    /* JADX WARN: Code duplicated, block: B:10:0x002c  */
    @Override // com.garmin.android.apps.connectmobile.c, com.garmin.android.apps.connectmobile.z1, com.garmin.android.apps.connectmobile.v, androidx.fragment.app.m, b.g, z6.e, android.app.Activity
    public final void onCreate(Bundle bundle) {
        String stringExtra;
        super.onCreate(bundle);
        setContentView(R.layout.gcm3_settings_select_watchface_activity);
        Intent intent = getIntent();
        if (intent == null) {
            stringExtra = "";
        } else {
            if (intent.hasExtra("GCM_deviceSettings")) {
                this.f42289a = (DeviceSettingsDTO) intent.getParcelableExtra("GCM_deviceSettings");
            }
            if (intent.hasExtra("GCM_deviceSettingsTitle")) {
                stringExtra = intent.getStringExtra("GCM_deviceSettingsTitle");
            } else {
                stringExtra = "";
            }
        }
        if (this.f42289a == null) {
            i2.f(a2.SETTINGS, "VVF4SettingsWatchFaces", "onCreate: mDeviceSettingsDTO is null. Finishing activity.");
            finish();
            return;
        }
        initActionBar(true, stringExtra);
        q5 q5Var = new q5(this);
        this.f42290b = q5Var;
        DeviceSettingsDTO deviceSettingsDTO = this.f42289a;
        if (deviceSettingsDTO != null) {
            boolean zV = q5Var.v(findViewById(R.id.device_settings_vivofit3_watch_face_section), this, deviceSettingsDTO);
            this.f42290b.addObserver(this);
            this.f42290b.m(zV);
        }
        ImageView imageView = (ImageView) findViewById(R.id.image_watchface_current_view);
        this.f42291c = imageView;
        DeviceSettingsDTO deviceSettingsDTO2 = this.f42289a;
        String str = deviceSettingsDTO2.R0;
        u0 u0Var = u0.H1;
        DeviceSettingsDTO.q qVarI0 = deviceSettingsDTO2.i0();
        DeviceSettingsDTO.n nVarF0 = this.f42289a.f0();
        if (str == null || str.isEmpty()) {
            str = "DEFAULT";
        }
        imageView.setImageResource(hv.f.a(u0Var, qVarI0, nVarF0, str));
    }

    @Override // java.util.Observer
    public final void update(Observable observable, Object obj) {
        ImageView imageView = this.f42291c;
        if (imageView == null || obj == null) {
            return;
        }
        DeviceSettingsDTO.q qVar = (DeviceSettingsDTO.q) obj;
        DeviceSettingsDTO deviceSettingsDTO = this.f42289a;
        String str = "DEFAULT";
        if (deviceSettingsDTO == null) {
            imageView.setImageResource(hv.f.a(u0.H1, DeviceSettingsDTO.q.DIGITAL_TRADITIONAL, DeviceSettingsDTO.n.SINGLE_SCREEN, "DEFAULT"));
            return;
        }
        String str2 = deviceSettingsDTO.R0;
        u0 u0Var = u0.H1;
        if (qVar == DeviceSettingsDTO.q.DIGITAL_TRADITIONAL_SPLIT) {
            qVar = DeviceSettingsDTO.q.DIGITAL_TRADITIONAL;
        }
        DeviceSettingsDTO.n nVarF0 = deviceSettingsDTO.f0();
        if (str2 != null && !str2.isEmpty()) {
            str = str2;
        }
        imageView.setImageResource(hv.f.a(u0Var, qVar, nVarF0, str));
    }
}
