package com.huami.healthlabel.healthlabelhistory.adapter;

import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u000e\b\u0080\b\u0018\u00002\u00020\u0001B)\u0012\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\b\b\u0002\u0010\t\u001a\u00020\u0005\u0012\b\b\u0002\u0010\n\u001a\u00020\u0005¢\u0006\u0004\b\u001a\u0010\u001bJ\u000f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002HÆ\u0003J\t\u0010\u0006\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0007\u001a\u00020\u0005HÆ\u0003J-\u0010\u000b\u001a\u00020\u00002\u000e\b\u0002\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\b\b\u0002\u0010\t\u001a\u00020\u00052\b\b\u0002\u0010\n\u001a\u00020\u0005HÆ\u0001J\t\u0010\r\u001a\u00020\fHÖ\u0001J\t\u0010\u000f\u001a\u00020\u000eHÖ\u0001J\u0013\u0010\u0011\u001a\u00020\u00052\b\u0010\u0010\u001a\u0004\u0018\u00010\u0001HÖ\u0003R\u001f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0006@\u0006¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015R\u0019\u0010\t\u001a\u00020\u00058\u0006@\u0006¢\u0006\f\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\t\u0010\u0018R\u0019\u0010\n\u001a\u00020\u00058\u0006@\u0006¢\u0006\f\n\u0004\b\u0019\u0010\u0017\u001a\u0004\b\n\u0010\u0018¨\u0006\u001c"}, d2 = {"Lcom/huami/healthlabel/healthlabelhistory/adapter/LoadMoreLabelHistoryData;", "", "", "Lcom/huami/healthlabel/healthlabelhistory/adapter/HealthLabelHistoryEntity;", "component1", "", "component2", "component3", "healthLabelHistoryEntity", "isLoadMoreEnd", "isOldLabelDate", "copy", "", "toString", "", "hashCode", "other", "equals", "a", "Ljava/util/List;", "getHealthLabelHistoryEntity", "()Ljava/util/List;", "b", "Z", "()Z", "c", "<init>", "(Ljava/util/List;ZZ)V", "healthLabel_release"}, k = 1, mv = {1, 5, 1})
public final /* data */ class LoadMoreLabelHistoryData {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata and from toString */
    @NotNull
    private final List<HealthLabelHistoryEntity> healthLabelHistoryEntity;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata and from toString */
    private final boolean isLoadMoreEnd;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata and from toString */
    private final boolean isOldLabelDate;

    public LoadMoreLabelHistoryData(@NotNull List<HealthLabelHistoryEntity> list, boolean z, boolean z2) {
        this.healthLabelHistoryEntity = list;
        this.isLoadMoreEnd = z;
        this.isOldLabelDate = z2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ LoadMoreLabelHistoryData copy$default(LoadMoreLabelHistoryData loadMoreLabelHistoryData, List list, boolean z, boolean z2, int i, Object obj) {
        if ((i & 1) != 0) {
            list = loadMoreLabelHistoryData.healthLabelHistoryEntity;
        }
        if ((i & 2) != 0) {
            z = loadMoreLabelHistoryData.isLoadMoreEnd;
        }
        if ((i & 4) != 0) {
            z2 = loadMoreLabelHistoryData.isOldLabelDate;
        }
        return loadMoreLabelHistoryData.copy(list, z, z2);
    }

    @NotNull
    public final List<HealthLabelHistoryEntity> component1() {
        return this.healthLabelHistoryEntity;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final boolean getIsLoadMoreEnd() {
        return this.isLoadMoreEnd;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final boolean getIsOldLabelDate() {
        return this.isOldLabelDate;
    }

    @NotNull
    public final LoadMoreLabelHistoryData copy(@NotNull List<HealthLabelHistoryEntity> healthLabelHistoryEntity, boolean isLoadMoreEnd, boolean isOldLabelDate) {
        return new LoadMoreLabelHistoryData(healthLabelHistoryEntity, isLoadMoreEnd, isOldLabelDate);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof LoadMoreLabelHistoryData)) {
            return false;
        }
        LoadMoreLabelHistoryData loadMoreLabelHistoryData = (LoadMoreLabelHistoryData) other;
        return Intrinsics.areEqual(this.healthLabelHistoryEntity, loadMoreLabelHistoryData.healthLabelHistoryEntity) && this.isLoadMoreEnd == loadMoreLabelHistoryData.isLoadMoreEnd && this.isOldLabelDate == loadMoreLabelHistoryData.isOldLabelDate;
    }

    @NotNull
    public final List<HealthLabelHistoryEntity> getHealthLabelHistoryEntity() {
        return this.healthLabelHistoryEntity;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v3, types: [int] */
    /* JADX WARN: Type inference failed for: r0v5, types: [int] */
    /* JADX WARN: Type inference failed for: r1v1, types: [int] */
    /* JADX WARN: Type inference failed for: r1v3 */
    /* JADX WARN: Type inference failed for: r1v4 */
    /* JADX WARN: Type inference failed for: r2v0 */
    /* JADX WARN: Type inference failed for: r2v1, types: [int] */
    /* JADX WARN: Type inference failed for: r2v2 */
    public int hashCode() {
        int iHashCode = this.healthLabelHistoryEntity.hashCode() * 31;
        boolean z = this.isLoadMoreEnd;
        ?? r1 = z;
        if (z) {
            r1 = 1;
        }
        int i = (iHashCode + r1) * 31;
        boolean z2 = this.isOldLabelDate;
        return i + (z2 ? 1 : z2);
    }

    public final boolean isLoadMoreEnd() {
        return this.isLoadMoreEnd;
    }

    public final boolean isOldLabelDate() {
        return this.isOldLabelDate;
    }

    @NotNull
    public String toString() {
        return "LoadMoreLabelHistoryData(healthLabelHistoryEntity=" + this.healthLabelHistoryEntity + ", isLoadMoreEnd=" + this.isLoadMoreEnd + ", isOldLabelDate=" + this.isOldLabelDate + ")";
    }

    public /* synthetic */ LoadMoreLabelHistoryData(List list, boolean z, boolean z2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(list, (i & 2) != 0 ? true : z, (i & 4) != 0 ? false : z2);
    }
}
