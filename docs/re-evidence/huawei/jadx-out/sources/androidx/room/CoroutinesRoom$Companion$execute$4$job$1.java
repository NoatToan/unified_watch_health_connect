package androidx.room;

import defpackage.createFailure;
import defpackage.yyt;
import defpackage.yzc;
import defpackage.zbg;
import java.util.concurrent.Callable;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CancellableContinuation;
import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: loaded from: classes21.dex */
@Metadata(d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u0002*\u00020\u0003H\u008a@"}, d2 = {"<anonymous>", "", "R", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {1, 7, 1}, xi = 48)
@DebugMetadata(c = "androidx.room.CoroutinesRoom$Companion$execute$4$job$1", f = "CoroutinesRoom.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
final class CoroutinesRoom$Companion$execute$4$job$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super yzc>, Object> {
    final /* synthetic */ Callable<R> $callable;
    final /* synthetic */ CancellableContinuation<R> $continuation;
    int label;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        zbg.a();
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        createFailure.c(obj);
        try {
            Object objCall = this.$callable.call();
            Continuation continuation = this.$continuation;
            yyt.c cVar = yyt.f53903b;
            continuation.resumeWith(yyt.e(objCall));
        } catch (Throwable th) {
            Continuation continuation2 = this.$continuation;
            yyt.c cVar2 = yyt.f53903b;
            continuation2.resumeWith(yyt.e(createFailure.a(th)));
        }
        return yzc.e;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super yzc> continuation) {
        return ((CoroutinesRoom$Companion$execute$4$job$1) create(coroutineScope, continuation)).invokeSuspend(yzc.e);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<yzc> create(Object obj, Continuation<?> continuation) {
        return new CoroutinesRoom$Companion$execute$4$job$1(this.$callable, this.$continuation, continuation);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    CoroutinesRoom$Companion$execute$4$job$1(Callable<R> callable, CancellableContinuation<? super R> cancellableContinuation, Continuation<? super CoroutinesRoom$Companion$execute$4$job$1> continuation) {
        super(2, continuation);
        this.$callable = callable;
        this.$continuation = cancellableContinuation;
    }
}
