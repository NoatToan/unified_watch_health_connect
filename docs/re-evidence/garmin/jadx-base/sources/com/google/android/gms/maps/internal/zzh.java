package com.google.android.gms.maps.internal;

import android.os.Parcel;
import com.google.android.gms.dynamic.IObjectWrapper;

/* JADX INFO: loaded from: classes14.dex */
public abstract class zzh extends com.google.android.gms.internal.maps.zzb implements zzi {
    public zzh() {
        super("com.google.android.gms.maps.internal.IInfoWindowAdapter");
    }

    @Override // com.google.android.gms.internal.maps.zzb
    public final boolean zza(int i14, Parcel parcel, Parcel parcel2, int i15) {
        if (i14 == 1) {
            com.google.android.gms.internal.maps.zzaj zzajVarZzb = com.google.android.gms.internal.maps.zzai.zzb(parcel.readStrongBinder());
            com.google.android.gms.internal.maps.zzc.zzd(parcel);
            IObjectWrapper iObjectWrapperZzc = zzc(zzajVarZzb);
            parcel2.writeNoException();
            com.google.android.gms.internal.maps.zzc.zzg(parcel2, iObjectWrapperZzc);
        } else {
            if (i14 != 2) {
                return false;
            }
            com.google.android.gms.internal.maps.zzaj zzajVarZzb2 = com.google.android.gms.internal.maps.zzai.zzb(parcel.readStrongBinder());
            com.google.android.gms.internal.maps.zzc.zzd(parcel);
            IObjectWrapper iObjectWrapperZzb = zzb(zzajVarZzb2);
            parcel2.writeNoException();
            com.google.android.gms.internal.maps.zzc.zzg(parcel2, iObjectWrapperZzb);
        }
        return true;
    }
}
