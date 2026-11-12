package com.google.maps.android.data.kml;

import com.google.android.gms.maps.model.LatLng;
import com.google.maps.android.data.Point;

/* JADX INFO: loaded from: classes2.dex */
public class KmlPoint extends Point {
    private final Double mAltitude;

    public KmlPoint(LatLng latLng, Double d14) {
        super(latLng);
        this.mAltitude = d14;
    }

    public Double getAltitude() {
        return this.mAltitude;
    }

    public KmlPoint(LatLng latLng) {
        this(latLng, null);
    }
}
