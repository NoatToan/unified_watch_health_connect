package com.mapbox.maps;

import com.mapbox.bindgen.CleanerService;
import com.mapbox.common.BaseMapboxInitializer;
import com.mapbox.common.TileStore;
import com.mapbox.maps.loader.MapboxMapsInitializerImpl;

/* JADX INFO: loaded from: classes2.dex */
public final class MapsResourceOptions {
    protected long peer;

    public static class MapsResourceOptionsPeerCleaner implements Runnable {
        private long peer;

        public MapsResourceOptionsPeerCleaner(long j8) {
            this.peer = j8;
        }

        @Override // java.lang.Runnable
        public void run() {
            MapsResourceOptions.cleanNativePeer(this.peer);
        }
    }

    static {
        BaseMapboxInitializer.init(MapboxMapsInitializerImpl.class);
    }

    public MapsResourceOptions(long j8) {
        setPeer(j8);
    }

    public static native void cleanNativePeer(long j8);

    public static native void clearData(AsyncOperationResultCallback asyncOperationResultCallback);

    public static native String getAssetPath();

    public static native String getBaseURL();

    public static native String getDataPath();

    public static native TileStore getTileStore();

    public static native TileStoreUsageMode getTileStoreUsageMode();

    public static native void setAssetPath(String str);

    public static native void setBaseURL(String str);

    public static native void setDataPath(String str);

    private void setPeer(long j8) {
        this.peer = j8;
        if (j8 == 0) {
            return;
        }
        CleanerService.register(this, new MapsResourceOptionsPeerCleaner(j8));
    }

    public static native void setTileStore(TileStore tileStore);

    public static native void setTileStoreUsageMode(TileStoreUsageMode tileStoreUsageMode);
}
