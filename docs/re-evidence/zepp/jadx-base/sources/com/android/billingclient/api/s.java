package com.android.billingclient.api;

import java.util.concurrent.Callable;

/* JADX INFO: loaded from: classes2.dex */
final class s implements Callable<Purchase.PurchasesResult> {
    public final /* synthetic */ String a;
    public final /* synthetic */ a b;

    public s(a aVar, String str) {
        this.b = aVar;
        this.a = str;
    }

    @Override // java.util.concurrent.Callable
    public final /* bridge */ /* synthetic */ Purchase.PurchasesResult call() throws Exception {
        return a.x(this.b, this.a);
    }
}
