package com.xiaomi.fit.fitness.parser.data;

import com.xiaomi.fit.fitness.persist.db.internal.WeightRecordDaoKt;
import kotlin.Metadata;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\u0005\n\u0002\u0010\u0007\n\u0002\b#\n\u0002\u0010\b\n\u0002\b\u0006\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003R\u001a\u0010\u0004\u001a\u00020\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0006\u0010\u0007\"\u0004\b\b\u0010\tR\u001a\u0010\n\u001a\u00020\u000bX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u000fR\u001e\u0010\u0010\u001a\u0004\u0018\u00010\u000bX\u0086\u000e¢\u0006\u0010\n\u0002\u0010\u0015\u001a\u0004\b\u0011\u0010\u0012\"\u0004\b\u0013\u0010\u0014R\u001e\u0010\u0016\u001a\u0004\u0018\u00010\u000bX\u0086\u000e¢\u0006\u0010\n\u0002\u0010\u0015\u001a\u0004\b\u0017\u0010\u0012\"\u0004\b\u0018\u0010\u0014R\u001e\u0010\u0019\u001a\u0004\u0018\u00010\u000bX\u0086\u000e¢\u0006\u0010\n\u0002\u0010\u0015\u001a\u0004\b\u001a\u0010\u0012\"\u0004\b\u001b\u0010\u0014R\u001e\u0010\u001c\u001a\u0004\u0018\u00010\u000bX\u0086\u000e¢\u0006\u0010\n\u0002\u0010\u0015\u001a\u0004\b\u001d\u0010\u0012\"\u0004\b\u001e\u0010\u0014R\u001e\u0010\u001f\u001a\u0004\u0018\u00010\u000bX\u0086\u000e¢\u0006\u0010\n\u0002\u0010\u0015\u001a\u0004\b \u0010\u0012\"\u0004\b!\u0010\u0014R\u001e\u0010\"\u001a\u0004\u0018\u00010\u000bX\u0086\u000e¢\u0006\u0010\n\u0002\u0010\u0015\u001a\u0004\b#\u0010\u0012\"\u0004\b$\u0010\u0014R\u001e\u0010%\u001a\u0004\u0018\u00010\u000bX\u0086\u000e¢\u0006\u0010\n\u0002\u0010\u0015\u001a\u0004\b&\u0010\u0012\"\u0004\b'\u0010\u0014R\u001e\u0010(\u001a\u0004\u0018\u00010\u000bX\u0086\u000e¢\u0006\u0010\n\u0002\u0010\u0015\u001a\u0004\b)\u0010\u0012\"\u0004\b*\u0010\u0014R\u001e\u0010+\u001a\u0004\u0018\u00010\u000bX\u0086\u000e¢\u0006\u0010\n\u0002\u0010\u0015\u001a\u0004\b,\u0010\u0012\"\u0004\b-\u0010\u0014R\u001e\u0010.\u001a\u0004\u0018\u00010/X\u0086\u000e¢\u0006\u0010\n\u0002\u00104\u001a\u0004\b0\u00101\"\u0004\b2\u00103¨\u00065"}, d2 = {"Lcom/xiaomi/fit/fitness/parser/data/WeightRecord;", "", "<init>", "()V", "time", "", "getTime", "()J", "setTime", "(J)V", "weight", "", "getWeight", "()F", "setWeight", "(F)V", "bmi", "getBmi", "()Ljava/lang/Float;", "setBmi", "(Ljava/lang/Float;)V", "Ljava/lang/Float;", WeightRecordDaoKt.COL_BODY_FAT_RATE, "getBodyFatRate", "setBodyFatRate", WeightRecordDaoKt.COL_MOISTURE_RATE, "getMoistureRate", "setMoistureRate", "boneSaltRate", "getBoneSaltRate", "setBoneSaltRate", WeightRecordDaoKt.COL_BONE_MASS, "getBoneMass", "setBoneMass", WeightRecordDaoKt.COL_PROTEIN_RATE, "getProteinRate", "setProteinRate", "proteinMass", "getProteinMass", "setProteinMass", "fatMass", "getFatMass", "setFatMass", WeightRecordDaoKt.COL_MUSCLE_RATE, "getMuscleMass", "setMuscleMass", WeightRecordDaoKt.COL_BASAL_METABOLISM, "", "getBasalMetabolism", "()Ljava/lang/Integer;", "setBasalMetabolism", "(Ljava/lang/Integer;)V", "Ljava/lang/Integer;", "fitness-parser_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class WeightRecord {

    @Nullable
    private Integer basalMetabolism;

    @Nullable
    private Float bmi;

    @Nullable
    private Float bodyFatRate;

    @Nullable
    private Float boneMass;

    @Nullable
    private Float boneSaltRate;

    @Nullable
    private Float fatMass;

    @Nullable
    private Float moistureRate;

    @Nullable
    private Float muscleMass;

    @Nullable
    private Float proteinMass;

    @Nullable
    private Float proteinRate;
    private long time;
    private float weight;

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

    @Nullable
    public final Float getBoneSaltRate() {
        return this.boneSaltRate;
    }

    @Nullable
    public final Float getFatMass() {
        return this.fatMass;
    }

    @Nullable
    public final Float getMoistureRate() {
        return this.moistureRate;
    }

    @Nullable
    public final Float getMuscleMass() {
        return this.muscleMass;
    }

    @Nullable
    public final Float getProteinMass() {
        return this.proteinMass;
    }

    @Nullable
    public final Float getProteinRate() {
        return this.proteinRate;
    }

    public final long getTime() {
        return this.time;
    }

    public final float getWeight() {
        return this.weight;
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

    public final void setBoneSaltRate(@Nullable Float f) {
        this.boneSaltRate = f;
    }

    public final void setFatMass(@Nullable Float f) {
        this.fatMass = f;
    }

    public final void setMoistureRate(@Nullable Float f) {
        this.moistureRate = f;
    }

    public final void setMuscleMass(@Nullable Float f) {
        this.muscleMass = f;
    }

    public final void setProteinMass(@Nullable Float f) {
        this.proteinMass = f;
    }

    public final void setProteinRate(@Nullable Float f) {
        this.proteinRate = f;
    }

    public final void setTime(long j) {
        this.time = j;
    }

    public final void setWeight(float f) {
        this.weight = f;
    }
}
