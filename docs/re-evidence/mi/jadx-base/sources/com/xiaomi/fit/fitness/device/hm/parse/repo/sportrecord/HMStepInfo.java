package com.xiaomi.fit.fitness.device.hm.parse.repo.sportrecord;

import com.xiaomi.fit.fitness.parser.schema.FitnessRecordKey;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\r\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\t\u0010\r\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000e\u001a\u00020\u0003HÆ\u0003J'\u0010\u000f\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\u0010\u001a\u00020\u00112\b\u0010\u0012\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0013\u001a\u00020\u0003HÖ\u0001J\t\u0010\u0014\u001a\u00020\u0015HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\tR\u0011\u0010\u0005\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\t¨\u0006\u0016"}, d2 = {"Lcom/xiaomi/fit/fitness/device/hm/parse/repo/sportrecord/HMStepInfo;", "", "step", "", FitnessRecordKey.cadence, "stepFreq", "<init>", "(III)V", "getStep", "()I", "getCadence", "getStepFreq", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "toString", "", "fitness-sync_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class HMStepInfo {
    private final int cadence;
    private final int step;
    private final int stepFreq;

    public HMStepInfo(int i, int i2, int i3) {
        this.step = i;
        this.cadence = i2;
        this.stepFreq = i3;
    }

    public static /* synthetic */ HMStepInfo copy$default(HMStepInfo hMStepInfo, int i, int i2, int i3, int i4, Object obj) {
        if ((i4 & 1) != 0) {
            i = hMStepInfo.step;
        }
        if ((i4 & 2) != 0) {
            i2 = hMStepInfo.cadence;
        }
        if ((i4 & 4) != 0) {
            i3 = hMStepInfo.stepFreq;
        }
        return hMStepInfo.copy(i, i2, i3);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final int getStep() {
        return this.step;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final int getCadence() {
        return this.cadence;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final int getStepFreq() {
        return this.stepFreq;
    }

    @NotNull
    public final HMStepInfo copy(int step, int cadence, int stepFreq) {
        return new HMStepInfo(step, cadence, stepFreq);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof HMStepInfo)) {
            return false;
        }
        HMStepInfo hMStepInfo = (HMStepInfo) other;
        return this.step == hMStepInfo.step && this.cadence == hMStepInfo.cadence && this.stepFreq == hMStepInfo.stepFreq;
    }

    public final int getCadence() {
        return this.cadence;
    }

    public final int getStep() {
        return this.step;
    }

    public final int getStepFreq() {
        return this.stepFreq;
    }

    public int hashCode() {
        return (((Integer.hashCode(this.step) * 31) + Integer.hashCode(this.cadence)) * 31) + Integer.hashCode(this.stepFreq);
    }

    @NotNull
    public String toString() {
        return "HMStepInfo(step=" + this.step + ", cadence=" + this.cadence + ", stepFreq=" + this.stepFreq + ")";
    }
}
