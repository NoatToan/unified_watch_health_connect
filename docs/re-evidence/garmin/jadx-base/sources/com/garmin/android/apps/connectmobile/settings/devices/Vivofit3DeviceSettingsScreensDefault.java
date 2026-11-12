package com.garmin.android.apps.connectmobile.settings.devices;

import android.os.Bundle;
import android.widget.LinearLayout;
import ch1.s1;
import com.garmin.android.apps.connectmobile.R;
import com.garmin.android.apps.connectmobile.a2;
import com.garmin.android.apps.connectmobile.devices.model.DeviceSettingsDTO;
import com.garmin.android.apps.connectmobile.devices.model.o;
import com.garmin.android.apps.connectmobile.i2;
import fh1.b1;
import fh1.x;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Observable;
import java.util.Observer;

/* JADX INFO: loaded from: classes10.dex */
public class Vivofit3DeviceSettingsScreensDefault extends com.garmin.android.apps.connectmobile.c implements Observer {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final o.c[] f42273e = {o.c.f34282e, o.c.f34283f, o.c.f34284g, o.c.f34285h, o.c.f34286i, o.c.f34287j, o.c.f34288k, o.c.f34289l};

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public DeviceSettingsDTO f42274a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public s1 f42275b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ArrayList f42276c = new ArrayList();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final HashSet f42277d = new HashSet();

    public final void ca() {
        HashSet<fb2.a> hashSet = this.f42277d;
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
        getIntent().putExtra("GCM_deviceSettings", this.f42274a);
        setResult(-1, getIntent());
        super.finish();
    }

    @Override // com.garmin.android.apps.connectmobile.c, com.garmin.android.apps.connectmobile.z1, com.garmin.android.apps.connectmobile.v, androidx.fragment.app.m, b.g, z6.e, android.app.Activity
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(R.layout.gcm3_device_settings_dynamic_content);
        initActionBar(true, R.string.device_setting_normal_use_screens);
        if (getIntent().getExtras() != null) {
            this.f42274a = (DeviceSettingsDTO) getIntent().getExtras().getParcelable("GCM_deviceSettings");
        }
        DeviceSettingsDTO deviceSettingsDTO = this.f42274a;
        if (deviceSettingsDTO == null) {
            i2.f(a2.SETTINGS, "Vivofit3DeviceSettingsScreensDefault", "Invalid device settings object while entering device settings visible screens screen!");
            finish();
            return;
        }
        o.c[] cVarArrA = b1.a(deviceSettingsDTO, f42273e);
        ArrayList<fb2.e> arrayList = this.f42276c;
        arrayList.clear();
        for (o.c cVar : cVarArrA) {
            fb2.a aVarA = x.a(cVar, this);
            if (aVarA != null) {
                arrayList.add(aVarA);
            }
        }
        s1 s1Var = new s1(this, cVarArrA, false);
        this.f42275b = s1Var;
        arrayList.add(s1Var);
        LinearLayout linearLayout = (LinearLayout) findViewById(R.id.page_content);
        for (fb2.e eVar : arrayList) {
            if (eVar instanceof fb2.a) {
                linearLayout.addView(eVar.a());
            }
            if (eVar instanceof s1) {
                linearLayout.addView(fb2.g.a(this));
                linearLayout.addView(this.f42275b.a());
            }
        }
        linearLayout.addView(fb2.g.a(this));
        for (fb2.e eVar2 : arrayList) {
            i2.k(a2.SETTINGS, "Vivofit3DeviceSettingsScreensDefault", "Initializing: " + eVar2.toString());
            boolean zG = eVar2.g(this, this.f42274a);
            eVar2.addObserver(this);
            eVar2.m(zG);
            if (eVar2 instanceof fb2.a) {
                fb2.a aVar = (fb2.a) eVar2;
                if (aVar.q(this.f42274a)) {
                    this.f42277d.add(aVar);
                }
            }
        }
        ca();
    }

    @Override // i.c, androidx.fragment.app.m, android.app.Activity
    public final void onDestroy() {
        super.onDestroy();
        this.f42277d.clear();
        ArrayList arrayList = this.f42276c;
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            ((fb2.e) it.next()).n();
        }
        arrayList.clear();
        this.f42275b = null;
    }

    @Override // java.util.Observer
    public final void update(Observable observable, Object obj) {
        if (obj != null) {
            if (observable instanceof fb2.a) {
                fb2.a aVar = (fb2.a) observable;
                boolean zQ = aVar.q(this.f42274a);
                HashSet hashSet = this.f42277d;
                if (zQ) {
                    hashSet.add(aVar);
                } else {
                    hashSet.remove(aVar);
                }
            }
            if (!(observable instanceof s1)) {
                this.f42275b.k(this.f42274a);
            }
            ca();
        }
    }
}
