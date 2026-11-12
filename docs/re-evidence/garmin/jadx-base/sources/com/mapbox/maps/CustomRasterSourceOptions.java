package com.mapbox.maps;

import com.google.common.base.Ascii;
import com.mapbox.bindgen.RecordUtils;
import com.mapbox.common.BaseMapboxInitializer;
import com.mapbox.maps.loader.MapboxMapsInitializerImpl;
import j20.x;
import java.io.Serializable;
import java.util.Objects;

/* JADX INFO: loaded from: classes2.dex */
public final class CustomRasterSourceOptions implements Serializable {
    private final CustomRasterSourceClient clientCallback;
    private final byte maxZoom;
    private final byte minZoom;
    private final short tileSize;

    public static final class Builder {
        private CustomRasterSourceClient clientCallback;
        private byte minZoom = 0;
        private byte maxZoom = Ascii.DC2;
        private short tileSize = 512;

        public CustomRasterSourceOptions build() {
            if (this.clientCallback != null) {
                return new CustomRasterSourceOptions(this.clientCallback, this.minZoom, this.maxZoom, this.tileSize);
            }
            x.l("clientCallback shouldn't be null");
            return null;
        }

        public Builder clientCallback(CustomRasterSourceClient customRasterSourceClient) {
            this.clientCallback = customRasterSourceClient;
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

        public Builder tileSize(short s8) {
            this.tileSize = s8;
            return this;
        }
    }

    static {
        BaseMapboxInitializer.init(MapboxMapsInitializerImpl.class);
    }

    private CustomRasterSourceOptions(CustomRasterSourceClient customRasterSourceClient) {
        this.clientCallback = customRasterSourceClient;
        this.minZoom = (byte) 0;
        this.maxZoom = Ascii.DC2;
        this.tileSize = (short) 512;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || CustomRasterSourceOptions.class != obj.getClass()) {
            return false;
        }
        CustomRasterSourceOptions customRasterSourceOptions = (CustomRasterSourceOptions) obj;
        return Objects.equals(this.clientCallback, customRasterSourceOptions.clientCallback) && this.minZoom == customRasterSourceOptions.minZoom && this.maxZoom == customRasterSourceOptions.maxZoom && this.tileSize == customRasterSourceOptions.tileSize;
    }

    public CustomRasterSourceClient getClientCallback() {
        return this.clientCallback;
    }

    public byte getMaxZoom() {
        return this.maxZoom;
    }

    public byte getMinZoom() {
        return this.minZoom;
    }

    public short getTileSize() {
        return this.tileSize;
    }

    public int hashCode() {
        return Objects.hash(this.clientCallback, Byte.valueOf(this.minZoom), Byte.valueOf(this.maxZoom), Short.valueOf(this.tileSize));
    }

    public Builder toBuilder() {
        return new Builder().clientCallback(this.clientCallback).minZoom(this.minZoom).maxZoom(this.maxZoom).tileSize(this.tileSize);
    }

    public String toString() {
        return "[clientCallback: " + RecordUtils.fieldToString(this.clientCallback) + ", minZoom: " + RecordUtils.fieldToString(Byte.valueOf(this.minZoom)) + ", maxZoom: " + RecordUtils.fieldToString(Byte.valueOf(this.maxZoom)) + ", tileSize: " + RecordUtils.fieldToString(Short.valueOf(this.tileSize)) + "]";
    }

    private CustomRasterSourceOptions(CustomRasterSourceClient customRasterSourceClient, byte b14, byte b15, short s8) {
        this.clientCallback = customRasterSourceClient;
        this.minZoom = b14;
        this.maxZoom = b15;
        this.tileSize = s8;
    }
}
