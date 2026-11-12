package com.google.android.gms.maps.model;

import android.os.RemoteException;
import com.google.android.gms.internal.maps.zzbn;
import com.google.android.gms.internal.measurement.a;
import java.util.Map;

/* JADX INFO: loaded from: classes14.dex */
public final class DatasetFeature extends Feature {
    private final com.google.android.gms.internal.maps.zzr zza;

    public DatasetFeature(com.google.android.gms.internal.maps.zzr zzrVar) {
        super(zzrVar);
        this.zza = zzrVar;
    }

    public Map<String, String> getDatasetAttributes() {
        try {
            return zzbn.zzc(this.zza.zzh().entrySet());
        } catch (RemoteException e4) {
            a.i(e4);
            return null;
        }
    }

    public String getDatasetId() {
        try {
            return this.zza.zze();
        } catch (RemoteException e4) {
            a.i(e4);
            return null;
        }
    }
}
