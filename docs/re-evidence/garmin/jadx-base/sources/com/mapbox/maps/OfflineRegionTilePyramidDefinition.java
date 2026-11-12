package com.mapbox.maps;

import com.mapbox.bindgen.PartialEq;
import com.mapbox.bindgen.RecordUtils;
import com.mapbox.common.BaseMapboxInitializer;
import com.mapbox.maps.loader.MapboxMapsInitializerImpl;
import j20.x;
import java.io.Serializable;
import java.util.Objects;

/* JADX INFO: loaded from: classes2.dex */
@Deprecated
public final class OfflineRegionTilePyramidDefinition implements Serializable {
    private final CoordinateBounds bounds;
    private final GlyphsRasterizationMode glyphsRasterizationMode;
    private final double maxZoom;
    private final double minZoom;
    private final float pixelRatio;
    private final String styleURL;

    public static final class Builder {
        private CoordinateBounds bounds;
        private GlyphsRasterizationMode glyphsRasterizationMode;
        private double maxZoom;
        private double minZoom;
        private float pixelRatio;
        private String styleURL;

        public Builder bounds(CoordinateBounds coordinateBounds) {
            this.bounds = coordinateBounds;
            return this;
        }

        public OfflineRegionTilePyramidDefinition build() {
            if (this.styleURL == null) {
                x.l("styleURL shouldn't be null");
                return null;
            }
            if (this.bounds == null) {
                x.l("bounds shouldn't be null");
                return null;
            }
            if (this.glyphsRasterizationMode != null) {
                return new OfflineRegionTilePyramidDefinition(this.styleURL, this.bounds, this.minZoom, this.maxZoom, this.pixelRatio, this.glyphsRasterizationMode);
            }
            x.l("glyphsRasterizationMode shouldn't be null");
            return null;
        }

        public Builder glyphsRasterizationMode(GlyphsRasterizationMode glyphsRasterizationMode) {
            this.glyphsRasterizationMode = glyphsRasterizationMode;
            return this;
        }

        public Builder maxZoom(double d14) {
            this.maxZoom = d14;
            return this;
        }

        public Builder minZoom(double d14) {
            this.minZoom = d14;
            return this;
        }

        public Builder pixelRatio(float f14) {
            this.pixelRatio = f14;
            return this;
        }

        public Builder styleURL(String str) {
            this.styleURL = str;
            return this;
        }
    }

    static {
        BaseMapboxInitializer.init(MapboxMapsInitializerImpl.class);
    }

    private OfflineRegionTilePyramidDefinition(String str, CoordinateBounds coordinateBounds, double d14, double d15, float f14, GlyphsRasterizationMode glyphsRasterizationMode) {
        this.styleURL = str;
        this.bounds = coordinateBounds;
        this.minZoom = d14;
        this.maxZoom = d15;
        this.pixelRatio = f14;
        this.glyphsRasterizationMode = glyphsRasterizationMode;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || OfflineRegionTilePyramidDefinition.class != obj.getClass()) {
            return false;
        }
        OfflineRegionTilePyramidDefinition offlineRegionTilePyramidDefinition = (OfflineRegionTilePyramidDefinition) obj;
        return Objects.equals(this.styleURL, offlineRegionTilePyramidDefinition.styleURL) && Objects.equals(this.bounds, offlineRegionTilePyramidDefinition.bounds) && PartialEq.compare(this.minZoom, offlineRegionTilePyramidDefinition.minZoom) && PartialEq.compare(this.maxZoom, offlineRegionTilePyramidDefinition.maxZoom) && PartialEq.compare(this.pixelRatio, offlineRegionTilePyramidDefinition.pixelRatio) && Objects.equals(this.glyphsRasterizationMode, offlineRegionTilePyramidDefinition.glyphsRasterizationMode);
    }

    public CoordinateBounds getBounds() {
        return this.bounds;
    }

    public GlyphsRasterizationMode getGlyphsRasterizationMode() {
        return this.glyphsRasterizationMode;
    }

    public double getMaxZoom() {
        return this.maxZoom;
    }

    public double getMinZoom() {
        return this.minZoom;
    }

    public float getPixelRatio() {
        return this.pixelRatio;
    }

    public String getStyleURL() {
        return this.styleURL;
    }

    public int hashCode() {
        return Objects.hash(this.styleURL, this.bounds, Double.valueOf(this.minZoom), Double.valueOf(this.maxZoom), Float.valueOf(this.pixelRatio), this.glyphsRasterizationMode);
    }

    public Builder toBuilder() {
        return new Builder().styleURL(this.styleURL).bounds(this.bounds).minZoom(this.minZoom).maxZoom(this.maxZoom).pixelRatio(this.pixelRatio).glyphsRasterizationMode(this.glyphsRasterizationMode);
    }

    public String toString() {
        StringBuilder sb3 = new StringBuilder("[styleURL: ");
        com.google.protobuf.a.k(this.styleURL, ", bounds: ", sb3);
        sb3.append(RecordUtils.fieldToString(this.bounds));
        sb3.append(", minZoom: ");
        com.google.protobuf.a.c(this.minZoom, ", maxZoom: ", sb3);
        com.google.protobuf.a.c(this.maxZoom, ", pixelRatio: ", sb3);
        sb3.append(RecordUtils.fieldToString(Float.valueOf(this.pixelRatio)));
        sb3.append(", glyphsRasterizationMode: ");
        sb3.append(RecordUtils.fieldToString(this.glyphsRasterizationMode));
        sb3.append("]");
        return sb3.toString();
    }
}
