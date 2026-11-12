package com.google.android.gms.maps;

import android.os.RemoteException;
import com.google.android.gms.maps.internal.IStreetViewPanoramaDelegate;
import com.google.android.gms.maps.internal.zzbq;

/* JADX INFO: loaded from: classes3.dex */
final class k extends zzbq {
    private final /* synthetic */ OnStreetViewPanoramaReadyCallback b;

    public k(SupportStreetViewPanoramaFragment.a aVar, OnStreetViewPanoramaReadyCallback onStreetViewPanoramaReadyCallback) {
        this.b = onStreetViewPanoramaReadyCallback;
    }

    @Override // com.google.android.gms.maps.internal.zzbp
    public final void zza(IStreetViewPanoramaDelegate iStreetViewPanoramaDelegate) throws RemoteException {
        this.b.onStreetViewPanoramaReady(new StreetViewPanorama(iStreetViewPanoramaDelegate));
    }
}
