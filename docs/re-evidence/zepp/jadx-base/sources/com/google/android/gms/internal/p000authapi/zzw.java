package com.google.android.gms.internal.p000authapi;

import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.auth.api.credentials.CredentialRequest;

/* JADX INFO: loaded from: classes3.dex */
public final class zzw extends zzd implements zzx {
    public zzw(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.auth.api.credentials.internal.ICredentialsService");
    }

    @Override // com.google.android.gms.internal.p000authapi.zzx
    public final void zzc(zzv zzvVar, CredentialRequest credentialRequest) throws RemoteException {
        Parcel parcelZzc = zzc();
        zzf.zzc(parcelZzc, zzvVar);
        zzf.zzc(parcelZzc, credentialRequest);
        zzc(1, parcelZzc);
    }

    @Override // com.google.android.gms.internal.p000authapi.zzx
    public final void zzc(zzv zzvVar, zzz zzzVar) throws RemoteException {
        Parcel parcelZzc = zzc();
        zzf.zzc(parcelZzc, zzvVar);
        zzf.zzc(parcelZzc, zzzVar);
        zzc(2, parcelZzc);
    }

    @Override // com.google.android.gms.internal.p000authapi.zzx
    public final void zzc(zzv zzvVar, zzt zztVar) throws RemoteException {
        Parcel parcelZzc = zzc();
        zzf.zzc(parcelZzc, zzvVar);
        zzf.zzc(parcelZzc, zztVar);
        zzc(3, parcelZzc);
    }

    @Override // com.google.android.gms.internal.p000authapi.zzx
    public final void zzc(zzv zzvVar) throws RemoteException {
        Parcel parcelZzc = zzc();
        zzf.zzc(parcelZzc, zzvVar);
        zzc(4, parcelZzc);
    }
}
