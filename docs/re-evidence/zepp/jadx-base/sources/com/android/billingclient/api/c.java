package com.android.billingclient.api;

import java.util.concurrent.Callable;

/* JADX INFO: loaded from: classes2.dex */
final class c implements Callable<Void> {
    public final /* synthetic */ String a;
    public final /* synthetic */ PurchasesResponseListener b;
    public final /* synthetic */ a c;

    public c(a aVar, String str, PurchasesResponseListener purchasesResponseListener) {
        this.c = aVar;
        this.a = str;
        this.b = purchasesResponseListener;
    }

    @Override // java.util.concurrent.Callable
    public final /* bridge */ /* synthetic */ Void call() throws Exception {
        Purchase.PurchasesResult purchasesResultX = a.x(this.c, this.a);
        if (purchasesResultX.getPurchasesList() != null) {
            this.b.onQueryPurchasesResponse(purchasesResultX.getBillingResult(), purchasesResultX.getPurchasesList());
            return null;
        }
        this.b.onQueryPurchasesResponse(purchasesResultX.getBillingResult(), com.google.android.gms.internal.play_billing.zzp.zzg());
        return null;
    }
}
