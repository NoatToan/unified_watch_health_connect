package com.xiaomi.fitness.training_plan_export.model;

import java.io.Serializable;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\n\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\t\u0010\r\u001a\u00020\u0005HÆ\u0003J\u001d\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0012HÖ\u0003J\t\u0010\u0013\u001a\u00020\u0014HÖ\u0001J\t\u0010\u0015\u001a\u00020\u0016HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u0017"}, d2 = {"Lcom/xiaomi/fitness/training_plan_export/model/TrainingInfo;", "Ljava/io/Serializable;", "trainingPlanType", "Lcom/xiaomi/fitness/training_plan_export/model/TrainingPlanType;", "trainingId", "", "<init>", "(Lcom/xiaomi/fitness/training_plan_export/model/TrainingPlanType;J)V", "getTrainingPlanType", "()Lcom/xiaomi/fitness/training_plan_export/model/TrainingPlanType;", "getTrainingId", "()J", "component1", "component2", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "training-plan-export_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class TrainingInfo implements Serializable {
    private final long trainingId;

    @NotNull
    private final TrainingPlanType trainingPlanType;

    public TrainingInfo(@NotNull TrainingPlanType trainingPlanType, long j) {
        Intrinsics.checkNotNullParameter(trainingPlanType, "trainingPlanType");
        this.trainingPlanType = trainingPlanType;
        this.trainingId = j;
    }

    public static /* synthetic */ TrainingInfo copy$default(TrainingInfo trainingInfo, TrainingPlanType trainingPlanType, long j, int i, Object obj) {
        if ((i & 1) != 0) {
            trainingPlanType = trainingInfo.trainingPlanType;
        }
        if ((i & 2) != 0) {
            j = trainingInfo.trainingId;
        }
        return trainingInfo.copy(trainingPlanType, j);
    }

    @NotNull
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final TrainingPlanType getTrainingPlanType() {
        return this.trainingPlanType;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final long getTrainingId() {
        return this.trainingId;
    }

    @NotNull
    public final TrainingInfo copy(@NotNull TrainingPlanType trainingPlanType, long trainingId) {
        Intrinsics.checkNotNullParameter(trainingPlanType, "trainingPlanType");
        return new TrainingInfo(trainingPlanType, trainingId);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof TrainingInfo)) {
            return false;
        }
        TrainingInfo trainingInfo = (TrainingInfo) other;
        return Intrinsics.areEqual(this.trainingPlanType, trainingInfo.trainingPlanType) && this.trainingId == trainingInfo.trainingId;
    }

    public final long getTrainingId() {
        return this.trainingId;
    }

    @NotNull
    public final TrainingPlanType getTrainingPlanType() {
        return this.trainingPlanType;
    }

    public int hashCode() {
        return (this.trainingPlanType.hashCode() * 31) + Long.hashCode(this.trainingId);
    }

    @NotNull
    public String toString() {
        return "TrainingInfo(trainingPlanType=" + this.trainingPlanType + ", trainingId=" + this.trainingId + ")";
    }
}
