package com.mapbox.maps;

import com.mapbox.bindgen.RecordUtils;
import com.mapbox.common.BaseMapboxInitializer;
import com.mapbox.maps.loader.MapboxMapsInitializerImpl;
import java.io.Serializable;
import java.util.Objects;

/* JADX INFO: loaded from: classes2.dex */
public final class StylePackLoadProgress implements Serializable {
    private final long completedResourceCount;
    private final long completedResourceSize;
    private final long erroredResourceCount;
    private final long loadedResourceCount;
    private final long loadedResourceSize;
    private final long requiredResourceCount;

    static {
        BaseMapboxInitializer.init(MapboxMapsInitializerImpl.class);
    }

    public StylePackLoadProgress(long j8, long j14, long j15, long j16, long j17, long j18) {
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
        if (obj == null || StylePackLoadProgress.class != obj.getClass()) {
            return false;
        }
        StylePackLoadProgress stylePackLoadProgress = (StylePackLoadProgress) obj;
        return this.completedResourceCount == stylePackLoadProgress.completedResourceCount && this.completedResourceSize == stylePackLoadProgress.completedResourceSize && this.erroredResourceCount == stylePackLoadProgress.erroredResourceCount && this.requiredResourceCount == stylePackLoadProgress.requiredResourceCount && this.loadedResourceCount == stylePackLoadProgress.loadedResourceCount && this.loadedResourceSize == stylePackLoadProgress.loadedResourceSize;
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
