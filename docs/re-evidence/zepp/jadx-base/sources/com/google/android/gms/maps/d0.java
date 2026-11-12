package com.google.android.gms.maps;

import android.os.RemoteException;
import com.google.android.gms.maps.internal.zzbc;
import com.google.android.gms.maps.model.PointOfInterest;

/* JADX INFO: loaded from: classes3.dex */
final class d0 extends zzbc {
    private final /* synthetic */ GoogleMap.OnPoiClickListener b;

    public d0(GoogleMap googleMap, GoogleMap.OnPoiClickListener onPoiClickListener) {
        this.b = onPoiClickListener;
    }

    @Override // com.google.android.gms.maps.internal.zzbb
    public final void zza(PointOfInterest pointOfInterest) throws RemoteException {
        this.b.onPoiClick(pointOfInterest);
    }
}
