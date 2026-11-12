package kotlin.sequences;

import java.util.Iterator;
import java.util.NoSuchElementException;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.markers.KMappedMarker;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes23.dex */
public final class SubSequence<T> implements Sequence<T>, DropTakeSequence<T> {

    @NotNull
    private final Sequence<T> a;
    private final int b;
    private final int c;

    /* JADX INFO: renamed from: kotlin.sequences.SubSequence$iterator$1, reason: invalid class name */
    public static final class AnonymousClass1 implements Iterator<T>, KMappedMarker {

        @NotNull
        private final Iterator<T> a;
        private int b;
        public final /* synthetic */ SubSequence<T> c;

        public AnonymousClass1(SubSequence<T> subSequence) {
            this.c = subSequence;
            this.a = ((SubSequence) subSequence).a.iterator();
        }

        private final void a() {
            while (this.b < ((SubSequence) this.c).b && this.a.hasNext()) {
                this.a.next();
                this.b++;
            }
        }

        @NotNull
        public final Iterator<T> getIterator() {
            return this.a;
        }

        public final int getPosition() {
            return this.b;
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            a();
            return this.b < ((SubSequence) this.c).c && this.a.hasNext();
        }

        @Override // java.util.Iterator
        public T next() {
            a();
            if (this.b >= ((SubSequence) this.c).c) {
                throw new NoSuchElementException();
            }
            this.b++;
            return this.a.next();
        }

        @Override // java.util.Iterator
        public void remove() {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }

        public final void setPosition(int i) {
            this.b = i;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public SubSequence(@NotNull Sequence<? extends T> sequence, int i, int i2) {
        this.a = sequence;
        this.b = i;
        this.c = i2;
        if (!(i >= 0)) {
            throw new IllegalArgumentException(Intrinsics.stringPlus("startIndex should be non-negative, but is ", Integer.valueOf(i)).toString());
        }
        if (!(i2 >= 0)) {
            throw new IllegalArgumentException(Intrinsics.stringPlus("endIndex should be non-negative, but is ", Integer.valueOf(i2)).toString());
        }
        if (i2 >= i) {
            return;
        }
        throw new IllegalArgumentException(("endIndex should be not less than startIndex, but was " + i2 + " < " + i).toString());
    }

    private final int a() {
        return this.c - this.b;
    }

    @Override // kotlin.sequences.DropTakeSequence
    @NotNull
    public Sequence<T> drop(int i) {
        return i >= a() ? SequencesKt__SequencesKt.emptySequence() : new SubSequence(this.a, this.b + i, this.c);
    }

    @Override // kotlin.sequences.Sequence
    @NotNull
    public Iterator<T> iterator() {
        return new AnonymousClass1(this);
    }

    @Override // kotlin.sequences.DropTakeSequence
    @NotNull
    public Sequence<T> take(int i) {
        if (i >= a()) {
            return this;
        }
        Sequence<T> sequence = this.a;
        int i2 = this.b;
        return new SubSequence(sequence, i2, i + i2);
    }
}
