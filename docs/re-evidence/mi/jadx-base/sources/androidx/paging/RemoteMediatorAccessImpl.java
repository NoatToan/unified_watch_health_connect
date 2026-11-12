package androidx.paging;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.StateFlow;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0002\u0018\u0000 \u001f*\b\b\u0000\u0010\u0001*\u00020\u0002*\b\b\u0001\u0010\u0003*\u00020\u00022\u000e\u0012\u0004\u0012\u0002H\u0001\u0012\u0004\u0012\u0002H\u00030\u0004:\u0001\u001fB!\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\b¢\u0006\u0002\u0010\tJ\u0011\u0010\u0013\u001a\u00020\u0014H\u0096@ø\u0001\u0000¢\u0006\u0002\u0010\u0015J\b\u0010\u0016\u001a\u00020\u0017H\u0002J\b\u0010\u0018\u001a\u00020\u0017H\u0002J$\u0010\u0019\u001a\u00020\u00172\u0006\u0010\u001a\u001a\u00020\u001b2\u0012\u0010\u001c\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u001dH\u0016J\u001c\u0010\u001e\u001a\u00020\u00172\u0012\u0010\u001c\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u001dH\u0016R\u001a\u0010\n\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u000bX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\rX\u0082\u0004¢\u0006\u0002\n\u0000R\u001a\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\bX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u0004¢\u0006\u0002\n\u0000R\u001a\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00100\u000f8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0011\u0010\u0012\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006 "}, d2 = {"Landroidx/paging/RemoteMediatorAccessImpl;", "Key", "", "Value", "Landroidx/paging/RemoteMediatorAccessor;", "scope", "Lkotlinx/coroutines/CoroutineScope;", "remoteMediator", "Landroidx/paging/RemoteMediator;", "(Lkotlinx/coroutines/CoroutineScope;Landroidx/paging/RemoteMediator;)V", "accessorState", "Landroidx/paging/AccessorStateHolder;", "isolationRunner", "Landroidx/paging/SingleRunner;", "state", "Lkotlinx/coroutines/flow/StateFlow;", "Landroidx/paging/LoadStates;", "getState", "()Lkotlinx/coroutines/flow/StateFlow;", "initialize", "Landroidx/paging/RemoteMediator$InitializeAction;", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "launchBoundary", "", "launchRefresh", "requestLoad", "loadType", "Landroidx/paging/LoadType;", "pagingState", "Landroidx/paging/PagingState;", "retryFailed", "Companion", "paging-common"}, k = 1, mv = {1, 4, 2})
final class RemoteMediatorAccessImpl<Key, Value> implements RemoteMediatorAccessor<Key, Value> {
    private static final int PRIORITY_APPEND_PREPEND = 1;
    private static final int PRIORITY_REFRESH = 2;
    private final AccessorStateHolder<Key, Value> accessorState;
    private final SingleRunner isolationRunner;
    private final RemoteMediator<Key, Value> remoteMediator;
    private final CoroutineScope scope;

