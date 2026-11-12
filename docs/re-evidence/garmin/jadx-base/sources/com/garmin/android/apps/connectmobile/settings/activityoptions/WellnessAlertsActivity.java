package com.garmin.android.apps.connectmobile.settings.activityoptions;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import android.widget.LinearLayout;
import ch1.a1;
import ch1.h1;
import com.garmin.android.apps.connectmobile.R;
import com.garmin.android.apps.connectmobile.devices.model.g;
import com.garmin.android.apps.connectmobile.i2;
import com.garmin.android.apps.connectmobile.settings.devices.swim.PoolSizeActivity;
import com.garmin.android.apps.connectmobile.settings.devices.swim.SwimAlertsActivity;
import fb2.k;
import hg1.i;
import hg1.o;
import ig1.a2;
import ig1.b2;
import ig1.h2;
import ig1.j;
import ig1.n1;
import ig1.u;
import ig1.x;
import ig1.y;
import ig1.y0;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Observable;
import java.util.Observer;
import o13.p;
import org.json.JSONException;
import org.json.JSONObject;
import p005kotlin.jvm.internal.s;
import vb.h;
import zb0.u0;

/* JADX INFO: loaded from: classes10.dex */
public class WellnessAlertsActivity extends com.garmin.android.apps.connectmobile.c implements Observer {

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final HashSet f41695k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static final HashSet f41696l;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public com.garmin.android.apps.connectmobile.devices.model.f f41698b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public com.garmin.android.apps.connectmobile.settings.devices.e.a f41699c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public com.garmin.android.apps.connectmobile.settings.devices.e.b f41700d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public d80.f f41701e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public long f41702f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public u0 f41703g;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public i f41705i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public JSONObject f41706j;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ArrayList f41697a = new ArrayList();

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public boolean f41704h = false;

    public class a implements c {
        public a() {
        }

        @Override // com.garmin.android.apps.connectmobile.settings.activityoptions.WellnessAlertsActivity.c
        public final boolean a(fb2.e eVar) {
            return eVar.k(WellnessAlertsActivity.this.f41698b);
        }

        @Override // com.garmin.android.apps.connectmobile.settings.activityoptions.WellnessAlertsActivity.c
        public final void b(fb2.e eVar) {
        }
    }

    public static /* synthetic */ class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f41708a;

