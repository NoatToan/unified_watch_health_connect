package com.google.android.gms.location;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

/* JADX INFO: loaded from: classes14.dex */
public abstract class zzbh extends com.google.android.gms.internal.location.zzb implements zzbi {
    public zzbh() {
        super("com.google.android.gms.location.ILocationCallback");
    }

    public static zzbi zzb(IBinder iBinder) {
        IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.location.ILocationCallback");
        return iInterfaceQueryLocalInterface instanceof zzbi ? (zzbi) iInterfaceQueryLocalInterface : new zzbg(iBinder);
    }

    @Override // com.google.android.gms.internal.location.zzb
    public final boolean zza(int i14, Parcel parcel, Parcel parcel2, int i15) {
        if (i14 == 1) {
            zze((LocationResult) com.google.android.gms.internal.location.zzc.zza(parcel, LocationResult.CREATOR));
        } else {
            if (i14 != 2) {
                return false;
            }
            zzd((LocationAvailability) com.google.android.gms.internal.location.zzc.zza(parcel, LocationAvailability.CREATOR));
        }
        return true;
    }
}
