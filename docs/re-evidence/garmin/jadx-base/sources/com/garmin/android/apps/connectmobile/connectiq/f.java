package com.garmin.android.apps.connectmobile.connectiq;

import com.garmin.android.apps.connectmobile.i2;

/* JADX INFO: loaded from: classes7.dex */
public final /* synthetic */ class f implements androidx.lifecycle.z0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f31868a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ ConnectIQAppDetailsActivity f31869b;

    public /* synthetic */ f(ConnectIQAppDetailsActivity connectIQAppDetailsActivity, int i14) {
        this.f31868a = i14;
        this.f31869b = connectIQAppDetailsActivity;
    }

    @Override // androidx.lifecycle.z0
    public final void onChanged(Object obj) {
        int i14 = this.f31868a;
        ConnectIQAppDetailsActivity connectIQAppDetailsActivity = this.f31869b;
        switch (i14) {
            case 0:
                y10.l0 l0Var = (y10.l0) obj;
                int i15 = ConnectIQAppDetailsActivity.C;
                if (l0Var != null) {
                    int i16 = ConnectIQAppDetailsActivity.h.f31739b[l0Var.f193939a.ordinal()];
                    if (i16 == 1) {
                        if (!connectIQAppDetailsActivity.isFinishing()) {
                            connectIQAppDetailsActivity.hideProgressOverlay();
                            connectIQAppDetailsActivity.f31718n.setImportantForAccessibility(1);
                        }
                        connectIQAppDetailsActivity.f31707c.setResult(-1);
                        connectIQAppDetailsActivity.f31707c.finish();
                        break;
                    } else if (i16 == 2) {
                        if (!connectIQAppDetailsActivity.isFinishing()) {
                            connectIQAppDetailsActivity.hideProgressOverlay();
                            connectIQAppDetailsActivity.f31718n.setImportantForAccessibility(1);
                        }
                        connectIQAppDetailsActivity.f31705a.sendMessage(connectIQAppDetailsActivity.f31705a.obtainMessage(1));
                        break;
                    }
                }
                break;
            default:
                gn2.c.d dVar = (gn2.c.d) obj;
                int i17 = ConnectIQAppDetailsActivity.C;
                connectIQAppDetailsActivity.hideProgressOverlay();
                if (dVar == null) {
                    i2.d("ConnectIQAppDetailsActivity", "onStoreAccessPointCallback:onResponseFailed");
                    connectIQAppDetailsActivity.ea(true, true);
                } else {
                    i2.d("ConnectIQAppDetailsActivity", "onStoreAccessPointCallback:onResponseReceived");
                    connectIQAppDetailsActivity.ea(dVar.f78108c.isEmpty(), true);
                }
                break;
        }
    }
}