        static {
            int[] iArr = new int[com.garmin.android.apps.connectmobile.settings.devices.e.a.values().length];
            f41708a = iArr;
            try {
                iArr[com.garmin.android.apps.connectmobile.settings.devices.e.a.RUNNING.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f41708a[com.garmin.android.apps.connectmobile.settings.devices.e.a.TRAINING.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f41708a[com.garmin.android.apps.connectmobile.settings.devices.e.a.CYCLING.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f41708a[com.garmin.android.apps.connectmobile.settings.devices.e.a.SWIMMING.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
        }
    }

    public interface c<T> {
        boolean a(fb2.e<T> eVar);

        void b(fb2.e<T> eVar);
    }

    static {
        u0 u0Var = u0.T1;
        f41695k = new HashSet(Arrays.asList(u0Var));
        f41696l = new HashSet(Arrays.asList(u0Var, u0.K1, u0.L1, u0.M1));
    }

    public static void ea(Activity activity, com.garmin.android.apps.connectmobile.settings.devices.e.a aVar, com.garmin.android.apps.connectmobile.settings.devices.e.b bVar, com.garmin.android.apps.connectmobile.devices.model.f fVar, long j8, String str, u0 u0Var) {
        if (activity == null) {
            h.s("Context is null");
            return;
        }
        if (aVar == null) {
            h.s("Sport is null");
            return;
        }
        if (bVar == null) {
            h.s("SubSport is null");
            return;
        }
        if (fVar == null) {
            h.s("DTO is null");
            return;
        }
        Intent intent = new Intent(activity, (Class<?>) WellnessAlertsActivity.class);
        intent.putExtra("GCM_deviceActivityOptionsSport", aVar);
        intent.putExtra("GCM_deviceActivityOptionsSubSport", bVar);
        intent.putExtra("GCM_deviceActivityOptions", fVar);
        intent.putExtra("GCM_deviceUnitID", j8);
        intent.putExtra("GCM_deviceEnumValue", u0Var);
        if (TextUtils.isEmpty(str)) {
            str = activity.getString(R.string.activity_options_title);
        }
        intent.putExtra("GCM_deviceSettingsTitle", str);
        activity.startActivity(intent);
    }

    public void ca() {
        boolean z14 = false;
        boolean z15 = this.f41703g == u0.M5;
        ArrayList arrayList = this.f41697a;
        if (z15) {
            arrayList.clear();
            int i14 = b.f41708a[this.f41699c.ordinal()];
            if (i14 == 1 || i14 == 2 || i14 == 3) {
                arrayList.add(new a1(this));
                arrayList.add(new ig1.e(this, this.f41699c));
                arrayList.add(new y0(this));
                arrayList.add(new ig1.i(this));
                arrayList.add(new h1(this));
                return;
            }
            if (i14 != 4) {
                return;
            }
            com.garmin.android.apps.connectmobile.settings.devices.e.b bVar = this.f41700d;
            if (bVar == com.garmin.android.apps.connectmobile.settings.devices.e.b.LAP_SWIMMING) {
                arrayList.add(new a1(this));
                arrayList.add(new n1(this));
                arrayList.add(new a1(this));
                arrayList.add(new j(this));
                arrayList.add(new b2(this));
                arrayList.add(new a1(this));
                arrayList.add(new a2(this));
                arrayList.add(new x(this));
                return;
            }
            if (bVar == com.garmin.android.apps.connectmobile.settings.devices.e.b.OPEN_WATER) {
                arrayList.add(new a1(this));
                arrayList.add(new ig1.e(this, this.f41699c));
                arrayList.add(new y0(this));
                arrayList.add(new b2(this));
                arrayList.add(new a1(this));
                arrayList.add(new h1(this));
                return;
            }
            return;
        }
        arrayList.clear();
        a1 a1Var = new a1(this);
        com.garmin.android.apps.connectmobile.settings.devices.e.a aVar = this.f41699c;
        com.garmin.android.apps.connectmobile.settings.devices.e.a aVar2 = com.garmin.android.apps.connectmobile.settings.devices.e.a.SWIMMING;
        if ((aVar == aVar2 && f41695k.contains(this.f41703g)) || (this.f41699c == com.garmin.android.apps.connectmobile.settings.devices.e.a.WALKING && this.f41700d == com.garmin.android.apps.connectmobile.settings.devices.e.b.CHALLENGE && f41696l.contains(this.f41703g))) {
            z14 = true;
        }
        this.f41704h = z14;
        if (z14) {
            return;
        }
        com.garmin.android.apps.connectmobile.settings.devices.e.a aVar3 = this.f41699c;
        if (aVar3 == com.garmin.android.apps.connectmobile.settings.devices.e.a.TRAINING && this.f41700d == com.garmin.android.apps.connectmobile.settings.devices.e.b.CARDIO_TRAINING) {
            arrayList.add(new u(this));
            arrayList.add(new k(this, true));
        } else if (aVar3 == com.garmin.android.apps.connectmobile.settings.devices.e.a.WALKING) {
            arrayList.add(new h2(this));
            arrayList.add(new k(this, true));
        } else if (aVar3 == aVar2) {
            arrayList.add(new n1(this));
            arrayList.add(new k(this, true));
        } else {
            arrayList.add(a1Var);
        }
        if (this.f41699c == aVar2) {
            arrayList.add(new b2(this));
        } else {
            arrayList.add(new ig1.c(this));
        }
        arrayList.add(new k(this, true));
        if (this.f41700d != com.garmin.android.apps.connectmobile.settings.devices.e.b.STRENGTH_TRAINING) {
            u0 u0Var = this.f41703g;
            if (u0Var == u0.T1 || u0Var == u0.f203764l2 || u0Var == u0.M1) {
                arrayList.add(new ig1.e(this, this.f41699c));
            } else {
                if (this.f41699c == com.garmin.android.apps.connectmobile.settings.devices.e.a.CYCLING) {
                    arrayList.add(new ig1.h(this, ""));
                } else {
                    arrayList.add(new ig1.e(this, this.f41699c));
                }
                arrayList.add(new y0(this));
                arrayList.add(new ig1.i(this));
            }
        } else {
            arrayList.add(new ig1.k(this));
        }
        arrayList.add(new y(this));
    }

    public final void da(c cVar) {
        int i14;
        int i15 = 0;
        while (true) {
            ArrayList arrayList = this.f41697a;
            if (i15 >= arrayList.size()) {
                return;
            }
            fb2.e eVar = (fb2.e) arrayList.get(i15);
            i2.k(com.garmin.android.apps.connectmobile.a2.SETTINGS, "WellnessAlertsActivity", "Initializing: " + eVar.toString());
            boolean zA = cVar.a(eVar);
            eVar.m(zA);
            if (!(eVar instanceof k) && !(eVar instanceof y) && !zA && (i14 = i15 + 1) < arrayList.size()) {
                fb2.e eVar2 = (fb2.e) arrayList.get(i14);
                if (eVar2 instanceof k) {
                    cVar.a(eVar2);
                    eVar2.m(false);
                    i15 = i14;
                }
            }
            if ((eVar instanceof y) && !zA) {
                for (int i16 = i15 - 1; i16 >= 0; i16--) {
                    fb2.e eVar3 = (fb2.e) arrayList.get(i16);
                    if (eVar3 instanceof k) {
                        eVar3.m(false);
                        break;
                    } else {
                        if (eVar3.j()) {
                            break;
                        }
                    }
                }
            }
            cVar.b(eVar);
            i15++;
        }
    }

    @Override // com.garmin.android.apps.connectmobile.z1, androidx.fragment.app.m, b.g, android.app.Activity
    public final void onActivityResult(int i14, int i15, Intent intent) {
        hg1.h hVar;
        super.onActivityResult(i14, i15, intent);
        if (i15 == -1 && i14 == 20) {
            com.garmin.android.apps.connectmobile.devices.model.f fVar = (intent == null || intent.getExtras() == null) ? null : (com.garmin.android.apps.connectmobile.devices.model.f) intent.getExtras().get("GCM_deviceActivityOptions");
            if (fVar != null) {
                i iVar = this.f41705i;
                if (iVar != null) {
                    if (iVar.f83688b && (hVar = iVar.f83687a) != null) {
                        fVar.U1(hVar.f83684a);
                        hg1.h hVar2 = iVar.f83687a;
                        if (hVar2 == null) {
                            s.m("paceSpeedDataContainer");
                            throw null;
                        }
                        fVar.C1(hVar2.f83685b);
                        int i16 = 0;
                        for (Object obj : fVar.I()) {
                            int i17 = i16 + 1;
                            if (i16 < 0) {
                                p13.x.q();
                                throw null;
                            }
                            g gVar = (g) obj;
                            int iD = gVar.D();
                            for (int i18 = 0; i18 < iD; i18++) {
                                hg1.k kVarC = gVar.C(i18);
                                hg1.h hVar3 = iVar.f83687a;
                                if (hVar3 == null) {
                                    s.m("paceSpeedDataContainer");
                                    throw null;
                                }
                                hg1.k kVar = (hg1.k) hVar3.f83686c.get(new p(Integer.valueOf(i16), Integer.valueOf(i18)));
                                if (kVar != null && kVarC == hg1.k.DATA_FIELD_NONE) {
                                    gVar.F(i18, kVar);
                                }
                            }
                            i16 = i17;
                        }
                    }
                    this.f41705i = null;
                }
                this.f41698b = fVar;
                da(new a());
            }
            i2.a(com.garmin.android.apps.connectmobile.a2.SETTINGS, "WellnessAlertsActivity", "onActivityResult: mDeviceActivityOptionsDTO=" + this.f41698b);
        }
    }

    @Override // com.garmin.android.apps.connectmobile.z1, b.g, android.app.Activity
    public final void onBackPressed() {
        com.garmin.android.apps.connectmobile.devices.model.f fVar;
        d80.f fVar2 = this.f41701e;
        if (fVar2 != null && !fVar2.c()) {
            super.onBackPressed();
            return;
        }
        if (!hb2.i.a(this) || (fVar = this.f41698b) == null) {
            return;
        }
        String strM = com.garmin.android.apps.connectmobile.devices.model.f.M(fVar.e2(), this.f41706j);
        if (strM == null) {
            finish();
            return;
        }
        showProgressOverlay();
        com.garmin.android.apps.connectmobile.settings.devices.e eVarN = com.garmin.android.apps.connectmobile.settings.devices.e.N();
        long j8 = this.f41702f;
        com.garmin.android.apps.connectmobile.settings.devices.e.a aVar = this.f41699c;
        o oVar = new o(this);
        eVarN.getClass();
        this.f41701e = com.garmin.android.apps.connectmobile.settings.devices.e.P(j8, aVar, strM, oVar);
    }

    @Override // com.garmin.android.apps.connectmobile.c, com.garmin.android.apps.connectmobile.z1, com.garmin.android.apps.connectmobile.v, androidx.fragment.app.m, b.g, z6.e, android.app.Activity
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(R.layout.gcm3_activity_options_dynamic_content);
        this.f41698b = (com.garmin.android.apps.connectmobile.devices.model.f) getIntent().getParcelableExtra("GCM_deviceActivityOptions");
        this.f41702f = getIntent().getLongExtra("GCM_deviceUnitID", -1L);
        this.f41703g = (u0) getIntent().getSerializableExtra("GCM_deviceEnumValue");
        this.f41699c = (com.garmin.android.apps.connectmobile.settings.devices.e.a) getIntent().getSerializableExtra("GCM_deviceActivityOptionsSport");
        this.f41700d = (com.garmin.android.apps.connectmobile.settings.devices.e.b) getIntent().getSerializableExtra("GCM_deviceActivityOptionsSubSport");
        initActionBar(true, getIntent().getStringExtra("GCM_deviceSettingsTitle"));
        if (this.f41698b != null) {
            try {
                this.f41706j = new JSONObject(this.f41698b.f34131a);
            } catch (JSONException unused) {
            }
        }
        rd2.j jVar = rd2.f.a().f152045a;
        long j8 = this.f41702f;
        jVar.getClass();
        rd2.j.i(j8, null);
        ca();
        LinearLayout linearLayout = (LinearLayout) findViewById(R.id.page_content);
        Iterator it = this.f41697a.iterator();
        while (it.hasNext()) {
            linearLayout.addView(((fb2.e) it.next()).a());
        }
        if (this.f41704h) {
            com.garmin.android.apps.connectmobile.settings.devices.e.a aVar = this.f41699c;
            if (aVar == com.garmin.android.apps.connectmobile.settings.devices.e.a.SWIMMING) {
                linearLayout.addView(fb2.g.c(this, getString(R.string.device_settings_pool_swim_note)));
            } else if (aVar == com.garmin.android.apps.connectmobile.settings.devices.e.a.WALKING && this.f41700d == com.garmin.android.apps.connectmobile.settings.devices.e.b.CHALLENGE) {
                linearLayout.addView(fb2.g.c(this, getString(R.string.device_settings_toe_to_toe_note)));
            }
        }
        linearLayout.addView(fb2.g.a(this));
        da(new f(this));
    }

    @Override // i.c, androidx.fragment.app.m, android.app.Activity
    public final void onDestroy() {
        super.onDestroy();
        ArrayList arrayList = this.f41697a;
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
        d80.f fVar = this.f41701e;
        if (fVar != null) {
            fVar.f58259c = null;
        }
    }

    @Override // java.util.Observer
    public void update(Observable observable, Object obj) throws Throwable {
        i2.k(com.garmin.android.apps.connectmobile.a2.SETTINGS, "WellnessAlertsActivity", hb.a.j("update: observable=", observable, ", data=", obj));
        if (obj != null) {
            if (observable instanceof ig1.c) {
                if (this.f41700d == com.garmin.android.apps.connectmobile.settings.devices.e.b.STRENGTH_TRAINING) {
                    com.garmin.android.apps.connectmobile.devices.model.f fVar = this.f41698b;
                    long j8 = this.f41702f;
                    u0 u0Var = this.f41703g;
                    Intent intent = new Intent(this, (Class<?>) StrengthTrainingAlertsActivity.class);
                    intent.putExtra("GCM_deviceActivityOptions", fVar);
                    intent.putExtra("GCM_deviceUnitID", j8);
                    intent.putExtra("GCM_deviceEnumValue", u0Var);
                    startActivityForResult(intent, 20);
                } else {
                    com.garmin.android.apps.connectmobile.settings.devices.e.a aVar = this.f41699c;
                    com.garmin.android.apps.connectmobile.settings.devices.e.a aVar2 = com.garmin.android.apps.connectmobile.settings.devices.e.a.OTHER;
                    com.garmin.android.apps.connectmobile.devices.model.f fVar2 = this.f41698b;
                    long j14 = this.f41702f;
                    if (aVar == aVar2) {
                        u0 u0Var2 = this.f41703g;
                        Intent intent2 = new Intent(this, (Class<?>) OtherAlertsActivity.class);
                        intent2.putExtra("GCM_deviceActivityOptions", fVar2);
                        intent2.putExtra("GCM_deviceUnitID", j14);
                        intent2.putExtra("GCM_deviceEnumValue", u0Var2);
                        startActivityForResult(intent2, 20);
                    } else {
                        u0 u0Var3 = this.f41703g;
                        Intent intent3 = new Intent(this, (Class<?>) AlertsActivity.class);
                        intent3.putExtra("GCM_deviceActivityOptions", fVar2);
                        intent3.putExtra("GCM_deviceUnitID", j14);
                        intent3.putExtra("GCM_deviceEnumValue", u0Var3);
                        startActivityForResult(intent3, 20);
                    }
                }
            }
            int i14 = 0;
            if ((observable instanceof n1) && this.f41700d == com.garmin.android.apps.connectmobile.settings.devices.e.b.LAP_SWIMMING) {
                com.garmin.android.apps.connectmobile.devices.model.f fVar3 = this.f41698b;
                long j15 = this.f41702f;
                String str = this.f41703g.f203854a.split(",")[0];
                PoolSizeActivity.f43142k.getClass();
                fVar3.getClass();
                str.getClass();
                Intent intent4 = new Intent(this, (Class<?>) PoolSizeActivity.class);
                intent4.putExtra("GCM_deviceUnitID", j15);
                intent4.putExtra("GCM_deviceProductNbr", str);
                intent4.putExtra("GCM_deviceActivityOptions", fVar3);
                startActivityForResult(intent4, 20);
            }
            if (observable instanceof y) {
                i iVar = new i(this.f41703g, this.f41699c);
                this.f41705i = iVar;
                com.garmin.android.apps.connectmobile.devices.model.f fVar4 = this.f41698b;
                fVar4.getClass();
                if (iVar.f83688b) {
                    ArrayList arrayList = new ArrayList(fVar4.G());
                    if (fVar4.x0() == null) {
                        h.s("Required value was null.");
                        return;
                    }
                    hg1.k kVarX0 = fVar4.x0();
                    kVarX0.getClass();
                    iVar.f83687a = new hg1.h(kVarX0, arrayList);
                    Throwable th3 = null;
                    fVar4.A1(null, "speedType");
                    ArrayList arrayList2 = new ArrayList();
                    for (Object obj2 : arrayList) {
                        switch (i.a.f83689a[((hg1.k) obj2).ordinal()]) {
                            case 1:
                            case 2:
                            case 3:
                            case 4:
                            case 5:
                            case 6:
                                break;
                            default:
                                arrayList2.add(obj2);
                                break;
                        }
                    }
                    fVar4.C1(arrayList2);
                    int i15 = 0;
                    for (Object obj3 : fVar4.I()) {
                        int i16 = i15 + 1;
                        if (i15 < 0) {
                            Throwable th4 = th3;
                            p13.x.q();
                            throw th4;
                        }
                        g gVar = (g) obj3;
                        int iD = gVar.D();
                        int i17 = i14;
                        while (i17 < iD) {
                            hg1.k kVarC = gVar.C(i17);
                            switch (i.a.f83689a[kVarC.ordinal()]) {
                                case 1:
                                case 2:
                                case 3:
                                case 4:
                                case 5:
                                case 6:
                                    hg1.h hVar = iVar.f83687a;
                                    if (hVar == null) {
                                        Throwable th5 = th3;
                                        s.m("paceSpeedDataContainer");
                                        throw th5;
                                    }
                                    hVar.f83686c.put(new p(Integer.valueOf(i15), Integer.valueOf(i17)), kVarC);
                                    gVar.F(i17, hg1.k.DATA_FIELD_NONE);
                                    break;
                                    break;
                            }
                            i17++;
                            th3 = th3;
                            iVar = iVar;
                            i14 = 0;
                        }
                        i15 = i16;
                    }
                }
                com.garmin.android.apps.connectmobile.devices.model.f fVar5 = this.f41698b;
                u0 u0Var4 = this.f41703g;
                DataFieldsActivity.ca(this, fVar5, u0Var4, !(((u0.T1 == u0Var4 && com.garmin.android.apps.connectmobile.settings.devices.e.a.CYCLING == this.f41699c) || u0.K1 == u0Var4 || u0.L1 == u0Var4 || u0.f203764l2 == u0Var4 || u0.M1 == u0Var4) ? false : true), 20);
            }
            if (observable instanceof b2) {
                com.garmin.android.apps.connectmobile.devices.model.f fVar6 = this.f41698b;
                long j16 = this.f41702f;
                u0 u0Var5 = this.f41703g;
                Intent intent5 = new Intent(this, (Class<?>) SwimAlertsActivity.class);
                intent5.putExtra("GCM_deviceActivityOptions", fVar6);
                intent5.putExtra("GCM_deviceUnitID", j16);
                intent5.putExtra("GCM_deviceEnumValue", u0Var5);
                startActivityForResult(intent5, 20);
            }
        }
    }
}
