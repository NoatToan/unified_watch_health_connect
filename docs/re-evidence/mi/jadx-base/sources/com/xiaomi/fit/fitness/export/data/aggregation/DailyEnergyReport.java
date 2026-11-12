package com.xiaomi.fit.fitness.export.data.aggregation;

import com.xiaomi.fit.fitness.export.data.aggregation.record.EnergyStateRecord;
import com.xiaomi.fit.fitness.export.data.aggregation.record.TimesDataRecordInt;
import com.xiaomi.fit.fitness.export.data.item.EnergyItem;
import com.xiaomi.fitness.common.utils.TimeUtils;
import java.util.Collections;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0017\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0010\n\u0002\u0010\u0000\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001Bo\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\n\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\b\u0012\u0006\u0010\f\u001a\u00020\b\u0012\u0006\u0010\r\u001a\u00020\b\u0012\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00100\u000f\u0012\u000e\u0010\u0011\u001a\n\u0012\u0004\u0012\u00020\u0012\u0018\u00010\u000f¢\u0006\u0004\b\u0013\u0010\u0014B#\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0013\u0010\u0015J\b\u0010/\u001a\u000200H\u0016J\b\u00101\u001a\u00020\u0005H\u0016J\b\u00102\u001a\u00020\u0005H\u0016J\t\u00103\u001a\u00020\u0003HÆ\u0003J\t\u00104\u001a\u00020\u0005HÆ\u0003J\u000b\u00105\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\t\u00106\u001a\u00020\bHÆ\u0003J\t\u00107\u001a\u00020\bHÆ\u0003J\t\u00108\u001a\u00020\bHÆ\u0003J\t\u00109\u001a\u00020\bHÆ\u0003J\t\u0010:\u001a\u00020\bHÆ\u0003J\t\u0010;\u001a\u00020\bHÆ\u0003J\u000f\u0010<\u001a\b\u0012\u0004\u0012\u00020\u00100\u000fHÆ\u0003J\u0011\u0010=\u001a\n\u0012\u0004\u0012\u00020\u0012\u0018\u00010\u000fHÆ\u0003J\u0087\u0001\u0010>\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00052\b\b\u0002\u0010\u0007\u001a\u00020\b2\b\b\u0002\u0010\t\u001a\u00020\b2\b\b\u0002\u0010\n\u001a\u00020\b2\b\b\u0002\u0010\u000b\u001a\u00020\b2\b\b\u0002\u0010\f\u001a\u00020\b2\b\b\u0002\u0010\r\u001a\u00020\b2\u000e\b\u0002\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00100\u000f2\u0010\b\u0002\u0010\u0011\u001a\n\u0012\u0004\u0012\u00020\u0012\u0018\u00010\u000fHÆ\u0001J\u0013\u0010?\u001a\u0002002\b\u0010@\u001a\u0004\u0018\u00010AHÖ\u0003J\t\u0010B\u001a\u00020\bHÖ\u0001R\u001a\u0010\u0002\u001a\u00020\u0003X\u0096\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0016\u0010\u0017\"\u0004\b\u0018\u0010\u0019R\u0014\u0010\u0004\u001a\u00020\u0005X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u001bR\u001c\u0010\u0006\u001a\u0004\u0018\u00010\u0005X\u0096\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001c\u0010\u001b\"\u0004\b\u001d\u0010\u001eR\u0011\u0010\u0007\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b\u001f\u0010 R\u0011\u0010\t\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b!\u0010 R\u0011\u0010\n\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b\"\u0010 R\u0011\u0010\u000b\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b#\u0010 R\u0011\u0010\f\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b$\u0010 R\u0011\u0010\r\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b%\u0010 R\u0017\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00100\u000f¢\u0006\b\n\u0000\u001a\u0004\b&\u0010'R\u0019\u0010\u0011\u001a\n\u0012\u0004\u0012\u00020\u0012\u0018\u00010\u000f¢\u0006\b\n\u0000\u001a\u0004\b(\u0010'R\u001c\u0010)\u001a\u0004\u0018\u00010*X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b+\u0010,\"\u0004\b-\u0010.¨\u0006C"}, d2 = {"Lcom/xiaomi/fit/fitness/export/data/aggregation/DailyEnergyReport;", "Lcom/xiaomi/fit/fitness/export/data/aggregation/DailyBasicReport;", "time", "", "tag", "", "sid", "avgEnergy", "", "maxEnergy", "minEnergy", "durationActivityEnergy", "durationRecoveryEnergy", "durationStressEnergy", "energyRecords", "", "Lcom/xiaomi/fit/fitness/export/data/aggregation/record/TimesDataRecordInt;", "energyStateRecords", "Lcom/xiaomi/fit/fitness/export/data/aggregation/record/EnergyStateRecord;", "<init>", "(JLjava/lang/String;Ljava/lang/String;IIIIIILjava/util/List;Ljava/util/List;)V", "(JLjava/lang/String;Ljava/lang/String;)V", "getTime", "()J", "setTime", "(J)V", "getTag", "()Ljava/lang/String;", "getSid", "setSid", "(Ljava/lang/String;)V", "getAvgEnergy", "()I", "getMaxEnergy", "getMinEnergy", "getDurationActivityEnergy", "getDurationRecoveryEnergy", "getDurationStressEnergy", "getEnergyRecords", "()Ljava/util/List;", "getEnergyStateRecords", "latestEnergyRecord", "Lcom/xiaomi/fit/fitness/export/data/item/EnergyItem;", "getLatestEnergyRecord", "()Lcom/xiaomi/fit/fitness/export/data/item/EnergyItem;", "setLatestEnergyRecord", "(Lcom/xiaomi/fit/fitness/export/data/item/EnergyItem;)V", "isEmpty", "", "simpleInfo", "toString", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "component10", "component11", "copy", "equals", "other", "", "hashCode", "fitness-data-export_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class DailyEnergyReport extends DailyBasicReport {
    private final int avgEnergy;

    /* JADX INFO: renamed from: durationActivityEnergy, reason: from kotlin metadata and from toString */
    private final int durationAct;

    /* JADX INFO: renamed from: durationRecoveryEnergy, reason: from kotlin metadata and from toString */
    private final int durationRecov;

    /* JADX INFO: renamed from: durationStressEnergy, reason: from kotlin metadata and from toString */
    private final int durationStress;

    @NotNull
    private final List<TimesDataRecordInt> energyRecords;

    /* JADX INFO: renamed from: energyStateRecords, reason: from kotlin metadata and from toString */
    @Nullable
    private final List<EnergyStateRecord> StateRecords;

    /* JADX INFO: renamed from: latestEnergyRecord, reason: from kotlin metadata and from toString */
    @Nullable
    private EnergyItem latestRecord;
    private final int maxEnergy;
    private final int minEnergy;

    @Nullable
    private String sid;

    @NotNull
    private final String tag;
    private long time;

    public DailyEnergyReport(long j, @NotNull String tag, @Nullable String str, int i, int i2, int i3, int i4, int i5, int i6, @NotNull List<TimesDataRecordInt> energyRecords, @Nullable List<EnergyStateRecord> list) {
        Intrinsics.checkNotNullParameter(tag, "tag");
        Intrinsics.checkNotNullParameter(energyRecords, "energyRecords");
        this.time = j;
        this.tag = tag;
        this.sid = str;
        this.avgEnergy = i;
        this.maxEnergy = i2;
        this.minEnergy = i3;
        this.durationAct = i4;
        this.durationRecov = i5;
        this.durationStress = i6;
        this.energyRecords = energyRecords;
        this.StateRecords = list;
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final long getTime() {
        return this.time;
    }

    @NotNull
    public final List<TimesDataRecordInt> component10() {
        return this.energyRecords;
    }

    @Nullable
    public final List<EnergyStateRecord> component11() {
        return this.StateRecords;
    }

    @NotNull
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getTag() {
        return this.tag;
    }

    @Nullable
    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getSid() {
        return this.sid;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final int getAvgEnergy() {
        return this.avgEnergy;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final int getMaxEnergy() {
        return this.maxEnergy;
    }

    /* JADX INFO: renamed from: component6, reason: from getter */
    public final int getMinEnergy() {
        return this.minEnergy;
    }

    /* JADX INFO: renamed from: component7, reason: from getter */
    public final int getDurationAct() {
        return this.durationAct;
    }

    /* JADX INFO: renamed from: component8, reason: from getter */
    public final int getDurationRecov() {
        return this.durationRecov;
    }

    /* JADX INFO: renamed from: component9, reason: from getter */
    public final int getDurationStress() {
        return this.durationStress;
    }

    @NotNull
    public final DailyEnergyReport copy(long time, @NotNull String tag, @Nullable String sid, int avgEnergy, int maxEnergy, int minEnergy, int durationActivityEnergy, int durationRecoveryEnergy, int durationStressEnergy, @NotNull List<TimesDataRecordInt> energyRecords, @Nullable List<EnergyStateRecord> energyStateRecords) {
        Intrinsics.checkNotNullParameter(tag, "tag");
        Intrinsics.checkNotNullParameter(energyRecords, "energyRecords");
        return new DailyEnergyReport(time, tag, sid, avgEnergy, maxEnergy, minEnergy, durationActivityEnergy, durationRecoveryEnergy, durationStressEnergy, energyRecords, energyStateRecords);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof DailyEnergyReport)) {
            return false;
        }
        DailyEnergyReport dailyEnergyReport = (DailyEnergyReport) other;
        return this.time == dailyEnergyReport.time && Intrinsics.areEqual(this.tag, dailyEnergyReport.tag) && Intrinsics.areEqual(this.sid, dailyEnergyReport.sid) && this.avgEnergy == dailyEnergyReport.avgEnergy && this.maxEnergy == dailyEnergyReport.maxEnergy && this.minEnergy == dailyEnergyReport.minEnergy && this.durationAct == dailyEnergyReport.durationAct && this.durationRecov == dailyEnergyReport.durationRecov && this.durationStress == dailyEnergyReport.durationStress && Intrinsics.areEqual(this.energyRecords, dailyEnergyReport.energyRecords) && Intrinsics.areEqual(this.StateRecords, dailyEnergyReport.StateRecords);
    }

    public final int getAvgEnergy() {
        return this.avgEnergy;
    }

    public final int getDurationActivityEnergy() {
        return this.durationAct;
    }

    public final int getDurationRecoveryEnergy() {
        return this.durationRecov;
    }

    public final int getDurationStressEnergy() {
        return this.durationStress;
    }

    @NotNull
    public final List<TimesDataRecordInt> getEnergyRecords() {
        return this.energyRecords;
    }

    @Nullable
    public final List<EnergyStateRecord> getEnergyStateRecords() {
        return this.StateRecords;
    }

    @Nullable
    /* JADX INFO: renamed from: getLatestEnergyRecord, reason: from getter */
    public final EnergyItem getLatestRecord() {
        return this.latestRecord;
    }

    public final int getMaxEnergy() {
        return this.maxEnergy;
    }

    public final int getMinEnergy() {
        return this.minEnergy;
    }

    @Override // com.xiaomi.fit.fitness.export.data.aggregation.DailyBasicReport
    @Nullable
    public String getSid() {
        return this.sid;
    }

    @Override // com.xiaomi.fit.fitness.export.data.aggregation.DailyBasicReport
    @NotNull
    public String getTag() {
        return this.tag;
    }

    @Override // com.xiaomi.fit.fitness.export.data.aggregation.DailyBasicReport
    public long getTime() {
        return this.time;
    }

    public int hashCode() {
        int iHashCode = ((Long.hashCode(this.time) * 31) + this.tag.hashCode()) * 31;
        String str = this.sid;
        int iHashCode2 = (((((((((((((((iHashCode + (str == null ? 0 : str.hashCode())) * 31) + Integer.hashCode(this.avgEnergy)) * 31) + Integer.hashCode(this.maxEnergy)) * 31) + Integer.hashCode(this.minEnergy)) * 31) + Integer.hashCode(this.durationAct)) * 31) + Integer.hashCode(this.durationRecov)) * 31) + Integer.hashCode(this.durationStress)) * 31) + this.energyRecords.hashCode()) * 31;
        List<EnergyStateRecord> list = this.StateRecords;
        return iHashCode2 + (list != null ? list.hashCode() : 0);
    }

    @Override // com.xiaomi.fit.fitness.export.data.aggregation.DailyBasicReport
    public boolean isEmpty() {
        List<EnergyStateRecord> list;
        List<TimesDataRecordInt> list2 = this.energyRecords;
        return (list2 == null || list2.isEmpty()) && ((list = this.StateRecords) == null || list.isEmpty());
    }

    public final void setLatestEnergyRecord(@Nullable EnergyItem energyItem) {
        this.latestRecord = energyItem;
    }

    @Override // com.xiaomi.fit.fitness.export.data.aggregation.DailyBasicReport
    public void setSid(@Nullable String str) {
        this.sid = str;
    }

    @Override // com.xiaomi.fit.fitness.export.data.aggregation.DailyBasicReport
    public void setTime(long j) {
        this.time = j;
    }

    @Override // com.xiaomi.fit.fitness.export.data.aggregation.DailyBasicReport
    @NotNull
    public String simpleInfo() {
        return "DailyEnergyReport[time=" + getTime() + ", sid='" + getSid() + "', avgEnergy=" + this.avgEnergy + ", maxEnergy=" + this.maxEnergy + ", minEnergy=" + this.minEnergy + "]";
    }

    @NotNull
    public String toString() {
        return "DailyEnergyReport(time=" + getTime() + ",time=" + TimeUtils.formatDate("yyyy-MM-dd HH:mm:ss", Long.valueOf(getTime() * ((long) 1000))) + ", tag='" + getTag() + "', sid='" + getSid() + "', avgEnergy=" + this.avgEnergy + ", maxEnergy=" + this.maxEnergy + ", minEnergy=" + this.minEnergy + ", durationAct=" + this.durationAct + ", durationRecov=" + this.durationRecov + ", durationStress=" + this.durationStress + ", latestRecord=" + this.latestRecord + ", energyRecords=" + this.energyRecords + ", StateRecords=" + this.StateRecords + ")";
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public DailyEnergyReport(long j, @NotNull String tag, @Nullable String str) {
        Intrinsics.checkNotNullParameter(tag, "tag");
        List listEmptyList = Collections.emptyList();
        Intrinsics.checkNotNullExpressionValue(listEmptyList, "emptyList(...)");
        this(j, tag, str, 0, 0, 0, 0, 0, 0, listEmptyList, Collections.emptyList());
    }
}
