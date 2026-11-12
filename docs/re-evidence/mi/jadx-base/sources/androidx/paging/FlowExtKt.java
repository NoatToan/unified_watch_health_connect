package androidx.paging;

import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.InlineMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.FlowKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000:\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\u001ah\u0010\u0002\u001a\b\u0012\u0004\u0012\u0002H\u00040\u0003\"\u0004\b\u0000\u0010\u0005\"\u0004\b\u0001\u0010\u0004*\b\u0012\u0004\u0012\u0002H\u00050\u000329\b\u0004\u0010\u0006\u001a3\b\u0001\u0012\u0013\u0012\u0011H\u0005¢\u0006\f\b\b\u0012\b\b\t\u0012\u0004\b\b(\n\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u0002H\u00040\u00030\u000b\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u0007H\u0080\bø\u0001\u0000¢\u0006\u0002\u0010\f\u001ab\u0010\r\u001a\b\u0012\u0004\u0012\u0002H\u00040\u0003\"\u0004\b\u0000\u0010\u0005\"\u0004\b\u0001\u0010\u0004*\b\u0012\u0004\u0012\u0002H\u00050\u000323\b\u0004\u0010\u0006\u001a-\b\u0001\u0012\u0013\u0012\u0011H\u0005¢\u0006\f\b\b\u0012\b\b\t\u0012\u0004\b\b(\n\u0012\n\u0012\b\u0012\u0004\u0012\u0002H\u00040\u000b\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u0007H\u0080\bø\u0001\u0000¢\u0006\u0002\u0010\f\u001an\u0010\u000e\u001a\b\u0012\u0004\u0012\u0002H\u00050\u0003\"\u0004\b\u0000\u0010\u0005*\b\u0012\u0004\u0012\u0002H\u00050\u00032F\u0010\u000f\u001aB\b\u0001\u0012\u0013\u0012\u0011H\u0005¢\u0006\f\b\b\u0012\b\b\t\u0012\u0004\b\b(\u0011\u0012\u0013\u0012\u0011H\u0005¢\u0006\f\b\b\u0012\b\b\t\u0012\u0004\b\b(\n\u0012\n\u0012\b\u0012\u0004\u0012\u0002H\u00050\u000b\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u0010H\u0000ø\u0001\u0000¢\u0006\u0002\u0010\u0012\u001a|\u0010\u0013\u001a\b\u0012\u0004\u0012\u0002H\u00040\u0003\"\u0004\b\u0000\u0010\u0005\"\u0004\b\u0001\u0010\u0004*\b\u0012\u0004\u0012\u0002H\u00050\u00032\u0006\u0010\u0014\u001a\u0002H\u00042F\u0010\u000f\u001aB\b\u0001\u0012\u0013\u0012\u0011H\u0004¢\u0006\f\b\b\u0012\b\b\t\u0012\u0004\b\b(\u0011\u0012\u0013\u0012\u0011H\u0005¢\u0006\f\b\b\u0012\b\b\t\u0012\u0004\b\b(\n\u0012\n\u0012\b\u0012\u0004\u0012\u0002H\u00040\u000b\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u0010H\u0000ø\u0001\u0000¢\u0006\u0002\u0010\u0015\u001ap\u0010\u0016\u001a\b\u0012\u0004\u0012\u0002H\u00040\u0003\"\u0004\b\u0000\u0010\u0005\"\u0004\b\u0001\u0010\u0004*\b\u0012\u0004\u0012\u0002H\u00050\u00032B\u0010\u0006\u001a>\b\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u0002H\u00040\u0017\u0012\u0013\u0012\u0011H\u0005¢\u0006\f\b\b\u0012\b\b\t\u0012\u0004\b\b(\n\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00180\u000b\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u0010¢\u0006\u0002\b\u0019H\u0000ø\u0001\u0000¢\u0006\u0002\u0010\u0012\"\u000e\u0010\u0000\u001a\u00020\u0001X\u0082\u0004¢\u0006\u0002\n\u0000\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u001a"}, d2 = {"NULL", "", "simpleFlatMapLatest", "Lkotlinx/coroutines/flow/Flow;", "R", "T", "transform", "Lkotlin/Function2;", "Lkotlin/ParameterName;", "name", "value", "Lkotlin/coroutines/Continuation;", "(Lkotlinx/coroutines/flow/Flow;Lkotlin/jvm/functions/Function2;)Lkotlinx/coroutines/flow/Flow;", "simpleMapLatest", "simpleRunningReduce", "operation", "Lkotlin/Function3;", "accumulator", "(Lkotlinx/coroutines/flow/Flow;Lkotlin/jvm/functions/Function3;)Lkotlinx/coroutines/flow/Flow;", "simpleScan", "initial", "(Lkotlinx/coroutines/flow/Flow;Ljava/lang/Object;Lkotlin/jvm/functions/Function3;)Lkotlinx/coroutines/flow/Flow;", "simpleTransformLatest", "Lkotlinx/coroutines/flow/FlowCollector;", "", "Lkotlin/ExtensionFunctionType;", "paging-common"}, k = 2, mv = {1, 4, 2})
public final class FlowExtKt {
    private static final Object NULL = new Object();

