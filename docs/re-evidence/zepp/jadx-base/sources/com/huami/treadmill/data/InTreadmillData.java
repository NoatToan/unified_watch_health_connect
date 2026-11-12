package com.huami.treadmill.data;

import com.baidu.ocr.sdk.utils.LogUtil;
import com.huami.watch.companion.dataflow.Constant;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: classes15.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0007\n\u0002\b\t\n\u0002\u0010\b\n\u0002\b6\u0018\u00002\u00020\u0001B»\u0001\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\t\u001a\u00020\u0002\u0012\b\b\u0002\u0010\r\u001a\u00020\f\u0012\b\b\u0002\u0010\u0013\u001a\u00020\f\u0012\b\b\u0002\u0010\u0016\u001a\u00020\f\u0012\b\b\u0002\u0010\u0019\u001a\u00020\f\u0012\b\b\u0002\u0010\u001c\u001a\u00020\f\u0012\b\b\u0002\u0010\u001f\u001a\u00020\u0002\u0012\b\b\u0002\u0010\"\u001a\u00020\u0002\u0012\b\b\u0002\u0010%\u001a\u00020\f\u0012\b\b\u0002\u0010(\u001a\u00020\f\u0012\b\b\u0002\u0010+\u001a\u00020\f\u0012\b\b\u0002\u0010.\u001a\u00020\f\u0012\b\b\u0002\u00101\u001a\u00020\f\u0012\b\b\u0002\u00104\u001a\u00020\f\u0012\b\b\u0002\u00107\u001a\u00020\f\u0012\b\b\u0002\u0010:\u001a\u00020\f\u0012\b\b\u0002\u0010=\u001a\u00020\f¢\u0006\u0004\b@\u0010AR\"\u0010\u0003\u001a\u00020\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR\"\u0010\t\u001a\u00020\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\t\u0010\u0004\u001a\u0004\b\n\u0010\u0006\"\u0004\b\u000b\u0010\bR\"\u0010\r\u001a\u00020\f8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\r\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010\"\u0004\b\u0011\u0010\u0012R\"\u0010\u0013\u001a\u00020\f8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0013\u0010\u000e\u001a\u0004\b\u0014\u0010\u0010\"\u0004\b\u0015\u0010\u0012R\"\u0010\u0016\u001a\u00020\f8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0016\u0010\u000e\u001a\u0004\b\u0017\u0010\u0010\"\u0004\b\u0018\u0010\u0012R\"\u0010\u0019\u001a\u00020\f8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0019\u0010\u000e\u001a\u0004\b\u001a\u0010\u0010\"\u0004\b\u001b\u0010\u0012R\"\u0010\u001c\u001a\u00020\f8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u001c\u0010\u000e\u001a\u0004\b\u001d\u0010\u0010\"\u0004\b\u001e\u0010\u0012R\"\u0010\u001f\u001a\u00020\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u001f\u0010\u0004\u001a\u0004\b \u0010\u0006\"\u0004\b!\u0010\bR\"\u0010\"\u001a\u00020\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\"\u0010\u0004\u001a\u0004\b#\u0010\u0006\"\u0004\b$\u0010\bR\"\u0010%\u001a\u00020\f8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b%\u0010\u000e\u001a\u0004\b&\u0010\u0010\"\u0004\b'\u0010\u0012R\"\u0010(\u001a\u00020\f8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b(\u0010\u000e\u001a\u0004\b)\u0010\u0010\"\u0004\b*\u0010\u0012R\"\u0010+\u001a\u00020\f8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b+\u0010\u000e\u001a\u0004\b,\u0010\u0010\"\u0004\b-\u0010\u0012R\"\u0010.\u001a\u00020\f8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b.\u0010\u000e\u001a\u0004\b/\u0010\u0010\"\u0004\b0\u0010\u0012R\"\u00101\u001a\u00020\f8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b1\u0010\u000e\u001a\u0004\b2\u0010\u0010\"\u0004\b3\u0010\u0012R\"\u00104\u001a\u00020\f8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b4\u0010\u000e\u001a\u0004\b5\u0010\u0010\"\u0004\b6\u0010\u0012R\"\u00107\u001a\u00020\f8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b7\u0010\u000e\u001a\u0004\b8\u0010\u0010\"\u0004\b9\u0010\u0012R\"\u0010:\u001a\u00020\f8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b:\u0010\u000e\u001a\u0004\b;\u0010\u0010\"\u0004\b<\u0010\u0012R\"\u0010=\u001a\u00020\f8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b=\u0010\u000e\u001a\u0004\b>\u0010\u0010\"\u0004\b?\u0010\u0012¨\u0006B"}, d2 = {"Lcom/huami/treadmill/data/InTreadmillData;", "", "", "instantaneousSpeed", "F", "getInstantaneousSpeed", "()F", "setInstantaneousSpeed", "(F)V", "averageSpeed", "getAverageSpeed", "setAverageSpeed", "", "totalDistance", LogUtil.I, "getTotalDistance", "()I", "setTotalDistance", "(I)V", "inclination", "getInclination", "setInclination", "rampAngle", "getRampAngle", "setRampAngle", "positiveElevationGain", "getPositiveElevationGain", "setPositiveElevationGain", "negativeElevationGain", "getNegativeElevationGain", "setNegativeElevationGain", "instantaneousPace", "getInstantaneousPace", "setInstantaneousPace", "averagePace", "getAveragePace", "setAveragePace", "expendedEnergy", "getExpendedEnergy", "setExpendedEnergy", "energyPerHour", "getEnergyPerHour", "setEnergyPerHour", "energyPerMinute", "getEnergyPerMinute", "setEnergyPerMinute", Constant.KEY_HR_VALUE, "getHeartRate", "setHeartRate", "metabolicEquivalent", "getMetabolicEquivalent", "setMetabolicEquivalent", "elapsedTime", "getElapsedTime", "setElapsedTime", "remainingTime", "getRemainingTime", "setRemainingTime", "forceOnBelt", "getForceOnBelt", "setForceOnBelt", "powerOutput", "getPowerOutput", "setPowerOutput", "<init>", "(FFIIIIIFFIIIIIIIII)V", "treadmill_release"}, k = 1, mv = {1, 5, 1})
public final class InTreadmillData {
    private float averagePace;
    private float averageSpeed;
    private int elapsedTime;
    private int energyPerHour;
    private int energyPerMinute;
    private int expendedEnergy;
    private int forceOnBelt;
    private int heartRate;
    private int inclination;
    private float instantaneousPace;
    private float instantaneousSpeed;
    private int metabolicEquivalent;
    private int negativeElevationGain;
    private int positiveElevationGain;
    private int powerOutput;
    private int rampAngle;
    private int remainingTime;
    private int totalDistance;

