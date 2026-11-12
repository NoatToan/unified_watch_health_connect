package com.google.android.gms.internal.wallet;

import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.wallet.CreateWalletObjectsRequest;
import com.google.android.gms.wallet.Wallet;

/* JADX INFO: loaded from: classes14.dex */
final class zzac extends Wallet.zzb {
    private final /* synthetic */ int val$requestCode;
    private final /* synthetic */ CreateWalletObjectsRequest zzeh;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzac(zzaa zzaaVar, GoogleApiClient googleApiClient, CreateWalletObjectsRequest createWalletObjectsRequest, int i14) {
        super(googleApiClient);
        this.zzeh = createWalletObjectsRequest;
        this.val$requestCode = i14;
    }

    @Override // com.google.android.gms.wallet.Wallet.zza, com.google.android.gms.common.api.internal.BaseImplementation.ApiMethodImpl
    /* JADX INFO: renamed from: zza */
    public final void doExecute(zzv zzvVar) {
        zzvVar.zza(this.zzeh, this.val$requestCode);
        setResult(Status.RESULT_SUCCESS);
    }
}
