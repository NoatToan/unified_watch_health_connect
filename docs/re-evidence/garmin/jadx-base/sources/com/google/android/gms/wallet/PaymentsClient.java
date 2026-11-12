package com.google.android.gms.wallet;

import android.app.Activity;
import android.content.Context;
import com.google.android.gms.common.api.GoogleApi;
import com.google.android.gms.tasks.Task;

/* JADX INFO: loaded from: classes14.dex */
public class PaymentsClient extends GoogleApi<Wallet.WalletOptions> {
    public PaymentsClient(Activity activity, Wallet.WalletOptions walletOptions) {
        super(activity, Wallet.API, walletOptions, GoogleApi.Settings.DEFAULT_SETTINGS);
    }

    public Task<Boolean> isReadyToPay(IsReadyToPayRequest isReadyToPayRequest) {
        return doRead(new zzab(this, isReadyToPayRequest));
    }

    public Task<PaymentData> loadPaymentData(PaymentDataRequest paymentDataRequest) {
        return doWrite(new zzad(this, paymentDataRequest));
    }

    public PaymentsClient(Context context, Wallet.WalletOptions walletOptions) {
        super(context, Wallet.API, walletOptions, GoogleApi.Settings.DEFAULT_SETTINGS);
    }
}
