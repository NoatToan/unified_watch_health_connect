package kotlin.coroutines.intrinsics;

import kotlin.ResultKt;
import kotlin.SinceKotlin;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.EmptyCoroutineContext;
import kotlin.coroutines.jvm.internal.BaseContinuationImpl;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugProbesKt;
import kotlin.coroutines.jvm.internal.RestrictedContinuationImpl;
import kotlin.internal.InlineOnly;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.TypeIntrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: Access modifiers changed from: package-private */
/* JADX INFO: loaded from: classes23.dex */
public class IntrinsicsKt__IntrinsicsJvmKt {
    @SinceKotlin(version = "1.3")
    private static final <T> Continuation<Unit> a(final Continuation<? super T> continuation, final Function1<? super Continuation<? super T>, ? extends Object> function1) {
        final CoroutineContext context = continuation.getContext();
        return context == EmptyCoroutineContext.INSTANCE ? new RestrictedContinuationImpl(continuation, function1) { // from class: kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsJvmKt$createCoroutineFromSuspendFunction$1
            private int a;
            public final /* synthetic */ Continuation<T> b;
            public final /* synthetic */ Function1<Continuation<? super T>, Object> c;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            {
                super(continuation);
                this.b = continuation;
                this.c = function1;
            }

            /* JADX WARN: Type inference incomplete: some casts might be missing */
            /*  JADX ERROR: JadxRuntimeException in pass: ModVisitor
                jadx.core.utils.exceptions.JadxRuntimeException: Can't change immutable type java.lang.Object to kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsJvmKt$createCoroutineFromSuspendFunction$1 for r2v1 'this'  java.lang.Object
                	at jadx.core.dex.instructions.args.SSAVar.setType(SSAVar.java:114)
                	at jadx.core.dex.instructions.args.RegisterArg.setType(RegisterArg.java:52)
                	at jadx.core.dex.visitors.ModVisitor.removeCheckCast(ModVisitor.java:417)
                	at jadx.core.dex.visitors.ModVisitor.replaceStep(ModVisitor.java:152)
                	at jadx.core.dex.visitors.ModVisitor.visit(ModVisitor.java:96)
                */
            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            @org.jetbrains.annotations.Nullable
            public java.lang.Object invokeSuspend(@org.jetbrains.annotations.NotNull java.lang.Object r3) {
                /*
                    r2 = this;
                    int r0 = r2.a
                    r1 = 1
                    if (r0 == 0) goto L1a
                    if (r0 != r1) goto Le
                    r0 = 2
                    r2.a = r0
                    kotlin.ResultKt.throwOnFailure(r3)
                    goto L25
                Le:
                    java.lang.IllegalStateException r3 = new java.lang.IllegalStateException
                    java.lang.String r0 = "This coroutine had already completed"
                    java.lang.String r0 = r0.toString()
                    r3.<init>(r0)
                    throw r3
                L1a:
                    r2.a = r1
                    kotlin.ResultKt.throwOnFailure(r3)
                    kotlin.jvm.functions.Function1<kotlin.coroutines.Continuation<? super T>, java.lang.Object> r3 = r2.c
                    java.lang.Object r3 = r3.invoke(r2)
                L25:
                    return r3
                */
                throw new UnsupportedOperationException("Method not decompiled: kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsJvmKt$createCoroutineFromSuspendFunction$1.invokeSuspend(java.lang.Object):java.lang.Object");
            }
        } : new ContinuationImpl(continuation, context, function1) { // from class: kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsJvmKt$createCoroutineFromSuspendFunction$2
            private int a;
            public final /* synthetic */ Continuation<T> b;
            public final /* synthetic */ CoroutineContext c;
            public final /* synthetic */ Function1<Continuation<? super T>, Object> d;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            {
                super(continuation, context);
                this.b = continuation;
                this.c = context;
                this.d = function1;
            }

            /* JADX WARN: Type inference incomplete: some casts might be missing */
            /*  JADX ERROR: JadxRuntimeException in pass: ModVisitor
                jadx.core.utils.exceptions.JadxRuntimeException: Can't change immutable type java.lang.Object to kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsJvmKt$createCoroutineFromSuspendFunction$2 for r2v1 'this'  java.lang.Object
                	at jadx.core.dex.instructions.args.SSAVar.setType(SSAVar.java:114)
                	at jadx.core.dex.instructions.args.RegisterArg.setType(RegisterArg.java:52)
                	at jadx.core.dex.visitors.ModVisitor.removeCheckCast(ModVisitor.java:417)
                	at jadx.core.dex.visitors.ModVisitor.replaceStep(ModVisitor.java:152)
                	at jadx.core.dex.visitors.ModVisitor.visit(ModVisitor.java:96)
                */
            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            @org.jetbrains.annotations.Nullable
            public java.lang.Object invokeSuspend(@org.jetbrains.annotations.NotNull java.lang.Object r3) {
                /*
                    r2 = this;
                    int r0 = r2.a
                    r1 = 1
                    if (r0 == 0) goto L1a
                    if (r0 != r1) goto Le
                    r0 = 2
                    r2.a = r0
                    kotlin.ResultKt.throwOnFailure(r3)
                    goto L25
                Le:
                    java.lang.IllegalStateException r3 = new java.lang.IllegalStateException
                    java.lang.String r0 = "This coroutine had already completed"
                    java.lang.String r0 = r0.toString()
                    r3.<init>(r0)
                    throw r3
                L1a:
                    r2.a = r1
                    kotlin.ResultKt.throwOnFailure(r3)
                    kotlin.jvm.functions.Function1<kotlin.coroutines.Continuation<? super T>, java.lang.Object> r3 = r2.d
                    java.lang.Object r3 = r3.invoke(r2)
                L25:
                    return r3
                */
                throw new UnsupportedOperationException("Method not decompiled: kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsJvmKt$createCoroutineFromSuspendFunction$2.invokeSuspend(java.lang.Object):java.lang.Object");
            }
        };
    }

