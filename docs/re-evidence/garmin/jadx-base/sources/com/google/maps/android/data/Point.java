package com.google.maps.android.data;

import com.google.android.gms.maps.model.LatLng;
import vb.h;

/* JADX INFO: loaded from: classes2.dex */
public class Point implements Geometry {
    private static final String GEOMETRY_TYPE = "Point";
    private final LatLng mCoordinates;

    public Point(LatLng latLng) {
        if (latLng != null) {
            this.mCoordinates = latLng;
        } else {
            h.s("Coordinates cannot be null");
            throw null;
        }
    }

    @Override // com.google.maps.android.data.Geometry
    public String getGeometryType() {
        return GEOMETRY_TYPE;
    }

    public String toString() {
        return "Point{\n coordinates=" + this.mCoordinates + "\n}\n";
    }

    @Override // com.google.maps.android.data.Geometry
    public LatLng getGeometryObject() {
        return this.mCoordinates;
    }
}
