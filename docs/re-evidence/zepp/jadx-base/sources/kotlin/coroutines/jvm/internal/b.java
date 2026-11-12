package kotlin.coroutines.jvm.internal;

import kotlin.Result;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.EmptyCoroutineContext;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes23.dex */
final class b implements Continuation<Unit> {

    @Nullable
    private Result<Unit> a;

    public final void a() {
        synchronized (this) {
            while (true) {
                Result<Unit> resultB = b();
                if (resultB == null) {
                    wait();
                } else {
                    ResultKt.throwOnFailure(resultB.m3853unboximpl());
                }
            }
        }
    }

    @Nullable
    public final Result<Unit> b() {
        return this.a;
    }

    public final void c(@Nullable Result<Unit> result) {
        this.a = result;
    }

    @Override // kotlin.coroutines.Continuation
    @NotNull
    public CoroutineContext getContext() {
        return EmptyCoroutineContext.INSTANCE;
    }

    @Override // kotlin.coroutines.Continuation
    public void resumeWith(@NotNull Object obj) {
        synchronized (this) {
            c(Result.m3844boximpl(obj));
            notifyAll();
            Unit unit = Unit.INSTANCE;
        }
    }
}
