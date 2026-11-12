package com.mapbox.maps;

import com.mapbox.bindgen.RecordUtils;
import com.mapbox.common.BaseMapboxInitializer;
import com.mapbox.maps.loader.MapboxMapsInitializerImpl;
import java.io.Serializable;
import java.util.Objects;

/* JADX INFO: loaded from: classes2.dex */
@Deprecated
public final class OfflineRegionStatus implements Serializable {
    private final long completedResourceCount;
    private final long completedResourceSize;
    private final long completedTileCount;
    private final long completedTileSize;
    private final OfflineRegionDownloadState downloadState;
    private final long requiredResourceCount;
    private final boolean requiredResourceCountIsPrecise;
    private final long requiredTileCount;

    static {
        BaseMapboxInitializer.init(MapboxMapsInitializerImpl.class);
    }

    public OfflineRegionStatus(OfflineRegionDownloadState offlineRegionDownloadState, long j8, long j14, long j15, long j16, long j17, long j18, boolean z14) {
        this.downloadState = offlineRegionDownloadState;
        this.completedResourceCount = j8;
        this.completedResourceSize = j14;
        this.completedTileCount = j15;
        this.requiredTileCount = j16;
        this.completedTileSize = j17;
        this.requiredResourceCount = j18;
        this.requiredResourceCountIsPrecise = z14;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || OfflineRegionStatus.class != obj.getClass()) {
            return false;
        }
        OfflineRegionStatus offlineRegionStatus = (OfflineRegionStatus) obj;
        return Objects.equals(this.downloadState, offlineRegionStatus.downloadState) && this.completedResourceCount == offlineRegionStatus.completedResourceCount && this.completedResourceSize == offlineRegionStatus.completedResourceSize && this.completedTileCount == offlineRegionStatus.completedTileCount && this.requiredTileCount == offlineRegionStatus.requiredTileCount && this.completedTileSize == offlineRegionStatus.completedTileSize && this.requiredResourceCount == offlineRegionStatus.requiredResourceCount && this.requiredResourceCountIsPrecise == offlineRegionStatus.requiredResourceCountIsPrecise;
    }

    public long getCompletedResourceCount() {
        return this.completedResourceCount;
    }

    public long getCompletedResourceSize() {
        return this.completedResourceSize;
    }

    public long getCompletedTileCount() {
        return this.completedTileCount;
    }

    public long getCompletedTileSize() {
        return this.completedTileSize;
    }

    public OfflineRegionDownloadState getDownloadState() {
        return this.downloadState;
    }

    public long getRequiredResourceCount() {
        return this.requiredResourceCount;
    }

    public boolean getRequiredResourceCountIsPrecise() {
        return this.requiredResourceCountIsPrecise;
    }

    public long getRequiredTileCount() {
        return this.requiredTileCount;
    }

    public int hashCode() {
        return Objects.hash(this.downloadState, Long.valueOf(this.completedResourceCount), Long.valueOf(this.completedResourceSize), Long.valueOf(this.completedTileCount), Long.valueOf(this.requiredTileCount), Long.valueOf(this.completedTileSize), Long.valueOf(this.requiredResourceCount), Boolean.valueOf(this.requiredResourceCountIsPrecise));
    }

    public String toString() {
        StringBuilder sb3 = new StringBuilder("[downloadState: ");
        sb3.append(RecordUtils.fieldToString(this.downloadState));
        sb3.append(", completedResourceCount: ");
        com.google.protobuf.a.h(this.completedResourceCount, ", completedResourceSize: ", sb3);
        com.google.protobuf.a.h(this.completedResourceSize, ", completedTileCount: ", sb3);
        com.google.protobuf.a.h(this.completedTileCount, ", requiredTileCount: ", sb3);
        com.google.protobuf.a.h(this.requiredTileCount, ", completedTileSize: ", sb3);
        com.google.protobuf.a.h(this.completedTileSize, ", requiredResourceCount: ", sb3);
        com.google.protobuf.a.h(this.requiredResourceCount, ", requiredResourceCountIsPrecise: ", sb3);
        sb3.append(RecordUtils.fieldToString(Boolean.valueOf(this.requiredResourceCountIsPrecise)));
        sb3.append("]");
        return sb3.toString();
    }
}
