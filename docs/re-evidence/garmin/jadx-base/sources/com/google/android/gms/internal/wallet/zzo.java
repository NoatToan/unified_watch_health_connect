package com.google.android.gms.internal.wallet;

import android.os.Bundle;
import android.os.IInterface;
import com.google.android.gms.wallet.CreateWalletObjectsRequest;
import com.google.android.gms.wallet.IsReadyToPayRequest;
import com.google.android.gms.wallet.PaymentDataRequest;

/* JADX INFO: loaded from: classes14.dex */
public interface zzo extends IInterface {
    void zza(CreateWalletObjectsRequest createWalletObjectsRequest, Bundle bundle, zzq zzqVar);

    void zza(IsReadyToPayRequest isReadyToPayRequest, Bundle bundle, zzq zzqVar);

    void zza(PaymentDataRequest paymentDataRequest, Bundle bundle, zzq zzqVar);
}
