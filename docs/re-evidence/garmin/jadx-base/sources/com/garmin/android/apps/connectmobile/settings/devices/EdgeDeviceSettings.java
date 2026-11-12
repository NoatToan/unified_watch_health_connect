package com.garmin.android.apps.connectmobile.settings.devices;

/* JADX INFO: loaded from: classes10.dex */
public class EdgeDeviceSettings extends DeviceSettings {
    @Override // com.garmin.android.apps.connectmobile.settings.devices.DeviceSettings
    public final void fa() {
        super.fa();
        this.f41962r.setEnabled(true);
    }

    @Override // com.garmin.android.apps.connectmobile.z1, b.g, android.app.Activity
    public final void onBackPressed() {
        if (ca()) {
            super.onBackPressed();
        } else {
            da();
        }
    }

    @Override // com.garmin.android.apps.connectmobile.z1, android.app.Activity
    public final boolean onNavigateUp() {
        onBackPressed();
        return true;
    }
}
