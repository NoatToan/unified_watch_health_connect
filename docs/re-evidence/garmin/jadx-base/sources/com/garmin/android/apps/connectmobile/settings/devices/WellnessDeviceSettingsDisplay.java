package com.garmin.android.apps.connectmobile.settings.devices;

import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import android.widget.LinearLayout;
import com.garmin.android.apps.connectmobile.R;
import com.garmin.android.apps.connectmobile.a2;
import com.garmin.android.apps.connectmobile.devices.model.DeviceSettingsDTO;
import com.garmin.android.apps.connectmobile.devices.model.o;
import fh1.b1;
import fh1.n0;
import fh1.v0;
import fh1.x;
import fh1.y0;
import i3.e5;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Observable;
import java.util.Observer;
import n23.j;
import ng1.m1;

/* JADX INFO: loaded from: classes10.dex */
public class WellnessDeviceSettingsDisplay extends com.garmin.android.apps.connectmobile.c implements Observer {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final o.c[] f42495g = {o.c.f34290m, o.c.f34284g, o.c.f34296t, o.c.f34288k, o.c.f34287j, o.c.f34286i, o.c.f34293p, o.c.f34294q, o.c.f34297v, o.c.f34295r, o.c.f34289l, o.c.f34300y};

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public DeviceSettingsDTO f42496a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ArrayList f42497b = new ArrayList();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final HashSet f42498c = new HashSet();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public v0 f42499d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public n0 f42500e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public androidx.appcompat.app.e.a f42501f;

    public static void ea(g gVar, DeviceSettingsDTO deviceSettingsDTO, String str) {
        Intent intent = new Intent(gVar, (Class<?>) WellnessDeviceSettingsDisplay.class);
        intent.putExtra("GCM_deviceSettings", deviceSettingsDTO);
        intent.putExtra("GCM_deviceSettingsTitle", str);
        gVar.startActivityForResult(intent, 10);
    }

    public final androidx.appcompat.app.e ca(int i14) {
        androidx.appcompat.app.e.a aVar = new androidx.appcompat.app.e.a(this);
        this.f42501f = aVar;
        aVar.setMessage(i14);
        this.f42501f.setNeutralButton(R.string.lbl_ok, new m1(this));
        return this.f42501f.create();
    }

    public final void da() {
        HashSet<fb2.a> hashSet = this.f42498c;
        if (hashSet.size() == 1) {
            fb2.a aVar = (fb2.a) hashSet.iterator().next();
            if (aVar.i()) {
                aVar.l(false);
                return;
            }
            return;
        }
        for (fb2.a aVar2 : hashSet) {
            if (!aVar2.i()) {
                aVar2.l(true);
            }
        }
    }

    @Override // android.app.Activity
    public final void finish() {
        getIntent().putExtra("GCM_deviceSettings", this.f42496a);
        setResult(-1, getIntent());
        super.finish();
    }

    @Override // com.garmin.android.apps.connectmobile.z1, androidx.fragment.app.m, b.g, android.app.Activity
    public final void onActivityResult(int i14, int i15, Intent intent) {
        j.y(e5.j(i14, i15, "onActivityResult(): requestCode=", ", resultCode=", ", data="), intent, a2.SETTINGS, "WellnessDeviceSettingsDisplay");
        super.onActivityResult(i14, i15, intent);
        if (i15 == -1 && i14 == 10) {
            DeviceSettingsDTO deviceSettingsDTO = (intent == null || intent.getExtras() == null) ? null : (DeviceSettingsDTO) intent.getExtras().get("GCM_deviceSettings");
            if (deviceSettingsDTO != null) {
                for (fb2.e eVar : this.f42497b) {
                    eVar.m(eVar.k(deviceSettingsDTO));
                }
                this.f42496a = deviceSettingsDTO;
            }
        }
    }

    @Override // com.garmin.android.apps.connectmobile.c, com.garmin.android.apps.connectmobile.z1, com.garmin.android.apps.connectmobile.v, androidx.fragment.app.m, b.g, z6.e, android.app.Activity
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(R.layout.gcm3_device_settings_dynamic_content);
        if (getIntent().getExtras() != null) {
            this.f42496a = (DeviceSettingsDTO) getIntent().getExtras().getParcelable("GCM_deviceSettings");
            String stringExtra = getIntent().getStringExtra("GCM_deviceSettingsTitle");
            if (TextUtils.isEmpty(stringExtra)) {
                stringExtra = getString(R.string.device_setting_display_options);
            }
            initActionBar(true, stringExtra);
        }
        DeviceSettingsDTO deviceSettingsDTO = this.f42496a;
        if (deviceSettingsDTO == null) {
            finish();
            return;
        }
        o.c[] cVarArrA = b1.a(deviceSettingsDTO, f42495g);
        ArrayList<fb2.e> arrayList = this.f42497b;
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
                if (eVar instanceof v0) {
                    this.f42499d = (v0) eVar;
                }
                if (eVar instanceof n0) {
                    this.f42500e = (n0) eVar;
                }
                linearLayout.addView(eVar.a());
            }
        }
        linearLayout.addView(fb2.g.a(this));
        for (fb2.e eVar2 : arrayList) {
            boolean zG = eVar2.g(this, this.f42496a);
            eVar2.addObserver(this);
            eVar2.m(zG);
            if (eVar2 instanceof fb2.a) {
                fb2.a aVar = (fb2.a) eVar2;
                if (!(aVar instanceof n0) && !(aVar instanceof v0) && aVar.q(this.f42496a)) {
                    this.f42498c.add(aVar);
                }
                if (aVar instanceof y0) {
                    aVar.f70327e = false;
                }
            }
        }
        da();
    }

    @Override // i.c, androidx.fragment.app.m, android.app.Activity
    public final void onDestroy() {
        super.onDestroy();
        ArrayList arrayList = this.f42497b;
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            ((fb2.e) it.next()).n();
        }
        arrayList.clear();
        this.f42498c.clear();
    }

    @Override // java.util.Observer
    public final void update(Observable observable, Object obj) {
        if (obj != null) {
            boolean z14 = observable instanceof fb2.a;
            HashSet hashSet = this.f42498c;
            if (z14) {
                fb2.a aVar = (fb2.a) observable;
                if ((aVar instanceof n0) || (aVar instanceof v0) || !aVar.q(this.f42496a)) {
                    hashSet.remove(aVar);
                } else {
                    hashSet.add(aVar);
                }
            }
            fb2.a aVar2 = (fb2.a) observable;
            if (hashSet.size() == 0 && !(aVar2 instanceof n0) && !(aVar2 instanceof v0)) {
                if (this.f42500e.q(this.f42496a) && this.f42499d.q(this.f42496a)) {
                    ca(R.string.select_one_screen_heart_rate_and_stress).show();
                } else if (this.f42500e.q(this.f42496a) && !this.f42499d.q(this.f42496a)) {
                    ca(R.string.select_one_screen_heart_rate).show();
                } else if (!this.f42500e.q(this.f42496a) && this.f42499d.q(this.f42496a)) {
                    ca(R.string.select_one_screen_stress).show();
                }
            }
            da();
        }
    }
}
