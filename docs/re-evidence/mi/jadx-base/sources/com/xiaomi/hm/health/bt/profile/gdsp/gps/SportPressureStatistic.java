package com.xiaomi.hm.health.bt.profile.gdsp.gps;

import com.xiaomi.fitness.devicesettings.huami.vibratemode.VibrateModeSetFragment;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\f\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B#\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0003¢\u0006\u0002\u0010\u0006J\t\u0010\u000b\u001a\u00020\u0003HÆ\u0003J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\t\u0010\r\u001a\u00020\u0003HÆ\u0003J'\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0012\u001a\u00020\u0003HÖ\u0001J\t\u0010\u0013\u001a\u00020\u0014HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\bR\u0011\u0010\u0005\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\b¨\u0006\u0015"}, d2 = {"Lcom/xiaomi/hm/health/bt/profile/gdsp/gps/SportPressureStatistic;", "", "avg", "", VibrateModeSetFragment.MAX, "min", "(III)V", "getAvg", "()I", "getMax", "getMin", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "toString", "", "bluetooth_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
public final /* data */ class SportPressureStatistic {
    private final int avg;
    private final int max;
    private final int min;

    public SportPressureStatistic() {
        this(0, 0, 0, 7, null);
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
        return (((Integer.hashCode(this.avg) * 31) + Integer.hashCode(this.max)) * 31) + Integer.hashCode(this.min);
    }

    @NotNull
    public String toString() {
        return "SportPressureStatistic(avg=" + this.avg + ", max=" + this.max + ", min=" + this.min + ')';
    }

    public SportPressureStatistic(int i, int i2, int i3) {
        this.avg = i;
        this.max = i2;
        this.min = i3;
    }

    public /* synthetic */ SportPressureStatistic(int i, int i2, int i3, int i4, DefaultConstructorMarker defaultConstructorMarker) {
        this((i4 & 1) != 0 ? -1 : i, (i4 & 2) != 0 ? -1 : i2, (i4 & 4) != 0 ? -1 : i3);
    }
}
