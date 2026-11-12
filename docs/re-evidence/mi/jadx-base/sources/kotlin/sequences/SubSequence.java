package kotlin.sequences;

import java.util.Iterator;
import java.util.NoSuchElementException;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.jvm.internal.markers.KMappedMarker;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes4.dex */
@SourceDebugExtension({"SMAP\nSequences.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Sequences.kt\nkotlin/sequences/SubSequence\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,698:1\n1#2:699\n*E\n"})
public final class SubSequence<T> implements Sequence<T>, DropTakeSequence<T> {
    private final int endIndex;

    @NotNull
    private final Sequence<T> sequence;
    private final int startIndex;

    /* JADX INFO: renamed from: kotlin.sequences.SubSequence$iterator$1, reason: invalid class name */
    public static final class AnonymousClass1 implements Iterator<T>, KMappedMarker {
        private final Iterator<T> iterator;
        private int position;
        final /* synthetic */ SubSequence<T> this$0;

        public AnonymousClass1(SubSequence<T> subSequence) {
            this.this$0 = subSequence;
            this.iterator = ((SubSequence) subSequence).sequence.iterator();
        }

        private final void drop() {
            while (this.position < ((SubSequence) this.this$0).startIndex && this.iterator.hasNext()) {
                this.iterator.next();
                this.position++;
            }
        }

        public final Iterator<T> getIterator() {
            return this.iterator;
        }

        public final int getPosition() {
            return this.position;
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            drop();
            return this.position < ((SubSequence) this.this$0).endIndex && this.iterator.hasNext();
        }

        @Override // java.util.Iterator
        public T next() {
            drop();
            if (this.position >= ((SubSequence) this.this$0).endIndex) {
                throw new NoSuchElementException();
            }
            this.position++;
            return this.iterator.next();
        }

        @Override // java.util.Iterator
        public void remove() {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }

        public final void setPosition(int i) {
            this.position = i;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public SubSequence(@NotNull Sequence<? extends T> sequence, int i, int i2) {
        Intrinsics.checkNotNullParameter(sequence, "sequence");
        this.sequence = sequence;
        this.startIndex = i;
        this.endIndex = i2;
        if (i < 0) {
            throw new IllegalArgumentException(("startIndex should be non-negative, but is " + i).toString());
        }
        if (i2 < 0) {
            throw new IllegalArgumentException(("endIndex should be non-negative, but is " + i2).toString());
        }
        if (i2 >= i) {
            return;
        }
        throw new IllegalArgumentException(("endIndex should be not less than startIndex, but was " + i2 + " < " + i).toString());
    }

    private final int getCount() {
        return this.endIndex - this.startIndex;
    }

    @Override // kotlin.sequences.DropTakeSequence
    @NotNull
    public Sequence<T> drop(int i) {
        return i >= getCount() ? SequencesKt__SequencesKt.emptySequence() : new SubSequence(this.sequence, this.startIndex + i, this.endIndex);
    }

    @Override // kotlin.sequences.Sequence
    @NotNull
    public Iterator<T> iterator() {
        return new AnonymousClass1(this);
    }

    @Override // kotlin.sequences.DropTakeSequence
    @NotNull
    public Sequence<T> take(int i) {
        if (i >= getCount()) {
            return this;
        }
        Sequence<T> sequence = this.sequence;
        int i2 = this.startIndex;
        return new SubSequence(sequence, i2, i + i2);
    }
}
