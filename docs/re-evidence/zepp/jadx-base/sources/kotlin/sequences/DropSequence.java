package kotlin.sequences;

import java.util.Iterator;
import kotlin.jvm.internal.markers.KMappedMarker;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes23.dex */
public final class DropSequence<T> implements Sequence<T>, DropTakeSequence<T> {

    @NotNull
    private final Sequence<T> a;
    private final int b;

    /* JADX INFO: renamed from: kotlin.sequences.DropSequence$iterator$1, reason: invalid class name */
    public static final class AnonymousClass1 implements Iterator<T>, KMappedMarker {

        @NotNull
        private final Iterator<T> a;
        private int b;
        public final /* synthetic */ DropSequence<T> c;

        public AnonymousClass1(DropSequence<T> dropSequence) {
            this.c = dropSequence;
            this.a = ((DropSequence) dropSequence).a.iterator();
            this.b = ((DropSequence) dropSequence).b;
        }

        private final void a() {
            while (this.b > 0 && this.a.hasNext()) {
                this.a.next();
                this.b--;
            }
        }

        @NotNull
        public final Iterator<T> getIterator() {
            return this.a;
        }

        public final int getLeft() {
            return this.b;
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            a();
            return this.a.hasNext();
        }

        @Override // java.util.Iterator
        public T next() {
            a();
            return this.a.next();
        }

        @Override // java.util.Iterator
        public void remove() {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }

        public final void setLeft(int i) {
            this.b = i;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public DropSequence(@NotNull Sequence<? extends T> sequence, int i) {
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
        int i2 = this.b + i;
        return i2 < 0 ? new DropSequence(this, i) : new DropSequence(this.a, i2);
    }

    @Override // kotlin.sequences.Sequence
    @NotNull
    public Iterator<T> iterator() {
        return new AnonymousClass1(this);
    }

    @Override // kotlin.sequences.DropTakeSequence
    @NotNull
    public Sequence<T> take(int i) {
        int i2 = this.b;
        int i3 = i2 + i;
        return i3 < 0 ? new TakeSequence(this, i) : new SubSequence(this.a, i2, i3);
    }
}
