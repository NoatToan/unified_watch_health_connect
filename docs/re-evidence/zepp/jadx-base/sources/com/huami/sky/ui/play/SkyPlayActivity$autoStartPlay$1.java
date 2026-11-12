package com.huami.sky.ui.play;

import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.a;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.DelayKt;
import kotlinx.coroutines.Dispatchers;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.FlowKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes13.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
@DebugMetadata(c = "com.huami.sky.ui.play.SkyPlayActivity$autoStartPlay$1", f = "SkyPlayActivity.kt", i = {}, l = {947}, m = "invokeSuspend", n = {}, s = {})
public final class SkyPlayActivity$autoStartPlay$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    public int a;
    public final /* synthetic */ SkyPlayActivity b;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0002\u0010\u0002\n\u0000\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\u008a@"}, d2 = {"Lkotlinx/coroutines/flow/FlowCollector;", "", "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    @DebugMetadata(c = "com.huami.sky.ui.play.SkyPlayActivity$autoStartPlay$1$1", f = "SkyPlayActivity.kt", i = {0}, l = {909, 911}, m = "invokeSuspend", n = {"$this$flow"}, s = {"L$0"})
    public static final class a extends SuspendLambda implements Function2<FlowCollector<? super Long>, Continuation<? super Unit>, Object> {
        public int a;
        public int b;
        private /* synthetic */ Object c;
        public final /* synthetic */ SkyPlayActivity d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(SkyPlayActivity skyPlayActivity, Continuation<? super a> continuation) {
            super(2, continuation);
            this.d = skyPlayActivity;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            a aVar = new a(this.d, continuation);
            aVar.c = obj;
            return aVar;
        }

        @Override // kotlin.jvm.functions.Function2
        @Nullable
        public final Object invoke(@NotNull FlowCollector<? super Long> flowCollector, @Nullable Continuation<? super Unit> continuation) {
            return ((a) create(flowCollector, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        /* JADX WARN: Code duplicated, block: B:16:0x0047  */
        /* JADX WARN: Code duplicated, block: B:18:0x0056 A[RETURN] */
        /* JADX WARN: Code duplicated, block: B:19:0x0057  */
        /* JADX WARN: Code restructure failed: missing block: B:20:0x0058, code lost:
        
            if (r1 > 5) goto L21;
         */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:12:0x003c -> B:14:0x003f). Please report as a decompilation issue!!! */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object invokeSuspend(@NotNull Object obj) {
            int i;
            FlowCollector flowCollector;
            a aVar;
            Long lBoxLong;
            Object coroutine_suspended = kotlin.coroutines.intrinsics.a.getCOROUTINE_SUSPENDED();
            int i2 = this.b;
            if (i2 == 0) {
                ResultKt.throwOnFailure(obj);
                i = 0;
                flowCollector = (FlowCollector) this.c;
                aVar = this;
                i++;
                aVar.c = flowCollector;
                aVar.a = i;
                aVar.b = 1;
                if (DelayKt.delay(200L, aVar) == coroutine_suspended) {
                    return coroutine_suspended;
                }
                if (aVar.d.playService == null) {
                    lBoxLong = Boxing.boxLong(200L);
                    aVar.c = null;
                    aVar.b = 2;
                    if (flowCollector.emit(lBoxLong, aVar) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                }
            } else if (i2 == 1) {
                i = this.a;
                flowCollector = (FlowCollector) this.c;
                ResultKt.throwOnFailure(obj);
                aVar = this;
                if (aVar.d.playService == null) {
                    lBoxLong = Boxing.boxLong(200L);
                    aVar.c = null;
                    aVar.b = 2;
                    if (flowCollector.emit(lBoxLong, aVar) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                }
            } else {
                if (i2 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
            }
            return Unit.INSTANCE;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SkyPlayActivity$autoStartPlay$1(SkyPlayActivity skyPlayActivity, Continuation<? super SkyPlayActivity$autoStartPlay$1> continuation) {
        super(2, continuation);
        this.b = skyPlayActivity;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @NotNull
    public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
        return new SkyPlayActivity$autoStartPlay$1(this.b, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    @Nullable
    public final Object invoke(@NotNull CoroutineScope coroutineScope, @Nullable Continuation<? super Unit> continuation) {
        return ((SkyPlayActivity$autoStartPlay$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        Object coroutine_suspended = kotlin.coroutines.intrinsics.a.getCOROUTINE_SUSPENDED();
        int i = this.a;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            Flow flowFlowOn = FlowKt.flowOn(FlowKt.flow(new a(this.b, null)), Dispatchers.getIO());
            final SkyPlayActivity skyPlayActivity = this.b;
            FlowCollector<Long> flowCollector = new FlowCollector<Long>() { // from class: com.huami.sky.ui.play.SkyPlayActivity$autoStartPlay$1$invokeSuspend$$inlined$collect$1
                @Override // kotlinx.coroutines.flow.FlowCollector
                @Nullable
                public Object emit(Long l, @NotNull Continuation<? super Unit> continuation) {
                    Unit unit;
                    l.longValue();
                    SkyPlayService.SkyPlayBinder skyPlayBinder = skyPlayActivity.playService;
                    if (skyPlayBinder == null) {
                        unit = null;
                    } else {
                        skyPlayBinder.startPlay();
                        unit = Unit.INSTANCE;
                    }
                    return unit == a.getCOROUTINE_SUSPENDED() ? unit : Unit.INSTANCE;
                }
            };
            this.a = 1;
            if (flowFlowOn.collect(flowCollector, this) == coroutine_suspended) {
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
