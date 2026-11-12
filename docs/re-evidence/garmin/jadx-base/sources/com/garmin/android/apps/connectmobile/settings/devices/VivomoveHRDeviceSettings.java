package com.garmin.android.apps.connectmobile.settings.devices;

import android.content.Intent;
import android.os.Bundle;
import ch1.b3;
import ch1.l1;
import ch1.q4;
import ch1.u0;
import ch1.y2;
import com.garmin.android.apps.connectmobile.R;
import com.garmin.android.apps.connectmobile.a2;
import com.garmin.android.apps.connectmobile.devices.model.DeviceSettingsDTO;
import com.garmin.android.apps.connectmobile.devices.model.o;
import com.garmin.android.apps.connectmobile.i2;
import com.garmin.android.apps.connectmobile.view.view_3_0.GCMComplexOneLineButton;
import com.garmin.android.gfdi.configuration.SupportedCapability;
import java.util.ArrayList;
import java.util.Observable;

/* JADX INFO: loaded from: classes10.dex */
public class VivomoveHRDeviceSettings extends Vivosmart3DeviceSettings {

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final com.garmin.android.apps.connectmobile.handalignment.e f42303v = new com.garmin.android.apps.connectmobile.handalignment.e();

    @Override // com.garmin.android.apps.connectmobile.settings.devices.Vivosmart3DeviceSettings, ng1.j
    public final int ea() {
        return R.layout.gcm3_device_settings_vivomove_hr;
    }

    @Override // com.garmin.android.apps.connectmobile.settings.devices.Vivosmart3DeviceSettings, ng1.j
    public final GCMComplexOneLineButton ia() {
        return null;
    }

    @Override // com.garmin.android.apps.connectmobile.settings.devices.Vivosmart3DeviceSettings
    public final void ka() {
        ArrayList<fb2.e> arrayList = this.f42330t;
        arrayList.clear();
        arrayList.add(new l1(this));
        arrayList.add(new y2(this));
        arrayList.add(new b3(this));
        arrayList.add(new u0(this));
        arrayList.add(new ch1.b(this));
        arrayList.add(new q4(this));
        if (this.f125985k != null) {
            for (fb2.e eVar : arrayList) {
                boolean zG = eVar.g(this, this.f125985k);
                eVar.addObserver(this);
                eVar.m(zG);
                if (!eVar.h(this.f125985k)) {
                    eVar.l(false);
                }
            }
        }
    }

    @Override // com.garmin.android.apps.connectmobile.settings.devices.Vivosmart3DeviceSettings, ng1.j, ng1.p, com.garmin.android.apps.connectmobile.c, com.garmin.android.apps.connectmobile.z1, com.garmin.android.apps.connectmobile.v, androidx.fragment.app.m, b.g, z6.e, android.app.Activity
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        getF158016a().a(this.f42303v);
    }

    @Override // com.garmin.android.apps.connectmobile.settings.devices.Vivosmart3DeviceSettings, ng1.p, java.util.Observer
    public final void update(Observable observable, Object obj) {
        DeviceSettingsDTO deviceSettingsDTO;
        i2.k(a2.SETTINGS, "VivomoveHRDeviceSettings", hb.a.j("update(): observable=", observable, ", data=", obj));
        if (obj != null) {
            if ((observable instanceof l1) && (deviceSettingsDTO = this.f125985k) != null && km2.a.i(deviceSettingsDTO.f33860a, null, SupportedCapability.HANDS_CALIBRATION.ordinal())) {
                this.f42303v.a(this, this.f125976b, this.f125949q);
            }
            if (observable instanceof y2) {
                MultipleAlarmsSettingsActivity.fa(this, this.f125985k, this.f125976b);
            }
            if (observable instanceof b3) {
                NotificationsAndAlertsActivity.da(this, this.f125985k, zb0.u0.J1);
            }
            if (observable instanceof u0) {
                DeviceSettingsDTO deviceSettingsDTO2 = this.f125985k;
                Long lValueOf = Long.valueOf(this.f125976b);
                o.c[] cVarArr = VivomoveHRDeviceSettingsDisplayActivity.f42304k;
                Intent intent = new Intent(this, (Class<?>) VivomoveHRDeviceSettingsDisplayActivity.class);
                intent.putExtra("GCM_deviceSettings", deviceSettingsDTO2);
                intent.putExtra("GCM_deviceSettingsTitle", (String) obj);
                intent.putExtra("GCM_deviceUnitID", lValueOf);
                startActivityForResult(intent, 10);
            }
            if (observable instanceof ch1.b) {
                DeviceSettingsActivityTracking.ca(this, this.f125985k, (String) obj, this.f125976b);
            }
            if (observable instanceof q4) {
                WellnessDeviceSystemSettings.ca(this, this.f125985k, (String) obj);
            }
        }
    }
}
