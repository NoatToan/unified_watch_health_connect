package com.garmin.android.apps.connectmobile.settings.devices;

import android.os.Bundle;
import android.text.TextUtils;
import ch1.k2;
import ch1.n0;
import ch1.r2;
import ch1.r5;
import ch1.t;
import ch1.t4;
import com.garmin.android.apps.connectmobile.R;
import com.garmin.android.apps.connectmobile.a2;
import com.garmin.android.apps.connectmobile.devices.model.DeviceSettingsDTO;
import com.garmin.android.apps.connectmobile.i2;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Observable;
import java.util.Observer;

/* JADX INFO: loaded from: classes10.dex */
public class Vivofit4DeviceSettingsSystem extends com.garmin.android.apps.connectmobile.c implements Observer {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ArrayList f42287a = new ArrayList();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public DeviceSettingsDTO f42288b;

    @Override // android.app.Activity
    public final void finish() {
        i2.k(a2.SETTINGS, "Vivofit4DeviceSettingsSystem", "finish()");
        ArrayList arrayList = this.f42287a;
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            ((fb2.e) it.next()).n();
        }
        arrayList.clear();
        getIntent().putExtra("GCM_deviceSettings", this.f42288b);
        setResult(-1, getIntent());
        super.finish();
    }

    @Override // com.garmin.android.apps.connectmobile.c, com.garmin.android.apps.connectmobile.z1, com.garmin.android.apps.connectmobile.v, androidx.fragment.app.m, b.g, z6.e, android.app.Activity
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(R.layout.gcm3_device_settings_vivofit4_system);
        Bundle extras = getIntent().getExtras();
        if (extras != null) {
            this.f42288b = (DeviceSettingsDTO) extras.getParcelable("GCM_deviceSettings");
            String string = extras.getString("GCM_deviceSettingsTitle");
            if (TextUtils.isEmpty(string)) {
                string = getString(R.string.device_setting_system);
            }
            initActionBar(true, string);
        }
        if (this.f42288b == null) {
            i2.f(a2.SETTINGS, "Vivofit4DeviceSettingsSystem", "Invalid device settings object while entering device settings time, date, system screen!");
            finish();
            return;
        }
        ArrayList<fb2.e> arrayList = this.f42287a;
        arrayList.clear();
        arrayList.add(new t(this));
        arrayList.add(new r5(this));
        arrayList.add(new t4(this, false));
        arrayList.add(new n0(this));
        arrayList.add(new k2(this));
        arrayList.add(new r2(this));
        for (fb2.e eVar : arrayList) {
            boolean zG = eVar.g(this, this.f42288b);
            eVar.addObserver(this);
            eVar.m(zG);
        }
    }

    @Override // java.util.Observer
    public final void update(Observable observable, Object obj) {
        i2.k(a2.SETTINGS, "Vivofit4DeviceSettingsSystem", hb.a.j("update(): observable=", observable, ", data=", obj));
    }
}
