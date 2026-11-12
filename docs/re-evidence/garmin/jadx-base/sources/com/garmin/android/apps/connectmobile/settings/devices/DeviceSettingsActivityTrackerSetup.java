package com.garmin.android.apps.connectmobile.settings.devices;

import android.content.Intent;
import android.os.Bundle;
import c22.y0;
import com.garmin.android.apps.connectmobile.devices.model.DeviceSettingsDTO;
import hb2.i;
import ng1.y;

/* JADX INFO: loaded from: classes10.dex */
public class DeviceSettingsActivityTrackerSetup extends ActivityTrackerSetup {

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public static final /* synthetic */ int f41968q = 0;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public d80.f<DeviceSettingsDTO> f41969o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public DeviceSettingsDTO f41970p;

    @Override // com.garmin.android.apps.connectmobile.settings.devices.ActivityTrackerSetup
    public Intent ca() {
        Intent intentCa = super.ca();
        intentCa.putExtra("GCM_deviceSettings", this.f41970p);
        return intentCa;
    }

    @Override // com.garmin.android.apps.connectmobile.settings.devices.ActivityTrackerSetup
    public void ea() {
        if (this.f41778f.get() == 2) {
            hideProgressOverlay();
            startActivity(ca());
            finish();
        }
    }

    @Override // com.garmin.android.apps.connectmobile.settings.devices.ActivityTrackerSetup, com.garmin.android.apps.connectmobile.c, com.garmin.android.apps.connectmobile.z1, com.garmin.android.apps.connectmobile.v, androidx.fragment.app.m, b.g, z6.e, android.app.Activity
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        if (i.a(this)) {
            showProgressOverlay();
            this.f41969o = e.N().r(this.f41773a, new y(this));
        } else if (km2.a.d(this.f41773a, km2.a.b())) {
            startActivity(ca());
        }
    }

    @Override // com.garmin.android.apps.connectmobile.settings.devices.ActivityTrackerSetup, com.garmin.android.apps.connectmobile.c, i.c, androidx.fragment.app.m, android.app.Activity
    public void onStop() {
        super.onStop();
        y0.a(this.f41969o);
    }
}
