package com.xiaomi.hm.health.bt.profile.gdsp.gps;

import com.xiaomi.fitness.devicesettings.huami.vibratemode.VibrateModeSetFragment;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\f\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\u001d\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003¢\u0006\u0002\u0010\u0006J\t\u0010\u000b\u001a\u00020\u0003HÆ\u0003J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\t\u0010\r\u001a\u00020\u0003HÆ\u0003J'\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0012\u001a\u00020\u0003HÖ\u0001J\t\u0010\u0013\u001a\u00020\u0014HÖ\u0001R\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\bR\u0011\u0010\u0005\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\b¨\u0006\u0015"}, d2 = {"Lcom/xiaomi/hm/health/bt/profile/gdsp/gps/PowerStatistic;", "", VibrateModeSetFragment.MAX, "", "avg", "power", "(III)V", "getAvg", "()I", "getMax", "getPower", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "toString", "", "bluetooth_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
public final /* data */ class PowerStatistic {
    private final int avg;
    private final int max;
    private final int power;

    public PowerStatistic(int i, int i2, int i3) {
        this.max = i;
        this.avg = i2;
        this.power = i3;
    }

    public static /* synthetic */ PowerStatistic copy$default(PowerStatistic powerStatistic, int i, int i2, int i3, int i4, Object obj) {
        if ((i4 & 1) != 0) {
            i = powerStatistic.max;
        }
        if ((i4 & 2) != 0) {
            i2 = powerStatistic.avg;
        }
        if ((i4 & 4) != 0) {
            i3 = powerStatistic.power;
        }
        return powerStatistic.copy(i, i2, i3);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final int getMax() {
        return this.max;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final int getAvg() {
        return this.avg;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final int getPower() {
        return this.power;
    }

    @NotNull
    public final PowerStatistic copy(int max, int avg, int power) {
        return new PowerStatistic(max, avg, power);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof PowerStatistic)) {
            return false;
        }
        PowerStatistic powerStatistic = (PowerStatistic) other;
        return this.max == powerStatistic.max && this.avg == powerStatistic.avg && this.power == powerStatistic.power;
    }

    public final int getAvg() {
        return this.avg;
    }

    public final int getMax() {
        return this.max;
    }

    public final int getPower() {
        return this.power;
    }

    public int hashCode() {
        return (((Integer.hashCode(this.max) * 31) + Integer.hashCode(this.avg)) * 31) + Integer.hashCode(this.power);
    }

    @NotNull
    public String toString() {
        return "PowerStatistic(max=" + this.max + ", avg=" + this.avg + ", power=" + this.power + ')';
    }
}
