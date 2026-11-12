package com.mapbox.maps;

import com.mapbox.bindgen.PartialEq;
import com.mapbox.bindgen.RecordUtils;
import com.mapbox.common.BaseMapboxInitializer;
import com.mapbox.geojson.Geometry;
import com.mapbox.maps.loader.MapboxMapsInitializerImpl;
import j20.x;
import java.io.Serializable;
import java.util.Objects;

/* JADX INFO: loaded from: classes2.dex */
@Deprecated
public final class OfflineRegionGeometryDefinition implements Serializable {
    private final Geometry geometry;
    private final GlyphsRasterizationMode glyphsRasterizationMode;
    private final double maxZoom;
    private final double minZoom;
    private final float pixelRatio;
    private final String styleURL;

    public static final class Builder {
        private Geometry geometry;
        private GlyphsRasterizationMode glyphsRasterizationMode;
        private double maxZoom;
        private double minZoom;
        private float pixelRatio;
        private String styleURL;

        public OfflineRegionGeometryDefinition build() {
            if (this.styleURL == null) {
                x.l("styleURL shouldn't be null");
                return null;
            }
            if (this.geometry == null) {
                x.l("geometry shouldn't be null");
                return null;
            }
            if (this.glyphsRasterizationMode != null) {
                return new OfflineRegionGeometryDefinition(this.styleURL, this.geometry, this.minZoom, this.maxZoom, this.pixelRatio, this.glyphsRasterizationMode);
            }
            x.l("glyphsRasterizationMode shouldn't be null");
            return null;
        }

        public Builder geometry(Geometry geometry) {
            this.geometry = geometry;
            return this;
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

    private OfflineRegionGeometryDefinition(String str, Geometry geometry, double d14, double d15, float f14, GlyphsRasterizationMode glyphsRasterizationMode) {
        this.styleURL = str;
        this.geometry = geometry;
        this.minZoom = d14;
        this.maxZoom = d15;
        this.pixelRatio = f14;
        this.glyphsRasterizationMode = glyphsRasterizationMode;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || OfflineRegionGeometryDefinition.class != obj.getClass()) {
            return false;
        }
        OfflineRegionGeometryDefinition offlineRegionGeometryDefinition = (OfflineRegionGeometryDefinition) obj;
        return Objects.equals(this.styleURL, offlineRegionGeometryDefinition.styleURL) && Objects.equals(this.geometry, offlineRegionGeometryDefinition.geometry) && PartialEq.compare(this.minZoom, offlineRegionGeometryDefinition.minZoom) && PartialEq.compare(this.maxZoom, offlineRegionGeometryDefinition.maxZoom) && PartialEq.compare(this.pixelRatio, offlineRegionGeometryDefinition.pixelRatio) && Objects.equals(this.glyphsRasterizationMode, offlineRegionGeometryDefinition.glyphsRasterizationMode);
    }

    public Geometry getGeometry() {
        return this.geometry;
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
        return Objects.hash(this.styleURL, this.geometry, Double.valueOf(this.minZoom), Double.valueOf(this.maxZoom), Float.valueOf(this.pixelRatio), this.glyphsRasterizationMode);
    }

    public Builder toBuilder() {
        return new Builder().styleURL(this.styleURL).geometry(this.geometry).minZoom(this.minZoom).maxZoom(this.maxZoom).pixelRatio(this.pixelRatio).glyphsRasterizationMode(this.glyphsRasterizationMode);
    }

    public String toString() {
        StringBuilder sb3 = new StringBuilder("[styleURL: ");
        com.google.protobuf.a.k(this.styleURL, ", geometry: ", sb3);
        sb3.append(RecordUtils.fieldToString(this.geometry));
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
