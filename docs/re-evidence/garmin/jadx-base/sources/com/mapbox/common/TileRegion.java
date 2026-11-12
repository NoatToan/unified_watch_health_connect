package com.mapbox.common;

import com.mapbox.bindgen.RecordUtils;
import com.mapbox.bindgen.Value;
import java.io.Serializable;
import java.util.Date;
import java.util.Objects;

/* JADX INFO: loaded from: classes2.dex */
public class TileRegion implements Serializable {
    private final long completedResourceCount;
    private final long completedResourceSize;
    private final Date expires;
    private final Value extraData;

    /* JADX INFO: renamed from: id, reason: collision with root package name */
    private final String f54343id;
    private final long requiredResourceCount;

    static {
        BaseMapboxInitializer.init(MapboxSDKCommonInitializerImpl.class);
    }

    public TileRegion(String str, long j8, long j14, long j15, Date date, Value value) {
        this.f54343id = str;
        this.requiredResourceCount = j8;
        this.completedResourceCount = j14;
        this.completedResourceSize = j15;
        this.expires = date;
        this.extraData = value;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        TileRegion tileRegion = (TileRegion) obj;
        return Objects.equals(this.f54343id, tileRegion.f54343id) && this.requiredResourceCount == tileRegion.requiredResourceCount && this.completedResourceCount == tileRegion.completedResourceCount && this.completedResourceSize == tileRegion.completedResourceSize && Objects.equals(this.expires, tileRegion.expires) && Objects.equals(this.extraData, tileRegion.extraData);
    }

    public long getCompletedResourceCount() {
        return this.completedResourceCount;
    }

    public long getCompletedResourceSize() {
        return this.completedResourceSize;
    }

    public Date getExpires() {
        return this.expires;
    }

    public Value getExtraData() {
        return this.extraData;
    }

    public String getId() {
        return this.f54343id;
    }

    public long getRequiredResourceCount() {
        return this.requiredResourceCount;
    }

    public int hashCode() {
        return Objects.hash(this.f54343id, Long.valueOf(this.requiredResourceCount), Long.valueOf(this.completedResourceCount), Long.valueOf(this.completedResourceSize), this.expires, this.extraData);
    }

    public String toString() {
        StringBuilder sb3 = new StringBuilder("[id: ");
        com.google.protobuf.a.k(this.f54343id, ", requiredResourceCount: ", sb3);
        com.google.protobuf.a.h(this.requiredResourceCount, ", completedResourceCount: ", sb3);
        com.google.protobuf.a.h(this.completedResourceCount, ", completedResourceSize: ", sb3);
        com.google.protobuf.a.h(this.completedResourceSize, ", expires: ", sb3);
        sb3.append(RecordUtils.fieldToString(this.expires));
        sb3.append(", extraData: ");
        sb3.append(RecordUtils.fieldToString(this.extraData));
        sb3.append("]");
        return sb3.toString();
    }
}
