package kotlin.sequences;

import java.util.Iterator;
import java.util.NoSuchElementException;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.markers.KMappedMarker;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes23.dex */
public final class FlatteningSequence<T, R, E> implements Sequence<E> {

    @NotNull
    private final Sequence<T> a;

    @NotNull
    private final Function1<T, R> b;

    @NotNull
    private final Function1<R, Iterator<E>> c;

    /* JADX INFO: renamed from: kotlin.sequences.FlatteningSequence$iterator$1, reason: invalid class name */
    public static final class AnonymousClass1 implements Iterator<E>, KMappedMarker {

        @NotNull
        private final Iterator<T> a;

        @Nullable
        private Iterator<? extends E> b;
        public final /* synthetic */ FlatteningSequence<T, R, E> c;

        public AnonymousClass1(FlatteningSequence<T, R, E> flatteningSequence) {
            this.c = flatteningSequence;
            this.a = ((FlatteningSequence) flatteningSequence).a.iterator();
        }

        private final boolean a() {
            Iterator<? extends E> it2 = this.b;
            if ((it2 == null || it2.hasNext()) ? false : true) {
                this.b = null;
            }
            while (this.b == null) {
                if (!this.a.hasNext()) {
                    return false;
                }
                Iterator<? extends E> it3 = (Iterator) ((FlatteningSequence) this.c).c.invoke(((FlatteningSequence) this.c).b.invoke(this.a.next()));
                if (it3.hasNext()) {
                    this.b = it3;
                    break;
                }
            }
            return true;
        }

        @Nullable
        public final Iterator<E> getItemIterator() {
            return this.b;
        }

        @NotNull
        public final Iterator<T> getIterator() {
            return this.a;
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            return a();
        }

        @Override // java.util.Iterator
        public E next() {
            if (a()) {
                return this.b.next();
            }
            throw new NoSuchElementException();
        }

        @Override // java.util.Iterator
        public void remove() {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }

        public final void setItemIterator(@Nullable Iterator<? extends E> it2) {
            this.b = it2;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public FlatteningSequence(@NotNull Sequence<? extends T> sequence, @NotNull Function1<? super T, ? extends R> function1, @NotNull Function1<? super R, ? extends Iterator<? extends E>> function2) {
        this.a = sequence;
        this.b = function1;
        this.c = function2;
    }

    @Override // kotlin.sequences.Sequence
    @NotNull
    public Iterator<E> iterator() {
        return new AnonymousClass1(this);
    }
}
