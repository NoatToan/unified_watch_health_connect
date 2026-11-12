package com.google.maps.android.geojson;

import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public class GeoJsonMultiPolygon implements GeoJsonGeometry {
    private static final String b = "MultiPolygon";
    private final List<GeoJsonPolygon> a;

    public GeoJsonMultiPolygon(List<GeoJsonPolygon> list) {
        if (list == null) {
            throw new IllegalArgumentException("GeoJsonPolygons cannot be null");
        }
        this.a = list;
    }

    public List<GeoJsonPolygon> getPolygons() {
        return this.a;
    }

    @Override // com.google.maps.android.geojson.GeoJsonGeometry
    public String getType() {
        return b;
    }

    public String toString() {
        return b + "{\n Polygons=" + this.a + "\n}\n";
    }
}
