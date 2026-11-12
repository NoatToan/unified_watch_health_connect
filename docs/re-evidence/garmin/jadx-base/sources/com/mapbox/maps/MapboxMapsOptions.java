package com.mapbox.maps;

import com.mapbox.common.TileStore;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0007\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R*\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u00048F@FX\u0087\u000e¢\u0006\u0012\u0012\u0004\b\u0006\u0010\u0002\u001a\u0004\b\u0007\u0010\b\"\u0004\b\t\u0010\nR*\u0010\u000b\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u00048F@FX\u0087\u000e¢\u0006\u0012\u0012\u0004\b\f\u0010\u0002\u001a\u0004\b\r\u0010\b\"\u0004\b\u000e\u0010\nR.\u0010\u0010\u001a\u0004\u0018\u00010\u000f2\b\u0010\u0003\u001a\u0004\u0018\u00010\u000f8F@FX\u0087\u000e¢\u0006\u0012\u0012\u0004\b\u0011\u0010\u0002\u001a\u0004\b\u0012\u0010\u0013\"\u0004\b\u0014\u0010\u0015R*\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0003\u001a\u00020\u00168F@FX\u0087\u000e¢\u0006\u0012\u0012\u0004\b\u0018\u0010\u0002\u001a\u0004\b\u0019\u0010\u001a\"\u0004\b\u001b\u0010\u001c¨\u0006\u001d"}, d2 = {"Lcom/mapbox/maps/MapboxMapsOptions;", "", "()V", "value", "", "baseUrl", "getBaseUrl$annotations", "getBaseUrl", "()Ljava/lang/String;", "setBaseUrl", "(Ljava/lang/String;)V", "dataPath", "getDataPath$annotations", "getDataPath", "setDataPath", "Lcom/mapbox/common/TileStore;", "tileStore", "getTileStore$annotations", "getTileStore", "()Lcom/mapbox/common/TileStore;", "setTileStore", "(Lcom/mapbox/common/TileStore;)V", "Lcom/mapbox/maps/TileStoreUsageMode;", "tileStoreUsageMode", "getTileStoreUsageMode$annotations", "getTileStoreUsageMode", "()Lcom/mapbox/maps/TileStoreUsageMode;", "setTileStoreUsageMode", "(Lcom/mapbox/maps/TileStoreUsageMode;)V", "maps-sdk_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
public final class MapboxMapsOptions {
    public static final MapboxMapsOptions INSTANCE = new MapboxMapsOptions();

    private MapboxMapsOptions() {
    }

    public static final String getBaseUrl() {
        String baseURL = MapsResourceOptions.getBaseURL();
        baseURL.getClass();
        return baseURL;
    }

    public static /* synthetic */ void getBaseUrl$annotations() {
    }

    public static final String getDataPath() {
        String dataPath = MapsResourceOptions.getDataPath();
        dataPath.getClass();
        return dataPath;
    }

    public static /* synthetic */ void getDataPath$annotations() {
    }

    public static final TileStore getTileStore() {
        return MapsResourceOptions.getTileStore();
    }

    public static /* synthetic */ void getTileStore$annotations() {
    }

    public static final TileStoreUsageMode getTileStoreUsageMode() {
        TileStoreUsageMode tileStoreUsageMode = MapsResourceOptions.getTileStoreUsageMode();
        tileStoreUsageMode.getClass();
        return tileStoreUsageMode;
    }

    public static /* synthetic */ void getTileStoreUsageMode$annotations() {
    }

    public static final void setBaseUrl(String str) {
        str.getClass();
        MapsResourceOptions.setBaseURL(str);
    }

    public static final void setDataPath(String str) {
        str.getClass();
        MapsResourceOptions.setDataPath(str);
    }

    public static final void setTileStore(TileStore tileStore) {
        MapsResourceOptions.setTileStore(tileStore);
    }

    public static final void setTileStoreUsageMode(TileStoreUsageMode tileStoreUsageMode) {
        tileStoreUsageMode.getClass();
        MapsResourceOptions.setTileStoreUsageMode(tileStoreUsageMode);
    }
}
