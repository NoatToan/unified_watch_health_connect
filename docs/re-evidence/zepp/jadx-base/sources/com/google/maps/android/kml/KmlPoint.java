package com.google.maps.android.kml;

import com.google.android.gms.maps.model.LatLng;

/* JADX INFO: loaded from: classes3.dex */
public class KmlPoint implements KmlGeometry<LatLng> {
    public static final String GEOMETRY_TYPE = "Point";
    private final LatLng a;

    public KmlPoint(LatLng latLng) {
        if (latLng == null) {
            throw new IllegalArgumentException("Coordinates cannot be null");
        }
        this.a = latLng;
    }

    @Override // com.google.maps.android.kml.KmlGeometry
    public String getGeometryType() {
        return GEOMETRY_TYPE;
    }

    public String toString() {
        return GEOMETRY_TYPE + "{\n coordinates=" + this.a + "\n}\n";
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // com.google.maps.android.kml.KmlGeometry
    public LatLng getGeometryObject() {
        return this.a;
    }
}
