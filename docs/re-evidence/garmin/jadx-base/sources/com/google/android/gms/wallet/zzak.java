package com.google.android.gms.wallet;

import com.google.android.gms.common.api.Api;
import com.google.android.gms.common.api.internal.TaskApiCall;
import com.google.android.gms.tasks.TaskCompletionSource;

/* JADX INFO: loaded from: classes14.dex */
final class zzak extends TaskApiCall<com.google.android.gms.internal.wallet.zzv, AutoResolvableVoidResult> {
    private final /* synthetic */ CreateWalletObjectsRequest zzeh;

    public zzak(WalletObjectsClient walletObjectsClient, CreateWalletObjectsRequest createWalletObjectsRequest) {
        this.zzeh = createWalletObjectsRequest;
    }

    @Override // com.google.android.gms.common.api.internal.TaskApiCall
    public final /* synthetic */ void doExecute(Api.AnyClient anyClient, TaskCompletionSource<AutoResolvableVoidResult> taskCompletionSource) {
        ((com.google.android.gms.internal.wallet.zzv) anyClient).zza(this.zzeh, taskCompletionSource);
    }
}
