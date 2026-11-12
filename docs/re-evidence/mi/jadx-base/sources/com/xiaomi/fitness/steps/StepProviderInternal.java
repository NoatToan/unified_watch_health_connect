package com.xiaomi.fitness.steps;

import android.content.Context;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J\u0018\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0005H&J&\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\b2\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\n\u001a\u00020\u0003H&J&\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\t0\b2\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\n\u001a\u00020\u0003H&J\u0010\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u000fH&J\b\u0010\u0010\u001a\u00020\rH&J\u0016\u0010\u0011\u001a\u00020\u00122\f\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00120\u0014H&¨\u0006\u0015"}, d2 = {"Lcom/xiaomi/fitness/steps/StepProviderInternal;", "", "getStepsTotal", "", "beginTime", "", "endTime", "getSteps", "", "Lcom/xiaomi/fitness/steps/StepItem;", "granularity", "getStepsOptimization", "getStepProviderValid", "", "context", "Landroid/content/Context;", "supported", "setObserver", "", "observer", "Lkotlin/Function0;", "steps_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
public interface StepProviderInternal {
    boolean getStepProviderValid(@NotNull Context context);

    @NotNull
    List<StepItem> getSteps(long beginTime, long endTime, int granularity);

    @NotNull
    List<StepItem> getStepsOptimization(long beginTime, long endTime, int granularity);

    int getStepsTotal(long beginTime, long endTime);

    void setObserver(@NotNull Function0<Unit> observer);

    boolean supported();
}
