package com.xiaomi.fit.fitness.persist.db.internal;

import androidx.room.Entity;
import com.xiaomi.fit.fitness.persist.db.FitnessDBConstants;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes7.dex */
@Entity(indices = {}, primaryKeys = {"sid", "key", "time"}, tableName = "sport_report")
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\f\n\u0002\u0010\b\n\u0002\b\u000f\n\u0002\u0010\u000b\n\u0002\b\u0011\b\u0087\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006¢\u0006\u0004\b\u0007\u0010\bJ\t\u0010,\u001a\u00020\u0003HÆ\u0003J\t\u0010-\u001a\u00020\u0003HÆ\u0003J\t\u0010.\u001a\u00020\u0006HÆ\u0003J'\u0010/\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u0006HÆ\u0001J\u0013\u00100\u001a\u00020#2\b\u00101\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u00102\u001a\u00020\u0013HÖ\u0001J\t\u00103\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\nR\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u001c\u0010\u000e\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000f\u0010\n\"\u0004\b\u0010\u0010\u0011R\u001a\u0010\u0012\u001a\u00020\u0013X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0014\u0010\u0015\"\u0004\b\u0016\u0010\u0017R\u001c\u0010\u0018\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0019\u0010\n\"\u0004\b\u001a\u0010\u0011R\u001c\u0010\u001b\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001c\u0010\n\"\u0004\b\u001d\u0010\u0011R\u001a\u0010\u001e\u001a\u00020\u0006X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001f\u0010\r\"\u0004\b \u0010!R\u001a\u0010\"\u001a\u00020#X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\"\u0010$\"\u0004\b%\u0010&R\u001a\u0010'\u001a\u00020#X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b'\u0010$\"\u0004\b(\u0010&R\u001a\u0010)\u001a\u00020#X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b*\u0010$\"\u0004\b+\u0010&¨\u00064"}, d2 = {"Lcom/xiaomi/fit/fitness/persist/db/internal/SportReportEntity;", "", "sid", "", "key", "time", "", "<init>", "(Ljava/lang/String;Ljava/lang/String;J)V", "getSid", "()Ljava/lang/String;", "getKey", "getTime", "()J", "category", "getCategory", "setCategory", "(Ljava/lang/String;)V", "zoneOffsetInSec", "", "getZoneOffsetInSec", "()I", "setZoneOffsetInSec", "(I)V", "zoneName", "getZoneName", "setZoneName", "value", "getValue", "setValue", FitnessDBConstants.COL_TIME_0_TZ, "getTimeIn0Tz", "setTimeIn0Tz", "(J)V", "isUpload", "", "()Z", "setUpload", "(Z)V", "isDeleted", "setDeleted", "offlineCounted", "getOfflineCounted", "setOfflineCounted", "component1", "component2", "component3", "copy", "equals", "other", "hashCode", "toString", "fitness-data-core_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class SportReportEntity {

    @Nullable
    private String category;
    private boolean isDeleted;
    private boolean isUpload;

    @NotNull
    private final String key;
    private boolean offlineCounted;

    @NotNull
    private final String sid;
    private final long time;
    private long timeIn0Tz;

    @Nullable
    private String value;

    @Nullable
    private String zoneName;
    private int zoneOffsetInSec;

    public SportReportEntity(@NotNull String sid, @NotNull String key, long j) {
        Intrinsics.checkNotNullParameter(sid, "sid");
        Intrinsics.checkNotNullParameter(key, "key");
        this.sid = sid;
        this.key = key;
        this.time = j;
    }

    public static /* synthetic */ SportReportEntity copy$default(SportReportEntity sportReportEntity, String str, String str2, long j, int i, Object obj) {
        if ((i & 1) != 0) {
            str = sportReportEntity.sid;
        }
        if ((i & 2) != 0) {
            str2 = sportReportEntity.key;
        }
        if ((i & 4) != 0) {
            j = sportReportEntity.time;
        }
        return sportReportEntity.copy(str, str2, j);
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
    public final long getTime() {
        return this.time;
    }

    @NotNull
    public final SportReportEntity copy(@NotNull String sid, @NotNull String key, long time) {
        Intrinsics.checkNotNullParameter(sid, "sid");
        Intrinsics.checkNotNullParameter(key, "key");
        return new SportReportEntity(sid, key, time);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof SportReportEntity)) {
            return false;
        }
        SportReportEntity sportReportEntity = (SportReportEntity) other;
        return Intrinsics.areEqual(this.sid, sportReportEntity.sid) && Intrinsics.areEqual(this.key, sportReportEntity.key) && this.time == sportReportEntity.time;
    }

    @Nullable
    public final String getCategory() {
        return this.category;
    }

    @NotNull
    public final String getKey() {
        return this.key;
    }

    public final boolean getOfflineCounted() {
        return this.offlineCounted;
    }

    @NotNull
    public final String getSid() {
        return this.sid;
    }

    public final long getTime() {
        return this.time;
    }

    public final long getTimeIn0Tz() {
        return this.timeIn0Tz;
    }

    @Nullable
    public final String getValue() {
        return this.value;
    }

    @Nullable
    public final String getZoneName() {
        return this.zoneName;
    }

    public final int getZoneOffsetInSec() {
        return this.zoneOffsetInSec;
    }

    public int hashCode() {
        return (((this.sid.hashCode() * 31) + this.key.hashCode()) * 31) + Long.hashCode(this.time);
    }

    /* JADX INFO: renamed from: isDeleted, reason: from getter */
    public final boolean getIsDeleted() {
        return this.isDeleted;
    }

    /* JADX INFO: renamed from: isUpload, reason: from getter */
    public final boolean getIsUpload() {
        return this.isUpload;
    }

    public final void setCategory(@Nullable String str) {
        this.category = str;
    }

    public final void setDeleted(boolean z) {
        this.isDeleted = z;
    }

    public final void setOfflineCounted(boolean z) {
        this.offlineCounted = z;
    }

    public final void setTimeIn0Tz(long j) {
        this.timeIn0Tz = j;
    }

    public final void setUpload(boolean z) {
        this.isUpload = z;
    }

    public final void setValue(@Nullable String str) {
        this.value = str;
    }

    public final void setZoneName(@Nullable String str) {
        this.zoneName = str;
    }

    public final void setZoneOffsetInSec(int i) {
        this.zoneOffsetInSec = i;
    }

    @NotNull
    public String toString() {
        return "SportReportEntity(sid=" + this.sid + ", key=" + this.key + ", time=" + this.time + ")";
    }
}
