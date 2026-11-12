package com.garmin.android.apps.connectmobile.connectiq;

import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import com.garmin.android.apps.connectmobile.R;
import com.garmin.android.apps.connectmobile.i2;

/* JADX INFO: loaded from: classes7.dex */
public abstract class z extends com.garmin.android.apps.connectmobile.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public boolean f32111a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public long f32112b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final n f32113c = new n();

    public final boolean ca() {
        boolean zK = hk0.p.k(this.f32112b);
        if (!zK) {
            androidx.appcompat.app.e.a aVar = new androidx.appcompat.app.e.a(this);
            aVar.setTitle(R.string.connect_iq_device_not_connected_title);
            aVar.setMessage(R.string.connect_iq_device_not_connected_msg);
            aVar.setPositiveButton(R.string.lbl_ok, (DialogInterface.OnClickListener) null);
            aVar.create().show();
        }
        return zK;
    }

    @Override // com.garmin.android.apps.connectmobile.z1, androidx.fragment.app.m, b.g, android.app.Activity
    public final void onActivityResult(int i14, int i15, Intent intent) {
        super.onActivityResult(i14, i15, intent);
        if (i15 == 999) {
            finish();
        }
    }

    @Override // com.garmin.android.apps.connectmobile.c, com.garmin.android.apps.connectmobile.z1, com.garmin.android.apps.connectmobile.v, androidx.fragment.app.m, b.g, z6.e, android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        Intent intent = getIntent();
        this.f32112b = intent.getLongExtra("CONNECT_IQ_DEVICE_UNIT_ID", -1L);
        intent.getStringExtra("CONNECT_IQ_DEVICE_SKU");
        if (this.f32112b == -1) {
            this.f32112b = intent.getLongExtra("GCM_deviceUnitID", -1L);
        }
        if (this.f32112b == -1) {
            i2.i("ConnectIQManagementActivity", "Missing required device unit id parameter");
            finish();
        }
    }

    @Override // com.garmin.android.apps.connectmobile.c, androidx.fragment.app.m, android.app.Activity
    public final void onPause() {
        super.onPause();
        if (this.f32111a) {
            n nVar = this.f32113c;
            nVar.getClass();
            da2.d.b().f58886a.i(nVar);
            this.f32111a = false;
        }
    }

    @Override // com.garmin.android.apps.connectmobile.c, com.garmin.android.apps.connectmobile.z1, com.garmin.android.apps.connectmobile.v, androidx.fragment.app.m, android.app.Activity
    public final void onResume() {
        super.onResume();
        if (this.f32111a) {
            return;
        }
        this.f32113c.a(this, this.f32112b);
        this.f32111a = true;
    }
}
