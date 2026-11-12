package com.google.android.gms.internal.p001authapiphone;

import android.os.IBinder;
import android.os.Parcel;
import com.google.android.gms.common.api.internal.IStatusCallback;

/* JADX INFO: loaded from: classes14.dex */
public final class zzk extends zzb implements zzh {
    public zzk(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.auth.api.phone.internal.ISmsRetrieverApiService");
    }

    @Override // com.google.android.gms.internal.p001authapiphone.zzh
    public final void zza(String str, zzj zzjVar) {
        Parcel parcelZza = zza();
        parcelZza.writeString(str);
        zzd.zza(parcelZza, zzjVar);
        zza(2, parcelZza);
    }

    @Override // com.google.android.gms.internal.p001authapiphone.zzh
    public final void zzb(IStatusCallback iStatusCallback) {
        Parcel parcelZza = zza();
        zzd.zza(parcelZza, iStatusCallback);
        zza(6, parcelZza);
    }

    @Override // com.google.android.gms.internal.p001authapiphone.zzh
    public final void zza(zzj zzjVar) {
        Parcel parcelZza = zza();
        zzd.zza(parcelZza, zzjVar);
        zza(1, parcelZza);
    }

    @Override // com.google.android.gms.internal.p001authapiphone.zzh
    public final void zza(IStatusCallback iStatusCallback) {
        Parcel parcelZza = zza();
        zzd.zza(parcelZza, iStatusCallback);
        zza(3, parcelZza);
    }

    @Override // com.google.android.gms.internal.p001authapiphone.zzh
    public final void zza(zze zzeVar) {
        Parcel parcelZza = zza();
        zzd.zza(parcelZza, zzeVar);
        zza(4, parcelZza);
    }

    @Override // com.google.android.gms.internal.p001authapiphone.zzh
    public final void zza(String str, zzf zzfVar) {
        Parcel parcelZza = zza();
        parcelZza.writeString(str);
        zzd.zza(parcelZza, zzfVar);
        zza(5, parcelZza);
    }
}
