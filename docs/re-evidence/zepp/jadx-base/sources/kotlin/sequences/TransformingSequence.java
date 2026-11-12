package kotlin.sequences;

import java.util.Iterator;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.markers.KMappedMarker;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes23.dex */
public final class TransformingSequence<T, R> implements Sequence<R> {

    @NotNull
    private final Sequence<T> a;

    @NotNull
    private final Function1<T, R> b;

    /* JADX INFO: renamed from: kotlin.sequences.TransformingSequence$iterator$1, reason: invalid class name */
    public static final class AnonymousClass1 implements Iterator<R>, KMappedMarker {

        @NotNull
        private final Iterator<T> a;
        public final /* synthetic */ TransformingSequence<T, R> b;

        public AnonymousClass1(TransformingSequence<T, R> transformingSequence) {
            this.b = transformingSequence;
            this.a = ((TransformingSequence) transformingSequence).a.iterator();
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
            return (R) ((TransformingSequence) this.b).b.invoke(this.a.next());
        }

        @Override // java.util.Iterator
        public void remove() {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public TransformingSequence(@NotNull Sequence<? extends T> sequence, @NotNull Function1<? super T, ? extends R> function1) {
        this.a = sequence;
        this.b = function1;
    }

    @NotNull
    public final <E> Sequence<E> flatten$kotlin_stdlib(@NotNull Function1<? super R, ? extends Iterator<? extends E>> function1) {
        return new FlatteningSequence(this.a, this.b, function1);
    }

    @Override // kotlin.sequences.Sequence
    @NotNull
    public Iterator<R> iterator() {
        return new AnonymousClass1(this);
    }
}
