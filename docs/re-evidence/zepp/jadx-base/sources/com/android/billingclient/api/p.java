package com.android.billingclient.api;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import com.google.android.gms.internal.play_billing.zza;

/* JADX INFO: loaded from: classes2.dex */
final class p extends BroadcastReceiver {
    private final PurchasesUpdatedListener a;
    private boolean b;
    public final /* synthetic */ q c;

    public /* synthetic */ p(q qVar, PurchasesUpdatedListener purchasesUpdatedListener, o oVar) {
        this.c = qVar;
        this.a = purchasesUpdatedListener;
    }

    public final void b(Context context, IntentFilter intentFilter) {
        if (this.b) {
            return;
        }
        context.registerReceiver(this.c.b, intentFilter);
        this.b = true;
    }

    public final void c(Context context) {
        if (!this.b) {
            zza.zzk("BillingBroadcastManager", "Receiver is not registered.");
        } else {
            context.unregisterReceiver(this.c.b);
            this.b = false;
        }
    }

    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        this.a.onPurchasesUpdated(zza.zzg(intent, "BillingBroadcastManager"), zza.zzi(intent.getExtras()));
    }
}
