package com.google.maps.android.ktx;

import ch.qos.logback.core.net.SyslogConstants;
import com.google.android.gms.maps.GoogleMap;
import o13.q;
import p005kotlin.Metadata;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(k = 3, mv = {2, 1, 0}, xi = SyslogConstants.LOG_LOCAL6)
public final class GoogleMapKt$awaitMapLoad$2$1 implements GoogleMap.OnMapLoadedCallback {
    final /* synthetic */ t13.d<Unit> $continuation;

    /* JADX WARN: Multi-variable type inference failed */
    public GoogleMapKt$awaitMapLoad$2$1(t13.d<? super Unit> dVar) {
        this.$continuation = dVar;
    }

    @Override // com.google.android.gms.maps.GoogleMap.OnMapLoadedCallback
    public final void onMapLoaded() {
        t13.d<Unit> dVar = this.$continuation;
        int i14 = q.f128596b;
        dVar.resumeWith(Unit.INSTANCE);
    }
}
