package com.mapbox.maps;

import com.mapbox.bindgen.PartialEq;
import com.mapbox.bindgen.RecordUtils;
import com.mapbox.common.BaseMapboxInitializer;
import com.mapbox.maps.loader.MapboxMapsInitializerImpl;
import j20.x;
import java.io.Serializable;
import java.util.Objects;

/* JADX INFO: loaded from: classes2.dex */
public final class ViewAnnotationAnchorConfig implements Serializable {
    private final ViewAnnotationAnchor anchor;
    private final double offsetX;
    private final double offsetY;

    public static final class Builder {
        private ViewAnnotationAnchor anchor;
        private double offsetX;
        private double offsetY;

        public Builder anchor(ViewAnnotationAnchor viewAnnotationAnchor) {
            this.anchor = viewAnnotationAnchor;
            return this;
        }

        public ViewAnnotationAnchorConfig build() {
            if (this.anchor != null) {
                return new ViewAnnotationAnchorConfig(this.anchor, this.offsetX, this.offsetY);
            }
            x.l("anchor shouldn't be null");
            return null;
        }

        public Builder offsetX(double d14) {
            this.offsetX = d14;
            return this;
        }

        public Builder offsetY(double d14) {
            this.offsetY = d14;
            return this;
        }
    }

    static {
        BaseMapboxInitializer.init(MapboxMapsInitializerImpl.class);
    }

    private ViewAnnotationAnchorConfig(ViewAnnotationAnchor viewAnnotationAnchor, double d14, double d15) {
        this.anchor = viewAnnotationAnchor;
        this.offsetX = d14;
        this.offsetY = d15;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || ViewAnnotationAnchorConfig.class != obj.getClass()) {
            return false;
        }
        ViewAnnotationAnchorConfig viewAnnotationAnchorConfig = (ViewAnnotationAnchorConfig) obj;
        return Objects.equals(this.anchor, viewAnnotationAnchorConfig.anchor) && PartialEq.compare(this.offsetX, viewAnnotationAnchorConfig.offsetX) && PartialEq.compare(this.offsetY, viewAnnotationAnchorConfig.offsetY);
    }

    public ViewAnnotationAnchor getAnchor() {
        return this.anchor;
    }

    public double getOffsetX() {
        return this.offsetX;
    }

    public double getOffsetY() {
        return this.offsetY;
    }

    public int hashCode() {
        return Objects.hash(this.anchor, Double.valueOf(this.offsetX), Double.valueOf(this.offsetY));
    }

    public Builder toBuilder() {
        return new Builder().anchor(this.anchor).offsetX(this.offsetX).offsetY(this.offsetY);
    }

    public String toString() {
        StringBuilder sb3 = new StringBuilder("[anchor: ");
        sb3.append(RecordUtils.fieldToString(this.anchor));
        sb3.append(", offsetX: ");
        com.google.protobuf.a.c(this.offsetX, ", offsetY: ", sb3);
        sb3.append(RecordUtils.fieldToString(Double.valueOf(this.offsetY)));
        sb3.append("]");
        return sb3.toString();
    }
}
