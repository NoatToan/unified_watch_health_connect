package com.garmin.android.apps.connectmobile.settings.devices;

import android.os.Bundle;
import android.widget.LinearLayout;
import ch1.t1;
import com.garmin.android.apps.connectmobile.R;
import com.garmin.android.apps.connectmobile.a2;
import com.garmin.android.apps.connectmobile.devices.model.DeviceSettingsDTO;
import com.garmin.android.apps.connectmobile.devices.model.o;
import com.garmin.android.apps.connectmobile.i2;
import fh1.b1;
import fh1.c0;
import fh1.g0;
import fh1.x;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Observable;
import java.util.Observer;

/* JADX INFO: loaded from: classes10.dex */
public class Vivofit3DeviceSettingsScreensDuringActivity extends com.garmin.android.apps.connectmobile.c implements Observer {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final o.c[] f42278d = {o.c.C, o.c.f34301z, o.c.B, o.c.A, o.c.D, o.c.E, o.c.F, o.c.I};

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public DeviceSettingsDTO f42279a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public t1 f42280b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ArrayList f42281c = new ArrayList();

    @Override // android.app.Activity
    public final void finish() {
        getIntent().putExtra("GCM_deviceSettings", this.f42279a);
        setResult(-1, getIntent());
        super.finish();
    }

    @Override // com.garmin.android.apps.connectmobile.c, com.garmin.android.apps.connectmobile.z1, com.garmin.android.apps.connectmobile.v, androidx.fragment.app.m, b.g, z6.e, android.app.Activity
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(R.layout.gcm3_device_settings_dynamic_content);
        initActionBar(true, R.string.device_setting_activity_screens);
        if (getIntent().getExtras() != null) {
            this.f42279a = (DeviceSettingsDTO) getIntent().getExtras().getParcelable("GCM_deviceSettings");
        }
        DeviceSettingsDTO deviceSettingsDTO = this.f42279a;
        if (deviceSettingsDTO == null) {
            i2.f(a2.SETTINGS, "Vivofit3DeviceSettingsScreensDuringActivity", "Invalid device settings object while entering device settings visible screens screen!");
            finish();
            return;
        }
        o.c[] cVarArrB = b1.b(deviceSettingsDTO, f42278d, deviceSettingsDTO.E0());
        ArrayList<fb2.e> arrayList = this.f42281c;
        arrayList.clear();
        for (o.c cVar : cVarArrB) {
            fb2.a aVarA = x.a(cVar, this);
            if (aVarA != null) {
                aVarA.f70327e = false;
                arrayList.add(aVarA);
            }
        }
        t1 t1Var = new t1(this, cVarArrB);
        this.f42280b = t1Var;
        arrayList.add(t1Var);
        LinearLayout linearLayout = (LinearLayout) findViewById(R.id.page_content);
        for (fb2.e eVar : arrayList) {
            if (eVar instanceof fb2.a) {
                linearLayout.addView(eVar.a());
            }
            if (eVar instanceof t1) {
                linearLayout.addView(this.f42280b.a());
            }
        }
        linearLayout.addView(fb2.g.a(this));
        for (fb2.e eVar2 : arrayList) {
            i2.k(a2.SETTINGS, "Vivofit3DeviceSettingsScreensDuringActivity", "Initializing: " + eVar2.toString());
            boolean zG = eVar2.g(this, this.f42279a);
            eVar2.addObserver(this);
            eVar2.m(zG);
            if (eVar2 instanceof fb2.a) {
                fb2.a aVar = (fb2.a) eVar2;
                if (aVar instanceof g0) {
                    aVar.l(false);
                } else {
                    aVar.l(true);
                }
                if (aVar instanceof c0) {
                    aVar.f70327e = false;
                }
            }
        }
    }

    @Override // i.c, androidx.fragment.app.m, android.app.Activity
    public final void onDestroy() {
        super.onDestroy();
        ArrayList arrayList = this.f42281c;
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            ((fb2.e) it.next()).n();
        }
        arrayList.clear();
        this.f42280b = null;
    }

    @Override // java.util.Observer
    public final void update(Observable observable, Object obj) {
        if (obj == null || (observable instanceof t1)) {
            return;
        }
        this.f42280b.k(this.f42279a);
    }
}
