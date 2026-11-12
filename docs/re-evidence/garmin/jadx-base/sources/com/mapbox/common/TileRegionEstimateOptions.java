package com.mapbox.common;

import com.mapbox.bindgen.PartialEq;
import com.mapbox.bindgen.RecordUtils;
import com.mapbox.bindgen.Value;
import java.io.Serializable;
import java.util.Objects;

/* JADX INFO: loaded from: classes2.dex */
public class TileRegionEstimateOptions implements Serializable {
    private final float errorMargin;
    private final Value extraOptions;
    private final long preciseEstimationTimeout;
    private final long timeout;

    static {
        BaseMapboxInitializer.init(MapboxSDKCommonInitializerImpl.class);
    }

    public TileRegionEstimateOptions(Value value) {
        this.extraOptions = value;
        this.errorMargin = 0.05f;
        this.preciseEstimationTimeout = 5000L;
        this.timeout = 0L;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        TileRegionEstimateOptions tileRegionEstimateOptions = (TileRegionEstimateOptions) obj;
        return PartialEq.compare(this.errorMargin, tileRegionEstimateOptions.errorMargin) && this.preciseEstimationTimeout == tileRegionEstimateOptions.preciseEstimationTimeout && this.timeout == tileRegionEstimateOptions.timeout && Objects.equals(this.extraOptions, tileRegionEstimateOptions.extraOptions);
    }

    public float getErrorMargin() {
        return this.errorMargin;
    }

    public Value getExtraOptions() {
        return this.extraOptions;
    }

    public long getPreciseEstimationTimeout() {
        return this.preciseEstimationTimeout;
    }

    public long getTimeout() {
        return this.timeout;
    }

    public int hashCode() {
        return Objects.hash(Float.valueOf(this.errorMargin), Long.valueOf(this.preciseEstimationTimeout), Long.valueOf(this.timeout), this.extraOptions);
    }

    public String toString() {
        StringBuilder sb3 = new StringBuilder("[errorMargin: ");
        sb3.append(RecordUtils.fieldToString(Float.valueOf(this.errorMargin)));
        sb3.append(", preciseEstimationTimeout: ");
        com.google.protobuf.a.h(this.preciseEstimationTimeout, ", timeout: ", sb3);
        com.google.protobuf.a.h(this.timeout, ", extraOptions: ", sb3);
        sb3.append(RecordUtils.fieldToString(this.extraOptions));
        sb3.append("]");
        return sb3.toString();
    }

    public TileRegionEstimateOptions(float f14, long j8, long j14, Value value) {
        this.errorMargin = f14;
        this.preciseEstimationTimeout = j8;
        this.timeout = j14;
        this.extraOptions = value;
    }
}
