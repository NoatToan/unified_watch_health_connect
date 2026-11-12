package com.xiaomi.fit.fitness.export.data.project;

import com.xiaomi.fit.fitness.export.data.ITimeData;
import com.xiaomi.fit.fitness.parser.schema.DailyReportKey;
import java.io.Serializable;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\f\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u001f\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0005\b\u0086\b\u0018\u00002\u00020\u00012\u00020\u0002B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0004\b\u0005\u0010\u0006J\b\u0010C\u001a\u00020\u0004H\u0016J\u0010\u0010D\u001a\u00020E2\u0006\u0010\u0003\u001a\u00020\u0004H\u0016J\u0013\u0010F\u001a\u00020G2\b\u0010H\u001a\u0004\u0018\u00010IH\u0096\u0002J\t\u0010J\u001a\u00020\u0004HÆ\u0003J\u0013\u0010K\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0004HÆ\u0001J\t\u0010L\u001a\u00020\u0011HÖ\u0001J\t\u0010M\u001a\u00020\u0018HÖ\u0001R\u001a\u0010\u0003\u001a\u00020\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0007\u0010\b\"\u0004\b\t\u0010\u0006R\u001e\u0010\n\u001a\u0004\u0018\u00010\u0004X\u0086\u000e¢\u0006\u0010\n\u0002\u0010\u000f\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000eR\u001e\u0010\u0010\u001a\u0004\u0018\u00010\u0011X\u0086\u000e¢\u0006\u0010\n\u0002\u0010\u0016\u001a\u0004\b\u0012\u0010\u0013\"\u0004\b\u0014\u0010\u0015R\u001c\u0010\u0017\u001a\u0004\u0018\u00010\u0018X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0019\u0010\u001a\"\u0004\b\u001b\u0010\u001cR\"\u0010\u001d\u001a\n\u0012\u0004\u0012\u00020\u001f\u0018\u00010\u001eX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b \u0010!\"\u0004\b\"\u0010#R\"\u0010$\u001a\n\u0012\u0004\u0012\u00020%\u0018\u00010\u001eX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b&\u0010!\"\u0004\b'\u0010#R\u001e\u0010(\u001a\u0004\u0018\u00010\u0004X\u0086\u000e¢\u0006\u0010\n\u0002\u0010\u000f\u001a\u0004\b)\u0010\f\"\u0004\b*\u0010\u000eR\u001e\u0010+\u001a\u0004\u0018\u00010\u0011X\u0086\u000e¢\u0006\u0010\n\u0002\u0010\u0016\u001a\u0004\b,\u0010\u0013\"\u0004\b-\u0010\u0015R\u001e\u0010.\u001a\u0004\u0018\u00010\u0011X\u0086\u000e¢\u0006\u0010\n\u0002\u0010\u0016\u001a\u0004\b/\u0010\u0013\"\u0004\b0\u0010\u0015R\"\u00101\u001a\n\u0012\u0004\u0012\u00020\u0011\u0018\u00010\u001eX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b2\u0010!\"\u0004\b3\u0010#R\u001e\u00104\u001a\u0004\u0018\u00010\u0004X\u0086\u000e¢\u0006\u0010\n\u0002\u0010\u000f\u001a\u0004\b5\u0010\f\"\u0004\b6\u0010\u000eR\u001e\u00107\u001a\u0004\u0018\u00010\u0004X\u0086\u000e¢\u0006\u0010\n\u0002\u0010\u000f\u001a\u0004\b8\u0010\f\"\u0004\b9\u0010\u000eR\u001e\u0010:\u001a\u0004\u0018\u00010\u0011X\u0086\u000e¢\u0006\u0010\n\u0002\u0010\u0016\u001a\u0004\b;\u0010\u0013\"\u0004\b<\u0010\u0015R\u001e\u0010=\u001a\u0004\u0018\u00010\u0011X\u0086\u000e¢\u0006\u0010\n\u0002\u0010\u0016\u001a\u0004\b>\u0010\u0013\"\u0004\b?\u0010\u0015R\"\u0010@\u001a\n\u0012\u0004\u0012\u00020%\u0018\u00010\u001eX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bA\u0010!\"\u0004\bB\u0010#¨\u0006N"}, d2 = {"Lcom/xiaomi/fit/fitness/export/data/project/SleepDiaryReport;", "Lcom/xiaomi/fit/fitness/export/data/ITimeData;", "Ljava/io/Serializable;", "time", "", "<init>", "(J)V", "getTime", "()J", "setTime", "dbTime", "getDbTime", "()Ljava/lang/Long;", "setDbTime", "(Ljava/lang/Long;)V", "Ljava/lang/Long;", "dbZoneOffset", "", "getDbZoneOffset", "()Ljava/lang/Integer;", "setDbZoneOffset", "(Ljava/lang/Integer;)V", "Ljava/lang/Integer;", "sid", "", "getSid", "()Ljava/lang/String;", "setSid", "(Ljava/lang/String;)V", "napSituation", "", "Lcom/xiaomi/fit/fitness/export/data/project/SleepNapSituation;", "getNapSituation", "()Ljava/util/List;", "setNapSituation", "(Ljava/util/List;)V", "medicationBeforeBedtime", "Lcom/xiaomi/fit/fitness/export/data/project/SleepMedicationDetail;", "getMedicationBeforeBedtime", "setMedicationBeforeBedtime", "preSleepRoutineTime", "getPreSleepRoutineTime", "setPreSleepRoutineTime", "fallAsleepDuration", "getFallAsleepDuration", "setFallAsleepDuration", "awakeCount", "getAwakeCount", "setAwakeCount", "fallAsleepAgainDuration", "getFallAsleepAgainDuration", "setFallAsleepAgainDuration", "morningWakeUpTime", "getMorningWakeUpTime", "setMorningWakeUpTime", "morningGettingUpTime", "getMorningGettingUpTime", "setMorningGettingUpTime", "insomniaDifficulty", "getInsomniaDifficulty", "setInsomniaDifficulty", DailyReportKey.sleepQuality, "getSleepQuality", "setSleepQuality", "lastMedicationBeforeBedtime", "getLastMedicationBeforeBedtime", "setLastMedicationBeforeBedtime", "getTimestamp", "setTimestamp", "", "equals", "", "other", "", "component1", "copy", "hashCode", "toString", "fitness-data-export_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class SleepDiaryReport implements ITimeData, Serializable {

    @Nullable
    private Integer awakeCount;

    @Nullable
    private Long dbTime;

    @Nullable
    private Integer dbZoneOffset;

    @Nullable
    private List<Integer> fallAsleepAgainDuration;

    @Nullable
    private Integer fallAsleepDuration;

    @Nullable
    private Integer insomniaDifficulty;

    @Nullable
    private List<SleepMedicationDetail> lastMedicationBeforeBedtime;

    @Nullable
    private List<SleepMedicationDetail> medicationBeforeBedtime;

    @Nullable
    private Long morningGettingUpTime;

    @Nullable
    private Long morningWakeUpTime;

    @Nullable
    private List<SleepNapSituation> napSituation;

    @Nullable
    private Long preSleepRoutineTime;

    @Nullable
    private String sid;

    @Nullable
    private Integer sleepQuality;
    private long time;

    public SleepDiaryReport(long j) {
        this.time = j;
    }

    public static /* synthetic */ SleepDiaryReport copy$default(SleepDiaryReport sleepDiaryReport, long j, int i, Object obj) {
        if ((i & 1) != 0) {
            j = sleepDiaryReport.time;
        }
        return sleepDiaryReport.copy(j);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final long getTime() {
        return this.time;
    }

    @NotNull
    public final SleepDiaryReport copy(long time) {
        return new SleepDiaryReport(time);
    }

    public boolean equals(@Nullable Object other) {
        if (other == null || !(other instanceof SleepDiaryReport)) {
            return false;
        }
        if (this == other) {
            return true;
        }
        return Intrinsics.areEqual(this.dbTime, ((SleepDiaryReport) other).dbTime);
    }

    @Nullable
    public final Integer getAwakeCount() {
        return this.awakeCount;
    }

    @Nullable
    public final Long getDbTime() {
        return this.dbTime;
    }

    @Nullable
    public final Integer getDbZoneOffset() {
        return this.dbZoneOffset;
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
    public final List<SleepMedicationDetail> getLastMedicationBeforeBedtime() {
        return this.lastMedicationBeforeBedtime;
    }

    @Nullable
    public final List<SleepMedicationDetail> getMedicationBeforeBedtime() {
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
    public final List<SleepNapSituation> getNapSituation() {
        return this.napSituation;
    }

    @Nullable
    public final Long getPreSleepRoutineTime() {
        return this.preSleepRoutineTime;
    }

    @Nullable
    public final String getSid() {
        return this.sid;
    }

    @Nullable
    public final Integer getSleepQuality() {
        return this.sleepQuality;
    }

    public final long getTime() {
        return this.time;
    }

    @Override // com.xiaomi.fit.fitness.export.data.ITimeData
    public long getTimestamp() {
        return this.time;
    }

    public int hashCode() {
        return Long.hashCode(this.time);
    }

    public final void setAwakeCount(@Nullable Integer num) {
        this.awakeCount = num;
    }

    public final void setDbTime(@Nullable Long l) {
        this.dbTime = l;
    }

    public final void setDbZoneOffset(@Nullable Integer num) {
        this.dbZoneOffset = num;
    }

    public final void setFallAsleepAgainDuration(@Nullable List<Integer> list) {
        this.fallAsleepAgainDuration = list;
    }

    public final void setFallAsleepDuration(@Nullable Integer num) {
        this.fallAsleepDuration = num;
    }

    public final void setInsomniaDifficulty(@Nullable Integer num) {
        this.insomniaDifficulty = num;
    }

    public final void setLastMedicationBeforeBedtime(@Nullable List<SleepMedicationDetail> list) {
        this.lastMedicationBeforeBedtime = list;
    }

    public final void setMedicationBeforeBedtime(@Nullable List<SleepMedicationDetail> list) {
        this.medicationBeforeBedtime = list;
    }

    public final void setMorningGettingUpTime(@Nullable Long l) {
        this.morningGettingUpTime = l;
    }

    public final void setMorningWakeUpTime(@Nullable Long l) {
        this.morningWakeUpTime = l;
    }

    public final void setNapSituation(@Nullable List<SleepNapSituation> list) {
        this.napSituation = list;
    }

    public final void setPreSleepRoutineTime(@Nullable Long l) {
        this.preSleepRoutineTime = l;
    }

    public final void setSid(@Nullable String str) {
        this.sid = str;
    }

    public final void setSleepQuality(@Nullable Integer num) {
        this.sleepQuality = num;
    }

    public final void setTime(long j) {
        this.time = j;
    }

    @Override // com.xiaomi.fit.fitness.export.data.ITimeData
    public void setTimestamp(long time) {
        this.time = time;
    }

    @NotNull
    public String toString() {
        return "SleepDiaryReport(time=" + this.time + ")";
    }
}
