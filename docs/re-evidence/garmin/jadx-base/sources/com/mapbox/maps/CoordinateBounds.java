package com.mapbox.maps;

import com.mapbox.bindgen.RecordUtils;
import com.mapbox.common.BaseMapboxInitializer;
import com.mapbox.geojson.Point;
import com.mapbox.maps.loader.MapboxMapsInitializerImpl;
import java.io.Serializable;
import java.util.Objects;

/* JADX INFO: loaded from: classes2.dex */
public class CoordinateBounds implements Serializable {
    private final boolean infiniteBounds;
    private final Point northeast;
    private final Point southwest;

    static {
        BaseMapboxInitializer.init(MapboxMapsInitializerImpl.class);
    }

    public CoordinateBounds(Point point, Point point2) {
        this.southwest = point;
        this.northeast = point2;
        this.infiniteBounds = false;
    }

    public static native CoordinateBounds hull(Point point, Point point2);

    public static native CoordinateBounds singleton(Point point);

    public static native CoordinateBounds world();

    public native Point center();

    public native Point constrain(Point point);

    public native boolean contains(Point point, boolean z14);

    public native boolean contains(CoordinateBounds coordinateBounds, boolean z14);

    public native boolean containsLatitude(double d14);

    public native boolean containsLongitude(double d14);

    public native boolean crossesAntimeridian();

    public native double east();

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        CoordinateBounds coordinateBounds = (CoordinateBounds) obj;
        return Objects.equals(this.southwest, coordinateBounds.southwest) && Objects.equals(this.northeast, coordinateBounds.northeast) && this.infiniteBounds == coordinateBounds.infiniteBounds;
    }

    public native CoordinateBounds extend(Point point);

    public native CoordinateBounds extend(CoordinateBounds coordinateBounds);

    public boolean getInfiniteBounds() {
        return this.infiniteBounds;
    }

    public Point getNortheast() {
        return this.northeast;
    }

    public Point getSouthwest() {
        return this.southwest;
    }

    public int hashCode() {
        return Objects.hash(this.southwest, this.northeast, Boolean.valueOf(this.infiniteBounds));
    }

    public native boolean intersects(CoordinateBounds coordinateBounds, boolean z14);

    public native boolean isBounded();

    public native boolean isEmpty();

    public native boolean isValid();

    public native double latitudeSpan();

    public native double longitudeSpan();

    public native double north();

    public native Point northwest();

    public native double south();

    public native Point southeast();

    public String toString() {
        return "[southwest: " + RecordUtils.fieldToString(this.southwest) + ", northeast: " + RecordUtils.fieldToString(this.northeast) + ", infiniteBounds: " + RecordUtils.fieldToString(Boolean.valueOf(this.infiniteBounds)) + "]";
    }

    public native double west();

    public CoordinateBounds(Point point, Point point2, boolean z14) {
        this.southwest = point;
        this.northeast = point2;
        this.infiniteBounds = z14;
    }
}
