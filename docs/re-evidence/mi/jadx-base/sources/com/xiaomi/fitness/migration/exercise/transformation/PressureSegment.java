package com.xiaomi.fitness.migration.exercise.transformation;

import com.google.gson.annotations.SerializedName;
import java.util.List;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0007\n\u0002\b\u0014\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0000\b\u0000\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\b\u0010 \u001a\u00020!H\u0016R\u001e\u0010\u0004\u001a\u00020\u00058\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0006\u0010\u0007\"\u0004\b\b\u0010\tR\u001e\u0010\n\u001a\u00020\u00058\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\u0007\"\u0004\b\f\u0010\tR\u001e\u0010\r\u001a\u00020\u00058\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000e\u0010\u0007\"\u0004\b\u000f\u0010\tR\u001e\u0010\u0010\u001a\u00020\u00058\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0011\u0010\u0007\"\u0004\b\u0012\u0010\tR\u001e\u0010\u0013\u001a\u00020\u00058\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0014\u0010\u0007\"\u0004\b\u0015\u0010\tR\u001e\u0010\u0016\u001a\u00020\u00058\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0017\u0010\u0007\"\u0004\b\u0018\u0010\tR&\u0010\u0019\u001a\n\u0012\u0004\u0012\u00020\u001b\u0018\u00010\u001a8\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001c\u0010\u001d\"\u0004\b\u001e\u0010\u001f¨\u0006\""}, d2 = {"Lcom/xiaomi/fitness/migration/exercise/transformation/PressureSegment;", "", "<init>", "()V", "altitudeDiff", "", "getAltitudeDiff", "()F", "setAltitudeDiff", "(F)V", "totalUpAltitude", "getTotalUpAltitude", "setTotalUpAltitude", "totalDownAltitude", "getTotalDownAltitude", "setTotalDownAltitude", "pressureStart", "getPressureStart", "setPressureStart", "pressureEnd", "getPressureEnd", "setPressureEnd", "pressureDiff", "getPressureDiff", "setPressureDiff", "pressures", "", "Lcom/xiaomi/fitness/migration/exercise/transformation/AirPressure;", "getPressures", "()Ljava/util/List;", "setPressures", "(Ljava/util/List;)V", "toString", "", "fitness-data-core_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class PressureSegment {

    @SerializedName("altitudeDiff")
    private float altitudeDiff;

    @SerializedName("pressureDiff")
    private float pressureDiff;

    @SerializedName("pressureEnd")
    private float pressureEnd;

    @SerializedName("pressureStart")
    private float pressureStart;

    @SerializedName("pressures")
    @Nullable
    private List<AirPressure> pressures;

    @SerializedName("totalDownAltitude")
    private float totalDownAltitude;

    @SerializedName("totalUpAltitude")
    private float totalUpAltitude;

    public final float getAltitudeDiff() {
        return this.altitudeDiff;
    }

    public final float getPressureDiff() {
        return this.pressureDiff;
    }

    public final float getPressureEnd() {
        return this.pressureEnd;
    }

    public final float getPressureStart() {
        return this.pressureStart;
    }

    @Nullable
    public final List<AirPressure> getPressures() {
        return this.pressures;
    }

    public final float getTotalDownAltitude() {
        return this.totalDownAltitude;
    }

    public final float getTotalUpAltitude() {
        return this.totalUpAltitude;
    }

    public final void setAltitudeDiff(float f) {
        this.altitudeDiff = f;
    }

    public final void setPressureDiff(float f) {
        this.pressureDiff = f;
    }

    public final void setPressureEnd(float f) {
        this.pressureEnd = f;
    }

    public final void setPressureStart(float f) {
        this.pressureStart = f;
    }

    public final void setPressures(@Nullable List<AirPressure> list) {
        this.pressures = list;
    }

    public final void setTotalDownAltitude(float f) {
        this.totalDownAltitude = f;
    }

    public final void setTotalUpAltitude(float f) {
        this.totalUpAltitude = f;
    }

    @NotNull
    public String toString() {
        return "PressureSegment{,altitudeDiff = " + this.altitudeDiff + ", totalUpAltitude = " + this.totalUpAltitude + ", totalDownAltitude = " + this.totalDownAltitude + ", pressureStart = " + this.pressureStart + ", pressureEnd = " + this.pressureEnd + ", pressureDiff=" + this.pressureDiff + "}";
    }
}
