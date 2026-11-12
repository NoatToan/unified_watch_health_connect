package kotlin.sequences;

import java.util.Iterator;
import java.util.NoSuchElementException;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.EmptyCoroutineContext;
import kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugProbesKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.markers.KMappedMarker;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes4.dex */
final class SequenceBuilderIterator<T> extends SequenceScope<T> implements Iterator<T>, Continuation<Unit>, KMappedMarker {

    @Nullable
    private Iterator<? extends T> nextIterator;

    @Nullable
    private Continuation<? super Unit> nextStep;

    @Nullable
    private T nextValue;
    private int state;

    private final Throwable exceptionalState() {
        int i = this.state;
        if (i == 4) {
            return new NoSuchElementException();
        }
        if (i == 5) {
            return new IllegalStateException("Iterator has failed.");
        }
        return new IllegalStateException("Unexpected state of the iterator: " + this.state);
    }

    private final T nextNotReady() {
        if (hasNext()) {
            return next();
        }
        throw new NoSuchElementException();
    }

    @Override // kotlin.coroutines.Continuation
    @NotNull
    public CoroutineContext getContext() {
        return EmptyCoroutineContext.INSTANCE;
    }

    @Nullable
    public final Continuation<Unit> getNextStep() {
        return this.nextStep;
    }

    @Override // java.util.Iterator
    public boolean hasNext() throws Throwable {
        while (true) {
            int i = this.state;
            if (i != 0) {
                if (i != 1) {
                    if (i == 2 || i == 3) {
                        return true;
                    }
                    if (i == 4) {
                        return false;
                    }
                    throw exceptionalState();
                }
                Iterator<? extends T> it = this.nextIterator;
                Intrinsics.checkNotNull(it);
                if (it.hasNext()) {
                    this.state = 2;
                    return true;
                }
                this.nextIterator = null;
            }
            this.state = 5;
            Continuation<? super Unit> continuation = this.nextStep;
            Intrinsics.checkNotNull(continuation);
            this.nextStep = null;
            Result.Companion companion = Result.Companion;
            continuation.resumeWith(Result.m886constructorimpl(Unit.INSTANCE));
        }
    }

    @Override // java.util.Iterator
    public T next() throws Throwable {
        int i = this.state;
        if (i == 0 || i == 1) {
            return nextNotReady();
        }
        if (i == 2) {
            this.state = 1;
            Iterator<? extends T> it = this.nextIterator;
            Intrinsics.checkNotNull(it);
            return it.next();
        }
        if (i != 3) {
            throw exceptionalState();
        }
        this.state = 0;
        T t = this.nextValue;
        this.nextValue = null;
        return t;
    }

    @Override // java.util.Iterator
    public void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // kotlin.coroutines.Continuation
    public void resumeWith(@NotNull Object obj) {
        ResultKt.throwOnFailure(obj);
        this.state = 4;
    }

    public final void setNextStep(@Nullable Continuation<? super Unit> continuation) {
        this.nextStep = continuation;
    }

    @Override // kotlin.sequences.SequenceScope
    @Nullable
    public Object yield(T t, @NotNull Continuation<? super Unit> continuation) {
        this.nextValue = t;
        this.state = 3;
        this.nextStep = continuation;
        Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (coroutine_suspended == IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED()) {
            DebugProbesKt.probeCoroutineSuspended(continuation);
        }
        return coroutine_suspended == IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED() ? coroutine_suspended : Unit.INSTANCE;
    }

    @Override // kotlin.sequences.SequenceScope
    @Nullable
    public Object yieldAll(@NotNull Iterator<? extends T> it, @NotNull Continuation<? super Unit> continuation) {
        if (!it.hasNext()) {
            return Unit.INSTANCE;
        }
        this.nextIterator = it;
        this.state = 2;
        this.nextStep = continuation;
        Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (coroutine_suspended == IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED()) {
            DebugProbesKt.probeCoroutineSuspended(continuation);
        }
        return coroutine_suspended == IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED() ? coroutine_suspended : Unit.INSTANCE;
    }
}
