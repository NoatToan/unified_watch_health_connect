package androidx.paging;

import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.sync.Mutex;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0012\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0000\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u0002\"\u0004\b\u0001\u0010\u0003*\b\u0012\u0004\u0012\u0002H\u00030\u00042\u0006\u0010\u0005\u001a\u0002H\u0002H\u008a@¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"<anonymous>", "", "T", "R", "Lkotlinx/coroutines/flow/FlowCollector;", "it", "invoke", "(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;", "androidx/paging/FlowExtKt$simpleFlatMapLatest$1"}, k = 3, mv = {1, 4, 2})
@DebugMetadata(c = "androidx.paging.PageFetcherSnapshot$collectAsGenerationalViewportHints$$inlined$simpleFlatMapLatest$1", f = "PageFetcherSnapshot.kt", i = {0, 0}, l = {109, 130}, m = "invokeSuspend", n = {"this_$iv", "generationId"}, s = {"L$1", "I$0"})
public final class PageFetcherSnapshot$collectAsGenerationalViewportHints$$inlined$simpleFlatMapLatest$1 extends SuspendLambda implements Function3<FlowCollector<? super GenerationalViewportHint>, Integer, Continuation<? super Unit>, Object> {
    final /* synthetic */ LoadType $loadType$inlined;
    int I$0;
    private /* synthetic */ Object L$0;
    private /* synthetic */ Object L$1;
    Object L$2;
    int label;
    final /* synthetic */ PageFetcherSnapshot this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PageFetcherSnapshot$collectAsGenerationalViewportHints$$inlined$simpleFlatMapLatest$1(Continuation continuation, PageFetcherSnapshot pageFetcherSnapshot, LoadType loadType) {
        super(3, continuation);
        this.this$0 = pageFetcherSnapshot;
        this.$loadType$inlined = loadType;
    }

    @NotNull
    public final Continuation<Unit> create(@NotNull FlowCollector<? super GenerationalViewportHint> create, Integer num, @NotNull Continuation<? super Unit> continuation) {
        Intrinsics.checkNotNullParameter(create, "$this$create");
        Intrinsics.checkNotNullParameter(continuation, "continuation");
        PageFetcherSnapshot$collectAsGenerationalViewportHints$$inlined$simpleFlatMapLatest$1 pageFetcherSnapshot$collectAsGenerationalViewportHints$$inlined$simpleFlatMapLatest$1 = new PageFetcherSnapshot$collectAsGenerationalViewportHints$$inlined$simpleFlatMapLatest$1(continuation, this.this$0, this.$loadType$inlined);
        pageFetcherSnapshot$collectAsGenerationalViewportHints$$inlined$simpleFlatMapLatest$1.L$0 = create;
        pageFetcherSnapshot$collectAsGenerationalViewportHints$$inlined$simpleFlatMapLatest$1.L$1 = num;
        return pageFetcherSnapshot$collectAsGenerationalViewportHints$$inlined$simpleFlatMapLatest$1;
    }

    @Override // kotlin.jvm.functions.Function3
    public final Object invoke(FlowCollector<? super GenerationalViewportHint> flowCollector, Integer num, Continuation<? super Unit> continuation) {
        return ((PageFetcherSnapshot$collectAsGenerationalViewportHints$$inlined$simpleFlatMapLatest$1) create(flowCollector, num, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        FlowCollector<? super GenerationalViewportHint> flowCollector;
        final int iIntValue;
        PageFetcherSnapshotState.Holder holder;
        Mutex mutex;
        Flow<GenerationalViewportHint> flowFlowOf;
        Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.label;
        try {
            if (i != 0) {
                if (i == 1) {
                    iIntValue = this.I$0;
                    mutex = (Mutex) this.L$2;
                    holder = (PageFetcherSnapshotState.Holder) this.L$1;
                    flowCollector = (FlowCollector) this.L$0;
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
            flowCollector = (FlowCollector) this.L$0;
            iIntValue = ((Number) this.L$1).intValue();
            holder = this.this$0.stateHolder;
            mutex = holder.lock;
            this.L$0 = flowCollector;
            this.L$1 = holder;
            this.L$2 = mutex;
            this.I$0 = iIntValue;
            this.label = 1;
            if (mutex.lock(null, this) == coroutine_suspended) {
                return coroutine_suspended;
            }
            PageFetcherSnapshotState pageFetcherSnapshotState = holder.state;
            LoadState loadState = pageFetcherSnapshotState.getSourceLoadStates().get$paging_common(this.$loadType$inlined);
            LoadState.NotLoading.Companion companion = LoadState.NotLoading.INSTANCE;
            if (Intrinsics.areEqual(loadState, companion.getComplete$paging_common())) {
                flowFlowOf = FlowKt.flowOf((Object[]) new GenerationalViewportHint[0]);
                mutex.unlock(null);
            } else {
                if (!(pageFetcherSnapshotState.getSourceLoadStates().get$paging_common(this.$loadType$inlined) instanceof LoadState.Error)) {
                    pageFetcherSnapshotState.setSourceLoadState(this.$loadType$inlined, companion.getIncomplete$paging_common());
                }
                Unit unit = Unit.INSTANCE;
                mutex.unlock(null);
                final Flow flowDrop = FlowKt.drop(this.this$0.hintSharedFlow, iIntValue == 0 ? 0 : 1);
                flowFlowOf = new Flow<GenerationalViewportHint>() { // from class: androidx.paging.PageFetcherSnapshot$collectAsGenerationalViewportHints$$inlined$simpleFlatMapLatest$1$lambda$1

                    /* JADX INFO: renamed from: androidx.paging.PageFetcherSnapshot$collectAsGenerationalViewportHints$$inlined$simpleFlatMapLatest$1$lambda$1$1, reason: invalid class name */
                    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0013\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0007*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J\u0019\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00028\u0000H\u0096@ø\u0001\u0000¢\u0006\u0002\u0010\u0005\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u0006¸\u0006\n"}, d2 = {"kotlinx/coroutines/flow/FlowKt__CollectKt$collect$3", "Lkotlinx/coroutines/flow/FlowCollector;", "emit", "", "value", "(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "kotlinx-coroutines-core", "kotlinx/coroutines/flow/FlowKt__TransformKt$$special$$inlined$collect$5", "kotlinx/coroutines/flow/FlowKt__TransformKt$unsafeTransform$$inlined$unsafeFlow$5$lambda$1", "kotlinx/coroutines/flow/FlowKt__TransformKt$map$$inlined$unsafeTransform$1$2", "androidx/paging/PageFetcherSnapshot$$special$$inlined$map$1$2"}, k = 1, mv = {1, 4, 2})
                    public static final class AnonymousClass1 implements FlowCollector<ViewportHint> {
                        final /* synthetic */ FlowCollector $this_unsafeFlow$inlined;
                        final /* synthetic */ PageFetcherSnapshot$collectAsGenerationalViewportHints$$inlined$simpleFlatMapLatest$1$lambda$1 this$0;

                        /* JADX INFO: renamed from: androidx.paging.PageFetcherSnapshot$collectAsGenerationalViewportHints$$inlined$simpleFlatMapLatest$1$lambda$1$1$1, reason: invalid class name and collision with other inner class name */
                        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0016\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0005\u0010\u0000\u001a\u0004\u0018\u00010\u0001\"\u0004\b\u0000\u0010\u00022\u0006\u0010\u0003\u001a\u0002H\u00022\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005H\u0096@¨\u0006\u000b"}, d2 = {"emit", "", "T", "value", "continuation", "Lkotlin/coroutines/Continuation;", "", "kotlinx/coroutines/flow/FlowKt__CollectKt$collect$3$emit$1", "kotlinx/coroutines/flow/FlowKt__TransformKt$$special$$inlined$collect$5$1", "kotlinx/coroutines/flow/FlowKt__TransformKt$unsafeTransform$$inlined$unsafeFlow$5$lambda$1$1", "kotlinx/coroutines/flow/FlowKt__TransformKt$map$$inlined$unsafeTransform$1$2$1", "androidx/paging/PageFetcherSnapshot$$special$$inlined$map$1$2$1"}, k = 3, mv = {1, 4, 2})
                        public static final class C00551 extends ContinuationImpl {
                            Object L$0;
                            int label;
                            /* synthetic */ Object result;

                            public C00551(Continuation continuation) {
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

                        public AnonymousClass1(FlowCollector flowCollector, PageFetcherSnapshot$collectAsGenerationalViewportHints$$inlined$simpleFlatMapLatest$1$lambda$1 pageFetcherSnapshot$collectAsGenerationalViewportHints$$inlined$simpleFlatMapLatest$1$lambda$1) {
                            this.$this_unsafeFlow$inlined = flowCollector;
                            this.this$0 = pageFetcherSnapshot$collectAsGenerationalViewportHints$$inlined$simpleFlatMapLatest$1$lambda$1;
                        }

                        /* JADX WARN: Code duplicated, block: B:7:0x0013  */
                        @Override // kotlinx.coroutines.flow.FlowCollector
                        @Nullable
                        public Object emit(ViewportHint viewportHint, @NotNull Continuation continuation) {
                            C00551 c00551;
                            if (continuation instanceof C00551) {
                                c00551 = (C00551) continuation;
                                int i = c00551.label;
                                if ((i & Integer.MIN_VALUE) != 0) {
                                    c00551.label = i - Integer.MIN_VALUE;
                                } else {
                                    c00551 = new C00551(continuation);
                                }
                            } else {
                                c00551 = new C00551(continuation);
                            }
                            Object obj = c00551.result;
                            Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
                            int i2 = c00551.label;
                            if (i2 == 0) {
                                ResultKt.throwOnFailure(obj);
                                FlowCollector flowCollector = this.$this_unsafeFlow$inlined;
                                GenerationalViewportHint generationalViewportHint = new GenerationalViewportHint(iIntValue, viewportHint);
                                c00551.label = 1;
                                if (flowCollector.emit(generationalViewportHint, c00551) == coroutine_suspended) {
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

                    @Override // kotlinx.coroutines.flow.Flow
                    @Nullable
                    public Object collect(@NotNull FlowCollector<? super GenerationalViewportHint> flowCollector2, @NotNull Continuation continuation) {
                        Object objCollect = flowDrop.collect(new AnonymousClass1(flowCollector2, this), continuation);
                        return objCollect == IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objCollect : Unit.INSTANCE;
                    }
                };
            }
            this.L$0 = null;
            this.L$1 = null;
            this.L$2 = null;
            this.label = 2;
            if (flowFlowOf.collect(flowCollector, this) == coroutine_suspended) {
                return coroutine_suspended;
            }
            return Unit.INSTANCE;
        } catch (Throwable th) {
            mutex.unlock(null);
            throw th;
        }
    }
}
