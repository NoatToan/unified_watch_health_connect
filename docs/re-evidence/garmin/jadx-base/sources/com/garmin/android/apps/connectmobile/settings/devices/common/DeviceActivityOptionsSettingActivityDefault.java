package com.garmin.android.apps.connectmobile.settings.devices.common;

import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import com.garmin.android.apps.connectmobile.R;
import com.garmin.android.apps.connectmobile.a2;
import com.garmin.android.apps.connectmobile.i2;
import com.garmin.android.apps.connectmobile.settings.activityoptions.GCMBaseRunOptionsSettingsSetup;
import java.util.Observable;
import java.util.Observer;
import vg1.z;

/* JADX INFO: loaded from: classes10.dex */
public class DeviceActivityOptionsSettingActivityDefault extends GCMBaseRunOptionsSettingsSetup implements Observer {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public String f42595e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public String f42596f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public z f42597g;

    @Override // com.garmin.android.apps.connectmobile.settings.activityoptions.GCMBaseRunOptionsSettingsSetup
    public final void ca() {
        i2.k(a2.SETTINGS, "DeviceActivityOptionsSettingActivityDefault", "Opening Run options");
        Intent intent = new Intent();
        intent.putExtra("GCM_deviceUnitID", this.f41650a);
        intent.putExtra("GCM_deviceEnumValue", this.f41651b);
        intent.putExtra("GCM_deviceProductNbr", this.f42595e);
        intent.putExtra("GCM_deviceName", this.f42596f);
        intent.putExtra("GCM_deviceActivityOptions", this.f41652c);
        intent.setClassName(this, this.f42597g.getF178183p());
        startActivity(intent);
        finish();
    }

    @Override // com.garmin.android.apps.connectmobile.settings.activityoptions.GCMBaseRunOptionsSettingsSetup, com.garmin.android.apps.connectmobile.c, com.garmin.android.apps.connectmobile.z1, com.garmin.android.apps.connectmobile.v, androidx.fragment.app.m, b.g, z6.e, android.app.Activity
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        initActionBar(true, getString(R.string.activity_options_title));
        Intent intent = getIntent();
        this.f42595e = intent.getStringExtra("GCM_deviceProductNbr");
        this.f42596f = intent.getStringExtra("GCM_deviceName");
        if (Build.VERSION.SDK_INT >= 33) {
            this.f42597g = (z) intent.getParcelableExtra("GCM_deviceSettingsEnumValue", z.class);
        } else {
            this.f42597g = (z) intent.getParcelableExtra("GCM_deviceSettingsEnumValue");
        }
    }

    @Override // java.util.Observer
    public final void update(Observable observable, Object obj) {
    }
}
