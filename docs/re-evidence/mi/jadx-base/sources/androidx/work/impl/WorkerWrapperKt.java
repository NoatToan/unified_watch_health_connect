package androidx.work.impl;

import androidx.annotation.RestrictTo;
import androidx.work.DirectExecutor;
import defpackage.lhe;
import defpackage.ppe;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsJvmKt;
import kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugProbesKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.CancellableContinuationImpl;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000*\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\u001a(\u0010\u0004\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u00012\u0006\u0010\u0003\u001a\u00020\u0002H\u0087@¢\u0006\u0004\b\u0004\u0010\u0005\u001a#\u0010\t\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u00062\f\u0010\b\u001a\b\u0012\u0004\u0012\u00028\u00000\u0007H\u0002¢\u0006\u0004\b\t\u0010\n\u001a\u0013\u0010\r\u001a\u00020\f*\u00020\u000bH\u0002¢\u0006\u0004\b\r\u0010\u000e\"\u0014\u0010\u0010\u001a\u00020\u000f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\u0011¨\u0006\u0012"}, d2 = {"T", "Llhe;", "Landroidx/work/a;", "worker", "awaitWithin", "(Llhe;Landroidx/work/a;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "V", "Ljava/util/concurrent/Future;", "future", "getUninterruptibly", "(Ljava/util/concurrent/Future;)Ljava/lang/Object;", "Ljava/util/concurrent/ExecutionException;", "", "nonNullCause", "(Ljava/util/concurrent/ExecutionException;)Ljava/lang/Throwable;", "", "TAG", "Ljava/lang/String;", "work-runtime_release"}, k = 2, mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nWorkerWrapper.kt\nKotlin\n*S Kotlin\n*F\n+ 1 WorkerWrapper.kt\nandroidx/work/impl/WorkerWrapperKt\n+ 2 CancellableContinuation.kt\nkotlinx/coroutines/CancellableContinuationKt\n*L\n1#1,607:1\n314#2,11:608\n*S KotlinDebug\n*F\n+ 1 WorkerWrapper.kt\nandroidx/work/impl/WorkerWrapperKt\n*L\n553#1:608,11\n*E\n"})
public final class WorkerWrapperKt {

    @NotNull
    private static final String TAG;

    static {
        String strI = ppe.i("WorkerWrapper");
        Intrinsics.checkNotNullExpressionValue(strI, "tagWithPrefix(\"WorkerWrapper\")");
        TAG = strI;
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    @Nullable
    public static final <T> Object awaitWithin(@NotNull final lhe<T> lheVar, @NotNull final androidx.work.a aVar, @NotNull Continuation<? super T> continuation) throws Throwable {
        try {
            if (lheVar.isDone()) {
                return getUninterruptibly(lheVar);
            }
            CancellableContinuationImpl cancellableContinuationImpl = new CancellableContinuationImpl(IntrinsicsKt__IntrinsicsJvmKt.intercepted(continuation), 1);
            cancellableContinuationImpl.initCancellability();
            lheVar.addListener(new ToContinuation(lheVar, cancellableContinuationImpl), DirectExecutor.INSTANCE);
            cancellableContinuationImpl.invokeOnCancellation(new Function1<Throwable, Unit>() { // from class: androidx.work.impl.WorkerWrapperKt$awaitWithin$2$1
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
                public final void invoke2(Throwable th) {
                    if (th instanceof WorkerStoppedException) {
                        aVar.stop(((WorkerStoppedException) th).getReason());
                    }
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

    /* JADX INFO: Access modifiers changed from: private */
    public static final <V> V getUninterruptibly(Future<V> future) {
        V v;
        boolean z = false;
        while (true) {
            try {
                v = future.get();
                break;
            } catch (InterruptedException unused) {
                z = true;
            } catch (Throwable th) {
                if (z) {
                    Thread.currentThread().interrupt();
                }
                throw th;
            }
        }
        if (z) {
            Thread.currentThread().interrupt();
        }
        return v;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Throwable nonNullCause(ExecutionException executionException) {
        Throwable cause = executionException.getCause();
        Intrinsics.checkNotNull(cause);
        return cause;
    }
}
