package kotlinx.coroutines.guava;

import com.xiaomi.fitness.statistics.StatConstants;
import defpackage.c8g;
import defpackage.iua;
import defpackage.l9q;
import defpackage.lhe;
import defpackage.pua;
import defpackage.yed;
import defpackage.zed;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;
import kotlin.Deprecated;
import kotlin.DeprecationLevel;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.EmptyCoroutineContext;
import kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsJvmKt;
import kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugProbesKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.sequences.Sequence;
import kotlinx.coroutines.CancellableContinuationImpl;
import kotlinx.coroutines.ChildHandle;
import kotlinx.coroutines.ChildJob;
import kotlinx.coroutines.CompletableDeferred;
import kotlinx.coroutines.CompletableDeferredKt;
import kotlinx.coroutines.CoroutineContextKt;
import kotlinx.coroutines.CoroutineExceptionHandlerKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineStart;
import kotlinx.coroutines.Deferred;
import kotlinx.coroutines.DisposableHandle;
import kotlinx.coroutines.ExperimentalCoroutinesApi;
import kotlinx.coroutines.InternalCoroutinesApi;
import kotlinx.coroutines.Job;
import kotlinx.coroutines.selects.SelectClause0;
import kotlinx.coroutines.selects.SelectClause1;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000@\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0002\b\u0007\u001a]\u0010\f\u001a\b\u0012\u0004\u0012\u00028\u00000\u000b\"\u0004\b\u0000\u0010\u0000*\u00020\u00012\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042'\u0010\n\u001a#\b\u0001\u0012\u0004\u0012\u00020\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u0007\u0012\u0006\u0012\u0004\u0018\u00010\b0\u0006¢\u0006\u0002\b\tø\u0001\u0000¢\u0006\u0004\b\f\u0010\r\u001a#\u0010\u000f\u001a\b\u0012\u0004\u0012\u00028\u00000\u000e\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u000b¢\u0006\u0004\b\u000f\u0010\u0010\u001a\u0013\u0010\u0013\u001a\u00020\u0012*\u00020\u0011H\u0002¢\u0006\u0004\b\u0013\u0010\u0014\u001a#\u0010\u0015\u001a\b\u0012\u0004\u0012\u00028\u00000\u000b\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u000e¢\u0006\u0004\b\u0015\u0010\u0016\u001a#\u0010\u0017\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u000bH\u0086@ø\u0001\u0000¢\u0006\u0004\b\u0017\u0010\u0018\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u0019"}, d2 = {"T", "Lkotlinx/coroutines/CoroutineScope;", "Lkotlin/coroutines/CoroutineContext;", "context", "Lkotlinx/coroutines/CoroutineStart;", StatConstants.PARAM_START, "Lkotlin/Function2;", "Lkotlin/coroutines/Continuation;", "", "Lkotlin/ExtensionFunctionType;", "block", "Llhe;", "future", "(Lkotlinx/coroutines/CoroutineScope;Lkotlin/coroutines/CoroutineContext;Lkotlinx/coroutines/CoroutineStart;Lkotlin/jvm/functions/Function2;)Llhe;", "Lkotlinx/coroutines/Deferred;", "asDeferred", "(Llhe;)Lkotlinx/coroutines/Deferred;", "Ljava/util/concurrent/ExecutionException;", "", "nonNullCause", "(Ljava/util/concurrent/ExecutionException;)Ljava/lang/Throwable;", "asListenableFuture", "(Lkotlinx/coroutines/Deferred;)Llhe;", "await", "(Llhe;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "kotlinx-coroutines-guava"}, k = 2, mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nListenableFuture.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ListenableFuture.kt\nkotlinx/coroutines/guava/ListenableFutureKt\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 CancellableContinuation.kt\nkotlinx/coroutines/CancellableContinuationKt\n*L\n1#1,509:1\n1#2:510\n314#3,11:511\n*S KotlinDebug\n*F\n+ 1 ListenableFuture.kt\nkotlinx/coroutines/guava/ListenableFutureKt\n*L\n242#1:511,11\n*E\n"})
public final class ListenableFutureKt {
    /* JADX WARN: Multi-variable type inference failed */
    @NotNull
    public static final <T> Deferred<T> asDeferred(@NotNull final lhe<T> lheVar) {
        CompletableDeferred completableDeferredCompletableDeferred$default;
        Throwable thA;
        if ((lheVar instanceof yed) && (thA = zed.a((yed) lheVar)) != null) {
            CompletableDeferred completableDeferredCompletableDeferred$default2 = CompletableDeferredKt.CompletableDeferred$default(null, 1, null);
            completableDeferredCompletableDeferred$default2.completeExceptionally(thA);
            return completableDeferredCompletableDeferred$default2;
        }
        if (!lheVar.isDone()) {
            final CompletableDeferred completableDeferredCompletableDeferred$default3 = CompletableDeferredKt.CompletableDeferred$default(null, 1, null);
            pua.a(lheVar, new iua<T>() { // from class: kotlinx.coroutines.guava.ListenableFutureKt.asDeferred.4
                @Override // defpackage.iua
                public void onFailure(@NotNull Throwable t) {
                    Object objM886constructorimpl;
                    CompletableDeferred<T> completableDeferred = completableDeferredCompletableDeferred$default3;
                    try {
                        Result.Companion companion = Result.Companion;
                        objM886constructorimpl = Result.m886constructorimpl(Boolean.valueOf(completableDeferred.completeExceptionally(t)));
                    } catch (Throwable th) {
                        Result.Companion companion2 = Result.Companion;
                        objM886constructorimpl = Result.m886constructorimpl(ResultKt.createFailure(th));
                    }
                    Throwable thM889exceptionOrNullimpl = Result.m889exceptionOrNullimpl(objM886constructorimpl);
                    if (thM889exceptionOrNullimpl != null) {
                        CoroutineExceptionHandlerKt.handleCoroutineException(EmptyCoroutineContext.INSTANCE, thM889exceptionOrNullimpl);
                    }
                }

                @Override // defpackage.iua
                public void onSuccess(T result) {
                    Object objM886constructorimpl;
                    CompletableDeferred<T> completableDeferred = completableDeferredCompletableDeferred$default3;
                    try {
                        Result.Companion companion = Result.Companion;
                        objM886constructorimpl = Result.m886constructorimpl(Boolean.valueOf(completableDeferred.complete(result)));
                    } catch (Throwable th) {
                        Result.Companion companion2 = Result.Companion;
                        objM886constructorimpl = Result.m886constructorimpl(ResultKt.createFailure(th));
                    }
                    Throwable thM889exceptionOrNullimpl = Result.m889exceptionOrNullimpl(objM886constructorimpl);
                    if (thM889exceptionOrNullimpl != null) {
                        CoroutineExceptionHandlerKt.handleCoroutineException(EmptyCoroutineContext.INSTANCE, thM889exceptionOrNullimpl);
                    }
                }
            }, c8g.a());
            completableDeferredCompletableDeferred$default3.invokeOnCompletion(new Function1<Throwable, Unit>() { // from class: kotlinx.coroutines.guava.ListenableFutureKt.asDeferred.5
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(1);
                }

                @Override // kotlin.jvm.functions.Function1
                /* JADX INFO: renamed from: invoke */
                public /* bridge */ /* synthetic */ Unit invoke2(Throwable th) {
                    invoke2(th);
                    return Unit.INSTANCE;
                }

                /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                public final void invoke2(@Nullable Throwable th) {
                    lheVar.cancel(false);
                }
            });
            return new Deferred<T>() { // from class: kotlinx.coroutines.guava.ListenableFutureKt.asDeferred.6
                @Override // kotlinx.coroutines.Job
                @InternalCoroutinesApi
                @NotNull
                public ChildHandle attachChild(@NotNull ChildJob child) {
                    return completableDeferredCompletableDeferred$default3.attachChild(child);
                }

                @Override // kotlinx.coroutines.Deferred
                @Nullable
                public Object await(@NotNull Continuation<? super T> continuation) {
                    return completableDeferredCompletableDeferred$default3.await(continuation);
                }

                @Override // kotlinx.coroutines.Job
                @Deprecated(level = DeprecationLevel.HIDDEN, message = "Since 1.2.0, binary compatibility with versions <= 1.1.x")
                public /* synthetic */ void cancel() {
                    completableDeferredCompletableDeferred$default3.cancel();
                }

                @Override // kotlin.coroutines.CoroutineContext.Element, kotlin.coroutines.CoroutineContext
                public <R> R fold(R initial, @NotNull Function2<? super R, ? super CoroutineContext.Element, ? extends R> operation) {
                    return (R) completableDeferredCompletableDeferred$default3.fold(initial, operation);
                }

                @Override // kotlin.coroutines.CoroutineContext.Element, kotlin.coroutines.CoroutineContext
                @Nullable
                public <E extends CoroutineContext.Element> E get(@NotNull CoroutineContext.Key<E> key) {
                    return (E) completableDeferredCompletableDeferred$default3.get(key);
                }

                @Override // kotlinx.coroutines.Job
                @InternalCoroutinesApi
                @NotNull
                public CancellationException getCancellationException() {
                    return completableDeferredCompletableDeferred$default3.getCancellationException();
                }

                @Override // kotlinx.coroutines.Job
                @NotNull
                public Sequence<Job> getChildren() {
                    return completableDeferredCompletableDeferred$default3.getChildren();
                }

                @Override // kotlinx.coroutines.Deferred
                @ExperimentalCoroutinesApi
                public T getCompleted() {
                    return completableDeferredCompletableDeferred$default3.getCompleted();
                }

                @Override // kotlinx.coroutines.Deferred
                @ExperimentalCoroutinesApi
                @Nullable
                public Throwable getCompletionExceptionOrNull() {
                    return completableDeferredCompletableDeferred$default3.getCompletionExceptionOrNull();
                }

                @Override // kotlin.coroutines.CoroutineContext.Element
                @NotNull
                public CoroutineContext.Key<?> getKey() {
                    return completableDeferredCompletableDeferred$default3.getKey();
                }

                @Override // kotlinx.coroutines.Deferred
                @NotNull
                public SelectClause1<T> getOnAwait() {
                    return completableDeferredCompletableDeferred$default3.getOnAwait();
                }

                @Override // kotlinx.coroutines.Job
                @NotNull
                public SelectClause0 getOnJoin() {
                    return completableDeferredCompletableDeferred$default3.getOnJoin();
                }

                @Override // kotlinx.coroutines.Job
                @Nullable
                public Job getParent() {
                    return completableDeferredCompletableDeferred$default3.getParent();
                }

                @Override // kotlinx.coroutines.Job
                @NotNull
                public DisposableHandle invokeOnCompletion(@NotNull Function1<? super Throwable, Unit> handler) {
                    return completableDeferredCompletableDeferred$default3.invokeOnCompletion(handler);
                }

                @Override // kotlinx.coroutines.Job
                public boolean isActive() {
                    return completableDeferredCompletableDeferred$default3.isActive();
                }

                @Override // kotlinx.coroutines.Job
                public boolean isCancelled() {
                    return completableDeferredCompletableDeferred$default3.isCancelled();
                }

                @Override // kotlinx.coroutines.Job
                public boolean isCompleted() {
                    return completableDeferredCompletableDeferred$default3.isCompleted();
                }

                @Override // kotlinx.coroutines.Job
                @Nullable
                public Object join(@NotNull Continuation<? super Unit> continuation) {
                    return completableDeferredCompletableDeferred$default3.join(continuation);
                }

                @Override // kotlin.coroutines.CoroutineContext.Element, kotlin.coroutines.CoroutineContext
                @NotNull
                public CoroutineContext minusKey(@NotNull CoroutineContext.Key<?> key) {
                    return completableDeferredCompletableDeferred$default3.minusKey(key);
                }

                @Override // kotlin.coroutines.CoroutineContext
                @NotNull
                public CoroutineContext plus(@NotNull CoroutineContext context) {
                    return completableDeferredCompletableDeferred$default3.plus(context);
                }

                @Override // kotlinx.coroutines.Job
                public boolean start() {
                    return completableDeferredCompletableDeferred$default3.start();
                }

                @Override // kotlinx.coroutines.Job
                public void cancel(@Nullable CancellationException cause) {
                    completableDeferredCompletableDeferred$default3.cancel(cause);
                }

                @Override // kotlinx.coroutines.Job
                @InternalCoroutinesApi
                @NotNull
                public DisposableHandle invokeOnCompletion(boolean onCancelling, boolean invokeImmediately, @NotNull Function1<? super Throwable, Unit> handler) {
                    return completableDeferredCompletableDeferred$default3.invokeOnCompletion(onCancelling, invokeImmediately, handler);
                }

                @Override // kotlinx.coroutines.Job
                @Deprecated(level = DeprecationLevel.ERROR, message = "Operator '+' on two Job objects is meaningless. Job is a coroutine context element and `+` is a set-sum operator for coroutine contexts. The job to the right of `+` just replaces the job the left of `+`.")
                @NotNull
                public Job plus(@NotNull Job other) {
                    return completableDeferredCompletableDeferred$default3.plus(other);
                }

                @Override // kotlinx.coroutines.Job
                @Deprecated(level = DeprecationLevel.HIDDEN, message = "Since 1.2.0, binary compatibility with versions <= 1.1.x")
                public /* synthetic */ boolean cancel(Throwable cause) {
                    return completableDeferredCompletableDeferred$default3.cancel(cause);
                }
            };
        }
        try {
            return CompletableDeferredKt.CompletableDeferred(l9q.a(lheVar));
        } catch (CancellationException e) {
            completableDeferredCompletableDeferred$default = CompletableDeferredKt.CompletableDeferred$default(null, 1, null);
            completableDeferredCompletableDeferred$default.cancel(e);
            return completableDeferredCompletableDeferred$default;
        } catch (ExecutionException e2) {
            completableDeferredCompletableDeferred$default = CompletableDeferredKt.CompletableDeferred$default(null, 1, null);
            completableDeferredCompletableDeferred$default.completeExceptionally(nonNullCause(e2));
            return completableDeferredCompletableDeferred$default;
        }
    }

    @NotNull
    public static final <T> lhe<T> asListenableFuture(@NotNull final Deferred<? extends T> deferred) {
        final JobListenableFuture jobListenableFuture = new JobListenableFuture(deferred);
        deferred.invokeOnCompletion(new Function1<Throwable, Unit>() { // from class: kotlinx.coroutines.guava.ListenableFutureKt.asListenableFuture.1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public /* bridge */ /* synthetic */ Unit invoke2(Throwable th) {
                invoke2(th);
                return Unit.INSTANCE;
            }

            /* JADX WARN: Type inference incomplete: some casts might be missing */
            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2(@Nullable Throwable th) {
                if (th == null) {
                    jobListenableFuture.complete((T) deferred.getCompleted());
                } else {
                    jobListenableFuture.completeExceptionallyOrCancel(th);
                }
            }
        });
        return jobListenableFuture;
    }

    @Nullable
    public static final <T> Object await(@NotNull final lhe<T> lheVar, @NotNull Continuation<? super T> continuation) throws Throwable {
        try {
            if (lheVar.isDone()) {
                return l9q.a(lheVar);
            }
            CancellableContinuationImpl cancellableContinuationImpl = new CancellableContinuationImpl(IntrinsicsKt__IntrinsicsJvmKt.intercepted(continuation), 1);
            cancellableContinuationImpl.initCancellability();
            lheVar.addListener(new ToContinuation(lheVar, cancellableContinuationImpl), c8g.a());
            cancellableContinuationImpl.invokeOnCancellation(new Function1<Throwable, Unit>() { // from class: kotlinx.coroutines.guava.ListenableFutureKt$await$2$1
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(1);
                }

                @Override // kotlin.jvm.functions.Function1
                /* JADX INFO: renamed from: invoke */
                public /* bridge */ /* synthetic */ Unit invoke2(Throwable th) {
                    invoke2(th);
                    return Unit.INSTANCE;
                }

                /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                public final void invoke2(@Nullable Throwable th) {
                    lheVar.cancel(false);
                }
            });
            Object result = cancellableContinuationImpl.getResult();
            if (result == IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED()) {
                DebugProbesKt.probeCoroutineSuspended(continuation);
            }
            return result;
        } catch (ExecutionException e) {
            throw nonNullCause(e);
        }
    }

    @NotNull
    public static final <T> lhe<T> future(@NotNull CoroutineScope coroutineScope, @NotNull CoroutineContext coroutineContext, @NotNull CoroutineStart coroutineStart, @NotNull Function2<? super CoroutineScope, ? super Continuation<? super T>, ? extends Object> function2) {
        if (!coroutineStart.isLazy()) {
            ListenableFutureCoroutine listenableFutureCoroutine = new ListenableFutureCoroutine(CoroutineContextKt.newCoroutineContext(coroutineScope, coroutineContext));
            listenableFutureCoroutine.start(coroutineStart, listenableFutureCoroutine, function2);
            return listenableFutureCoroutine.future;
        }
        throw new IllegalArgumentException((coroutineStart + " start is not supported").toString());
    }

    public static /* synthetic */ lhe future$default(CoroutineScope coroutineScope, CoroutineContext coroutineContext, CoroutineStart coroutineStart, Function2 function2, int i, Object obj) {
        if ((i & 1) != 0) {
            coroutineContext = EmptyCoroutineContext.INSTANCE;
        }
        if ((i & 2) != 0) {
            coroutineStart = CoroutineStart.DEFAULT;
        }
        return future(coroutineScope, coroutineContext, coroutineStart, function2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Throwable nonNullCause(ExecutionException executionException) {
        Throwable cause = executionException.getCause();
        Intrinsics.checkNotNull(cause);
        return cause;
    }
}
