package com.garmin.android.apps.connectmobile.settings.activityoptions;

import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import android.widget.LinearLayout;
import android.widget.TextView;
import c22.y0;
import com.garmin.android.apps.connectmobile.R;
import com.garmin.android.apps.connectmobile.a2;
import com.garmin.android.apps.connectmobile.audioprompts.ui.AudioPromptsSettingsActivity;
import fb2.g;
import hb2.i;
import ig1.c0;
import ig1.e0;
import ig1.i2;
import ig1.j2;
import ig1.l1;
import ig1.o1;
import ig1.q;
import ig1.q1;
import ig1.s1;
import ig1.t1;
import ig1.v;
import ig1.w1;
import ig1.x1;
import ig1.y1;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Observable;
import java.util.Observer;
import vb.h;
import zb0.u0;

/* JADX INFO: loaded from: classes10.dex */
public class ActivityOptionsSettingsSetup extends com.garmin.android.apps.connectmobile.c implements Observer {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final /* synthetic */ int f41604g = 0;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public long f41605a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public u0 f41606b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public com.garmin.android.apps.connectmobile.devices.model.f f41607c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public String f41608d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public d80.f<com.garmin.android.apps.connectmobile.devices.model.f> f41609e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final ArrayList f41610f = new ArrayList();

    public class a implements d80.b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ com.garmin.android.apps.connectmobile.settings.devices.e.a f41611a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ String f41612b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ com.garmin.android.apps.connectmobile.settings.devices.e.b f41613c;

        public a(com.garmin.android.apps.connectmobile.settings.devices.e.a aVar, String str, com.garmin.android.apps.connectmobile.settings.devices.e.b bVar) {
            this.f41611a = aVar;
            this.f41612b = str;
            this.f41613c = bVar;
        }

        @Override // d80.b
        public final void a(lj0.b bVar) {
            a2 a2Var = a2.SETTINGS;
            hb.a.q(bVar.f112957a, new StringBuilder("Error fetching activity options from GC ["), "].", a2Var, "ActivityOptionsSettingsSetup");
            boolean zA = bVar.a();
            int i14 = ActivityOptionsSettingsSetup.f41604g;
            ActivityOptionsSettingsSetup activityOptionsSettingsSetup = ActivityOptionsSettingsSetup.this;
            activityOptionsSettingsSetup.displayFailedMessage(zA);
            activityOptionsSettingsSetup.finish();
        }

