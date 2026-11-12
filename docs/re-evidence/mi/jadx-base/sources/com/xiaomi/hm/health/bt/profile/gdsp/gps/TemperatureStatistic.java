package com.xiaomi.hm.health.bt.profile.gdsp.gps;

import com.xiaomi.fitness.devicesettings.huami.vibratemode.VibrateModeSetFragment;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0007\n\u0002\b\f\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\u001d\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003¢\u0006\u0002\u0010\u0006J\t\u0010\u000b\u001a\u00020\u0003HÆ\u0003J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\t\u0010\r\u001a\u00020\u0003HÆ\u0003J'\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0012\u001a\u00020\u0013HÖ\u0001J\t\u0010\u0014\u001a\u00020\u0015HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\bR\u0011\u0010\u0005\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\b¨\u0006\u0016"}, d2 = {"Lcom/xiaomi/hm/health/bt/profile/gdsp/gps/TemperatureStatistic;", "", "avg", "", VibrateModeSetFragment.MAX, "min", "(FFF)V", "getAvg", "()F", "getMax", "getMin", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "", "toString", "", "bluetooth_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
public final /* data */ class TemperatureStatistic {
    private final float avg;
    private final float max;
    private final float min;

    public TemperatureStatistic(float f, float f2, float f3) {
        this.avg = f;
        this.max = f2;
        this.min = f3;
    }

    public static /* synthetic */ TemperatureStatistic copy$default(TemperatureStatistic temperatureStatistic, float f, float f2, float f3, int i, Object obj) {
        if ((i & 1) != 0) {
            f = temperatureStatistic.avg;
        }
        if ((i & 2) != 0) {
            f2 = temperatureStatistic.max;
        }
        if ((i & 4) != 0) {
            f3 = temperatureStatistic.min;
        }
        return temperatureStatistic.copy(f, f2, f3);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final float getAvg() {
        return this.avg;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final float getMax() {
        return this.max;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final float getMin() {
        return this.min;
    }

    @NotNull
    public final TemperatureStatistic copy(float avg, float max, float min) {
        return new TemperatureStatistic(avg, max, min);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof TemperatureStatistic)) {
            return false;
        }
        TemperatureStatistic temperatureStatistic = (TemperatureStatistic) other;
        return Float.compare(this.avg, temperatureStatistic.avg) == 0 && Float.compare(this.max, temperatureStatistic.max) == 0 && Float.compare(this.min, temperatureStatistic.min) == 0;
    }

    public final float getAvg() {
        return this.avg;
    }

    public final float getMax() {
        return this.max;
    }

    public final float getMin() {
        return this.min;
    }

    public int hashCode() {
        return (((Float.hashCode(this.avg) * 31) + Float.hashCode(this.max)) * 31) + Float.hashCode(this.min);
    }

    @NotNull
    public String toString() {
        return "TemperatureStatistic(avg=" + this.avg + ", max=" + this.max + ", min=" + this.min + ')';
    }
}
