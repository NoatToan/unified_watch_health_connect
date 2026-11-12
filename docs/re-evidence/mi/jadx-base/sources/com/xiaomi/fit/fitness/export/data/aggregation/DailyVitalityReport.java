package com.xiaomi.fit.fitness.export.data.aggregation;

import com.xiaomi.fit.fitness.export.data.item.VitalityItem;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000e\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010 \n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\u0019\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\b\u0010\u001e\u001a\u00020\u001fH\u0016J\b\u0010 \u001a\u00020\u0005H\u0016J\t\u0010!\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\"\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u001f\u0010#\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005HÆ\u0001J\u0013\u0010$\u001a\u00020\u001f2\b\u0010%\u001a\u0004\u0018\u00010&HÖ\u0003J\t\u0010'\u001a\u00020(HÖ\u0001R\u001a\u0010\u0002\u001a\u00020\u0003X\u0096\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\b\u0010\t\"\u0004\b\n\u0010\u000bR\u001c\u0010\u0004\u001a\u0004\u0018\u00010\u0005X\u0096\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u000fR\u0014\u0010\u0010\u001a\u00020\u00058VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0011\u0010\rR\u001c\u0010\u0012\u001a\u0004\u0018\u00010\u0013X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0014\u0010\u0015\"\u0004\b\u0016\u0010\u0017R\"\u0010\u0018\u001a\n\u0012\u0004\u0012\u00020\u0013\u0018\u00010\u0019X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001a\u0010\u001b\"\u0004\b\u001c\u0010\u001d¨\u0006)"}, d2 = {"Lcom/xiaomi/fit/fitness/export/data/aggregation/DailyVitalityReport;", "Lcom/xiaomi/fit/fitness/export/data/aggregation/DailyBasicReport;", "time", "", "sid", "", "<init>", "(JLjava/lang/String;)V", "getTime", "()J", "setTime", "(J)V", "getSid", "()Ljava/lang/String;", "setSid", "(Ljava/lang/String;)V", "tag", "getTag", "latestVitalityItem", "Lcom/xiaomi/fit/fitness/export/data/item/VitalityItem;", "getLatestVitalityItem", "()Lcom/xiaomi/fit/fitness/export/data/item/VitalityItem;", "setLatestVitalityItem", "(Lcom/xiaomi/fit/fitness/export/data/item/VitalityItem;)V", "vitalityItemList", "", "getVitalityItemList", "()Ljava/util/List;", "setVitalityItemList", "(Ljava/util/List;)V", "isEmpty", "", "toString", "component1", "component2", "copy", "equals", "other", "", "hashCode", "", "fitness-data-export_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class DailyVitalityReport extends DailyBasicReport {

    /* JADX INFO: renamed from: latestVitalityItem, reason: from kotlin metadata and from toString */
    @Nullable
    private VitalityItem latestVitality;

    @Nullable
    private String sid;
    private long time;

    @Nullable
    private List<VitalityItem> vitalityItemList;

    public DailyVitalityReport(long j, @Nullable String str) {
        this.time = j;
        this.sid = str;
    }

    public static /* synthetic */ DailyVitalityReport copy$default(DailyVitalityReport dailyVitalityReport, long j, String str, int i, Object obj) {
        if ((i & 1) != 0) {
            j = dailyVitalityReport.time;
        }
        if ((i & 2) != 0) {
            str = dailyVitalityReport.sid;
        }
        return dailyVitalityReport.copy(j, str);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final long getTime() {
        return this.time;
    }

    @Nullable
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getSid() {
        return this.sid;
    }

    @NotNull
    public final DailyVitalityReport copy(long time, @Nullable String sid) {
        return new DailyVitalityReport(time, sid);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof DailyVitalityReport)) {
            return false;
        }
        DailyVitalityReport dailyVitalityReport = (DailyVitalityReport) other;
        return this.time == dailyVitalityReport.time && Intrinsics.areEqual(this.sid, dailyVitalityReport.sid);
    }

    @Nullable
    /* JADX INFO: renamed from: getLatestVitalityItem, reason: from getter */
    public final VitalityItem getLatestVitality() {
        return this.latestVitality;
    }

    @Override // com.xiaomi.fit.fitness.export.data.aggregation.DailyBasicReport
    @Nullable
    public String getSid() {
        return this.sid;
    }

    @Override // com.xiaomi.fit.fitness.export.data.aggregation.DailyBasicReport
    @NotNull
    public String getTag() {
        return "days";
    }

    @Override // com.xiaomi.fit.fitness.export.data.aggregation.DailyBasicReport
    public long getTime() {
        return this.time;
    }

    @Nullable
    public final List<VitalityItem> getVitalityItemList() {
        return this.vitalityItemList;
    }

    public int hashCode() {
        int iHashCode = Long.hashCode(this.time) * 31;
        String str = this.sid;
        return iHashCode + (str == null ? 0 : str.hashCode());
    }

    @Override // com.xiaomi.fit.fitness.export.data.aggregation.DailyBasicReport
    public boolean isEmpty() {
        return this.latestVitality == null;
    }

    public final void setLatestVitalityItem(@Nullable VitalityItem vitalityItem) {
        this.latestVitality = vitalityItem;
    }

    @Override // com.xiaomi.fit.fitness.export.data.aggregation.DailyBasicReport
    public void setSid(@Nullable String str) {
        this.sid = str;
    }

    @Override // com.xiaomi.fit.fitness.export.data.aggregation.DailyBasicReport
    public void setTime(long j) {
        this.time = j;
    }

    public final void setVitalityItemList(@Nullable List<VitalityItem> list) {
        this.vitalityItemList = list;
    }

    @NotNull
    public String toString() {
        return "DailyVitalityReport(time=" + getTime() + ", sid=" + getSid() + ", latestVitality=" + this.latestVitality + ")";
    }
}
