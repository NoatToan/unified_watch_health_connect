package androidx.paging;

import com.xiaomi.onetrack.api.b;
import com.xiaomi.onetrack.c.q;
import java.util.concurrent.atomic.AtomicBoolean;
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
import kotlinx.coroutines.CoroutineDispatcher;
import kotlinx.coroutines.CoroutineScope;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000r\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0000\u0018\u0000*\b\b\u0000\u0010\u0001*\u00020\u0002*\b\b\u0001\u0010\u0003*\u00020\u00022\u00020\u0002:\u000278BU\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0012\u0010\b\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\t\u0012\u0006\u0010\n\u001a\u00020\u000b\u0012\u0006\u0010\f\u001a\u00020\u000b\u0012\f\u0010\r\u001a\b\u0012\u0004\u0012\u00028\u00010\u000e\u0012\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00028\u00000\u0010¢\u0006\u0002\u0010\u0011J\u0006\u0010%\u001a\u00020&J\u0018\u0010'\u001a\u00020&2\u0006\u0010(\u001a\u00020)2\u0006\u0010*\u001a\u00020+H\u0002J$\u0010,\u001a\u00020&2\u0006\u0010(\u001a\u00020)2\u0012\u0010-\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010.H\u0002J\u0006\u0010/\u001a\u00020&J\b\u00100\u001a\u00020&H\u0002J\u001e\u00101\u001a\u00020&2\u0006\u0010(\u001a\u00020)2\f\u00102\u001a\b\u0012\u0004\u0012\u00028\u000003H\u0002J\b\u00104\u001a\u00020&H\u0002J\u0006\u00105\u001a\u00020&J\u0006\u00106\u001a\u00020&R\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R\u000e\u0010\u0014\u001a\u00020\u0015X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\u000bX\u0082\u0004¢\u0006\u0002\n\u0000R\u0011\u0010\u0016\u001a\u00020\u00178F¢\u0006\u0006\u001a\u0004\b\u0016\u0010\u0018R\u0014\u0010\u000f\u001a\b\u0012\u0004\u0012\u00028\u00000\u0010X\u0082\u0004¢\u0006\u0002\n\u0000R \u0010\u0019\u001a\u00020\u001aX\u0086\u000e¢\u0006\u0014\n\u0000\u0012\u0004\b\u001b\u0010\u001c\u001a\u0004\b\u001d\u0010\u001e\"\u0004\b\u001f\u0010 R\u000e\u0010\n\u001a\u00020\u000bX\u0082\u0004¢\u0006\u0002\n\u0000R\u0017\u0010\r\u001a\b\u0012\u0004\u0012\u00028\u00010\u000e¢\u0006\b\n\u0000\u001a\u0004\b!\u0010\"R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u001d\u0010\b\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\t¢\u0006\b\n\u0000\u001a\u0004\b#\u0010$¨\u00069"}, d2 = {"Landroidx/paging/LegacyPageFetcher;", "K", "", "V", "pagedListScope", "Lkotlinx/coroutines/CoroutineScope;", q.f13857a, "Landroidx/paging/PagedList$Config;", "source", "Landroidx/paging/PagingSource;", "notifyDispatcher", "Lkotlinx/coroutines/CoroutineDispatcher;", "fetchDispatcher", "pageConsumer", "Landroidx/paging/LegacyPageFetcher$PageConsumer;", "keyProvider", "Landroidx/paging/LegacyPageFetcher$KeyProvider;", "(Lkotlinx/coroutines/CoroutineScope;Landroidx/paging/PagedList$Config;Landroidx/paging/PagingSource;Lkotlinx/coroutines/CoroutineDispatcher;Lkotlinx/coroutines/CoroutineDispatcher;Landroidx/paging/LegacyPageFetcher$PageConsumer;Landroidx/paging/LegacyPageFetcher$KeyProvider;)V", "getConfig", "()Landroidx/paging/PagedList$Config;", "detached", "Ljava/util/concurrent/atomic/AtomicBoolean;", "isDetached", "", "()Z", "loadStateManager", "Landroidx/paging/PagedList$LoadStateManager;", "getLoadStateManager$annotations", "()V", "getLoadStateManager", "()Landroidx/paging/PagedList$LoadStateManager;", "setLoadStateManager", "(Landroidx/paging/PagedList$LoadStateManager;)V", "getPageConsumer", "()Landroidx/paging/LegacyPageFetcher$PageConsumer;", "getSource", "()Landroidx/paging/PagingSource;", "detach", "", "onLoadError", "type", "Landroidx/paging/LoadType;", "throwable", "", "onLoadSuccess", "value", "Landroidx/paging/PagingSource$LoadResult$Page;", b.M, "scheduleAppend", "scheduleLoad", "params", "Landroidx/paging/PagingSource$LoadParams;", "schedulePrepend", "tryScheduleAppend", "trySchedulePrepend", "KeyProvider", "PageConsumer", "paging-common"}, k = 1, mv = {1, 4, 2})
public final class LegacyPageFetcher<K, V> {

