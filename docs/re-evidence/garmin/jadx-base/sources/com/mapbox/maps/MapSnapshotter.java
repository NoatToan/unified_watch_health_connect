package com.mapbox.maps;

import com.mapbox.bindgen.CleanerService;
import com.mapbox.common.BaseMapboxInitializer;
import com.mapbox.geojson.Point;
import com.mapbox.maps.loader.MapboxMapsInitializerImpl;

/* JADX INFO: loaded from: classes2.dex */
final class MapSnapshotter extends CameraManager {

    public static class MapSnapshotterPeerCleaner implements Runnable {
        private long peer;

        public MapSnapshotterPeerCleaner(long j8) {
            this.peer = j8;
        }

        @Override // java.lang.Runnable
        public void run() {
            MapSnapshotter.cleanNativePeer(this.peer);
        }
    }

    static {
        BaseMapboxInitializer.init(MapboxMapsInitializerImpl.class);
    }

    public MapSnapshotter(MapSnapshotOptions mapSnapshotOptions) {
        super(0L);
        initialize(mapSnapshotOptions);
    }

    public static native void cleanNativePeer(long j8);

    private native void initialize(MapSnapshotOptions mapSnapshotOptions);

    private void setPeer(long j8) {
        this.peer = j8;
        if (j8 == 0) {
            return;
        }
        CleanerService.register(this, new MapSnapshotterPeerCleaner(j8));
    }

    public native void cancel();

    public native Double getElevation(Point point);

    public native Size getSize();

    public native void reduceMemoryUse();

    public native void setSize(Size size);

    public native void start(SnapshotCompleteCallback snapshotCompleteCallback);

    public MapSnapshotter(long j8) {
        super(0L);
        setPeer(j8);
    }
}
