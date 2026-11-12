package com.google.android.gms.maps.internal;

import android.os.Parcel;

/* JADX INFO: loaded from: classes14.dex */
public abstract class zzbi extends com.google.android.gms.internal.maps.zzb implements zzbj {
    public zzbi() {
        super("com.google.android.gms.maps.internal.IOnPolylineClickListener");
    }

    @Override // com.google.android.gms.internal.maps.zzb
    public final boolean zza(int i14, Parcel parcel, Parcel parcel2, int i15) {
        if (i14 != 1) {
            return false;
        }
        com.google.android.gms.internal.maps.zzar zzarVarZzb = com.google.android.gms.internal.maps.zzaq.zzb(parcel.readStrongBinder());
        com.google.android.gms.internal.maps.zzc.zzd(parcel);
        zzb(zzarVarZzb);
        parcel2.writeNoException();
        return true;
    }
}
