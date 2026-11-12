package com.mapbox.common;

import com.mapbox.bindgen.RecordUtils;
import java.io.Serializable;
import java.util.Objects;

/* JADX INFO: loaded from: classes2.dex */
public class ResourceLoadProgress implements Serializable {
    private final long bytes;
    private final Long totalBytes;

    static {
        BaseMapboxInitializer.init(MapboxSDKCommonInitializerImpl.class);
    }

    public ResourceLoadProgress(long j8, Long l14) {
        this.bytes = j8;
        this.totalBytes = l14;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ResourceLoadProgress resourceLoadProgress = (ResourceLoadProgress) obj;
        return this.bytes == resourceLoadProgress.bytes && Objects.equals(this.totalBytes, resourceLoadProgress.totalBytes);
    }

    public long getBytes() {
        return this.bytes;
    }

    public Long getTotalBytes() {
        return this.totalBytes;
    }

    public int hashCode() {
        return Objects.hash(Long.valueOf(this.bytes), this.totalBytes);
    }

    public String toString() {
        StringBuilder sb3 = new StringBuilder("[bytes: ");
        com.google.protobuf.a.h(this.bytes, ", totalBytes: ", sb3);
        sb3.append(RecordUtils.fieldToString(this.totalBytes));
        sb3.append("]");
        return sb3.toString();
    }
}
