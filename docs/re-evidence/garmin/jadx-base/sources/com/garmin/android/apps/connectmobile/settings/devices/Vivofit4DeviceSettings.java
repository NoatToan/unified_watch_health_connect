package com.garmin.android.apps.connectmobile.settings.devices;

import android.content.Intent;
import android.os.Bundle;
import ch1.m5;
import ch1.q4;
import ch1.u0;
import ch1.v2;
import ch1.y2;
import com.garmin.android.apps.connectmobile.R;
import com.garmin.android.apps.connectmobile.a2;
import com.garmin.android.apps.connectmobile.devices.model.DeviceSettingsDTO;
import com.garmin.android.apps.connectmobile.i2;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Observable;
import java.util.Observer;
import ng1.j;

/* JADX INFO: loaded from: classes10.dex */
public class Vivofit4DeviceSettings extends j implements Observer {

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final ArrayList f42284t = new ArrayList();

    @Override // ng1.j
    public final int ea() {
        return R.layout.gcm3_device_settings_vivofit4;
    }

    @Override // com.garmin.android.apps.connectmobile.z1, androidx.fragment.app.m, b.g, android.app.Activity
    public final void onActivityResult(int i14, int i15, Intent intent) {
        super.onActivityResult(i14, i15, intent);
        if (i15 == -1) {
            if (i14 == 10 || i14 == 11 || i14 == 12 || i14 == 9) {
                DeviceSettingsDTO deviceSettingsDTO = (intent == null || intent.getExtras() == null) ? null : (DeviceSettingsDTO) intent.getExtras().get("GCM_deviceSettings");
                if (deviceSettingsDTO != null) {
                    for (fb2.e eVar : this.f42284t) {
                        eVar.m(eVar.k(deviceSettingsDTO));
                    }
                    this.f125985k = deviceSettingsDTO;
                }
                i2.a(a2.SETTINGS, "Vivofit4DeviceSettings", "onActivityResult: mDeviceSettingsDTO=" + this.f125985k);
            }
        }
    }

    @Override // ng1.j, ng1.p, com.garmin.android.apps.connectmobile.c, com.garmin.android.apps.connectmobile.z1, com.garmin.android.apps.connectmobile.v, androidx.fragment.app.m, b.g, z6.e, android.app.Activity
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        ArrayList<fb2.e> arrayList = this.f42284t;
        arrayList.clear();
        arrayList.add(new u0(this));
        arrayList.add(new y2(this));
        arrayList.add(new ch1.b(this));
        arrayList.add(new v2(this));
        arrayList.add(new m5(this));
        arrayList.add(new q4(this));
        for (fb2.e eVar : arrayList) {
            DeviceSettingsDTO deviceSettingsDTO = this.f125985k;
            if (deviceSettingsDTO != null) {
                boolean zG = eVar.g(this, deviceSettingsDTO);
                eVar.addObserver(this);
                eVar.m(zG);
            }
        }
    }

    @Override // i.c, androidx.fragment.app.m, android.app.Activity
    public final void onDestroy() {
        super.onDestroy();
        ArrayList arrayList = this.f42284t;
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            ((fb2.e) it.next()).n();
        }
        arrayList.clear();
    }

    @Override // ng1.p, java.util.Observer
    public final void update(Observable observable, Object obj) {
        i2.k(a2.SETTINGS, "Vivofit4DeviceSettings", hb.a.j("update: observable=", observable, ", data=", obj));
        if (obj != null) {
            if (observable instanceof u0) {
                DeviceSettingsDTO deviceSettingsDTO = this.f125985k;
                Intent intent = new Intent(this, (Class<?>) Vivofit4DeviceSettingsDisplay.class);
                intent.putExtra("GCM_deviceSettings", deviceSettingsDTO);
                intent.putExtra("GCM_deviceSettingsTitle", (String) obj);
                startActivityForResult(intent, 10);
                return;
            }
            if (observable instanceof y2) {
                MultipleAlarmsSettingsActivity.fa(this, this.f125985k, this.f125976b);
                return;
            }
            if (!(observable instanceof ch1.b)) {
                if (observable instanceof q4) {
                    DeviceSettingsDTO deviceSettingsDTO2 = this.f125985k;
                    Intent intent2 = new Intent(this, (Class<?>) Vivofit4DeviceSettingsSystem.class);
                    intent2.putExtra("GCM_deviceSettings", deviceSettingsDTO2);
                    intent2.putExtra("GCM_deviceSettingsTitle", (String) obj);
                    startActivityForResult(intent2, 11);
                    return;
                }
                return;
            }
            DeviceSettingsDTO deviceSettingsDTO3 = this.f125985k;
            long j8 = this.f125976b;
            zb0.u0 u0Var = zb0.u0.H1;
            Intent intent3 = new Intent(this, (Class<?>) Vivofit4ActivityTrackingSettingActivity.class);
            intent3.putExtra("GCM_deviceSettings", deviceSettingsDTO3);
            intent3.putExtra("GCM_deviceSettingsTitle", (String) obj);
            intent3.putExtra("GCM_extra_device_connected_unit_id", j8);
            intent3.putExtra("GCM_deviceEnumValue", u0Var);
            startActivityForResult(intent3, 9);
        }
    }
}
