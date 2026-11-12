package com.mapbox.common;

import com.mapbox.bindgen.Expected;
import com.mapbox.geojson.Geometry;

/* JADX INFO: loaded from: classes2.dex */
public interface TileRegionGeometryCallback {
    void run(Expected<TileRegionError, Geometry> expected);
}
