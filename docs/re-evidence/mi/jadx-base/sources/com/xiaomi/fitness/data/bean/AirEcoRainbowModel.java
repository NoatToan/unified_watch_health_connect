package com.xiaomi.fitness.data.bean;

import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0013\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001B9\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0003¢\u0006\u0004\b\b\u0010\tJ\b\u0010\u0016\u001a\u00020\u0017H\u0016J\t\u0010\u0018\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0019\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001a\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001b\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001c\u001a\u00020\u0003HÆ\u0003J;\u0010\u001d\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00032\b\b\u0002\u0010\u0007\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\u001e\u001a\u00020\u001f2\b\u0010 \u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010!\u001a\u00020\u0003HÖ\u0001R\u001a\u0010\u0002\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\n\u0010\u000b\"\u0004\b\f\u0010\rR\u001a\u0010\u0004\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000e\u0010\u000b\"\u0004\b\u000f\u0010\rR\u001a\u0010\u0005\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0010\u0010\u000b\"\u0004\b\u0011\u0010\rR\u001a\u0010\u0006\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0012\u0010\u000b\"\u0004\b\u0013\u0010\rR\u001a\u0010\u0007\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0014\u0010\u000b\"\u0004\b\u0015\u0010\r¨\u0006\""}, d2 = {"Lcom/xiaomi/fitness/data/bean/AirEcoRainbowModel;", "", "prevStep", "", "prevCal", "prevStand", "prevMHStrength", "prevSleepSegmentCount", "<init>", "(IIIII)V", "getPrevStep", "()I", "setPrevStep", "(I)V", "getPrevCal", "setPrevCal", "getPrevStand", "setPrevStand", "getPrevMHStrength", "setPrevMHStrength", "getPrevSleepSegmentCount", "setPrevSleepSegmentCount", "toString", "", "component1", "component2", "component3", "component4", "component5", "copy", "equals", "", "other", "hashCode", "health_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class AirEcoRainbowModel {
    private int prevCal;
    private int prevMHStrength;
    private int prevSleepSegmentCount;
    private int prevStand;
    private int prevStep;

    public AirEcoRainbowModel() {
        this(0, 0, 0, 0, 0, 31, null);
    }

    public static /* synthetic */ AirEcoRainbowModel copy$default(AirEcoRainbowModel airEcoRainbowModel, int i, int i2, int i3, int i4, int i5, int i6, Object obj) {
        if ((i6 & 1) != 0) {
            i = airEcoRainbowModel.prevStep;
        }
        if ((i6 & 2) != 0) {
            i2 = airEcoRainbowModel.prevCal;
        }
        int i7 = i2;
        if ((i6 & 4) != 0) {
            i3 = airEcoRainbowModel.prevStand;
        }
        int i8 = i3;
        if ((i6 & 8) != 0) {
            i4 = airEcoRainbowModel.prevMHStrength;
        }
        int i9 = i4;
        if ((i6 & 16) != 0) {
            i5 = airEcoRainbowModel.prevSleepSegmentCount;
        }
        return airEcoRainbowModel.copy(i, i7, i8, i9, i5);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final int getPrevStep() {
        return this.prevStep;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final int getPrevCal() {
        return this.prevCal;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final int getPrevStand() {
        return this.prevStand;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final int getPrevMHStrength() {
        return this.prevMHStrength;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final int getPrevSleepSegmentCount() {
        return this.prevSleepSegmentCount;
    }

    @NotNull
    public final AirEcoRainbowModel copy(int prevStep, int prevCal, int prevStand, int prevMHStrength, int prevSleepSegmentCount) {
        return new AirEcoRainbowModel(prevStep, prevCal, prevStand, prevMHStrength, prevSleepSegmentCount);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof AirEcoRainbowModel)) {
            return false;
        }
        AirEcoRainbowModel airEcoRainbowModel = (AirEcoRainbowModel) other;
        return this.prevStep == airEcoRainbowModel.prevStep && this.prevCal == airEcoRainbowModel.prevCal && this.prevStand == airEcoRainbowModel.prevStand && this.prevMHStrength == airEcoRainbowModel.prevMHStrength && this.prevSleepSegmentCount == airEcoRainbowModel.prevSleepSegmentCount;
    }

    public final int getPrevCal() {
        return this.prevCal;
    }

    public final int getPrevMHStrength() {
        return this.prevMHStrength;
    }

    public final int getPrevSleepSegmentCount() {
        return this.prevSleepSegmentCount;
    }

    public final int getPrevStand() {
        return this.prevStand;
    }

    public final int getPrevStep() {
        return this.prevStep;
    }

    public int hashCode() {
        return (((((((Integer.hashCode(this.prevStep) * 31) + Integer.hashCode(this.prevCal)) * 31) + Integer.hashCode(this.prevStand)) * 31) + Integer.hashCode(this.prevMHStrength)) * 31) + Integer.hashCode(this.prevSleepSegmentCount);
    }

    public final void setPrevCal(int i) {
        this.prevCal = i;
    }

    public final void setPrevMHStrength(int i) {
        this.prevMHStrength = i;
    }

    public final void setPrevSleepSegmentCount(int i) {
        this.prevSleepSegmentCount = i;
    }

    public final void setPrevStand(int i) {
        this.prevStand = i;
    }

    public final void setPrevStep(int i) {
        this.prevStep = i;
    }

    @NotNull
    public String toString() {
        return "AirEcoRainbowModel(prevStep=" + this.prevStep + ", prevCal=" + this.prevCal + ", prevStand=" + this.prevStand + ", prevMHStrength=" + this.prevMHStrength + ", prevSleepSegmentCount=" + this.prevSleepSegmentCount + ")";
    }

    public AirEcoRainbowModel(int i, int i2, int i3, int i4, int i5) {
        this.prevStep = i;
        this.prevCal = i2;
        this.prevStand = i3;
        this.prevMHStrength = i4;
        this.prevSleepSegmentCount = i5;
    }

    public /* synthetic */ AirEcoRainbowModel(int i, int i2, int i3, int i4, int i5, int i6, DefaultConstructorMarker defaultConstructorMarker) {
        this((i6 & 1) != 0 ? 0 : i, (i6 & 2) != 0 ? 0 : i2, (i6 & 4) != 0 ? 0 : i3, (i6 & 8) != 0 ? 0 : i4, (i6 & 16) != 0 ? 0 : i5);
    }
}
