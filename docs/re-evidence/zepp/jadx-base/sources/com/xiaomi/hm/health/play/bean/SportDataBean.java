package com.xiaomi.hm.health.play.bean;

import com.baidu.ocr.sdk.utils.LogUtil;
import defpackage.b;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes21.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u0007\n\u0002\b\u0011\n\u0002\u0010\u000b\n\u0002\b\u0015\b\u0086\b\u0018\u00002\u00020\u0001BO\u0012\u0006\u0010\u000f\u001a\u00020\u0002\u0012\u0006\u0010\u0010\u001a\u00020\u0004\u0012\u0006\u0010\u0011\u001a\u00020\u0006\u0012\u0006\u0010\u0012\u001a\u00020\u0004\u0012\u0006\u0010\u0013\u001a\u00020\u0004\u0012\u0006\u0010\u0014\u001a\u00020\n\u0012\u0006\u0010\u0015\u001a\u00020\u0004\u0012\u0006\u0010\u0016\u001a\u00020\u0004\u0012\u0006\u0010\u0017\u001a\u00020\u0004¢\u0006\u0004\b/\u00100J\t\u0010\u0003\u001a\u00020\u0002HÆ\u0003J\t\u0010\u0005\u001a\u00020\u0004HÆ\u0003J\t\u0010\u0007\u001a\u00020\u0006HÆ\u0003J\t\u0010\b\u001a\u00020\u0004HÆ\u0003J\t\u0010\t\u001a\u00020\u0004HÆ\u0003J\t\u0010\u000b\u001a\u00020\nHÆ\u0003J\t\u0010\f\u001a\u00020\u0004HÆ\u0003J\t\u0010\r\u001a\u00020\u0004HÆ\u0003J\t\u0010\u000e\u001a\u00020\u0004HÆ\u0003Jc\u0010\u0018\u001a\u00020\u00002\b\b\u0002\u0010\u000f\u001a\u00020\u00022\b\b\u0002\u0010\u0010\u001a\u00020\u00042\b\b\u0002\u0010\u0011\u001a\u00020\u00062\b\b\u0002\u0010\u0012\u001a\u00020\u00042\b\b\u0002\u0010\u0013\u001a\u00020\u00042\b\b\u0002\u0010\u0014\u001a\u00020\n2\b\b\u0002\u0010\u0015\u001a\u00020\u00042\b\b\u0002\u0010\u0016\u001a\u00020\u00042\b\b\u0002\u0010\u0017\u001a\u00020\u0004HÆ\u0001J\t\u0010\u0019\u001a\u00020\u0006HÖ\u0001J\t\u0010\u001a\u001a\u00020\u0004HÖ\u0001J\u0013\u0010\u001d\u001a\u00020\u001c2\b\u0010\u001b\u001a\u0004\u0018\u00010\u0001HÖ\u0003R\u0019\u0010\u000f\u001a\u00020\u00028\u0006@\u0006¢\u0006\f\n\u0004\b\u000f\u0010\u001e\u001a\u0004\b\u001f\u0010 R\u0019\u0010\u0010\u001a\u00020\u00048\u0006@\u0006¢\u0006\f\n\u0004\b\u0010\u0010!\u001a\u0004\b\"\u0010#R\u0019\u0010\u0011\u001a\u00020\u00068\u0006@\u0006¢\u0006\f\n\u0004\b\u0011\u0010$\u001a\u0004\b%\u0010&R\u0019\u0010\u0012\u001a\u00020\u00048\u0006@\u0006¢\u0006\f\n\u0004\b\u0012\u0010!\u001a\u0004\b'\u0010#R\u0019\u0010\u0013\u001a\u00020\u00048\u0006@\u0006¢\u0006\f\n\u0004\b\u0013\u0010!\u001a\u0004\b(\u0010#R\u0019\u0010\u0014\u001a\u00020\n8\u0006@\u0006¢\u0006\f\n\u0004\b\u0014\u0010)\u001a\u0004\b*\u0010+R\u0019\u0010\u0015\u001a\u00020\u00048\u0006@\u0006¢\u0006\f\n\u0004\b\u0015\u0010!\u001a\u0004\b,\u0010#R\u0019\u0010\u0016\u001a\u00020\u00048\u0006@\u0006¢\u0006\f\n\u0004\b\u0016\u0010!\u001a\u0004\b-\u0010#R\u0019\u0010\u0017\u001a\u00020\u00048\u0006@\u0006¢\u0006\f\n\u0004\b\u0017\u0010!\u001a\u0004\b.\u0010#¨\u00061"}, d2 = {"Lcom/xiaomi/hm/health/play/bean/SportDataBean;", "", "", "component1", "", "component2", "", "component3", "component4", "component5", "", "component6", "component7", "component8", "component9", "trackId", "dataType", "date", "daysCount", "distance", "pace", "costTime", "costCal", "avgHr", "copy", "toString", "hashCode", "other", "", "equals", "J", "getTrackId", "()J", LogUtil.I, "getDataType", "()I", "Ljava/lang/String;", "getDate", "()Ljava/lang/String;", "getDaysCount", "getDistance", "F", "getPace", "()F", "getCostTime", "getCostCal", "getAvgHr", "<init>", "(JILjava/lang/String;IIFIII)V", "app_midongPlayRelease"}, k = 1, mv = {1, 5, 1})
public final /* data */ class SportDataBean {
    private final int avgHr;
    private final int costCal;
    private final int costTime;
    private final int dataType;

    @NotNull
    private final String date;
    private final int daysCount;
    private final int distance;
    private final float pace;
    private final long trackId;

    public SportDataBean(long j, int i, @NotNull String str, int i2, int i3, float f, int i4, int i5, int i6) {
        this.trackId = j;
        this.dataType = i;
        this.date = str;
        this.daysCount = i2;
        this.distance = i3;
        this.pace = f;
        this.costTime = i4;
        this.costCal = i5;
        this.avgHr = i6;
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final long getTrackId() {
        return this.trackId;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final int getDataType() {
        return this.dataType;
    }

    @NotNull
    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getDate() {
        return this.date;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final int getDaysCount() {
        return this.daysCount;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final int getDistance() {
        return this.distance;
    }

    /* JADX INFO: renamed from: component6, reason: from getter */
    public final float getPace() {
        return this.pace;
    }

    /* JADX INFO: renamed from: component7, reason: from getter */
    public final int getCostTime() {
        return this.costTime;
    }

    /* JADX INFO: renamed from: component8, reason: from getter */
    public final int getCostCal() {
        return this.costCal;
    }

    /* JADX INFO: renamed from: component9, reason: from getter */
    public final int getAvgHr() {
        return this.avgHr;
    }

    @NotNull
    public final SportDataBean copy(long trackId, int dataType, @NotNull String date, int daysCount, int distance, float pace, int costTime, int costCal, int avgHr) {
        return new SportDataBean(trackId, dataType, date, daysCount, distance, pace, costTime, costCal, avgHr);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof SportDataBean)) {
            return false;
        }
        SportDataBean sportDataBean = (SportDataBean) other;
        return this.trackId == sportDataBean.trackId && this.dataType == sportDataBean.dataType && Intrinsics.areEqual(this.date, sportDataBean.date) && this.daysCount == sportDataBean.daysCount && this.distance == sportDataBean.distance && Intrinsics.areEqual((Object) Float.valueOf(this.pace), (Object) Float.valueOf(sportDataBean.pace)) && this.costTime == sportDataBean.costTime && this.costCal == sportDataBean.costCal && this.avgHr == sportDataBean.avgHr;
    }

    public final int getAvgHr() {
        return this.avgHr;
    }

    public final int getCostCal() {
        return this.costCal;
    }

    public final int getCostTime() {
        return this.costTime;
    }

    public final int getDataType() {
        return this.dataType;
    }

    @NotNull
    public final String getDate() {
        return this.date;
    }

    public final int getDaysCount() {
        return this.daysCount;
    }

    public final int getDistance() {
        return this.distance;
    }

    public final float getPace() {
        return this.pace;
    }

    public final long getTrackId() {
        return this.trackId;
    }

    public int hashCode() {
        return (((((((((((((((b.a(this.trackId) * 31) + this.dataType) * 31) + this.date.hashCode()) * 31) + this.daysCount) * 31) + this.distance) * 31) + Float.floatToIntBits(this.pace)) * 31) + this.costTime) * 31) + this.costCal) * 31) + this.avgHr;
    }

    @NotNull
    public String toString() {
        return "SportDataBean(trackId=" + this.trackId + ", dataType=" + this.dataType + ", date=" + this.date + ", daysCount=" + this.daysCount + ", distance=" + this.distance + ", pace=" + this.pace + ", costTime=" + this.costTime + ", costCal=" + this.costCal + ", avgHr=" + this.avgHr + ")";
    }
}
