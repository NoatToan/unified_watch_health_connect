package com.huami.step.model;

import com.xiaomi.hm.health.watermarkcamera.web.GetWatermarkAPI;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes14.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010!\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\f\b\u0086\b\u0018\u00002\u00020\u0001B\u001d\u0012\u0006\u0010\u0006\u001a\u00020\u0002\u0012\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00020\u0004¢\u0006\u0004\b\u0018\u0010\u0019J\t\u0010\u0003\u001a\u00020\u0002HÆ\u0003J\u000f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00020\u0004HÆ\u0003J#\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0006\u001a\u00020\u00022\u000e\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00020\u0004HÆ\u0001J\t\u0010\n\u001a\u00020\tHÖ\u0001J\t\u0010\f\u001a\u00020\u000bHÖ\u0001J\u0013\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\u0001HÖ\u0003R\u0019\u0010\u0006\u001a\u00020\u00028\u0006@\u0006¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013R\u001f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00020\u00048\u0006@\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017¨\u0006\u001a"}, d2 = {"Lcom/huami/step/model/StepsInTime;", "", "Lcom/huami/step/model/StepInfo;", "component1", "", "component2", "totalStep", GetWatermarkAPI.KEY_NAME_STEPS, "copy", "", "toString", "", "hashCode", "other", "", "equals", "a", "Lcom/huami/step/model/StepInfo;", "getTotalStep", "()Lcom/huami/step/model/StepInfo;", "b", "Ljava/util/List;", "getSteps", "()Ljava/util/List;", "<init>", "(Lcom/huami/step/model/StepInfo;Ljava/util/List;)V", "step_release"}, k = 1, mv = {1, 5, 1})
public final /* data */ class StepsInTime {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata and from toString */
    @NotNull
    private final StepInfo totalStep;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata and from toString */
    @NotNull
    private final List<StepInfo> steps;

    public StepsInTime(@NotNull StepInfo stepInfo, @NotNull List<StepInfo> list) {
        this.totalStep = stepInfo;
        this.steps = list;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ StepsInTime copy$default(StepsInTime stepsInTime, StepInfo stepInfo, List list, int i, Object obj) {
        if ((i & 1) != 0) {
            stepInfo = stepsInTime.totalStep;
        }
        if ((i & 2) != 0) {
            list = stepsInTime.steps;
        }
        return stepsInTime.copy(stepInfo, list);
    }

    @NotNull
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final StepInfo getTotalStep() {
        return this.totalStep;
    }

    @NotNull
    public final List<StepInfo> component2() {
        return this.steps;
    }

    @NotNull
    public final StepsInTime copy(@NotNull StepInfo totalStep, @NotNull List<StepInfo> steps) {
        return new StepsInTime(totalStep, steps);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof StepsInTime)) {
            return false;
        }
        StepsInTime stepsInTime = (StepsInTime) other;
        return Intrinsics.areEqual(this.totalStep, stepsInTime.totalStep) && Intrinsics.areEqual(this.steps, stepsInTime.steps);
    }

    @NotNull
    public final List<StepInfo> getSteps() {
        return this.steps;
    }

    @NotNull
    public final StepInfo getTotalStep() {
        return this.totalStep;
    }

    public int hashCode() {
        return (this.totalStep.hashCode() * 31) + this.steps.hashCode();
    }

    @NotNull
    public String toString() {
        return "StepsInTime(totalStep=" + this.totalStep + ", steps=" + this.steps + ")";
    }
}
