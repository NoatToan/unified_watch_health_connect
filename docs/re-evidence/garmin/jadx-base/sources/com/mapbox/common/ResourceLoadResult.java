package com.mapbox.common;

import com.mapbox.bindgen.RecordUtils;
import java.io.Serializable;
import java.util.Date;
import java.util.Objects;

/* JADX INFO: loaded from: classes2.dex */
public class ResourceLoadResult implements Serializable {
    private final boolean belongsToGroup;
    private final String contentType;
    private final ResourceData data;
    private final String etag;
    private final Date expires;
    private final boolean immutable;
    private final boolean mustRevalidate;
    private final ResourceLoadStatus status;
    private final long totalBytes;
    private final long transferredBytes;

    static {
        BaseMapboxInitializer.init(MapboxSDKCommonInitializerImpl.class);
    }

    public ResourceLoadResult(ResourceData resourceData, ResourceLoadStatus resourceLoadStatus, boolean z14, boolean z15, Date date, long j8, long j14, String str, String str2, boolean z16) {
        this.data = resourceData;
        this.status = resourceLoadStatus;
        this.immutable = z14;
        this.mustRevalidate = z15;
        this.expires = date;
        this.totalBytes = j8;
        this.transferredBytes = j14;
        this.contentType = str;
        this.etag = str2;
        this.belongsToGroup = z16;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ResourceLoadResult resourceLoadResult = (ResourceLoadResult) obj;
        return Objects.equals(this.data, resourceLoadResult.data) && Objects.equals(this.status, resourceLoadResult.status) && this.immutable == resourceLoadResult.immutable && this.mustRevalidate == resourceLoadResult.mustRevalidate && Objects.equals(this.expires, resourceLoadResult.expires) && this.totalBytes == resourceLoadResult.totalBytes && this.transferredBytes == resourceLoadResult.transferredBytes && Objects.equals(this.contentType, resourceLoadResult.contentType) && Objects.equals(this.etag, resourceLoadResult.etag) && this.belongsToGroup == resourceLoadResult.belongsToGroup;
    }

    public boolean getBelongsToGroup() {
        return this.belongsToGroup;
    }

    public String getContentType() {
        return this.contentType;
    }

    public ResourceData getData() {
        return this.data;
    }

    public String getEtag() {
        return this.etag;
    }

    public Date getExpires() {
        return this.expires;
    }

    public boolean getImmutable() {
        return this.immutable;
    }

    public boolean getMustRevalidate() {
        return this.mustRevalidate;
    }

    public ResourceLoadStatus getStatus() {
        return this.status;
    }

    public long getTotalBytes() {
        return this.totalBytes;
    }

    public long getTransferredBytes() {
        return this.transferredBytes;
    }

    public int hashCode() {
        return Objects.hash(this.data, this.status, Boolean.valueOf(this.immutable), Boolean.valueOf(this.mustRevalidate), this.expires, Long.valueOf(this.totalBytes), Long.valueOf(this.transferredBytes), this.contentType, this.etag, Boolean.valueOf(this.belongsToGroup));
    }

    public String toString() {
        StringBuilder sb3 = new StringBuilder("[data: ");
        sb3.append(RecordUtils.fieldToString(this.data));
        sb3.append(", status: ");
        sb3.append(RecordUtils.fieldToString(this.status));
        sb3.append(", immutable: ");
        sb3.append(RecordUtils.fieldToString(Boolean.valueOf(this.immutable)));
        sb3.append(", mustRevalidate: ");
        sb3.append(RecordUtils.fieldToString(Boolean.valueOf(this.mustRevalidate)));
        sb3.append(", expires: ");
        sb3.append(RecordUtils.fieldToString(this.expires));
        sb3.append(", totalBytes: ");
        com.google.protobuf.a.h(this.totalBytes, ", transferredBytes: ", sb3);
        com.google.protobuf.a.h(this.transferredBytes, ", contentType: ", sb3);
        com.google.protobuf.a.k(this.contentType, ", etag: ", sb3);
        com.google.protobuf.a.k(this.etag, ", belongsToGroup: ", sb3);
        sb3.append(RecordUtils.fieldToString(Boolean.valueOf(this.belongsToGroup)));
        sb3.append("]");
        return sb3.toString();
    }
}
