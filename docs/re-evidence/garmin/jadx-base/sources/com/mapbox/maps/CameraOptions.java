package com.mapbox.maps;

import com.mapbox.bindgen.RecordUtils;
import com.mapbox.common.BaseMapboxInitializer;
import com.mapbox.geojson.Point;
import com.mapbox.maps.loader.MapboxMapsInitializerImpl;
import java.io.Serializable;
import java.util.Objects;

/* JADX INFO: loaded from: classes2.dex */
public final class CameraOptions implements Serializable {
    private final ScreenCoordinate anchor;
    private final Double bearing;
    private final Point center;
    private final EdgeInsets padding;
    private final Double pitch;
    private final Double zoom;

    public static final class Builder {
        private ScreenCoordinate anchor;
        private Double bearing;
        private Point center;
        private EdgeInsets padding;
        private Double pitch;
        private Double zoom;

        public Builder anchor(ScreenCoordinate screenCoordinate) {
            this.anchor = screenCoordinate;
            return this;
        }

        public Builder bearing(Double d14) {
            this.bearing = d14;
            return this;
        }

        public CameraOptions build() {
            return new CameraOptions(this.center, this.padding, this.anchor, this.zoom, this.bearing, this.pitch);
        }

        public Builder center(Point point) {
            this.center = point;
            return this;
        }

        public Builder padding(EdgeInsets edgeInsets) {
            this.padding = edgeInsets;
            return this;
        }

        public Builder pitch(Double d14) {
            this.pitch = d14;
            return this;
        }

        public Builder zoom(Double d14) {
            this.zoom = d14;
            return this;
        }
    }

    static {
        BaseMapboxInitializer.init(MapboxMapsInitializerImpl.class);
    }

    private CameraOptions(Point point, EdgeInsets edgeInsets, ScreenCoordinate screenCoordinate, Double d14, Double d15, Double d16) {
        this.center = point;
        this.padding = edgeInsets;
        this.anchor = screenCoordinate;
        this.zoom = d14;
        this.bearing = d15;
        this.pitch = d16;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || CameraOptions.class != obj.getClass()) {
            return false;
        }
        CameraOptions cameraOptions = (CameraOptions) obj;
        return Objects.equals(this.center, cameraOptions.center) && Objects.equals(this.padding, cameraOptions.padding) && Objects.equals(this.anchor, cameraOptions.anchor) && Objects.equals(this.zoom, cameraOptions.zoom) && Objects.equals(this.bearing, cameraOptions.bearing) && Objects.equals(this.pitch, cameraOptions.pitch);
    }

    public ScreenCoordinate getAnchor() {
        return this.anchor;
    }

    public Double getBearing() {
        return this.bearing;
    }

    public Point getCenter() {
        return this.center;
    }

    public EdgeInsets getPadding() {
        return this.padding;
    }

    public Double getPitch() {
        return this.pitch;
    }

    public Double getZoom() {
        return this.zoom;
    }

    public int hashCode() {
        return Objects.hash(this.center, this.padding, this.anchor, this.zoom, this.bearing, this.pitch);
    }

    public Builder toBuilder() {
        return new Builder().center(this.center).padding(this.padding).anchor(this.anchor).zoom(this.zoom).bearing(this.bearing).pitch(this.pitch);
    }

    public String toString() {
        return "[center: " + RecordUtils.fieldToString(this.center) + ", padding: " + RecordUtils.fieldToString(this.padding) + ", anchor: " + RecordUtils.fieldToString(this.anchor) + ", zoom: " + RecordUtils.fieldToString(this.zoom) + ", bearing: " + RecordUtils.fieldToString(this.bearing) + ", pitch: " + RecordUtils.fieldToString(this.pitch) + "]";
    }
}
