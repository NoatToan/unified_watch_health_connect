package com.xiaomi.hm.health.bt.profile.gdsp.gps;

import com.baidu.ocr.sdk.utils.LogUtil;
import java.io.Serializable;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes18.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\b\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\r\b\u0086\b\u0018\u0000 \u001b2\u00020\u0001:\u0001\u001bB\u001f\u0012\u0006\u0010\b\u001a\u00020\u0004\u0012\u0006\u0010\t\u001a\u00020\u0004\u0012\u0006\u0010\n\u001a\u00020\u0004¢\u0006\u0004\b\u0019\u0010\u001aJ\b\u0010\u0003\u001a\u00020\u0002H\u0016J\t\u0010\u0005\u001a\u00020\u0004HÆ\u0003J\t\u0010\u0006\u001a\u00020\u0004HÆ\u0003J\t\u0010\u0007\u001a\u00020\u0004HÆ\u0003J'\u0010\u000b\u001a\u00020\u00002\b\b\u0002\u0010\b\u001a\u00020\u00042\b\b\u0002\u0010\t\u001a\u00020\u00042\b\b\u0002\u0010\n\u001a\u00020\u0004HÆ\u0001J\t\u0010\f\u001a\u00020\u0004HÖ\u0001J\u0013\u0010\u0010\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\rHÖ\u0003R\u0019\u0010\b\u001a\u00020\u00048\u0006@\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014R\u0019\u0010\t\u001a\u00020\u00048\u0006@\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0012\u001a\u0004\b\u0016\u0010\u0014R\u0019\u0010\n\u001a\u00020\u00048\u0006@\u0006¢\u0006\f\n\u0004\b\u0017\u0010\u0012\u001a\u0004\b\u0018\u0010\u0014¨\u0006\u001c"}, d2 = {"Lcom/xiaomi/hm/health/bt/profile/gdsp/gps/HeartRateStatistics;", "Ljava/io/Serializable;", "", "toString", "", "component1", "component2", "component3", "avg", "max", "min", "copy", "hashCode", "", "other", "", "equals", "a", LogUtil.I, "getAvg", "()I", "b", "getMax", "c", "getMin", "<init>", "(III)V", "Companion", "bluetooth_release"}, k = 1, mv = {1, 5, 1})
public final /* data */ class HeartRateStatistics implements Serializable {
    private static final long serialVersionUID = 1;

    /* JADX INFO: renamed from: a, reason: from kotlin metadata and from toString */
    private final int avg;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata and from toString */
    private final int max;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata and from toString */
    private final int min;

    public HeartRateStatistics(int i, int i2, int i3) {
        this.avg = i;
        this.max = i2;
        this.min = i3;
    }

    public static /* synthetic */ HeartRateStatistics copy$default(HeartRateStatistics heartRateStatistics, int i, int i2, int i3, int i4, Object obj) {
        if ((i4 & 1) != 0) {
            i = heartRateStatistics.avg;
        }
        if ((i4 & 2) != 0) {
            i2 = heartRateStatistics.max;
        }
        if ((i4 & 4) != 0) {
            i3 = heartRateStatistics.min;
        }
        return heartRateStatistics.copy(i, i2, i3);
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
    public final HeartRateStatistics copy(int avg, int max, int min) {
        return new HeartRateStatistics(avg, max, min);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof HeartRateStatistics)) {
            return false;
        }
        HeartRateStatistics heartRateStatistics = (HeartRateStatistics) other;
        return this.avg == heartRateStatistics.avg && this.max == heartRateStatistics.max && this.min == heartRateStatistics.min;
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
        return "HeartRateStatistics(avg=" + this.avg + ", max=" + this.max + ", min=" + this.min + ')';
    }
}
