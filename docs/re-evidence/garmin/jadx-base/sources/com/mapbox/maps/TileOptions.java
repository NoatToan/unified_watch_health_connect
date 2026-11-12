package com.mapbox.maps;

import com.mapbox.bindgen.PartialEq;
import com.mapbox.bindgen.RecordUtils;
import com.mapbox.common.BaseMapboxInitializer;
import com.mapbox.maps.loader.MapboxMapsInitializerImpl;
import java.io.Serializable;
import java.util.Objects;

/* JADX INFO: loaded from: classes2.dex */
public final class TileOptions implements Serializable {
    private final short buffer;
    private final boolean clip;
    private final short tileSize;
    private final double tolerance;
    private final boolean wrap;

    public static final class Builder {
        private double tolerance = 0.375d;
        private short tileSize = 512;
        private short buffer = 128;
        private boolean clip = false;
        private boolean wrap = false;

        public Builder buffer(short s8) {
            this.buffer = s8;
            return this;
        }

        public TileOptions build() {
            return new TileOptions(this.tolerance, this.tileSize, this.buffer, this.clip, this.wrap);
        }

        public Builder clip(boolean z14) {
            this.clip = z14;
            return this;
        }

        public Builder tileSize(short s8) {
            this.tileSize = s8;
            return this;
        }

        public Builder tolerance(double d14) {
            this.tolerance = d14;
            return this;
        }

        public Builder wrap(boolean z14) {
            this.wrap = z14;
            return this;
        }
    }

    static {
        BaseMapboxInitializer.init(MapboxMapsInitializerImpl.class);
    }

    private TileOptions() {
        this.tolerance = 0.375d;
        this.tileSize = (short) 512;
        this.buffer = (short) 128;
        this.clip = false;
        this.wrap = false;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || TileOptions.class != obj.getClass()) {
            return false;
        }
        TileOptions tileOptions = (TileOptions) obj;
        return PartialEq.compare(this.tolerance, tileOptions.tolerance) && this.tileSize == tileOptions.tileSize && this.buffer == tileOptions.buffer && this.clip == tileOptions.clip && this.wrap == tileOptions.wrap;
    }

    public short getBuffer() {
        return this.buffer;
    }

    public boolean getClip() {
        return this.clip;
    }

    public short getTileSize() {
        return this.tileSize;
    }

    public double getTolerance() {
        return this.tolerance;
    }

    public boolean getWrap() {
        return this.wrap;
    }

    public int hashCode() {
        return Objects.hash(Double.valueOf(this.tolerance), Short.valueOf(this.tileSize), Short.valueOf(this.buffer), Boolean.valueOf(this.clip), Boolean.valueOf(this.wrap));
    }

    public Builder toBuilder() {
        return new Builder().tolerance(this.tolerance).tileSize(this.tileSize).buffer(this.buffer).clip(this.clip).wrap(this.wrap);
    }

    public String toString() {
        StringBuilder sb3 = new StringBuilder("[tolerance: ");
        com.google.protobuf.a.c(this.tolerance, ", tileSize: ", sb3);
        sb3.append(RecordUtils.fieldToString(Short.valueOf(this.tileSize)));
        sb3.append(", buffer: ");
        sb3.append(RecordUtils.fieldToString(Short.valueOf(this.buffer)));
        sb3.append(", clip: ");
        sb3.append(RecordUtils.fieldToString(Boolean.valueOf(this.clip)));
        sb3.append(", wrap: ");
        sb3.append(RecordUtils.fieldToString(Boolean.valueOf(this.wrap)));
        sb3.append("]");
        return sb3.toString();
    }

    private TileOptions(double d14, short s8, short s14, boolean z14, boolean z15) {
        this.tolerance = d14;
        this.tileSize = s8;
        this.buffer = s14;
        this.clip = z14;
        this.wrap = z15;
    }
}
