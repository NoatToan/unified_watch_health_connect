package com.mapbox.common;

import com.mapbox.bindgen.RecordUtils;
import java.io.Serializable;
import java.util.Objects;

/* JADX INFO: loaded from: classes2.dex */
public class TileRegionEstimateProgress implements Serializable {
    private final long completedResourceCount;
    private final long erroredResourceCount;
    private final TileRegionEstimateResult partialResult;
    private final long requiredResourceCount;

    static {
        BaseMapboxInitializer.init(MapboxSDKCommonInitializerImpl.class);
    }

    public TileRegionEstimateProgress(long j8, long j14, long j15, TileRegionEstimateResult tileRegionEstimateResult) {
        this.requiredResourceCount = j8;
        this.erroredResourceCount = j14;
        this.completedResourceCount = j15;
        this.partialResult = tileRegionEstimateResult;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        TileRegionEstimateProgress tileRegionEstimateProgress = (TileRegionEstimateProgress) obj;
        return this.requiredResourceCount == tileRegionEstimateProgress.requiredResourceCount && this.erroredResourceCount == tileRegionEstimateProgress.erroredResourceCount && this.completedResourceCount == tileRegionEstimateProgress.completedResourceCount && Objects.equals(this.partialResult, tileRegionEstimateProgress.partialResult);
    }

    public long getCompletedResourceCount() {
        return this.completedResourceCount;
    }

    public long getErroredResourceCount() {
        return this.erroredResourceCount;
    }

    public TileRegionEstimateResult getPartialResult() {
        return this.partialResult;
    }

    public long getRequiredResourceCount() {
        return this.requiredResourceCount;
    }

    public int hashCode() {
        return Objects.hash(Long.valueOf(this.requiredResourceCount), Long.valueOf(this.erroredResourceCount), Long.valueOf(this.completedResourceCount), this.partialResult);
    }

    public String toString() {
        StringBuilder sb3 = new StringBuilder("[requiredResourceCount: ");
        com.google.protobuf.a.h(this.requiredResourceCount, ", erroredResourceCount: ", sb3);
        com.google.protobuf.a.h(this.erroredResourceCount, ", completedResourceCount: ", sb3);
        com.google.protobuf.a.h(this.completedResourceCount, ", partialResult: ", sb3);
        sb3.append(RecordUtils.fieldToString(this.partialResult));
        sb3.append("]");
        return sb3.toString();
    }
}
