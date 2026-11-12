package com.google.android.gms.internal.identity;

import android.os.Bundle;
import android.os.Parcel;

/* JADX INFO: loaded from: classes14.dex */
public abstract class zzh extends zzb implements zzg {
    public zzh() {
        super("com.google.android.gms.identity.intents.internal.IAddressCallbacks");
    }

    @Override // com.google.android.gms.internal.identity.zzb
    public final boolean dispatchTransaction(int i14, Parcel parcel, Parcel parcel2, int i15) {
        if (i14 != 2) {
            return false;
        }
        zza(parcel.readInt(), (Bundle) zzc.zza(parcel, Bundle.CREATOR));
        parcel2.writeNoException();
        return true;
    }
}
