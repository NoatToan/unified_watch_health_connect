package com.google.android.gms.internal.location;

import android.app.PendingIntent;
import android.os.Parcel;

/* JADX INFO: loaded from: classes14.dex */
public abstract class zzaj extends zzb implements zzak {
    public zzaj() {
        super("com.google.android.gms.location.internal.IGeofencerCallbacks");
    }

    @Override // com.google.android.gms.internal.location.zzb
    public final boolean zza(int i14, Parcel parcel, Parcel parcel2, int i15) {
        if (i14 == 1) {
            zzb(parcel.readInt(), parcel.createStringArray());
        } else if (i14 == 2) {
            zzd(parcel.readInt(), parcel.createStringArray());
        } else {
            if (i14 != 3) {
                return false;
            }
            zzc(parcel.readInt(), (PendingIntent) zzc.zza(parcel, PendingIntent.CREATOR));
        }
        return true;
    }
}
