package com.google.android.gms.ads.identifier;

import com.google.android.gms.common.util.VisibleForTesting;
import java.lang.ref.WeakReference;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes3.dex */
@VisibleForTesting
final class b extends Thread {
    private final WeakReference<AdvertisingIdClient> a;
    private final long b;
    public final CountDownLatch c = new CountDownLatch(1);
    public boolean d = false;

    public b(AdvertisingIdClient advertisingIdClient, long j) {
        this.a = new WeakReference<>(advertisingIdClient);
        this.b = j;
        start();
    }

    private final void a() {
        AdvertisingIdClient advertisingIdClient = this.a.get();
        if (advertisingIdClient != null) {
            advertisingIdClient.zza();
            this.d = true;
        }
    }

    @Override // java.lang.Thread, java.lang.Runnable
    public final void run() {
        try {
            if (this.c.await(this.b, TimeUnit.MILLISECONDS)) {
                return;
            }
            a();
        } catch (InterruptedException unused) {
            a();
        }
    }
}
