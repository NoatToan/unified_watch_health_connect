package com.google.maps.android.compose.streetview;

import com.google.android.gms.maps.OnStreetViewPanoramaReadyCallback;
import com.google.android.gms.maps.StreetViewPanorama;
import o13.q;
import p005kotlin.Metadata;
import t13.d;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
public final class StreetViewKt$newComposition$$inlined$awaitStreetViewPanorama$1 implements OnStreetViewPanoramaReadyCallback {
    final /* synthetic */ d $continuation;

    public StreetViewKt$newComposition$$inlined$awaitStreetViewPanorama$1(d dVar) {
        this.$continuation = dVar;
    }

    @Override // com.google.android.gms.maps.OnStreetViewPanoramaReadyCallback
    public final void onStreetViewPanoramaReady(StreetViewPanorama streetViewPanorama) {
        streetViewPanorama.getClass();
        d dVar = this.$continuation;
        int i14 = q.f128596b;
        dVar.resumeWith(streetViewPanorama);
    }
}
