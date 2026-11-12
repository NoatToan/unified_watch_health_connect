package com.garmin.android.apps.connectmobile.settings.devices;

import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import ch1.d5;
import ch1.e0;
import ch1.e5;
import ch1.k0;
import ch1.y5;
import com.garmin.android.apps.connectmobile.R;
import com.garmin.android.apps.connectmobile.a2;
import com.garmin.android.apps.connectmobile.devices.model.DeviceSettingsDTO;
import com.garmin.android.apps.connectmobile.i2;
import com.garmin.android.apps.connectmobile.settings.Vivofit4ColorThemeSelectionActivity;
import com.garmin.android.apps.connectmobile.settings.devices.common.DeviceCustomWidgetActivity;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Observable;
import java.util.Observer;

/* JADX INFO: loaded from: classes10.dex */
public class Vivofit4DeviceSettingsDisplay extends com.garmin.android.apps.connectmobile.c implements Observer {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ArrayList f42285a = new ArrayList();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public DeviceSettingsDTO f42286b;

    @Override // android.app.Activity
    public final void finish() {
        ArrayList arrayList = this.f42285a;
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            ((fb2.e) it.next()).n();
        }
        arrayList.clear();
        getIntent().putExtra("GCM_deviceSettings", this.f42286b);
        setResult(-1, getIntent());
        super.finish();
    }

    @Override // com.garmin.android.apps.connectmobile.z1, androidx.fragment.app.m, b.g, android.app.Activity
    public final void onActivityResult(int i14, int i15, Intent intent) {
        super.onActivityResult(i14, i15, intent);
        if (i15 == -1) {
            if (i14 == 20 || i14 == 21 || i14 == 18 || i14 == 19 || i14 == 22) {
                DeviceSettingsDTO deviceSettingsDTO = (intent == null || intent.getExtras() == null) ? null : (DeviceSettingsDTO) intent.getExtras().get("GCM_deviceSettings");
                if (deviceSettingsDTO != null) {
                    for (fb2.e eVar : this.f42285a) {
                        eVar.m(eVar.k(deviceSettingsDTO));
                    }
                    this.f42286b = deviceSettingsDTO;
                    getIntent().putExtra("GCM_deviceSettings", this.f42286b);
                    setResult(-1, getIntent());
                }
                i2.a(a2.SETTINGS, "Vivofit4DeviceSettingsDisplay", "onActivityResult: mDeviceSettingsDTO=" + this.f42286b);
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:10:0x002c  */
    @Override // com.garmin.android.apps.connectmobile.c, com.garmin.android.apps.connectmobile.z1, com.garmin.android.apps.connectmobile.v, androidx.fragment.app.m, b.g, z6.e, android.app.Activity
    public final void onCreate(Bundle bundle) {
        String string;
        super.onCreate(bundle);
        setContentView(R.layout.gcm3_device_settings_vivofit4_display);
        Intent intent = getIntent();
        if (intent == null) {
            string = "";
        } else {
            if (intent.hasExtra("GCM_deviceSettings")) {
                this.f42286b = (DeviceSettingsDTO) intent.getParcelableExtra("GCM_deviceSettings");
            }
            if (intent.hasExtra("GCM_deviceSettingsTitle")) {
                string = intent.getStringExtra("GCM_deviceSettingsTitle");
            } else {
                string = "";
            }
        }
        if (this.f42286b == null) {
            i2.f(a2.SETTINGS, "Vivofit4DeviceSettingsDisplay", "Invalid device settings object while entering device settings visible screens screen!");
            finish();
            return;
        }
        if (TextUtils.isEmpty(string)) {
            string = getString(R.string.device_setting_display);
        }
        initActionBar(true, string);
        ArrayList<fb2.e> arrayList = this.f42285a;
        arrayList.clear();
        arrayList.add(new y5(this));
        arrayList.add(new e0(this));
        arrayList.add(new e5(this));
        arrayList.add(new d5(this));
        arrayList.add(new k0(this));
        for (fb2.e eVar : arrayList) {
            i2.k(a2.SETTINGS, "Vivofit4DeviceSettingsDisplay", "Initializing: " + eVar.toString());
            boolean zG = eVar.g(this, this.f42286b);
            eVar.addObserver(this);
            eVar.m(zG);
        }
    }

    @Override // java.util.Observer
    public final void update(Observable observable, Object obj) {
        i2.k(a2.SETTINGS, "Vivofit4DeviceSettingsDisplay", hb.a.j("update: observable=", observable, ", data=", obj));
        if (obj != null) {
            if (observable instanceof y5) {
                DeviceSettingsDTO deviceSettingsDTO = this.f42286b;
                String string = getString(R.string.connect_iq_watch_face);
                Intent intent = new Intent(this, (Class<?>) Vivofit4SettingsWatchFacesActivity.class);
                intent.putExtra("GCM_deviceSettings", deviceSettingsDTO);
                intent.putExtra("GCM_deviceSettingsTitle", string);
                intent.putExtra("GCM_extra_request_code", 18);
                startActivityForResult(intent, 18);
                return;
            }
            if (observable instanceof e0) {
                DeviceSettingsDTO deviceSettingsDTO2 = this.f42286b;
                String string2 = getString(R.string.device_setting_color_theme);
                Intent intent2 = new Intent(this, (Class<?>) Vivofit4ColorThemeSelectionActivity.class);
                intent2.putExtra("GCM_deviceSettings", deviceSettingsDTO2);
                intent2.putExtra("GCM_deviceSettingsTitle", string2);
                intent2.putExtra("GCM_extra_request_code", 19);
                startActivityForResult(intent2, 19);
                return;
            }
            if (observable instanceof e5) {
                if (this.f42286b.H() != null) {
                    DeviceSettingsDTO deviceSettingsDTO3 = this.f42286b;
                    String string3 = getString(R.string.device_settings_visible_widgets);
                    Intent intent3 = new Intent(this, (Class<?>) DefaultScreenListActivity.class);
                    intent3.putExtra("GCM_deviceSettings", deviceSettingsDTO3);
                    intent3.putExtra("GCM_deviceSettingsTitle", string3);
                    startActivityForResult(intent3, 20);
                    return;
                }
                return;
            }
            if (!(observable instanceof d5)) {
                if (observable instanceof k0) {
                    DeviceSettingsDTO deviceSettingsDTO4 = this.f42286b;
                    Intent intent4 = new Intent(this, (Class<?>) DeviceCustomWidgetActivity.class);
                    intent4.putExtra("GCM_deviceSettings", deviceSettingsDTO4);
                    startActivityForResult(intent4, 22);
                    return;
                }
                return;
            }
            if (this.f42286b.C() != null) {
                DeviceSettingsDTO deviceSettingsDTO5 = this.f42286b;
                String string4 = getString(R.string.device_settings_visible_widgets);
                Intent intent5 = new Intent(this, (Class<?>) ActivityScreenListActivity.class);
                intent5.putExtra("GCM_deviceSettings", deviceSettingsDTO5);
                intent5.putExtra("GCM_deviceSettingsTitle", string4);
                startActivityForResult(intent5, 21);
            }
        }
    }
}
