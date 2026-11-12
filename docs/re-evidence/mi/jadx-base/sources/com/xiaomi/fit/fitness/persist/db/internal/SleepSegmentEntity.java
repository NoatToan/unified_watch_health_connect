package com.xiaomi.fit.fitness.persist.db.internal;

import androidx.room.ColumnInfo;
import androidx.room.Entity;
import com.xiaomi.fit.fitness.DailyRecordItemModel;
import com.xiaomi.fit.fitness.persist.db.FitnessDBConstants;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes7.dex */
@Entity(primaryKeys = {"key", "sid", "time"}, tableName = FitnessDBConstants.TABLE_SLEEP)
@Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\b\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0081\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u0016H\u0016J\t\u0010\u0017\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0018\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0019\u001a\u00020\u0006HÆ\u0003J'\u0010\u001a\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u0006HÆ\u0001J\u0013\u0010\u001b\u001a\u00020\u000f2\b\u0010\u001c\u001a\u0004\u0018\u00010\u001dHÖ\u0003J\t\u0010\u001e\u001a\u00020\u001fHÖ\u0001J\t\u0010 \u001a\u00020\u0003HÖ\u0001R\u0014\u0010\u0002\u001a\u00020\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0014\u0010\u0004\u001a\u00020\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\nR\u0014\u0010\u0005\u001a\u00020\u0006X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u001e\u0010\u000e\u001a\u00020\u000f8\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000e\u0010\u0010\"\u0004\b\u0011\u0010\u0012¨\u0006!"}, d2 = {"Lcom/xiaomi/fit/fitness/persist/db/internal/SleepSegmentEntity;", "Lcom/xiaomi/fit/fitness/persist/db/internal/DailyRecordCommonEntity;", "key", "", "sid", "time", "", "<init>", "(Ljava/lang/String;Ljava/lang/String;J)V", "getKey", "()Ljava/lang/String;", "getSid", "getTime", "()J", FitnessDBConstants.COL_IS_SLEEP_COMPLETE, "", "()Z", "setComplete", "(Z)V", "setFromLocalRecord", "", "recordModel", "Lcom/xiaomi/fit/fitness/DailyRecordItemModel;", "component1", "component2", "component3", "copy", "equals", "other", "", "hashCode", "", "toString", "fitness-data-core_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class SleepSegmentEntity extends DailyRecordCommonEntity {

    @ColumnInfo(name = FitnessDBConstants.COL_IS_SLEEP_COMPLETE)
    private boolean isComplete;

    @NotNull
    private final String key;

    @NotNull
    private final String sid;
    private final long time;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SleepSegmentEntity(@NotNull String key, @NotNull String sid, long j) {
        super(null);
        Intrinsics.checkNotNullParameter(key, "key");
        Intrinsics.checkNotNullParameter(sid, "sid");
        this.key = key;
        this.sid = sid;
        this.time = j;
        this.isComplete = true;
    }

    public static /* synthetic */ SleepSegmentEntity copy$default(SleepSegmentEntity sleepSegmentEntity, String str, String str2, long j, int i, Object obj) {
        if ((i & 1) != 0) {
            str = sleepSegmentEntity.key;
        }
        if ((i & 2) != 0) {
            str2 = sleepSegmentEntity.sid;
        }
        if ((i & 4) != 0) {
            j = sleepSegmentEntity.time;
        }
        return sleepSegmentEntity.copy(str, str2, j);
    }

    @NotNull
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getKey() {
        return this.key;
    }

    @NotNull
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getSid() {
        return this.sid;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final long getTime() {
        return this.time;
    }

    @NotNull
    public final SleepSegmentEntity copy(@NotNull String key, @NotNull String sid, long time) {
        Intrinsics.checkNotNullParameter(key, "key");
        Intrinsics.checkNotNullParameter(sid, "sid");
        return new SleepSegmentEntity(key, sid, time);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof SleepSegmentEntity)) {
            return false;
        }
        SleepSegmentEntity sleepSegmentEntity = (SleepSegmentEntity) other;
        return Intrinsics.areEqual(this.key, sleepSegmentEntity.key) && Intrinsics.areEqual(this.sid, sleepSegmentEntity.sid) && this.time == sleepSegmentEntity.time;
    }

    @Override // com.xiaomi.fit.fitness.persist.db.internal.DailyRecordBaseEntity
    @NotNull
    public String getKey() {
        return this.key;
    }

    @Override // com.xiaomi.fit.fitness.persist.db.internal.DailyRecordBaseEntity
    @NotNull
    public String getSid() {
        return this.sid;
    }

    @Override // com.xiaomi.fit.fitness.persist.db.internal.DailyRecordBaseEntity
    public long getTime() {
        return this.time;
    }

    public int hashCode() {
        return (((this.key.hashCode() * 31) + this.sid.hashCode()) * 31) + Long.hashCode(this.time);
    }

    /* JADX INFO: renamed from: isComplete, reason: from getter */
    public final boolean getIsComplete() {
        return this.isComplete;
    }

    public final void setComplete(boolean z) {
        this.isComplete = z;
    }

    @Override // com.xiaomi.fit.fitness.persist.db.internal.DailyRecordBaseEntity
    public void setFromLocalRecord(@NotNull DailyRecordItemModel recordModel) {
        Intrinsics.checkNotNullParameter(recordModel, "recordModel");
        super.setFromLocalRecord(recordModel);
        Boolean isCompleteSleep = recordModel.getIsCompleteSleep();
        this.isComplete = isCompleteSleep != null ? isCompleteSleep.booleanValue() : true;
    }

    @NotNull
    public String toString() {
        return "SleepSegmentEntity(key=" + this.key + ", sid=" + this.sid + ", time=" + this.time + ")";
    }
}
