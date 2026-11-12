package com.xiaomi.fit.fitness.export.data.item;

import com.google.gson.annotations.SerializedName;
import com.xiaomi.fit.fitness.export.data.aggregation.DailyPaiReport;
import com.xiaomi.fitness.common.utils.TimeUtils;
import com.xiaomi.hm.health.bt.sdk.data.PaiData;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0012\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0016\u0018\u00002\u00020\u0001B7\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\u0007\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0005\u0012\u0006\u0010\t\u001a\u00020\u0005¢\u0006\u0004\b\n\u0010\u000bB\u0011\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\n\u0010\fJ\b\u0010\u0016\u001a\u00020\u0003H\u0016J\u0010\u0010\u0017\u001a\u00020\u00182\u0006\u0010\u0002\u001a\u00020\u0003H\u0016J\u0006\u0010\u0019\u001a\u00020\u001aJ\b\u0010\u001b\u001a\u00020\u001cH\u0016R\u001e\u0010\u0002\u001a\u00020\u00038\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\r\u0010\u000e\"\u0004\b\u000f\u0010\fR\u0016\u0010\u0004\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0016\u0010\u0006\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0011R\u0016\u0010\u0007\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0011R\u0016\u0010\b\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0011R\u0016\u0010\t\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0011¨\u0006\u001d"}, d2 = {"Lcom/xiaomi/fit/fitness/export/data/item/OneDayPaiReport;", "Lcom/xiaomi/fit/fitness/export/data/item/DailyRecordItem;", "time", "", "pai", "", PaiData.TOTAL_PAI, PaiData.HIGH_ZONE_PAI, PaiData.MEDIUM_ZONE_PAI, PaiData.LOW_ZONE_PAI, "<init>", "(JFFFFF)V", "(J)V", "getTime", "()J", "setTime", "getPai", "()F", "getTotalPai", "getHighZonePai", "getMediumZonePai", "getLowZonePai", "getTimestamp", "setTimestamp", "", "convertToDailyPaiReport", "Lcom/xiaomi/fit/fitness/export/data/aggregation/DailyPaiReport;", "toString", "", "fitness-data-export_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public class OneDayPaiReport extends DailyRecordItem {

    @SerializedName("high_zone_pai")
    private final float highZonePai;

    @SerializedName("low_zone_pai")
    private final float lowZonePai;

    @SerializedName("medium_zone_pai")
    private final float mediumZonePai;

    @SerializedName("daily_pai")
    private final float pai;

    @SerializedName("date_time")
    private long time;

    @SerializedName("total_pai")
    private final float totalPai;

    public OneDayPaiReport(long j, float f, float f2, float f3, float f4, float f5) {
        super(null);
        this.time = j;
        this.pai = f;
        this.totalPai = f2;
        this.highZonePai = f3;
        this.mediumZonePai = f4;
        this.lowZonePai = f5;
    }

    @NotNull
    public final DailyPaiReport convertToDailyPaiReport() {
        DailyPaiReport dailyPaiReport = new DailyPaiReport(this.time, getSid());
        dailyPaiReport.setPai(this.pai);
        dailyPaiReport.setHighZonePai(this.highZonePai);
        dailyPaiReport.setLowZonePai(this.lowZonePai);
        dailyPaiReport.setMediumZonePai(this.mediumZonePai);
        dailyPaiReport.setTotalPai(this.totalPai);
        return dailyPaiReport;
    }

    public final float getHighZonePai() {
        return this.highZonePai;
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

    public final long getTime() {
        return this.time;
    }

    @Override // com.xiaomi.fit.fitness.export.data.ITimeData
    public long getTimestamp() {
        return this.time;
    }

    public final float getTotalPai() {
        return this.totalPai;
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
        long j = this.time;
        return "OneDayPaiReport(time=" + j + ",time=" + TimeUtils.formatDate("yyyy-MM-dd", Long.valueOf(((long) 1000) * j)) + ", sid=" + getSid() + ", pai=" + this.pai + ", totalPai=" + this.totalPai + ", highZonePai=" + this.highZonePai + ", mediumZonePai=" + this.mediumZonePai + ", lowZonePai=" + this.lowZonePai + ")";
    }

    public OneDayPaiReport(long j) {
        this(j, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f);
    }
}
