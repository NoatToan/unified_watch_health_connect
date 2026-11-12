package com.mapbox.common;

import com.mapbox.bindgen.RecordUtils;
import java.io.Serializable;
import java.util.Objects;

/* JADX INFO: loaded from: classes2.dex */
public class TileRegionLoadProgress implements Serializable {
    private final long completedResourceCount;
    private final long completedResourceSize;
    private final long erroredResourceCount;
    private final long loadedResourceCount;
    private final long loadedResourceSize;
    private final long requiredResourceCount;

    static {
        BaseMapboxInitializer.init(MapboxSDKCommonInitializerImpl.class);
    }

    public TileRegionLoadProgress(long j8, long j14, long j15, long j16, long j17, long j18) {
        this.completedResourceCount = j8;
        this.completedResourceSize = j14;
        this.erroredResourceCount = j15;
        this.requiredResourceCount = j16;
        this.loadedResourceCount = j17;
        this.loadedResourceSize = j18;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        TileRegionLoadProgress tileRegionLoadProgress = (TileRegionLoadProgress) obj;
        return this.completedResourceCount == tileRegionLoadProgress.completedResourceCount && this.completedResourceSize == tileRegionLoadProgress.completedResourceSize && this.erroredResourceCount == tileRegionLoadProgress.erroredResourceCount && this.requiredResourceCount == tileRegionLoadProgress.requiredResourceCount && this.loadedResourceCount == tileRegionLoadProgress.loadedResourceCount && this.loadedResourceSize == tileRegionLoadProgress.loadedResourceSize;
    }

    public long getCompletedResourceCount() {
        return this.completedResourceCount;
    }

    public long getCompletedResourceSize() {
        return this.completedResourceSize;
    }

    public long getErroredResourceCount() {
        return this.erroredResourceCount;
    }

    public long getLoadedResourceCount() {
        return this.loadedResourceCount;
    }

    public long getLoadedResourceSize() {
        return this.loadedResourceSize;
    }

    public long getRequiredResourceCount() {
        return this.requiredResourceCount;
    }

    public int hashCode() {
        return Objects.hash(Long.valueOf(this.completedResourceCount), Long.valueOf(this.completedResourceSize), Long.valueOf(this.erroredResourceCount), Long.valueOf(this.requiredResourceCount), Long.valueOf(this.loadedResourceCount), Long.valueOf(this.loadedResourceSize));
    }

    public String toString() {
        StringBuilder sb3 = new StringBuilder("[completedResourceCount: ");
        com.google.protobuf.a.h(this.completedResourceCount, ", completedResourceSize: ", sb3);
        com.google.protobuf.a.h(this.completedResourceSize, ", erroredResourceCount: ", sb3);
        com.google.protobuf.a.h(this.erroredResourceCount, ", requiredResourceCount: ", sb3);
        com.google.protobuf.a.h(this.requiredResourceCount, ", loadedResourceCount: ", sb3);
        com.google.protobuf.a.h(this.loadedResourceCount, ", loadedResourceSize: ", sb3);
        sb3.append(RecordUtils.fieldToString(Long.valueOf(this.loadedResourceSize)));
        sb3.append("]");
        return sb3.toString();
    }
}
