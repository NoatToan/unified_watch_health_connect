package com.huami.mifit.sportlib.model;

import androidx.annotation.Keep;
import com.baidu.ocr.sdk.utils.LogUtil;
import defpackage.dz;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes11.dex */
@Keep
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u0006\n\u0002\b\f\n\u0002\u0010\u000e\n\u0002\b\u0012\b\u0087\b\u0018\u00002\u00020\u0001B?\u0012\u0006\u0010\r\u001a\u00020\u0004\u0012\u0006\u0010\u000e\u001a\u00020\u0004\u0012\u0006\u0010\u000f\u001a\u00020\u0004\u0012\u0006\u0010\u0010\u001a\u00020\b\u0012\u0006\u0010\u0011\u001a\u00020\b\u0012\u0006\u0010\u0012\u001a\u00020\u0004\u0012\u0006\u0010\u0013\u001a\u00020\u0004¢\u0006\u0004\b%\u0010&J\u0006\u0010\u0003\u001a\u00020\u0002J\t\u0010\u0005\u001a\u00020\u0004HÆ\u0003J\t\u0010\u0006\u001a\u00020\u0004HÆ\u0003J\t\u0010\u0007\u001a\u00020\u0004HÆ\u0003J\t\u0010\t\u001a\u00020\bHÆ\u0003J\t\u0010\n\u001a\u00020\bHÆ\u0003J\t\u0010\u000b\u001a\u00020\u0004HÆ\u0003J\t\u0010\f\u001a\u00020\u0004HÆ\u0003JO\u0010\u0014\u001a\u00020\u00002\b\b\u0002\u0010\r\u001a\u00020\u00042\b\b\u0002\u0010\u000e\u001a\u00020\u00042\b\b\u0002\u0010\u000f\u001a\u00020\u00042\b\b\u0002\u0010\u0010\u001a\u00020\b2\b\b\u0002\u0010\u0011\u001a\u00020\b2\b\b\u0002\u0010\u0012\u001a\u00020\u00042\b\b\u0002\u0010\u0013\u001a\u00020\u0004HÆ\u0001J\t\u0010\u0016\u001a\u00020\u0015HÖ\u0001J\t\u0010\u0017\u001a\u00020\u0004HÖ\u0001J\u0013\u0010\u0019\u001a\u00020\u00022\b\u0010\u0018\u001a\u0004\u0018\u00010\u0001HÖ\u0003R\u0019\u0010\r\u001a\u00020\u00048\u0006@\u0006¢\u0006\f\n\u0004\b\r\u0010\u001a\u001a\u0004\b\u001b\u0010\u001cR\u0019\u0010\u000e\u001a\u00020\u00048\u0006@\u0006¢\u0006\f\n\u0004\b\u000e\u0010\u001a\u001a\u0004\b\u001d\u0010\u001cR\u0019\u0010\u000f\u001a\u00020\u00048\u0006@\u0006¢\u0006\f\n\u0004\b\u000f\u0010\u001a\u001a\u0004\b\u001e\u0010\u001cR\u0019\u0010\u0010\u001a\u00020\b8\u0006@\u0006¢\u0006\f\n\u0004\b\u0010\u0010\u001f\u001a\u0004\b \u0010!R\u0019\u0010\u0011\u001a\u00020\b8\u0006@\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u001f\u001a\u0004\b\"\u0010!R\u0019\u0010\u0012\u001a\u00020\u00048\u0006@\u0006¢\u0006\f\n\u0004\b\u0012\u0010\u001a\u001a\u0004\b#\u0010\u001cR\u0019\u0010\u0013\u001a\u00020\u00048\u0006@\u0006¢\u0006\f\n\u0004\b\u0013\u0010\u001a\u001a\u0004\b$\u0010\u001c¨\u0006'"}, d2 = {"Lcom/huami/mifit/sportlib/model/KilometreOrMileMarked;", "", "", "isValidMark", "", "component1", "component2", "component3", "", "component4", "component5", "component6", "component7", "disIndex", "disType", "costTime", "markedLat", "markedLongt", "totalTime", CoachSegment.AVG_HR, "copy", "", "toString", "hashCode", "other", "equals", LogUtil.I, "getDisIndex", "()I", "getDisType", "getCostTime", LogUtil.D, "getMarkedLat", "()D", "getMarkedLongt", "getTotalTime", "getAvghr", "<init>", "(IIIDDII)V", "sportlib_release"}, k = 1, mv = {1, 5, 1})
public final /* data */ class KilometreOrMileMarked {
    private final int avghr;
    private final int costTime;
    private final int disIndex;
    private final int disType;
    private final double markedLat;
    private final double markedLongt;
    private final int totalTime;

    public KilometreOrMileMarked(int i, int i2, int i3, double d, double d2, int i4, int i5) {
        this.disIndex = i;
        this.disType = i2;
        this.costTime = i3;
        this.markedLat = d;
        this.markedLongt = d2;
        this.totalTime = i4;
        this.avghr = i5;
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final int getDisIndex() {
        return this.disIndex;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final int getDisType() {
        return this.disType;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final int getCostTime() {
        return this.costTime;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final double getMarkedLat() {
        return this.markedLat;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final double getMarkedLongt() {
        return this.markedLongt;
    }

    /* JADX INFO: renamed from: component6, reason: from getter */
    public final int getTotalTime() {
        return this.totalTime;
    }

    /* JADX INFO: renamed from: component7, reason: from getter */
    public final int getAvghr() {
        return this.avghr;
    }

    @NotNull
    public final KilometreOrMileMarked copy(int disIndex, int disType, int costTime, double markedLat, double markedLongt, int totalTime, int avghr) {
        return new KilometreOrMileMarked(disIndex, disType, costTime, markedLat, markedLongt, totalTime, avghr);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof KilometreOrMileMarked)) {
            return false;
        }
        KilometreOrMileMarked kilometreOrMileMarked = (KilometreOrMileMarked) other;
        return this.disIndex == kilometreOrMileMarked.disIndex && this.disType == kilometreOrMileMarked.disType && this.costTime == kilometreOrMileMarked.costTime && Intrinsics.areEqual((Object) Double.valueOf(this.markedLat), (Object) Double.valueOf(kilometreOrMileMarked.markedLat)) && Intrinsics.areEqual((Object) Double.valueOf(this.markedLongt), (Object) Double.valueOf(kilometreOrMileMarked.markedLongt)) && this.totalTime == kilometreOrMileMarked.totalTime && this.avghr == kilometreOrMileMarked.avghr;
    }

    public final int getAvghr() {
        return this.avghr;
    }

    public final int getCostTime() {
        return this.costTime;
    }

    public final int getDisIndex() {
        return this.disIndex;
    }

    public final int getDisType() {
        return this.disType;
    }

    public final double getMarkedLat() {
        return this.markedLat;
    }

    public final double getMarkedLongt() {
        return this.markedLongt;
    }

    public final int getTotalTime() {
        return this.totalTime;
    }

    public int hashCode() {
        return (((((((((((this.disIndex * 31) + this.disType) * 31) + this.costTime) * 31) + dz.a(this.markedLat)) * 31) + dz.a(this.markedLongt)) * 31) + this.totalTime) * 31) + this.avghr;
    }

    public final boolean isValidMark() {
        return (this.disIndex == -1 || this.costTime == -1) ? false : true;
    }

    @NotNull
    public String toString() {
        return "KilometreOrMileMarked(disIndex=" + this.disIndex + ", disType=" + this.disType + ", costTime=" + this.costTime + ", markedLat=" + this.markedLat + ", markedLongt=" + this.markedLongt + ", totalTime=" + this.totalTime + ", avghr=" + this.avghr + ")";
    }
}
