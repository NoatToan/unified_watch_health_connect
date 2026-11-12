package com.xiaomi.hm.health.bt.profile.gdsp.gps;

import com.xiaomi.fitness.devicesettings.huami.vibratemode.VibrateModeSetFragment;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0002\u0010\u0005J\t\u0010\t\u001a\u00020\u0003HÆ\u0003J\t\u0010\n\u001a\u00020\u0003HÆ\u0003J\u001d\u0010\u000b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\f\u001a\u00020\r2\b\u0010\u000e\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u000f\u001a\u00020\u0003HÖ\u0001J\t\u0010\u0010\u001a\u00020\u0011HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007R\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\u0007¨\u0006\u0012"}, d2 = {"Lcom/xiaomi/hm/health/bt/profile/gdsp/gps/Slope;", "", "avg", "", VibrateModeSetFragment.MAX, "(II)V", "getAvg", "()I", "getMax", "component1", "component2", "copy", "equals", "", "other", "hashCode", "toString", "", "bluetooth_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
public final /* data */ class Slope {
    private final int avg;
    private final int max;

    public Slope(int i, int i2) {
        this.avg = i;
        this.max = i2;
    }

    public static /* synthetic */ Slope copy$default(Slope slope, int i, int i2, int i3, Object obj) {
        if ((i3 & 1) != 0) {
            i = slope.avg;
        }
        if ((i3 & 2) != 0) {
            i2 = slope.max;
        }
        return slope.copy(i, i2);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final int getAvg() {
        return this.avg;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final int getMax() {
        return this.max;
    }

    @NotNull
    public final Slope copy(int avg, int max) {
        return new Slope(avg, max);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof Slope)) {
            return false;
        }
        Slope slope = (Slope) other;
        return this.avg == slope.avg && this.max == slope.max;
    }

    public final int getAvg() {
        return this.avg;
    }

    public final int getMax() {
        return this.max;
    }

    public int hashCode() {
        return (Integer.hashCode(this.avg) * 31) + Integer.hashCode(this.max);
    }

    @NotNull
    public String toString() {
        return "Slope(avg=" + this.avg + ", max=" + this.max + ')';
    }
}
