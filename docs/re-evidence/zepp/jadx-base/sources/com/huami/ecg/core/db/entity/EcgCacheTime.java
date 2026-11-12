package com.huami.ecg.core.db.entity;

import androidx.room.ColumnInfo;
import androidx.room.Entity;
import androidx.room.PrimaryKey;
import com.google.gson.annotations.SerializedName;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes8.dex */
@Entity(tableName = EcgCacheTime.TABLE_NAME)
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0014\b\u0087\b\u0018\u0000 \"2\u00020\u0001:\u0001\"B%\u0012\b\b\u0002\u0010\b\u001a\u00020\u0002\u0012\b\b\u0002\u0010\t\u001a\u00020\u0005\u0012\b\b\u0002\u0010\n\u001a\u00020\u0005¢\u0006\u0004\b \u0010!J\b\u0010\u0003\u001a\u00020\u0002H\u0016J\t\u0010\u0004\u001a\u00020\u0002HÆ\u0003J\t\u0010\u0006\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0007\u001a\u00020\u0005HÆ\u0003J'\u0010\u000b\u001a\u00020\u00002\b\b\u0002\u0010\b\u001a\u00020\u00022\b\b\u0002\u0010\t\u001a\u00020\u00052\b\b\u0002\u0010\n\u001a\u00020\u0005HÆ\u0001J\t\u0010\r\u001a\u00020\fHÖ\u0001J\u0013\u0010\u0010\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\u0001HÖ\u0003R\"\u0010\b\u001a\u00020\u00028\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014\"\u0004\b\u0015\u0010\u0016R\"\u0010\t\u001a\u00020\u00058\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0019\u0010\u001a\"\u0004\b\u001b\u0010\u001cR\"\u0010\n\u001a\u00020\u00058\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b\u001d\u0010\u0018\u001a\u0004\b\u001e\u0010\u001a\"\u0004\b\u001f\u0010\u001c¨\u0006#"}, d2 = {"Lcom/huami/ecg/core/db/entity/EcgCacheTime;", "", "", "toString", "component1", "", "component2", "component3", "userId", EcgCacheTime.CACHE_START_DAY, EcgCacheTime.CACHE_END_DAY, "copy", "", "hashCode", "other", "", "equals", "a", "Ljava/lang/String;", "getUserId", "()Ljava/lang/String;", "setUserId", "(Ljava/lang/String;)V", "b", "J", "getCacheStartDay", "()J", "setCacheStartDay", "(J)V", "c", "getCacheEndDay", "setCacheEndDay", "<init>", "(Ljava/lang/String;JJ)V", "Companion", "ecg-core_release"}, k = 1, mv = {1, 4, 0})
public final /* data */ class EcgCacheTime {

    @NotNull
    public static final String CACHE_END_DAY = "cacheEndDay";

    @NotNull
    public static final String CACHE_START_DAY = "cacheStartDay";

    @NotNull
    public static final String TABLE_NAME = "ecg_sync_time";

    @NotNull
    public static final String USER_ID = "userId";

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @SerializedName("userId")
    @PrimaryKey(autoGenerate = false)
    @ColumnInfo(defaultValue = "", name = "userId")
    @NotNull
    private String userId;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @SerializedName(CACHE_START_DAY)
    @ColumnInfo(name = CACHE_START_DAY)
    private long cacheStartDay;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    @SerializedName(CACHE_END_DAY)
    @ColumnInfo(name = CACHE_END_DAY)
    private long cacheEndDay;

    public EcgCacheTime() {
        this(null, 0L, 0L, 7, null);
    }

    public EcgCacheTime(@NotNull String str, long j, long j2) {
        this.userId = str;
        this.cacheStartDay = j;
        this.cacheEndDay = j2;
    }

    public static /* synthetic */ EcgCacheTime copy$default(EcgCacheTime ecgCacheTime, String str, long j, long j2, int i, Object obj) {
        if ((i & 1) != 0) {
            str = ecgCacheTime.userId;
        }
        if ((i & 2) != 0) {
            j = ecgCacheTime.cacheStartDay;
        }
        long j3 = j;
        if ((i & 4) != 0) {
            j2 = ecgCacheTime.cacheEndDay;
        }
        return ecgCacheTime.copy(str, j3, j2);
    }

    @NotNull
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getUserId() {
        return this.userId;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final long getCacheStartDay() {
        return this.cacheStartDay;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final long getCacheEndDay() {
        return this.cacheEndDay;
    }

    @NotNull
    public final EcgCacheTime copy(@NotNull String userId, long cacheStartDay, long cacheEndDay) {
        return new EcgCacheTime(userId, cacheStartDay, cacheEndDay);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof EcgCacheTime)) {
            return false;
        }
        EcgCacheTime ecgCacheTime = (EcgCacheTime) other;
        return Intrinsics.areEqual(this.userId, ecgCacheTime.userId) && this.cacheStartDay == ecgCacheTime.cacheStartDay && this.cacheEndDay == ecgCacheTime.cacheEndDay;
    }

    public final long getCacheEndDay() {
        return this.cacheEndDay;
    }

    public final long getCacheStartDay() {
        return this.cacheStartDay;
    }

    @NotNull
    public final String getUserId() {
        return this.userId;
    }

    public int hashCode() {
        String str = this.userId;
        int iHashCode = str != null ? str.hashCode() : 0;
        long j = this.cacheStartDay;
        int i = ((iHashCode * 31) + ((int) (j ^ (j >>> 32)))) * 31;
        long j2 = this.cacheEndDay;
        return i + ((int) (j2 ^ (j2 >>> 32)));
    }

    public final void setCacheEndDay(long j) {
        this.cacheEndDay = j;
    }

    public final void setCacheStartDay(long j) {
        this.cacheStartDay = j;
    }

    public final void setUserId(@NotNull String str) {
        this.userId = str;
    }

    @NotNull
    public String toString() {
        return "{userId:" + this.userId + ",cacheStartDay:" + this.cacheStartDay + ",cacheEndDay:" + this.cacheEndDay + '}';
    }

    public /* synthetic */ EcgCacheTime(String str, long j, long j2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? -1L : j, (i & 4) != 0 ? -1L : j2);
    }
}
