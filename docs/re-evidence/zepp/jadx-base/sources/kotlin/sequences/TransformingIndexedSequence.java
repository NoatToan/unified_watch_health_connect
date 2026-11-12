package kotlin.sequences;

import java.util.Iterator;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.markers.KMappedMarker;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes23.dex */
public final class TransformingIndexedSequence<T, R> implements Sequence<R> {

    @NotNull
    private final Sequence<T> a;

    @NotNull
    private final Function2<Integer, T, R> b;

    /* JADX INFO: renamed from: kotlin.sequences.TransformingIndexedSequence$iterator$1, reason: invalid class name */
    public static final class AnonymousClass1 implements Iterator<R>, KMappedMarker {

        @NotNull
        private final Iterator<T> a;
        private int b;
        public final /* synthetic */ TransformingIndexedSequence<T, R> c;

        public AnonymousClass1(TransformingIndexedSequence<T, R> transformingIndexedSequence) {
            this.c = transformingIndexedSequence;
            this.a = ((TransformingIndexedSequence) transformingIndexedSequence).a.iterator();
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
        public R next() {
            Function2 function2 = ((TransformingIndexedSequence) this.c).b;
            int i = this.b;
            this.b = i + 1;
            if (i < 0) {
                CollectionsKt__CollectionsKt.throwIndexOverflow();
            }
            return (R) function2.invoke(Integer.valueOf(i), this.a.next());
        }

        @Override // java.util.Iterator
        public void remove() {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }

        public final void setIndex(int i) {
            this.b = i;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public TransformingIndexedSequence(@NotNull Sequence<? extends T> sequence, @NotNull Function2<? super Integer, ? super T, ? extends R> function2) {
        this.a = sequence;
        this.b = function2;
    }

    @Override // kotlin.sequences.Sequence
    @NotNull
    public Iterator<R> iterator() {
        return new AnonymousClass1(this);
    }
}
