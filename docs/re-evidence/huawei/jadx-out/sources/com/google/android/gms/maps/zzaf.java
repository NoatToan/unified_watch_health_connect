package com.google.android.gms.maps;

import com.google.android.gms.maps.internal.zzbm;
import com.google.android.gms.maps.model.StreetViewPanoramaOrientation;

/* JADX INFO: loaded from: classes21.dex */
final class zzaf extends zzbm {
    private final /* synthetic */ StreetViewPanorama.OnStreetViewPanoramaClickListener zzbq;

    @Override // com.google.android.gms.maps.internal.zzbl
    public final void onStreetViewPanoramaClick(StreetViewPanoramaOrientation streetViewPanoramaOrientation) {
        this.zzbq.onStreetViewPanoramaClick(streetViewPanoramaOrientation);
    }

    zzaf(StreetViewPanorama streetViewPanorama, StreetViewPanorama.OnStreetViewPanoramaClickListener onStreetViewPanoramaClickListener) {
        this.zzbq = onStreetViewPanoramaClickListener;
    }
}
