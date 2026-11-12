package com.google.android.gms.maps.model;

import android.os.IBinder;
import android.os.RemoteException;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.internal.measurement.a;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes14.dex */
public final class FeatureClickEvent {
    private final com.google.android.gms.internal.maps.zzo zza;

    public FeatureClickEvent(com.google.android.gms.internal.maps.zzo zzoVar) {
        this.zza = (com.google.android.gms.internal.maps.zzo) Preconditions.checkNotNull(zzoVar);
    }

    public List<Feature> getFeatures() {
        try {
            List listZze = this.zza.zze();
            ArrayList arrayList = new ArrayList(listZze.size());
            Iterator it = listZze.iterator();
            while (it.hasNext()) {
                Feature featureZza = Feature.zza(com.google.android.gms.internal.maps.zzq.zzb((IBinder) it.next()));
                if (featureZza != null) {
                    arrayList.add(featureZza);
                }
            }
            return arrayList;
        } catch (RemoteException e4) {
            a.i(e4);
            return null;
        }
    }

    public LatLng getLatLng() {
        try {
            return this.zza.zzd();
        } catch (RemoteException e4) {
            a.i(e4);
            return null;
        }
    }
}
