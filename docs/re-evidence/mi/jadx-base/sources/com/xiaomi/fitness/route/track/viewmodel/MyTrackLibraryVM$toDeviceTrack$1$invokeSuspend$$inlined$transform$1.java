package com.xiaomi.fitness.route.track.viewmodel;

import com.xiaomi.fit.fitness.parser.sport.base.SportReportBaseParser;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u0002\"\u0004\b\u0001\u0010\u0003*\b\u0012\u0004\u0012\u0002H\u00030\u0004H\u008a@¨\u0006\u0005"}, d2 = {"<anonymous>", "", "T", "R", "Lkotlinx/coroutines/flow/FlowCollector;", "kotlinx/coroutines/flow/FlowKt__EmittersKt$transform$1"}, k = 3, mv = {2, 0, 0}, xi = 48)
@DebugMetadata(c = "com.xiaomi.fitness.route.track.viewmodel.MyTrackLibraryVM$toDeviceTrack$1$invokeSuspend$$inlined$transform$1", f = "MyTrackLibraryVM.kt", i = {}, l = {40}, m = "invokeSuspend", n = {}, s = {})
public final class MyTrackLibraryVM$toDeviceTrack$1$invokeSuspend$$inlined$transform$1 extends SuspendLambda implements Function2<FlowCollector<? super MyTrackLibraryVM.OriginalRoute>, Continuation<? super Unit>, Object> {
    final /* synthetic */ Flow $this_transform;
    private /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ MyTrackLibraryVM this$0;

    /* JADX INFO: renamed from: com.xiaomi.fitness.route.track.viewmodel.MyTrackLibraryVM$toDeviceTrack$1$invokeSuspend$$inlined$transform$1$1, reason: invalid class name */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0006\u0010\u0000\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u0002\"\u0004\b\u0001\u0010\u00032\u0006\u0010\u0004\u001a\u0002H\u0002H\u008a@¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"<anonymous>", "", "T", "R", "value", "emit", "(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "kotlinx/coroutines/flow/FlowKt__EmittersKt$transform$1$1"}, k = 3, mv = {2, 0, 0}, xi = 48)
    @SourceDebugExtension({"SMAP\nEmitters.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Emitters.kt\nkotlinx/coroutines/flow/FlowKt__EmittersKt$transform$1$1\n+ 2 MyTrackLibraryVM.kt\ncom/xiaomi/fitness/route/track/viewmodel/MyTrackLibraryVM$toDeviceTrack$1\n*L\n1#1,222:1\n174#2,2:223\n*E\n"})
    public static final class AnonymousClass1<T> implements FlowCollector {
        final /* synthetic */ FlowCollector<MyTrackLibraryVM.OriginalRoute> $$this$flow;
        final /* synthetic */ MyTrackLibraryVM this$0;

        /* JADX INFO: renamed from: com.xiaomi.fitness.route.track.viewmodel.MyTrackLibraryVM$toDeviceTrack$1$invokeSuspend$$inlined$transform$1$1$1, reason: invalid class name and collision with other inner class name */
        @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
        @DebugMetadata(c = "com.xiaomi.fitness.route.track.viewmodel.MyTrackLibraryVM$toDeviceTrack$1$invokeSuspend$$inlined$transform$1$1", f = "MyTrackLibraryVM.kt", i = {}, l = {SportReportBaseParser.ReportType.targetValueNumber}, m = "emit", n = {}, s = {})
        public static final class C07271 extends ContinuationImpl {
            int label;
            /* synthetic */ Object result;

            public C07271(Continuation continuation) {
                super(continuation);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            @Nullable
            public final Object invokeSuspend(@NotNull Object obj) {
                this.result = obj;
                this.label |= Integer.MIN_VALUE;
                return AnonymousClass1.this.emit(null, this);
            }
        }

        public AnonymousClass1(FlowCollector flowCollector, MyTrackLibraryVM myTrackLibraryVM) {
            this.this$0 = myTrackLibraryVM;
            this.$$this$flow = flowCollector;
        }

        /* JADX WARN: Code duplicated, block: B:7:0x0013  */
        /* JADX WARN: Multi-variable type inference failed */
        @Override // kotlinx.coroutines.flow.FlowCollector
        @Nullable
        public final Object emit(T t, @NotNull Continuation<? super Unit> continuation) {
            C07271 c07271;
            if (continuation instanceof C07271) {
                c07271 = (C07271) continuation;
                int i = c07271.label;
                if ((i & Integer.MIN_VALUE) != 0) {
                    c07271.label = i - Integer.MIN_VALUE;
                } else {
                    c07271 = new C07271(continuation);
                }
            } else {
                c07271 = new C07271(continuation);
            }
            Object obj = c07271.result;
            Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i2 = c07271.label;
            if (i2 == 0) {
                ResultKt.throwOnFailure(obj);
                MyTrackLibraryVM myTrackLibraryVM = this.this$0;
                c07271.label = 1;
                if (myTrackLibraryVM.parserFile(this.$$this$flow, (MyTrackLibraryVM.OriginalRoute) t, c07271) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i2 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
            }
            return Unit.INSTANCE;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MyTrackLibraryVM$toDeviceTrack$1$invokeSuspend$$inlined$transform$1(Flow flow, Continuation continuation, MyTrackLibraryVM myTrackLibraryVM) {
        super(2, continuation);
        this.$this_transform = flow;
        this.this$0 = myTrackLibraryVM;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @NotNull
    public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
        MyTrackLibraryVM$toDeviceTrack$1$invokeSuspend$$inlined$transform$1 myTrackLibraryVM$toDeviceTrack$1$invokeSuspend$$inlined$transform$1 = new MyTrackLibraryVM$toDeviceTrack$1$invokeSuspend$$inlined$transform$1(this.$this_transform, continuation, this.this$0);
        myTrackLibraryVM$toDeviceTrack$1$invokeSuspend$$inlined$transform$1.L$0 = obj;
        return myTrackLibraryVM$toDeviceTrack$1$invokeSuspend$$inlined$transform$1;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.label;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            FlowCollector flowCollector = (FlowCollector) this.L$0;
            Flow flow = this.$this_transform;
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(flowCollector, this.this$0);
            this.label = 1;
            if (flow.collect(anonymousClass1, this) == coroutine_suspended) {
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

    @Override // kotlin.jvm.functions.Function2
    @Nullable
    public final Object invoke(@NotNull FlowCollector<? super MyTrackLibraryVM.OriginalRoute> flowCollector, @Nullable Continuation<? super Unit> continuation) {
        return ((MyTrackLibraryVM$toDeviceTrack$1$invokeSuspend$$inlined$transform$1) create(flowCollector, continuation)).invokeSuspend(Unit.INSTANCE);
    }
}
