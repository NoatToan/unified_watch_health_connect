package com.google.android.gms.internal.maps;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

/* JADX INFO: loaded from: classes14.dex */
public abstract class zzak extends zzb implements zzal {
    public zzak() {
        super("com.google.android.gms.maps.model.internal.IOnFeatureClickListener");
    }

    @Override // com.google.android.gms.internal.maps.zzb
    public final boolean zza(int i14, Parcel parcel, Parcel parcel2, int i15) {
        zzo zzoVar;
        if (i14 != 1) {
            return false;
        }
        IBinder strongBinder = parcel.readStrongBinder();
        if (strongBinder == null) {
            zzoVar = null;
        } else {
            IInterface iInterfaceQueryLocalInterface = strongBinder.queryLocalInterface("com.google.android.gms.maps.model.internal.IFeatureClickEventDelegate");
            zzoVar = iInterfaceQueryLocalInterface instanceof zzo ? (zzo) iInterfaceQueryLocalInterface : new zzo(strongBinder);
        }
        zzc.zzd(parcel);
        zzb(zzoVar);
        parcel2.writeNoException();
        return true;
    }
}
