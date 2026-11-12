package com.huami.bigdata.statistics.core.entity;

import androidx.annotation.Keep;
import defpackage.b;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes5.dex */
@Keep
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\u0007\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\f\b\u0087\b\u0018\u00002\u00020\u0001B'\u0012\u0006\u0010\b\u001a\u00020\u0002\u0012\u0006\u0010\t\u001a\u00020\u0002\u0012\u0006\u0010\n\u001a\u00020\u0002\u0012\u0006\u0010\u000b\u001a\u00020\u0006¢\u0006\u0004\b\u001b\u0010\u001cJ\t\u0010\u0003\u001a\u00020\u0002HÆ\u0003J\t\u0010\u0004\u001a\u00020\u0002HÆ\u0003J\t\u0010\u0005\u001a\u00020\u0002HÆ\u0003J\t\u0010\u0007\u001a\u00020\u0006HÆ\u0003J1\u0010\f\u001a\u00020\u00002\b\b\u0002\u0010\b\u001a\u00020\u00022\b\b\u0002\u0010\t\u001a\u00020\u00022\b\b\u0002\u0010\n\u001a\u00020\u00022\b\b\u0002\u0010\u000b\u001a\u00020\u0006HÆ\u0001J\t\u0010\r\u001a\u00020\u0002HÖ\u0001J\t\u0010\u000f\u001a\u00020\u000eHÖ\u0001J\u0013\u0010\u0012\u001a\u00020\u00112\b\u0010\u0010\u001a\u0004\u0018\u00010\u0001HÖ\u0003R\u0019\u0010\b\u001a\u00020\u00028\u0006@\u0006¢\u0006\f\n\u0004\b\b\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015R\u0019\u0010\t\u001a\u00020\u00028\u0006@\u0006¢\u0006\f\n\u0004\b\t\u0010\u0013\u001a\u0004\b\u0016\u0010\u0015R\u0019\u0010\n\u001a\u00020\u00028\u0006@\u0006¢\u0006\f\n\u0004\b\n\u0010\u0013\u001a\u0004\b\u0017\u0010\u0015R\u0019\u0010\u000b\u001a\u00020\u00068\u0006@\u0006¢\u0006\f\n\u0004\b\u000b\u0010\u0018\u001a\u0004\b\u0019\u0010\u001a¨\u0006\u001d"}, d2 = {"Lcom/huami/bigdata/statistics/core/entity/ExportEntity;", "", "", "component1", "component2", "component3", "", "component4", "userId", "exportKey", "details", "lastUpdatedTime", "copy", "toString", "", "hashCode", "other", "", "equals", "Ljava/lang/String;", "getUserId", "()Ljava/lang/String;", "getExportKey", "getDetails", "J", "getLastUpdatedTime", "()J", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;J)V", "core_release"}, k = 1, mv = {1, 5, 1})
public final /* data */ class ExportEntity {

    @NotNull
    private final String details;

    @NotNull
    private final String exportKey;
    private final long lastUpdatedTime;

    @NotNull
    private final String userId;

    public ExportEntity(@NotNull String str, @NotNull String str2, @NotNull String str3, long j) {
        this.userId = str;
        this.exportKey = str2;
        this.details = str3;
        this.lastUpdatedTime = j;
    }

    public static /* synthetic */ ExportEntity copy$default(ExportEntity exportEntity, String str, String str2, String str3, long j, int i, Object obj) {
        if ((i & 1) != 0) {
            str = exportEntity.userId;
        }
        if ((i & 2) != 0) {
            str2 = exportEntity.exportKey;
        }
        String str4 = str2;
        if ((i & 4) != 0) {
            str3 = exportEntity.details;
        }
        String str5 = str3;
        if ((i & 8) != 0) {
            j = exportEntity.lastUpdatedTime;
        }
        return exportEntity.copy(str, str4, str5, j);
    }

    @NotNull
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getUserId() {
        return this.userId;
    }

    @NotNull
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getExportKey() {
        return this.exportKey;
    }

    @NotNull
    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getDetails() {
        return this.details;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final long getLastUpdatedTime() {
        return this.lastUpdatedTime;
    }

    @NotNull
    public final ExportEntity copy(@NotNull String userId, @NotNull String exportKey, @NotNull String details, long lastUpdatedTime) {
        return new ExportEntity(userId, exportKey, details, lastUpdatedTime);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ExportEntity)) {
            return false;
        }
        ExportEntity exportEntity = (ExportEntity) other;
        return Intrinsics.areEqual(this.userId, exportEntity.userId) && Intrinsics.areEqual(this.exportKey, exportEntity.exportKey) && Intrinsics.areEqual(this.details, exportEntity.details) && this.lastUpdatedTime == exportEntity.lastUpdatedTime;
    }

    @NotNull
    public final String getDetails() {
        return this.details;
    }

    @NotNull
    public final String getExportKey() {
        return this.exportKey;
    }

    public final long getLastUpdatedTime() {
        return this.lastUpdatedTime;
    }

    @NotNull
    public final String getUserId() {
        return this.userId;
    }

    public int hashCode() {
        return (((((this.userId.hashCode() * 31) + this.exportKey.hashCode()) * 31) + this.details.hashCode()) * 31) + b.a(this.lastUpdatedTime);
    }

    @NotNull
    public String toString() {
        return "ExportEntity(userId=" + this.userId + ", exportKey=" + this.exportKey + ", details=" + this.details + ", lastUpdatedTime=" + this.lastUpdatedTime + ")";
    }
}
