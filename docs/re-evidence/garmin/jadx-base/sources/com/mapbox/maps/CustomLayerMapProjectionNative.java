package com.mapbox.maps;

import com.mapbox.bindgen.CleanerService;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
final class CustomLayerMapProjectionNative implements CustomLayerMapProjection {
    protected long peer;

    public static class CustomLayerMapProjectionPeerCleaner implements Runnable {
        private long peer;

        public CustomLayerMapProjectionPeerCleaner(long j8) {
            this.peer = j8;
        }

        @Override // java.lang.Runnable
        public void run() {
            CustomLayerMapProjectionNative.cleanNativePeer(this.peer);
        }
    }

    public CustomLayerMapProjectionNative(long j8) {
        this.peer = j8;
        CleanerService.register(this, new CustomLayerMapProjectionPeerCleaner(j8));
    }

    public static native void cleanNativePeer(long j8);

    @Override // com.mapbox.maps.CustomLayerMapProjection
    public native List<Double> convertMercatorModelMatrix(List<Double> list, boolean z14);

    @Override // com.mapbox.maps.CustomLayerMapProjection
    public native List<Double> getModelMatrix();

    @Override // com.mapbox.maps.CustomLayerMapProjection
    public native List<Double> getTransitionMatrix();

    @Override // com.mapbox.maps.CustomLayerMapProjection
    public native float getTransitionPhase();
}
