package com.google.android.gms.location;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

/* JADX INFO: loaded from: classes14.dex */
public class zzbe extends com.google.android.gms.internal.location.zzb implements zzbf {
    public static zzbf zzb(IBinder iBinder) {
        IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.location.IDeviceOrientationListener");
        return iInterfaceQueryLocalInterface instanceof zzbf ? (zzbf) iInterfaceQueryLocalInterface : new zzbd(iBinder);
    }

    @Override // com.google.android.gms.internal.location.zzb
    public final boolean zza(int i14, Parcel parcel, Parcel parcel2, int i15) {
        throw null;
    }
}
