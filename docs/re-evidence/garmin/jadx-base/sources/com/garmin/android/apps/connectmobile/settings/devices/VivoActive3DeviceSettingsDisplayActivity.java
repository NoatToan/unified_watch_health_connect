package com.garmin.android.apps.connectmobile.settings.devices;

import android.content.Intent;
import android.os.Bundle;
import android.widget.LinearLayout;
import ch1.f0;
import ch1.y;
import ch1.z;
import com.garmin.android.apps.connectmobile.R;
import com.garmin.android.apps.connectmobile.a2;
import com.garmin.android.apps.connectmobile.devices.model.DeviceSettingsDTO;
import com.garmin.android.apps.connectmobile.i2;
import com.garmin.android.apps.connectmobile.settings.devices.controlsmenu.ControlsMenuActivity;
import i3.e5;
import java.util.ArrayList;
import java.util.Observable;
import n23.j;

/* JADX INFO: loaded from: classes10.dex */
public class VivoActive3DeviceSettingsDisplayActivity extends g {

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final /* synthetic */ int f42187j = 0;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public Long f42188f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public y f42189g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public z f42190h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public f0 f42191i;

    @Override // com.garmin.android.apps.connectmobile.settings.devices.g
    public final void ca() {
        ArrayList arrayList = this.f43021a;
        arrayList.clear();
        arrayList.add(this.f42191i);
        arrayList.add(this.f42190h);
        arrayList.add(this.f42189g);
    }

    @Override // com.garmin.android.apps.connectmobile.settings.devices.g
    public final void da() {
        for (fb2.e eVar : this.f43021a) {
            boolean zG = eVar.g(this, this.f43022b);
            eVar.addObserver(this);
            eVar.m(zG);
            if (eVar instanceof y) {
                fa();
            }
        }
    }

    @Override // com.garmin.android.apps.connectmobile.settings.devices.g
    public final void ea() {
        LinearLayout linearLayout = (LinearLayout) findViewById(R.id.page_content);
        for (fb2.e eVar : this.f43021a) {
            if (eVar instanceof f0) {
                linearLayout.addView(this.f42191i.a());
            }
            if (eVar instanceof z) {
                linearLayout.addView(fb2.g.a(this));
                linearLayout.addView(this.f42190h.a());
            }
            if (eVar instanceof y) {
                linearLayout.addView(this.f42189g.a());
            }
        }
        linearLayout.addView(fb2.g.a(this));
    }

    public final void fa() {
        String str = this.f43022b.E;
        if (str == null || !str.equals(DeviceSettingsDTO.b.AUTO_BRIGHTNESS.f33926a)) {
            this.f42189g.l(false);
            return;
        }
        this.f42189g.l(true);
        this.f42189g.addObserver(this);
        y yVar = this.f42189g;
        yVar.m(yVar.g(this, this.f43022b));
    }

    @Override // com.garmin.android.apps.connectmobile.settings.devices.g, com.garmin.android.apps.connectmobile.z1, androidx.fragment.app.m, b.g, android.app.Activity
    public final void onActivityResult(int i14, int i15, Intent intent) {
        super.onActivityResult(i14, i15, intent);
        j.y(e5.j(i14, i15, "onActivityResult(): requestCode=", ", resultCode=", ", data="), intent, a2.SETTINGS, "VivomoveHRDeviceSettingsDisplayActivity");
        if (i15 == -1 && i14 == 10) {
            DeviceSettingsDTO deviceSettingsDTO = (intent == null || intent.getExtras() == null) ? null : (DeviceSettingsDTO) intent.getExtras().get("GCM_deviceSettings");
            if (deviceSettingsDTO == null || this.f42188f.longValue() <= 0) {
                return;
            }
            for (fb2.e eVar : this.f43021a) {
                eVar.m(eVar.k(deviceSettingsDTO));
            }
            this.f43022b = deviceSettingsDTO;
        }
    }

    @Override // com.garmin.android.apps.connectmobile.settings.devices.g, com.garmin.android.apps.connectmobile.c, com.garmin.android.apps.connectmobile.z1, com.garmin.android.apps.connectmobile.v, androidx.fragment.app.m, b.g, z6.e, android.app.Activity
    public final void onCreate(Bundle bundle) {
        if (getIntent().getExtras() != null) {
            this.f42188f = Long.valueOf(getIntent().getExtras().getLong("GCM_deviceUnitID", -1L));
        }
        if (this.f42188f.longValue() <= 0) {
            i2.f(a2.SETTINGS, "VivomoveHRDeviceSettingsDisplayActivity", "Invalid device unit ID while entering device settings!");
            finish();
        } else {
            this.f42190h = new z(this);
            this.f42189g = new y(this);
            this.f42191i = new f0(this);
            super.onCreate(bundle);
        }
    }

    @Override // com.garmin.android.apps.connectmobile.settings.devices.g, i.c, androidx.fragment.app.m, android.app.Activity
    public final void onDestroy() {
        super.onDestroy();
        this.f42189g = null;
        this.f42190h = null;
    }

    @Override // java.util.Observer
    public final void update(Observable observable, Object obj) {
        VivoActive3DeviceSettingsDisplayActivity vivoActive3DeviceSettingsDisplayActivity;
        if (obj != null) {
            if (observable instanceof f0) {
                vivoActive3DeviceSettingsDisplayActivity = this;
                ControlsMenuActivity.ia(vivoActive3DeviceSettingsDisplayActivity, this.f43022b, (String) obj, 2131233578, 10, this.f42188f.longValue(), false);
            } else {
                vivoActive3DeviceSettingsDisplayActivity = this;
            }
            if (observable instanceof y) {
                DeviceSettingsDTO deviceSettingsDTO = vivoActive3DeviceSettingsDisplayActivity.f43022b;
                Intent intent = new Intent(this, (Class<?>) VivoActive3BacklightDisplayActivity.class);
                intent.putExtra("GCM_deviceSettings", deviceSettingsDTO);
                intent.putExtra("GCM_deviceSettingsTitle", (String) obj);
                startActivityForResult(intent, 10);
            }
            if (observable instanceof z) {
                fa();
            }
        }
    }
}
