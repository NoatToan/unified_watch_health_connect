package kotlin.sequences;

import java.util.Iterator;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.markers.KMappedMarker;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes23.dex */
public final class MergingSequence<T1, T2, V> implements Sequence<V> {

    @NotNull
    private final Sequence<T1> a;

    @NotNull
    private final Sequence<T2> b;

    @NotNull
    private final Function2<T1, T2, V> c;

    /* JADX INFO: renamed from: kotlin.sequences.MergingSequence$iterator$1, reason: invalid class name */
    public static final class AnonymousClass1 implements Iterator<V>, KMappedMarker {

        @NotNull
        private final Iterator<T1> a;

        @NotNull
        private final Iterator<T2> b;
        public final /* synthetic */ MergingSequence<T1, T2, V> c;

        public AnonymousClass1(MergingSequence<T1, T2, V> mergingSequence) {
            this.c = mergingSequence;
            this.a = ((MergingSequence) mergingSequence).a.iterator();
            this.b = ((MergingSequence) mergingSequence).b.iterator();
        }

        @NotNull
        public final Iterator<T1> getIterator1() {
            return this.a;
        }

        @NotNull
        public final Iterator<T2> getIterator2() {
            return this.b;
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            return this.a.hasNext() && this.b.hasNext();
        }

        @Override // java.util.Iterator
        public V next() {
            return (V) ((MergingSequence) this.c).c.invoke(this.a.next(), this.b.next());
        }

        @Override // java.util.Iterator
        public void remove() {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public MergingSequence(@NotNull Sequence<? extends T1> sequence, @NotNull Sequence<? extends T2> sequence2, @NotNull Function2<? super T1, ? super T2, ? extends V> function2) {
        this.a = sequence;
        this.b = sequence2;
        this.c = function2;
    }

    @Override // kotlin.sequences.Sequence
    @NotNull
    public Iterator<V> iterator() {
        return new AnonymousClass1(this);
    }
}
