package com.google.android.gms.internal.identity;

import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import com.google.android.gms.identity.intents.UserAddressRequest;

/* JADX INFO: loaded from: classes14.dex */
public final class zzj extends zza implements zzi {
    public zzj(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.identity.intents.internal.IAddressService");
    }

    @Override // com.google.android.gms.internal.identity.zzi
    public final void zza(zzg zzgVar, UserAddressRequest userAddressRequest, Bundle bundle) {
        Parcel parcelObtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
        zzc.zza(parcelObtainAndWriteInterfaceToken, zzgVar);
        zzc.zza(parcelObtainAndWriteInterfaceToken, userAddressRequest);
        zzc.zza(parcelObtainAndWriteInterfaceToken, bundle);
        transactAndReadExceptionReturnVoid(2, parcelObtainAndWriteInterfaceToken);
    }
}
