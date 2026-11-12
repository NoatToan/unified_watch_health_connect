package kotlin.sequences;

import java.util.Iterator;
import java.util.NoSuchElementException;
import kotlin.jvm.internal.markers.KMappedMarker;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes23.dex */
public final class TakeSequence<T> implements Sequence<T>, DropTakeSequence<T> {

    @NotNull
    private final Sequence<T> a;
    private final int b;

    /* JADX INFO: renamed from: kotlin.sequences.TakeSequence$iterator$1, reason: invalid class name */
    public static final class AnonymousClass1 implements Iterator<T>, KMappedMarker {
        private int a;

        @NotNull
        private final Iterator<T> b;
        public final /* synthetic */ TakeSequence<T> c;

        public AnonymousClass1(TakeSequence<T> takeSequence) {
            this.c = takeSequence;
            this.a = ((TakeSequence) takeSequence).b;
            this.b = ((TakeSequence) takeSequence).a.iterator();
        }

        @NotNull
        public final Iterator<T> getIterator() {
            return this.b;
        }

        public final int getLeft() {
            return this.a;
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            return this.a > 0 && this.b.hasNext();
        }

        @Override // java.util.Iterator
        public T next() {
            int i = this.a;
            if (i == 0) {
                throw new NoSuchElementException();
            }
            this.a = i - 1;
            return this.b.next();
        }

        @Override // java.util.Iterator
        public void remove() {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }

        public final void setLeft(int i) {
            this.a = i;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public TakeSequence(@NotNull Sequence<? extends T> sequence, int i) {
        this.a = sequence;
        this.b = i;
        if (i >= 0) {
            return;
        }
        throw new IllegalArgumentException(("count must be non-negative, but was " + i + '.').toString());
    }

    @Override // kotlin.sequences.DropTakeSequence
    @NotNull
    public Sequence<T> drop(int i) {
        int i2 = this.b;
        return i >= i2 ? SequencesKt__SequencesKt.emptySequence() : new SubSequence(this.a, i, i2);
    }

    @Override // kotlin.sequences.Sequence
    @NotNull
    public Iterator<T> iterator() {
        return new AnonymousClass1(this);
    }

    @Override // kotlin.sequences.DropTakeSequence
    @NotNull
    public Sequence<T> take(int i) {
        return i >= this.b ? this : new TakeSequence(this.a, i);
    }
}
