package com.garmin.android.apps.connectmobile.settings.devices;

import android.content.Intent;
import android.os.Bundle;
import ch1.k6;
import ch1.l6;
import ch1.q4;
import ch1.u0;
import ch1.v2;
import ch1.v3;
import com.garmin.android.apps.connectmobile.R;
import com.garmin.android.apps.connectmobile.a2;
import com.garmin.android.apps.connectmobile.devices.model.DeviceSettingsDTO;
import com.garmin.android.apps.connectmobile.devices.model.i;
import com.garmin.android.apps.connectmobile.devices.model.o;
import com.garmin.android.apps.connectmobile.i2;
import com.garmin.android.apps.connectmobile.view.view_3_0.GCMComplexOneLineButton;
import i3.e5;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Observable;
import java.util.Observer;
import ng1.j;

/* JADX INFO: loaded from: classes10.dex */
public class ApproachX40DeviceSettings extends j implements Observer {

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final ArrayList f41882t = new ArrayList();

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public GCMComplexOneLineButton f41883v;

    @Override // ng1.j
    public final int ea() {
        return R.layout.gcm3_device_settings_approach_x40;
    }

    @Override // ng1.j
    public final GCMComplexOneLineButton ga() {
        GCMComplexOneLineButton gCMComplexOneLineButton = (GCMComplexOneLineButton) findViewById(R.id.device_settings_auto_upload_btn);
        this.f41883v = gCMComplexOneLineButton;
        return gCMComplexOneLineButton;
    }

    @Override // com.garmin.android.apps.connectmobile.z1, androidx.fragment.app.m, b.g, android.app.Activity
    public final void onActivityResult(int i14, int i15, Intent intent) {
        n23.j.y(e5.j(i14, i15, "onActivityResult(): requestCode=", ", resultCode=", ", data="), intent, a2.SETTINGS, "ApproachX40DeviceSettings");
        super.onActivityResult(i14, i15, intent);
        if (i15 == -1) {
            if (i14 == 10 || i14 == 12) {
                DeviceSettingsDTO deviceSettingsDTO = (intent == null || intent.getExtras() == null) ? null : (DeviceSettingsDTO) intent.getExtras().get("GCM_deviceSettings");
                if (deviceSettingsDTO != null) {
                    for (fb2.e eVar : this.f41882t) {
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
        ArrayList<fb2.e> arrayList = this.f41882t;
        arrayList.clear();
        arrayList.add(new v3(this));
        arrayList.add(new u0(this));
        arrayList.add(new ch1.a(this));
        arrayList.add(new v2(this));
        arrayList.add(new l6(this));
        arrayList.add(new k6(this));
        arrayList.add(new q4(this));
        for (fb2.e eVar : arrayList) {
            boolean zG = eVar.g(this, this.f125985k);
            eVar.addObserver(this);
            eVar.m(zG);
        }
        this.f41883v.setButtonBottomHint((String) null);
    }

    @Override // i.c, androidx.fragment.app.m, android.app.Activity
    public final void onDestroy() {
        super.onDestroy();
        ArrayList arrayList = this.f41882t;
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            ((fb2.e) it.next()).n();
        }
        arrayList.clear();
    }

    @Override // ng1.p, java.util.Observer
    public final void update(Observable observable, Object obj) {
        i2.k(a2.SETTINGS, "ApproachX40DeviceSettings", hb.a.j("update(): observable=", observable, ", data=", obj));
        if (obj != null) {
            if (observable instanceof v3) {
                boolean zM0 = this.f125985k.M0();
                DeviceSettingsDTO deviceSettingsDTO = this.f125985k;
                if (zM0) {
                    AlarmDeviceSettings.ca(this, deviceSettingsDTO, 12);
                } else {
                    i iVar = new i();
                    ArrayList arrayList = new ArrayList();
                    for (com.garmin.android.apps.connectmobile.devices.model.a aVar : com.garmin.android.apps.connectmobile.devices.model.a.values()) {
                        arrayList.add(aVar.f34086a);
                    }
                    iVar.f34183c = arrayList;
                    iVar.C(com.garmin.android.apps.connectmobile.devices.model.c.OFF);
                    AlarmDeviceSettings.da(this, deviceSettingsDTO, iVar);
                }
            }
            if (observable instanceof u0) {
                DeviceSettingsDTO deviceSettingsDTO2 = this.f125985k;
                o.c[] cVarArr = ApproachX40DeviceSettingsDisplay.f41884e;
                Intent intent = new Intent(this, (Class<?>) ApproachX40DeviceSettingsDisplay.class);
                intent.putExtra("GCM_deviceSettings", deviceSettingsDTO2);
                intent.putExtra("GCM_deviceSettingsTitle", (String) obj);
                startActivityForResult(intent, 10);
            }
            if (observable instanceof k6) {
                DeviceSettingsDTO deviceSettingsDTO3 = this.f125985k;
                Intent intent2 = new Intent(this, (Class<?>) VivosmartDeviceSettingsOrientation.class);
                intent2.putExtra("GCM_deviceSettings", deviceSettingsDTO3);
                intent2.putExtra("GCM_deviceSettingsTitle", (String) obj);
                startActivityForResult(intent2, 10);
            }
            if (observable instanceof q4) {
                TimeDateSystemDeviceSettings.da(this, this.f125985k, (String) obj);
            }
        }
    }
}
