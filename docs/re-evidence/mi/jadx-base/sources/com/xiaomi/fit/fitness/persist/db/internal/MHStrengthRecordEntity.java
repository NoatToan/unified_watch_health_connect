package com.xiaomi.fit.fitness.persist.db.internal;

import androidx.room.Entity;
import com.xiaomi.fit.fitness.persist.db.FitnessDBConstants;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes7.dex */
@Entity(primaryKeys = {"key", "sid", "time"}, tableName = FitnessDBConstants.TABLE_MH_STRENGTH)
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\f\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0081\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006¢\u0006\u0004\b\u0007\u0010\bJ\t\u0010\u000e\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000f\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0010\u001a\u00020\u0006HÆ\u0003J'\u0010\u0011\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u0006HÆ\u0001J\u0013\u0010\u0012\u001a\u00020\u00132\b\u0010\u0014\u001a\u0004\u0018\u00010\u0015HÖ\u0003J\t\u0010\u0016\u001a\u00020\u0017HÖ\u0001J\t\u0010\u0018\u001a\u00020\u0003HÖ\u0001R\u0014\u0010\u0002\u001a\u00020\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0014\u0010\u0004\u001a\u00020\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\nR\u0014\u0010\u0005\u001a\u00020\u0006X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\r¨\u0006\u0019"}, d2 = {"Lcom/xiaomi/fit/fitness/persist/db/internal/MHStrengthRecordEntity;", "Lcom/xiaomi/fit/fitness/persist/db/internal/DailyRecordCommonEntity;", "key", "", "sid", "time", "", "<init>", "(Ljava/lang/String;Ljava/lang/String;J)V", "getKey", "()Ljava/lang/String;", "getSid", "getTime", "()J", "component1", "component2", "component3", "copy", "equals", "", "other", "", "hashCode", "", "toString", "fitness-data-core_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class MHStrengthRecordEntity extends DailyRecordCommonEntity {

    @NotNull
    private final String key;

    @NotNull
    private final String sid;
    private final long time;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MHStrengthRecordEntity(@NotNull String key, @NotNull String sid, long j) {
        super(null);
        Intrinsics.checkNotNullParameter(key, "key");
        Intrinsics.checkNotNullParameter(sid, "sid");
        this.key = key;
        this.sid = sid;
        this.time = j;
    }

    public static /* synthetic */ MHStrengthRecordEntity copy$default(MHStrengthRecordEntity mHStrengthRecordEntity, String str, String str2, long j, int i, Object obj) {
        if ((i & 1) != 0) {
            str = mHStrengthRecordEntity.key;
        }
        if ((i & 2) != 0) {
            str2 = mHStrengthRecordEntity.sid;
        }
        if ((i & 4) != 0) {
            j = mHStrengthRecordEntity.time;
        }
        return mHStrengthRecordEntity.copy(str, str2, j);
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
    public final MHStrengthRecordEntity copy(@NotNull String key, @NotNull String sid, long time) {
        Intrinsics.checkNotNullParameter(key, "key");
        Intrinsics.checkNotNullParameter(sid, "sid");
        return new MHStrengthRecordEntity(key, sid, time);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof MHStrengthRecordEntity)) {
            return false;
        }
        MHStrengthRecordEntity mHStrengthRecordEntity = (MHStrengthRecordEntity) other;
        return Intrinsics.areEqual(this.key, mHStrengthRecordEntity.key) && Intrinsics.areEqual(this.sid, mHStrengthRecordEntity.sid) && this.time == mHStrengthRecordEntity.time;
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

    @NotNull
    public String toString() {
        return "MHStrengthRecordEntity(key=" + this.key + ", sid=" + this.sid + ", time=" + this.time + ")";
    }
}
