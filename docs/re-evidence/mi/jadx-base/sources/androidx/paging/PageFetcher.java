package androidx.paging;

import com.xiaomi.onetrack.api.b;
import com.xiaomi.onetrack.c.q;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.StateFlow;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\\\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u0000*\b\b\u0000\u0010\u0001*\u00020\u0002*\b\b\u0001\u0010\u0003*\u00020\u00022\u00020\u0002:\u0002$%B\\\u0012(\u0010\u0004\u001a$\b\u0001\u0012\u0016\u0012\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u00070\u0006\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u0005\u0012\b\u0010\b\u001a\u0004\u0018\u00018\u0000\u0012\u0006\u0010\t\u001a\u00020\n\u0012\u0016\b\u0002\u0010\u000b\u001a\u0010\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u0001\u0018\u00010\fø\u0001\u0000¢\u0006\u0002\u0010\rJ3\u0010\u001a\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u00072\u0014\u0010\u001b\u001a\u0010\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u0001\u0018\u00010\u0007H\u0082@ø\u0001\u0000¢\u0006\u0002\u0010\u001cJ\b\u0010\u001d\u001a\u00020\u0019H\u0002J\u0006\u0010\u001e\u001a\u00020\u0019J:\u0010\u001f\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00010 0\u000f*\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010!2\u0014\u0010\"\u001a\u0010\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u0001\u0018\u00010#H\u0002R\u000e\u0010\t\u001a\u00020\nX\u0082\u0004¢\u0006\u0002\n\u0000R\u001d\u0010\u000e\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00010\u00100\u000f¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u0012\u0010\b\u001a\u0004\u0018\u00018\u0000X\u0082\u0004¢\u0006\u0004\n\u0002\u0010\u0013R5\u0010\u0004\u001a$\b\u0001\u0012\u0016\u0012\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u00070\u0006\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u0005X\u0082\u0004ø\u0001\u0000¢\u0006\u0004\n\u0002\u0010\u0014R\u0014\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00170\u0016X\u0082\u0004¢\u0006\u0002\n\u0000R\u001c\u0010\u000b\u001a\u0010\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u0001\u0018\u00010\fX\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00190\u0016X\u0082\u0004¢\u0006\u0002\n\u0000\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006&"}, d2 = {"Landroidx/paging/PageFetcher;", "Key", "", "Value", "pagingSourceFactory", "Lkotlin/Function1;", "Lkotlin/coroutines/Continuation;", "Landroidx/paging/PagingSource;", "initialKey", q.f13857a, "Landroidx/paging/PagingConfig;", "remoteMediator", "Landroidx/paging/RemoteMediator;", "(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;Landroidx/paging/PagingConfig;Landroidx/paging/RemoteMediator;)V", "flow", "Lkotlinx/coroutines/flow/Flow;", "Landroidx/paging/PagingData;", "getFlow", "()Lkotlinx/coroutines/flow/Flow;", "Ljava/lang/Object;", "Lkotlin/jvm/functions/Function1;", "refreshEvents", "Landroidx/paging/ConflatedEventBus;", "", "retryEvents", "", "generateNewPagingSource", "previousPagingSource", "(Landroidx/paging/PagingSource;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "invalidate", "refresh", "injectRemoteEvents", "Landroidx/paging/PageEvent;", "Landroidx/paging/PageFetcherSnapshot;", "accessor", "Landroidx/paging/RemoteMediatorAccessor;", "GenerationInfo", "PagerUiReceiver", "paging-common"}, k = 1, mv = {1, 4, 2})
public final class PageFetcher<Key, Value> {
    private final PagingConfig config;

    @NotNull
    private final Flow<PagingData<Value>> flow;
    private final Key initialKey;
    private final Function1<Continuation<? super PagingSource<Key, Value>>, Object> pagingSourceFactory;
    private final ConflatedEventBus<Boolean> refreshEvents;
    private final RemoteMediator<Key, Value> remoteMediator;
    private final ConflatedEventBus<Unit> retryEvents;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0002\u0018\u0000*\b\b\u0002\u0010\u0001*\u00020\u0002*\b\b\u0003\u0010\u0003*\u00020\u00022\u00020\u0002B/\u0012\u0012\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00028\u0002\u0012\u0004\u0012\u00028\u00030\u0005\u0012\u0014\u0010\u0006\u001a\u0010\u0012\u0004\u0012\u00028\u0002\u0012\u0004\u0012\u00028\u0003\u0018\u00010\u0007¢\u0006\u0002\u0010\bR\u001d\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00028\u0002\u0012\u0004\u0012\u00028\u00030\u0005¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u001f\u0010\u0006\u001a\u0010\u0012\u0004\u0012\u00028\u0002\u0012\u0004\u0012\u00028\u0003\u0018\u00010\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\f¨\u0006\r"}, d2 = {"Landroidx/paging/PageFetcher$GenerationInfo;", "Key", "", "Value", "snapshot", "Landroidx/paging/PageFetcherSnapshot;", "state", "Landroidx/paging/PagingState;", "(Landroidx/paging/PageFetcherSnapshot;Landroidx/paging/PagingState;)V", "getSnapshot", "()Landroidx/paging/PageFetcherSnapshot;", "getState", "()Landroidx/paging/PagingState;", "paging-common"}, k = 1, mv = {1, 4, 2})
    public static final class GenerationInfo<Key, Value> {

        @NotNull
        private final PageFetcherSnapshot<Key, Value> snapshot;

        @Nullable
        private final PagingState<Key, Value> state;

        public GenerationInfo(@NotNull PageFetcherSnapshot<Key, Value> snapshot, @Nullable PagingState<Key, Value> pagingState) {
            Intrinsics.checkNotNullParameter(snapshot, "snapshot");
            this.snapshot = snapshot;
            this.state = pagingState;
        }

        @NotNull
        public final PageFetcherSnapshot<Key, Value> getSnapshot() {
            return this.snapshot;
        }

        @Nullable
        public final PagingState<Key, Value> getState() {
            return this.state;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0004\u0018\u0000*\b\b\u0002\u0010\u0001*\u00020\u0002*\b\b\u0003\u0010\u0003*\u00020\u00022\u00020\u0004B'\u0012\u0012\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00028\u0002\u0012\u0004\u0012\u00028\u00030\u0006\u0012\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\b¢\u0006\u0002\u0010\nJ\u0010\u0010\u000b\u001a\u00020\t2\u0006\u0010\f\u001a\u00020\rH\u0016J\b\u0010\u000e\u001a\u00020\tH\u0016J\b\u0010\u000f\u001a\u00020\tH\u0016R\u001a\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00028\u0002\u0012\u0004\u0012\u00028\u00030\u0006X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\bX\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0010"}, d2 = {"Landroidx/paging/PageFetcher$PagerUiReceiver;", "Key", "", "Value", "Landroidx/paging/UiReceiver;", "pageFetcherSnapshot", "Landroidx/paging/PageFetcherSnapshot;", "retryEventBus", "Landroidx/paging/ConflatedEventBus;", "", "(Landroidx/paging/PageFetcher;Landroidx/paging/PageFetcherSnapshot;Landroidx/paging/ConflatedEventBus;)V", "accessHint", "viewportHint", "Landroidx/paging/ViewportHint;", "refresh", b.M, "paging-common"}, k = 1, mv = {1, 4, 2})
    public final class PagerUiReceiver<Key, Value> implements UiReceiver {
        private final PageFetcherSnapshot<Key, Value> pageFetcherSnapshot;
        private final ConflatedEventBus<Unit> retryEventBus;
        final /* synthetic */ PageFetcher this$0;

        public PagerUiReceiver(@NotNull PageFetcher pageFetcher, @NotNull PageFetcherSnapshot<Key, Value> pageFetcherSnapshot, ConflatedEventBus<Unit> retryEventBus) {
            Intrinsics.checkNotNullParameter(pageFetcherSnapshot, "pageFetcherSnapshot");
            Intrinsics.checkNotNullParameter(retryEventBus, "retryEventBus");
            this.this$0 = pageFetcher;
            this.pageFetcherSnapshot = pageFetcherSnapshot;
            this.retryEventBus = retryEventBus;
        }

        @Override // androidx.paging.UiReceiver
        public void accessHint(@NotNull ViewportHint viewportHint) {
            Intrinsics.checkNotNullParameter(viewportHint, "viewportHint");
            this.pageFetcherSnapshot.accessHint(viewportHint);
        }

        @Override // androidx.paging.UiReceiver
        public void refresh() {
            this.this$0.refresh();
        }

        @Override // androidx.paging.UiReceiver
        public void retry() {
            this.retryEventBus.send(Unit.INSTANCE);
        }
    }

    /* JADX INFO: renamed from: androidx.paging.PageFetcher$generateNewPagingSource$1, reason: invalid class name */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0014\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u0004\u0018\u00010\u0001\"\b\b\u0000\u0010\u0002*\u00020\u0001\"\b\b\u0001\u0010\u0003*\u00020\u00012\u0014\u0010\u0004\u001a\u0010\u0012\u0004\u0012\u0002H\u0002\u0012\u0004\u0012\u0002H\u0003\u0018\u00010\u00052\u0018\u0010\u0006\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u0002H\u0002\u0012\u0004\u0012\u0002H\u00030\u00050\u0007H\u0082@"}, d2 = {"generateNewPagingSource", "", "Key", "Value", "previousPagingSource", "Landroidx/paging/PagingSource;", "continuation", "Lkotlin/coroutines/Continuation;"}, k = 3, mv = {1, 4, 2})
    @DebugMetadata(c = "androidx.paging.PageFetcher", f = "PageFetcher.kt", i = {0, 0}, l = {211}, m = "generateNewPagingSource", n = {"this", "previousPagingSource"}, s = {"L$0", "L$1"})
    public static final class AnonymousClass1 extends ContinuationImpl {
        Object L$0;
        Object L$1;
        int label;
        /* synthetic */ Object result;

        public AnonymousClass1(Continuation continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return PageFetcher.this.generateNewPagingSource(null, this);
        }
    }

    /* JADX INFO: renamed from: androidx.paging.PageFetcher$generateNewPagingSource$3, reason: invalid class name */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u0001\"\b\b\u0000\u0010\u0002*\u00020\u0003\"\b\b\u0001\u0010\u0004*\u00020\u0003¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "Key", "", "Value", "invoke"}, k = 3, mv = {1, 4, 2})
    public static final /* synthetic */ class AnonymousClass3 extends FunctionReferenceImpl implements Function0<Unit> {
        public AnonymousClass3(PageFetcher pageFetcher) {
            super(0, pageFetcher, PageFetcher.class, "invalidate", "invalidate()V", 0);
        }

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ Unit invoke() {
            invoke2();
            return Unit.INSTANCE;
        }

        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2() {
            ((PageFetcher) this.receiver).invalidate();
        }
    }

    /* JADX INFO: renamed from: androidx.paging.PageFetcher$generateNewPagingSource$4, reason: invalid class name */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u0001\"\b\b\u0000\u0010\u0002*\u00020\u0003\"\b\b\u0001\u0010\u0004*\u00020\u0003¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "Key", "", "Value", "invoke"}, k = 3, mv = {1, 4, 2})
    public static final /* synthetic */ class AnonymousClass4 extends FunctionReferenceImpl implements Function0<Unit> {
        public AnonymousClass4(PageFetcher pageFetcher) {
            super(0, pageFetcher, PageFetcher.class, "invalidate", "invalidate()V", 0);
        }

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ Unit invoke() {
            invoke2();
            return Unit.INSTANCE;
        }

        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2() {
            ((PageFetcher) this.receiver).invalidate();
        }
    }

    /* JADX INFO: renamed from: androidx.paging.PageFetcher$injectRemoteEvents$1, reason: invalid class name and case insensitive filesystem */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001a\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u0001\"\b\b\u0000\u0010\u0002*\u00020\u0003\"\b\b\u0001\u0010\u0004*\u00020\u0003*\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u0002H\u00040\u00060\u0005H\u008a@¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"<anonymous>", "", "Key", "", "Value", "Landroidx/paging/SimpleProducerScope;", "Landroidx/paging/PageEvent;", "invoke", "(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;"}, k = 3, mv = {1, 4, 2})
    @DebugMetadata(c = "androidx.paging.PageFetcher$injectRemoteEvents$1", f = "PageFetcher.kt", i = {}, l = {253}, m = "invokeSuspend", n = {}, s = {})
    public static final class C12491 extends SuspendLambda implements Function2<SimpleProducerScope<PageEvent<Value>>, Continuation<? super Unit>, Object> {
        final /* synthetic */ RemoteMediatorAccessor $accessor;
        final /* synthetic */ PageFetcherSnapshot $this_injectRemoteEvents;
        private /* synthetic */ Object L$0;
        int label;

        /* JADX INFO: renamed from: androidx.paging.PageFetcher$injectRemoteEvents$1$1, reason: invalid class name and collision with other inner class name */
        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u0001\"\b\b\u0000\u0010\u0002*\u00020\u0003\"\b\b\u0001\u0010\u0004*\u00020\u00032\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bH\u008a@¢\u0006\u0004\b\t\u0010\n"}, d2 = {"dispatchIfValid", "", "Key", "", "Value", "type", "Landroidx/paging/LoadType;", "state", "Landroidx/paging/LoadState;", "invoke", "(Landroidx/paging/LoadType;Landroidx/paging/LoadState;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;"}, k = 3, mv = {1, 4, 2})
        @DebugMetadata(c = "androidx.paging.PageFetcher$injectRemoteEvents$1$1", f = "PageFetcher.kt", i = {}, l = {140}, m = "invokeSuspend", n = {}, s = {})
        public static final class C00541 extends SuspendLambda implements Function3<LoadType, LoadState, Continuation<? super Unit>, Object> {
            final /* synthetic */ SimpleProducerScope $this_simpleChannelFlow;
            private /* synthetic */ Object L$0;
            private /* synthetic */ Object L$1;
            int label;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C00541(SimpleProducerScope simpleProducerScope, Continuation continuation) {
                super(3, continuation);
                this.$this_simpleChannelFlow = simpleProducerScope;
            }

            @NotNull
            public final Continuation<Unit> create(@NotNull LoadType type, @NotNull LoadState state, @NotNull Continuation<? super Unit> continuation) {
                Intrinsics.checkNotNullParameter(type, "type");
                Intrinsics.checkNotNullParameter(state, "state");
                Intrinsics.checkNotNullParameter(continuation, "continuation");
                C00541 c00541 = new C00541(this.$this_simpleChannelFlow, continuation);
                c00541.L$0 = type;
                c00541.L$1 = state;
                return c00541;
            }

            @Override // kotlin.jvm.functions.Function3
            @Nullable
            public final Object invoke(@NotNull LoadType loadType, @NotNull LoadState loadState, @NotNull Continuation<? super Unit> continuation) {
                return ((C00541) create(loadType, loadState, continuation)).invokeSuspend(Unit.INSTANCE);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            @Nullable
            public final Object invokeSuspend(@NotNull Object obj) {
                Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
                int i = this.label;
                if (i == 0) {
                    ResultKt.throwOnFailure(obj);
                    LoadType loadType = (LoadType) this.L$0;
                    LoadState loadState = (LoadState) this.L$1;
                    if (PageEvent.LoadStateUpdate.INSTANCE.canDispatchWithoutInsert$paging_common(loadState, true)) {
                        SimpleProducerScope simpleProducerScope = this.$this_simpleChannelFlow;
                        PageEvent.LoadStateUpdate loadStateUpdate = new PageEvent.LoadStateUpdate(loadType, true, loadState);
                        this.L$0 = null;
                        this.label = 1;
                        if (simpleProducerScope.send(loadStateUpdate, this) == coroutine_suspended) {
                            return coroutine_suspended;
                        }
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

        /* JADX INFO: renamed from: androidx.paging.PageFetcher$injectRemoteEvents$1$2, reason: invalid class name */
        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0016\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u0001\"\b\b\u0000\u0010\u0002*\u00020\u0003\"\b\b\u0001\u0010\u0004*\u00020\u0003*\u00020\u0005H\u008a@¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"<anonymous>", "", "Key", "", "Value", "Lkotlinx/coroutines/CoroutineScope;", "invoke", "(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;"}, k = 3, mv = {1, 4, 2})
        @DebugMetadata(c = "androidx.paging.PageFetcher$injectRemoteEvents$1$2", f = "PageFetcher.kt", i = {}, l = {253}, m = "invokeSuspend", n = {}, s = {})
        public static final class AnonymousClass2 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
            final /* synthetic */ C00541 $dispatchIfValid$1;
            final /* synthetic */ MutableLoadStateCollection $loadStates;
            int label;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AnonymousClass2(MutableLoadStateCollection mutableLoadStateCollection, C00541 c00541, Continuation continuation) {
                super(2, continuation);
                this.$loadStates = mutableLoadStateCollection;
                this.$dispatchIfValid$1 = c00541;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            @NotNull
            public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> completion) {
                Intrinsics.checkNotNullParameter(completion, "completion");
                return C12491.this.new AnonymousClass2(this.$loadStates, this.$dispatchIfValid$1, completion);
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
                return ((AnonymousClass2) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
            }

            /* JADX WARN: Type inference failed for: r1v2, types: [T, androidx.paging.LoadStates] */
            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            @Nullable
            public final Object invokeSuspend(@NotNull Object obj) {
                Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
                int i = this.label;
                if (i == 0) {
                    ResultKt.throwOnFailure(obj);
                    Ref.ObjectRef objectRef = new Ref.ObjectRef();
                    objectRef.element = LoadStates.INSTANCE.getIDLE();
                    StateFlow<LoadStates> state = C12491.this.$accessor.getState();
                    PageFetcher$injectRemoteEvents$1$2$invokeSuspend$$inlined$collect$1 pageFetcher$injectRemoteEvents$1$2$invokeSuspend$$inlined$collect$1 = new PageFetcher$injectRemoteEvents$1$2$invokeSuspend$$inlined$collect$1(this, objectRef);
                    this.label = 1;
                    if (state.collect(pageFetcher$injectRemoteEvents$1$2$invokeSuspend$$inlined$collect$1, this) == coroutine_suspended) {
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
        public C12491(PageFetcherSnapshot pageFetcherSnapshot, RemoteMediatorAccessor remoteMediatorAccessor, Continuation continuation) {
            super(2, continuation);
            this.$this_injectRemoteEvents = pageFetcherSnapshot;
            this.$accessor = remoteMediatorAccessor;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> completion) {
            Intrinsics.checkNotNullParameter(completion, "completion");
            C12491 c12491 = new C12491(this.$this_injectRemoteEvents, this.$accessor, completion);
            c12491.L$0 = obj;
            return c12491;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(Object obj, Continuation<? super Unit> continuation) {
            return ((C12491) create(obj, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                SimpleProducerScope simpleProducerScope = (SimpleProducerScope) this.L$0;
                MutableLoadStateCollection mutableLoadStateCollection = new MutableLoadStateCollection();
                BuildersKt__Builders_commonKt.launch$default(simpleProducerScope, null, null, new AnonymousClass2(mutableLoadStateCollection, new C00541(simpleProducerScope, null), null), 3, null);
                Flow<PageEvent<Value>> pageEventFlow = this.$this_injectRemoteEvents.getPageEventFlow();
                PageFetcher$injectRemoteEvents$1$invokeSuspend$$inlined$collect$1 pageFetcher$injectRemoteEvents$1$invokeSuspend$$inlined$collect$1 = new PageFetcher$injectRemoteEvents$1$invokeSuspend$$inlined$collect$1(this, simpleProducerScope, mutableLoadStateCollection);
                this.label = 1;
                if (pageEventFlow.collect(pageFetcher$injectRemoteEvents$1$invokeSuspend$$inlined$collect$1, this) == coroutine_suspended) {
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

    /* JADX WARN: Multi-variable type inference failed */
    public PageFetcher(@NotNull Function1<? super Continuation<? super PagingSource<Key, Value>>, ? extends Object> pagingSourceFactory, @Nullable Key key, @NotNull PagingConfig config, @Nullable RemoteMediator<Key, Value> remoteMediator) {
        Intrinsics.checkNotNullParameter(pagingSourceFactory, "pagingSourceFactory");
        Intrinsics.checkNotNullParameter(config, "config");
        this.pagingSourceFactory = pagingSourceFactory;
        this.initialKey = key;
        this.config = config;
        this.remoteMediator = remoteMediator;
        this.refreshEvents = new ConflatedEventBus<>(null, 1, null);
        this.retryEvents = new ConflatedEventBus<>(null, 1, null);
        this.flow = SimpleChannelFlowKt.simpleChannelFlow(new PageFetcher$flow$1(this, null));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Flow<PageEvent<Value>> injectRemoteEvents(PageFetcherSnapshot<Key, Value> pageFetcherSnapshot, RemoteMediatorAccessor<Key, Value> remoteMediatorAccessor) {
        return remoteMediatorAccessor == null ? pageFetcherSnapshot.getPageEventFlow() : SimpleChannelFlowKt.simpleChannelFlow(new C12491(pageFetcherSnapshot, remoteMediatorAccessor, null));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void invalidate() {
        this.refreshEvents.send(Boolean.FALSE);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final /* synthetic */ Object generateNewPagingSource(PagingSource<Key, Value> pagingSource, Continuation<? super PagingSource<Key, Value>> continuation) {
        AnonymousClass1 anonymousClass1;
        PageFetcher<Key, Value> pageFetcher;
        if (continuation instanceof AnonymousClass1) {
            anonymousClass1 = (AnonymousClass1) continuation;
            int i = anonymousClass1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                anonymousClass1.label = i - Integer.MIN_VALUE;
            } else {
                anonymousClass1 = new AnonymousClass1(continuation);
            }
        } else {
            anonymousClass1 = new AnonymousClass1(continuation);
        }
        Object objInvoke2 = anonymousClass1.result;
        Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = anonymousClass1.label;
        if (i2 == 0) {
            ResultKt.throwOnFailure(objInvoke2);
            Function1<Continuation<? super PagingSource<Key, Value>>, Object> function1 = this.pagingSourceFactory;
            anonymousClass1.L$0 = this;
            anonymousClass1.L$1 = pagingSource;
            anonymousClass1.label = 1;
            objInvoke2 = function1.invoke2(anonymousClass1);
            if (objInvoke2 == coroutine_suspended) {
                return coroutine_suspended;
            }
            pageFetcher = this;
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            pagingSource = (PagingSource) anonymousClass1.L$1;
            pageFetcher = (PageFetcher) anonymousClass1.L$0;
            ResultKt.throwOnFailure(objInvoke2);
        }
        PagingSource<Key, Value> pagingSource2 = (PagingSource) objInvoke2;
        if (pagingSource2 instanceof LegacyPagingSource) {
            ((LegacyPagingSource) pagingSource2).setPageSize(pageFetcher.config.pageSize);
        }
        if (!(pagingSource2 != pagingSource)) {
            throw new IllegalStateException("An instance of PagingSource was re-used when Pager expected to create a new\ninstance. Ensure that the pagingSourceFactory passed to Pager always returns a\nnew instance of PagingSource.".toString());
        }
        pagingSource2.registerInvalidatedCallback(new AnonymousClass3(pageFetcher));
        if (pagingSource != null) {
            pagingSource.unregisterInvalidatedCallback(new AnonymousClass4(pageFetcher));
        }
        if (pagingSource != null) {
            pagingSource.invalidate();
        }
        return pagingSource2;
    }

    @NotNull
    public final Flow<PagingData<Value>> getFlow() {
        return this.flow;
    }

    public final void refresh() {
        this.refreshEvents.send(Boolean.TRUE);
    }

    public /* synthetic */ PageFetcher(Function1 function1, Object obj, PagingConfig pagingConfig, RemoteMediator remoteMediator, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(function1, obj, pagingConfig, (i & 8) != 0 ? null : remoteMediator);
    }
}
