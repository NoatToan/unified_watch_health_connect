package com.garmin.android.apps.connectmobile.settings.devices;

import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import android.widget.LinearLayout;
import ch1.k2;
import ch1.l0;
import ch1.m0;
import ch1.s2;
import ch1.s4;
import com.garmin.android.apps.connectmobile.R;
import com.garmin.android.apps.connectmobile.a2;
import com.garmin.android.apps.connectmobile.devices.model.DeviceSettingsDTO;
import com.garmin.android.apps.connectmobile.i2;
import fb2.r;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Observable;
import java.util.Observer;
import ng1.j;

/* JADX INFO: loaded from: classes10.dex */
public class WellnessDeviceSystemSettings extends com.garmin.android.apps.connectmobile.c implements Observer {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ArrayList f42502a = new ArrayList();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public DeviceSettingsDTO f42503b;

    public static void ca(j jVar, DeviceSettingsDTO deviceSettingsDTO, String str) {
        Intent intent = new Intent(jVar, (Class<?>) WellnessDeviceSystemSettings.class);
        intent.putExtra("GCM_deviceSettings", deviceSettingsDTO);
        if (!TextUtils.isEmpty(str)) {
            intent.putExtra("GCM_deviceSettingsTitle", str);
        }
        intent.putExtra("MilitaryTimeFormatSupported", false);
        jVar.startActivityForResult(intent, 10);
    }

    @Override // android.app.Activity
    public final void finish() {
        i2.k(a2.SETTINGS, "WellnessDeviceSystemSettings", "finish()");
        ArrayList arrayList = this.f42502a;
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            ((fb2.e) it.next()).n();
        }
        arrayList.clear();
        getIntent().putExtra("GCM_deviceSettings", this.f42503b);
        setResult(-1, getIntent());
        super.finish();
    }

    @Override // com.garmin.android.apps.connectmobile.c, com.garmin.android.apps.connectmobile.z1, com.garmin.android.apps.connectmobile.v, androidx.fragment.app.m, b.g, z6.e, android.app.Activity
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(R.layout.gcm3_device_settings_dynamic_content);
        boolean booleanExtra = false;
        if (getIntent().getExtras() != null) {
            this.f42503b = (DeviceSettingsDTO) getIntent().getExtras().getParcelable("GCM_deviceSettings");
            String stringExtra = getIntent().getStringExtra("GCM_deviceSettingsTitle");
            booleanExtra = getIntent().getBooleanExtra("MilitaryTimeFormatSupported", false);
            if (TextUtils.isEmpty(stringExtra)) {
                stringExtra = getString(R.string.device_setting_system);
            }
            initActionBar(true, stringExtra);
        }
        if (this.f42503b == null) {
            i2.f(a2.SETTINGS, "WellnessDeviceSystemSettings", "Invalid device settings object while entering device settings time, date, system screen!");
            finish();
            return;
        }
        findViewById(R.id.header_view).setVisibility(8);
        ArrayList<fb2.e> arrayList = this.f42502a;
        arrayList.clear();
        arrayList.add(new s4(this, booleanExtra));
        arrayList.add(new m0(this));
        arrayList.add(new k2(this));
        rd2.j jVar = rd2.f.a().f152045a;
        long j8 = this.f42503b.f33860a;
        jVar.getClass();
        sd2.f fVarI = rd2.j.i(j8, null);
        if (fVarI != null && fVarI.X0()) {
            arrayList.add(new s2(this));
        }
        arrayList.add(new l0(this));
        LinearLayout linearLayout = (LinearLayout) findViewById(R.id.page_content);
        for (fb2.e eVar : arrayList) {
            if (!(eVar instanceof r)) {
                linearLayout.addView(fb2.g.a(this));
            }
            linearLayout.addView(eVar.a());
        }
        linearLayout.addView(fb2.g.a(this));
        for (fb2.e eVar2 : arrayList) {
            boolean zG = eVar2.g(this, this.f42503b);
            eVar2.addObserver(this);
            eVar2.m(zG);
        }
    }

    @Override // java.util.Observer
    public final void update(Observable observable, Object obj) {
        i2.k(a2.SETTINGS, "WellnessDeviceSystemSettings", hb.a.j("update(): observable=", observable, ", data=", obj));
    }
}
