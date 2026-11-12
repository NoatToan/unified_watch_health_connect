package kotlin.coroutines.jvm.internal;

import kotlin.Result;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.EmptyCoroutineContext;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes2.dex */
final class RunSuspend implements Continuation<Unit> {

    @Nullable
    private Result<Unit> result;

    public final void await() {
        synchronized (this) {
            while (true) {
                try {
                    Result<Unit> result = this.result;
                    if (result == null) {
                        Intrinsics.checkNotNull(this, "null cannot be cast to non-null type java.lang.Object");
                        wait();
                    } else {
                        ResultKt.throwOnFailure(result.m895unboximpl());
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
    }

    @Override // kotlin.coroutines.Continuation
    @NotNull
    public CoroutineContext getContext() {
        return EmptyCoroutineContext.INSTANCE;
    }

    @Nullable
    /* JADX INFO: renamed from: getResult-xLWZpok, reason: not valid java name */
    public final Result<Unit> m2104getResultxLWZpok() {
        return this.result;
    }

    @Override // kotlin.coroutines.Continuation
    public void resumeWith(@NotNull Object obj) {
        synchronized (this) {
            this.result = Result.m885boximpl(obj);
            Intrinsics.checkNotNull(this, "null cannot be cast to non-null type java.lang.Object");
            notifyAll();
            Unit unit = Unit.INSTANCE;
        }
    }

    public final void setResult(@Nullable Result<Unit> result) {
        this.result = result;
    }
}
