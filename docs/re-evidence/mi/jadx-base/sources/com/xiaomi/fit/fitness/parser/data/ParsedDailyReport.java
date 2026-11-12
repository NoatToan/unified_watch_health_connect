package com.xiaomi.fit.fitness.parser.data;

import com.xiaomi.fit.data.common.data.annotation.VitalitySuggestActivityType;
import com.xiaomi.fit.fitness.parser.schema.FitnessReportKey;
import java.util.Arrays;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\b\n\u0002\b1\n\u0002\u0010\u0012\n\u0002\bF\n\u0002\u0010\u000e\n\u0000\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\b\u0010}\u001a\u00020~H\u0016R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u001e\u0010\f\u001a\u0004\u0018\u00010\u0005X\u0086\u000e¢\u0006\u0010\n\u0002\u0010\u0011\u001a\u0004\b\r\u0010\u000e\"\u0004\b\u000f\u0010\u0010R\u001e\u0010\u0012\u001a\u0004\u0018\u00010\u0005X\u0086\u000e¢\u0006\u0010\n\u0002\u0010\u0011\u001a\u0004\b\u0013\u0010\u000e\"\u0004\b\u0014\u0010\u0010R\u001e\u0010\u0015\u001a\u0004\u0018\u00010\u0005X\u0086\u000e¢\u0006\u0010\n\u0002\u0010\u0011\u001a\u0004\b\u0016\u0010\u000e\"\u0004\b\u0017\u0010\u0010R\u001e\u0010\u0018\u001a\u0004\u0018\u00010\u0005X\u0086\u000e¢\u0006\u0010\n\u0002\u0010\u0011\u001a\u0004\b\u0019\u0010\u000e\"\u0004\b\u001a\u0010\u0010R\u001e\u0010\u001b\u001a\u0004\u0018\u00010\u0005X\u0086\u000e¢\u0006\u0010\n\u0002\u0010\u0011\u001a\u0004\b\u001c\u0010\u000e\"\u0004\b\u001d\u0010\u0010R\u001e\u0010\u001e\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u0010\n\u0002\u0010#\u001a\u0004\b\u001f\u0010 \"\u0004\b!\u0010\"R\u001e\u0010$\u001a\u0004\u0018\u00010\u0005X\u0086\u000e¢\u0006\u0010\n\u0002\u0010\u0011\u001a\u0004\b%\u0010\u000e\"\u0004\b&\u0010\u0010R\u001e\u0010'\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u0010\n\u0002\u0010#\u001a\u0004\b(\u0010 \"\u0004\b)\u0010\"R\u001e\u0010*\u001a\u0004\u0018\u00010\u0005X\u0086\u000e¢\u0006\u0010\n\u0002\u0010\u0011\u001a\u0004\b+\u0010\u000e\"\u0004\b,\u0010\u0010R\u001e\u0010-\u001a\u0004\u0018\u00010\u0005X\u0086\u000e¢\u0006\u0010\n\u0002\u0010\u0011\u001a\u0004\b.\u0010\u000e\"\u0004\b/\u0010\u0010R\u001e\u00100\u001a\u0004\u0018\u00010\u0005X\u0086\u000e¢\u0006\u0010\n\u0002\u0010\u0011\u001a\u0004\b1\u0010\u000e\"\u0004\b2\u0010\u0010R\u001e\u00103\u001a\u0004\u0018\u00010\u0005X\u0086\u000e¢\u0006\u0010\n\u0002\u0010\u0011\u001a\u0004\b4\u0010\u000e\"\u0004\b5\u0010\u0010R\u001c\u00106\u001a\u0004\u0018\u000107X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b8\u00109\"\u0004\b:\u0010;R\u001e\u0010<\u001a\u0004\u0018\u00010\u0005X\u0086\u000e¢\u0006\u0010\n\u0002\u0010\u0011\u001a\u0004\b=\u0010\u000e\"\u0004\b>\u0010\u0010R\u001e\u0010?\u001a\u0004\u0018\u00010\u0005X\u0086\u000e¢\u0006\u0010\n\u0002\u0010\u0011\u001a\u0004\b@\u0010\u000e\"\u0004\bA\u0010\u0010R\u001e\u0010B\u001a\u0004\u0018\u00010\u0005X\u0086\u000e¢\u0006\u0010\n\u0002\u0010\u0011\u001a\u0004\bC\u0010\u000e\"\u0004\bD\u0010\u0010R\u001e\u0010E\u001a\u0004\u0018\u00010\u0005X\u0086\u000e¢\u0006\u0010\n\u0002\u0010\u0011\u001a\u0004\bF\u0010\u000e\"\u0004\bG\u0010\u0010R\u001e\u0010H\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u0010\n\u0002\u0010#\u001a\u0004\bI\u0010 \"\u0004\bJ\u0010\"R\u001e\u0010K\u001a\u0004\u0018\u00010\u0005X\u0086\u000e¢\u0006\u0010\n\u0002\u0010\u0011\u001a\u0004\bL\u0010\u000e\"\u0004\bM\u0010\u0010R\u001e\u0010N\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u0010\n\u0002\u0010#\u001a\u0004\bO\u0010 \"\u0004\bP\u0010\"R\u001e\u0010Q\u001a\u0004\u0018\u00010\u0005X\u0086\u000e¢\u0006\u0010\n\u0002\u0010\u0011\u001a\u0004\bR\u0010\u000e\"\u0004\bS\u0010\u0010R\u001e\u0010T\u001a\u0004\u0018\u00010\u0005X\u0086\u000e¢\u0006\u0010\n\u0002\u0010\u0011\u001a\u0004\bU\u0010\u000e\"\u0004\bV\u0010\u0010R\u001e\u0010W\u001a\u0004\u0018\u00010\u0005X\u0086\u000e¢\u0006\u0010\n\u0002\u0010\u0011\u001a\u0004\bX\u0010\u000e\"\u0004\bY\u0010\u0010R$\u0010Z\u001a\u0004\u0018\u00010\u0005X\u0086\u000e¢\u0006\u0016\n\u0002\u0010\u0011\u0012\u0004\b[\u0010\\\u001a\u0004\b]\u0010\u000e\"\u0004\b^\u0010\u0010R\u001e\u0010_\u001a\u0004\u0018\u00010\u0005X\u0086\u000e¢\u0006\u0010\n\u0002\u0010\u0011\u001a\u0004\b`\u0010\u000e\"\u0004\ba\u0010\u0010R\u001e\u0010b\u001a\u0004\u0018\u00010\u0005X\u0086\u000e¢\u0006\u0010\n\u0002\u0010\u0011\u001a\u0004\bc\u0010\u000e\"\u0004\bd\u0010\u0010R\u001e\u0010e\u001a\u0004\u0018\u00010\u0005X\u0086\u000e¢\u0006\u0010\n\u0002\u0010\u0011\u001a\u0004\bf\u0010\u000e\"\u0004\bg\u0010\u0010R\u001e\u0010h\u001a\u0004\u0018\u00010\u0005X\u0086\u000e¢\u0006\u0010\n\u0002\u0010\u0011\u001a\u0004\bi\u0010\u000e\"\u0004\bj\u0010\u0010R\"\u0010k\u001a\u0004\u0018\u00010\u00058\u0006@\u0006X\u0087\u000e¢\u0006\u0010\n\u0002\u0010\u0011\u001a\u0004\bl\u0010\u000e\"\u0004\bm\u0010\u0010R\u001e\u0010n\u001a\u0004\u0018\u00010\u0005X\u0086\u000e¢\u0006\u0010\n\u0002\u0010\u0011\u001a\u0004\bo\u0010\u000e\"\u0004\bp\u0010\u0010R\u001e\u0010q\u001a\u0004\u0018\u00010\u0005X\u0086\u000e¢\u0006\u0010\n\u0002\u0010\u0011\u001a\u0004\br\u0010\u000e\"\u0004\bs\u0010\u0010R\u001e\u0010t\u001a\u0004\u0018\u00010\u0005X\u0086\u000e¢\u0006\u0010\n\u0002\u0010\u0011\u001a\u0004\bu\u0010\u000e\"\u0004\bv\u0010\u0010R\u001e\u0010w\u001a\u0004\u0018\u00010\u0005X\u0086\u000e¢\u0006\u0010\n\u0002\u0010\u0011\u001a\u0004\bx\u0010\u000e\"\u0004\by\u0010\u0010R\u001e\u0010z\u001a\u0004\u0018\u00010\u0005X\u0086\u000e¢\u0006\u0010\n\u0002\u0010\u0011\u001a\u0004\b{\u0010\u000e\"\u0004\b|\u0010\u0010¨\u0006\u007f"}, d2 = {"Lcom/xiaomi/fit/fitness/parser/data/ParsedDailyReport;", "", "time", "", "zoneOffsetInSec", "", "<init>", "(JI)V", "getTime", "()J", "getZoneOffsetInSec", "()I", "steps", "getSteps", "()Ljava/lang/Integer;", "setSteps", "(Ljava/lang/Integer;)V", "Ljava/lang/Integer;", "calories", "getCalories", "setCalories", "hr", "getHr", "setHr", "restHr", "getRestHr", "setRestHr", "maxHr", "getMaxHr", "setMaxHr", "maxHrTime", "getMaxHrTime", "()Ljava/lang/Long;", "setMaxHrTime", "(Ljava/lang/Long;)V", "Ljava/lang/Long;", "minHr", "getMinHr", "setMinHr", "minHrTime", "getMinHrTime", "setMinHrTime", "avgHr", "getAvgHr", "setAvgHr", "avgStress", "getAvgStress", "setAvgStress", "maxStress", "getMaxStress", "setMaxStress", "minStress", "getMinStress", "setMinStress", "validStand", "", "getValidStand", "()[B", "setValidStand", "([B)V", "totalCal", "getTotalCal", "setTotalCal", "recoveryTime", "getRecoveryTime", "setRecoveryTime", "spo2", "getSpo2", "setSpo2", FitnessReportKey.maxSpo2, "getMaxSpo2", "setMaxSpo2", "maxSpo2Time", "getMaxSpo2Time", "setMaxSpo2Time", FitnessReportKey.minSpo2, "getMinSpo2", "setMinSpo2", "minSpo2Time", "getMinSpo2Time", "setMinSpo2Time", FitnessReportKey.avgSpo2, "getAvgSpo2", "setAvgSpo2", "dayTrainingLoad", "getDayTrainingLoad", "setDayTrainingLoad", "weekTrainingLoad", "getWeekTrainingLoad", "setWeekTrainingLoad", "trainingLoadLevel", "getTrainingLoadLevel$annotations", "()V", "getTrainingLoadLevel", "setTrainingLoadLevel", "dayLowIntensityVitality", "getDayLowIntensityVitality", "setDayLowIntensityVitality", "dayMediumIntensityVitality", "getDayMediumIntensityVitality", "setDayMediumIntensityVitality", "dayHighIntensityVitality", "getDayHighIntensityVitality", "setDayHighIntensityVitality", "total7daysVitality", "getTotal7daysVitality", "setTotal7daysVitality", "suggestActivityType", "getSuggestActivityType", "setSuggestActivityType", "suggestActivityDuration", "getSuggestActivityDuration", "setSuggestActivityDuration", "physicalFitnessStatus", "getPhysicalFitnessStatus", "setPhysicalFitnessStatus", "physicalFitnessLevel", "getPhysicalFitnessLevel", "setPhysicalFitnessLevel", "fatigueLevel", "getFatigueLevel", "setFatigueLevel", "physicalStatusStress", "getPhysicalStatusStress", "setPhysicalStatusStress", "toString", "", "fitness-parser_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class ParsedDailyReport {

    @Nullable
    private Integer avgHr;

    @Nullable
    private Integer avgSpo2;

    @Nullable
    private Integer avgStress;

    @Nullable
    private Integer calories;

    @Nullable
    private Integer dayHighIntensityVitality;

    @Nullable
    private Integer dayLowIntensityVitality;

    @Nullable
    private Integer dayMediumIntensityVitality;

    @Nullable
    private Integer dayTrainingLoad;

    @Nullable
    private Integer fatigueLevel;

    @Nullable
    private Integer hr;

    @Nullable
    private Integer maxHr;

    @Nullable
    private Long maxHrTime;

    @Nullable
    private Integer maxSpo2;

    @Nullable
    private Long maxSpo2Time;

    @Nullable
    private Integer maxStress;

    @Nullable
    private Integer minHr;

    @Nullable
    private Long minHrTime;

    @Nullable
    private Integer minSpo2;

    @Nullable
    private Long minSpo2Time;

    @Nullable
    private Integer minStress;

    @Nullable
    private Integer physicalFitnessLevel;

    @Nullable
    private Integer physicalFitnessStatus;

    @Nullable
    private Integer physicalStatusStress;

    @Nullable
    private Integer recoveryTime;

    @Nullable
    private Integer restHr;

    @Nullable
    private Integer spo2;

    @Nullable
    private Integer steps;

    @Nullable
    private Integer suggestActivityDuration;

    @VitalitySuggestActivityType
    @Nullable
    private Integer suggestActivityType;
    private final long time;

    @Nullable
    private Integer total7daysVitality;

    @Nullable
    private Integer totalCal;

    @Nullable
    private Integer trainingLoadLevel;

    @Nullable
    private byte[] validStand;

    @Nullable
    private Integer weekTrainingLoad;
    private final int zoneOffsetInSec;

    public ParsedDailyReport(long j, int i) {
        this.time = j;
        this.zoneOffsetInSec = i;
    }

    public static /* synthetic */ void getTrainingLoadLevel$annotations() {
    }

    @Nullable
    public final Integer getAvgHr() {
        return this.avgHr;
    }

    @Nullable
    public final Integer getAvgSpo2() {
        return this.avgSpo2;
    }

    @Nullable
    public final Integer getAvgStress() {
        return this.avgStress;
    }

    @Nullable
    public final Integer getCalories() {
        return this.calories;
    }

    @Nullable
    public final Integer getDayHighIntensityVitality() {
        return this.dayHighIntensityVitality;
    }

    @Nullable
    public final Integer getDayLowIntensityVitality() {
        return this.dayLowIntensityVitality;
    }

    @Nullable
    public final Integer getDayMediumIntensityVitality() {
        return this.dayMediumIntensityVitality;
    }

    @Nullable
    public final Integer getDayTrainingLoad() {
        return this.dayTrainingLoad;
    }

    @Nullable
    public final Integer getFatigueLevel() {
        return this.fatigueLevel;
    }

    @Nullable
    public final Integer getHr() {
        return this.hr;
    }

    @Nullable
    public final Integer getMaxHr() {
        return this.maxHr;
    }

    @Nullable
    public final Long getMaxHrTime() {
        return this.maxHrTime;
    }

    @Nullable
    public final Integer getMaxSpo2() {
        return this.maxSpo2;
    }

    @Nullable
    public final Long getMaxSpo2Time() {
        return this.maxSpo2Time;
    }

    @Nullable
    public final Integer getMaxStress() {
        return this.maxStress;
    }

    @Nullable
    public final Integer getMinHr() {
        return this.minHr;
    }

    @Nullable
    public final Long getMinHrTime() {
        return this.minHrTime;
    }

    @Nullable
    public final Integer getMinSpo2() {
        return this.minSpo2;
    }

    @Nullable
    public final Long getMinSpo2Time() {
        return this.minSpo2Time;
    }

    @Nullable
    public final Integer getMinStress() {
        return this.minStress;
    }

    @Nullable
    public final Integer getPhysicalFitnessLevel() {
        return this.physicalFitnessLevel;
    }

    @Nullable
    public final Integer getPhysicalFitnessStatus() {
        return this.physicalFitnessStatus;
    }

    @Nullable
    public final Integer getPhysicalStatusStress() {
        return this.physicalStatusStress;
    }

    @Nullable
    public final Integer getRecoveryTime() {
        return this.recoveryTime;
    }

    @Nullable
    public final Integer getRestHr() {
        return this.restHr;
    }

    @Nullable
    public final Integer getSpo2() {
        return this.spo2;
    }

    @Nullable
    public final Integer getSteps() {
        return this.steps;
    }

    @Nullable
    public final Integer getSuggestActivityDuration() {
        return this.suggestActivityDuration;
    }

    @Nullable
    public final Integer getSuggestActivityType() {
        return this.suggestActivityType;
    }

    public final long getTime() {
        return this.time;
    }

    @Nullable
    public final Integer getTotal7daysVitality() {
        return this.total7daysVitality;
    }

    @Nullable
    public final Integer getTotalCal() {
        return this.totalCal;
    }

    @Nullable
    public final Integer getTrainingLoadLevel() {
        return this.trainingLoadLevel;
    }

    @Nullable
    public final byte[] getValidStand() {
        return this.validStand;
    }

    @Nullable
    public final Integer getWeekTrainingLoad() {
        return this.weekTrainingLoad;
    }

    public final int getZoneOffsetInSec() {
        return this.zoneOffsetInSec;
    }

    public final void setAvgHr(@Nullable Integer num) {
        this.avgHr = num;
    }

    public final void setAvgSpo2(@Nullable Integer num) {
        this.avgSpo2 = num;
    }

    public final void setAvgStress(@Nullable Integer num) {
        this.avgStress = num;
    }

    public final void setCalories(@Nullable Integer num) {
        this.calories = num;
    }

    public final void setDayHighIntensityVitality(@Nullable Integer num) {
        this.dayHighIntensityVitality = num;
    }

    public final void setDayLowIntensityVitality(@Nullable Integer num) {
        this.dayLowIntensityVitality = num;
    }

    public final void setDayMediumIntensityVitality(@Nullable Integer num) {
        this.dayMediumIntensityVitality = num;
    }

    public final void setDayTrainingLoad(@Nullable Integer num) {
        this.dayTrainingLoad = num;
    }

    public final void setFatigueLevel(@Nullable Integer num) {
        this.fatigueLevel = num;
    }

    public final void setHr(@Nullable Integer num) {
        this.hr = num;
    }

    public final void setMaxHr(@Nullable Integer num) {
        this.maxHr = num;
    }

    public final void setMaxHrTime(@Nullable Long l) {
        this.maxHrTime = l;
    }

    public final void setMaxSpo2(@Nullable Integer num) {
        this.maxSpo2 = num;
    }

    public final void setMaxSpo2Time(@Nullable Long l) {
        this.maxSpo2Time = l;
    }

    public final void setMaxStress(@Nullable Integer num) {
        this.maxStress = num;
    }

    public final void setMinHr(@Nullable Integer num) {
        this.minHr = num;
    }

    public final void setMinHrTime(@Nullable Long l) {
        this.minHrTime = l;
    }

    public final void setMinSpo2(@Nullable Integer num) {
        this.minSpo2 = num;
    }

    public final void setMinSpo2Time(@Nullable Long l) {
        this.minSpo2Time = l;
    }

    public final void setMinStress(@Nullable Integer num) {
        this.minStress = num;
    }

    public final void setPhysicalFitnessLevel(@Nullable Integer num) {
        this.physicalFitnessLevel = num;
    }

    public final void setPhysicalFitnessStatus(@Nullable Integer num) {
        this.physicalFitnessStatus = num;
    }

    public final void setPhysicalStatusStress(@Nullable Integer num) {
        this.physicalStatusStress = num;
    }

    public final void setRecoveryTime(@Nullable Integer num) {
        this.recoveryTime = num;
    }

    public final void setRestHr(@Nullable Integer num) {
        this.restHr = num;
    }

    public final void setSpo2(@Nullable Integer num) {
        this.spo2 = num;
    }

    public final void setSteps(@Nullable Integer num) {
        this.steps = num;
    }

    public final void setSuggestActivityDuration(@Nullable Integer num) {
        this.suggestActivityDuration = num;
    }

    public final void setSuggestActivityType(@Nullable Integer num) {
        this.suggestActivityType = num;
    }

    public final void setTotal7daysVitality(@Nullable Integer num) {
        this.total7daysVitality = num;
    }

    public final void setTotalCal(@Nullable Integer num) {
        this.totalCal = num;
    }

    public final void setTrainingLoadLevel(@Nullable Integer num) {
        this.trainingLoadLevel = num;
    }

    public final void setValidStand(@Nullable byte[] bArr) {
        this.validStand = bArr;
    }

    public final void setWeekTrainingLoad(@Nullable Integer num) {
        this.weekTrainingLoad = num;
    }

    @NotNull
    public String toString() {
        Integer num = this.steps;
        Integer num2 = this.calories;
        Integer num3 = this.hr;
        Integer num4 = this.restHr;
        Integer num5 = this.maxHr;
        Long l = this.maxHrTime;
        Integer num6 = this.minHr;
        Long l2 = this.minHrTime;
        Integer num7 = this.avgHr;
        Integer num8 = this.avgStress;
        Integer num9 = this.maxStress;
        Integer num10 = this.minStress;
        String string = Arrays.toString(this.validStand);
        Intrinsics.checkNotNullExpressionValue(string, "toString(...)");
        return "steps= " + num + ", calories = " + num2 + ", hr = " + num3 + ", restHr = " + num4 + ", maxHr = " + num5 + ", maxHrTime = " + l + ", minHr = " + num6 + ", minHrTime = " + l2 + ", avgHr = " + num7 + ", avgStress = " + num8 + ", maxStress = " + num9 + ", minStress = " + num10 + ", validStand = " + string + ", totalCal = " + this.totalCal + ", recoveryTime = " + this.recoveryTime + ", spo2 = " + this.spo2 + ", maxSpo2 = " + this.maxSpo2 + ", maxSpo2Time = " + this.maxSpo2Time + ", minSpo2 = " + this.minSpo2 + ", minSpo2Time = " + this.minSpo2Time + ", avgSpo2 = " + this.avgSpo2 + ", dayTrainingLoad = " + this.dayTrainingLoad + ", weekTrainingLoad = " + this.weekTrainingLoad + ", trainingLoadLevel = " + this.trainingLoadLevel + ", physicalFitnessLevel = " + this.physicalFitnessLevel + ", fatigueLevel = " + this.fatigueLevel + ", physicalFitnessStatus = " + this.physicalFitnessStatus + ", physicalStatusStress = " + this.physicalStatusStress;
    }
}
