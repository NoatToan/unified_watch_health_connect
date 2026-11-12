package com.xiaomi.fitness.migration.exercise.transformation;

import com.google.gson.annotations.SerializedName;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u0007\n\u0002\b\r\b\u0000\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003B!\b\u0016\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\u0002\u0010\tR\u001e\u0010\u0004\u001a\u00020\u00058\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\n\u0010\u000b\"\u0004\b\f\u0010\rR\u001e\u0010\u0006\u001a\u00020\u00078\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000e\u0010\u000f\"\u0004\b\u0010\u0010\u0011R\u001e\u0010\b\u001a\u00020\u00078\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0012\u0010\u000f\"\u0004\b\u0013\u0010\u0011¨\u0006\u0014"}, d2 = {"Lcom/xiaomi/fitness/migration/exercise/transformation/AirPressure;", "", "<init>", "()V", "time", "", "pressure", "", "altitude", "(JFF)V", "getTime", "()J", "setTime", "(J)V", "getPressure", "()F", "setPressure", "(F)V", "getAltitude", "setAltitude", "fitness-data-core_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class AirPressure {

    @SerializedName("altitude")
    private float altitude;

    @SerializedName("pressure")
    private float pressure;

    @SerializedName("time")
    private long time;

    public AirPressure() {
    }

    public AirPressure(long j, float f, float f2) {
        this();
        this.time = j;
        this.pressure = f;
        this.altitude = f2;
    }

    public final float getAltitude() {
        return this.altitude;
    }

    public final float getPressure() {
        return this.pressure;
    }

    public final long getTime() {
        return this.time;
    }

    public final void setAltitude(float f) {
        this.altitude = f;
    }

    public final void setPressure(float f) {
        this.pressure = f;
    }

    public final void setTime(long j) {
        this.time = j;
    }
}
