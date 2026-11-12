package com.garmin.android.apps.connectmobile.settings.devices;

import android.content.Intent;
import android.os.Bundle;
import ch1.f3;
import ch1.n6;
import ch1.q4;
import ch1.r;
import ch1.u4;
import ch1.v2;
import ch1.y0;
import ch1.y2;
import com.garmin.android.apps.connectmobile.R;
import com.garmin.android.apps.connectmobile.a2;
import com.garmin.android.apps.connectmobile.devices.model.DeviceSettingsDTO;
import com.garmin.android.apps.connectmobile.i2;
import com.garmin.android.apps.connectmobile.settings.devices.common.DevicePhoneNotificationsActivityDefault;
import java.util.ArrayList;
import java.util.Observable;
import org.koin.java.KoinJavaComponent;
import zb0.d0;

/* JADX INFO: loaded from: classes10.dex */
public class ApproachS60DeviceSettings extends Fenix5DeviceSettings {
    @Override // com.garmin.android.apps.connectmobile.settings.devices.Forerunner935DeviceSettings, ng1.j
    public final int ea() {
        return R.layout.gcm3_device_settings_approach_s60;
    }

    @Override // com.garmin.android.apps.connectmobile.settings.devices.Forerunner935DeviceSettings, ng1.j, ng1.p, com.garmin.android.apps.connectmobile.c, com.garmin.android.apps.connectmobile.z1, com.garmin.android.apps.connectmobile.v, androidx.fragment.app.m, b.g, z6.e, android.app.Activity
    public final void onCreate(Bundle bundle) {
        i2.a(a2.SETTINGS, "ApproachS60DeviceSettings", "onCreate");
        super.onCreate(bundle);
        ArrayList arrayList = this.f42119t;
        arrayList.clear();
        arrayList.add(new y2(this));
        arrayList.add(new ch1.b(this));
        arrayList.add(new y0(this));
        arrayList.add(new n6(this));
        arrayList.add(new f3(this));
        arrayList.add(new u4(this));
        arrayList.add(new v2(this));
        arrayList.add(new q4(this));
        la();
    }

    @Override // com.garmin.android.apps.connectmobile.settings.devices.Fenix5DeviceSettings, com.garmin.android.apps.connectmobile.settings.devices.Forerunner935DeviceSettings, ng1.p, java.util.Observer
    public final void update(Observable observable, Object obj) {
        i2.k(a2.SETTINGS, "ApproachS60DeviceSettings", hb.a.j("update(): observable=", observable, ", data=", obj));
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
                if (observable instanceof f3) {
                    DevicePhoneNotificationsActivityDefault.ca(this, this.f125985k, (String) obj, ((d0) KoinJavaComponent.get(d0.class)).J(this.f125980f), this.f125978d);
                    return;
                } else {
                    super.update(observable, obj);
                    return;
                }
            }
            DeviceSettingsDTO deviceSettingsDTO = this.f125985k;
            Intent intent = new Intent(this, (Class<?>) ApproachS60AutoOnDisplayActivity.class);
            intent.putExtra("GCM_deviceSettings", deviceSettingsDTO);
            intent.putExtra("GCM_deviceSettingsTitle", (String) obj);
            startActivityForResult(intent, 10);
        }
    }
}
