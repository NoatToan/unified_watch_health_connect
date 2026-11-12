package com.huami.sky.ui.realtime;

import com.huami.sky.ui.play.control.PlaybackManager;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.a;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.SharedFlow;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes13.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
@DebugMetadata(c = "com.huami.sky.ui.realtime.SkyRealTimeDataActivity$initObserve$2", f = "SkyRealTimeDataActivity.kt", i = {}, l = {429}, m = "invokeSuspend", n = {}, s = {})
public final class SkyRealTimeDataActivity$initObserve$2 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    public int a;
    public final /* synthetic */ SkyRealTimeDataActivity b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SkyRealTimeDataActivity$initObserve$2(SkyRealTimeDataActivity skyRealTimeDataActivity, Continuation<? super SkyRealTimeDataActivity$initObserve$2> continuation) {
        super(2, continuation);
        this.b = skyRealTimeDataActivity;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @NotNull
    public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
        return new SkyRealTimeDataActivity$initObserve$2(this.b, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    @Nullable
    public final Object invoke(@NotNull CoroutineScope coroutineScope, @Nullable Continuation<? super Unit> continuation) {
        return ((SkyRealTimeDataActivity$initObserve$2) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        Object coroutine_suspended = a.getCOROUTINE_SUSPENDED();
        int i = this.a;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            SharedFlow<Integer> playActionCallbackFlow = PlaybackManager.INSTANCE.getInstance().getPlayActionCallbackFlow();
            final SkyRealTimeDataActivity skyRealTimeDataActivity = this.b;
            FlowCollector<Integer> flowCollector = new FlowCollector<Integer>() { // from class: com.huami.sky.ui.realtime.SkyRealTimeDataActivity$initObserve$2$invokeSuspend$$inlined$collect$1
                @Override // kotlinx.coroutines.flow.FlowCollector
                @Nullable
                public Object emit(Integer num, @NotNull Continuation<? super Unit> continuation) {
                    if (num.intValue() == 8) {
                        skyRealTimeDataActivity.x();
                    }
                    return Unit.INSTANCE;
                }
            };
            this.a = 1;
            if (playActionCallbackFlow.collect(flowCollector, this) == coroutine_suspended) {
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
