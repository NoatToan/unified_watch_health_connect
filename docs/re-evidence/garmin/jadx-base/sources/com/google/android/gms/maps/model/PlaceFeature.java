package com.google.android.gms.maps.model;

import android.os.RemoteException;
import com.google.android.gms.internal.measurement.a;

/* JADX INFO: loaded from: classes14.dex */
public final class PlaceFeature extends Feature {
    private final com.google.android.gms.internal.maps.zzr zza;

    public PlaceFeature(com.google.android.gms.internal.maps.zzr zzrVar) {
        super(zzrVar);
        this.zza = zzrVar;
    }

    public String getPlaceId() {
        try {
            return this.zza.zzg();
        } catch (RemoteException e4) {
            a.i(e4);
            return null;
        }
    }
}
