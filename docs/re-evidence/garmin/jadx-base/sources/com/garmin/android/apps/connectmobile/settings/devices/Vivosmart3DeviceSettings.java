package com.garmin.android.apps.connectmobile.settings.devices;

import android.content.Intent;
import android.os.Bundle;
import ch1.b3;
import ch1.k6;
import ch1.n6;
import ch1.q4;
import ch1.u0;
import ch1.y0;
import ch1.y2;
import com.garmin.android.apps.connectmobile.R;
import com.garmin.android.apps.connectmobile.a2;
import com.garmin.android.apps.connectmobile.devices.model.DeviceSettingsDTO;
import com.garmin.android.apps.connectmobile.i2;
import com.garmin.android.apps.connectmobile.view.view_3_0.GCMComplexOneLineButton;
import i3.e5;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Observable;
import java.util.Observer;
import ng1.j;

/* JADX INFO: loaded from: classes10.dex */
public class Vivosmart3DeviceSettings extends j implements Observer {

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final ArrayList f42330t = new ArrayList();

    @Override // ng1.j
    public int ea() {
        return R.layout.gcm3_device_settings_vivosmart_3;
    }

    @Override // ng1.j
    public GCMComplexOneLineButton ia() {
        return (GCMComplexOneLineButton) findViewById(R.id.device_settings_weather);
    }

    public void ka() {
        ArrayList<fb2.e> arrayList = this.f42330t;
        arrayList.clear();
        arrayList.add(new y2(this));
        arrayList.add(new b3(this));
        arrayList.add(new y0(this));
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

    @Override // com.garmin.android.apps.connectmobile.z1, androidx.fragment.app.m, b.g, android.app.Activity
    public final void onActivityResult(int i14, int i15, Intent intent) {
        n23.j.y(e5.j(i14, i15, "onActivityResult(): requestCode=", ", resultCode=", ", data="), intent, a2.SETTINGS, "Vivosmart3DeviceSettings");
        super.onActivityResult(i14, i15, intent);
        if (i15 == -1) {
            if (i14 == 10 || i14 == 12) {
                DeviceSettingsDTO deviceSettingsDTO = (intent == null || intent.getExtras() == null) ? null : (DeviceSettingsDTO) intent.getExtras().get("GCM_deviceSettings");
                if (deviceSettingsDTO != null) {
                    for (fb2.e eVar : this.f42330t) {
                        eVar.m(eVar.k(deviceSettingsDTO));
                    }
                    this.f125985k = deviceSettingsDTO;
                }
            }
        }
    }

    @Override // ng1.j, ng1.p, com.garmin.android.apps.connectmobile.c, com.garmin.android.apps.connectmobile.z1, com.garmin.android.apps.connectmobile.v, androidx.fragment.app.m, b.g, z6.e, android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        ka();
    }

    @Override // i.c, androidx.fragment.app.m, android.app.Activity
    public final void onDestroy() {
        super.onDestroy();
        ArrayList arrayList = this.f42330t;
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            ((fb2.e) it.next()).n();
        }
        arrayList.clear();
    }

    @Override // ng1.p, java.util.Observer
    public void update(Observable observable, Object obj) {
        i2.k(a2.SETTINGS, "Vivosmart3DeviceSettings", hb.a.j("update(): observable=", observable, ", data=", obj));
        if (obj != null) {
            if (observable instanceof y2) {
                MultipleAlarmsSettingsActivity.fa(this, this.f125985k, this.f125976b);
            }
            if (observable instanceof b3) {
                NotificationsAndAlertsActivity.da(this, this.f125985k, zb0.u0.S1);
            }
            if (observable instanceof u0) {
                DeviceSettingsDTO deviceSettingsDTO = this.f125985k;
                Long lValueOf = Long.valueOf(this.f125976b);
                int i14 = Vivosmart3DeviceSettingsDisplayActivity.f42331i;
                Intent intent = new Intent(this, (Class<?>) Vivosmart3DeviceSettingsDisplayActivity.class);
                intent.putExtra("GCM_deviceSettings", deviceSettingsDTO);
                intent.putExtra("GCM_deviceSettingsTitle", (String) obj);
                intent.putExtra("GCM_deviceUnitID", lValueOf);
                startActivityForResult(intent, 10);
            }
            if (observable instanceof ch1.b) {
                DeviceSettingsActivityTracking.ca(this, this.f125985k, (String) obj, this.f125976b);
            }
            if (observable instanceof k6) {
                DeviceSettingsOrientationWatchFaces.ca(this, this.f125985k, (String) obj, zb0.u0.S1);
            }
            if (observable instanceof q4) {
                WellnessDeviceSystemSettings.ca(this, this.f125985k, (String) obj);
            }
        }
    }
}
