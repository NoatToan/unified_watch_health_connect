package com.xiaomi.hm.health.healthdata.ui.vo.stress;

import com.baidu.ocr.sdk.utils.LogUtil;
import com.google.android.gms.common.GoogleApiAvailabilityLight;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes21.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\t\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u001c\b\u0086\b\u0018\u00002\u00020\u0001B/\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0002\u0012\b\b\u0002\u0010\b\u001a\u00020\u0002\u0012\b\b\u0002\u0010\t\u001a\u00020\u0002\u0012\b\b\u0002\u0010\n\u001a\u00020\u0002¢\u0006\u0004\b*\u0010+J\t\u0010\u0003\u001a\u00020\u0002HÆ\u0003J\t\u0010\u0004\u001a\u00020\u0002HÆ\u0003J\t\u0010\u0005\u001a\u00020\u0002HÆ\u0003J\t\u0010\u0006\u001a\u00020\u0002HÆ\u0003J1\u0010\u000b\u001a\u00020\u00002\b\b\u0002\u0010\u0007\u001a\u00020\u00022\b\b\u0002\u0010\b\u001a\u00020\u00022\b\b\u0002\u0010\t\u001a\u00020\u00022\b\b\u0002\u0010\n\u001a\u00020\u0002HÆ\u0001J\t\u0010\r\u001a\u00020\fHÖ\u0001J\t\u0010\u000e\u001a\u00020\u0002HÖ\u0001J\u0013\u0010\u0011\u001a\u00020\u00102\b\u0010\u000f\u001a\u0004\u0018\u00010\u0001HÖ\u0003R\u0019\u0010\u0007\u001a\u00020\u00028\u0006@\u0006¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015R\u0019\u0010\b\u001a\u00020\u00028\u0006@\u0006¢\u0006\f\n\u0004\b\u0016\u0010\u0013\u001a\u0004\b\u0017\u0010\u0015R\u0019\u0010\t\u001a\u00020\u00028\u0006@\u0006¢\u0006\f\n\u0004\b\u0018\u0010\u0013\u001a\u0004\b\u0019\u0010\u0015R\u0019\u0010\n\u001a\u00020\u00028\u0006@\u0006¢\u0006\f\n\u0004\b\u001a\u0010\u0013\u001a\u0004\b\u001b\u0010\u0015R$\u0010\"\u001a\u0004\u0018\u00010\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u001c\u0010\u001d\u001a\u0004\b\u001e\u0010\u001f\"\u0004\b \u0010!R$\u0010)\u001a\u0004\u0018\u00010\f8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b#\u0010$\u001a\u0004\b%\u0010&\"\u0004\b'\u0010(¨\u0006,"}, d2 = {"Lcom/xiaomi/hm/health/healthdata/ui/vo/stress/StressStatisticsInfo;", "", "", "component1", "component2", "component3", "component4", "max", "min", "avg", "singleCount", "copy", "", "toString", "hashCode", "other", "", "equals", "a", LogUtil.I, "getMax", "()I", "b", "getMin", "c", "getAvg", GoogleApiAvailabilityLight.a, "getSingleCount", "e", "Ljava/lang/Integer;", "getLatestValue", "()Ljava/lang/Integer;", "setLatestValue", "(Ljava/lang/Integer;)V", "latestValue", "f", "Ljava/lang/String;", "getLatestDate", "()Ljava/lang/String;", "setLatestDate", "(Ljava/lang/String;)V", "latestDate", "<init>", "(IIII)V", "app_midongPlayRelease"}, k = 1, mv = {1, 5, 1})
public final /* data */ class StressStatisticsInfo {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata and from toString */
    private final int max;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata and from toString */
    private final int min;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata and from toString */
    private final int avg;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata and from toString */
    private final int singleCount;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    @Nullable
    private Integer latestValue;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    @Nullable
    private String latestDate;

    public StressStatisticsInfo() {
        this(0, 0, 0, 0, 15, null);
    }

    public StressStatisticsInfo(int i, int i2, int i3, int i4) {
        this.max = i;
        this.min = i2;
        this.avg = i3;
        this.singleCount = i4;
    }

    public static /* synthetic */ StressStatisticsInfo copy$default(StressStatisticsInfo stressStatisticsInfo, int i, int i2, int i3, int i4, int i5, Object obj) {
        if ((i5 & 1) != 0) {
            i = stressStatisticsInfo.max;
        }
        if ((i5 & 2) != 0) {
            i2 = stressStatisticsInfo.min;
        }
        if ((i5 & 4) != 0) {
            i3 = stressStatisticsInfo.avg;
        }
        if ((i5 & 8) != 0) {
            i4 = stressStatisticsInfo.singleCount;
        }
        return stressStatisticsInfo.copy(i, i2, i3, i4);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final int getMax() {
        return this.max;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final int getMin() {
        return this.min;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final int getAvg() {
        return this.avg;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final int getSingleCount() {
        return this.singleCount;
    }

    @NotNull
    public final StressStatisticsInfo copy(int max, int min, int avg, int singleCount) {
        return new StressStatisticsInfo(max, min, avg, singleCount);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof StressStatisticsInfo)) {
            return false;
        }
        StressStatisticsInfo stressStatisticsInfo = (StressStatisticsInfo) other;
        return this.max == stressStatisticsInfo.max && this.min == stressStatisticsInfo.min && this.avg == stressStatisticsInfo.avg && this.singleCount == stressStatisticsInfo.singleCount;
    }

    public final int getAvg() {
        return this.avg;
    }

    @Nullable
    public final String getLatestDate() {
        return this.latestDate;
    }

    @Nullable
    public final Integer getLatestValue() {
        return this.latestValue;
    }

    public final int getMax() {
        return this.max;
    }

    public final int getMin() {
        return this.min;
    }

    public final int getSingleCount() {
        return this.singleCount;
    }

    public int hashCode() {
        return (((((this.max * 31) + this.min) * 31) + this.avg) * 31) + this.singleCount;
    }

    public final void setLatestDate(@Nullable String str) {
        this.latestDate = str;
    }

    public final void setLatestValue(@Nullable Integer num) {
        this.latestValue = num;
    }

    @NotNull
    public String toString() {
        return "StressStatisticsInfo(max=" + this.max + ", min=" + this.min + ", avg=" + this.avg + ", singleCount=" + this.singleCount + ")";
    }

    public /* synthetic */ StressStatisticsInfo(int i, int i2, int i3, int i4, int i5, DefaultConstructorMarker defaultConstructorMarker) {
        this((i5 & 1) != 0 ? 0 : i, (i5 & 2) != 0 ? 0 : i2, (i5 & 4) != 0 ? 0 : i3, (i5 & 8) != 0 ? 0 : i4);
    }
}
