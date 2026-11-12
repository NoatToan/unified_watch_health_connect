package com.google.android.gms.maps;

import android.os.RemoteException;
import com.google.android.gms.maps.internal.IStreetViewPanoramaDelegate;
import com.google.android.gms.maps.internal.zzbq;

/* JADX INFO: loaded from: classes21.dex */
final class zzah extends zzbq {
    private final /* synthetic */ OnStreetViewPanoramaReadyCallback zzbu;

    @Override // com.google.android.gms.maps.internal.zzbp
    public final void zza(IStreetViewPanoramaDelegate iStreetViewPanoramaDelegate) throws RemoteException {
        this.zzbu.onStreetViewPanoramaReady(new StreetViewPanorama(iStreetViewPanoramaDelegate));
    }

    zzah(StreetViewPanoramaFragment.zza zzaVar, OnStreetViewPanoramaReadyCallback onStreetViewPanoramaReadyCallback) {
        this.zzbu = onStreetViewPanoramaReadyCallback;
    }
}
