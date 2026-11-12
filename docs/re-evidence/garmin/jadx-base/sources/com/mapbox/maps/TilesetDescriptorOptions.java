package com.mapbox.maps;

import com.mapbox.bindgen.PartialEq;
import com.mapbox.bindgen.RecordUtils;
import com.mapbox.bindgen.Value;
import com.mapbox.common.BaseMapboxInitializer;
import com.mapbox.maps.loader.MapboxMapsInitializerImpl;
import j20.x;
import java.io.Serializable;
import java.util.List;
import java.util.Objects;

/* JADX INFO: loaded from: classes2.dex */
public final class TilesetDescriptorOptions implements Serializable {
    private final Value extraOptions;
    private final byte maxZoom;
    private final byte minZoom;
    private final float pixelRatio;
    private final StylePackLoadOptions stylePackOptions;
    private final String styleURI;
    private final List<String> tilesets;

    public static final class Builder {
        private Value extraOptions;
        private byte maxZoom;
        private byte minZoom;
        private float pixelRatio = 1.0f;
        private StylePackLoadOptions stylePackOptions;
        private String styleURI;
        private List<String> tilesets;

        public TilesetDescriptorOptions build() {
            if (this.styleURI != null) {
                return new TilesetDescriptorOptions(this.styleURI, this.minZoom, this.maxZoom, this.pixelRatio, this.tilesets, this.stylePackOptions, this.extraOptions);
            }
            x.l("styleURI shouldn't be null");
            return null;
        }

        public Builder extraOptions(Value value) {
            this.extraOptions = value;
            return this;
        }

        public Builder maxZoom(byte b14) {
            this.maxZoom = b14;
            return this;
        }

        public Builder minZoom(byte b14) {
            this.minZoom = b14;
            return this;
        }

        public Builder pixelRatio(float f14) {
            this.pixelRatio = f14;
            return this;
        }

        public Builder stylePackOptions(StylePackLoadOptions stylePackLoadOptions) {
            this.stylePackOptions = stylePackLoadOptions;
            return this;
        }

        public Builder styleURI(String str) {
            this.styleURI = str;
            return this;
        }

        public Builder tilesets(List<String> list) {
            this.tilesets = list;
            return this;
        }
    }

    static {
        BaseMapboxInitializer.init(MapboxMapsInitializerImpl.class);
    }

    private TilesetDescriptorOptions(String str, byte b14, byte b15, List<String> list, StylePackLoadOptions stylePackLoadOptions, Value value) {
        this.styleURI = str;
        this.minZoom = b14;
        this.maxZoom = b15;
        this.tilesets = list;
        this.stylePackOptions = stylePackLoadOptions;
        this.extraOptions = value;
        this.pixelRatio = 1.0f;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || TilesetDescriptorOptions.class != obj.getClass()) {
            return false;
        }
        TilesetDescriptorOptions tilesetDescriptorOptions = (TilesetDescriptorOptions) obj;
        return Objects.equals(this.styleURI, tilesetDescriptorOptions.styleURI) && this.minZoom == tilesetDescriptorOptions.minZoom && this.maxZoom == tilesetDescriptorOptions.maxZoom && PartialEq.compare(this.pixelRatio, tilesetDescriptorOptions.pixelRatio) && Objects.equals(this.tilesets, tilesetDescriptorOptions.tilesets) && Objects.equals(this.stylePackOptions, tilesetDescriptorOptions.stylePackOptions) && Objects.equals(this.extraOptions, tilesetDescriptorOptions.extraOptions);
    }

    public Value getExtraOptions() {
        return this.extraOptions;
    }

    public byte getMaxZoom() {
        return this.maxZoom;
    }

    public byte getMinZoom() {
        return this.minZoom;
    }

    public float getPixelRatio() {
        return this.pixelRatio;
    }

    public StylePackLoadOptions getStylePackOptions() {
        return this.stylePackOptions;
    }

    public String getStyleURI() {
        return this.styleURI;
    }

    public List<String> getTilesets() {
        return this.tilesets;
    }

    public int hashCode() {
        return Objects.hash(this.styleURI, Byte.valueOf(this.minZoom), Byte.valueOf(this.maxZoom), Float.valueOf(this.pixelRatio), this.tilesets, this.stylePackOptions, this.extraOptions);
    }

    public Builder toBuilder() {
        return new Builder().styleURI(this.styleURI).minZoom(this.minZoom).maxZoom(this.maxZoom).pixelRatio(this.pixelRatio).tilesets(this.tilesets).stylePackOptions(this.stylePackOptions).extraOptions(this.extraOptions);
    }

    public String toString() {
        StringBuilder sb3 = new StringBuilder("[styleURI: ");
        com.google.protobuf.a.k(this.styleURI, ", minZoom: ", sb3);
        sb3.append(RecordUtils.fieldToString(Byte.valueOf(this.minZoom)));
        sb3.append(", maxZoom: ");
        sb3.append(RecordUtils.fieldToString(Byte.valueOf(this.maxZoom)));
        sb3.append(", pixelRatio: ");
        sb3.append(RecordUtils.fieldToString(Float.valueOf(this.pixelRatio)));
        sb3.append(", tilesets: ");
        sb3.append(RecordUtils.fieldToString(this.tilesets));
        sb3.append(", stylePackOptions: ");
        sb3.append(RecordUtils.fieldToString(this.stylePackOptions));
        sb3.append(", extraOptions: ");
        sb3.append(RecordUtils.fieldToString(this.extraOptions));
        sb3.append("]");
        return sb3.toString();
    }

    private TilesetDescriptorOptions(String str, byte b14, byte b15, float f14, List<String> list, StylePackLoadOptions stylePackLoadOptions, Value value) {
        this.styleURI = str;
        this.minZoom = b14;
        this.maxZoom = b15;
        this.pixelRatio = f14;
        this.tilesets = list;
        this.stylePackOptions = stylePackLoadOptions;
        this.extraOptions = value;
    }
}
