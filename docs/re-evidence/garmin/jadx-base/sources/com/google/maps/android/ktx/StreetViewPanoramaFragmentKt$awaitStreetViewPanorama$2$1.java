package com.google.maps.android.ktx;

import ch.qos.logback.core.net.SyslogConstants;
import com.google.android.gms.maps.OnStreetViewPanoramaReadyCallback;
import com.google.android.gms.maps.StreetViewPanorama;
import o13.q;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(k = 3, mv = {2, 1, 0}, xi = SyslogConstants.LOG_LOCAL6)
public final class StreetViewPanoramaFragmentKt$awaitStreetViewPanorama$2$1 implements OnStreetViewPanoramaReadyCallback {
    final /* synthetic */ t13.d<StreetViewPanorama> $continuation;

    /* JADX WARN: Multi-variable type inference failed */
    public StreetViewPanoramaFragmentKt$awaitStreetViewPanorama$2$1(t13.d<? super StreetViewPanorama> dVar) {
        this.$continuation = dVar;
    }

    @Override // com.google.android.gms.maps.OnStreetViewPanoramaReadyCallback
    public final void onStreetViewPanoramaReady(StreetViewPanorama streetViewPanorama) {
        streetViewPanorama.getClass();
        t13.d<StreetViewPanorama> dVar = this.$continuation;
        int i14 = q.f128596b;
        dVar.resumeWith(streetViewPanorama);
    }
}
