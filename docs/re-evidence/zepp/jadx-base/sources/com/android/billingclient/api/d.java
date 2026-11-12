package com.android.billingclient.api;

import java.util.concurrent.Callable;

/* JADX INFO: loaded from: classes2.dex */
final class d implements Callable<Void> {
    public final /* synthetic */ String a;
    public final /* synthetic */ PurchaseHistoryResponseListener b;
    public final /* synthetic */ a c;

    public d(a aVar, String str, PurchaseHistoryResponseListener purchaseHistoryResponseListener) {
        this.c = aVar;
        this.a = str;
        this.b = purchaseHistoryResponseListener;
    }

    @Override // java.util.concurrent.Callable
    public final /* bridge */ /* synthetic */ Void call() throws Exception {
        g gVarV = a.v(this.c, this.a);
        this.b.onPurchaseHistoryResponse(gVarV.a(), gVarV.b());
        return null;
    }
}
