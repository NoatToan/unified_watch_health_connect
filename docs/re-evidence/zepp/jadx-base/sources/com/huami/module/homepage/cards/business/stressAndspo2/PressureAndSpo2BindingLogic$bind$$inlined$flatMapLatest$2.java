package com.huami.module.homepage.cards.business.stressAndspo2;

import androidx.exifinterface.media.ExifInterface;
import com.huami.bloodoxygen.service.other.Spo2;
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
@DebugMetadata(c = "com.huami.module.homepage.cards.business.stressAndspo2.PressureAndSpo2BindingLogic$bind$$inlined$flatMapLatest$2", f = "PressureAndSpo2BindingLogic.kt", i = {}, l = {219}, m = "invokeSuspend", n = {}, s = {})
public final class PressureAndSpo2BindingLogic$bind$$inlined$flatMapLatest$2 extends SuspendLambda implements Function3<FlowCollector<? super Spo2>, Unit, Continuation<? super Unit>, Object> {
    public int a;
    private /* synthetic */ Object b;
    public /* synthetic */ Object c;
    public final /* synthetic */ PressureAndSpo2BindingLogic d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PressureAndSpo2BindingLogic$bind$$inlined$flatMapLatest$2(Continuation continuation, PressureAndSpo2BindingLogic pressureAndSpo2BindingLogic) {
        super(3, continuation);
        this.d = pressureAndSpo2BindingLogic;
    }

    @Override // kotlin.jvm.functions.Function3
    @Nullable
    public final Object invoke(@NotNull FlowCollector<? super Spo2> flowCollector, Unit unit, @Nullable Continuation<? super Unit> continuation) {
        PressureAndSpo2BindingLogic$bind$$inlined$flatMapLatest$2 pressureAndSpo2BindingLogic$bind$$inlined$flatMapLatest$2 = new PressureAndSpo2BindingLogic$bind$$inlined$flatMapLatest$2(continuation, this.d);
        pressureAndSpo2BindingLogic$bind$$inlined$flatMapLatest$2.b = flowCollector;
        pressureAndSpo2BindingLogic$bind$$inlined$flatMapLatest$2.c = unit;
        return pressureAndSpo2BindingLogic$bind$$inlined$flatMapLatest$2.invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        Object coroutine_suspended = a.getCOROUTINE_SUSPENDED();
        int i = this.a;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            FlowCollector flowCollector = (FlowCollector) this.b;
            Flow<Spo2> latestClickSpo2Flow = this.d.spo2Service.getLatestClickSpo2Flow();
            this.a = 1;
            if (FlowKt.emitAll(flowCollector, latestClickSpo2Flow, this) == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
        }
        return Unit.INSTANCE;
    }
}
