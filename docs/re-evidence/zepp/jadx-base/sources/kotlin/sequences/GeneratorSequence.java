package kotlin.sequences;

import java.util.Iterator;
import java.util.NoSuchElementException;
import java.util.Objects;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.markers.KMappedMarker;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes23.dex */
final class GeneratorSequence<T> implements Sequence<T> {

    @NotNull
    private final Function0<T> a;

    @NotNull
    private final Function1<T, T> b;

    /* JADX INFO: renamed from: kotlin.sequences.GeneratorSequence$iterator$1, reason: invalid class name */
    public static final class AnonymousClass1 implements Iterator<T>, KMappedMarker {

        @Nullable
        private T a;
        private int b = -2;
        public final /* synthetic */ GeneratorSequence<T> c;

        public AnonymousClass1(GeneratorSequence<T> generatorSequence) {
            this.c = generatorSequence;
        }

        private final void a() {
            T t = this.b == -2 ? (T) ((GeneratorSequence) this.c).a.invoke() : (T) ((GeneratorSequence) this.c).b.invoke(this.a);
            this.a = t;
            this.b = t == null ? 0 : 1;
        }

        @Nullable
        public final T getNextItem() {
            return this.a;
        }

        public final int getNextState() {
            return this.b;
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            if (this.b < 0) {
                a();
            }
            return this.b == 1;
        }

        @Override // java.util.Iterator
        @NotNull
        public T next() {
            if (this.b < 0) {
                a();
            }
            if (this.b == 0) {
                throw new NoSuchElementException();
            }
            T t = this.a;
            Objects.requireNonNull(t, "null cannot be cast to non-null type T of kotlin.sequences.GeneratorSequence");
            this.b = -1;
            return t;
        }

        @Override // java.util.Iterator
        public void remove() {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }

        public final void setNextItem(@Nullable T t) {
            this.a = t;
        }

        public final void setNextState(int i) {
            this.b = i;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public GeneratorSequence(@NotNull Function0<? extends T> function0, @NotNull Function1<? super T, ? extends T> function1) {
        this.a = function0;
        this.b = function1;
    }

    @Override // kotlin.sequences.Sequence
    @NotNull
    public Iterator<T> iterator() {
        return new AnonymousClass1(this);
    }
}
