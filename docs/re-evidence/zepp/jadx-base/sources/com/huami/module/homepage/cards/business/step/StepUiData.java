package com.huami.module.homepage.cards.business.step;

import com.huami.step.service.StepEntry;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\f\b\u0080\b\u0018\u00002\u00020\u0001B\u001d\u0012\u0006\u0010\u0007\u001a\u00020\u0002\u0012\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0019\u0010\u001aJ\t\u0010\u0003\u001a\u00020\u0002HÆ\u0003J\u000f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004HÆ\u0003J#\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0007\u001a\u00020\u00022\u000e\b\u0002\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004HÆ\u0001J\t\u0010\u000b\u001a\u00020\nHÖ\u0001J\t\u0010\r\u001a\u00020\fHÖ\u0001J\u0013\u0010\u0010\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\u0001HÖ\u0003R\u0019\u0010\u0007\u001a\u00020\u00028\u0006@\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014R\u001f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0006@\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018¨\u0006\u001b"}, d2 = {"Lcom/huami/module/homepage/cards/business/step/StepUiData;", "", "Lcom/huami/step/service/StepEntry;", "component1", "", "Lcom/huami/module/homepage/cards/business/step/Point;", "component2", "stepOfToday", "stepsInLast7Days", "copy", "", "toString", "", "hashCode", "other", "", "equals", "a", "Lcom/huami/step/service/StepEntry;", "getStepOfToday", "()Lcom/huami/step/service/StepEntry;", "b", "Ljava/util/List;", "getStepsInLast7Days", "()Ljava/util/List;", "<init>", "(Lcom/huami/step/service/StepEntry;Ljava/util/List;)V", "homePage_release"}, k = 1, mv = {1, 5, 1})
public final /* data */ class StepUiData {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata and from toString */
    @NotNull
    private final StepEntry stepOfToday;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata and from toString */
    @NotNull
    private final List<Point> stepsInLast7Days;

    public StepUiData(@NotNull StepEntry stepEntry, @NotNull List<Point> list) {
        this.stepOfToday = stepEntry;
        this.stepsInLast7Days = list;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ StepUiData copy$default(StepUiData stepUiData, StepEntry stepEntry, List list, int i, Object obj) {
        if ((i & 1) != 0) {
            stepEntry = stepUiData.stepOfToday;
        }
        if ((i & 2) != 0) {
            list = stepUiData.stepsInLast7Days;
        }
        return stepUiData.copy(stepEntry, list);
    }

    @NotNull
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final StepEntry getStepOfToday() {
        return this.stepOfToday;
    }

    @NotNull
    public final List<Point> component2() {
        return this.stepsInLast7Days;
    }

    @NotNull
    public final StepUiData copy(@NotNull StepEntry stepOfToday, @NotNull List<Point> stepsInLast7Days) {
        return new StepUiData(stepOfToday, stepsInLast7Days);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof StepUiData)) {
            return false;
        }
        StepUiData stepUiData = (StepUiData) other;
        return Intrinsics.areEqual(this.stepOfToday, stepUiData.stepOfToday) && Intrinsics.areEqual(this.stepsInLast7Days, stepUiData.stepsInLast7Days);
    }

    @NotNull
    public final StepEntry getStepOfToday() {
        return this.stepOfToday;
    }

    @NotNull
    public final List<Point> getStepsInLast7Days() {
        return this.stepsInLast7Days;
    }

    public int hashCode() {
        return (this.stepOfToday.hashCode() * 31) + this.stepsInLast7Days.hashCode();
    }

    @NotNull
    public String toString() {
        return "StepUiData(stepOfToday=" + this.stepOfToday + ", stepsInLast7Days=" + this.stepsInLast7Days + ")";
    }
}
