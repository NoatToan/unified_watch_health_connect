package kotlin.sequences;

import java.util.Iterator;
import java.util.NoSuchElementException;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.markers.KMappedMarker;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes23.dex */
public final class FilteringSequence<T> implements Sequence<T> {

    @NotNull
    private final Sequence<T> a;
    private final boolean b;

    @NotNull
    private final Function1<T, Boolean> c;

    /* JADX INFO: renamed from: kotlin.sequences.FilteringSequence$iterator$1, reason: invalid class name */
    public static final class AnonymousClass1 implements Iterator<T>, KMappedMarker {

        @NotNull
        private final Iterator<T> a;
        private int b = -1;

        @Nullable
        private T c;
        public final /* synthetic */ FilteringSequence<T> d;

        public AnonymousClass1(FilteringSequence<T> filteringSequence) {
            this.d = filteringSequence;
            this.a = ((FilteringSequence) filteringSequence).a.iterator();
        }

        private final void a() {
            while (this.a.hasNext()) {
                T next = this.a.next();
                if (((Boolean) ((FilteringSequence) this.d).c.invoke(next)).booleanValue() == ((FilteringSequence) this.d).b) {
                    this.c = next;
                    this.b = 1;
                    return;
                }
            }
            this.b = 0;
        }

        @NotNull
        public final Iterator<T> getIterator() {
            return this.a;
        }

        @Nullable
        public final T getNextItem() {
            return this.c;
        }

        public final int getNextState() {
            return this.b;
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            if (this.b == -1) {
                a();
            }
            return this.b == 1;
        }

        @Override // java.util.Iterator
        public T next() {
            if (this.b == -1) {
                a();
            }
            if (this.b == 0) {
                throw new NoSuchElementException();
            }
            T t = this.c;
            this.c = null;
            this.b = -1;
            return t;
        }

        @Override // java.util.Iterator
        public void remove() {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }

        public final void setNextItem(@Nullable T t) {
            this.c = t;
        }

        public final void setNextState(int i) {
            this.b = i;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public FilteringSequence(@NotNull Sequence<? extends T> sequence, boolean z, @NotNull Function1<? super T, Boolean> function1) {
        this.a = sequence;
        this.b = z;
        this.c = function1;
    }

    @Override // kotlin.sequences.Sequence
    @NotNull
    public Iterator<T> iterator() {
        return new AnonymousClass1(this);
    }

    public /* synthetic */ FilteringSequence(Sequence sequence, boolean z, Function1 function1, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(sequence, (i & 2) != 0 ? true : z, function1);
    }
}
