package com.garmin.android.apps.connectmobile.settings.devices;

import android.os.Bundle;
import ch1.h5;
import ch1.i5;
import com.garmin.android.apps.connectmobile.R;
import com.garmin.android.apps.connectmobile.a2;
import com.garmin.android.apps.connectmobile.devices.model.DeviceSettingsDTO;
import com.garmin.android.apps.connectmobile.i2;
import java.util.ArrayList;
import java.util.Observable;
import java.util.Observer;

/* JADX INFO: loaded from: classes10.dex */
public class VivoActive3PhoneNotifications extends com.garmin.android.apps.connectmobile.c implements Observer {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public DeviceSettingsDTO f42194a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ArrayList f42195b = new ArrayList();

    @Override // android.app.Activity
    public final void finish() {
        setResult(-1, getIntent().putExtra("GCM_deviceSettings", this.f42194a));
        super.finish();
    }

    @Override // com.garmin.android.apps.connectmobile.c, com.garmin.android.apps.connectmobile.z1, com.garmin.android.apps.connectmobile.v, androidx.fragment.app.m, b.g, z6.e, android.app.Activity
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(R.layout.gcm3_device_settings_vivoactive3_phone_notifications);
        Bundle extras = getIntent().getExtras();
        if (extras != null) {
            this.f42194a = (DeviceSettingsDTO) extras.getParcelable("GCM_deviceSettings");
            initActionBar(true, extras.getString("GCM_deviceSettingsTitle"));
        }
        if (this.f42194a.f33863b1 == null) {
            i2.f(a2.SETTINGS, "VivoActive3PhoneNotifications", "Invalid DuringActivityDTO object while entering device settings Phone Notifications screen!");
            finish();
            return;
        }
        ArrayList<fb2.e> arrayList = this.f42195b;
        arrayList.clear();
        arrayList.add(new h5(this));
        arrayList.add(new i5(this));
        for (fb2.e eVar : arrayList) {
            boolean zG = eVar.g(this, this.f42194a);
            eVar.addObserver(this);
            eVar.m(zG);
        }
    }

    @Override // java.util.Observer
    public final void update(Observable observable, Object obj) {
        i2.k(a2.SETTINGS, "VivoActive3PhoneNotifications", hb.a.j("update(): observable=", observable, ", data=", obj));
    }
}
