package com.mapbox.maps;

import com.mapbox.bindgen.PartialEq;
import com.mapbox.bindgen.RecordUtils;
import com.mapbox.common.BaseMapboxInitializer;
import com.mapbox.maps.loader.MapboxMapsInitializerImpl;
import java.io.Serializable;
import java.util.Objects;

/* JADX INFO: loaded from: classes2.dex */
public final class CoordinateBoundsZoom implements Serializable {
    private final CoordinateBounds bounds;
    private final double zoom;

    static {
        BaseMapboxInitializer.init(MapboxMapsInitializerImpl.class);
    }

    public CoordinateBoundsZoom(CoordinateBounds coordinateBounds, double d14) {
        this.bounds = coordinateBounds;
        this.zoom = d14;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || CoordinateBoundsZoom.class != obj.getClass()) {
            return false;
        }
        CoordinateBoundsZoom coordinateBoundsZoom = (CoordinateBoundsZoom) obj;
        return Objects.equals(this.bounds, coordinateBoundsZoom.bounds) && PartialEq.compare(this.zoom, coordinateBoundsZoom.zoom);
    }

    public CoordinateBounds getBounds() {
        return this.bounds;
    }

    public double getZoom() {
        return this.zoom;
    }

    public int hashCode() {
        return Objects.hash(this.bounds, Double.valueOf(this.zoom));
    }

    public String toString() {
        return "[bounds: " + RecordUtils.fieldToString(this.bounds) + ", zoom: " + RecordUtils.fieldToString(Double.valueOf(this.zoom)) + "]";
    }
}
