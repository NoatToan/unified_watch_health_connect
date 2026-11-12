package com.xiaomi.fitness.aggregation.health.entity;

import androidx.room.ColumnInfo;
import androidx.room.Entity;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes7.dex */
@Entity(primaryKeys = {"key", "time", "sid", CloudContract.COL_PROJECT_ID}, tableName = CloudContract.TABLE_DATA_PROJECT)
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0011\n\u0002\u0010\u000b\n\u0002\b\u0012\b\u0087\b\u0018\u00002\u00020\u0001B?\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\b\u001a\u00020\t\u0012\u0006\u0010\n\u001a\u00020\u0006\u0012\u0006\u0010\u000b\u001a\u00020\u0003¢\u0006\u0004\b\f\u0010\rJ\t\u0010!\u001a\u00020\u0003HÆ\u0003J\t\u0010\"\u001a\u00020\u0003HÆ\u0003J\t\u0010#\u001a\u00020\u0006HÆ\u0003J\t\u0010$\u001a\u00020\u0006HÆ\u0003J\t\u0010%\u001a\u00020\tHÆ\u0003J\t\u0010&\u001a\u00020\u0006HÆ\u0003J\t\u0010'\u001a\u00020\u0003HÆ\u0003JO\u0010(\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00062\b\b\u0002\u0010\u0007\u001a\u00020\u00062\b\b\u0002\u0010\b\u001a\u00020\t2\b\b\u0002\u0010\n\u001a\u00020\u00062\b\b\u0002\u0010\u000b\u001a\u00020\u0003HÆ\u0001J\u0013\u0010)\u001a\u00020\u001b2\b\u0010*\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010+\u001a\u00020\tHÖ\u0001J\t\u0010,\u001a\u00020\u0003HÖ\u0001R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0016\u0010\u0004\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u000fR\u001e\u0010\u0005\u001a\u00020\u00068\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0011\u0010\u0012\"\u0004\b\u0013\u0010\u0014R\u0016\u0010\u0007\u001a\u00020\u00068\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0012R\u0016\u0010\b\u001a\u00020\t8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0017R\u0016\u0010\n\u001a\u00020\u00068\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0012R\u0016\u0010\u000b\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u000fR\u001e\u0010\u001a\u001a\u00020\u001b8\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001a\u0010\u001c\"\u0004\b\u001d\u0010\u001eR\u001e\u0010\u001f\u001a\u00020\u001b8\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001f\u0010\u001c\"\u0004\b \u0010\u001e¨\u0006-"}, d2 = {"Lcom/xiaomi/fitness/aggregation/health/entity/ProjectEntity;", "", "sid", "", "key", CloudContract.COL_PROJECT_ID, "", "time", CloudContract.COL_ZONE_OFFSET, "", "timeInZero", "value", "<init>", "(Ljava/lang/String;Ljava/lang/String;JJIJLjava/lang/String;)V", "getSid", "()Ljava/lang/String;", "getKey", "getProjectId", "()J", "setProjectId", "(J)V", "getTime", "getZoneOffset", "()I", "getTimeInZero", "getValue", "isUpload", "", "()Z", "setUpload", "(Z)V", "isDeleted", "setDeleted", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "copy", "equals", "other", "hashCode", "toString", "fitness-data-core_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class ProjectEntity {

    @ColumnInfo(name = "isDeleted")
    private boolean isDeleted;

    @ColumnInfo(name = "isUpload")
    private boolean isUpload;

    @ColumnInfo(name = "key")
    @NotNull
    private final String key;

    @ColumnInfo(name = CloudContract.COL_PROJECT_ID)
    private long projectId;

    @ColumnInfo(name = "sid")
    @NotNull
    private final String sid;

    @ColumnInfo(name = "time")
    private final long time;

    @ColumnInfo(name = "timeInZero")
    private final long timeInZero;

    @ColumnInfo(name = "value")
    @NotNull
    private final String value;

    @ColumnInfo(name = CloudContract.COL_ZONE_OFFSET)
    private final int zoneOffset;

    public ProjectEntity(@NotNull String sid, @NotNull String key, long j, long j2, int i, long j3, @NotNull String value) {
        Intrinsics.checkNotNullParameter(sid, "sid");
        Intrinsics.checkNotNullParameter(key, "key");
        Intrinsics.checkNotNullParameter(value, "value");
        this.sid = sid;
        this.key = key;
        this.projectId = j;
        this.time = j2;
        this.zoneOffset = i;
        this.timeInZero = j3;
        this.value = value;
    }

    @NotNull
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getSid() {
        return this.sid;
    }

    @NotNull
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getKey() {
        return this.key;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final long getProjectId() {
        return this.projectId;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final long getTime() {
        return this.time;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final int getZoneOffset() {
        return this.zoneOffset;
    }

    /* JADX INFO: renamed from: component6, reason: from getter */
    public final long getTimeInZero() {
        return this.timeInZero;
    }

    @NotNull
    /* JADX INFO: renamed from: component7, reason: from getter */
    public final String getValue() {
        return this.value;
    }

    @NotNull
    public final ProjectEntity copy(@NotNull String sid, @NotNull String key, long projectId, long time, int zoneOffset, long timeInZero, @NotNull String value) {
        Intrinsics.checkNotNullParameter(sid, "sid");
        Intrinsics.checkNotNullParameter(key, "key");
        Intrinsics.checkNotNullParameter(value, "value");
        return new ProjectEntity(sid, key, projectId, time, zoneOffset, timeInZero, value);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ProjectEntity)) {
            return false;
        }
        ProjectEntity projectEntity = (ProjectEntity) other;
        return Intrinsics.areEqual(this.sid, projectEntity.sid) && Intrinsics.areEqual(this.key, projectEntity.key) && this.projectId == projectEntity.projectId && this.time == projectEntity.time && this.zoneOffset == projectEntity.zoneOffset && this.timeInZero == projectEntity.timeInZero && Intrinsics.areEqual(this.value, projectEntity.value);
    }

    @NotNull
    public final String getKey() {
        return this.key;
    }

    public final long getProjectId() {
        return this.projectId;
    }

    @NotNull
    public final String getSid() {
        return this.sid;
    }

    public final long getTime() {
        return this.time;
    }

    public final long getTimeInZero() {
        return this.timeInZero;
    }

    @NotNull
    public final String getValue() {
        return this.value;
    }

    public final int getZoneOffset() {
        return this.zoneOffset;
    }

    public int hashCode() {
        return (((((((((((this.sid.hashCode() * 31) + this.key.hashCode()) * 31) + Long.hashCode(this.projectId)) * 31) + Long.hashCode(this.time)) * 31) + Integer.hashCode(this.zoneOffset)) * 31) + Long.hashCode(this.timeInZero)) * 31) + this.value.hashCode();
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

    public final void setProjectId(long j) {
        this.projectId = j;
    }

    public final void setUpload(boolean z) {
        this.isUpload = z;
    }

    @NotNull
    public String toString() {
        return "ProjectEntity(sid=" + this.sid + ", key=" + this.key + ", projectId=" + this.projectId + ", time=" + this.time + ", zoneOffset=" + this.zoneOffset + ", timeInZero=" + this.timeInZero + ", value=" + this.value + ")";
    }
}