    public InTreadmillData() {
        this(0.0f, 0.0f, 0, 0, 0, 0, 0, 0.0f, 0.0f, 0, 0, 0, 0, 0, 0, 0, 0, 0, 262143, null);
    }

    public InTreadmillData(float f, float f2, int i, int i2, int i3, int i4, int i5, float f3, float f4, int i6, int i7, int i8, int i9, int i10, int i11, int i12, int i13, int i14) {
        this.instantaneousSpeed = f;
        this.averageSpeed = f2;
        this.totalDistance = i;
        this.inclination = i2;
        this.rampAngle = i3;
        this.positiveElevationGain = i4;
        this.negativeElevationGain = i5;
        this.instantaneousPace = f3;
        this.averagePace = f4;
        this.expendedEnergy = i6;
        this.energyPerHour = i7;
        this.energyPerMinute = i8;
        this.heartRate = i9;
        this.metabolicEquivalent = i10;
        this.elapsedTime = i11;
        this.remainingTime = i12;
        this.forceOnBelt = i13;
        this.powerOutput = i14;
    }

    public final float getAveragePace() {
        return this.averagePace;
    }

    public final float getAverageSpeed() {
        return this.averageSpeed;
    }

    public final int getElapsedTime() {
        return this.elapsedTime;
    }

