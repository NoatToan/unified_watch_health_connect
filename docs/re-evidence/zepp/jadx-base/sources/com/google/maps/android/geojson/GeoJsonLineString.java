package com.google.maps.android.geojson;

import com.google.android.gms.maps.model.LatLng;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public class GeoJsonLineString implements GeoJsonGeometry {
    private static final String b = "LineString";
    private final List<LatLng> a;

    public GeoJsonLineString(List<LatLng> list) {
        if (list == null) {
            throw new IllegalArgumentException("Coordinates cannot be null");
        }
        this.a = list;
    }

    public List<LatLng> getCoordinates() {
        return this.a;
    }

    @Override // com.google.maps.android.geojson.GeoJsonGeometry
    public String getType() {
        return "LineString";
    }

    public String toString() {
        return "LineString{\n coordinates=" + this.a + "\n}\n";
    }
}
