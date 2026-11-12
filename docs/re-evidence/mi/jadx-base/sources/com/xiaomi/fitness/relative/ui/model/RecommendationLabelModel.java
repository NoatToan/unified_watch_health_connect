package com.xiaomi.fitness.relative.ui.model;

import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u000e\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001B\u001f\u0012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\u0007\u0010\bJ\u000f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003HÆ\u0003J\u0010\u0010\u0011\u001a\u0004\u0018\u00010\u0006HÆ\u0003¢\u0006\u0002\u0010\fJ*\u0010\u0012\u001a\u00020\u00002\u000e\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0006HÆ\u0001¢\u0006\u0002\u0010\u0013J\u0013\u0010\u0014\u001a\u00020\u00152\b\u0010\u0016\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0017\u001a\u00020\u0006HÖ\u0001J\t\u0010\u0018\u001a\u00020\u0004HÖ\u0001R\u0017\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u001e\u0010\u0005\u001a\u0004\u0018\u00010\u0006X\u0086\u000e¢\u0006\u0010\n\u0002\u0010\u000f\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000e¨\u0006\u0019"}, d2 = {"Lcom/xiaomi/fitness/relative/ui/model/RecommendationLabelModel;", "", "labels", "", "", "selectedPosition", "", "<init>", "(Ljava/util/List;Ljava/lang/Integer;)V", "getLabels", "()Ljava/util/List;", "getSelectedPosition", "()Ljava/lang/Integer;", "setSelectedPosition", "(Ljava/lang/Integer;)V", "Ljava/lang/Integer;", "component1", "component2", "copy", "(Ljava/util/List;Ljava/lang/Integer;)Lcom/xiaomi/fitness/relative/ui/model/RecommendationLabelModel;", "equals", "", "other", "hashCode", "toString", "relative-care_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class RecommendationLabelModel {

    @NotNull
    private final List<String> labels;

    @Nullable
    private Integer selectedPosition;

    public RecommendationLabelModel(@NotNull List<String> labels, @Nullable Integer num) {
        Intrinsics.checkNotNullParameter(labels, "labels");
        this.labels = labels;
        this.selectedPosition = num;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ RecommendationLabelModel copy$default(RecommendationLabelModel recommendationLabelModel, List list, Integer num, int i, Object obj) {
        if ((i & 1) != 0) {
            list = recommendationLabelModel.labels;
        }
        if ((i & 2) != 0) {
            num = recommendationLabelModel.selectedPosition;
        }
        return recommendationLabelModel.copy(list, num);
    }

    @NotNull
    public final List<String> component1() {
        return this.labels;
    }

    @Nullable
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final Integer getSelectedPosition() {
        return this.selectedPosition;
    }

    @NotNull
    public final RecommendationLabelModel copy(@NotNull List<String> labels, @Nullable Integer selectedPosition) {
        Intrinsics.checkNotNullParameter(labels, "labels");
        return new RecommendationLabelModel(labels, selectedPosition);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof RecommendationLabelModel)) {
            return false;
        }
        RecommendationLabelModel recommendationLabelModel = (RecommendationLabelModel) other;
        return Intrinsics.areEqual(this.labels, recommendationLabelModel.labels) && Intrinsics.areEqual(this.selectedPosition, recommendationLabelModel.selectedPosition);
    }

    @NotNull
    public final List<String> getLabels() {
        return this.labels;
    }

    @Nullable
    public final Integer getSelectedPosition() {
        return this.selectedPosition;
    }

    public int hashCode() {
        int iHashCode = this.labels.hashCode() * 31;
        Integer num = this.selectedPosition;
        return iHashCode + (num == null ? 0 : num.hashCode());
    }

    public final void setSelectedPosition(@Nullable Integer num) {
        this.selectedPosition = num;
    }

    @NotNull
    public String toString() {
        return "RecommendationLabelModel(labels=" + this.labels + ", selectedPosition=" + this.selectedPosition + ")";
    }
}
