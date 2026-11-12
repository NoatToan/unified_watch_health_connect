package com.google.android.gms.internal.wallet;

import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import com.google.android.gms.wallet.CreateWalletObjectsRequest;
import com.google.android.gms.wallet.IsReadyToPayRequest;
import com.google.android.gms.wallet.PaymentDataRequest;

/* JADX INFO: loaded from: classes14.dex */
public final class zzr extends zzb implements zzo {
    public zzr(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.wallet.internal.IOwService");
    }

    @Override // com.google.android.gms.internal.wallet.zzo
    public final void zza(IsReadyToPayRequest isReadyToPayRequest, Bundle bundle, zzq zzqVar) {
        Parcel parcelObtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
        zzd.zza(parcelObtainAndWriteInterfaceToken, isReadyToPayRequest);
        zzd.zza(parcelObtainAndWriteInterfaceToken, bundle);
        zzd.zza(parcelObtainAndWriteInterfaceToken, zzqVar);
        zza(14, parcelObtainAndWriteInterfaceToken);
    }

    @Override // com.google.android.gms.internal.wallet.zzo
    public final void zza(CreateWalletObjectsRequest createWalletObjectsRequest, Bundle bundle, zzq zzqVar) {
        Parcel parcelObtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
        zzd.zza(parcelObtainAndWriteInterfaceToken, createWalletObjectsRequest);
        zzd.zza(parcelObtainAndWriteInterfaceToken, bundle);
        zzd.zza(parcelObtainAndWriteInterfaceToken, zzqVar);
        zza(6, parcelObtainAndWriteInterfaceToken);
    }

    @Override // com.google.android.gms.internal.wallet.zzo
    public final void zza(PaymentDataRequest paymentDataRequest, Bundle bundle, zzq zzqVar) {
        Parcel parcelObtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
        zzd.zza(parcelObtainAndWriteInterfaceToken, paymentDataRequest);
        zzd.zza(parcelObtainAndWriteInterfaceToken, bundle);
        zzd.zza(parcelObtainAndWriteInterfaceToken, zzqVar);
        zza(19, parcelObtainAndWriteInterfaceToken);
    }
}