    /* JADX INFO: Add missing generic type declarations: [R, T] */
    /* JADX INFO: renamed from: androidx.paging.FlowExtKt$simpleFlatMapLatest$1, reason: invalid class name */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0012\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0000\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u0002\"\u0004\b\u0001\u0010\u0003*\b\u0012\u0004\u0012\u0002H\u00030\u00042\u0006\u0010\u0005\u001a\u0002H\u0002H\u008a@¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"<anonymous>", "", "T", "R", "Lkotlinx/coroutines/flow/FlowCollector;", "it", "invoke", "(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;"}, k = 3, mv = {1, 4, 2})
    @DebugMetadata(c = "androidx.paging.FlowExtKt$simpleFlatMapLatest$1", f = "FlowExt.kt", i = {0}, l = {86, 102}, m = "invokeSuspend", n = {"$this$emitAll$iv"}, s = {"L$0"})
    public static final class AnonymousClass1<R, T> extends SuspendLambda implements Function3<FlowCollector<? super R>, T, Continuation<? super Unit>, Object> {
        final /* synthetic */ Function2 $transform;
        private /* synthetic */ Object L$0;
        private /* synthetic */ Object L$1;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(Function2 function2, Continuation continuation) {
            super(3, continuation);
            this.$transform = function2;
        }

        @NotNull
        public final Continuation<Unit> create(@NotNull FlowCollector<? super R> create, T t, @NotNull Continuation<? super Unit> continuation) {
            Intrinsics.checkNotNullParameter(create, "$this$create");
            Intrinsics.checkNotNullParameter(continuation, "continuation");
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.$transform, continuation);
            anonymousClass1.L$0 = create;
            anonymousClass1.L$1 = t;
            return anonymousClass1;
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // kotlin.jvm.functions.Function3
        public final Object invoke(Object obj, Object obj2, Continuation<? super Unit> continuation) {
            return ((AnonymousClass1) create((FlowCollector) obj, obj2, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            FlowCollector<? super T> flowCollector;
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
            Object obj2 = this.L$1;
            Function2 function2 = this.$transform;
            this.L$0 = flowCollector;
            this.label = 1;
            obj = function2.invoke(obj2, this);
            if (obj == coroutine_suspended) {
                return coroutine_suspended;
            }
            this.L$0 = null;
            this.label = 2;
            if (((Flow) obj).collect(flowCollector, this) == coroutine_suspended) {
                return coroutine_suspended;
            }
            return Unit.INSTANCE;
        }

        @Nullable
        public final Object invokeSuspend$$forInline(@NotNull Object obj) {
            FlowCollector<? super T> flowCollector = (FlowCollector) this.L$0;
            Flow flow = (Flow) this.$transform.invoke(this.L$1, this);
            InlineMarker.mark(0);
            flow.collect(flowCollector, this);
            InlineMarker.mark(2);
            InlineMarker.mark(1);
            return Unit.INSTANCE;
        }
    }

    /* JADX INFO: Add missing generic type declarations: [R, T] */
    /* JADX INFO: renamed from: androidx.paging.FlowExtKt$simpleMapLatest$1, reason: invalid class name and case insensitive filesystem */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0012\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0000\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u0002\"\u0004\b\u0001\u0010\u0003*\b\u0012\u0004\u0012\u0002H\u00030\u00042\u0006\u0010\u0005\u001a\u0002H\u0002H\u008a@¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"<anonymous>", "", "T", "R", "Lkotlinx/coroutines/flow/FlowCollector;", "it", "invoke", "(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;"}, k = 3, mv = {1, 4, 2})
    @DebugMetadata(c = "androidx.paging.FlowExtKt$simpleMapLatest$1", f = "FlowExt.kt", i = {}, l = {93, 93}, m = "invokeSuspend", n = {}, s = {})
    public static final class C12421<R, T> extends SuspendLambda implements Function3<FlowCollector<? super R>, T, Continuation<? super Unit>, Object> {
        final /* synthetic */ Function2 $transform;
        private /* synthetic */ Object L$0;
        private /* synthetic */ Object L$1;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C12421(Function2 function2, Continuation continuation) {
            super(3, continuation);
            this.$transform = function2;
        }

        @NotNull
        public final Continuation<Unit> create(@NotNull FlowCollector<? super R> create, T t, @NotNull Continuation<? super Unit> continuation) {
            Intrinsics.checkNotNullParameter(create, "$this$create");
            Intrinsics.checkNotNullParameter(continuation, "continuation");
            C12421 c12421 = new C12421(this.$transform, continuation);
            c12421.L$0 = create;
            c12421.L$1 = t;
            return c12421;
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // kotlin.jvm.functions.Function3
        public final Object invoke(Object obj, Object obj2, Continuation<? super Unit> continuation) {
            return ((C12421) create((FlowCollector) obj, obj2, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            FlowCollector flowCollector;
            FlowCollector flowCollector2;
            Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i != 0) {
                if (i == 1) {
                    FlowCollector flowCollector3 = (FlowCollector) this.L$0;
                    ResultKt.throwOnFailure(obj);
                    flowCollector2 = flowCollector3;
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
            Object obj2 = this.L$1;
            Function2 function2 = this.$transform;
            this.L$0 = flowCollector;
            this.label = 1;
            obj = function2.invoke(obj2, this);
            if (obj == coroutine_suspended) {
                flowCollector2 = flowCollector;
                return coroutine_suspended;
            }
            flowCollector2 = flowCollector;
            this.L$0 = null;
            this.label = 2;
            if (flowCollector2.emit(obj, this) == coroutine_suspended) {
                return coroutine_suspended;
            }
            return Unit.INSTANCE;
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Nullable
        public final Object invokeSuspend$$forInline(@NotNull Object obj) {
            FlowCollector flowCollector = (FlowCollector) this.L$0;
            Object objInvoke = this.$transform.invoke(this.L$1, this);
            InlineMarker.mark(0);
            flowCollector.emit(objInvoke, this);
            InlineMarker.mark(2);
            InlineMarker.mark(1);
            return Unit.INSTANCE;
        }
    }

    /* JADX INFO: Add missing generic type declarations: [T] */
    /* JADX INFO: renamed from: androidx.paging.FlowExtKt$simpleRunningReduce$1, reason: invalid class name and case insensitive filesystem */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u0002*\b\u0012\u0004\u0012\u0002H\u00020\u0003H\u008a@¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"<anonymous>", "", "T", "Lkotlinx/coroutines/flow/FlowCollector;", "invoke", "(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;"}, k = 3, mv = {1, 4, 2})
    @DebugMetadata(c = "androidx.paging.FlowExtKt$simpleRunningReduce$1", f = "FlowExt.kt", i = {}, l = {102}, m = "invokeSuspend", n = {}, s = {})
    public static final class C12431<T> extends SuspendLambda implements Function2<FlowCollector<? super T>, Continuation<? super Unit>, Object> {
        final /* synthetic */ Function3 $operation;
        final /* synthetic */ Flow $this_simpleRunningReduce;
        private /* synthetic */ Object L$0;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C12431(Flow flow, Function3 function3, Continuation continuation) {
            super(2, continuation);
            this.$this_simpleRunningReduce = flow;
            this.$operation = function3;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> completion) {
            Intrinsics.checkNotNullParameter(completion, "completion");
            C12431 c12431 = new C12431(this.$this_simpleRunningReduce, this.$operation, completion);
            c12431.L$0 = obj;
            return c12431;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(Object obj, Continuation<? super Unit> continuation) {
            return ((C12431) create(obj, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                FlowCollector flowCollector = (FlowCollector) this.L$0;
                Ref.ObjectRef objectRef = new Ref.ObjectRef();
                objectRef.element = (T) FlowExtKt.NULL;
                Flow flow = this.$this_simpleRunningReduce;
                FlowExtKt$simpleRunningReduce$1$invokeSuspend$$inlined$collect$1 flowExtKt$simpleRunningReduce$1$invokeSuspend$$inlined$collect$1 = new FlowExtKt$simpleRunningReduce$1$invokeSuspend$$inlined$collect$1(this, flowCollector, objectRef);
                this.label = 1;
                if (flow.collect(flowExtKt$simpleRunningReduce$1$invokeSuspend$$inlined$collect$1, this) == coroutine_suspended) {
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

    /* JADX INFO: Add missing generic type declarations: [R] */
    /* JADX INFO: renamed from: androidx.paging.FlowExtKt$simpleScan$1, reason: invalid class name and case insensitive filesystem */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0012\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u0002\"\u0004\b\u0001\u0010\u0003*\b\u0012\u0004\u0012\u0002H\u00030\u0004H\u008a@¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"<anonymous>", "", "T", "R", "Lkotlinx/coroutines/flow/FlowCollector;", "invoke", "(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;"}, k = 3, mv = {1, 4, 2})
    @DebugMetadata(c = "androidx.paging.FlowExtKt$simpleScan$1", f = "FlowExt.kt", i = {0, 0}, l = {42, 102}, m = "invokeSuspend", n = {"$this$flow", "accumulator"}, s = {"L$0", "L$1"})
    public static final class C12441<R> extends SuspendLambda implements Function2<FlowCollector<? super R>, Continuation<? super Unit>, Object> {
        final /* synthetic */ Object $initial;
        final /* synthetic */ Function3 $operation;
        final /* synthetic */ Flow $this_simpleScan;
        private /* synthetic */ Object L$0;
        Object L$1;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C12441(Flow flow, Object obj, Function3 function3, Continuation continuation) {
            super(2, continuation);
            this.$this_simpleScan = flow;
            this.$initial = obj;
            this.$operation = function3;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> completion) {
            Intrinsics.checkNotNullParameter(completion, "completion");
            C12441 c12441 = new C12441(this.$this_simpleScan, this.$initial, this.$operation, completion);
            c12441.L$0 = obj;
            return c12441;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(Object obj, Continuation<? super Unit> continuation) {
            return ((C12441) create(obj, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        /* JADX WARN: Type inference failed for: r4v0, types: [T, java.lang.Object] */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            Ref.ObjectRef objectRef;
            FlowCollector flowCollector;
            Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i != 0) {
                if (i == 1) {
                    objectRef = (Ref.ObjectRef) this.L$1;
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
            FlowCollector flowCollector2 = (FlowCollector) this.L$0;
            objectRef = new Ref.ObjectRef();
            ?? r4 = this.$initial;
            objectRef.element = r4;
            this.L$0 = flowCollector2;
            this.L$1 = objectRef;
            this.label = 1;
            if (flowCollector2.emit(r4, this) == coroutine_suspended) {
                return coroutine_suspended;
            }
            flowCollector = flowCollector2;
            Flow flow = this.$this_simpleScan;
            FlowExtKt$simpleScan$1$invokeSuspend$$inlined$collect$1 flowExtKt$simpleScan$1$invokeSuspend$$inlined$collect$1 = new FlowExtKt$simpleScan$1$invokeSuspend$$inlined$collect$1(this, flowCollector, objectRef);
            this.L$0 = null;
            this.L$1 = null;
            this.label = 2;
            if (flow.collect(flowExtKt$simpleScan$1$invokeSuspend$$inlined$collect$1, this) == coroutine_suspended) {
                return coroutine_suspended;
            }
            return Unit.INSTANCE;
        }
    }

    /* JADX INFO: Add missing generic type declarations: [R] */
    /* JADX INFO: renamed from: androidx.paging.FlowExtKt$simpleTransformLatest$1, reason: invalid class name and case insensitive filesystem */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0012\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u0002\"\u0004\b\u0001\u0010\u0003*\b\u0012\u0004\u0012\u0002H\u00030\u0004H\u008a@¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"<anonymous>", "", "T", "R", "Landroidx/paging/SimpleProducerScope;", "invoke", "(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;"}, k = 3, mv = {1, 4, 2})
    @DebugMetadata(c = "androidx.paging.FlowExtKt$simpleTransformLatest$1", f = "FlowExt.kt", i = {}, l = {76}, m = "invokeSuspend", n = {}, s = {})
    public static final class C12451<R> extends SuspendLambda implements Function2<SimpleProducerScope<R>, Continuation<? super Unit>, Object> {
        final /* synthetic */ Flow $this_simpleTransformLatest;
        final /* synthetic */ Function3 $transform;
        private /* synthetic */ Object L$0;
        int label;

        /* JADX INFO: Add missing generic type declarations: [T] */
        /* JADX INFO: renamed from: androidx.paging.FlowExtKt$simpleTransformLatest$1$1, reason: invalid class name and collision with other inner class name */
        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0005\u0010\u0000\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u0002\"\u0004\b\u0001\u0010\u00032\u0006\u0010\u0004\u001a\u0002H\u0002H\u008a@¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"<anonymous>", "", "T", "R", "value", "invoke", "(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;"}, k = 3, mv = {1, 4, 2})
        @DebugMetadata(c = "androidx.paging.FlowExtKt$simpleTransformLatest$1$1", f = "FlowExt.kt", i = {}, l = {77}, m = "invokeSuspend", n = {}, s = {})
        public static final class C00511<T> extends SuspendLambda implements Function2<T, Continuation<? super Unit>, Object> {
            final /* synthetic */ ChannelFlowCollector $collector;
            private /* synthetic */ Object L$0;
            int label;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C00511(ChannelFlowCollector channelFlowCollector, Continuation continuation) {
                super(2, continuation);
                this.$collector = channelFlowCollector;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            @NotNull
            public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> completion) {
                Intrinsics.checkNotNullParameter(completion, "completion");
                C00511 c00511 = new C00511(this.$collector, completion);
                c00511.L$0 = obj;
                return c00511;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj, Continuation<? super Unit> continuation) {
                return ((C00511) create(obj, continuation)).invokeSuspend(Unit.INSTANCE);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            @Nullable
            public final Object invokeSuspend(@NotNull Object obj) {
                Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
                int i = this.label;
                if (i == 0) {
                    ResultKt.throwOnFailure(obj);
                    Object obj2 = this.L$0;
                    Function3 function3 = C12451.this.$transform;
                    ChannelFlowCollector channelFlowCollector = this.$collector;
                    this.label = 1;
                    if (function3.invoke(channelFlowCollector, obj2, this) == coroutine_suspended) {
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
        public C12451(Flow flow, Function3 function3, Continuation continuation) {
            super(2, continuation);
            this.$this_simpleTransformLatest = flow;
            this.$transform = function3;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> completion) {
            Intrinsics.checkNotNullParameter(completion, "completion");
            C12451 c12451 = new C12451(this.$this_simpleTransformLatest, this.$transform, completion);
            c12451.L$0 = obj;
            return c12451;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(Object obj, Continuation<? super Unit> continuation) {
            return ((C12451) create(obj, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                SimpleProducerScope simpleProducerScope = (SimpleProducerScope) this.L$0;
                Flow flow = this.$this_simpleTransformLatest;
                C00511 c00511 = new C00511(new ChannelFlowCollector(simpleProducerScope), null);
                this.label = 1;
                if (FlowKt.collectLatest(flow, c00511, this) == coroutine_suspended) {
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

    @NotNull
    public static final <T, R> Flow<R> simpleFlatMapLatest(@NotNull Flow<? extends T> simpleFlatMapLatest, @NotNull Function2<? super T, ? super Continuation<? super Flow<? extends R>>, ? extends Object> transform) {
        Intrinsics.checkNotNullParameter(simpleFlatMapLatest, "$this$simpleFlatMapLatest");
        Intrinsics.checkNotNullParameter(transform, "transform");
        return simpleTransformLatest(simpleFlatMapLatest, new AnonymousClass1(transform, null));
    }

    @NotNull
    public static final <T, R> Flow<R> simpleMapLatest(@NotNull Flow<? extends T> simpleMapLatest, @NotNull Function2<? super T, ? super Continuation<? super R>, ? extends Object> transform) {
        Intrinsics.checkNotNullParameter(simpleMapLatest, "$this$simpleMapLatest");
        Intrinsics.checkNotNullParameter(transform, "transform");
        return simpleTransformLatest(simpleMapLatest, new C12421(transform, null));
    }

    @NotNull
    public static final <T> Flow<T> simpleRunningReduce(@NotNull Flow<? extends T> simpleRunningReduce, @NotNull Function3<? super T, ? super T, ? super Continuation<? super T>, ? extends Object> operation) {
        Intrinsics.checkNotNullParameter(simpleRunningReduce, "$this$simpleRunningReduce");
        Intrinsics.checkNotNullParameter(operation, "operation");
        return FlowKt.flow(new C12431(simpleRunningReduce, operation, null));
    }

    @NotNull
    public static final <T, R> Flow<R> simpleScan(@NotNull Flow<? extends T> simpleScan, R r2, @NotNull Function3<? super R, ? super T, ? super Continuation<? super R>, ? extends Object> operation) {
        Intrinsics.checkNotNullParameter(simpleScan, "$this$simpleScan");
        Intrinsics.checkNotNullParameter(operation, "operation");
        return FlowKt.flow(new C12441(simpleScan, r2, operation, null));
    }

    @NotNull
    public static final <T, R> Flow<R> simpleTransformLatest(@NotNull Flow<? extends T> simpleTransformLatest, @NotNull Function3<? super FlowCollector<? super R>, ? super T, ? super Continuation<? super Unit>, ? extends Object> transform) {
        Intrinsics.checkNotNullParameter(simpleTransformLatest, "$this$simpleTransformLatest");
        Intrinsics.checkNotNullParameter(transform, "transform");
        return SimpleChannelFlowKt.simpleChannelFlow(new C12451(simpleTransformLatest, transform, null));
    }
}
