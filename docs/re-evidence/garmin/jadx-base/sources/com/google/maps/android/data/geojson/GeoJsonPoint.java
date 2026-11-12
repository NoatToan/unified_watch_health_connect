package com.google.maps.android.data.geojson;

import com.google.android.gms.maps.model.LatLng;
import com.google.maps.android.data.Point;

/* JADX INFO: loaded from: classes2.dex */
public class GeoJsonPoint extends Point {
    private final Double mAltitude;

    public GeoJsonPoint(LatLng latLng, Double d14) {
        super(latLng);
        this.mAltitude = d14;
    }

    public Double getAltitude() {
        return this.mAltitude;
    }

    public LatLng getCoordinates() {
        return getGeometryObject();
    }

    public String getType() {
        return getGeometryType();
    }

    public GeoJsonPoint(LatLng latLng) {
        this(latLng, null);
    }
}
