package com.xiaomi.fitness.blood_sugar;

import java.util.Arrays;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u0006\n\u0000\n\u0002\u0010\u0012\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b,\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001BW\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t\u0012\u0006\u0010\n\u001a\u00020\u0003\u0012\u0006\u0010\u000b\u001a\u00020\u0007\u0012\u0006\u0010\f\u001a\u00020\r\u0012\u0006\u0010\u000e\u001a\u00020\r\u0012\u0006\u0010\u000f\u001a\u00020\u0003¢\u0006\u0004\b\u0010\u0010\u0011J\t\u0010.\u001a\u00020\u0003HÆ\u0003J\t\u0010/\u001a\u00020\u0003HÆ\u0003J\t\u00100\u001a\u00020\u0003HÆ\u0003J\t\u00101\u001a\u00020\u0007HÆ\u0003J\t\u00102\u001a\u00020\tHÆ\u0003J\t\u00103\u001a\u00020\u0003HÆ\u0003J\t\u00104\u001a\u00020\u0007HÆ\u0003J\t\u00105\u001a\u00020\rHÆ\u0003J\t\u00106\u001a\u00020\rHÆ\u0003J\t\u00107\u001a\u00020\u0003HÆ\u0003Jm\u00108\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\t2\b\b\u0002\u0010\n\u001a\u00020\u00032\b\b\u0002\u0010\u000b\u001a\u00020\u00072\b\b\u0002\u0010\f\u001a\u00020\r2\b\b\u0002\u0010\u000e\u001a\u00020\r2\b\b\u0002\u0010\u000f\u001a\u00020\u0003HÆ\u0001J\u0013\u00109\u001a\u00020:2\b\u0010;\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010<\u001a\u00020\u0003HÖ\u0001J\t\u0010=\u001a\u00020>HÖ\u0001R\u001a\u0010\u0002\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0012\u0010\u0013\"\u0004\b\u0014\u0010\u0015R\u001a\u0010\u0004\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0016\u0010\u0013\"\u0004\b\u0017\u0010\u0015R\u001a\u0010\u0005\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0018\u0010\u0013\"\u0004\b\u0019\u0010\u0015R\u001a\u0010\u0006\u001a\u00020\u0007X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001a\u0010\u001b\"\u0004\b\u001c\u0010\u001dR\u001a\u0010\b\u001a\u00020\tX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001e\u0010\u001f\"\u0004\b \u0010!R\u001a\u0010\n\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\"\u0010\u0013\"\u0004\b#\u0010\u0015R\u001a\u0010\u000b\u001a\u00020\u0007X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b$\u0010\u001b\"\u0004\b%\u0010\u001dR\u001a\u0010\f\u001a\u00020\rX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b&\u0010'\"\u0004\b(\u0010)R\u001a\u0010\u000e\u001a\u00020\rX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b*\u0010'\"\u0004\b+\u0010)R\u001a\u0010\u000f\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b,\u0010\u0013\"\u0004\b-\u0010\u0015¨\u0006?"}, d2 = {"Lcom/xiaomi/fitness/blood_sugar/GlucoseValue;", "", "current", "", "dataType", "frontIdx", "glucose", "", "origin", "", "runSEC", "temperature", "time", "", "timeAppReceive", "voltage", "<init>", "(IIID[BIDJJI)V", "getCurrent", "()I", "setCurrent", "(I)V", "getDataType", "setDataType", "getFrontIdx", "setFrontIdx", "getGlucose", "()D", "setGlucose", "(D)V", "getOrigin", "()[B", "setOrigin", "([B)V", "getRunSEC", "setRunSEC", "getTemperature", "setTemperature", "getTime", "()J", "setTime", "(J)V", "getTimeAppReceive", "setTimeAppReceive", "getVoltage", "setVoltage", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "component10", "copy", "equals", "", "other", "hashCode", "toString", "", "blood-sugar-export_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class GlucoseValue {
    private int current;
    private int dataType;
    private int frontIdx;
    private double glucose;

    @NotNull
    private byte[] origin;
    private int runSEC;
    private double temperature;
    private long time;
    private long timeAppReceive;
    private int voltage;

    public GlucoseValue(int i, int i2, int i3, double d, @NotNull byte[] origin, int i4, double d2, long j, long j2, int i5) {
        Intrinsics.checkNotNullParameter(origin, "origin");
        this.current = i;
        this.dataType = i2;
        this.frontIdx = i3;
        this.glucose = d;
        this.origin = origin;
        this.runSEC = i4;
        this.temperature = d2;
        this.time = j;
        this.timeAppReceive = j2;
        this.voltage = i5;
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final int getCurrent() {
        return this.current;
    }

    /* JADX INFO: renamed from: component10, reason: from getter */
    public final int getVoltage() {
        return this.voltage;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final int getDataType() {
        return this.dataType;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final int getFrontIdx() {
        return this.frontIdx;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final double getGlucose() {
        return this.glucose;
    }

    @NotNull
    /* JADX INFO: renamed from: component5, reason: from getter */
    public final byte[] getOrigin() {
        return this.origin;
    }

    /* JADX INFO: renamed from: component6, reason: from getter */
    public final int getRunSEC() {
        return this.runSEC;
    }

    /* JADX INFO: renamed from: component7, reason: from getter */
    public final double getTemperature() {
        return this.temperature;
    }

    /* JADX INFO: renamed from: component8, reason: from getter */
    public final long getTime() {
        return this.time;
    }

    /* JADX INFO: renamed from: component9, reason: from getter */
    public final long getTimeAppReceive() {
        return this.timeAppReceive;
    }

    @NotNull
    public final GlucoseValue copy(int current, int dataType, int frontIdx, double glucose, @NotNull byte[] origin, int runSEC, double temperature, long time, long timeAppReceive, int voltage) {
        Intrinsics.checkNotNullParameter(origin, "origin");
        return new GlucoseValue(current, dataType, frontIdx, glucose, origin, runSEC, temperature, time, timeAppReceive, voltage);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof GlucoseValue)) {
            return false;
        }
        GlucoseValue glucoseValue = (GlucoseValue) other;
        return this.current == glucoseValue.current && this.dataType == glucoseValue.dataType && this.frontIdx == glucoseValue.frontIdx && Double.compare(this.glucose, glucoseValue.glucose) == 0 && Intrinsics.areEqual(this.origin, glucoseValue.origin) && this.runSEC == glucoseValue.runSEC && Double.compare(this.temperature, glucoseValue.temperature) == 0 && this.time == glucoseValue.time && this.timeAppReceive == glucoseValue.timeAppReceive && this.voltage == glucoseValue.voltage;
    }

    public final int getCurrent() {
        return this.current;
    }

    public final int getDataType() {
        return this.dataType;
    }

    public final int getFrontIdx() {
        return this.frontIdx;
    }

    public final double getGlucose() {
        return this.glucose;
    }

    @NotNull
    public final byte[] getOrigin() {
        return this.origin;
    }

    public final int getRunSEC() {
        return this.runSEC;
    }

    public final double getTemperature() {
        return this.temperature;
    }

    public final long getTime() {
        return this.time;
    }

    public final long getTimeAppReceive() {
        return this.timeAppReceive;
    }

    public final int getVoltage() {
        return this.voltage;
    }

    public int hashCode() {
        return (((((((((((((((((Integer.hashCode(this.current) * 31) + Integer.hashCode(this.dataType)) * 31) + Integer.hashCode(this.frontIdx)) * 31) + Double.hashCode(this.glucose)) * 31) + Arrays.hashCode(this.origin)) * 31) + Integer.hashCode(this.runSEC)) * 31) + Double.hashCode(this.temperature)) * 31) + Long.hashCode(this.time)) * 31) + Long.hashCode(this.timeAppReceive)) * 31) + Integer.hashCode(this.voltage);
    }

    public final void setCurrent(int i) {
        this.current = i;
    }

    public final void setDataType(int i) {
        this.dataType = i;
    }

    public final void setFrontIdx(int i) {
        this.frontIdx = i;
    }

    public final void setGlucose(double d) {
        this.glucose = d;
    }

    public final void setOrigin(@NotNull byte[] bArr) {
        Intrinsics.checkNotNullParameter(bArr, "<set-?>");
        this.origin = bArr;
    }

    public final void setRunSEC(int i) {
        this.runSEC = i;
    }

    public final void setTemperature(double d) {
        this.temperature = d;
    }

    public final void setTime(long j) {
        this.time = j;
    }

    public final void setTimeAppReceive(long j) {
        this.timeAppReceive = j;
    }

    public final void setVoltage(int i) {
        this.voltage = i;
    }

    @NotNull
    public String toString() {
        return "GlucoseValue(current=" + this.current + ", dataType=" + this.dataType + ", frontIdx=" + this.frontIdx + ", glucose=" + this.glucose + ", origin=" + Arrays.toString(this.origin) + ", runSEC=" + this.runSEC + ", temperature=" + this.temperature + ", time=" + this.time + ", timeAppReceive=" + this.timeAppReceive + ", voltage=" + this.voltage + ")";
    }
}
