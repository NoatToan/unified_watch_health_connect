package com.xiaomi.fit.fitness.persist.db.internal;

import android.text.TextUtils;
import androidx.room.ColumnInfo;
import androidx.room.Entity;
import com.xiaomi.fit.data.common.util.FitnessDateUtils;
import com.xiaomi.fit.fitness.DailyRecordItemModel;
import com.xiaomi.fit.fitness.export.data.item.DailyRecordItem;
import com.xiaomi.fit.fitness.export.data.item.WeightItem;
import com.xiaomi.fit.fitness.persist.db.FitnessDBConstants;
import com.xiaomi.fit.fitness.persist.server.data.FitnessDataModel;
import com.xiaomi.fit.fitness.persist.utils.FitnessPersistUtils;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes7.dex */
@Entity(primaryKeys = {"key", "sid", "time"}, tableName = FitnessDBConstants.TABLE_WEIGHT)
@Metadata(d1 = {"\u0000^\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\f\n\u0002\u0010\u0007\n\u0002\b\u0014\n\u0002\u0010\b\n\u0002\b\u0014\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0081\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006¢\u0006\u0004\b\u0007\u0010\bJ\b\u0010;\u001a\u00020\u0003H\u0016J\u0010\u0010<\u001a\u00020=2\u0006\u00107\u001a\u00020\u0003H\u0016J\u0010\u0010>\u001a\u00020=2\u0006\u0010?\u001a\u00020@H\u0016J\u0010\u0010A\u001a\u00020=2\u0006\u0010B\u001a\u00020CH\u0016J\u0010\u0010D\u001a\u00020=2\u0006\u0010E\u001a\u00020FH\u0016J\b\u0010G\u001a\u00020HH\u0002J\u0014\u0010I\u001a\u00020=*\u00020H2\u0006\u0010E\u001a\u00020HH\u0002J\t\u0010J\u001a\u00020\u0003HÆ\u0003J\t\u0010K\u001a\u00020\u0003HÆ\u0003J\t\u0010L\u001a\u00020\u0006HÆ\u0003J'\u0010M\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u0006HÆ\u0001J\u0013\u0010N\u001a\u00020O2\b\u0010P\u001a\u0004\u0018\u00010QHÖ\u0003J\t\u0010R\u001a\u00020(HÖ\u0001J\t\u0010S\u001a\u00020\u0003HÖ\u0001R\u0014\u0010\u0002\u001a\u00020\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0014\u0010\u0004\u001a\u00020\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\nR\u0014\u0010\u0005\u001a\u00020\u0006X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u001e\u0010\u000e\u001a\u00020\u00068\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000f\u0010\r\"\u0004\b\u0010\u0010\u0011R\u001e\u0010\u0012\u001a\u00020\u00138\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0014\u0010\u0015\"\u0004\b\u0016\u0010\u0017R\"\u0010\u0018\u001a\u0004\u0018\u00010\u00138\u0006@\u0006X\u0087\u000e¢\u0006\u0010\n\u0002\u0010\u001d\u001a\u0004\b\u0019\u0010\u001a\"\u0004\b\u001b\u0010\u001cR\"\u0010\u001e\u001a\u0004\u0018\u00010\u00138\u0006@\u0006X\u0087\u000e¢\u0006\u0010\n\u0002\u0010\u001d\u001a\u0004\b\u001f\u0010\u001a\"\u0004\b \u0010\u001cR\"\u0010!\u001a\u0004\u0018\u00010\u00138\u0006@\u0006X\u0087\u000e¢\u0006\u0010\n\u0002\u0010\u001d\u001a\u0004\b\"\u0010\u001a\"\u0004\b#\u0010\u001cR\"\u0010$\u001a\u0004\u0018\u00010\u00138\u0006@\u0006X\u0087\u000e¢\u0006\u0010\n\u0002\u0010\u001d\u001a\u0004\b%\u0010\u001a\"\u0004\b&\u0010\u001cR\"\u0010'\u001a\u0004\u0018\u00010(8\u0006@\u0006X\u0087\u000e¢\u0006\u0010\n\u0002\u0010-\u001a\u0004\b)\u0010*\"\u0004\b+\u0010,R\"\u0010.\u001a\u0004\u0018\u00010\u00138\u0006@\u0006X\u0087\u000e¢\u0006\u0010\n\u0002\u0010\u001d\u001a\u0004\b/\u0010\u001a\"\u0004\b0\u0010\u001cR\"\u00101\u001a\u0004\u0018\u00010\u00138\u0006@\u0006X\u0087\u000e¢\u0006\u0010\n\u0002\u0010\u001d\u001a\u0004\b2\u0010\u001a\"\u0004\b3\u0010\u001cR\"\u00104\u001a\u0004\u0018\u00010\u00138\u0006@\u0006X\u0087\u000e¢\u0006\u0010\n\u0002\u0010\u001d\u001a\u0004\b5\u0010\u001a\"\u0004\b6\u0010\u001cR \u00107\u001a\u0004\u0018\u00010\u00038\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b8\u0010\n\"\u0004\b9\u0010:¨\u0006T"}, d2 = {"Lcom/xiaomi/fit/fitness/persist/db/internal/WeightItemEntity;", "Lcom/xiaomi/fit/fitness/persist/db/internal/DailyRecordBaseEntity;", "key", "", "sid", "time", "", "<init>", "(Ljava/lang/String;Ljava/lang/String;J)V", "getKey", "()Ljava/lang/String;", "getSid", "getTime", "()J", FitnessDBConstants.COL_ZERO_TIME_0_TZ, "getZeroTimeIn0Tz", "setZeroTimeIn0Tz", "(J)V", "weight", "", "getWeight", "()F", "setWeight", "(F)V", "bmi", "getBmi", "()Ljava/lang/Float;", "setBmi", "(Ljava/lang/Float;)V", "Ljava/lang/Float;", WeightRecordDaoKt.COL_BODY_FAT_RATE, "getBodyFatRate", "setBodyFatRate", WeightRecordDaoKt.COL_MOISTURE_RATE, "getMoistureRate", "setMoistureRate", WeightRecordDaoKt.COL_BONE_MASS, "getBoneMass", "setBoneMass", WeightRecordDaoKt.COL_BASAL_METABOLISM, "", "getBasalMetabolism", "()Ljava/lang/Integer;", "setBasalMetabolism", "(Ljava/lang/Integer;)V", "Ljava/lang/Integer;", "muscleRate", "getMuscleRate", "setMuscleRate", WeightRecordDaoKt.COL_PROTEIN_RATE, "getProteinRate", "setProteinRate", WeightRecordDaoKt.COL_VISCERAL_FAT, "getVisceralFat", "setVisceralFat", "value", "getValue", "setValue", "(Ljava/lang/String;)V", "getRecordValue", "setRecordValue", "", "setFromLocalRecord", "recordModel", "Lcom/xiaomi/fit/fitness/DailyRecordItemModel;", "setFromServerRecord", "record", "Lcom/xiaomi/fit/fitness/persist/server/data/FitnessDataModel;", "setRecordItem", "item", "Lcom/xiaomi/fit/fitness/export/data/item/DailyRecordItem;", "toWeightItem", "Lcom/xiaomi/fit/fitness/export/data/item/WeightItem;", "addExtraValueFrom", "component1", "component2", "component3", "copy", "equals", "", "other", "", "hashCode", "toString", "fitness-data-core_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class WeightItemEntity extends DailyRecordBaseEntity {

    @ColumnInfo(name = WeightRecordDaoKt.COL_BASAL_METABOLISM)
    @Nullable
    private Integer basalMetabolism;

    @ColumnInfo(name = "bmi")
    @Nullable
    private Float bmi;

    @ColumnInfo(name = WeightRecordDaoKt.COL_BODY_FAT_RATE)
    @Nullable
    private Float bodyFatRate;

    @ColumnInfo(name = WeightRecordDaoKt.COL_BONE_MASS)
    @Nullable
    private Float boneMass;

    @NotNull
    private final String key;

    @ColumnInfo(name = WeightRecordDaoKt.COL_MOISTURE_RATE)
    @Nullable
    private Float moistureRate;

    @ColumnInfo(name = WeightRecordDaoKt.COL_MUSCLE_RATE)
    @Nullable
    private Float muscleRate;

    @ColumnInfo(name = WeightRecordDaoKt.COL_PROTEIN_RATE)
    @Nullable
    private Float proteinRate;

    @NotNull
    private final String sid;
    private final long time;

    @ColumnInfo(name = "value")
    @Nullable
    private String value;

    @ColumnInfo(name = WeightRecordDaoKt.COL_VISCERAL_FAT)
    @Nullable
    private Float visceralFat;

    @ColumnInfo(name = "weight")
    private float weight;

    @ColumnInfo(name = FitnessDBConstants.COL_ZERO_TIME_0_TZ)
    private long zeroTimeIn0Tz;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public WeightItemEntity(@NotNull String key, @NotNull String sid, long j) {
        super(null);
        Intrinsics.checkNotNullParameter(key, "key");
        Intrinsics.checkNotNullParameter(sid, "sid");
        this.key = key;
        this.sid = sid;
        this.time = j;
    }

    private final void addExtraValueFrom(WeightItem weightItem, WeightItem weightItem2) {
        weightItem.setBodyMoistureMass(weightItem2.getBodyMoistureMass());
        weightItem.setProteinMass(weightItem2.getProteinMass());
        weightItem.setFatMass(weightItem2.getFatMass());
        weightItem.setMuscleMass(weightItem2.getMuscleMass());
        weightItem.setBoneSaltRate(weightItem2.getBoneSaltRate());
        weightItem.setLimbsSkeletalMuscleIndex(weightItem2.getLimbsSkeletalMuscleIndex());
        weightItem.setLeftUpperLimbMuscleMass(weightItem2.getLeftUpperLimbMuscleMass());
        weightItem.setRightUpperLimbMuscleMass(weightItem2.getRightUpperLimbMuscleMass());
        weightItem.setTrunkMuscleMass(weightItem2.getTrunkMuscleMass());
        weightItem.setLeftLowerLimbMuscleMass(weightItem2.getLeftLowerLimbMuscleMass());
        weightItem.setRightLowerLimbMuscleMass(weightItem2.getRightLowerLimbMuscleMass());
        weightItem.setLeftUpperLimbMuscleLevel(weightItem2.getLeftUpperLimbMuscleLevel());
        weightItem.setRightUpperLimbMuscleLevel(weightItem2.getRightUpperLimbMuscleLevel());
        weightItem.setTrunkMuscleLevel(weightItem2.getTrunkMuscleLevel());
        weightItem.setLeftLowerLimbMuscleLevel(weightItem2.getLeftLowerLimbMuscleLevel());
        weightItem.setRightLowerLimbMuscleLevel(weightItem2.getRightLowerLimbMuscleLevel());
        weightItem.setUpperLimbMuscleBalance(weightItem2.getUpperLimbMuscleBalance());
        weightItem.setLowerLimbMuscleBalance(weightItem2.getLowerLimbMuscleBalance());
        weightItem.setLimbsMuscleBalance(weightItem2.getLimbsMuscleBalance());
        weightItem.setLeftUpperLimbFatMass(weightItem2.getLeftUpperLimbFatMass());
        weightItem.setRightUpperLimbFatMass(weightItem2.getRightUpperLimbFatMass());
        weightItem.setTrunkFatMass(weightItem2.getTrunkFatMass());
        weightItem.setLeftLowerLimbFatMass(weightItem2.getLeftLowerLimbFatMass());
        weightItem.setRightLowerLimbFatMass(weightItem2.getRightLowerLimbFatMass());
        weightItem.setLeftUpperLimbFatLevel(weightItem2.getLeftUpperLimbFatLevel());
        weightItem.setRightUpperLimbFatLevel(weightItem2.getRightUpperLimbFatLevel());
        weightItem.setTrunkFatLevel(weightItem2.getTrunkFatLevel());
        weightItem.setLeftLowerLimbFatLevel(weightItem2.getLeftLowerLimbFatLevel());
        weightItem.setRightLowerLimbFatLevel(weightItem2.getRightLowerLimbFatLevel());
        weightItem.setUpperLimbFatBalance(weightItem2.getUpperLimbFatBalance());
        weightItem.setLowerLimbFatBalance(weightItem2.getLowerLimbFatBalance());
        weightItem.setLimbsFatBalance(weightItem2.getLimbsFatBalance());
        weightItem.setSomatotype(weightItem2.getSomatotype());
        weightItem.setBodyShape(weightItem2.getBodyShape());
        weightItem.setWhr(weightItem2.getWhr());
        weightItem.setBmp(weightItem2.getBmp());
        weightItem.setBodyScore(weightItem2.getBodyScore());
        weightItem.setBodyAge(weightItem2.getBodyAge());
        weightItem.setStandardWeight(weightItem2.getStandardWeight());
        weightItem.setStandardWeightV2(weightItem2.getStandardWeightV2());
        weightItem.setRecommendedCaloriesIntake(weightItem2.getRecommendedCaloriesIntake());
        weightItem.setWeightControl(weightItem2.getWeightControl());
        weightItem.setMuscleControl(weightItem2.getMuscleControl());
        weightItem.setFatControl(weightItem2.getFatControl());
        weightItem.setSkeletalMuscleMass(weightItem2.getSkeletalMuscleMass());
        weightItem.setFatFreeBody(weightItem2.getFatFreeBody());
        weightItem.setScoreStandardType(weightItem2.getScoreStandardType());
    }

    public static /* synthetic */ WeightItemEntity copy$default(WeightItemEntity weightItemEntity, String str, String str2, long j, int i, Object obj) {
        if ((i & 1) != 0) {
            str = weightItemEntity.key;
        }
        if ((i & 2) != 0) {
            str2 = weightItemEntity.sid;
        }
        if ((i & 4) != 0) {
            j = weightItemEntity.time;
        }
        return weightItemEntity.copy(str, str2, j);
    }

    private final WeightItem toWeightItem() {
        WeightItem weightItem = new WeightItem(getTime(), this.weight, this.bmi, this.bodyFatRate, this.moistureRate, this.boneMass, this.basalMetabolism, this.muscleRate, this.proteinRate, this.visceralFat);
        WeightItem weightItem2 = TextUtils.isEmpty(this.value) ? null : (WeightItem) FitnessPersistUtils.INSTANCE.fromJson(this.value, WeightItem.class);
        if (weightItem2 != null) {
            addExtraValueFrom(weightItem, weightItem2);
        }
        return weightItem;
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
    public final WeightItemEntity copy(@NotNull String key, @NotNull String sid, long time) {
        Intrinsics.checkNotNullParameter(key, "key");
        Intrinsics.checkNotNullParameter(sid, "sid");
        return new WeightItemEntity(key, sid, time);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof WeightItemEntity)) {
            return false;
        }
        WeightItemEntity weightItemEntity = (WeightItemEntity) other;
        return Intrinsics.areEqual(this.key, weightItemEntity.key) && Intrinsics.areEqual(this.sid, weightItemEntity.sid) && this.time == weightItemEntity.time;
    }

    @Nullable
    public final Integer getBasalMetabolism() {
        return this.basalMetabolism;
    }

    @Nullable
    public final Float getBmi() {
        return this.bmi;
    }

    @Nullable
    public final Float getBodyFatRate() {
        return this.bodyFatRate;
    }

    @Nullable
    public final Float getBoneMass() {
        return this.boneMass;
    }

    @Override // com.xiaomi.fit.fitness.persist.db.internal.DailyRecordBaseEntity
    @NotNull
    public String getKey() {
        return this.key;
    }

    @Nullable
    public final Float getMoistureRate() {
        return this.moistureRate;
    }

    @Nullable
    public final Float getMuscleRate() {
        return this.muscleRate;
    }

    @Nullable
    public final Float getProteinRate() {
        return this.proteinRate;
    }

    @Override // com.xiaomi.fit.fitness.persist.db.internal.DailyRecordBaseEntity
    @NotNull
    /* JADX INFO: renamed from: getRecordValue */
    public String getValue() {
        return FitnessPersistUtils.INSTANCE.toJson(toWeightItem());
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

    @Nullable
    public final String getValue() {
        return this.value;
    }

    @Nullable
    public final Float getVisceralFat() {
        return this.visceralFat;
    }

    public final float getWeight() {
        return this.weight;
    }

    public final long getZeroTimeIn0Tz() {
        return this.zeroTimeIn0Tz;
    }

    public int hashCode() {
        return (((this.key.hashCode() * 31) + this.sid.hashCode()) * 31) + Long.hashCode(this.time);
    }

    public final void setBasalMetabolism(@Nullable Integer num) {
        this.basalMetabolism = num;
    }

    public final void setBmi(@Nullable Float f) {
        this.bmi = f;
    }

    public final void setBodyFatRate(@Nullable Float f) {
        this.bodyFatRate = f;
    }

    public final void setBoneMass(@Nullable Float f) {
        this.boneMass = f;
    }

    @Override // com.xiaomi.fit.fitness.persist.db.internal.DailyRecordBaseEntity
    public void setFromLocalRecord(@NotNull DailyRecordItemModel recordModel) {
        Intrinsics.checkNotNullParameter(recordModel, "recordModel");
        super.setFromLocalRecord(recordModel);
        this.zeroTimeIn0Tz = FitnessDateUtils.changeZeroOfTheDay(getTimeIn0Tz(), 0);
    }

    @Override // com.xiaomi.fit.fitness.persist.db.internal.DailyRecordBaseEntity
    public void setFromServerRecord(@NotNull FitnessDataModel record) {
        Intrinsics.checkNotNullParameter(record, "record");
        super.setFromServerRecord(record);
        this.zeroTimeIn0Tz = FitnessDateUtils.changeZeroOfTheDay(getTimeIn0Tz(), 0);
    }

    public final void setMoistureRate(@Nullable Float f) {
        this.moistureRate = f;
    }

    public final void setMuscleRate(@Nullable Float f) {
        this.muscleRate = f;
    }

    public final void setProteinRate(@Nullable Float f) {
        this.proteinRate = f;
    }

    @Override // com.xiaomi.fit.fitness.persist.db.internal.DailyRecordBaseEntity
    public void setRecordItem(@NotNull DailyRecordItem item) {
        Intrinsics.checkNotNullParameter(item, "item");
        WeightItem weightItem = (WeightItem) item;
        this.weight = weightItem.getWeight();
        this.bmi = weightItem.getBmi();
        this.bodyFatRate = weightItem.getBodyFatRate();
        this.moistureRate = weightItem.getMoistureRate();
        this.boneMass = weightItem.getBoneSaltMass();
        this.basalMetabolism = weightItem.getBasalMetabolism();
        this.muscleRate = weightItem.getMuscleRate();
        this.proteinRate = weightItem.getProteinRate();
        this.visceralFat = weightItem.getVisceralFat();
        WeightItem weightItem2 = new WeightItem(getTime(), this.weight, null, null, null, null, null, null, null, null, 1020, null);
        addExtraValueFrom(weightItem2, weightItem);
        this.value = FitnessPersistUtils.INSTANCE.toJson(weightItem2);
    }

    @Override // com.xiaomi.fit.fitness.persist.db.internal.DailyRecordBaseEntity
    public void setRecordValue(@NotNull String value) {
        Intrinsics.checkNotNullParameter(value, "value");
        WeightItem weightItem = (WeightItem) FitnessPersistUtils.INSTANCE.fromJson(value, WeightItem.class);
        if (weightItem != null) {
            setRecordItem(weightItem);
        }
    }

    public final void setValue(@Nullable String str) {
        this.value = str;
    }

    public final void setVisceralFat(@Nullable Float f) {
        this.visceralFat = f;
    }

    public final void setWeight(float f) {
        this.weight = f;
    }

    public final void setZeroTimeIn0Tz(long j) {
        this.zeroTimeIn0Tz = j;
    }

    @NotNull
    public String toString() {
        return "WeightItemEntity(key=" + this.key + ", sid=" + this.sid + ", time=" + this.time + ")";
    }
}
