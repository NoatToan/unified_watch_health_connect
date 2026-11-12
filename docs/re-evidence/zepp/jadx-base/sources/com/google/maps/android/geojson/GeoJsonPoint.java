package com.google.maps.android.geojson;

import com.google.android.gms.maps.model.LatLng;

/* JADX INFO: loaded from: classes3.dex */
public class GeoJsonPoint implements GeoJsonGeometry {
    private static final String b = "Point";
    private final LatLng a;

    public GeoJsonPoint(LatLng latLng) {
        if (latLng == null) {
            throw new IllegalArgumentException("Coordinate cannot be null");
        }
        this.a = latLng;
    }

    public LatLng getCoordinates() {
        return this.a;
    }

    @Override // com.google.maps.android.geojson.GeoJsonGeometry
    public String getType() {
        return "Point";
    }

    public String toString() {
        return "Point{\n coordinates=" + this.a + "\n}\n";
    }
}
