package com.garmin.android.apps.connectmobile.devices;

import android.app.Activity;
import android.app.NotificationManager;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.Bundle;
import android.view.View;
import android.view.ViewStub;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;
import androidx.core.view.g1;
import androidx.core.view.s0;
import androidx.lifecycle.m;
import androidx.lifecycle.v1;
import androidx.lifecycle.x1;
import com.garmin.android.apps.connectmobile.R;
import com.garmin.android.apps.connectmobile.a2;
import com.garmin.android.apps.connectmobile.i2;
import com.garmin.android.apps.connectmobile.r0;
import com.garmin.android.gfdi.configuration.SupportedCapability;
import com.google.firebase.analytics.FirebaseAnalytics;
import f12.l;
import hk0.p;
import java.util.WeakHashMap;
import pi2.h;
import pi2.i;
import pi2.j;
import pi2.k;
import sd2.f;
import wd2.h0;
import xp0.d;
import yc.l2;
import yr.o0;
import zb0.g;
import zb0.u0;
import zb0.y0;

/* JADX INFO: loaded from: classes8.dex */
public class DeviceDetailsActivity extends r0 implements y0 {

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public static final /* synthetic */ int f33804q = 0;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public ImageView f33805e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public Animation f33806f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public long f33807g = -1;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public f f33808h = null;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public boolean f33809i = false;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public g f33810j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final ej1.a f33811k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final a f33812l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final b f33813m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final c f33814n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public u0 f33815o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final h0 f33816p;

    public class a extends wf0.a {
        public a() {
        }

        @Override // wf0.a
        public final void deviceSyncFinished(i iVar) {
            i2.a(a2.DEVICES, "DeviceDetailsActivity", "Received SyncFinishedEvent: " + iVar.getEventTimestampMillis());
            DeviceDetailsActivity deviceDetailsActivity = DeviceDetailsActivity.this;
            deviceDetailsActivity.pa(deviceDetailsActivity.f33808h);
        }

        @Override // wf0.a
        public final void deviceSyncStarted(j jVar) {
            i2.a(a2.DEVICES, "DeviceDetailsActivity", "Received SyncStartedEvent: " + jVar.getEventTimestampMillis());
        }

        @Override // wf0.a
        public final void deviceSyncTransferProgressUpdated(k kVar) {
            i2.a(a2.DEVICES, "DeviceDetailsActivity", "Received SyncTransferProgressEvent: " + kVar.getEventTimestampMillis());
            DeviceDetailsActivity deviceDetailsActivity = DeviceDetailsActivity.this;
            deviceDetailsActivity.pa(deviceDetailsActivity.f33808h);
        }
    }

    public class b extends xf0.b {
        public b() {
        }

        @Override // xf0.b
        public final void deviceConnected(pi2.g gVar) {
            DeviceDetailsActivity deviceDetailsActivity = DeviceDetailsActivity.this;
            deviceDetailsActivity.pa(deviceDetailsActivity.f33808h);
        }

        @Override // xf0.b
        public final void deviceDisconnected(h hVar) {
            DeviceDetailsActivity deviceDetailsActivity = DeviceDetailsActivity.this;
            deviceDetailsActivity.pa(deviceDetailsActivity.f33808h);
        }
    }

    public class c extends BroadcastReceiver {
        public c() {
        }

        @Override // android.content.BroadcastReceiver
        public final void onReceive(Context context, Intent intent) {
            int intExtra = intent.getIntExtra("android.bluetooth.adapter.extra.STATE", -1);
            if (12 == intExtra || 10 == intExtra) {
                DeviceDetailsActivity deviceDetailsActivity = DeviceDetailsActivity.this;
                deviceDetailsActivity.pa(deviceDetailsActivity.f33808h);
            }
        }
    }

    public DeviceDetailsActivity() {
        l.f68084a.getClass();
        this.f33811k = new ej1.a(l.a.a());
        this.f33812l = new a();
        this.f33813m = new b();
        this.f33814n = new c();
        this.f33815o = null;
        this.f33816p = new h0(this, 16);
    }

