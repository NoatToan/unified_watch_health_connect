package com.google.android.gms.auth.api.signin.internal;

import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.auth.api.signin.GoogleSignInOptions;

/* JADX INFO: loaded from: classes3.dex */
public final class zzw extends com.google.android.gms.internal.p000authapi.zzd implements zzt {
    public zzw(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.auth.api.signin.internal.ISignInService");
    }

    @Override // com.google.android.gms.auth.api.signin.internal.zzt
    public final void zzc(zzr zzrVar, GoogleSignInOptions googleSignInOptions) throws RemoteException {
        Parcel parcelZzc = zzc();
        com.google.android.gms.internal.p000authapi.zzf.zzc(parcelZzc, zzrVar);
        com.google.android.gms.internal.p000authapi.zzf.zzc(parcelZzc, googleSignInOptions);
        zzc(101, parcelZzc);
    }

    @Override // com.google.android.gms.auth.api.signin.internal.zzt
    public final void zzd(zzr zzrVar, GoogleSignInOptions googleSignInOptions) throws RemoteException {
        Parcel parcelZzc = zzc();
        com.google.android.gms.internal.p000authapi.zzf.zzc(parcelZzc, zzrVar);
        com.google.android.gms.internal.p000authapi.zzf.zzc(parcelZzc, googleSignInOptions);
        zzc(102, parcelZzc);
    }

    @Override // com.google.android.gms.auth.api.signin.internal.zzt
    public final void zze(zzr zzrVar, GoogleSignInOptions googleSignInOptions) throws RemoteException {
        Parcel parcelZzc = zzc();
        com.google.android.gms.internal.p000authapi.zzf.zzc(parcelZzc, zzrVar);
        com.google.android.gms.internal.p000authapi.zzf.zzc(parcelZzc, googleSignInOptions);
        zzc(103, parcelZzc);
    }
}
