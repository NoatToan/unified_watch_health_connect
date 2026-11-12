package com.huami.health.bodymeasurements.p014temperatureservice;

import defpackage.b;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0010\b\u0086\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\b\u001a\u00020\u0002\u0012\u0006\u0010\t\u001a\u00020\u0004\u0012\u0006\u0010\n\u001a\u00020\u0006¢\u0006\u0004\b\u001f\u0010 J\t\u0010\u0003\u001a\u00020\u0002HÆ\u0003J\t\u0010\u0005\u001a\u00020\u0004HÆ\u0003J\t\u0010\u0007\u001a\u00020\u0006HÆ\u0003J'\u0010\u000b\u001a\u00020\u00002\b\b\u0002\u0010\b\u001a\u00020\u00022\b\b\u0002\u0010\t\u001a\u00020\u00042\b\b\u0002\u0010\n\u001a\u00020\u0006HÆ\u0001J\t\u0010\r\u001a\u00020\fHÖ\u0001J\t\u0010\u000f\u001a\u00020\u000eHÖ\u0001J\u0013\u0010\u0012\u001a\u00020\u00112\b\u0010\u0010\u001a\u0004\u0018\u00010\u0001HÖ\u0003R\u0019\u0010\b\u001a\u00020\u00028\u0006@\u0006¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016R\u0019\u0010\t\u001a\u00020\u00048\u0006@\u0006¢\u0006\f\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0019\u0010\u001aR\u0019\u0010\n\u001a\u00020\u00068\u0006@\u0006¢\u0006\f\n\u0004\b\u001b\u0010\u001c\u001a\u0004\b\u001d\u0010\u001e¨\u0006!"}, d2 = {"Lcom/huami/health/bodymeasurements/temperatureservice/Temperature;", "", "", "component1", "", "component2", "Lcom/huami/health/bodymeasurements/temperatureservice/TemperatureUnit;", "component3", "time", "value", "unit", "copy", "", "toString", "", "hashCode", "other", "", "equals", "a", "J", "getTime", "()J", "b", "F", "getValue", "()F", "c", "Lcom/huami/health/bodymeasurements/temperatureservice/TemperatureUnit;", "getUnit", "()Lcom/huami/health/bodymeasurements/temperatureservice/TemperatureUnit;", "<init>", "(JFLcom/huami/health/bodymeasurements/temperatureservice/TemperatureUnit;)V", "temperatureservice_release"}, k = 1, mv = {1, 4, 0})
public final /* data */ class Temperature {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata and from toString */
    private final long time;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata and from toString */
    private final float value;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata and from toString */
    @NotNull
    private final TemperatureUnit unit;

    public Temperature(long j, float f, @NotNull TemperatureUnit temperatureUnit) {
        this.time = j;
        this.value = f;
        this.unit = temperatureUnit;
    }

    public static /* synthetic */ Temperature copy$default(Temperature temperature, long j, float f, TemperatureUnit temperatureUnit, int i, Object obj) {
        if ((i & 1) != 0) {
            j = temperature.time;
        }
        if ((i & 2) != 0) {
            f = temperature.value;
        }
        if ((i & 4) != 0) {
            temperatureUnit = temperature.unit;
        }
        return temperature.copy(j, f, temperatureUnit);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final long getTime() {
        return this.time;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final float getValue() {
        return this.value;
    }

    @NotNull
    /* JADX INFO: renamed from: component3, reason: from getter */
    public final TemperatureUnit getUnit() {
        return this.unit;
    }

    @NotNull
    public final Temperature copy(long time, float value, @NotNull TemperatureUnit unit) {
        return new Temperature(time, value, unit);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof Temperature)) {
            return false;
        }
        Temperature temperature = (Temperature) other;
        return this.time == temperature.time && Float.compare(this.value, temperature.value) == 0 && Intrinsics.areEqual(this.unit, temperature.unit);
    }

    public final long getTime() {
        return this.time;
    }

    @NotNull
    public final TemperatureUnit getUnit() {
        return this.unit;
    }

    public final float getValue() {
        return this.value;
    }

    public int hashCode() {
        int iA = ((b.a(this.time) * 31) + Float.floatToIntBits(this.value)) * 31;
        TemperatureUnit temperatureUnit = this.unit;
        return iA + (temperatureUnit != null ? temperatureUnit.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        return "Temperature(time=" + this.time + ", value=" + this.value + ", unit=" + this.unit + ")";
    }
}
