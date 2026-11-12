package com.huami.module.homepage.cards.business.femalehealth;

import androidx.exifinterface.media.ExifInterface;
import com.huami.account.ui.areas.SelectAreaActivity;
import com.huami.fhservice.FemaleHealthService;
import kotlin.Metadata;
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
@DebugMetadata(c = "com.huami.module.homepage.cards.business.femalehealth.FemaleHealthBindingLogic$bind$$inlined$flatMapLatest$1", f = "FemaleHealthBindingLogic.kt", i = {0, 1, 2}, l = {221, 222, SelectAreaActivity.REQUEST_SELECT_AREA_ONLY, 224, 219}, m = "invokeSuspend", n = {"$this$bind_u24lambda_u2d1_u24lambda_u2d0", "$this$bind_u24lambda_u2d1_u24lambda_u2d0", "$this$bind_u24lambda_u2d1_u24lambda_u2d0"}, s = {"L$1", "L$1", "L$1"})
public final class FemaleHealthBindingLogic$bind$$inlined$flatMapLatest$1 extends SuspendLambda implements Function3<FlowCollector<? super FemaleHealthEntry>, Unit, Continuation<? super Unit>, Object> {
    public int a;
    private /* synthetic */ Object b;
    public /* synthetic */ Object c;
    public final /* synthetic */ FemaleHealthBindingLogic d;
    public Object e;
    public Object f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FemaleHealthBindingLogic$bind$$inlined$flatMapLatest$1(Continuation continuation, FemaleHealthBindingLogic femaleHealthBindingLogic) {
        super(3, continuation);
        this.d = femaleHealthBindingLogic;
    }

