package com.garmin.android.apps.connectmobile.settings.devices;

import android.content.Intent;
import android.os.Bundle;
import ch1.b3;
import ch1.k6;
import ch1.n6;
import ch1.q4;
import ch1.u0;
import ch1.y2;
import com.garmin.android.apps.connectmobile.R;
import com.garmin.android.apps.connectmobile.a2;
import com.garmin.android.apps.connectmobile.devices.model.DeviceSettingsDTO;
import com.garmin.android.apps.connectmobile.i2;
import i3.e5;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Observable;
import java.util.Observer;
import ng1.j;

/* JADX INFO: loaded from: classes10.dex */
public class VivosportDeviceSettings extends j implements Observer {

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final ArrayList f42482t = new ArrayList();

    @Override // ng1.j
    public final int ea() {
        return R.layout.gcm3_device_settings_vivosmart_3;
    }

    @Override // com.garmin.android.apps.connectmobile.z1, androidx.fragment.app.m, b.g, android.app.Activity
    public final void onActivityResult(int i14, int i15, Intent intent) {
        n23.j.y(e5.j(i14, i15, "onActivityResult(): requestCode=", ", resultCode=", ", data="), intent, a2.SETTINGS, "VivosportDeviceSettings");
        super.onActivityResult(i14, i15, intent);
        if (i15 == -1) {
            if (i14 == 10 || i14 == 12) {
                DeviceSettingsDTO deviceSettingsDTO = (intent == null || intent.getExtras() == null) ? null : (DeviceSettingsDTO) intent.getExtras().get("GCM_deviceSettings");
                if (deviceSettingsDTO != null) {
                    for (fb2.e eVar : this.f42482t) {
                        eVar.m(eVar.k(deviceSettingsDTO));
                    }
                    this.f125985k = deviceSettingsDTO;
                }
            }
        }
    }

    @Override // ng1.j, ng1.p, com.garmin.android.apps.connectmobile.c, com.garmin.android.apps.connectmobile.z1, com.garmin.android.apps.connectmobile.v, androidx.fragment.app.m, b.g, z6.e, android.app.Activity
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        ArrayList<fb2.e> arrayList = this.f42482t;
        arrayList.clear();
        arrayList.add(new y2(this));
        arrayList.add(new b3(this));
        arrayList.add(new u0(this));
        arrayList.add(new ch1.b(this));
        arrayList.add(new n6(this));
        arrayList.add(new k6(this));
        arrayList.add(new q4(this));
        for (fb2.e eVar : arrayList) {
            boolean zG = eVar.g(this, this.f125985k);
            eVar.addObserver(this);
            eVar.m(zG);
        }
    }

    @Override // i.c, androidx.fragment.app.m, android.app.Activity
    public final void onDestroy() {
        super.onDestroy();
        ArrayList arrayList = this.f42482t;
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            ((fb2.e) it.next()).n();
        }
        arrayList.clear();
    }

    @Override // ng1.p, java.util.Observer
    public final void update(Observable observable, Object obj) {
        i2.k(a2.SETTINGS, "VivosportDeviceSettings", hb.a.j("update(): observable=", observable, ", data=", obj));
        if (obj != null) {
            if (observable instanceof y2) {
                MultipleAlarmsSettingsActivity.fa(this, this.f125985k, this.f125976b);
            }
            if (observable instanceof b3) {
                NotificationsAndAlertsActivity.da(this, this.f125985k, zb0.u0.V1);
            }
            if (observable instanceof u0) {
                DeviceSettingsDTO deviceSettingsDTO = this.f125985k;
                Long lValueOf = Long.valueOf(this.f125976b);
                int i14 = VivosportDeviceSettingsDisplayActivity.f42483i;
                Intent intent = new Intent(this, (Class<?>) VivosportDeviceSettingsDisplayActivity.class);
                intent.putExtra("GCM_deviceSettings", deviceSettingsDTO);
                intent.putExtra("GCM_deviceSettingsTitle", (String) obj);
                intent.putExtra("GCM_deviceUnitID", lValueOf);
                startActivityForResult(intent, 10);
            }
            if (observable instanceof ch1.b) {
                DeviceSettingsDTO deviceSettingsDTO2 = this.f125985k;
                long j8 = this.f125976b;
                zb0.u0 u0Var = zb0.u0.V1;
                Intent intent2 = new Intent(this, (Class<?>) VivoSportActivityTrainingAndAutoActivityStart.class);
                intent2.putExtra("GCM_deviceSettings", deviceSettingsDTO2);
                intent2.putExtra("GCM_deviceSettingsTitle", (String) obj);
                intent2.putExtra("GCM_extra_device_connected_unit_id", j8);
                intent2.putExtra("GCM_deviceEnumValue", u0Var);
                startActivityForResult(intent2, 10);
            }
            if (observable instanceof k6) {
                DeviceSettingsOrientationWatchFaces.ca(this, this.f125985k, (String) obj, zb0.u0.V1);
            }
            if (observable instanceof q4) {
                WellnessDeviceSystemSettings.ca(this, this.f125985k, (String) obj);
            }
        }
    }
}
