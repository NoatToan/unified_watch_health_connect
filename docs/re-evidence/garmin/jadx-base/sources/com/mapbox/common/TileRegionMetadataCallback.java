package com.mapbox.common;

import com.mapbox.bindgen.Expected;
import com.mapbox.bindgen.Value;

/* JADX INFO: loaded from: classes2.dex */
public interface TileRegionMetadataCallback {
    void run(Expected<TileRegionError, Value> expected);
}
