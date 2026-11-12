package com.google.android.gms.maps;

import android.location.Location;
import android.os.RemoteException;
import com.google.android.gms.maps.internal.zzah;
import com.google.android.gms.maps.model.RuntimeRemoteException;

/* JADX INFO: loaded from: classes3.dex */
final class x implements LocationSource.OnLocationChangedListener {
    private final /* synthetic */ zzah a;

    public x(w wVar, zzah zzahVar) {
        this.a = zzahVar;
    }

    @Override // com.google.android.gms.maps.LocationSource.OnLocationChangedListener
    public final void onLocationChanged(Location location) {
        try {
            this.a.zza(location);
        } catch (RemoteException e) {
            throw new RuntimeRemoteException(e);
        }
    }
}
