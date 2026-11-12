package com.google.common.collect;

import com.google.common.base.Preconditions;
import defpackage.ams;
import java.util.NoSuchElementException;
import javax.annotation.CheckForNull;

/* JADX INFO: loaded from: classes4.dex */
@ElementTypesAreNonnullByDefault
public abstract class AbstractIterator<T> extends UnmodifiableIterator<T> {

    @CheckForNull
    private T next;
    private State state = State.NOT_READY;

    enum State {
        READY,
        NOT_READY,
        DONE,
        FAILED
    }

    @CheckForNull
    protected abstract T computeNext();

    @CheckForNull
    protected final T endOfData() {
        this.state = State.DONE;
        return null;
    }

    /* JADX INFO: renamed from: com.google.common.collect.AbstractIterator$3, reason: invalid class name */
    static /* synthetic */ class AnonymousClass3 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f4272a;

        static {
            int[] iArr = new int[State.values().length];
            f4272a = iArr;
            try {
                iArr[State.DONE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f4272a[State.READY.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
        }
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        Preconditions.checkState(this.state != State.FAILED);
        int i = AnonymousClass3.f4272a[this.state.ordinal()];
        if (i == 1) {
            return false;
        }
        if (i != 2) {
            return tryToComputeNext();
        }
        return true;
    }

    private boolean tryToComputeNext() {
        this.state = State.FAILED;
        this.next = computeNext();
        if (this.state == State.DONE) {
            return false;
        }
        this.state = State.READY;
        return true;
    }

    @Override // java.util.Iterator
    @ParametricNullness
    public final T next() {
        if (!hasNext()) {
            throw new NoSuchElementException();
        }
        this.state = State.NOT_READY;
        T t = (T) ams.e(this.next);
        this.next = null;
        return t;
    }

    @ParametricNullness
    public final T peek() {
        if (!hasNext()) {
            throw new NoSuchElementException();
        }
        return (T) ams.e(this.next);
    }
}
