package kotlin.sequences;

import java.util.Iterator;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.markers.KMappedMarker;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes23.dex */
public final class DropWhileSequence<T> implements Sequence<T> {

    @NotNull
    private final Sequence<T> a;

    @NotNull
    private final Function1<T, Boolean> b;

    /* JADX INFO: renamed from: kotlin.sequences.DropWhileSequence$iterator$1, reason: invalid class name */
    public static final class AnonymousClass1 implements Iterator<T>, KMappedMarker {

        @NotNull
        private final Iterator<T> a;
        private int b = -1;

        @Nullable
        private T c;
        public final /* synthetic */ DropWhileSequence<T> d;

        public AnonymousClass1(DropWhileSequence<T> dropWhileSequence) {
            this.d = dropWhileSequence;
            this.a = ((DropWhileSequence) dropWhileSequence).a.iterator();
        }

        private final void a() {
            while (this.a.hasNext()) {
                T next = this.a.next();
                if (!((Boolean) ((DropWhileSequence) this.d).b.invoke(next)).booleanValue()) {
                    this.c = next;
                    this.b = 1;
                    return;
                }
            }
            this.b = 0;
        }

        public final int getDropState() {
            return this.b;
        }

        @NotNull
        public final Iterator<T> getIterator() {
            return this.a;
        }

        @Nullable
        public final T getNextItem() {
            return this.c;
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            if (this.b == -1) {
                a();
            }
            return this.b == 1 || this.a.hasNext();
        }

        @Override // java.util.Iterator
        public T next() {
            if (this.b == -1) {
                a();
            }
            if (this.b != 1) {
                return this.a.next();
            }
            T t = this.c;
            this.c = null;
            this.b = 0;
            return t;
        }

        @Override // java.util.Iterator
        public void remove() {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }

        public final void setDropState(int i) {
            this.b = i;
        }

        public final void setNextItem(@Nullable T t) {
            this.c = t;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public DropWhileSequence(@NotNull Sequence<? extends T> sequence, @NotNull Function1<? super T, Boolean> function1) {
        this.a = sequence;
        this.b = function1;
    }

    @Override // kotlin.sequences.Sequence
    @NotNull
    public Iterator<T> iterator() {
        return new AnonymousClass1(this);
    }
}
