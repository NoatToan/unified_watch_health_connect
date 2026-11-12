package com.google.android.gms.maps.model;

import android.os.RemoteException;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.dynamic.ObjectWrapper;
import com.google.android.gms.internal.maps.zzar;
import com.google.android.gms.internal.measurement.a;
import java.util.List;

/* JADX INFO: loaded from: classes14.dex */
public final class Polyline {
    private final zzar zza;

    public Polyline(zzar zzarVar) {
        this.zza = (zzar) Preconditions.checkNotNull(zzarVar);
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof Polyline)) {
            return false;
        }
        try {
            return this.zza.zzD(((Polyline) obj).zza);
        } catch (RemoteException e4) {
            a.i(e4);
            return false;
        }
    }

    public int getColor() {
        try {
            return this.zza.zzf();
        } catch (RemoteException e4) {
            a.i(e4);
            return 0;
        }
    }

    public Cap getEndCap() {
        try {
            return this.zza.zzj().zza();
        } catch (RemoteException e4) {
            a.i(e4);
            return null;
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

    public int getJointType() {
        try {
            return this.zza.zzg();
        } catch (RemoteException e4) {
            a.i(e4);
            return 0;
        }
    }

    public List<PatternItem> getPattern() {
        try {
            return PatternItem.zza(this.zza.zzm());
        } catch (RemoteException e4) {
            a.i(e4);
            return null;
        }
    }

    public List<LatLng> getPoints() {
        try {
            return this.zza.zzn();
        } catch (RemoteException e4) {
            a.i(e4);
            return null;
        }
    }

    public List<StyleSpan> getSpans() {
        try {
            return this.zza.zzo();
        } catch (RemoteException e4) {
            a.i(e4);
            return null;
        }
    }

    public Cap getStartCap() {
        try {
            return this.zza.zzk().zza();
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

    public float getWidth() {
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
            return this.zza.zzh();
        } catch (RemoteException e4) {
            a.i(e4);
            return 0;
        }
    }

    public boolean isClickable() {
        try {
            return this.zza.zzE();
        } catch (RemoteException e4) {
            a.i(e4);
            return false;
        }
    }

    public boolean isGeodesic() {
        try {
            return this.zza.zzF();
        } catch (RemoteException e4) {
            a.i(e4);
            return false;
        }
    }

    public boolean isVisible() {
        try {
            return this.zza.zzG();
        } catch (RemoteException e4) {
            a.i(e4);
            return false;
        }
    }

    public void remove() {
        try {
            this.zza.zzp();
        } catch (RemoteException e4) {
            a.i(e4);
        }
    }

    public void setClickable(boolean z14) {
        try {
            this.zza.zzq(z14);
        } catch (RemoteException e4) {
            a.i(e4);
        }
    }

    public void setColor(int i14) {
        try {
            this.zza.zzr(i14);
        } catch (RemoteException e4) {
            a.i(e4);
        }
    }

    public void setEndCap(Cap cap) {
        Preconditions.checkNotNull(cap, "endCap must not be null");
        try {
            this.zza.zzs(cap);
        } catch (RemoteException e4) {
            a.i(e4);
        }
    }

    public void setGeodesic(boolean z14) {
        try {
            this.zza.zzt(z14);
        } catch (RemoteException e4) {
            a.i(e4);
        }
    }

    public void setJointType(int i14) {
        try {
            this.zza.zzu(i14);
        } catch (RemoteException e4) {
            a.i(e4);
        }
    }

    public void setPattern(List<PatternItem> list) {
        try {
            this.zza.zzv(list);
        } catch (RemoteException e4) {
            a.i(e4);
        }
    }

    public void setPoints(List<LatLng> list) {
        Preconditions.checkNotNull(list, "points must not be null");
        try {
            this.zza.zzw(list);
        } catch (RemoteException e4) {
            a.i(e4);
        }
    }

    public void setSpans(List<StyleSpan> list) {
        try {
            this.zza.zzx(list);
        } catch (RemoteException e4) {
            a.i(e4);
        }
    }

    public void setStartCap(Cap cap) {
        Preconditions.checkNotNull(cap, "startCap must not be null");
        try {
            this.zza.zzy(cap);
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

    public void setVisible(boolean z14) {
        try {
            this.zza.zzA(z14);
        } catch (RemoteException e4) {
            a.i(e4);
        }
    }

    public void setWidth(float f14) {
        try {
            this.zza.zzB(f14);
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
}
