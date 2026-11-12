package com.android.billingclient.api;

import androidx.annotation.Nullable;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
final class g {
    private final List<PurchaseHistoryRecord> a;
    private final BillingResult b;

    public g(BillingResult billingResult, @Nullable List<PurchaseHistoryRecord> list) {
        this.a = list;
        this.b = billingResult;
    }

    public final BillingResult a() {
        return this.b;
    }

    public final List<PurchaseHistoryRecord> b() {
        return this.a;
    }
}
