package com.xiaomi.hm.health.bt.profile.gdsp.gps;

import com.baidu.ocr.sdk.utils.LogUtil;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes18.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\f\b\u0086\b\u0018\u00002\u00020\u0001B%\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0002\u0012\b\b\u0002\u0010\b\u001a\u00020\u0002¢\u0006\u0004\b\u0018\u0010\u0019J\t\u0010\u0003\u001a\u00020\u0002HÆ\u0003J\t\u0010\u0004\u001a\u00020\u0002HÆ\u0003J\t\u0010\u0005\u001a\u00020\u0002HÆ\u0003J'\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0006\u001a\u00020\u00022\b\b\u0002\u0010\u0007\u001a\u00020\u00022\b\b\u0002\u0010\b\u001a\u00020\u0002HÆ\u0001J\t\u0010\u000b\u001a\u00020\nHÖ\u0001J\t\u0010\f\u001a\u00020\u0002HÖ\u0001J\u0013\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\u0001HÖ\u0003R\u0019\u0010\u0006\u001a\u00020\u00028\u0006@\u0006¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013R\u0019\u0010\u0007\u001a\u00020\u00028\u0006@\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0011\u001a\u0004\b\u0015\u0010\u0013R\u0019\u0010\b\u001a\u00020\u00028\u0006@\u0006¢\u0006\f\n\u0004\b\u0016\u0010\u0011\u001a\u0004\b\u0017\u0010\u0013¨\u0006\u001a"}, d2 = {"Lcom/xiaomi/hm/health/bt/profile/gdsp/gps/SportPressureStatistic;", "", "", "component1", "component2", "component3", "avg", "max", "min", "copy", "", "toString", "hashCode", "other", "", "equals", "a", LogUtil.I, "getAvg", "()I", "b", "getMax", "c", "getMin", "<init>", "(III)V", "bluetooth_release"}, k = 1, mv = {1, 5, 1})
public final /* data */ class SportPressureStatistic {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata and from toString */
    private final int avg;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata and from toString */
    private final int max;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata and from toString */
    private final int min;

    public SportPressureStatistic() {
        this(0, 0, 0, 7, null);
    }

    public SportPressureStatistic(int i, int i2, int i3) {
        this.avg = i;
        this.max = i2;
        this.min = i3;
    }

    public static /* synthetic */ SportPressureStatistic copy$default(SportPressureStatistic sportPressureStatistic, int i, int i2, int i3, int i4, Object obj) {
        if ((i4 & 1) != 0) {
            i = sportPressureStatistic.avg;
        }
        if ((i4 & 2) != 0) {
            i2 = sportPressureStatistic.max;
        }
        if ((i4 & 4) != 0) {
            i3 = sportPressureStatistic.min;
        }
        return sportPressureStatistic.copy(i, i2, i3);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final int getAvg() {
        return this.avg;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final int getMax() {
        return this.max;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final int getMin() {
        return this.min;
    }

    @NotNull
    public final SportPressureStatistic copy(int avg, int max, int min) {
        return new SportPressureStatistic(avg, max, min);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof SportPressureStatistic)) {
            return false;
        }
        SportPressureStatistic sportPressureStatistic = (SportPressureStatistic) other;
        return this.avg == sportPressureStatistic.avg && this.max == sportPressureStatistic.max && this.min == sportPressureStatistic.min;
    }

    public final int getAvg() {
        return this.avg;
    }

    public final int getMax() {
        return this.max;
    }

    public final int getMin() {
        return this.min;
    }

    public int hashCode() {
        return (((this.avg * 31) + this.max) * 31) + this.min;
    }

    @NotNull
    public String toString() {
        return "SportPressureStatistic(avg=" + this.avg + ", max=" + this.max + ", min=" + this.min + ')';
    }

    public /* synthetic */ SportPressureStatistic(int i, int i2, int i3, int i4, DefaultConstructorMarker defaultConstructorMarker) {
        this((i4 & 1) != 0 ? -1 : i, (i4 & 2) != 0 ? -1 : i2, (i4 & 4) != 0 ? -1 : i3);
    }
}
