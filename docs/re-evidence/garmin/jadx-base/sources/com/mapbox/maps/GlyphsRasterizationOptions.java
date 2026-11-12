package com.mapbox.maps;

import com.mapbox.bindgen.RecordUtils;
import com.mapbox.common.BaseMapboxInitializer;
import com.mapbox.maps.loader.MapboxMapsInitializerImpl;
import j20.x;
import java.io.Serializable;
import java.util.Objects;

/* JADX INFO: loaded from: classes2.dex */
public final class GlyphsRasterizationOptions implements Serializable {
    private final String fontFamily;
    private final GlyphsRasterizationMode rasterizationMode;

    public static final class Builder {
        private String fontFamily;
        private GlyphsRasterizationMode rasterizationMode;

        public GlyphsRasterizationOptions build() {
            if (this.rasterizationMode != null) {
                return new GlyphsRasterizationOptions(this.rasterizationMode, this.fontFamily);
            }
            x.l("rasterizationMode shouldn't be null");
            return null;
        }

        public Builder fontFamily(String str) {
            this.fontFamily = str;
            return this;
        }

        public Builder rasterizationMode(GlyphsRasterizationMode glyphsRasterizationMode) {
            this.rasterizationMode = glyphsRasterizationMode;
            return this;
        }
    }

    static {
        BaseMapboxInitializer.init(MapboxMapsInitializerImpl.class);
    }

    private GlyphsRasterizationOptions(GlyphsRasterizationMode glyphsRasterizationMode, String str) {
        this.rasterizationMode = glyphsRasterizationMode;
        this.fontFamily = str;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || GlyphsRasterizationOptions.class != obj.getClass()) {
            return false;
        }
        GlyphsRasterizationOptions glyphsRasterizationOptions = (GlyphsRasterizationOptions) obj;
        return Objects.equals(this.rasterizationMode, glyphsRasterizationOptions.rasterizationMode) && Objects.equals(this.fontFamily, glyphsRasterizationOptions.fontFamily);
    }

    public String getFontFamily() {
        return this.fontFamily;
    }

    public GlyphsRasterizationMode getRasterizationMode() {
        return this.rasterizationMode;
    }

    public int hashCode() {
        return Objects.hash(this.rasterizationMode, this.fontFamily);
    }

    public Builder toBuilder() {
        return new Builder().rasterizationMode(this.rasterizationMode).fontFamily(this.fontFamily);
    }

    public String toString() {
        StringBuilder sb3 = new StringBuilder("[rasterizationMode: ");
        sb3.append(RecordUtils.fieldToString(this.rasterizationMode));
        sb3.append(", fontFamily: ");
        return com.google.protobuf.a.a(this.fontFamily, "]", sb3);
    }
}
