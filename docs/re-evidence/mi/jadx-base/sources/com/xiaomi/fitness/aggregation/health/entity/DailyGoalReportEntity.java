package com.xiaomi.fitness.aggregation.health.entity;

import androidx.room.ColumnInfo;
import androidx.room.Entity;
import com.xiaomi.fitness.common.utils.TimeUtils;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: renamed from: com.xiaomi.fitness.aggregation.health.entity.RainbowReportEntity, reason: from toString */
/* JADX INFO: loaded from: classes7.dex */
@Entity(primaryKeys = {"timeInZero"}, tableName = "rainbow")
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\n\n\u0002\u0010\b\n\u0000\b\u0081\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\b\u0010\u0011\u001a\u00020\u0005H\u0016J\t\u0010\u0012\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0013\u001a\u00020\u0005HÆ\u0003J\u001d\u0010\u0014\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u0015\u001a\u00020\r2\b\u0010\u0016\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0017\u001a\u00020\u0018HÖ\u0001R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0016\u0010\u0004\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u001e\u0010\f\u001a\u00020\r8\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\f\u0010\u000e\"\u0004\b\u000f\u0010\u0010¨\u0006\u0019"}, d2 = {"Lcom/xiaomi/fitness/aggregation/health/entity/RainbowReportEntity;", "", "timeInZero", "", "value", "", "<init>", "(JLjava/lang/String;)V", "getTimeInZero", "()J", "getValue", "()Ljava/lang/String;", "isUpload", "", "()Z", "setUpload", "(Z)V", "toString", "component1", "component2", "copy", "equals", "other", "hashCode", "", "fitness-data-core_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class DailyGoalReportEntity {

    @ColumnInfo(name = "isUpload")
    private boolean isUpload;

    /* JADX INFO: renamed from: timeInZero, reason: from kotlin metadata and from toString */
    @ColumnInfo(name = "timeInZero")
    private final long time;

    @ColumnInfo(name = "value")
    @NotNull
    private final String value;

    public DailyGoalReportEntity(long j, @NotNull String value) {
        Intrinsics.checkNotNullParameter(value, "value");
        this.time = j;
        this.value = value;
    }

    public static /* synthetic */ DailyGoalReportEntity copy$default(DailyGoalReportEntity dailyGoalReportEntity, long j, String str, int i, Object obj) {
        if ((i & 1) != 0) {
            j = dailyGoalReportEntity.time;
        }
        if ((i & 2) != 0) {
            str = dailyGoalReportEntity.value;
        }
        return dailyGoalReportEntity.copy(j, str);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final long getTime() {
        return this.time;
    }

    @NotNull
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getValue() {
        return this.value;
    }

    @NotNull
    public final DailyGoalReportEntity copy(long timeInZero, @NotNull String value) {
        Intrinsics.checkNotNullParameter(value, "value");
        return new DailyGoalReportEntity(timeInZero, value);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof DailyGoalReportEntity)) {
            return false;
        }
        DailyGoalReportEntity dailyGoalReportEntity = (DailyGoalReportEntity) other;
        return this.time == dailyGoalReportEntity.time && Intrinsics.areEqual(this.value, dailyGoalReportEntity.value);
    }

    public final long getTimeInZero() {
        return this.time;
    }

    @NotNull
    public final String getValue() {
        return this.value;
    }

    public int hashCode() {
        return (Long.hashCode(this.time) * 31) + this.value.hashCode();
    }

    /* JADX INFO: renamed from: isUpload, reason: from getter */
    public final boolean getIsUpload() {
        return this.isUpload;
    }

    public final void setUpload(boolean z) {
        this.isUpload = z;
    }

    @NotNull
    public String toString() {
        long j = this.time;
        return "DailyGoalReportEntity(time=" + j + ", time=" + TimeUtils.formatDate("yyyy-MM-dd HH:mm:ss", Long.valueOf(((long) 1000) * j)) + ", value='" + this.value + "', isUpload=" + this.isUpload + ")";
    }
}
