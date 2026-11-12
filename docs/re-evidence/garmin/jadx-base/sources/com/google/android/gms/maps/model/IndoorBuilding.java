package com.google.android.gms.maps.model;

import android.os.IBinder;
import android.os.RemoteException;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.internal.measurement.a;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes14.dex */
public final class IndoorBuilding {
    private final com.google.android.gms.internal.maps.zzaa zza;

    public IndoorBuilding(com.google.android.gms.internal.maps.zzaa zzaaVar) {
        zzl zzlVar = zzl.zza;
        this.zza = (com.google.android.gms.internal.maps.zzaa) Preconditions.checkNotNull(zzaaVar, "delegate");
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof IndoorBuilding)) {
            return false;
        }
        try {
            return this.zza.zzh(((IndoorBuilding) obj).zza);
        } catch (RemoteException e4) {
            a.i(e4);
            return false;
        }
    }

    public int getActiveLevelIndex() {
        try {
            return this.zza.zzd();
        } catch (RemoteException e4) {
            a.i(e4);
            return 0;
        }
    }

    public int getDefaultLevelIndex() {
        try {
            return this.zza.zze();
        } catch (RemoteException e4) {
            a.i(e4);
            return 0;
        }
    }

    public List<IndoorLevel> getLevels() {
        try {
            List listZzg = this.zza.zzg();
            ArrayList arrayList = new ArrayList(listZzg.size());
            Iterator it = listZzg.iterator();
            while (it.hasNext()) {
                arrayList.add(new IndoorLevel(com.google.android.gms.internal.maps.zzac.zzb((IBinder) it.next())));
            }
            return arrayList;
        } catch (RemoteException e4) {
            a.i(e4);
            return null;
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

    public boolean isUnderground() {
        try {
            return this.zza.zzi();
        } catch (RemoteException e4) {
            a.i(e4);
            return false;
        }
    }
}
