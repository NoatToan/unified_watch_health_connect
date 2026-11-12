package com.google.android.gms.internal.p000authapi;

import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.auth.api.identity.BeginSignInRequest;
import com.google.android.gms.auth.api.identity.GetSignInIntentRequest;
import com.google.android.gms.common.api.internal.IStatusCallback;

/* JADX INFO: loaded from: classes3.dex */
public final class zzal extends zzd implements zzai {
    public zzal(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.auth.api.identity.internal.ISignInService");
    }

    @Override // com.google.android.gms.internal.p000authapi.zzai
    public final void zzc(zzaa zzaaVar, BeginSignInRequest beginSignInRequest) throws RemoteException {
        Parcel parcelZzc = zzc();
        zzf.zzc(parcelZzc, zzaaVar);
        zzf.zzc(parcelZzc, beginSignInRequest);
        zzc(1, parcelZzc);
    }

    @Override // com.google.android.gms.internal.p000authapi.zzai
    public final void zzc(IStatusCallback iStatusCallback, String str) throws RemoteException {
        Parcel parcelZzc = zzc();
        zzf.zzc(parcelZzc, iStatusCallback);
        parcelZzc.writeString(str);
        zzc(2, parcelZzc);
    }

    @Override // com.google.android.gms.internal.p000authapi.zzai
    public final void zzc(zzae zzaeVar, GetSignInIntentRequest getSignInIntentRequest) throws RemoteException {
        Parcel parcelZzc = zzc();
        zzf.zzc(parcelZzc, zzaeVar);
        zzf.zzc(parcelZzc, getSignInIntentRequest);
        zzc(3, parcelZzc);
    }
}
