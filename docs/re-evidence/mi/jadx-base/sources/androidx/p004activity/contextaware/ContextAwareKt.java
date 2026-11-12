package androidx.p004activity.contextaware;

import android.content.Context;
import defpackage.mi4;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsJvmKt;
import kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugProbesKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.InlineMarker;
import kotlinx.coroutines.CancellableContinuationImpl;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u0012\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a3\u0010\u0005\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u0000*\u00020\u00012\u0014\b\u0004\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00028\u00000\u0002H\u0086Hø\u0001\u0000¢\u0006\u0004\b\u0005\u0010\u0006\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u0007"}, d2 = {"R", "Lmi4;", "Lkotlin/Function1;", "Landroid/content/Context;", "onContextAvailable", "withContextAvailable", "(Lmi4;Lkotlin/jvm/functions/Function1;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "activity-ktx_release"}, k = 2, mv = {1, 6, 0})
public final class ContextAwareKt {
    @Nullable
    public static final <R> Object withContextAvailable(@NotNull mi4 mi4Var, @NotNull Function1<? super Context, ? extends R> function1, @NotNull Continuation<? super R> continuation) {
        Context contextPeekAvailableContext = mi4Var.peekAvailableContext();
        if (contextPeekAvailableContext != null) {
            return function1.invoke2(contextPeekAvailableContext);
        }
        CancellableContinuationImpl cancellableContinuationImpl = new CancellableContinuationImpl(IntrinsicsKt__IntrinsicsJvmKt.intercepted(continuation), 1);
        cancellableContinuationImpl.initCancellability();
        ContextAwareKt$withContextAvailable$2$listener$1 contextAwareKt$withContextAvailable$2$listener$1 = new ContextAwareKt$withContextAvailable$2$listener$1(cancellableContinuationImpl, function1);
        mi4Var.addOnContextAvailableListener(contextAwareKt$withContextAvailable$2$listener$1);
        cancellableContinuationImpl.invokeOnCancellation(new ContextAwareKt$withContextAvailable$2$1(mi4Var, contextAwareKt$withContextAvailable$2$listener$1));
        Object result = cancellableContinuationImpl.getResult();
        if (result == IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED()) {
            DebugProbesKt.probeCoroutineSuspended(continuation);
        }
        return result;
    }

    private static final <R> Object withContextAvailable$$forInline(mi4 mi4Var, Function1<? super Context, ? extends R> function1, Continuation<? super R> continuation) {
        Context contextPeekAvailableContext = mi4Var.peekAvailableContext();
        if (contextPeekAvailableContext != null) {
            return function1.invoke2(contextPeekAvailableContext);
        }
        InlineMarker.mark(0);
        CancellableContinuationImpl cancellableContinuationImpl = new CancellableContinuationImpl(IntrinsicsKt__IntrinsicsJvmKt.intercepted(continuation), 1);
        cancellableContinuationImpl.initCancellability();
        ContextAwareKt$withContextAvailable$2$listener$1 contextAwareKt$withContextAvailable$2$listener$1 = new ContextAwareKt$withContextAvailable$2$listener$1(cancellableContinuationImpl, function1);
        mi4Var.addOnContextAvailableListener(contextAwareKt$withContextAvailable$2$listener$1);
        cancellableContinuationImpl.invokeOnCancellation(new ContextAwareKt$withContextAvailable$2$1(mi4Var, contextAwareKt$withContextAvailable$2$listener$1));
        Object result = cancellableContinuationImpl.getResult();
        if (result == IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED()) {
            DebugProbesKt.probeCoroutineSuspended(continuation);
        }
        InlineMarker.mark(1);
        return result;
    }
}
