package com.android.billingclient.api;

import android.os.Bundle;
import android.os.Handler;
import android.os.ResultReceiver;
import com.google.android.gms.internal.play_billing.zza;

/* JADX INFO: loaded from: classes2.dex */
final class zzy extends ResultReceiver {
    public final /* synthetic */ PriceChangeConfirmationListener a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzy(a aVar, Handler handler, PriceChangeConfirmationListener priceChangeConfirmationListener) {
        super(handler);
        this.a = priceChangeConfirmationListener;
    }

    @Override // android.os.ResultReceiver
    public final void onReceiveResult(int i, Bundle bundle) {
        BillingResult.Builder builderNewBuilder = BillingResult.newBuilder();
        builderNewBuilder.setResponseCode(i);
        builderNewBuilder.setDebugMessage(zza.zzh(bundle, "BillingClient"));
        this.a.onPriceChangeConfirmationResult(builderNewBuilder.build());
    }
}
