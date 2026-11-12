package com.garmin.android.apps.connectmobile.settings.devices;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import android.widget.Toast;
import ch1.k1;
import ch1.v2;
import ch1.x2;
import com.garmin.android.apps.connectmobile.R;
import com.garmin.android.apps.connectmobile.a2;
import com.garmin.android.apps.connectmobile.devices.model.DeviceSettingsDTO;
import com.garmin.android.apps.connectmobile.devices.model.k;
import com.garmin.android.apps.connectmobile.i2;
import hb2.i;
import ig1.h1;
import java.util.Observable;
import java.util.Observer;
import ng1.m0;
import ng1.p0;
import ng1.r0;
import ng1.z;

/* JADX INFO: loaded from: classes10.dex */
public class DeviceSettingsActivityTracking extends com.garmin.android.apps.connectmobile.c implements Observer, p0, r0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public ch1.a f41971a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public x2 f41972b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public h1 f41973c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public com.garmin.android.apps.connectmobile.devices.model.f f41974d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public com.garmin.android.apps.connectmobile.devices.model.f f41975e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public d80.f f41976f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public d80.f f41977g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public d80.f f41978h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public d80.f f41979i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public long f41980j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public k1 f41981k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public v2 f41982l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public DeviceSettingsDTO f41983m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final a f41984n = new a();

    public class a implements m0 {
        public a() {
        }

        @Override // ng1.m0
        public final void b(k kVar) {
            DeviceSettingsDTO deviceSettingsDTO = DeviceSettingsActivityTracking.this.f41983m;
            deviceSettingsDTO.T0 = kVar;
            deviceSettingsDTO.S1("autoActivityDetect");
        }
    }

    public class b implements d80.b {
        public b() {
        }

        @Override // d80.b
        public final void a(lj0.b bVar) {
            a2 a2Var = a2.SETTINGS;
            hb.a.q(bVar.f112957a, new StringBuilder("Error saving running threshold to options to GC ["), "].", a2Var, "DeviceSettingsActivityTracking");
            lj0.b bVar2 = lj0.b.f112951e;
            DeviceSettingsActivityTracking deviceSettingsActivityTracking = DeviceSettingsActivityTracking.this;
            if (bVar != bVar2) {
                Toast.makeText(deviceSettingsActivityTracking, R.string.txt_error_occurred, 0).show();
            }
            deviceSettingsActivityTracking.hideProgressOverlay();
            deviceSettingsActivityTracking.finish();
        }

        @Override // d80.b
        public final void b(Object obj, d80.b.a aVar) {
        }
    }

    public class c implements d80.b {
        public c() {
        }

        @Override // d80.b
        public final void a(lj0.b bVar) {
            a2 a2Var = a2.SETTINGS;
            hb.a.q(bVar.f112957a, new StringBuilder("Error saving running threshold to options to GC ["), "].", a2Var, "DeviceSettingsActivityTracking");
            lj0.b bVar2 = lj0.b.f112951e;
            DeviceSettingsActivityTracking deviceSettingsActivityTracking = DeviceSettingsActivityTracking.this;
            if (bVar != bVar2) {
                Toast.makeText(deviceSettingsActivityTracking, R.string.txt_error_occurred, 0).show();
            }
            deviceSettingsActivityTracking.hideProgressOverlay();
            deviceSettingsActivityTracking.finish();
        }

        @Override // d80.b
        public final void b(Object obj, d80.b.a aVar) {
        }
    }

    public static void ca(Activity activity, DeviceSettingsDTO deviceSettingsDTO, String str, long j8) {
        Intent intent = new Intent(activity, (Class<?>) DeviceSettingsActivityTracking.class);
        intent.putExtra("GCM_deviceSettings", deviceSettingsDTO);
        intent.putExtra("GCM_deviceSettingsTitle", str);
        intent.putExtra("GCM_extra_device_connected_unit_id", j8);
        activity.startActivityForResult(intent, 10);
    }

    @Override // android.app.Activity
    public final void finish() {
        a2 a2Var = a2.SETTINGS;
        i2.k(a2Var, "DeviceSettingsActivityTracking", "finish()");
        ch1.a aVar = this.f41971a;
        if (aVar != null) {
            aVar.n();
            this.f41971a = null;
        }
        x2 x2Var = this.f41972b;
        if (x2Var != null) {
            x2Var.n();
            this.f41972b = null;
        }
        h1 h1Var = this.f41973c;
        if (h1Var != null) {
            h1Var.n();
            this.f41973c = null;
        }
        k1 k1Var = this.f41981k;
        if (k1Var != null) {
            k1Var.n();
            this.f41981k = null;
        }
        i2.k(a2Var, "DeviceSettingsActivityTracking", "setSettingsResult()");
        getIntent().putExtra("GCM_deviceSettings", this.f41983m);
        setResult(-1, getIntent());
        super.finish();
    }

    @Override // com.garmin.android.apps.connectmobile.c, com.garmin.android.apps.connectmobile.z1, com.garmin.android.apps.connectmobile.v, androidx.fragment.app.m, b.g, z6.e, android.app.Activity
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(R.layout.gcm3_device_settings_activity_tracking);
        if (getIntent().getExtras() != null) {
            this.f41983m = (DeviceSettingsDTO) getIntent().getExtras().getParcelable("GCM_deviceSettings");
            String stringExtra = getIntent().getStringExtra("GCM_deviceSettingsTitle");
            this.f41980j = getIntent().getLongExtra("GCM_extra_device_connected_unit_id", -1L);
            if (TextUtils.isEmpty(stringExtra)) {
                stringExtra = getString(R.string.devices_settings_device_settings);
            }
            initActionBar(true, stringExtra);
        }
        if (this.f41983m == null) {
            i2.f(a2.SETTINGS, "DeviceSettingsActivityTracking", "Invalid device settings object while entering device settings time, date, system screen!");
            finish();
        } else if (i.a(this)) {
            showProgressOverlay();
            e eVarN = e.N();
            long j8 = this.f41980j;
            e.a aVar = e.a.RUNNING;
            e.b bVar = e.b.GENERIC;
            z zVar = new z(this);
            eVarN.getClass();
            this.f41976f = e.M(j8, aVar, bVar, zVar);
        }
    }

    @Override // com.garmin.android.apps.connectmobile.c, i.c, androidx.fragment.app.m, android.app.Activity
    public final void onStop() {
        super.onStop();
        d80.f fVar = this.f41976f;
        if (fVar != null) {
            fVar.a();
        }
        d80.f fVar2 = this.f41977g;
        if (fVar2 != null) {
            fVar2.a();
        }
        d80.f fVar3 = this.f41978h;
        if (fVar3 != null) {
            fVar3.a();
        }
        d80.f fVar4 = this.f41979i;
        if (fVar4 != null) {
            fVar4.a();
        }
    }

    @Override // ng1.p0
    public final void r7(com.garmin.android.apps.connectmobile.devices.model.f fVar) {
        String strH = fVar.h();
        e eVarN = e.N();
        long j8 = this.f41980j;
        e.a aVar = e.a.RUNNING;
        b bVar = new b();
        eVarN.getClass();
        this.f41978h = e.P(j8, aVar, strH, bVar);
    }

    @Override // ng1.r0
    public final void u2(com.garmin.android.apps.connectmobile.devices.model.f fVar) {
        String strH = fVar.h();
        e eVarN = e.N();
        long j8 = this.f41980j;
        e.a aVar = e.a.WALKING;
        c cVar = new c();
        eVarN.getClass();
        this.f41979i = e.P(j8, aVar, strH, cVar);
    }

    @Override // java.util.Observer
    public final void update(Observable observable, Object obj) {
        i2.k(a2.SETTINGS, "DeviceSettingsActivityTracking", hb.a.j("update(): observable=", observable, ", data=", obj));
        if (obj != null && (observable instanceof ch1.a) && (obj instanceof Boolean)) {
            boolean zBooleanValue = ((Boolean) obj).booleanValue();
            DeviceSettingsDTO deviceSettingsDTO = this.f41983m;
            k kVar = deviceSettingsDTO.T0;
            if (kVar != null) {
                if (kVar.f34191b != null) {
                    this.f41973c.k(deviceSettingsDTO);
                    return;
                }
                x2 x2Var = this.f41972b;
                if (!zBooleanValue) {
                    x2Var.m(false);
                } else {
                    x2Var.k(deviceSettingsDTO);
                    this.f41972b.m(true);
                }
            }
        }
    }
}
