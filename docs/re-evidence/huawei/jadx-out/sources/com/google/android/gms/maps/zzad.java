package com.google.android.gms.maps;

import com.google.android.gms.maps.internal.zzbk;
import com.google.android.gms.maps.model.StreetViewPanoramaLocation;

/* JADX INFO: loaded from: classes21.dex */
final class zzad extends zzbk {
    private final /* synthetic */ StreetViewPanorama.OnStreetViewPanoramaChangeListener zzbo;

    @Override // com.google.android.gms.maps.internal.zzbj
    public final void onStreetViewPanoramaChange(StreetViewPanoramaLocation streetViewPanoramaLocation) {
        this.zzbo.onStreetViewPanoramaChange(streetViewPanoramaLocation);
    }

    zzad(StreetViewPanorama streetViewPanorama, StreetViewPanorama.OnStreetViewPanoramaChangeListener onStreetViewPanoramaChangeListener) {
        this.zzbo = onStreetViewPanoramaChangeListener;
    }
}
