package com.garmin.android.apps.connectmobile.settings.activityoptions;

import android.content.Intent;
import android.os.Bundle;
import android.widget.LinearLayout;
import com.garmin.android.apps.connectmobile.R;
import com.garmin.android.apps.connectmobile.a2;
import com.garmin.android.apps.connectmobile.i2;
import fb2.g;
import hb2.i;
import hg1.n;
import ig1.h;
import ig1.h2;
import ig1.j0;
import ig1.p;
import ig1.u;
import ig1.u1;
import ig1.y;
import ig1.y0;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Observable;
import java.util.Observer;
import org.json.JSONException;
import org.json.JSONObject;
import rd2.j;
import zb0.u0;

/* JADX INFO: loaded from: classes10.dex */
public class SportActivity extends com.garmin.android.apps.connectmobile.c implements Observer {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final /* synthetic */ int f41684i = 0;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ArrayList f41685a = new ArrayList();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public com.garmin.android.apps.connectmobile.devices.model.f f41686b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public JSONObject f41687c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public com.garmin.android.apps.connectmobile.settings.devices.e.a f41688d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public d80.f f41689e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public long f41690f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public u0 f41691g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public String f41692h;

    @Override // com.garmin.android.apps.connectmobile.z1, androidx.fragment.app.m, b.g, android.app.Activity
    public final void onActivityResult(int i14, int i15, Intent intent) {
        u0 u0Var;
        super.onActivityResult(i14, i15, intent);
        if (i15 == -1 && i14 == 20) {
            com.garmin.android.apps.connectmobile.devices.model.f fVar = (intent == null || intent.getExtras() == null) ? null : (com.garmin.android.apps.connectmobile.devices.model.f) intent.getExtras().get("GCM_deviceActivityOptions");
            if (fVar != null) {
                for (fb2.e eVar : this.f41685a) {
                    boolean zK = eVar.k(fVar);
                    if (((eVar instanceof j0) || (eVar instanceof u1) || (eVar instanceof y0)) && ((u0Var = this.f41691g) == u0.R1 || u0Var == u0.Q1)) {
                        eVar.m(false);
                        eVar.l(false);
                    } else {
                        eVar.m(zK);
                    }
                }
                this.f41686b = fVar;
            }
            i2.a(a2.SETTINGS, "SportActivity", "onActivityResult: mDeviceActivityOptionsDTO=" + this.f41686b);
        }
    }

    @Override // com.garmin.android.apps.connectmobile.z1, b.g, android.app.Activity
    public final void onBackPressed() {
        d80.f fVar = this.f41689e;
        if (fVar != null && !fVar.c()) {
            super.onBackPressed();
            return;
        }
        if (!i.a(this) || this.f41686b == null) {
            return;
        }
        showProgressOverlay();
        String strM = com.garmin.android.apps.connectmobile.devices.model.f.M(this.f41686b.e2(), this.f41687c);
        com.garmin.android.apps.connectmobile.settings.devices.e eVarN = com.garmin.android.apps.connectmobile.settings.devices.e.N();
        long j8 = this.f41690f;
        com.garmin.android.apps.connectmobile.settings.devices.e.a aVar = this.f41688d;
        n nVar = new n(this);
        eVarN.getClass();
        this.f41689e = com.garmin.android.apps.connectmobile.settings.devices.e.P(j8, aVar, strM, nVar);
    }