    public final int getEnergyPerHour() {
        return this.energyPerHour;
    }

    public final int getEnergyPerMinute() {
        return this.energyPerMinute;
    }

    public final int getExpendedEnergy() {
        return this.expendedEnergy;
    }

    public final int getForceOnBelt() {
        return this.forceOnBelt;
    }

    public final int getHeartRate() {
        return this.heartRate;
    }

    public final int getInclination() {
        return this.inclination;
    }

    public final float getInstantaneousPace() {
        return this.instantaneousPace;
    }

    public final float getInstantaneousSpeed() {
        return this.instantaneousSpeed;
    }

    public final int getMetabolicEquivalent() {
        return this.metabolicEquivalent;
    }

    public final int getNegativeElevationGain() {
        return this.negativeElevationGain;
    }

    public final int getPositiveElevationGain() {
        return this.positiveElevationGain;
    }

    public final int getPowerOutput() {
        return this.powerOutput;
    }

    public final int getRampAngle() {
        return this.rampAngle;
    }

    public final int getRemainingTime() {
        return this.remainingTime;
    }

    public final int getTotalDistance() {
        return this.totalDistance;
    }

    public final void setAveragePace(float f) {
        this.averagePace = f;
    }

    public final void setAverageSpeed(float f) {
        this.averageSpeed = f;
    }

    public final void setElapsedTime(int i) {
        this.elapsedTime = i;
    }

    public final void setEnergyPerHour(int i) {
        this.energyPerHour = i;
    }

    public final void setEnergyPerMinute(int i) {
        this.energyPerMinute = i;
    }

    public final void setExpendedEnergy(int i) {
        this.expendedEnergy = i;
    }

    public final void setForceOnBelt(int i) {
        this.forceOnBelt = i;
    }

    public final void setHeartRate(int i) {
        this.heartRate = i;
    }

    public final void setInclination(int i) {
        this.inclination = i;
    }

    public final void setInstantaneousPace(float f) {
        this.instantaneousPace = f;
    }

    public final void setInstantaneousSpeed(float f) {
        this.instantaneousSpeed = f;
    }

    public final void setMetabolicEquivalent(int i) {
        this.metabolicEquivalent = i;
    }

    public final void setNegativeElevationGain(int i) {
        this.negativeElevationGain = i;
    }

    public final void setPositiveElevationGain(int i) {
        this.positiveElevationGain = i;
    }

    public final void setPowerOutput(int i) {
        this.powerOutput = i;
    }

    public final void setRampAngle(int i) {
        this.rampAngle = i;
    }

    public final void setRemainingTime(int i) {
        this.remainingTime = i;
    }

    public final void setTotalDistance(int i) {
        this.totalDistance = i;
    }

    public /* synthetic */ InTreadmillData(float f, float f2, int i, int i2, int i3, int i4, int i5, float f3, float f4, int i6, int i7, int i8, int i9, int i10, int i11, int i12, int i13, int i14, int i15, DefaultConstructorMarker defaultConstructorMarker) {
        this((i15 & 1) != 0 ? 0.0f : f, (i15 & 2) != 0 ? 0.0f : f2, (i15 & 4) != 0 ? 0 : i, (i15 & 8) != 0 ? 0 : i2, (i15 & 16) != 0 ? 0 : i3, (i15 & 32) != 0 ? 0 : i4, (i15 & 64) != 0 ? 0 : i5, (i15 & 128) != 0 ? 0.0f : f3, (i15 & 256) == 0 ? f4 : 0.0f, (i15 & 512) != 0 ? 0 : i6, (i15 & 1024) != 0 ? 0 : i7, (i15 & 2048) != 0 ? 0 : i8, (i15 & 4096) != 0 ? 0 : i9, (i15 & 8192) != 0 ? 0 : i10, (i15 & 16384) != 0 ? 0 : i11, (i15 & 32768) != 0 ? 0 : i12, (i15 & 65536) != 0 ? 0 : i13, (i15 & 131072) != 0 ? 0 : i14);
    }
}
