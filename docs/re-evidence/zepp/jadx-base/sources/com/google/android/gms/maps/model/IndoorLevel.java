package com.google.android.gms.maps.model;

import android.os.RemoteException;
import androidx.annotation.NonNull;
import com.google.android.gms.common.internal.Preconditions;

/* JADX INFO: loaded from: classes3.dex */
public final class IndoorLevel {
    private final com.google.android.gms.internal.maps.zzq a;

    public IndoorLevel(com.google.android.gms.internal.maps.zzq zzqVar) {
        this.a = (com.google.android.gms.internal.maps.zzq) Preconditions.checkNotNull(zzqVar);
    }

    public final void activate() {
        try {
            this.a.activate();
        } catch (RemoteException e) {
            throw new RuntimeRemoteException(e);
        }
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof IndoorLevel)) {
            return false;
        }
        try {
            return this.a.zzb(((IndoorLevel) obj).a);
        } catch (RemoteException e) {
            throw new RuntimeRemoteException(e);
        }
    }

    @NonNull
    public final String getName() {
        try {
            return this.a.getName();
        } catch (RemoteException e) {
            throw new RuntimeRemoteException(e);
        }
    }

    @NonNull
    public final String getShortName() {
        try {
            return this.a.getShortName();
        } catch (RemoteException e) {
            throw new RuntimeRemoteException(e);
        }
    }

    public final int hashCode() {
        try {
            return this.a.zzi();
        } catch (RemoteException e) {
            throw new RuntimeRemoteException(e);
        }
    }
}
