package com.xiaomi.fit.fitness.export.data.aggregation.cloud;

import com.google.gson.annotations.SerializedName;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B'\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0007¢\u0006\u0004\b\b\u0010\tJ\t\u0010\u0010\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0011\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0012\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0013\u001a\u00020\u0007HÆ\u0003J1\u0010\u0014\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u0007HÆ\u0001J\u0013\u0010\u0015\u001a\u00020\u00162\b\u0010\u0017\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0018\u001a\u00020\u0003HÖ\u0001J\t\u0010\u0019\u001a\u00020\u001aHÖ\u0001R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0016\u0010\u0004\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\u000bR\u0016\u0010\u0005\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000bR\u0016\u0010\u0006\u001a\u00020\u00078\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000f¨\u0006\u001b"}, d2 = {"Lcom/xiaomi/fit/fitness/export/data/aggregation/cloud/CloudStressReport;", "", "avgStress", "", "maxStress", "minStress", "stressScale", "Lcom/xiaomi/fit/fitness/export/data/aggregation/cloud/StressScaleItem;", "<init>", "(IIILcom/xiaomi/fit/fitness/export/data/aggregation/cloud/StressScaleItem;)V", "getAvgStress", "()I", "getMaxStress", "getMinStress", "getStressScale", "()Lcom/xiaomi/fit/fitness/export/data/aggregation/cloud/StressScaleItem;", "component1", "component2", "component3", "component4", "copy", "equals", "", "other", "hashCode", "toString", "", "fitness-data-export_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class CloudStressReport {

    @SerializedName("avg_stress")
    private final int avgStress;

    @SerializedName("max_stress")
    private final int maxStress;

    @SerializedName("min_stress")
    private final int minStress;

    @SerializedName("stress_scale")
    @NotNull
    private final StressScaleItem stressScale;

    public CloudStressReport(int i, int i2, int i3, @NotNull StressScaleItem stressScale) {
        Intrinsics.checkNotNullParameter(stressScale, "stressScale");
        this.avgStress = i;
        this.maxStress = i2;
        this.minStress = i3;
        this.stressScale = stressScale;
    }

    public static /* synthetic */ CloudStressReport copy$default(CloudStressReport cloudStressReport, int i, int i2, int i3, StressScaleItem stressScaleItem, int i4, Object obj) {
        if ((i4 & 1) != 0) {
            i = cloudStressReport.avgStress;
        }
        if ((i4 & 2) != 0) {
            i2 = cloudStressReport.maxStress;
        }
        if ((i4 & 4) != 0) {
            i3 = cloudStressReport.minStress;
        }
        if ((i4 & 8) != 0) {
            stressScaleItem = cloudStressReport.stressScale;
        }
        return cloudStressReport.copy(i, i2, i3, stressScaleItem);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final int getAvgStress() {
        return this.avgStress;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final int getMaxStress() {
        return this.maxStress;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final int getMinStress() {
        return this.minStress;
    }

    @NotNull
    /* JADX INFO: renamed from: component4, reason: from getter */
    public final StressScaleItem getStressScale() {
        return this.stressScale;
    }

    @NotNull
    public final CloudStressReport copy(int avgStress, int maxStress, int minStress, @NotNull StressScaleItem stressScale) {
        Intrinsics.checkNotNullParameter(stressScale, "stressScale");
        return new CloudStressReport(avgStress, maxStress, minStress, stressScale);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof CloudStressReport)) {
            return false;
        }
        CloudStressReport cloudStressReport = (CloudStressReport) other;
        return this.avgStress == cloudStressReport.avgStress && this.maxStress == cloudStressReport.maxStress && this.minStress == cloudStressReport.minStress && Intrinsics.areEqual(this.stressScale, cloudStressReport.stressScale);
    }

    public final int getAvgStress() {
        return this.avgStress;
    }

    public final int getMaxStress() {
        return this.maxStress;
    }

    public final int getMinStress() {
        return this.minStress;
    }

    @NotNull
    public final StressScaleItem getStressScale() {
        return this.stressScale;
    }

    public int hashCode() {
        return (((((Integer.hashCode(this.avgStress) * 31) + Integer.hashCode(this.maxStress)) * 31) + Integer.hashCode(this.minStress)) * 31) + this.stressScale.hashCode();
    }

    @NotNull
    public String toString() {
        return "CloudStressReport(avgStress=" + this.avgStress + ", maxStress=" + this.maxStress + ", minStress=" + this.minStress + ", stressScale=" + this.stressScale + ")";
    }
}
