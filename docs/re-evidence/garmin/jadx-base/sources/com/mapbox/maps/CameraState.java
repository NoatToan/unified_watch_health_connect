package com.mapbox.maps;

import com.mapbox.bindgen.PartialEq;
import com.mapbox.bindgen.RecordUtils;
import com.mapbox.common.BaseMapboxInitializer;
import com.mapbox.geojson.Point;
import com.mapbox.maps.loader.MapboxMapsInitializerImpl;
import java.io.Serializable;
import java.util.Objects;

/* JADX INFO: loaded from: classes2.dex */
public final class CameraState implements Serializable {
    private final double bearing;
    private final Point center;
    private final EdgeInsets padding;
    private final double pitch;
    private final double zoom;

    static {
        BaseMapboxInitializer.init(MapboxMapsInitializerImpl.class);
    }

    public CameraState(Point point, EdgeInsets edgeInsets, double d14, double d15, double d16) {
        this.center = point;
        this.padding = edgeInsets;
        this.zoom = d14;
        this.bearing = d15;
        this.pitch = d16;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || CameraState.class != obj.getClass()) {
            return false;
        }
        CameraState cameraState = (CameraState) obj;
        return Objects.equals(this.center, cameraState.center) && Objects.equals(this.padding, cameraState.padding) && PartialEq.compare(this.zoom, cameraState.zoom) && PartialEq.compare(this.bearing, cameraState.bearing) && PartialEq.compare(this.pitch, cameraState.pitch);
    }

    public double getBearing() {
        return this.bearing;
    }

    public Point getCenter() {
        return this.center;
    }

    public EdgeInsets getPadding() {
        return this.padding;
    }

    public double getPitch() {
        return this.pitch;
    }

    public double getZoom() {
        return this.zoom;
    }

    public int hashCode() {
        return Objects.hash(this.center, this.padding, Double.valueOf(this.zoom), Double.valueOf(this.bearing), Double.valueOf(this.pitch));
    }

    public String toString() {
        StringBuilder sb3 = new StringBuilder("[center: ");
        sb3.append(RecordUtils.fieldToString(this.center));
        sb3.append(", padding: ");
        sb3.append(RecordUtils.fieldToString(this.padding));
        sb3.append(", zoom: ");
        com.google.protobuf.a.c(this.zoom, ", bearing: ", sb3);
        com.google.protobuf.a.c(this.bearing, ", pitch: ", sb3);
        sb3.append(RecordUtils.fieldToString(Double.valueOf(this.pitch)));
        sb3.append("]");
        return sb3.toString();
    }
}