    public static Intent ma(Context context, long j8) {
        return l2.d(context, DeviceDetailsActivity.class, "GCM_deviceUnitID", j8);
    }

    public static void na(Activity activity, long j8) {
        activity.startActivityForResult(ma(activity, j8), 0);
    }

    @Override // com.garmin.android.apps.connectmobile.z1
    public final void applyTopInsets(View view2) {
        View viewFindViewById = findViewById(R.id.toolbar_container);
        if (viewFindViewById == null) {
            super.applyTopInsets(view2);
            return;
        }
        l2 l2Var = new l2(22);
        WeakHashMap<View, g1> weakHashMap = s0.f6563a;
        s0.d.c(viewFindViewById, l2Var);
        viewFindViewById.requestApplyInsets();
    }

    @Override // com.garmin.android.apps.connectmobile.r0
    public String fa() {
        return null;
    }

    @Override // com.garmin.android.apps.connectmobile.z1
    public final int inflateToolbar() {
        f fVar = this.f33808h;
        if (fVar != null) {
            com.garmin.android.apps.connectmobile.devices.a.C0573a c0573a = com.garmin.android.apps.connectmobile.devices.a.f33827a;
            String productNumber = fVar.getProductNumber();
            c0573a.getClass();
            if (com.garmin.android.apps.connectmobile.devices.a.C0573a.a(productNumber) == com.garmin.android.apps.connectmobile.devices.a.AGGREGATED) {
                ViewStub viewStub = (ViewStub) findViewById(R.id.toolbar_actionbar_stub);
                viewStub.setLayoutResource(R.layout.toolbar_gcm_device_card);
                viewStub.inflate();
                ImageView imageView = (ImageView) findViewById(R.id.toolbar_sync_image);
                this.f33805e = imageView;
                imageView.setOnClickListener(new d(this, 20));
                return R.id.toolbar_actionbar_my_device;
            }
        }
        return super.inflateToolbar();
    }

    public void oa() {
        showProgressOverlay();
        g gVar = this.f33810j;
        long j8 = this.f33807g;
        gVar.getClass();
        t13.g gVar2 = v1.a(gVar).f183565a;
        x53.c cVar = o53.s0.f129406a;
        m.a(gVar2.plus(x53.b.f189152a), new zb0.i(gVar, j8, null), 2).f(this, this.f33816p);
        Bundle bundle = new Bundle();
        bundle.putString("Screen", "DeviceDetails");
        bundle.putString("Referrer", getCallingActivity() != null ? getCallingActivity().getShortClassName() : "Not Available");
        ht.a.f85464a.getClass();
        ht.a.a(bundle, "PageView");
    }

    @Override // com.garmin.android.apps.connectmobile.r0, com.garmin.android.apps.connectmobile.z1, b.g, android.app.Activity
    public void onBackPressed() {
        finish();
    }

    @Override // com.garmin.android.apps.connectmobile.r0, com.garmin.android.apps.connectmobile.c, com.garmin.android.apps.connectmobile.z1, com.garmin.android.apps.connectmobile.v, androidx.fragment.app.m, b.g, z6.e, android.app.Activity
    public void onCreate(Bundle bundle) {
        Intent intentD;
        Intent intent = getIntent();
        if (intent != null) {
            if (intent.getBooleanExtra("LAUNCH_MAPS", false) && (intentD = ar.a.d(this, getIntent().getLongExtra("GCM_deviceUnitID", -1L))) != null) {
                startActivity(intentD);
            }
            if (intent.getIntExtra("BIKE_ALARM_NOTIFICATION_ID", 0) != 0) {
                ((NotificationManager) getSystemService("notification")).cancel(getIntent().getIntExtra("BIKE_ALARM_NOTIFICATION_ID", 0));
            }
        }
        super.onCreate(bundle);
        setContentView();
        Animation animationLoadAnimation = AnimationUtils.loadAnimation(this, R.anim.rotation);
        this.f33806f = animationLoadAnimation;
        animationLoadAnimation.setRepeatCount(-1);
        this.f33807g = getIntent().getLongExtra("GCM_deviceUnitID", -1L);
        this.f33809i = getIntent().getBooleanExtra("GCM_device_settings_with_bottom_navigation", false);
        this.f33810j = (g) new x1(this).b(p005kotlin.jvm.internal.s0.f105811a.b(g.class));
        oa();
    }

