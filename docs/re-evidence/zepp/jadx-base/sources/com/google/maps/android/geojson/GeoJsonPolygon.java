package com.google.maps.android.geojson;

import com.google.android.gms.maps.model.LatLng;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public class GeoJsonPolygon implements GeoJsonGeometry {
    private static final String b = "Polygon";
    private final List<? extends List<LatLng>> a;

    public GeoJsonPolygon(List<? extends List<LatLng>> list) {
        if (list == null) {
            throw new IllegalArgumentException("Coordinates cannot be null");
        }
        this.a = list;
    }

    public List<? extends List<LatLng>> getCoordinates() {
        return this.a;
    }

    @Override // com.google.maps.android.geojson.GeoJsonGeometry
    public String getType() {
        return "Polygon";
    }

    public String toString() {
        return "Polygon{\n coordinates=" + this.a + "\n}\n";
    }
}
