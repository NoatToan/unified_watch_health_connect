package com.xiaomi.fitness.aggregation.health.entity;

import androidx.room.ColumnInfo;
import androidx.room.Entity;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes7.dex */
@Entity(primaryKeys = {"tag", "key", "time"}, tableName = CloudContract.TABLE_STAT)
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0010\b\n\u0002\b\u0010\n\u0002\u0010\u000b\n\u0002\b\u0012\b\u0087\b\u0018\u00002\u00020\u0001B?\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\u0006\u0010\t\u001a\u00020\u0006\u0012\u0006\u0010\n\u001a\u00020\u0003\u0012\u0006\u0010\u000b\u001a\u00020\u0006¢\u0006\u0004\b\f\u0010\rJ\t\u0010\u001f\u001a\u00020\u0003HÆ\u0003J\t\u0010 \u001a\u00020\u0003HÆ\u0003J\t\u0010!\u001a\u00020\u0006HÆ\u0003J\t\u0010\"\u001a\u00020\bHÆ\u0003J\t\u0010#\u001a\u00020\u0006HÆ\u0003J\t\u0010$\u001a\u00020\u0003HÆ\u0003J\t\u0010%\u001a\u00020\u0006HÆ\u0003JO\u0010&\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00062\b\b\u0002\u0010\u0007\u001a\u00020\b2\b\b\u0002\u0010\t\u001a\u00020\u00062\b\b\u0002\u0010\n\u001a\u00020\u00032\b\b\u0002\u0010\u000b\u001a\u00020\u0006HÆ\u0001J\u0013\u0010'\u001a\u00020\u00192\b\u0010(\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010)\u001a\u00020\bHÖ\u0001J\t\u0010*\u001a\u00020\u0003HÖ\u0001R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0016\u0010\u0004\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u000fR\u0016\u0010\u0005\u001a\u00020\u00068\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u0016\u0010\u0007\u001a\u00020\b8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0016\u0010\t\u001a\u00020\u00068\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0012R\u0016\u0010\n\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u000fR\u0016\u0010\u000b\u001a\u00020\u00068\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0012R\u001e\u0010\u0018\u001a\u00020\u00198\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0018\u0010\u001a\"\u0004\b\u001b\u0010\u001cR\u001e\u0010\u001d\u001a\u00020\u00198\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001d\u0010\u001a\"\u0004\b\u001e\u0010\u001c¨\u0006+"}, d2 = {"Lcom/xiaomi/fitness/aggregation/health/entity/StatDataEntity;", "", "tag", "", "key", "time", "", CloudContract.COL_ZONE_OFFSET, "", "timeInZero", "value", "updateTime", "<init>", "(Ljava/lang/String;Ljava/lang/String;JIJLjava/lang/String;J)V", "getTag", "()Ljava/lang/String;", "getKey", "getTime", "()J", "getZoneOffset", "()I", "getTimeInZero", "getValue", "getUpdateTime", "isUpload", "", "()Z", "setUpload", "(Z)V", "isDeleted", "setDeleted", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "copy", "equals", "other", "hashCode", "toString", "fitness-data-core_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class StatDataEntity {

    @ColumnInfo(name = "isDeleted")
    private boolean isDeleted;

    @ColumnInfo(name = "isUpload")
    private boolean isUpload;

    @ColumnInfo(name = "key")
    @NotNull
    private final String key;

    @ColumnInfo(name = "tag")
    @NotNull
    private final String tag;

    @ColumnInfo(name = "time")
    private final long time;

    @ColumnInfo(name = "timeInZero")
    private final long timeInZero;

    @ColumnInfo(name = "updateTime")
    private final long updateTime;

    @ColumnInfo(name = "value")
    @NotNull
    private final String value;

    @ColumnInfo(name = CloudContract.COL_ZONE_OFFSET)
    private final int zoneOffset;

    public StatDataEntity(@NotNull String tag, @NotNull String key, long j, int i, long j2, @NotNull String value, long j3) {
        Intrinsics.checkNotNullParameter(tag, "tag");
        Intrinsics.checkNotNullParameter(key, "key");
        Intrinsics.checkNotNullParameter(value, "value");
        this.tag = tag;
        this.key = key;
        this.time = j;
        this.zoneOffset = i;
        this.timeInZero = j2;
        this.value = value;
        this.updateTime = j3;
    }

    @NotNull
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getTag() {
        return this.tag;
    }

    @NotNull
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getKey() {
        return this.key;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final long getTime() {
        return this.time;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final int getZoneOffset() {
        return this.zoneOffset;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final long getTimeInZero() {
        return this.timeInZero;
    }

    @NotNull
    /* JADX INFO: renamed from: component6, reason: from getter */
    public final String getValue() {
        return this.value;
    }

    /* JADX INFO: renamed from: component7, reason: from getter */
    public final long getUpdateTime() {
        return this.updateTime;
    }

    @NotNull
    public final StatDataEntity copy(@NotNull String tag, @NotNull String key, long time, int zoneOffset, long timeInZero, @NotNull String value, long updateTime) {
        Intrinsics.checkNotNullParameter(tag, "tag");
        Intrinsics.checkNotNullParameter(key, "key");
        Intrinsics.checkNotNullParameter(value, "value");
        return new StatDataEntity(tag, key, time, zoneOffset, timeInZero, value, updateTime);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof StatDataEntity)) {
            return false;
        }
        StatDataEntity statDataEntity = (StatDataEntity) other;
        return Intrinsics.areEqual(this.tag, statDataEntity.tag) && Intrinsics.areEqual(this.key, statDataEntity.key) && this.time == statDataEntity.time && this.zoneOffset == statDataEntity.zoneOffset && this.timeInZero == statDataEntity.timeInZero && Intrinsics.areEqual(this.value, statDataEntity.value) && this.updateTime == statDataEntity.updateTime;
    }

    @NotNull
    public final String getKey() {
        return this.key;
    }

    @NotNull
    public final String getTag() {
        return this.tag;
    }

    public final long getTime() {
        return this.time;
    }

    public final long getTimeInZero() {
        return this.timeInZero;
    }

    public final long getUpdateTime() {
        return this.updateTime;
    }

    @NotNull
    public final String getValue() {
        return this.value;
    }

    public final int getZoneOffset() {
        return this.zoneOffset;
    }

    public int hashCode() {
        return (((((((((((this.tag.hashCode() * 31) + this.key.hashCode()) * 31) + Long.hashCode(this.time)) * 31) + Integer.hashCode(this.zoneOffset)) * 31) + Long.hashCode(this.timeInZero)) * 31) + this.value.hashCode()) * 31) + Long.hashCode(this.updateTime);
    }

    /* JADX INFO: renamed from: isDeleted, reason: from getter */
    public final boolean getIsDeleted() {
        return this.isDeleted;
    }

    /* JADX INFO: renamed from: isUpload, reason: from getter */
    public final boolean getIsUpload() {
        return this.isUpload;
    }

    public final void setDeleted(boolean z) {
        this.isDeleted = z;
    }

    public final void setUpload(boolean z) {
        this.isUpload = z;
    }

    @NotNull
    public String toString() {
        return "StatDataEntity(tag=" + this.tag + ", key=" + this.key + ", time=" + this.time + ", zoneOffset=" + this.zoneOffset + ", timeInZero=" + this.timeInZero + ", value=" + this.value + ", updateTime=" + this.updateTime + ")";
    }
}
