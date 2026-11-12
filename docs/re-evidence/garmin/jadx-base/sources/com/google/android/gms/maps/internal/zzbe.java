package com.google.android.gms.maps.internal;

import android.os.Parcel;
import com.google.android.gms.maps.model.PointOfInterest;

/* JADX INFO: loaded from: classes14.dex */
public abstract class zzbe extends com.google.android.gms.internal.maps.zzb implements zzbf {
    public zzbe() {
        super("com.google.android.gms.maps.internal.IOnPoiClickListener");
    }

    @Override // com.google.android.gms.internal.maps.zzb
    public final boolean zza(int i14, Parcel parcel, Parcel parcel2, int i15) {
        if (i14 != 1) {
            return false;
        }
        PointOfInterest pointOfInterest = (PointOfInterest) com.google.android.gms.internal.maps.zzc.zza(parcel, PointOfInterest.CREATOR);
        com.google.android.gms.internal.maps.zzc.zzd(parcel);
        zzb(pointOfInterest);
        parcel2.writeNoException();
        return true;
    }
}
