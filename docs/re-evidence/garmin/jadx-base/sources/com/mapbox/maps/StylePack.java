package com.mapbox.maps;

import com.mapbox.bindgen.RecordUtils;
import com.mapbox.bindgen.Value;
import com.mapbox.common.BaseMapboxInitializer;
import com.mapbox.maps.loader.MapboxMapsInitializerImpl;
import java.io.Serializable;
import java.util.Date;
import java.util.Objects;

/* JADX INFO: loaded from: classes2.dex */
public final class StylePack implements Serializable {
    private final long completedResourceCount;
    private final long completedResourceSize;
    private final Date expires;
    private final Value extraData;
    private final GlyphsRasterizationMode glyphsRasterizationMode;
    private final long requiredResourceCount;
    private final String styleURI;

    static {
        BaseMapboxInitializer.init(MapboxMapsInitializerImpl.class);
    }

    public StylePack(String str, GlyphsRasterizationMode glyphsRasterizationMode, long j8, long j14, long j15, Date date, Value value) {
        this.styleURI = str;
        this.glyphsRasterizationMode = glyphsRasterizationMode;
        this.requiredResourceCount = j8;
        this.completedResourceCount = j14;
        this.completedResourceSize = j15;
        this.expires = date;
        this.extraData = value;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || StylePack.class != obj.getClass()) {
            return false;
        }
        StylePack stylePack = (StylePack) obj;
        return Objects.equals(this.styleURI, stylePack.styleURI) && Objects.equals(this.glyphsRasterizationMode, stylePack.glyphsRasterizationMode) && this.requiredResourceCount == stylePack.requiredResourceCount && this.completedResourceCount == stylePack.completedResourceCount && this.completedResourceSize == stylePack.completedResourceSize && Objects.equals(this.expires, stylePack.expires) && Objects.equals(this.extraData, stylePack.extraData);
    }

    public long getCompletedResourceCount() {
        return this.completedResourceCount;
    }

    public long getCompletedResourceSize() {
        return this.completedResourceSize;
    }

    public Date getExpires() {
        return this.expires;
    }

    public Value getExtraData() {
        return this.extraData;
    }

    public GlyphsRasterizationMode getGlyphsRasterizationMode() {
        return this.glyphsRasterizationMode;
    }

    public long getRequiredResourceCount() {
        return this.requiredResourceCount;
    }

    public String getStyleURI() {
        return this.styleURI;
    }

    public int hashCode() {
        return Objects.hash(this.styleURI, this.glyphsRasterizationMode, Long.valueOf(this.requiredResourceCount), Long.valueOf(this.completedResourceCount), Long.valueOf(this.completedResourceSize), this.expires, this.extraData);
    }

    public String toString() {
        StringBuilder sb3 = new StringBuilder("[styleURI: ");
        com.google.protobuf.a.k(this.styleURI, ", glyphsRasterizationMode: ", sb3);
        sb3.append(RecordUtils.fieldToString(this.glyphsRasterizationMode));
        sb3.append(", requiredResourceCount: ");
        com.google.protobuf.a.h(this.requiredResourceCount, ", completedResourceCount: ", sb3);
        com.google.protobuf.a.h(this.completedResourceCount, ", completedResourceSize: ", sb3);
        com.google.protobuf.a.h(this.completedResourceSize, ", expires: ", sb3);
        sb3.append(RecordUtils.fieldToString(this.expires));
        sb3.append(", extraData: ");
        sb3.append(RecordUtils.fieldToString(this.extraData));
        sb3.append("]");
        return sb3.toString();
    }
}
