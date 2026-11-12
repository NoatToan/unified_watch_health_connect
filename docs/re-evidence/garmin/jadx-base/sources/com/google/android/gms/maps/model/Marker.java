package com.google.android.gms.maps.model;

import android.os.RemoteException;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.dynamic.ObjectWrapper;
import com.google.android.gms.internal.measurement.a;
import vb.h;

/* JADX INFO: loaded from: classes14.dex */
public class Marker {
    protected final com.google.android.gms.internal.maps.zzaj zza;

    public Marker(com.google.android.gms.internal.maps.zzaj zzajVar) {
        this.zza = (com.google.android.gms.internal.maps.zzaj) Preconditions.checkNotNull(zzajVar);
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof Marker)) {
            return false;
        }
        try {
            return this.zza.zzE(((Marker) obj).zza);
        } catch (RemoteException e4) {
            a.i(e4);
            return false;
        }
    }

    public float getAlpha() {
        try {
            return this.zza.zzd();
        } catch (RemoteException e4) {
            a.i(e4);
            return 0.0f;
        }
    }

    public String getId() {
        try {
            return this.zza.zzk();
        } catch (RemoteException e4) {
            a.i(e4);
            return null;
        }
    }

    public LatLng getPosition() {
        try {
            return this.zza.zzj();
        } catch (RemoteException e4) {
            a.i(e4);
            return null;
        }
    }

    public float getRotation() {
        try {
            return this.zza.zze();
        } catch (RemoteException e4) {
            a.i(e4);
            return 0.0f;
        }
    }

    public String getSnippet() {
        try {
            return this.zza.zzl();
        } catch (RemoteException e4) {
            a.i(e4);
            return null;
        }
    }

    public Object getTag() {
        try {
            return ObjectWrapper.unwrap(this.zza.zzi());
        } catch (RemoteException e4) {
            a.i(e4);
            return null;
        }
    }

    public String getTitle() {
        try {
            return this.zza.zzm();
        } catch (RemoteException e4) {
            a.i(e4);
            return null;
        }
    }

    public float getZIndex() {
        try {
            return this.zza.zzf();
        } catch (RemoteException e4) {
            a.i(e4);
            return 0.0f;
        }
    }

    public int hashCode() {
        try {
            return this.zza.zzg();
        } catch (RemoteException e4) {
            a.i(e4);
            return 0;
        }
    }

    public void hideInfoWindow() {
        try {
            this.zza.zzn();
        } catch (RemoteException e4) {
            a.i(e4);
        }
    }

    public boolean isDraggable() {
        try {
            return this.zza.zzF();
        } catch (RemoteException e4) {
            a.i(e4);
            return false;
        }
    }

    public boolean isFlat() {
        try {
            return this.zza.zzG();
        } catch (RemoteException e4) {
            a.i(e4);
            return false;
        }
    }

    public boolean isInfoWindowShown() {
        try {
            return this.zza.zzH();
        } catch (RemoteException e4) {
            a.i(e4);
            return false;
        }
    }

    public boolean isVisible() {
        try {
            return this.zza.zzI();
        } catch (RemoteException e4) {
            a.i(e4);
            return false;
        }
    }

    public void remove() {
        try {
            this.zza.zzo();
        } catch (RemoteException e4) {
            a.i(e4);
        }
    }

    public void setAlpha(float f14) {
        try {
            this.zza.zzp(f14);
        } catch (RemoteException e4) {
            a.i(e4);
        }
    }

    public void setAnchor(float f14, float f15) {
        try {
            this.zza.zzq(f14, f15);
        } catch (RemoteException e4) {
            a.i(e4);
        }
    }

    public void setDraggable(boolean z14) {
        try {
            this.zza.zzr(z14);
        } catch (RemoteException e4) {
            a.i(e4);
        }
    }

    public void setFlat(boolean z14) {
        try {
            this.zza.zzs(z14);
        } catch (RemoteException e4) {
            a.i(e4);
        }
    }

    public void setIcon(BitmapDescriptor bitmapDescriptor) {
        try {
            if (bitmapDescriptor == null) {
                this.zza.zzt(null);
            } else {
                this.zza.zzt(bitmapDescriptor.zza());
            }
        } catch (RemoteException e4) {
            a.i(e4);
        }
    }

    public void setInfoWindowAnchor(float f14, float f15) {
        try {
            this.zza.zzv(f14, f15);
        } catch (RemoteException e4) {
            a.i(e4);
        }
    }

    public void setPosition(LatLng latLng) {
        if (latLng == null) {
            h.s("latlng cannot be null - a position is required.");
            return;
        }
        try {
            this.zza.zzw(latLng);
        } catch (RemoteException e4) {
            a.i(e4);
        }
    }

    public void setRotation(float f14) {
        try {
            this.zza.zzx(f14);
        } catch (RemoteException e4) {
            a.i(e4);
        }
    }

    public void setSnippet(String str) {
        try {
            this.zza.zzy(str);
        } catch (RemoteException e4) {
            a.i(e4);
        }
    }

    public void setTag(Object obj) {
        try {
            this.zza.zzz(ObjectWrapper.wrap(obj));
        } catch (RemoteException e4) {
            a.i(e4);
        }
    }

    public void setTitle(String str) {
        try {
            this.zza.zzA(str);
        } catch (RemoteException e4) {
            a.i(e4);
        }
    }

    public void setVisible(boolean z14) {
        try {
            this.zza.zzB(z14);
        } catch (RemoteException e4) {
            a.i(e4);
        }
    }

    public void setZIndex(float f14) {
        try {
            this.zza.zzC(f14);
        } catch (RemoteException e4) {
            a.i(e4);
        }
    }

    public void showInfoWindow() {
        try {
            this.zza.zzD();
        } catch (RemoteException e4) {
            a.i(e4);
        }
    }
}
