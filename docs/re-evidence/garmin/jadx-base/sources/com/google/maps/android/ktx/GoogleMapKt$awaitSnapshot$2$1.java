package com.google.maps.android.ktx;

import android.graphics.Bitmap;
import ch.qos.logback.core.net.SyslogConstants;
import com.google.android.gms.maps.GoogleMap;
import o13.q;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(k = 3, mv = {2, 1, 0}, xi = SyslogConstants.LOG_LOCAL6)
public final class GoogleMapKt$awaitSnapshot$2$1 implements GoogleMap.SnapshotReadyCallback {
    final /* synthetic */ t13.d<Bitmap> $continuation;

    /* JADX WARN: Multi-variable type inference failed */
    public GoogleMapKt$awaitSnapshot$2$1(t13.d<? super Bitmap> dVar) {
        this.$continuation = dVar;
    }

    @Override // com.google.android.gms.maps.GoogleMap.SnapshotReadyCallback
    public final void onSnapshotReady(Bitmap bitmap) {
        t13.d<Bitmap> dVar = this.$continuation;
        int i14 = q.f128596b;
        dVar.resumeWith(bitmap);
    }
}