    @Metadata(bv = {1, 0, 3}, k = 3, mv = {1, 4, 2})
    public final /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[LoadType.values().length];
            $EnumSwitchMapping$0 = iArr;
            iArr[LoadType.REFRESH.ordinal()] = 1;
        }
    }

    /* JADX INFO: renamed from: androidx.paging.RemoteMediatorAccessImpl$initialize$1, reason: invalid class name */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0012\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u0004\u0018\u00010\u0001\"\b\b\u0000\u0010\u0002*\u00020\u0001\"\b\b\u0001\u0010\u0003*\u00020\u00012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005H\u0096@"}, d2 = {"initialize", "", "Key", "Value", "continuation", "Lkotlin/coroutines/Continuation;", "Landroidx/paging/RemoteMediator$InitializeAction;"}, k = 3, mv = {1, 4, 2})
    @DebugMetadata(c = "androidx.paging.RemoteMediatorAccessImpl", f = "RemoteMediatorAccessor.kt", i = {0}, l = {394}, m = "initialize", n = {"this"}, s = {"L$0"})
    public static final class AnonymousClass1 extends ContinuationImpl {
        Object L$0;
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
            return RemoteMediatorAccessImpl.this.initialize(this);
        }
    }

    /* JADX INFO: renamed from: androidx.paging.RemoteMediatorAccessImpl$launchBoundary$1, reason: invalid class name and case insensitive filesystem */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0016\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u0001\"\b\b\u0000\u0010\u0002*\u00020\u0003\"\b\b\u0001\u0010\u0004*\u00020\u0003*\u00020\u0005H\u008a@¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"<anonymous>", "", "Key", "", "Value", "Lkotlinx/coroutines/CoroutineScope;", "invoke", "(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;"}, k = 3, mv = {1, 4, 2})
    @DebugMetadata(c = "androidx.paging.RemoteMediatorAccessImpl$launchBoundary$1", f = "RemoteMediatorAccessor.kt", i = {}, l = {337}, m = "invokeSuspend", n = {}, s = {})
    public static final class C12701 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        int label;

        /* JADX INFO: renamed from: androidx.paging.RemoteMediatorAccessImpl$launchBoundary$1$1, reason: invalid class name and collision with other inner class name */
        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\u0010\u0000\u001a\u00020\u0001\"\b\b\u0000\u0010\u0002*\u00020\u0003\"\b\b\u0001\u0010\u0004*\u00020\u0003H\u008a@¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"<anonymous>", "", "Key", "", "Value", "invoke", "(Ljava/lang/Object;)Ljava/lang/Object;"}, k = 3, mv = {1, 4, 2})
        @DebugMetadata(c = "androidx.paging.RemoteMediatorAccessImpl$launchBoundary$1$1", f = "RemoteMediatorAccessor.kt", i = {0}, l = {342}, m = "invokeSuspend", n = {"loadType"}, s = {"L$0"})
        public static final class C00571 extends SuspendLambda implements Function1<Continuation<? super Unit>, Object> {
            Object L$0;
            int label;

            public C00571(Continuation continuation) {
                super(1, continuation);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            @NotNull
            public final Continuation<Unit> create(@NotNull Continuation<?> completion) {
                Intrinsics.checkNotNullParameter(completion, "completion");
                return C12701.this.new C00571(completion);
            }

            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Continuation<? super Unit> continuation) {
                return ((C00571) create(continuation)).invokeSuspend(Unit.INSTANCE);
            }

            /* JADX WARN: Code duplicated, block: B:11:0x0030  */
            /* JADX WARN: Code duplicated, block: B:13:0x004e A[RETURN] */
            /* JADX WARN: Code duplicated, block: B:16:0x0055  */
            /* JADX WARN: Code duplicated, block: B:17:0x0066  */
            /* JADX WARN: Code duplicated, block: B:19:0x006a  */
            /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:12:0x004c -> B:14:0x004f). Please report as a decompilation issue!!! */
            /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
                jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:16:0x0055
                	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
                	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
                	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
                */
            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            @org.jetbrains.annotations.Nullable
            public final java.lang.Object invokeSuspend(@org.jetbrains.annotations.NotNull java.lang.Object r6) {
                /*
                    r5 = this;
                    java.lang.Object r0 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
                    int r1 = r5.label
                    r2 = 1
                    if (r1 == 0) goto L1b
                    if (r1 != r2) goto L13
                    java.lang.Object r1 = r5.L$0
                    androidx.paging.LoadType r1 = (androidx.paging.LoadType) r1
                    kotlin.ResultKt.throwOnFailure(r6)
                    goto L4f
                L13:
                    java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
                    java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                    r6.<init>(r0)
                    throw r6
                L1b:
                    kotlin.ResultKt.throwOnFailure(r6)
                L1e:
                    androidx.paging.RemoteMediatorAccessImpl$launchBoundary$1 r6 = androidx.paging.RemoteMediatorAccessImpl.C12701.this
                    androidx.paging.RemoteMediatorAccessImpl r6 = androidx.paging.RemoteMediatorAccessImpl.this
                    androidx.paging.AccessorStateHolder r6 = androidx.paging.RemoteMediatorAccessImpl.access$getAccessorState$p(r6)
                    androidx.paging.RemoteMediatorAccessImpl$launchBoundary$1$1$1 r1 = new kotlin.jvm.functions.Function1<androidx.paging.AccessorState<Key, Value>, kotlin.Pair<? extends androidx.paging.LoadType, ? extends androidx.paging.PagingState<Key, Value>>>() { // from class: androidx.paging.RemoteMediatorAccessImpl.launchBoundary.1.1.1
                        static {
                            /*
                                androidx.paging.RemoteMediatorAccessImpl$launchBoundary$1$1$1 r0 = new androidx.paging.RemoteMediatorAccessImpl$launchBoundary$1$1$1
                                r0.<init>()
                                
                                // error: 0x0005: SPUT (r0 I:androidx.paging.RemoteMediatorAccessImpl$launchBoundary$1$1$1) androidx.paging.RemoteMediatorAccessImpl.launchBoundary.1.1.1.INSTANCE androidx.paging.RemoteMediatorAccessImpl$launchBoundary$1$1$1
                                return
                            */
                            throw new UnsupportedOperationException("Method not decompiled: androidx.paging.RemoteMediatorAccessImpl.C12701.C00571.C00581.<clinit>():void");
                        }

                        {
                            /*
                                r1 = this;
                                r0 = 1
                                r1.<init>(r0)
                                return
                            */
                            throw new UnsupportedOperationException("Method not decompiled: androidx.paging.RemoteMediatorAccessImpl.C12701.C00571.C00581.<init>():void");
                        }

                        @Override // kotlin.jvm.functions.Function1
                        /* JADX INFO: renamed from: invoke */
                        public /* bridge */ /* synthetic */ java.lang.Object invoke2(java.lang.Object r1) {
                            /*
                                r0 = this;
                                androidx.paging.AccessorState r1 = (androidx.paging.AccessorState) r1
                                kotlin.Pair r1 = r0.invoke2(r1)
                                return r1
                            */
                            throw new UnsupportedOperationException("Method not decompiled: androidx.paging.RemoteMediatorAccessImpl.C12701.C00571.C00581.invoke2(java.lang.Object):java.lang.Object");
                        }

                        @Override // kotlin.jvm.functions.Function1
                        @org.jetbrains.annotations.Nullable
                        /* JADX INFO: renamed from: invoke, reason: merged with bridge method [inline-methods] */
                        public final kotlin.Pair<androidx.paging.LoadType, androidx.paging.PagingState<Key, Value>> invoke2(@org.jetbrains.annotations.NotNull androidx.paging.AccessorState<Key, Value> r2) {
                            /*
                                r1 = this;
                                java.lang.String r0 = "it"
                                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r2, r0)
                                kotlin.Pair r2 = r2.getPendingBoundary()
                                return r2
                            */
                            throw new UnsupportedOperationException("Method not decompiled: androidx.paging.RemoteMediatorAccessImpl.C12701.C00571.C00581.invoke2(androidx.paging.AccessorState):kotlin.Pair");
                        }
                    }
                    java.lang.Object r6 = r6.use(r1)
                    kotlin.Pair r6 = (kotlin.Pair) r6
                    if (r6 == 0) goto L7b
                    java.lang.Object r1 = r6.component1()
                    androidx.paging.LoadType r1 = (androidx.paging.LoadType) r1
                    java.lang.Object r6 = r6.component2()
                    androidx.paging.PagingState r6 = (androidx.paging.PagingState) r6
                    androidx.paging.RemoteMediatorAccessImpl$launchBoundary$1 r3 = androidx.paging.RemoteMediatorAccessImpl.C12701.this
                    androidx.paging.RemoteMediatorAccessImpl r3 = androidx.paging.RemoteMediatorAccessImpl.this
                    androidx.paging.RemoteMediator r3 = androidx.paging.RemoteMediatorAccessImpl.access$getRemoteMediator$p(r3)
                    r5.L$0 = r1
                    r5.label = r2
                    java.lang.Object r6 = r3.load(r1, r6, r5)
                    if (r6 != r0) goto L4f
                    return r0
                L4f:
                    androidx.paging.RemoteMediator$MediatorResult r6 = (androidx.paging.RemoteMediator.MediatorResult) r6
                    boolean r3 = r6 instanceof androidx.paging.RemoteMediator.MediatorResult.Success
                    if (r3 == 0) goto L66
                    androidx.paging.RemoteMediatorAccessImpl$launchBoundary$1 r3 = androidx.paging.RemoteMediatorAccessImpl.C12701.this
                    androidx.paging.RemoteMediatorAccessImpl r3 = androidx.paging.RemoteMediatorAccessImpl.this
                    androidx.paging.AccessorStateHolder r3 = androidx.paging.RemoteMediatorAccessImpl.access$getAccessorState$p(r3)
                    androidx.paging.RemoteMediatorAccessImpl$launchBoundary$1$1$2 r4 = new androidx.paging.RemoteMediatorAccessImpl$launchBoundary$1$1$2
                    r4.<init>()
                    r3.use(r4)
                    goto L1e
                L66:
                    boolean r3 = r6 instanceof androidx.paging.RemoteMediator.MediatorResult.Error
                    if (r3 == 0) goto L1e
                    androidx.paging.RemoteMediatorAccessImpl$launchBoundary$1 r3 = androidx.paging.RemoteMediatorAccessImpl.C12701.this
                    androidx.paging.RemoteMediatorAccessImpl r3 = androidx.paging.RemoteMediatorAccessImpl.this
                    androidx.paging.AccessorStateHolder r3 = androidx.paging.RemoteMediatorAccessImpl.access$getAccessorState$p(r3)
                    androidx.paging.RemoteMediatorAccessImpl$launchBoundary$1$1$3 r4 = new androidx.paging.RemoteMediatorAccessImpl$launchBoundary$1$1$3
                    r4.<init>()
                    r3.use(r4)
                    goto L1e
                L7b:
                    kotlin.Unit r6 = kotlin.Unit.INSTANCE
                    return r6
                */
                throw new UnsupportedOperationException("Method not decompiled: androidx.paging.RemoteMediatorAccessImpl.C12701.C00571.invokeSuspend(java.lang.Object):java.lang.Object");
            }
        }

        public C12701(Continuation continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> completion) {
            Intrinsics.checkNotNullParameter(completion, "completion");
            return new C12701(completion);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C12701) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                SingleRunner singleRunner = RemoteMediatorAccessImpl.this.isolationRunner;
                C00571 c00571 = new C00571(null);
                this.label = 1;
                if (singleRunner.runInIsolation(1, c00571, this) == coroutine_suspended) {
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

    /* JADX INFO: renamed from: androidx.paging.RemoteMediatorAccessImpl$launchRefresh$1, reason: invalid class name and case insensitive filesystem */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0016\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u0001\"\b\b\u0000\u0010\u0002*\u00020\u0003\"\b\b\u0001\u0010\u0004*\u00020\u0003*\u00020\u0005H\u008a@¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"<anonymous>", "", "Key", "", "Value", "Lkotlinx/coroutines/CoroutineScope;", "invoke", "(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;"}, k = 3, mv = {1, 4, 2})
    @DebugMetadata(c = "androidx.paging.RemoteMediatorAccessImpl$launchRefresh$1", f = "RemoteMediatorAccessor.kt", i = {0}, l = {265}, m = "invokeSuspend", n = {"launchAppendPrepend"}, s = {"L$0"})
    public static final class C12711 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        Object L$0;
        int label;

        /* JADX INFO: renamed from: androidx.paging.RemoteMediatorAccessImpl$launchRefresh$1$1, reason: invalid class name and collision with other inner class name */
        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\u0010\u0000\u001a\u00020\u0001\"\b\b\u0000\u0010\u0002*\u00020\u0003\"\b\b\u0001\u0010\u0004*\u00020\u0003H\u008a@¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"<anonymous>", "", "Key", "", "Value", "invoke", "(Ljava/lang/Object;)Ljava/lang/Object;"}, k = 3, mv = {1, 4, 2})
        @DebugMetadata(c = "androidx.paging.RemoteMediatorAccessImpl$launchRefresh$1$1", f = "RemoteMediatorAccessor.kt", i = {}, l = {270}, m = "invokeSuspend", n = {}, s = {})
        public static final class C00591 extends SuspendLambda implements Function1<Continuation<? super Unit>, Object> {
            final /* synthetic */ Ref.BooleanRef $launchAppendPrepend;
            int label;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C00591(Ref.BooleanRef booleanRef, Continuation continuation) {
                super(1, continuation);
                this.$launchAppendPrepend = booleanRef;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            @NotNull
            public final Continuation<Unit> create(@NotNull Continuation<?> completion) {
                Intrinsics.checkNotNullParameter(completion, "completion");
                return C12711.this.new C00591(this.$launchAppendPrepend, completion);
            }

            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Continuation<? super Unit> continuation) {
                return ((C00591) create(continuation)).invokeSuspend(Unit.INSTANCE);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            @Nullable
            public final Object invokeSuspend(@NotNull Object obj) {
                boolean zBooleanValue;
                Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
                int i = this.label;
                if (i == 0) {
                    ResultKt.throwOnFailure(obj);
                    PagingState<Key, Value> pagingState = (PagingState) RemoteMediatorAccessImpl.this.accessorState.use(new Function1<AccessorState<Key, Value>, PagingState<Key, Value>>() { // from class: androidx.paging.RemoteMediatorAccessImpl$launchRefresh$1$1$pendingPagingState$1
                        @Override // kotlin.jvm.functions.Function1
                        @Nullable
                        /* JADX INFO: renamed from: invoke, reason: merged with bridge method [inline-methods] */
                        public final PagingState<Key, Value> invoke2(@NotNull AccessorState<Key, Value> it) {
                            Intrinsics.checkNotNullParameter(it, "it");
                            return it.getPendingRefresh();
                        }
                    });
                    if (pagingState != null) {
                        RemoteMediator remoteMediator = RemoteMediatorAccessImpl.this.remoteMediator;
                        LoadType loadType = LoadType.REFRESH;
                        this.label = 1;
                        obj = remoteMediator.load(loadType, pagingState, this);
                        if (obj == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                    }
                    return Unit.INSTANCE;
                }
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
                final RemoteMediator.MediatorResult mediatorResult = (RemoteMediator.MediatorResult) obj;
                Ref.BooleanRef booleanRef = this.$launchAppendPrepend;
                if (mediatorResult instanceof RemoteMediator.MediatorResult.Success) {
                    zBooleanValue = ((Boolean) RemoteMediatorAccessImpl.this.accessorState.use(new Function1<AccessorState<Key, Value>, Boolean>() { // from class: androidx.paging.RemoteMediatorAccessImpl$launchRefresh$1$1$1$1
                        {
                            super(1);
                        }

                        @Override // kotlin.jvm.functions.Function1
                        /* JADX INFO: renamed from: invoke */
                        public /* bridge */ /* synthetic */ Boolean invoke2(Object obj2) {
                            return Boolean.valueOf(invoke((AccessorState) obj2));
                        }

                        public final boolean invoke(@NotNull AccessorState<Key, Value> it) {
                            Intrinsics.checkNotNullParameter(it, "it");
                            LoadType loadType2 = LoadType.REFRESH;
                            it.clearPendingRequest(loadType2);
                            if (((RemoteMediator.MediatorResult.Success) mediatorResult).getEndOfPaginationReached()) {
                                AccessorState.BlockState blockState = AccessorState.BlockState.COMPLETED;
                                it.setBlockState(loadType2, blockState);
                                it.setBlockState(LoadType.PREPEND, blockState);
                                it.setBlockState(LoadType.APPEND, blockState);
                                it.clearPendingRequests();
                            } else {
                                LoadType loadType3 = LoadType.PREPEND;
                                AccessorState.BlockState blockState2 = AccessorState.BlockState.UNBLOCKED;
                                it.setBlockState(loadType3, blockState2);
                                it.setBlockState(LoadType.APPEND, blockState2);
                            }
                            it.setError(LoadType.PREPEND, null);
                            it.setError(LoadType.APPEND, null);
                            return it.getPendingBoundary() != null;
                        }
                    })).booleanValue();
                } else {
                    if (!(mediatorResult instanceof RemoteMediator.MediatorResult.Error)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    zBooleanValue = ((Boolean) RemoteMediatorAccessImpl.this.accessorState.use(new Function1<AccessorState<Key, Value>, Boolean>() { // from class: androidx.paging.RemoteMediatorAccessImpl$launchRefresh$1$1$1$2
                        {
                            super(1);
                        }

                        @Override // kotlin.jvm.functions.Function1
                        /* JADX INFO: renamed from: invoke */
                        public /* bridge */ /* synthetic */ Boolean invoke2(Object obj2) {
                            return Boolean.valueOf(invoke((AccessorState) obj2));
                        }

                        public final boolean invoke(@NotNull AccessorState<Key, Value> it) {
                            Intrinsics.checkNotNullParameter(it, "it");
                            LoadType loadType2 = LoadType.REFRESH;
                            it.clearPendingRequest(loadType2);
                            it.setError(loadType2, new LoadState.Error(((RemoteMediator.MediatorResult.Error) mediatorResult).getThrowable()));
                            return it.getPendingBoundary() != null;
                        }
                    })).booleanValue();
                }
                booleanRef.element = zBooleanValue;
                return Unit.INSTANCE;
            }
        }

        public C12711(Continuation continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> completion) {
            Intrinsics.checkNotNullParameter(completion, "completion");
            return new C12711(completion);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C12711) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            Ref.BooleanRef booleanRef;
            Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                Ref.BooleanRef booleanRef2 = new Ref.BooleanRef();
                booleanRef2.element = false;
                SingleRunner singleRunner = RemoteMediatorAccessImpl.this.isolationRunner;
                C00591 c00591 = new C00591(booleanRef2, null);
                this.L$0 = booleanRef2;
                this.label = 1;
                if (singleRunner.runInIsolation(2, c00591, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
                booleanRef = booleanRef2;
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                booleanRef = (Ref.BooleanRef) this.L$0;
                ResultKt.throwOnFailure(obj);
            }
            if (booleanRef.element) {
                RemoteMediatorAccessImpl.this.launchBoundary();
            }
            return Unit.INSTANCE;
        }
    }

    public RemoteMediatorAccessImpl(@NotNull CoroutineScope scope, @NotNull RemoteMediator<Key, Value> remoteMediator) {
        Intrinsics.checkNotNullParameter(scope, "scope");
        Intrinsics.checkNotNullParameter(remoteMediator, "remoteMediator");
        this.scope = scope;
        this.remoteMediator = remoteMediator;
        this.accessorState = new AccessorStateHolder<>();
        this.isolationRunner = new SingleRunner(false);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void launchBoundary() {
        BuildersKt__Builders_commonKt.launch$default(this.scope, null, null, new C12701(null), 3, null);
    }

    private final void launchRefresh() {
        BuildersKt__Builders_commonKt.launch$default(this.scope, null, null, new C12711(null), 3, null);
    }

    @Override // androidx.paging.RemoteMediatorAccessor
    @NotNull
    public StateFlow<LoadStates> getState() {
        return this.accessorState.getLoadStates();
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // androidx.paging.RemoteMediatorAccessor
    @Nullable
    public Object initialize(@NotNull Continuation<? super RemoteMediator.InitializeAction> continuation) {
        AnonymousClass1 anonymousClass1;
        RemoteMediatorAccessImpl<Key, Value> remoteMediatorAccessImpl;
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
        Object objInitialize = anonymousClass1.result;
        Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = anonymousClass1.label;
        if (i2 == 0) {
            ResultKt.throwOnFailure(objInitialize);
            RemoteMediator<Key, Value> remoteMediator = this.remoteMediator;
            anonymousClass1.L$0 = this;
            anonymousClass1.label = 1;
            objInitialize = remoteMediator.initialize(anonymousClass1);
            if (objInitialize == coroutine_suspended) {
                return coroutine_suspended;
            }
            remoteMediatorAccessImpl = this;
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            remoteMediatorAccessImpl = (RemoteMediatorAccessImpl) anonymousClass1.L$0;
            ResultKt.throwOnFailure(objInitialize);
        }
        if (((RemoteMediator.InitializeAction) objInitialize) == RemoteMediator.InitializeAction.LAUNCH_INITIAL_REFRESH) {
            remoteMediatorAccessImpl.accessorState.use(new Function1<AccessorState<Key, Value>, Unit>() { // from class: androidx.paging.RemoteMediatorAccessImpl$initialize$2$1
                @Override // kotlin.jvm.functions.Function1
                /* JADX INFO: renamed from: invoke */
                public /* bridge */ /* synthetic */ Unit invoke2(Object obj) {
                    invoke((AccessorState) obj);
                    return Unit.INSTANCE;
                }

                public final void invoke(@NotNull AccessorState<Key, Value> it) {
                    Intrinsics.checkNotNullParameter(it, "it");
                    LoadType loadType = LoadType.APPEND;
                    AccessorState.BlockState blockState = AccessorState.BlockState.REQUIRES_REFRESH;
                    it.setBlockState(loadType, blockState);
                    it.setBlockState(LoadType.PREPEND, blockState);
                }
            });
        }
        return objInitialize;
    }

    @Override // androidx.paging.RemoteMediatorConnection
    public void requestLoad(@NotNull final LoadType loadType, @NotNull final PagingState<Key, Value> pagingState) {
        Intrinsics.checkNotNullParameter(loadType, "loadType");
        Intrinsics.checkNotNullParameter(pagingState, "pagingState");
        if (((Boolean) this.accessorState.use(new Function1<AccessorState<Key, Value>, Boolean>() { // from class: androidx.paging.RemoteMediatorAccessImpl$requestLoad$newRequest$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public /* bridge */ /* synthetic */ Boolean invoke2(Object obj) {
                return Boolean.valueOf(invoke((AccessorState) obj));
            }

            public final boolean invoke(@NotNull AccessorState<Key, Value> it) {
                Intrinsics.checkNotNullParameter(it, "it");
                return it.add(loadType, pagingState);
            }
        })).booleanValue()) {
            if (WhenMappings.$EnumSwitchMapping$0[loadType.ordinal()] != 1) {
                launchBoundary();
            } else {
                launchRefresh();
            }
        }
    }

    @Override // androidx.paging.RemoteMediatorConnection
    public void retryFailed(@NotNull PagingState<Key, Value> pagingState) {
        Intrinsics.checkNotNullParameter(pagingState, "pagingState");
        final ArrayList arrayList = new ArrayList();
        this.accessorState.use(new Function1<AccessorState<Key, Value>, Unit>() { // from class: androidx.paging.RemoteMediatorAccessImpl.retryFailed.1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public /* bridge */ /* synthetic */ Unit invoke2(Object obj) {
                invoke((AccessorState) obj);
                return Unit.INSTANCE;
            }

            public final void invoke(@NotNull AccessorState<Key, Value> accessorState) {
                Intrinsics.checkNotNullParameter(accessorState, "accessorState");
                LoadStates loadStatesComputeLoadStates = accessorState.computeLoadStates();
                boolean z = loadStatesComputeLoadStates.getRefresh() instanceof LoadState.Error;
                accessorState.clearErrors();
                if (z) {
                    List list = arrayList;
                    LoadType loadType = LoadType.REFRESH;
                    list.add(loadType);
                    accessorState.setBlockState(loadType, AccessorState.BlockState.UNBLOCKED);
                }
                if (loadStatesComputeLoadStates.getAppend() instanceof LoadState.Error) {
                    if (!z) {
                        arrayList.add(LoadType.APPEND);
                    }
                    accessorState.clearPendingRequest(LoadType.APPEND);
                }
                if (loadStatesComputeLoadStates.getPrepend() instanceof LoadState.Error) {
                    if (!z) {
                        arrayList.add(LoadType.PREPEND);
                    }
                    accessorState.clearPendingRequest(LoadType.PREPEND);
                }
            }
        });
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            requestLoad((LoadType) it.next(), pagingState);
        }
    }
}
