package com.xiaomi.fit.fitness.parser.data;

import com.xiaomi.fit.fitness.parser.schema.DailyRecordKey;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\t\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0018\n\u0002\u0010\u000b\n\u0002\b \n\u0002\u0010\u000e\n\u0000\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\b\u0010B\u001a\u00020CH\u0016R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007R\u001e\u0010\b\u001a\u0004\u0018\u00010\tX\u0086\u000e¢\u0006\u0010\n\u0002\u0010\u000e\u001a\u0004\b\n\u0010\u000b\"\u0004\b\f\u0010\rR\u001e\u0010\u000f\u001a\u0004\u0018\u00010\tX\u0086\u000e¢\u0006\u0010\n\u0002\u0010\u000e\u001a\u0004\b\u0010\u0010\u000b\"\u0004\b\u0011\u0010\rR\u001e\u0010\u0012\u001a\u0004\u0018\u00010\tX\u0086\u000e¢\u0006\u0010\n\u0002\u0010\u000e\u001a\u0004\b\u0013\u0010\u000b\"\u0004\b\u0014\u0010\rR\u001e\u0010\u0015\u001a\u0004\u0018\u00010\tX\u0086\u000e¢\u0006\u0010\n\u0002\u0010\u000e\u001a\u0004\b\u0016\u0010\u000b\"\u0004\b\u0017\u0010\rR\u001e\u0010\u0018\u001a\u0004\u0018\u00010\tX\u0086\u000e¢\u0006\u0010\n\u0002\u0010\u000e\u001a\u0004\b\u0019\u0010\u000b\"\u0004\b\u001a\u0010\rR\u001e\u0010\u001b\u001a\u0004\u0018\u00010\tX\u0086\u000e¢\u0006\u0010\n\u0002\u0010\u000e\u001a\u0004\b\u001c\u0010\u000b\"\u0004\b\u001d\u0010\rR\u001e\u0010\u001e\u001a\u0004\u0018\u00010\tX\u0086\u000e¢\u0006\u0010\n\u0002\u0010\u000e\u001a\u0004\b\u001f\u0010\u000b\"\u0004\b \u0010\rR\u001e\u0010!\u001a\u0004\u0018\u00010\"X\u0086\u000e¢\u0006\u0010\n\u0002\u0010&\u001a\u0004\b!\u0010#\"\u0004\b$\u0010%R\u001e\u0010'\u001a\u0004\u0018\u00010\tX\u0086\u000e¢\u0006\u0010\n\u0002\u0010\u000e\u001a\u0004\b(\u0010\u000b\"\u0004\b)\u0010\rR\u001e\u0010*\u001a\u0004\u0018\u00010\tX\u0086\u000e¢\u0006\u0010\n\u0002\u0010\u000e\u001a\u0004\b+\u0010\u000b\"\u0004\b,\u0010\rR\u001e\u0010-\u001a\u0004\u0018\u00010\tX\u0086\u000e¢\u0006\u0010\n\u0002\u0010\u000e\u001a\u0004\b.\u0010\u000b\"\u0004\b/\u0010\rR\u001e\u00100\u001a\u0004\u0018\u00010\tX\u0086\u000e¢\u0006\u0010\n\u0002\u0010\u000e\u001a\u0004\b1\u0010\u000b\"\u0004\b2\u0010\rR\u001e\u00103\u001a\u0004\u0018\u00010\tX\u0086\u000e¢\u0006\u0010\n\u0002\u0010\u000e\u001a\u0004\b4\u0010\u000b\"\u0004\b5\u0010\rR\u001e\u00106\u001a\u0004\u0018\u00010\tX\u0086\u000e¢\u0006\u0010\n\u0002\u0010\u000e\u001a\u0004\b7\u0010\u000b\"\u0004\b8\u0010\rR\u001e\u00109\u001a\u0004\u0018\u00010\tX\u0086\u000e¢\u0006\u0010\n\u0002\u0010\u000e\u001a\u0004\b:\u0010\u000b\"\u0004\b;\u0010\rR\u001e\u0010<\u001a\u0004\u0018\u00010\tX\u0086\u000e¢\u0006\u0010\n\u0002\u0010\u000e\u001a\u0004\b=\u0010\u000b\"\u0004\b>\u0010\rR\u001e\u0010?\u001a\u0004\u0018\u00010\tX\u0086\u000e¢\u0006\u0010\n\u0002\u0010\u000e\u001a\u0004\b@\u0010\u000b\"\u0004\bA\u0010\r¨\u0006D"}, d2 = {"Lcom/xiaomi/fit/fitness/parser/data/ParsedDailyRecord;", "", "time", "", "<init>", "(J)V", "getTime", "()J", "steps", "", "getSteps", "()Ljava/lang/Integer;", "setSteps", "(Ljava/lang/Integer;)V", "Ljava/lang/Integer;", "calories", "getCalories", "setCalories", "totalCal", "getTotalCal", "setTotalCal", "activityType", "getActivityType", "setActivityType", "activityHILevel", "getActivityHILevel", "setActivityHILevel", DailyRecordKey.sportType, "getSportType", "setSportType", "distance", "getDistance", "setDistance", "isAbnormalHr", "", "()Ljava/lang/Boolean;", "setAbnormalHr", "(Ljava/lang/Boolean;)V", "Ljava/lang/Boolean;", "hr", "getHr", "setHr", "hrPreAbnormal", "getHrPreAbnormal", "setHrPreAbnormal", "energy", "getEnergy", "setEnergy", "energyState", "getEnergyState", "setEnergyState", "energyStateValue", "getEnergyStateValue", "setEnergyStateValue", "spo2", "getSpo2", "setSpo2", "stress", "getStress", "setStress", "lightValue", "getLightValue", "setLightValue", "bodyMomentum", "getBodyMomentum", "setBodyMomentum", "toString", "", "fitness-parser_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class ParsedDailyRecord {

    @Nullable
    private Integer activityHILevel;

    @Nullable
    private Integer activityType;

    @Nullable
    private Integer bodyMomentum;

    @Nullable
    private Integer calories;

    @Nullable
    private Integer distance;

    @Nullable
    private Integer energy;

    @Nullable
    private Integer energyState;

    @Nullable
    private Integer energyStateValue;

    @Nullable
    private Integer hr;

    @Nullable
    private Integer hrPreAbnormal;

    @Nullable
    private Boolean isAbnormalHr;

    @Nullable
    private Integer lightValue;

    @Nullable
    private Integer spo2;

    @Nullable
    private Integer sportType;

    @Nullable
    private Integer steps;

    @Nullable
    private Integer stress;
    private final long time;

    @Nullable
    private Integer totalCal;

    public ParsedDailyRecord(long j) {
        this.time = j;
    }

    @Nullable
    public final Integer getActivityHILevel() {
        return this.activityHILevel;
    }

    @Nullable
    public final Integer getActivityType() {
        return this.activityType;
    }

    @Nullable
    public final Integer getBodyMomentum() {
        return this.bodyMomentum;
    }

    @Nullable
    public final Integer getCalories() {
        return this.calories;
    }

    @Nullable
    public final Integer getDistance() {
        return this.distance;
    }

    @Nullable
    public final Integer getEnergy() {
        return this.energy;
    }

    @Nullable
    public final Integer getEnergyState() {
        return this.energyState;
    }

    @Nullable
    public final Integer getEnergyStateValue() {
        return this.energyStateValue;
    }

    @Nullable
    public final Integer getHr() {
        return this.hr;
    }

    @Nullable
    public final Integer getHrPreAbnormal() {
        return this.hrPreAbnormal;
    }

    @Nullable
    public final Integer getLightValue() {
        return this.lightValue;
    }

    @Nullable
    public final Integer getSpo2() {
        return this.spo2;
    }

    @Nullable
    public final Integer getSportType() {
        return this.sportType;
    }

    @Nullable
    public final Integer getSteps() {
        return this.steps;
    }

    @Nullable
    public final Integer getStress() {
        return this.stress;
    }

    public final long getTime() {
        return this.time;
    }

    @Nullable
    public final Integer getTotalCal() {
        return this.totalCal;
    }

    @Nullable
    /* JADX INFO: renamed from: isAbnormalHr, reason: from getter */
    public final Boolean getIsAbnormalHr() {
        return this.isAbnormalHr;
    }

    public final void setAbnormalHr(@Nullable Boolean bool) {
        this.isAbnormalHr = bool;
    }

    public final void setActivityHILevel(@Nullable Integer num) {
        this.activityHILevel = num;
    }

    public final void setActivityType(@Nullable Integer num) {
        this.activityType = num;
    }

    public final void setBodyMomentum(@Nullable Integer num) {
        this.bodyMomentum = num;
    }

    public final void setCalories(@Nullable Integer num) {
        this.calories = num;
    }

    public final void setDistance(@Nullable Integer num) {
        this.distance = num;
    }

    public final void setEnergy(@Nullable Integer num) {
        this.energy = num;
    }

    public final void setEnergyState(@Nullable Integer num) {
        this.energyState = num;
    }

    public final void setEnergyStateValue(@Nullable Integer num) {
        this.energyStateValue = num;
    }

    public final void setHr(@Nullable Integer num) {
        this.hr = num;
    }

    public final void setHrPreAbnormal(@Nullable Integer num) {
        this.hrPreAbnormal = num;
    }

    public final void setLightValue(@Nullable Integer num) {
        this.lightValue = num;
    }

    public final void setSpo2(@Nullable Integer num) {
        this.spo2 = num;
    }

    public final void setSportType(@Nullable Integer num) {
        this.sportType = num;
    }

    public final void setSteps(@Nullable Integer num) {
        this.steps = num;
    }

    public final void setStress(@Nullable Integer num) {
        this.stress = num;
    }

    public final void setTotalCal(@Nullable Integer num) {
        this.totalCal = num;
    }

    @NotNull
    public String toString() {
        return "time = " + this.time + ", steps= " + this.steps + ", calories = " + this.calories + ", totalCal = " + this.totalCal + ", activityType = " + this.activityType + ", activityHILevel = " + this.activityHILevel + ", sportType = " + this.sportType + ", distance = " + this.distance + ", isAbnormalHr = " + this.isAbnormalHr + ", hr = " + this.hr + ", hrBeforeAbnormal = " + this.hrPreAbnormal + ", energy = " + this.energy + ", energyState = " + this.energyState + ", energyStateValue = " + this.energyStateValue + ", spo2 = " + this.spo2 + ", stress = " + this.stress + "lightValue = " + this.lightValue + "bodyMomentum = " + this.bodyMomentum;
    }
}
