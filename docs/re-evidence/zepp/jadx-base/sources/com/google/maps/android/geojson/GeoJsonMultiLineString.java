package com.google.maps.android.geojson;

import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public class GeoJsonMultiLineString implements GeoJsonGeometry {
    private static final String b = "MultiLineString";
    private final List<GeoJsonLineString> a;

    public GeoJsonMultiLineString(List<GeoJsonLineString> list) {
        if (list == null) {
            throw new IllegalArgumentException("GeoJsonLineStrings cannot be null");
        }
        this.a = list;
    }

    public List<GeoJsonLineString> getLineStrings() {
        return this.a;
    }

    @Override // com.google.maps.android.geojson.GeoJsonGeometry
    public String getType() {
        return b;
    }

    public String toString() {
        return b + "{\n LineStrings=" + this.a + "\n}\n";
    }
}
