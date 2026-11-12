package com.garmin.android.apps.connectmobile.settings.devices;

import com.garmin.android.apps.connectmobile.view.view_3_0.GCMComplexOneLineButton;
import com.garmin.android.apps.connectmobile.view.view_3_0.GCMComplexTwoLineButton;

/* JADX INFO: loaded from: classes10.dex */
public class OregonDeviceSettings extends DeviceSettings {
    @Override // com.garmin.android.apps.connectmobile.settings.devices.DeviceSettings
    public final void ea() {
        super.ea();
        GCMComplexTwoLineButton gCMComplexTwoLineButton = this.f41965w;
        if (gCMComplexTwoLineButton != null) {
            gCMComplexTwoLineButton.setVisibility(8);
        }
    }

    @Override // com.garmin.android.apps.connectmobile.settings.devices.DeviceSettings
    public final void fa() {
        super.fa();
        GCMComplexOneLineButton gCMComplexOneLineButton = this.f41962r;
        if (gCMComplexOneLineButton != null) {
            gCMComplexOneLineButton.setEnabled(true);
        }
    }

    @Override // com.garmin.android.apps.connectmobile.settings.devices.DeviceSettings
    public final void ga() {
        super.ga();
        GCMComplexOneLineButton gCMComplexOneLineButton = this.f41963t;
        if (gCMComplexOneLineButton != null) {
            gCMComplexOneLineButton.setVisibility(8);
        }
    }

    @Override // com.garmin.android.apps.connectmobile.settings.devices.DeviceSettings
    public final void ha() {
        super.ha();
        GCMComplexOneLineButton gCMComplexOneLineButton = this.f41964v;
        if (gCMComplexOneLineButton != null) {
            gCMComplexOneLineButton.setVisibility(8);
        }
    }
}
