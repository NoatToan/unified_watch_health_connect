package com.xiaomi.fit.fitness.persist.db.internal;

import androidx.room.Entity;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes7.dex */
@Entity(primaryKeys = {"uid", "dataType", "type", "sid", "key", "time"}, tableName = "health_connect_sync_info")
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\t\n\u0002\b:\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001B©\u0001\u0012\b\b\u0001\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0001\u0010\u0004\u001a\u00020\u0005\u0012\b\b\u0001\u0010\u0006\u001a\u00020\u0003\u0012\b\b\u0001\u0010\u0007\u001a\u00020\u0003\u0012\b\b\u0001\u0010\b\u001a\u00020\u0003\u0012\b\b\u0001\u0010\t\u001a\u00020\n\u0012\b\b\u0001\u0010\u000b\u001a\u00020\u0005\u0012\n\b\u0001\u0010\f\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0001\u0010\r\u001a\u0004\u0018\u00010\u0003\u0012\b\b\u0001\u0010\u000e\u001a\u00020\u0005\u0012\b\b\u0001\u0010\u000f\u001a\u00020\u0005\u0012\n\b\u0003\u0010\u0010\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0003\u0010\u0011\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0003\u0010\u0012\u001a\u0004\u0018\u00010\n\u0012\n\b\u0003\u0010\u0013\u001a\u0004\u0018\u00010\n¢\u0006\u0004\b\u0014\u0010\u0015J\t\u00103\u001a\u00020\u0003HÆ\u0003J\t\u00104\u001a\u00020\u0005HÆ\u0003J\t\u00105\u001a\u00020\u0003HÆ\u0003J\t\u00106\u001a\u00020\u0003HÆ\u0003J\t\u00107\u001a\u00020\u0003HÆ\u0003J\t\u00108\u001a\u00020\nHÆ\u0003J\t\u00109\u001a\u00020\u0005HÆ\u0003J\u000b\u0010:\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010;\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\t\u0010<\u001a\u00020\u0005HÆ\u0003J\t\u0010=\u001a\u00020\u0005HÆ\u0003J\u000b\u0010>\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010?\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0010\u0010@\u001a\u0004\u0018\u00010\nHÆ\u0003¢\u0006\u0002\u0010-J\u0010\u0010A\u001a\u0004\u0018\u00010\nHÆ\u0003¢\u0006\u0002\u0010-J°\u0001\u0010B\u001a\u00020\u00002\b\b\u0003\u0010\u0002\u001a\u00020\u00032\b\b\u0003\u0010\u0004\u001a\u00020\u00052\b\b\u0003\u0010\u0006\u001a\u00020\u00032\b\b\u0003\u0010\u0007\u001a\u00020\u00032\b\b\u0003\u0010\b\u001a\u00020\u00032\b\b\u0003\u0010\t\u001a\u00020\n2\b\b\u0003\u0010\u000b\u001a\u00020\u00052\n\b\u0003\u0010\f\u001a\u0004\u0018\u00010\u00032\n\b\u0003\u0010\r\u001a\u0004\u0018\u00010\u00032\b\b\u0003\u0010\u000e\u001a\u00020\u00052\b\b\u0003\u0010\u000f\u001a\u00020\u00052\n\b\u0003\u0010\u0010\u001a\u0004\u0018\u00010\u00032\n\b\u0003\u0010\u0011\u001a\u0004\u0018\u00010\u00032\n\b\u0003\u0010\u0012\u001a\u0004\u0018\u00010\n2\n\b\u0003\u0010\u0013\u001a\u0004\u0018\u00010\nHÆ\u0001¢\u0006\u0002\u0010CJ\u0013\u0010D\u001a\u00020E2\b\u0010F\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010G\u001a\u00020\u0005HÖ\u0001J\t\u0010H\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0017R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0019R\u0011\u0010\u0006\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u0017R\u0011\u0010\u0007\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u0017R\u0011\u0010\b\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u0017R\u0011\u0010\t\u001a\u00020\n¢\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\u001eR\u0011\u0010\u000b\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u001f\u0010\u0019R\u0013\u0010\f\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b \u0010\u0017R\u001c\u0010\r\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b!\u0010\u0017\"\u0004\b\"\u0010#R\u001a\u0010\u000e\u001a\u00020\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b$\u0010\u0019\"\u0004\b%\u0010&R\u001a\u0010\u000f\u001a\u00020\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000f\u0010\u0019\"\u0004\b'\u0010&R\u001c\u0010\u0010\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b(\u0010\u0017\"\u0004\b)\u0010#R\u001c\u0010\u0011\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b*\u0010\u0017\"\u0004\b+\u0010#R\u001e\u0010\u0012\u001a\u0004\u0018\u00010\nX\u0086\u000e¢\u0006\u0010\n\u0002\u00100\u001a\u0004\b,\u0010-\"\u0004\b.\u0010/R\u001e\u0010\u0013\u001a\u0004\u0018\u00010\nX\u0086\u000e¢\u0006\u0010\n\u0002\u00100\u001a\u0004\b1\u0010-\"\u0004\b2\u0010/¨\u0006I"}, d2 = {"Lcom/xiaomi/fit/fitness/persist/db/internal/HealthConnectSyncDaoEntity;", "", "uid", "", "dataType", "", "type", "sid", "key", "time", "", "timeZoneOffset", "value", "editedValue", "status", "isDeleted", "recordId", "clientRecordId", "startTime", "endTime", "<init>", "(Ljava/lang/String;ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;JILjava/lang/String;Ljava/lang/String;IILjava/lang/String;Ljava/lang/String;Ljava/lang/Long;Ljava/lang/Long;)V", "getUid", "()Ljava/lang/String;", "getDataType", "()I", "getType", "getSid", "getKey", "getTime", "()J", "getTimeZoneOffset", "getValue", "getEditedValue", "setEditedValue", "(Ljava/lang/String;)V", "getStatus", "setStatus", "(I)V", "setDeleted", "getRecordId", "setRecordId", "getClientRecordId", "setClientRecordId", "getStartTime", "()Ljava/lang/Long;", "setStartTime", "(Ljava/lang/Long;)V", "Ljava/lang/Long;", "getEndTime", "setEndTime", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "component10", "component11", "component12", "component13", "component14", "component15", "copy", "(Ljava/lang/String;ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;JILjava/lang/String;Ljava/lang/String;IILjava/lang/String;Ljava/lang/String;Ljava/lang/Long;Ljava/lang/Long;)Lcom/xiaomi/fit/fitness/persist/db/internal/HealthConnectSyncDaoEntity;", "equals", "", "other", "hashCode", "toString", "fitness-data-core_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class HealthConnectSyncDaoEntity {

    @Nullable
    private String clientRecordId;
    private final int dataType;

    @Nullable
    private String editedValue;

    @Nullable
    private Long endTime;
    private int isDeleted;

    @NotNull
    private final String key;

    @Nullable
    private String recordId;

    @NotNull
    private final String sid;

    @Nullable
    private Long startTime;
    private int status;
    private final long time;
    private final int timeZoneOffset;

    @NotNull
    private final String type;

    @NotNull
    private final String uid;

    @Nullable
    private final String value;

    public HealthConnectSyncDaoEntity(@NotNull String uid, int i, @NotNull String type, @NotNull String sid, @NotNull String key, long j, int i2, @Nullable String str, @Nullable String str2, int i3, int i4, @Nullable String str3, @Nullable String str4, @Nullable Long l, @Nullable Long l2) {
        Intrinsics.checkNotNullParameter(uid, "uid");
        Intrinsics.checkNotNullParameter(type, "type");
        Intrinsics.checkNotNullParameter(sid, "sid");
        Intrinsics.checkNotNullParameter(key, "key");
        this.uid = uid;
        this.dataType = i;
        this.type = type;
        this.sid = sid;
        this.key = key;
        this.time = j;
        this.timeZoneOffset = i2;
        this.value = str;
        this.editedValue = str2;
        this.status = i3;
        this.isDeleted = i4;
        this.recordId = str3;
        this.clientRecordId = str4;
        this.startTime = l;
        this.endTime = l2;
    }

    @NotNull
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getUid() {
        return this.uid;
    }

    /* JADX INFO: renamed from: component10, reason: from getter */
    public final int getStatus() {
        return this.status;
    }

    /* JADX INFO: renamed from: component11, reason: from getter */
    public final int getIsDeleted() {
        return this.isDeleted;
    }

    @Nullable
    /* JADX INFO: renamed from: component12, reason: from getter */
    public final String getRecordId() {
        return this.recordId;
    }

    @Nullable
    /* JADX INFO: renamed from: component13, reason: from getter */
    public final String getClientRecordId() {
        return this.clientRecordId;
    }

    @Nullable
    /* JADX INFO: renamed from: component14, reason: from getter */
    public final Long getStartTime() {
        return this.startTime;
    }

    @Nullable
    /* JADX INFO: renamed from: component15, reason: from getter */
    public final Long getEndTime() {
        return this.endTime;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final int getDataType() {
        return this.dataType;
    }

    @NotNull
    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getType() {
        return this.type;
    }

    @NotNull
    /* JADX INFO: renamed from: component4, reason: from getter */
    public final String getSid() {
        return this.sid;
    }

    @NotNull
    /* JADX INFO: renamed from: component5, reason: from getter */
    public final String getKey() {
        return this.key;
    }

    /* JADX INFO: renamed from: component6, reason: from getter */
    public final long getTime() {
        return this.time;
    }

    /* JADX INFO: renamed from: component7, reason: from getter */
    public final int getTimeZoneOffset() {
        return this.timeZoneOffset;
    }

    @Nullable
    /* JADX INFO: renamed from: component8, reason: from getter */
    public final String getValue() {
        return this.value;
    }

    @Nullable
    /* JADX INFO: renamed from: component9, reason: from getter */
    public final String getEditedValue() {
        return this.editedValue;
    }

    @NotNull
    public final HealthConnectSyncDaoEntity copy(@NotNull String uid, int dataType, @NotNull String type, @NotNull String sid, @NotNull String key, long time, int timeZoneOffset, @Nullable String value, @Nullable String editedValue, int status, int isDeleted, @Nullable String recordId, @Nullable String clientRecordId, @Nullable Long startTime, @Nullable Long endTime) {
        Intrinsics.checkNotNullParameter(uid, "uid");
        Intrinsics.checkNotNullParameter(type, "type");
        Intrinsics.checkNotNullParameter(sid, "sid");
        Intrinsics.checkNotNullParameter(key, "key");
        return new HealthConnectSyncDaoEntity(uid, dataType, type, sid, key, time, timeZoneOffset, value, editedValue, status, isDeleted, recordId, clientRecordId, startTime, endTime);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof HealthConnectSyncDaoEntity)) {
            return false;
        }
        HealthConnectSyncDaoEntity healthConnectSyncDaoEntity = (HealthConnectSyncDaoEntity) other;
        return Intrinsics.areEqual(this.uid, healthConnectSyncDaoEntity.uid) && this.dataType == healthConnectSyncDaoEntity.dataType && Intrinsics.areEqual(this.type, healthConnectSyncDaoEntity.type) && Intrinsics.areEqual(this.sid, healthConnectSyncDaoEntity.sid) && Intrinsics.areEqual(this.key, healthConnectSyncDaoEntity.key) && this.time == healthConnectSyncDaoEntity.time && this.timeZoneOffset == healthConnectSyncDaoEntity.timeZoneOffset && Intrinsics.areEqual(this.value, healthConnectSyncDaoEntity.value) && Intrinsics.areEqual(this.editedValue, healthConnectSyncDaoEntity.editedValue) && this.status == healthConnectSyncDaoEntity.status && this.isDeleted == healthConnectSyncDaoEntity.isDeleted && Intrinsics.areEqual(this.recordId, healthConnectSyncDaoEntity.recordId) && Intrinsics.areEqual(this.clientRecordId, healthConnectSyncDaoEntity.clientRecordId) && Intrinsics.areEqual(this.startTime, healthConnectSyncDaoEntity.startTime) && Intrinsics.areEqual(this.endTime, healthConnectSyncDaoEntity.endTime);
    }

    @Nullable
    public final String getClientRecordId() {
        return this.clientRecordId;
    }

    public final int getDataType() {
        return this.dataType;
    }

    @Nullable
    public final String getEditedValue() {
        return this.editedValue;
    }

    @Nullable
    public final Long getEndTime() {
        return this.endTime;
    }

    @NotNull
    public final String getKey() {
        return this.key;
    }

    @Nullable
    public final String getRecordId() {
        return this.recordId;
    }

    @NotNull
    public final String getSid() {
        return this.sid;
    }

    @Nullable
    public final Long getStartTime() {
        return this.startTime;
    }

    public final int getStatus() {
        return this.status;
    }

    public final long getTime() {
        return this.time;
    }

    public final int getTimeZoneOffset() {
        return this.timeZoneOffset;
    }

    @NotNull
    public final String getType() {
        return this.type;
    }

    @NotNull
    public final String getUid() {
        return this.uid;
    }

    @Nullable
    public final String getValue() {
        return this.value;
    }

    public int hashCode() {
        int iHashCode = ((((((((((((this.uid.hashCode() * 31) + Integer.hashCode(this.dataType)) * 31) + this.type.hashCode()) * 31) + this.sid.hashCode()) * 31) + this.key.hashCode()) * 31) + Long.hashCode(this.time)) * 31) + Integer.hashCode(this.timeZoneOffset)) * 31;
        String str = this.value;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.editedValue;
        int iHashCode3 = (((((iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31) + Integer.hashCode(this.status)) * 31) + Integer.hashCode(this.isDeleted)) * 31;
        String str3 = this.recordId;
        int iHashCode4 = (iHashCode3 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.clientRecordId;
        int iHashCode5 = (iHashCode4 + (str4 == null ? 0 : str4.hashCode())) * 31;
        Long l = this.startTime;
        int iHashCode6 = (iHashCode5 + (l == null ? 0 : l.hashCode())) * 31;
        Long l2 = this.endTime;
        return iHashCode6 + (l2 != null ? l2.hashCode() : 0);
    }

    public final int isDeleted() {
        return this.isDeleted;
    }

    public final void setClientRecordId(@Nullable String str) {
        this.clientRecordId = str;
    }

    public final void setDeleted(int i) {
        this.isDeleted = i;
    }

    public final void setEditedValue(@Nullable String str) {
        this.editedValue = str;
    }

    public final void setEndTime(@Nullable Long l) {
        this.endTime = l;
    }

    public final void setRecordId(@Nullable String str) {
        this.recordId = str;
    }

    public final void setStartTime(@Nullable Long l) {
        this.startTime = l;
    }

    public final void setStatus(int i) {
        this.status = i;
    }

    @NotNull
    public String toString() {
        return "HealthConnectSyncDaoEntity(uid=" + this.uid + ", dataType=" + this.dataType + ", type=" + this.type + ", sid=" + this.sid + ", key=" + this.key + ", time=" + this.time + ", timeZoneOffset=" + this.timeZoneOffset + ", value=" + this.value + ", editedValue=" + this.editedValue + ", status=" + this.status + ", isDeleted=" + this.isDeleted + ", recordId=" + this.recordId + ", clientRecordId=" + this.clientRecordId + ", startTime=" + this.startTime + ", endTime=" + this.endTime + ")";
    }

    public /* synthetic */ HealthConnectSyncDaoEntity(String str, int i, String str2, String str3, String str4, long j, int i2, String str5, String str6, int i3, int i4, String str7, String str8, Long l, Long l2, int i5, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, i, str2, str3, str4, j, i2, str5, str6, i3, i4, (i5 & 2048) != 0 ? null : str7, (i5 & 4096) != 0 ? null : str8, (i5 & 8192) != 0 ? null : l, (i5 & 16384) != 0 ? null : l2);
    }
}
