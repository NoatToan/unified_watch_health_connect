package com.xiaomi.fitness.training_plan_export.model;

import com.google.gson.annotations.SerializedName;
import com.xiaomi.fit.fitness.parser.schema.FitnessReportKey;
import java.io.Serializable;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\n\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\t\u0010\n\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000b\u001a\u00020\u0003HÆ\u0003J\u001d\u0010\f\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\r\u001a\u00020\u000e2\b\u0010\u000f\u001a\u0004\u0018\u00010\u0010HÖ\u0003J\t\u0010\u0011\u001a\u00020\u0003HÖ\u0001J\t\u0010\u0012\u001a\u00020\u0013HÖ\u0001R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0016\u0010\u0004\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\b¨\u0006\u0014"}, d2 = {"Lcom/xiaomi/fitness/training_plan_export/model/RunningPaceRange;", "Ljava/io/Serializable;", "minPace", "", FitnessReportKey.maxPace, "<init>", "(II)V", "getMinPace", "()I", "getMaxPace", "component1", "component2", "copy", "equals", "", "other", "", "hashCode", "toString", "", "training-plan-export_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class RunningPaceRange implements Serializable {

    @SerializedName("max_pace")
    private final int maxPace;

    @SerializedName("min_pace")
    private final int minPace;

    public RunningPaceRange(int i, int i2) {
        this.minPace = i;
        this.maxPace = i2;
    }

    public static /* synthetic */ RunningPaceRange copy$default(RunningPaceRange runningPaceRange, int i, int i2, int i3, Object obj) {
        if ((i3 & 1) != 0) {
            i = runningPaceRange.minPace;
        }
        if ((i3 & 2) != 0) {
            i2 = runningPaceRange.maxPace;
        }
        return runningPaceRange.copy(i, i2);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final int getMinPace() {
        return this.minPace;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final int getMaxPace() {
        return this.maxPace;
    }

    @NotNull
    public final RunningPaceRange copy(int minPace, int maxPace) {
        return new RunningPaceRange(minPace, maxPace);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof RunningPaceRange)) {
            return false;
        }
        RunningPaceRange runningPaceRange = (RunningPaceRange) other;
        return this.minPace == runningPaceRange.minPace && this.maxPace == runningPaceRange.maxPace;
    }

    public final int getMaxPace() {
        return this.maxPace;
    }

    public final int getMinPace() {
        return this.minPace;
    }

    public int hashCode() {
        return (Integer.hashCode(this.minPace) * 31) + Integer.hashCode(this.maxPace);
    }

    @NotNull
    public String toString() {
        return "RunningPaceRange(minPace=" + this.minPace + ", maxPace=" + this.maxPace + ")";
    }
}
