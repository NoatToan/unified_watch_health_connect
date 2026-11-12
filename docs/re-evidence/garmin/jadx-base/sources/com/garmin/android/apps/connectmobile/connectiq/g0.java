package com.garmin.android.apps.connectmobile.connectiq;

import com.garmin.android.apps.connectmobile.i2;
import java.util.UUID;

/* JADX INFO: loaded from: classes7.dex */
public final /* synthetic */ class g0 implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f31874a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ b0.h f31875b;

    public /* synthetic */ g0(b0.h hVar, UUID uuid, int i14) {
        this.f31874a = i14;
        this.f31875b = hVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f31874a) {
            case 0:
                ConnectIQAppDetailsActivity.c.a aVar = (ConnectIQAppDetailsActivity.c.a) this.f31875b;
                StringBuilder sb3 = new StringBuilder("Launch Music App Successfully for ");
                ConnectIQAppDetailsActivity.c cVar = ConnectIQAppDetailsActivity.c.this;
                sb3.append(ConnectIQAppDetailsActivity.this.f31709e.getName());
                i2.d("ConnectIQAppDetailsActivity", sb3.toString());
                ConnectIQAppDetailsActivity connectIQAppDetailsActivity = ConnectIQAppDetailsActivity.this;
                connectIQAppDetailsActivity.hideProgressOverlay();
                connectIQAppDetailsActivity.ea(false, true);
                break;
            default:
                ((ConnectIQAppDetailsActivity.c.a) this.f31875b).a("Protobuf Request Failed");
                break;
        }
    }
}
