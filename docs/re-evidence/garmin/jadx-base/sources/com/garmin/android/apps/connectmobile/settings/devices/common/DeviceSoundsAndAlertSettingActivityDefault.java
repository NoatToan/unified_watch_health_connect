package com.garmin.android.apps.connectmobile.settings.devices.common;

import android.content.Intent;
import android.os.Bundle;
import android.widget.LinearLayout;
import ch1.b5;
import ch1.c0;
import ch1.f3;
import ch1.g2;
import ch1.i;
import ch1.y0;
import com.garmin.android.apps.connectmobile.R;
import com.garmin.android.apps.connectmobile.a2;
import com.garmin.android.apps.connectmobile.devices.model.DeviceSettingsDTO;
import com.garmin.android.apps.connectmobile.i2;
import fb2.g;
import i3.e5;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Observable;
import java.util.Observer;
import n23.j;
import ng1.k0;
import org.koin.java.KoinJavaComponent;
import zb0.d0;
import zb0.u0;

/* JADX INFO: loaded from: classes10.dex */
public class DeviceSoundsAndAlertSettingActivityDefault extends k0 implements Observer {
    @Override // ng1.k0
    public final void fa() {
        ArrayList arrayList = this.f125956m;
        arrayList.clear();
        arrayList.add(new g2(this));
        arrayList.add(new i(this));
        arrayList.add(new b5(this, getString(R.string.device_settings_alert_vibration)));
        if (this.f125980f != u0.f203818t5) {
            arrayList.add(new f3(this));
        }
        arrayList.add(new c0(this));
        arrayList.add(new y0(this, getString(R.string.device_settings_do_not_disturb_during_sleep)));
    }

    @Override // android.app.Activity
    public final void finish() {
        i2.k(a2.SETTINGS, "DeviceSoundsAndAlertSettingActivityDefault", "finish()");
        ArrayList arrayList = this.f125956m;
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            ((fb2.e) it.next()).n();
        }
        arrayList.clear();
        super.finish();
    }

    @Override // ng1.k0
    public final void ha() {
        LinearLayout linearLayout = (LinearLayout) findViewById(R.id.page_content);
        ArrayList<fb2.e> arrayList = this.f125956m;
        for (fb2.e eVar : arrayList) {
            if (eVar.h(this.f125985k)) {
                boolean z14 = eVar instanceof f3;
                if (z14 || (eVar instanceof g2)) {
                    linearLayout.addView(g.a(this));
                }
                linearLayout.addView(eVar.a());
                if (eVar instanceof g2) {
                    linearLayout.addView(g.c(this, getString(R.string.device_settings_key_tones_help)));
                }
                if (z14) {
                    linearLayout.addView(g.a(this));
                }
            }
        }
        for (fb2.e eVar2 : arrayList) {
            boolean zG = eVar2.g(this, this.f125985k);
            eVar2.addObserver(this);
            eVar2.m(zG);
        }
    }

    @Override // com.garmin.android.apps.connectmobile.z1, androidx.fragment.app.m, b.g, android.app.Activity
    public final void onActivityResult(int i14, int i15, Intent intent) {
        j.y(e5.j(i14, i15, "onActivityResult(): requestCode=", ", resultCode=", ", data="), intent, a2.SETTINGS, "DeviceSoundsAndAlertSettingActivityDefault");
        super.onActivityResult(i14, i15, intent);
        if (i14 == 10 && i15 == -1) {
            DeviceSettingsDTO deviceSettingsDTO = (intent == null || intent.getExtras() == null) ? null : (DeviceSettingsDTO) intent.getExtras().get("GCM_deviceSettings");
            if (deviceSettingsDTO != null) {
                for (fb2.e eVar : this.f125956m) {
                    eVar.m(eVar.k(deviceSettingsDTO));
                }
                this.f125985k = deviceSettingsDTO;
            }
        }
    }

    @Override // ng1.k0, ng1.p, com.garmin.android.apps.connectmobile.c, com.garmin.android.apps.connectmobile.z1, com.garmin.android.apps.connectmobile.v, androidx.fragment.app.m, b.g, z6.e, android.app.Activity
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        initActionBar(true, getString(R.string.sounds_and_alerts_title));
    }

    @Override // com.garmin.android.apps.connectmobile.c, com.garmin.android.apps.connectmobile.z1, com.garmin.android.apps.connectmobile.v, androidx.fragment.app.m, android.app.Activity
    public final void onResume() {
        super.onResume();
        DeviceSettingsDTO deviceSettingsDTO = this.f125985k;
        if (deviceSettingsDTO != null) {
            ArrayList<fb2.e> arrayList = this.f125956m;
            if (arrayList.size() > 0) {
                for (fb2.e eVar : arrayList) {
                    eVar.m(eVar.k(deviceSettingsDTO));
                }
            }
        }
    }

    @Override // ng1.p, java.util.Observer
    public final void update(Observable observable, Object obj) {
        i2.k(a2.SETTINGS, "DeviceSoundsAndAlertSettingActivityDefault", hb.a.j("update(): observable=", observable, ", data=", obj));
        if (obj == null || !(observable instanceof f3)) {
            return;
        }
        DevicePhoneNotificationsActivityDefault.ca(this, this.f125985k, (String) obj, ((d0) KoinJavaComponent.get(d0.class)).J(this.f125980f), this.f125978d);
    }
}
