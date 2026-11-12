package com.garmin.android.apps.connectmobile.settings.devices;

import android.os.Bundle;
import android.text.TextUtils;
import android.widget.LinearLayout;
import androidx.room.a0;
import ch1.s1;
import ch1.w5;
import com.garmin.android.apps.connectmobile.R;
import com.garmin.android.apps.connectmobile.a2;
import com.garmin.android.apps.connectmobile.devices.model.DeviceSettingsDTO;
import com.garmin.android.apps.connectmobile.devices.model.o;
import com.garmin.android.apps.connectmobile.i2;
import fh1.b1;
import fh1.t0;
import fh1.w0;
import fh1.x;
import fh1.y0;
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
public class VivosmartHRPlusDeviceSettingsDisplay extends com.garmin.android.apps.connectmobile.c implements Observer {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final o.c[] f42476e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final o.c[] f42477f;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public DeviceSettingsDTO f42478a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public s1 f42479b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public w5 f42480c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final ArrayList f42481d = new ArrayList();

    static {
        o.c cVar = o.c.f34290m;
        o.c cVar2 = o.c.f34284g;
        o.c cVar3 = o.c.f34296t;
        o.c cVar4 = o.c.f34288k;
        o.c cVar5 = o.c.f34287j;
        o.c cVar6 = o.c.f34286i;
        o.c cVar7 = o.c.f34293p;
        o.c cVar8 = o.c.f34294q;
        o.c cVar9 = o.c.f34297v;
        o.c cVar10 = o.c.f34295r;
        f42476e = new o.c[]{cVar, cVar2, cVar3, cVar4, cVar5, cVar6, cVar7, cVar8, cVar9, cVar10, o.c.f34289l};
        f42477f = new o.c[]{cVar, cVar2, cVar3, cVar4, cVar5, cVar6, cVar7, cVar8, cVar9, cVar10};
    }

    public final void ca(boolean z14) {
        long j8 = this.f42478a.f33860a;
        if (((l80.b) KoinJavaComponent.get(l80.b.class)).a(j8)) {
            a2 a2Var = a2.SETTINGS;
            i2.a(a2Var, "VivosmartHRPlusDeviceSettingsDisplay", a0.f(j8, "Settings and connected device are the same -- device ID [", "]."));
            hk0.a.f().p(j8, z14);
            StringBuilder sb3 = new StringBuilder("  >> called DeviceManager.setWeatherConditionsEnabled(");
            e5.s(j8, z14 ? BooleanUtils.ON : BooleanUtils.OFF, ") for device ID [", sb3);
            sb3.append("].");
            String string = sb3.toString();
            i2.f36769a.getClass();
            i2.a.b(a2Var, "VivosmartHRPlusDeviceSettingsDisplay", string);
            h.d().getClass();
            h.g(j8, 2, z14);
        }
    }

    @Override // android.app.Activity
    public final void finish() {
        getIntent().putExtra("GCM_deviceSettings", this.f42478a);
        setResult(-1, getIntent());
        super.finish();
    }

    @Override // com.garmin.android.apps.connectmobile.c, com.garmin.android.apps.connectmobile.z1, com.garmin.android.apps.connectmobile.v, androidx.fragment.app.m, b.g, z6.e, android.app.Activity
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(R.layout.gcm3_device_settings_dynamic_content);
        if (getIntent().getExtras() != null) {
            this.f42478a = (DeviceSettingsDTO) getIntent().getExtras().getParcelable("GCM_deviceSettings");
            String stringExtra = getIntent().getStringExtra("GCM_deviceSettingsTitle");
            if (TextUtils.isEmpty(stringExtra)) {
                stringExtra = getString(R.string.device_setting_display_options);
            }
            initActionBar(true, stringExtra);
        }
        DeviceSettingsDTO deviceSettingsDTO = this.f42478a;
        if (deviceSettingsDTO == null) {
            i2.f(a2.SETTINGS, "VivosmartHRPlusDeviceSettingsDisplay", "Invalid device settings object while entering device settings visible screens screen!");
            finish();
            return;
        }
        o.c[] cVarArrA = b1.a(deviceSettingsDTO, f42476e);
        ArrayList<fb2.e> arrayList = this.f42481d;
        arrayList.clear();
        for (o.c cVar : cVarArrA) {
            fb2.a aVarA = x.a(cVar, this);
            if (aVarA != null) {
                aVarA.f70327e = false;
                arrayList.add(aVarA);
            }
        }
        s1 s1Var = new s1(this, b1.a(this.f42478a, f42477f), true);
        this.f42479b = s1Var;
        arrayList.add(s1Var);
        w5 w5Var = new w5(this);
        this.f42480c = w5Var;
        arrayList.add(w5Var);
        LinearLayout linearLayout = (LinearLayout) findViewById(R.id.page_content);
        for (fb2.e eVar : arrayList) {
            if (eVar instanceof fb2.a) {
                linearLayout.addView(eVar.a());
            }
            if (eVar instanceof s1) {
                linearLayout.addView(fb2.g.a(this));
                linearLayout.addView(this.f42479b.a());
            }
            if (eVar instanceof w5) {
                linearLayout.addView(fb2.g.a(this));
                linearLayout.addView(this.f42480c.a());
            }
        }
        linearLayout.addView(fb2.g.a(this));
        for (fb2.e eVar2 : arrayList) {
            i2.k(a2.SETTINGS, "VivosmartHRPlusDeviceSettingsDisplay", "Initializing: " + eVar2.toString());
            boolean zG = eVar2.g(this, this.f42478a);
            eVar2.addObserver(this);
            eVar2.m(zG);
            if (eVar2 instanceof fb2.a) {
                fb2.a aVar = (fb2.a) eVar2;
                if (aVar instanceof y0) {
                    aVar.f70327e = false;
                }
                if ((aVar instanceof w0) || (aVar instanceof t0)) {
                    aVar.l(false);
                }
            }
        }
        ca(this.f42478a.f33872g.g0().booleanValue());
    }

    @Override // i.c, androidx.fragment.app.m, android.app.Activity
    public final void onDestroy() {
        super.onDestroy();
        ArrayList arrayList = this.f42481d;
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            ((fb2.e) it.next()).n();
        }
        arrayList.clear();
        this.f42479b = null;
        this.f42480c = null;
    }

    @Override // java.util.Observer
    public final void update(Observable observable, Object obj) {
        if (obj != null) {
            if (observable instanceof z0) {
                ca(this.f42478a.f33872g.g0().booleanValue());
            }
            if (observable instanceof s1) {
                return;
            }
            this.f42479b.k(this.f42478a);
        }
    }
}
