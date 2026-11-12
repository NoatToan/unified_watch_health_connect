package com.mapbox.maps;

import com.mapbox.bindgen.PartialEq;
import com.mapbox.bindgen.RecordUtils;
import com.mapbox.common.BaseMapboxInitializer;
import com.mapbox.maps.loader.MapboxMapsInitializerImpl;
import j20.x;
import java.io.Serializable;
import java.util.Objects;

/* JADX INFO: loaded from: classes2.dex */
public final class MapSnapshotOptions implements Serializable {
    private final GlyphsRasterizationOptions glyphsRasterizationOptions;
    private final float pixelRatio;
    private final Size size;

    public static final class Builder {
        private GlyphsRasterizationOptions glyphsRasterizationOptions;
        private float pixelRatio = 1.0f;
        private Size size;

        public MapSnapshotOptions build() {
            if (this.size != null) {
                return new MapSnapshotOptions(this.size, this.pixelRatio, this.glyphsRasterizationOptions);
            }
            x.l("size shouldn't be null");
            return null;
        }

        public Builder glyphsRasterizationOptions(GlyphsRasterizationOptions glyphsRasterizationOptions) {
            this.glyphsRasterizationOptions = glyphsRasterizationOptions;
            return this;
        }

        public Builder pixelRatio(float f14) {
            this.pixelRatio = f14;
            return this;
        }

        public Builder size(Size size) {
            this.size = size;
            return this;
        }
    }

    static {
        BaseMapboxInitializer.init(MapboxMapsInitializerImpl.class);
    }

    private MapSnapshotOptions(Size size, GlyphsRasterizationOptions glyphsRasterizationOptions) {
        this.size = size;
        this.glyphsRasterizationOptions = glyphsRasterizationOptions;
        this.pixelRatio = 1.0f;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || MapSnapshotOptions.class != obj.getClass()) {
            return false;
        }
        MapSnapshotOptions mapSnapshotOptions = (MapSnapshotOptions) obj;
        return Objects.equals(this.size, mapSnapshotOptions.size) && PartialEq.compare(this.pixelRatio, mapSnapshotOptions.pixelRatio) && Objects.equals(this.glyphsRasterizationOptions, mapSnapshotOptions.glyphsRasterizationOptions);
    }

    public GlyphsRasterizationOptions getGlyphsRasterizationOptions() {
        return this.glyphsRasterizationOptions;
    }

    public float getPixelRatio() {
        return this.pixelRatio;
    }

    public Size getSize() {
        return this.size;
    }

    public int hashCode() {
        return Objects.hash(this.size, Float.valueOf(this.pixelRatio), this.glyphsRasterizationOptions);
    }

    public Builder toBuilder() {
        return new Builder().size(this.size).pixelRatio(this.pixelRatio).glyphsRasterizationOptions(this.glyphsRasterizationOptions);
    }

    public String toString() {
        return "[size: " + RecordUtils.fieldToString(this.size) + ", pixelRatio: " + RecordUtils.fieldToString(Float.valueOf(this.pixelRatio)) + ", glyphsRasterizationOptions: " + RecordUtils.fieldToString(this.glyphsRasterizationOptions) + "]";
    }

    private MapSnapshotOptions(Size size, float f14, GlyphsRasterizationOptions glyphsRasterizationOptions) {
        this.size = size;
        this.pixelRatio = f14;
        this.glyphsRasterizationOptions = glyphsRasterizationOptions;
    }
}
