package com.google.android.gms.wallet;

import com.google.android.gms.common.api.Api;
import com.google.android.gms.common.api.internal.TaskApiCall;
import com.google.android.gms.tasks.TaskCompletionSource;

/* JADX INFO: loaded from: classes14.dex */
final class zzad extends TaskApiCall<com.google.android.gms.internal.wallet.zzv, PaymentData> {
    private final /* synthetic */ PaymentDataRequest zzdu;

    public zzad(PaymentsClient paymentsClient, PaymentDataRequest paymentDataRequest) {
        this.zzdu = paymentDataRequest;
    }

    @Override // com.google.android.gms.common.api.internal.TaskApiCall
    public final /* synthetic */ void doExecute(Api.AnyClient anyClient, TaskCompletionSource<PaymentData> taskCompletionSource) {
        ((com.google.android.gms.internal.wallet.zzv) anyClient).zza(this.zzdu, taskCompletionSource);
    }
}
