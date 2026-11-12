package com.google.android.gms.maps.model;

import android.os.RemoteException;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.dynamic.ObjectWrapper;
import com.google.android.gms.internal.measurement.a;

/* JADX INFO: loaded from: classes14.dex */
public final class GroundOverlay {
    private final com.google.android.gms.internal.maps.zzx zza;

    public GroundOverlay(com.google.android.gms.internal.maps.zzx zzxVar) {
        this.zza = (com.google.android.gms.internal.maps.zzx) Preconditions.checkNotNull(zzxVar);
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof GroundOverlay)) {
            return false;
        }
        try {
            return this.zza.zzz(((GroundOverlay) obj).zza);
        } catch (RemoteException e4) {
            a.i(e4);
            return false;
        }
    }

    public float getBearing() {
        try {
            return this.zza.zzd();
        } catch (RemoteException e4) {
            a.i(e4);
            return 0.0f;
        }
    }

    public LatLngBounds getBounds() {
        try {
            return this.zza.zzl();
        } catch (RemoteException e4) {
            a.i(e4);
            return null;
        }
    }

    public float getHeight() {
        try {
            return this.zza.zze();
        } catch (RemoteException e4) {
            a.i(e4);
            return 0.0f;
        }
    }

    public String getId() {
        try {
            return this.zza.zzm();
        } catch (RemoteException e4) {
            a.i(e4);
            return null;
        }
    }

    public LatLng getPosition() {
        try {
            return this.zza.zzk();
        } catch (RemoteException e4) {
            a.i(e4);
            return null;
        }
    }

    public Object getTag() {
        try {
            return ObjectWrapper.unwrap(this.zza.zzj());
        } catch (RemoteException e4) {
            a.i(e4);
            return null;
        }
    }

    public float getTransparency() {
        try {
            return this.zza.zzf();
        } catch (RemoteException e4) {
            a.i(e4);
            return 0.0f;
        }
    }

    public float getWidth() {
        try {
            return this.zza.zzg();
        } catch (RemoteException e4) {
            a.i(e4);
            return 0.0f;
        }
    }

    public float getZIndex() {
        try {
            return this.zza.zzh();
        } catch (RemoteException e4) {
            a.i(e4);
            return 0.0f;
        }
    }

    public int hashCode() {
        try {
            return this.zza.zzi();
        } catch (RemoteException e4) {
            a.i(e4);
            return 0;
        }
    }

    public boolean isClickable() {
        try {
            return this.zza.zzA();
        } catch (RemoteException e4) {
            a.i(e4);
            return false;
        }
    }

    public boolean isVisible() {
        try {
            return this.zza.zzB();
        } catch (RemoteException e4) {
            a.i(e4);
            return false;
        }
    }

    public void remove() {
        try {
            this.zza.zzn();
        } catch (RemoteException e4) {
            a.i(e4);
        }
    }

    public void setBearing(float f14) {
        try {
            this.zza.zzo(f14);
        } catch (RemoteException e4) {
            a.i(e4);
        }
    }

    public void setClickable(boolean z14) {
        try {
            this.zza.zzp(z14);
        } catch (RemoteException e4) {
            a.i(e4);
        }
    }

    public void setDimensions(float f14) {
        try {
            this.zza.zzq(f14);
        } catch (RemoteException e4) {
            a.i(e4);
        }
    }

    public void setImage(BitmapDescriptor bitmapDescriptor) {
        Preconditions.checkNotNull(bitmapDescriptor, "imageDescriptor must not be null");
        try {
            this.zza.zzs(bitmapDescriptor.zza());
        } catch (RemoteException e4) {
            a.i(e4);
        }
    }

    public void setPosition(LatLng latLng) {
        try {
            this.zza.zzt(latLng);
        } catch (RemoteException e4) {
            a.i(e4);
        }
    }

    public void setPositionFromBounds(LatLngBounds latLngBounds) {
        try {
            this.zza.zzu(latLngBounds);
        } catch (RemoteException e4) {
            a.i(e4);
        }
    }

    public void setTag(Object obj) {
        try {
            this.zza.zzv(ObjectWrapper.wrap(obj));
        } catch (RemoteException e4) {
            a.i(e4);
        }
    }

    public void setTransparency(float f14) {
        try {
            this.zza.zzw(f14);
        } catch (RemoteException e4) {
            a.i(e4);
        }
    }

    public void setVisible(boolean z14) {
        try {
            this.zza.zzx(z14);
        } catch (RemoteException e4) {
            a.i(e4);
        }
    }

    public void setZIndex(float f14) {
        try {
            this.zza.zzy(f14);
        } catch (RemoteException e4) {
            a.i(e4);
        }
    }

    public void setDimensions(float f14, float f15) {
        try {
            this.zza.zzr(f14, f15);
        } catch (RemoteException e4) {
            a.i(e4);
        }
    }
}
