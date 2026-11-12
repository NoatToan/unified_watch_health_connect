package com.garmin.android.apps.connectmobile.settings.activityoptions;

import android.content.Intent;
import android.os.Bundle;
import android.widget.LinearLayout;
import bs2.sw;
import com.garmin.android.apps.connectmobile.R;
import com.garmin.android.apps.connectmobile.a2;
import com.garmin.android.apps.connectmobile.i2;
import fb2.g;
import hb2.i;
import ig1.k;
import ig1.q0;
import ig1.r1;
import ig1.y;
import ig1.y0;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Locale;
import java.util.Observable;
import java.util.Observer;
import zb0.u0;

/* JADX INFO: loaded from: classes10.dex */
public class GCMRunOptionsSettings extends com.garmin.android.apps.connectmobile.c implements Observer {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public long f41665a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public u0 f41666b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public com.garmin.android.apps.connectmobile.devices.model.f f41667c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public d80.f f41668d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final ArrayList f41669e = new ArrayList();

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public com.garmin.android.apps.connectmobile.settings.devices.e.a f41670f;

    public static /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f41671a;

        static {
            int[] iArr = new int[com.garmin.android.apps.connectmobile.settings.devices.e.a.values().length];
            f41671a = iArr;
            try {
                iArr[com.garmin.android.apps.connectmobile.settings.devices.e.a.CARDIO.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f41671a[com.garmin.android.apps.connectmobile.settings.devices.e.a.RUNNING.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f41671a[com.garmin.android.apps.connectmobile.settings.devices.e.a.WALKING.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f41671a[com.garmin.android.apps.connectmobile.settings.devices.e.a.TRAINING.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f41671a[com.garmin.android.apps.connectmobile.settings.devices.e.a.OTHER.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
        }
    }

    @Override // com.garmin.android.apps.connectmobile.z1, androidx.fragment.app.m, b.g, android.app.Activity
    public final void onActivityResult(int i14, int i15, Intent intent) {
        super.onActivityResult(i14, i15, intent);
        if (i15 == -1 && i14 == 10) {
            com.garmin.android.apps.connectmobile.devices.model.f fVar = (intent == null || intent.getExtras() == null) ? null : (com.garmin.android.apps.connectmobile.devices.model.f) intent.getExtras().get("GCM_deviceActivityOptions");
            if (fVar != null) {
                for (fb2.e eVar : this.f41669e) {
                    eVar.m(eVar.k(fVar));
                }
                this.f41667c = fVar;
            }
            i2.a(a2.SETTINGS, "GCMRunOptionsSettings", "onActivityResult: mDeviceActivityOptionsDTO=" + this.f41667c);
        }
    }

    @Override // com.garmin.android.apps.connectmobile.z1, b.g, android.app.Activity
    public final void onBackPressed() {
        d80.f fVar = this.f41668d;
        if (fVar != null && !fVar.c()) {
            super.onBackPressed();
            return;
        }
        if (!i.a(this) || this.f41667c == null) {
            return;
        }
        showProgressOverlay();
        String strH = this.f41667c.h();
        com.garmin.android.apps.connectmobile.settings.devices.e eVarN = com.garmin.android.apps.connectmobile.settings.devices.e.N();
        long j8 = this.f41665a;
        com.garmin.android.apps.connectmobile.settings.devices.e.a aVar = this.f41670f;
        hg1.e eVar = new hg1.e(this);
        eVarN.getClass();
        this.f41668d = com.garmin.android.apps.connectmobile.settings.devices.e.P(j8, aVar, strH, eVar);
    }

    @Override // com.garmin.android.apps.connectmobile.c, com.garmin.android.apps.connectmobile.z1, com.garmin.android.apps.connectmobile.v, androidx.fragment.app.m, b.g, z6.e, android.app.Activity
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(R.layout.gcm3_device_settings_dynamic_content);
        this.f41665a = getIntent().getLongExtra("GCM_deviceUnitID", -1L);
        this.f41666b = (u0) getIntent().getSerializableExtra("GCM_deviceEnumValue");
        com.garmin.android.apps.connectmobile.devices.model.f fVar = (com.garmin.android.apps.connectmobile.devices.model.f) getIntent().getParcelableExtra("GCM_deviceActivityOptions");
        this.f41667c = fVar;
        this.f41670f = com.garmin.android.apps.connectmobile.settings.devices.e.a.valueOf(((String) fVar.f34132b.get("sport")).toUpperCase(Locale.getDefault()));
        initActionBar(true, R.string.activity_options_title);
        ArrayList<fb2.e> arrayList = this.f41669e;
        arrayList.clear();
        r1 r1Var = new r1(this);
        int i14 = a.f41671a[this.f41670f.ordinal()];
        if (i14 == 1) {
            r1Var.f93398f = getResources().getString(R.string.run_options_cardio_alerts);
        } else if (i14 == 2) {
            r1Var.f93398f = getResources().getString(R.string.run_options_run_alerts);
        } else if (i14 == 3) {
            r1Var.f93398f = getResources().getString(R.string.run_options_walk_alerts);
        } else if (i14 == 4) {
            r1Var.f93398f = getResources().getString(R.string.strength_training_alerts);
        } else if (i14 == 5) {
            r1Var.f93398f = getResources().getString(R.string.run_options_other_mode_alerts);
        }
        arrayList.add(r1Var);
        arrayList.add(new q0(this));
        if (this.f41667c.z0() == null || !this.f41667c.z0().equalsIgnoreCase(sw.STRENGTH_TRAINING.name())) {
            arrayList.add(new ig1.e(this, this.f41670f));
        } else {
            arrayList.add(new k(this));
        }
        if (this.f41667c.z0() == null || !this.f41667c.z0().equalsIgnoreCase(sw.STRENGTH_TRAINING.name())) {
            arrayList.add(new y0(this));
        }
        arrayList.add(new ig1.i(this));
        arrayList.add(new y(this));
        LinearLayout linearLayout = (LinearLayout) findViewById(R.id.page_content);
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            linearLayout.addView(((fb2.e) it.next()).a());
        }
        linearLayout.addView(g.a(this));
        for (fb2.e eVar : arrayList) {
            i2.k(a2.SETTINGS, "GCMRunOptionsSettings", "Initializing: " + eVar.toString());
            eVar.m(eVar.g(this, this.f41667c));
            eVar.addObserver(this);
        }
    }

    @Override // i.c, androidx.fragment.app.m, android.app.Activity
    public final void onDestroy() {
        super.onDestroy();
        ArrayList arrayList = this.f41669e;
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            ((fb2.e) it.next()).n();
        }
        arrayList.clear();
    }

    @Override // com.garmin.android.apps.connectmobile.z1, android.app.Activity
    public final boolean onNavigateUp() {
        onBackPressed();
        return true;
    }

    @Override // com.garmin.android.apps.connectmobile.c, i.c, androidx.fragment.app.m, android.app.Activity
    public final void onStop() {
        super.onStop();
        d80.f fVar = this.f41668d;
        if (fVar != null) {
            fVar.f58259c = null;
        }
    }

    @Override // java.util.Observer
    public final void update(Observable observable, Object obj) {
        i2.k(a2.SETTINGS, "GCMRunOptionsSettings", hb.a.j("update: observable=", observable, ", data=", obj));
        if (obj != null) {
            if (observable instanceof r1) {
                Intent intent = new Intent(this, (Class<?>) GCMRunModeAlertsActivity.class);
                intent.putExtra("GCM_deviceActivityOptions", this.f41667c);
                startActivityForResult(intent, 10);
            }
            if (observable instanceof q0) {
                Intent intent2 = new Intent(this, (Class<?>) HeartRateAlertsActivity.class);
                intent2.putExtra("GCM_deviceUnitID", this.f41665a);
                intent2.putExtra("GCM_deviceActivityOptions", this.f41667c);
                startActivityForResult(intent2, 10);
            }
            if (observable instanceof y) {
                DataFieldsActivity.ca(this, this.f41667c, this.f41666b, false, 10);
            }
        }
    }
}
