package com.google.android.gms.maps.internal;

import android.os.Parcel;

/* JADX INFO: loaded from: classes14.dex */
public abstract class zzaw extends com.google.android.gms.internal.maps.zzb implements zzax {
    public zzaw() {
        super("com.google.android.gms.maps.internal.IOnMarkerDragListener");
    }

    @Override // com.google.android.gms.internal.maps.zzb
    public final boolean zza(int i14, Parcel parcel, Parcel parcel2, int i15) {
        if (i14 == 1) {
            com.google.android.gms.internal.maps.zzaj zzajVarZzb = com.google.android.gms.internal.maps.zzai.zzb(parcel.readStrongBinder());
            com.google.android.gms.internal.maps.zzc.zzd(parcel);
            zzd(zzajVarZzb);
        } else if (i14 == 2) {
            com.google.android.gms.internal.maps.zzaj zzajVarZzb2 = com.google.android.gms.internal.maps.zzai.zzb(parcel.readStrongBinder());
            com.google.android.gms.internal.maps.zzc.zzd(parcel);
            zzb(zzajVarZzb2);
        } else {
            if (i14 != 3) {
                return false;
            }
            com.google.android.gms.internal.maps.zzaj zzajVarZzb3 = com.google.android.gms.internal.maps.zzai.zzb(parcel.readStrongBinder());
            com.google.android.gms.internal.maps.zzc.zzd(parcel);
            zzc(zzajVarZzb3);
        }
        parcel2.writeNoException();
        return true;
    }
}
