package com.xiaomi.hm.health.bt.profile.gdsp.gps;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes18.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0007\n\u0002\b\u0007\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\f\b\u0086\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0006\u001a\u00020\u0002\u0012\u0006\u0010\u0007\u001a\u00020\u0002\u0012\u0006\u0010\b\u001a\u00020\u0002¢\u0006\u0004\b\u0019\u0010\u001aJ\t\u0010\u0003\u001a\u00020\u0002HÆ\u0003J\t\u0010\u0004\u001a\u00020\u0002HÆ\u0003J\t\u0010\u0005\u001a\u00020\u0002HÆ\u0003J'\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0006\u001a\u00020\u00022\b\b\u0002\u0010\u0007\u001a\u00020\u00022\b\b\u0002\u0010\b\u001a\u00020\u0002HÆ\u0001J\t\u0010\u000b\u001a\u00020\nHÖ\u0001J\t\u0010\r\u001a\u00020\fHÖ\u0001J\u0013\u0010\u0010\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\u0001HÖ\u0003R\u0019\u0010\u0006\u001a\u00020\u00028\u0006@\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014R\u0019\u0010\u0007\u001a\u00020\u00028\u0006@\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0012\u001a\u0004\b\u0016\u0010\u0014R\u0019\u0010\b\u001a\u00020\u00028\u0006@\u0006¢\u0006\f\n\u0004\b\u0017\u0010\u0012\u001a\u0004\b\u0018\u0010\u0014¨\u0006\u001b"}, d2 = {"Lcom/xiaomi/hm/health/bt/profile/gdsp/gps/TemperatureStatistic;", "", "", "component1", "component2", "component3", "avg", "max", "min", "copy", "", "toString", "", "hashCode", "other", "", "equals", "a", "F", "getAvg", "()F", "b", "getMax", "c", "getMin", "<init>", "(FFF)V", "bluetooth_release"}, k = 1, mv = {1, 5, 1})
public final /* data */ class TemperatureStatistic {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata and from toString */
    private final float avg;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata and from toString */
    private final float max;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata and from toString */
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
        return Intrinsics.areEqual((Object) Float.valueOf(this.avg), (Object) Float.valueOf(temperatureStatistic.avg)) && Intrinsics.areEqual((Object) Float.valueOf(this.max), (Object) Float.valueOf(temperatureStatistic.max)) && Intrinsics.areEqual((Object) Float.valueOf(this.min), (Object) Float.valueOf(temperatureStatistic.min));
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
        return (((Float.floatToIntBits(this.avg) * 31) + Float.floatToIntBits(this.max)) * 31) + Float.floatToIntBits(this.min);
    }

    @NotNull
    public String toString() {
        return "TemperatureStatistic(avg=" + this.avg + ", max=" + this.max + ", min=" + this.min + ')';
    }
}
