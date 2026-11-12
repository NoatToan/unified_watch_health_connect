package com.google.android.gms.maps.model;

import android.os.RemoteException;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.internal.measurement.a;

/* JADX INFO: loaded from: classes14.dex */
public final class IndoorLevel {
    private final com.google.android.gms.internal.maps.zzad zza;

    public IndoorLevel(com.google.android.gms.internal.maps.zzad zzadVar) {
        this.zza = (com.google.android.gms.internal.maps.zzad) Preconditions.checkNotNull(zzadVar);
    }

    public void activate() {
        try {
            this.zza.zzg();
        } catch (RemoteException e4) {
            a.i(e4);
        }
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof IndoorLevel)) {
            return false;
        }
        try {
            return this.zza.zzh(((IndoorLevel) obj).zza);
        } catch (RemoteException e4) {
            a.i(e4);
            return false;
        }
    }

    public String getName() {
        try {
            return this.zza.zze();
        } catch (RemoteException e4) {
            a.i(e4);
            return null;
        }
    }

    public String getShortName() {
        try {
            return this.zza.zzf();
        } catch (RemoteException e4) {
            a.i(e4);
            return null;
        }
    }

    public int hashCode() {
        try {
            return this.zza.zzd();
        } catch (RemoteException e4) {
            a.i(e4);
            return 0;
        }
    }
}
