package com.garmin.android.apps.connectmobile.settings;

import android.content.SharedPreferences;
import android.os.Bundle;
import androidx.appcompat.widget.SwitchCompat;
import com.garmin.android.apps.connectmobile.R;

/* JADX INFO: loaded from: classes10.dex */
public class DeviceConnectionAidViewer extends com.garmin.android.apps.connectmobile.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public SwitchCompat f41513a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public SharedPreferences f41514b;

    @Override // com.garmin.android.apps.connectmobile.c, com.garmin.android.apps.connectmobile.z1, com.garmin.android.apps.connectmobile.v, androidx.fragment.app.m, b.g, z6.e, android.app.Activity
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(R.layout.gcm_device_connection_aid);
        super.initActionBar(true, R.string.pref_device_connection_aid);
        this.f41513a = (SwitchCompat) findViewById(R.id.connection_aid_switch_btn);
        SharedPreferences sharedPreferences = getSharedPreferences("scan_mode", 0);
        this.f41514b = sharedPreferences;
        if (sharedPreferences.getBoolean("UserScanChoice", false)) {
            this.f41513a.setChecked(true);
        }
        this.f41513a.setOnCheckedChangeListener(new com.google.android.material.chip.a(this, 3));
    }
}
