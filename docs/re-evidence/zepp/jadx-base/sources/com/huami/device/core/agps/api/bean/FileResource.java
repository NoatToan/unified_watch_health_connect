package com.huami.device.core.agps.api.bean;

import com.huami.device.core.agps.api.DownloadResourceType;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\f\b\u0086\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0006\u001a\u00020\u0002\u0012\u0006\u0010\u0007\u001a\u00020\u0004¢\u0006\u0004\b\u0017\u0010\u0018J\t\u0010\u0003\u001a\u00020\u0002HÆ\u0003J\t\u0010\u0005\u001a\u00020\u0004HÆ\u0003J\u001d\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0006\u001a\u00020\u00022\b\b\u0002\u0010\u0007\u001a\u00020\u0004HÆ\u0001J\t\u0010\t\u001a\u00020\u0004HÖ\u0001J\t\u0010\u000b\u001a\u00020\nHÖ\u0001J\u0013\u0010\u000e\u001a\u00020\r2\b\u0010\f\u001a\u0004\u0018\u00010\u0001HÖ\u0003R\u0019\u0010\u0006\u001a\u00020\u00028\u0006@\u0006¢\u0006\f\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012R\u0019\u0010\u0007\u001a\u00020\u00048\u0006@\u0006¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016¨\u0006\u0019"}, d2 = {"Lcom/huami/device/core/agps/api/bean/FileResource;", "", "Lcom/huami/device/core/agps/api/DownloadResourceType;", "component1", "", "component2", "type", "path", "copy", "toString", "", "hashCode", "other", "", "equals", "a", "Lcom/huami/device/core/agps/api/DownloadResourceType;", "getType", "()Lcom/huami/device/core/agps/api/DownloadResourceType;", "b", "Ljava/lang/String;", "getPath", "()Ljava/lang/String;", "<init>", "(Lcom/huami/device/core/agps/api/DownloadResourceType;Ljava/lang/String;)V", "agps-api_release"}, k = 1, mv = {1, 4, 0})
public final /* data */ class FileResource {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata and from toString */
    @NotNull
    private final DownloadResourceType type;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata and from toString */
    @NotNull
    private final String path;

    public FileResource(@NotNull DownloadResourceType downloadResourceType, @NotNull String str) {
        this.type = downloadResourceType;
        this.path = str;
    }

    public static /* synthetic */ FileResource copy$default(FileResource fileResource, DownloadResourceType downloadResourceType, String str, int i, Object obj) {
        if ((i & 1) != 0) {
            downloadResourceType = fileResource.type;
        }
        if ((i & 2) != 0) {
            str = fileResource.path;
        }
        return fileResource.copy(downloadResourceType, str);
    }

    @NotNull
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final DownloadResourceType getType() {
        return this.type;
    }

    @NotNull
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getPath() {
        return this.path;
    }

    @NotNull
    public final FileResource copy(@NotNull DownloadResourceType type, @NotNull String path) {
        return new FileResource(type, path);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof FileResource)) {
            return false;
        }
        FileResource fileResource = (FileResource) other;
        return Intrinsics.areEqual(this.type, fileResource.type) && Intrinsics.areEqual(this.path, fileResource.path);
    }

    @NotNull
    public final String getPath() {
        return this.path;
    }

    @NotNull
    public final DownloadResourceType getType() {
        return this.type;
    }

    public int hashCode() {
        DownloadResourceType downloadResourceType = this.type;
        int iHashCode = (downloadResourceType != null ? downloadResourceType.hashCode() : 0) * 31;
        String str = this.path;
        return iHashCode + (str != null ? str.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        return "FileResource(type=" + this.type + ", path=" + this.path + ")";
    }
}
