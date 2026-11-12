package com.xiaomi.fitness.health.sleep.interfere.net;

import com.google.gson.annotations.SerializedName;
import com.xiaomi.fit.fitness.parser.schema.FitnessReportKey;
import com.xiaomi.fitness.chart.util.ChartUtil;
import com.xiaomi.fitness.watch.face.edit.entity.DialWidgetType;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0016\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\n\b\u0086\b\u0018\u00002\u00020\u0001:\t*+,-./012BC\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\b\u001a\u0004\u0018\u00010\t\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u000b\u0012\b\u0010\f\u001a\u0004\u0018\u00010\r¢\u0006\u0004\b\u000e\u0010\u000fJ\u000b\u0010\u001c\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u001d\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010\u001e\u001a\u0004\u0018\u00010\u0007HÆ\u0003J\u000b\u0010\u001f\u001a\u0004\u0018\u00010\tHÆ\u0003J\u000b\u0010 \u001a\u0004\u0018\u00010\u000bHÆ\u0003J\u000b\u0010!\u001a\u0004\u0018\u00010\rHÆ\u0003JQ\u0010\"\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\t2\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u000b2\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\rHÆ\u0001J\u0013\u0010#\u001a\u00020$2\b\u0010%\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010&\u001a\u00020'HÖ\u0001J\t\u0010(\u001a\u00020)HÖ\u0001R\u0018\u0010\u0002\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0018\u0010\u0004\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R\u0018\u0010\u0006\u001a\u0004\u0018\u00010\u00078\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015R\u0018\u0010\b\u001a\u0004\u0018\u00010\t8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0017R\u0018\u0010\n\u001a\u0004\u0018\u00010\u000b8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0019R\u0018\u0010\f\u001a\u0004\u0018\u00010\r8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u001b¨\u00063"}, d2 = {"Lcom/xiaomi/fitness/health/sleep/interfere/net/SleepData;", "", "bedtime", "Lcom/xiaomi/fitness/health/sleep/interfere/net/SleepData$Bedtime;", "wakeUpTime", "Lcom/xiaomi/fitness/health/sleep/interfere/net/SleepData$WakeUpTime;", "nightSleepDuration", "Lcom/xiaomi/fitness/health/sleep/interfere/net/SleepData$NightSleepDuration;", "nightAwakeCount", "Lcom/xiaomi/fitness/health/sleep/interfere/net/SleepData$NightAwakeCount;", "daytimeSleepCount", "Lcom/xiaomi/fitness/health/sleep/interfere/net/SleepData$DaytimeSleepCount;", "daytimeSleepDuration", "Lcom/xiaomi/fitness/health/sleep/interfere/net/SleepData$DaytimeSleepDuration;", "<init>", "(Lcom/xiaomi/fitness/health/sleep/interfere/net/SleepData$Bedtime;Lcom/xiaomi/fitness/health/sleep/interfere/net/SleepData$WakeUpTime;Lcom/xiaomi/fitness/health/sleep/interfere/net/SleepData$NightSleepDuration;Lcom/xiaomi/fitness/health/sleep/interfere/net/SleepData$NightAwakeCount;Lcom/xiaomi/fitness/health/sleep/interfere/net/SleepData$DaytimeSleepCount;Lcom/xiaomi/fitness/health/sleep/interfere/net/SleepData$DaytimeSleepDuration;)V", "getBedtime", "()Lcom/xiaomi/fitness/health/sleep/interfere/net/SleepData$Bedtime;", "getWakeUpTime", "()Lcom/xiaomi/fitness/health/sleep/interfere/net/SleepData$WakeUpTime;", "getNightSleepDuration", "()Lcom/xiaomi/fitness/health/sleep/interfere/net/SleepData$NightSleepDuration;", "getNightAwakeCount", "()Lcom/xiaomi/fitness/health/sleep/interfere/net/SleepData$NightAwakeCount;", "getDaytimeSleepCount", "()Lcom/xiaomi/fitness/health/sleep/interfere/net/SleepData$DaytimeSleepCount;", "getDaytimeSleepDuration", "()Lcom/xiaomi/fitness/health/sleep/interfere/net/SleepData$DaytimeSleepDuration;", "component1", "component2", "component3", "component4", "component5", "component6", "copy", "equals", "", "other", "hashCode", "", "toString", "", "Bedtime", "WakeUpTime", "DailyRecords", "NightSleepDuration", "NightAwakeCount", "DaytimeSleepCount", "CountDaily", "DaytimeSleepDuration", "DailyNapRecord", "health_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class SleepData {

    @SerializedName("bedtime")
    @Nullable
    private final Bedtime bedtime;

    @SerializedName("daytimeSleepCount")
    @Nullable
    private final DaytimeSleepCount daytimeSleepCount;

    @SerializedName("daytimeSleepDuration")
    @Nullable
    private final DaytimeSleepDuration daytimeSleepDuration;

    @SerializedName("nightAwakeCount")
    @Nullable
    private final NightAwakeCount nightAwakeCount;

    @SerializedName("nightSleepDuration")
    @Nullable
    private final NightSleepDuration nightSleepDuration;

    @SerializedName("wakeUpTime")
    @Nullable
    private final WakeUpTime wakeUpTime;

    @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0014\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B1\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0003\u0012\u000e\u0010\u0007\u001a\n\u0012\u0004\u0012\u00020\t\u0018\u00010\b¢\u0006\u0004\b\n\u0010\u000bJ\t\u0010\u0014\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0015\u001a\u00020\u0005HÆ\u0003J\u0010\u0010\u0016\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010\u0010J\u0011\u0010\u0017\u001a\n\u0012\u0004\u0012\u00020\t\u0018\u00010\bHÆ\u0003J@\u0010\u0018\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00032\u0010\b\u0002\u0010\u0007\u001a\n\u0012\u0004\u0012\u00020\t\u0018\u00010\bHÆ\u0001¢\u0006\u0002\u0010\u0019J\u0013\u0010\u001a\u001a\u00020\u00052\b\u0010\u001b\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001c\u001a\u00020\u0003HÖ\u0001J\t\u0010\u001d\u001a\u00020\u001eHÖ\u0001R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0016\u0010\u0004\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0004\u0010\u000eR\u001a\u0010\u0006\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\n\n\u0002\u0010\u0011\u001a\u0004\b\u000f\u0010\u0010R\u001e\u0010\u0007\u001a\n\u0012\u0004\u0012\u00020\t\u0018\u00010\b8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013¨\u0006\u001f"}, d2 = {"Lcom/xiaomi/fitness/health/sleep/interfere/net/SleepData$Bedtime;", "", "averageMinutes", "", "isRegular", "", "diffMinutes", "dailyRecords", "", "Lcom/xiaomi/fitness/health/sleep/interfere/net/SleepData$DailyRecords;", "<init>", "(IZLjava/lang/Integer;Ljava/util/List;)V", "getAverageMinutes", "()I", "()Z", "getDiffMinutes", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "getDailyRecords", "()Ljava/util/List;", "component1", "component2", "component3", "component4", "copy", "(IZLjava/lang/Integer;Ljava/util/List;)Lcom/xiaomi/fitness/health/sleep/interfere/net/SleepData$Bedtime;", "equals", "other", "hashCode", "toString", "", "health_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class Bedtime {

        @SerializedName("avg")
        private final int averageMinutes;

        @SerializedName("daily")
        @Nullable
        private final List<DailyRecords> dailyRecords;

        @SerializedName("diffMinutes")
        @Nullable
        private final Integer diffMinutes;

        @SerializedName("isRegular")
        private final boolean isRegular;

        public Bedtime(int i, boolean z, @Nullable Integer num, @Nullable List<DailyRecords> list) {
            this.averageMinutes = i;
            this.isRegular = z;
            this.diffMinutes = num;
            this.dailyRecords = list;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ Bedtime copy$default(Bedtime bedtime, int i, boolean z, Integer num, List list, int i2, Object obj) {
            if ((i2 & 1) != 0) {
                i = bedtime.averageMinutes;
            }
            if ((i2 & 2) != 0) {
                z = bedtime.isRegular;
            }
            if ((i2 & 4) != 0) {
                num = bedtime.diffMinutes;
            }
            if ((i2 & 8) != 0) {
                list = bedtime.dailyRecords;
            }
            return bedtime.copy(i, z, num, list);
        }

        /* JADX INFO: renamed from: component1, reason: from getter */
        public final int getAverageMinutes() {
            return this.averageMinutes;
        }

        /* JADX INFO: renamed from: component2, reason: from getter */
        public final boolean getIsRegular() {
            return this.isRegular;
        }

        @Nullable
        /* JADX INFO: renamed from: component3, reason: from getter */
        public final Integer getDiffMinutes() {
            return this.diffMinutes;
        }

        @Nullable
        public final List<DailyRecords> component4() {
            return this.dailyRecords;
        }

        @NotNull
        public final Bedtime copy(int averageMinutes, boolean isRegular, @Nullable Integer diffMinutes, @Nullable List<DailyRecords> dailyRecords) {
            return new Bedtime(averageMinutes, isRegular, diffMinutes, dailyRecords);
        }

        public boolean equals(@Nullable Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Bedtime)) {
                return false;
            }
            Bedtime bedtime = (Bedtime) other;
            return this.averageMinutes == bedtime.averageMinutes && this.isRegular == bedtime.isRegular && Intrinsics.areEqual(this.diffMinutes, bedtime.diffMinutes) && Intrinsics.areEqual(this.dailyRecords, bedtime.dailyRecords);
        }

        public final int getAverageMinutes() {
            return this.averageMinutes;
        }

        @Nullable
        public final List<DailyRecords> getDailyRecords() {
            return this.dailyRecords;
        }

        @Nullable
        public final Integer getDiffMinutes() {
            return this.diffMinutes;
        }

        public int hashCode() {
            int iHashCode = ((Integer.hashCode(this.averageMinutes) * 31) + Boolean.hashCode(this.isRegular)) * 31;
            Integer num = this.diffMinutes;
            int iHashCode2 = (iHashCode + (num == null ? 0 : num.hashCode())) * 31;
            List<DailyRecords> list = this.dailyRecords;
            return iHashCode2 + (list != null ? list.hashCode() : 0);
        }

        public final boolean isRegular() {
            return this.isRegular;
        }

        @NotNull
        public String toString() {
            return "Bedtime(averageMinutes=" + this.averageMinutes + ", isRegular=" + this.isRegular + ", diffMinutes=" + this.diffMinutes + ", dailyRecords=" + this.dailyRecords + ")";
        }
    }

    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\b\n\u0002\b\f\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\u0019\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\t\u0010\r\u001a\u00020\u0003HÆ\u0003J\u0010\u0010\u000e\u001a\u0004\u0018\u00010\u0005HÆ\u0003¢\u0006\u0002\u0010\u000bJ$\u0010\u000f\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005HÆ\u0001¢\u0006\u0002\u0010\u0010J\u0013\u0010\u0011\u001a\u00020\u00122\b\u0010\u0013\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0014\u001a\u00020\u0005HÖ\u0001J\t\u0010\u0015\u001a\u00020\u0016HÖ\u0001R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u001a\u0010\u0004\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\n\n\u0002\u0010\f\u001a\u0004\b\n\u0010\u000b¨\u0006\u0017"}, d2 = {"Lcom/xiaomi/fitness/health/sleep/interfere/net/SleepData$CountDaily;", "", "dateTimestamp", "", "count", "", "<init>", "(JLjava/lang/Integer;)V", "getDateTimestamp", "()J", "getCount", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "component1", "component2", "copy", "(JLjava/lang/Integer;)Lcom/xiaomi/fitness/health/sleep/interfere/net/SleepData$CountDaily;", "equals", "", "other", "hashCode", "toString", "", "health_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class CountDaily {

        @SerializedName("count")
        @Nullable
        private final Integer count;

        @SerializedName(DialWidgetType.DATE)
        private final long dateTimestamp;

        public CountDaily(long j, @Nullable Integer num) {
            this.dateTimestamp = j;
            this.count = num;
        }

        public static /* synthetic */ CountDaily copy$default(CountDaily countDaily, long j, Integer num, int i, Object obj) {
            if ((i & 1) != 0) {
                j = countDaily.dateTimestamp;
            }
            if ((i & 2) != 0) {
                num = countDaily.count;
            }
            return countDaily.copy(j, num);
        }

        /* JADX INFO: renamed from: component1, reason: from getter */
        public final long getDateTimestamp() {
            return this.dateTimestamp;
        }

        @Nullable
        /* JADX INFO: renamed from: component2, reason: from getter */
        public final Integer getCount() {
            return this.count;
        }

        @NotNull
        public final CountDaily copy(long dateTimestamp, @Nullable Integer count) {
            return new CountDaily(dateTimestamp, count);
        }

        public boolean equals(@Nullable Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof CountDaily)) {
                return false;
            }
            CountDaily countDaily = (CountDaily) other;
            return this.dateTimestamp == countDaily.dateTimestamp && Intrinsics.areEqual(this.count, countDaily.count);
        }

        @Nullable
        public final Integer getCount() {
            return this.count;
        }

        public final long getDateTimestamp() {
            return this.dateTimestamp;
        }

        public int hashCode() {
            int iHashCode = Long.hashCode(this.dateTimestamp) * 31;
            Integer num = this.count;
            return iHashCode + (num == null ? 0 : num.hashCode());
        }

        @NotNull
        public String toString() {
            return "CountDaily(dateTimestamp=" + this.dateTimestamp + ", count=" + this.count + ")";
        }
    }

    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\b\n\u0002\b\f\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\t\u0010\u000e\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000f\u001a\u00020\u0005HÆ\u0003J\u001d\u0010\u0010\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u0011\u001a\u00020\u00122\b\u0010\u0013\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0014\u001a\u00020\u0005HÖ\u0001J\t\u0010\u0015\u001a\u00020\u0016HÖ\u0001R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0016\u0010\u0004\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0011\u0010\f\u001a\u00020\u00058F¢\u0006\u0006\u001a\u0004\b\r\u0010\u000b¨\u0006\u0017"}, d2 = {"Lcom/xiaomi/fitness/health/sleep/interfere/net/SleepData$DailyNapRecord;", "", "dateTimestamp", "", "napMinutes", "", "<init>", "(JI)V", "getDateTimestamp", "()J", "getNapMinutes", "()I", "localDay", "getLocalDay", "component1", "component2", "copy", "equals", "", "other", "hashCode", "toString", "", "health_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class DailyNapRecord {

        @SerializedName(DialWidgetType.DATE)
        private final long dateTimestamp;

        @SerializedName("minutes")
        private final int napMinutes;

        public DailyNapRecord(long j, int i) {
            this.dateTimestamp = j;
            this.napMinutes = i;
        }

        public static /* synthetic */ DailyNapRecord copy$default(DailyNapRecord dailyNapRecord, long j, int i, int i2, Object obj) {
            if ((i2 & 1) != 0) {
                j = dailyNapRecord.dateTimestamp;
            }
            if ((i2 & 2) != 0) {
                i = dailyNapRecord.napMinutes;
            }
            return dailyNapRecord.copy(j, i);
        }

        /* JADX INFO: renamed from: component1, reason: from getter */
        public final long getDateTimestamp() {
            return this.dateTimestamp;
        }

        /* JADX INFO: renamed from: component2, reason: from getter */
        public final int getNapMinutes() {
            return this.napMinutes;
        }

        @NotNull
        public final DailyNapRecord copy(long dateTimestamp, int napMinutes) {
            return new DailyNapRecord(dateTimestamp, napMinutes);
        }

        public boolean equals(@Nullable Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof DailyNapRecord)) {
                return false;
            }
            DailyNapRecord dailyNapRecord = (DailyNapRecord) other;
            return this.dateTimestamp == dailyNapRecord.dateTimestamp && this.napMinutes == dailyNapRecord.napMinutes;
        }

        public final long getDateTimestamp() {
            return this.dateTimestamp;
        }

        public final int getLocalDay() {
            ChartUtil chartUtil = ChartUtil.INSTANCE;
            long j = this.dateTimestamp;
            if (j < 1000000000000L) {
                j *= (long) 1000;
            }
            return (int) ChartUtil.timestampToLocalDay$default(chartUtil, j, null, 2, null);
        }

        public final int getNapMinutes() {
            return this.napMinutes;
        }

        public int hashCode() {
            return (Long.hashCode(this.dateTimestamp) * 31) + Integer.hashCode(this.napMinutes);
        }

        @NotNull
        public String toString() {
            return "DailyNapRecord(dateTimestamp=" + this.dateTimestamp + ", napMinutes=" + this.napMinutes + ")";
        }
    }

    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\t\n\u0002\b\r\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\u0019\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\u0010\u0010\r\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010\nJ$\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003HÆ\u0001¢\u0006\u0002\u0010\u000fJ\u0013\u0010\u0010\u001a\u00020\u00112\b\u0010\u0012\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0013\u001a\u00020\u0014HÖ\u0001J\t\u0010\u0015\u001a\u00020\u0016HÖ\u0001R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u001a\u0010\u0004\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\n\n\u0002\u0010\u000b\u001a\u0004\b\t\u0010\n¨\u0006\u0017"}, d2 = {"Lcom/xiaomi/fitness/health/sleep/interfere/net/SleepData$DailyRecords;", "", "dateTimestamp", "", "timestamp", "<init>", "(JLjava/lang/Long;)V", "getDateTimestamp", "()J", "getTimestamp", "()Ljava/lang/Long;", "Ljava/lang/Long;", "component1", "component2", "copy", "(JLjava/lang/Long;)Lcom/xiaomi/fitness/health/sleep/interfere/net/SleepData$DailyRecords;", "equals", "", "other", "hashCode", "", "toString", "", "health_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class DailyRecords {

        @SerializedName(DialWidgetType.DATE)
        private final long dateTimestamp;

        @SerializedName("time")
        @Nullable
        private final Long timestamp;

        public DailyRecords(long j, @Nullable Long l) {
            this.dateTimestamp = j;
            this.timestamp = l;
        }

        public static /* synthetic */ DailyRecords copy$default(DailyRecords dailyRecords, long j, Long l, int i, Object obj) {
            if ((i & 1) != 0) {
                j = dailyRecords.dateTimestamp;
            }
            if ((i & 2) != 0) {
                l = dailyRecords.timestamp;
            }
            return dailyRecords.copy(j, l);
        }

        /* JADX INFO: renamed from: component1, reason: from getter */
        public final long getDateTimestamp() {
            return this.dateTimestamp;
        }

        @Nullable
        /* JADX INFO: renamed from: component2, reason: from getter */
        public final Long getTimestamp() {
            return this.timestamp;
        }

        @NotNull
        public final DailyRecords copy(long dateTimestamp, @Nullable Long timestamp) {
            return new DailyRecords(dateTimestamp, timestamp);
        }

        public boolean equals(@Nullable Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof DailyRecords)) {
                return false;
            }
            DailyRecords dailyRecords = (DailyRecords) other;
            return this.dateTimestamp == dailyRecords.dateTimestamp && Intrinsics.areEqual(this.timestamp, dailyRecords.timestamp);
        }

        public final long getDateTimestamp() {
            return this.dateTimestamp;
        }

        @Nullable
        public final Long getTimestamp() {
            return this.timestamp;
        }

        public int hashCode() {
            int iHashCode = Long.hashCode(this.dateTimestamp) * 31;
            Long l = this.timestamp;
            return iHashCode + (l == null ? 0 : l.hashCode());
        }

        @NotNull
        public String toString() {
            return "DailyRecords(dateTimestamp=" + this.dateTimestamp + ", timestamp=" + this.timestamp + ")";
        }
    }

    @Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B)\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\u000e\u0010\u0005\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0006¢\u0006\u0004\b\b\u0010\tJ\t\u0010\u0011\u001a\u00020\u0003HÆ\u0003J\u0010\u0010\u0012\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010\rJ\u0011\u0010\u0013\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0006HÆ\u0003J6\u0010\u0014\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\u0010\b\u0002\u0010\u0005\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0006HÆ\u0001¢\u0006\u0002\u0010\u0015J\u0013\u0010\u0016\u001a\u00020\u00172\b\u0010\u0018\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0019\u001a\u00020\u0003HÖ\u0001J\t\u0010\u001a\u001a\u00020\u001bHÖ\u0001R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u001a\u0010\u0004\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\n\n\u0002\u0010\u000e\u001a\u0004\b\f\u0010\rR\u001e\u0010\u0005\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010¨\u0006\u001c"}, d2 = {"Lcom/xiaomi/fitness/health/sleep/interfere/net/SleepData$DaytimeSleepCount;", "", "averageCount", "", "diffCount", "dailyRecords", "", "Lcom/xiaomi/fitness/health/sleep/interfere/net/SleepData$CountDaily;", "<init>", "(ILjava/lang/Integer;Ljava/util/List;)V", "getAverageCount", "()I", "getDiffCount", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "getDailyRecords", "()Ljava/util/List;", "component1", "component2", "component3", "copy", "(ILjava/lang/Integer;Ljava/util/List;)Lcom/xiaomi/fitness/health/sleep/interfere/net/SleepData$DaytimeSleepCount;", "equals", "", "other", "hashCode", "toString", "", "health_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class DaytimeSleepCount {

        @SerializedName("avg")
        private final int averageCount;

        @SerializedName("daily")
        @Nullable
        private final List<CountDaily> dailyRecords;

        @SerializedName("diff")
        @Nullable
        private final Integer diffCount;

        public DaytimeSleepCount(int i, @Nullable Integer num, @Nullable List<CountDaily> list) {
            this.averageCount = i;
            this.diffCount = num;
            this.dailyRecords = list;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ DaytimeSleepCount copy$default(DaytimeSleepCount daytimeSleepCount, int i, Integer num, List list, int i2, Object obj) {
            if ((i2 & 1) != 0) {
                i = daytimeSleepCount.averageCount;
            }
            if ((i2 & 2) != 0) {
                num = daytimeSleepCount.diffCount;
            }
            if ((i2 & 4) != 0) {
                list = daytimeSleepCount.dailyRecords;
            }
            return daytimeSleepCount.copy(i, num, list);
        }

        /* JADX INFO: renamed from: component1, reason: from getter */
        public final int getAverageCount() {
            return this.averageCount;
        }

        @Nullable
        /* JADX INFO: renamed from: component2, reason: from getter */
        public final Integer getDiffCount() {
            return this.diffCount;
        }

        @Nullable
        public final List<CountDaily> component3() {
            return this.dailyRecords;
        }

        @NotNull
        public final DaytimeSleepCount copy(int averageCount, @Nullable Integer diffCount, @Nullable List<CountDaily> dailyRecords) {
            return new DaytimeSleepCount(averageCount, diffCount, dailyRecords);
        }

        public boolean equals(@Nullable Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof DaytimeSleepCount)) {
                return false;
            }
            DaytimeSleepCount daytimeSleepCount = (DaytimeSleepCount) other;
            return this.averageCount == daytimeSleepCount.averageCount && Intrinsics.areEqual(this.diffCount, daytimeSleepCount.diffCount) && Intrinsics.areEqual(this.dailyRecords, daytimeSleepCount.dailyRecords);
        }

        public final int getAverageCount() {
            return this.averageCount;
        }

        @Nullable
        public final List<CountDaily> getDailyRecords() {
            return this.dailyRecords;
        }

        @Nullable
        public final Integer getDiffCount() {
            return this.diffCount;
        }

        public int hashCode() {
            int iHashCode = Integer.hashCode(this.averageCount) * 31;
            Integer num = this.diffCount;
            int iHashCode2 = (iHashCode + (num == null ? 0 : num.hashCode())) * 31;
            List<CountDaily> list = this.dailyRecords;
            return iHashCode2 + (list != null ? list.hashCode() : 0);
        }

        @NotNull
        public String toString() {
            return "DaytimeSleepCount(averageCount=" + this.averageCount + ", diffCount=" + this.diffCount + ", dailyRecords=" + this.dailyRecords + ")";
        }
    }

    @Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B)\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\u000e\u0010\u0005\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0006¢\u0006\u0004\b\b\u0010\tJ\t\u0010\u0011\u001a\u00020\u0003HÆ\u0003J\u0010\u0010\u0012\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010\rJ\u0011\u0010\u0013\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0006HÆ\u0003J6\u0010\u0014\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\u0010\b\u0002\u0010\u0005\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0006HÆ\u0001¢\u0006\u0002\u0010\u0015J\u0013\u0010\u0016\u001a\u00020\u00172\b\u0010\u0018\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0019\u001a\u00020\u0003HÖ\u0001J\t\u0010\u001a\u001a\u00020\u001bHÖ\u0001R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u001a\u0010\u0004\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\n\n\u0002\u0010\u000e\u001a\u0004\b\f\u0010\rR\u001e\u0010\u0005\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010¨\u0006\u001c"}, d2 = {"Lcom/xiaomi/fitness/health/sleep/interfere/net/SleepData$DaytimeSleepDuration;", "", "averageMinutes", "", "diffMinutes", "dailyRecords", "", "Lcom/xiaomi/fitness/health/sleep/interfere/net/SleepData$DailyNapRecord;", "<init>", "(ILjava/lang/Integer;Ljava/util/List;)V", "getAverageMinutes", "()I", "getDiffMinutes", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "getDailyRecords", "()Ljava/util/List;", "component1", "component2", "component3", "copy", "(ILjava/lang/Integer;Ljava/util/List;)Lcom/xiaomi/fitness/health/sleep/interfere/net/SleepData$DaytimeSleepDuration;", "equals", "", "other", "hashCode", "toString", "", "health_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class DaytimeSleepDuration {

        @SerializedName("avg")
        private final int averageMinutes;

        @SerializedName("daily")
        @Nullable
        private final List<DailyNapRecord> dailyRecords;

        @SerializedName("diffMinutes")
        @Nullable
        private final Integer diffMinutes;

        public DaytimeSleepDuration(int i, @Nullable Integer num, @Nullable List<DailyNapRecord> list) {
            this.averageMinutes = i;
            this.diffMinutes = num;
            this.dailyRecords = list;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ DaytimeSleepDuration copy$default(DaytimeSleepDuration daytimeSleepDuration, int i, Integer num, List list, int i2, Object obj) {
            if ((i2 & 1) != 0) {
                i = daytimeSleepDuration.averageMinutes;
            }
            if ((i2 & 2) != 0) {
                num = daytimeSleepDuration.diffMinutes;
            }
            if ((i2 & 4) != 0) {
                list = daytimeSleepDuration.dailyRecords;
            }
            return daytimeSleepDuration.copy(i, num, list);
        }

        /* JADX INFO: renamed from: component1, reason: from getter */
        public final int getAverageMinutes() {
            return this.averageMinutes;
        }

        @Nullable
        /* JADX INFO: renamed from: component2, reason: from getter */
        public final Integer getDiffMinutes() {
            return this.diffMinutes;
        }

        @Nullable
        public final List<DailyNapRecord> component3() {
            return this.dailyRecords;
        }

        @NotNull
        public final DaytimeSleepDuration copy(int averageMinutes, @Nullable Integer diffMinutes, @Nullable List<DailyNapRecord> dailyRecords) {
            return new DaytimeSleepDuration(averageMinutes, diffMinutes, dailyRecords);
        }

        public boolean equals(@Nullable Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof DaytimeSleepDuration)) {
                return false;
            }
            DaytimeSleepDuration daytimeSleepDuration = (DaytimeSleepDuration) other;
            return this.averageMinutes == daytimeSleepDuration.averageMinutes && Intrinsics.areEqual(this.diffMinutes, daytimeSleepDuration.diffMinutes) && Intrinsics.areEqual(this.dailyRecords, daytimeSleepDuration.dailyRecords);
        }

        public final int getAverageMinutes() {
            return this.averageMinutes;
        }

        @Nullable
        public final List<DailyNapRecord> getDailyRecords() {
            return this.dailyRecords;
        }

        @Nullable
        public final Integer getDiffMinutes() {
            return this.diffMinutes;
        }

        public int hashCode() {
            int iHashCode = Integer.hashCode(this.averageMinutes) * 31;
            Integer num = this.diffMinutes;
            int iHashCode2 = (iHashCode + (num == null ? 0 : num.hashCode())) * 31;
            List<DailyNapRecord> list = this.dailyRecords;
            return iHashCode2 + (list != null ? list.hashCode() : 0);
        }

        @NotNull
        public String toString() {
            return "DaytimeSleepDuration(averageMinutes=" + this.averageMinutes + ", diffMinutes=" + this.diffMinutes + ", dailyRecords=" + this.dailyRecords + ")";
        }
    }

    @Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B)\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\u000e\u0010\u0005\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0006¢\u0006\u0004\b\b\u0010\tJ\t\u0010\u0011\u001a\u00020\u0003HÆ\u0003J\u0010\u0010\u0012\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010\rJ\u0011\u0010\u0013\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0006HÆ\u0003J6\u0010\u0014\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\u0010\b\u0002\u0010\u0005\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0006HÆ\u0001¢\u0006\u0002\u0010\u0015J\u0013\u0010\u0016\u001a\u00020\u00172\b\u0010\u0018\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0019\u001a\u00020\u0003HÖ\u0001J\t\u0010\u001a\u001a\u00020\u001bHÖ\u0001R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u001a\u0010\u0004\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\n\n\u0002\u0010\u000e\u001a\u0004\b\f\u0010\rR\u001e\u0010\u0005\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010¨\u0006\u001c"}, d2 = {"Lcom/xiaomi/fitness/health/sleep/interfere/net/SleepData$NightAwakeCount;", "", "averageCount", "", "diffCount", "dailyRecords", "", "Lcom/xiaomi/fitness/health/sleep/interfere/net/SleepData$CountDaily;", "<init>", "(ILjava/lang/Integer;Ljava/util/List;)V", "getAverageCount", "()I", "getDiffCount", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "getDailyRecords", "()Ljava/util/List;", "component1", "component2", "component3", "copy", "(ILjava/lang/Integer;Ljava/util/List;)Lcom/xiaomi/fitness/health/sleep/interfere/net/SleepData$NightAwakeCount;", "equals", "", "other", "hashCode", "toString", "", "health_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class NightAwakeCount {

        @SerializedName("avg")
        private final int averageCount;

        @SerializedName("daily")
        @Nullable
        private final List<CountDaily> dailyRecords;

        @SerializedName("diffMinutes")
        @Nullable
        private final Integer diffCount;

        public NightAwakeCount(int i, @Nullable Integer num, @Nullable List<CountDaily> list) {
            this.averageCount = i;
            this.diffCount = num;
            this.dailyRecords = list;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ NightAwakeCount copy$default(NightAwakeCount nightAwakeCount, int i, Integer num, List list, int i2, Object obj) {
            if ((i2 & 1) != 0) {
                i = nightAwakeCount.averageCount;
            }
            if ((i2 & 2) != 0) {
                num = nightAwakeCount.diffCount;
            }
            if ((i2 & 4) != 0) {
                list = nightAwakeCount.dailyRecords;
            }
            return nightAwakeCount.copy(i, num, list);
        }

        /* JADX INFO: renamed from: component1, reason: from getter */
        public final int getAverageCount() {
            return this.averageCount;
        }

        @Nullable
        /* JADX INFO: renamed from: component2, reason: from getter */
        public final Integer getDiffCount() {
            return this.diffCount;
        }

        @Nullable
        public final List<CountDaily> component3() {
            return this.dailyRecords;
        }

        @NotNull
        public final NightAwakeCount copy(int averageCount, @Nullable Integer diffCount, @Nullable List<CountDaily> dailyRecords) {
            return new NightAwakeCount(averageCount, diffCount, dailyRecords);
        }

        public boolean equals(@Nullable Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof NightAwakeCount)) {
                return false;
            }
            NightAwakeCount nightAwakeCount = (NightAwakeCount) other;
            return this.averageCount == nightAwakeCount.averageCount && Intrinsics.areEqual(this.diffCount, nightAwakeCount.diffCount) && Intrinsics.areEqual(this.dailyRecords, nightAwakeCount.dailyRecords);
        }

        public final int getAverageCount() {
            return this.averageCount;
        }

        @Nullable
        public final List<CountDaily> getDailyRecords() {
            return this.dailyRecords;
        }

        @Nullable
        public final Integer getDiffCount() {
            return this.diffCount;
        }

        public int hashCode() {
            int iHashCode = Integer.hashCode(this.averageCount) * 31;
            Integer num = this.diffCount;
            int iHashCode2 = (iHashCode + (num == null ? 0 : num.hashCode())) * 31;
            List<CountDaily> list = this.dailyRecords;
            return iHashCode2 + (list != null ? list.hashCode() : 0);
        }

        @NotNull
        public String toString() {
            return "NightAwakeCount(averageCount=" + this.averageCount + ", diffCount=" + this.diffCount + ", dailyRecords=" + this.dailyRecords + ")";
        }
    }

    @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001:\u0001\u001cB)\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\u000e\u0010\u0005\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0006¢\u0006\u0004\b\b\u0010\tJ\t\u0010\u0011\u001a\u00020\u0003HÆ\u0003J\u0010\u0010\u0012\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010\rJ\u0011\u0010\u0013\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0006HÆ\u0003J6\u0010\u0014\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\u0010\b\u0002\u0010\u0005\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0006HÆ\u0001¢\u0006\u0002\u0010\u0015J\u0013\u0010\u0016\u001a\u00020\u00172\b\u0010\u0018\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0019\u001a\u00020\u0003HÖ\u0001J\t\u0010\u001a\u001a\u00020\u001bHÖ\u0001R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u001a\u0010\u0004\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\n\n\u0002\u0010\u000e\u001a\u0004\b\f\u0010\rR\u001e\u0010\u0005\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010¨\u0006\u001d"}, d2 = {"Lcom/xiaomi/fitness/health/sleep/interfere/net/SleepData$NightSleepDuration;", "", "averageMinutes", "", "diffMinutes", "dailyRecords", "", "Lcom/xiaomi/fitness/health/sleep/interfere/net/SleepData$NightSleepDuration$Daily;", "<init>", "(ILjava/lang/Integer;Ljava/util/List;)V", "getAverageMinutes", "()I", "getDiffMinutes", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "getDailyRecords", "()Ljava/util/List;", "component1", "component2", "component3", "copy", "(ILjava/lang/Integer;Ljava/util/List;)Lcom/xiaomi/fitness/health/sleep/interfere/net/SleepData$NightSleepDuration;", "equals", "", "other", "hashCode", "toString", "", "Daily", "health_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class NightSleepDuration {

        @SerializedName("avg")
        private final int averageMinutes;

        @SerializedName("daily")
        @Nullable
        private final List<Daily> dailyRecords;

        @SerializedName("diffMinutes")
        @Nullable
        private final Integer diffMinutes;

        @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\b\n\u0002\b\u0013\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B/\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\u0007\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0005¢\u0006\u0004\b\t\u0010\nJ\t\u0010\u0012\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0013\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0014\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0015\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0016\u001a\u00020\u0005HÆ\u0003J;\u0010\u0017\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\u0007\u001a\u00020\u00052\b\b\u0002\u0010\b\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u0018\u001a\u00020\u00192\b\u0010\u001a\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001b\u001a\u00020\u0005HÖ\u0001J\t\u0010\u001c\u001a\u00020\u001dHÖ\u0001R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0016\u0010\u0004\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0016\u0010\u0006\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u000eR\u0016\u0010\u0007\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u000eR\u0016\u0010\b\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u000e¨\u0006\u001e"}, d2 = {"Lcom/xiaomi/fitness/health/sleep/interfere/net/SleepData$NightSleepDuration$Daily;", "", "dateTimestamp", "", "totalMinutes", "", "deepSleepMinutes", "lightSleepMinutes", "remSleepMinutes", "<init>", "(JIIII)V", "getDateTimestamp", "()J", "getTotalMinutes", "()I", "getDeepSleepMinutes", "getLightSleepMinutes", "getRemSleepMinutes", "component1", "component2", "component3", "component4", "component5", "copy", "equals", "", "other", "hashCode", "toString", "", "health_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
        public static final /* data */ class Daily {

            @SerializedName(DialWidgetType.DATE)
            private final long dateTimestamp;

            @SerializedName("sleepDeepDuration")
            private final int deepSleepMinutes;

            @SerializedName("sleepLightDuration")
            private final int lightSleepMinutes;

            @SerializedName("sleepRemDuration")
            private final int remSleepMinutes;

            @SerializedName(FitnessReportKey.totalDuration)
            private final int totalMinutes;

            public Daily(long j, int i, int i2, int i3, int i4) {
                this.dateTimestamp = j;
                this.totalMinutes = i;
                this.deepSleepMinutes = i2;
                this.lightSleepMinutes = i3;
                this.remSleepMinutes = i4;
            }

            public static /* synthetic */ Daily copy$default(Daily daily, long j, int i, int i2, int i3, int i4, int i5, Object obj) {
                if ((i5 & 1) != 0) {
                    j = daily.dateTimestamp;
                }
                long j2 = j;
                if ((i5 & 2) != 0) {
                    i = daily.totalMinutes;
                }
                int i6 = i;
                if ((i5 & 4) != 0) {
                    i2 = daily.deepSleepMinutes;
                }
                int i7 = i2;
                if ((i5 & 8) != 0) {
                    i3 = daily.lightSleepMinutes;
                }
                int i8 = i3;
                if ((i5 & 16) != 0) {
                    i4 = daily.remSleepMinutes;
                }
                return daily.copy(j2, i6, i7, i8, i4);
            }

            /* JADX INFO: renamed from: component1, reason: from getter */
            public final long getDateTimestamp() {
                return this.dateTimestamp;
            }

            /* JADX INFO: renamed from: component2, reason: from getter */
            public final int getTotalMinutes() {
                return this.totalMinutes;
            }

            /* JADX INFO: renamed from: component3, reason: from getter */
            public final int getDeepSleepMinutes() {
                return this.deepSleepMinutes;
            }

            /* JADX INFO: renamed from: component4, reason: from getter */
            public final int getLightSleepMinutes() {
                return this.lightSleepMinutes;
            }

            /* JADX INFO: renamed from: component5, reason: from getter */
            public final int getRemSleepMinutes() {
                return this.remSleepMinutes;
            }

            @NotNull
            public final Daily copy(long dateTimestamp, int totalMinutes, int deepSleepMinutes, int lightSleepMinutes, int remSleepMinutes) {
                return new Daily(dateTimestamp, totalMinutes, deepSleepMinutes, lightSleepMinutes, remSleepMinutes);
            }

            public boolean equals(@Nullable Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof Daily)) {
                    return false;
                }
                Daily daily = (Daily) other;
                return this.dateTimestamp == daily.dateTimestamp && this.totalMinutes == daily.totalMinutes && this.deepSleepMinutes == daily.deepSleepMinutes && this.lightSleepMinutes == daily.lightSleepMinutes && this.remSleepMinutes == daily.remSleepMinutes;
            }

            public final long getDateTimestamp() {
                return this.dateTimestamp;
            }

            public final int getDeepSleepMinutes() {
                return this.deepSleepMinutes;
            }

            public final int getLightSleepMinutes() {
                return this.lightSleepMinutes;
            }

            public final int getRemSleepMinutes() {
                return this.remSleepMinutes;
            }

            public final int getTotalMinutes() {
                return this.totalMinutes;
            }

            public int hashCode() {
                return (((((((Long.hashCode(this.dateTimestamp) * 31) + Integer.hashCode(this.totalMinutes)) * 31) + Integer.hashCode(this.deepSleepMinutes)) * 31) + Integer.hashCode(this.lightSleepMinutes)) * 31) + Integer.hashCode(this.remSleepMinutes);
            }

            @NotNull
            public String toString() {
                return "Daily(dateTimestamp=" + this.dateTimestamp + ", totalMinutes=" + this.totalMinutes + ", deepSleepMinutes=" + this.deepSleepMinutes + ", lightSleepMinutes=" + this.lightSleepMinutes + ", remSleepMinutes=" + this.remSleepMinutes + ")";
            }
        }

        public NightSleepDuration(int i, @Nullable Integer num, @Nullable List<Daily> list) {
            this.averageMinutes = i;
            this.diffMinutes = num;
            this.dailyRecords = list;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ NightSleepDuration copy$default(NightSleepDuration nightSleepDuration, int i, Integer num, List list, int i2, Object obj) {
            if ((i2 & 1) != 0) {
                i = nightSleepDuration.averageMinutes;
            }
            if ((i2 & 2) != 0) {
                num = nightSleepDuration.diffMinutes;
            }
            if ((i2 & 4) != 0) {
                list = nightSleepDuration.dailyRecords;
            }
            return nightSleepDuration.copy(i, num, list);
        }

        /* JADX INFO: renamed from: component1, reason: from getter */
        public final int getAverageMinutes() {
            return this.averageMinutes;
        }

        @Nullable
        /* JADX INFO: renamed from: component2, reason: from getter */
        public final Integer getDiffMinutes() {
            return this.diffMinutes;
        }

        @Nullable
        public final List<Daily> component3() {
            return this.dailyRecords;
        }

        @NotNull
        public final NightSleepDuration copy(int averageMinutes, @Nullable Integer diffMinutes, @Nullable List<Daily> dailyRecords) {
            return new NightSleepDuration(averageMinutes, diffMinutes, dailyRecords);
        }

        public boolean equals(@Nullable Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof NightSleepDuration)) {
                return false;
            }
            NightSleepDuration nightSleepDuration = (NightSleepDuration) other;
            return this.averageMinutes == nightSleepDuration.averageMinutes && Intrinsics.areEqual(this.diffMinutes, nightSleepDuration.diffMinutes) && Intrinsics.areEqual(this.dailyRecords, nightSleepDuration.dailyRecords);
        }

        public final int getAverageMinutes() {
            return this.averageMinutes;
        }

        @Nullable
        public final List<Daily> getDailyRecords() {
            return this.dailyRecords;
        }

        @Nullable
        public final Integer getDiffMinutes() {
            return this.diffMinutes;
        }

        public int hashCode() {
            int iHashCode = Integer.hashCode(this.averageMinutes) * 31;
            Integer num = this.diffMinutes;
            int iHashCode2 = (iHashCode + (num == null ? 0 : num.hashCode())) * 31;
            List<Daily> list = this.dailyRecords;
            return iHashCode2 + (list != null ? list.hashCode() : 0);
        }

        @NotNull
        public String toString() {
            return "NightSleepDuration(averageMinutes=" + this.averageMinutes + ", diffMinutes=" + this.diffMinutes + ", dailyRecords=" + this.dailyRecords + ")";
        }
    }

    @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0014\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B1\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0003\u0012\u000e\u0010\u0007\u001a\n\u0012\u0004\u0012\u00020\t\u0018\u00010\b¢\u0006\u0004\b\n\u0010\u000bJ\t\u0010\u0014\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0015\u001a\u00020\u0005HÆ\u0003J\u0010\u0010\u0016\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010\u0010J\u0011\u0010\u0017\u001a\n\u0012\u0004\u0012\u00020\t\u0018\u00010\bHÆ\u0003J@\u0010\u0018\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00032\u0010\b\u0002\u0010\u0007\u001a\n\u0012\u0004\u0012\u00020\t\u0018\u00010\bHÆ\u0001¢\u0006\u0002\u0010\u0019J\u0013\u0010\u001a\u001a\u00020\u00052\b\u0010\u001b\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001c\u001a\u00020\u0003HÖ\u0001J\t\u0010\u001d\u001a\u00020\u001eHÖ\u0001R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0016\u0010\u0004\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0004\u0010\u000eR\u001a\u0010\u0006\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\n\n\u0002\u0010\u0011\u001a\u0004\b\u000f\u0010\u0010R\u001e\u0010\u0007\u001a\n\u0012\u0004\u0012\u00020\t\u0018\u00010\b8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013¨\u0006\u001f"}, d2 = {"Lcom/xiaomi/fitness/health/sleep/interfere/net/SleepData$WakeUpTime;", "", "averageMinutes", "", "isRegular", "", "diffMinutes", "dailyRecords", "", "Lcom/xiaomi/fitness/health/sleep/interfere/net/SleepData$DailyRecords;", "<init>", "(IZLjava/lang/Integer;Ljava/util/List;)V", "getAverageMinutes", "()I", "()Z", "getDiffMinutes", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "getDailyRecords", "()Ljava/util/List;", "component1", "component2", "component3", "component4", "copy", "(IZLjava/lang/Integer;Ljava/util/List;)Lcom/xiaomi/fitness/health/sleep/interfere/net/SleepData$WakeUpTime;", "equals", "other", "hashCode", "toString", "", "health_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class WakeUpTime {

        @SerializedName("avg")
        private final int averageMinutes;

        @SerializedName("daily")
        @Nullable
        private final List<DailyRecords> dailyRecords;

        @SerializedName("diffMinutes")
        @Nullable
        private final Integer diffMinutes;

        @SerializedName("isRegular")
        private final boolean isRegular;

        public WakeUpTime(int i, boolean z, @Nullable Integer num, @Nullable List<DailyRecords> list) {
            this.averageMinutes = i;
            this.isRegular = z;
            this.diffMinutes = num;
            this.dailyRecords = list;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ WakeUpTime copy$default(WakeUpTime wakeUpTime, int i, boolean z, Integer num, List list, int i2, Object obj) {
            if ((i2 & 1) != 0) {
                i = wakeUpTime.averageMinutes;
            }
            if ((i2 & 2) != 0) {
                z = wakeUpTime.isRegular;
            }
            if ((i2 & 4) != 0) {
                num = wakeUpTime.diffMinutes;
            }
            if ((i2 & 8) != 0) {
                list = wakeUpTime.dailyRecords;
            }
            return wakeUpTime.copy(i, z, num, list);
        }

        /* JADX INFO: renamed from: component1, reason: from getter */
        public final int getAverageMinutes() {
            return this.averageMinutes;
        }

        /* JADX INFO: renamed from: component2, reason: from getter */
        public final boolean getIsRegular() {
            return this.isRegular;
        }

        @Nullable
        /* JADX INFO: renamed from: component3, reason: from getter */
        public final Integer getDiffMinutes() {
            return this.diffMinutes;
        }

        @Nullable
        public final List<DailyRecords> component4() {
            return this.dailyRecords;
        }

        @NotNull
        public final WakeUpTime copy(int averageMinutes, boolean isRegular, @Nullable Integer diffMinutes, @Nullable List<DailyRecords> dailyRecords) {
            return new WakeUpTime(averageMinutes, isRegular, diffMinutes, dailyRecords);
        }

        public boolean equals(@Nullable Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof WakeUpTime)) {
                return false;
            }
            WakeUpTime wakeUpTime = (WakeUpTime) other;
            return this.averageMinutes == wakeUpTime.averageMinutes && this.isRegular == wakeUpTime.isRegular && Intrinsics.areEqual(this.diffMinutes, wakeUpTime.diffMinutes) && Intrinsics.areEqual(this.dailyRecords, wakeUpTime.dailyRecords);
        }

        public final int getAverageMinutes() {
            return this.averageMinutes;
        }

        @Nullable
        public final List<DailyRecords> getDailyRecords() {
            return this.dailyRecords;
        }

        @Nullable
        public final Integer getDiffMinutes() {
            return this.diffMinutes;
        }

        public int hashCode() {
            int iHashCode = ((Integer.hashCode(this.averageMinutes) * 31) + Boolean.hashCode(this.isRegular)) * 31;
            Integer num = this.diffMinutes;
            int iHashCode2 = (iHashCode + (num == null ? 0 : num.hashCode())) * 31;
            List<DailyRecords> list = this.dailyRecords;
            return iHashCode2 + (list != null ? list.hashCode() : 0);
        }

        public final boolean isRegular() {
            return this.isRegular;
        }

        @NotNull
        public String toString() {
            return "WakeUpTime(averageMinutes=" + this.averageMinutes + ", isRegular=" + this.isRegular + ", diffMinutes=" + this.diffMinutes + ", dailyRecords=" + this.dailyRecords + ")";
        }
    }

    public SleepData(@Nullable Bedtime bedtime, @Nullable WakeUpTime wakeUpTime, @Nullable NightSleepDuration nightSleepDuration, @Nullable NightAwakeCount nightAwakeCount, @Nullable DaytimeSleepCount daytimeSleepCount, @Nullable DaytimeSleepDuration daytimeSleepDuration) {
        this.bedtime = bedtime;
        this.wakeUpTime = wakeUpTime;
        this.nightSleepDuration = nightSleepDuration;
        this.nightAwakeCount = nightAwakeCount;
        this.daytimeSleepCount = daytimeSleepCount;
        this.daytimeSleepDuration = daytimeSleepDuration;
    }

    public static /* synthetic */ SleepData copy$default(SleepData sleepData, Bedtime bedtime, WakeUpTime wakeUpTime, NightSleepDuration nightSleepDuration, NightAwakeCount nightAwakeCount, DaytimeSleepCount daytimeSleepCount, DaytimeSleepDuration daytimeSleepDuration, int i, Object obj) {
        if ((i & 1) != 0) {
            bedtime = sleepData.bedtime;
        }
        if ((i & 2) != 0) {
            wakeUpTime = sleepData.wakeUpTime;
        }
        WakeUpTime wakeUpTime2 = wakeUpTime;
        if ((i & 4) != 0) {
            nightSleepDuration = sleepData.nightSleepDuration;
        }
        NightSleepDuration nightSleepDuration2 = nightSleepDuration;
        if ((i & 8) != 0) {
            nightAwakeCount = sleepData.nightAwakeCount;
        }
        NightAwakeCount nightAwakeCount2 = nightAwakeCount;
        if ((i & 16) != 0) {
            daytimeSleepCount = sleepData.daytimeSleepCount;
        }
        DaytimeSleepCount daytimeSleepCount2 = daytimeSleepCount;
        if ((i & 32) != 0) {
            daytimeSleepDuration = sleepData.daytimeSleepDuration;
        }
        return sleepData.copy(bedtime, wakeUpTime2, nightSleepDuration2, nightAwakeCount2, daytimeSleepCount2, daytimeSleepDuration);
    }

    @Nullable
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final Bedtime getBedtime() {
        return this.bedtime;
    }

    @Nullable
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final WakeUpTime getWakeUpTime() {
        return this.wakeUpTime;
    }

    @Nullable
    /* JADX INFO: renamed from: component3, reason: from getter */
    public final NightSleepDuration getNightSleepDuration() {
        return this.nightSleepDuration;
    }

    @Nullable
    /* JADX INFO: renamed from: component4, reason: from getter */
    public final NightAwakeCount getNightAwakeCount() {
        return this.nightAwakeCount;
    }

    @Nullable
    /* JADX INFO: renamed from: component5, reason: from getter */
    public final DaytimeSleepCount getDaytimeSleepCount() {
        return this.daytimeSleepCount;
    }

    @Nullable
    /* JADX INFO: renamed from: component6, reason: from getter */
    public final DaytimeSleepDuration getDaytimeSleepDuration() {
        return this.daytimeSleepDuration;
    }

    @NotNull
    public final SleepData copy(@Nullable Bedtime bedtime, @Nullable WakeUpTime wakeUpTime, @Nullable NightSleepDuration nightSleepDuration, @Nullable NightAwakeCount nightAwakeCount, @Nullable DaytimeSleepCount daytimeSleepCount, @Nullable DaytimeSleepDuration daytimeSleepDuration) {
        return new SleepData(bedtime, wakeUpTime, nightSleepDuration, nightAwakeCount, daytimeSleepCount, daytimeSleepDuration);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof SleepData)) {
            return false;
        }
        SleepData sleepData = (SleepData) other;
        return Intrinsics.areEqual(this.bedtime, sleepData.bedtime) && Intrinsics.areEqual(this.wakeUpTime, sleepData.wakeUpTime) && Intrinsics.areEqual(this.nightSleepDuration, sleepData.nightSleepDuration) && Intrinsics.areEqual(this.nightAwakeCount, sleepData.nightAwakeCount) && Intrinsics.areEqual(this.daytimeSleepCount, sleepData.daytimeSleepCount) && Intrinsics.areEqual(this.daytimeSleepDuration, sleepData.daytimeSleepDuration);
    }

    @Nullable
    public final Bedtime getBedtime() {
        return this.bedtime;
    }

    @Nullable
    public final DaytimeSleepCount getDaytimeSleepCount() {
        return this.daytimeSleepCount;
    }

    @Nullable
    public final DaytimeSleepDuration getDaytimeSleepDuration() {
        return this.daytimeSleepDuration;
    }

    @Nullable
    public final NightAwakeCount getNightAwakeCount() {
        return this.nightAwakeCount;
    }

    @Nullable
    public final NightSleepDuration getNightSleepDuration() {
        return this.nightSleepDuration;
    }

    @Nullable
    public final WakeUpTime getWakeUpTime() {
        return this.wakeUpTime;
    }

    public int hashCode() {
        Bedtime bedtime = this.bedtime;
        int iHashCode = (bedtime == null ? 0 : bedtime.hashCode()) * 31;
        WakeUpTime wakeUpTime = this.wakeUpTime;
        int iHashCode2 = (iHashCode + (wakeUpTime == null ? 0 : wakeUpTime.hashCode())) * 31;
        NightSleepDuration nightSleepDuration = this.nightSleepDuration;
        int iHashCode3 = (iHashCode2 + (nightSleepDuration == null ? 0 : nightSleepDuration.hashCode())) * 31;
        NightAwakeCount nightAwakeCount = this.nightAwakeCount;
        int iHashCode4 = (iHashCode3 + (nightAwakeCount == null ? 0 : nightAwakeCount.hashCode())) * 31;
        DaytimeSleepCount daytimeSleepCount = this.daytimeSleepCount;
        int iHashCode5 = (iHashCode4 + (daytimeSleepCount == null ? 0 : daytimeSleepCount.hashCode())) * 31;
        DaytimeSleepDuration daytimeSleepDuration = this.daytimeSleepDuration;
        return iHashCode5 + (daytimeSleepDuration != null ? daytimeSleepDuration.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        return "SleepData(bedtime=" + this.bedtime + ", wakeUpTime=" + this.wakeUpTime + ", nightSleepDuration=" + this.nightSleepDuration + ", nightAwakeCount=" + this.nightAwakeCount + ", daytimeSleepCount=" + this.daytimeSleepCount + ", daytimeSleepDuration=" + this.daytimeSleepDuration + ")";
    }
}
