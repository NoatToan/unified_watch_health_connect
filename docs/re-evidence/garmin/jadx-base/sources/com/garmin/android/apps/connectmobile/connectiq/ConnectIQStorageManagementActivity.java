package com.garmin.android.apps.connectmobile.connectiq;

import android.os.Bundle;
import androidx.lifecycle.x1;
import com.garmin.android.apps.connectmobile.R;

/* JADX INFO: loaded from: classes7.dex */
public class ConnectIQStorageManagementActivity extends com.garmin.android.apps.connectmobile.c {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final /* synthetic */ int f31803d = 0;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public boolean f31804a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public long f31805b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final n f31806c = new n();

    public static /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f31807a;

        static {
            int[] iArr = new int[y10.g0.values().length];
            f31807a = iArr;
            try {
                iArr[y10.g0.LOADING.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f31807a[y10.g0.LOADING_DONE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
        }
    }

    @Override // com.garmin.android.apps.connectmobile.c, com.garmin.android.apps.connectmobile.z1, com.garmin.android.apps.connectmobile.v, androidx.fragment.app.m, b.g, z6.e, android.app.Activity
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        y10.k0 k0Var = (y10.k0) new x1(this).b(p005kotlin.jvm.internal.s0.f105811a.b(y10.k0.class));
        if (k0Var.f193933a == null) {
            k0Var.f193933a = new androidx.lifecycle.y0<>();
        }
        androidx.lifecycle.y0<y10.m0> y0Var = k0Var.f193933a;
        if (y0Var == null) {
            p005kotlin.jvm.internal.s.m("connectIQLiveData");
            throw null;
        }
        y0Var.f(this, new a4.b(this, 12));
        this.f31805b = getIntent().getLongExtra("CONNECT_IQ_DEVICE_UNIT_ID", -1L);
        setContentView(R.layout.gcm_device_connect_iq_manage_storage_view);
        super.initActionBar(true, R.string.connect_iq_category_storage_mgt);
        Bundle bundle2 = new Bundle(1);
        bundle2.putLong("CONNECT_IQ_DEVICE_UNIT_ID", this.f31805b);
        n0 n0Var = new n0();
        n0Var.setArguments(bundle2);
        androidx.fragment.app.v supportFragmentManager = getSupportFragmentManager();
        androidx.fragment.app.a aVarB = androidx.core.view.j.b(supportFragmentManager, supportFragmentManager);
        aVarB.j(R.id.manage_storage_content, n0Var, "TAG_INSTALLED_APPS_FRAGMENT", 1);
        aVarB.e();
    }

    @Override // com.garmin.android.apps.connectmobile.c, androidx.fragment.app.m, android.app.Activity
    public final void onPause() {
        super.onPause();
        if (this.f31804a) {
            n nVar = this.f31806c;
            nVar.getClass();
            da2.d.b().f58886a.i(nVar);
            this.f31804a = false;
        }
    }

    @Override // com.garmin.android.apps.connectmobile.c, com.garmin.android.apps.connectmobile.z1, com.garmin.android.apps.connectmobile.v, androidx.fragment.app.m, android.app.Activity
    public final void onResume() {
        super.onResume();
        if (this.f31804a) {
            return;
        }
        this.f31806c.a(this, this.f31805b);
        this.f31804a = true;
    }
}
