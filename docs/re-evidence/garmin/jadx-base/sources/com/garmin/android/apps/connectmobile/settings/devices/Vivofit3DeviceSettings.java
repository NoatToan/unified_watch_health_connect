package com.garmin.android.apps.connectmobile.settings.devices;

import android.content.Intent;
import android.os.Bundle;
import android.os.Parcelable;
import ch1.m5;
import ch1.q4;
import ch1.u0;
import ch1.v2;
import ch1.v3;
import com.garmin.android.apps.connectmobile.R;
import com.garmin.android.apps.connectmobile.a2;
import com.garmin.android.apps.connectmobile.devices.model.DeviceSettingsDTO;
import com.garmin.android.apps.connectmobile.devices.model.i;
import com.garmin.android.apps.connectmobile.i2;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Observable;
import java.util.Observer;
import ng1.j;

/* JADX INFO: loaded from: classes10.dex */
public class Vivofit3DeviceSettings extends j implements Observer {

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final ArrayList f42269t = new ArrayList();

    @Override // ng1.j
    public final int ea() {
        return R.layout.gcm3_device_settings_vivofit3;
    }

    @Override // com.garmin.android.apps.connectmobile.z1, androidx.fragment.app.m, b.g, android.app.Activity
    public final void onActivityResult(int i14, int i15, Intent intent) {
        super.onActivityResult(i14, i15, intent);
        if (i15 == -1) {
            if (i14 == 10 || i14 == 11 || i14 == 12) {
                DeviceSettingsDTO deviceSettingsDTO = (intent == null || intent.getExtras() == null) ? null : (DeviceSettingsDTO) intent.getExtras().get("GCM_deviceSettings");
                if (deviceSettingsDTO != null) {
                    for (fb2.e eVar : this.f42269t) {
                        eVar.m(eVar.k(deviceSettingsDTO));
                    }
                    this.f125985k = deviceSettingsDTO;
                }
                i2.a(a2.SETTINGS, "Vivofit3DeviceSettings", "onActivityResult: mDeviceSettingsDTO=" + this.f125985k);
            }
        }
    }

    @Override // ng1.j, ng1.p, com.garmin.android.apps.connectmobile.c, com.garmin.android.apps.connectmobile.z1, com.garmin.android.apps.connectmobile.v, androidx.fragment.app.m, b.g, z6.e, android.app.Activity
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        ArrayList<fb2.e> arrayList = this.f42269t;
        arrayList.clear();
        arrayList.add(new u0(this));
        arrayList.add(new v3(this));
        arrayList.add(new v2(this));
        arrayList.add(new m5(this));
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
        ArrayList arrayList = this.f42269t;
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            ((fb2.e) it.next()).n();
        }
        arrayList.clear();
    }

    @Override // ng1.p, java.util.Observer
    public final void update(Observable observable, Object obj) {
        i2.k(a2.SETTINGS, "Vivofit3DeviceSettings", hb.a.j("update: observable=", observable, ", data=", obj));
        if (obj != null) {
            if (observable instanceof u0) {
                Parcelable parcelable = this.f125985k;
                Intent intent = new Intent(this, (Class<?>) Vivofit3DeviceSettingsDisplay.class);
                intent.putExtra("GCM_deviceSettings", parcelable);
                intent.putExtra("GCM_deviceSettingsTitle", (String) obj);
                startActivityForResult(intent, 10);
            }
            if (observable instanceof v3) {
                boolean zM0 = this.f125985k.M0();
                Parcelable parcelable2 = this.f125985k;
                if (zM0) {
                    AlarmDeviceSettings.f41833n.getClass();
                    Intent intent2 = new Intent(this, (Class<?>) AlarmDeviceSettings.class);
                    intent2.putExtra("GCM_deviceSettings", parcelable2);
                    intent2.putExtra("GCM_alarmIndex", 0);
                    intent2.putExtra("is_vivofit", true);
                    startActivityForResult(intent2, 12);
                } else {
                    i iVar = new i();
                    ArrayList arrayList = new ArrayList();
                    for (com.garmin.android.apps.connectmobile.devices.model.a aVar : com.garmin.android.apps.connectmobile.devices.model.a.values()) {
                        if (aVar != com.garmin.android.apps.connectmobile.devices.model.a.ONCE) {
                            arrayList.add(aVar.f34086a);
                        }
                    }
                    iVar.f34183c = arrayList;
                    iVar.C(com.garmin.android.apps.connectmobile.devices.model.c.OFF);
                    AlarmDeviceSettings.f41833n.getClass();
                    Intent intent3 = new Intent(this, (Class<?>) AlarmDeviceSettings.class);
                    intent3.putExtra("GCM_deviceSettings", parcelable2);
                    intent3.putExtra("GCM_defaultAlarm", iVar);
                    intent3.putExtra("is_vivofit", true);
                    startActivityForResult(intent3, 12);
                }
            }
            if (observable instanceof q4) {
                Parcelable parcelable3 = this.f125985k;
                Intent intent4 = new Intent(this, (Class<?>) Vivofit3DeviceSettingsSystem.class);
                intent4.putExtra("GCM_deviceSettings", parcelable3);
                intent4.putExtra("GCM_deviceSettingsTitle", (String) obj);
                startActivityForResult(intent4, 11);
            }
        }
    }
}
