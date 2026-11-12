package com.garmin.android.apps.connectmobile.devices.dashboard.version2;

import android.os.Bundle;
import android.view.View;
import com.garmin.android.apps.connectmobile.R;
import com.garmin.android.apps.connectmobile.c;
import go1.g0;
import hc0.n;
import sd2.f;
import zb0.n0;
import zb0.y0;

/* JADX INFO: loaded from: classes8.dex */
public class RegisteredUnPairedDeviceActivity extends c implements y0 {

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final /* synthetic */ int f33842j = 0;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public long f33846d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public String f33847e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public String f33848f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public String f33849g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public boolean f33850h;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public n f33843a = null;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public f f33844b = null;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public zb0.c f33845c = null;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public boolean f33851i = false;

    public static /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f33852a;

        static {
            int[] iArr = new int[zb0.c.values().length];
            f33852a = iArr;
            try {
                iArr[zb0.c.COMPATIBLE_WITH_CURRENT_GCM_VERSION.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f33852a[zb0.c.COMPATIBLE_WITH_UPGRADED_GCM_VERSION.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f33852a[zb0.c.NOT_COMPATIBLE.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    @Override // com.garmin.android.apps.connectmobile.c, com.garmin.android.apps.connectmobile.z1, com.garmin.android.apps.connectmobile.v, androidx.fragment.app.m, b.g, z6.e, android.app.Activity
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(R.layout.gcm_device_registered_gc_details);
        if (getIntent().hasExtra("GCM_deviceUnitID")) {
            this.f33846d = getIntent().getLongExtra("GCM_deviceUnitID", -1L);
        }
        if (getIntent().hasExtra("GCM_deviceName")) {
            this.f33847e = getIntent().getStringExtra("GCM_deviceName");
        }
        if (getIntent().hasExtra("GCM_deviceDisplayName")) {
            this.f33848f = getIntent().getStringExtra("GCM_deviceDisplayName");
        }
        if (getIntent().hasExtra("GCM_extra_device_image_url")) {
            this.f33849g = getIntent().getStringExtra("GCM_extra_device_image_url");
        }
        if (getIntent().hasExtra("GCM_extra_device_incompatible_app")) {
            this.f33850h = getIntent().getBooleanExtra("GCM_extra_device_incompatible_app", false);
        }
        findViewById(R.id.custom_bttn_device_support).setOnClickListener(new g0(this, 5));
    }

    public void onDeviceSupportCenterClicked(View view2) {
        g22.a.c(this, n0.e(this.f33846d));
    }

    @Override // com.garmin.android.apps.connectmobile.c, i.c, androidx.fragment.app.m, android.app.Activity
    public final void onStart() {
        super.onStart();
        n nVar = this.f33843a;
        if (nVar != null) {
            nVar.a();
        }
        n nVar2 = new n(this);
        this.f33843a = nVar2;
        nVar2.c(new Void[0]);
    }

    @Override // com.garmin.android.apps.connectmobile.c, i.c, androidx.fragment.app.m, android.app.Activity
    public final void onStop() {
        super.onStop();
        n nVar = this.f33843a;
        if (nVar != null) {
            nVar.a();
        }
    }

    @Override // zb0.y0
    public final f r2() {
        return this.f33844b;
    }
}
