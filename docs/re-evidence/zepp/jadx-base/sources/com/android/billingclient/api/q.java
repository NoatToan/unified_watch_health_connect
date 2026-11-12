package com.android.billingclient.api;

import android.content.Context;
import android.content.IntentFilter;

/* JADX INFO: loaded from: classes2.dex */
final class q {
    private final Context a;
    private final p b;

    public q(Context context, PurchasesUpdatedListener purchasesUpdatedListener) {
        this.a = context;
        this.b = new p(this, purchasesUpdatedListener, null);
    }

    public final PurchasesUpdatedListener b() {
        return this.b.a;
    }

    public final void c() {
        this.b.c(this.a);
    }

    public final void d() {
        this.b.b(this.a, new IntentFilter("com.android.vending.billing.PURCHASES_UPDATED"));
    }
}
