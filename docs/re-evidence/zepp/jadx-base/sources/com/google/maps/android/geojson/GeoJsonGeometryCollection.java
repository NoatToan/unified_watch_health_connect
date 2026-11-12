package com.google.maps.android.geojson;

import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public class GeoJsonGeometryCollection implements GeoJsonGeometry {
    private static final String b = "GeometryCollection";
    private final List<GeoJsonGeometry> a;

    public GeoJsonGeometryCollection(List<GeoJsonGeometry> list) {
        if (list == null) {
            throw new IllegalArgumentException("Geometries cannot be null");
        }
        this.a = list;
    }

    public List<GeoJsonGeometry> getGeometries() {
        return this.a;
    }

    @Override // com.google.maps.android.geojson.GeoJsonGeometry
    public String getType() {
        return b;
    }

    public String toString() {
        return b + "{\n Geometries=" + this.a + "\n}\n";
    }
}
