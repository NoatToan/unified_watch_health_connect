package com.mapbox.maps;

import com.mapbox.bindgen.CleanerService;
import com.mapbox.geojson.Point;

/* JADX INFO: loaded from: classes2.dex */
final class ElevationDataNative implements ElevationData {
    protected long peer;

    public static class ElevationDataPeerCleaner implements Runnable {
        private long peer;

        public ElevationDataPeerCleaner(long j8) {
            this.peer = j8;
        }

        @Override // java.lang.Runnable
        public void run() {
            ElevationDataNative.cleanNativePeer(this.peer);
        }
    }

    public ElevationDataNative(long j8) {
        this.peer = j8;
        CleanerService.register(this, new ElevationDataPeerCleaner(j8));
    }

    public static native void cleanNativePeer(long j8);

    @Override // com.mapbox.maps.ElevationData
    public native Double getElevation(Point point);

    @Override // com.mapbox.maps.ElevationData
    public native double getTerrainExaggeration();
}
