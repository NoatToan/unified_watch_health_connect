package com.huami.mifit.sportlib.model;

import androidx.annotation.Keep;
import com.baidu.ocr.sdk.utils.LogUtil;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes11.dex */
@Keep
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u000b\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u000e\b\u0087\b\u0018\u00002\u00020\u0001B/\u0012\u0006\u0010\b\u001a\u00020\u0002\u0012\u0006\u0010\t\u001a\u00020\u0002\u0012\u0006\u0010\n\u001a\u00020\u0002\u0012\u0006\u0010\u000b\u001a\u00020\u0002\u0012\u0006\u0010\f\u001a\u00020\u0002¢\u0006\u0004\b\u001e\u0010\u001fJ\t\u0010\u0003\u001a\u00020\u0002HÆ\u0003J\t\u0010\u0004\u001a\u00020\u0002HÆ\u0003J\t\u0010\u0005\u001a\u00020\u0002HÆ\u0003J\t\u0010\u0006\u001a\u00020\u0002HÆ\u0003J\t\u0010\u0007\u001a\u00020\u0002HÆ\u0003J;\u0010\r\u001a\u00020\u00002\b\b\u0002\u0010\b\u001a\u00020\u00022\b\b\u0002\u0010\t\u001a\u00020\u00022\b\b\u0002\u0010\n\u001a\u00020\u00022\b\b\u0002\u0010\u000b\u001a\u00020\u00022\b\b\u0002\u0010\f\u001a\u00020\u0002HÆ\u0001J\t\u0010\u000f\u001a\u00020\u000eHÖ\u0001J\t\u0010\u0010\u001a\u00020\u0002HÖ\u0001J\u0013\u0010\u0013\u001a\u00020\u00122\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0003R\u0019\u0010\b\u001a\u00020\u00028\u0006@\u0006¢\u0006\f\n\u0004\b\b\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016R\u0019\u0010\t\u001a\u00020\u00028\u0006@\u0006¢\u0006\f\n\u0004\b\t\u0010\u0014\u001a\u0004\b\u0017\u0010\u0016R\u0019\u0010\n\u001a\u00020\u00028\u0006@\u0006¢\u0006\f\n\u0004\b\n\u0010\u0014\u001a\u0004\b\u0018\u0010\u0016R\"\u0010\u000b\u001a\u00020\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u000b\u0010\u0014\u001a\u0004\b\u0019\u0010\u0016\"\u0004\b\u001a\u0010\u001bR\"\u0010\f\u001a\u00020\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\f\u0010\u0014\u001a\u0004\b\u001c\u0010\u0016\"\u0004\b\u001d\u0010\u001b¨\u0006 "}, d2 = {"Lcom/huami/mifit/sportlib/model/HeartRateZone;", "", "", "component1", "component2", "component3", "component4", "component5", "zoneType", "zoneStart", "zoneEnd", "costTime", "percent", "copy", "", "toString", "hashCode", "other", "", "equals", LogUtil.I, "getZoneType", "()I", "getZoneStart", "getZoneEnd", "getCostTime", "setCostTime", "(I)V", "getPercent", "setPercent", "<init>", "(IIIII)V", "sportlib_release"}, k = 1, mv = {1, 5, 1})
public final /* data */ class HeartRateZone {
    private int costTime;
    private int percent;
    private final int zoneEnd;
    private final int zoneStart;
    private final int zoneType;

    public HeartRateZone(int i, int i2, int i3, int i4, int i5) {
        this.zoneType = i;
        this.zoneStart = i2;
        this.zoneEnd = i3;
        this.costTime = i4;
        this.percent = i5;
    }

    public static /* synthetic */ HeartRateZone copy$default(HeartRateZone heartRateZone, int i, int i2, int i3, int i4, int i5, int i6, Object obj) {
        if ((i6 & 1) != 0) {
            i = heartRateZone.zoneType;
        }
        if ((i6 & 2) != 0) {
            i2 = heartRateZone.zoneStart;
        }
        int i7 = i2;
        if ((i6 & 4) != 0) {
            i3 = heartRateZone.zoneEnd;
        }
        int i8 = i3;
        if ((i6 & 8) != 0) {
            i4 = heartRateZone.costTime;
        }
        int i9 = i4;
        if ((i6 & 16) != 0) {
            i5 = heartRateZone.percent;
        }
        return heartRateZone.copy(i, i7, i8, i9, i5);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final int getZoneType() {
        return this.zoneType;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final int getZoneStart() {
        return this.zoneStart;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final int getZoneEnd() {
        return this.zoneEnd;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final int getCostTime() {
        return this.costTime;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final int getPercent() {
        return this.percent;
    }

    @NotNull
    public final HeartRateZone copy(int zoneType, int zoneStart, int zoneEnd, int costTime, int percent) {
        return new HeartRateZone(zoneType, zoneStart, zoneEnd, costTime, percent);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof HeartRateZone)) {
            return false;
        }
        HeartRateZone heartRateZone = (HeartRateZone) other;
        return this.zoneType == heartRateZone.zoneType && this.zoneStart == heartRateZone.zoneStart && this.zoneEnd == heartRateZone.zoneEnd && this.costTime == heartRateZone.costTime && this.percent == heartRateZone.percent;
    }

    public final int getCostTime() {
        return this.costTime;
    }

    public final int getPercent() {
        return this.percent;
    }

    public final int getZoneEnd() {
        return this.zoneEnd;
    }

    public final int getZoneStart() {
        return this.zoneStart;
    }

    public final int getZoneType() {
        return this.zoneType;
    }

    public int hashCode() {
        return (((((((this.zoneType * 31) + this.zoneStart) * 31) + this.zoneEnd) * 31) + this.costTime) * 31) + this.percent;
    }

    public final void setCostTime(int i) {
        this.costTime = i;
    }

    public final void setPercent(int i) {
        this.percent = i;
    }

    @NotNull
    public String toString() {
        return "HeartRateZone(zoneType=" + this.zoneType + ", zoneStart=" + this.zoneStart + ", zoneEnd=" + this.zoneEnd + ", costTime=" + this.costTime + ", percent=" + this.percent + ")";
    }
}
