package com.google.android.gms.maps.internal;

import android.os.Parcel;
import com.google.android.gms.maps.model.LatLng;

/* JADX INFO: loaded from: classes14.dex */
public abstract class zzaq extends com.google.android.gms.internal.maps.zzb implements zzar {
    public zzaq() {
        super("com.google.android.gms.maps.internal.IOnMapLongClickListener");
    }

    @Override // com.google.android.gms.internal.maps.zzb
    public final boolean zza(int i14, Parcel parcel, Parcel parcel2, int i15) {
        if (i14 != 1) {
            return false;
        }
        LatLng latLng = (LatLng) com.google.android.gms.internal.maps.zzc.zza(parcel, LatLng.CREATOR);
        com.google.android.gms.internal.maps.zzc.zzd(parcel);
        zzb(latLng);
        parcel2.writeNoException();
        return true;
    }
}
