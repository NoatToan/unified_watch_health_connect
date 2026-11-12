package com.google.android.gms.maps.model;

import android.os.RemoteException;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.internal.maps.zzal;
import com.google.android.gms.internal.measurement.a;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes14.dex */
public final class FeatureLayer {
    private final com.google.android.gms.internal.maps.zzu zza;
    private StyleFactory zzb;
    private final Map zzc = new HashMap();

    public interface OnFeatureClickListener {
        void onFeatureClick(FeatureClickEvent featureClickEvent);
    }

    public interface StyleFactory {
        FeatureStyle getStyle(Feature feature);
    }

    public FeatureLayer(com.google.android.gms.internal.maps.zzu zzuVar) {
        this.zza = (com.google.android.gms.internal.maps.zzu) Preconditions.checkNotNull(zzuVar);
    }

    public final void addOnFeatureClickListener(OnFeatureClickListener onFeatureClickListener) {
        try {
            zze zzeVar = new zze(this, onFeatureClickListener);
            this.zzc.put(onFeatureClickListener, zzeVar);
            this.zza.zzf(zzeVar);
        } catch (RemoteException e4) {
            a.i(e4);
        }
    }

    public String getDatasetId() {
        try {
            return this.zza.zzd();
        } catch (RemoteException e4) {
            a.i(e4);
            return null;
        }
    }

    public StyleFactory getFeatureStyle() {
        return this.zzb;
    }

    @FeatureType
    public String getFeatureType() {
        try {
            return this.zza.zze();
        } catch (RemoteException e4) {
            a.i(e4);
            return null;
        }
    }

    public boolean isAvailable() {
        try {
            return this.zza.zzi();
        } catch (RemoteException e4) {
            a.i(e4);
            return false;
        }
    }

    public final void removeOnFeatureClickListener(OnFeatureClickListener onFeatureClickListener) {
        try {
            Map map = this.zzc;
            if (map.containsKey(onFeatureClickListener)) {
                this.zza.zzg((zzal) map.get(onFeatureClickListener));
                map.remove(onFeatureClickListener);
            }
        } catch (RemoteException e4) {
            a.i(e4);
        }
    }

    public void setFeatureStyle(StyleFactory styleFactory) {
        this.zzb = styleFactory;
        com.google.android.gms.internal.maps.zzu zzuVar = this.zza;
        if (styleFactory == null) {
            try {
                zzuVar.zzh(null);
                return;
            } catch (RemoteException e4) {
                a.i(e4);
                return;
            }
        }
        try {
            zzuVar.zzh(new zzd(this, styleFactory));
        } catch (RemoteException e14) {
            a.i(e14);
        }
    }
}
