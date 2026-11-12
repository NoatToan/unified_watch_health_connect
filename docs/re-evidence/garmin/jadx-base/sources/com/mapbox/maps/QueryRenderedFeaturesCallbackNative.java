package com.mapbox.maps;

import com.mapbox.bindgen.CleanerService;
import com.mapbox.bindgen.Expected;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
final class QueryRenderedFeaturesCallbackNative implements QueryRenderedFeaturesCallback {
    private long peer;

    public static class QueryRenderedFeaturesCallbackPeerCleaner implements Runnable {
        private long peer;

        public QueryRenderedFeaturesCallbackPeerCleaner(long j8) {
            this.peer = j8;
        }

        @Override // java.lang.Runnable
        public void run() {
            QueryRenderedFeaturesCallbackNative.cleanNativePeer(this.peer);
        }
    }

    private QueryRenderedFeaturesCallbackNative(long j8) {
        this.peer = j8;
        CleanerService.register(this, new QueryRenderedFeaturesCallbackPeerCleaner(j8));
    }

    public static native void cleanNativePeer(long j8);

    @Override // com.mapbox.maps.QueryRenderedFeaturesCallback
    public native void run(Expected<String, List<QueriedRenderedFeature>> expected);
}
