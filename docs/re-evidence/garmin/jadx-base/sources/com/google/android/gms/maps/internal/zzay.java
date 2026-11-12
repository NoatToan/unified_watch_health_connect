package com.google.android.gms.maps.internal;

import android.os.Parcel;

/* JADX INFO: loaded from: classes14.dex */
public abstract class zzay extends com.google.android.gms.internal.maps.zzb implements zzaz {
    public zzay() {
        super("com.google.android.gms.maps.internal.IOnMyLocationButtonClickListener");
    }

    @Override // com.google.android.gms.internal.maps.zzb
    public final boolean zza(int i14, Parcel parcel, Parcel parcel2, int i15) {
        if (i14 != 1) {
            return false;
        }
        boolean zZzb = zzb();
        parcel2.writeNoException();
        int i16 = com.google.android.gms.internal.maps.zzc.zza;
        parcel2.writeInt(zZzb ? 1 : 0);
        return true;
    }
}
