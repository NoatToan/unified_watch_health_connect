package com.google.maps.android.ktx;

import ch.qos.logback.core.net.SyslogConstants;
import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.OnMapReadyCallback;
import o13.q;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(k = 3, mv = {2, 1, 0}, xi = SyslogConstants.LOG_LOCAL6)
public final class MapViewKt$awaitMap$2$1 implements OnMapReadyCallback {
    final /* synthetic */ t13.d<GoogleMap> $continuation;

    /* JADX WARN: Multi-variable type inference failed */
    public MapViewKt$awaitMap$2$1(t13.d<? super GoogleMap> dVar) {
        this.$continuation = dVar;
    }

    @Override // com.google.android.gms.maps.OnMapReadyCallback
    public final void onMapReady(GoogleMap googleMap) {
        googleMap.getClass();
        t13.d<GoogleMap> dVar = this.$continuation;
        int i14 = q.f128596b;
        dVar.resumeWith(googleMap);
    }
}
