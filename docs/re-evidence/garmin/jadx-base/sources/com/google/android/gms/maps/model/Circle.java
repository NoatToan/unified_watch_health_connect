package com.google.android.gms.maps.model;

import android.os.RemoteException;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.dynamic.ObjectWrapper;
import com.google.android.gms.internal.measurement.a;
import java.util.List;

/* JADX INFO: loaded from: classes14.dex */
public final class Circle {
    private final com.google.android.gms.internal.maps.zzn zza;

    public Circle(com.google.android.gms.internal.maps.zzn zznVar) {
        this.zza = (com.google.android.gms.internal.maps.zzn) Preconditions.checkNotNull(zznVar);
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof Circle)) {
            return false;
        }
        try {
            return this.zza.zzy(((Circle) obj).zza);
        } catch (RemoteException e4) {
            a.i(e4);
            return false;
        }
    }

    public LatLng getCenter() {
        try {
            return this.zza.zzk();
        } catch (RemoteException e4) {
            a.i(e4);
            return null;
        }
    }

    public int getFillColor() {
        try {
            return this.zza.zzg();
        } catch (RemoteException e4) {
            a.i(e4);
            return 0;
        }
    }

    public String getId() {
        try {
            return this.zza.zzl();
        } catch (RemoteException e4) {
            a.i(e4);
            return null;
        }
    }

    public double getRadius() {
        try {
            return this.zza.zzd();
        } catch (RemoteException e4) {
            a.i(e4);
            return 0.0d;
        }
    }

    public int getStrokeColor() {
        try {
            return this.zza.zzh();
        } catch (RemoteException e4) {
            a.i(e4);
            return 0;
        }
    }

    public List<PatternItem> getStrokePattern() {
        try {
            return PatternItem.zza(this.zza.zzm());
        } catch (RemoteException e4) {
            a.i(e4);
            return null;
        }
    }

    public float getStrokeWidth() {
        try {
            return this.zza.zze();
        } catch (RemoteException e4) {
            a.i(e4);
            return 0.0f;
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

    public float getZIndex() {
        try {
            return this.zza.zzf();
        } catch (RemoteException e4) {
            a.i(e4);
            return 0.0f;
        }
    }

    public final int hashCode() {
        try {
            return this.zza.zzi();
        } catch (RemoteException e4) {
            a.i(e4);
            return 0;
        }
    }

    public boolean isClickable() {
        try {
            return this.zza.zzz();
        } catch (RemoteException e4) {
            a.i(e4);
            return false;
        }
    }

    public boolean isVisible() {
        try {
            return this.zza.zzA();
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

    public void setCenter(LatLng latLng) {
        try {
            Preconditions.checkNotNull(latLng, "center must not be null.");
            this.zza.zzo(latLng);
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

    public void setFillColor(int i14) {
        try {
            this.zza.zzq(i14);
        } catch (RemoteException e4) {
            a.i(e4);
        }
    }

    public void setRadius(double d14) {
        try {
            this.zza.zzr(d14);
        } catch (RemoteException e4) {
            a.i(e4);
        }
    }

    public void setStrokeColor(int i14) {
        try {
            this.zza.zzs(i14);
        } catch (RemoteException e4) {
            a.i(e4);
        }
    }

    public void setStrokePattern(List<PatternItem> list) {
        try {
            this.zza.zzt(list);
        } catch (RemoteException e4) {
            a.i(e4);
        }
    }

    public void setStrokeWidth(float f14) {
        try {
            this.zza.zzu(f14);
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

    public void setVisible(boolean z14) {
        try {
            this.zza.zzw(z14);
        } catch (RemoteException e4) {
            a.i(e4);
        }
    }

    public void setZIndex(float f14) {
        try {
            this.zza.zzx(f14);
        } catch (RemoteException e4) {
            a.i(e4);
        }
    }
}
