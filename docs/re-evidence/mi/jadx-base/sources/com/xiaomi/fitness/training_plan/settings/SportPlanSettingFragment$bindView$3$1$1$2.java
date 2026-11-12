package com.xiaomi.fitness.training_plan.settings;

import android.content.Context;
import com.xiaomi.fitness.common.log.Logger;
import com.xiaomi.fitness.training_plan.util.TrainingPlanPreference;
import com.xiaomi.fitness.widget.SwitchButtonBindingTwoLineTextView;
import defpackage.po0;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Dispatchers;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
@DebugMetadata(c = "com.xiaomi.fitness.training_plan.settings.SportPlanSettingFragment$bindView$3$1$1$2", f = "SportPlanSettingFragment.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
public final class SportPlanSettingFragment$bindView$3$1$1$2 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ po0 $this_bindView;
    int label;
    final /* synthetic */ SportPlanSettingFragment this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SportPlanSettingFragment$bindView$3$1$1$2(po0 po0Var, SportPlanSettingFragment sportPlanSettingFragment, Continuation<? super SportPlanSettingFragment$bindView$3$1$1$2> continuation) {
        super(2, continuation);
        this.$this_bindView = po0Var;
        this.this$0 = sportPlanSettingFragment;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new SportPlanSettingFragment$bindView$3$1$1$2(this.$this_bindView, this.this$0, continuation);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        ResultKt.throwOnFailure(obj);
        this.$this_bindView.E.setSwitch(false);
        TrainingPlanPreference.INSTANCE.setSAVE_PLAN_TO_CALENDAR(false);
        Dispatchers.getIO();
        SportPlanSettingFragment sportPlanSettingFragment = this.this$0;
        Logger.i("SportPlanSettingFragment", "Calender deleteCalendarIfNeed start");
        SportPlanSettingVM sportPlanSettingVMAccess$getMViewModel = SportPlanSettingFragment.access$getMViewModel(sportPlanSettingFragment);
        Context contextRequireContext = sportPlanSettingFragment.requireContext();
        Intrinsics.checkNotNullExpressionValue(contextRequireContext, "requireContext(...)");
        sportPlanSettingVMAccess$getMViewModel.deleteCalendarIfNeed(contextRequireContext);
        Logger.i("SportPlanSettingFragment", "Calender deleteCalendarIfNeed finish");
        SwitchButtonBindingTwoLineTextView switchButtonBindingTwoLineTextView = this.$this_bindView.E;
        final SportPlanSettingFragment sportPlanSettingFragment2 = this.this$0;
        switchButtonBindingTwoLineTextView.post(new Runnable() { // from class: com.xiaomi.fitness.training_plan.settings.b
            @Override // java.lang.Runnable
            public final void run() {
                sportPlanSettingFragment2.hideLoading();
            }
        });
        return Unit.INSTANCE;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((SportPlanSettingFragment$bindView$3$1$1$2) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }
}
