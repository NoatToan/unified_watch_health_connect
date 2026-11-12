package com.google.android.gms.maps.model;

import android.os.RemoteException;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.dynamic.ObjectWrapper;
import com.google.android.gms.internal.maps.zzao;
import com.google.android.gms.internal.measurement.a;
import java.util.List;

/* JADX INFO: loaded from: classes14.dex */
public final class Polygon {
    private final zzao zza;

    public Polygon(zzao zzaoVar) {
        this.zza = (zzao) Preconditions.checkNotNull(zzaoVar);
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof Polygon)) {
            return false;
        }
        try {
            return this.zza.zzB(((Polygon) obj).zza);
        } catch (RemoteException e4) {
            a.i(e4);
            return false;
        }
    }

    public int getFillColor() {
        try {
            return this.zza.zzf();
        } catch (RemoteException e4) {
            a.i(e4);
            return 0;
        }
    }

    public List<List<LatLng>> getHoles() {
        try {
            return this.zza.zzl();
        } catch (RemoteException e4) {
            a.i(e4);
            return null;
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

    public List<LatLng> getPoints() {
        try {
            return this.zza.zzm();
        } catch (RemoteException e4) {
            a.i(e4);
            return null;
        }
    }

    public int getStrokeColor() {
        try {
            return this.zza.zzg();
        } catch (RemoteException e4) {
            a.i(e4);
            return 0;
        }
    }

    public int getStrokeJointType() {
        try {
            return this.zza.zzh();
        } catch (RemoteException e4) {
            a.i(e4);
            return 0;
        }
    }

    public List<PatternItem> getStrokePattern() {
        try {
            return PatternItem.zza(this.zza.zzn());
        } catch (RemoteException e4) {
            a.i(e4);
            return null;
        }
    }

    public float getStrokeWidth() {
        try {
            return this.zza.zzd();
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
            return this.zza.zze();
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
            return this.zza.zzC();
        } catch (RemoteException e4) {
            a.i(e4);
            return false;
        }
    }

    public boolean isGeodesic() {
        try {
            return this.zza.zzD();
        } catch (RemoteException e4) {
            a.i(e4);
            return false;
        }
    }

    public boolean isVisible() {
        try {
            return this.zza.zzE();
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

    public void setGeodesic(boolean z14) {
        try {
            this.zza.zzr(z14);
        } catch (RemoteException e4) {
            a.i(e4);
        }
    }

    public void setHoles(List<? extends List<LatLng>> list) {
        try {
            this.zza.zzs(list);
        } catch (RemoteException e4) {
            a.i(e4);
        }
    }

    public void setPoints(List<LatLng> list) {
        try {
            Preconditions.checkNotNull(list, "points must not be null.");
            this.zza.zzt(list);
        } catch (RemoteException e4) {
            a.i(e4);
        }
    }

    public void setStrokeColor(int i14) {
        try {
            this.zza.zzu(i14);
        } catch (RemoteException e4) {
            a.i(e4);
        }
    }

    public void setStrokeJointType(int i14) {
        try {
            this.zza.zzv(i14);
        } catch (RemoteException e4) {
            a.i(e4);
        }
    }

    public void setStrokePattern(List<PatternItem> list) {
        try {
            this.zza.zzw(list);
        } catch (RemoteException e4) {
            a.i(e4);
        }
    }

    public void setStrokeWidth(float f14) {
        try {
            this.zza.zzx(f14);
        } catch (RemoteException e4) {
            a.i(e4);
        }
    }

    public void setTag(Object obj) {
        try {
            this.zza.zzy(ObjectWrapper.wrap(obj));
        } catch (RemoteException e4) {
            a.i(e4);
        }
    }

    public void setVisible(boolean z14) {
        try {
            this.zza.zzz(z14);
        } catch (RemoteException e4) {
            a.i(e4);
        }
    }

    public void setZIndex(float f14) {
        try {
            this.zza.zzA(f14);
        } catch (RemoteException e4) {
            a.i(e4);
        }
    }
}
