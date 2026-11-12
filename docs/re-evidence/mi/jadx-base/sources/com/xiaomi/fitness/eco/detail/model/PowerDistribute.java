package com.xiaomi.fitness.eco.detail.model;

import kotlin.Metadata;
import kotlin.math.MathKt__MathJVMKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b,\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B?\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0003\u0012\u0006\u0010\u0007\u001a\u00020\u0003\u0012\u0006\u0010\b\u001a\u00020\u0003\u0012\u0006\u0010\t\u001a\u00020\u0003¢\u0006\u0004\b\n\u0010\u000bJ\u0018\u0010$\u001a\u00020\u00032\u0006\u0010%\u001a\u00020\u00032\u0006\u0010&\u001a\u00020\u0003H\u0002J\t\u0010'\u001a\u00020\u0003HÆ\u0003J\t\u0010(\u001a\u00020\u0003HÆ\u0003J\t\u0010)\u001a\u00020\u0003HÆ\u0003J\t\u0010*\u001a\u00020\u0003HÆ\u0003J\t\u0010+\u001a\u00020\u0003HÆ\u0003J\t\u0010,\u001a\u00020\u0003HÆ\u0003J\t\u0010-\u001a\u00020\u0003HÆ\u0003JO\u0010.\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00032\b\b\u0002\u0010\u0007\u001a\u00020\u00032\b\b\u0002\u0010\b\u001a\u00020\u00032\b\b\u0002\u0010\t\u001a\u00020\u0003HÆ\u0001J\u0013\u0010/\u001a\u0002002\b\u00101\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u00102\u001a\u00020\u0003HÖ\u0001J\t\u00103\u001a\u000204HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\rR\u0011\u0010\u0005\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\rR\u0011\u0010\u0006\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\rR\u0011\u0010\u0007\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\rR\u0011\u0010\b\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\rR\u0011\u0010\t\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\rR\u0011\u0010\u0014\u001a\u00020\u00038F¢\u0006\u0006\u001a\u0004\b\u0015\u0010\rR\u0011\u0010\u0016\u001a\u00020\u00038F¢\u0006\u0006\u001a\u0004\b\u0017\u0010\rR\u0011\u0010\u0018\u001a\u00020\u00038F¢\u0006\u0006\u001a\u0004\b\u0019\u0010\rR\u0011\u0010\u001a\u001a\u00020\u00038F¢\u0006\u0006\u001a\u0004\b\u001b\u0010\rR\u0011\u0010\u001c\u001a\u00020\u00038F¢\u0006\u0006\u001a\u0004\b\u001d\u0010\rR\u0011\u0010\u001e\u001a\u00020\u00038F¢\u0006\u0006\u001a\u0004\b\u001f\u0010\rR\u0011\u0010 \u001a\u00020\u00038F¢\u0006\u0006\u001a\u0004\b!\u0010\rR\u0011\u0010\"\u001a\u00020\u00038F¢\u0006\u0006\u001a\u0004\b#\u0010\r¨\u00065"}, d2 = {"Lcom/xiaomi/fitness/eco/detail/model/PowerDistribute;", "", "powerActiveRecoveryDuration", "", "powerEnduranceDuration", "powerRhythmDuration", "powerLactateThresholdDuration", "powerMaxVo2Duration", "powerAnaerobicDuration", "powerExtremeDuration", "<init>", "(IIIIIII)V", "getPowerActiveRecoveryDuration", "()I", "getPowerEnduranceDuration", "getPowerRhythmDuration", "getPowerLactateThresholdDuration", "getPowerMaxVo2Duration", "getPowerAnaerobicDuration", "getPowerExtremeDuration", "sumDuration", "getSumDuration", "maxVo2Per", "getMaxVo2Per", "thresholdbicPer", "getThresholdbicPer", "rhythmPer", "getRhythmPer", "endurancePer", "getEndurancePer", "recoveryPer", "getRecoveryPer", "anaerobicPer", "getAnaerobicPer", "extremePer", "getExtremePer", "createPercentage", "percentValue", "sum", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "copy", "equals", "", "other", "hashCode", "toString", "", "sport-record_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class PowerDistribute {
    private final int powerActiveRecoveryDuration;
    private final int powerAnaerobicDuration;
    private final int powerEnduranceDuration;
    private final int powerExtremeDuration;
    private final int powerLactateThresholdDuration;
    private final int powerMaxVo2Duration;
    private final int powerRhythmDuration;

    public PowerDistribute(int i, int i2, int i3, int i4, int i5, int i6, int i7) {
        this.powerActiveRecoveryDuration = i;
        this.powerEnduranceDuration = i2;
        this.powerRhythmDuration = i3;
        this.powerLactateThresholdDuration = i4;
        this.powerMaxVo2Duration = i5;
        this.powerAnaerobicDuration = i6;
        this.powerExtremeDuration = i7;
    }

    public static /* synthetic */ PowerDistribute copy$default(PowerDistribute powerDistribute, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8, Object obj) {
        if ((i8 & 1) != 0) {
            i = powerDistribute.powerActiveRecoveryDuration;
        }
        if ((i8 & 2) != 0) {
            i2 = powerDistribute.powerEnduranceDuration;
        }
        int i9 = i2;
        if ((i8 & 4) != 0) {
            i3 = powerDistribute.powerRhythmDuration;
        }
        int i10 = i3;
        if ((i8 & 8) != 0) {
            i4 = powerDistribute.powerLactateThresholdDuration;
        }
        int i11 = i4;
        if ((i8 & 16) != 0) {
            i5 = powerDistribute.powerMaxVo2Duration;
        }
        int i12 = i5;
        if ((i8 & 32) != 0) {
            i6 = powerDistribute.powerAnaerobicDuration;
        }
        int i13 = i6;
        if ((i8 & 64) != 0) {
            i7 = powerDistribute.powerExtremeDuration;
        }
        return powerDistribute.copy(i, i9, i10, i11, i12, i13, i7);
    }

    private final int createPercentage(int percentValue, int sum) {
        return MathKt__MathJVMKt.roundToInt((percentValue * 100.0f) / sum);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final int getPowerActiveRecoveryDuration() {
        return this.powerActiveRecoveryDuration;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final int getPowerEnduranceDuration() {
        return this.powerEnduranceDuration;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final int getPowerRhythmDuration() {
        return this.powerRhythmDuration;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final int getPowerLactateThresholdDuration() {
        return this.powerLactateThresholdDuration;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final int getPowerMaxVo2Duration() {
        return this.powerMaxVo2Duration;
    }

    /* JADX INFO: renamed from: component6, reason: from getter */
    public final int getPowerAnaerobicDuration() {
        return this.powerAnaerobicDuration;
    }

    /* JADX INFO: renamed from: component7, reason: from getter */
    public final int getPowerExtremeDuration() {
        return this.powerExtremeDuration;
    }

    @NotNull
    public final PowerDistribute copy(int powerActiveRecoveryDuration, int powerEnduranceDuration, int powerRhythmDuration, int powerLactateThresholdDuration, int powerMaxVo2Duration, int powerAnaerobicDuration, int powerExtremeDuration) {
        return new PowerDistribute(powerActiveRecoveryDuration, powerEnduranceDuration, powerRhythmDuration, powerLactateThresholdDuration, powerMaxVo2Duration, powerAnaerobicDuration, powerExtremeDuration);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof PowerDistribute)) {
            return false;
        }
        PowerDistribute powerDistribute = (PowerDistribute) other;
        return this.powerActiveRecoveryDuration == powerDistribute.powerActiveRecoveryDuration && this.powerEnduranceDuration == powerDistribute.powerEnduranceDuration && this.powerRhythmDuration == powerDistribute.powerRhythmDuration && this.powerLactateThresholdDuration == powerDistribute.powerLactateThresholdDuration && this.powerMaxVo2Duration == powerDistribute.powerMaxVo2Duration && this.powerAnaerobicDuration == powerDistribute.powerAnaerobicDuration && this.powerExtremeDuration == powerDistribute.powerExtremeDuration;
    }

    public final int getAnaerobicPer() {
        return createPercentage(this.powerAnaerobicDuration, getSumDuration());
    }

    public final int getEndurancePer() {
        return createPercentage(this.powerEnduranceDuration, getSumDuration());
    }

    public final int getExtremePer() {
        return createPercentage(this.powerExtremeDuration, getSumDuration());
    }

    public final int getMaxVo2Per() {
        return createPercentage(this.powerMaxVo2Duration, getSumDuration());
    }

    public final int getPowerActiveRecoveryDuration() {
        return this.powerActiveRecoveryDuration;
    }

    public final int getPowerAnaerobicDuration() {
        return this.powerAnaerobicDuration;
    }

    public final int getPowerEnduranceDuration() {
        return this.powerEnduranceDuration;
    }

    public final int getPowerExtremeDuration() {
        return this.powerExtremeDuration;
    }

    public final int getPowerLactateThresholdDuration() {
        return this.powerLactateThresholdDuration;
    }

    public final int getPowerMaxVo2Duration() {
        return this.powerMaxVo2Duration;
    }

    public final int getPowerRhythmDuration() {
        return this.powerRhythmDuration;
    }

    public final int getRecoveryPer() {
        return createPercentage(this.powerActiveRecoveryDuration, getSumDuration());
    }

    public final int getRhythmPer() {
        return createPercentage(this.powerRhythmDuration, getSumDuration());
    }

    public final int getSumDuration() {
        return this.powerActiveRecoveryDuration + this.powerEnduranceDuration + this.powerRhythmDuration + this.powerLactateThresholdDuration + this.powerMaxVo2Duration + this.powerAnaerobicDuration + this.powerExtremeDuration;
    }

    public final int getThresholdbicPer() {
        return createPercentage(this.powerLactateThresholdDuration, getSumDuration());
    }

    public int hashCode() {
        return (((((((((((Integer.hashCode(this.powerActiveRecoveryDuration) * 31) + Integer.hashCode(this.powerEnduranceDuration)) * 31) + Integer.hashCode(this.powerRhythmDuration)) * 31) + Integer.hashCode(this.powerLactateThresholdDuration)) * 31) + Integer.hashCode(this.powerMaxVo2Duration)) * 31) + Integer.hashCode(this.powerAnaerobicDuration)) * 31) + Integer.hashCode(this.powerExtremeDuration);
    }

    @NotNull
    public String toString() {
        return "PowerDistribute(powerActiveRecoveryDuration=" + this.powerActiveRecoveryDuration + ", powerEnduranceDuration=" + this.powerEnduranceDuration + ", powerRhythmDuration=" + this.powerRhythmDuration + ", powerLactateThresholdDuration=" + this.powerLactateThresholdDuration + ", powerMaxVo2Duration=" + this.powerMaxVo2Duration + ", powerAnaerobicDuration=" + this.powerAnaerobicDuration + ", powerExtremeDuration=" + this.powerExtremeDuration + ")";
    }
}