    @Override // com.garmin.android.apps.connectmobile.c, com.garmin.android.apps.connectmobile.z1, com.garmin.android.apps.connectmobile.v, androidx.fragment.app.m, b.g, z6.e, android.app.Activity
    public final void onCreate(Bundle bundle) {
        u0 u0Var;
        com.garmin.android.apps.connectmobile.settings.devices.e.a aVar;
        super.onCreate(bundle);
        setContentView(R.layout.gcm3_activity_options_dynamic_content);
        com.garmin.android.apps.connectmobile.devices.model.f fVar = (com.garmin.android.apps.connectmobile.devices.model.f) getIntent().getParcelableExtra("GCM_deviceActivityOptions");
        this.f41686b = fVar;
        if (fVar != null) {
            try {
                this.f41687c = new JSONObject(this.f41686b.f34131a);
            } catch (JSONException unused) {
            }
        }
        this.f41690f = getIntent().getLongExtra("GCM_deviceUnitID", -1L);
        this.f41691g = (u0) getIntent().getSerializableExtra("GCM_deviceEnumValue");
        this.f41688d = (com.garmin.android.apps.connectmobile.settings.devices.e.a) getIntent().getSerializableExtra("GCM_deviceActivityOptionsSport");
        initActionBar(true, getIntent().getStringExtra("GCM_deviceSettingsTitle"));
        j jVar = rd2.f.a().f152045a;
        long j8 = this.f41690f;
        jVar.getClass();
        sd2.f fVarI = j.i(j8, null);
        this.f41692h = fVarI != null ? fVarI.getProductDisplayName() : "";
        ArrayList<fb2.e> arrayList = this.f41685a;
        arrayList.clear();
        com.garmin.android.apps.connectmobile.settings.devices.e.a aVar2 = this.f41688d;
        if (aVar2 == com.garmin.android.apps.connectmobile.settings.devices.e.a.RUNNING) {
            arrayList.add(new u1(this));
        } else if (aVar2 == com.garmin.android.apps.connectmobile.settings.devices.e.a.CYCLING) {
            arrayList.add(new p(this));
        } else if (aVar2 == com.garmin.android.apps.connectmobile.settings.devices.e.a.CARDIO) {
            arrayList.add(new u(this));
        } else if (aVar2 == com.garmin.android.apps.connectmobile.settings.devices.e.a.WALKING) {
            arrayList.add(new h2(this));
        }
        arrayList.add(new ig1.c(this));
        if (this.f41688d == com.garmin.android.apps.connectmobile.settings.devices.e.a.CYCLING) {
            arrayList.add(new h(this, this.f41692h));
        } else {
            arrayList.add(new ig1.e(this, this.f41688d));
        }
        arrayList.add(new y0(this));
        if (this.f41691g != u0.f203843y1 || ((aVar = this.f41688d) != com.garmin.android.apps.connectmobile.settings.devices.e.a.CARDIO && aVar != com.garmin.android.apps.connectmobile.settings.devices.e.a.WALKING)) {
            arrayList.add(new ig1.i(this));
        }
        arrayList.add(new y(this));
        LinearLayout linearLayout = (LinearLayout) findViewById(R.id.page_content);
        for (fb2.e eVar : arrayList) {
            if (eVar instanceof u1) {
                linearLayout.addView(g.a(this));
                linearLayout.addView(eVar.a());
            } else if ((eVar instanceof p) || (eVar instanceof u) || (eVar instanceof h2) || (eVar instanceof ig1.c)) {
                linearLayout.addView(eVar.a());
                linearLayout.addView(g.a(this));
            } else {
                linearLayout.addView(eVar.a());
            }
        }
        linearLayout.addView(g.a(this));
        for (fb2.e eVar2 : arrayList) {
            i2.k(a2.SETTINGS, "SportActivity", "Initializing: " + eVar2.toString());
            boolean zG = eVar2.g(this, this.f41686b);
            if (((eVar2 instanceof j0) || (eVar2 instanceof u1) || (eVar2 instanceof y0)) && ((u0Var = this.f41691g) == u0.R1 || u0Var == u0.Q1)) {
                eVar2.m(false);
                eVar2.l(false);
            } else {
                eVar2.m(zG);
            }
            eVar2.addObserver(this);
        }
    }

    @Override // i.c, androidx.fragment.app.m, android.app.Activity
    public final void onDestroy() {
        super.onDestroy();
        ArrayList arrayList = this.f41685a;
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
        d80.f fVar = this.f41689e;
        if (fVar != null) {
            fVar.f58259c = null;
        }
    }

    @Override // java.util.Observer
    public final void update(Observable observable, Object obj) {
        i2.k(a2.SETTINGS, "SportActivity", hb.a.j("update: observable=", observable, ", data=", obj));
        if (obj != null) {
            if (observable instanceof u1) {
                com.garmin.android.apps.connectmobile.devices.model.f fVar = this.f41686b;
                String str = this.f41692h;
                Intent intent = new Intent(this, (Class<?>) Forerunner35ActivityOptionsRunningMode.class);
                intent.putExtra("GCM_deviceActivityOptions", fVar);
                intent.putExtra("GCM_deviceName", str);
                startActivityForResult(intent, 20);
            }
            if (observable instanceof ig1.c) {
                com.garmin.android.apps.connectmobile.devices.model.f fVar2 = this.f41686b;
                long j8 = this.f41690f;
                u0 u0Var = this.f41691g;
                Intent intent2 = new Intent(this, (Class<?>) AlertsActivity.class);
                intent2.putExtra("GCM_deviceActivityOptions", fVar2);
                intent2.putExtra("GCM_deviceUnitID", j8);
                intent2.putExtra("GCM_deviceEnumValue", u0Var);
                startActivityForResult(intent2, 20);
            }
            if (observable instanceof y) {
                DataFieldsActivity.ca(this, this.f41686b, this.f41691g, false, 20);
            }
        }
    }
}
