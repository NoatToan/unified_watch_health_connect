package com.mapbox.maps;

import com.mapbox.bindgen.CleanerService;
import com.mapbox.common.BaseMapboxInitializer;
import com.mapbox.geojson.Point;
import com.mapbox.maps.loader.MapboxMapsInitializerImpl;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
final class MapSnapshot {
    protected long peer;

    public static class MapSnapshotPeerCleaner implements Runnable {
        private long peer;

        public MapSnapshotPeerCleaner(long j8) {
            this.peer = j8;
        }

        @Override // java.lang.Runnable
        public void run() {
            MapSnapshot.cleanNativePeer(this.peer);
        }
    }

    static {
        BaseMapboxInitializer.init(MapboxMapsInitializerImpl.class);
    }

    public MapSnapshot(long j8) {
        setPeer(j8);
    }

    public static native void cleanNativePeer(long j8);

    private void setPeer(long j8) {
        this.peer = j8;
        if (j8 == 0) {
            return;
        }
        CleanerService.register(this, new MapSnapshotPeerCleaner(j8));
    }

    public native List<String> attributions();

    public native Point coordinate(ScreenCoordinate screenCoordinate);

    public native Image moveImage();

    public native ScreenCoordinate screenCoordinate(Point point);
}
