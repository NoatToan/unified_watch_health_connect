package com.xiaomi.fit.fitness.export.data.aggregation;

import com.xiaomi.fit.fitness.export.data.item.OneDayPaiReport;
import com.xiaomi.fitness.common.utils.TimeUtils;
import com.xiaomi.hm.health.bt.sdk.data.PaiData;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000e\n\u0002\b\r\n\u0002\u0010\u0007\n\u0002\b\u0011\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\b\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\u0019\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\b\u00101\u001a\u000202H\u0016J\u0006\u00103\u001a\u00020&J\b\u00104\u001a\u00020\u0005H\u0016J\b\u00105\u001a\u00020\u0005H\u0016J\t\u00106\u001a\u00020\u0003HÆ\u0003J\u000b\u00107\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u001f\u00108\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005HÆ\u0001J\u0013\u00109\u001a\u0002022\b\u0010:\u001a\u0004\u0018\u00010;HÖ\u0003J\t\u0010<\u001a\u00020=HÖ\u0001R\u001a\u0010\u0002\u001a\u00020\u0003X\u0096\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\b\u0010\t\"\u0004\b\n\u0010\u000bR\u001c\u0010\u0004\u001a\u0004\u0018\u00010\u0005X\u0096\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u000fR\u0014\u0010\u0010\u001a\u00020\u00058VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0011\u0010\rR\u001a\u0010\u0012\u001a\u00020\u0013X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0014\u0010\u0015\"\u0004\b\u0016\u0010\u0017R\u001a\u0010\u0018\u001a\u00020\u0013X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0019\u0010\u0015\"\u0004\b\u001a\u0010\u0017R\u001a\u0010\u001b\u001a\u00020\u0013X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001c\u0010\u0015\"\u0004\b\u001d\u0010\u0017R\u001a\u0010\u001e\u001a\u00020\u0013X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001f\u0010\u0015\"\u0004\b \u0010\u0017R\u001a\u0010!\u001a\u00020\u0013X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\"\u0010\u0015\"\u0004\b#\u0010\u0017R\"\u0010$\u001a\n\u0012\u0004\u0012\u00020&\u0018\u00010%X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b'\u0010(\"\u0004\b)\u0010*R\u001c\u0010+\u001a\u0004\u0018\u00010,X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b-\u0010.\"\u0004\b/\u00100¨\u0006>"}, d2 = {"Lcom/xiaomi/fit/fitness/export/data/aggregation/DailyPaiReport;", "Lcom/xiaomi/fit/fitness/export/data/aggregation/DailyBasicReport;", "time", "", "sid", "", "<init>", "(JLjava/lang/String;)V", "getTime", "()J", "setTime", "(J)V", "getSid", "()Ljava/lang/String;", "setSid", "(Ljava/lang/String;)V", "tag", "getTag", "pai", "", "getPai", "()F", "setPai", "(F)V", PaiData.TOTAL_PAI, "getTotalPai", "setTotalPai", PaiData.HIGH_ZONE_PAI, "getHighZonePai", "setHighZonePai", PaiData.MEDIUM_ZONE_PAI, "getMediumZonePai", "setMediumZonePai", PaiData.LOW_ZONE_PAI, "getLowZonePai", "setLowZonePai", "paiList", "", "Lcom/xiaomi/fit/fitness/export/data/item/OneDayPaiReport;", "getPaiList", "()Ljava/util/List;", "setPaiList", "(Ljava/util/List;)V", "hrReport", "Lcom/xiaomi/fit/fitness/export/data/aggregation/DailyHrReport;", "getHrReport", "()Lcom/xiaomi/fit/fitness/export/data/aggregation/DailyHrReport;", "setHrReport", "(Lcom/xiaomi/fit/fitness/export/data/aggregation/DailyHrReport;)V", "isEmpty", "", "toOneDayPaiReport", "simpleInfo", "toString", "component1", "component2", "copy", "equals", "other", "", "hashCode", "", "fitness-data-export_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class DailyPaiReport extends DailyBasicReport {
    private float highZonePai;

    @Nullable
    private transient DailyHrReport hrReport;
    private float lowZonePai;
    private float mediumZonePai;
    private float pai;

    @Nullable
    private transient List<? extends OneDayPaiReport> paiList;

    @Nullable
    private String sid;
    private long time;
    private float totalPai;

    public DailyPaiReport(long j, @Nullable String str) {
        this.time = j;
        this.sid = str;
    }

    public static /* synthetic */ DailyPaiReport copy$default(DailyPaiReport dailyPaiReport, long j, String str, int i, Object obj) {
        if ((i & 1) != 0) {
            j = dailyPaiReport.time;
        }
        if ((i & 2) != 0) {
            str = dailyPaiReport.sid;
        }
        return dailyPaiReport.copy(j, str);
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
    public final DailyPaiReport copy(long time, @Nullable String sid) {
        return new DailyPaiReport(time, sid);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof DailyPaiReport)) {
            return false;
        }
        DailyPaiReport dailyPaiReport = (DailyPaiReport) other;
        return this.time == dailyPaiReport.time && Intrinsics.areEqual(this.sid, dailyPaiReport.sid);
    }

    public final float getHighZonePai() {
        return this.highZonePai;
    }

    @Nullable
    public final DailyHrReport getHrReport() {
        return this.hrReport;
    }

    public final float getLowZonePai() {
        return this.lowZonePai;
    }

    public final float getMediumZonePai() {
        return this.mediumZonePai;
    }

    public final float getPai() {
        return this.pai;
    }

    @Nullable
    public final List<OneDayPaiReport> getPaiList() {
        return this.paiList;
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

    public final float getTotalPai() {
        return this.totalPai;
    }

    public int hashCode() {
        int iHashCode = Long.hashCode(this.time) * 31;
        String str = this.sid;
        return iHashCode + (str == null ? 0 : str.hashCode());
    }

    @Override // com.xiaomi.fit.fitness.export.data.aggregation.DailyBasicReport
    public boolean isEmpty() {
        return Float.compare(this.totalPai, 0.0f) == 0;
    }

    public final void setHighZonePai(float f) {
        this.highZonePai = f;
    }

    public final void setHrReport(@Nullable DailyHrReport dailyHrReport) {
        this.hrReport = dailyHrReport;
    }

    public final void setLowZonePai(float f) {
        this.lowZonePai = f;
    }

    public final void setMediumZonePai(float f) {
        this.mediumZonePai = f;
    }

    public final void setPai(float f) {
        this.pai = f;
    }

    public final void setPaiList(@Nullable List<? extends OneDayPaiReport> list) {
        this.paiList = list;
    }

    @Override // com.xiaomi.fit.fitness.export.data.aggregation.DailyBasicReport
    public void setSid(@Nullable String str) {
        this.sid = str;
    }

    @Override // com.xiaomi.fit.fitness.export.data.aggregation.DailyBasicReport
    public void setTime(long j) {
        this.time = j;
    }

    public final void setTotalPai(float f) {
        this.totalPai = f;
    }

    @Override // com.xiaomi.fit.fitness.export.data.aggregation.DailyBasicReport
    @NotNull
    public String simpleInfo() {
        return toString();
    }

    @NotNull
    public final OneDayPaiReport toOneDayPaiReport() {
        return new OneDayPaiReport(getTime(), this.pai, this.totalPai, this.highZonePai, this.mediumZonePai, this.lowZonePai);
    }

    @NotNull
    public String toString() {
        return "DailyPaiReport(time=" + getTime() + ", time=" + TimeUtils.formatDate("yyyy-MM-dd HH:mm:ss", Long.valueOf(getTime() * ((long) 1000))) + ", sid=" + getSid() + ", pai=" + this.pai + ", totalPai=" + this.totalPai + ", highZonePai=" + this.highZonePai + ", mediumZonePai=" + this.mediumZonePai + ", lowZonePai=" + this.lowZonePai + ", paiList=" + this.paiList + ", hrReport=" + this.hrReport + ")";
    }
}
