package com.google.maps.android.geojson;

import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public class GeoJsonMultiPoint implements GeoJsonGeometry {
    private static final String b = "MultiPoint";
    private final List<GeoJsonPoint> a;

    public GeoJsonMultiPoint(List<GeoJsonPoint> list) {
        if (list == null) {
            throw new IllegalArgumentException("GeoJsonPoints cannot be null");
        }
        this.a = list;
    }

    public List<GeoJsonPoint> getPoints() {
        return this.a;
    }

    @Override // com.google.maps.android.geojson.GeoJsonGeometry
    public String getType() {
        return b;
    }

    public String toString() {
        return b + "{\n points=" + this.a + "\n}\n";
    }
}
