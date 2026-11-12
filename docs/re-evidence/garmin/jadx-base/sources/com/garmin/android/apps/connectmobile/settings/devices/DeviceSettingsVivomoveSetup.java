package com.garmin.android.apps.connectmobile.settings.devices;

import android.content.Intent;
import com.garmin.android.apps.connectmobile.settings.model.AutoActivityDetectDTO;
import org.koin.java.KoinJavaComponent;
import zb0.d0;

/* JADX INFO: loaded from: classes10.dex */
public class DeviceSettingsVivomoveSetup extends DeviceSettingsActivityTrackerSetup implements com.garmin.android.library.backgroundtaskmanagement.b.InterfaceC0995b {

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public AutoActivityDetectDTO f42008r;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public long f42009t;

    @Override // com.garmin.android.apps.connectmobile.settings.devices.DeviceSettingsActivityTrackerSetup, com.garmin.android.apps.connectmobile.settings.devices.ActivityTrackerSetup
    public final Intent ca() {
        Intent intentCa = super.ca();
        intentCa.putExtra("GCM_deviceSettings", this.f41970p);
        intentCa.putExtra("GCM_autoActivityDetectValue", this.f42008r);
        return intentCa;
    }

    @Override // com.garmin.android.apps.connectmobile.settings.devices.DeviceSettingsActivityTrackerSetup, com.garmin.android.apps.connectmobile.settings.devices.ActivityTrackerSetup
    public final void ea() {
        if (this.f41778f.get() == 2) {
            this.f42009t = ((d0) KoinJavaComponent.get(d0.class)).Z(this);
        }
    }

    @Override // com.garmin.android.library.backgroundtaskmanagement.b.InterfaceC0995b
    public final void onComplete(long j8, com.garmin.android.library.backgroundtaskmanagement.b.c cVar) {
        hideProgressOverlay();
        startActivity(ca());
        finish();
    }

    @Override // com.garmin.android.library.backgroundtaskmanagement.b.InterfaceC0995b
    public final void onResults(long j8, com.garmin.android.library.backgroundtaskmanagement.b.e eVar, Object obj) {
        this.f42008r = (AutoActivityDetectDTO) obj;
    }

    @Override // com.garmin.android.apps.connectmobile.settings.devices.DeviceSettingsActivityTrackerSetup, com.garmin.android.apps.connectmobile.settings.devices.ActivityTrackerSetup, com.garmin.android.apps.connectmobile.c, i.c, androidx.fragment.app.m, android.app.Activity
    public final void onStop() {
        super.onStop();
        long j8 = this.f42009t;
        if (j8 != -1) {
            com.garmin.android.library.backgroundtaskmanagement.c.f50123c.a(j8);
        }
    }
}
