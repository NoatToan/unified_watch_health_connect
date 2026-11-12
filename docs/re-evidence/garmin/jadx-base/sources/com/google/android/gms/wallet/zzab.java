package com.google.android.gms.wallet;

import com.google.android.gms.common.api.Api;
import com.google.android.gms.common.api.internal.TaskApiCall;
import com.google.android.gms.tasks.TaskCompletionSource;

/* JADX INFO: loaded from: classes14.dex */
final class zzab extends TaskApiCall<com.google.android.gms.internal.wallet.zzv, Boolean> {
    private final /* synthetic */ IsReadyToPayRequest zzdp;

    public zzab(PaymentsClient paymentsClient, IsReadyToPayRequest isReadyToPayRequest) {
        this.zzdp = isReadyToPayRequest;
    }

    @Override // com.google.android.gms.common.api.internal.TaskApiCall
    public final /* synthetic */ void doExecute(Api.AnyClient anyClient, TaskCompletionSource<Boolean> taskCompletionSource) {
        ((com.google.android.gms.internal.wallet.zzv) anyClient).zza(this.zzdp, taskCompletionSource);
    }
}
