package com.google.android.gms.maps.model;

import android.os.RemoteException;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.internal.maps.zzaw;
import com.google.android.gms.internal.measurement.a;

/* JADX INFO: loaded from: classes14.dex */
public final class TileOverlay {
    private final zzaw zza;

    public TileOverlay(zzaw zzawVar) {
        this.zza = (zzaw) Preconditions.checkNotNull(zzawVar);
    }

    public void clearTileCache() {
        try {
            this.zza.zzh();
        } catch (RemoteException e4) {
            a.i(e4);
        }
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof TileOverlay)) {
            return false;
        }
        try {
            return this.zza.zzn(((TileOverlay) obj).zza);
        } catch (RemoteException e4) {
            a.i(e4);
            return false;
        }
    }

    public boolean getFadeIn() {
        try {
            return this.zza.zzo();
        } catch (RemoteException e4) {
            a.i(e4);
            return false;
        }
    }

    public String getId() {
        try {
            return this.zza.zzg();
        } catch (RemoteException e4) {
            a.i(e4);
            return null;
        }
    }

    public float getTransparency() {
        try {
            return this.zza.zzd();
        } catch (RemoteException e4) {
            a.i(e4);
            return 0.0f;
        }
    }

    public float getZIndex() {
        try {
            return this.zza.zze();
        } catch (RemoteException e4) {
            a.i(e4);
            return 0.0f;
        }
    }

    public int hashCode() {
        try {
            return this.zza.zzf();
        } catch (RemoteException e4) {
            a.i(e4);
            return 0;
        }
    }

    public boolean isVisible() {
        try {
            return this.zza.zzp();
        } catch (RemoteException e4) {
            a.i(e4);
            return false;
        }
    }

    public void remove() {
        try {
            this.zza.zzi();
        } catch (RemoteException e4) {
            a.i(e4);
        }
    }

    public void setFadeIn(boolean z14) {
        try {
            this.zza.zzj(z14);
        } catch (RemoteException e4) {
            a.i(e4);
        }
    }

    public void setTransparency(float f14) {
        try {
            this.zza.zzk(f14);
        } catch (RemoteException e4) {
            a.i(e4);
        }
    }

    public void setVisible(boolean z14) {
        try {
            this.zza.zzl(z14);
        } catch (RemoteException e4) {
            a.i(e4);
        }
    }

    public void setZIndex(float f14) {
        try {
            this.zza.zzm(f14);
        } catch (RemoteException e4) {
            a.i(e4);
        }
    }
}
