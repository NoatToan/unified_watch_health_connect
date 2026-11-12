package androidx.paging;

import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsKt;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.FlowKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: Add missing generic type declarations: [Value] */
/* JADX INFO: loaded from: classes.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001a\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u0001\"\b\b\u0000\u0010\u0002*\u00020\u0003\"\b\b\u0001\u0010\u0004*\u00020\u0003*\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u0002H\u00040\u00060\u0005H\u008a@¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"<anonymous>", "", "Key", "", "Value", "Landroidx/paging/SimpleProducerScope;", "Landroidx/paging/PagingData;", "invoke", "(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;"}, k = 3, mv = {1, 4, 2})
@DebugMetadata(c = "androidx.paging.PageFetcher$flow$1", f = "PageFetcher.kt", i = {}, l = {254}, m = "invokeSuspend", n = {}, s = {})
public final class PageFetcher$flow$1<Value> extends SuspendLambda implements Function2<SimpleProducerScope<PagingData<Value>>, Continuation<? super Unit>, Object> {
    private /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ PageFetcher this$0;

    /* JADX INFO: renamed from: androidx.paging.PageFetcher$flow$1$1, reason: invalid class name */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001a\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u0001\"\b\b\u0000\u0010\u0002*\u00020\u0003\"\b\b\u0001\u0010\u0004*\u00020\u0003*\b\u0012\u0004\u0012\u00020\u00060\u0005H\u008a@¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"<anonymous>", "", "Key", "", "Value", "Lkotlinx/coroutines/flow/FlowCollector;", "", "invoke", "(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;"}, k = 3, mv = {1, 4, 2})
    @DebugMetadata(c = "androidx.paging.PageFetcher$flow$1$1", f = "PageFetcher.kt", i = {}, l = {58, 58}, m = "invokeSuspend", n = {}, s = {})
    public static final class AnonymousClass1 extends SuspendLambda implements Function2<FlowCollector<? super Boolean>, Continuation<? super Unit>, Object> {
        final /* synthetic */ RemoteMediatorAccessor $remoteMediatorAccessor;
        private /* synthetic */ Object L$0;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(RemoteMediatorAccessor remoteMediatorAccessor, Continuation continuation) {
            super(2, continuation);
            this.$remoteMediatorAccessor = remoteMediatorAccessor;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> completion) {
            Intrinsics.checkNotNullParameter(completion, "completion");
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.$remoteMediatorAccessor, completion);
            anonymousClass1.L$0 = obj;
            return anonymousClass1;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(FlowCollector<? super Boolean> flowCollector, Continuation<? super Unit> continuation) {
            return ((AnonymousClass1) create(flowCollector, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        /* JADX WARN: Code duplicated, block: B:20:0x0043  */
        /* JADX WARN: Code duplicated, block: B:23:0x0052 A[RETURN] */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            FlowCollector flowCollector;
            RemoteMediator.InitializeAction initializeAction;
            Boolean boolBoxBoolean;
            Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i != 0) {
                if (i == 1) {
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
            RemoteMediatorAccessor remoteMediatorAccessor = this.$remoteMediatorAccessor;
            if (remoteMediatorAccessor != null) {
                this.L$0 = flowCollector;
                this.label = 1;
                obj = remoteMediatorAccessor.initialize(this);
                if (obj == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                initializeAction = null;
            }
            boolBoxBoolean = Boxing.boxBoolean(initializeAction == RemoteMediator.InitializeAction.LAUNCH_INITIAL_REFRESH);
            this.L$0 = null;
            this.label = 2;
            if (flowCollector.emit(boolBoxBoolean, this) == coroutine_suspended) {
                return coroutine_suspended;
            }
            return Unit.INSTANCE;
            initializeAction = (RemoteMediator.InitializeAction) obj;
            boolBoxBoolean = Boxing.boxBoolean(initializeAction == RemoteMediator.InitializeAction.LAUNCH_INITIAL_REFRESH);
            this.L$0 = null;
            this.label = 2;
            if (flowCollector.emit(boolBoxBoolean, this) == coroutine_suspended) {
                return coroutine_suspended;
            }
            return Unit.INSTANCE;
        }
    }

    /* JADX INFO: Add missing generic type declarations: [Key] */
    /* JADX INFO: renamed from: androidx.paging.PageFetcher$flow$1$2, reason: invalid class name */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001a\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\u0010\u0000\u001a\u0010\u0012\u0004\u0012\u0002H\u0002\u0012\u0004\u0012\u0002H\u0003\u0018\u00010\u0001\"\b\b\u0000\u0010\u0002*\u00020\u0004\"\b\b\u0001\u0010\u0003*\u00020\u00042\u0014\u0010\u0005\u001a\u0010\u0012\u0004\u0012\u0002H\u0002\u0012\u0004\u0012\u0002H\u0003\u0018\u00010\u00012\u0006\u0010\u0006\u001a\u00020\u0007H\u008a@¢\u0006\u0004\b\b\u0010\t"}, d2 = {"<anonymous>", "Landroidx/paging/PageFetcher$GenerationInfo;", "Key", "Value", "", "previousGeneration", "triggerRemoteRefresh", "", "invoke", "(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;"}, k = 3, mv = {1, 4, 2})
    @DebugMetadata(c = "androidx.paging.PageFetcher$flow$1$2", f = "PageFetcher.kt", i = {0, 0, 0, 1, 1, 1, 2, 2, 2}, l = {63, 66, 69}, m = "invokeSuspend", n = {"previousGeneration", "pagingSource", "triggerRemoteRefresh", "previousGeneration", "pagingSource", "triggerRemoteRefresh", "previousGeneration", "pagingSource", "triggerRemoteRefresh"}, s = {"L$0", "L$1", "Z$0", "L$0", "L$1", "Z$0", "L$0", "L$1", "Z$0"})
    public static final class AnonymousClass2<Key> extends SuspendLambda implements Function3<PageFetcher.GenerationInfo<Key, Value>, Boolean, Continuation<? super PageFetcher.GenerationInfo<Key, Value>>, Object> {
        final /* synthetic */ RemoteMediatorAccessor $remoteMediatorAccessor;
        private /* synthetic */ Object L$0;
        Object L$1;
        Object L$2;
        private /* synthetic */ boolean Z$0;
        int label;

        /* JADX INFO: renamed from: androidx.paging.PageFetcher$flow$1$2$1, reason: invalid class name */
        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u0001\"\b\b\u0000\u0010\u0002*\u00020\u0003\"\b\b\u0001\u0010\u0004*\u00020\u0003¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "Key", "", "Value", "invoke"}, k = 3, mv = {1, 4, 2})
        public static final /* synthetic */ class AnonymousClass1 extends FunctionReferenceImpl implements Function0<Unit> {
            public AnonymousClass1(PageFetcher pageFetcher) {
                super(0, pageFetcher, PageFetcher.class, "refresh", "refresh()V", 0);
            }

            @Override // kotlin.jvm.functions.Function0
            public /* bridge */ /* synthetic */ Unit invoke() {
                invoke2();
                return Unit.INSTANCE;
            }

            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2() {
                ((PageFetcher) this.receiver).refresh();
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass2(RemoteMediatorAccessor remoteMediatorAccessor, Continuation continuation) {
            super(3, continuation);
            this.$remoteMediatorAccessor = remoteMediatorAccessor;
        }

        @NotNull
        public final Continuation<Unit> create(@Nullable PageFetcher.GenerationInfo<Key, Value> generationInfo, boolean z, @NotNull Continuation<? super PageFetcher.GenerationInfo<Key, Value>> continuation) {
            Intrinsics.checkNotNullParameter(continuation, "continuation");
            AnonymousClass2 anonymousClass2 = new AnonymousClass2(this.$remoteMediatorAccessor, continuation);
            anonymousClass2.L$0 = generationInfo;
            anonymousClass2.Z$0 = z;
            return anonymousClass2;
        }

        @Override // kotlin.jvm.functions.Function3
        public final Object invoke(Object obj, Boolean bool, Object obj2) {
            return ((AnonymousClass2) create((PageFetcher.GenerationInfo) obj, bool.booleanValue(), (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
        }

        /* JADX WARN: Code duplicated, block: B:25:0x009d  */
        /* JADX WARN: Code duplicated, block: B:27:0x00b5 A[RETURN] */
        /* JADX WARN: Code duplicated, block: B:28:0x00b6  */
        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r7v9, types: [T, androidx.paging.PagingSource] */
        /* JADX WARN: Type inference failed for: r8v4, types: [T, androidx.paging.PagingSource] */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:28:0x00b6 -> B:29:0x00b7). Please report as a decompilation issue!!! */
        /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
            jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
            	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
            	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
            	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
            */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @org.jetbrains.annotations.Nullable
        public final java.lang.Object invokeSuspend(@org.jetbrains.annotations.NotNull java.lang.Object r21) {
            /*
                Method dump skipped, instruction units count: 386
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.paging.PageFetcher$flow$1.AnonymousClass2.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PageFetcher$flow$1(PageFetcher pageFetcher, Continuation continuation) {
        super(2, continuation);
        this.this$0 = pageFetcher;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @NotNull
    public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> completion) {
        Intrinsics.checkNotNullParameter(completion, "completion");
        PageFetcher$flow$1 pageFetcher$flow$1 = new PageFetcher$flow$1(this.this$0, completion);
        pageFetcher$flow$1.L$0 = obj;
        return pageFetcher$flow$1;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Continuation<? super Unit> continuation) {
        return ((PageFetcher$flow$1) create(obj, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.label;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            final SimpleProducerScope simpleProducerScope = (SimpleProducerScope) this.L$0;
            RemoteMediator remoteMediator = this.this$0.remoteMediator;
            RemoteMediatorAccessor RemoteMediatorAccessor = remoteMediator != null ? RemoteMediatorAccessorKt.RemoteMediatorAccessor(simpleProducerScope, remoteMediator) : null;
            Flow flowSimpleTransformLatest = FlowExtKt.simpleTransformLatest(FlowKt.filterNotNull(FlowExtKt.simpleScan(FlowKt.onStart(this.this$0.refreshEvents.getFlow(), new AnonymousClass1(RemoteMediatorAccessor, null)), null, new AnonymousClass2(RemoteMediatorAccessor, null))), new PageFetcher$flow$1$invokeSuspend$$inlined$simpleMapLatest$1(null, this, RemoteMediatorAccessor));
            FlowCollector<PagingData<Value>> flowCollector = new FlowCollector<PagingData<Value>>() { // from class: androidx.paging.PageFetcher$flow$1$invokeSuspend$$inlined$collect$1
                @Override // kotlinx.coroutines.flow.FlowCollector
                @Nullable
                public Object emit(Object obj2, @NotNull Continuation continuation) {
                    Object objSend = simpleProducerScope.send((PagingData) obj2, continuation);
                    return objSend == IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objSend : Unit.INSTANCE;
                }
            };
            this.label = 1;
            if (flowSimpleTransformLatest.collect(flowCollector, this) == coroutine_suspended) {
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
