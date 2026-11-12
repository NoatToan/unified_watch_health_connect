package com.mapbox.maps;

import com.mapbox.geojson.Point;

/* JADX INFO: loaded from: classes2.dex */
public interface ElevationData {
    Double getElevation(Point point);

    double getTerrainExaggeration();
}
