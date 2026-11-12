package com.xiaomi.fit.fitness.persist.server.data;

import com.google.gson.annotations.SerializedName;
import com.xiaomi.fit.fitness.parser.schema.DailyReportKey;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\b\n\u0002\b$\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B}\u0012\u000e\u0010\u0002\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003\u0012\u000e\u0010\u0005\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0003\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\b\u0012\b\u0010\t\u001a\u0004\u0018\u00010\n\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\n\u0012\u000e\u0010\f\u001a\n\u0012\u0004\u0012\u00020\n\u0018\u00010\u0003\u0012\b\u0010\r\u001a\u0004\u0018\u00010\b\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\b\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\n\u0012\b\u0010\u0010\u001a\u0004\u0018\u00010\n¢\u0006\u0004\b\u0011\u0010\u0012J\u0011\u0010\"\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003HÆ\u0003J\u0011\u0010#\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0003HÆ\u0003J\u0010\u0010$\u001a\u0004\u0018\u00010\bHÆ\u0003¢\u0006\u0002\u0010\u0017J\u0010\u0010%\u001a\u0004\u0018\u00010\nHÆ\u0003¢\u0006\u0002\u0010\u001aJ\u0010\u0010&\u001a\u0004\u0018\u00010\nHÆ\u0003¢\u0006\u0002\u0010\u001aJ\u0011\u0010'\u001a\n\u0012\u0004\u0012\u00020\n\u0018\u00010\u0003HÆ\u0003J\u0010\u0010(\u001a\u0004\u0018\u00010\bHÆ\u0003¢\u0006\u0002\u0010\u0017J\u0010\u0010)\u001a\u0004\u0018\u00010\bHÆ\u0003¢\u0006\u0002\u0010\u0017J\u0010\u0010*\u001a\u0004\u0018\u00010\nHÆ\u0003¢\u0006\u0002\u0010\u001aJ\u0010\u0010+\u001a\u0004\u0018\u00010\nHÆ\u0003¢\u0006\u0002\u0010\u001aJ\u0098\u0001\u0010,\u001a\u00020\u00002\u0010\b\u0002\u0010\u0002\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00032\u0010\b\u0002\u0010\u0005\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u00032\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\b2\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\n2\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\n2\u0010\b\u0002\u0010\f\u001a\n\u0012\u0004\u0012\u00020\n\u0018\u00010\u00032\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\b2\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\b2\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\n2\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\nHÆ\u0001¢\u0006\u0002\u0010-J\u0013\u0010.\u001a\u00020/2\b\u00100\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u00101\u001a\u00020\nHÖ\u0001J\t\u00102\u001a\u000203HÖ\u0001R\u001e\u0010\u0002\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u001e\u0010\u0005\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0014R\u001a\u0010\u0007\u001a\u0004\u0018\u00010\b8\u0006X\u0087\u0004¢\u0006\n\n\u0002\u0010\u0018\u001a\u0004\b\u0016\u0010\u0017R\u001a\u0010\t\u001a\u0004\u0018\u00010\n8\u0006X\u0087\u0004¢\u0006\n\n\u0002\u0010\u001b\u001a\u0004\b\u0019\u0010\u001aR\u001a\u0010\u000b\u001a\u0004\u0018\u00010\n8\u0006X\u0087\u0004¢\u0006\n\n\u0002\u0010\u001b\u001a\u0004\b\u001c\u0010\u001aR\u001e\u0010\f\u001a\n\u0012\u0004\u0012\u00020\n\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\u0014R\u001a\u0010\r\u001a\u0004\u0018\u00010\b8\u0006X\u0087\u0004¢\u0006\n\n\u0002\u0010\u0018\u001a\u0004\b\u001e\u0010\u0017R\u001a\u0010\u000e\u001a\u0004\u0018\u00010\b8\u0006X\u0087\u0004¢\u0006\n\n\u0002\u0010\u0018\u001a\u0004\b\u001f\u0010\u0017R\u001a\u0010\u000f\u001a\u0004\u0018\u00010\n8\u0006X\u0087\u0004¢\u0006\n\n\u0002\u0010\u001b\u001a\u0004\b \u0010\u001aR\u001a\u0010\u0010\u001a\u0004\u0018\u00010\n8\u0006X\u0087\u0004¢\u0006\n\n\u0002\u0010\u001b\u001a\u0004\b!\u0010\u001a¨\u00064"}, d2 = {"Lcom/xiaomi/fit/fitness/persist/server/data/SleepDiaryInfo;", "", "napSituation", "", "Lcom/xiaomi/fit/fitness/persist/server/data/SleepSeverNapSituation;", "medicationBeforeBedtime", "Lcom/xiaomi/fit/fitness/persist/server/data/SleepSeverMedicationDetail;", "preSleepRoutineTime", "", "fallAsleepDuration", "", "awakeCount", "fallAsleepAgainDuration", "morningWakeUpTime", "morningGettingUpTime", "insomniaDifficulty", DailyReportKey.sleepQuality, "<init>", "(Ljava/util/List;Ljava/util/List;Ljava/lang/Long;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/util/List;Ljava/lang/Long;Ljava/lang/Long;Ljava/lang/Integer;Ljava/lang/Integer;)V", "getNapSituation", "()Ljava/util/List;", "getMedicationBeforeBedtime", "getPreSleepRoutineTime", "()Ljava/lang/Long;", "Ljava/lang/Long;", "getFallAsleepDuration", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "getAwakeCount", "getFallAsleepAgainDuration", "getMorningWakeUpTime", "getMorningGettingUpTime", "getInsomniaDifficulty", "getSleepQuality", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "component10", "copy", "(Ljava/util/List;Ljava/util/List;Ljava/lang/Long;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/util/List;Ljava/lang/Long;Ljava/lang/Long;Ljava/lang/Integer;Ljava/lang/Integer;)Lcom/xiaomi/fit/fitness/persist/server/data/SleepDiaryInfo;", "equals", "", "other", "hashCode", "toString", "", "fitness-data-core_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class SleepDiaryInfo {

    @SerializedName("awake_count")
    @Nullable
    private final Integer awakeCount;

    @SerializedName("fall_asleep_duration_after_wake_up")
    @Nullable
    private final List<Integer> fallAsleepAgainDuration;

    @SerializedName("fall_asleep_duration_after_turnning_off_lights")
    @Nullable
    private final Integer fallAsleepDuration;

    @SerializedName("insomnia_difficulty")
    @Nullable
    private final Integer insomniaDifficulty;

    @SerializedName("medication_before_bedtime")
    @Nullable
    private final List<SleepSeverMedicationDetail> medicationBeforeBedtime;

    @SerializedName("morning_getting_up_time")
    @Nullable
    private final Long morningGettingUpTime;

    @SerializedName("morning_wake_up_time")
    @Nullable
    private final Long morningWakeUpTime;

    @SerializedName("nap_situation")
    @Nullable
    private final List<SleepSeverNapSituation> napSituation;

    @SerializedName("pre_sleep_routine_time")
    @Nullable
    private final Long preSleepRoutineTime;

    @SerializedName("sleep_quality")
    @Nullable
    private final Integer sleepQuality;

    public SleepDiaryInfo(@Nullable List<SleepSeverNapSituation> list, @Nullable List<SleepSeverMedicationDetail> list2, @Nullable Long l, @Nullable Integer num, @Nullable Integer num2, @Nullable List<Integer> list3, @Nullable Long l2, @Nullable Long l3, @Nullable Integer num3, @Nullable Integer num4) {
        this.napSituation = list;
        this.medicationBeforeBedtime = list2;
        this.preSleepRoutineTime = l;
        this.fallAsleepDuration = num;
        this.awakeCount = num2;
        this.fallAsleepAgainDuration = list3;
        this.morningWakeUpTime = l2;
        this.morningGettingUpTime = l3;
        this.insomniaDifficulty = num3;
        this.sleepQuality = num4;
    }

    @Nullable
    public final List<SleepSeverNapSituation> component1() {
        return this.napSituation;
    }

    @Nullable
    /* JADX INFO: renamed from: component10, reason: from getter */
    public final Integer getSleepQuality() {
        return this.sleepQuality;
    }

    @Nullable
    public final List<SleepSeverMedicationDetail> component2() {
        return this.medicationBeforeBedtime;
    }

    @Nullable
    /* JADX INFO: renamed from: component3, reason: from getter */
    public final Long getPreSleepRoutineTime() {
        return this.preSleepRoutineTime;
    }

    @Nullable
    /* JADX INFO: renamed from: component4, reason: from getter */
    public final Integer getFallAsleepDuration() {
        return this.fallAsleepDuration;
    }

    @Nullable
    /* JADX INFO: renamed from: component5, reason: from getter */
    public final Integer getAwakeCount() {
        return this.awakeCount;
    }

    @Nullable
    public final List<Integer> component6() {
        return this.fallAsleepAgainDuration;
    }

    @Nullable
    /* JADX INFO: renamed from: component7, reason: from getter */
    public final Long getMorningWakeUpTime() {
        return this.morningWakeUpTime;
    }

    @Nullable
    /* JADX INFO: renamed from: component8, reason: from getter */
    public final Long getMorningGettingUpTime() {
        return this.morningGettingUpTime;
    }

    @Nullable
    /* JADX INFO: renamed from: component9, reason: from getter */
    public final Integer getInsomniaDifficulty() {
        return this.insomniaDifficulty;
    }

    @NotNull
    public final SleepDiaryInfo copy(@Nullable List<SleepSeverNapSituation> napSituation, @Nullable List<SleepSeverMedicationDetail> medicationBeforeBedtime, @Nullable Long preSleepRoutineTime, @Nullable Integer fallAsleepDuration, @Nullable Integer awakeCount, @Nullable List<Integer> fallAsleepAgainDuration, @Nullable Long morningWakeUpTime, @Nullable Long morningGettingUpTime, @Nullable Integer insomniaDifficulty, @Nullable Integer sleepQuality) {
        return new SleepDiaryInfo(napSituation, medicationBeforeBedtime, preSleepRoutineTime, fallAsleepDuration, awakeCount, fallAsleepAgainDuration, morningWakeUpTime, morningGettingUpTime, insomniaDifficulty, sleepQuality);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof SleepDiaryInfo)) {
            return false;
        }
        SleepDiaryInfo sleepDiaryInfo = (SleepDiaryInfo) other;
        return Intrinsics.areEqual(this.napSituation, sleepDiaryInfo.napSituation) && Intrinsics.areEqual(this.medicationBeforeBedtime, sleepDiaryInfo.medicationBeforeBedtime) && Intrinsics.areEqual(this.preSleepRoutineTime, sleepDiaryInfo.preSleepRoutineTime) && Intrinsics.areEqual(this.fallAsleepDuration, sleepDiaryInfo.fallAsleepDuration) && Intrinsics.areEqual(this.awakeCount, sleepDiaryInfo.awakeCount) && Intrinsics.areEqual(this.fallAsleepAgainDuration, sleepDiaryInfo.fallAsleepAgainDuration) && Intrinsics.areEqual(this.morningWakeUpTime, sleepDiaryInfo.morningWakeUpTime) && Intrinsics.areEqual(this.morningGettingUpTime, sleepDiaryInfo.morningGettingUpTime) && Intrinsics.areEqual(this.insomniaDifficulty, sleepDiaryInfo.insomniaDifficulty) && Intrinsics.areEqual(this.sleepQuality, sleepDiaryInfo.sleepQuality);
    }

    @Nullable
    public final Integer getAwakeCount() {
        return this.awakeCount;
    }

    @Nullable
    public final List<Integer> getFallAsleepAgainDuration() {
        return this.fallAsleepAgainDuration;
    }

    @Nullable
    public final Integer getFallAsleepDuration() {
        return this.fallAsleepDuration;
    }

    @Nullable
    public final Integer getInsomniaDifficulty() {
        return this.insomniaDifficulty;
    }

    @Nullable
    public final List<SleepSeverMedicationDetail> getMedicationBeforeBedtime() {
        return this.medicationBeforeBedtime;
    }

    @Nullable
    public final Long getMorningGettingUpTime() {
        return this.morningGettingUpTime;
    }

    @Nullable
    public final Long getMorningWakeUpTime() {
        return this.morningWakeUpTime;
    }

    @Nullable
    public final List<SleepSeverNapSituation> getNapSituation() {
        return this.napSituation;
    }

    @Nullable
    public final Long getPreSleepRoutineTime() {
        return this.preSleepRoutineTime;
    }

    @Nullable
    public final Integer getSleepQuality() {
        return this.sleepQuality;
    }

    public int hashCode() {
        List<SleepSeverNapSituation> list = this.napSituation;
        int iHashCode = (list == null ? 0 : list.hashCode()) * 31;
        List<SleepSeverMedicationDetail> list2 = this.medicationBeforeBedtime;
        int iHashCode2 = (iHashCode + (list2 == null ? 0 : list2.hashCode())) * 31;
        Long l = this.preSleepRoutineTime;
        int iHashCode3 = (iHashCode2 + (l == null ? 0 : l.hashCode())) * 31;
        Integer num = this.fallAsleepDuration;
        int iHashCode4 = (iHashCode3 + (num == null ? 0 : num.hashCode())) * 31;
        Integer num2 = this.awakeCount;
        int iHashCode5 = (iHashCode4 + (num2 == null ? 0 : num2.hashCode())) * 31;
        List<Integer> list3 = this.fallAsleepAgainDuration;
        int iHashCode6 = (iHashCode5 + (list3 == null ? 0 : list3.hashCode())) * 31;
        Long l2 = this.morningWakeUpTime;
        int iHashCode7 = (iHashCode6 + (l2 == null ? 0 : l2.hashCode())) * 31;
        Long l3 = this.morningGettingUpTime;
        int iHashCode8 = (iHashCode7 + (l3 == null ? 0 : l3.hashCode())) * 31;
        Integer num3 = this.insomniaDifficulty;
        int iHashCode9 = (iHashCode8 + (num3 == null ? 0 : num3.hashCode())) * 31;
        Integer num4 = this.sleepQuality;
        return iHashCode9 + (num4 != null ? num4.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        return "SleepDiaryInfo(napSituation=" + this.napSituation + ", medicationBeforeBedtime=" + this.medicationBeforeBedtime + ", preSleepRoutineTime=" + this.preSleepRoutineTime + ", fallAsleepDuration=" + this.fallAsleepDuration + ", awakeCount=" + this.awakeCount + ", fallAsleepAgainDuration=" + this.fallAsleepAgainDuration + ", morningWakeUpTime=" + this.morningWakeUpTime + ", morningGettingUpTime=" + this.morningGettingUpTime + ", insomniaDifficulty=" + this.insomniaDifficulty + ", sleepQuality=" + this.sleepQuality + ")";
    }
}