    @Override // kotlin.jvm.functions.Function3
    @Nullable
    public final Object invoke(@NotNull FlowCollector<? super FemaleHealthEntry> flowCollector, Unit unit, @Nullable Continuation<? super Unit> continuation) {
        FemaleHealthBindingLogic$bind$$inlined$flatMapLatest$1 femaleHealthBindingLogic$bind$$inlined$flatMapLatest$1 = new FemaleHealthBindingLogic$bind$$inlined$flatMapLatest$1(continuation, this.d);
        femaleHealthBindingLogic$bind$$inlined$flatMapLatest$1.b = flowCollector;
        femaleHealthBindingLogic$bind$$inlined$flatMapLatest$1.c = unit;
        return femaleHealthBindingLogic$bind$$inlined$flatMapLatest$1.invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Code duplicated, block: B:26:0x00b2 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:27:0x00b3  */
    /* JADX WARN: Code duplicated, block: B:30:0x00c9 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:31:0x00ca  */
    /* JADX WARN: Code duplicated, block: B:34:0x00eb A[RETURN] */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        FemaleHealthService femaleHealthService;
        FlowCollector flowCollector;
        Flow flow;
        FemaleHealthService femaleHealthService2;
        Flow flow2;
        Object calendarStatus;
        Flow flow3;
        Flow flow4;
        Flow flow5;
        Object objHasData;
        FlowCollector flowCollector2;
        Flow flow6;
        Flow flow7;
        Flow flowCombine;
        Object coroutine_suspended = a.getCOROUTINE_SUSPENDED();
        int i = this.a;
        if (i != 0) {
            if (i == 1) {
                femaleHealthService = (FemaleHealthService) this.c;
                flowCollector = (FlowCollector) this.b;
                ResultKt.throwOnFailure(obj);
            } else if (i == 2) {
                flow = (Flow) this.e;
                femaleHealthService2 = (FemaleHealthService) this.c;
                flowCollector = (FlowCollector) this.b;
                ResultKt.throwOnFailure(obj);
                flow2 = (Flow) obj;
                this.b = flowCollector;
                this.c = femaleHealthService2;
                this.e = flow;
                this.f = flow2;
                this.a = 3;
                calendarStatus = femaleHealthService2.getCalendarStatus(this);
                if (calendarStatus == coroutine_suspended) {
                    return coroutine_suspended;
                }
                Flow flow8 = flow;
                flow3 = flow2;
                obj = calendarStatus;
                flow4 = flow8;
                flow5 = (Flow) obj;
                this.b = flowCollector;
                this.c = flow4;
                this.e = flow3;
                this.f = flow5;
                this.a = 4;
                objHasData = femaleHealthService2.hasData(this);
                if (objHasData == coroutine_suspended) {
                    return coroutine_suspended;
                }
                flowCollector2 = flowCollector;
                Flow flow9 = flow3;
                flow6 = flow5;
                obj = objHasData;
                flow7 = flow9;
                flowCombine = FlowKt.combine(flow4, flow7, flow6, (Flow) obj, new FemaleHealthBindingLogic.b(null));
                this.b = null;
                this.c = null;
                this.e = null;
                this.f = null;
                this.a = 5;
                if (FlowKt.emitAll(flowCollector2, flowCombine, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else if (i == 3) {
                flow3 = (Flow) this.f;
                flow4 = (Flow) this.e;
                femaleHealthService2 = (FemaleHealthService) this.c;
                flowCollector = (FlowCollector) this.b;
                ResultKt.throwOnFailure(obj);
                flow5 = (Flow) obj;
                this.b = flowCollector;
                this.c = flow4;
                this.e = flow3;
                this.f = flow5;
                this.a = 4;
                objHasData = femaleHealthService2.hasData(this);
                if (objHasData == coroutine_suspended) {
                    return coroutine_suspended;
                }
                flowCollector2 = flowCollector;
                Flow flow10 = flow3;
                flow6 = flow5;
                obj = objHasData;
                flow7 = flow10;
                flowCombine = FlowKt.combine(flow4, flow7, flow6, (Flow) obj, new FemaleHealthBindingLogic.b(null));
                this.b = null;
                this.c = null;
                this.e = null;
                this.f = null;
                this.a = 5;
                if (FlowKt.emitAll(flowCollector2, flowCombine, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else if (i == 4) {
                flow6 = (Flow) this.f;
                flow7 = (Flow) this.e;
                flow4 = (Flow) this.c;
                flowCollector2 = (FlowCollector) this.b;
                ResultKt.throwOnFailure(obj);
                flowCombine = FlowKt.combine(flow4, flow7, flow6, (Flow) obj, new FemaleHealthBindingLogic.b(null));
                this.b = null;
                this.c = null;
                this.e = null;
                this.f = null;
                this.a = 5;
                if (FlowKt.emitAll(flowCollector2, flowCombine, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i != 5) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
            }
            return Unit.INSTANCE;
        }
        ResultKt.throwOnFailure(obj);
        FlowCollector flowCollector3 = (FlowCollector) this.b;
        femaleHealthService = this.d.femaleHealthService;
        this.b = flowCollector3;
        this.c = femaleHealthService;
        this.a = 1;
        Object currentStatus = femaleHealthService.getCurrentStatus(this);
        if (currentStatus == coroutine_suspended) {
            return coroutine_suspended;
        }
        flowCollector = flowCollector3;
        obj = currentStatus;
        Flow flow11 = (Flow) obj;
        this.b = flowCollector;
        this.c = femaleHealthService;
        this.e = flow11;
        this.a = 2;
        Object currentStatusDetailContent = femaleHealthService.getCurrentStatusDetailContent(this);
        if (currentStatusDetailContent == coroutine_suspended) {
            return coroutine_suspended;
        }
        FemaleHealthService femaleHealthService3 = femaleHealthService;
        flow = flow11;
        obj = currentStatusDetailContent;
        femaleHealthService2 = femaleHealthService3;
        flow2 = (Flow) obj;
        this.b = flowCollector;
        this.c = femaleHealthService2;
        this.e = flow;
        this.f = flow2;
        this.a = 3;
        calendarStatus = femaleHealthService2.getCalendarStatus(this);
        if (calendarStatus == coroutine_suspended) {
            return coroutine_suspended;
        }
        Flow flow12 = flow;
        flow3 = flow2;
        obj = calendarStatus;
        flow4 = flow12;
        flow5 = (Flow) obj;
        this.b = flowCollector;
        this.c = flow4;
        this.e = flow3;
        this.f = flow5;
        this.a = 4;
        objHasData = femaleHealthService2.hasData(this);
        if (objHasData == coroutine_suspended) {
            return coroutine_suspended;
        }
        flowCollector2 = flowCollector;
        Flow flow13 = flow3;
        flow6 = flow5;
        obj = objHasData;
        flow7 = flow13;
        flowCombine = FlowKt.combine(flow4, flow7, flow6, (Flow) obj, new FemaleHealthBindingLogic.b(null));
        this.b = null;
        this.c = null;
        this.e = null;
        this.f = null;
        this.a = 5;
        if (FlowKt.emitAll(flowCollector2, flowCombine, this) == coroutine_suspended) {
            return coroutine_suspended;
        }
        return Unit.INSTANCE;
    }
}
