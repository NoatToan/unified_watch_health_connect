package com.garmin.android.apps.connectmobile.settings.devices;

import android.content.Intent;
import android.os.Bundle;
import ch1.f3;
import ch1.j6;
import ch1.l6;
import ch1.q4;
import ch1.u4;
import ch1.v2;
import ch1.y0;
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
public class Forerunner30DeviceSettings extends j implements Observer {

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final ArrayList f42081t = new ArrayList();

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public GCMComplexOneLineButton f42082v;

    @Override // ng1.j
    public final int ea() {
        return R.layout.gcm3_device_settings_forerunner_35;
    }

    @Override // ng1.j
    public final GCMComplexOneLineButton ga() {
        GCMComplexOneLineButton gCMComplexOneLineButton = (GCMComplexOneLineButton) findViewById(R.id.device_settings_auto_upload_btn);
        this.f42082v = gCMComplexOneLineButton;
        return gCMComplexOneLineButton;
    }

    @Override // com.garmin.android.apps.connectmobile.z1, androidx.fragment.app.m, b.g, android.app.Activity
    public final void onActivityResult(int i14, int i15, Intent intent) {
        n23.j.y(e5.j(i14, i15, "onActivityResult(): requestCode=", ", resultCode=", ", data="), intent, a2.SETTINGS, "Forerunner30DeviceSettings");
        super.onActivityResult(i14, i15, intent);
        if (i14 == 10 && i15 == -1) {
            DeviceSettingsDTO deviceSettingsDTO = (intent == null || intent.getExtras() == null) ? null : (DeviceSettingsDTO) intent.getExtras().get("GCM_deviceSettings");
            if (deviceSettingsDTO != null) {
                for (fb2.e eVar : this.f42081t) {
                    eVar.m(eVar.k(deviceSettingsDTO));
                }
                this.f125985k = deviceSettingsDTO;
            }
        }
    }

    @Override // ng1.j, ng1.p, com.garmin.android.apps.connectmobile.c, com.garmin.android.apps.connectmobile.z1, com.garmin.android.apps.connectmobile.v, androidx.fragment.app.m, b.g, z6.e, android.app.Activity
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        if (this.f125985k == null) {
            i2.k(a2.SETTINGS, "Forerunner30DeviceSettings", "Device Settings DTO is null");
            finish();
            return;
        }
        ArrayList<fb2.e> arrayList = this.f42081t;
        arrayList.clear();
        arrayList.add(new j6(this));
        arrayList.add(new ch1.b(this));
        arrayList.add(new f3(this));
        arrayList.add(new u4(this));
        arrayList.add(new v2(this));
        arrayList.add(new l6(this));
        arrayList.add(new y0(this));
        arrayList.add(new q4(this));
        for (fb2.e eVar : arrayList) {
            boolean zG = eVar.g(this, this.f125985k);
            eVar.addObserver(this);
            eVar.m(zG);
        }
        this.f42082v.setButtonBottomHint((String) null);
    }

    @Override // i.c, androidx.fragment.app.m, android.app.Activity
    public final void onDestroy() {
        super.onDestroy();
        ArrayList arrayList = this.f42081t;
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            ((fb2.e) it.next()).n();
        }
        arrayList.clear();
    }

    @Override // ng1.p, java.util.Observer
    public final void update(Observable observable, Object obj) {
        i2.k(a2.SETTINGS, "Forerunner30DeviceSettings", hb.a.j("update(): observable=", observable, ", data=", obj));
        if (obj != null) {
            if (observable instanceof ch1.b) {
                DeviceSettingsActivityTracking.ca(this, this.f125985k, (String) obj, this.f125976b);
                return;
            }
            if (observable instanceof q4) {
                Forerunner35DeviceSystemSettings.ca(this, this.f125985k, (String) obj, false);
                return;
            }
            if (observable instanceof j6) {
                Forerunner35DeviceSettingsDisplayOptions.da(this, this.f125985k, (String) obj);
                return;
            }
            if (!(observable instanceof f3)) {
                if (observable instanceof u4) {
                    Forerunner35TonesDeviceSettings.ca(this, this.f125985k, (String) obj);
                }
            } else {
                DeviceSettingsDTO deviceSettingsDTO = this.f125985k;
                Intent intent = new Intent(this, (Class<?>) Forerunner35PhoneNotificationsDeviceSettings.class);
                intent.putExtra("GCM_deviceSettings", deviceSettingsDTO);
                intent.putExtra("GCM_deviceSettingsTitle", (String) obj);
                intent.putExtra("BLE_CONNECTION_ALERT", true);
                startActivityForResult(intent, 10);
            }
        }
    }
}
