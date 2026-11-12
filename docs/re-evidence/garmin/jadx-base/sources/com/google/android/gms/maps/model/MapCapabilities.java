package com.google.android.gms.maps.model;

import android.os.RemoteException;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.internal.measurement.a;

/* JADX INFO: loaded from: classes14.dex */
public final class MapCapabilities {
    private final com.google.android.gms.internal.maps.zzag zza;

    public MapCapabilities(com.google.android.gms.internal.maps.zzag zzagVar) {
        this.zza = (com.google.android.gms.internal.maps.zzag) Preconditions.checkNotNull(zzagVar);
    }

    public boolean isAdvancedMarkersAvailable() {
        try {
            return this.zza.zzd();
        } catch (RemoteException e4) {
            a.i(e4);
            return false;
        }
    }

    public boolean isDataDrivenStylingAvailable() {
        try {
            return this.zza.zze();
        } catch (RemoteException e4) {
            a.i(e4);
            return false;
        }
    }
}
