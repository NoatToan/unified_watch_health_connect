package com.mapbox.common;

import com.mapbox.bindgen.Expected;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public interface TileRegionsCallback {
    void run(Expected<TileRegionError, List<TileRegion>> expected);
}
