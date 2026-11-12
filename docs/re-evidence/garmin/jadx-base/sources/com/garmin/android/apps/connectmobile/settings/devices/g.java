package com.garmin.android.apps.connectmobile.settings.devices;

import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import ch1.v0;
import ch1.v1;
import com.garmin.android.apps.connectmobile.R;
import com.garmin.android.apps.connectmobile.a2;
import com.garmin.android.apps.connectmobile.devices.model.DeviceSettingsDTO;
import com.garmin.android.apps.connectmobile.devices.model.o;
import com.garmin.android.apps.connectmobile.i2;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Observer;

/* JADX INFO: loaded from: classes10.dex */
public abstract class g extends com.garmin.android.apps.connectmobile.c implements Observer {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final o.c[] f43020e = {o.c.f34290m, o.c.f34284g, o.c.f34296t, o.c.f34288k, o.c.f34287j, o.c.f34286i, o.c.f34293p, o.c.f34294q, o.c.f34297v, o.c.f34295r};

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ArrayList f43021a = new ArrayList();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public DeviceSettingsDTO f43022b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public v0 f43023c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public v1 f43024d;

    public abstract void ca();

    public void da() {
        for (fb2.e eVar : this.f43021a) {
            boolean zG = eVar.g(this, this.f43022b);
            eVar.addObserver(this);
            eVar.m(zG);
        }
    }

    public abstract void ea();

    @Override // android.app.Activity
    public final void finish() {
        getIntent().putExtra("GCM_deviceSettings", this.f43022b);
        setResult(-1, getIntent());
        super.finish();
    }

    @Override // com.garmin.android.apps.connectmobile.z1, androidx.fragment.app.m, b.g, android.app.Activity
    public void onActivityResult(int i14, int i15, Intent intent) {
        super.onActivityResult(i14, i15, intent);
        if (i15 == -1 && i14 == 10) {
            DeviceSettingsDTO deviceSettingsDTO = (intent == null || intent.getExtras() == null) ? null : (DeviceSettingsDTO) intent.getExtras().get("GCM_deviceSettings");
            if (deviceSettingsDTO != null) {
                for (fb2.e eVar : this.f43021a) {
                    eVar.m(eVar.k(deviceSettingsDTO));
                }
                this.f43022b = deviceSettingsDTO;
            }
        }
    }

    @Override // com.garmin.android.apps.connectmobile.c, com.garmin.android.apps.connectmobile.z1, com.garmin.android.apps.connectmobile.v, androidx.fragment.app.m, b.g, z6.e, android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(R.layout.gcm3_device_settings_dynamic_content);
        if (getIntent().getExtras() != null) {
            this.f43022b = (DeviceSettingsDTO) getIntent().getExtras().getParcelable("GCM_deviceSettings");
            String stringExtra = getIntent().getStringExtra("GCM_deviceSettingsTitle");
            if (TextUtils.isEmpty(stringExtra)) {
                stringExtra = getString(R.string.devices_settings_device_settings);
            }
            initActionBar(true, stringExtra);
        }
        if (this.f43022b == null) {
            i2.f(a2.SETTINGS, "Vivosmart3DeviceSettingsDisplayActivity", "Invalid device settings object while entering device settings display options screen!");
            finish();
        } else {
            ca();
            ea();
            da();
        }
    }

    @Override // i.c, androidx.fragment.app.m, android.app.Activity
    public void onDestroy() {
        super.onDestroy();
        ArrayList arrayList = this.f43021a;
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            ((fb2.e) it.next()).n();
        }
        arrayList.clear();
        this.f43023c = null;
        this.f43024d = null;
    }
}
