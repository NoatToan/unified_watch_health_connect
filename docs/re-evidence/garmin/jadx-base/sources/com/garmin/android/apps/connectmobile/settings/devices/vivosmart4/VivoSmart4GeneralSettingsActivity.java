package com.garmin.android.apps.connectmobile.settings.devices.vivosmart4;

import android.content.Intent;
import android.os.Bundle;
import ch1.k2;
import ch1.m0;
import ch1.n6;
import ch1.p0;
import ch1.s2;
import ch1.s4;
import com.garmin.android.apps.connectmobile.devices.model.DeviceSettingsDTO;
import com.garmin.android.apps.connectmobile.settings.devices.common.DeviceNameWidgetActivity;
import com.garmin.android.apps.connectmobile.settings.devices.vivoactive3Music.Vivoactive3MusicGeneralSettingActivity;
import java.util.ArrayList;
import java.util.Observable;
import ng1.k0;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/garmin/android/apps/connectmobile/settings/devices/vivosmart4/VivoSmart4GeneralSettingsActivity;", "Lcom/garmin/android/apps/connectmobile/settings/devices/vivoactive3Music/Vivoactive3MusicGeneralSettingActivity;", "<init>", "()V", "gcm-device-settings_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class VivoSmart4GeneralSettingsActivity extends Vivoactive3MusicGeneralSettingActivity {
    @Override // com.garmin.android.apps.connectmobile.settings.devices.vivoactive3Music.Vivoactive3MusicGeneralSettingActivity, ng1.k0
    public final void fa() {
        ArrayList arrayList = this.f125956m;
        arrayList.clear();
        arrayList.add(new p0(this));
        arrayList.add(new n6(this));
        arrayList.add(new s4(this));
        arrayList.add(new m0(this));
        arrayList.add(new k2(this));
        if (this.f125977c.X0()) {
            arrayList.add(new s2(this));
        }
    }

    @Override // com.garmin.android.apps.connectmobile.z1, androidx.fragment.app.m, b.g, android.app.Activity
    public final void onActivityResult(int i14, int i15, Intent intent) {
        Bundle extras;
        super.onActivityResult(i14, i15, intent);
        if (i14 == 10 && i15 == -1) {
            Object obj = (intent == null || (extras = intent.getExtras()) == null) ? null : extras.get("GCM_deviceSettings");
            if (obj != null) {
                DeviceSettingsDTO deviceSettingsDTO = (DeviceSettingsDTO) obj;
                k0.ia(this.f125956m, deviceSettingsDTO);
                this.f125985k = deviceSettingsDTO;
            }
        }
    }

    @Override // com.garmin.android.apps.connectmobile.settings.devices.vivoactive3Music.Vivoactive3MusicGeneralSettingActivity, ng1.p, java.util.Observer
    public final void update(Observable observable, Object obj) {
        if (observable instanceof p0) {
            DeviceNameWidgetActivity.a aVar = DeviceNameWidgetActivity.f42633g;
            DeviceSettingsDTO deviceSettingsDTO = this.f125985k;
            aVar.getClass();
            DeviceNameWidgetActivity.a.a(this, deviceSettingsDTO, 10);
        }
        super.update(observable, obj);
    }
}
