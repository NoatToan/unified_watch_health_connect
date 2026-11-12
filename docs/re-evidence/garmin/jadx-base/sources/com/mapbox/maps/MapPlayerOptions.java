package com.mapbox.maps;

import com.mapbox.bindgen.PartialEq;
import com.mapbox.bindgen.RecordUtils;
import com.mapbox.common.BaseMapboxInitializer;
import com.mapbox.maps.loader.MapboxMapsInitializerImpl;
import java.io.Serializable;
import java.util.Objects;

/* JADX INFO: loaded from: classes2.dex */
public final class MapPlayerOptions implements Serializable {
    private final boolean avoidPlaybackPauses;
    private final int playbackCount;
    private final double playbackSpeedMultiplier;

    public static final class Builder {
        private int playbackCount = 1;
        private double playbackSpeedMultiplier = 1.0d;
        private boolean avoidPlaybackPauses = false;

        public Builder avoidPlaybackPauses(boolean z14) {
            this.avoidPlaybackPauses = z14;
            return this;
        }

        public MapPlayerOptions build() {
            return new MapPlayerOptions(this.playbackCount, this.playbackSpeedMultiplier, this.avoidPlaybackPauses);
        }

        public Builder playbackCount(int i14) {
            this.playbackCount = i14;
            return this;
        }

        public Builder playbackSpeedMultiplier(double d14) {
            this.playbackSpeedMultiplier = d14;
            return this;
        }
    }

    static {
        BaseMapboxInitializer.init(MapboxMapsInitializerImpl.class);
    }

    private MapPlayerOptions() {
        this.playbackCount = 1;
        this.playbackSpeedMultiplier = 1.0d;
        this.avoidPlaybackPauses = false;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || MapPlayerOptions.class != obj.getClass()) {
            return false;
        }
        MapPlayerOptions mapPlayerOptions = (MapPlayerOptions) obj;
        return this.playbackCount == mapPlayerOptions.playbackCount && PartialEq.compare(this.playbackSpeedMultiplier, mapPlayerOptions.playbackSpeedMultiplier) && this.avoidPlaybackPauses == mapPlayerOptions.avoidPlaybackPauses;
    }

    public boolean getAvoidPlaybackPauses() {
        return this.avoidPlaybackPauses;
    }

    public int getPlaybackCount() {
        return this.playbackCount;
    }

    public double getPlaybackSpeedMultiplier() {
        return this.playbackSpeedMultiplier;
    }

    public int hashCode() {
        return Objects.hash(Integer.valueOf(this.playbackCount), Double.valueOf(this.playbackSpeedMultiplier), Boolean.valueOf(this.avoidPlaybackPauses));
    }

    public Builder toBuilder() {
        return new Builder().playbackCount(this.playbackCount).playbackSpeedMultiplier(this.playbackSpeedMultiplier).avoidPlaybackPauses(this.avoidPlaybackPauses);
    }

    public String toString() {
        StringBuilder sb3 = new StringBuilder("[playbackCount: ");
        sb3.append(RecordUtils.fieldToString(Integer.valueOf(this.playbackCount)));
        sb3.append(", playbackSpeedMultiplier: ");
        com.google.protobuf.a.c(this.playbackSpeedMultiplier, ", avoidPlaybackPauses: ", sb3);
        sb3.append(RecordUtils.fieldToString(Boolean.valueOf(this.avoidPlaybackPauses)));
        sb3.append("]");
        return sb3.toString();
    }

    private MapPlayerOptions(int i14, double d14, boolean z14) {
        this.playbackCount = i14;
        this.playbackSpeedMultiplier = d14;
        this.avoidPlaybackPauses = z14;
    }
}