    @NotNull
    private final PagedList.Config config;
    private final AtomicBoolean detached;
    private final CoroutineDispatcher fetchDispatcher;
    private final KeyProvider<K> keyProvider;

    @NotNull
    private PagedList.LoadStateManager loadStateManager;
    private final CoroutineDispatcher notifyDispatcher;

    @NotNull
    private final PageConsumer<V> pageConsumer;
    private final CoroutineScope pagedListScope;

    @NotNull
    private final PagingSource<K, V> source;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0006\b`\u0018\u0000*\b\b\u0002\u0010\u0001*\u00020\u00022\u00020\u0002R\u0014\u0010\u0003\u001a\u0004\u0018\u00018\u0002X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005R\u0014\u0010\u0006\u001a\u0004\u0018\u00018\u0002X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0007\u0010\u0005¨\u0006\b"}, d2 = {"Landroidx/paging/LegacyPageFetcher$KeyProvider;", "K", "", "nextKey", "getNextKey", "()Ljava/lang/Object;", "prevKey", "getPrevKey", "paging-common"}, k = 1, mv = {1, 4, 2})
    public interface KeyProvider<K> {
        @Nullable
        K getNextKey();

        @Nullable
        K getPrevKey();
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b`\u0018\u0000*\b\b\u0002\u0010\u0001*\u00020\u00022\u00020\u0002J\"\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0010\u0010\u0007\u001a\f\u0012\u0002\b\u0003\u0012\u0004\u0012\u00028\u00020\bH&J\u0018\u0010\t\u001a\u00020\n2\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u000b\u001a\u00020\fH&¨\u0006\r"}, d2 = {"Landroidx/paging/LegacyPageFetcher$PageConsumer;", "V", "", "onPageResult", "", "type", "Landroidx/paging/LoadType;", "page", "Landroidx/paging/PagingSource$LoadResult$Page;", "onStateChanged", "", "state", "Landroidx/paging/LoadState;", "paging-common"}, k = 1, mv = {1, 4, 2})
    public interface PageConsumer<V> {
        boolean onPageResult(@NotNull LoadType type, @NotNull PagingSource.LoadResult.Page<?, V> page);

        void onStateChanged(@NotNull LoadType type, @NotNull LoadState state);
    }

    @Metadata(bv = {1, 0, 3}, k = 3, mv = {1, 4, 2})
    public final /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[LoadType.values().length];
            $EnumSwitchMapping$0 = iArr;
            iArr[LoadType.PREPEND.ordinal()] = 1;
            iArr[LoadType.APPEND.ordinal()] = 2;
        }
    }

    /* JADX INFO: renamed from: androidx.paging.LegacyPageFetcher$scheduleLoad$1, reason: invalid class name */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0016\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u0001\"\b\b\u0000\u0010\u0002*\u00020\u0003\"\b\b\u0001\u0010\u0004*\u00020\u0003*\u00020\u0005H\u008a@¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"<anonymous>", "", "K", "", "V", "Lkotlinx/coroutines/CoroutineScope;", "invoke", "(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;"}, k = 3, mv = {1, 4, 2})
    @DebugMetadata(c = "androidx.paging.LegacyPageFetcher$scheduleLoad$1", f = "LegacyPageFetcher.kt", i = {0}, l = {53}, m = "invokeSuspend", n = {"$this$launch"}, s = {"L$0"})
    public static final class AnonymousClass1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final /* synthetic */ PagingSource.LoadParams $params;
        final /* synthetic */ LoadType $type;
        private /* synthetic */ Object L$0;
        int label;

        /* JADX INFO: renamed from: androidx.paging.LegacyPageFetcher$scheduleLoad$1$1, reason: invalid class name and collision with other inner class name */
        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0016\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u0001\"\b\b\u0000\u0010\u0002*\u00020\u0003\"\b\b\u0001\u0010\u0004*\u00020\u0003*\u00020\u0005H\u008a@¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"<anonymous>", "", "K", "", "V", "Lkotlinx/coroutines/CoroutineScope;", "invoke", "(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;"}, k = 3, mv = {1, 4, 2})
        @DebugMetadata(c = "androidx.paging.LegacyPageFetcher$scheduleLoad$1$1", f = "LegacyPageFetcher.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
        public static final class C00521 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
            final /* synthetic */ PagingSource.LoadResult $value;
            int label;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C00521(PagingSource.LoadResult loadResult, Continuation continuation) {
                super(2, continuation);
                this.$value = loadResult;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            @NotNull
            public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> completion) {
                Intrinsics.checkNotNullParameter(completion, "completion");
                return AnonymousClass1.this.new C00521(this.$value, completion);
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
                return ((C00521) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            @Nullable
            public final Object invokeSuspend(@NotNull Object obj) {
                IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
                if (this.label != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
                PagingSource.LoadResult loadResult = this.$value;
                if (loadResult instanceof PagingSource.LoadResult.Page) {
                    AnonymousClass1 anonymousClass1 = AnonymousClass1.this;
                    LegacyPageFetcher.this.onLoadSuccess(anonymousClass1.$type, (PagingSource.LoadResult.Page) loadResult);
                } else if (loadResult instanceof PagingSource.LoadResult.Error) {
                    AnonymousClass1 anonymousClass2 = AnonymousClass1.this;
                    LegacyPageFetcher.this.onLoadError(anonymousClass2.$type, ((PagingSource.LoadResult.Error) loadResult).getThrowable());
                }
                return Unit.INSTANCE;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(PagingSource.LoadParams loadParams, LoadType loadType, Continuation continuation) {
            super(2, continuation);
            this.$params = loadParams;
            this.$type = loadType;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> completion) {
            Intrinsics.checkNotNullParameter(completion, "completion");
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.$params, this.$type, completion);
            anonymousClass1.L$0 = obj;
            return anonymousClass1;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((AnonymousClass1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            CoroutineScope coroutineScope;
            Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                CoroutineScope coroutineScope2 = (CoroutineScope) this.L$0;
                PagingSource<K, V> source = LegacyPageFetcher.this.getSource();
                PagingSource.LoadParams<K> loadParams = this.$params;
                this.L$0 = coroutineScope2;
                this.label = 1;
                Object objLoad = source.load(loadParams, this);
                if (objLoad == coroutine_suspended) {
                    return coroutine_suspended;
                }
                coroutineScope = coroutineScope2;
                obj = objLoad;
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                coroutineScope = (CoroutineScope) this.L$0;
                ResultKt.throwOnFailure(obj);
            }
            PagingSource.LoadResult loadResult = (PagingSource.LoadResult) obj;
            if (LegacyPageFetcher.this.getSource().getInvalid()) {
                LegacyPageFetcher.this.detach();
                return Unit.INSTANCE;
            }
            BuildersKt__Builders_commonKt.launch$default(coroutineScope, LegacyPageFetcher.this.notifyDispatcher, null, new C00521(loadResult, null), 2, null);
            return Unit.INSTANCE;
        }
    }

    public LegacyPageFetcher(@NotNull CoroutineScope pagedListScope, @NotNull PagedList.Config config, @NotNull PagingSource<K, V> source, @NotNull CoroutineDispatcher notifyDispatcher, @NotNull CoroutineDispatcher fetchDispatcher, @NotNull PageConsumer<V> pageConsumer, @NotNull KeyProvider<K> keyProvider) {
        Intrinsics.checkNotNullParameter(pagedListScope, "pagedListScope");
        Intrinsics.checkNotNullParameter(config, "config");
        Intrinsics.checkNotNullParameter(source, "source");
        Intrinsics.checkNotNullParameter(notifyDispatcher, "notifyDispatcher");
        Intrinsics.checkNotNullParameter(fetchDispatcher, "fetchDispatcher");
        Intrinsics.checkNotNullParameter(pageConsumer, "pageConsumer");
        Intrinsics.checkNotNullParameter(keyProvider, "keyProvider");
        this.pagedListScope = pagedListScope;
        this.config = config;
        this.source = source;
        this.notifyDispatcher = notifyDispatcher;
        this.fetchDispatcher = fetchDispatcher;
        this.pageConsumer = pageConsumer;
        this.keyProvider = keyProvider;
        this.detached = new AtomicBoolean(false);
        this.loadStateManager = new PagedList.LoadStateManager() { // from class: androidx.paging.LegacyPageFetcher$loadStateManager$1
            @Override // androidx.paging.PagedList.LoadStateManager
            public void onStateChanged(@NotNull LoadType type, @NotNull LoadState state) {
                Intrinsics.checkNotNullParameter(type, "type");
                Intrinsics.checkNotNullParameter(state, "state");
                this.this$0.getPageConsumer().onStateChanged(type, state);
            }
        };
    }

    public static /* synthetic */ void getLoadStateManager$annotations() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void onLoadError(LoadType type, Throwable throwable) {
        if (isDetached()) {
            return;
        }
        this.loadStateManager.setState(type, new LoadState.Error(throwable));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void onLoadSuccess(LoadType type, PagingSource.LoadResult.Page<K, V> value) {
        if (isDetached()) {
            return;
        }
        if (!this.pageConsumer.onPageResult(type, value)) {
            this.loadStateManager.setState(type, value.getData().isEmpty() ? LoadState.NotLoading.INSTANCE.getComplete$paging_common() : LoadState.NotLoading.INSTANCE.getIncomplete$paging_common());
            return;
        }
        int i = WhenMappings.$EnumSwitchMapping$0[type.ordinal()];
        if (i == 1) {
            schedulePrepend();
        } else {
            if (i != 2) {
                throw new IllegalStateException("Can only fetch more during append/prepend");
            }
            scheduleAppend();
        }
    }

    private final void scheduleAppend() {
        K nextKey = this.keyProvider.getNextKey();
        if (nextKey == null) {
            onLoadSuccess(LoadType.APPEND, PagingSource.LoadResult.Page.INSTANCE.empty$paging_common());
            return;
        }
        PagedList.LoadStateManager loadStateManager = this.loadStateManager;
        LoadType loadType = LoadType.APPEND;
        loadStateManager.setState(loadType, LoadState.Loading.INSTANCE);
        PagedList.Config config = this.config;
        scheduleLoad(loadType, new PagingSource.LoadParams.Append(nextKey, config.pageSize, config.enablePlaceholders));
    }

    private final void scheduleLoad(LoadType type, PagingSource.LoadParams<K> params) {
        BuildersKt__Builders_commonKt.launch$default(this.pagedListScope, this.fetchDispatcher, null, new AnonymousClass1(params, type, null), 2, null);
    }

    private final void schedulePrepend() {
        K prevKey = this.keyProvider.getPrevKey();
        if (prevKey == null) {
            onLoadSuccess(LoadType.PREPEND, PagingSource.LoadResult.Page.INSTANCE.empty$paging_common());
            return;
        }
        PagedList.LoadStateManager loadStateManager = this.loadStateManager;
        LoadType loadType = LoadType.PREPEND;
        loadStateManager.setState(loadType, LoadState.Loading.INSTANCE);
        PagedList.Config config = this.config;
        scheduleLoad(loadType, new PagingSource.LoadParams.Prepend(prevKey, config.pageSize, config.enablePlaceholders));
    }

    public final void detach() {
        this.detached.set(true);
    }

    @NotNull
    public final PagedList.Config getConfig() {
        return this.config;
    }

    @NotNull
    public final PagedList.LoadStateManager getLoadStateManager() {
        return this.loadStateManager;
    }

    @NotNull
    public final PageConsumer<V> getPageConsumer() {
        return this.pageConsumer;
    }

    @NotNull
    public final PagingSource<K, V> getSource() {
        return this.source;
    }

    public final boolean isDetached() {
        return this.detached.get();
    }

    public final void retry() {
        if (this.loadStateManager.getStartState() instanceof LoadState.Error) {
            schedulePrepend();
        }
        if (this.loadStateManager.getEndState() instanceof LoadState.Error) {
            scheduleAppend();
        }
    }

    public final void setLoadStateManager(@NotNull PagedList.LoadStateManager loadStateManager) {
        Intrinsics.checkNotNullParameter(loadStateManager, "<set-?>");
        this.loadStateManager = loadStateManager;
    }

    public final void tryScheduleAppend() {
        LoadState endState = this.loadStateManager.getEndState();
        if (!(endState instanceof LoadState.NotLoading) || endState.getEndOfPaginationReached()) {
            return;
        }
        scheduleAppend();
    }

    public final void trySchedulePrepend() {
        LoadState startState = this.loadStateManager.getStartState();
        if (!(startState instanceof LoadState.NotLoading) || startState.getEndOfPaginationReached()) {
            return;
        }
        schedulePrepend();
    }
}
