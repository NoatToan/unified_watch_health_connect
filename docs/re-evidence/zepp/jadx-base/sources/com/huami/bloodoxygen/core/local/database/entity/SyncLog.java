package com.huami.bloodoxygen.core.local.database.entity;

import androidx.annotation.Keep;
import androidx.room.Entity;
import com.huami.bloodoxygen.core.local.config.BloodOxygen;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes5.dex */
@Entity(primaryKeys = {"userId", "type", "date"}, tableName = "sync_log")
@Keep
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0010\b\u0087\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0007\u001a\u00020\u0002\u0012\u0006\u0010\b\u001a\u00020\u0004\u0012\u0006\u0010\t\u001a\u00020\u0002¢\u0006\u0004\b\u001d\u0010\u001eJ\t\u0010\u0003\u001a\u00020\u0002HÆ\u0003J\t\u0010\u0005\u001a\u00020\u0004HÆ\u0003J\t\u0010\u0006\u001a\u00020\u0002HÆ\u0003J'\u0010\n\u001a\u00020\u00002\b\b\u0002\u0010\u0007\u001a\u00020\u00022\b\b\u0002\u0010\b\u001a\u00020\u00042\b\b\u0002\u0010\t\u001a\u00020\u0002HÆ\u0001J\t\u0010\u000b\u001a\u00020\u0002HÖ\u0001J\t\u0010\r\u001a\u00020\fHÖ\u0001J\u0013\u0010\u0010\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\u0001HÖ\u0003R\"\u0010\u0007\u001a\u00020\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0007\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013\"\u0004\b\u0014\u0010\u0015R\"\u0010\b\u001a\u00020\u00048\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\b\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018\"\u0004\b\u0019\u0010\u001aR\"\u0010\t\u001a\u00020\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\t\u0010\u0011\u001a\u0004\b\u001b\u0010\u0013\"\u0004\b\u001c\u0010\u0015¨\u0006\u001f"}, d2 = {"Lcom/huami/bloodoxygen/core/local/database/entity/SyncLog;", "", "", "component1", "Lcom/huami/bloodoxygen/core/local/config/BloodOxygen$SubType;", "component2", "component3", "userId", "type", "date", "copy", "toString", "", "hashCode", "other", "", "equals", "Ljava/lang/String;", "getUserId", "()Ljava/lang/String;", "setUserId", "(Ljava/lang/String;)V", "Lcom/huami/bloodoxygen/core/local/config/BloodOxygen$SubType;", "getType", "()Lcom/huami/bloodoxygen/core/local/config/BloodOxygen$SubType;", "setType", "(Lcom/huami/bloodoxygen/core/local/config/BloodOxygen$SubType;)V", "getDate", "setDate", "<init>", "(Ljava/lang/String;Lcom/huami/bloodoxygen/core/local/config/BloodOxygen$SubType;Ljava/lang/String;)V", "core_release"}, k = 1, mv = {1, 5, 1})
public final /* data */ class SyncLog {

    @NotNull
    private String date;

    @NotNull
    private BloodOxygen.SubType type;

    @NotNull
    private String userId;

    public SyncLog(@NotNull String str, @NotNull BloodOxygen.SubType subType, @NotNull String str2) {
        this.userId = str;
        this.type = subType;
        this.date = str2;
    }

    public static /* synthetic */ SyncLog copy$default(SyncLog syncLog, String str, BloodOxygen.SubType subType, String str2, int i, Object obj) {
        if ((i & 1) != 0) {
            str = syncLog.userId;
        }
        if ((i & 2) != 0) {
            subType = syncLog.type;
        }
        if ((i & 4) != 0) {
            str2 = syncLog.date;
        }
        return syncLog.copy(str, subType, str2);
    }

    @NotNull
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getUserId() {
        return this.userId;
    }

    @NotNull
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final BloodOxygen.SubType getType() {
        return this.type;
    }

    @NotNull
    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getDate() {
        return this.date;
    }

    @NotNull
    public final SyncLog copy(@NotNull String userId, @NotNull BloodOxygen.SubType type, @NotNull String date) {
        return new SyncLog(userId, type, date);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof SyncLog)) {
            return false;
        }
        SyncLog syncLog = (SyncLog) other;
        return Intrinsics.areEqual(this.userId, syncLog.userId) && this.type == syncLog.type && Intrinsics.areEqual(this.date, syncLog.date);
    }

    @NotNull
    public final String getDate() {
        return this.date;
    }

    @NotNull
    public final BloodOxygen.SubType getType() {
        return this.type;
    }

    @NotNull
    public final String getUserId() {
        return this.userId;
    }

    public int hashCode() {
        return (((this.userId.hashCode() * 31) + this.type.hashCode()) * 31) + this.date.hashCode();
    }

    public final void setDate(@NotNull String str) {
        this.date = str;
    }

    public final void setType(@NotNull BloodOxygen.SubType subType) {
        this.type = subType;
    }

    public final void setUserId(@NotNull String str) {
        this.userId = str;
    }

    @NotNull
    public String toString() {
        return "SyncLog(userId=" + this.userId + ", type=" + this.type + ", date=" + this.date + ")";
    }
}
