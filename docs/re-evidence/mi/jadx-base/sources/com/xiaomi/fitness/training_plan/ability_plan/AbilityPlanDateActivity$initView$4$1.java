package com.xiaomi.fitness.training_plan.ability_plan;

import com.xiaomi.fitness.common.log.Logger;
import com.xiaomi.fitness.training_plan.net.StopAbilityPlanResult;
import com.xiaomi.fitness.training_plan.net.TrainingPlanRequest;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
@DebugMetadata(c = "com.xiaomi.fitness.training_plan.ability_plan.AbilityPlanDateActivity$initView$4$1", f = "AbilityPlanDateActivity.kt", i = {}, l = {138}, m = "invokeSuspend", n = {}, s = {})
public final class AbilityPlanDateActivity$initView$4$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ TrainingPlanRequest $planRequest;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AbilityPlanDateActivity$initView$4$1(TrainingPlanRequest trainingPlanRequest, Continuation<? super AbilityPlanDateActivity$initView$4$1> continuation) {
        super(2, continuation);
        this.$planRequest = trainingPlanRequest;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new AbilityPlanDateActivity$initView$4$1(this.$planRequest, continuation);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.label;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            TrainingPlanRequest trainingPlanRequest = this.$planRequest;
            this.label = 1;
            obj = trainingPlanRequest.stopAbilityPlan(this);
            if (obj == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
        }
        Logger.d("AbilityPlanDateActivity", "stop-demo:" + ((StopAbilityPlanResult) obj));
        return Unit.INSTANCE;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((AbilityPlanDateActivity$initView$4$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }
}