    @SinceKotlin(version = "1.3")
    @InlineOnly
    private static final <T> Object b(Function1<? super Continuation<? super T>, ? extends Object> function1, Continuation<? super T> continuation) {
        return ((Function1) TypeIntrinsics.beforeCheckcastToFunctionOfArity(function1, 1)).invoke(continuation);
    }

    @SinceKotlin(version = "1.3")
    @InlineOnly
    private static final <R, T> Object c(Function2<? super R, ? super Continuation<? super T>, ? extends Object> function2, R r, Continuation<? super T> continuation) {
        return ((Function2) TypeIntrinsics.beforeCheckcastToFunctionOfArity(function2, 2)).invoke(r, continuation);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @SinceKotlin(version = "1.3")
    @NotNull
    public static <T> Continuation<Unit> createCoroutineUnintercepted(@NotNull final Function1<? super Continuation<? super T>, ? extends Object> function1, @NotNull Continuation<? super T> continuation) {
        final Continuation<?> continuationProbeCoroutineCreated = DebugProbesKt.probeCoroutineCreated(continuation);
        if (function1 instanceof BaseContinuationImpl) {
            return ((BaseContinuationImpl) function1).create(continuationProbeCoroutineCreated);
        }
        final CoroutineContext context = continuationProbeCoroutineCreated.getContext();
        return context == EmptyCoroutineContext.INSTANCE ? new RestrictedContinuationImpl(function1) { // from class: kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsJvmKt$createCoroutineUnintercepted$$inlined$createCoroutineFromSuspendFunction$IntrinsicsKt__IntrinsicsJvmKt$1
            private int a;
            public final /* synthetic */ Function1 c;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(this.b);
                this.c = function1;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            @Nullable
            public Object invokeSuspend(@NotNull Object obj) {
                int i = this.a;
                if (i == 0) {
                    this.a = 1;
                    ResultKt.throwOnFailure(obj);
                    return ((Function1) TypeIntrinsics.beforeCheckcastToFunctionOfArity(this.c, 1)).invoke(this);
                }
                if (i != 1) {
                    throw new IllegalStateException("This coroutine had already completed".toString());
                }
                this.a = 2;
                ResultKt.throwOnFailure(obj);
                return obj;
            }
        } : new ContinuationImpl(context, function1) { // from class: kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsJvmKt$createCoroutineUnintercepted$$inlined$createCoroutineFromSuspendFunction$IntrinsicsKt__IntrinsicsJvmKt$2
            private int a;
            public final /* synthetic */ CoroutineContext c;
            public final /* synthetic */ Function1 d;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(this.b, context);
                this.c = context;
                this.d = function1;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            @Nullable
            public Object invokeSuspend(@NotNull Object obj) {
                int i = this.a;
                if (i == 0) {
                    this.a = 1;
                    ResultKt.throwOnFailure(obj);
                    return ((Function1) TypeIntrinsics.beforeCheckcastToFunctionOfArity(this.d, 1)).invoke(this);
                }
                if (i != 1) {
                    throw new IllegalStateException("This coroutine had already completed".toString());
                }
                this.a = 2;
                ResultKt.throwOnFailure(obj);
                return obj;
            }
        };
    }

    @InlineOnly
    private static final <R, P, T> Object d(Function3<? super R, ? super P, ? super Continuation<? super T>, ? extends Object> function3, R r, P p, Continuation<? super T> continuation) {
        return ((Function3) TypeIntrinsics.beforeCheckcastToFunctionOfArity(function3, 3)).invoke(r, p, continuation);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @SinceKotlin(version = "1.3")
    @NotNull
    public static <T> Continuation<T> intercepted(@NotNull Continuation<? super T> continuation) {
        ContinuationImpl continuationImpl = continuation instanceof ContinuationImpl ? (ContinuationImpl) continuation : null;
        return continuationImpl == null ? continuation : (Continuation<T>) continuationImpl.intercepted();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @SinceKotlin(version = "1.3")
    @NotNull
    public static <R, T> Continuation<Unit> createCoroutineUnintercepted(@NotNull final Function2<? super R, ? super Continuation<? super T>, ? extends Object> function2, final R r, @NotNull Continuation<? super T> continuation) {
        final Continuation<?> continuationProbeCoroutineCreated = DebugProbesKt.probeCoroutineCreated(continuation);
        if (function2 instanceof BaseContinuationImpl) {
            return ((BaseContinuationImpl) function2).create(r, continuationProbeCoroutineCreated);
        }
        final CoroutineContext context = continuationProbeCoroutineCreated.getContext();
        if (context == EmptyCoroutineContext.INSTANCE) {
            return new RestrictedContinuationImpl(function2, r) { // from class: kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsJvmKt$createCoroutineUnintercepted$$inlined$createCoroutineFromSuspendFunction$IntrinsicsKt__IntrinsicsJvmKt$3
                private int a;
                public final /* synthetic */ Function2 c;
                public final /* synthetic */ Object d;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(this.b);
                    this.c = function2;
                    this.d = r;
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                @Nullable
                public Object invokeSuspend(@NotNull Object obj) {
                    int i = this.a;
                    if (i == 0) {
                        this.a = 1;
                        ResultKt.throwOnFailure(obj);
                        return ((Function2) TypeIntrinsics.beforeCheckcastToFunctionOfArity(this.c, 2)).invoke(this.d, this);
                    }
                    if (i != 1) {
                        throw new IllegalStateException("This coroutine had already completed".toString());
                    }
                    this.a = 2;
                    ResultKt.throwOnFailure(obj);
                    return obj;
                }
            };
        }
        return new ContinuationImpl(context, function2, r) { // from class: kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsJvmKt$createCoroutineUnintercepted$$inlined$createCoroutineFromSuspendFunction$IntrinsicsKt__IntrinsicsJvmKt$4
            private int a;
            public final /* synthetic */ CoroutineContext c;
            public final /* synthetic */ Function2 d;
            public final /* synthetic */ Object e;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(this.b, context);
                this.c = context;
                this.d = function2;
                this.e = r;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            @Nullable
            public Object invokeSuspend(@NotNull Object obj) {
                int i = this.a;
                if (i == 0) {
                    this.a = 1;
                    ResultKt.throwOnFailure(obj);
                    return ((Function2) TypeIntrinsics.beforeCheckcastToFunctionOfArity(this.d, 2)).invoke(this.e, this);
                }
                if (i != 1) {
                    throw new IllegalStateException("This coroutine had already completed".toString());
                }
                this.a = 2;
                ResultKt.throwOnFailure(obj);
                return obj;
            }
        };
    }
}
