package com.xiaomi.fit.fitness.persist.db.internal;

import androidx.room.ColumnInfo;
import androidx.room.Entity;
import com.xiaomi.fit.fitness.export.data.item.DailyRecordItem;
import com.xiaomi.fit.fitness.export.data.item.EcgMedicalItemReport;
import com.xiaomi.fit.fitness.persist.db.FitnessDBConstants;
import com.xiaomi.fit.fitness.persist.utils.FitnessPersistUtils;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes7.dex */
@Entity(primaryKeys = {"key", "sid", "time"}, tableName = FitnessDBConstants.TABLE_ECG_MEDICAL_TABLE)
@Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\b\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0081\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u0016\u001a\u00020\u0017H\u0016J\u0010\u0010\u0018\u001a\u00020\u00152\u0006\u0010\u0019\u001a\u00020\u0003H\u0016J\t\u0010\u001a\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001b\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001c\u001a\u00020\u0006HÆ\u0003J'\u0010\u001d\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u0006HÆ\u0001J\u0013\u0010\u001e\u001a\u00020\u001f2\b\u0010 \u001a\u0004\u0018\u00010!HÖ\u0003J\t\u0010\"\u001a\u00020\u000fHÖ\u0001J\t\u0010#\u001a\u00020\u0003HÖ\u0001R\u0014\u0010\u0002\u001a\u00020\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0014\u0010\u0004\u001a\u00020\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\nR\u0014\u0010\u0005\u001a\u00020\u0006X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u001e\u0010\u000e\u001a\u00020\u000f8\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0010\u0010\u0011\"\u0004\b\u0012\u0010\u0013¨\u0006$"}, d2 = {"Lcom/xiaomi/fit/fitness/persist/db/internal/EcgMedicalRecordEntity;", "Lcom/xiaomi/fit/fitness/persist/db/internal/DailyRecordCommonEntity;", "key", "", "sid", "time", "", "<init>", "(Ljava/lang/String;Ljava/lang/String;J)V", "getKey", "()Ljava/lang/String;", "getSid", "getTime", "()J", FitnessDBConstants.COL_ECG_INTERPRET_STATUS, "", "getAnalyzedStatus", "()I", "setAnalyzedStatus", "(I)V", "setRecordItem", "", "item", "Lcom/xiaomi/fit/fitness/export/data/item/DailyRecordItem;", "setRecordValue", "value", "component1", "component2", "component3", "copy", "equals", "", "other", "", "hashCode", "toString", "fitness-data-core_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class EcgMedicalRecordEntity extends DailyRecordCommonEntity {

    @ColumnInfo(name = FitnessDBConstants.COL_ECG_INTERPRET_STATUS)
    private int analyzedStatus;

    @NotNull
    private final String key;

    @NotNull
    private final String sid;
    private final long time;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public EcgMedicalRecordEntity(@NotNull String key, @NotNull String sid, long j) {
        super(null);
        Intrinsics.checkNotNullParameter(key, "key");
        Intrinsics.checkNotNullParameter(sid, "sid");
        this.key = key;
        this.sid = sid;
        this.time = j;
    }

    public static /* synthetic */ EcgMedicalRecordEntity copy$default(EcgMedicalRecordEntity ecgMedicalRecordEntity, String str, String str2, long j, int i, Object obj) {
        if ((i & 1) != 0) {
            str = ecgMedicalRecordEntity.key;
        }
        if ((i & 2) != 0) {
            str2 = ecgMedicalRecordEntity.sid;
        }
        if ((i & 4) != 0) {
            j = ecgMedicalRecordEntity.time;
        }
        return ecgMedicalRecordEntity.copy(str, str2, j);
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
    public final EcgMedicalRecordEntity copy(@NotNull String key, @NotNull String sid, long time) {
        Intrinsics.checkNotNullParameter(key, "key");
        Intrinsics.checkNotNullParameter(sid, "sid");
        return new EcgMedicalRecordEntity(key, sid, time);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof EcgMedicalRecordEntity)) {
            return false;
        }
        EcgMedicalRecordEntity ecgMedicalRecordEntity = (EcgMedicalRecordEntity) other;
        return Intrinsics.areEqual(this.key, ecgMedicalRecordEntity.key) && Intrinsics.areEqual(this.sid, ecgMedicalRecordEntity.sid) && this.time == ecgMedicalRecordEntity.time;
    }

    public final int getAnalyzedStatus() {
        return this.analyzedStatus;
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

    public final void setAnalyzedStatus(int i) {
        this.analyzedStatus = i;
    }

    @Override // com.xiaomi.fit.fitness.persist.db.internal.DailyRecordBaseEntity
    public void setRecordItem(@NotNull DailyRecordItem item) {
        Intrinsics.checkNotNullParameter(item, "item");
        super.setRecordItem(item);
        this.analyzedStatus = ((EcgMedicalItemReport) item).getInterpretStatus();
    }

    @Override // com.xiaomi.fit.fitness.persist.db.internal.DailyRecordCommonEntity, com.xiaomi.fit.fitness.persist.db.internal.DailyRecordBaseEntity
    public void setRecordValue(@NotNull String value) {
        Intrinsics.checkNotNullParameter(value, "value");
        super.setRecordValue(value);
        EcgMedicalItemReport ecgMedicalItemReport = (EcgMedicalItemReport) FitnessPersistUtils.INSTANCE.fromJson(value, EcgMedicalItemReport.class);
        this.analyzedStatus = ecgMedicalItemReport != null ? ecgMedicalItemReport.getInterpretStatus() : 0;
    }

    @NotNull
    public String toString() {
        return "EcgMedicalRecordEntity(key=" + this.key + ", sid=" + this.sid + ", time=" + this.time + ")";
    }
}