        @Override // d80.b
        public final void b(Object obj, d80.b.a aVar) {
            u0 u0Var;
            ActivityOptionsSettingsSetup activityOptionsSettingsSetup = ActivityOptionsSettingsSetup.this;
            activityOptionsSettingsSetup.f41607c = (com.garmin.android.apps.connectmobile.devices.model.f) obj;
            if (obj == null) {
                a(lj0.b.f112956j);
                return;
            }
            activityOptionsSettingsSetup.hideProgressOverlay();
            ActivityOptionsSettingsSetup activityOptionsSettingsSetup2 = ActivityOptionsSettingsSetup.this;
            u0 u0Var2 = activityOptionsSettingsSetup2.f41606b;
            u0 u0Var3 = u0.f203843y1;
            com.garmin.android.apps.connectmobile.settings.devices.e.a aVar2 = this.f41611a;
            if (u0Var2 != u0Var3 && (u0Var2 != (u0Var = u0.V1) || aVar2 != com.garmin.android.apps.connectmobile.settings.devices.e.a.RUNNING)) {
                if (u0Var2 == u0.S1 || u0Var2 == u0.T1 || u0Var2 == u0Var || u0Var2 == u0.J1) {
                    WellnessAlertsActivity.ea(activityOptionsSettingsSetup2, this.f41611a, this.f41613c, activityOptionsSettingsSetup2.f41607c, activityOptionsSettingsSetup2.f41605a, this.f41612b, u0Var2);
                    return;
                }
                Intent intent = new Intent(activityOptionsSettingsSetup, (Class<?>) GCMRunOptionsSettings.class);
                intent.putExtra("GCM_deviceUnitID", activityOptionsSettingsSetup.f41605a);
                intent.putExtra("GCM_deviceEnumValue", activityOptionsSettingsSetup.f41606b);
                intent.putExtra("GCM_deviceActivityOptions", activityOptionsSettingsSetup.f41607c);
                activityOptionsSettingsSetup.startActivity(intent);
                activityOptionsSettingsSetup.finish();
                return;
            }
            com.garmin.android.apps.connectmobile.devices.model.f fVar = activityOptionsSettingsSetup2.f41607c;
            long j8 = activityOptionsSettingsSetup2.f41605a;
            int i14 = SportActivity.f41684i;
            if (activityOptionsSettingsSetup2 == null) {
                h.s("Context is null");
                return;
            }
            if (aVar2 == null) {
                h.s("Sport is null");
                return;
            }
            if (fVar == null) {
                h.s("DTO is null");
                return;
            }
            Intent intent2 = new Intent(activityOptionsSettingsSetup2, (Class<?>) SportActivity.class);
            intent2.putExtra("GCM_deviceActivityOptionsSport", aVar2);
            intent2.putExtra("GCM_deviceActivityOptions", fVar);
            intent2.putExtra("GCM_deviceUnitID", j8);
            intent2.putExtra("GCM_deviceEnumValue", u0Var2);
            String string = this.f41612b;
            if (u0Var2 == u0Var3) {
                if (TextUtils.isEmpty(string)) {
                    string = activityOptionsSettingsSetup2.getString(R.string.activity_profiles_title);
                }
            } else if (TextUtils.isEmpty(string)) {
                string = activityOptionsSettingsSetup2.getString(R.string.activity_options_title);
            }
            intent2.putExtra("GCM_deviceSettingsTitle", string);
            activityOptionsSettingsSetup2.startActivity(intent2);
        }
    }

    public final void ca(com.garmin.android.apps.connectmobile.settings.devices.e.a aVar, com.garmin.android.apps.connectmobile.settings.devices.e.b bVar, String str) {
        if (i.a(this)) {
            showProgressOverlay();
            com.garmin.android.apps.connectmobile.settings.devices.e eVarN = com.garmin.android.apps.connectmobile.settings.devices.e.N();
            long j8 = this.f41605a;
            a aVar2 = new a(aVar, str, bVar);
            eVarN.getClass();
            this.f41609e = com.garmin.android.apps.connectmobile.settings.devices.e.M(j8, aVar, bVar, aVar2);
        }
    }

    @Override // com.garmin.android.apps.connectmobile.c, com.garmin.android.apps.connectmobile.z1, com.garmin.android.apps.connectmobile.v, androidx.fragment.app.m, b.g, z6.e, android.app.Activity
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(R.layout.gcm3_device_settings_dynamic_content);
        Intent intent = getIntent();
        this.f41605a = intent.getLongExtra("GCM_deviceUnitID", -1L);
        this.f41606b = (u0) intent.getSerializableExtra("GCM_deviceEnumValue");
        this.f41607c = (com.garmin.android.apps.connectmobile.devices.model.f) intent.getParcelableExtra("GCM_deviceActivityOptions");
        this.f41608d = intent.getStringExtra("GCM_deviceProductNbr");
        intent.getStringExtra("GCM_deviceName");
        if (this.f41606b == u0.f203843y1) {
            initActionBar(true, R.string.activity_profiles_title);
        } else {
            initActionBar(true, R.string.activity_options_title);
        }
        ArrayList<fb2.e> arrayList = this.f41610f;
        arrayList.clear();
        u0 u0Var = this.f41606b;
        if (u0Var == u0.R1 || u0Var == u0.Q1) {
            arrayList.add(new s1(this));
            arrayList.add(new v(this));
            arrayList.add(new i2(this));
            arrayList.add(new l1(this));
        } else if (u0Var == u0.S1 || u0Var == u0.J1) {
            arrayList.add(new i2(this));
            arrayList.add(new s1(this));
            arrayList.add(new v(this));
            arrayList.add(new x1(this));
            arrayList.add(new l1(this));
        } else if (u0Var == u0.V1) {
            arrayList.add(new i2(this));
            arrayList.add(new s1(this));
            arrayList.add(new q(this));
            arrayList.add(new x1(this));
            arrayList.add(new v(this));
            arrayList.add(new l1(this));
        } else if (u0Var == u0.T1) {
            arrayList.add(new i2(this));
            arrayList.add(new s1(this));
            arrayList.add(new y1(this));
            arrayList.add(new v(this));
            arrayList.add(new o1(this));
            arrayList.add(new e0(this));
            arrayList.add(new w1(this));
            arrayList.add(new j2(this));
            arrayList.add(new l1(this));
        } else {
            arrayList.add(new t1(this));
            arrayList.add(new q1(this));
            arrayList.add(new q(this));
            arrayList.add(new v(this));
            arrayList.add(new i2(this));
            arrayList.add(new ig1.d(this));
            arrayList.add(new c0(this));
        }
        LinearLayout linearLayout = (LinearLayout) findViewById(R.id.page_content);
        for (fb2.e eVar : arrayList) {
            if (eVar instanceof ig1.d) {
                linearLayout.addView(g.a(this));
                String string = getString(R.string.activity_options_title);
                TextView textView = new TextView(this);
                textView.setTextAppearance(R.style.GCM_Group_Header_Text);
                int dimensionPixelSize = getResources().getDimensionPixelSize(R.dimen.spacing_normal);
                textView.setPadding(dimensionPixelSize, 0, dimensionPixelSize, getResources().getDimensionPixelSize(R.dimen.spacing_micro));
                textView.setTextSize(2, 15);
                textView.setText(string);
                textView.setVisibility(0);
                linearLayout.addView(textView);
            }
            linearLayout.addView(eVar.a());
        }
        linearLayout.addView(g.a(this));
        for (fb2.e eVar2 : arrayList) {
            com.garmin.android.apps.connectmobile.i2.k(a2.SETTINGS, "ActivityOptionsSettingsSetup", "Initializing: " + eVar2.toString());
            eVar2.m(eVar2.g(this, this.f41607c));
            eVar2.addObserver(this);
        }
    }

    @Override // i.c, androidx.fragment.app.m, android.app.Activity
    public final void onDestroy() {
        super.onDestroy();
        ArrayList arrayList = this.f41610f;
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            ((fb2.e) it.next()).n();
        }
        arrayList.clear();
    }

    @Override // com.garmin.android.apps.connectmobile.c, i.c, androidx.fragment.app.m, android.app.Activity
    public final void onStop() {
        super.onStop();
        y0.a(this.f41609e);
    }

    @Override // java.util.Observer
    public final void update(Observable observable, Object obj) {
        com.garmin.android.apps.connectmobile.i2.k(a2.SETTINGS, "ActivityOptionsSettingsSetup", hb.a.j("update: observable=", observable, ", data=", obj));
        if (obj != null) {
            String str = (String) obj;
            if (observable instanceof s1) {
                ca(com.garmin.android.apps.connectmobile.settings.devices.e.a.RUNNING, com.garmin.android.apps.connectmobile.settings.devices.e.b.GENERIC, str);
            }
            if (observable instanceof t1) {
                ca(com.garmin.android.apps.connectmobile.settings.devices.e.a.RUNNING, com.garmin.android.apps.connectmobile.settings.devices.e.b.GENERIC, str);
            }
            if (observable instanceof q1) {
                ca(com.garmin.android.apps.connectmobile.settings.devices.e.a.RUNNING, com.garmin.android.apps.connectmobile.settings.devices.e.b.TREADMILL, str);
            }
            if (observable instanceof q) {
                ca(com.garmin.android.apps.connectmobile.settings.devices.e.a.CYCLING, com.garmin.android.apps.connectmobile.settings.devices.e.b.GENERIC, str);
            }
            if (observable instanceof v) {
                ca(com.garmin.android.apps.connectmobile.settings.devices.e.a.CARDIO, com.garmin.android.apps.connectmobile.settings.devices.e.b.CARDIO_TRAINING, str);
            }
            if (observable instanceof o1) {
                ca(com.garmin.android.apps.connectmobile.settings.devices.e.a.SWIMMING, com.garmin.android.apps.connectmobile.settings.devices.e.b.GENERIC, str);
            }
            if (observable instanceof e0) {
                ca(com.garmin.android.apps.connectmobile.settings.devices.e.a.ELLIPTICAL, com.garmin.android.apps.connectmobile.settings.devices.e.b.ELLIPTICAL, str);
            }
            if (observable instanceof w1) {
                ca(com.garmin.android.apps.connectmobile.settings.devices.e.a.FITNESS_EQUIPMENT, com.garmin.android.apps.connectmobile.settings.devices.e.b.STAIR_CLIMBING, str);
            }
            if (observable instanceof j2) {
                ca(com.garmin.android.apps.connectmobile.settings.devices.e.a.TRAINING, com.garmin.android.apps.connectmobile.settings.devices.e.b.YOGA, str);
            }
            if (observable instanceof i2) {
                ca(com.garmin.android.apps.connectmobile.settings.devices.e.a.WALKING, com.garmin.android.apps.connectmobile.settings.devices.e.b.GENERIC, str);
            }
            if (observable instanceof l1) {
                ca(com.garmin.android.apps.connectmobile.settings.devices.e.a.OTHER, com.garmin.android.apps.connectmobile.settings.devices.e.b.GENERIC, str);
            }
            if (observable instanceof x1) {
                ca(com.garmin.android.apps.connectmobile.settings.devices.e.a.TRAINING, com.garmin.android.apps.connectmobile.settings.devices.e.b.STRENGTH_TRAINING, str);
            }
            if (observable instanceof y1) {
                ca(com.garmin.android.apps.connectmobile.settings.devices.e.a.TRAINING, com.garmin.android.apps.connectmobile.settings.devices.e.b.STRENGTH_TRAINING, str);
            }
            if (observable instanceof ig1.d) {
                Intent intent = new Intent(this, (Class<?>) AudioPromptsSettingsActivity.class);
                intent.putExtra("GCM_deviceUnitID", this.f41605a);
                intent.putExtra("GCM_deviceProductNbr", this.f41608d);
                startActivity(intent);
            }
            if (observable instanceof c0) {
                long j8 = this.f41605a;
                Intent intent2 = new Intent(this, (Class<?>) DisplayBacklightActivity.class);
                intent2.putExtra("GCM_deviceUnitID", j8);
                startActivity(intent2);
            }
        }
    }
}
