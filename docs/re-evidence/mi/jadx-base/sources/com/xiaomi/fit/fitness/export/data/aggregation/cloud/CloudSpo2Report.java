package com.xiaomi.fit.fitness.export.data.aggregation.cloud;

import com.google.gson.annotations.SerializedName;
import com.xiaomi.fit.fitness.export.data.FitnessPersistKey;
import com.xiaomi.fit.fitness.export.data.item.Spo2Item;
import com.xiaomi.fit.fitness.parser.schema.FitnessReportKey;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B3\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\t\u0010\nJ\t\u0010\u0012\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0013\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0014\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0015\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u0016\u001a\u0004\u0018\u00010\bHÆ\u0003J=\u0010\u0017\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00032\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\bHÆ\u0001J\u0013\u0010\u0018\u001a\u00020\u00192\b\u0010\u001a\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001b\u001a\u00020\u0003HÖ\u0001J\t\u0010\u001c\u001a\u00020\u001dHÖ\u0001R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0016\u0010\u0004\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\fR\u0016\u0010\u0005\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\fR\u0016\u0010\u0006\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\fR\u0018\u0010\u0007\u001a\u0004\u0018\u00010\b8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011¨\u0006\u001e"}, d2 = {"Lcom/xiaomi/fit/fitness/export/data/aggregation/cloud/CloudSpo2Report;", "", FitnessReportKey.maxSpo2, "", FitnessReportKey.minSpo2, FitnessReportKey.avgSpo2, "lackSpo2Count", "latestSpo2", "Lcom/xiaomi/fit/fitness/export/data/item/Spo2Item;", "<init>", "(IIIILcom/xiaomi/fit/fitness/export/data/item/Spo2Item;)V", "getMaxSpo2", "()I", "getMinSpo2", "getAvgSpo2", "getLackSpo2Count", "getLatestSpo2", "()Lcom/xiaomi/fit/fitness/export/data/item/Spo2Item;", "component1", "component2", "component3", "component4", "component5", "copy", "equals", "", "other", "hashCode", "toString", "", "fitness-data-export_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class CloudSpo2Report {

    @SerializedName("avg_spo2")
    private final int avgSpo2;

    @SerializedName("lack_spo2_count")
    private final int lackSpo2Count;

    @SerializedName("latest_spo2")
    @Nullable
    private final Spo2Item latestSpo2;

    @SerializedName(FitnessPersistKey.ReportMaxSpo2)
    private final int maxSpo2;

    @SerializedName(FitnessPersistKey.ReportMinSpo2)
    private final int minSpo2;

    public CloudSpo2Report(int i, int i2, int i3, int i4, @Nullable Spo2Item spo2Item) {
        this.maxSpo2 = i;
        this.minSpo2 = i2;
        this.avgSpo2 = i3;
        this.lackSpo2Count = i4;
        this.latestSpo2 = spo2Item;
    }

    public static /* synthetic */ CloudSpo2Report copy$default(CloudSpo2Report cloudSpo2Report, int i, int i2, int i3, int i4, Spo2Item spo2Item, int i5, Object obj) {
        if ((i5 & 1) != 0) {
            i = cloudSpo2Report.maxSpo2;
        }
        if ((i5 & 2) != 0) {
            i2 = cloudSpo2Report.minSpo2;
        }
        int i6 = i2;
        if ((i5 & 4) != 0) {
            i3 = cloudSpo2Report.avgSpo2;
        }
        int i7 = i3;
        if ((i5 & 8) != 0) {
            i4 = cloudSpo2Report.lackSpo2Count;
        }
        int i8 = i4;
        if ((i5 & 16) != 0) {
            spo2Item = cloudSpo2Report.latestSpo2;
        }
        return cloudSpo2Report.copy(i, i6, i7, i8, spo2Item);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final int getMaxSpo2() {
        return this.maxSpo2;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final int getMinSpo2() {
        return this.minSpo2;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final int getAvgSpo2() {
        return this.avgSpo2;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final int getLackSpo2Count() {
        return this.lackSpo2Count;
    }

    @Nullable
    /* JADX INFO: renamed from: component5, reason: from getter */
    public final Spo2Item getLatestSpo2() {
        return this.latestSpo2;
    }

    @NotNull
    public final CloudSpo2Report copy(int maxSpo2, int minSpo2, int avgSpo2, int lackSpo2Count, @Nullable Spo2Item latestSpo2) {
        return new CloudSpo2Report(maxSpo2, minSpo2, avgSpo2, lackSpo2Count, latestSpo2);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof CloudSpo2Report)) {
            return false;
        }
        CloudSpo2Report cloudSpo2Report = (CloudSpo2Report) other;
        return this.maxSpo2 == cloudSpo2Report.maxSpo2 && this.minSpo2 == cloudSpo2Report.minSpo2 && this.avgSpo2 == cloudSpo2Report.avgSpo2 && this.lackSpo2Count == cloudSpo2Report.lackSpo2Count && Intrinsics.areEqual(this.latestSpo2, cloudSpo2Report.latestSpo2);
    }

    public final int getAvgSpo2() {
        return this.avgSpo2;
    }

    public final int getLackSpo2Count() {
        return this.lackSpo2Count;
    }

    @Nullable
    public final Spo2Item getLatestSpo2() {
        return this.latestSpo2;
    }

    public final int getMaxSpo2() {
        return this.maxSpo2;
    }

    public final int getMinSpo2() {
        return this.minSpo2;
    }

    public int hashCode() {
        int iHashCode = ((((((Integer.hashCode(this.maxSpo2) * 31) + Integer.hashCode(this.minSpo2)) * 31) + Integer.hashCode(this.avgSpo2)) * 31) + Integer.hashCode(this.lackSpo2Count)) * 31;
        Spo2Item spo2Item = this.latestSpo2;
        return iHashCode + (spo2Item == null ? 0 : spo2Item.hashCode());
    }

    @NotNull
    public String toString() {
        return "CloudSpo2Report(maxSpo2=" + this.maxSpo2 + ", minSpo2=" + this.minSpo2 + ", avgSpo2=" + this.avgSpo2 + ", lackSpo2Count=" + this.lackSpo2Count + ", latestSpo2=" + this.latestSpo2 + ")";
    }

    public /* synthetic */ CloudSpo2Report(int i, int i2, int i3, int i4, Spo2Item spo2Item, int i5, DefaultConstructorMarker defaultConstructorMarker) {
        this(i, i2, i3, i4, (i5 & 16) != 0 ? null : spo2Item);
    }
}
