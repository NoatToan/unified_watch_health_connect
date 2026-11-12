package com.garmin.android.apps.connectmobile.settings.devices;

import android.content.Intent;
import android.os.Bundle;
import android.widget.LinearLayout;
import ch1.c6;
import ch1.j1;
import ch1.n6;
import ch1.r;
import ch1.v0;
import ch1.v1;
import com.garmin.android.apps.connectmobile.R;
import com.garmin.android.apps.connectmobile.a2;
import com.garmin.android.apps.connectmobile.devices.model.DeviceSettingsDTO;
import com.garmin.android.apps.connectmobile.devices.model.o;
import com.garmin.android.apps.connectmobile.i2;
import fh1.b1;
import i3.e5;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Observable;
import n23.j;

/* JADX INFO: loaded from: classes10.dex */
public class VivomoveHRDeviceSettingsDisplayActivity extends g {

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final o.c[] f42304k = {o.c.f34290m, o.c.f34284g, o.c.f34296t, o.c.f34288k, o.c.f34287j, o.c.f34286i, o.c.f34293p, o.c.f34294q, o.c.f34297v, o.c.f34295r};

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public Long f42305f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public r f42306g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public n6 f42307h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public j1 f42308i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public c6 f42309j;

    @Override // com.garmin.android.apps.connectmobile.settings.devices.g
    public final void ca() {
        ArrayList arrayList = this.f43021a;
        arrayList.clear();
        v0 v0Var = new v0(this);
        this.f43023c = v0Var;
        arrayList.add(v0Var);
        v1 v1Var = new v1(this, b1.a(this.f43022b, f42304k), false);
        this.f43024d = v1Var;
        arrayList.add(v1Var);
        n6 n6Var = new n6(this);
        this.f42307h = n6Var;
        arrayList.add(n6Var);
        j1 j1Var = new j1(this);
        this.f42308i = j1Var;
        arrayList.add(j1Var);
        r rVar = new r(this);
        this.f42306g = rVar;
        arrayList.add(rVar);
        c6 c6Var = new c6(this);
        this.f42309j = c6Var;
        arrayList.add(c6Var);
    }

    @Override // com.garmin.android.apps.connectmobile.settings.devices.g
    public final void da() {
        for (fb2.e eVar : this.f43021a) {
            boolean zG = eVar instanceof c6 ? eVar.g(this, this.f42305f) : eVar.g(this, this.f43022b);
            eVar.addObserver(this);
            eVar.m(zG);
        }
    }

    @Override // com.garmin.android.apps.connectmobile.settings.devices.g
    public final void ea() {
        LinearLayout linearLayout = (LinearLayout) findViewById(R.id.page_content);
        for (fb2.e eVar : this.f43021a) {
            if (eVar instanceof v1) {
                linearLayout.addView(this.f43024d.a());
            }
            if (eVar instanceof v0) {
                linearLayout.addView(this.f43023c.a());
            }
            if (eVar instanceof n6) {
                linearLayout.addView(fb2.g.a(this));
                linearLayout.addView(this.f42307h.a());
            }
            if (eVar instanceof j1) {
                linearLayout.addView(this.f42308i.a());
            }
            if (eVar instanceof r) {
                linearLayout.addView(fb2.g.a(this));
                linearLayout.addView(this.f42306g.a());
            }
            if (eVar instanceof c6) {
                linearLayout.addView(fb2.g.a(this));
                linearLayout.addView(this.f42309j.a());
            }
        }
        linearLayout.addView(fb2.g.a(this));
    }

    @Override // com.garmin.android.apps.connectmobile.settings.devices.g, com.garmin.android.apps.connectmobile.z1, androidx.fragment.app.m, b.g, android.app.Activity
    public final void onActivityResult(int i14, int i15, Intent intent) {
        super.onActivityResult(i14, i15, intent);
        j.y(e5.j(i14, i15, "onActivityResult(): requestCode=", ", resultCode=", ", data="), intent, a2.SETTINGS, "VivomoveHRDeviceSettingsDisplayActivity");
        if (i15 == -1 && i14 == 10) {
            DeviceSettingsDTO deviceSettingsDTO = (intent == null || intent.getExtras() == null) ? null : (DeviceSettingsDTO) intent.getExtras().get("GCM_deviceSettings");
            if (deviceSettingsDTO == null || this.f42305f.longValue() <= 0) {
                return;
            }
            for (fb2.e eVar : this.f43021a) {
                eVar.m(eVar instanceof c6 ? eVar.k(this.f42305f) : eVar.k(deviceSettingsDTO));
            }
            this.f43022b = deviceSettingsDTO;
        }
    }

    @Override // com.garmin.android.apps.connectmobile.settings.devices.g, com.garmin.android.apps.connectmobile.c, com.garmin.android.apps.connectmobile.z1, com.garmin.android.apps.connectmobile.v, androidx.fragment.app.m, b.g, z6.e, android.app.Activity
    public final void onCreate(Bundle bundle) {
        if (getIntent().getExtras() != null) {
            this.f42305f = Long.valueOf(getIntent().getExtras().getLong("GCM_deviceUnitID", -1L));
        }
        if (this.f42305f.longValue() > 0) {
            super.onCreate(bundle);
        } else {
            i2.f(a2.SETTINGS, "VivomoveHRDeviceSettingsDisplayActivity", "Invalid device unit ID while entering device settings!");
            finish();
        }
    }

    @Override // com.garmin.android.apps.connectmobile.settings.devices.g, i.c, androidx.fragment.app.m, android.app.Activity
    public final void onDestroy() {
        super.onDestroy();
        this.f42307h = null;
        this.f42308i = null;
        this.f42306g = null;
        this.f42309j = null;
    }

    @Override // java.util.Observer
    public final void update(Observable observable, Object obj) {
        if (obj != null) {
            if (observable instanceof v1) {
                this.f43024d.k(this.f43022b);
            }
            if (observable instanceof v0) {
                WellnessDeviceSettingsDisplay.ea(this, this.f43022b, (String) obj);
            }
            if (observable instanceof j1) {
                DeviceSettingsDTO deviceSettingsDTO = this.f43022b;
                HashMap map = VivomoveHRDeviceSettingsWatchFaces.f42310e;
                Intent intent = new Intent(this, (Class<?>) VivomoveHRDeviceSettingsWatchFaces.class);
                intent.putExtra("GCM_deviceSettings", deviceSettingsDTO);
                intent.putExtra("GCM_deviceSettingsTitle", (String) obj);
                startActivityForResult(intent, 10);
            }
            if (observable instanceof r) {
                AutoOnDisplayActivity.da(this, this.f43022b, (String) obj);
            }
            if (observable instanceof c6) {
                startActivity(new Intent(this, (Class<?>) WeatherLocationSettings.class));
            }
        }
    }
}
