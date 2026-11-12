package com.xiaomi.fit.fitness.export.data.aggregation.cloud;

import com.google.gson.annotations.SerializedName;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\r\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\t\u0010\r\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000e\u001a\u00020\u0003HÆ\u0003J'\u0010\u000f\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\u0010\u001a\u00020\u00112\b\u0010\u0012\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0013\u001a\u00020\u0003HÖ\u0001J\t\u0010\u0014\u001a\u00020\u0015HÖ\u0001R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0016\u0010\u0004\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\tR\u0016\u0010\u0005\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\t¨\u0006\u0016"}, d2 = {"Lcom/xiaomi/fit/fitness/export/data/aggregation/cloud/CloudStepReport;", "", "steps", "", "distance", "calories", "<init>", "(III)V", "getSteps", "()I", "getDistance", "getCalories", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "toString", "", "fitness-data-export_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class CloudStepReport {

    @SerializedName("calories")
    private final int calories;

    @SerializedName("distance")
    private final int distance;

    @SerializedName("steps")
    private final int steps;

    public CloudStepReport(int i, int i2, int i3) {
        this.steps = i;
        this.distance = i2;
        this.calories = i3;
    }

    public static /* synthetic */ CloudStepReport copy$default(CloudStepReport cloudStepReport, int i, int i2, int i3, int i4, Object obj) {
        if ((i4 & 1) != 0) {
            i = cloudStepReport.steps;
        }
        if ((i4 & 2) != 0) {
            i2 = cloudStepReport.distance;
        }
        if ((i4 & 4) != 0) {
            i3 = cloudStepReport.calories;
        }
        return cloudStepReport.copy(i, i2, i3);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final int getSteps() {
        return this.steps;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final int getDistance() {
        return this.distance;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final int getCalories() {
        return this.calories;
    }

    @NotNull
    public final CloudStepReport copy(int steps, int distance, int calories) {
        return new CloudStepReport(steps, distance, calories);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof CloudStepReport)) {
            return false;
        }
        CloudStepReport cloudStepReport = (CloudStepReport) other;
        return this.steps == cloudStepReport.steps && this.distance == cloudStepReport.distance && this.calories == cloudStepReport.calories;
    }

    public final int getCalories() {
        return this.calories;
    }

    public final int getDistance() {
        return this.distance;
    }

    public final int getSteps() {
        return this.steps;
    }

    public int hashCode() {
        return (((Integer.hashCode(this.steps) * 31) + Integer.hashCode(this.distance)) * 31) + Integer.hashCode(this.calories);
    }

    @NotNull
    public String toString() {
        return "CloudStepReport(steps=" + this.steps + ", distance=" + this.distance + ", calories=" + this.calories + ")";
    }
}
