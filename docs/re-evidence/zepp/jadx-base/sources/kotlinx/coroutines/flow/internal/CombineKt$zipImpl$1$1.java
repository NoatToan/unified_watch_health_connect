package kotlinx.coroutines.flow.internal;

import java.util.concurrent.CancellationException;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Lambda;
import kotlinx.coroutines.CompletableJob;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.JobKt__JobKt;
import kotlinx.coroutines.channels.ChannelResult;
import kotlinx.coroutines.channels.ProduceKt;
import kotlinx.coroutines.channels.ReceiveChannel;
import kotlinx.coroutines.channels.SendChannel;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.internal.ThreadContextKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes23.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\u0010\u0005\u001a\u00020\u0004\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u0001\"\u0004\b\u0002\u0010\u0002*\u00020\u0003H\u008a@"}, d2 = {"T1", "T2", "R", "Lkotlinx/coroutines/CoroutineScope;", "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
@DebugMetadata(c = "kotlinx.coroutines.flow.internal.CombineKt$zipImpl$1$1", f = "Combine.kt", i = {0}, l = {129}, m = "invokeSuspend", n = {"second"}, s = {"L$0"})
public final class CombineKt$zipImpl$1$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    public int a;
    private /* synthetic */ Object b;
    public final /* synthetic */ FlowCollector<R> c;
    public final /* synthetic */ Flow<T2> d;
    public final /* synthetic */ Flow<T1> e;
    public final /* synthetic */ Function3<T1, T2, Continuation<? super R>, Object> f;

    /* JADX INFO: renamed from: kotlinx.coroutines.flow.internal.CombineKt$zipImpl$1$1$2, reason: invalid class name */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u0003\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u0001\"\u0004\b\u0002\u0010\u00022\u0006\u0010\u0004\u001a\u00020\u0003H\u008a@"}, d2 = {"T1", "T2", "R", "", "it", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    @DebugMetadata(c = "kotlinx.coroutines.flow.internal.CombineKt$zipImpl$1$1$2", f = "Combine.kt", i = {}, l = {147}, m = "invokeSuspend", n = {}, s = {})
    public static final class AnonymousClass2 extends SuspendLambda implements Function2<Unit, Continuation<? super Unit>, Object> {
        public int a;
        public final /* synthetic */ Flow<T1> b;
        public final /* synthetic */ CoroutineContext c;
        public final /* synthetic */ Object d;
        public final /* synthetic */ ReceiveChannel<Object> e;
        public final /* synthetic */ FlowCollector<R> f;
        public final /* synthetic */ Function3<T1, T2, Continuation<? super R>, Object> g;

        /* JADX INFO: renamed from: kotlinx.coroutines.flow.internal.CombineKt$zipImpl$1$1$2$a */
        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u0003\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u0001\"\u0004\b\u0002\u0010\u00022\u0006\u0010\u0004\u001a\u00020\u0003H\u008a@"}, d2 = {"T1", "T2", "R", "", "it", "<anonymous>"}, k = 3, mv = {1, 5, 1})
        @DebugMetadata(c = "kotlinx.coroutines.flow.internal.CombineKt$zipImpl$1$1$2$1$1", f = "Combine.kt", i = {}, l = {132, 135, 135}, m = "invokeSuspend", n = {}, s = {})
        public static final class a extends SuspendLambda implements Function2<Unit, Continuation<? super Unit>, Object> {
            public Object a;
            public int b;
            public final /* synthetic */ ReceiveChannel<Object> c;
            public final /* synthetic */ FlowCollector<R> d;
            public final /* synthetic */ Function3<T1, T2, Continuation<? super R>, Object> e;
            public final /* synthetic */ T1 f;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            public a(ReceiveChannel<? extends Object> receiveChannel, FlowCollector<? super R> flowCollector, Function3<? super T1, ? super T2, ? super Continuation<? super R>, ? extends Object> function3, T1 t1, Continuation<? super a> continuation) {
                super(2, continuation);
                this.c = receiveChannel;
                this.d = flowCollector;
                this.e = function3;
                this.f = t1;
            }

            @Override // kotlin.jvm.functions.Function2
            @Nullable
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final Object invoke(@NotNull Unit unit, @Nullable Continuation<? super Unit> continuation) {
                return ((a) create(unit, continuation)).invokeSuspend(Unit.INSTANCE);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            @NotNull
            public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
                return new a(this.c, this.d, this.e, this.f, continuation);
            }

            /* JADX WARN: Code duplicated, block: B:29:0x006e A[RETURN] */
            /* JADX WARN: Type inference fix 'apply assigned field type' failed
            java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
            	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
            	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
            	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
            	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
            	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
            	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
            	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
             */
            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            @Nullable
            public final Object invokeSuspend(@NotNull Object obj) throws Throwable {
                Object objMo4433receiveCatchingJP2dKIU;
                FlowCollector flowCollector;
                Object coroutine_suspended = kotlin.coroutines.intrinsics.a.getCOROUTINE_SUSPENDED();
                int i = this.b;
                if (i != 0) {
                    if (i == 1) {
                        ResultKt.throwOnFailure(obj);
                        objMo4433receiveCatchingJP2dKIU = ((ChannelResult) obj).getHolder();
                    } else if (i == 2) {
                        flowCollector = (FlowCollector) this.a;
                        ResultKt.throwOnFailure(obj);
                        this.a = null;
                        this.b = 3;
                        if (flowCollector.emit(obj, this) == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                    } else {
                        if (i != 3) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        ResultKt.throwOnFailure(obj);
                    }
                    return Unit.INSTANCE;
                }
                ResultKt.throwOnFailure(obj);
                ReceiveChannel<Object> receiveChannel = this.c;
                this.b = 1;
                objMo4433receiveCatchingJP2dKIU = receiveChannel.mo4433receiveCatchingJP2dKIU(this);
                if (objMo4433receiveCatchingJP2dKIU == coroutine_suspended) {
                    return coroutine_suspended;
                }
                flowCollector = this.d;
                if (objMo4433receiveCatchingJP2dKIU instanceof ChannelResult.Failed) {
                    Throwable thM4444exceptionOrNullimpl = ChannelResult.m4444exceptionOrNullimpl(objMo4433receiveCatchingJP2dKIU);
                    if (thM4444exceptionOrNullimpl == null) {
                        throw new AbortFlowException(flowCollector);
                    }
                    throw thM4444exceptionOrNullimpl;
                }
                Function3<T1, T2, Continuation<? super R>, Object> function3 = this.e;
                T1 t1 = this.f;
                if (objMo4433receiveCatchingJP2dKIU == NullSurrogateKt.NULL) {
                    objMo4433receiveCatchingJP2dKIU = null;
                }
                this.a = flowCollector;
                this.b = 2;
                obj = function3.invoke(t1, objMo4433receiveCatchingJP2dKIU, this);
                if (obj == coroutine_suspended) {
                    return coroutine_suspended;
                }
                this.a = null;
                this.b = 3;
                if (flowCollector.emit(obj, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
                return Unit.INSTANCE;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public AnonymousClass2(Flow<? extends T1> flow, CoroutineContext coroutineContext, Object obj, ReceiveChannel<? extends Object> receiveChannel, FlowCollector<? super R> flowCollector, Function3<? super T1, ? super T2, ? super Continuation<? super R>, ? extends Object> function3, Continuation<? super AnonymousClass2> continuation) {
            super(2, continuation);
            this.b = flow;
            this.c = coroutineContext;
            this.d = obj;
            this.e = receiveChannel;
            this.f = flowCollector;
            this.g = function3;
        }

        @Override // kotlin.jvm.functions.Function2
        @Nullable
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(@NotNull Unit unit, @Nullable Continuation<? super Unit> continuation) {
            return ((AnonymousClass2) create(unit, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            return new AnonymousClass2(this.b, this.c, this.d, this.e, this.f, this.g, continuation);
        }

        /* JADX WARN: Type inference fix 'apply assigned field type' failed
        java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
        	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
        	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
        	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
         */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            Object coroutine_suspended = kotlin.coroutines.intrinsics.a.getCOROUTINE_SUSPENDED();
            int i = this.a;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                Flow<T1> flow = this.b;
                final CoroutineContext coroutineContext = this.c;
                final Object obj2 = this.d;
                final ReceiveChannel<Object> receiveChannel = this.e;
                final FlowCollector<R> flowCollector = this.f;
                final Function3<T1, T2, Continuation<? super R>, Object> function3 = this.g;
                Object obj3 = new FlowCollector<T1>() { // from class: kotlinx.coroutines.flow.internal.CombineKt$zipImpl$1$1$2$invokeSuspend$$inlined$collect$1
                    @Override // kotlinx.coroutines.flow.FlowCollector
                    @Nullable
                    public Object emit(T1 t1, @NotNull Continuation<? super Unit> continuation) {
                        CoroutineContext coroutineContext2 = coroutineContext;
                        Unit unit = Unit.INSTANCE;
                        Object objWithContextUndispatched = ChannelFlowKt.withContextUndispatched(coroutineContext2, unit, obj2, new CombineKt$zipImpl$1$1.AnonymousClass2.a(receiveChannel, flowCollector, function3, t1, null), continuation);
                        return objWithContextUndispatched == kotlin.coroutines.intrinsics.a.getCOROUTINE_SUSPENDED() ? objWithContextUndispatched : unit;
                    }
                };
                this.a = 1;
                if (flow.collect(obj3, this) == coroutine_suspended) {
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

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0002\b\u0003\n\u0002\u0010\u0003\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0006\u001a\u00020\u0005\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u0001\"\u0004\b\u0002\u0010\u00022\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003H\n"}, d2 = {"T1", "T2", "R", "", "it", "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class a extends Lambda implements Function1<Throwable, Unit> {
        public final /* synthetic */ CompletableJob a;
        public final /* synthetic */ FlowCollector<R> b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public a(CompletableJob completableJob, FlowCollector<? super R> flowCollector) {
            super(1);
            this.a = completableJob;
            this.b = flowCollector;
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(Throwable th) {
            invoke2(th);
            return Unit.INSTANCE;
        }

        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2(@Nullable Throwable th) {
            if (this.a.isActive()) {
                this.a.cancel((CancellationException) new AbortFlowException(this.b));
            }
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public CombineKt$zipImpl$1$1(FlowCollector<? super R> flowCollector, Flow<? extends T2> flow, Flow<? extends T1> flow2, Function3<? super T1, ? super T2, ? super Continuation<? super R>, ? extends Object> function3, Continuation<? super CombineKt$zipImpl$1$1> continuation) {
        super(2, continuation);
        this.c = flowCollector;
        this.d = flow;
        this.e = flow2;
        this.f = function3;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @NotNull
    public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
        CombineKt$zipImpl$1$1 combineKt$zipImpl$1$1 = new CombineKt$zipImpl$1$1(this.c, this.d, this.e, this.f, continuation);
        combineKt$zipImpl$1$1.b = obj;
        return combineKt$zipImpl$1$1;
    }

    @Override // kotlin.jvm.functions.Function2
    @Nullable
    public final Object invoke(@NotNull CoroutineScope coroutineScope, @Nullable Continuation<? super Unit> continuation) {
        return ((CombineKt$zipImpl$1$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v0, types: [int] */
    /* JADX WARN: Type inference failed for: r1v1 */
    /* JADX WARN: Type inference failed for: r1v10 */
    /* JADX WARN: Type inference failed for: r1v12, types: [kotlinx.coroutines.channels.ReceiveChannel] */
    /* JADX WARN: Type inference failed for: r1v13 */
    /* JADX WARN: Type inference failed for: r1v17 */
    /* JADX WARN: Type inference failed for: r1v18 */
    /* JADX WARN: Type inference failed for: r1v2, types: [kotlinx.coroutines.channels.ReceiveChannel] */
    /* JADX WARN: Type inference failed for: r1v5 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) throws Throwable {
        ReceiveChannel receiveChannel;
        ReceiveChannel receiveChannel2;
        Object coroutine_suspended = kotlin.coroutines.intrinsics.a.getCOROUTINE_SUSPENDED();
        ?? r1 = this.a;
        try {
            if (r1 != 0) {
                if (r1 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                receiveChannel2 = (ReceiveChannel) this.b;
                try {
                    ResultKt.throwOnFailure(obj);
                    r1 = receiveChannel2;
                } catch (AbortFlowException e) {
                    e = e;
                    FlowExceptions_commonKt.checkOwnership(e, this.c);
                    r1 = receiveChannel2;
                }
                ReceiveChannel.DefaultImpls.cancel$default((ReceiveChannel) r1, (CancellationException) null, 1, (Object) null);
                return Unit.INSTANCE;
            }
            ResultKt.throwOnFailure(obj);
            CoroutineScope coroutineScope = (CoroutineScope) this.b;
            ReceiveChannel receiveChannelProduce$default = ProduceKt.produce$default(coroutineScope, null, 0, new CombineKt$zipImpl$1$1$second$1(this.d, null), 3, null);
            CompletableJob completableJobD = JobKt__JobKt.d(null, 1, null);
            ((SendChannel) receiveChannelProduce$default).invokeOnClose(new a(completableJobD, this.c));
            try {
                CoroutineContext coroutineContext = coroutineScope.getCoroutineContext();
                Object objThreadContextElements = ThreadContextKt.threadContextElements(coroutineContext);
                CoroutineContext coroutineContextPlus = coroutineScope.getCoroutineContext().plus(completableJobD);
                Unit unit = Unit.INSTANCE;
                AnonymousClass2 anonymousClass2 = new AnonymousClass2(this.e, coroutineContext, objThreadContextElements, receiveChannelProduce$default, this.c, this.f, null);
                this.b = receiveChannelProduce$default;
                this.a = 1;
                receiveChannel = receiveChannelProduce$default;
                try {
                    if (ChannelFlowKt.withContextUndispatched$default(coroutineContextPlus, unit, null, anonymousClass2, this, 4, null) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                    r1 = receiveChannel;
                    ReceiveChannel.DefaultImpls.cancel$default((ReceiveChannel) r1, (CancellationException) null, 1, (Object) null);
                    return Unit.INSTANCE;
                } catch (AbortFlowException e2) {
                    e = e2;
                    receiveChannel2 = receiveChannel;
                    FlowExceptions_commonKt.checkOwnership(e, this.c);
                    r1 = receiveChannel2;
                } catch (Throwable th) {
                    th = th;
                    r1 = receiveChannel;
                    ReceiveChannel.DefaultImpls.cancel$default((ReceiveChannel) r1, (CancellationException) null, 1, (Object) null);
                    throw th;
                }
            } catch (AbortFlowException e3) {
                e = e3;
                receiveChannel = receiveChannelProduce$default;
            } catch (Throwable th2) {
                th = th2;
                receiveChannel = receiveChannelProduce$default;
            }
            FlowExceptions_commonKt.checkOwnership(e, this.c);
            r1 = receiveChannel2;
            ReceiveChannel.DefaultImpls.cancel$default((ReceiveChannel) r1, (CancellationException) null, 1, (Object) null);
            return Unit.INSTANCE;
        } catch (Throwable th3) {
            th = th3;
        }
    }
}
