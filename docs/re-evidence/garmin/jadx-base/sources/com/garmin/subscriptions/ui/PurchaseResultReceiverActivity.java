package com.garmin.subscriptions.ui;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import i.c;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes13.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/garmin/subscriptions/ui/PurchaseResultReceiverActivity;", "Li/c;", "<init>", "()V", "subscriptions-purchase_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class PurchaseResultReceiverActivity extends c {
    @Override // androidx.fragment.app.m, b.g, z6.e, android.app.Activity
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        InAppPurchaseTwaActivity.a aVar = InAppPurchaseTwaActivity.f52748r;
        Uri data = getIntent().getData();
        aVar.getClass();
        Intent intent = new Intent(this, (Class<?>) InAppPurchaseTwaActivity.class);
        intent.setData(data);
        intent.addFlags(603979776);
        startActivity(intent);
        finish();
    }
}
