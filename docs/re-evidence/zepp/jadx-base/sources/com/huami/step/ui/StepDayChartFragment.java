package com.huami.step.ui;

import android.os.Bundle;
import android.view.View;
import androidx.p008lifecycle.LifecycleOwnerKt;
import androidx.p008lifecycle.Observer;
import com.facebook.appevents.internal.ViewHierarchyConstants;
import com.huami.module.ktx.I18nKt;
import com.huami.step.R;
import com.huami.step.koin.IRunDataAnalysisJob;
import com.huami.step.koin.IStepRank;
import com.huami.step.koin.KoinExtKt;
import com.huami.step.koin.RealTimeStepLiveData;
import com.huami.step.model.StepInfo;
import com.huami.step.model.StepsInTime;
import com.huami.step.ui.StepDayChartFragment;
import com.huami.step.utils.StepTimeUtils;
import com.huami.tools.log.HMLog;
import com.loc.z;
import com.xiaomi.hm.health.timeutil.TimeUtils;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Lambda;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Dispatchers;
import kotlinx.coroutines.e;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes14.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\r\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0018\u0010\u0019J\u001a\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0016J\u0010\u0010\n\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\bH\u0016J\u0018\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\u000e\u001a\u00020\rH\u0016J\u0018\u0010\u0013\u001a\u00020\u00122\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\u0011\u001a\u00020\rH\u0016R\u0018\u0010\u0017\u001a\u0004\u0018\u00010\u00148\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016¨\u0006\u001a"}, d2 = {"Lcom/huami/step/ui/StepDayChartFragment;", "Lcom/huami/step/ui/StepChartFragment;", "Landroid/view/View;", ViewHierarchyConstants.VIEW_KEY, "Landroid/os/Bundle;", "savedInstanceState", "", "onViewCreated", "Lcom/huami/step/model/StepsInTime;", "stepInfo", "afterLoadData", "", "isTouchValue", "", "value", "", "getValueString", "size", "", "getUnitString", "Lcom/huami/step/model/StepInfo;", z.j, "Lcom/huami/step/model/StepInfo;", "realTimeSteps", "<init>", "()V", "step_release"}, k = 1, mv = {1, 5, 1})
public final class StepDayChartFragment extends StepChartFragment {

    /* JADX INFO: renamed from: j, reason: from kotlin metadata */
    @Nullable
    private StepInfo realTimeSteps;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    @DebugMetadata(c = "com.huami.step.ui.StepDayChartFragment$afterLoadData$1", f = "StepDayChartFragment.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    public static final class a extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        public int a;
        public final /* synthetic */ StepsInTime b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(StepsInTime stepsInTime, Continuation<? super a> continuation) {
            super(2, continuation);
            this.b = stepsInTime;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            return new a(this.b, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        @Nullable
        public final Object invoke(@NotNull CoroutineScope coroutineScope, @Nullable Continuation<? super Unit> continuation) {
            return ((a) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            kotlin.coroutines.intrinsics.a.getCOROUTINE_SUSPENDED();
            if (this.a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            IStepRank iStepRank = KoinExtKt.getIStepRank();
            if (iStepRank != null) {
                iStepRank.calculateStepRank(this.b.getTotalStep().getSteps());
            }
            return Unit.INSTANCE;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class b extends Lambda implements Function0<String> {
        public final /* synthetic */ StepInfo a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(StepInfo stepInfo) {
            super(0);
            this.a = stepInfo;
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final String getA() {
            return this.a.toString();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void u(StepDayChartFragment stepDayChartFragment, StepInfo stepInfo) {
        stepDayChartFragment.realTimeSteps = stepInfo;
        HMLog.verbose("realTimeSteps", new b(stepInfo));
    }

    @Override // com.huami.step.ui.StepChartFragment, com.huami.hmchartui.ui.CommonChartFragment
    public void _$_clearFindViewByIdCache() {
    }

    @Override // com.huami.step.ui.StepChartFragment
    public void afterLoadData(@NotNull StepsInTime stepInfo) {
        if (TimeUtils.isToday(getTime())) {
            e.f(LifecycleOwnerKt.getLifecycleScope(this), Dispatchers.getIO(), null, new a(stepInfo, null), 2, null);
        }
    }

    @Override // com.huami.step.ui.StepChartFragment, com.huami.hmchartui.ui.CommonChartFragment
    @NotNull
    public CharSequence getUnitString(boolean isTouchValue, int size) {
        return getResources().getQuantityText(R.plurals.step_text_unit_step, size);
    }

    @Override // com.huami.step.ui.StepChartFragment, com.huami.hmchartui.ui.CommonChartFragment
    @NotNull
    public String getValueString(boolean isTouchValue, int value) {
        if (isTouchValue) {
            return I18nKt.i18n(value);
        }
        StepInfo stepInfo = this.realTimeSteps;
        return I18nKt.i18n(Math.max(stepInfo == null ? 0 : stepInfo.getSteps(), value));
    }

    @Override // com.huami.step.ui.StepChartFragment, androidx.fragment.app.Fragment
    public void onViewCreated(@NotNull View view, @Nullable Bundle savedInstanceState) {
        RealTimeStepLiveData realTimeStep;
        super.onViewCreated(view, savedInstanceState);
        IRunDataAnalysisJob runDataAnalysisJob = KoinExtKt.getRunDataAnalysisJob();
        if (runDataAnalysisJob != null) {
            runDataAnalysisJob.runJob(getUserId(), StepTimeUtils.INSTANCE.formatDate(getTime()));
        }
        if (!TimeUtils.isToday(getTime()) || (realTimeStep = KoinExtKt.getRealTimeStep()) == null) {
            return;
        }
        realTimeStep.observe(getViewLifecycleOwner(), new Observer() { // from class: mg7
            @Override // androidx.p008lifecycle.Observer
            public final void onChanged(Object obj) {
                StepDayChartFragment.u(this.a, (StepInfo) obj);
            }
        });
    }
}
