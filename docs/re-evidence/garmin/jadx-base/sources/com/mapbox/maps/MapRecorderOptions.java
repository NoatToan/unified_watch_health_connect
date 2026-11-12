package com.mapbox.maps;

import com.mapbox.bindgen.RecordUtils;
import com.mapbox.common.BaseMapboxInitializer;
import com.mapbox.maps.loader.MapboxMapsInitializerImpl;
import java.io.Serializable;
import java.util.Objects;

/* JADX INFO: loaded from: classes2.dex */
public final class MapRecorderOptions implements Serializable {
    private final boolean compressed;
    private final boolean loggingEnabled;
    private final Long timeWindow;

    public static final class Builder {
        private Long timeWindow;
        private boolean loggingEnabled = false;
        private boolean compressed = true;

        public MapRecorderOptions build() {
            return new MapRecorderOptions(this.timeWindow, this.loggingEnabled, this.compressed);
        }

        public Builder compressed(boolean z14) {
            this.compressed = z14;
            return this;
        }

        public Builder loggingEnabled(boolean z14) {
            this.loggingEnabled = z14;
            return this;
        }

        public Builder timeWindow(Long l14) {
            this.timeWindow = l14;
            return this;
        }
    }

    static {
        BaseMapboxInitializer.init(MapboxMapsInitializerImpl.class);
    }

    private MapRecorderOptions(Long l14) {
        this.timeWindow = l14;
        this.loggingEnabled = false;
        this.compressed = true;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || MapRecorderOptions.class != obj.getClass()) {
            return false;
        }
        MapRecorderOptions mapRecorderOptions = (MapRecorderOptions) obj;
        return Objects.equals(this.timeWindow, mapRecorderOptions.timeWindow) && this.loggingEnabled == mapRecorderOptions.loggingEnabled && this.compressed == mapRecorderOptions.compressed;
    }

    public boolean getCompressed() {
        return this.compressed;
    }

    public boolean getLoggingEnabled() {
        return this.loggingEnabled;
    }

    public Long getTimeWindow() {
        return this.timeWindow;
    }

    public int hashCode() {
        return Objects.hash(this.timeWindow, Boolean.valueOf(this.loggingEnabled), Boolean.valueOf(this.compressed));
    }

    public Builder toBuilder() {
        return new Builder().timeWindow(this.timeWindow).loggingEnabled(this.loggingEnabled).compressed(this.compressed);
    }

    public String toString() {
        return "[timeWindow: " + RecordUtils.fieldToString(this.timeWindow) + ", loggingEnabled: " + RecordUtils.fieldToString(Boolean.valueOf(this.loggingEnabled)) + ", compressed: " + RecordUtils.fieldToString(Boolean.valueOf(this.compressed)) + "]";
    }

    private MapRecorderOptions(Long l14, boolean z14, boolean z15) {
        this.timeWindow = l14;
        this.loggingEnabled = z14;
        this.compressed = z15;
    }
}
