package com.mapbox.maps;

import com.mapbox.bindgen.RecordUtils;
import com.mapbox.common.BaseMapboxInitializer;
import com.mapbox.maps.loader.MapboxMapsInitializerImpl;
import java.io.Serializable;
import java.util.Objects;

/* JADX INFO: loaded from: classes2.dex */
public final class CustomLayerRenderConfiguration implements Serializable {
    private final boolean isRenderToTileSupported;
    private final boolean shouldRerenderTiles;

    public static final class Builder {
        private boolean isRenderToTileSupported = false;
        private boolean shouldRerenderTiles = false;

        public CustomLayerRenderConfiguration build() {
            return new CustomLayerRenderConfiguration(this.isRenderToTileSupported, this.shouldRerenderTiles);
        }

        public Builder isRenderToTileSupported(boolean z14) {
            this.isRenderToTileSupported = z14;
            return this;
        }

        public Builder shouldRerenderTiles(boolean z14) {
            this.shouldRerenderTiles = z14;
            return this;
        }
    }

    static {
        BaseMapboxInitializer.init(MapboxMapsInitializerImpl.class);
    }

    private CustomLayerRenderConfiguration() {
        this.isRenderToTileSupported = false;
        this.shouldRerenderTiles = false;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || CustomLayerRenderConfiguration.class != obj.getClass()) {
            return false;
        }
        CustomLayerRenderConfiguration customLayerRenderConfiguration = (CustomLayerRenderConfiguration) obj;
        return this.isRenderToTileSupported == customLayerRenderConfiguration.isRenderToTileSupported && this.shouldRerenderTiles == customLayerRenderConfiguration.shouldRerenderTiles;
    }

    public boolean getIsRenderToTileSupported() {
        return this.isRenderToTileSupported;
    }

    public boolean getShouldRerenderTiles() {
        return this.shouldRerenderTiles;
    }

    public int hashCode() {
        return Objects.hash(Boolean.valueOf(this.isRenderToTileSupported), Boolean.valueOf(this.shouldRerenderTiles));
    }

    public Builder toBuilder() {
        return new Builder().isRenderToTileSupported(this.isRenderToTileSupported).shouldRerenderTiles(this.shouldRerenderTiles);
    }

    public String toString() {
        return "[isRenderToTileSupported: " + RecordUtils.fieldToString(Boolean.valueOf(this.isRenderToTileSupported)) + ", shouldRerenderTiles: " + RecordUtils.fieldToString(Boolean.valueOf(this.shouldRerenderTiles)) + "]";
    }

    private CustomLayerRenderConfiguration(boolean z14, boolean z15) {
        this.isRenderToTileSupported = z14;
        this.shouldRerenderTiles = z15;
    }
}
