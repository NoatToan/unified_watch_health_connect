package com.mapbox.maps;

import com.mapbox.bindgen.PartialEq;
import com.mapbox.bindgen.RecordUtils;
import com.mapbox.common.BaseMapboxInitializer;
import com.mapbox.maps.loader.MapboxMapsInitializerImpl;
import java.io.Serializable;
import java.util.Objects;

/* JADX INFO: loaded from: classes2.dex */
public final class CameraBounds implements Serializable {
    private final CoordinateBounds bounds;
    private final double maxPitch;
    private final double maxZoom;
    private final double minPitch;
    private final double minZoom;

    static {
        BaseMapboxInitializer.init(MapboxMapsInitializerImpl.class);
    }

    public CameraBounds(CoordinateBounds coordinateBounds, double d14, double d15, double d16, double d17) {
        this.bounds = coordinateBounds;
        this.maxZoom = d14;
        this.minZoom = d15;
        this.maxPitch = d16;
        this.minPitch = d17;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || CameraBounds.class != obj.getClass()) {
            return false;
        }
        CameraBounds cameraBounds = (CameraBounds) obj;
        return Objects.equals(this.bounds, cameraBounds.bounds) && PartialEq.compare(this.maxZoom, cameraBounds.maxZoom) && PartialEq.compare(this.minZoom, cameraBounds.minZoom) && PartialEq.compare(this.maxPitch, cameraBounds.maxPitch) && PartialEq.compare(this.minPitch, cameraBounds.minPitch);
    }

    public CoordinateBounds getBounds() {
        return this.bounds;
    }

    public double getMaxPitch() {
        return this.maxPitch;
    }

    public double getMaxZoom() {
        return this.maxZoom;
    }

    public double getMinPitch() {
        return this.minPitch;
    }

    public double getMinZoom() {
        return this.minZoom;
    }

    public int hashCode() {
        return Objects.hash(this.bounds, Double.valueOf(this.maxZoom), Double.valueOf(this.minZoom), Double.valueOf(this.maxPitch), Double.valueOf(this.minPitch));
    }

    public String toString() {
        StringBuilder sb3 = new StringBuilder("[bounds: ");
        sb3.append(RecordUtils.fieldToString(this.bounds));
        sb3.append(", maxZoom: ");
        com.google.protobuf.a.c(this.maxZoom, ", minZoom: ", sb3);
        com.google.protobuf.a.c(this.minZoom, ", maxPitch: ", sb3);
        com.google.protobuf.a.c(this.maxPitch, ", minPitch: ", sb3);
        sb3.append(RecordUtils.fieldToString(Double.valueOf(this.minPitch)));
        sb3.append("]");
        return sb3.toString();
    }
}
