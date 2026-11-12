package com.garmin.android.apps.connectmobile.settings.devices.common;

import android.content.Intent;
import android.os.Bundle;
import androidx.appcompat.widget.AppCompatEditText;
import ch1.j0;
import com.garmin.android.apps.connectmobile.R;
import com.garmin.android.apps.connectmobile.a2;
import com.garmin.android.apps.connectmobile.devices.model.DeviceSettingsDTO;
import com.garmin.android.apps.connectmobile.i2;
import java.util.Observable;
import java.util.Observer;
import vg1.m;

/* JADX INFO: loaded from: classes10.dex */
public class DeviceCustomWidgetActivity extends com.garmin.android.apps.connectmobile.c implements Observer {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public AppCompatEditText f42620a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public boolean f42621b = false;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f42622c = 0;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f42623d = 0;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public DeviceSettingsDTO f42624e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public j0 f42625f;

    @Override // android.app.Activity
    public final void finish() {
        j0 j0Var = this.f42625f;
        if (j0Var != null) {
            j0Var.n();
        }
        setResult(-1, new Intent().putExtra("GCM_deviceSettings", this.f42624e));
        super.finish();
    }

    @Override // com.garmin.android.apps.connectmobile.c, com.garmin.android.apps.connectmobile.z1, com.garmin.android.apps.connectmobile.v, androidx.fragment.app.m, b.g, z6.e, android.app.Activity
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(R.layout.gcm3_input_field);
        AppCompatEditText appCompatEditText = (AppCompatEditText) findViewById(R.id.inputField);
        this.f42620a = appCompatEditText;
        appCompatEditText.addTextChangedListener(new m(this));
        initActionBar(true, R.string.device_settings_custom_widget);
        Bundle extras = getIntent().getExtras();
        DeviceSettingsDTO deviceSettingsDTO = extras != null ? (DeviceSettingsDTO) extras.getParcelable("GCM_deviceSettings") : null;
        this.f42624e = deviceSettingsDTO;
        if (deviceSettingsDTO == null) {
            i2.f(a2.SETTINGS, "DevCustomWidgetActivity", "onCreate: mDeviceSettingsDTO is null. Finishing activity.");
            finish();
            return;
        }
        j0 j0Var = new j0(this);
        this.f42625f = j0Var;
        boolean zG = j0Var.g(this, this.f42624e);
        this.f42625f.addObserver(this);
        this.f42625f.m(zG);
    }

    @Override // java.util.Observer
    public final void update(Observable observable, Object obj) {
        i2.a(a2.SETTINGS, "DevCustomWidgetActivity", "update() called with: observable = [" + observable + "], data = [" + obj + "]");
    }
}
