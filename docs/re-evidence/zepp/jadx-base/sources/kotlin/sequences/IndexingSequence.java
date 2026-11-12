package kotlin.sequences;

import java.util.Iterator;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.collections.IndexedValue;
import kotlin.jvm.internal.markers.KMappedMarker;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes23.dex */
public final class IndexingSequence<T> implements Sequence<IndexedValue<? extends T>> {

    @NotNull
    private final Sequence<T> a;

    /* JADX INFO: renamed from: kotlin.sequences.IndexingSequence$iterator$1, reason: invalid class name */
    public static final class AnonymousClass1 implements Iterator<IndexedValue<? extends T>>, KMappedMarker {

        @NotNull
        private final Iterator<T> a;
        private int b;
        public final /* synthetic */ IndexingSequence<T> c;

        public AnonymousClass1(IndexingSequence<T> indexingSequence) {
            this.c = indexingSequence;
            this.a = ((IndexingSequence) indexingSequence).a.iterator();
        }

        public final int getIndex() {
            return this.b;
        }

        @NotNull
        public final Iterator<T> getIterator() {
            return this.a;
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            return this.a.hasNext();
        }

        @Override // java.util.Iterator
        public void remove() {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }

        public final void setIndex(int i) {
            this.b = i;
        }

        @Override // java.util.Iterator
        @NotNull
        public IndexedValue<T> next() {
            int i = this.b;
            this.b = i + 1;
            if (i < 0) {
                CollectionsKt__CollectionsKt.throwIndexOverflow();
            }
            return new IndexedValue<>(i, this.a.next());
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public IndexingSequence(@NotNull Sequence<? extends T> sequence) {
        this.a = sequence;
    }

    @Override // kotlin.sequences.Sequence
    @NotNull
    public Iterator<IndexedValue<T>> iterator() {
        return new AnonymousClass1(this);
    }
}
