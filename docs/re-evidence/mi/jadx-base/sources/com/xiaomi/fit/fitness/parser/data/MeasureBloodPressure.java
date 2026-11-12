package com.xiaomi.fit.fitness.parser.data;

import com.xiaomi.fit.data.common.data.annotation.BPMeasurementStatus;
import com.xiaomi.fit.fitness.parser.schema.DailyReportKey;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0011\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\t\u0010\u0011\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0012\u001a\u00020\u0003HÆ\u0003J\u001d\u0010\u0013\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\u0014\u001a\u00020\u00152\b\u0010\u0016\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0017\u001a\u00020\u0003HÖ\u0001J\t\u0010\u0018\u001a\u00020\u0019HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\bR\u001a\u0010\n\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\b\"\u0004\b\f\u0010\rR\u001e\u0010\u000e\u001a\u00020\u00038\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000f\u0010\b\"\u0004\b\u0010\u0010\r¨\u0006\u001a"}, d2 = {"Lcom/xiaomi/fit/fitness/parser/data/MeasureBloodPressure;", "", "highPressure", "", "lowPressure", "<init>", "(II)V", "getHighPressure", "()I", "getLowPressure", DailyReportKey.pulse, "getPulse", "setPulse", "(I)V", DailyReportKey.measurementStatus, "getMeasurementStatus", "setMeasurementStatus", "component1", "component2", "copy", "equals", "", "other", "hashCode", "toString", "", "fitness-parser_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class MeasureBloodPressure {
    private final int highPressure;
    private final int lowPressure;

    @BPMeasurementStatus
    private int measurementStatus;
    private int pulse;

    public MeasureBloodPressure(int i, int i2) {
        this.highPressure = i;
        this.lowPressure = i2;
    }

    public static /* synthetic */ MeasureBloodPressure copy$default(MeasureBloodPressure measureBloodPressure, int i, int i2, int i3, Object obj) {
        if ((i3 & 1) != 0) {
            i = measureBloodPressure.highPressure;
        }
        if ((i3 & 2) != 0) {
            i2 = measureBloodPressure.lowPressure;
        }
        return measureBloodPressure.copy(i, i2);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final int getHighPressure() {
        return this.highPressure;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final int getLowPressure() {
        return this.lowPressure;
    }

    @NotNull
    public final MeasureBloodPressure copy(int highPressure, int lowPressure) {
        return new MeasureBloodPressure(highPressure, lowPressure);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof MeasureBloodPressure)) {
            return false;
        }
        MeasureBloodPressure measureBloodPressure = (MeasureBloodPressure) other;
        return this.highPressure == measureBloodPressure.highPressure && this.lowPressure == measureBloodPressure.lowPressure;
    }

    public final int getHighPressure() {
        return this.highPressure;
    }

    public final int getLowPressure() {
        return this.lowPressure;
    }

    public final int getMeasurementStatus() {
        return this.measurementStatus;
    }

    public final int getPulse() {
        return this.pulse;
    }

    public int hashCode() {
        return (Integer.hashCode(this.highPressure) * 31) + Integer.hashCode(this.lowPressure);
    }

    public final void setMeasurementStatus(int i) {
        this.measurementStatus = i;
    }

    public final void setPulse(int i) {
        this.pulse = i;
    }

    @NotNull
    public String toString() {
        return "MeasureBloodPressure(highPressure=" + this.highPressure + ", lowPressure=" + this.lowPressure + ")";
    }
}
