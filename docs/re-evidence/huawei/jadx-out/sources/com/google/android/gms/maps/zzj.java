package com.google.android.gms.maps;

import android.location.Location;
import android.os.RemoteException;
import com.google.android.gms.maps.internal.zzba;

/* JADX INFO: loaded from: classes21.dex */
final class zzj extends zzba {
    private final /* synthetic */ GoogleMap.OnMyLocationClickListener zzr;

    @Override // com.google.android.gms.maps.internal.zzaz
    public final void onMyLocationClick(Location location) throws RemoteException {
        this.zzr.onMyLocationClick(location);
    }

    zzj(GoogleMap googleMap, GoogleMap.OnMyLocationClickListener onMyLocationClickListener) {
        this.zzr = onMyLocationClickListener;
    }
}
