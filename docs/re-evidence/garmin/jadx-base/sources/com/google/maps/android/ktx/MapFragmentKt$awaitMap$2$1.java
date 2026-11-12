package com.google.maps.android.ktx;

import ch.qos.logback.core.net.SyslogConstants;
import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.OnMapReadyCallback;
import o13.q;
import o53.j;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(k = 3, mv = {2, 1, 0}, xi = SyslogConstants.LOG_LOCAL6)
public final class MapFragmentKt$awaitMap$2$1 implements OnMapReadyCallback {
    final /* synthetic */ j<GoogleMap> $continuation;

    /* JADX WARN: Multi-variable type inference failed */
    public MapFragmentKt$awaitMap$2$1(j<? super GoogleMap> jVar) {
        this.$continuation = jVar;
    }

    @Override // com.google.android.gms.maps.OnMapReadyCallback
    public final void onMapReady(GoogleMap googleMap) {
        googleMap.getClass();
        j<GoogleMap> jVar = this.$continuation;
        int i14 = q.f128596b;
        jVar.resumeWith(googleMap);
    }
}
