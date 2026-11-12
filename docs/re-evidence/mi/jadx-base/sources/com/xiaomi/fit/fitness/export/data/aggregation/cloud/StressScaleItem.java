package com.xiaomi.fit.fitness.export.data.aggregation.cloud;

import com.google.gson.annotations.SerializedName;
import com.xiaomi.fitness.health.bloodpressure.repository.BloodPressurePreRepository;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0010\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B'\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0003¢\u0006\u0004\b\u0007\u0010\bJ\t\u0010\u000e\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000f\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0010\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0011\u001a\u00020\u0003HÆ\u0003J1\u0010\u0012\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\u0013\u001a\u00020\u00142\b\u0010\u0015\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0016\u001a\u00020\u0003HÖ\u0001J\t\u0010\u0017\u001a\u00020\u0018HÖ\u0001R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0016\u0010\u0004\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\nR\u0016\u0010\u0005\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\nR\u0016\u0010\u0006\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\n¨\u0006\u0019"}, d2 = {"Lcom/xiaomi/fit/fitness/export/data/aggregation/cloud/StressScaleItem;", "", "relaxDuration", "", "mildDuration", "moderateDuration", "severeDuration", "<init>", "(IIII)V", "getRelaxDuration", "()I", "getMildDuration", "getModerateDuration", "getSevereDuration", "component1", "component2", "component3", "component4", "copy", "equals", "", "other", "hashCode", "toString", "", "fitness-data-export_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class StressScaleItem {

    @SerializedName("mild")
    private final int mildDuration;

    @SerializedName(BloodPressurePreRepository.KEY_ITEM_MODERATE)
    private final int moderateDuration;

    @SerializedName("relax")
    private final int relaxDuration;

    @SerializedName(BloodPressurePreRepository.KEY_ITEM_SEVERE)
    private final int severeDuration;

    public StressScaleItem(int i, int i2, int i3, int i4) {
        this.relaxDuration = i;
        this.mildDuration = i2;
        this.moderateDuration = i3;
        this.severeDuration = i4;
    }

    public static /* synthetic */ StressScaleItem copy$default(StressScaleItem stressScaleItem, int i, int i2, int i3, int i4, int i5, Object obj) {
        if ((i5 & 1) != 0) {
            i = stressScaleItem.relaxDuration;
        }
        if ((i5 & 2) != 0) {
            i2 = stressScaleItem.mildDuration;
        }
        if ((i5 & 4) != 0) {
            i3 = stressScaleItem.moderateDuration;
        }
        if ((i5 & 8) != 0) {
            i4 = stressScaleItem.severeDuration;
        }
        return stressScaleItem.copy(i, i2, i3, i4);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final int getRelaxDuration() {
        return this.relaxDuration;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final int getMildDuration() {
        return this.mildDuration;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final int getModerateDuration() {
        return this.moderateDuration;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final int getSevereDuration() {
        return this.severeDuration;
    }

    @NotNull
    public final StressScaleItem copy(int relaxDuration, int mildDuration, int moderateDuration, int severeDuration) {
        return new StressScaleItem(relaxDuration, mildDuration, moderateDuration, severeDuration);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof StressScaleItem)) {
            return false;
        }
        StressScaleItem stressScaleItem = (StressScaleItem) other;
        return this.relaxDuration == stressScaleItem.relaxDuration && this.mildDuration == stressScaleItem.mildDuration && this.moderateDuration == stressScaleItem.moderateDuration && this.severeDuration == stressScaleItem.severeDuration;
    }

    public final int getMildDuration() {
        return this.mildDuration;
    }

    public final int getModerateDuration() {
        return this.moderateDuration;
    }

    public final int getRelaxDuration() {
        return this.relaxDuration;
    }

    public final int getSevereDuration() {
        return this.severeDuration;
    }

    public int hashCode() {
        return (((((Integer.hashCode(this.relaxDuration) * 31) + Integer.hashCode(this.mildDuration)) * 31) + Integer.hashCode(this.moderateDuration)) * 31) + Integer.hashCode(this.severeDuration);
    }

    @NotNull
    public String toString() {
        return "StressScaleItem(relaxDuration=" + this.relaxDuration + ", mildDuration=" + this.mildDuration + ", moderateDuration=" + this.moderateDuration + ", severeDuration=" + this.severeDuration + ")";
    }
}
