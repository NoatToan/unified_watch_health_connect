package com.android.billingclient.api;

import android.content.ComponentName;
import android.content.ServiceConnection;
import android.os.IBinder;
import com.google.android.gms.internal.play_billing.zza;
import java.util.concurrent.Callable;

/* JADX INFO: loaded from: classes2.dex */
final class f implements ServiceConnection {
    private final Object a = new Object();
    private boolean b = false;
    private BillingClientStateListener c;
    public final /* synthetic */ a d;

    public /* synthetic */ f(a aVar, BillingClientStateListener billingClientStateListener, zzy zzyVar) {
        this.d = aVar;
        this.c = billingClientStateListener;
    }

    private final void d(BillingResult billingResult) {
        synchronized (this.a) {
            BillingClientStateListener billingClientStateListener = this.c;
            if (billingClientStateListener != null) {
                billingClientStateListener.onBillingSetupFinished(billingResult);
            }
        }
    }

    public final /* synthetic */ Object a() throws Exception {
        int iZzb;
        synchronized (this.a) {
            if (this.b) {
                return null;
            }
            int i = 3;
            try {
                String packageName = this.d.f.getPackageName();
                int i2 = 16;
                iZzb = 3;
                while (true) {
                    if (i2 < 3) {
                        i2 = 0;
                        break;
                    }
                    try {
                        iZzb = this.d.g.zzb(i2, packageName, BillingClient.SkuType.SUBS);
                        if (iZzb == 0) {
                            break;
                        }
                        i2--;
                    } catch (Exception unused) {
                        i = iZzb;
                        zza.zzk("BillingClient", "Exception while checking if billing is supported; try to reconnect");
                        this.d.a = 0;
                        this.d.g = null;
                        iZzb = i;
                    }
                }
                boolean z = true;
                this.d.j = i2 >= 5;
                this.d.i = i2 >= 3;
                if (i2 < 3) {
                    zza.zzj("BillingClient", "In-app billing API does not support subscription on this device.");
                }
                for (int i3 = 16; i3 >= 3; i3--) {
                    iZzb = this.d.g.zzb(i3, packageName, BillingClient.SkuType.INAPP);
                    if (iZzb == 0) {
                        this.d.k = i3;
                        break;
                    }
                }
                a aVar = this.d;
                aVar.s = aVar.k >= 16;
                a aVar2 = this.d;
                aVar2.r = aVar2.k >= 15;
                a aVar3 = this.d;
                aVar3.q = aVar3.k >= 14;
                a aVar4 = this.d;
                aVar4.p = aVar4.k >= 12;
                a aVar5 = this.d;
                aVar5.o = aVar5.k >= 10;
                a aVar6 = this.d;
                aVar6.n = aVar6.k >= 9;
                a aVar7 = this.d;
                aVar7.m = aVar7.k >= 8;
                a aVar8 = this.d;
                if (aVar8.k < 6) {
                    z = false;
                }
                aVar8.l = z;
                if (this.d.k < 3) {
                    zza.zzk("BillingClient", "In-app billing API version 3 is not supported on this device.");
                }
                if (iZzb == 0) {
                    this.d.a = 2;
                } else {
                    this.d.a = 0;
                    this.d.g = null;
                }
            } catch (Exception unused2) {
            }
            if (iZzb == 0) {
                d(j.p);
            } else {
                d(j.a);
            }
            return null;
        }
    }

    public final /* synthetic */ void b() {
        this.d.a = 0;
        this.d.g = null;
        d(j.r);
    }

    public final void c() {
        synchronized (this.a) {
            this.c = null;
            this.b = true;
        }
    }

    @Override // android.content.ServiceConnection
    public final void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        zza.zzj("BillingClient", "Billing service connected.");
        this.d.g = com.google.android.gms.internal.play_billing.zzc.zzn(iBinder);
        if (this.d.l(new Callable() { // from class: com.android.billingclient.api.zzae
            @Override // java.util.concurrent.Callable
            public final Object call() throws Exception {
                this.zza.a();
                return null;
            }
        }, 30000L, new Runnable() { // from class: com.android.billingclient.api.zzad
            @Override // java.lang.Runnable
            public final void run() {
                this.zza.b();
            }
        }, this.d.h()) == null) {
            d(this.d.j());
        }
    }

    @Override // android.content.ServiceConnection
    public final void onServiceDisconnected(ComponentName componentName) {
        zza.zzk("BillingClient", "Billing service disconnected.");
        this.d.g = null;
        this.d.a = 0;
        synchronized (this.a) {
            BillingClientStateListener billingClientStateListener = this.c;
            if (billingClientStateListener != null) {
                billingClientStateListener.onBillingServiceDisconnected();
            }
        }
    }
}
