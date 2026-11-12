package com.google.android.gms.maps;

import android.location.Location;
import android.os.RemoteException;
import com.google.android.gms.internal.measurement.a;

/* JADX INFO: loaded from: classes14.dex */
final class zzl implements LocationSource.OnLocationChangedListener {
    final /* synthetic */ com.google.android.gms.maps.internal.zzaj zza;

    public zzl(zzt zztVar, com.google.android.gms.maps.internal.zzaj zzajVar) {
        this.zza = zzajVar;
    }

    @Override // com.google.android.gms.maps.LocationSource.OnLocationChangedListener
    public final void onLocationChanged(Location location) {
        try {
            this.zza.zzd(location);
        } catch (RemoteException e4) {
            a.i(e4);
        }
    }
}
