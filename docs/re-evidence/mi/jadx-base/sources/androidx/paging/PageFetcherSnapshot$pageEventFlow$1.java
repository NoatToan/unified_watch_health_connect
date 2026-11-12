package androidx.paging;

import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.channels.Channel;
import kotlinx.coroutines.channels.ChannelKt;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.sync.Mutex;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: Add missing generic type declarations: [Value] */
/* JADX INFO: loaded from: classes.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001a\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u0001\"\b\b\u0000\u0010\u0002*\u00020\u0003\"\b\b\u0001\u0010\u0004*\u00020\u0003*\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u0002H\u00040\u00060\u0005H\u008a@¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"<anonymous>", "", "Key", "", "Value", "Landroidx/paging/SimpleProducerScope;", "Landroidx/paging/PageEvent;", "invoke", "(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;"}, k = 3, mv = {1, 4, 2})
@DebugMetadata(c = "androidx.paging.PageFetcherSnapshot$pageEventFlow$1", f = "PageFetcherSnapshot.kt", i = {0, 0, 0, 0, 1, 2, 2, 2}, l = {595, 160, 607}, m = "invokeSuspend", n = {"$this$cancelableChannelFlow", "it", "this_$iv", "$this$withLock$iv$iv", "$this$cancelableChannelFlow", "$this$cancelableChannelFlow", "this_$iv", "$this$withLock$iv$iv"}, s = {"L$0", "L$1", "L$2", "L$3", "L$0", "L$0", "L$1", "L$2"})
public final class PageFetcherSnapshot$pageEventFlow$1<Value> extends SuspendLambda implements Function2<SimpleProducerScope<PageEvent<Value>>, Continuation<? super Unit>, Object> {
    private /* synthetic */ Object L$0;
    Object L$1;
    Object L$2;
    Object L$3;
    int label;
    final /* synthetic */ PageFetcherSnapshot this$0;

    /* JADX INFO: renamed from: androidx.paging.PageFetcherSnapshot$pageEventFlow$1$2, reason: invalid class name */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0016\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u0001\"\b\b\u0000\u0010\u0002*\u00020\u0003\"\b\b\u0001\u0010\u0004*\u00020\u0003*\u00020\u0005H\u008a@¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"<anonymous>", "", "Key", "", "Value", "Lkotlinx/coroutines/CoroutineScope;", "invoke", "(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;"}, k = 3, mv = {1, 4, 2})
    @DebugMetadata(c = "androidx.paging.PageFetcherSnapshot$pageEventFlow$1$2", f = "PageFetcherSnapshot.kt", i = {}, l = {589}, m = "invokeSuspend", n = {}, s = {})
    public static final class AnonymousClass2 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final /* synthetic */ SimpleProducerScope $this_cancelableChannelFlow;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass2(SimpleProducerScope simpleProducerScope, Continuation continuation) {
            super(2, continuation);
            this.$this_cancelableChannelFlow = simpleProducerScope;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> completion) {
            Intrinsics.checkNotNullParameter(completion, "completion");
            return new AnonymousClass2(this.$this_cancelableChannelFlow, completion);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((AnonymousClass2) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                Flow flowConsumeAsFlow = FlowKt.consumeAsFlow(PageFetcherSnapshot$pageEventFlow$1.this.this$0.pageEventCh);
                PageFetcherSnapshot$pageEventFlow$1$2$invokeSuspend$$inlined$collect$1 pageFetcherSnapshot$pageEventFlow$1$2$invokeSuspend$$inlined$collect$1 = new PageFetcherSnapshot$pageEventFlow$1$2$invokeSuspend$$inlined$collect$1(this);
                this.label = 1;
                if (flowConsumeAsFlow.collect(pageFetcherSnapshot$pageEventFlow$1$2$invokeSuspend$$inlined$collect$1, this) == coroutine_suspended) {
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

    /* JADX INFO: renamed from: androidx.paging.PageFetcherSnapshot$pageEventFlow$1$3, reason: invalid class name */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0016\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u0001\"\b\b\u0000\u0010\u0002*\u00020\u0003\"\b\b\u0001\u0010\u0004*\u00020\u0003*\u00020\u0005H\u008a@¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"<anonymous>", "", "Key", "", "Value", "Lkotlinx/coroutines/CoroutineScope;", "invoke", "(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;"}, k = 3, mv = {1, 4, 2})
    @DebugMetadata(c = "androidx.paging.PageFetcherSnapshot$pageEventFlow$1$3", f = "PageFetcherSnapshot.kt", i = {}, l = {589}, m = "invokeSuspend", n = {}, s = {})
    public static final class AnonymousClass3 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final /* synthetic */ Channel $retryChannel;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass3(Channel channel, Continuation continuation) {
            super(2, continuation);
            this.$retryChannel = channel;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> completion) {
            Intrinsics.checkNotNullParameter(completion, "completion");
            return new AnonymousClass3(this.$retryChannel, completion);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((AnonymousClass3) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                Flow flow = PageFetcherSnapshot$pageEventFlow$1.this.this$0.retryFlow;
                FlowCollector<Unit> flowCollector = new FlowCollector<Unit>() { // from class: androidx.paging.PageFetcherSnapshot$pageEventFlow$1$3$invokeSuspend$$inlined$collect$1
                    @Override // kotlinx.coroutines.flow.FlowCollector
                    @Nullable
                    public Object emit(Unit unit, @NotNull Continuation continuation) {
                        this.this$0.$retryChannel.offer(unit);
                        return Unit.INSTANCE;
                    }
                };
                this.label = 1;
                if (flow.collect(flowCollector, this) == coroutine_suspended) {
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

    /* JADX INFO: renamed from: androidx.paging.PageFetcherSnapshot$pageEventFlow$1$4, reason: invalid class name */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0016\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u0001\"\b\b\u0000\u0010\u0002*\u00020\u0003\"\b\b\u0001\u0010\u0004*\u00020\u0003*\u00020\u0005H\u008a@¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"<anonymous>", "", "Key", "", "Value", "Lkotlinx/coroutines/CoroutineScope;", "invoke", "(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;"}, k = 3, mv = {1, 4, 2})
    @DebugMetadata(c = "androidx.paging.PageFetcherSnapshot$pageEventFlow$1$4", f = "PageFetcherSnapshot.kt", i = {}, l = {589}, m = "invokeSuspend", n = {}, s = {})
    public static final class AnonymousClass4 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final /* synthetic */ Channel $retryChannel;
        private /* synthetic */ Object L$0;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass4(Channel channel, Continuation continuation) {
            super(2, continuation);
            this.$retryChannel = channel;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> completion) {
            Intrinsics.checkNotNullParameter(completion, "completion");
            AnonymousClass4 anonymousClass4 = new AnonymousClass4(this.$retryChannel, completion);
            anonymousClass4.L$0 = obj;
            return anonymousClass4;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((AnonymousClass4) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                CoroutineScope coroutineScope = (CoroutineScope) this.L$0;
                Flow flowConsumeAsFlow = FlowKt.consumeAsFlow(this.$retryChannel);
                PageFetcherSnapshot$pageEventFlow$1$4$invokeSuspend$$inlined$collect$1 pageFetcherSnapshot$pageEventFlow$1$4$invokeSuspend$$inlined$collect$1 = new PageFetcherSnapshot$pageEventFlow$1$4$invokeSuspend$$inlined$collect$1(this, coroutineScope);
                this.label = 1;
                if (flowConsumeAsFlow.collect(pageFetcherSnapshot$pageEventFlow$1$4$invokeSuspend$$inlined$collect$1, this) == coroutine_suspended) {
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

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PageFetcherSnapshot$pageEventFlow$1(PageFetcherSnapshot pageFetcherSnapshot, Continuation continuation) {
        super(2, continuation);
        this.this$0 = pageFetcherSnapshot;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @NotNull
    public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> completion) {
        Intrinsics.checkNotNullParameter(completion, "completion");
        PageFetcherSnapshot$pageEventFlow$1 pageFetcherSnapshot$pageEventFlow$1 = new PageFetcherSnapshot$pageEventFlow$1(this.this$0, completion);
        pageFetcherSnapshot$pageEventFlow$1.L$0 = obj;
        return pageFetcherSnapshot$pageEventFlow$1;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Continuation<? super Unit> continuation) {
        return ((PageFetcherSnapshot$pageEventFlow$1) create(obj, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Code duplicated, block: B:33:0x00e0 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:36:0x00f9 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:37:0x00fa  */
    /* JADX WARN: Code duplicated, block: B:41:0x0111  */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        SimpleProducerScope simpleProducerScope;
        RemoteMediatorConnection remoteMediatorConnection;
        PagingState pagingState;
        PageFetcherSnapshotState.Holder holder;
        Mutex mutex;
        SimpleProducerScope simpleProducerScope2;
        PageFetcherSnapshot pageFetcherSnapshot;
        PageFetcherSnapshotState.Holder holder2;
        Mutex mutex2;
        SimpleProducerScope simpleProducerScope3;
        Mutex mutex3;
        LoadState loadState;
        Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.label;
        try {
            if (i != 0) {
                if (i == 1) {
                    mutex = (Mutex) this.L$3;
                    holder = (PageFetcherSnapshotState.Holder) this.L$2;
                    remoteMediatorConnection = (RemoteMediatorConnection) this.L$1;
                    simpleProducerScope2 = (SimpleProducerScope) this.L$0;
                    ResultKt.throwOnFailure(obj);
                } else if (i == 2) {
                    SimpleProducerScope simpleProducerScope4 = (SimpleProducerScope) this.L$0;
                    ResultKt.throwOnFailure(obj);
                    simpleProducerScope = simpleProducerScope4;
                    holder2 = this.this$0.stateHolder;
                    mutex2 = holder2.lock;
                    this.L$0 = simpleProducerScope;
                    this.L$1 = holder2;
                    this.L$2 = mutex2;
                    this.label = 3;
                    if (mutex2.lock(null, this) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                    simpleProducerScope3 = simpleProducerScope;
                    mutex3 = mutex2;
                } else {
                    if (i != 3) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    mutex3 = (Mutex) this.L$2;
                    holder2 = (PageFetcherSnapshotState.Holder) this.L$1;
                    simpleProducerScope3 = (SimpleProducerScope) this.L$0;
                    ResultKt.throwOnFailure(obj);
                }
                try {
                    loadState = holder2.state.getSourceLoadStates().get$paging_common(LoadType.REFRESH);
                    mutex3.unlock(null);
                    if (!(loadState instanceof LoadState.Error)) {
                        this.this$0.startConsumingHints(simpleProducerScope3);
                    }
                    return Unit.INSTANCE;
                } catch (Throwable th) {
                    mutex3.unlock(null);
                    throw th;
                }
            }
            ResultKt.throwOnFailure(obj);
            simpleProducerScope = (SimpleProducerScope) this.L$0;
            if (!this.this$0.pageEventChCollected.compareAndSet(false, true)) {
                throw new IllegalStateException("Attempt to collect twice from pageEventFlow, which is an illegal operation. Did you forget to call Flow<PagingData<*>>.cachedIn(coroutineScope)?".toString());
            }
            BuildersKt__Builders_commonKt.launch$default(simpleProducerScope, null, null, new AnonymousClass2(simpleProducerScope, null), 3, null);
            Channel channelChannel$default = ChannelKt.Channel$default(0, null, null, 6, null);
            BuildersKt__Builders_commonKt.launch$default(simpleProducerScope, null, null, new AnonymousClass3(channelChannel$default, null), 3, null);
            BuildersKt__Builders_commonKt.launch$default(simpleProducerScope, null, null, new AnonymousClass4(channelChannel$default, null), 3, null);
            if (this.this$0.triggerRemoteRefresh && (remoteMediatorConnection = this.this$0.getRemoteMediatorConnection()) != null) {
                pagingState = this.this$0.previousPagingState;
                if (pagingState == null) {
                    PageFetcherSnapshotState.Holder holder3 = this.this$0.stateHolder;
                    Mutex mutex4 = holder3.lock;
                    this.L$0 = simpleProducerScope;
                    this.L$1 = remoteMediatorConnection;
                    this.L$2 = holder3;
                    this.L$3 = mutex4;
                    this.label = 1;
                    if (mutex4.lock(null, this) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                    holder = holder3;
                    mutex = mutex4;
                    simpleProducerScope2 = simpleProducerScope;
                }
                remoteMediatorConnection.requestLoad(LoadType.REFRESH, pagingState);
            }
            pageFetcherSnapshot = this.this$0;
            this.L$0 = simpleProducerScope;
            this.L$1 = null;
            this.L$2 = null;
            this.L$3 = null;
            this.label = 2;
            if (pageFetcherSnapshot.doInitialLoad(this) == coroutine_suspended) {
                return coroutine_suspended;
            }
            holder2 = this.this$0.stateHolder;
            mutex2 = holder2.lock;
            this.L$0 = simpleProducerScope;
            this.L$1 = holder2;
            this.L$2 = mutex2;
            this.label = 3;
            if (mutex2.lock(null, this) == coroutine_suspended) {
                return coroutine_suspended;
            }
            simpleProducerScope3 = simpleProducerScope;
            mutex3 = mutex2;
            loadState = holder2.state.getSourceLoadStates().get$paging_common(LoadType.REFRESH);
            mutex3.unlock(null);
            if (!(loadState instanceof LoadState.Error)) {
                this.this$0.startConsumingHints(simpleProducerScope3);
            }
            return Unit.INSTANCE;
            PagingState pagingStateCurrentPagingState$paging_common = holder.state.currentPagingState$paging_common(null);
            mutex.unlock(null);
            pagingState = pagingStateCurrentPagingState$paging_common;
            simpleProducerScope = simpleProducerScope2;
            remoteMediatorConnection.requestLoad(LoadType.REFRESH, pagingState);
            pageFetcherSnapshot = this.this$0;
            this.L$0 = simpleProducerScope;
            this.L$1 = null;
            this.L$2 = null;
            this.L$3 = null;
            this.label = 2;
            if (pageFetcherSnapshot.doInitialLoad(this) == coroutine_suspended) {
                return coroutine_suspended;
            }
            holder2 = this.this$0.stateHolder;
            mutex2 = holder2.lock;
            this.L$0 = simpleProducerScope;
            this.L$1 = holder2;
            this.L$2 = mutex2;
            this.label = 3;
            if (mutex2.lock(null, this) == coroutine_suspended) {
                return coroutine_suspended;
            }
            simpleProducerScope3 = simpleProducerScope;
            mutex3 = mutex2;
            loadState = holder2.state.getSourceLoadStates().get$paging_common(LoadType.REFRESH);
            mutex3.unlock(null);
            if (!(loadState instanceof LoadState.Error)) {
                this.this$0.startConsumingHints(simpleProducerScope3);
            }
            return Unit.INSTANCE;
        } catch (Throwable th2) {
            mutex.unlock(null);
            throw th2;
        }
    }
}
