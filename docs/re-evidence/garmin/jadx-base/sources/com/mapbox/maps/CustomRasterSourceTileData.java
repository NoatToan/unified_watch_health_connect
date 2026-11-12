package com.mapbox.maps;

import com.mapbox.bindgen.RecordUtils;
import com.mapbox.common.BaseMapboxInitializer;
import com.mapbox.maps.loader.MapboxMapsInitializerImpl;
import java.io.Serializable;
import java.util.Objects;

/* JADX INFO: loaded from: classes2.dex */
public final class CustomRasterSourceTileData implements Serializable {
    private final Image image;
    private final CanonicalTileID tileId;

    static {
        BaseMapboxInitializer.init(MapboxMapsInitializerImpl.class);
    }

    public CustomRasterSourceTileData(CanonicalTileID canonicalTileID, Image image) {
        this.tileId = canonicalTileID;
        this.image = image;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || CustomRasterSourceTileData.class != obj.getClass()) {
            return false;
        }
        CustomRasterSourceTileData customRasterSourceTileData = (CustomRasterSourceTileData) obj;
        return Objects.equals(this.tileId, customRasterSourceTileData.tileId) && Objects.equals(this.image, customRasterSourceTileData.image);
    }

    public Image getImage() {
        return this.image;
    }

    public CanonicalTileID getTileId() {
        return this.tileId;
    }

    public int hashCode() {
        return Objects.hash(this.tileId, this.image);
    }

    public String toString() {
        return "[tileId: " + RecordUtils.fieldToString(this.tileId) + ", image: " + RecordUtils.fieldToString(this.image) + "]";
    }
}
