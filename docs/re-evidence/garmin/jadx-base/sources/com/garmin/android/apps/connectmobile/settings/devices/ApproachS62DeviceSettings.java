package com.garmin.android.apps.connectmobile.settings.devices;

import android.content.Intent;
import android.os.Bundle;
import ch1.n6;
import ch1.q4;
import ch1.r;
import ch1.y2;
import com.garmin.android.apps.connectmobile.a2;
import com.garmin.android.apps.connectmobile.devices.model.DeviceSettingsDTO;
import com.garmin.android.apps.connectmobile.i2;
import java.util.Observable;

/* JADX INFO: loaded from: classes10.dex */
public class ApproachS62DeviceSettings extends Fenix5DeviceSettings {
    @Override // com.garmin.android.apps.connectmobile.settings.devices.Forerunner935DeviceSettings, ng1.j, ng1.p, com.garmin.android.apps.connectmobile.c, com.garmin.android.apps.connectmobile.z1, com.garmin.android.apps.connectmobile.v, androidx.fragment.app.m, b.g, z6.e, android.app.Activity
    public final void onCreate(Bundle bundle) {
        i2.a(a2.SETTINGS, "ApproachS62DeviceSettings", "onCreate");
        super.onCreate(bundle);
        this.f42119t.add(new n6(this));
        la();
    }

    @Override // com.garmin.android.apps.connectmobile.settings.devices.Fenix5DeviceSettings, com.garmin.android.apps.connectmobile.settings.devices.Forerunner935DeviceSettings, ng1.p, java.util.Observer
    public final void update(Observable observable, Object obj) {
        i2.k(a2.SETTINGS, "ApproachS62DeviceSettings", hb.a.j("update(): observable=", observable, ", data=", obj));
        if (obj != null) {
            String str = obj instanceof String ? (String) obj : null;
            if (observable instanceof q4) {
                Forerunner35DeviceSystemSettings.ca(this, this.f125985k, str, false);
                return;
            }
            if (observable instanceof y2) {
                MultipleAlarmsSettingsActivity.fa(this, this.f125985k, this.f125976b);
                return;
            }
            if (!(observable instanceof r)) {
                super.update(observable, obj);
                return;
            }
            DeviceSettingsDTO deviceSettingsDTO = this.f125985k;
            Intent intent = new Intent(this, (Class<?>) ApproachS60AutoOnDisplayActivity.class);
            intent.putExtra("GCM_deviceSettings", deviceSettingsDTO);
            intent.putExtra("GCM_deviceSettingsTitle", (String) obj);
            startActivityForResult(intent, 10);
        }
    }
}