    @Override // b.g, android.app.Activity
    public final void onNewIntent(Intent intent) {
        i2.a(a2.DEVICES, "DeviceDetailsActivity", "onNewIntent");
        super.onNewIntent(intent);
        if (!intent.hasExtra("GCM_deviceUnitID")) {
            intent.putExtra("GCM_deviceUnitID", this.f33807g);
        }
        setIntent(intent);
    }

    @Override // com.garmin.android.apps.connectmobile.c, androidx.fragment.app.m, android.app.Activity
    public final void onPause() {
        super.onPause();
        unregisterReceiver(this.f33814n);
        oi2.a.b(this.f33812l);
        oi2.a.b(this.f33813m);
    }

    @Override // com.garmin.android.apps.connectmobile.c, com.garmin.android.apps.connectmobile.z1, com.garmin.android.apps.connectmobile.v, androidx.fragment.app.m, android.app.Activity
    public final void onResume() {
        super.onResume();
        FirebaseAnalytics.getInstance(this).setCurrentScreen(this, "DeviceDetails", null);
        IntentFilter intentFilter = new IntentFilter();
        intentFilter.addAction("android.bluetooth.adapter.action.STATE_CHANGED");
        registerReceiver(this.f33814n, intentFilter);
        oi2.a.a(this.f33812l);
        oi2.a.a(this.f33813m);
    }

    public final void pa(f fVar) {
        if (this.f33805e == null || fVar == null) {
            return;
        }
        long unitID = fVar.getUnitID();
        SupportedCapability supportedCapability = SupportedCapability.HOST_INITIATED_SYNC_REQUESTS;
        if (!km2.a.e(new int[]{supportedCapability.ordinal(), supportedCapability.ordinal()}, unitID) || !p.m(fVar)) {
            this.f33805e.setVisibility(8);
            return;
        }
        this.f33805e.setVisibility(0);
        this.f33805e.clearAnimation();
        if (p.j(unitID)) {
            this.f33805e.startAnimation(this.f33806f);
        }
    }

    @Override // zb0.y0
    public final f r2() {
        return this.f33808h;
    }

    @Override // com.garmin.android.apps.connectmobile.r0, com.garmin.android.apps.connectmobile.z1
    public final boolean shouldConsumeInsets() {
        return false;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // z6.e, zb0.y0
    public final void t9() {
        f fVar = this.f33808h;
        if (fVar == null) {
            return;
        }
        gj1.c cVar = this.f33810j.f203486f;
        if (cVar != null) {
            gj1.b bVar = cVar.f77653b;
            int i14 = cVar.f77654c;
            ej1.b bVar2 = cVar.f77652a;
            if (bVar2 != ej1.b.NONE && i14 != 0) {
                String displayName = (bVar == null || bVar.getDisplayName() == null) ? "" : bVar.getDisplayName();
                hj1.b.f83993a.getClass();
                o13.p pVarC = hj1.b.a.c(this, bVar2, displayName);
                String displayName2 = (this.f33808h.getDisplayName() == null || !this.f33808h.getDisplayName().isEmpty()) ? this.f33808h.getDisplayName() : this.f33808h.getProductNumber();
                hj1.a.a(this, (String) pVarC.f128594a, (String) pVarC.f128595b, i14 > 1, new lj1.c(displayName2, this.f33808h.d0(), this.f33808h.Q()), new yt.f(12, this, displayName2));
                return;
            }
        }
        zb0.k.e(this, fVar, new o0(this, 15));
    }
}
