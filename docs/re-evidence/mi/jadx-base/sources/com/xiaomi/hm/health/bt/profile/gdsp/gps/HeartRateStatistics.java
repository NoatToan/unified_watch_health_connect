package com.xiaomi.hm.health.bt.profile.gdsp.gps;

import com.xiaomi.fitness.devicesettings.huami.vibratemode.VibrateModeSetFragment;
import java.io.Serializable;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\f\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0086\b\u0018\u0000 \u00162\u00020\u0001:\u0001\u0016B\u001d\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003¢\u0006\u0002\u0010\u0006J\t\u0010\u000b\u001a\u00020\u0003HÆ\u0003J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\t\u0010\r\u001a\u00020\u0003HÆ\u0003J'\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0012HÖ\u0003J\t\u0010\u0013\u001a\u00020\u0003HÖ\u0001J\b\u0010\u0014\u001a\u00020\u0015H\u0016R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\bR\u0011\u0010\u0005\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\b¨\u0006\u0017"}, d2 = {"Lcom/xiaomi/hm/health/bt/profile/gdsp/gps/HeartRateStatistics;", "Ljava/io/Serializable;", "avg", "", VibrateModeSetFragment.MAX, "min", "(III)V", "getAvg", "()I", "getMax", "getMin", "component1", "component2", "component3", "copy", "equals", "", "other", "", "hashCode", "toString", "", "Companion", "bluetooth_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
public final /* data */ class HeartRateStatistics implements Serializable {
    private static final long serialVersionUID = 1;
    private final int avg;
    private final int max;
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
        return (((Integer.hashCode(this.avg) * 31) + Integer.hashCode(this.max)) * 31) + Integer.hashCode(this.min);
    }

    @NotNull
    public String toString() {
        return "HeartRateStatistics(avg=" + this.avg + ", max=" + this.max + ", min=" + this.min + ')';
    }
}
