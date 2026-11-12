package com.mapbox.maps;

import com.mapbox.bindgen.CleanerService;
import com.mapbox.common.BaseMapboxInitializer;
import com.mapbox.maps.loader.MapboxMapsInitializerImpl;

/* JADX INFO: loaded from: classes2.dex */
@Deprecated
public final class OfflineRegionManager {
    protected long peer;

    public static class OfflineRegionManagerPeerCleaner implements Runnable {
        private long peer;

        public OfflineRegionManagerPeerCleaner(long j8) {
            this.peer = j8;
        }

        @Override // java.lang.Runnable
        public void run() {
            OfflineRegionManager.cleanNativePeer(this.peer);
        }
    }

    static {
        BaseMapboxInitializer.init(MapboxMapsInitializerImpl.class);
    }

    public OfflineRegionManager() {
        initialize();
    }

    public static native void cleanNativePeer(long j8);

    private native void initialize();

    private void setPeer(long j8) {
        this.peer = j8;
        if (j8 == 0) {
            return;
        }
        CleanerService.register(this, new OfflineRegionManagerPeerCleaner(j8));
    }

    public native void createOfflineRegion(OfflineRegionGeometryDefinition offlineRegionGeometryDefinition, OfflineRegionCreateCallback offlineRegionCreateCallback);

    public native void createOfflineRegion(OfflineRegionTilePyramidDefinition offlineRegionTilePyramidDefinition, OfflineRegionCreateCallback offlineRegionCreateCallback);

    public native void getOfflineRegions(OfflineRegionCallback offlineRegionCallback);

    public native void mergeOfflineDatabase(String str, OfflineDatabaseMergeCallback offlineDatabaseMergeCallback);

    public native void setOfflineMapboxTileCountLimit(long j8);

    public OfflineRegionManager(long j8) {
        setPeer(j8);
    }
}
