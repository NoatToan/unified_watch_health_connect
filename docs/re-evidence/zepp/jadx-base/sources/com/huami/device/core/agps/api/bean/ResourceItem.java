package com.huami.device.core.agps.api.bean;

import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\b\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\f\b\u0086\b\u0018\u00002\u00020\u0001B#\u0012\u0006\u0010\u0006\u001a\u00020\u0002\u0012\u0006\u0010\u0007\u001a\u00020\u0002\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0018\u0010\u0019J\t\u0010\u0003\u001a\u00020\u0002HÆ\u0003J\t\u0010\u0004\u001a\u00020\u0002HÆ\u0003J\u000b\u0010\u0005\u001a\u0004\u0018\u00010\u0002HÆ\u0003J)\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0006\u001a\u00020\u00022\b\b\u0002\u0010\u0007\u001a\u00020\u00022\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0002HÆ\u0001J\t\u0010\n\u001a\u00020\u0002HÖ\u0001J\t\u0010\f\u001a\u00020\u000bHÖ\u0001J\u0013\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\u0001HÖ\u0003R\u0019\u0010\u0006\u001a\u00020\u00028\u0006@\u0006¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013R\u0019\u0010\u0007\u001a\u00020\u00028\u0006@\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0011\u001a\u0004\b\u0015\u0010\u0013R\u001b\u0010\b\u001a\u0004\u0018\u00010\u00028\u0006@\u0006¢\u0006\f\n\u0004\b\u0016\u0010\u0011\u001a\u0004\b\u0017\u0010\u0013¨\u0006\u001a"}, d2 = {"Lcom/huami/device/core/agps/api/bean/ResourceItem;", "", "", "component1", "component2", "component3", "fileType", "fileUrl", "secondaryUrl", "copy", "toString", "", "hashCode", "other", "", "equals", "a", "Ljava/lang/String;", "getFileType", "()Ljava/lang/String;", "b", "getFileUrl", "c", "getSecondaryUrl", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "agps-api_release"}, k = 1, mv = {1, 4, 0})
public final /* data */ class ResourceItem {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata and from toString */
    @NotNull
    private final String fileType;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata and from toString */
    @NotNull
    private final String fileUrl;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata and from toString */
    @Nullable
    private final String secondaryUrl;

    public ResourceItem(@NotNull String str, @NotNull String str2, @Nullable String str3) {
        this.fileType = str;
        this.fileUrl = str2;
        this.secondaryUrl = str3;
    }

    public static /* synthetic */ ResourceItem copy$default(ResourceItem resourceItem, String str, String str2, String str3, int i, Object obj) {
        if ((i & 1) != 0) {
            str = resourceItem.fileType;
        }
        if ((i & 2) != 0) {
            str2 = resourceItem.fileUrl;
        }
        if ((i & 4) != 0) {
            str3 = resourceItem.secondaryUrl;
        }
        return resourceItem.copy(str, str2, str3);
    }

    @NotNull
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getFileType() {
        return this.fileType;
    }

    @NotNull
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getFileUrl() {
        return this.fileUrl;
    }

    @Nullable
    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getSecondaryUrl() {
        return this.secondaryUrl;
    }

    @NotNull
    public final ResourceItem copy(@NotNull String fileType, @NotNull String fileUrl, @Nullable String secondaryUrl) {
        return new ResourceItem(fileType, fileUrl, secondaryUrl);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ResourceItem)) {
            return false;
        }
        ResourceItem resourceItem = (ResourceItem) other;
        return Intrinsics.areEqual(this.fileType, resourceItem.fileType) && Intrinsics.areEqual(this.fileUrl, resourceItem.fileUrl) && Intrinsics.areEqual(this.secondaryUrl, resourceItem.secondaryUrl);
    }

    @NotNull
    public final String getFileType() {
        return this.fileType;
    }

    @NotNull
    public final String getFileUrl() {
        return this.fileUrl;
    }

    @Nullable
    public final String getSecondaryUrl() {
        return this.secondaryUrl;
    }

    public int hashCode() {
        String str = this.fileType;
        int iHashCode = (str != null ? str.hashCode() : 0) * 31;
        String str2 = this.fileUrl;
        int iHashCode2 = (iHashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
        String str3 = this.secondaryUrl;
        return iHashCode2 + (str3 != null ? str3.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        return "ResourceItem(fileType=" + this.fileType + ", fileUrl=" + this.fileUrl + ", secondaryUrl=" + this.secondaryUrl + ")";
    }

    public /* synthetic */ ResourceItem(String str, String str2, String str3, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, str2, (i & 4) != 0 ? null : str3);
    }
}
