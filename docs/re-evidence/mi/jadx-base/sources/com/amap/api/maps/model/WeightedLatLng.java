package com.amap.api.maps.model;

import com.autonavi.amap.mapcore.DPoint;
import defpackage.zns;

/* JADX INFO: loaded from: classes4.dex */
public class WeightedLatLng {
    public static final double DEFAULT_INTENSITY = 1.0d;
    public final double intensity;
    public final LatLng latLng;
    private DPoint mPoint;

    public WeightedLatLng(LatLng latLng, double d) {
        if (latLng == null) {
            throw new IllegalArgumentException("latLng can not null");
        }
        this.latLng = latLng;
        this.mPoint = zns.s(latLng);
        if (d >= 0.0d) {
            this.intensity = d;
        } else {
            this.intensity = 1.0d;
        }
    }

    public DPoint getPoint() {
        return this.mPoint;
    }

    public WeightedLatLng(LatLng latLng) {
        this(latLng, 1.0d);
    }
}
