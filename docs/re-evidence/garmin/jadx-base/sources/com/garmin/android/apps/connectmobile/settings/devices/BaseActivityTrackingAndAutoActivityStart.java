package com.garmin.android.apps.connectmobile.settings.devices;

import android.os.Bundle;
import android.text.TextUtils;
import android.widget.LinearLayout;
import android.widget.Toast;
import com.garmin.android.apps.connectmobile.R;
import com.garmin.android.apps.connectmobile.a2;
import com.garmin.android.apps.connectmobile.devices.model.DeviceSettingsDTO;
import com.garmin.android.apps.connectmobile.i2;
import ig1.o;
import java.util.ArrayList;
import java.util.Observable;
import java.util.Observer;
import ng1.m0;
import ng1.n0;
import ng1.o0;
import ng1.p0;
import ng1.q0;
import ng1.r0;
import org.koin.java.KoinJavaComponent;
import zb0.u0;

/* JADX INFO: loaded from: classes10.dex */
public class BaseActivityTrackingAndAutoActivityStart extends com.garmin.android.apps.connectmobile.c implements Observer, p0, r0, n0, q0, o0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public ch1.a f41893a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public o f41894b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public com.garmin.android.apps.connectmobile.devices.model.f f41895c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public com.garmin.android.apps.connectmobile.devices.model.f f41896d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public com.garmin.android.apps.connectmobile.devices.model.f f41897e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public com.garmin.android.apps.connectmobile.devices.model.f f41898f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public com.garmin.android.apps.connectmobile.devices.model.f f41899g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public d80.f f41900h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public d80.f f41901i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public d80.f f41902j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public d80.f f41903k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public d80.f f41904l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public d80.f f41905m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public d80.f f41906n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public d80.f f41907o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public d80.f f41908p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public d80.f f41909q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public long f41910r;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public DeviceSettingsDTO f41911t;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public LinearLayout f41912v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public ArrayList<String> f41913w = new ArrayList<>();

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final c f41914x = new c();

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final d f41915y = new d();

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public final e f41916z = new e();
    public final f A = new f();
    public final g B = new g();

    public class a implements d80.b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ com.garmin.android.apps.connectmobile.devices.model.f f41917a;

        public a(com.garmin.android.apps.connectmobile.devices.model.f fVar) {
            this.f41917a = fVar;
        }

        @Override // d80.b
        public final void a(lj0.b bVar) {
            a2 a2Var = a2.SETTINGS;
            hb.a.q(bVar.f112957a, new StringBuilder("Error saving swimming threshold to options to GC ["), "].", a2Var, "BaseActivityTrackingAndAutoActivityStart");
            lj0.b bVar2 = lj0.b.f112951e;
            BaseActivityTrackingAndAutoActivityStart baseActivityTrackingAndAutoActivityStart = BaseActivityTrackingAndAutoActivityStart.this;
            if (bVar != bVar2) {
                Toast.makeText(baseActivityTrackingAndAutoActivityStart, R.string.txt_error_occurred, 0).show();
            }
            baseActivityTrackingAndAutoActivityStart.hideProgressOverlay();
            baseActivityTrackingAndAutoActivityStart.finish();
        }

        @Override // d80.b
        public final void b(Object obj, d80.b.a aVar) {
            i2.a(a2.SETTINGS, "BaseActivityTrackingAndAutoActivityStart", "Saving swimming threshold: ".concat(String.valueOf(this.f41917a.D())));
        }
    }

    public class b implements d80.b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ com.garmin.android.apps.connectmobile.devices.model.f f41919a;

        public b(com.garmin.android.apps.connectmobile.devices.model.f fVar) {
            this.f41919a = fVar;
        }

        @Override // d80.b
        public final void a(lj0.b bVar) {
            a2 a2Var = a2.SETTINGS;
            hb.a.q(bVar.f112957a, new StringBuilder("Error saving elliptical threshold to options to GC ["), "].", a2Var, "BaseActivityTrackingAndAutoActivityStart");
            lj0.b bVar2 = lj0.b.f112951e;
            BaseActivityTrackingAndAutoActivityStart baseActivityTrackingAndAutoActivityStart = BaseActivityTrackingAndAutoActivityStart.this;
            if (bVar != bVar2) {
                Toast.makeText(baseActivityTrackingAndAutoActivityStart, R.string.txt_error_occurred, 0).show();
            }
            baseActivityTrackingAndAutoActivityStart.hideProgressOverlay();
            baseActivityTrackingAndAutoActivityStart.finish();
        }

        @Override // d80.b
        public final void b(Object obj, d80.b.a aVar) {
            i2.a(a2.SETTINGS, "BaseActivityTrackingAndAutoActivityStart", "Saving elliptical threshold: ".concat(String.valueOf(this.f41919a.D())));
        }
    }

    public class c implements m0 {
        public c() {
        }

        @Override // ng1.m0
        public final void b(com.garmin.android.apps.connectmobile.devices.model.k kVar) {
            DeviceSettingsDTO deviceSettingsDTO = BaseActivityTrackingAndAutoActivityStart.this.f41911t;
            deviceSettingsDTO.T0 = kVar;
            deviceSettingsDTO.S1("autoActivityDetect");
        }
    }

    public class d implements d80.b {
        public d() {
        }

        @Override // d80.b
        public final void a(lj0.b bVar) {
            a2 a2Var = a2.SETTINGS;
            hb.a.q(bVar.f112957a, new StringBuilder("Error fetching device settings from GC ["), "].", a2Var, "BaseActivityTrackingAndAutoActivityStart");
            lj0.b bVar2 = lj0.b.f112951e;
            BaseActivityTrackingAndAutoActivityStart baseActivityTrackingAndAutoActivityStart = BaseActivityTrackingAndAutoActivityStart.this;
            if (bVar != bVar2) {
                Toast.makeText(baseActivityTrackingAndAutoActivityStart, R.string.txt_error_occurred, 0).show();
            }
            if (baseActivityTrackingAndAutoActivityStart.isFinishing()) {
                return;
            }
            baseActivityTrackingAndAutoActivityStart.finish();
        }

        @Override // d80.b
        public final void b(Object obj, d80.b.a aVar) {
            BaseActivityTrackingAndAutoActivityStart baseActivityTrackingAndAutoActivityStart = BaseActivityTrackingAndAutoActivityStart.this;
            baseActivityTrackingAndAutoActivityStart.f41895c = (com.garmin.android.apps.connectmobile.devices.model.f) obj;
            if (obj == null) {
                a(lj0.b.f112956j);
            } else {
                baseActivityTrackingAndAutoActivityStart.ga();
            }
        }
    }

    public class e implements d80.b {
        public e() {
        }

        @Override // d80.b
        public final void a(lj0.b bVar) {
            a2 a2Var = a2.SETTINGS;
            hb.a.q(bVar.f112957a, new StringBuilder("Error fetching device settings from GC ["), "].", a2Var, "BaseActivityTrackingAndAutoActivityStart");
            lj0.b bVar2 = lj0.b.f112951e;
            BaseActivityTrackingAndAutoActivityStart baseActivityTrackingAndAutoActivityStart = BaseActivityTrackingAndAutoActivityStart.this;
            if (bVar != bVar2) {
                Toast.makeText(baseActivityTrackingAndAutoActivityStart, R.string.txt_error_occurred, 0).show();
            }
            if (baseActivityTrackingAndAutoActivityStart.isFinishing()) {
                return;
            }
            baseActivityTrackingAndAutoActivityStart.finish();
        }

        @Override // d80.b
        public final void b(Object obj, d80.b.a aVar) {
            BaseActivityTrackingAndAutoActivityStart baseActivityTrackingAndAutoActivityStart = BaseActivityTrackingAndAutoActivityStart.this;
            baseActivityTrackingAndAutoActivityStart.f41896d = (com.garmin.android.apps.connectmobile.devices.model.f) obj;
            if (obj == null) {
                a(lj0.b.f112956j);
            } else {
                baseActivityTrackingAndAutoActivityStart.ca();
            }
        }
    }

    public class f implements d80.b {
        public f() {
        }

        @Override // d80.b
        public final void a(lj0.b bVar) {
            a2 a2Var = a2.SETTINGS;
            hb.a.q(bVar.f112957a, new StringBuilder("Error saving running threshold to options to GC ["), "].", a2Var, "BaseActivityTrackingAndAutoActivityStart");
            lj0.b bVar2 = lj0.b.f112951e;
            BaseActivityTrackingAndAutoActivityStart baseActivityTrackingAndAutoActivityStart = BaseActivityTrackingAndAutoActivityStart.this;
            if (bVar != bVar2) {
                Toast.makeText(baseActivityTrackingAndAutoActivityStart, R.string.txt_error_occurred, 0).show();
            }
            baseActivityTrackingAndAutoActivityStart.hideProgressOverlay();
            if (baseActivityTrackingAndAutoActivityStart.isFinishing()) {
                return;
            }
            baseActivityTrackingAndAutoActivityStart.finish();
        }

        @Override // d80.b
        public final void b(Object obj, d80.b.a aVar) {
        }
    }

    public class g implements d80.b {
        public g() {
        }

        @Override // d80.b
        public final void a(lj0.b bVar) {
            a2 a2Var = a2.SETTINGS;
            hb.a.q(bVar.f112957a, new StringBuilder("Error saving running threshold to options to GC ["), "].", a2Var, "BaseActivityTrackingAndAutoActivityStart");
            lj0.b bVar2 = lj0.b.f112951e;
            BaseActivityTrackingAndAutoActivityStart baseActivityTrackingAndAutoActivityStart = BaseActivityTrackingAndAutoActivityStart.this;
            if (bVar != bVar2) {
                Toast.makeText(baseActivityTrackingAndAutoActivityStart, R.string.txt_error_occurred, 0).show();
            }
            baseActivityTrackingAndAutoActivityStart.hideProgressOverlay();
            if (baseActivityTrackingAndAutoActivityStart.isFinishing()) {
                return;
            }
            baseActivityTrackingAndAutoActivityStart.finish();
        }

        @Override // d80.b
        public final void b(Object obj, d80.b.a aVar) {
        }
    }

    public class h implements d80.b {
        public h() {
        }

        @Override // d80.b
        public final void a(lj0.b bVar) {
            a2 a2Var = a2.SETTINGS;
            hb.a.q(bVar.f112957a, new StringBuilder("Error fetching device settings from GC ["), "].", a2Var, "BaseActivityTrackingAndAutoActivityStart");
            lj0.b bVar2 = lj0.b.f112951e;
            BaseActivityTrackingAndAutoActivityStart baseActivityTrackingAndAutoActivityStart = BaseActivityTrackingAndAutoActivityStart.this;
            if (bVar != bVar2) {
                Toast.makeText(baseActivityTrackingAndAutoActivityStart, R.string.txt_error_occurred, 0).show();
            }
            baseActivityTrackingAndAutoActivityStart.finish();
        }

        @Override // d80.b
        public final void b(Object obj, d80.b.a aVar) {
            BaseActivityTrackingAndAutoActivityStart baseActivityTrackingAndAutoActivityStart = BaseActivityTrackingAndAutoActivityStart.this;
            baseActivityTrackingAndAutoActivityStart.f41897e = (com.garmin.android.apps.connectmobile.devices.model.f) obj;
            if (obj == null) {
                a(lj0.b.f112956j);
            } else {
                baseActivityTrackingAndAutoActivityStart.fa();
            }
        }
    }

    public class i implements d80.b {
        public i() {
        }

        @Override // d80.b
        public final void a(lj0.b bVar) {
            a2 a2Var = a2.SETTINGS;
            hb.a.q(bVar.f112957a, new StringBuilder("Error fetching device settings from GC ["), "].", a2Var, "BaseActivityTrackingAndAutoActivityStart");
            lj0.b bVar2 = lj0.b.f112951e;
            BaseActivityTrackingAndAutoActivityStart baseActivityTrackingAndAutoActivityStart = BaseActivityTrackingAndAutoActivityStart.this;
            if (bVar != bVar2) {
                Toast.makeText(baseActivityTrackingAndAutoActivityStart, R.string.txt_error_occurred, 0).show();
            }
            baseActivityTrackingAndAutoActivityStart.finish();
        }

        @Override // d80.b
        public final void b(Object obj, d80.b.a aVar) {
            BaseActivityTrackingAndAutoActivityStart baseActivityTrackingAndAutoActivityStart = BaseActivityTrackingAndAutoActivityStart.this;
            baseActivityTrackingAndAutoActivityStart.f41898f = (com.garmin.android.apps.connectmobile.devices.model.f) obj;
            if (obj == null) {
                a(lj0.b.f112956j);
            } else {
                baseActivityTrackingAndAutoActivityStart.da();
            }
        }
    }

    public class j implements d80.b {
        public j() {
        }

        @Override // d80.b
        public final void a(lj0.b bVar) {
            a2 a2Var = a2.SETTINGS;
            hb.a.q(bVar.f112957a, new StringBuilder("Error fetching device settings from GC ["), "].", a2Var, "BaseActivityTrackingAndAutoActivityStart");
            lj0.b bVar2 = lj0.b.f112951e;
            BaseActivityTrackingAndAutoActivityStart baseActivityTrackingAndAutoActivityStart = BaseActivityTrackingAndAutoActivityStart.this;
            if (bVar != bVar2) {
                Toast.makeText(baseActivityTrackingAndAutoActivityStart, R.string.txt_error_occurred, 0).show();
            }
            baseActivityTrackingAndAutoActivityStart.finish();
        }

        @Override // d80.b
        public final void b(Object obj, d80.b.a aVar) {
            com.garmin.android.apps.connectmobile.devices.model.f fVar = (com.garmin.android.apps.connectmobile.devices.model.f) obj;
            BaseActivityTrackingAndAutoActivityStart baseActivityTrackingAndAutoActivityStart = BaseActivityTrackingAndAutoActivityStart.this;
            baseActivityTrackingAndAutoActivityStart.f41899g = fVar;
            if (obj == null) {
                a(lj0.b.f112956j);
                return;
            }
            i2.a(a2.SETTINGS, "BaseActivityTrackingAndAutoActivityStart", "Fetching elliptical threshold: ".concat(String.valueOf(fVar.D())));
            baseActivityTrackingAndAutoActivityStart.hideProgressOverlay();
            baseActivityTrackingAndAutoActivityStart.ha();
        }
    }

    public class k implements d80.b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ com.garmin.android.apps.connectmobile.devices.model.f f41929a;

        public k(com.garmin.android.apps.connectmobile.devices.model.f fVar) {
            this.f41929a = fVar;
        }

        @Override // d80.b
        public final void a(lj0.b bVar) {
            a2 a2Var = a2.SETTINGS;
            hb.a.q(bVar.f112957a, new StringBuilder("Error saving cycling threshold to options to GC ["), "].", a2Var, "BaseActivityTrackingAndAutoActivityStart");
            lj0.b bVar2 = lj0.b.f112951e;
            BaseActivityTrackingAndAutoActivityStart baseActivityTrackingAndAutoActivityStart = BaseActivityTrackingAndAutoActivityStart.this;
            if (bVar != bVar2) {
                Toast.makeText(baseActivityTrackingAndAutoActivityStart, R.string.txt_error_occurred, 0).show();
            }
            baseActivityTrackingAndAutoActivityStart.hideProgressOverlay();
            baseActivityTrackingAndAutoActivityStart.finish();
        }

        @Override // d80.b
        public final void b(Object obj, d80.b.a aVar) {
            i2.a(a2.SETTINGS, "BaseActivityTrackingAndAutoActivityStart", "Saving cycling threshold: ".concat(String.valueOf(this.f41929a.D())));
        }
    }

    @Override // ng1.q0
    public final void R8(com.garmin.android.apps.connectmobile.devices.model.f fVar) {
        String strH = fVar.h();
        com.garmin.android.apps.connectmobile.settings.devices.e eVarN = com.garmin.android.apps.connectmobile.settings.devices.e.N();
        long j8 = this.f41910r;
        com.garmin.android.apps.connectmobile.settings.devices.e.a aVar = com.garmin.android.apps.connectmobile.settings.devices.e.a.SWIMMING;
        a aVar2 = new a(fVar);
        eVarN.getClass();
        this.f41908p = com.garmin.android.apps.connectmobile.settings.devices.e.P(j8, aVar, strH, aVar2);
    }

    @Override // ng1.n0
    public final void c8(com.garmin.android.apps.connectmobile.devices.model.f fVar) {
        String strH = fVar.h();
        com.garmin.android.apps.connectmobile.settings.devices.e eVarN = com.garmin.android.apps.connectmobile.settings.devices.e.N();
        long j8 = this.f41910r;
        com.garmin.android.apps.connectmobile.settings.devices.e.a aVar = com.garmin.android.apps.connectmobile.settings.devices.e.a.CYCLING;
        k kVar = new k(fVar);
        eVarN.getClass();
        this.f41907o = com.garmin.android.apps.connectmobile.settings.devices.e.P(j8, aVar, strH, kVar);
    }

    public final void ca() {
        if (hb2.i.a(this)) {
            showProgressOverlay();
            if (!this.f41913w.contains("BIKE")) {
                fa();
                return;
            }
            com.garmin.android.apps.connectmobile.settings.devices.e eVarN = com.garmin.android.apps.connectmobile.settings.devices.e.N();
            long j8 = this.f41910r;
            com.garmin.android.apps.connectmobile.settings.devices.e.a aVar = com.garmin.android.apps.connectmobile.settings.devices.e.a.CYCLING;
            com.garmin.android.apps.connectmobile.settings.devices.e.b bVar = com.garmin.android.apps.connectmobile.settings.devices.e.b.GENERIC;
            h hVar = new h();
            eVarN.getClass();
            this.f41902j = com.garmin.android.apps.connectmobile.settings.devices.e.M(j8, aVar, bVar, hVar);
        }
    }

    public final void da() {
        if (hb2.i.a(this)) {
            showProgressOverlay();
            if (!this.f41913w.contains("ELLIPTICAL")) {
                hideProgressOverlay();
                ha();
                return;
            }
            com.garmin.android.apps.connectmobile.settings.devices.e eVarN = com.garmin.android.apps.connectmobile.settings.devices.e.N();
            long j8 = this.f41910r;
            com.garmin.android.apps.connectmobile.settings.devices.e.a aVar = com.garmin.android.apps.connectmobile.settings.devices.e.a.FITNESS_EQUIPMENT;
            com.garmin.android.apps.connectmobile.settings.devices.e.b bVar = com.garmin.android.apps.connectmobile.settings.devices.e.b.ELLIPTICAL;
            j jVar = new j();
            eVarN.getClass();
            this.f41904l = com.garmin.android.apps.connectmobile.settings.devices.e.M(j8, aVar, bVar, jVar);
        }
    }

    public void ea() {
        if (hb2.i.a(this)) {
            showProgressOverlay();
            if (!this.f41913w.contains("RUN")) {
                ga();
                return;
            }
            com.garmin.android.apps.connectmobile.settings.devices.e eVarN = com.garmin.android.apps.connectmobile.settings.devices.e.N();
            long j8 = this.f41910r;
            com.garmin.android.apps.connectmobile.settings.devices.e.a aVar = com.garmin.android.apps.connectmobile.settings.devices.e.a.RUNNING;
            com.garmin.android.apps.connectmobile.settings.devices.e.b bVar = com.garmin.android.apps.connectmobile.settings.devices.e.b.GENERIC;
            eVarN.getClass();
            this.f41900h = com.garmin.android.apps.connectmobile.settings.devices.e.M(j8, aVar, bVar, this.f41915y);
        }
    }

    public final void fa() {
        if (hb2.i.a(this)) {
            showProgressOverlay();
            if (!this.f41913w.contains("SWIM")) {
                da();
                return;
            }
            com.garmin.android.apps.connectmobile.settings.devices.e eVarN = com.garmin.android.apps.connectmobile.settings.devices.e.N();
            long j8 = this.f41910r;
            com.garmin.android.apps.connectmobile.settings.devices.e.a aVar = com.garmin.android.apps.connectmobile.settings.devices.e.a.SWIMMING;
            com.garmin.android.apps.connectmobile.settings.devices.e.b bVar = com.garmin.android.apps.connectmobile.settings.devices.e.b.GENERIC;
            i iVar = new i();
            eVarN.getClass();
            this.f41903k = com.garmin.android.apps.connectmobile.settings.devices.e.M(j8, aVar, bVar, iVar);
        }
    }

    @Override // android.app.Activity
    public final void finish() {
        a2 a2Var = a2.SETTINGS;
        i2.k(a2Var, "BaseActivityTrackingAndAutoActivityStart", "finish()");
        ch1.a aVar = this.f41893a;
        if (aVar != null) {
            aVar.n();
            this.f41893a = null;
        }
        o oVar = this.f41894b;
        if (oVar != null) {
            oVar.n();
            this.f41894b = null;
        }
        i2.k(a2Var, "BaseActivityTrackingAndAutoActivityStart", "setSettingsResult()");
        getIntent().putExtra("GCM_deviceSettings", this.f41911t);
        setResult(-1, getIntent());
        super.finish();
    }

    public void ga() {
        if (hb2.i.a(this)) {
            showProgressOverlay();
            if (!this.f41913w.contains("WALK")) {
                ca();
                return;
            }
            com.garmin.android.apps.connectmobile.settings.devices.e eVarN = com.garmin.android.apps.connectmobile.settings.devices.e.N();
            long j8 = this.f41910r;
            com.garmin.android.apps.connectmobile.settings.devices.e.a aVar = com.garmin.android.apps.connectmobile.settings.devices.e.a.WALKING;
            com.garmin.android.apps.connectmobile.settings.devices.e.b bVar = com.garmin.android.apps.connectmobile.settings.devices.e.b.GENERIC;
            eVarN.getClass();
            this.f41901i = com.garmin.android.apps.connectmobile.settings.devices.e.M(j8, aVar, bVar, this.f41916z);
        }
    }

    public void ha() {
        this.f41893a = new ch1.a(this);
        this.f41912v = (LinearLayout) findViewById(R.id.page_content);
        boolean zG = this.f41893a.g(this, this.f41911t);
        ch1.a aVar = this.f41893a;
        if (!zG) {
            aVar.m(false);
            return;
        }
        aVar.addObserver(this);
        this.f41893a.m(true);
        this.f41894b.g(this, this.f41911t);
        this.f41912v.addView(this.f41894b.f93305d);
    }

    @Override // ng1.o0
    public final void k9(com.garmin.android.apps.connectmobile.devices.model.f fVar) {
        String strH = fVar.h();
        com.garmin.android.apps.connectmobile.settings.devices.e eVarN = com.garmin.android.apps.connectmobile.settings.devices.e.N();
        long j8 = this.f41910r;
        com.garmin.android.apps.connectmobile.settings.devices.e.a aVar = com.garmin.android.apps.connectmobile.settings.devices.e.a.ELLIPTICAL;
        b bVar = new b(fVar);
        eVarN.getClass();
        this.f41909q = com.garmin.android.apps.connectmobile.settings.devices.e.P(j8, aVar, strH, bVar);
    }

    @Override // com.garmin.android.apps.connectmobile.c, com.garmin.android.apps.connectmobile.z1, com.garmin.android.apps.connectmobile.v, androidx.fragment.app.m, b.g, z6.e, android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(R.layout.gcm3_device_settings_activity_tracking);
        if (getIntent().getExtras() != null) {
            this.f41911t = (DeviceSettingsDTO) getIntent().getExtras().getParcelable("GCM_deviceSettings");
            String stringExtra = getIntent().getStringExtra("GCM_deviceSettingsTitle");
            u0 u0Var = (u0) getIntent().getSerializableExtra("GCM_deviceEnumValue");
            long longExtra = getIntent().getLongExtra("GCM_extra_device_connected_unit_id", -1L);
            this.f41910r = longExtra;
            if (longExtra == -1) {
                this.f41910r = getIntent().getLongExtra("GCM_deviceUnitID", -1L);
            }
            if (u0Var == null) {
                finish();
                return;
            }
            if (this.f41913w == null) {
                this.f41913w = new ArrayList<>();
            }
            this.f41913w.clear();
            this.f41913w.add("RUN");
            this.f41913w.add("WALK");
            if (TextUtils.isEmpty(stringExtra)) {
                stringExtra = getString(R.string.devices_settings_device_settings);
            }
            initActionBar(true, stringExtra);
        }
        if (this.f41911t == null) {
            i2.f(a2.SETTINGS, "BaseActivityTrackingAndAutoActivityStart", "Invalid device settings object while entering device settings time, date, system screen!");
            finish();
        } else {
            ((a31.e) KoinJavaComponent.get(a31.e.class)).a(this.f41910r, e31.a.ENTERED_ACTIVITY_TRACKING_SCREEN);
            ea();
        }
    }

    @Override // com.garmin.android.apps.connectmobile.c, i.c, androidx.fragment.app.m, android.app.Activity
    public final void onStop() {
        super.onStop();
        d80.f fVar = this.f41900h;
        if (fVar != null) {
            fVar.a();
        }
        d80.f fVar2 = this.f41901i;
        if (fVar2 != null) {
            fVar2.a();
        }
        d80.f fVar3 = this.f41902j;
        if (fVar3 != null) {
            fVar3.a();
        }
        d80.f fVar4 = this.f41903k;
        if (fVar4 != null) {
            fVar4.a();
        }
        d80.f fVar5 = this.f41904l;
        if (fVar5 != null) {
            fVar5.a();
        }
        d80.f fVar6 = this.f41905m;
        if (fVar6 != null) {
            fVar6.a();
        }
        d80.f fVar7 = this.f41906n;
        if (fVar7 != null) {
            fVar7.a();
        }
        d80.f fVar8 = this.f41907o;
        if (fVar8 != null) {
            fVar8.a();
        }
        d80.f fVar9 = this.f41908p;
        if (fVar9 != null) {
            fVar9.a();
        }
        d80.f fVar10 = this.f41909q;
        if (fVar10 != null) {
            fVar10.a();
        }
    }

    @Override // ng1.p0
    public void r7(com.garmin.android.apps.connectmobile.devices.model.f fVar) {
        String strH = fVar.h();
        com.garmin.android.apps.connectmobile.settings.devices.e eVarN = com.garmin.android.apps.connectmobile.settings.devices.e.N();
        long j8 = this.f41910r;
        com.garmin.android.apps.connectmobile.settings.devices.e.a aVar = com.garmin.android.apps.connectmobile.settings.devices.e.a.RUNNING;
        eVarN.getClass();
        this.f41905m = com.garmin.android.apps.connectmobile.settings.devices.e.P(j8, aVar, strH, this.A);
    }

    @Override // ng1.r0
    public void u2(com.garmin.android.apps.connectmobile.devices.model.f fVar) {
        String strH = fVar.h();
        com.garmin.android.apps.connectmobile.settings.devices.e eVarN = com.garmin.android.apps.connectmobile.settings.devices.e.N();
        long j8 = this.f41910r;
        com.garmin.android.apps.connectmobile.settings.devices.e.a aVar = com.garmin.android.apps.connectmobile.settings.devices.e.a.WALKING;
        eVarN.getClass();
        this.f41906n = com.garmin.android.apps.connectmobile.settings.devices.e.P(j8, aVar, strH, this.B);
    }

    @Override // java.util.Observer
    public final void update(Observable observable, Object obj) {
        i2.k(a2.SETTINGS, "BaseActivityTrackingAndAutoActivityStart", hb.a.j("update(): observable=", observable, ", data=", obj));
        if (obj != null && (observable instanceof ch1.a) && (obj instanceof Boolean)) {
            this.f41894b.k(this.f41911t);
        }
    }
}
