package com.xiaomi.fit.fitness.persist.db.internal;

import androidx.room.ColumnInfo;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000~\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003J\n\u0010\n\u001a\u0004\u0018\u00010\u0005H\u0016J\u0010\u0010\u000b\u001a\u00020\f2\u0006\u0010\u0004\u001a\u00020\u0005H\u0016R \u0010\u0004\u001a\u0004\u0018\u00010\u00058\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0006\u0010\u0007\"\u0004\b\b\u0010\t\u0082\u0001\u0019\r\u000e\u000f\u0010\u0011\u0012\u0013\u0014\u0015\u0016\u0017\u0018\u0019\u001a\u001b\u001c\u001d\u001e\u001f !\"#$%¨\u0006&"}, d2 = {"Lcom/xiaomi/fit/fitness/persist/db/internal/DailyRecordCommonEntity;", "Lcom/xiaomi/fit/fitness/persist/db/internal/DailyRecordBaseEntity;", "<init>", "()V", "value", "", "getValue", "()Ljava/lang/String;", "setValue", "(Ljava/lang/String;)V", "getRecordValue", "setRecordValue", "", "Lcom/xiaomi/fit/fitness/persist/db/internal/BPMedicalRecordEntity;", "Lcom/xiaomi/fit/fitness/persist/db/internal/BloodPressureRecordEntity;", "Lcom/xiaomi/fit/fitness/persist/db/internal/BloodSugarEntity;", "Lcom/xiaomi/fit/fitness/persist/db/internal/CaloriesRecordEntity;", "Lcom/xiaomi/fit/fitness/persist/db/internal/EcgMedicalRecordEntity;", "Lcom/xiaomi/fit/fitness/persist/db/internal/EnergyRecordEntity;", "Lcom/xiaomi/fit/fitness/persist/db/internal/ExtraDataEntity;", "Lcom/xiaomi/fit/fitness/persist/db/internal/HearingHealthRecordEntity;", "Lcom/xiaomi/fit/fitness/persist/db/internal/HrRecordEntity;", "Lcom/xiaomi/fit/fitness/persist/db/internal/LactateThresholdEntity;", "Lcom/xiaomi/fit/fitness/persist/db/internal/MHStrengthRecordEntity;", "Lcom/xiaomi/fit/fitness/persist/db/internal/PaiRecordEntity;", "Lcom/xiaomi/fit/fitness/persist/db/internal/PhysicalStatusEntity;", "Lcom/xiaomi/fit/fitness/persist/db/internal/RunAbilityRecordEntity;", "Lcom/xiaomi/fit/fitness/persist/db/internal/SleepSegmentEntity;", "Lcom/xiaomi/fit/fitness/persist/db/internal/Spo2RecordEntity;", "Lcom/xiaomi/fit/fitness/persist/db/internal/StandRecordEntity;", "Lcom/xiaomi/fit/fitness/persist/db/internal/StepRecordEntity;", "Lcom/xiaomi/fit/fitness/persist/db/internal/StressRecordEntity;", "Lcom/xiaomi/fit/fitness/persist/db/internal/TemperatureCharacterRecordEntity;", "Lcom/xiaomi/fit/fitness/persist/db/internal/TemperatureRecordEntity;", "Lcom/xiaomi/fit/fitness/persist/db/internal/TemperatureTrendEntity;", "Lcom/xiaomi/fit/fitness/persist/db/internal/TrainingLoadRecordEntity;", "Lcom/xiaomi/fit/fitness/persist/db/internal/Vo2MaxRecordEntity;", "Lcom/xiaomi/fit/fitness/persist/db/internal/WomenHealthRecordEntity;", "fitness-data-core_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
public abstract class DailyRecordCommonEntity extends DailyRecordBaseEntity {

    @ColumnInfo(name = "value")
    @Nullable
    private String value;

    public /* synthetic */ DailyRecordCommonEntity(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    @Override // com.xiaomi.fit.fitness.persist.db.internal.DailyRecordBaseEntity
    @Nullable
    /* JADX INFO: renamed from: getRecordValue, reason: from getter */
    public String getValue() {
        return this.value;
    }

    @Nullable
    public final String getValue() {
        return this.value;
    }

    @Override // com.xiaomi.fit.fitness.persist.db.internal.DailyRecordBaseEntity
    public void setRecordValue(@NotNull String value) {
        Intrinsics.checkNotNullParameter(value, "value");
        this.value = value;
    }

    public final void setValue(@Nullable String str) {
        this.value = str;
    }

    private DailyRecordCommonEntity() {
        super(null);
    }
}
