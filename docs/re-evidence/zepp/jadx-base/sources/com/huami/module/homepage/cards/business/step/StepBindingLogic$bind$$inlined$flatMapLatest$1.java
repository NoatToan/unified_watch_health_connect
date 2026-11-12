package com.huami.module.homepage.cards.business.step;

import androidx.exifinterface.media.ExifInterface;
import com.huami.module.homepage.cards.service.CurrentStep;
import com.huami.module.homepage.cards.service.RealtimeStepService;
import com.huami.module.ktx.TimeExtKt;
import com.huami.step.service.StepEntry;
import java.util.Calendar;
import java.util.Date;
import java.util.List;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.a;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function3;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.FlowKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0012\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0006\u001a\u00020\u0004\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u0001*\b\u0012\u0004\u0012\u00028\u00010\u00022\u0006\u0010\u0003\u001a\u00028\u0000H\u008a@¨\u0006\u0005"}, d2 = {ExifInterface.GPS_DIRECTION_TRUE, "R", "Lkotlinx/coroutines/flow/FlowCollector;", "it", "", "kotlinx/coroutines/flow/FlowKt__MergeKt$flatMapLatest$1", "<anonymous>"}, k = 3, mv = {1, 5, 1})
@DebugMetadata(c = "com.huami.module.homepage.cards.business.step.StepBindingLogic$bind$$inlined$flatMapLatest$1", f = "StepBindingLogic.kt", i = {}, l = {224, 224}, m = "invokeSuspend", n = {}, s = {})
public final class StepBindingLogic$bind$$inlined$flatMapLatest$1 extends SuspendLambda implements Function3<FlowCollector<? super Pair<? extends List<? extends StepEntry>, ? extends CurrentStep>>, Unit, Continuation<? super Unit>, Object> {
    public int a;
    private /* synthetic */ Object b;
    public /* synthetic */ Object c;
    public final /* synthetic */ StepBindingLogic d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public StepBindingLogic$bind$$inlined$flatMapLatest$1(Continuation continuation, StepBindingLogic stepBindingLogic) {
        super(3, continuation);
        this.d = stepBindingLogic;
    }

    @Override // kotlin.jvm.functions.Function3
    @Nullable
    public final Object invoke(@NotNull FlowCollector<? super Pair<? extends List<? extends StepEntry>, ? extends CurrentStep>> flowCollector, Unit unit, @Nullable Continuation<? super Unit> continuation) {
        StepBindingLogic$bind$$inlined$flatMapLatest$1 stepBindingLogic$bind$$inlined$flatMapLatest$1 = new StepBindingLogic$bind$$inlined$flatMapLatest$1(continuation, this.d);
        stepBindingLogic$bind$$inlined$flatMapLatest$1.b = flowCollector;
        stepBindingLogic$bind$$inlined$flatMapLatest$1.c = unit;
        return stepBindingLogic$bind$$inlined$flatMapLatest$1.invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        Flow<List<StepEntry>> flowLoadSteps;
        FlowCollector flowCollector;
        Object coroutine_suspended = a.getCOROUTINE_SUSPENDED();
        int i = this.a;
        if (i != 0) {
            if (i == 1) {
                flowLoadSteps = (Flow) this.c;
                flowCollector = (FlowCollector) this.b;
                ResultKt.throwOnFailure(obj);
            } else {
                if (i != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
            }
            return Unit.INSTANCE;
        }
        ResultKt.throwOnFailure(obj);
        FlowCollector flowCollector2 = (FlowCollector) this.b;
        Calendar calendar = Calendar.getInstance();
        Date endingTime = TimeExtKt.getEndingTime(calendar);
        calendar.add(6, -6);
        flowLoadSteps = this.d.stepService.loadSteps(TimeExtKt.getBeginningTime(calendar), endingTime);
        RealtimeStepService realtimeStepService = this.d.realtimeStepService;
        this.b = flowCollector2;
        this.c = flowLoadSteps;
        this.a = 1;
        Object realtimeStep = realtimeStepService.getRealtimeStep(this);
        if (realtimeStep == coroutine_suspended) {
            return coroutine_suspended;
        }
        flowCollector = flowCollector2;
        obj = realtimeStep;
        Flow flowFlowCombine = FlowKt.flowCombine(flowLoadSteps, (Flow) obj, new StepBindingLogic.c(null));
        this.b = null;
        this.c = null;
        this.a = 2;
        if (FlowKt.emitAll(flowCollector, flowFlowCombine, this) == coroutine_suspended) {
            return coroutine_suspended;
        }
        return Unit.INSTANCE;
    }
}
