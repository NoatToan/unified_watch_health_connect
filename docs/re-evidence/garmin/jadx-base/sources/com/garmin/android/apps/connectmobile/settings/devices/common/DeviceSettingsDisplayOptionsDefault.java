package com.garmin.android.apps.connectmobile.settings.devices.common;

import android.os.Bundle;
import android.text.TextUtils;
import android.widget.LinearLayout;
import androidx.room.a0;
import com.garmin.android.apps.connectmobile.R;
import com.garmin.android.apps.connectmobile.a2;
import com.garmin.android.apps.connectmobile.devices.model.DeviceSettingsDTO;
import com.garmin.android.apps.connectmobile.devices.model.o;
import com.garmin.android.apps.connectmobile.i2;
import fb2.g;
import fh1.b1;
import fh1.x;
import fh1.z0;
import i3.e5;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Observable;
import java.util.Observer;
import org.apache.commons.lang3.BooleanUtils;
import org.koin.java.KoinJavaComponent;
import rd2.h;

/* JADX INFO: loaded from: classes10.dex */
public class DeviceSettingsDisplayOptionsDefault extends com.garmin.android.apps.connectmobile.c implements Observer {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final o.c[] f42744c = {o.c.f34290m, o.c.f34289l, o.c.f34295r, o.c.f34284g, o.c.f34287j, o.c.f34288k, o.c.f34298w, o.c.f34297v, o.c.f34299x};

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public DeviceSettingsDTO f42745a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ArrayList f42746b = new ArrayList();

    public void ca() {
        for (fb2.e eVar : this.f42746b) {
            i2.k(a2.SETTINGS, "DeviceSettingsDisplayOptionsDefault", "Initializing: " + eVar.toString());
            boolean zG = eVar.g(this, this.f42745a);
            eVar.addObserver(this);
            eVar.m(zG);
        }
    }

    public final void da(boolean z14) {
        long j8 = this.f42745a.f33860a;
        if (((l80.b) KoinJavaComponent.get(l80.b.class)).a(j8)) {
            a2 a2Var = a2.SETTINGS;
            i2.a(a2Var, "DeviceSettingsDisplayOptionsDefault", a0.f(j8, "Settings and connected device are the same -- device ID [", "]."));
            hk0.a.f().p(j8, z14);
            StringBuilder sb3 = new StringBuilder("  >> called DeviceManager.setWeatherConditionsEnabled(");
            e5.s(j8, z14 ? BooleanUtils.ON : BooleanUtils.OFF, ") for device ID [", sb3);
            sb3.append("].");
            String string = sb3.toString();
            i2.f36769a.getClass();
            i2.a.b(a2Var, "DeviceSettingsDisplayOptionsDefault", string);
            h.d().getClass();
            h.g(j8, 2, z14);
        }
    }

    @Override // android.app.Activity
    public final void finish() {
        getIntent().putExtra("GCM_deviceSettings", this.f42745a);
        setResult(-1, getIntent());
        super.finish();
    }

    @Override // com.garmin.android.apps.connectmobile.c, com.garmin.android.apps.connectmobile.z1, com.garmin.android.apps.connectmobile.v, androidx.fragment.app.m, b.g, z6.e, android.app.Activity
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(R.layout.gcm3_device_settings_dynamic_content);
        if (getIntent().getExtras() != null) {
            this.f42745a = (DeviceSettingsDTO) getIntent().getExtras().getParcelable("GCM_deviceSettings");
            String stringExtra = getIntent().getStringExtra("GCM_deviceSettingsTitle");
            if (TextUtils.isEmpty(stringExtra)) {
                stringExtra = getString(R.string.components_title);
            }
            initActionBar(true, stringExtra);
        }
        DeviceSettingsDTO deviceSettingsDTO = this.f42745a;
        if (deviceSettingsDTO == null) {
            i2.f(a2.SETTINGS, "DeviceSettingsDisplayOptionsDefault", "Invalid device settings object while entering FR35 device display settings visible screens screen!");
            finish();
            return;
        }
        o.c[] cVarArrA = b1.a(deviceSettingsDTO, f42744c);
        ArrayList<fb2.e> arrayList = this.f42746b;
        arrayList.clear();
        for (o.c cVar : cVarArrA) {
            fb2.a aVarA = x.a(cVar, this);
            if (aVarA != null) {
                aVarA.f70327e = false;
                arrayList.add(aVarA);
            }
        }
        LinearLayout linearLayout = (LinearLayout) findViewById(R.id.page_content);
        for (fb2.e eVar : arrayList) {
            if (eVar instanceof fb2.a) {
                linearLayout.addView(eVar.a());
            }
        }
        linearLayout.addView(g.a(this));
        ca();
        da(this.f42745a.f33872g.g0().booleanValue());
    }

    @Override // i.c, androidx.fragment.app.m, android.app.Activity
    public final void onDestroy() {
        super.onDestroy();
        ArrayList arrayList = this.f42746b;
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            ((fb2.e) it.next()).n();
        }
        arrayList.clear();
    }

    @Override // java.util.Observer
    public final void update(Observable observable, Object obj) {
        if (obj == null || !(observable instanceof z0)) {
            return;
        }
        da(this.f42745a.f33872g.g0().booleanValue());
    }
}
