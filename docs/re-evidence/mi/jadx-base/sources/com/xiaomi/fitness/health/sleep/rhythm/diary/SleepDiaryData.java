package com.xiaomi.fitness.health.sleep.rhythm.diary;

import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\t\n\u0002\b\u0004\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u001a\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001Ba\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0003\u0012\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\b\u0012\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u000b0\b\u0012\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\r0\b\u0012\u0006\u0010\u000e\u001a\u00020\u000f\u0012\u0006\u0010\u0010\u001a\u00020\u000f¢\u0006\u0004\b\u0011\u0010\u0012J\t\u0010\u001f\u001a\u00020\u0003HÆ\u0003J\t\u0010 \u001a\u00020\u0003HÆ\u0003J\t\u0010!\u001a\u00020\u0003HÆ\u0003J\t\u0010\"\u001a\u00020\u0003HÆ\u0003J\u000f\u0010#\u001a\b\u0012\u0004\u0012\u00020\t0\bHÆ\u0003J\u000f\u0010$\u001a\b\u0012\u0004\u0012\u00020\u000b0\bHÆ\u0003J\u000f\u0010%\u001a\b\u0012\u0004\u0012\u00020\r0\bHÆ\u0003J\t\u0010&\u001a\u00020\u000fHÆ\u0003J\t\u0010'\u001a\u00020\u000fHÆ\u0003Ju\u0010(\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00032\u000e\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\b2\u000e\b\u0002\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u000b0\b2\u000e\b\u0002\u0010\f\u001a\b\u0012\u0004\u0012\u00020\r0\b2\b\b\u0002\u0010\u000e\u001a\u00020\u000f2\b\b\u0002\u0010\u0010\u001a\u00020\u000fHÆ\u0001J\u0013\u0010)\u001a\u00020*2\b\u0010+\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010,\u001a\u00020\u000fHÖ\u0001J\t\u0010-\u001a\u00020.HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0014R\u0011\u0010\u0005\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0014R\u0011\u0010\u0006\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0014R\u0017\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\b¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0019R\u0017\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u000b0\b¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u0019R\u0017\u0010\f\u001a\b\u0012\u0004\u0012\u00020\r0\b¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u0019R\u0011\u0010\u000e\u001a\u00020\u000f¢\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u001dR\u0011\u0010\u0010\u001a\u00020\u000f¢\u0006\b\n\u0000\u001a\u0004\b\u001e\u0010\u001d¨\u0006/"}, d2 = {"Lcom/xiaomi/fitness/health/sleep/rhythm/diary/SleepDiaryData;", "", "readySleepTime", "", "toSleepTime", "dayWakeUpTime", "dayGetUpTime", "medicationBeforeSleepList", "", "Lcom/xiaomi/fitness/health/sleep/rhythm/diary/MedicationBeforeSleep;", "wakeUpTimeInNightList", "Lcom/xiaomi/fitness/health/sleep/rhythm/diary/WakeUpTimeInNight;", "sleepInDayList", "Lcom/xiaomi/fitness/health/sleep/rhythm/diary/SleepInDayTime;", "sleepDifficulty", "", "sleepFeeling", "<init>", "(JJJJLjava/util/List;Ljava/util/List;Ljava/util/List;II)V", "getReadySleepTime", "()J", "getToSleepTime", "getDayWakeUpTime", "getDayGetUpTime", "getMedicationBeforeSleepList", "()Ljava/util/List;", "getWakeUpTimeInNightList", "getSleepInDayList", "getSleepDifficulty", "()I", "getSleepFeeling", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "copy", "equals", "", "other", "hashCode", "toString", "", "health_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class SleepDiaryData {
    private final long dayGetUpTime;
    private final long dayWakeUpTime;

    @NotNull
    private final List<MedicationBeforeSleep> medicationBeforeSleepList;
    private final long readySleepTime;
    private final int sleepDifficulty;
    private final int sleepFeeling;

    @NotNull
    private final List<SleepInDayTime> sleepInDayList;
    private final long toSleepTime;

    @NotNull
    private final List<WakeUpTimeInNight> wakeUpTimeInNightList;

    public SleepDiaryData(long j, long j2, long j3, long j4, @NotNull List<MedicationBeforeSleep> medicationBeforeSleepList, @NotNull List<WakeUpTimeInNight> wakeUpTimeInNightList, @NotNull List<SleepInDayTime> sleepInDayList, int i, int i2) {
        Intrinsics.checkNotNullParameter(medicationBeforeSleepList, "medicationBeforeSleepList");
        Intrinsics.checkNotNullParameter(wakeUpTimeInNightList, "wakeUpTimeInNightList");
        Intrinsics.checkNotNullParameter(sleepInDayList, "sleepInDayList");
        this.readySleepTime = j;
        this.toSleepTime = j2;
        this.dayWakeUpTime = j3;
        this.dayGetUpTime = j4;
        this.medicationBeforeSleepList = medicationBeforeSleepList;
        this.wakeUpTimeInNightList = wakeUpTimeInNightList;
        this.sleepInDayList = sleepInDayList;
        this.sleepDifficulty = i;
        this.sleepFeeling = i2;
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final long getReadySleepTime() {
        return this.readySleepTime;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final long getToSleepTime() {
        return this.toSleepTime;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final long getDayWakeUpTime() {
        return this.dayWakeUpTime;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final long getDayGetUpTime() {
        return this.dayGetUpTime;
    }

    @NotNull
    public final List<MedicationBeforeSleep> component5() {
        return this.medicationBeforeSleepList;
    }

    @NotNull
    public final List<WakeUpTimeInNight> component6() {
        return this.wakeUpTimeInNightList;
    }

    @NotNull
    public final List<SleepInDayTime> component7() {
        return this.sleepInDayList;
    }

    /* JADX INFO: renamed from: component8, reason: from getter */
    public final int getSleepDifficulty() {
        return this.sleepDifficulty;
    }

    /* JADX INFO: renamed from: component9, reason: from getter */
    public final int getSleepFeeling() {
        return this.sleepFeeling;
    }

    @NotNull
    public final SleepDiaryData copy(long readySleepTime, long toSleepTime, long dayWakeUpTime, long dayGetUpTime, @NotNull List<MedicationBeforeSleep> medicationBeforeSleepList, @NotNull List<WakeUpTimeInNight> wakeUpTimeInNightList, @NotNull List<SleepInDayTime> sleepInDayList, int sleepDifficulty, int sleepFeeling) {
        Intrinsics.checkNotNullParameter(medicationBeforeSleepList, "medicationBeforeSleepList");
        Intrinsics.checkNotNullParameter(wakeUpTimeInNightList, "wakeUpTimeInNightList");
        Intrinsics.checkNotNullParameter(sleepInDayList, "sleepInDayList");
        return new SleepDiaryData(readySleepTime, toSleepTime, dayWakeUpTime, dayGetUpTime, medicationBeforeSleepList, wakeUpTimeInNightList, sleepInDayList, sleepDifficulty, sleepFeeling);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof SleepDiaryData)) {
            return false;
        }
        SleepDiaryData sleepDiaryData = (SleepDiaryData) other;
        return this.readySleepTime == sleepDiaryData.readySleepTime && this.toSleepTime == sleepDiaryData.toSleepTime && this.dayWakeUpTime == sleepDiaryData.dayWakeUpTime && this.dayGetUpTime == sleepDiaryData.dayGetUpTime && Intrinsics.areEqual(this.medicationBeforeSleepList, sleepDiaryData.medicationBeforeSleepList) && Intrinsics.areEqual(this.wakeUpTimeInNightList, sleepDiaryData.wakeUpTimeInNightList) && Intrinsics.areEqual(this.sleepInDayList, sleepDiaryData.sleepInDayList) && this.sleepDifficulty == sleepDiaryData.sleepDifficulty && this.sleepFeeling == sleepDiaryData.sleepFeeling;
    }

    public final long getDayGetUpTime() {
        return this.dayGetUpTime;
    }

    public final long getDayWakeUpTime() {
        return this.dayWakeUpTime;
    }

    @NotNull
    public final List<MedicationBeforeSleep> getMedicationBeforeSleepList() {
        return this.medicationBeforeSleepList;
    }

    public final long getReadySleepTime() {
        return this.readySleepTime;
    }

    public final int getSleepDifficulty() {
        return this.sleepDifficulty;
    }

    public final int getSleepFeeling() {
        return this.sleepFeeling;
    }

    @NotNull
    public final List<SleepInDayTime> getSleepInDayList() {
        return this.sleepInDayList;
    }

    public final long getToSleepTime() {
        return this.toSleepTime;
    }

    @NotNull
    public final List<WakeUpTimeInNight> getWakeUpTimeInNightList() {
        return this.wakeUpTimeInNightList;
    }

    public int hashCode() {
        return (((((((((((((((Long.hashCode(this.readySleepTime) * 31) + Long.hashCode(this.toSleepTime)) * 31) + Long.hashCode(this.dayWakeUpTime)) * 31) + Long.hashCode(this.dayGetUpTime)) * 31) + this.medicationBeforeSleepList.hashCode()) * 31) + this.wakeUpTimeInNightList.hashCode()) * 31) + this.sleepInDayList.hashCode()) * 31) + Integer.hashCode(this.sleepDifficulty)) * 31) + Integer.hashCode(this.sleepFeeling);
    }

    @NotNull
    public String toString() {
        return "SleepDiaryData(readySleepTime=" + this.readySleepTime + ", toSleepTime=" + this.toSleepTime + ", dayWakeUpTime=" + this.dayWakeUpTime + ", dayGetUpTime=" + this.dayGetUpTime + ", medicationBeforeSleepList=" + this.medicationBeforeSleepList + ", wakeUpTimeInNightList=" + this.wakeUpTimeInNightList + ", sleepInDayList=" + this.sleepInDayList + ", sleepDifficulty=" + this.sleepDifficulty + ", sleepFeeling=" + this.sleepFeeling + ")";
    }
}
