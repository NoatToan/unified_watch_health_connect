package com.google.android.gms.maps.internal;

import android.os.Parcel;

/* JADX INFO: loaded from: classes14.dex */
public abstract class zzu extends com.google.android.gms.internal.maps.zzb implements zzv {
    public zzu() {
        super("com.google.android.gms.maps.internal.IOnCameraMoveStartedListener");
    }

    @Override // com.google.android.gms.internal.maps.zzb
    public final boolean zza(int i14, Parcel parcel, Parcel parcel2, int i15) {
        if (i14 != 1) {
            return false;
        }
        int i16 = parcel.readInt();
        com.google.android.gms.internal.maps.zzc.zzd(parcel);
        zzb(i16);
        parcel2.writeNoException();
        return true;
    }
}
