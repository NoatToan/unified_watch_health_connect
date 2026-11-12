package com.google.android.gms.internal.location;

import android.os.Parcel;

/* JADX INFO: loaded from: classes14.dex */
public abstract class zzah extends zzb implements zzai {
    public zzah() {
        super("com.google.android.gms.location.internal.IFusedLocationProviderCallback");
    }

    @Override // com.google.android.gms.internal.location.zzb
    public final boolean zza(int i14, Parcel parcel, Parcel parcel2, int i15) {
        if (i14 == 1) {
            zzb((zzaa) zzc.zza(parcel, zzaa.CREATOR));
        } else {
            if (i14 != 2) {
                return false;
            }
            zzc();
        }
        return true;
    }
}
