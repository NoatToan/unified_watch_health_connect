package com.garmin.android.apps.connectmobile.settings.devices;

import android.content.Intent;
import android.os.Bundle;
import android.widget.LinearLayout;
import ch1.c6;
import ch1.r;
import ch1.v0;
import ch1.v1;
import com.garmin.android.apps.connectmobile.R;
import com.garmin.android.apps.connectmobile.devices.model.DeviceSettingsDTO;
import fh1.b1;
import java.util.ArrayList;
import java.util.Observable;

/* JADX INFO: loaded from: classes10.dex */
public class Vivosmart3DeviceSettingsDisplayActivity extends g {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final /* synthetic */ int f42331i = 0;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public r f42332f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public c6 f42333g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public Long f42334h;

    @Override // com.garmin.android.apps.connectmobile.settings.devices.g
    public final void ca() {
        ArrayList arrayList = this.f43021a;
        arrayList.clear();
        v0 v0Var = new v0(this);
        this.f43023c = v0Var;
        arrayList.add(v0Var);
        v1 v1Var = new v1(this, b1.a(this.f43022b, g.f43020e), true);
        this.f43024d = v1Var;
        arrayList.add(v1Var);
        r rVar = new r(this);
        this.f42332f = rVar;
        arrayList.add(rVar);
        c6 c6Var = new c6(this);
        this.f42333g = c6Var;
        arrayList.add(c6Var);
    }

    @Override // com.garmin.android.apps.connectmobile.settings.devices.g
    public final void da() {
        for (fb2.e eVar : this.f43021a) {
            boolean zG = eVar instanceof c6 ? eVar.g(this, this.f42334h) : eVar.g(this, this.f43022b);
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
            if (eVar instanceof r) {
                linearLayout.addView(fb2.g.a(this));
                linearLayout.addView(this.f42332f.a());
            }
            if (eVar instanceof c6) {
                linearLayout.addView(fb2.g.a(this));
                linearLayout.addView(this.f42333g.a());
            }
        }
        linearLayout.addView(fb2.g.a(this));
    }

    @Override // com.garmin.android.apps.connectmobile.settings.devices.g, com.garmin.android.apps.connectmobile.z1, androidx.fragment.app.m, b.g, android.app.Activity
    public final void onActivityResult(int i14, int i15, Intent intent) {
        super.onActivityResult(i14, i15, intent);
        if (i15 == -1 && i14 == 10) {
            DeviceSettingsDTO deviceSettingsDTO = (intent == null || intent.getExtras() == null) ? null : (DeviceSettingsDTO) intent.getExtras().get("GCM_deviceSettings");
            if (deviceSettingsDTO == null || this.f42334h.longValue() <= 0) {
                return;
            }
            for (fb2.e eVar : this.f43021a) {
                eVar.m(eVar instanceof c6 ? eVar.k(this.f42334h) : eVar.k(deviceSettingsDTO));
            }
            this.f43022b = deviceSettingsDTO;
        }
    }

    @Override // com.garmin.android.apps.connectmobile.settings.devices.g, com.garmin.android.apps.connectmobile.c, com.garmin.android.apps.connectmobile.z1, com.garmin.android.apps.connectmobile.v, androidx.fragment.app.m, b.g, z6.e, android.app.Activity
    public final void onCreate(Bundle bundle) {
        if (getIntent().getExtras() != null) {
            this.f42334h = Long.valueOf(getIntent().getExtras().getLong("GCM_deviceUnitID", -1L));
        }
        if (this.f42334h.longValue() <= 0) {
            finish();
        } else {
            super.onCreate(bundle);
        }
    }

    @Override // com.garmin.android.apps.connectmobile.settings.devices.g, i.c, androidx.fragment.app.m, android.app.Activity
    public final void onDestroy() {
        super.onDestroy();
        this.f42332f = null;
        this.f42333g = null;
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
            if (observable instanceof r) {
                AutoOnDisplayActivity.da(this, this.f43022b, (String) obj);
            }
            if (observable instanceof c6) {
                startActivity(new Intent(this, (Class<?>) WeatherLocationSettings.class));
            }
        }
    }
}
