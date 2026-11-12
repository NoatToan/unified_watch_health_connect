package com.mapbox.maps;

import com.mapbox.bindgen.CleanerService;
import com.mapbox.bindgen.Expected;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
final class QuerySourceFeaturesCallbackNative implements QuerySourceFeaturesCallback {
    private long peer;

    public static class QuerySourceFeaturesCallbackPeerCleaner implements Runnable {
        private long peer;

        public QuerySourceFeaturesCallbackPeerCleaner(long j8) {
            this.peer = j8;
        }

        @Override // java.lang.Runnable
        public void run() {
            QuerySourceFeaturesCallbackNative.cleanNativePeer(this.peer);
        }
    }

    private QuerySourceFeaturesCallbackNative(long j8) {
        this.peer = j8;
        CleanerService.register(this, new QuerySourceFeaturesCallbackPeerCleaner(j8));
    }

    public static native void cleanNativePeer(long j8);

    @Override // com.mapbox.maps.QuerySourceFeaturesCallback
    public native void run(Expected<String, List<QueriedSourceFeature>> expected);
}
