package com.xiaomi.fitness.steps;

import android.content.Context;
import com.xiaomi.fitness.instance.InstanceExtKt;
import com.xiaomi.fitness.steps.PhoneStepsProvider;
import java.util.List;
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0016\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\rJ$\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00110\u00102\u0006\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0012\u001a\u00020\u000bJ$\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00110\u00102\u0006\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0012\u001a\u00020\u000bJ\u000e\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u0016\u001a\u00020\u0017J\u0006\u0010\u0018\u001a\u00020\u0015J\u0014\u0010\u0019\u001a\u00020\u001a2\f\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u001a0\u001cR\u001d\u0010\u0004\u001a\u0004\u0018\u00010\u00058BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\b\u0010\t\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u001d"}, d2 = {"Lcom/xiaomi/fitness/steps/PhoneStepsProvider;", "", "<init>", "()V", "mStepProviderInternal", "Lcom/xiaomi/fitness/steps/StepProviderInternal;", "getMStepProviderInternal", "()Lcom/xiaomi/fitness/steps/StepProviderInternal;", "mStepProviderInternal$delegate", "Lkotlin/Lazy;", "getStepsTotal", "", "beginTime", "", "endTime", "getSteps", "", "Lcom/xiaomi/fitness/steps/StepItem;", "granularity", "getStepsOptimization", "getStepProviderValid", "", "context", "Landroid/content/Context;", "supported", "setObserver", "", "observer", "Lkotlin/Function0;", "steps_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class PhoneStepsProvider {

    @NotNull
    public static final PhoneStepsProvider INSTANCE = new PhoneStepsProvider();

    /* JADX INFO: renamed from: mStepProviderInternal$delegate, reason: from kotlin metadata */
    @NotNull
    private static final Lazy mStepProviderInternal = LazyKt__LazyJVMKt.lazy(new Function0() { // from class: cuh
        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            return PhoneStepsProvider.mStepProviderInternal_delegate$lambda$0();
        }
    });

    private PhoneStepsProvider() {
    }

    private final StepProviderInternal getMStepProviderInternal() {
        return (StepProviderInternal) mStepProviderInternal.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final StepProviderInternal mStepProviderInternal_delegate$lambda$0() {
        return (StepProviderInternal) InstanceExtKt.getInstance(Reflection.getOrCreateKotlinClass(StepProviderInternal.class));
    }

    public final boolean getStepProviderValid(@NotNull Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        StepProviderInternal mStepProviderInternal2 = getMStepProviderInternal();
        if (mStepProviderInternal2 != null) {
            return mStepProviderInternal2.getStepProviderValid(context);
        }
        return false;
    }

    @NotNull
    public final List<StepItem> getSteps(long beginTime, long endTime, int granularity) {
        List<StepItem> steps;
        StepProviderInternal mStepProviderInternal2 = getMStepProviderInternal();
        return (mStepProviderInternal2 == null || (steps = mStepProviderInternal2.getSteps(beginTime, endTime, granularity)) == null) ? CollectionsKt__CollectionsKt.emptyList() : steps;
    }

    @NotNull
    public final List<StepItem> getStepsOptimization(long beginTime, long endTime, int granularity) {
        List<StepItem> stepsOptimization;
        StepProviderInternal mStepProviderInternal2 = getMStepProviderInternal();
        return (mStepProviderInternal2 == null || (stepsOptimization = mStepProviderInternal2.getStepsOptimization(beginTime, endTime, granularity)) == null) ? CollectionsKt__CollectionsKt.emptyList() : stepsOptimization;
    }

    public final int getStepsTotal(long beginTime, long endTime) {
        StepProviderInternal mStepProviderInternal2 = getMStepProviderInternal();
        if (mStepProviderInternal2 != null) {
            return mStepProviderInternal2.getStepsTotal(beginTime, endTime);
        }
        return 0;
    }

    public final void setObserver(@NotNull Function0<Unit> observer) {
        Intrinsics.checkNotNullParameter(observer, "observer");
        StepProviderInternal mStepProviderInternal2 = getMStepProviderInternal();
        if (mStepProviderInternal2 != null) {
            mStepProviderInternal2.setObserver(observer);
        }
    }

    public final boolean supported() {
        StepProviderInternal mStepProviderInternal2 = getMStepProviderInternal();
        if (mStepProviderInternal2 != null) {
            return mStepProviderInternal2.supported();
        }
        return false;
    }
}
